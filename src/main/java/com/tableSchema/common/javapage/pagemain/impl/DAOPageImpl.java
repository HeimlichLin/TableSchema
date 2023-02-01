package com.tableSchema.common.javapage.pagemain.impl;

import com.tableSchema.common.codegenerate.DBDataType;
import com.tableSchema.common.javapage.pagemain.PageMain;
import com.tableSchema.common.utils.StringFormatUtil;
import com.tableSchema.domain.dto.TableDTO;

public class DAOPageImpl implements PageMain {

	private final TableDTO dto;

	public DAOPageImpl(TableDTO dto) {
		this.dto = dto;
	}

	@Override
	public String getContent() {
		final StringBuilder sb = new StringBuilder();
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
		final StringBuilder sb = new StringBuilder();
		sb.append("public class " + this.dto.getDto().getTableNameDAOImplFirstWorldUp() + " extends GeneralDAOImpl<"
				+ this.dto.getDto().getTableNamePoFirstWorldUp() + "> implements "
				+ this.dto.getDto().getTableNameDAOFirstWorldUp() + " { \n");
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
		final StringBuilder sb = new StringBuilder();
		sb.append("	public static final " + this.dto.getDto().getTableNameDAOImplFirstWorldUp() + " INSTANCE = new "
				+ this.dto.getDto().getTableNameDAOImplFirstWorldUp() + "(); \n");
		return sb.toString();
	}

