package com.doc.common.po.impl; 
 
public class GrntitemPo implements IGrntitemPo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		REFBILLNO("參考單號"), //
		DECL_NO("報單號碼"), //
		ITEM_NO("項次"), //
		STRPOST("儲位"), //
		DECL_TYPE("報單類別"), //
		STR_TYPE("進出倉別"), //
		STR_DATE("進出倉日期"), //
		STR_QTY("進出倉數量"), //
		VALUE_AMT("完稅價格"), //
		DUTY_RATE("進口稅率"), //
		AVLGRNT_AMT("null"), //
		ORIG_DECL_NO("原報單號碼"), //
		PRDT_NO("料號"), //
		SERIAL_NO("null"), //
		RMKS("null"), //
		COMDTAX_RATE("貨物稅率"), //
		VATAX_RATE("營業稅率"), //
		DECL_QTY("報單數量"), //
		TAX_AMT("稅金總額"), //
		ISEVAL("null"), //
		ORIG_ITEMNO("原報單項次"), //
		CCC_CODE("稅則號列"), //
		ITEM("null") //
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
	private String refbillno;
	private String declNo;
	private BigDecimal itemNo;
	private String strpost;
	private String declType;
	private String strType;
	private String strDate;
	private BigDecimal strQty;
	private BigDecimal valueAmt;
	private BigDecimal dutyRate;
	private BigDecimal avlgrntAmt;
	private String origDeclNo;
	private String prdtNo;
	private String serialNo;
	private String rmks;
	private BigDecimal comdtaxRate;
	private BigDecimal vataxRate;
	private BigDecimal declQty;
	private BigDecimal taxAmt;
	private String iseval;
	private BigDecimal origItemno;
	private String cccCode;
	private BigDecimal item;

	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
	}
 
	@Override
	public String getRefbillno() {
		return this.refbillno;
	}
 
	@Override
	public void setRefbillno(final String refbillno) {
		this.refbillno = refbillno; 
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
	public String getStrpost() {
		return this.strpost;
	}
 
	@Override
	public void setStrpost(final String strpost) {
		this.strpost = strpost; 
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
	public String getStrType() {
		return this.strType;
	}
 
	@Override
	public void setStrType(final String strType) {
		this.strType = strType; 
	}
 
	@Override
	public String getStrDate() {
		return this.strDate;
	}
 
	@Override
	public void setStrDate(final String strDate) {
		this.strDate = strDate; 
	}
 
	@Override
	public BigDecimal getStrQty() {
		return this.strQty;
	}
 
	@Override
	public void setStrQty(final BigDecimal strQty) {
		this.strQty = strQty; 
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
	public BigDecimal getDutyRate() {
		return this.dutyRate;
	}
 
	@Override
	public void setDutyRate(final BigDecimal dutyRate) {
		this.dutyRate = dutyRate; 
	}
 
	@Override
	public BigDecimal getAvlgrntAmt() {
		return this.avlgrntAmt;
	}
 
	@Override
	public void setAvlgrntAmt(final BigDecimal avlgrntAmt) {
		this.avlgrntAmt = avlgrntAmt; 
	}
 
	@Override
	public String getOrigDeclNo() {
		return this.origDeclNo;
	}
 
	@Override
	public void setOrigDeclNo(final String origDeclNo) {
		this.origDeclNo = origDeclNo; 
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
	public String getSerialNo() {
		return this.serialNo;
	}
 
	@Override
	public void setSerialNo(final String serialNo) {
		this.serialNo = serialNo; 
	}
 
	@Override
	public String getRmks() {
		return this.rmks;
	}
 
	@Override
	public void setRmks(final String rmks) {
		this.rmks = rmks; 
	}
 
	@Override
	public BigDecimal getComdtaxRate() {
		return this.comdtaxRate;
	}
 
	@Override
	public void setComdtaxRate(final BigDecimal comdtaxRate) {
		this.comdtaxRate = comdtaxRate; 
	}
 
	@Override
	public BigDecimal getVataxRate() {
		return this.vataxRate;
	}
 
	@Override
	public void setVataxRate(final BigDecimal vataxRate) {
		this.vataxRate = vataxRate; 
	}
 
	@Override
	public BigDecimal getDeclQty() {
		return this.declQty;
	}
 
	@Override
	public void setDeclQty(final BigDecimal declQty) {
		this.declQty = declQty; 
	}
 
	@Override
	public BigDecimal getTaxAmt() {
		return this.taxAmt;
	}
 
	@Override
	public void setTaxAmt(final BigDecimal taxAmt) {
		this.taxAmt = taxAmt; 
	}
 
	@Override
	public String getIseval() {
		return this.iseval;
	}
 
	@Override
	public void setIseval(final String iseval) {
		this.iseval = iseval; 
	}
 
	@Override
	public BigDecimal getOrigItemno() {
		return this.origItemno;
	}
 
	@Override
	public void setOrigItemno(final BigDecimal origItemno) {
		this.origItemno = origItemno; 
	}
 
	@Override
	public String getCccCode() {
		return this.cccCode;
	}
 
	@Override
	public void setCccCode(final String cccCode) {
		this.cccCode = cccCode; 
	}
 
	@Override
	public BigDecimal getItem() {
		return this.item;
	}
 
	@Override
	public void setItem(final BigDecimal item) {
		this.item = item; 
	}
 
}
