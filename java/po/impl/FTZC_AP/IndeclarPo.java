package com.doc.common.po.impl; 
 
public class IndeclarPo implements IIndeclarPo {
 
	public enum COLUMNS {
		MSG_FUN("異動別 9:新增 5:修改 1:刪除"), //
		BF_NO("監管編號"), //
		DECL_TYPE("報單類別"), //
		IO_TYPE("進出倉別"), //
		DOC_NO("文件編號"), //
		ITEM_NO("項次"), //
		PRDT_NO("料號"), //
		DESCRIP("貨名"), //
		QTY("數量"), //
		UNIT_PRICE("單價"), //
		VALUE_AMT("總價"), //
		NET_WGT("淨重"), //
		NET_WGT_UNIT("淨重單位"), //
		G_WGT("毛重"), //
		G_WGT_UNIT("毛重單位"), //
		DUTY_TYPE("納稅辦法(F2報單必需填寫)"), //
		STAT_MODE("統計方式"), //
		STATUS("處理狀態"), //
		CONTROL_NO("檔案名稱"), //
		UPD_TIME("接收時間"), //
		CTM_CODE("客戶代碼"), //
		UNIT("數量單位"), //
		CUR("幣別"), //
		TOT_WGT("貨物總重量"), //
		TOT_WGT_UNIT("重量單位"), //
		CCC_CODE("稅則號列"), //
		DECL_NO("報單號碼"), //
		MSG_TRUN("核銷記錄"), //
		DECL_DATE("申報日期"), //
		BOM_DATE("用料清表日期"), //
		O_DECL_NO("原報單號碼") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String msgFun;
	private String bfNo;
	private String declType;
	private String ioType;
	private String docNo;
	private BigDecimal itemNo;
	private String prdtNo;
	private String descrip;
	private BigDecimal qty;
	private BigDecimal unitPrice;
	private BigDecimal valueAmt;
	private BigDecimal netWgt;
	private String netWgtUnit;
	private BigDecimal gWgt;
	private String gWgtUnit;
	private String dutyType;
	private String statMode;
	private String status;
	private String controlNo;
	private String updTime;
	private String ctmCode;
	private String unit;
	private String cur;
	private BigDecimal totWgt;
	private String totWgtUnit;
	private String cccCode;
	private String declNo;
	private String msgTrun;
	private String declDate;
	private String bomDate;
	private String oDeclNo;

	@Override
	public String getMsgFun() {
		return this.msgFun;
	}
 
	@Override
	public void setMsgFun(final String msgFun) {
		this.msgFun = msgFun; 
	}
 
	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
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
	public String getIoType() {
		return this.ioType;
	}
 
	@Override
	public void setIoType(final String ioType) {
		this.ioType = ioType; 
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
	public BigDecimal getQty() {
		return this.qty;
	}
 
	@Override
	public void setQty(final BigDecimal qty) {
		this.qty = qty; 
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
	public BigDecimal getNetWgt() {
		return this.netWgt;
	}
 
	@Override
	public void setNetWgt(final BigDecimal netWgt) {
		this.netWgt = netWgt; 
	}
 
	@Override
	public String getNetWgtUnit() {
		return this.netWgtUnit;
	}
 
	@Override
	public void setNetWgtUnit(final String netWgtUnit) {
		this.netWgtUnit = netWgtUnit; 
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
	public String getGWgtUnit() {
		return this.gWgtUnit;
	}
 
	@Override
	public void setGWgtUnit(final String gWgtUnit) {
		this.gWgtUnit = gWgtUnit; 
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
	public String getStatus() {
		return this.status;
	}
 
	@Override
	public void setStatus(final String status) {
		this.status = status; 
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
	public String getUpdTime() {
		return this.updTime;
	}
 
	@Override
	public void setUpdTime(final String updTime) {
		this.updTime = updTime; 
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
	public String getUnit() {
		return this.unit;
	}
 
	@Override
	public void setUnit(final String unit) {
		this.unit = unit; 
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
	public BigDecimal getTotWgt() {
		return this.totWgt;
	}
 
	@Override
	public void setTotWgt(final BigDecimal totWgt) {
		this.totWgt = totWgt; 
	}
 
	@Override
	public String getTotWgtUnit() {
		return this.totWgtUnit;
	}
 
	@Override
	public void setTotWgtUnit(final String totWgtUnit) {
		this.totWgtUnit = totWgtUnit; 
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
	public String getDeclNo() {
		return this.declNo;
	}
 
	@Override
	public void setDeclNo(final String declNo) {
		this.declNo = declNo; 
	}
 
	@Override
	public String getMsgTrun() {
		return this.msgTrun;
	}
 
	@Override
	public void setMsgTrun(final String msgTrun) {
		this.msgTrun = msgTrun; 
	}
 
	@Override
	public String getDeclDate() {
		return this.declDate;
	}
 
	@Override
	public void setDeclDate(final String declDate) {
		this.declDate = declDate; 
	}
 
	@Override
	public String getBomDate() {
		return this.bomDate;
	}
 
	@Override
	public void setBomDate(final String bomDate) {
		this.bomDate = bomDate; 
	}
 
	@Override
	public String getODeclNo() {
		return this.oDeclNo;
	}
 
	@Override
	public void setODeclNo(final String oDeclNo) {
		this.oDeclNo = oDeclNo; 
	}
 
}
