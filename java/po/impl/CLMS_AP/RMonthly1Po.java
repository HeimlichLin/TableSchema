package com.doc.common.po.impl; 
 
public class RMonthly1Po implements IRMonthly1Po {
 
	public enum COLUMNS {
		SESSIONID("null"), //
		BONDNO("null"), //
		GDSTYPE("null"), //
		PRDTNO("null"), //
		DECLNO("null"), //
		ITEMNO("null"), //
		STOCKNO("null"), //
		INDATE("null"), //
		UNIT("null"), //
		RQTY("null"), //
		POST("null"), //
		BALANCE("null"), //
		REFBILLNO("null"), //
		DESCRIP("null"), //
		DECLTYPE("null"), //
		ID("null"), //
		STOCKTYPE("null"), //
		RLSTIME("null"), //
		I_SEQUENCE("null"), //
		MODEL("null"), //
		SPEC("null"), //
		CTMCODE("null"), //
		INRMKS2("null"), //
		ITEM("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String sessionid;
	private String bondno;
	private String gdstype;
	private String prdtno;
	private String declno;
	private BigDecimal itemno;
	private String stockno;
	private String indate;
	private String unit;
	private BigDecimal rqty;
	private String post;
	private BigDecimal balance;
	private String refbillno;
	private String descrip;
	private String decltype;
	private BigDecimal id;
	private String stocktype;
	private String rlstime;
	private BigDecimal iSequence;
	private String model;
	private String spec;
	private String ctmcode;
	private String inrmks2;
	private BigDecimal item;

	@Override
	public String getSessionid() {
		return this.sessionid;
	}
 
	@Override
	public void setSessionid(final String sessionid) {
		this.sessionid = sessionid; 
	}
 
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
	public String getUnit() {
		return this.unit;
	}
 
	@Override
	public void setUnit(final String unit) {
		this.unit = unit; 
	}
 
	@Override
	public BigDecimal getRqty() {
		return this.rqty;
	}
 
	@Override
	public void setRqty(final BigDecimal rqty) {
		this.rqty = rqty; 
	}
 
	@Override
	public String getPost() {
		return this.post;
	}
 
	@Override
	public void setPost(final String post) {
		this.post = post; 
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
	public String getRefbillno() {
		return this.refbillno;
	}
 
	@Override
	public void setRefbillno(final String refbillno) {
		this.refbillno = refbillno; 
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
	public String getDecltype() {
		return this.decltype;
	}
 
	@Override
	public void setDecltype(final String decltype) {
		this.decltype = decltype; 
	}
 
	@Override
	public BigDecimal getId() {
		return this.id;
	}
 
	@Override
	public void setId(final BigDecimal id) {
		this.id = id; 
	}
 
	@Override
	public String getStocktype() {
		return this.stocktype;
	}
 
	@Override
	public void setStocktype(final String stocktype) {
		this.stocktype = stocktype; 
	}
 
	@Override
	public String getRlstime() {
		return this.rlstime;
	}
 
	@Override
	public void setRlstime(final String rlstime) {
		this.rlstime = rlstime; 
	}
 
	@Override
	public BigDecimal getISequence() {
		return this.iSequence;
	}
 
	@Override
	public void setISequence(final BigDecimal iSequence) {
		this.iSequence = iSequence; 
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
	public String getSpec() {
		return this.spec;
	}
 
	@Override
	public void setSpec(final String spec) {
		this.spec = spec; 
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
	public String getInrmks2() {
		return this.inrmks2;
	}
 
	@Override
	public void setInrmks2(final String inrmks2) {
		this.inrmks2 = inrmks2; 
	}
 
	@Override
	public BigDecimal getItem() {
		return this.item;
	}
 
	@Override
	public void setItem(final BigDecimal item) {
		this.item = item; 
	}
 
}
