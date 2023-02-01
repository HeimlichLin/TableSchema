package com.doc.common.po.impl; 
 
public class BommodlogPo implements IBommodlogPo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		BF_BOM_NO("用料清表編號(客戶自訂)"), //
		BOM_NO("用料清表編號(系統唯一)"), //
		VER("用料清表版本"), //
		PARENT("父料號"), //
		COMMODITY_NO("料號"), //
		CTM_CODE("客戶代碼"), //
		BOM_DATE("用料清表日期"), //
		USER_ID("建置者/異動者"), //
		MOD_TIME("修改時間"), //
		ORI_DATA("原始資料"), //
		MOD_DATA("修改後資料"), //
		MOD_COLUMN("修改紀錄欄位") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String bfNo;
	private String bfBomNo;
	private String bomNo;
	private String ver;
	private String parent;
	private String commodityNo;
	private String ctmCode;
	private String bomDate;
	private String userId;
	private String modTime;
	private String oriData;
	private String modData;
	private String modColumn;

	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
	}
 
	@Override
	public String getBfBomNo() {
		return this.bfBomNo;
	}
 
	@Override
	public void setBfBomNo(final String bfBomNo) {
		this.bfBomNo = bfBomNo; 
	}
 
	@Override
	public String getBomNo() {
		return this.bomNo;
	}
 
	@Override
	public void setBomNo(final String bomNo) {
		this.bomNo = bomNo; 
	}
 
	@Override
	public String getVer() {
		return this.ver;
	}
 
	@Override
	public void setVer(final String ver) {
		this.ver = ver; 
	}
 
	@Override
	public String getParent() {
		return this.parent;
	}
 
	@Override
	public void setParent(final String parent) {
		this.parent = parent; 
	}
 
	@Override
	public String getCommodityNo() {
		return this.commodityNo;
	}
 
	@Override
	public void setCommodityNo(final String commodityNo) {
		this.commodityNo = commodityNo; 
	}
 
	@Override
	public String getCtmCode() {
		return this.ctmCode;
	}
 
	@Override
	public void setCtmCode(final String ctmCode) {
		this.ctmCode = ctmCode; 
	}
 
	@Override
	public String getBomDate() {
		return this.bomDate;
	}
 
	@Override
	public void setBomDate(final String bomDate) {
		this.bomDate = bomDate; 
	}
 
	@Override
	public String getUserId() {
		return this.userId;
	}
 
	@Override
	public void setUserId(final String userId) {
		this.userId = userId; 
	}
 
	@Override
	public String getModTime() {
		return this.modTime;
	}
 
	@Override
	public void setModTime(final String modTime) {
		this.modTime = modTime; 
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
	public String getModColumn() {
		return this.modColumn;
	}
 
	@Override
	public void setModColumn(final String modColumn) {
		this.modColumn = modColumn; 
	}
 
}
