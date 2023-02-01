package com.doc.common.po.impl; 
 
public class ErrorlogPo implements IErrorlogPo {
 
	public enum COLUMNS {
		BONDNO("null"), //
		REFBILLNO("null"), //
		STRTYPE("null"), //
		SENDFLAG("null"), //
		CONTROLNO("null"), //
		SENDTIME("null"), //
		NOTE("null"), //
		LOGTIME("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String bondno;
	private String refbillno;
	private String strtype;
	private String sendflag;
	private String controlno;
	private java.sql.Timestamp sendtime;
	private String note;
	private java.sql.Timestamp logtime;

	@Override
	public String getBondno() {
		return this.bondno;
	}
 
	@Override
	public void setBondno(final String bondno) {
		this.bondno = bondno; 
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
	public String getStrtype() {
		return this.strtype;
	}
 
	@Override
	public void setStrtype(final String strtype) {
		this.strtype = strtype; 
	}
 
	@Override
	public String getSendflag() {
		return this.sendflag;
	}
 
	@Override
	public void setSendflag(final String sendflag) {
		this.sendflag = sendflag; 
	}
 
	@Override
	public String getControlno() {
		return this.controlno;
	}
 
	@Override
	public void setControlno(final String controlno) {
		this.controlno = controlno; 
	}
 
	@Override
	public java.sql.Timestamp getSendtime() {
		return this.sendtime;
	}
 
	@Override
	public void setSendtime(final java.sql.Timestamp sendtime) {
		this.sendtime = sendtime; 
	}
 
	@Override
	public String getNote() {
		return this.note;
	}
 
	@Override
	public void setNote(final String note) {
		this.note = note; 
	}
 
	@Override
	public java.sql.Timestamp getLogtime() {
		return this.logtime;
	}
 
	@Override
	public void setLogtime(final java.sql.Timestamp logtime) {
		this.logtime = logtime; 
	}
 
}
