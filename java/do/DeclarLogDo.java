package com.doc.common.bean; 
 
public class DeclarLogDo { 
 
	public enum COLUMNS { 
		MSGFUN("異動別"), 
		BONDNO("監管編號"), 
		STRTYPE("進出倉別"), 
		DECLTYPE("報單類別"), 
		DECLNO("報單號碼"), 
		IMPORTDATE("進口日期"), 
		DECLDATE("申報日期"), 
		RLSTIME("放行日期"), 
		STGPLACE("存放處所"), 
		NOPKG("件數"), 
		PKGUNIT("件數單位"), 
		GWGT("總重量"), 
		REFBILLNO("參考單號"), 
		BOXNO("報關箱號"), 
		INBONDNO("進倉保稅倉庫業者代碼"), 
		OUTBONDNO("出倉保稅倉庫業者代碼"), 
		SENDID("送方代碼"), 
		SENDQULF("送方識別碼"), 
		RECVID("收方代碼"), 
		RECVQULF("收方識別碼"), 
		RLSFLAG("人工放行註記"), 
		MAWBNO("主提單號碼"), 
		HAWBNO("分提單號碼"), 
		OWNERBAN("貨主統編"), 
		ICONFIRMED("確認註記"), 
		MONRPT("按月彙報駐記"), 
		MSGTYPE("EDI訊息代碼"), 
		UPDTIME("系統時間"), 
		OTHERS("其它申報事項"), 
		BILLINGSTAT("收費狀態"), 
		CHARGEDATE("收費日期"), 
		MARK("備註"), 
		ASTYPE("海空運別"), 
		VRNO("海掛"), 
		SONO("裝貨單號"), 
		PROCESSTIME("異動時間"), 
		PROCESSSTATE("異動類別") 
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
	private String msgtype; 
	private String updtime; 
	private String others; 
	private String billingstat; 
	private String chargedate; 
	private String mark; 
	private String astype; 
	private String vrno; 
	private String sono; 
	private String processtime; 
	private String processstate; 
	
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
 
	public String getMsgtype() { 
		return msgtype; 
	} 
 
	public void setMsgtype(String msgtype) { 
		this.msgtype = msgtype; 
	} 
 
	public String getUpdtime() { 
		return updtime; 
	} 
 
	public void setUpdtime(String updtime) { 
		this.updtime = updtime; 
	} 
 
	public String getOthers() { 
		return others; 
	} 
 
	public void setOthers(String others) { 
		this.others = others; 
	} 
 
	public String getBillingstat() { 
		return billingstat; 
	} 
 
	public void setBillingstat(String billingstat) { 
		this.billingstat = billingstat; 
	} 
 
	public String getChargedate() { 
		return chargedate; 
	} 
 
	public void setChargedate(String chargedate) { 
		this.chargedate = chargedate; 
	} 
 
	public String getMark() { 
		return mark; 
	} 
 
	public void setMark(String mark) { 
		this.mark = mark; 
	} 
 
	public String getAstype() { 
		return astype; 
	} 
 
	public void setAstype(String astype) { 
		this.astype = astype; 
	} 
 
	public String getVrno() { 
		return vrno; 
	} 
 
	public void setVrno(String vrno) { 
		this.vrno = vrno; 
	} 
 
	public String getSono() { 
		return sono; 
	} 
 
	public void setSono(String sono) { 
		this.sono = sono; 
	} 
 
	public String getProcesstime() { 
		return processtime; 
	} 
 
	public void setProcesstime(String processtime) { 
		this.processtime = processtime; 
	} 
 
	public String getProcessstate() { 
		return processstate; 
	} 
 
	public void setProcessstate(String processstate) { 
		this.processstate = processstate; 
	} 
 
} 
