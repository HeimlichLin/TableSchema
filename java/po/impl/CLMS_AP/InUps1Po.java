package com.doc.common.po.impl; 
 
public class InUps1Po implements IInUps1Po {
 
	public enum COLUMNS {
		BONDNO("null"), //
		GDSTYPE("null"), //
		DECLTYPE("null"), //
		PRDTNO("null"), //
		DECLNO("null"), //
		ITEMNO("null"), //
		STOCKNO("null"), //
		INDATE("null"), //
		RINQTY("null"), //
		INUNIT("null"), //
		INPOST("null"), //
		BALANCE("null"), //
		ISSTOCK("null"), //
		RMK("null"), //
		INSTATUS("null"), //
		CONTROLNO("null"), //
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
	private String gdstype;
	private String decltype;
	private String prdtno;
	private String declno;
	private BigDecimal itemno;
	private String stockno;
	private String indate;
	private BigDecimal rinqty;
	private String inunit;
	private String inpost;
	private BigDecimal balance;
	private String isstock;
	private String rmk;
	private String instatus;
	private String controlno;
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
	public String getGdstype() {
		return this.gdstype;
	}
 
	@Override
	public void setGdstype(final String gdstype) {
		this.gdstype = gdstype; 
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
	public BigDecimal getRinqty() {
		return this.rinqty;
	}
 
	@Override
	public void setRinqty(final BigDecimal rinqty) {
		this.rinqty = rinqty; 
	}
 
	@Override
	public String getInunit() {
		return this.inunit;
	}
 
	@Override
	public void setInunit(final String inunit) {
		this.inunit = inunit; 
	}
 
	@Override
	public String getInpost() {
		return this.inpost;
	}
 
	@Override
	public void setInpost(final String inpost) {
		this.inpost = inpost; 
	}
 
	@Override
	public BigDecimal getBalance() {
		return this.balance;
	}
 
	@Override
	public void setBalance(final BigDecimal balance) {
		this.balance = balance; 
	}
 
	@Override
	public String getIsstock() {
		return this.isstock;
	}
 
	@Override
	public void setIsstock(final String isstock) {
		this.isstock = isstock; 
	}
 
	@Override
	public String getRmk() {
		return this.rmk;
	}
 
	@Override
	public void setRmk(final String rmk) {
		this.rmk = rmk; 
	}
 
	@Override
	public String getInstatus() {
		return this.instatus;
	}
 
	@Override
	public void setInstatus(final String instatus) {
		this.instatus = instatus; 
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
	public String getUpdtime() {
		return this.updtime;
	}
 
	@Override
	public void setUpdtime(final String updtime) {
		this.updtime = updtime; 
	}
 
}
