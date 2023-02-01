package com.doc.common.po.impl; 
 
public class TsT2Po implements ITsT2Po {
 
	public enum COLUMNS {
		T2ITEM("null"), //
		T2PRDTNO("null"), //
		T2RSTRQTY("null"), //
		T2PRDTUNIT("null"), //
		T2UNITPRICE("null"), //
		T2ODECLNO("null"), //
		T2OITEM("null"), //
		T2INPOST("null"), //
		T2OREFBILLNO("null"), //
		T2OREFBILLITEM("null"), //
		T2DESCRIP("null"), //
		CONTROLNO("null"), //
		SERIALNO("null"), //
		SEQNO("null"), //
		ICONFIRMED("null"), //
		T1BONDNO("null"), //
		T1TESTNO("null"), //
		T1_SEQNO("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal t2item;
	private String t2prdtno;
	private BigDecimal t2rstrqty;
	private String t2prdtunit;
	private BigDecimal t2unitprice;
	private String t2odeclno;
	private BigDecimal t2oitem;
	private String t2inpost;
	private String t2orefbillno;
	private BigDecimal t2orefbillitem;
	private String t2descrip;
	private String controlno;
	private BigDecimal serialno;
	private BigDecimal seqno;
	private String iconfirmed;
	private String t1bondno;
	private String t1testno;
	private BigDecimal t1Seqno;

	@Override
	public BigDecimal getT2item() {
		return this.t2item;
	}
 
	@Override
	public void setT2item(final BigDecimal t2item) {
		this.t2item = t2item; 
	}
 
	@Override
	public String getT2prdtno() {
		return this.t2prdtno;
	}
 
	@Override
	public void setT2prdtno(final String t2prdtno) {
		this.t2prdtno = t2prdtno; 
	}
 
	@Override
	public BigDecimal getT2rstrqty() {
		return this.t2rstrqty;
	}
 
	@Override
	public void setT2rstrqty(final BigDecimal t2rstrqty) {
		this.t2rstrqty = t2rstrqty; 
	}
 
	@Override
	public String getT2prdtunit() {
		return this.t2prdtunit;
	}
 
	@Override
	public void setT2prdtunit(final String t2prdtunit) {
		this.t2prdtunit = t2prdtunit; 
	}
 
	@Override
	public BigDecimal getT2unitprice() {
		return this.t2unitprice;
	}
 
	@Override
	public void setT2unitprice(final BigDecimal t2unitprice) {
		this.t2unitprice = t2unitprice; 
	}
 
	@Override
	public String getT2odeclno() {
		return this.t2odeclno;
	}
 
	@Override
	public void setT2odeclno(final String t2odeclno) {
		this.t2odeclno = t2odeclno; 
	}
 
	@Override
	public BigDecimal getT2oitem() {
		return this.t2oitem;
	}
 
	@Override
	public void setT2oitem(final BigDecimal t2oitem) {
		this.t2oitem = t2oitem; 
	}
 
	@Override
	public String getT2inpost() {
		return this.t2inpost;
	}
 
	@Override
	public void setT2inpost(final String t2inpost) {
		this.t2inpost = t2inpost; 
	}
 
	@Override
	public String getT2orefbillno() {
		return this.t2orefbillno;
	}
 
	@Override
	public void setT2orefbillno(final String t2orefbillno) {
		this.t2orefbillno = t2orefbillno; 
	}
 
	@Override
	public BigDecimal getT2orefbillitem() {
		return this.t2orefbillitem;
	}
 
	@Override
	public void setT2orefbillitem(final BigDecimal t2orefbillitem) {
		this.t2orefbillitem = t2orefbillitem; 
	}
 
	@Override
	public String getT2descrip() {
		return this.t2descrip;
	}
 
	@Override
	public void setT2descrip(final String t2descrip) {
		this.t2descrip = t2descrip; 
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
 
}
