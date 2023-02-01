package com.doc.common.po.impl; 
 
public class ScrapInPo implements IScrapInPo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		SCRAP_NO("報廢單號碼"), //
		ITEM("項次"), //
		PRDT_NO("料號"), //
		DESCRIP("品名"), //
		QTY("剩餘價值數量"), //
		UNIT("單位"), //
		UNIT_PRICE("單價"), //
		VALUE_AMT("剩餘價格"), //
		IN_POST("儲位"), //
		DECL_NO("null") //
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
	private String scrapNo;
	private BigDecimal item;
	private String prdtNo;
	private String descrip;
	private BigDecimal qty;
	private String unit;
	private BigDecimal unitPrice;
	private BigDecimal valueAmt;
	private String inPost;
	private String declNo;

	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
	}
 
	@Override
	public String getScrapNo() {
		return this.scrapNo;
	}
 
	@Override
	public void setScrapNo(final String scrapNo) {
		this.scrapNo = scrapNo; 
	}
 
	@Override
	public BigDecimal getItem() {
		return this.item;
	}
 
	@Override
	public void setItem(final BigDecimal item) {
		this.item = item; 
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
	public String getDescrip() {
		return this.descrip;
	}
 
	@Override
	public void setDescrip(final String descrip) {
		this.descrip = descrip; 
	}
 
	@Override
	public BigDecimal getQty() {
		return this.qty;
	}
 
	@Override
	public void setQty(final BigDecimal qty) {
		this.qty = qty; 
	}
 
	@Override
	public String getUnit() {
		return this.unit;
	}
 
	@Override
	public void setUnit(final String unit) {
		this.unit = unit; 
	}
 
	@Override
	public BigDecimal getUnitPrice() {
		return this.unitPrice;
	}
 
	@Override
	public void setUnitPrice(final BigDecimal unitPrice) {
		this.unitPrice = unitPrice; 
	}
 
	@Override
	public BigDecimal getValueAmt() {
		return this.valueAmt;
	}
 
	@Override
	public void setValueAmt(final BigDecimal valueAmt) {
		this.valueAmt = valueAmt; 
	}
 
	@Override
	public String getInPost() {
		return this.inPost;
	}
 
	@Override
	public void setInPost(final String inPost) {
		this.inPost = inPost; 
	}
 
	@Override
	public String getDeclNo() {
		return this.declNo;
	}
 
	@Override
	public void setDeclNo(final String declNo) {
		this.declNo = declNo; 
	}
 
}
