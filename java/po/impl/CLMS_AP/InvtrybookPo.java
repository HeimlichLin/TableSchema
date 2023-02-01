package com.doc.common.po.impl; 
 
public class InvtrybookPo implements IInvtrybookPo {
 
	public enum COLUMNS {
		BONDNO("null"), //
		YY("null"), //
		ITEM("null"), //
		PRDTNO("null"), //
		INPOST("null"), //
		CARDNO("null"), //
		OPTYPE("null"), //
		PRDTTYPE("null"), //
		LOCATION("null"), //
		UNIT("null"), //
		CHKQTY("null"), //
		DESCRIP("null"), //
		MODEL("null"), //
		SPEC("null"), //
		DEL("null"), //
		UPDTIME("null"), //
		CHECKDATE("null"), //
		CARRYQTY("null") //
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
	private String yy;
	private BigDecimal item;
	private String prdtno;
	private String inpost;
	private String cardno;
	private String optype;
	private String prdttype;
	private String location;
	private String unit;
	private BigDecimal chkqty;
	private String descrip;
	private String model;
	private String spec;
	private String del;
	private String updtime;
	private String checkdate;
	private BigDecimal carryqty;

	@Override
	public String getBondno() {
		return this.bondno;
	}
 
	@Override
	public void setBondno(final String bondno) {
		this.bondno = bondno; 
	}
 
	@Override
	public String getYy() {
		return this.yy;
	}
 
	@Override
	public void setYy(final String yy) {
		this.yy = yy; 
	}
 
	@Override
	public BigDecimal getItem() {
		return this.item;
	}
 
	@Override
	public void setItem(final BigDecimal item) {
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
	public String getInpost() {
		return this.inpost;
	}
 
	@Override
	public void setInpost(final String inpost) {
		this.inpost = inpost; 
	}
 
	@Override
	public String getCardno() {
		return this.cardno;
	}
 
	@Override
	public void setCardno(final String cardno) {
		this.cardno = cardno; 
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
	public String getLocation() {
		return this.location;
	}
 
	@Override
	public void setLocation(final String location) {
		this.location = location; 
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
	public BigDecimal getChkqty() {
		return this.chkqty;
	}
 
	@Override
	public void setChkqty(final BigDecimal chkqty) {
		this.chkqty = chkqty; 
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
	public String getDel() {
		return this.del;
	}
 
	@Override
	public void setDel(final String del) {
		this.del = del; 
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
	public String getCheckdate() {
		return this.checkdate;
	}
 
	@Override
	public void setCheckdate(final String checkdate) {
		this.checkdate = checkdate; 
	}
 
	@Override
	public BigDecimal getCarryqty() {
		return this.carryqty;
	}
 
	@Override
	public void setCarryqty(final BigDecimal carryqty) {
		this.carryqty = carryqty; 
	}
 
}
