package com.doc.common.po.impl; 
 
public class HistorycloudgcoPo implements IHistorycloudgcoPo {
 
	public enum COLUMNS {
		SN("流水編號"), //
		IE("進出口別"), //
		WORKAREA("倉棧代碼"), //
		MWB("主號"), //
		HWB("分號/袋號"), //
		GCODATE("實際出倉時間"), //
		RESULT_CODE("回覆代碼"), //
		RESULT_MSG("回覆說明"), //
		EXTRA_CONDITION("放行附帶條件"), //
		SEND_STATUS("傳送狀態(Null-未傳送, 0-傳送中, 1-傳送成功,  9-傳送異常)"), //
		SEND_QTY("傳送次數 < 10"), //
		DECL_NO("報單號碼"), //
		CONTAINER("盤櫃號碼"), //
		FLIGHTNO("航機班次"), //
		FLIGHTDEST("航班目的地"), //
		CHWS("驗關機台"), //
		GCOSN("紀錄拆袋出倉順"), //
		GCOWS("出倉工作站台ID"), //
		CUSTOMSID("查驗關員ID"), //
		WORKSTATION("null"), //
		IS_READ("避免重複讀取資料(Null-尚未出倉, 1-出倉成功, 9-出倉處理異常)"), //
		CUSTOMSGCODATE("海關受理出倉時間 yyyymmddhhmmssms (24小時)"), //
		USERID("作業人員 ID"), //
		CRT_DATE("寫入時間"), //
		UPT_DT("更新日期") //
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
