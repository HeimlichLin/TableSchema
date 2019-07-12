package com.doc.common.bean; 
 
public class RlsbillDo { 
 
	public enum COLUMNS { 
		BONDNO("null"), 
		PASSNO("null"), 
		PASSDATE("null"), 
		INTIME("null"), 
		OUTTIME("null"), 
		VESSELNAME("null"), 
		VOYAGENO("null"), 
		VESSELREG("null"), 
		LOCCODE("null"), 
		GOPLACE("null"), 
		GDSTYPE("null"), 
		IETYPE("null"), 
		PACKTYPE("null"), 
		CONTRNO("null"), 
		SEALNO("null"), 
		SEALNO2("null"), 
		SEALNO3("null"), 
		SEALNO4("null"), 
		SHSEALNO("null"), 
		SHSEALNO2("null"), 
		PKGQTY("null"), 
		RLSQTY("null"), 
		OWNER("null"), 
		CARCOMP("null"), 
		CARNO("null"), 
		DRIVER("null"), 
		IDNO("null"), 
		LABELMARK("null"), 
		RBSTATUS("null"), 
		SONO("null"), 
		CCCCODE("null"), 
		DECLNO("null"), 
		EXTRACOND("null") 
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
	private String intime; 
	private String outtime; 
	private String vesselname; 
	private String voyageno; 
	private String vesselreg; 
	private String loccode; 
	private String goplace; 
	private String gdstype; 
	private String ietype; 
	private String packtype; 
	private String contrno; 
	private String sealno; 
	private String sealno2; 
	private String sealno3; 
	private String sealno4; 
	private String shsealno; 
	private String shsealno2; 
	private BigDecimal pkgqty; 
	private BigDecimal rlsqty; 
	private String owner; 
	private String carcomp; 
	private String carno; 
	private String driver; 
	private String idno; 
	private String labelmark; 
	private String rbstatus; 
	private String sono; 
	private String ccccode; 
	private String declno; 
	private String extracond; 
	
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
 
	public String getIntime() { 
		return intime; 
	} 
 
	public void setIntime(String intime) { 
		this.intime = intime; 
	} 
 
	public String getOuttime() { 
		return outtime; 
	} 
 
	public void setOuttime(String outtime) { 
		this.outtime = outtime; 
	} 
 
	public String getVesselname() { 
		return vesselname; 
	} 
 
	public void setVesselname(String vesselname) { 
		this.vesselname = vesselname; 
	} 
 
	public String getVoyageno() { 
		return voyageno; 
	} 
 
	public void setVoyageno(String voyageno) { 
		this.voyageno = voyageno; 
	} 
 
	public String getVesselreg() { 
		return vesselreg; 
	} 
 
	public void setVesselreg(String vesselreg) { 
		this.vesselreg = vesselreg; 
	} 
 
	public String getLoccode() { 
		return loccode; 
	} 
 
	public void setLoccode(String loccode) { 
		this.loccode = loccode; 
	} 
 
	public String getGoplace() { 
		return goplace; 
	} 
 
	public void setGoplace(String goplace) { 
		this.goplace = goplace; 
	} 
 
	public String getGdstype() { 
		return gdstype; 
	} 
 
	public void setGdstype(String gdstype) { 
		this.gdstype = gdstype; 
	} 
 
	public String getIetype() { 
		return ietype; 
	} 
 
	public void setIetype(String ietype) { 
		this.ietype = ietype; 
	} 
 
	public String getPacktype() { 
		return packtype; 
	} 
 
	public void setPacktype(String packtype) { 
		this.packtype = packtype; 
	} 
 
	public String getContrno() { 
		return contrno; 
	} 
 
	public void setContrno(String contrno) { 
		this.contrno = contrno; 
	} 
 
	public String getSealno() { 
		return sealno; 
	} 
 
	public void setSealno(String sealno) { 
		this.sealno = sealno; 
	} 
 
	public String getSealno2() { 
		return sealno2; 
	} 
 
	public void setSealno2(String sealno2) { 
		this.sealno2 = sealno2; 
	} 
 
	public String getSealno3() { 
		return sealno3; 
	} 
 
	public void setSealno3(String sealno3) { 
		this.sealno3 = sealno3; 
	} 
 
	public String getSealno4() { 
		return sealno4; 
	} 
 
	public void setSealno4(String sealno4) { 
		this.sealno4 = sealno4; 
	} 
 
	public String getShsealno() { 
		return shsealno; 
	} 
 
	public void setShsealno(String shsealno) { 
		this.shsealno = shsealno; 
	} 
 
	public String getShsealno2() { 
		return shsealno2; 
	} 
 
	public void setShsealno2(String shsealno2) { 
		this.shsealno2 = shsealno2; 
	} 
 
	public BigDecimal getPkgqty() { 
		return pkgqty; 
	} 
 
	public void setPkgqty(BigDecimal pkgqty) { 
		this.pkgqty = pkgqty; 
	} 
 
	public BigDecimal getRlsqty() { 
		return rlsqty; 
	} 
 
	public void setRlsqty(BigDecimal rlsqty) { 
		this.rlsqty = rlsqty; 
	} 
 
	public String getOwner() { 
		return owner; 
	} 
 
	public void setOwner(String owner) { 
		this.owner = owner; 
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
 
	public String getLabelmark() { 
		return labelmark; 
	} 
 
	public void setLabelmark(String labelmark) { 
		this.labelmark = labelmark; 
	} 
 
	public String getRbstatus() { 
		return rbstatus; 
	} 
 
	public void setRbstatus(String rbstatus) { 
		this.rbstatus = rbstatus; 
	} 
 
	public String getSono() { 
		return sono; 
	} 
 
	public void setSono(String sono) { 
		this.sono = sono; 
	} 
 
	public String getCcccode() { 
		return ccccode; 
	} 
 
	public void setCcccode(String ccccode) { 
		this.ccccode = ccccode; 
	} 
 
	public String getDeclno() { 
		return declno; 
	} 
 
	public void setDeclno(String declno) { 
		this.declno = declno; 
	} 
 
	public String getExtracond() { 
		return extracond; 
	} 
 
	public void setExtracond(String extracond) { 
		this.extracond = extracond; 
	} 
 
} 
