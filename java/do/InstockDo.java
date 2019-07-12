package com.doc.common.bean; 
 
public class InstockDo { 
 
	public enum COLUMNS { 
		BONDNO("null"), 
		STOCKNO("null"), 
		INDATE("null"), 
		DECLNO("null"), 
		DECLTYPE("null"), 
		INVOICE("null"), 
		MANIFNO("null"), 
		VESSELNO("null"), 
		GDSTYPE("null"), 
		OPTYPE("null"), 
		PRDTTYPE("null"), 
		REFBILLNO("null"), 
		CTMCODE("null"), 
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
	private String stockno; 
	private String indate; 
	private String declno; 
	private String decltype; 
	private String invoice; 
	private String manifno; 
	private String vesselno; 
	private String gdstype; 
	private String optype; 
	private String prdttype; 
	private String refbillno; 
	private String ctmcode; 
	private String updtime; 
	
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
 
	public String getIndate() { 
		return indate; 
	} 
 
	public void setIndate(String indate) { 
		this.indate = indate; 
	} 
 
	public String getDeclno() { 
		return declno; 
	} 
 
	public void setDeclno(String declno) { 
		this.declno = declno; 
	} 
 
	public String getDecltype() { 
		return decltype; 
	} 
 
	public void setDecltype(String decltype) { 
		this.decltype = decltype; 
	} 
 
	public String getInvoice() { 
		return invoice; 
	} 
 
	public void setInvoice(String invoice) { 
		this.invoice = invoice; 
	} 
 
	public String getManifno() { 
		return manifno; 
	} 
 
	public void setManifno(String manifno) { 
		this.manifno = manifno; 
	} 
 
	public String getVesselno() { 
		return vesselno; 
	} 
 
	public void setVesselno(String vesselno) { 
		this.vesselno = vesselno; 
	} 
 
	public String getGdstype() { 
		return gdstype; 
	} 
 
	public void setGdstype(String gdstype) { 
		this.gdstype = gdstype; 
	} 
 
	public String getOptype() { 
		return optype; 
	} 
 
	public void setOptype(String optype) { 
		this.optype = optype; 
	} 
 
	public String getPrdttype() { 
		return prdttype; 
	} 
 
	public void setPrdttype(String prdttype) { 
		this.prdttype = prdttype; 
	} 
 
	public String getRefbillno() { 
		return refbillno; 
	} 
 
	public void setRefbillno(String refbillno) { 
		this.refbillno = refbillno; 
	} 
 
	public String getCtmcode() { 
		return ctmcode; 
	} 
 
	public void setCtmcode(String ctmcode) { 
		this.ctmcode = ctmcode; 
	} 
 
	public String getUpdtime() { 
		return updtime; 
	} 
 
	public void setUpdtime(String updtime) { 
		this.updtime = updtime; 
	} 
 
} 
