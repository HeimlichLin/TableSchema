package com.doc.common.po.impl; 
 
public class DeclarLogPo implements IDeclarLogPo {
 
	public enum COLUMNS {
		MSGFUN("異動別"), //
		BONDNO("監管編號"), //
		STRTYPE("進出倉別"), //
		DECLTYPE("報單類別"), //
		DECLNO("報單號碼"), //
		IMPORTDATE("進口日期"), //
		DECLDATE("申報日期"), //
		RLSTIME("放行日期"), //
		STGPLACE("存放處所"), //
		NOPKG("件數"), //
		PKGUNIT("件數單位"), //
		GWGT("總重量"), //
		REFBILLNO("參考單號"), //
		BOXNO("報關箱號"), //
		INBONDNO("進倉保稅倉庫業者代碼"), //
		OUTBONDNO("出倉保稅倉庫業者代碼"), //
		SENDID("送方代碼"), //
		SENDQULF("送方識別碼"), //
		RECVID("收方代碼"), //
		RECVQULF("收方識別碼"), //
		RLSFLAG("人工放行註記"), //
		MAWBNO("主提單號碼"), //
		HAWBNO("分提單號碼"), //
		OWNERBAN("貨主統編"), //
		ICONFIRMED("確認註記"), //
		MONRPT("按月彙報駐記"), //
		MSGTYPE("EDI訊息代碼"), //
		UPDTIME("系統時間"), //
		OTHERS("其它申報事項"), //
		BILLINGSTAT("收費狀態"), //
		CHARGEDATE("收費日期"), //
		MARK("備註"), //
		ASTYPE("海空運別"), //
		VRNO("海掛"), //
		SONO("裝貨單號"), //
		PROCESSTIME("異動時間"), //
		PROCESSSTATE("異動類別") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
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

	@Override
	public String getMsgfun() {
		return this.msgfun;
	}
 
	@Override
	public void setMsgfun(final String msgfun) {
		this.msgfun = msgfun; 
	}
 
	@Override
	public String getBondno() {
		return this.bondno;
	}
 
	@Override
	public void setBondno(final String bondno) {
		this.bondno = bondno; 
	}
 
	@Override
	public String getStrtype() {
		return this.strtype;
	}
 
	@Override
	public void setStrtype(final String strtype) {
		this.strtype = strtype; 
	}
 
	@Override
	public String getDecltype() {
		return this.decltype;
	}
 
	@Override
	public void setDecltype(final String decltype) {
		this.decltype = decltype; 
	}
 
	@Override
	public String getDeclno() {
		return this.declno;
	}
 
	@Override
	public void setDeclno(final String declno) {
		this.declno = declno; 
	}
 
	@Override
	public java.sql.Timestamp getImportdate() {
		return this.importdate;
	}
 
	@Override
	public void setImportdate(final java.sql.Timestamp importdate) {
		this.importdate = importdate; 
	}
 
	@Override
	public java.sql.Timestamp getDecldate() {
		return this.decldate;
	}
 
	@Override
	public void setDecldate(final java.sql.Timestamp decldate) {
		this.decldate = decldate; 
	}
 
	@Override
	public java.sql.Timestamp getRlstime() {
		return this.rlstime;
	}
 
	@Override
	public void setRlstime(final java.sql.Timestamp rlstime) {
		this.rlstime = rlstime; 
	}
 
	@Override
	public String getStgplace() {
		return this.stgplace;
	}
 
	@Override
	public void setStgplace(final String stgplace) {
		this.stgplace = stgplace; 
	}
 
	@Override
	public BigDecimal getNopkg() {
		return this.nopkg;
	}
 
	@Override
	public void setNopkg(final BigDecimal nopkg) {
		this.nopkg = nopkg; 
	}
 
	@Override
	public String getPkgunit() {
		return this.pkgunit;
	}
 
	@Override
	public void setPkgunit(final String pkgunit) {
		this.pkgunit = pkgunit; 
	}
 
	@Override
	public BigDecimal getGwgt() {
		return this.gwgt;
	}
 
	@Override
	public void setGwgt(final BigDecimal gwgt) {
		this.gwgt = gwgt; 
	}
 
	@Override
	public String getRefbillno() {
		return this.refbillno;
	}
 
	@Override
	public void setRefbillno(final String refbillno) {
		this.refbillno = refbillno; 
	}
 
