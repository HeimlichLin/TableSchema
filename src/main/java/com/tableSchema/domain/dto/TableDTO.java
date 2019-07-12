package com.tableSchema.domain.dto;

import java.util.List;

public class TableDTO {
	
	private TableNameDTO dto;
	private List<SchemaDTO> list;
	
	public TableNameDTO getDto() {
		return dto;
	}
	
	public void setDto(TableNameDTO dto) {
		this.dto = dto;
	}
	
	public List<SchemaDTO> getList() {
		return list;
	}
	
	public void setList(List<SchemaDTO> list) {
		this.list = list;
	}

}
