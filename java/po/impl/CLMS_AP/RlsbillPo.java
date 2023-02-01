package com.doc.common.po.impl; 
 
public class RlsbillPo implements IRlsbillPo {
 
	public enum COLUMNS {
		BONDNO("監管編號"), //
		PASSNO("運出放行單號"), //
		PASSDATE("運出日期"), //
		INTIME("進站時間"), //
		OUTTIME("出站時間"), //
		VESSELNAME("船名/航次"), //
		VOYAGENO("航次/班次"), //
		VESSELREG("船隻掛號"), //
		LOCCODE("存放處所"), //
		GOPLACE("運往處所"), //
		GDSTYPE("貨物類別"), //
		IETYPE("進出轉運別"), //
		PACKTYPE("貨裝方式"), //
		CONTRNO("貨櫃號碼"), //
		SEALNO("封條號碼"), //
		SEALNO2("封條號碼2"), //
		SEALNO3("封條號碼3"), //
		SEALNO4("封條號碼4"), //
		SHSEALNO("船公司封條號碼"), //
		SHSEALNO2("船公司封條號碼2"), //
		PKGQTY("裝車數量"), //
		RLSQTY("放行總數量"), //
		OWNER("貨主名稱"), //
		CARCOMP("車行"), //
		CARNO("車號"), //
		DRIVER("司機姓名"), //
		IDNO("駕照號碼"), //
		LABELMARK("條碼"), //
		RBSTATUS("放行單狀態"), //
		SONO("倉號"), //
		CCCCODE("商品分類號列"), //
		DECLNO("報單號碼"), //
		EXTRACOND("放行附帶條件") //
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
	public String getIntime() {
		return this.intime;
	}
 
	@Override
	public void setIntime(final String intime) {
		this.intime = intime; 
	}
 
	@Override
	public String getOuttime() {
		return this.outtime;
	}
 
	@Override
	public void setOuttime(final String outtime) {
		this.outtime = outtime; 
	}
 
	@Override
	public String getVesselname() {
		return this.vesselname;
	}
 
	@Override
	public void setVesselname(final String vesselname) {
		this.vesselname = vesselname; 
	}
 
	@Override
	public String getVoyageno() {
		return this.voyageno;
	}
 
	@Override
	public void setVoyageno(final String voyageno) {
		this.voyageno = voyageno; 
	}
 
	@Override
	public String getVesselreg() {
		return this.vesselreg;
	}
 
	@Override
	public void setVesselreg(final String vesselreg) {
		this.vesselreg = vesselreg; 
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
	public String getGoplace() {
		return this.goplace;
	}
 
	@Override
	public void setGoplace(final String goplace) {
		this.goplace = goplace; 
	}
 
	@Override
	public String getGdstype() {
		return this.gdstype;
	}
 
	@Override
	public void setGdstype(final String gdstype) {
		this.gdstype = gdstype; 
	}
 
	@Override
	public String getIetype() {
		return this.ietype;
	}
 
	@Override
	public void setIetype(final String ietype) {
		this.ietype = ietype; 
	}
 
	@Override
	public String getPacktype() {
		return this.packtype;
	}
 
	@Override
	public void setPacktype(final String packtype) {
		this.packtype = packtype; 
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
	public String getSealno() {
		return this.sealno;
	}
 
	@Override
	public void setSealno(final String sealno) {
		this.sealno = sealno; 
	}
 
	@Override
	public String getSealno2() {
		return this.sealno2;
	}
 
	@Override
	public void setSealno2(final String sealno2) {
		this.sealno2 = sealno2; 
	}
 
	@Override
	public String getSealno3() {
		return this.sealno3;
	}
 
	@Override
	public void setSealno3(final String sealno3) {
		this.sealno3 = sealno3; 
	}
 
	@Override
	public String getSealno4() {
		return this.sealno4;
	}
 
	@Override
	public void setSealno4(final String sealno4) {
		this.sealno4 = sealno4; 
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
	public String getShsealno2() {
		return this.shsealno2;
	}
 
	@Override
	public void setShsealno2(final String shsealno2) {
		this.shsealno2 = shsealno2; 
	}
 
	@Override
	public BigDecimal getPkgqty() {
		return this.pkgqty;
	}
 
	@Override
	public void setPkgqty(final BigDecimal pkgqty) {
		this.pkgqty = pkgqty; 
	}
 
	@Override
	public BigDecimal getRlsqty() {
		return this.rlsqty;
	}
 
	@Override
	public void setRlsqty(final BigDecimal rlsqty) {
		this.rlsqty = rlsqty; 
	}
 
	@Override
	public String getOwner() {
		return this.owner;
	}
 
	@Override
	public void setOwner(final String owner) {
		this.owner = owner; 
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
	public String getLabelmark() {
		return this.labelmark;
	}
 
	@Override
	public void setLabelmark(final String labelmark) {
		this.labelmark = labelmark; 
	}
 
	@Override
	public String getRbstatus() {
		return this.rbstatus;
	}
 
	@Override
	public void setRbstatus(final String rbstatus) {
		this.rbstatus = rbstatus; 
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
	public String getCcccode() {
		return this.ccccode;
	}
 
	@Override
	public void setCcccode(final String ccccode) {
		this.ccccode = ccccode; 
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
	public String getExtracond() {
		return this.extracond;
	}
 
	@Override
	public void setExtracond(final String extracond) {
		this.extracond = extracond; 
	}
 
}