	@Override
	public String getBoxno() {
		return this.boxno;
	}
 
	@Override
	public void setBoxno(final String boxno) {
		this.boxno = boxno; 
	}
 
	@Override
	public String getInbondno() {
		return this.inbondno;
	}
 
	@Override
	public void setInbondno(final String inbondno) {
		this.inbondno = inbondno; 
	}
 
	@Override
	public String getOutbondno() {
		return this.outbondno;
	}
 
	@Override
	public void setOutbondno(final String outbondno) {
		this.outbondno = outbondno; 
	}
 
	@Override
	public String getSendid() {
		return this.sendid;
	}
 
	@Override
	public void setSendid(final String sendid) {
		this.sendid = sendid; 
	}
 
	@Override
	public String getSendqulf() {
		return this.sendqulf;
	}
 
	@Override
	public void setSendqulf(final String sendqulf) {
		this.sendqulf = sendqulf; 
	}
 
	@Override
	public String getRecvid() {
		return this.recvid;
	}
 
	@Override
	public void setRecvid(final String recvid) {
		this.recvid = recvid; 
	}
 
	@Override
	public String getRecvqulf() {
		return this.recvqulf;
	}
 
	@Override
	public void setRecvqulf(final String recvqulf) {
		this.recvqulf = recvqulf; 
	}
 
	@Override
	public String getRlsflag() {
		return this.rlsflag;
	}
 
	@Override
	public void setRlsflag(final String rlsflag) {
		this.rlsflag = rlsflag; 
	}
 
	@Override
	public String getMawbno() {
		return this.mawbno;
	}
 
	@Override
	public void setMawbno(final String mawbno) {
		this.mawbno = mawbno; 
	}
 
	@Override
	public String getHawbno() {
		return this.hawbno;
	}
 
	@Override
	public void setHawbno(final String hawbno) {
		this.hawbno = hawbno; 
	}
 
	@Override
	public String getOwnerban() {
		return this.ownerban;
	}
 
	@Override
	public void setOwnerban(final String ownerban) {
		this.ownerban = ownerban; 
	}
 
	@Override
	public String getIconfirmed() {
		return this.iconfirmed;
	}
 
	@Override
	public void setIconfirmed(final String iconfirmed) {
		this.iconfirmed = iconfirmed; 
	}
 
	@Override
	public String getMonrpt() {
		return this.monrpt;
	}
 
	@Override
	public void setMonrpt(final String monrpt) {
		this.monrpt = monrpt; 
	}
 
	@Override
	public String getMsgtype() {
		return this.msgtype;
	}
 
	@Override
	public void setMsgtype(final String msgtype) {
		this.msgtype = msgtype; 
	}
 
	@Override
	public String getUpdtime() {
		return this.updtime;
	}
 
	@Override
	public void setUpdtime(final String updtime) {
		this.updtime = updtime; 
	}
 
	@Override
	public String getOthers() {
		return this.others;
	}
 
	@Override
	public void setOthers(final String others) {
		this.others = others; 
	}
 
	@Override
	public String getBillingstat() {
		return this.billingstat;
	}
 
	@Override
	public void setBillingstat(final String billingstat) {
		this.billingstat = billingstat; 
	}
 
	@Override
	public String getChargedate() {
		return this.chargedate;
	}
 
	@Override
	public void setChargedate(final String chargedate) {
		this.chargedate = chargedate; 
	}
 
	@Override
	public String getMark() {
		return this.mark;
	}
 
	@Override
	public void setMark(final String mark) {
		this.mark = mark; 
	}
 
	@Override
	public String getAstype() {
		return this.astype;
	}
 
	@Override
	public void setAstype(final String astype) {
		this.astype = astype; 
	}
 
	@Override
	public String getVrno() {
		return this.vrno;
	}
 
	@Override
	public void setVrno(final String vrno) {
		this.vrno = vrno; 
	}
 
	@Override
	public String getSono() {
		return this.sono;
	}
 
	@Override
	public void setSono(final String sono) {
		this.sono = sono; 
	}
 
	@Override
	public String getProcesstime() {
		return this.processtime;
	}
 
	@Override
	public void setProcesstime(final String processtime) {
		this.processtime = processtime; 
	}
 
	@Override
	public String getProcessstate() {
		return this.processstate;
	}
 
	@Override
	public void setProcessstate(final String processstate) {
		this.processstate = processstate; 
	}
 
}
