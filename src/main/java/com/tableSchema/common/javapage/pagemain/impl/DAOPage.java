package com.tableSchema.common.javapage.pagemain.impl;

import com.tableSchema.common.javapage.pagemain.PageMain;
import com.tableSchema.domain.dto.TableDTO;

public class DAOPage implements PageMain {

	private final TableDTO dto;

	public DAOPage(TableDTO dto) {
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
		return "package com.doc.common.dao; \n \n";
	}

	@Override
	public String getImportString() {
		return "";
	}

	@Override
	public String getClassString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("public interface " + this.dto.getDto().getTableNameDAOFirstWorldUp() + " {\n \n");
		sb.append("}\n");
		return sb.toString();
	}

}
