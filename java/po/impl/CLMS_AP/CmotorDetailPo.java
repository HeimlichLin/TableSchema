package com.doc.common.po.impl; 
 
public class CmotorDetailPo implements ICmotorDetailPo {
 
	public enum COLUMNS {
		DOCNO("null"), //
		ITEM("null"), //
		FACTORY("null"), //
		INPOST("null"), //
		STRTYPE("null"), //
		MVTTYPE("null"), //
		PRODUCTTYPE("null"), //
		PRODUCTGROUP("null"), //
		PRDTNO("null"), //
		DESCRIP("null"), //
		QTY("null"), //
		UNIT("null"), //
		REFERENCE("null"), //
		VENDOR("null"), //
		ORDERDOC("null"), //
		ORIDOCNO("null"), //
		DOCHEAD("null"), //
		REFDATE("null"), //
		CONTROLNO("null"), //
		INSTATUS("null"), //
		UPDTIME("null"), //
		OQTY("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String docno;
	private BigDecimal item;
	private String factory;
	private String inpost;
	private String strtype;
	private String mvttype;
	private String producttype;
	private String productgroup;
	private String prdtno;
	private String descrip;
	private BigDecimal qty;
	private String unit;
	private String reference;
	private String vendor;
	private String orderdoc;
	private String oridocno;
	private String dochead;
	private String refdate;
	private String controlno;
	private String instatus;
	private String updtime;
	private BigDecimal oqty;

	@Override
	public String getDocno() {
		return this.docno;
	}
 
	@Override
	public void setDocno(final String docno) {
		this.docno = docno; 
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
	public String getFactory() {
		return this.factory;
	}
 
	@Override
	public void setFactory(final String factory) {
		this.factory = factory; 
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
	public String getStrtype() {
		return this.strtype;
	}
 
	@Override
	public void setStrtype(final String strtype) {
		this.strtype = strtype; 
	}
 
	@Override
	public String getMvttype() {
		return this.mvttype;
	}
 
	@Override
	public void setMvttype(final String mvttype) {
		this.mvttype = mvttype; 
	}
 
	@Override
	public String getProducttype() {
		return this.producttype;
	}
 
	@Override
	public void setProducttype(final String producttype) {
		this.producttype = producttype; 
	}
 
	@Override
	public String getProductgroup() {
		return this.productgroup;
	}
 
	@Override
	public void setProductgroup(final String productgroup) {
		this.productgroup = productgroup; 
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
	public String getReference() {
		return this.reference;
	}
 
	@Override
	public void setReference(final String reference) {
		this.reference = reference; 
	}
 
	@Override
	public String getVendor() {
		return this.vendor;
	}
 
	@Override
	public void setVendor(final String vendor) {
		this.vendor = vendor; 
	}
 
	@Override
	public String getOrderdoc() {
		return this.orderdoc;
	}
 
	@Override
	public void setOrderdoc(final String orderdoc) {
		this.orderdoc = orderdoc; 
	}
 
	@Override
	public String getOridocno() {
		return this.oridocno;
	}
 
	@Override
	public void setOridocno(final String oridocno) {
		this.oridocno = oridocno; 
	}
 
	@Override
	public String getDochead() {
		return this.dochead;
	}
 
	@Override
	public void setDochead(final String dochead) {
		this.dochead = dochead; 
	}
 
	@Override
	public String getRefdate() {
		return this.refdate;
	}
 
	@Override
	public void setRefdate(final String refdate) {
		this.refdate = refdate; 
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
	public String getInstatus() {
		return this.instatus;
	}
 
	@Override
	public void setInstatus(final String instatus) {
		this.instatus = instatus; 
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
	public BigDecimal getOqty() {
		return this.oqty;
	}
 
	@Override
	public void setOqty(final BigDecimal oqty) {
		this.oqty = oqty; 
	}
 
}
