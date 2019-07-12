package com.doc.common.bean; 
 
public class StrcontainerDo { 
 
	public enum COLUMNS { 
		BONDNO("null"), 
		LISTNO("null"), 
		PASSNO("null"), 
		PASSDATE("null"), 
		CONTRNO("null"), 
		CONTRTYPE("null"), 
		TRANSMODE("null"), 
		PACKCODE("null"), 
		LOADQTY("null"), 
		SEALNO("null"), 
		SHSEALNO("null"), 
		OUTTIME("null"), 
		INTIME("null"), 
		CARCOMP("null"), 
		CARNO("null"), 
		DRIVER("null"), 
		IDNO("null"), 
		CNSTATUS("null"), 
		LOCCODE("null"), 
		DESTCODE("null"), 
		IETYPE("null") 
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
	private String listno; 
	private String passno; 
	private java.sql.Timestamp passdate; 
	private String contrno; 
	private String contrtype; 
	private String transmode; 
	private String packcode; 
	private BigDecimal loadqty; 
	private String sealno; 
	private String shsealno; 
	private java.sql.Timestamp outtime; 
	private java.sql.Timestamp intime; 
	private String carcomp; 
	private String carno; 
	private String driver; 
	private String idno; 
	private String cnstatus; 
	private String loccode; 
	private String destcode; 
	private String ietype; 
	
	public String getBondno() { 
		return bondno; 
	} 
 
	public void setBondno(String bondno) { 
		this.bondno = bondno; 
	} 
 
	public String getListno() { 
		return listno; 
	} 
 
	public void setListno(String listno) { 
		this.listno = listno; 
	} 
 
	public String getPassno() { 
		return passno; 
	} 
 
	public void setPassno(String passno) { 
		this.passno = passno; 
	} 
 
	public java.sql.Timestamp getPassdate() { 
		return passdate; 
	} 
 
	public void setPassdate(java.sql.Timestamp passdate) { 
		this.passdate = passdate; 
	} 
 
	public String getContrno() { 
		return contrno; 
	} 
 
	public void setContrno(String contrno) { 
		this.contrno = contrno; 
	} 
 
	public String getContrtype() { 
		return contrtype; 
	} 
 
	public void setContrtype(String contrtype) { 
		this.contrtype = contrtype; 
	} 
 
	public String getTransmode() { 
		return transmode; 
	} 
 
	public void setTransmode(String transmode) { 
		this.transmode = transmode; 
	} 
 
	public String getPackcode() { 
		return packcode; 
	} 
 
	public void setPackcode(String packcode) { 
		this.packcode = packcode; 
	} 
 
	public BigDecimal getLoadqty() { 
		return loadqty; 
	} 
 
	public void setLoadqty(BigDecimal loadqty) { 
		this.loadqty = loadqty; 
	} 
 
	public String getSealno() { 
		return sealno; 
	} 
 
	public void setSealno(String sealno) { 
		this.sealno = sealno; 
	} 
 
	public String getShsealno() { 
		return shsealno; 
	} 
 
	public void setShsealno(String shsealno) { 
		this.shsealno = shsealno; 
	} 
 
	public java.sql.Timestamp getOuttime() { 
		return outtime; 
	} 
 
	public void setOuttime(java.sql.Timestamp outtime) { 
		this.outtime = outtime; 
	} 
 
	public java.sql.Timestamp getIntime() { 
		return intime; 
	} 
 
	public void setIntime(java.sql.Timestamp intime) { 
		this.intime = intime; 
	} 
 
	public String getCarcomp() { 
		return carcomp; 
	} 
 
	public void setCarcomp(String carcomp) { 
		this.carcomp = carcomp; 
	} 
 
	public String getCarno() { 
		return carno; 
	} 
 
	public void setCarno(String carno) { 
		this.carno = carno; 
	} 
 
	public String getDriver() { 
		return driver; 
	} 
 
	public void setDriver(String driver) { 
		this.driver = driver; 
	} 
 
	public String getIdno() { 
		return idno; 
	} 
 
	public void setIdno(String idno) { 
		this.idno = idno; 
	} 
 
	public String getCnstatus() { 
		return cnstatus; 
	} 
 
	public void setCnstatus(String cnstatus) { 
		this.cnstatus = cnstatus; 
	} 
 
	public String getLoccode() { 
		return loccode; 
	} 
 
	public void setLoccode(String loccode) { 
		this.loccode = loccode; 
	} 
 
	public String getDestcode() { 
		return destcode; 
	} 
 
	public void setDestcode(String destcode) { 
		this.destcode = destcode; 
	} 
 
	public String getIetype() { 
		return ietype; 
	} 
 
	public void setIetype(String ietype) { 
		this.ietype = ietype; 
	} 
 
} 
