package com.doc.common.bean; 
 
public class CmotorDetailDo { 
 
	public enum COLUMNS { 
		DOCNO("null"), 
		ITEM("null"), 
		FACTORY("null"), 
		INPOST("null"), 
		STRTYPE("null"), 
		MVTTYPE("null"), 
		PRODUCTTYPE("null"), 
		PRODUCTGROUP("null"), 
		PRDTNO("null"), 
		DESCRIP("null"), 
		QTY("null"), 
		UNIT("null"), 
		REFERENCE("null"), 
		VENDOR("null"), 
		ORDERDOC("null"), 
		ORIDOCNO("null"), 
		DOCHEAD("null"), 
		REFDATE("null"), 
		CONTROLNO("null"), 
		INSTATUS("null"), 
		UPDTIME("null"), 
		OQTY("null") 
		; 
		final String name; 
	 
		private COLUMNS(final String name) { 
			this.name = name; 
		} 
	 
		public String getName() { 
			return this.name; 
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
	
	public String getDocno() { 
		return docno; 
	} 
 
	public void setDocno(String docno) { 
		this.docno = docno; 
	} 
 
	public BigDecimal getItem() { 
		return item; 
	} 
 
	public void setItem(BigDecimal item) { 
		this.item = item; 
	} 
 
	public String getFactory() { 
		return factory; 
	} 
 
	public void setFactory(String factory) { 
		this.factory = factory; 
	} 
 
	public String getInpost() { 
		return inpost; 
	} 
 
	public void setInpost(String inpost) { 
		this.inpost = inpost; 
	} 
 
	public String getStrtype() { 
		return strtype; 
	} 
 
	public void setStrtype(String strtype) { 
		this.strtype = strtype; 
	} 
 
	public String getMvttype() { 
		return mvttype; 
	} 
 
	public void setMvttype(String mvttype) { 
		this.mvttype = mvttype; 
	} 
 
	public String getProducttype() { 
		return producttype; 
	} 
 
	public void setProducttype(String producttype) { 
		this.producttype = producttype; 
	} 
 
	public String getProductgroup() { 
		return productgroup; 
	} 
 
	public void setProductgroup(String productgroup) { 
		this.productgroup = productgroup; 
	} 
 
	public String getPrdtno() { 
		return prdtno; 
	} 
 
	public void setPrdtno(String prdtno) { 
		this.prdtno = prdtno; 
	} 
 
	public String getDescrip() { 
		return descrip; 
	} 
 
	public void setDescrip(String descrip) { 
		this.descrip = descrip; 
	} 
 
	public BigDecimal getQty() { 
		return qty; 
	} 
 
	public void setQty(BigDecimal qty) { 
		this.qty = qty; 
	} 
 
	public String getUnit() { 
		return unit; 
	} 
 
	public void setUnit(String unit) { 
		this.unit = unit; 
	} 
 
	public String getReference() { 
		return reference; 
	} 
 
	public void setReference(String reference) { 
		this.reference = reference; 
	} 
 
	public String getVendor() { 
		return vendor; 
	} 
 
	public void setVendor(String vendor) { 
		this.vendor = vendor; 
	} 
 
	public String getOrderdoc() { 
		return orderdoc; 
	} 
 
	public void setOrderdoc(String orderdoc) { 
		this.orderdoc = orderdoc; 
	} 
 
	public String getOridocno() { 
		return oridocno; 
	} 
 
	public void setOridocno(String oridocno) { 
		this.oridocno = oridocno; 
	} 
 
	public String getDochead() { 
		return dochead; 
	} 
 
	public void setDochead(String dochead) { 
		this.dochead = dochead; 
	} 
 
	public String getRefdate() { 
		return refdate; 
	} 
 
	public void setRefdate(String refdate) { 
		this.refdate = refdate; 
	} 
 
	public String getControlno() { 
		return controlno; 
	} 
 
	public void setControlno(String controlno) { 
		this.controlno = controlno; 
	} 
 
	public String getInstatus() { 
		return instatus; 
	} 
 
	public void setInstatus(String instatus) { 
		this.instatus = instatus; 
	} 
 
	public String getUpdtime() { 
		return updtime; 
	} 
 
	public void setUpdtime(String updtime) { 
		this.updtime = updtime; 
	} 
 
	public BigDecimal getOqty() { 
		return oqty; 
	} 
 
	public void setOqty(BigDecimal oqty) { 
		this.oqty = oqty; 
	} 
 
} 
