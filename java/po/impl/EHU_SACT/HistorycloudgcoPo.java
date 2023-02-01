package com.doc.common.po.impl; 
 
public class HistorycloudgcoPo implements IHistorycloudgcoPo {
 
	public enum COLUMNS {
		SN("????"), //
		IE("????"), //
		WORKAREA("????"), //
		MWB("??"), //
		HWB("??/??"), //
		GCODATE("??????"), //
		RESULT_CODE("????"), //
		RESULT_MSG("????"), //
		EXTRA_CONDITION("??????"), //
		SEND_STATUS("????(Null-???, 0-???, 1-????,  9-????)"), //
		SEND_QTY("???? < 10"), //
		DECL_NO("????"), //
		CONTAINER("????"), //
		FLIGHTNO("????"), //
		FLIGHTDEST("?????"), //
		CHWS("????"), //
		GCOSN("???????"), //
		GCOWS("??????ID"), //
		CUSTOMSID("????ID"), //
		WORKSTATION("null"), //
		IS_READ("????????(Null-????, 1-????, 9-??????)"), //
		CUSTOMSGCODATE("???????? yyyymmddhhmmssms (24??)"), //
		USERID("???? ID"), //
		CRT_DATE("????"), //
		UPT_DT("????") //
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
	private String mwb;
	private String hwb;
	private java.sql.Timestamp gcodate;
	private String resultCode;
	private String resultMsg;
	private String extraCondition;
	private String sendStatus;
	private BigDecimal sendQty;
	private String declNo;
	private String container;
	private String flightno;
	private String flightdest;
	private String chws;
	private BigDecimal gcosn;
	private String gcows;
	private String customsid;
	private String workstation;
	private String isRead;
	private String customsgcodate;
	private String userid;
	private java.sql.Timestamp crtDate;
	private java.sql.Timestamp uptDt;

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
	public String getMwb() {
		return this.mwb;
	}
 
	@Override
	public void setMwb(final String mwb) {
		this.mwb = mwb; 
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
	public java.sql.Timestamp getGcodate() {
		return this.gcodate;
	}
 
	@Override
	public void setGcodate(final java.sql.Timestamp gcodate) {
		this.gcodate = gcodate; 
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
	public String getExtraCondition() {
		return this.extraCondition;
	}
 
	@Override
	public void setExtraCondition(final String extraCondition) {
		this.extraCondition = extraCondition; 
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
	public String getDeclNo() {
		return this.declNo;
	}
 
	@Override
	public void setDeclNo(final String declNo) {
		this.declNo = declNo; 
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
	public String getChws() {
		return this.chws;
	}
 
	@Override
	public void setChws(final String chws) {
		this.chws = chws; 
	}
 
	@Override
	public BigDecimal getGcosn() {
		return this.gcosn;
	}
 
	@Override
	public void setGcosn(final BigDecimal gcosn) {
		this.gcosn = gcosn; 
	}
 
	@Override
	public String getGcows() {
		return this.gcows;
	}
 
	@Override
	public void setGcows(final String gcows) {
		this.gcows = gcows; 
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
	public String getWorkstation() {
		return this.workstation;
	}
 
	@Override
	public void setWorkstation(final String workstation) {
		this.workstation = workstation; 
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
	public String getCustomsgcodate() {
		return this.customsgcodate;
	}
 
	@Override
	public void setCustomsgcodate(final String customsgcodate) {
		this.customsgcodate = customsgcodate; 
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
	public java.sql.Timestamp getCrtDate() {
		return this.crtDate;
	}
 
	@Override
	public void setCrtDate(final java.sql.Timestamp crtDate) {
		this.crtDate = crtDate; 
	}
 
	@Override
	public java.sql.Timestamp getUptDt() {
		return this.uptDt;
	}
 
	@Override
	public void setUptDt(final java.sql.Timestamp uptDt) {
		this.uptDt = uptDt; 
	}
 
}
