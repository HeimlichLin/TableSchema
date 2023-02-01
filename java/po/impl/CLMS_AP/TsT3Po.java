package com.doc.common.po.impl; 
 
public class TsT3Po implements ITsT3Po {
 
	public enum COLUMNS {
		T3ITEM("null"), //
		T3PRDTNO("null"), //
		T3RSTRQTY("null"), //
		T3BACKDATE("null"), //
		T3BATCHNO("null"), //
		CONTROLNO("null"), //
		SERIALNO("null"), //
		SEQNO("null"), //
		ICONFIRMED("null"), //
		T1BONDNO("null"), //
		T1TESTNO("null"), //
		T1_SEQNO("null"), //
		T3INPOST("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal t3item;
	private String t3prdtno;
	private BigDecimal t3rstrqty;
	private String t3backdate;
	private BigDecimal t3batchno;
	private String controlno;
	private BigDecimal serialno;
	private BigDecimal seqno;
	private String iconfirmed;
	private String t1bondno;
	private String t1testno;
	private BigDecimal t1Seqno;
	private String t3inpost;

	@Override
	public BigDecimal getT3item() {
		return this.t3item;
	}
 
	@Override
	public void setT3item(final BigDecimal t3item) {
		this.t3item = t3item; 
	}
 
	@Override
	public String getT3prdtno() {
		return this.t3prdtno;
	}
 
	@Override
	public void setT3prdtno(final String t3prdtno) {
		this.t3prdtno = t3prdtno; 
	}
 
	@Override
	public BigDecimal getT3rstrqty() {
		return this.t3rstrqty;
	}
 
	@Override
	public void setT3rstrqty(final BigDecimal t3rstrqty) {
		this.t3rstrqty = t3rstrqty; 
	}
 
	@Override
	public String getT3backdate() {
		return this.t3backdate;
	}
 
	@Override
	public void setT3backdate(final String t3backdate) {
		this.t3backdate = t3backdate; 
	}
 
	@Override
	public BigDecimal getT3batchno() {
		return this.t3batchno;
	}
 
	@Override
	public void setT3batchno(final BigDecimal t3batchno) {
		this.t3batchno = t3batchno; 
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
	public BigDecimal getT1Seqno() {
		return this.t1Seqno;
	}
 
	@Override
	public void setT1Seqno(final BigDecimal t1Seqno) {
		this.t1Seqno = t1Seqno; 
	}
 
	@Override
	public String getT3inpost() {
		return this.t3inpost;
	}
 
	@Override
	public void setT3inpost(final String t3inpost) {
		this.t3inpost = t3inpost; 
	}
 
}
