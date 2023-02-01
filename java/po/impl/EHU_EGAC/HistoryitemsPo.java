package com.doc.common.po.impl; 
 
public class HistoryitemsPo implements IHistoryitemsPo {
 
	public enum COLUMNS {
		BAGNO("null"), //
		HWB("null"), //
		MWB("null"), //
		ITEMNO("null"), //
		EXPBAGNO("null"), //
		GCIWS("null"), //
		GCIUSER("null"), //
		GCIDATE("null"), //
		GCIWEIGHT("null"), //
		GCOWS("null"), //
		GCOUSER("null"), //
		GCODATE("null"), //
		GCOSN("null"), //
		FLIGHTNO("null"), //
		EXPRESSID("null"), //
		CONTAINER("null"), //
		CUSTOMSID("null"), //
		OCUSTOMSID("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String bagno;
	private String hwb;
	private String mwb;
	private BigDecimal itemno;
	private String expbagno;
	private String gciws;
	private String gciuser;
	private java.sql.Timestamp gcidate;
	private BigDecimal gciweight;
	private String gcows;
	private String gcouser;
	private java.sql.Timestamp gcodate;
	private BigDecimal gcosn;
	private String flightno;
	private String expressid;
	private String container;
	private String customsid;
	private String ocustomsid;

	@Override
	public String getBagno() {
		return this.bagno;
	}
 
	@Override
	public void setBagno(final String bagno) {
		this.bagno = bagno; 
	}
 
	@Override
	public String getHwb() {
		return this.hwb;
	}
 
	@Override
	public void setHwb(final String hwb) {
		this.hwb = hwb; 
	}
 
	@Override
	public String getMwb() {
		return this.mwb;
	}
 
	@Override
	public void setMwb(final String mwb) {
		this.mwb = mwb; 
	}
 
	@Override
	public BigDecimal getItemno() {
		return this.itemno;
	}
 
	@Override
	public void setItemno(final BigDecimal itemno) {
		this.itemno = itemno; 
	}
 
	@Override
	public String getExpbagno() {
		return this.expbagno;
	}
 
	@Override
	public void setExpbagno(final String expbagno) {
		this.expbagno = expbagno; 
	}
 
	@Override
	public String getGciws() {
		return this.gciws;
	}
 
	@Override
	public void setGciws(final String gciws) {
		this.gciws = gciws; 
	}
 
	@Override
	public String getGciuser() {
		return this.gciuser;
	}
 
	@Override
	public void setGciuser(final String gciuser) {
		this.gciuser = gciuser; 
	}
 
	@Override
	public java.sql.Timestamp getGcidate() {
		return this.gcidate;
	}
 
	@Override
	public void setGcidate(final java.sql.Timestamp gcidate) {
		this.gcidate = gcidate; 
	}
 
	@Override
	public BigDecimal getGciweight() {
		return this.gciweight;
	}
 
	@Override
	public void setGciweight(final BigDecimal gciweight) {
		this.gciweight = gciweight; 
	}
 
	@Override
	public String getGcows() {
		return this.gcows;
	}
 
	@Override
	public void setGcows(final String gcows) {
		this.gcows = gcows; 
	}
 
	@Override
	public String getGcouser() {
		return this.gcouser;
	}
 
	@Override
	public void setGcouser(final String gcouser) {
		this.gcouser = gcouser; 
	}
 
	@Override
	public java.sql.Timestamp getGcodate() {
		return this.gcodate;
	}
 
	@Override
	public void setGcodate(final java.sql.Timestamp gcodate) {
		this.gcodate = gcodate; 
	}
 
	@Override
	public BigDecimal getGcosn() {
		return this.gcosn;
	}
 
	@Override
	public void setGcosn(final BigDecimal gcosn) {
		this.gcosn = gcosn; 
	}
 
	@Override
	public String getFlightno() {
		return this.flightno;
	}
 
	@Override
	public void setFlightno(final String flightno) {
		this.flightno = flightno; 
	}
 
	@Override
	public String getExpressid() {
		return this.expressid;
	}
 
	@Override
	public void setExpressid(final String expressid) {
		this.expressid = expressid; 
	}
 
	@Override
	public String getContainer() {
		return this.container;
	}
 
	@Override
	public void setContainer(final String container) {
		this.container = container; 
	}
 
	@Override
	public String getCustomsid() {
		return this.customsid;
	}
 
	@Override
	public void setCustomsid(final String customsid) {
		this.customsid = customsid; 
	}
 
	@Override
	public String getOcustomsid() {
		return this.ocustomsid;
	}
 
	@Override
	public void setOcustomsid(final String ocustomsid) {
		this.ocustomsid = ocustomsid; 
	}
 
}