	// TABLENAME
	private String getTableNameString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("	public static final String TABLENAME = \"" + this.dto.getDto().getTableNameUp() + "\"; \n\n");
		return sb.toString();
	}

	// variable
	private String getVariableString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("	public " + this.dto.getDto().getTableNameDAOImplFirstWorldUp() + "() { \n");
		sb.append("		super(TABLENAME); \n");
		sb.append("	} \n \n");
		return sb.toString();
	}

	// map converter
	private String getMapConvetString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("	protected static final IConverter<" + this.dto.getDto().getTableNamePoFirstWorldUp()
				+ "> CONVERTER = new IConverter<" + this.dto.getDto().getTableNamePoFirstWorldUp() + ">() { \n \n");
		sb.append(this.getOverrideConvertString());
		sb.append(this.getOverrideToSourceDataString());
		sb.append("	}; \n \n");
		return sb.toString();
	}

	// convert
	private String getOverrideConvertString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("		@Override \n");
		sb.append("		public " + this.dto.getDto().getTableNamePoFirstWorldUp()
				+ " convert(final RowMap rowMap) { \n");
		sb.append("			final " + this.dto.getDto().getTableNamePoFirstWorldUp() + " "
				+ this.dto.getDto().getTableNamePoFirstWorldLow() + " = new "
				+ this.dto.getDto().getTableNamePoFirstWorldUp() + "(); \n");
		sb.append(this.getConvertString());
		sb.append("			return " + this.dto.getDto().getTableNamePoFirstWorldLow() + "; \n");
		sb.append("		} \n \n");
		return sb.toString();
	}

	// to object
	private String getOverrideToSourceDataString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("		@Override \n");
		sb.append("		public RowMap toRowMap(final " + this.dto.getDto().getTableNamePoFirstWorldUp() + " "
				+ this.dto.getDto().getTableNamePoFirstWorldLow() + ") { \n");
		sb.append("			final RowMap rowMap = new RowMap(); \n");
		sb.append(this.getToSourceDataString());
		sb.append("			return rowMap; \n");
		sb.append("		} \n \n");
		return sb.toString();
	}

	// getConverter
	private String getConverterString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("	public IConverter<" + this.dto.getDto().getTableNamePoFirstWorldUp() + "> getConverter() { \n");
		sb.append("		return CONVERTER; \n");
		sb.append("	} \n \n");
		return sb.toString();
	}

	// get PK
	private String getPkSqlWhereString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("	@Override \n");
		sb.append("	public SqlWhere getPkSqlWhere(" + this.dto.getDto().getTableNamePoFirstWorldUp() + " po) { \n");
		sb.append(this.checkPkSqlWhereString());
		sb.append("	} \n \n");
		return sb.toString();
	}

	// 欄位對映成物件
	private String getConvertString() {
		final StringBuilder sb = new StringBuilder();
		for (int i = 0; i < this.dto.getList().size(); i++) {
			sb.append("			" + this.dto.getDto().getTableNamePoFirstWorldLow())
					.append(".set" + StringFormatUtil.formatFirstWorldToUpper(this.dto.getList().get(i).getColumnName())
							+ "(")
					.append(this.getDataTypeConvertMethod(this.dto.getList().get(i).getColumnName().toUpperCase(),
							this.dto.getList().get(i).getDataType()))
					.append("); \n");
		}
		return sb.toString();
	}

	// 欄位資料型態轉換的method
	private String getDataTypeConvertMethod(String columnName, String dataType) {
		final StringBuilder sb = new StringBuilder();
		if (DBDataType.VARCHAR2.getDBType().equals(dataType) || DBDataType.CHAR.getDBType().equals(dataType)) {
			sb.append("rowMap.getString(").append(this.dto.getDto().getTableNamePoFirstWorldUp())
					.append(".COLUMNS." + columnName + ".name())");
			return String.format(DBDataType.VARCHAR2.getMethod(), sb.toString());
		} else if (DBDataType.NUMBER.getDBType().equals(dataType)) {
			sb.append("rowMap.getValue(").append(this.dto.getDto().getTableNamePoFirstWorldUp())
					.append(".COLUMNS." + columnName + ".name())");
			return String.format(DBDataType.NUMBER.getMethod(), sb.toString());
		} else if (DBDataType.DATE.getDBType().equals(dataType)) {
			sb.append("rowMap.getValue(").append(this.dto.getDto().getTableNamePoFirstWorldUp())
					.append(".COLUMNS." + columnName + ".name())");
			return String.format(DBDataType.DATE.getMethod(), sb.toString());
		} else {
			return String.format(DBDataType.VARCHAR2.getMethod(), sb.toString());
		}
	}

	// 物件對映成原始資料欄位
	private String getToSourceDataString() {
		final StringBuilder sb = new StringBuilder();
		for (int i = 0; i < this.dto.getList().size(); i++) {
			sb.append("			rowMap.setValue(" + this.dto.getDto().getTableNamePoFirstWorldUp())
					.append(".COLUMNS." + this.dto.getList().get(i).getColumnName().toUpperCase() + ".name(), ")
					.append(this.dto.getDto().getTableNamePoFirstWorldLow() + ".get")
					.append(StringFormatUtil.formatFirstWorldToUpper(this.dto.getList().get(i).getColumnName())
							+ "()); \n");
		}
		return sb.toString();
	}

	// 判斷欄位是否為PK
	private String checkPkSqlWhereString() {
		final StringBuilder sb = new StringBuilder();
		final StringBuilder sqlWhere = new StringBuilder();
		for (int i = 0; i < this.dto.getList().size(); i++) {
			if (this.dto.getList().get(i).getPosition() != null) {
				sqlWhere.append("		sqlWhere.add(" + this.dto.getDto().getTableNamePoFirstWorldUp())
						.append(".COLUMNS." + this.dto.getList().get(i).getColumnName().toUpperCase() + ".name(), ")
						.append("po.get")
						.append(StringFormatUtil.formatFirstWorldToUpper(this.dto.getList().get(i).getColumnName())
								+ "()); \n");
			}
		}
		if (sqlWhere.length() > 0) {
			sb.append("		SqlWhere sqlWhere = new SqlWhere(); \n");
			sb.append(sqlWhere);
			sb.append("		return sqlWhere; \n");
		} else {
			sb.append("		throw new ApBusinessException(\"無pk不支援\"); \n");
		}
		return sb.toString();
	}

}
