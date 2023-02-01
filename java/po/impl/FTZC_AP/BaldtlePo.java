package com.doc.common.po.impl; 
 
public class BaldtlePo implements IBaldtlePo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		IN_GUID("核銷ID"), //
		DECL_NO("核銷報單號碼"), //
		ITEM_NO("核銷報單項次"), //
		DECL_TYPE("核銷報單類別"), //
		COMMODITY_NO("原料料號"), //
		GOODS_UNIT("原料單位"), //
		IN_QTY("預計核銷總數量"), //
		REF_DOC_NO("參考文件號碼"), //
		REF_DOC_VER("參考文件版本"), //
		VERIFY_DELIVER_TYPE("核銷類別(由出倉單核銷:O進倉單為I)"), //
		VERIFY_QTY("未核銷數量"), //
		VERIFY_STATUS("核銷狀態(IS09核銷數量不足；IS08對應不到滯外帳)"), //
		USER_ID("使用者代號"), //
		CREATE_DATM("該筆資料產生日期時間"), //
		REF_GUID("(國瑞)記錄最原始的進倉") //
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
	private String inGuid;
	private String declNo;
	private BigDecimal itemNo;
	private String declType;
	private String commodityNo;
	private String goodsUnit;
	private BigDecimal inQty;
	private String refDocNo;
	private String refDocVer;
	private String verifyDeliverType;
	private BigDecimal verifyQty;
	private String verifyStatus;
	private String userId;
	private String createDatm;
	private String refGuid;

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
	public String getGoodsUnit() {
		return this.goodsUnit;
	}
 
	@Override
	public void setGoodsUnit(final String goodsUnit) {
		this.goodsUnit = goodsUnit; 
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
	public String getVerifyDeliverType() {
		return this.verifyDeliverType;
	}
 
	@Override
	public void setVerifyDeliverType(final String verifyDeliverType) {
		this.verifyDeliverType = verifyDeliverType; 
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
	public String getRefGuid() {
		return this.refGuid;
	}
 
	@Override
	public void setRefGuid(final String refGuid) {
		this.refGuid = refGuid; 
	}
 
}
