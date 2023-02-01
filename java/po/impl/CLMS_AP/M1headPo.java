package com.doc.common.po.impl; 
 
public class M1headPo implements IM1headPo {
 
	public enum COLUMNS {
		MSGTYPE("null"), //
		BONDNO("null"), //
		STRTYPE("null"), //
		MONTHNO("null"), //
		MONTHDATE("null"), //
		CTMCODE("null"), //
		NEWDECLNO("null"), //
		NEWDECLTYPE("null"), //
		ORDERTYPE("null"), //
		PROCTIME("null"), //
		PROCSTATUS("null"), //
		PROCRMK("null"), //
		PROCUSER("null"), //
		CONTROLNO("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String msgtype;
	private String bondno;
	private String strtype;
	private String monthno;
	private String monthdate;
	private String ctmcode;
	private String newdeclno;
	private String newdecltype;
	private String ordertype;
	private String proctime;
	private BigDecimal procstatus;
	private String procrmk;
	private String procuser;
	private String controlno;

	@Override
	public String getMsgtype() {
		return this.msgtype;
	}
 
	@Override
	public void setMsgtype(final String msgtype) {
		this.msgtype = msgtype; 
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
	public String getMonthno() {
		return this.monthno;
	}
 
	@Override
	public void setMonthno(final String monthno) {
		this.monthno = monthno; 
	}
 
	@Override
	public String getMonthdate() {
		return this.monthdate;
	}
 
	@Override
	public void setMonthdate(final String monthdate) {
		this.monthdate = monthdate; 
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
	public String getNewdeclno() {
		return this.newdeclno;
	}
 
	@Override
	public void setNewdeclno(final String newdeclno) {
		this.newdeclno = newdeclno; 
	}
 
	@Override
	public String getNewdecltype() {
		return this.newdecltype;
	}
 
	@Override
	public void setNewdecltype(final String newdecltype) {
		this.newdecltype = newdecltype; 
	}
 
	@Override
	public String getOrdertype() {
		return this.ordertype;
	}
 
	@Override
	public void setOrdertype(final String ordertype) {
		this.ordertype = ordertype; 
	}
 
	@Override
	public String getProctime() {
		return this.proctime;
	}
 
	@Override
	public void setProctime(final String proctime) {
		this.proctime = proctime; 
	}
 
	@Override
	public BigDecimal getProcstatus() {
		return this.procstatus;
	}
 
	@Override
	public void setProcstatus(final BigDecimal procstatus) {
		this.procstatus = procstatus; 
	}
 
	@Override
	public String getProcrmk() {
		return this.procrmk;
	}
 
	@Override
	public void setProcrmk(final String procrmk) {
		this.procrmk = procrmk; 
	}
 
	@Override
	public String getProcuser() {
		return this.procuser;
	}
 
	@Override
	public void setProcuser(final String procuser) {
		this.procuser = procuser; 
	}
 
	@Override
	public String getControlno() {
		return this.controlno;
	}
 
	@Override
	public void setControlno(final String controlno) {
		this.controlno = controlno; 
	}
 
}
