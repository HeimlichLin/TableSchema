package com.doc.common.po.impl; 
 
public class SitadlvPo implements ISitadlvPo {
 
	public enum COLUMNS {
		AWB("null"), //
		FLIGHTDATE("null"), //
		FLIGHTNO("null"), //
		PC("null"), //
		PROCESS("null"), //
		PROCESSTIME("null"), //
		INPC("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String awb;
	private String flightdate;
	private String flightno;
	private BigDecimal pc;
	private String process;
	private String processtime;
	private BigDecimal inpc;

	@Override
	public String getAwb() {
		return this.awb;
	}
 
	@Override
	public void setAwb(final String awb) {
		this.awb = awb; 
	}
 
	@Override
	public String getFlightdate() {
		return this.flightdate;
	}
 
	@Override
	public void setFlightdate(final String flightdate) {
		this.flightdate = flightdate; 
	}
 
	@Override
	public String getFlightno() {
		return this.flightno;
	}
 
	@Override
	public void setFlightno(final String flightno) {
		this.flightno = flightno; 
	}
 
	@Override
	public BigDecimal getPc() {
		return this.pc;
	}
 
	@Override
	public void setPc(final BigDecimal pc) {
		this.pc = pc; 
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
	public String getProcesstime() {
		return this.processtime;
	}
 
	@Override
	public void setProcesstime(final String processtime) {
		this.processtime = processtime; 
	}
 
	@Override
	public BigDecimal getInpc() {
		return this.inpc;
	}
 
	@Override
	public void setInpc(final BigDecimal inpc) {
		this.inpc = inpc; 
	}
 
}
