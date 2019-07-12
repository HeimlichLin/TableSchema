package com.doc.common.bean; 
 
public class TmpHDeclar20070801Do { 
 
	public enum COLUMNS { 
		MSGFUN("null"), 
		BONDNO("null"), 
		STRTYPE("null"), 
		DECLTYPE("null"), 
		DECLNO("null"), 
		IMPORTDATE("null"), 
		DECLDATE("null"), 
		RLSTIME("null"), 
		STGPLACE("null"), 
		NOPKG("null"), 
		PKGUNIT("null"), 
		GWGT("null"), 
		REFBILLNO("null"), 
		BOXNO("null"), 
		INBONDNO("null"), 
		OUTBONDNO("null"), 
		SENDID("null"), 
		SENDQULF("null"), 
		RECVID("null"), 
		RECVQULF("null"), 
		RLSFLAG("null"), 
		MAWBNO("null"), 
		HAWBNO("null"), 
		OWNERBAN("null"), 
		ICONFIRMED("null"), 
		MONRPT("null"), 
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
 
	private String msgfun; 
	private String bondno; 
	private String strtype; 
	private String decltype; 
	private String declno; 
	private java.sql.Timestamp importdate; 
	private java.sql.Timestamp decldate; 
	private java.sql.Timestamp rlstime; 
	private String stgplace; 
	private BigDecimal nopkg; 
	private String pkgunit; 
	private BigDecimal gwgt; 
	private String refbillno; 
	private String boxno; 
	private String inbondno; 
	private String outbondno; 
	private String sendid; 
	private String sendqulf; 
	private String recvid; 
	private String recvqulf; 
	private String rlsflag; 
	private String mawbno; 
	private String hawbno; 
	private String ownerban; 
	private String iconfirmed; 
	private String monrpt; 
	private String updtime; 
	private String msgtype; 
	
	public String getMsgfun() { 
		return msgfun; 
	} 
 
	public void setMsgfun(String msgfun) { 
		this.msgfun = msgfun; 
	} 
 
	public String getBondno() { 
		return bondno; 
	} 
 
	public void setBondno(String bondno) { 
		this.bondno = bondno; 
	} 
 
	public String getStrtype() { 
		return strtype; 
	} 
 
	public void setStrtype(String strtype) { 
		this.strtype = strtype; 
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
 
	public java.sql.Timestamp getImportdate() { 
		return importdate; 
	} 
 
	public void setImportdate(java.sql.Timestamp importdate) { 
		this.importdate = importdate; 
	} 
 
	public java.sql.Timestamp getDecldate() { 
		return decldate; 
	} 
 
	public void setDecldate(java.sql.Timestamp decldate) { 
		this.decldate = decldate; 
	} 
 
	public java.sql.Timestamp getRlstime() { 
		return rlstime; 
	} 
 
	public void setRlstime(java.sql.Timestamp rlstime) { 
		this.rlstime = rlstime; 
	} 
 
	public String getStgplace() { 
		return stgplace; 
	} 
 
	public void setStgplace(String stgplace) { 
		this.stgplace = stgplace; 
	} 
 
	public BigDecimal getNopkg() { 
		return nopkg; 
	} 
 
	public void setNopkg(BigDecimal nopkg) { 
		this.nopkg = nopkg; 
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
 
	public String getRefbillno() { 
		return refbillno; 
	} 
 
	public void setRefbillno(String refbillno) { 
		this.refbillno = refbillno; 
	} 
 
	public String getBoxno() { 
		return boxno; 
	} 
 
	public void setBoxno(String boxno) { 
		this.boxno = boxno; 
	} 
 
	public String getInbondno() { 
		return inbondno; 
	} 
 
	public void setInbondno(String inbondno) { 
		this.inbondno = inbondno; 
	} 
 
	public String getOutbondno() { 
		return outbondno; 
	} 
 
	public void setOutbondno(String outbondno) { 
		this.outbondno = outbondno; 
	} 
 
	public String getSendid() { 
		return sendid; 
	} 
 
	public void setSendid(String sendid) { 
		this.sendid = sendid; 
	} 
 
	public String getSendqulf() { 
		return sendqulf; 
	} 
 
	public void setSendqulf(String sendqulf) { 
		this.sendqulf = sendqulf; 
	} 
 
	public String getRecvid() { 
		return recvid; 
	} 
 
	public void setRecvid(String recvid) { 
		this.recvid = recvid; 
	} 
 
	public String getRecvqulf() { 
		return recvqulf; 
	} 
 
	public void setRecvqulf(String recvqulf) { 
		this.recvqulf = recvqulf; 
	} 
 
	public String getRlsflag() { 
		return rlsflag; 
	} 
 
	public void setRlsflag(String rlsflag) { 
		this.rlsflag = rlsflag; 
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
 
	public String getOwnerban() { 
		return ownerban; 
	} 
 
	public void setOwnerban(String ownerban) { 
		this.ownerban = ownerban; 
	} 
 
	public String getIconfirmed() { 
		return iconfirmed; 
	} 
 
	public void setIconfirmed(String iconfirmed) { 
		this.iconfirmed = iconfirmed; 
	} 
 
	public String getMonrpt() { 
		return monrpt; 
	} 
 
	public void setMonrpt(String monrpt) { 
		this.monrpt = monrpt; 
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
