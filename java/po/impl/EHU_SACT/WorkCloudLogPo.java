package com.doc.common.po.impl; 
 
public class WorkCloudLogPo implements IWorkCloudLogPo {
 
	public enum COLUMNS {
		IE("???? I/E"), //
		WH_IO("?????? IN /OUT"), //
		SN("null"), //
		LOG_DATE("Log ????"), //
		HWB_BAG("?? / ????"), //
		MWB("??"), //
		LOG_TYPE("Log ??"), //
		LOG_STATUS("LOG ??(??/??)"), //
		LOG_NOTE1("Log  ????1"), //
		LOG_NOTE2("Log  ????2"), //
		CRT_DATE("null") //
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
	private String logDate;
	private String hwbBag;
	private String mwb;
	private String logType;
	private String logStatus;
	private String logNote1;
	private String logNote2;
	private java.sql.Timestamp crtDate;

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
	public String getLogDate() {
		return this.logDate;
	}
 
	@Override
	public void setLogDate(final String logDate) {
		this.logDate = logDate; 
	}
 
	@Override
	public String getHwbBag() {
		return this.hwbBag;
	}
 
	@Override
	public void setHwbBag(final String hwbBag) {
		this.hwbBag = hwbBag; 
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
	public String getLogType() {
		return this.logType;
	}
 
	@Override
	public void setLogType(final String logType) {
		this.logType = logType; 
	}
 
	@Override
	public String getLogStatus() {
		return this.logStatus;
	}
 
	@Override
	public void setLogStatus(final String logStatus) {
		this.logStatus = logStatus; 
	}
 
	@Override
	public String getLogNote1() {
		return this.logNote1;
	}
 
	@Override
	public void setLogNote1(final String logNote1) {
		this.logNote1 = logNote1; 
	}
 
	@Override
	public String getLogNote2() {
		return this.logNote2;
	}
 
	@Override
	public void setLogNote2(final String logNote2) {
		this.logNote2 = logNote2; 
	}
 
	@Override
	public java.sql.Timestamp getCrtDate() {
		return this.crtDate;
	}
 
	@Override
	public void setCrtDate(final java.sql.Timestamp crtDate) {
		this.crtDate = crtDate; 
	}
 
}
