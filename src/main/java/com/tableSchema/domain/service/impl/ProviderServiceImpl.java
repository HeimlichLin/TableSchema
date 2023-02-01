package com.tableSchema.domain.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.tableSchema.common.db.Converter;
import com.tableSchema.common.db.DbSession;
import com.tableSchema.common.db.DbSessionFactory;
import com.tableSchema.common.db.RowMap;
import com.tableSchema.common.db.sql.ColumDetailSql;
import com.tableSchema.common.db.sql.SqlWhere;
import com.tableSchema.common.excel.Excel;
import com.tableSchema.common.javapage.JavaPage;
import com.tableSchema.common.utils.PropertiesUtil;
import com.tableSchema.domain.bean.AllTabCommentsDo;
import com.tableSchema.domain.code.SchemaCode;
import com.tableSchema.domain.dao.AllTabCommentsDAO;
import com.tableSchema.domain.dto.SchemaDTO;
import com.tableSchema.domain.dto.TableDTO;
import com.tableSchema.domain.dto.TableNameDTO;
import com.tableSchema.domain.service.ProviderService;

public class ProviderServiceImpl implements ProviderService {

	private final Logger logger = Logger.getLogger(ProviderService.class);
	private DbSession session;
	private List<AllTabCommentsDo> list;

	public ProviderServiceImpl() {
		if (this.list == null) {
			this.session = DbSessionFactory.get();
			this.list = AllTabCommentsDAO.INSTANCE
					.getAllTableName(this.session);
		}
	}

	private class MyConverter implements Converter<SchemaDTO> {
		@Override
		public SchemaDTO convert(RowMap paramDataObject) {
			final SchemaDTO dto = new SchemaDTO();
			dto.setTableName(
					paramDataObject.getString(SchemaCode.TABLE_NAME.name()));
			dto.setTableComments(paramDataObject
					.getString(SchemaCode.TABLE_COMMENTS.name()));
			dto.setColumnName(
					paramDataObject.getString(SchemaCode.COLUMN_NAME.name()));
			dto.setColumnComments(paramDataObject
					.getString(SchemaCode.COLUMN_COMMENTS.name()));
			dto.setDataType(
					paramDataObject.getString(SchemaCode.DATA_TYPE.name()));
			dto.setDataSize(
					paramDataObject.getString(SchemaCode.DATA_SIZE.name()));
			dto.setNullAble(
					paramDataObject.getString(SchemaCode.NULLABLE.name()));
			dto.setPosition(
					paramDataObject.getString(SchemaCode.POSITION.name()));
			return dto;
		}

	}

	/**
	 * 產生EXCEL的TableSchema
	 */
	public void createTableSchema() {
		final List<List<SchemaDTO>> lists = this.getAllSchemaDTOs();
		final Excel excel = new Excel();
		excel.creatExcel(lists);
	}

	/**
	 * 產生Do、DAO
	 */
	public void createJavePage() {
		for (final AllTabCommentsDo vo : this.list) {
			this.logger.info("tableName : " + vo.getTableName());
			final TableDTO tableDTO = new TableDTO();
			final TableNameDTO tableNameDTO = new TableNameDTO(
					vo.getTableName());
			final List<SchemaDTO> list = this
					.getSchemaDTOList(vo.getTableName());
			tableDTO.setDto(tableNameDTO);
			tableDTO.setList(list);
			this.creatJavaPage(tableDTO);
		}
	}

	/**
	 * 產生指定的Do、DAO
	 */
	public void createJavePage(String tableName) {
		this.logger.info("tableName : " + tableName);
		final TableDTO tableDTO = new TableDTO();
		final TableNameDTO tableNameDTO = new TableNameDTO(tableName);
		final List<SchemaDTO> list = this.getSchemaDTOList(tableName);
		tableDTO.setDto(tableNameDTO);
		tableDTO.setList(list);
		this.creatJavaPage(tableDTO);
	}

	private void creatJavaPage(final TableDTO tableDTO) {
		final JavaPage javaPage = new JavaPage();
		javaPage.createJavaPageIPo(tableDTO);
		javaPage.createJavaPageDo(tableDTO);
		javaPage.createJavaPageIDAO(tableDTO);
		javaPage.createJavaPageDAO(tableDTO);
	}

	/**
	 * 取得所有欄位的TableSchema
	 * 
	 * @return
	 */
	private List<List<SchemaDTO>> getAllSchemaDTOs() {
		final List<List<SchemaDTO>> lists = new ArrayList<List<SchemaDTO>>();
		for (final AllTabCommentsDo vo : this.list) {
			this.logger.info("tableName : " + vo.getTableName());
			lists.add(this.getSchemaDTOList(vo.getTableName()));
		}
		return lists;
	}

	/**
	 * 依據UserName、TableName取得TableSchema
	 * 
	 * @param vo
	 * @return
	 */
	private List<SchemaDTO> getSchemaDTOList(String tableName) {
		final SqlWhere sqlWhere = new SqlWhere();
		sqlWhere.add("1", PropertiesUtil.getUserName());
		sqlWhere.add("2", tableName);
		return this.session.select(new MyConverter(), ColumDetailSql.getSQL(),
				sqlWhere);
	}

}
