package com.doc.common.po.impl; 
 
public class TmpHDeclar20070801Po implements ITmpHDeclar20070801Po {
 
	public enum COLUMNS {
		MSGFUN("null"), //
		BONDNO("null"), //
		STRTYPE("null"), //
		DECLTYPE("null"), //
		DECLNO("null"), //
		IMPORTDATE("null"), //
		DECLDATE("null"), //
		RLSTIME("null"), //
		STGPLACE("null"), //
		NOPKG("null"), //
		PKGUNIT("null"), //
		GWGT("null"), //
		REFBILLNO("null"), //
		BOXNO("null"), //
		INBONDNO("null"), //
		OUTBONDNO("null"), //
		SENDID("null"), //
		SENDQULF("null"), //
		RECVID("null"), //
		RECVQULF("null"), //
		RLSFLAG("null"), //
		MAWBNO("null"), //
		HAWBNO("null"), //
		OWNERBAN("null"), //
		ICONFIRMED("null"), //
		MONRPT("null"), //
		UPDTIME("null"), //
		MSGTYPE("null") //
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
	private String updtime;
	private String msgtype;

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
	public String getUpdtime() {
		return this.updtime;
	}
 
	@Override
	public void setUpdtime(final String updtime) {
		this.updtime = updtime; 
	}
 
	@Override
	public String getMsgtype() {
		return this.msgtype;
	}
 
	@Override
	public void setMsgtype(final String msgtype) {
		this.msgtype = msgtype; 
	}
 
}
