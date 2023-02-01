package com.doc.common.po.impl; 
 
public class M1detailPo implements IM1detailPo {
 
	public enum COLUMNS {
		MONTHNO("null"), //
		REFBILLNO("null"), //
		ITEM("null"), //
		STRPOST("null"), //
		PRDTNO("null"), //
		DECLNO("null"), //
		ITEMNO("null"), //
		STRDATE("null"), //
		PROCTIME("null"), //
		PROCSTATUS("null"), //
		PROCRMK("null"), //
		PROCUSER("null"), //
		BONDNO("null"), //
		STRTYPE("null"), //
		MSGTYPE("null"), //
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

	@Override
	public String getMonthno() {
		return this.monthno;
	}
 
	@Override
	public void setMonthno(final String monthno) {
		this.monthno = monthno; 
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
	public BigDecimal getItem() {
		return this.item;
	}
 
	@Override
	public void setItem(final BigDecimal item) {
		this.item = item; 
	}
 
	@Override
	public String getStrpost() {
		return this.strpost;
	}
 
	@Override
	public void setStrpost(final String strpost) {
		this.strpost = strpost; 
	}
 
	@Override
	public String getPrdtno() {
		return this.prdtno;
	}
 
	@Override
	public void setPrdtno(final String prdtno) {
		this.prdtno = prdtno; 
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
	public BigDecimal getItemno() {
		return this.itemno;
	}
 
	@Override
	public void setItemno(final BigDecimal itemno) {
		this.itemno = itemno; 
	}
 
	@Override
	public String getStrdate() {
		return this.strdate;
	}
 
	@Override
	public void setStrdate(final String strdate) {
		this.strdate = strdate; 
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
	public String getMsgtype() {
		return this.msgtype;
	}
 
	@Override
	public void setMsgtype(final String msgtype) {
		this.msgtype = msgtype; 
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
