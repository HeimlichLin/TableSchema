package com.tableSchema.domain.dao;

import com.tableSchema.domain.bean.AllColCommentsDo;
import com.tableSchema.common.db.Converter;
import com.tableSchema.common.db.RowMap;
import com.tableSchema.common.db.sql.SqlWhere;
import com.tableSchema.common.exception.ApBusinessException;

public class AllColCommentsDAO {

	public static final AllColCommentsDAO INSTANCE = new AllColCommentsDAO();
	public static final String TABLENAME = "ALL_COL_COMMENTS";

	protected static Converter<AllColCommentsDo> CONVERTER = new Converter<AllColCommentsDo>() {

		@Override
		public AllColCommentsDo convert(RowMap paramDataObject) {
			final AllColCommentsDo allColCommentsDo = new AllColCommentsDo();
			allColCommentsDo.setTableName(paramDataObject.getString(
					AllColCommentsDo.COLUMNS.OWNER.name()));
			allColCommentsDo.setTableName(paramDataObject.getString(
					AllColCommentsDo.COLUMNS.TABLE_NAME.name()));
			allColCommentsDo.setColumnName(paramDataObject.getString(
					AllColCommentsDo.COLUMNS.COLUMN_NAME.name()));
			allColCommentsDo.setComments(paramDataObject.getString(
					AllColCommentsDo.COLUMNS.COMMENTS.name()));
			return allColCommentsDo;
		}
	};

	public Converter<AllColCommentsDo> getConverter() {
		return CONVERTER;
	}

	public SqlWhere getPkSqlWhere(AllColCommentsDo vo) {
		throw new ApBusinessException("無pk不支援");
	}

}
