package com.doc.common.po.impl; 
 
public class StrcontainerPo implements IStrcontainerPo {
 
	public enum COLUMNS {
		BONDNO("null"), //
		LISTNO("null"), //
		PASSNO("null"), //
		PASSDATE("null"), //
		CONTRNO("null"), //
		CONTRTYPE("null"), //
		TRANSMODE("null"), //
		PACKCODE("null"), //
		LOADQTY("null"), //
		SEALNO("null"), //
		SHSEALNO("null"), //
		OUTTIME("null"), //
		INTIME("null"), //
		CARCOMP("null"), //
		CARNO("null"), //
		DRIVER("null"), //
		IDNO("null"), //
		CNSTATUS("null"), //
		LOCCODE("null"), //
		DESTCODE("null"), //
		IETYPE("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
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

	@Override
	public String getBondno() {
		return this.bondno;
	}
 
	@Override
	public void setBondno(final String bondno) {
		this.bondno = bondno; 
	}
 
	@Override
	public String getListno() {
		return this.listno;
	}
 
	@Override
	public void setListno(final String listno) {
		this.listno = listno; 
	}
 
	@Override
	public String getPassno() {
		return this.passno;
	}
 
	@Override
	public void setPassno(final String passno) {
		this.passno = passno; 
	}
 
	@Override
	public java.sql.Timestamp getPassdate() {
		return this.passdate;
	}
 
	@Override
	public void setPassdate(final java.sql.Timestamp passdate) {
		this.passdate = passdate; 
	}
 
	@Override
	public String getContrno() {
		return this.contrno;
	}
 
	@Override
	public void setContrno(final String contrno) {
		this.contrno = contrno; 
	}
 
	@Override
	public String getContrtype() {
		return this.contrtype;
	}
 
	@Override
	public void setContrtype(final String contrtype) {
		this.contrtype = contrtype; 
	}
 
	@Override
	public String getTransmode() {
		return this.transmode;
	}
 
	@Override
	public void setTransmode(final String transmode) {
		this.transmode = transmode; 
	}
 
	@Override
	public String getPackcode() {
		return this.packcode;
	}
 
	@Override
	public void setPackcode(final String packcode) {
		this.packcode = packcode; 
	}
 
	@Override
	public BigDecimal getLoadqty() {
		return this.loadqty;
	}
 
	@Override
	public void setLoadqty(final BigDecimal loadqty) {
		this.loadqty = loadqty; 
	}
 
	@Override
	public String getSealno() {
		return this.sealno;
	}
 
	@Override
	public void setSealno(final String sealno) {
		this.sealno = sealno; 
	}
 
	@Override
	public String getShsealno() {
		return this.shsealno;
	}
 
	@Override
	public void setShsealno(final String shsealno) {
		this.shsealno = shsealno; 
	}
 
	@Override
	public java.sql.Timestamp getOuttime() {
		return this.outtime;
	}
 
	@Override
	public void setOuttime(final java.sql.Timestamp outtime) {
		this.outtime = outtime; 
	}
 
	@Override
	public java.sql.Timestamp getIntime() {
		return this.intime;
	}
 
	@Override
	public void setIntime(final java.sql.Timestamp intime) {
		this.intime = intime; 
	}
 
	@Override
	public String getCarcomp() {
		return this.carcomp;
	}
 
	@Override
	public void setCarcomp(final String carcomp) {
		this.carcomp = carcomp; 
	}
 
	@Override
	public String getCarno() {
		return this.carno;
	}
 
	@Override
	public void setCarno(final String carno) {
		this.carno = carno; 
	}
 
	@Override
	public String getDriver() {
		return this.driver;
	}
 
	@Override
	public void setDriver(final String driver) {
		this.driver = driver; 
	}
 
	@Override
	public String getIdno() {
		return this.idno;
	}
 
	@Override
	public void setIdno(final String idno) {
		this.idno = idno; 
	}
 
	@Override
	public String getCnstatus() {
		return this.cnstatus;
	}
 
	@Override
	public void setCnstatus(final String cnstatus) {
		this.cnstatus = cnstatus; 
	}
 
	@Override
	public String getLoccode() {
		return this.loccode;
	}
 
	@Override
	public void setLoccode(final String loccode) {
		this.loccode = loccode; 
	}
 
	@Override
	public String getDestcode() {
		return this.destcode;
	}
 
	@Override
	public void setDestcode(final String destcode) {
		this.destcode = destcode; 
	}
 
	@Override
	public String getIetype() {
		return this.ietype;
	}
 
	@Override
	public void setIetype(final String ietype) {
		this.ietype = ietype; 
	}
 
}
