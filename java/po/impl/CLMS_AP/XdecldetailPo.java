package com.doc.common.po.impl; 
 
public class XdecldetailPo implements IXdecldetailPo {
 
	public enum COLUMNS {
		BONDNO("監管編號"), //
		DECLNO("報單號碼"), //
		ITEMNO("報單項次"), //
		PRDTNO("料號"), //
		DESCRIP("貨名"), //
		BRAND("廠牌"), //
		MODEL("型號"), //
		SPEC("規格"), //
		NWGHT("淨重"), //
		QTY("數量"), //
		UNIT("單位"), //
		UPRICE("單價"), //
		CUR("幣別"), //
		VALUEAMT("完稅價格"), //
		VALUEQTY("完稅數量"), //
		DUTYRATE("進口稅率"), //
		UNITDUTY("null"), //
		ODECLNO("原報單號碼"), //
		OITEMNO("原報單項次"), //
		CCCCODE("商品分類號列"), //
		COMDTAXRATE("貨物稅率"), //
		STRTYPE("進出倉別") //
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
	private String declno;
	private BigDecimal itemno;
	private String prdtno;
	private String descrip;
	private String brand;
	private String model;
	private String spec;
	private BigDecimal nwght;
	private BigDecimal qty;
	private String unit;
	private BigDecimal uprice;
	private String cur;
	private BigDecimal valueamt;
	private BigDecimal valueqty;
	private BigDecimal dutyrate;
	private BigDecimal unitduty;
	private String odeclno;
	private BigDecimal oitemno;
	private String ccccode;
	private BigDecimal comdtaxrate;
	private String strtype;

	@Override
	public String getBondno() {
		return this.bondno;
	}
 
	@Override
	public void setBondno(final String bondno) {
		this.bondno = bondno; 
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
	public BigDecimal getNwght() {
		return this.nwght;
	}
 
	@Override
	public void setNwght(final BigDecimal nwght) {
		this.nwght = nwght; 
	}
 
	@Override
	public BigDecimal getQty() {
		return this.qty;
	}
 
	@Override
	public void setQty(final BigDecimal qty) {
		this.qty = qty; 
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
	public BigDecimal getValueamt() {
		return this.valueamt;
	}
 
	@Override
	public void setValueamt(final BigDecimal valueamt) {
		this.valueamt = valueamt; 
	}
 
	@Override
	public BigDecimal getValueqty() {
		return this.valueqty;
	}
 
	@Override
	public void setValueqty(final BigDecimal valueqty) {
		this.valueqty = valueqty; 
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
	public BigDecimal getUnitduty() {
		return this.unitduty;
	}
 
	@Override
	public void setUnitduty(final BigDecimal unitduty) {
		this.unitduty = unitduty; 
	}
 
	@Override
	public String getOdeclno() {
		return this.odeclno;
	}
 
	@Override
	public void setOdeclno(final String odeclno) {
		this.odeclno = odeclno; 
	}
 
	@Override
	public BigDecimal getOitemno() {
		return this.oitemno;
	}
 
	@Override
	public void setOitemno(final BigDecimal oitemno) {
		this.oitemno = oitemno; 
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
	public BigDecimal getComdtaxrate() {
		return this.comdtaxrate;
	}
 
	@Override
	public void setComdtaxrate(final BigDecimal comdtaxrate) {
		this.comdtaxrate = comdtaxrate; 
	}
 
	@Override
	public String getStrtype() {
		return this.strtype;
	}
 
	@Override
	public void setStrtype(final String strtype) {
		this.strtype = strtype; 
	}
 
}
