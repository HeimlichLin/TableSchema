package com.doc.common.po.impl; 
 
public class TsT1Po implements ITsT1Po {
 
	public enum COLUMNS {
		T1BONDNO("null"), //
		T1TESTNO("null"), //
		T1CTMCODE("null"), //
		T1REQRDATE("null"), //
		T1APPLYDATE("null"), //
		T1APPROVEDDATE("null"), //
		T1APPROVEDNO("null"), //
		T1DESTPLACE("null"), //
		T1TESTTYPE("null"), //
		T1STRTYPE("null"), //
		CONTROLNO("null"), //
		SERIALNO("null"), //
		SEQNO("null"), //
		ICONFIRMED("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String t1bondno;
	private String t1testno;
	private String t1ctmcode;
	private String t1reqrdate;
	private String t1applydate;
	private String t1approveddate;
	private String t1approvedno;
	private String t1destplace;
	private String t1testtype;
	private String t1strtype;
	private String controlno;
	private BigDecimal serialno;
	private BigDecimal seqno;
	private String iconfirmed;

	@Override
	public String getT1bondno() {
		return this.t1bondno;
	}
 
	@Override
	public void setT1bondno(final String t1bondno) {
		this.t1bondno = t1bondno; 
	}
 
	@Override
	public String getT1testno() {
		return this.t1testno;
	}
 
	@Override
	public void setT1testno(final String t1testno) {
		this.t1testno = t1testno; 
	}
 
	@Override
	public String getT1ctmcode() {
		return this.t1ctmcode;
	}
 
	@Override
	public void setT1ctmcode(final String t1ctmcode) {
		this.t1ctmcode = t1ctmcode; 
	}
 
	@Override
	public String getT1reqrdate() {
		return this.t1reqrdate;
	}
 
	@Override
	public void setT1reqrdate(final String t1reqrdate) {
		this.t1reqrdate = t1reqrdate; 
	}
 
	@Override
	public String getT1applydate() {
		return this.t1applydate;
	}
 
	@Override
	public void setT1applydate(final String t1applydate) {
		this.t1applydate = t1applydate; 
	}
 
	@Override
	public String getT1approveddate() {
		return this.t1approveddate;
	}
 
	@Override
	public void setT1approveddate(final String t1approveddate) {
		this.t1approveddate = t1approveddate; 
	}
 
	@Override
	public String getT1approvedno() {
		return this.t1approvedno;
	}
 
	@Override
	public void setT1approvedno(final String t1approvedno) {
		this.t1approvedno = t1approvedno; 
	}
 
	@Override
	public String getT1destplace() {
		return this.t1destplace;
	}
 
	@Override
	public void setT1destplace(final String t1destplace) {
		this.t1destplace = t1destplace; 
	}
 
	@Override
	public String getT1testtype() {
		return this.t1testtype;
	}
 
	@Override
	public void setT1testtype(final String t1testtype) {
		this.t1testtype = t1testtype; 
	}
 
	@Override
	public String getT1strtype() {
		return this.t1strtype;
	}
 
	@Override
	public void setT1strtype(final String t1strtype) {
		this.t1strtype = t1strtype; 
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
	public BigDecimal getSerialno() {
		return this.serialno;
	}
 
	@Override
	public void setSerialno(final BigDecimal serialno) {
		this.serialno = serialno; 
	}
 
	@Override
	public BigDecimal getSeqno() {
		return this.seqno;
	}
 
	@Override
	public void setSeqno(final BigDecimal seqno) {
		this.seqno = seqno; 
	}
 
	@Override
	public String getIconfirmed() {
		return this.iconfirmed;
	}
 
	@Override
	public void setIconfirmed(final String iconfirmed) {
		this.iconfirmed = iconfirmed; 
	}
 
}
