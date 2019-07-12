package com.tableSchema.domain.dao;

import com.tableSchema.domain.bean.AllConsColumnsDo;
import com.tableSchema.common.db.Converter;
import com.tableSchema.common.db.RowMap;
import com.tableSchema.common.db.sql.SqlWhere;
import com.tableSchema.common.exception.ApBusinessException;

public class AllConsColumnsDAO {

	public static final AllConsColumnsDAO INSTANCE = new AllConsColumnsDAO();
	public static final String TABLENAME = "ALL_CONS_COLUMNS";

	protected static Converter<AllConsColumnsDo> CONVERTER = new Converter<AllConsColumnsDo>() {

		@Override
		public AllConsColumnsDo convert(RowMap paramDataObject) {
			final AllConsColumnsDo allConsColumnsDo = new AllConsColumnsDo();
			allConsColumnsDo.setOwner(paramDataObject.getString(AllConsColumnsDo.COLUMNS.OWNER.name()));
			allConsColumnsDo.setConsteraintName(paramDataObject
					.getString(AllConsColumnsDo.COLUMNS.CONSTERAINT_NAME.name()));
			allConsColumnsDo.setTableName(paramDataObject
					.getString(AllConsColumnsDo.COLUMNS.TABLE_NAME.name()));
			allConsColumnsDo.setColumnName(paramDataObject
					.getString(AllConsColumnsDo.COLUMNS.COLUMN_NAME.name()));
			allConsColumnsDo.setPosition(paramDataObject
					.getString(AllConsColumnsDo.COLUMNS.POSITION.name()));
			return allConsColumnsDo;
		}
	};

	public Converter<AllConsColumnsDo> getConverter() {
		return CONVERTER;
	}

	public SqlWhere getPkSqlWhere(AllConsColumnsDo vo) {
		throw new ApBusinessException("無pk不支援");
	}

}
