package com.doc.common.po.impl; 
 
public class ModelogPo implements IModelogPo {
 
	public enum COLUMNS {
		ITEM_NO("報單項次"), //
		MOD_ITEM("異動項次"), //
		ORI_DATA("異動前"), //
		MOD_DATA("異動後"), //
		ITEM("項次"), //
		POST("儲位"), //
		REMKS("異動紀錄備註說明"), //
		LOG_ID("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String itemNo;
	private String modItem;
	private String oriData;
	private String modData;
	private String item;
	private String post;
	private String remks;
	private String logId;

	@Override
	public String getItemNo() {
		return this.itemNo;
	}
 
	@Override
	public void setItemNo(final String itemNo) {
		this.itemNo = itemNo; 
	}
 
	@Override
	public String getModItem() {
		return this.modItem;
	}
 
	@Override
	public void setModItem(final String modItem) {
		this.modItem = modItem; 
	}
 
	@Override
	public String getOriData() {
		return this.oriData;
	}
 
	@Override
	public void setOriData(final String oriData) {
		this.oriData = oriData; 
	}
 
	@Override
	public String getModData() {
		return this.modData;
	}
 
	@Override
	public void setModData(final String modData) {
		this.modData = modData; 
	}
 
	@Override
	public String getItem() {
		return this.item;
	}
 
	@Override
	public void setItem(final String item) {
		this.item = item; 
	}
 
	@Override
	public String getPost() {
		return this.post;
	}
 
	@Override
	public void setPost(final String post) {
		this.post = post; 
	}
 
	@Override
	public String getRemks() {
		return this.remks;
	}
 
	@Override
	public void setRemks(final String remks) {
		this.remks = remks; 
	}
 
	@Override
	public String getLogId() {
		return this.logId;
	}
 
	@Override
	public void setLogId(final String logId) {
		this.logId = logId; 
	}
 
}
