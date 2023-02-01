package com.doc.common.po.impl; 
 
public class ReleasePo implements IReleasePo {
 
	public enum COLUMNS {
		BOXNO("報關行箱號"), //
		DECLTYPE("報單類別"), //
		DECLNO("報單號碼"), //
		STGPLACE("存放處所"), //
		RLSTIME("放行時間"), //
		RLSPKG("放行件數"), //
		PKGUNIT("件數單位"), //
		GWGT("總重量"), //
		EXTRACOND("放行附帶條件"), //
		VESSELSIGN("船舶呼號"), //
		VOYAGENO("航次"), //
		SHIPCODE("船公司代碼"), //
		EXPORTER("貨主名稱"), //
		CLEARTYPE("通關方式"), //
		MSGTYPE("Edi訊息別"), //
		STRTYPE("進出倉別"), //
		ASTYPE("海空運別"), //
		MAWBNO("主提單號"), //
		HAWBNO("分提單號"), //
		UNRLSPKG("未放行件數"), //
		UNPKGUNIT("未放行單位") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
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

	@Override
	public String getBoxno() {
		return this.boxno;
	}
 
	@Override
	public void setBoxno(final String boxno) {
		this.boxno = boxno; 
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
	public String getStgplace() {
		return this.stgplace;
	}
 
	@Override
	public void setStgplace(final String stgplace) {
		this.stgplace = stgplace; 
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
	public BigDecimal getRlspkg() {
		return this.rlspkg;
	}
 
	@Override
	public void setRlspkg(final BigDecimal rlspkg) {
		this.rlspkg = rlspkg; 
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
	public String getExtracond() {
		return this.extracond;
	}
 
	@Override
	public void setExtracond(final String extracond) {
		this.extracond = extracond; 
	}
 
	@Override
	public String getVesselsign() {
		return this.vesselsign;
	}
 
	@Override
	public void setVesselsign(final String vesselsign) {
		this.vesselsign = vesselsign; 
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
	public String getShipcode() {
		return this.shipcode;
	}
 
	@Override
	public void setShipcode(final String shipcode) {
		this.shipcode = shipcode; 
	}
 
	@Override
	public String getExporter() {
		return this.exporter;
	}
 
	@Override
	public void setExporter(final String exporter) {
		this.exporter = exporter; 
	}
 
	@Override
	public String getCleartype() {
		return this.cleartype;
	}
 
	@Override
	public void setCleartype(final String cleartype) {
		this.cleartype = cleartype; 
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
	public String getStrtype() {
		return this.strtype;
	}
 
	@Override
	public void setStrtype(final String strtype) {
		this.strtype = strtype; 
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
	public BigDecimal getUnrlspkg() {
		return this.unrlspkg;
	}
 
	@Override
	public void setUnrlspkg(final BigDecimal unrlspkg) {
		this.unrlspkg = unrlspkg; 
	}
 
	@Override
	public String getUnpkgunit() {
		return this.unpkgunit;
	}
 
	@Override
	public void setUnpkgunit(final String unpkgunit) {
		this.unpkgunit = unpkgunit; 
	}
 
}
