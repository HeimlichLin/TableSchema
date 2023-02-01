package com.doc.common.po.impl; 
 
public class BaldtlTPo implements IBaldtlTPo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
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
		EF_DECL_NO("對應滯外帳資料:BALANCE_T:DECL_NO"), //
		EF_ITEM_NO("對應滯外帳資料:BALANCE_T:ITEM_NO"), //
		COCOMP_NO("協力廠商"), //
		CTM_CODE("客戶代碼"), //
		INVTRY_TYPE("帳務類別 -:一般 V:成車"), //
		OUT_STORAGE_AREA("出倉儲位"), //
		O_COMMODITY_NO("原料料號") //
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
	private String efDeclNo;
	private BigDecimal efItemNo;
	private String cocompNo;
	private String ctmCode;
	private String invtryType;
	private String outStorageArea;
	private String oCommodityNo;

	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
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
	public String getEfDeclNo() {
		return this.efDeclNo;
	}
 
	@Override
	public void setEfDeclNo(final String efDeclNo) {
		this.efDeclNo = efDeclNo; 
	}
 
	@Override
	public BigDecimal getEfItemNo() {
		return this.efItemNo;
	}
 
	@Override
	public void setEfItemNo(final BigDecimal efItemNo) {
		this.efItemNo = efItemNo; 
	}
 
	@Override
	public String getCocompNo() {
		return this.cocompNo;
	}
 
	@Override
	public void setCocompNo(final String cocompNo) {
		this.cocompNo = cocompNo; 
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
	public String getInvtryType() {
		return this.invtryType;
	}
 
	@Override
	public void setInvtryType(final String invtryType) {
		this.invtryType = invtryType; 
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
	public String getOCommodityNo() {
		return this.oCommodityNo;
	}
 
	@Override
	public void setOCommodityNo(final String oCommodityNo) {
		this.oCommodityNo = oCommodityNo; 
	}
 
}
