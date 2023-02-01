package com.doc.common.po.impl; 
 
public class WorkCloudReportLogPo implements IWorkCloudReportLogPo {
 
	public enum COLUMNS {
		IE("進出口別 I/E"), //
		WH_IO("呼叫進出倉別 IN /OUT"), //
		SN("序號"), //
		LOGDATE("測試日期"), //
		MWB("主號"), //
		HWB("分號 / 併袋號碼"), //
		EHUSTARTTIME("刷碼電腦登錄時間"), //
		RDWEIGHTSTARTTIME("讀取磅秤開始時間"), //
		RDWEIGHTENDTIME("讀取磅秤結束時間"), //
		SIGNSTARTTIME("開始進行加簽驗簽時間"), //
		SENDWSTIME("發送雲端資訊時間"), //
		RECEIVEWSTIME("收到雲端回覆時間"), //
		READDBTIME("讀取 DB 時間"), //
		PRNBARCODESTIME("條碼列印開始時間"), //
		PRNBARCODEETIME("條碼列印結束時間"), //
		EHUCLOSETIME("單筆完成作業時間"), //
		CLEARANCETYPE("通關方式"), //
		REPLYTYPE("回訊(Y/N)"), //
		CRT_DATE("null"), //
		PRNLABLESTIME("標籤產出開始時間"), //
		PRNLABLEETIME("標籤產出結束時間"), //
		PRNCHKCOMSTIME("產出標籤前判斷COM開始時間"), //
		PRNCHKCOMETIME("產出標籤前判斷COM結束時間") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String ie;
	private String whIo;
	private BigDecimal sn;
	private String logdate;
	private String mwb;
	private String hwb;
	private String ehustarttime;
	private String rdweightstarttime;
	private String rdweightendtime;
	private String signstarttime;
	private String sendwstime;
	private String receivewstime;
	private String readdbtime;
	private String prnbarcodestime;
	private String prnbarcodeetime;
	private String ehuclosetime;
	private String clearancetype;
	private String replytype;
	private java.sql.Timestamp crtDate;
	private String prnlablestime;
	private String prnlableetime;
	private String prnchkcomstime;
	private String prnchkcometime;

	@Override
	public String getIe() {
		return this.ie;
	}
 
	@Override
	public void setIe(final String ie) {
		this.ie = ie; 
	}
 
	@Override
	public String getWhIo() {
		return this.whIo;
	}
 
	@Override
	public void setWhIo(final String whIo) {
		this.whIo = whIo; 
	}
 
	@Override
	public BigDecimal getSn() {
		return this.sn;
	}
 
	@Override
	public void setSn(final BigDecimal sn) {
		this.sn = sn; 
	}
 
	@Override
	public String getLogdate() {
		return this.logdate;
	}
 
	@Override
	public void setLogdate(final String logdate) {
		this.logdate = logdate; 
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
	public String getEhustarttime() {
		return this.ehustarttime;
	}
 
	@Override
	public void setEhustarttime(final String ehustarttime) {
		this.ehustarttime = ehustarttime; 
	}
 
	@Override
	public String getRdweightstarttime() {
		return this.rdweightstarttime;
	}
 
	@Override
	public void setRdweightstarttime(final String rdweightstarttime) {
		this.rdweightstarttime = rdweightstarttime; 
	}
 
	@Override
	public String getRdweightendtime() {
		return this.rdweightendtime;
	}
 
	@Override
	public void setRdweightendtime(final String rdweightendtime) {
		this.rdweightendtime = rdweightendtime; 
	}
 
	@Override
	public String getSignstarttime() {
		return this.signstarttime;
	}
 
	@Override
	public void setSignstarttime(final String signstarttime) {
		this.signstarttime = signstarttime; 
	}
 
	@Override
	public String getSendwstime() {
		return this.sendwstime;
	}
 
	@Override
	public void setSendwstime(final String sendwstime) {
		this.sendwstime = sendwstime; 
	}
 
	@Override
	public String getReceivewstime() {
		return this.receivewstime;
	}
 
	@Override
	public void setReceivewstime(final String receivewstime) {
		this.receivewstime = receivewstime; 
	}
 
	@Override
	public String getReaddbtime() {
		return this.readdbtime;
	}
 
	@Override
	public void setReaddbtime(final String readdbtime) {
		this.readdbtime = readdbtime; 
	}
 
	@Override
	public String getPrnbarcodestime() {
		return this.prnbarcodestime;
	}
 
	@Override
	public void setPrnbarcodestime(final String prnbarcodestime) {
		this.prnbarcodestime = prnbarcodestime; 
	}
 
	@Override
	public String getPrnbarcodeetime() {
		return this.prnbarcodeetime;
	}
 
	@Override
	public void setPrnbarcodeetime(final String prnbarcodeetime) {
		this.prnbarcodeetime = prnbarcodeetime; 
	}
 
	@Override
	public String getEhuclosetime() {
		return this.ehuclosetime;
	}
 
	@Override
	public void setEhuclosetime(final String ehuclosetime) {
		this.ehuclosetime = ehuclosetime; 
	}
 
	@Override
	public String getClearancetype() {
		return this.clearancetype;
	}
 
	@Override
	public void setClearancetype(final String clearancetype) {
		this.clearancetype = clearancetype; 
	}
 
	@Override
	public String getReplytype() {
		return this.replytype;
	}
 
	@Override
	public void setReplytype(final String replytype) {
		this.replytype = replytype; 
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
	public String getPrnlablestime() {
		return this.prnlablestime;
	}
 
	@Override
	public void setPrnlablestime(final String prnlablestime) {
		this.prnlablestime = prnlablestime; 
	}
 
	@Override
	public String getPrnlableetime() {
		return this.prnlableetime;
	}
 
	@Override
	public void setPrnlableetime(final String prnlableetime) {
		this.prnlableetime = prnlableetime; 
	}
 
	@Override
	public String getPrnchkcomstime() {
		return this.prnchkcomstime;
	}
 
	@Override
	public void setPrnchkcomstime(final String prnchkcomstime) {
		this.prnchkcomstime = prnchkcomstime; 
	}
 
	@Override
	public String getPrnchkcometime() {
		return this.prnchkcometime;
	}
 
	@Override
	public void setPrnchkcometime(final String prnchkcometime) {
		this.prnchkcometime = prnchkcometime; 
	}
 
}
