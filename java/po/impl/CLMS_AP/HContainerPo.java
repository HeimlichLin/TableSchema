package com.doc.common.po.impl; 
 
public class HContainerPo implements IHContainerPo {
 
	public enum COLUMNS {
		BONDNO("監管編號"), //
		PASSNO("null"), //
		PASSDATE("null"), //
		DECLNO("報單號碼"), //
		CONTRNO("貨櫃號碼"), //
		PCONTRNO("null"), //
		CONTRTYPE("貨櫃種類"), //
		TRANSMODE("貨櫃裝運方式"), //
		SEALNO("null"), //
		SHSEALNO("null"), //
		PLATNO("null"), //
		OUTTIME("null"), //
		INTIME("null"), //
		CARCOMP("null"), //
		CARNO("null"), //
		DRIVER("null"), //
		DRVLNO("null"), //
		CNSTATUS("null"), //
		PACKCODE("null"), //
		DESTPORT("null"), //
		CNTGROSS("null"), //
		LISTNO("null"), //
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

	@Override
	public String getBondno() {
		return this.bondno;
	}
 
	@Override
	public void setBondno(final String bondno) {
		this.bondno = bondno; 
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
	public String getPassdate() {
		return this.passdate;
	}
 
	@Override
	public void setPassdate(final String passdate) {
		this.passdate = passdate; 
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
	public String getContrno() {
		return this.contrno;
	}
 
	@Override
	public void setContrno(final String contrno) {
		this.contrno = contrno; 
	}
 
	@Override
	public String getPcontrno() {
		return this.pcontrno;
	}
 
	@Override
	public void setPcontrno(final String pcontrno) {
		this.pcontrno = pcontrno; 
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
	public String getPlatno() {
		return this.platno;
	}
 
	@Override
	public void setPlatno(final String platno) {
		this.platno = platno; 
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
	public String getDrvlno() {
		return this.drvlno;
	}
 
	@Override
	public void setDrvlno(final String drvlno) {
		this.drvlno = drvlno; 
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
	public String getPackcode() {
		return this.packcode;
	}
 
	@Override
	public void setPackcode(final String packcode) {
		this.packcode = packcode; 
	}
 
	@Override
	public String getDestport() {
		return this.destport;
	}
 
	@Override
	public void setDestport(final String destport) {
		this.destport = destport; 
	}
 
	@Override
	public BigDecimal getCntgross() {
		return this.cntgross;
	}
 
	@Override
	public void setCntgross(final BigDecimal cntgross) {
		this.cntgross = cntgross; 
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
