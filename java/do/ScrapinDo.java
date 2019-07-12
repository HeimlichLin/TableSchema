package com.doc.common.bean; 
 
public class ScrapinDo { 
 
	public enum COLUMNS { 
		BONDNO("null"), 
		SCRAPNO("null"), 
		ITEM("null"), 
		PRDTNO("null"), 
		CCCCODE("null"), 
		DESCRIP("null"), 
		QTY("null"), 
		UNIT("null"), 
		UNITPRICE("null"), 
		NWGHT("null"), 
		GROSS("null"), 
		DECLNO("null"), 
		VALUEAMT("null"), 
		INPOST("null") 
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
	private String scrapno; 
	private BigDecimal item; 
	private String prdtno; 
	private String ccccode; 
	private String descrip; 
	private BigDecimal qty; 
	private String unit; 
	private BigDecimal unitprice; 
	private BigDecimal nwght; 
	private BigDecimal gross; 
	private String declno; 
	private BigDecimal valueamt; 
	private String inpost; 
	
	public String getBondno() { 
		return bondno; 
	} 
 
	public void setBondno(String bondno) { 
		this.bondno = bondno; 
	} 
 
	public String getScrapno() { 
		return scrapno; 
	} 
 
	public void setScrapno(String scrapno) { 
		this.scrapno = scrapno; 
	} 
 
	public BigDecimal getItem() { 
		return item; 
	} 
 
	public void setItem(BigDecimal item) { 
		this.item = item; 
	} 
 
	public String getPrdtno() { 
		return prdtno; 
	} 
 
	public void setPrdtno(String prdtno) { 
		this.prdtno = prdtno; 
	} 
 
	public String getCcccode() { 
		return ccccode; 
	} 
 
	public void setCcccode(String ccccode) { 
		this.ccccode = ccccode; 
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
 
	public BigDecimal getUnitprice() { 
		return unitprice; 
	} 
 
	public void setUnitprice(BigDecimal unitprice) { 
		this.unitprice = unitprice; 
	} 
 
	public BigDecimal getNwght() { 
		return nwght; 
	} 
 
	public void setNwght(BigDecimal nwght) { 
		this.nwght = nwght; 
	} 
 
	public BigDecimal getGross() { 
		return gross; 
	} 
 
	public void setGross(BigDecimal gross) { 
		this.gross = gross; 
	} 
 
	public String getDeclno() { 
		return declno; 
	} 
 
	public void setDeclno(String declno) { 
		this.declno = declno; 
	} 
 
	public BigDecimal getValueamt() { 
		return valueamt; 
	} 
 
	public void setValueamt(BigDecimal valueamt) { 
		this.valueamt = valueamt; 
	} 
 
	public String getInpost() { 
		return inpost; 
	} 
 
	public void setInpost(String inpost) { 
		this.inpost = inpost; 
	} 
 
} 
