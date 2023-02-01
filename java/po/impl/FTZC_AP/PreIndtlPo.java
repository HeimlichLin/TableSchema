package com.doc.common.po.impl; 
 
public class PreIndtlPo implements IPreIndtlPo {
 
	public enum COLUMNS {
		BF_NO("null"), //
		GOODS_CODE("null"), //
		COMMODITY_NO("null"), //
		GOODS_UNIT("null"), //
		IN_STORAGE_AREA("null"), //
		GOODS_QTY("null"), //
		GOODS_DESC("null"), //
		DECL_NO("null"), //
		GUID("null"), //
		DECL_TYPE("null"), //
		IN_DATE("null"), //
		ITEM_NO("null"), //
		DUTY_TYPE("null"), //
		STAT_MODE("null"), //
		BOM_NO("null"), //
		BOM_VER("null"), //
		PRDT_MARK("null") //
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
	private String goodsCode;
	private String commodityNo;
	private String goodsUnit;
	private String inStorageArea;
	private BigDecimal goodsQty;
	private String goodsDesc;
	private String declNo;
	private String guid;
	private String declType;
	private String inDate;
	private BigDecimal itemNo;
	private String dutyType;
	private String statMode;
	private String bomNo;
	private String bomVer;
	private String prdtMark;

	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
	}
 
	@Override
	public String getGoodsCode() {
		return this.goodsCode;
	}
 
	@Override
	public void setGoodsCode(final String goodsCode) {
		this.goodsCode = goodsCode; 
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
	public String getGoodsUnit() {
		return this.goodsUnit;
	}
 
	@Override
	public void setGoodsUnit(final String goodsUnit) {
		this.goodsUnit = goodsUnit; 
	}
 
	@Override
	public String getInStorageArea() {
		return this.inStorageArea;
	}
 
	@Override
	public void setInStorageArea(final String inStorageArea) {
		this.inStorageArea = inStorageArea; 
	}
 
	@Override
	public BigDecimal getGoodsQty() {
		return this.goodsQty;
	}
 
	@Override
	public void setGoodsQty(final BigDecimal goodsQty) {
		this.goodsQty = goodsQty; 
	}
 
	@Override
	public String getGoodsDesc() {
		return this.goodsDesc;
	}
 
	@Override
	public void setGoodsDesc(final String goodsDesc) {
		this.goodsDesc = goodsDesc; 
	}
 
	@Override
	public String getDeclNo() {
		return this.declNo;
	}
 
	@Override
	public void setDeclNo(final String declNo) {
		this.declNo = declNo; 
	}
 
	@Override
	public String getGuid() {
		return this.guid;
	}
 
	@Override
	public void setGuid(final String guid) {
		this.guid = guid; 
	}
 
	@Override
	public String getDeclType() {
		return this.declType;
	}
 
	@Override
	public void setDeclType(final String declType) {
		this.declType = declType; 
	}
 
	@Override
	public String getInDate() {
		return this.inDate;
	}
 
	@Override
	public void setInDate(final String inDate) {
		this.inDate = inDate; 
	}
 
	@Override
	public BigDecimal getItemNo() {
		return this.itemNo;
	}
 
	@Override
	public void setItemNo(final BigDecimal itemNo) {
		this.itemNo = itemNo; 
	}
 
	@Override
	public String getDutyType() {
		return this.dutyType;
	}
 
	@Override
	public void setDutyType(final String dutyType) {
		this.dutyType = dutyType; 
	}
 
	@Override
	public String getStatMode() {
		return this.statMode;
	}
 
	@Override
	public void setStatMode(final String statMode) {
		this.statMode = statMode; 
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
	public String getBomVer() {
		return this.bomVer;
	}
 
	@Override
	public void setBomVer(final String bomVer) {
		this.bomVer = bomVer; 
	}
 
	@Override
	public String getPrdtMark() {
		return this.prdtMark;
	}
 
	@Override
	public void setPrdtMark(final String prdtMark) {
		this.prdtMark = prdtMark; 
	}
 
}
