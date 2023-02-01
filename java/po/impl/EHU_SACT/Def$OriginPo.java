package com.doc.common.po.impl; 
 
public class Def$OriginPo implements IDef$OriginPo {
 
	public enum COLUMNS {
		ORIGIN_DB("Originating database for the deferred transaction"), //
		ORIGIN_DBLINK("Database link from deferred transaction origin to this site"), //
		INUSR("Connected user receiving the deferred transaction"), //
		CSCN("Prepare SCN assigned at origin site"), //
		ENQ_TID("Transaction id assigned at origin site"), //
		RECO_SEQ_NO("Deferred transaction sequence number for recovery"), //
		CATCHUP("Used to break transaction into pieces") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String originDb;
	private String originDblink;
	private BigDecimal inusr;
	private BigDecimal cscn;
	private String enqTid;
	private BigDecimal recoSeqNo;
	private String catchup;

	@Override
	public String getOriginDb() {
		return this.originDb;
	}
 
	@Override
	public void setOriginDb(final String originDb) {
		this.originDb = originDb; 
	}
 
	@Override
	public String getOriginDblink() {
		return this.originDblink;
	}
 
	@Override
	public void setOriginDblink(final String originDblink) {
		this.originDblink = originDblink; 
	}
 
	@Override
	public BigDecimal getInusr() {
		return this.inusr;
	}
 
	@Override
	public void setInusr(final BigDecimal inusr) {
		this.inusr = inusr; 
	}
 
	@Override
	public BigDecimal getCscn() {
		return this.cscn;
	}
 
	@Override
	public void setCscn(final BigDecimal cscn) {
		this.cscn = cscn; 
	}
 
	@Override
	public String getEnqTid() {
		return this.enqTid;
	}
 
	@Override
	public void setEnqTid(final String enqTid) {
		this.enqTid = enqTid; 
	}
 
	@Override
	public BigDecimal getRecoSeqNo() {
		return this.recoSeqNo;
	}
 
	@Override
	public void setRecoSeqNo(final BigDecimal recoSeqNo) {
		this.recoSeqNo = recoSeqNo; 
	}
 
	@Override
	public String getCatchup() {
		return this.catchup;
	}
 
	@Override
	public void setCatchup(final String catchup) {
		this.catchup = catchup; 
	}
 
}
