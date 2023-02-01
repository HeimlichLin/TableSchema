package com.doc.common.po.impl; 
 
public class InstockPo implements IInstockPo {
 
	public enum COLUMNS {
		BONDNO("null"), //
		STOCKNO("null"), //
		INDATE("null"), //
		DECLNO("null"), //
		DECLTYPE("null"), //
		INVOICE("null"), //
		MANIFNO("null"), //
		VESSELNO("null"), //
		GDSTYPE("null"), //
		OPTYPE("null"), //
		PRDTTYPE("null"), //
		REFBILLNO("null"), //
		CTMCODE("null"), //
		UPDTIME("null") //
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
	private String stockno;
	private String indate;
	private String declno;
	private String decltype;
	private String invoice;
	private String manifno;
	private String vesselno;
	private String gdstype;
	private String optype;
	private String prdttype;
	private String refbillno;
	private String ctmcode;
	private String updtime;

	@Override
	public String getBondno() {
		return this.bondno;
	}
 
	@Override
	public void setBondno(final String bondno) {
		this.bondno = bondno; 
	}
 
	@Override
	public String getStockno() {
		return this.stockno;
	}
 
	@Override
	public void setStockno(final String stockno) {
		this.stockno = stockno; 
	}
 
	@Override
	public String getIndate() {
		return this.indate;
	}
 
	@Override
	public void setIndate(final String indate) {
		this.indate = indate; 
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
	public String getDecltype() {
		return this.decltype;
	}
 
	@Override
	public void setDecltype(final String decltype) {
		this.decltype = decltype; 
	}
 
	@Override
	public String getInvoice() {
		return this.invoice;
	}
 
	@Override
	public void setInvoice(final String invoice) {
		this.invoice = invoice; 
	}
 
	@Override
	public String getManifno() {
		return this.manifno;
	}
 
	@Override
	public void setManifno(final String manifno) {
		this.manifno = manifno; 
	}
 
	@Override
	public String getVesselno() {
		return this.vesselno;
	}
 
	@Override
	public void setVesselno(final String vesselno) {
		this.vesselno = vesselno; 
	}
 
	@Override
	public String getGdstype() {
		return this.gdstype;
	}
 
	@Override
	public void setGdstype(final String gdstype) {
		this.gdstype = gdstype; 
	}
 
	@Override
	public String getOptype() {
		return this.optype;
	}
 
	@Override
	public void setOptype(final String optype) {
		this.optype = optype; 
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
	public String getRefbillno() {
		return this.refbillno;
	}
 
	@Override
	public void setRefbillno(final String refbillno) {
		this.refbillno = refbillno; 
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
	public String getUpdtime() {
		return this.updtime;
	}
 
	@Override
	public void setUpdtime(final String updtime) {
		this.updtime = updtime; 
	}
 
}
