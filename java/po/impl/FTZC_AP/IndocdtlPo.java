package com.doc.common.po.impl; 
 
public class IndocdtlPo implements IIndocdtlPo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		DOC_NO("文件單號"), //
		DOC_ITEM("文件項次"), //
		COMMODITY_NO("產品料號"), //
		GOOD_UNIT("產品單位"), //
		GOOD_QTY("預計進倉數量"), //
		VERIFY_QTY("已核銷數量數量"), //
		VERIFY_STATUS("核銷狀態"), //
		CTM_CODE("客戶代碼"), //
		GOOD_KIND("成品運回: 1 廢料：2；原料運回：3；成品退回原料:4"), //
		GOODS_CODE("貨物性質(1:機器設備;2:營運貨物)"), //
		DOC_TYPE("文件類別:加工單(P)、拆料單(R)、維修單、檢測單(T)、報廢單(S)"), //
		BACK_QTY("P:成品退回數量(退料使用)"), //
		REF_GUID("null"), //
		REMARK1("備註說明:於P進退料作業時提供對應的成品數說明"), //
		CREATE_DATE("記錄RECORD時間") //
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
	private String docNo;
	private String docItem;
	private String commodityNo;
	private String goodUnit;
	private BigDecimal goodQty;
	private BigDecimal verifyQty;
	private String verifyStatus;
	private String ctmCode;
	private String goodKind;
	private String goodsCode;
	private String docType;
	private BigDecimal backQty;
	private String refGuid;
	private String remark1;
	private String createDate;

	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
	}
 
	@Override
	public String getDocNo() {
		return this.docNo;
	}
 
	@Override
	public void setDocNo(final String docNo) {
		this.docNo = docNo; 
	}
 
	@Override
	public String getDocItem() {
		return this.docItem;
	}
 
	@Override
	public void setDocItem(final String docItem) {
		this.docItem = docItem; 
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
	public String getGoodUnit() {
		return this.goodUnit;
	}
 
	@Override
	public void setGoodUnit(final String goodUnit) {
		this.goodUnit = goodUnit; 
	}
 
	@Override
	public BigDecimal getGoodQty() {
		return this.goodQty;
	}
 
	@Override
	public void setGoodQty(final BigDecimal goodQty) {
		this.goodQty = goodQty; 
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
	public String getCtmCode() {
		return this.ctmCode;
	}
 
	@Override
	public void setCtmCode(final String ctmCode) {
		this.ctmCode = ctmCode; 
	}
 
	@Override
	public String getGoodKind() {
		return this.goodKind;
	}
 
	@Override
	public void setGoodKind(final String goodKind) {
		this.goodKind = goodKind; 
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
	public String getDocType() {
		return this.docType;
	}
 
	@Override
	public void setDocType(final String docType) {
		this.docType = docType; 
	}
 
	@Override
	public BigDecimal getBackQty() {
		return this.backQty;
	}
 
	@Override
	public void setBackQty(final BigDecimal backQty) {
		this.backQty = backQty; 
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
	public String getRemark1() {
		return this.remark1;
	}
 
	@Override
	public void setRemark1(final String remark1) {
		this.remark1 = remark1; 
	}
 
	@Override
	public String getCreateDate() {
		return this.createDate;
	}
 
	@Override
	public void setCreateDate(final String createDate) {
		this.createDate = createDate; 
	}
 
}
