package com.tableSchema.common.javapage.pagemain.impl;

import com.tableSchema.common.codegenerate.DBDataType;
import com.tableSchema.common.javapage.pagemain.PageMain;
import com.tableSchema.common.utils.StringFormatUtil;
import com.tableSchema.domain.dto.TableDTO;

public class DoPageImpl implements PageMain {
	
	private TableDTO dto;
	
	public DoPageImpl(TableDTO dto) {
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

	// package
	@Override
	public String getPackageString() {
		return "package com.doc.common.bean; \n \n";
	}

	// import
	@Override
	public String getImportString() {
		return "";
	}

	// class
	@Override
	public String getClassString() {
		StringBuilder sb = new StringBuilder();		
		sb.append("public class " + this.dto.getDto().getTableNameDoFirstWorldUp() + " { \n \n");
		sb.append(this.getEnumString());
		sb.append(this.getVariableString());
		sb.append(this.getGetterAndSetterString());
		sb.append("} \n");
		return sb.toString();
	}

	// enum
	private String getEnumString() {
		StringBuilder sb = new StringBuilder();
		sb.append("	public enum COLUMNS { \n");
		sb.append(this.getEnumColumnsString());
		sb.append("		private final String comment; \n");
		sb.append("	 \n");
		sb.append("		private COLUMNS(final String comment) { \n");
		sb.append("			this.comment = comment; \n");
		sb.append("		} \n");
		sb.append("	 \n");
		sb.append("		public String getComment() { \n");
		sb.append("			return this.comment; \n");
		sb.append("		} \n");
		sb.append("	} \n \n");
		return sb.toString();
	}	
	
	// enum內的物件
	private String getEnumColumnsString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < this.dto.getList().size(); i++) {
			sb.append("		" + this.dto.getList().get(i).getColumnName().toUpperCase() 
					+ "(\"" + this.dto.getList().get(i).getColumnComments()+"\")");
			if (i != this.dto.getList().size()-1){
				sb.append(", \n");
			}else {
				sb.append(" \n");
			}
		}
		sb.append("		; \n");
		return sb.toString();
	}
	
	// variable
	private String getVariableString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < this.dto.getList().size(); i++) {
			sb.append("	private ").append(this.convert2JavaType(this.dto.getList().get(i).getDataType()));
			sb.append(" " + StringFormatUtil.formatFirstWorldToLower(this.dto.getList().get(i).getColumnName()) + "; \n");
		}
		sb.append("	\n");
		return sb.toString();
	}
		
	// getter, setter
	private String getGetterAndSetterString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < this.dto.getList().size(); i++) {
			sb.append(this.getGetterString(this.dto.getList().get(i).getColumnName(), this.dto.getList().get(i).getDataType()));
			sb.append(this.getSetterString(this.dto.getList().get(i).getColumnName(), this.dto.getList().get(i).getDataType()));
		}
		return sb.toString();
	}
	
	// Getter
	private String getGetterString(String columnName, String dataType) {
		StringBuilder sb = new StringBuilder();
		sb.append("	public ").append(this.convert2JavaType(dataType));
		sb.append(" get" + StringFormatUtil.formatFirstWorldToUpper(columnName) + "() { \n");
		sb.append("		return " + StringFormatUtil.formatFirstWorldToLower(columnName) + "; \n");
		sb.append("	} \n \n");
		return sb.toString();
	}
	
	// Setter
	private String getSetterString(String columnName, String dataType) {
		StringBuilder sb = new StringBuilder();
		sb.append("	public void set" + StringFormatUtil.formatFirstWorldToUpper(columnName)	+ "(");
		sb.append(this.convert2JavaType(dataType));
		sb.append(" " + StringFormatUtil.formatFirstWorldToLower(columnName) + ") { \n");
		sb.append("		this." + StringFormatUtil.formatFirstWorldToLower(columnName) + " = " + StringFormatUtil.formatFirstWorldToLower(columnName) + "; \n");
		sb.append("	} \n \n");
		return sb.toString();
	}
	
	// 欄位資料型態判斷
	private String convert2JavaType(String dataType) {
		if (DBDataType.VARCHAR2.getDBType().equals(dataType)) {
			return DBDataType.VARCHAR2.getJavaType();
		} else if (DBDataType.NUMBER.getDBType().equals(dataType)) {
			return DBDataType.NUMBER.getJavaType();
		} else if (DBDataType.DATE.getDBType().equals(dataType)) {
			return DBDataType.DATE.getJavaType();
		} else {
			return DBDataType.VARCHAR2.getJavaType();
		}
	}

}
