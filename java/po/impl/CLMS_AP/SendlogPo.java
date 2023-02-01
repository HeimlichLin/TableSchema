package com.doc.common.po.impl; 
 
public class SendlogPo implements ISendlogPo {
 
	public enum COLUMNS {
		BONDNO("監管編號"), //
		DECLNO("報單號碼"), //
		STRTYPE("進出倉別"), //
		SENDFLAG("傳送註記"), //
		CONTROLNO("null"), //
		SENDTIME("傳送時間"), //
		MSGFUN("異動別"), //
		MSGTYPE("Edi訊息別"), //
		ASTYPE("海空運別.S:海運.A:空運") //
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
	private String declno;
	private String strtype;
	private String sendflag;
	private String controlno;
	private java.sql.Timestamp sendtime;
	private String msgfun;
	private String msgtype;
	private String astype;

	@Override
	public String getBondno() {
		return this.bondno;
	}
 
	@Override
	public void setBondno(final String bondno) {
		this.bondno = bondno; 
	}
 
	@Override
	public String getDeclno() {
		return this.declno;
	}
 
	@Override
	public void setDeclno(final String declno) {
		this.declno = declno; 
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
	public String getMsgfun() {
		return this.msgfun;
	}
 
	@Override
	public void setMsgfun(final String msgfun) {
		this.msgfun = msgfun; 
	}
 
	@Override
	public String getMsgtype() {
		return this.msgtype;
	}
 
	@Override
	public void setMsgtype(final String msgtype) {
		this.msgtype = msgtype; 
	}
 
	@Override
	public String getAstype() {
		return this.astype;
	}
 
	@Override
	public void setAstype(final String astype) {
		this.astype = astype; 
	}
 
}
