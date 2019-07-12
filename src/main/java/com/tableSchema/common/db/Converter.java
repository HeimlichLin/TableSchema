package com.tableSchema.common.db;

public interface Converter<Po> {
	
	Po convert(RowMap paramDataObject);

}
