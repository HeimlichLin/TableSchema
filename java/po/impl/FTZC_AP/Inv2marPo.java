package com.doc.common.po.impl; 
 
public class Inv2marPo implements IInv2marPo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		INV_YEAR("盤點年度"), //
		INV_ITEM("盤點清冊項次(盤點折合)/出倉單項次(銷售折合)"), //
		INV_M_ID("折合主檔ID"), //
		INV_M_TYPE("折合型態:盤點品折合(P)或是銷售數折合(S)"), //
		PRDT_NO("成品料號"), //
		GOODS_UNIT("成品單位"), //
		INV_QTY("成品盤點數量"), //
		REF_DOC_TYPE("參考文件型態:目前有兩種(P)加工單；(B)用料單"), //
		REF_DOC_NO("參考文件號碼"), //
		REF_DOC_DATE("參考文件日期"), //
		REF_DOC_VER("參考文件版本"), //
		REMARK("備註欄位,註記屬於幾階加工"), //
		INV_DATE("盤點日期"), //
		INOUT("盤點性質(1:區內;2:區外;3:區間)"), //
		COCOMP_NO("協力廠商代碼(區外盤點用1)"), //
		CTM_CODE("客戶代碼(區外盤點用)") //
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
	private String invYear;
	private String invItem;
	private String invMId;
	private String invMType;
	private String prdtNo;
	private String goodsUnit;
	private BigDecimal invQty;
	private String refDocType;
	private String refDocNo;
	private String refDocDate;
	private String refDocVer;
	private String remark;
	private String invDate;
	private String inout;
	private String cocompNo;
	private String ctmCode;

	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
	}
 
	@Override
	public String getInvYear() {
		return this.invYear;
	}
 
	@Override
	public void setInvYear(final String invYear) {
		this.invYear = invYear; 
	}
 
	@Override
	public String getInvItem() {
		return this.invItem;
	}
 
	@Override
	public void setInvItem(final String invItem) {
		this.invItem = invItem; 
	}
 
	@Override
	public String getInvMId() {
		return this.invMId;
	}
 
	@Override
	public void setInvMId(final String invMId) {
		this.invMId = invMId; 
	}
 
	@Override
	public String getInvMType() {
		return this.invMType;
	}
 
	@Override
	public void setInvMType(final String invMType) {
		this.invMType = invMType; 
	}
 
	@Override
	public String getPrdtNo() {
		return this.prdtNo;
	}
 
	@Override
	public void setPrdtNo(final String prdtNo) {
		this.prdtNo = prdtNo; 
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
	public BigDecimal getInvQty() {
		return this.invQty;
	}
 
	@Override
	public void setInvQty(final BigDecimal invQty) {
		this.invQty = invQty; 
	}
 
	@Override
	public String getRefDocType() {
		return this.refDocType;
	}
 
	@Override
	public void setRefDocType(final String refDocType) {
		this.refDocType = refDocType; 
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
	public String getRefDocDate() {
		return this.refDocDate;
	}
 
	@Override
	public void setRefDocDate(final String refDocDate) {
		this.refDocDate = refDocDate; 
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
	public String getRemark() {
		return this.remark;
	}
 
	@Override
	public void setRemark(final String remark) {
		this.remark = remark; 
	}
 
	@Override
	public String getInvDate() {
		return this.invDate;
	}
 
	@Override
	public void setInvDate(final String invDate) {
		this.invDate = invDate; 
	}
 
	@Override
	public String getInout() {
		return this.inout;
	}
 
	@Override
	public void setInout(final String inout) {
		this.inout = inout; 
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
 
}
