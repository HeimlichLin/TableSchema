package com.tableSchema.common.javapage.pagemain.impl;

import com.tableSchema.common.codegenerate.DBDataType;
import com.tableSchema.common.javapage.pagemain.PageMain;
import com.tableSchema.common.utils.StringFormatUtil;
import com.tableSchema.domain.dto.TableDTO;

public class DAOPageImpl implements PageMain {
	
	private TableDTO dto;
	
	public DAOPageImpl(TableDTO dto) {
		this.dto = dto;
	}

	@Override
	public String getContent() {
		StringBuilder sb = new StringBuilder();	
		sb.append(this.getPackageString());
		sb.append(this.getImportString());
		sb.append(this.getClassString());
		return sb.toString();
	}

	@Override
	public String getPackageString() {
		return "package com.doc.common.dao.impl; \n \n";
	}

	@Override
	public String getImportString() {		
		return "";
	}

	@Override
	public String getClassString() {
		StringBuilder sb = new StringBuilder();
		sb.append("public class " + this.dto.getDto().getTableNameDAOImplFirstWorldUp()
				+ " extends GeneralDAOImpl<" + this.dto.getDto().getTableNameDoFirstWorldUp()
				+ "> implements " + this.dto.getDto().getTableNameDAOImplFirstWorldUp() + " { \n");
		sb.append(this.getInstanceString());
		sb.append(this.getTableNameString());
		sb.append(this.getVariableString());
		sb.append(this.getMapConvetString());
		sb.append(this.getConverterString());
		sb.append(this.getPkSqlWhereString());
		sb.append("} \n");
		return sb.toString();
	}
	
	// INSTANCE
	private String getInstanceString() {
		StringBuilder sb = new StringBuilder();
		sb.append("	public static final "
				+ this.dto.getDto().getTableNameDAOImplFirstWorldUp() + " INSTANCE = new "
				+ this.dto.getDto().getTableNameDAOImplFirstWorldUp() + "(); \n");
		return sb.toString();
	}

	// TABLENAME
	private String getTableNameString() {
		StringBuilder sb = new StringBuilder();
		sb.append("	public static final String TABLENAME = \""
				+ this.dto.getDto().getTableNameUp() + "\"; \n\n");
		return sb.toString();
	}

	// variable
	private String getVariableString() {
		StringBuilder sb = new StringBuilder();
		sb.append("	public " + this.dto.getDto().getTableNameDAOImplFirstWorldUp() + "() { \n");
		sb.append("		super(TABLENAME); \n");
		sb.append("	} \n \n");
		return sb.toString();
	}
	
	// map converter
	private String getMapConvetString() {
		StringBuilder sb = new StringBuilder();
		sb.append("	protected static MapConverter<"
				+ this.dto.getDto().getTableNameDoFirstWorldUp()
				+ "> CONVERTER = new MapConverter<"
				+ this.dto.getDto().getTableNameDoFirstWorldUp() + ">() { \n \n");
		sb.append(this.getOverrideConvertString());
		sb.append(this.getOverrideToSourceDataString());
		sb.append("	}; \n \n");
		return sb.toString();
	}

	// convert
	private String getOverrideConvertString() {
		StringBuilder sb = new StringBuilder();
		sb.append("		@Override \n");
		sb.append("		public " + this.dto.getDto().getTableNameDoFirstWorldUp()
				+ " convert(final DataObject dataObject) { \n");
		sb.append("			final " + this.dto.getDto().getTableNameDoFirstWorldUp() + " "
				+ this.dto.getDto().getTableNameDoFirstWorldLow() + " = new "
				+ this.dto.getDto().getTableNameDoFirstWorldUp() + "(); \n");
		sb.append(this.getConvertString());
		sb.append("			return " + this.dto.getDto().getTableNameDoFirstWorldLow() + "; \n");
		sb.append("		} \n \n");
		return sb.toString();
	}

	// to object
	private String getOverrideToSourceDataString() {
		StringBuilder sb = new StringBuilder();
		sb.append("		@Override \n");
		sb.append("		public DataObject toDataObject(final "
				+ this.dto.getDto().getTableNameDoFirstWorldUp() + " "
				+ this.dto.getDto().getTableNameDoFirstWorldLow() + ") { \n");
		sb.append("			final DataObject dataObject = new DataObject(); \n");
		sb.append(this.getToSourceDataString());
		sb.append("			return dataObject; \n");
		sb.append("		} \n \n");
		return sb.toString();
	}

