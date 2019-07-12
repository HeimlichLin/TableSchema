package com.doc.common.bean; 
 
public class HGrntitemDo { 
 
	public enum COLUMNS { 
		BONDNO("null"), 
		REFBILLNO("null"), 
		DECLNO("null"), 
		ITEMNO("null"), 
		STRPOST("null"), 
		DECLTYPE("null"), 
		STRTYPE("null"), 
		STRDATE("null"), 
		STRQTY("null"), 
		VALUEAMT("null"), 
		DUTYRATE("null"), 
		AVLGRNTAMT("null"), 
		ODECLNO("null"), 
		PRDTNO("null"), 
		SERIALNO("null"), 
		RMKS("null"), 
		COMDTAXRATE("null"), 
		VATAXRATE("null"), 
		DECLQTY("null"), 
		TAXAMT("null"), 
		ISEVAL("null"), 
		OITEMNO("null"), 
		CCCCODE("null"), 
		ITEM("null"), 
		UPDTIME("null") 
		; 
		final String name; 
	 
		private COLUMNS(final String name) { 
			this.name = name; 
		} 
	 
		public String getName() { 
			return this.name; 
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
	private String updtime; 
	
	public String getBondno() { 
		return bondno; 
	} 
 
	public void setBondno(String bondno) { 
		this.bondno = bondno; 
	} 
 
	public String getRefbillno() { 
		return refbillno; 
	} 
 
	public void setRefbillno(String refbillno) { 
		this.refbillno = refbillno; 
	} 
 
	public String getDeclno() { 
		return declno; 
	} 
 
	public void setDeclno(String declno) { 
		this.declno = declno; 
	} 
 
	public BigDecimal getItemno() { 
		return itemno; 
	} 
 
	public void setItemno(BigDecimal itemno) { 
		this.itemno = itemno; 
	} 
 
	public String getStrpost() { 
		return strpost; 
	} 
 
	public void setStrpost(String strpost) { 
		this.strpost = strpost; 
	} 
 
	public String getDecltype() { 
		return decltype; 
	} 
 
	public void setDecltype(String decltype) { 
		this.decltype = decltype; 
	} 
 
	public String getStrtype() { 
		return strtype; 
	} 
 
	public void setStrtype(String strtype) { 
		this.strtype = strtype; 
	} 
 
	public String getStrdate() { 
		return strdate; 
	} 
 
	public void setStrdate(String strdate) { 
		this.strdate = strdate; 
	} 
 
	public BigDecimal getStrqty() { 
		return strqty; 
	} 
 
	public void setStrqty(BigDecimal strqty) { 
		this.strqty = strqty; 
	} 
 
	public BigDecimal getValueamt() { 
		return valueamt; 
	} 
 
	public void setValueamt(BigDecimal valueamt) { 
		this.valueamt = valueamt; 
	} 
 
	public BigDecimal getDutyrate() { 
		return dutyrate; 
	} 
 
	public void setDutyrate(BigDecimal dutyrate) { 
		this.dutyrate = dutyrate; 
	} 
 
	public BigDecimal getAvlgrntamt() { 
		return avlgrntamt; 
	} 
 
	public void setAvlgrntamt(BigDecimal avlgrntamt) { 
		this.avlgrntamt = avlgrntamt; 
	} 
 
	public String getOdeclno() { 
		return odeclno; 
	} 
 
	public void setOdeclno(String odeclno) { 
		this.odeclno = odeclno; 
	} 
 
	public String getPrdtno() { 
		return prdtno; 
	} 
 
	public void setPrdtno(String prdtno) { 
		this.prdtno = prdtno; 
	} 
 
	public String getSerialno() { 
		return serialno; 
	} 
 
	public void setSerialno(String serialno) { 
		this.serialno = serialno; 
	} 
 
	public String getRmks() { 
		return rmks; 
	} 
 
	public void setRmks(String rmks) { 
		this.rmks = rmks; 
	} 
 
	public BigDecimal getComdtaxrate() { 
		return comdtaxrate; 
	} 
 
	public void setComdtaxrate(BigDecimal comdtaxrate) { 
		this.comdtaxrate = comdtaxrate; 
	} 
 
	public BigDecimal getVataxrate() { 
		return vataxrate; 
	} 
 
	public void setVataxrate(BigDecimal vataxrate) { 
		this.vataxrate = vataxrate; 
	} 
 
	public BigDecimal getDeclqty() { 
		return declqty; 
	} 
 
	public void setDeclqty(BigDecimal declqty) { 
		this.declqty = declqty; 
	} 
 
	public BigDecimal getTaxamt() { 
		return taxamt; 
	} 
 
	public void setTaxamt(BigDecimal taxamt) { 
		this.taxamt = taxamt; 
	} 
 
	public String getIseval() { 
		return iseval; 
	} 
 
	public void setIseval(String iseval) { 
		this.iseval = iseval; 
	} 
 
	public BigDecimal getOitemno() { 
		return oitemno; 
	} 
 
	public void setOitemno(BigDecimal oitemno) { 
		this.oitemno = oitemno; 
	} 
 
	public String getCcccode() { 
		return ccccode; 
	} 
 
	public void setCcccode(String ccccode) { 
		this.ccccode = ccccode; 
	} 
 
	public BigDecimal getItem() { 
		return item; 
	} 
 
	public void setItem(BigDecimal item) { 
		this.item = item; 
	} 
 
	public String getUpdtime() { 
		return updtime; 
	} 
 
	public void setUpdtime(String updtime) { 
		this.updtime = updtime; 
	} 
 
} 
