package com.doc.common.bean; 
 
public class M1headDo { 
 
	public enum COLUMNS { 
		MSGTYPE("null"), 
		BONDNO("null"), 
		STRTYPE("null"), 
		MONTHNO("null"), 
		MONTHDATE("null"), 
		CTMCODE("null"), 
		NEWDECLNO("null"), 
		NEWDECLTYPE("null"), 
		ORDERTYPE("null"), 
		PROCTIME("null"), 
		PROCSTATUS("null"), 
		PROCRMK("null"), 
		PROCUSER("null"), 
		CONTROLNO("null") 
		; 
		final String name; 
	 
		private COLUMNS(final String name) { 
			this.name = name; 
		} 
	 
		public String getName() { 
			return this.name; 
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
	
	public String getMsgtype() { 
		return msgtype; 
	} 
 
	public void setMsgtype(String msgtype) { 
		this.msgtype = msgtype; 
	} 
 
	public String getBondno() { 
		return bondno; 
	} 
 
	public void setBondno(String bondno) { 
		this.bondno = bondno; 
	} 
 
	public String getStrtype() { 
		return strtype; 
	} 
 
	public void setStrtype(String strtype) { 
		this.strtype = strtype; 
	} 
 
	public String getMonthno() { 
		return monthno; 
	} 
 
	public void setMonthno(String monthno) { 
		this.monthno = monthno; 
	} 
 
	public String getMonthdate() { 
		return monthdate; 
	} 
 
	public void setMonthdate(String monthdate) { 
		this.monthdate = monthdate; 
	} 
 
	public String getCtmcode() { 
		return ctmcode; 
	} 
 
	public void setCtmcode(String ctmcode) { 
		this.ctmcode = ctmcode; 
	} 
 
	public String getNewdeclno() { 
		return newdeclno; 
	} 
 
	public void setNewdeclno(String newdeclno) { 
		this.newdeclno = newdeclno; 
	} 
 
	public String getNewdecltype() { 
		return newdecltype; 
	} 
 
	public void setNewdecltype(String newdecltype) { 
		this.newdecltype = newdecltype; 
	} 
 
	public String getOrdertype() { 
		return ordertype; 
	} 
 
	public void setOrdertype(String ordertype) { 
		this.ordertype = ordertype; 
	} 
 
	public String getProctime() { 
		return proctime; 
	} 
 
	public void setProctime(String proctime) { 
		this.proctime = proctime; 
	} 
 
	public BigDecimal getProcstatus() { 
		return procstatus; 
	} 
 
	public void setProcstatus(BigDecimal procstatus) { 
		this.procstatus = procstatus; 
	} 
 
	public String getProcrmk() { 
		return procrmk; 
	} 
 
	public void setProcrmk(String procrmk) { 
		this.procrmk = procrmk; 
	} 
 
	public String getProcuser() { 
		return procuser; 
	} 
 
	public void setProcuser(String procuser) { 
		this.procuser = procuser; 
	} 
 
	public String getControlno() { 
		return controlno; 
	} 
 
	public void setControlno(String controlno) { 
		this.controlno = controlno; 
	} 
 
} 
