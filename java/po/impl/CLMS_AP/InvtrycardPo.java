package com.doc.common.po.impl; 
 
public class InvtrycardPo implements IInvtrycardPo {
 
	public enum COLUMNS {
		BONDNO("null"), //
		YY("null"), //
		SERIESNO("null"), //
		CARDNO("null"), //
		CHECKDATE("null"), //
		OPTYPE("null"), //
		PRDTTYPE("null"), //
		PRDTNO("null"), //
		UNIT("null"), //
		INPOST("null"), //
		LOCATION("null"), //
		CHECKQTY("null"), //
		DESCRIP("null"), //
		MODEL("null"), //
		SPEC("null"), //
		CHECKER1("null"), //
		CHECKER2("null"), //
		CHECKER3("null"), //
		RMK("null"), //
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
	private String yy;
	private BigDecimal seriesno;
	private String cardno;
	private String checkdate;
	private String optype;
	private String prdttype;
	private String prdtno;
	private String unit;
	private String inpost;
	private String location;
	private BigDecimal checkqty;
	private String descrip;
	private String model;
	private String spec;
	private String checker1;
	private String checker2;
	private String checker3;
	private String rmk;
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
	public String getYy() {
		return this.yy;
	}
 
	@Override
	public void setYy(final String yy) {
		this.yy = yy; 
	}
 
	@Override
	public BigDecimal getSeriesno() {
		return this.seriesno;
	}
 
	@Override
	public void setSeriesno(final BigDecimal seriesno) {
		this.seriesno = seriesno; 
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
	public String getCheckdate() {
		return this.checkdate;
	}
 
	@Override
	public void setCheckdate(final String checkdate) {
		this.checkdate = checkdate; 
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
	public String getPrdtno() {
		return this.prdtno;
	}
 
	@Override
	public void setPrdtno(final String prdtno) {
		this.prdtno = prdtno; 
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
	public String getInpost() {
		return this.inpost;
	}
 
	@Override
	public void setInpost(final String inpost) {
		this.inpost = inpost; 
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
	public BigDecimal getCheckqty() {
		return this.checkqty;
	}
 
	@Override
	public void setCheckqty(final BigDecimal checkqty) {
		this.checkqty = checkqty; 
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
	public String getChecker1() {
		return this.checker1;
	}
 
	@Override
	public void setChecker1(final String checker1) {
		this.checker1 = checker1; 
	}
 
	@Override
	public String getChecker2() {
		return this.checker2;
	}
 
	@Override
	public void setChecker2(final String checker2) {
		this.checker2 = checker2; 
	}
 
	@Override
	public String getChecker3() {
		return this.checker3;
	}
 
	@Override
	public void setChecker3(final String checker3) {
		this.checker3 = checker3; 
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
 
}