	// getConverter
	private String getConverterString() {
		StringBuilder sb = new StringBuilder();
		sb.append("	public MapConverter<" + this.dto.getDto().getTableNameDoFirstWorldUp()
				+ "> getConverter() { \n");
		sb.append("		return CONVERTER; \n");
		sb.append("	} \n \n");
		return sb.toString();
	}
	
	// get PK
	private String getPkSqlWhereString() {
		StringBuilder sb = new StringBuilder();
		sb.append("	@Override \n");
		sb.append("	public SqlWhere getPkSqlWhere(" + this.dto.getDto().getTableNameDoFirstWorldUp()
				+ " po) { \n");
		sb.append(this.checkPkSqlWhereString());
		sb.append("	} \n \n");
		return sb.toString();
	}
	
	// 欄位對映成物件
	private String getConvertString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < this.dto.getList().size(); i++) {				
			sb.append("			" + this.dto.getDto().getTableNameDoFirstWorldLow())
			.append(".set" + StringFormatUtil.formatFirstWorldToUpper(this.dto.getList().get(i).getColumnName()) + "(")
			.append(this.getDataTypeConvertMethod(this.dto.getList().get(i).getColumnName().toUpperCase(), this.dto.getList().get(i).getDataType()))
			.append("); \n");
		}
		return sb.toString();
	}
	
	// 欄位資料型態轉換的method
	private String getDataTypeConvertMethod(String columnName, String dataType) {
		StringBuilder sb = new StringBuilder();
		sb.append("dataObject.getString(")
		.append(this.dto.getDto().getTableNameDoFirstWorldUp())
		.append(".COLUMNS." + columnName + ".name())");		
		if (DBDataType.VARCHAR2.getDBType().equals(dataType)) {
			return String.format(DBDataType.VARCHAR2.getMethod(), sb.toString());
		} else if (DBDataType.NUMBER.getDBType().equals(dataType)) {
			return String.format(DBDataType.NUMBER.getMethod(), sb.toString());
		} else if (DBDataType.DATE.getDBType().equals(dataType)) {
			return String.format(DBDataType.DATE.getMethod(), sb.toString());
		} else {
			return String.format(DBDataType.VARCHAR2.getMethod(), sb.toString());
		}
	}
	
	// 物件對映成原始資料欄位
	private String getToSourceDataString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < this.dto.getList().size(); i++) {	
		sb.append("			dataObject.setValue(" + this.dto.getDto().getTableNameDoFirstWorldUp())
				.append(".COLUMNS." + this.dto.getList().get(i).getColumnName().toUpperCase() + ".name(), ")
				.append(this.dto.getDto().getTableNameDoFirstWorldLow() + ".get")
				.append(StringFormatUtil.formatFirstWorldToUpper(this.dto.getList().get(i).getColumnName()) + "()); \n");
		}
		return sb.toString();
	}
	
	// 判斷欄位是否為PK
	private String checkPkSqlWhereString() {
		StringBuilder sb = new StringBuilder();
		StringBuilder sqlWhere = new StringBuilder();
		for (int i = 0; i < this.dto.getList().size(); i++) {
			if (this.dto.getList().get(i).getPosition() != null) {
				sqlWhere.append("		sqlWhere.add(" + this.dto.getDto().getTableNameDoFirstWorldUp())
				.append(".COLUMNS." + this.dto.getList().get(i).getColumnName().toUpperCase() + ".name(), ")
				.append("po.get")
				.append(StringFormatUtil.formatFirstWorldToUpper(this.dto.getList().get(i).getColumnName()) + "()); \n");
			}			
		}
		if (sqlWhere.equals("")) {
			sb.append("		throw new ApBusinessException(\"無pk不支援\"); \n");
		} else {
			sb.append("		SqlWhere sqlWhere = new SqlWhere(); \n");
			sb.append(sqlWhere);
			sb.append("		return sqlWhere; \n");
		}
		return sb.toString();
	}		

}
