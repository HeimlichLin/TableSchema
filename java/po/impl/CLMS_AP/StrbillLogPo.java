package com.doc.common.po.impl; 
 
public class StrbillLogPo implements IStrbillLogPo {
 
	public enum COLUMNS {
		MSGFUN("異動別"), //
		BONDNO("監管編號"), //
		STRTYPE("進出倉別"), //
		GDSTYPE("貨物類別"), //
		REFBILLNO("參考單號"), //
		CTMCODE("客戶編碼"), //
		SUBCON("委外商"), //
		OTHERS("其它"), //
		PROCESSTIME("異動日期"), //
		PROCESSSTATE("異動類別") //
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
	private String others;
	private String processtime;
	private String processstate;

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
	public String getOthers() {
		return this.others;
	}
 
	@Override
	public void setOthers(final String others) {
		this.others = others; 
	}
 
	@Override
	public String getProcesstime() {
		return this.processtime;
	}
 
	@Override
	public void setProcesstime(final String processtime) {
		this.processtime = processtime; 
	}
 
	@Override
	public String getProcessstate() {
		return this.processstate;
	}
 
	@Override
	public void setProcessstate(final String processstate) {
		this.processstate = processstate; 
	}
 
}
