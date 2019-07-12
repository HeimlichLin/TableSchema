package com.doc.common.bean; 
 
public class ScrapitemDo { 
 
	public enum COLUMNS { 
		BONDNO("null"), 
		SCRAPNO("null"), 
		ITEM("null"), 
		PRDTNO("null"), 
		DESCRIP("null"), 
		PRDTQTY("null"), 
		UNITPRICE("null"), 
		NET("null"), 
		ODECLNO("null"), 
		OITEMNO("null"), 
		IMPORTDATE("null"), 
		REMRKS("null"), 
		PRDTUNIT("null"), 
		OUTPOST("null"), 
		BOMNO("null"), 
		ROWPRDTNO("null"), 
		ROWQTY("null") 
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
	private String descrip; 
	private BigDecimal prdtqty; 
	private BigDecimal unitprice; 
	private BigDecimal net; 
	private String odeclno; 
	private BigDecimal oitemno; 
	private String importdate; 
	private String remrks; 
	private String prdtunit; 
	private String outpost; 
	private String bomno; 
	private String rowprdtno; 
	private BigDecimal rowqty; 
	
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
 
	public String getDescrip() { 
		return descrip; 
	} 
 
	public void setDescrip(String descrip) { 
		this.descrip = descrip; 
	} 
 
	public BigDecimal getPrdtqty() { 
		return prdtqty; 
	} 
 
	public void setPrdtqty(BigDecimal prdtqty) { 
		this.prdtqty = prdtqty; 
	} 
 
	public BigDecimal getUnitprice() { 
		return unitprice; 
	} 
 
	public void setUnitprice(BigDecimal unitprice) { 
		this.unitprice = unitprice; 
	} 
 
	public BigDecimal getNet() { 
		return net; 
	} 
 
	public void setNet(BigDecimal net) { 
		this.net = net; 
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
 
	public String getImportdate() { 
		return importdate; 
	} 
 
	public void setImportdate(String importdate) { 
		this.importdate = importdate; 
	} 
 
	public String getRemrks() { 
		return remrks; 
	} 
 
	public void setRemrks(String remrks) { 
		this.remrks = remrks; 
	} 
 
	public String getPrdtunit() { 
		return prdtunit; 
	} 
 
	public void setPrdtunit(String prdtunit) { 
		this.prdtunit = prdtunit; 
	} 
 
	public String getOutpost() { 
		return outpost; 
	} 
 
	public void setOutpost(String outpost) { 
		this.outpost = outpost; 
	} 
 
	public String getBomno() { 
		return bomno; 
	} 
 
	public void setBomno(String bomno) { 
		this.bomno = bomno; 
	} 
 
	public String getRowprdtno() { 
		return rowprdtno; 
	} 
 
	public void setRowprdtno(String rowprdtno) { 
		this.rowprdtno = rowprdtno; 
	} 
 
	public BigDecimal getRowqty() { 
		return rowqty; 
	} 
 
	public void setRowqty(BigDecimal rowqty) { 
		this.rowqty = rowqty; 
	} 
 
} 
