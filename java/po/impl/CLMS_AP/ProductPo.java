package com.doc.common.po.impl; 
 
public class ProductPo implements IProductPo {
 
	public enum COLUMNS {
		BONDNO("監管編號"), //
		CTMCODE("客戶編碼"), //
		PRDTNO("料號"), //
		DESCRIP("貨名"), //
		UNIT("單位"), //
		REFPRDTNO("交易方料號"), //
		REVDATE("修改日期"), //
		CCCCODE("商品分類號列"), //
		DUTYRATE("稅率"), //
		COMDTAXRATE("貨物稅率"), //
		BRAND("廠牌"), //
		MODEL("型號"), //
		SPEC("規格"), //
		UPRICE("單價"), //
		CUR("貨幣"), //
		CARRYFREEQTY("結轉免稅數量（帳冊）"), //
		CARRYDUTYQTY("結轉課稅數量(帳冊)") //
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
	private String descrip;
	private String unit;
	private String refprdtno;
	private String revdate;
	private String ccccode;
	private BigDecimal dutyrate;
	private BigDecimal comdtaxrate;
	private String brand;
	private String model;
	private String spec;
	private BigDecimal uprice;
	private String cur;
	private BigDecimal carryfreeqty;
	private BigDecimal carrydutyqty;

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
	public String getDescrip() {
		return this.descrip;
	}
 
	@Override
	public void setDescrip(final String descrip) {
		this.descrip = descrip; 
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
	public String getRefprdtno() {
		return this.refprdtno;
	}
 
	@Override
	public void setRefprdtno(final String refprdtno) {
		this.refprdtno = refprdtno; 
	}
 
	@Override
	public String getRevdate() {
		return this.revdate;
	}
 
	@Override
	public void setRevdate(final String revdate) {
		this.revdate = revdate; 
	}
 
	@Override
	public String getCcccode() {
		return this.ccccode;
	}
 
	@Override
	public void setCcccode(final String ccccode) {
		this.ccccode = ccccode; 
	}
 
	@Override
	public BigDecimal getDutyrate() {
		return this.dutyrate;
	}
 
	@Override
	public void setDutyrate(final BigDecimal dutyrate) {
		this.dutyrate = dutyrate; 
	}
 
	@Override
	public BigDecimal getComdtaxrate() {
		return this.comdtaxrate;
	}
 
	@Override
	public void setComdtaxrate(final BigDecimal comdtaxrate) {
		this.comdtaxrate = comdtaxrate; 
	}
 
	@Override
	public String getBrand() {
		return this.brand;
	}
 
	@Override
	public void setBrand(final String brand) {
		this.brand = brand; 
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
	public BigDecimal getUprice() {
		return this.uprice;
	}
 
	@Override
	public void setUprice(final BigDecimal uprice) {
		this.uprice = uprice; 
	}
 
	@Override
	public String getCur() {
		return this.cur;
	}
 
	@Override
	public void setCur(final String cur) {
		this.cur = cur; 
	}
 
	@Override
	public BigDecimal getCarryfreeqty() {
		return this.carryfreeqty;
	}
 
	@Override
	public void setCarryfreeqty(final BigDecimal carryfreeqty) {
		this.carryfreeqty = carryfreeqty; 
	}
 
	@Override
	public BigDecimal getCarrydutyqty() {
		return this.carrydutyqty;
	}
 
	@Override
	public void setCarrydutyqty(final BigDecimal carrydutyqty) {
		this.carrydutyqty = carrydutyqty; 
	}
 
}
