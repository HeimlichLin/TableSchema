package com.doc.common.po.impl; 
 
public class BalanceTPo implements IBalanceTPo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		DECL_NO("報單號碼"), //
		ITEM_NO("報單項次"), //
		COMMODITY_NO("料號"), //
		GOODS_UNIT("出倉單位"), //
		BALANCE_QTY("滯外帳數量"), //
		VERIFY_QTY("已核銷數量"), //
		VERIFY_STATUS("核銷狀態"), //
		EXTEND_DOC("展延文號"), //
		EXTEND_DATE("展延期限"), //
		EXPIRE_MARK("逾期註記：N:未逾期；Y:逾期半年；YY:逾期一年以上"), //
		COCOMP_NO("協力廠商"), //
		CTM_CODE("客戶代碼"), //
		CREATE_DATM("資料產生日期"), //
		EDIT_MARK("資料編輯:Y代表該滯外帳可修改,N:代表已有核銷紀錄，不可異動"), //
		APPROVE_DOC("出區核准文號"), //
		APPROVE_DATE("出區核准期限"), //
		YZ_DECL_NO("原YZ進倉報單單號"), //
		YZ_ITEM_NO("原YZ進倉報單項次"), //
		INVTRY_TYPE("帳務類別 -:一般 V:成車"), //
		OUT_STORAGE_AREA("出倉儲位") //
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
	private String commodityNo;
	private String goodsUnit;
	private BigDecimal balanceQty;
	private BigDecimal verifyQty;
	private String verifyStatus;
	private String extendDoc;
	private String extendDate;
	private String expireMark;
	private String cocompNo;
	private String ctmCode;
	private String createDatm;
	private String editMark;
	private String approveDoc;
	private String approveDate;
	private String yzDeclNo;
	private BigDecimal yzItemNo;
	private String invtryType;
	private String outStorageArea;

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
	public BigDecimal getBalanceQty() {
		return this.balanceQty;
	}
 
	@Override
	public void setBalanceQty(final BigDecimal balanceQty) {
		this.balanceQty = balanceQty; 
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
	public String getExtendDoc() {
		return this.extendDoc;
	}
 
	@Override
	public void setExtendDoc(final String extendDoc) {
		this.extendDoc = extendDoc; 
	}
 
	@Override
	public String getExtendDate() {
		return this.extendDate;
	}
 
	@Override
	public void setExtendDate(final String extendDate) {
		this.extendDate = extendDate; 
	}
 
	@Override
	public String getExpireMark() {
		return this.expireMark;
	}
 
	@Override
	public void setExpireMark(final String expireMark) {
		this.expireMark = expireMark; 
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
	public String getCreateDatm() {
		return this.createDatm;
	}
 
	@Override
	public void setCreateDatm(final String createDatm) {
		this.createDatm = createDatm; 
	}
 
	@Override
	public String getEditMark() {
		return this.editMark;
	}
 
	@Override
	public void setEditMark(final String editMark) {
		this.editMark = editMark; 
	}
 
	@Override
	public String getApproveDoc() {
		return this.approveDoc;
	}
 
	@Override
	public void setApproveDoc(final String approveDoc) {
		this.approveDoc = approveDoc; 
	}
 
	@Override
	public String getApproveDate() {
		return this.approveDate;
	}
 
	@Override
	public void setApproveDate(final String approveDate) {
		this.approveDate = approveDate; 
	}
 
	@Override
	public String getYzDeclNo() {
		return this.yzDeclNo;
	}
 
	@Override
	public void setYzDeclNo(final String yzDeclNo) {
		this.yzDeclNo = yzDeclNo; 
	}
 
	@Override
	public BigDecimal getYzItemNo() {
		return this.yzItemNo;
	}
 
	@Override
	public void setYzItemNo(final BigDecimal yzItemNo) {
		this.yzItemNo = yzItemNo; 
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
 
}
