package com.doc.common.bean; 
 
public class InstockdetailDo { 
 
	public enum COLUMNS { 
		BONDNO("null"), 
		STOCKNO("null"), 
		ITEM("null"), 
		PRDTNO("null"), 
		DESCRIP("null"), 
		SPEC("null"), 
		MODEL("null"), 
		UNIT("null"), 
		INQTY("null"), 
		INPOST("null"), 
		RMK("null"), 
		UPDTIME("null"), 
		INDATE("null"), 
		INSTATUS("null"), 
		BALANCE("null"), 
		NWGHT("null"), 
		DECLNO("null"), 
		ITEMNO("null"), 
		OUTSTRNO("null"), 
		OITEM("null"), 
		DECLTYPE("null") 
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
	private String stockno; 
	private String item; 
	private String prdtno; 
	private String descrip; 
	private String spec; 
	private String model; 
	private String unit; 
	private BigDecimal inqty; 
	private String inpost; 
	private String rmk; 
	private String updtime; 
	private String indate; 
	private String instatus; 
	private BigDecimal balance; 
	private BigDecimal nwght; 
	private String declno; 
	private BigDecimal itemno; 
	private String outstrno; 
	private BigDecimal oitem; 
	private String decltype; 
	
	public String getBondno() { 
		return bondno; 
	} 
 
	public void setBondno(String bondno) { 
		this.bondno = bondno; 
	} 
 
	public String getStockno() { 
		return stockno; 
	} 
 
	public void setStockno(String stockno) { 
		this.stockno = stockno; 
	} 
 
	public String getItem() { 
		return item; 
	} 
 
	public void setItem(String item) { 
		this.item = item; 
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
 
	public String getSpec() { 
		return spec; 
	} 
 
	public void setSpec(String spec) { 
		this.spec = spec; 
	} 
 
	public String getModel() { 
		return model; 
	} 
 
	public void setModel(String model) { 
		this.model = model; 
	} 
 
	public String getUnit() { 
		return unit; 
	} 
 
	public void setUnit(String unit) { 
		this.unit = unit; 
	} 
 
	public BigDecimal getInqty() { 
		return inqty; 
	} 
 
	public void setInqty(BigDecimal inqty) { 
		this.inqty = inqty; 
	} 
 
	public String getInpost() { 
		return inpost; 
	} 
 
	public void setInpost(String inpost) { 
		this.inpost = inpost; 
	} 
 
	public String getRmk() { 
		return rmk; 
	} 
 
	public void setRmk(String rmk) { 
		this.rmk = rmk; 
	} 
 
	public String getUpdtime() { 
		return updtime; 
	} 
 
	public void setUpdtime(String updtime) { 
		this.updtime = updtime; 
	} 
 
	public String getIndate() { 
		return indate; 
	} 
 
	public void setIndate(String indate) { 
		this.indate = indate; 
	} 
 
	public String getInstatus() { 
		return instatus; 
	} 
 
	public void setInstatus(String instatus) { 
		this.instatus = instatus; 
	} 
 
	public BigDecimal getBalance() { 
		return balance; 
	} 
 
	public void setBalance(BigDecimal balance) { 
		this.balance = balance; 
	} 
 
	public BigDecimal getNwght() { 
		return nwght; 
	} 
 
	public void setNwght(BigDecimal nwght) { 
		this.nwght = nwght; 
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
 
	public String getOutstrno() { 
		return outstrno; 
	} 
 
	public void setOutstrno(String outstrno) { 
		this.outstrno = outstrno; 
	} 
 
	public BigDecimal getOitem() { 
		return oitem; 
	} 
 
	public void setOitem(BigDecimal oitem) { 
		this.oitem = oitem; 
	} 
 
	public String getDecltype() { 
		return decltype; 
	} 
 
	public void setDecltype(String decltype) { 
		this.decltype = decltype; 
	} 
 
} 
