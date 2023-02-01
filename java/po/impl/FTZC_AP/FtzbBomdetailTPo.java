package com.doc.common.po.impl; 
 
public class FtzbBomdetailTPo implements IFtzbBomdetailTPo {
 
	public enum COLUMNS {
		BONDNO("null"), //
		CTMCODE("null"), //
		PRDTNO("null"), //
		PARTNO("null"), //
		PARTNAME("null"), //
		UNITQTY("null"), //
		UNIT("null"), //
		BEGINDATE("null"), //
		ENDDATE("null"), //
		PRDTTYPE("null"), //
		RECVDATE("null"), //
		BOMFILE("null"), //
		BOMNO("null"), //
		SEQNO("null") //
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
	private String ctmcode;
	private String prdtno;
	private String partno;
	private String partname;
	private BigDecimal unitqty;
	private String unit;
	private String begindate;
	private String enddate;
	private String prdttype;
	private String recvdate;
	private String bomfile;
	private String bomno;
	private BigDecimal seqno;

	@Override
	public String getBondno() {
		return this.bondno;
	}
 
	@Override
	public void setBondno(final String bondno) {
		this.bondno = bondno; 
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
	public String getPartname() {
		return this.partname;
	}
 
	@Override
	public void setPartname(final String partname) {
		this.partname = partname; 
	}
 
	@Override
	public BigDecimal getUnitqty() {
		return this.unitqty;
	}
 
	@Override
	public void setUnitqty(final BigDecimal unitqty) {
		this.unitqty = unitqty; 
	}
 
	@Override
	public String getUnit() {
		return this.unit;
	}
 
	@Override
	public void setUnit(final String unit) {
		this.unit = unit; 
	}
 
	@Override
	public String getBegindate() {
		return this.begindate;
	}
 
	@Override
	public void setBegindate(final String begindate) {
		this.begindate = begindate; 
	}
 
	@Override
	public String getEnddate() {
		return this.enddate;
	}
 
	@Override
	public void setEnddate(final String enddate) {
		this.enddate = enddate; 
	}
 
	@Override
	public String getPrdttype() {
		return this.prdttype;
	}
 
	@Override
	public void setPrdttype(final String prdttype) {
		this.prdttype = prdttype; 
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
	public String getBomfile() {
		return this.bomfile;
	}
 
	@Override
	public void setBomfile(final String bomfile) {
		this.bomfile = bomfile; 
	}
 
	@Override
	public String getBomno() {
		return this.bomno;
	}
 
	@Override
	public void setBomno(final String bomno) {
		this.bomno = bomno; 
	}
 
	@Override
	public BigDecimal getSeqno() {
		return this.seqno;
	}
 
	@Override
	public void setSeqno(final BigDecimal seqno) {
		this.seqno = seqno; 
	}
 
}
