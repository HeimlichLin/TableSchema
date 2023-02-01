package com.tableSchema.domain.dao;

import java.util.List;

import com.tableSchema.common.db.Converter;
import com.tableSchema.common.db.DbSession;
import com.tableSchema.common.db.RowMap;
import com.tableSchema.common.db.sql.SqlWhere;
import com.tableSchema.common.utils.PropertiesUtil;
import com.tableSchema.domain.bean.AllTabCommentsDo;

public class AllTabCommentsDAO {

	public static final AllTabCommentsDAO INSTANCE = new AllTabCommentsDAO();
	public static final String TABLENAME = "ALL_TAB_COMMENTS";

	protected static Converter<AllTabCommentsDo> CONVERTER = new Converter<AllTabCommentsDo>() {

		@Override
		public AllTabCommentsDo convert(RowMap paramDataObject) {
			final AllTabCommentsDo allTabCommentsDo = new AllTabCommentsDo();
			allTabCommentsDo.setOwner(paramDataObject
					.getString(AllTabCommentsDo.COLUMNS.OWNER.name()));
			allTabCommentsDo.setTableName(paramDataObject
					.getString(AllTabCommentsDo.COLUMNS.TABLE_NAME.name()));
			allTabCommentsDo.setTableType(paramDataObject
					.getString(AllTabCommentsDo.COLUMNS.TABLE_TYPE.name()));
			allTabCommentsDo.setComments(paramDataObject
					.getString(AllTabCommentsDo.COLUMNS.COMMENTS.name()));
			return allTabCommentsDo;
		}

	};

	public Converter<AllTabCommentsDo> getConverter() {
		return CONVERTER;
	}

	public List<AllTabCommentsDo> getAllTableName(DbSession session) {
		final String sql = " select * from " + AllTabCommentsDAO.TABLENAME
				+ " where OWNER = ( ? ) and TABLE_TYPE = 'TABLE' order by TABLE_NAME asc ";
		final SqlWhere sqlWhere = new SqlWhere();
		sqlWhere.add("1", PropertiesUtil.getUserName());
		return session.select(AllTabCommentsDAO.INSTANCE.getConverter(), sql,
				sqlWhere);
	}

}
