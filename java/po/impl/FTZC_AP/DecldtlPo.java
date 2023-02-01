package com.doc.common.po.impl; 
 
public class DecldtlPo implements IDecldtlPo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		DECL_NO("報單號碼"), //
		ITEM_NO("項次"), //
		PRDT_NO("料號"), //
		DESCRIP("貨名"), //
		BRAND("廠牌"), //
		MODEL("型號"), //
		SPEC("規格"), //
		NET_WGT("淨重"), //
		QTY("數量"), //
		UNIT("單位"), //
		UNIT_PRICE("單價"), //
		CUR("幣別"), //
		VALUE_AMT("完稅價格"), //
		VALUE_QTY("完稅數量"), //
		DUTY_RATE("進口稅率"), //
		UNIT_DUTY("單位稅額"), //
		O_DECL_NO("原報單號碼"), //
		O_ITEM_NO("原報單項次"), //
		CCC_CODE("稅則號列"), //
		COMD_TAX_RATE("B10貨物稅"), //
		STR_TYPE("進出倉別 1:進 2:出"), //
		DUTY_TYPE("納稅辦法"), //
		STAT_MODE("統計方式"), //
		G_WGT("毛重"), //
		PROD_COUNTRY("生產國別"), //
		OFF_LINE_DATE("null"), //
		USER_ID("null"), //
		TRANS_ID("資料來源提供的識別碼,唯一,不得修改"), //
		MSG_TYPE("null"), //
		DECL_SEQ_NO("報單序號(5205使用)") //
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
	private String prdtNo;
	private String descrip;
	private String brand;
	private String model;
	private String spec;
	private BigDecimal netWgt;
	private BigDecimal qty;
	private String unit;
	private BigDecimal unitPrice;
	private String cur;
	private BigDecimal valueAmt;
	private BigDecimal valueQty;
	private BigDecimal dutyRate;
	private BigDecimal unitDuty;
	private String oDeclNo;
	private BigDecimal oItemNo;
	private String cccCode;
	private BigDecimal comdTaxRate;
	private String strType;
	private String dutyType;
	private String statMode;
	private BigDecimal gWgt;
	private String prodCountry;
	private String offLineDate;
	private String userId;
	private String transId;
	private String msgType;
	private BigDecimal declSeqNo;

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
	public String getBrand() {
		return this.brand;
	}
 
	@Override
	public void setBrand(final String brand) {
		this.brand = brand; 
	}
 
	@Override
	public String getModel() {
		return this.model;
	}
 
	@Override
	public void setModel(final String model) {
		this.model = model; 
	}
 
	@Override
	public String getSpec() {
		return this.spec;
	}
 
	@Override
	public void setSpec(final String spec) {
		this.spec = spec; 
	}
 
	@Override
	public BigDecimal getNetWgt() {
		return this.netWgt;
	}
 
	@Override
	public void setNetWgt(final BigDecimal netWgt) {
		this.netWgt = netWgt; 
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
	public String getCur() {
		return this.cur;
	}
 
	@Override
	public void setCur(final String cur) {
		this.cur = cur; 
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
	public BigDecimal getValueQty() {
		return this.valueQty;
	}
 
	@Override
	public void setValueQty(final BigDecimal valueQty) {
		this.valueQty = valueQty; 
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
	public BigDecimal getUnitDuty() {
		return this.unitDuty;
	}
 
	@Override
	public void setUnitDuty(final BigDecimal unitDuty) {
		this.unitDuty = unitDuty; 
	}
 
	@Override
	public String getODeclNo() {
		return this.oDeclNo;
	}
 
	@Override
	public void setODeclNo(final String oDeclNo) {
		this.oDeclNo = oDeclNo; 
	}
 
	@Override
	public BigDecimal getOItemNo() {
		return this.oItemNo;
	}
 
	@Override
	public void setOItemNo(final BigDecimal oItemNo) {
		this.oItemNo = oItemNo; 
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
	public BigDecimal getComdTaxRate() {
		return this.comdTaxRate;
	}
 
	@Override
	public void setComdTaxRate(final BigDecimal comdTaxRate) {
		this.comdTaxRate = comdTaxRate; 
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
	public BigDecimal getGWgt() {
		return this.gWgt;
	}
 
	@Override
	public void setGWgt(final BigDecimal gWgt) {
		this.gWgt = gWgt; 
	}
 
	@Override
	public String getProdCountry() {
		return this.prodCountry;
	}
 
	@Override
	public void setProdCountry(final String prodCountry) {
		this.prodCountry = prodCountry; 
	}
 
	@Override
	public String getOffLineDate() {
		return this.offLineDate;
	}
 
	@Override
	public void setOffLineDate(final String offLineDate) {
		this.offLineDate = offLineDate; 
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
	public String getTransId() {
		return this.transId;
	}
 
	@Override
	public void setTransId(final String transId) {
		this.transId = transId; 
	}
 
	@Override
	public String getMsgType() {
		return this.msgType;
	}
 
	@Override
	public void setMsgType(final String msgType) {
		this.msgType = msgType; 
	}
 
	@Override
	public BigDecimal getDeclSeqNo() {
		return this.declSeqNo;
	}
 
	@Override
	public void setDeclSeqNo(final BigDecimal declSeqNo) {
		this.declSeqNo = declSeqNo; 
	}
 
}
