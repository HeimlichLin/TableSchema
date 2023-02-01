package com.doc.common.po.impl; 
 
public class L4T2Po implements IL4T2Po {
 
	public enum COLUMNS {
		CONTROL_NO("上傳檔名"), //
		SERIAL_NO("上傳序號"), //
		SEQ_NO("資料序號"), //
		REF_BILL_NO("參考單號"), //
		ITEM("參考項次"), //
		PRDT_NO("料號"), //
		R_QTY("實際進出倉數量"), //
		R_UNIT("進出倉單位"), //
		R_POST("進出倉儲位"), //
		R_DATE("進出倉日期"), //
		BATCH_NO("批號"), //
		DECL_NO("報單號碼"), //
		DECL_TYPE("報單類別"), //
		ITEM_NO("報單項次"), //
		O_DECL_NO("原報單號碼"), //
		O_ITEM_NO("原報單項次"), //
		OP_TYPE("貨物性質 1:自用機器設備 2:營運貨物"), //
		CCC_CODE("稅則號列"), //
		TRADE_PRDT_NO("交易方料號"), //
		USER_ID("使用者代碼"), //
		UNIT_PRICE("單價"), //
		VALUE_AMT("完稅價格"), //
		DUTY_RATE("進口稅率"), //
		COMD_TAX_RATE("貨物稅率"), //
		DECL_QTY("申報數量"), //
		DUTY_TYPE("納稅辦法"), //
		STAT_MODE("統計方式"), //
		NET_WGT("淨重"), //
		GROSS("毛重"), //
		MAKE_PLACE("產地"), //
		CUR("幣別"), //
		SPEC("規格"), //
		MODEL("型號"), //
		NO_PKG("總件數"), //
		FTZ_NO("運送單號"), //
		BOM_NO("用料清表編號"), //
		L4_TIME("上傳時間"), //
		I_CONFIRMED("是否確認"), //
		DESCRIP("貨名"), //
		STR_TYPE("進出倉別 1:進 2:出"), //
		T1_SEQ_NO("T1資料序號"), //
		REMKS("修改原因"), //
		RPT_TYPE("null"), //
		OP_CONFIG("null"), //
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
 
	private String controlNo;
	private BigDecimal serialNo;
	private BigDecimal seqNo;
	private String refBillNo;
	private String item;
	private String prdtNo;
	private BigDecimal rQty;
	private String rUnit;
	private String rPost;
	private String rDate;
	private String batchNo;
	private String declNo;
	private String declType;
	private String itemNo;
	private String oDeclNo;
	private String oItemNo;
	private String opType;
	private String cccCode;
	private String tradePrdtNo;
	private String userId;
	private BigDecimal unitPrice;
	private String valueAmt;
	private BigDecimal dutyRate;
	private BigDecimal comdTaxRate;
	private BigDecimal declQty;
	private String dutyType;
	private String statMode;
	private BigDecimal netWgt;
	private BigDecimal gross;
	private String makePlace;
	private String cur;
	private String spec;
	private String model;
	private BigDecimal noPkg;
	private String ftzNo;
	private String bomNo;
	private java.sql.Timestamp l4Time;
	private String iConfirmed;
	private String descrip;
	private String strType;
	private BigDecimal t1SeqNo;
	private String remks;
	private String rptType;
	private String opConfig;
	private BigDecimal declSeqNo;

	@Override
	public String getControlNo() {
		return this.controlNo;
	}
 
