package com.doc.common.po.impl; 
 
public class TmpHStrbill120070801Po implements ITmpHStrbill120070801Po {
 
	public enum COLUMNS {
		MSGFUN("null"), //
		BONDNO("null"), //
		STRTYPE("null"), //
		GDSTYPE("null"), //
		REFBILLNO("null"), //
		CTMCODE("null"), //
		SUBCON("null"), //
		UPDTIME("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String msgfun;
	private String bondno;
	private String strtype;
	private String gdstype;
	private String refbillno;
	private String ctmcode;
	private String subcon;
	private String updtime;

	@Override
	public String getMsgfun() {
		return this.msgfun;
	}
 
	@Override
	public void setMsgfun(final String msgfun) {
		this.msgfun = msgfun; 
	}
 
	@Override
	public String getBondno() {
		return this.bondno;
	}
 
	@Override
	public void setBondno(final String bondno) {
		this.bondno = bondno; 
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
	public String getGdstype() {
		return this.gdstype;
	}
 
	@Override
	public void setGdstype(final String gdstype) {
		this.gdstype = gdstype; 
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
	public String getCtmcode() {
		return this.ctmcode;
	}
 
	@Override
	public void setCtmcode(final String ctmcode) {
		this.ctmcode = ctmcode; 
	}
 
	@Override
	public String getSubcon() {
		return this.subcon;
	}
 
	@Override
	public void setSubcon(final String subcon) {
		this.subcon = subcon; 
	}
 
	@Override
	public String getUpdtime() {
		return this.updtime;
	}
 
	@Override
	public void setUpdtime(final String updtime) {
		this.updtime = updtime; 
	}
 
}
