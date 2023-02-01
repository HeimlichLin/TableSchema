package com.doc.common.po.impl; 
 
public class TlF2dataLogPo implements ITlF2dataLogPo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		CONTROL_NO("檔名"), //
		INVOICE_NO("發票號碼"), //
		SERIAL_NO("序號"), //
		COMMODITY_NO("客戶料號（品番）"), //
		CUSTOMS_COMMODITY_NO("通關料號"), //
		QTY("出倉數量"), //
		R_F2DATA_CNT("f2data筆數"), //
		R_TEMP_DECL_NO("暫定報單號碼"), //
		TEMP_DECL_HEAD("null"), //
		ITEM_CNT("項次計數"), //
		CNT("null"), //
		NEWBALANCE("核銷後的新庫存"), //
		ERRMSG("null"), //
		IN_ITEM_NO("庫存項次"), //
		GBALANCE("計算庫存量"), //
		OSTATUS("null"), //
		OLAST_QTY("剩餘出倉量"), //
		ICURRENT_QTY("原始庫存量"), //
		LOG_TIME("null") //
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
	private String controlNo;
	private String invoiceNo;
	private BigDecimal serialNo;
	private String commodityNo;
	private String customsCommodityNo;
	private BigDecimal qty;
	private BigDecimal rF2dataCnt;
	private String rTempDeclNo;
	private String tempDeclHead;
	private BigDecimal itemCnt;
	private String cnt;
	private BigDecimal newbalance;
	private String errmsg;
	private BigDecimal inItemNo;
	private BigDecimal gbalance;
	private String ostatus;
	private BigDecimal olastQty;
	private BigDecimal icurrentQty;
	private String logTime;

	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
	}
 
	@Override
	public String getControlNo() {
		return this.controlNo;
	}
 
	@Override
	public void setControlNo(final String controlNo) {
		this.controlNo = controlNo; 
	}
 
	@Override
	public String getInvoiceNo() {
		return this.invoiceNo;
	}
 
	@Override
	public void setInvoiceNo(final String invoiceNo) {
		this.invoiceNo = invoiceNo; 
	}
 
	@Override
	public BigDecimal getSerialNo() {
		return this.serialNo;
	}
 
	@Override
	public void setSerialNo(final BigDecimal serialNo) {
		this.serialNo = serialNo; 
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
	public String getCustomsCommodityNo() {
		return this.customsCommodityNo;
	}
 
	@Override
	public void setCustomsCommodityNo(final String customsCommodityNo) {
		this.customsCommodityNo = customsCommodityNo; 
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
	public BigDecimal getRF2dataCnt() {
		return this.rF2dataCnt;
	}
 
	@Override
	public void setRF2dataCnt(final BigDecimal rF2dataCnt) {
		this.rF2dataCnt = rF2dataCnt; 
	}
 
	@Override
	public String getRTempDeclNo() {
		return this.rTempDeclNo;
	}
 
	@Override
	public void setRTempDeclNo(final String rTempDeclNo) {
		this.rTempDeclNo = rTempDeclNo; 
	}
 
	@Override
	public String getTempDeclHead() {
		return this.tempDeclHead;
	}
 
	@Override
	public void setTempDeclHead(final String tempDeclHead) {
		this.tempDeclHead = tempDeclHead; 
	}
 
	@Override
	public BigDecimal getItemCnt() {
		return this.itemCnt;
	}
 
	@Override
	public void setItemCnt(final BigDecimal itemCnt) {
		this.itemCnt = itemCnt; 
	}
 
	@Override
	public String getCnt() {
		return this.cnt;
	}
 
	@Override
	public void setCnt(final String cnt) {
		this.cnt = cnt; 
	}
 
	@Override
	public BigDecimal getNewbalance() {
		return this.newbalance;
	}
 
	@Override
	public void setNewbalance(final BigDecimal newbalance) {
		this.newbalance = newbalance; 
	}
 
	@Override
	public String getErrmsg() {
		return this.errmsg;
	}
 
	@Override
	public void setErrmsg(final String errmsg) {
		this.errmsg = errmsg; 
	}
 
	@Override
	public BigDecimal getInItemNo() {
		return this.inItemNo;
	}
 
	@Override
	public void setInItemNo(final BigDecimal inItemNo) {
		this.inItemNo = inItemNo; 
	}
 
	@Override
	public BigDecimal getGbalance() {
		return this.gbalance;
	}
 
	@Override
	public void setGbalance(final BigDecimal gbalance) {
		this.gbalance = gbalance; 
	}
 
	@Override
	public String getOstatus() {
		return this.ostatus;
	}
 
	@Override
	public void setOstatus(final String ostatus) {
		this.ostatus = ostatus; 
	}
 
	@Override
	public BigDecimal getOlastQty() {
		return this.olastQty;
	}
 
	@Override
	public void setOlastQty(final BigDecimal olastQty) {
		this.olastQty = olastQty; 
	}
 
	@Override
	public BigDecimal getIcurrentQty() {
		return this.icurrentQty;
	}
 
	@Override
	public void setIcurrentQty(final BigDecimal icurrentQty) {
		this.icurrentQty = icurrentQty; 
	}
 
	@Override
	public String getLogTime() {
		return this.logTime;
	}
 
	@Override
	public void setLogTime(final String logTime) {
		this.logTime = logTime; 
	}
 
}
