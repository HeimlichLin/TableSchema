package com.doc.common.bean; 
 
public class OutstockdetailDo { 
 
	public enum COLUMNS { 
		BONDNO("null"), 
		OUTSTRNO("null"), 
		ITEM("null"), 
		PRDTNO("null"), 
		DESCRIP("null"), 
		UNIT("null"), 
		OUTQTY("null"), 
		OUTPOST("null"), 
		STOCKNO("null"), 
		ODECLNO("null"), 
		OITEMNO("null"), 
		RMK("null"), 
		UPDTIME("null"), 
		OUTSTATUS("null"), 
		NWGHT("null"), 
		OREFBILLNO("null"), 
		OITEM("null"), 
		RSTRQTY("null"), 
		UNINQTY("null") 
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
	private String outstrno; 
	private String item; 
	private String prdtno; 
	private String descrip; 
	private String unit; 
	private BigDecimal outqty; 
	private String outpost; 
	private String stockno; 
	private String odeclno; 
	private BigDecimal oitemno; 
	private String rmk; 
	private String updtime; 
	private String outstatus; 
	private BigDecimal nwght; 
	private String orefbillno; 
	private BigDecimal oitem; 
	private BigDecimal rstrqty; 
	private BigDecimal uninqty; 
	
	public String getBondno() { 
		return bondno; 
	} 
 
	public void setBondno(String bondno) { 
		this.bondno = bondno; 
	} 
 
	public String getOutstrno() { 
		return outstrno; 
	} 
 
	public void setOutstrno(String outstrno) { 
		this.outstrno = outstrno; 
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
 
	public String getUnit() { 
		return unit; 
	} 
 
	public void setUnit(String unit) { 
		this.unit = unit; 
	} 
 
	public BigDecimal getOutqty() { 
		return outqty; 
	} 
 
	public void setOutqty(BigDecimal outqty) { 
		this.outqty = outqty; 
	} 
 
	public String getOutpost() { 
		return outpost; 
	} 
 
	public void setOutpost(String outpost) { 
		this.outpost = outpost; 
	} 
 
	public String getStockno() { 
		return stockno; 
	} 
 
	public void setStockno(String stockno) { 
		this.stockno = stockno; 
	} 
 
	public String getOdeclno() { 
		return odeclno; 
	} 
 
	public void setOdeclno(String odeclno) { 
		this.odeclno = odeclno; 
	} 
 
	public BigDecimal getOitemno() { 
		return oitemno; 
	} 
 
	public void setOitemno(BigDecimal oitemno) { 
		this.oitemno = oitemno; 
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
 
	public String getOutstatus() { 
		return outstatus; 
	} 
 
	public void setOutstatus(String outstatus) { 
		this.outstatus = outstatus; 
	} 
 
	public BigDecimal getNwght() { 
		return nwght; 
	} 
 
	public void setNwght(BigDecimal nwght) { 
		this.nwght = nwght; 
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
 
	public BigDecimal getRstrqty() { 
		return rstrqty; 
	} 
 
	public void setRstrqty(BigDecimal rstrqty) { 
		this.rstrqty = rstrqty; 
	} 
 
	public BigDecimal getUninqty() { 
		return uninqty; 
	} 
 
	public void setUninqty(BigDecimal uninqty) { 
		this.uninqty = uninqty; 
	} 
 
} 
