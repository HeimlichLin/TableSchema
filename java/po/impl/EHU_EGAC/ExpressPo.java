package com.doc.common.po.impl; 
 
public class ExpressPo implements IExpressPo {
 
	public enum COLUMNS {
		EXPRESSID("記帳代號"), //
		EXPRESSCNAME("業者中文名稱"), //
		EXPRESSENAME("業者英文名稱"), //
		EXPRESSSNAME("業者簡稱"), //
		BAN("統一編號"), //
		BOXNO("報關箱號"), //
		CHARGEBOX("倉租歸帳業者記帳代號"), //
		BASEREF("登記保証金額度"), //
		CURRENTTOTAL("目前累計倉租費用"), //
		BASELINE("倉租累計警告金額"), //
		ONLINEBILL("線上列印稅單=1"), //
		ONLINERECP("線上列印收據=1"), //
		DECLWEIGHTCHARGE("以報單重量統計MIS資料=1"), //
		RELEASE("解除記帳代號=1"), //
		IMPCHK("進口記帳代號=1"), //
		EXPCHK("出口記帳代號=1") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String expressid;
	private String expresscname;
	private String expressename;
	private String expresssname;
	private String ban;
	private String boxno;
	private String chargebox;
	private BigDecimal baseref;
	private BigDecimal currenttotal;
	private BigDecimal baseline;
	private String onlinebill;
	private String onlinerecp;
	private String declweightcharge;
	private String release;
	private String impchk;
	private String expchk;

	@Override
	public String getExpressid() {
		return this.expressid;
	}
 
	@Override
	public void setExpressid(final String expressid) {
		this.expressid = expressid; 
	}
 
	@Override
	public String getExpresscname() {
		return this.expresscname;
	}
 
	@Override
	public void setExpresscname(final String expresscname) {
		this.expresscname = expresscname; 
	}
 
	@Override
	public String getExpressename() {
		return this.expressename;
	}
 
	@Override
	public void setExpressename(final String expressename) {
		this.expressename = expressename; 
	}
 
	@Override
	public String getExpresssname() {
		return this.expresssname;
	}
 
	@Override
	public void setExpresssname(final String expresssname) {
		this.expresssname = expresssname; 
	}
 
	@Override
	public String getBan() {
		return this.ban;
	}
 
	@Override
	public void setBan(final String ban) {
		this.ban = ban; 
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
	public String getChargebox() {
		return this.chargebox;
	}
 
	@Override
	public void setChargebox(final String chargebox) {
		this.chargebox = chargebox; 
	}
 
	@Override
	public BigDecimal getBaseref() {
		return this.baseref;
	}
 
	@Override
	public void setBaseref(final BigDecimal baseref) {
		this.baseref = baseref; 
	}
 
	@Override
	public BigDecimal getCurrenttotal() {
		return this.currenttotal;
	}
 
	@Override
	public void setCurrenttotal(final BigDecimal currenttotal) {
		this.currenttotal = currenttotal; 
	}
 
	@Override
	public BigDecimal getBaseline() {
		return this.baseline;
	}
 
	@Override
	public void setBaseline(final BigDecimal baseline) {
		this.baseline = baseline; 
	}
 
	@Override
	public String getOnlinebill() {
		return this.onlinebill;
	}
 
	@Override
	public void setOnlinebill(final String onlinebill) {
		this.onlinebill = onlinebill; 
	}
 
	@Override
	public String getOnlinerecp() {
		return this.onlinerecp;
	}
 
	@Override
	public void setOnlinerecp(final String onlinerecp) {
		this.onlinerecp = onlinerecp; 
	}
 
	@Override
	public String getDeclweightcharge() {
		return this.declweightcharge;
	}
 
	@Override
	public void setDeclweightcharge(final String declweightcharge) {
		this.declweightcharge = declweightcharge; 
	}
 
	@Override
	public String getRelease() {
		return this.release;
	}
 
	@Override
	public void setRelease(final String release) {
		this.release = release; 
	}
 
	@Override
	public String getImpchk() {
		return this.impchk;
	}
 
	@Override
	public void setImpchk(final String impchk) {
		this.impchk = impchk; 
	}
 
	@Override
	public String getExpchk() {
		return this.expchk;
	}
 
	@Override
	public void setExpchk(final String expchk) {
		this.expchk = expchk; 
	}
 
}
