package com.doc.common.bean; 
 
public class ReleaseDo { 
 
	public enum COLUMNS { 
		BOXNO("報關行箱號"), 
		DECLTYPE("報單類別"), 
		DECLNO("報單號碼"), 
		STGPLACE("存放處所"), 
		RLSTIME("放行時間"), 
		RLSPKG("放行件數"), 
		PKGUNIT("件數單位"), 
		GWGT("總重量"), 
		EXTRACOND("放行附帶條件"), 
		VESSELSIGN("船舶呼號"), 
		VOYAGENO("航次"), 
		SHIPCODE("船公司代碼"), 
		EXPORTER("貨主名稱"), 
		CLEARTYPE("通關方式"), 
		MSGTYPE("EDI訊息代碼"), 
		STRTYPE("進出倉別"), 
		ASTYPE("海空運別"), 
		MAWBNO("主提單號"), 
		HAWBNO("分提單號"), 
		UNRLSPKG("未放行件數"), 
		UNPKGUNIT("未放行單位") 
		; 
		final String name; 
	 
		private COLUMNS(final String name) { 
			this.name = name; 
		} 
	 
		public String getName() { 
			return this.name; 
		} 
	} 
 
	private String boxno; 
	private String decltype; 
	private String declno; 
	private String stgplace; 
	private java.sql.Timestamp rlstime; 
	private BigDecimal rlspkg; 
	private String pkgunit; 
	private BigDecimal gwgt; 
	private String extracond; 
	private String vesselsign; 
	private String voyageno; 
	private String shipcode; 
	private String exporter; 
	private String cleartype; 
	private String msgtype; 
	private String strtype; 
	private String astype; 
	private String mawbno; 
	private String hawbno; 
	private BigDecimal unrlspkg; 
	private String unpkgunit; 
	
	public String getBoxno() { 
		return boxno; 
	} 
 
	public void setBoxno(String boxno) { 
		this.boxno = boxno; 
	} 
 
	public String getDecltype() { 
		return decltype; 
	} 
 
	public void setDecltype(String decltype) { 
		this.decltype = decltype; 
	} 
 
	public String getDeclno() { 
		return declno; 
	} 
 
	public void setDeclno(String declno) { 
		this.declno = declno; 
	} 
 
	public String getStgplace() { 
		return stgplace; 
	} 
 
	public void setStgplace(String stgplace) { 
		this.stgplace = stgplace; 
	} 
 
	public java.sql.Timestamp getRlstime() { 
		return rlstime; 
	} 
 
	public void setRlstime(java.sql.Timestamp rlstime) { 
		this.rlstime = rlstime; 
	} 
 
	public BigDecimal getRlspkg() { 
		return rlspkg; 
	} 
 
	public void setRlspkg(BigDecimal rlspkg) { 
		this.rlspkg = rlspkg; 
	} 
 
	public String getPkgunit() { 
		return pkgunit; 
	} 
 
	public void setPkgunit(String pkgunit) { 
		this.pkgunit = pkgunit; 
	} 
 
	public BigDecimal getGwgt() { 
		return gwgt; 
	} 
 
	public void setGwgt(BigDecimal gwgt) { 
		this.gwgt = gwgt; 
	} 
 
	public String getExtracond() { 
		return extracond; 
	} 
 
	public void setExtracond(String extracond) { 
		this.extracond = extracond; 
	} 
 
	public String getVesselsign() { 
		return vesselsign; 
	} 
 
	public void setVesselsign(String vesselsign) { 
		this.vesselsign = vesselsign; 
	} 
 
	public String getVoyageno() { 
		return voyageno; 
	} 
 
	public void setVoyageno(String voyageno) { 
		this.voyageno = voyageno; 
	} 
 
	public String getShipcode() { 
		return shipcode; 
	} 
 
	public void setShipcode(String shipcode) { 
		this.shipcode = shipcode; 
	} 
 
	public String getExporter() { 
		return exporter; 
	} 
 
	public void setExporter(String exporter) { 
		this.exporter = exporter; 
	} 
 
	public String getCleartype() { 
		return cleartype; 
	} 
 
	public void setCleartype(String cleartype) { 
		this.cleartype = cleartype; 
	} 
 
	public String getMsgtype() { 
		return msgtype; 
	} 
 
	public void setMsgtype(String msgtype) { 
		this.msgtype = msgtype; 
	} 
 
	public String getStrtype() { 
		return strtype; 
	} 
 
	public void setStrtype(String strtype) { 
		this.strtype = strtype; 
	} 
 
	public String getAstype() { 
		return astype; 
	} 
 
	public void setAstype(String astype) { 
		this.astype = astype; 
	} 
 
	public String getMawbno() { 
		return mawbno; 
	} 
 
	public void setMawbno(String mawbno) { 
		this.mawbno = mawbno; 
	} 
 
	public String getHawbno() { 
		return hawbno; 
	} 
 
	public void setHawbno(String hawbno) { 
		this.hawbno = hawbno; 
	} 
 
	public BigDecimal getUnrlspkg() { 
		return unrlspkg; 
	} 
 
	public void setUnrlspkg(BigDecimal unrlspkg) { 
		this.unrlspkg = unrlspkg; 
	} 
 
	public String getUnpkgunit() { 
		return unpkgunit; 
	} 
 
	public void setUnpkgunit(String unpkgunit) { 
		this.unpkgunit = unpkgunit; 
	} 
 
} 
