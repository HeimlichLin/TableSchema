package com.tableSchema.domain.dto;

import com.tableSchema.common.utils.StringFormatUtil;

public class TableNameDTO {
	
	public enum COLUMNS {
		TABLE_NAME("原表格名稱"),
		TABLE_NAME_UP("全大寫表格名稱"),
		TABLE_NAME_LOW("全小寫表格名稱"),
		TABLE_NAME_FIRST_WORLD_UP("表格名稱第一碼大寫"),
		TABLE_NAME_FIRST_WORLD_LOW("表格名稱第一碼小寫"),
		TABLE_NAME_DO_FIRST_WORLD_UP("表格物件DO名稱第一碼大寫"),
		TABLE_NAME_DO_FIRST_WORLD_LOW("表格變數DO名稱第一碼小寫"),
		TABLE_NAME_DAO_FIRST_WORLD_UP("表格物件DAO名稱第一碼大寫"),
		TABLE_NAME_DAO_FIRST_WORLD_LOW("表格變數DAO名稱第一碼小寫"),
		TABLE_NAME_DAO_IMPL_FIRST_WORLD_UP("表格物件DAOImpl名稱第一碼大寫"),
		;
		final String name;
		
		private COLUMNS(final String name) {
			this.name = name;
		}
		
		public String getName() {
			return this.name;
		}
	}
		
	private String tableName;
	private String tableNameUp;
	private String tableNameLow;
	private String tableNameFirstWorldUp;
	private String tableNameFirstWorldLow;
	private String tableNameDoFirstWorldUp;
	private String tableNameDoFirstWorldLow;
	private String tableNameDAOFirstWorldUp;
	private String tableNameDAOFirstWorldLow;
	private String tableNameDAOImplFirstWorldUp;
	
	public TableNameDTO(String tableName) {		
		this.tableName = tableName;
		this.tableNameUp = tableName.toUpperCase();
		this.tableNameLow = tableName.toLowerCase();
		this.tableNameFirstWorldUp = StringFormatUtil.formatFirstWorldToUpper(tableName);
		this.tableNameFirstWorldLow = StringFormatUtil.formatFirstWorldToLower(tableName);
		this.tableNameDoFirstWorldUp = tableNameFirstWorldUp + "Do";
		this.tableNameDoFirstWorldLow = tableNameFirstWorldLow + "Do";
		this.tableNameDAOFirstWorldUp = tableNameFirstWorldUp + "DAO";
		this.tableNameDAOFirstWorldLow = tableNameFirstWorldLow + "DAO";
		this.tableNameDAOImplFirstWorldUp = tableNameDAOFirstWorldUp + "Impl";		
	}	
	
	public String getTableName() {
		return tableName;
	}
	
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	
	public String getTableNameUp() {
		return tableNameUp;
	}
	
	public void setTableNameUp(String tableNameUp) {
		this.tableNameUp = tableNameUp;
	}
	
	public String getTableNameLow() {
		return tableNameLow;
	}
	
	public void setTableNameLow(String tableNameLow) {
		this.tableNameLow = tableNameLow;
	}
	
	public String getTableNameFirstWorldUp() {
		return tableNameFirstWorldUp;
	}
	
	public void setTableNameFirstWorldUp(String tableNameFirstWorldUp) {
		this.tableNameFirstWorldUp = tableNameFirstWorldUp;
	}
	
	public String getTableNameFirstWorldLow() {
		return tableNameFirstWorldLow;
	}
	
	public void setTableNameFirstWorldLow(String tableNameFirstWorldLow) {
		this.tableNameFirstWorldLow = tableNameFirstWorldLow;
	}

	public String getTableNameDoFirstWorldUp() {
		return tableNameDoFirstWorldUp;
	}

	public void setTableNameDoFirstWorldUp(String tableNameDoFirstWorldUp) {
		this.tableNameDoFirstWorldUp = tableNameDoFirstWorldUp;
	}

	public String getTableNameDoFirstWorldLow() {
		return tableNameDoFirstWorldLow;
	}

	public void setTableNameDoFirstWorldLow(String tableNameDoFirstWorldLow) {
		this.tableNameDoFirstWorldLow = tableNameDoFirstWorldLow;
	}

	public String getTableNameDAOFirstWorldUp() {
		return tableNameDAOFirstWorldUp;
	}

	public void setTableNameDAOFirstWorldUp(String tableNameDAOFirstWorldUp) {
		this.tableNameDAOFirstWorldUp = tableNameDAOFirstWorldUp;
	}

	public String getTableNameDAOFirstWorldLow() {
		return tableNameDAOFirstWorldLow;
	}

	public void setTableNameDAOFirstWorldLow(String tableNameDAOFirstWorldLow) {
		this.tableNameDAOFirstWorldLow = tableNameDAOFirstWorldLow;
	}

	public String getTableNameDAOImplFirstWorldUp() {
		return tableNameDAOImplFirstWorldUp;
	}

	public void setTableNameDAOImplFirstWorldUp(String tableNameDAOImplFirstWorldUp) {
		this.tableNameDAOImplFirstWorldUp = tableNameDAOImplFirstWorldUp;
	}

}