	@Override
	public void setControlNo(final String controlNo) {
		this.controlNo = controlNo; 
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
	public BigDecimal getSeqNo() {
		return this.seqNo;
	}
 
	@Override
	public void setSeqNo(final BigDecimal seqNo) {
		this.seqNo = seqNo; 
	}
 
	@Override
	public String getRefBillNo() {
		return this.refBillNo;
	}
 
	@Override
	public void setRefBillNo(final String refBillNo) {
		this.refBillNo = refBillNo; 
	}
 
	@Override
	public String getItem() {
		return this.item;
	}
 
	@Override
	public void setItem(final String item) {
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
	public BigDecimal getRQty() {
		return this.rQty;
	}
 
	@Override
	public void setRQty(final BigDecimal rQty) {
		this.rQty = rQty; 
	}
 
	@Override
	public String getRUnit() {
		return this.rUnit;
	}
 
	@Override
	public void setRUnit(final String rUnit) {
		this.rUnit = rUnit; 
	}
 
	@Override
	public String getRPost() {
		return this.rPost;
	}
 
	@Override
	public void setRPost(final String rPost) {
		this.rPost = rPost; 
	}
 
	@Override
	public String getRDate() {
		return this.rDate;
	}
 
	@Override
	public void setRDate(final String rDate) {
		this.rDate = rDate; 
	}
 
	@Override
	public String getBatchNo() {
		return this.batchNo;
	}
 
	@Override
	public void setBatchNo(final String batchNo) {
		this.batchNo = batchNo; 
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
	public String getDeclType() {
		return this.declType;
	}
 
	@Override
	public void setDeclType(final String declType) {
		this.declType = declType; 
	}
 
	@Override
	public String getItemNo() {
		return this.itemNo;
	}
 
	@Override
	public void setItemNo(final String itemNo) {
		this.itemNo = itemNo; 
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
	public String getOItemNo() {
		return this.oItemNo;
	}
 
	@Override
	public void setOItemNo(final String oItemNo) {
		this.oItemNo = oItemNo; 
	}
 
	@Override
	public String getOpType() {
		return this.opType;
	}
 
	@Override
	public void setOpType(final String opType) {
		this.opType = opType; 
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
	public String getTradePrdtNo() {
		return this.tradePrdtNo;
	}
 
	@Override
	public void setTradePrdtNo(final String tradePrdtNo) {
		this.tradePrdtNo = tradePrdtNo; 
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
	public BigDecimal getUnitPrice() {
		return this.unitPrice;
	}
 
	@Override
	public void setUnitPrice(final BigDecimal unitPrice) {
		this.unitPrice = unitPrice; 
	}
 
	@Override
	public String getValueAmt() {
		return this.valueAmt;
	}
 
	@Override
	public void setValueAmt(final String valueAmt) {
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
	public BigDecimal getComdTaxRate() {
		return this.comdTaxRate;
	}
 
	@Override
	public void setComdTaxRate(final BigDecimal comdTaxRate) {
		this.comdTaxRate = comdTaxRate; 
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
	public BigDecimal getNetWgt() {
		return this.netWgt;
	}
 
	@Override
	public void setNetWgt(final BigDecimal netWgt) {
		this.netWgt = netWgt; 
	}
 
	@Override
	public BigDecimal getGross() {
		return this.gross;
	}
 
	@Override
	public void setGross(final BigDecimal gross) {
		this.gross = gross; 
	}
 
	@Override
	public String getMakePlace() {
		return this.makePlace;
	}
 
	@Override
	public void setMakePlace(final String makePlace) {
		this.makePlace = makePlace; 
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
	public String getSpec() {
		return this.spec;
	}
 
	@Override
	public void setSpec(final String spec) {
		this.spec = spec; 
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
	public BigDecimal getNoPkg() {
		return this.noPkg;
	}
 
	@Override
	public void setNoPkg(final BigDecimal noPkg) {
		this.noPkg = noPkg; 
	}
 
	@Override
	public String getFtzNo() {
		return this.ftzNo;
	}
 
	@Override
	public void setFtzNo(final String ftzNo) {
		this.ftzNo = ftzNo; 
	}
 
	@Override
	public String getBomNo() {
		return this.bomNo;
	}
 
	@Override
	public void setBomNo(final String bomNo) {
		this.bomNo = bomNo; 
	}
 
	@Override
	public java.sql.Timestamp getL4Time() {
		return this.l4Time;
	}
 
	@Override
	public void setL4Time(final java.sql.Timestamp l4Time) {
		this.l4Time = l4Time; 
	}
 
	@Override
	public String getIConfirmed() {
		return this.iConfirmed;
	}
 
	@Override
	public void setIConfirmed(final String iConfirmed) {
		this.iConfirmed = iConfirmed; 
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
	public String getStrType() {
		return this.strType;
	}
 
	@Override
	public void setStrType(final String strType) {
		this.strType = strType; 
	}
 
	@Override
	public BigDecimal getT1SeqNo() {
		return this.t1SeqNo;
	}
 
	@Override
	public void setT1SeqNo(final BigDecimal t1SeqNo) {
		this.t1SeqNo = t1SeqNo; 
	}
 
	@Override
	public String getRemks() {
		return this.remks;
	}
 
	@Override
	public void setRemks(final String remks) {
		this.remks = remks; 
	}
 
	@Override
	public String getRptType() {
		return this.rptType;
	}
 
	@Override
	public void setRptType(final String rptType) {
		this.rptType = rptType; 
	}
 
	@Override
	public String getOpConfig() {
		return this.opConfig;
	}
 
	@Override
	public void setOpConfig(final String opConfig) {
		this.opConfig = opConfig; 
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
