package com.doc.common.bean; 
 
public class TestitemDo { 
 
	public enum COLUMNS { 
		BONDNO("null"), 
		TESTNO("null"), 
		PRDTNO("null"), 
		PRDTQTY("null"), 
		PRDTUNIT("null"), 
		RSTRQTY("null"), 
		UNITPRICE("null"), 
		UNINQTY("null"), 
		ITEM("null"), 
		DECLNO("null"), 
		ITEMNO("null"), 
		OREFBILLNO("null"), 
		OITEM("null"), 
		INPOST("null"), 
		DESCRIP("null"), 
		MOITEMNO("null") 
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
	private String testno; 
	private String prdtno; 
	private BigDecimal prdtqty; 
	private String prdtunit; 
	private BigDecimal rstrqty; 
	private BigDecimal unitprice; 
	private BigDecimal uninqty; 
	private BigDecimal item; 
	private String declno; 
	private BigDecimal itemno; 
	private String orefbillno; 
	private BigDecimal oitem; 
	private String inpost; 
	private String descrip; 
	private BigDecimal moitemno; 
	
	public String getBondno() { 
		return bondno; 
	} 
 
	public void setBondno(String bondno) { 
		this.bondno = bondno; 
	} 
 
	public String getTestno() { 
		return testno; 
	} 
 
	public void setTestno(String testno) { 
		this.testno = testno; 
	} 
 
	public String getPrdtno() { 
		return prdtno; 
	} 
 
	public void setPrdtno(String prdtno) { 
		this.prdtno = prdtno; 
	} 
 
	public BigDecimal getPrdtqty() { 
		return prdtqty; 
	} 
 
	public void setPrdtqty(BigDecimal prdtqty) { 
		this.prdtqty = prdtqty; 
	} 
 
	public String getPrdtunit() { 
		return prdtunit; 
	} 
 
	public void setPrdtunit(String prdtunit) { 
		this.prdtunit = prdtunit; 
	} 
 
	public BigDecimal getRstrqty() { 
		return rstrqty; 
	} 
 
	public void setRstrqty(BigDecimal rstrqty) { 
		this.rstrqty = rstrqty; 
	} 
 
	public BigDecimal getUnitprice() { 
		return unitprice; 
	} 
 
	public void setUnitprice(BigDecimal unitprice) { 
		this.unitprice = unitprice; 
	} 
 
	public BigDecimal getUninqty() { 
		return uninqty; 
	} 
 
	public void setUninqty(BigDecimal uninqty) { 
		this.uninqty = uninqty; 
	} 
 
	public BigDecimal getItem() { 
		return item; 
	} 
 
	public void setItem(BigDecimal item) { 
		this.item = item; 
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
 
	public String getOrefbillno() { 
		return orefbillno; 
	} 
 
	public void setOrefbillno(String orefbillno) { 
		this.orefbillno = orefbillno; 
	} 
 
	public BigDecimal getOitem() { 
		return oitem; 
	} 
 
	public void setOitem(BigDecimal oitem) { 
		this.oitem = oitem; 
	} 
 
	public String getInpost() { 
		return inpost; 
	} 
 
	public void setInpost(String inpost) { 
		this.inpost = inpost; 
	} 
 
	public String getDescrip() { 
		return descrip; 
	} 
 
	public void setDescrip(String descrip) { 
		this.descrip = descrip; 
	} 
 
	public BigDecimal getMoitemno() { 
		return moitemno; 
	} 
 
	public void setMoitemno(BigDecimal moitemno) { 
		this.moitemno = moitemno; 
	} 
 
} 
