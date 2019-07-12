package com.doc.common.bean; 
 
public class RMonthly1Do { 
 
	public enum COLUMNS { 
		SESSIONID("null"), 
		BONDNO("null"), 
		GDSTYPE("null"), 
		PRDTNO("null"), 
		DECLNO("null"), 
		ITEMNO("null"), 
		STOCKNO("null"), 
		INDATE("null"), 
		UNIT("null"), 
		RQTY("null"), 
		POST("null"), 
		BALANCE("null"), 
		REFBILLNO("null"), 
		DESCRIP("null"), 
		DECLTYPE("null"), 
		ID("null"), 
		STOCKTYPE("null"), 
		RLSTIME("null"), 
		I_SEQUENCE("null"), 
		MODEL("null"), 
		SPEC("null"), 
		CTMCODE("null"), 
		INRMKS2("null"), 
		ITEM("null") 
		; 
		final String name; 
	 
		private COLUMNS(final String name) { 
			this.name = name; 
		} 
	 
		public String getName() { 
			return this.name; 
		} 
	} 
 
	private String sessionid; 
	private String bondno; 
	private String gdstype; 
	private String prdtno; 
	private String declno; 
	private BigDecimal itemno; 
	private String stockno; 
	private String indate; 
	private String unit; 
	private BigDecimal rqty; 
	private String post; 
	private BigDecimal balance; 
	private String refbillno; 
	private String descrip; 
	private String decltype; 
	private BigDecimal id; 
	private String stocktype; 
	private String rlstime; 
	private BigDecimal iSequence; 
	private String model; 
	private String spec; 
	private String ctmcode; 
	private String inrmks2; 
	private BigDecimal item; 
	
	public String getSessionid() { 
		return sessionid; 
	} 
 
	public void setSessionid(String sessionid) { 
		this.sessionid = sessionid; 
	} 
 
	public String getBondno() { 
		return bondno; 
	} 
 
	public void setBondno(String bondno) { 
		this.bondno = bondno; 
	} 
 
	public String getGdstype() { 
		return gdstype; 
	} 
 
	public void setGdstype(String gdstype) { 
		this.gdstype = gdstype; 
	} 
 
	public String getPrdtno() { 
		return prdtno; 
	} 
 
	public void setPrdtno(String prdtno) { 
		this.prdtno = prdtno; 
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
 
	public String getUnit() { 
		return unit; 
	} 
 
	public void setUnit(String unit) { 
		this.unit = unit; 
	} 
 
	public BigDecimal getRqty() { 
		return rqty; 
	} 
 
	public void setRqty(BigDecimal rqty) { 
		this.rqty = rqty; 
	} 
 
	public String getPost() { 
		return post; 
	} 
 
	public void setPost(String post) { 
		this.post = post; 
	} 
 
	public BigDecimal getBalance() { 
		return balance; 
	} 
 
	public void setBalance(BigDecimal balance) { 
		this.balance = balance; 
	} 
 
	public String getRefbillno() { 
		return refbillno; 
	} 
 
	public void setRefbillno(String refbillno) { 
		this.refbillno = refbillno; 
	} 
 
	public String getDescrip() { 
		return descrip; 
	} 
 
	public void setDescrip(String descrip) { 
		this.descrip = descrip; 
	} 
 
	public String getDecltype() { 
		return decltype; 
	} 
 
	public void setDecltype(String decltype) { 
		this.decltype = decltype; 
	} 
 
	public BigDecimal getId() { 
		return id; 
	} 
 
	public void setId(BigDecimal id) { 
		this.id = id; 
	} 
 
	public String getStocktype() { 
		return stocktype; 
	} 
 
	public void setStocktype(String stocktype) { 
		this.stocktype = stocktype; 
	} 
 
	public String getRlstime() { 
		return rlstime; 
	} 
 
	public void setRlstime(String rlstime) { 
		this.rlstime = rlstime; 
	} 
 
	public BigDecimal getISequence() { 
		return iSequence; 
	} 
 
	public void setISequence(BigDecimal iSequence) { 
		this.iSequence = iSequence; 
	} 
 
	public String getModel() { 
		return model; 
	} 
 
	public void setModel(String model) { 
		this.model = model; 
	} 
 
	public String getSpec() { 
		return spec; 
	} 
 
	public void setSpec(String spec) { 
		this.spec = spec; 
	} 
 
	public String getCtmcode() { 
		return ctmcode; 
	} 
 
	public void setCtmcode(String ctmcode) { 
		this.ctmcode = ctmcode; 
	} 
 
	public String getInrmks2() { 
		return inrmks2; 
	} 
 
	public void setInrmks2(String inrmks2) { 
		this.inrmks2 = inrmks2; 
	} 
 
	public BigDecimal getItem() { 
		return item; 
	} 
 
	public void setItem(BigDecimal item) { 
		this.item = item; 
	} 
 
} 
