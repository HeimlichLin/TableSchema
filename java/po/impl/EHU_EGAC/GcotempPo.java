package com.doc.common.po.impl; 
 
public class GcotempPo implements IGcotempPo {
 
	public enum COLUMNS {
		SN("流水編號"), //
		IE("進出口別"), //
		WORKAREA("null"), //
		HWB("分號/袋號"), //
		GCODATE("海關受理出倉時間 yyyymmddhhmmssms (24小時)"), //
		USERID("作業人員 ID"), //
		RESULT_CODE("回覆代碼"), //
		RESULT_MSG("回覆說明"), //
		DECL_NO("報單號碼"), //
		EXTRA_CONDITION("放行附帶條件"), //
		CONTAINER("盤櫃號碼"), //
		FLIGHTNO("航機班次"), //
		FLIGHTDEST("航班目的地"), //
		SEND_STATUS("傳送狀態(Null-未傳送, 0-傳送中, 1-傳送成功,  9-傳送異常)"), //
		SEND_QTY("傳送次數 < 10"), //
		CHWS("驗關機台"), //
		MWB("主號"), //
		IS_READ("避免重複讀取資料"), //
		UPT_DT("null"), //
		CRT_DATE("null"), //
		IS_MIGRATION("null"), //
		CUSTOMSID("null"), //
		GCOWS("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal sn;
	private String ie;
	private String workarea;
	private String hwb;
	private String gcodate;
	private String userid;
	private String resultCode;
	private String resultMsg;
	private String declNo;
	private String extraCondition;
	private String container;
	private String flightno;
	private String flightdest;
	private String sendStatus;
	private BigDecimal sendQty;
	private String chws;
	private String mwb;
	private String isRead;
	private java.sql.Timestamp uptDt;
	private java.sql.Timestamp crtDate;
	private String isMigration;
	private String customsid;
	private String gcows;

	@Override
	public BigDecimal getSn() {
		return this.sn;
	}
 
	@Override
	public void setSn(final BigDecimal sn) {
		this.sn = sn; 
	}
 
	@Override
	public String getIe() {
		return this.ie;
	}
 
	@Override
	public void setIe(final String ie) {
		this.ie = ie; 
	}
 
	@Override
	public String getWorkarea() {
		return this.workarea;
	}
 
	@Override
	public void setWorkarea(final String workarea) {
		this.workarea = workarea; 
	}
 
	@Override
	public String getHwb() {
		return this.hwb;
	}
 
	@Override
	public void setHwb(final String hwb) {
		this.hwb = hwb; 
	}
 
	@Override
	public String getGcodate() {
		return this.gcodate;
	}
 
	@Override
	public void setGcodate(final String gcodate) {
		this.gcodate = gcodate; 
	}
 
	@Override
	public String getUserid() {
		return this.userid;
	}
 
	@Override
	public void setUserid(final String userid) {
		this.userid = userid; 
	}
 
	@Override
	public String getResultCode() {
		return this.resultCode;
	}
 
	@Override
	public void setResultCode(final String resultCode) {
		this.resultCode = resultCode; 
	}
 
	@Override
	public String getResultMsg() {
		return this.resultMsg;
	}
 
	@Override
	public void setResultMsg(final String resultMsg) {
		this.resultMsg = resultMsg; 
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
	public String getExtraCondition() {
		return this.extraCondition;
	}
 
	@Override
	public void setExtraCondition(final String extraCondition) {
		this.extraCondition = extraCondition; 
	}
 
	@Override
	public String getContainer() {
		return this.container;
	}
 
	@Override
	public void setContainer(final String container) {
		this.container = container; 
	}
 
	@Override
	public String getFlightno() {
		return this.flightno;
	}
 
	@Override
	public void setFlightno(final String flightno) {
		this.flightno = flightno; 
	}
 
	@Override
	public String getFlightdest() {
		return this.flightdest;
	}
 
	@Override
	public void setFlightdest(final String flightdest) {
		this.flightdest = flightdest; 
	}
 
	@Override
	public String getSendStatus() {
		return this.sendStatus;
	}
 
	@Override
	public void setSendStatus(final String sendStatus) {
		this.sendStatus = sendStatus; 
	}
 
	@Override
	public BigDecimal getSendQty() {
		return this.sendQty;
	}
 
	@Override
	public void setSendQty(final BigDecimal sendQty) {
		this.sendQty = sendQty; 
	}
 
	@Override
	public String getChws() {
		return this.chws;
	}
 
	@Override
	public void setChws(final String chws) {
		this.chws = chws; 
	}
 
	@Override
	public String getMwb() {
		return this.mwb;
	}
 
	@Override
	public void setMwb(final String mwb) {
		this.mwb = mwb; 
	}
 
	@Override
	public String getIsRead() {
		return this.isRead;
	}
 
	@Override
	public void setIsRead(final String isRead) {
		this.isRead = isRead; 
	}
 
	@Override
	public java.sql.Timestamp getUptDt() {
		return this.uptDt;
	}
 
	@Override
	public void setUptDt(final java.sql.Timestamp uptDt) {
		this.uptDt = uptDt; 
	}
 
	@Override
	public java.sql.Timestamp getCrtDate() {
		return this.crtDate;
	}
 
	@Override
	public void setCrtDate(final java.sql.Timestamp crtDate) {
		this.crtDate = crtDate; 
	}
 
	@Override
	public String getIsMigration() {
		return this.isMigration;
	}
 
	@Override
	public void setIsMigration(final String isMigration) {
		this.isMigration = isMigration; 
	}
 
	@Override
	public String getCustomsid() {
		return this.customsid;
	}
 
	@Override
	public void setCustomsid(final String customsid) {
		this.customsid = customsid; 
	}
 
	@Override
	public String getGcows() {
		return this.gcows;
	}
 
	@Override
	public void setGcows(final String gcows) {
		this.gcows = gcows; 
	}
 
}
