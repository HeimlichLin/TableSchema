package com.doc.common.po.impl; 
 
public class Msg5109Po implements IMsg5109Po {
 
	public enum COLUMNS {
		BONDNO("null"), //
		DECLNO("null"), //
		DOCNUM("null"), //
		PROCTIME("null"), //
		CNNAME("null"), //
		PROCESSID("null"), //
		INTCTLNO("null"), //
		SENDTIME("null"), //
		MSGREFNO("null"), //
		CONTRNO("null") //
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
	private String docnum;
	private java.sql.Timestamp proctime;
	private String cnname;
	private String processid;
	private String intctlno;
	private java.sql.Timestamp sendtime;
	private String msgrefno;
	private String contrno;

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
	public String getDocnum() {
		return this.docnum;
	}
 
	@Override
	public void setDocnum(final String docnum) {
		this.docnum = docnum; 
	}
 
	@Override
	public java.sql.Timestamp getProctime() {
		return this.proctime;
	}
 
	@Override
	public void setProctime(final java.sql.Timestamp proctime) {
		this.proctime = proctime; 
	}
 
	@Override
	public String getCnname() {
		return this.cnname;
	}
 
	@Override
	public void setCnname(final String cnname) {
		this.cnname = cnname; 
	}
 
	@Override
	public String getProcessid() {
		return this.processid;
	}
 
	@Override
	public void setProcessid(final String processid) {
		this.processid = processid; 
	}
 
	@Override
	public String getIntctlno() {
		return this.intctlno;
	}
 
	@Override
	public void setIntctlno(final String intctlno) {
		this.intctlno = intctlno; 
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
	public String getMsgrefno() {
		return this.msgrefno;
	}
 
	@Override
	public void setMsgrefno(final String msgrefno) {
		this.msgrefno = msgrefno; 
	}
 
	@Override
	public String getContrno() {
		return this.contrno;
	}
 
	@Override
	public void setContrno(final String contrno) {
		this.contrno = contrno; 
	}
 
}
