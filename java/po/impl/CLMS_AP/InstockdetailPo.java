package com.doc.common.po.impl; 
 
public class InstockdetailPo implements IInstockdetailPo {
 
	public enum COLUMNS {
		BONDNO("監管編號"), //
		STOCKNO("存倉單號"), //
		ITEM("項次"), //
		PRDTNO("料號"), //
		DESCRIP("貨名"), //
		SPEC("規格"), //
		MODEL("型號"), //
		UNIT("單位"), //
		INQTY("進倉數量"), //
		INPOST("儲位"), //
		RMK("null"), //
		UPDTIME("進倉儲位"), //
		INDATE("進倉日期"), //
		INSTATUS("null"), //
		BALANCE("庫存量"), //
		NWGHT("進倉確認日期"), //
		DECLNO("報單號碼"), //
		ITEMNO("報單項次"), //
		OUTSTRNO("原存倉號碼"), //
		OITEM("原存倉項次"), //
		DECLTYPE("報單類別") //
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
	private String item;
	private String prdtno;
	private String descrip;
	private String spec;
	private String model;
	private String unit;
	private BigDecimal inqty;
	private String inpost;
	private String rmk;
	private String updtime;
	private String indate;
	private String instatus;
	private BigDecimal balance;
	private BigDecimal nwght;
	private String declno;
	private BigDecimal itemno;
	private String outstrno;
	private BigDecimal oitem;
	private String decltype;

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
	public String getItem() {
		return this.item;
	}
 
	@Override
	public void setItem(final String item) {
		this.item = item; 
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
	public String getDescrip() {
		return this.descrip;
	}
 
	@Override
	public void setDescrip(final String descrip) {
		this.descrip = descrip; 
	}
 
	@Override
	public String getSpec() {
		return this.spec;
	}
 
	@Override
	public void setSpec(final String spec) {
		this.spec = spec; 
	}
 
	@Override
	public String getModel() {
		return this.model;
	}
 
	@Override
	public void setModel(final String model) {
		this.model = model; 
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
	public BigDecimal getInqty() {
		return this.inqty;
	}
 
	@Override
	public void setInqty(final BigDecimal inqty) {
		this.inqty = inqty; 
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
	public String getRmk() {
		return this.rmk;
	}
 
	@Override
	public void setRmk(final String rmk) {
		this.rmk = rmk; 
	}
 
	@Override
	public String getUpdtime() {
		return this.updtime;
	}
 
	@Override
	public void setUpdtime(final String updtime) {
		this.updtime = updtime; 
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
	public String getInstatus() {
		return this.instatus;
	}
 
	@Override
	public void setInstatus(final String instatus) {
		this.instatus = instatus; 
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
	public BigDecimal getNwght() {
		return this.nwght;
	}
 
	@Override
	public void setNwght(final BigDecimal nwght) {
		this.nwght = nwght; 
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
	public String getOutstrno() {
		return this.outstrno;
	}
 
	@Override
	public void setOutstrno(final String outstrno) {
		this.outstrno = outstrno; 
	}
 
	@Override
	public BigDecimal getOitem() {
		return this.oitem;
	}
 
	@Override
	public void setOitem(final BigDecimal oitem) {
		this.oitem = oitem; 
	}
 
	@Override
	public String getDecltype() {
		return this.decltype;
	}
 
	@Override
	public void setDecltype(final String decltype) {
		this.decltype = decltype; 
	}
 
}
