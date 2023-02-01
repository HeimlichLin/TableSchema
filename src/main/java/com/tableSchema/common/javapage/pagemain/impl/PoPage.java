package com.tableSchema.common.javapage.pagemain.impl;

import com.tableSchema.common.codegenerate.DBDataType;
import com.tableSchema.common.javapage.pagemain.PageMain;
import com.tableSchema.common.utils.StringFormatUtil;
import com.tableSchema.domain.dto.TableDTO;

public class PoPage implements PageMain {

	private final TableDTO dto;

	public PoPage(TableDTO dto) {
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
		return "package com.doc.common.po; \n \n";
	}

	@Override
	public String getImportString() {
		return "";
	}

	@Override
	public String getClassString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("public interface I"
				+ this.dto.getDto().getTableNamePoFirstWorldUp() + " {\n \n");
		sb.append(this.getGetterAndSetterString());
		sb.append("}\n");
		return sb.toString();
	}

	// getter, setter
	private String getGetterAndSetterString() {
		final StringBuilder sb = new StringBuilder();
		for (int i = 0; i < this.dto.getList().size(); i++) {
			sb.append(this.getGetterString(
					this.dto.getList().get(i).getColumnName(),
					this.dto.getList().get(i).getDataType()));
			sb.append(this.getSetterString(
					this.dto.getList().get(i).getColumnName(),
					this.dto.getList().get(i).getDataType()));
		}
		return sb.toString();
	}

	// Getter
	private String getGetterString(String columnName, String dataType) {
		final StringBuilder sb = new StringBuilder();
		sb.append("	" + this.convert2JavaType(dataType));
		sb.append(" get" + StringFormatUtil.formatFirstWorldToUpper(columnName)
				+ "();\n \n");
		return sb.toString();
	}

	// Setter
	private String getSetterString(String columnName, String dataType) {
		final StringBuilder sb = new StringBuilder();
		sb.append("	void set"
				+ StringFormatUtil.formatFirstWorldToUpper(columnName)
				+ "(final ");
		sb.append(this.convert2JavaType(dataType));
		sb.append(" " + StringFormatUtil.formatFirstWorldToLower(columnName)
				+ ");\n \n");
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
