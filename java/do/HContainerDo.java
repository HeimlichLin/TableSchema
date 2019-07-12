package com.doc.common.bean; 
 
public class HContainerDo { 
 
	public enum COLUMNS { 
		BONDNO("null"), 
		PASSNO("null"), 
		PASSDATE("null"), 
		DECLNO("null"), 
		CONTRNO("null"), 
		PCONTRNO("null"), 
		CONTRTYPE("null"), 
		TRANSMODE("null"), 
		SEALNO("null"), 
		SHSEALNO("null"), 
		PLATNO("null"), 
		OUTTIME("null"), 
		INTIME("null"), 
		CARCOMP("null"), 
		CARNO("null"), 
		DRIVER("null"), 
		DRVLNO("null"), 
		CNSTATUS("null"), 
		PACKCODE("null"), 
		DESTPORT("null"), 
		CNTGROSS("null"), 
		LISTNO("null"), 
		UPDTIME("null"), 
		MSGTYPE("null") 
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
	private String passno; 
	private String passdate; 
	private String declno; 
	private String contrno; 
	private String pcontrno; 
	private String contrtype; 
	private String transmode; 
	private String sealno; 
	private String shsealno; 
	private String platno; 
	private java.sql.Timestamp outtime; 
	private java.sql.Timestamp intime; 
	private String carcomp; 
	private String carno; 
	private String driver; 
	private String drvlno; 
	private String cnstatus; 
	private String packcode; 
	private String destport; 
	private BigDecimal cntgross; 
	private String listno; 
	private String updtime; 
	private String msgtype; 
	
	public String getBondno() { 
		return bondno; 
	} 
 
	public void setBondno(String bondno) { 
		this.bondno = bondno; 
	} 
 
	public String getPassno() { 
		return passno; 
	} 
 
	public void setPassno(String passno) { 
		this.passno = passno; 
	} 
 
	public String getPassdate() { 
		return passdate; 
	} 
 
	public void setPassdate(String passdate) { 
		this.passdate = passdate; 
	} 
 
	public String getDeclno() { 
		return declno; 
	} 
 
	public void setDeclno(String declno) { 
		this.declno = declno; 
	} 
 
	public String getContrno() { 
		return contrno; 
	} 
 
	public void setContrno(String contrno) { 
		this.contrno = contrno; 
	} 
 
	public String getPcontrno() { 
		return pcontrno; 
	} 
 
	public void setPcontrno(String pcontrno) { 
		this.pcontrno = pcontrno; 
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
 
	public String getPlatno() { 
		return platno; 
	} 
 
	public void setPlatno(String platno) { 
		this.platno = platno; 
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
 
	public String getDrvlno() { 
		return drvlno; 
	} 
 
	public void setDrvlno(String drvlno) { 
		this.drvlno = drvlno; 
	} 
 
	public String getCnstatus() { 
		return cnstatus; 
	} 
 
	public void setCnstatus(String cnstatus) { 
		this.cnstatus = cnstatus; 
	} 
 
	public String getPackcode() { 
		return packcode; 
	} 
 
	public void setPackcode(String packcode) { 
		this.packcode = packcode; 
	} 
 
	public String getDestport() { 
		return destport; 
	} 
 
	public void setDestport(String destport) { 
		this.destport = destport; 
	} 
 
	public BigDecimal getCntgross() { 
		return cntgross; 
	} 
 
	public void setCntgross(BigDecimal cntgross) { 
		this.cntgross = cntgross; 
	} 
 
	public String getListno() { 
		return listno; 
	} 
 
	public void setListno(String listno) { 
		this.listno = listno; 
	} 
 
	public String getUpdtime() { 
		return updtime; 
	} 
 
	public void setUpdtime(String updtime) { 
		this.updtime = updtime; 
	} 
 
	public String getMsgtype() { 
		return msgtype; 
	} 
 
	public void setMsgtype(String msgtype) { 
		this.msgtype = msgtype; 
	} 
 
} 
