package com.doc.common.po.impl; 
 
public class TmpGrntitemPo implements ITmpGrntitemPo {
 
	public enum COLUMNS {
		BONDNO("null"), //
		REFBILLNO("null"), //
		DECLNO("null"), //
		ITEMNO("null"), //
		STRPOST("null"), //
		DECLTYPE("null"), //
		STRTYPE("null"), //
		STRDATE("null"), //
		STRQTY("null"), //
		VALUEAMT("null"), //
		DUTYRATE("null"), //
		AVLGRNTAMT("null"), //
		ODECLNO("null"), //
		PRDTNO("null"), //
		SERIALNO("null"), //
		RMKS("null"), //
		COMDTAXRATE("null"), //
		VATAXRATE("null"), //
		DECLQTY("null"), //
		TAXAMT("null"), //
		ISEVAL("null"), //
		OITEMNO("null"), //
		CCCCODE("null"), //
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
 
	private String bondno;
	private String refbillno;
	private String declno;
	private BigDecimal itemno;
	private String strpost;
	private String decltype;
	private String strtype;
	private String strdate;
	private BigDecimal strqty;
	private BigDecimal valueamt;
	private BigDecimal dutyrate;
	private BigDecimal avlgrntamt;
	private String odeclno;
	private String prdtno;
	private String serialno;
	private String rmks;
	private BigDecimal comdtaxrate;
	private BigDecimal vataxrate;
	private BigDecimal declqty;
	private BigDecimal taxamt;
	private String iseval;
	private BigDecimal oitemno;
	private String ccccode;
	private BigDecimal item;

	@Override
	public String getBondno() {
		return this.bondno;
	}
 
	@Override
	public void setBondno(final String bondno) {
		this.bondno = bondno; 
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
	public String getStrpost() {
		return this.strpost;
	}
 
	@Override
	public void setStrpost(final String strpost) {
		this.strpost = strpost; 
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
	public String getStrtype() {
		return this.strtype;
	}
 
	@Override
	public void setStrtype(final String strtype) {
		this.strtype = strtype; 
	}
 
	@Override
	public String getStrdate() {
		return this.strdate;
	}
 
	@Override
	public void setStrdate(final String strdate) {
		this.strdate = strdate; 
	}
 
	@Override
	public BigDecimal getStrqty() {
		return this.strqty;
	}
 
	@Override
	public void setStrqty(final BigDecimal strqty) {
		this.strqty = strqty; 
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
	public BigDecimal getDutyrate() {
		return this.dutyrate;
	}
 
	@Override
	public void setDutyrate(final BigDecimal dutyrate) {
		this.dutyrate = dutyrate; 
	}
 
	@Override
	public BigDecimal getAvlgrntamt() {
		return this.avlgrntamt;
	}
 
	@Override
	public void setAvlgrntamt(final BigDecimal avlgrntamt) {
		this.avlgrntamt = avlgrntamt; 
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
	public String getPrdtno() {
		return this.prdtno;
	}
 
	@Override
	public void setPrdtno(final String prdtno) {
		this.prdtno = prdtno; 
	}
 
	@Override
	public String getSerialno() {
		return this.serialno;
	}
 
	@Override
	public void setSerialno(final String serialno) {
		this.serialno = serialno; 
	}
 
	@Override
	public String getRmks() {
		return this.rmks;
	}
 
	@Override
	public void setRmks(final String rmks) {
		this.rmks = rmks; 
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
	public BigDecimal getVataxrate() {
		return this.vataxrate;
	}
 
	@Override
	public void setVataxrate(final BigDecimal vataxrate) {
		this.vataxrate = vataxrate; 
	}
 
	@Override
	public BigDecimal getDeclqty() {
		return this.declqty;
	}
 
	@Override
	public void setDeclqty(final BigDecimal declqty) {
		this.declqty = declqty; 
	}
 
	@Override
	public BigDecimal getTaxamt() {
		return this.taxamt;
	}
 
	@Override
	public void setTaxamt(final BigDecimal taxamt) {
		this.taxamt = taxamt; 
	}
 
	@Override
	public String getIseval() {
		return this.iseval;
	}
 
	@Override
	public void setIseval(final String iseval) {
		this.iseval = iseval; 
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
	public BigDecimal getItem() {
		return this.item;
	}
 
	@Override
	public void setItem(final BigDecimal item) {
		this.item = item; 
	}
 
}
