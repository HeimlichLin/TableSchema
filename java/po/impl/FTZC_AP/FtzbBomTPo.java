package com.doc.common.po.impl; 
 
public class FtzbBomTPo implements IFtzbBomTPo {
 
	public enum COLUMNS {
		BONDNO("null"), //
		CTMCODE("null"), //
		PROCESS("null"), //
		BOMDATE("null"), //
		GOODTYPE("null"), //
		PRDTNO("null"), //
		PRDTNAME("null"), //
		PRDTUNIT("null"), //
		RECVDATE("null"), //
		COCOMPNO("null"), //
		APPROVEDDATE("null"), //
		BOMNO("null"), //
		APPROVEDNO("null"), //
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
	private String process;
	private String bomdate;
	private String goodtype;
	private String prdtno;
	private String prdtname;
	private String prdtunit;
	private String recvdate;
	private String cocompno;
	private String approveddate;
	private String bomno;
	private String approvedno;
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
	public String getProcess() {
		return this.process;
	}
 
	@Override
	public void setProcess(final String process) {
		this.process = process; 
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
	public String getGoodtype() {
		return this.goodtype;
	}
 
	@Override
	public void setGoodtype(final String goodtype) {
		this.goodtype = goodtype; 
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
	public String getPrdtname() {
		return this.prdtname;
	}
 
	@Override
	public void setPrdtname(final String prdtname) {
		this.prdtname = prdtname; 
	}
 
	@Override
	public String getPrdtunit() {
		return this.prdtunit;
	}
 
	@Override
	public void setPrdtunit(final String prdtunit) {
		this.prdtunit = prdtunit; 
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
	public String getApproveddate() {
		return this.approveddate;
	}
 
	@Override
	public void setApproveddate(final String approveddate) {
		this.approveddate = approveddate; 
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
	public String getApprovedno() {
		return this.approvedno;
	}
 
	@Override
	public void setApprovedno(final String approvedno) {
		this.approvedno = approvedno; 
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
