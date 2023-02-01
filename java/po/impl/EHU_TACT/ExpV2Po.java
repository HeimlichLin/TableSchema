package com.doc.common.po.impl; 
 
public class ExpV2Po implements IExpV2Po {
 
	public enum COLUMNS {
		EXPRESSID("null"), //
		EXPRESSCNAME("null"), //
		EXPRESSENAME("null"), //
		BAN("null"), //
		BOXNO("null"), //
		CHARGEBOX("null"), //
		GUARANTEE("null"), //
		BASELINE("null"), //
		LOWERESTLINE("null"), //
		GUARANTEEBASE("null"), //
		EHUACCOUNT("null"), //
		OBCACCOUNT("null"), //
		DISCOUNTTYPE("null"), //
		LEVEL1("null"), //
		DISCOUNT1("null"), //
		LEVEL2("null"), //
		DISCOUNT2("null"), //
		LEVEL3("null"), //
		DISCOUNT3("null"), //
		LEVEL4("null"), //
		DISCOUNT4("null"), //
		LEVEL5("null"), //
		DISCOUNT5("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String expressid;
	private String expresscname;
	private String expressename;
	private String ban;
	private String boxno;
	private String chargebox;
	private BigDecimal guarantee;
	private BigDecimal baseline;
	private BigDecimal lowerestline;
	private BigDecimal guaranteebase;
	private String ehuaccount;
	private String obcaccount;
	private String discounttype;
	private BigDecimal level1;
	private BigDecimal discount1;
	private BigDecimal level2;
	private BigDecimal discount2;
	private BigDecimal level3;
	private BigDecimal discount3;
	private BigDecimal level4;
	private BigDecimal discount4;
	private BigDecimal level5;
	private BigDecimal discount5;

	@Override
	public String getExpressid() {
		return this.expressid;
	}
 
	@Override
	public void setExpressid(final String expressid) {
		this.expressid = expressid; 
	}
 
	@Override
	public String getExpresscname() {
		return this.expresscname;
	}
 
	@Override
	public void setExpresscname(final String expresscname) {
		this.expresscname = expresscname; 
	}
 
	@Override
	public String getExpressename() {
		return this.expressename;
	}
 
	@Override
	public void setExpressename(final String expressename) {
		this.expressename = expressename; 
	}
 
	@Override
	public String getBan() {
		return this.ban;
	}
 
	@Override
	public void setBan(final String ban) {
		this.ban = ban; 
	}
 
	@Override
	public String getBoxno() {
		return this.boxno;
	}
 
	@Override
	public void setBoxno(final String boxno) {
		this.boxno = boxno; 
	}
 
	@Override
	public String getChargebox() {
		return this.chargebox;
	}
 
	@Override
	public void setChargebox(final String chargebox) {
		this.chargebox = chargebox; 
	}
 
	@Override
	public BigDecimal getGuarantee() {
		return this.guarantee;
	}
 
	@Override
	public void setGuarantee(final BigDecimal guarantee) {
		this.guarantee = guarantee; 
	}
 
	@Override
	public BigDecimal getBaseline() {
		return this.baseline;
	}
 
	@Override
	public void setBaseline(final BigDecimal baseline) {
		this.baseline = baseline; 
	}
 
	@Override
	public BigDecimal getLowerestline() {
		return this.lowerestline;
	}
 
	@Override
	public void setLowerestline(final BigDecimal lowerestline) {
		this.lowerestline = lowerestline; 
	}
 
	@Override
	public BigDecimal getGuaranteebase() {
		return this.guaranteebase;
	}
 
	@Override
	public void setGuaranteebase(final BigDecimal guaranteebase) {
		this.guaranteebase = guaranteebase; 
	}
 
	@Override
	public String getEhuaccount() {
		return this.ehuaccount;
	}
 
	@Override
	public void setEhuaccount(final String ehuaccount) {
		this.ehuaccount = ehuaccount; 
	}
 
	@Override
	public String getObcaccount() {
		return this.obcaccount;
	}
 
	@Override
	public void setObcaccount(final String obcaccount) {
		this.obcaccount = obcaccount; 
	}
 
	@Override
	public String getDiscounttype() {
		return this.discounttype;
	}
 
	@Override
	public void setDiscounttype(final String discounttype) {
		this.discounttype = discounttype; 
	}
 
	@Override
	public BigDecimal getLevel1() {
		return this.level1;
	}
 
	@Override
	public void setLevel1(final BigDecimal level1) {
		this.level1 = level1; 
	}
 
	@Override
	public BigDecimal getDiscount1() {
		return this.discount1;
	}
 
	@Override
	public void setDiscount1(final BigDecimal discount1) {
		this.discount1 = discount1; 
	}
 
	@Override
	public BigDecimal getLevel2() {
		return this.level2;
	}
 
	@Override
	public void setLevel2(final BigDecimal level2) {
		this.level2 = level2; 
	}
 
	@Override
	public BigDecimal getDiscount2() {
		return this.discount2;
	}
 
	@Override
	public void setDiscount2(final BigDecimal discount2) {
		this.discount2 = discount2; 
	}
 
	@Override
	public BigDecimal getLevel3() {
		return this.level3;
	}
 
	@Override
	public void setLevel3(final BigDecimal level3) {
		this.level3 = level3; 
	}
 
	@Override
	public BigDecimal getDiscount3() {
		return this.discount3;
	}
 
	@Override
	public void setDiscount3(final BigDecimal discount3) {
		this.discount3 = discount3; 
	}
 
	@Override
	public BigDecimal getLevel4() {
		return this.level4;
	}
 
	@Override
	public void setLevel4(final BigDecimal level4) {
		this.level4 = level4; 
	}
 
	@Override
	public BigDecimal getDiscount4() {
		return this.discount4;
	}
 
	@Override
	public void setDiscount4(final BigDecimal discount4) {
		this.discount4 = discount4; 
	}
 
	@Override
	public BigDecimal getLevel5() {
		return this.level5;
	}
 
	@Override
	public void setLevel5(final BigDecimal level5) {
		this.level5 = level5; 
	}
 
	@Override
	public BigDecimal getDiscount5() {
		return this.discount5;
	}
 
	@Override
	public void setDiscount5(final BigDecimal discount5) {
		this.discount5 = discount5; 
	}
 
}
