package com.doc.common.bean; 
 
public class M1detailDo { 
 
	public enum COLUMNS { 
		MONTHNO("null"), 
		REFBILLNO("null"), 
		ITEM("null"), 
		STRPOST("null"), 
		PRDTNO("null"), 
		DECLNO("null"), 
		ITEMNO("null"), 
		STRDATE("null"), 
		PROCTIME("null"), 
		PROCSTATUS("null"), 
		PROCRMK("null"), 
		PROCUSER("null"), 
		BONDNO("null"), 
		STRTYPE("null"), 
		MSGTYPE("null"), 
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
 
	private String monthno; 
	private String refbillno; 
	private BigDecimal item; 
	private String strpost; 
	private String prdtno; 
	private String declno; 
	private BigDecimal itemno; 
	private String strdate; 
	private String proctime; 
	private BigDecimal procstatus; 
	private String procrmk; 
	private String procuser; 
	private String bondno; 
	private String strtype; 
	private String msgtype; 
	private String controlno; 
	
	public String getMonthno() { 
		return monthno; 
	} 
 
	public void setMonthno(String monthno) { 
		this.monthno = monthno; 
	} 
 
	public String getRefbillno() { 
		return refbillno; 
	} 
 
	public void setRefbillno(String refbillno) { 
		this.refbillno = refbillno; 
	} 
 
	public BigDecimal getItem() { 
		return item; 
	} 
 
	public void setItem(BigDecimal item) { 
		this.item = item; 
	} 
 
	public String getStrpost() { 
		return strpost; 
	} 
 
	public void setStrpost(String strpost) { 
		this.strpost = strpost; 
	} 
 
	public String getPrdtno() { 
		return prdtno; 
	} 
 
	public void setPrdtno(String prdtno) { 
		this.prdtno = prdtno; 
	} 
 
	public String getDeclno() { 
		return declno; 
	} 
 
	public void setDeclno(String declno) { 
		this.declno = declno; 
	} 
 
	public BigDecimal getItemno() { 
		return itemno; 
	} 
 
	public void setItemno(BigDecimal itemno) { 
		this.itemno = itemno; 
	} 
 
	public String getStrdate() { 
		return strdate; 
	} 
 
	public void setStrdate(String strdate) { 
		this.strdate = strdate; 
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
 
	public String getMsgtype() { 
		return msgtype; 
	} 
 
	public void setMsgtype(String msgtype) { 
		this.msgtype = msgtype; 
	} 
 
	public String getControlno() { 
		return controlno; 
	} 
 
	public void setControlno(String controlno) { 
		this.controlno = controlno; 
	} 
 
} 
