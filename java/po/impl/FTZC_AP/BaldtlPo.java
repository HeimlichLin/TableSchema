package com.doc.common.po.impl; 
 
public class BaldtlPo implements IBaldtlPo {
 
	public enum COLUMNS {
		M_GUID("對應出倉的滯外帳資料:BALACNE.OUT_GUID"), //
		BF_NO("監管編號"), //
		IN_GUID("核銷明細的ID.若是進倉核銷滯外帳,則為進倉明細GUID;若為出倉明細核銷滯外帳,則為出倉明細GUID"), //
		DECL_NO("核銷報單號碼"), //
		ITEM_NO("核銷報單項次"), //
		DECL_TYPE("核銷報單類別"), //
		COMMODITY_NO("料號"), //
		IN_QTY("進倉數量"), //
		REF_DOC_NO("參考文件號碼"), //
		REF_DOC_VER("參考文件版本"), //
		VERIFY_QTY("核銷滯外帳數量,現行系統的BOM_QTY"), //
		VERIFY_STATUS("核銷狀態,IS09:滯外庫存量不足核銷;IS10:滯外庫存已被核銷"), //
		USER_ID("使用者代號"), //
		CREATE_DATM("該筆資料產生日期時間"), //
		VERIFY_DELIVER_TYPE("核銷類別:I:進倉核銷此滯外帳;O:出倉核銷滯外帳"), //
		GOODS_UNIT("進倉料單位"), //
		REF_GUID("(國瑞)記錄最原始的進倉"), //
		DUTY_TYPE("null"), //
		OUT_STORAGE_AREA("出倉儲位"), //
		UNIT_QTY("單位用量") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String mGuid;
	private String bfNo;
	private String inGuid;
	private String declNo;
	private BigDecimal itemNo;
	private String declType;
	private String commodityNo;
	private BigDecimal inQty;
	private String refDocNo;
	private String refDocVer;
	private BigDecimal verifyQty;
	private String verifyStatus;
	private String userId;
	private String createDatm;
	private String verifyDeliverType;
	private String goodsUnit;
	private String refGuid;
	private String dutyType;
	private String outStorageArea;
	private BigDecimal unitQty;

	@Override
	public String getMGuid() {
		return this.mGuid;
	}
 
	@Override
	public void setMGuid(final String mGuid) {
		this.mGuid = mGuid; 
	}
 
	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
	}
 
	@Override
	public String getInGuid() {
		return this.inGuid;
	}
 
	@Override
	public void setInGuid(final String inGuid) {
		this.inGuid = inGuid; 
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
	public BigDecimal getItemNo() {
		return this.itemNo;
	}
 
	@Override
	public void setItemNo(final BigDecimal itemNo) {
		this.itemNo = itemNo; 
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
	public String getCommodityNo() {
		return this.commodityNo;
	}
 
	@Override
	public void setCommodityNo(final String commodityNo) {
		this.commodityNo = commodityNo; 
	}
 
	@Override
	public BigDecimal getInQty() {
		return this.inQty;
	}
 
	@Override
	public void setInQty(final BigDecimal inQty) {
		this.inQty = inQty; 
	}
 
	@Override
	public String getRefDocNo() {
		return this.refDocNo;
	}
 
	@Override
	public void setRefDocNo(final String refDocNo) {
		this.refDocNo = refDocNo; 
	}
 
	@Override
	public String getRefDocVer() {
		return this.refDocVer;
	}
 
	@Override
	public void setRefDocVer(final String refDocVer) {
		this.refDocVer = refDocVer; 
	}
 
	@Override
	public BigDecimal getVerifyQty() {
		return this.verifyQty;
	}
 
	@Override
	public void setVerifyQty(final BigDecimal verifyQty) {
		this.verifyQty = verifyQty; 
	}
 
	@Override
	public String getVerifyStatus() {
		return this.verifyStatus;
	}
 
	@Override
	public void setVerifyStatus(final String verifyStatus) {
		this.verifyStatus = verifyStatus; 
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
	public String getCreateDatm() {
		return this.createDatm;
	}
 
	@Override
	public void setCreateDatm(final String createDatm) {
		this.createDatm = createDatm; 
	}
 
	@Override
	public String getVerifyDeliverType() {
		return this.verifyDeliverType;
	}
 
	@Override
	public void setVerifyDeliverType(final String verifyDeliverType) {
		this.verifyDeliverType = verifyDeliverType; 
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
	public String getRefGuid() {
		return this.refGuid;
	}
 
	@Override
	public void setRefGuid(final String refGuid) {
		this.refGuid = refGuid; 
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
	public String getOutStorageArea() {
		return this.outStorageArea;
	}
 
	@Override
	public void setOutStorageArea(final String outStorageArea) {
		this.outStorageArea = outStorageArea; 
	}
 
	@Override
	public BigDecimal getUnitQty() {
		return this.unitQty;
	}
 
	@Override
	public void setUnitQty(final BigDecimal unitQty) {
		this.unitQty = unitQty; 
	}
 
}
