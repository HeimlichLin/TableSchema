package com.doc.common.po.impl; 
 
public class FtzbBomTLogPo implements IFtzbBomTLogPo {
 
	public enum COLUMNS {
		BONDNO("null"), //
		BOMFILE("null"), //
		BOMDATE("null"), //
		PRDTNO("null"), //
		PARTNO("null"), //
		BOMSTATUS("null"), //
		BOMMSG("null"), //
		RECVDATE("null"), //
		COCOMPNO("null"), //
		SEQNO("null"), //
		SERIALNO("null") //
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
	private String bomfile;
	private String bomdate;
	private String prdtno;
	private String partno;
	private String bomstatus;
	private String bommsg;
	private String recvdate;
	private String cocompno;
	private BigDecimal seqno;
	private BigDecimal serialno;

	@Override
	public String getBondno() {
		return this.bondno;
	}
 
	@Override
	public void setBondno(final String bondno) {
		this.bondno = bondno; 
	}
 
	@Override
	public String getBomfile() {
		return this.bomfile;
	}
 
	@Override
	public void setBomfile(final String bomfile) {
		this.bomfile = bomfile; 
	}
 
	@Override
	public String getBomdate() {
		return this.bomdate;
	}
 
	@Override
	public void setBomdate(final String bomdate) {
		this.bomdate = bomdate; 
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
	public String getPartno() {
		return this.partno;
	}
 
	@Override
	public void setPartno(final String partno) {
		this.partno = partno; 
	}
 
	@Override
	public String getBomstatus() {
		return this.bomstatus;
	}
 
	@Override
	public void setBomstatus(final String bomstatus) {
		this.bomstatus = bomstatus; 
	}
 
	@Override
	public String getBommsg() {
		return this.bommsg;
	}
 
	@Override
	public void setBommsg(final String bommsg) {
		this.bommsg = bommsg; 
	}
 
	@Override
	public String getRecvdate() {
		return this.recvdate;
	}
 
	@Override
	public void setRecvdate(final String recvdate) {
		this.recvdate = recvdate; 
	}
 
	@Override
	public String getCocompno() {
		return this.cocompno;
	}
 
	@Override
	public void setCocompno(final String cocompno) {
		this.cocompno = cocompno; 
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
	public BigDecimal getSerialno() {
		return this.serialno;
	}
 
	@Override
	public void setSerialno(final BigDecimal serialno) {
		this.serialno = serialno; 
	}
 
}
