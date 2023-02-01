package com.doc.common.po.impl; 
 
public class ScrapitemPo implements IScrapitemPo {
 
	public enum COLUMNS {
		BONDNO("監管編號"), //
		SCRAPNO("報廢單號"), //
		ITEM("項次"), //
		PRDTNO("料號"), //
		DESCRIP("品名"), //
		PRDTQTY("數量"), //
		UNITPRICE("單價"), //
		NET("淨重"), //
		ODECLNO("原進倉報單號碼"), //
		OITEMNO("原進倉報單項次"), //
		IMPORTDATE("進口日期"), //
		REMRKS("備註"), //
		PRDTUNIT("單位"), //
		OUTPOST("null"), //
		BOMNO("null"), //
		ROWPRDTNO("null"), //
		ROWQTY("null") //
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
	private String scrapno;
	private BigDecimal item;
	private String prdtno;
	private String descrip;
	private BigDecimal prdtqty;
	private BigDecimal unitprice;
	private BigDecimal net;
	private String odeclno;
	private BigDecimal oitemno;
	private String importdate;
	private String remrks;
	private String prdtunit;
	private String outpost;
	private String bomno;
	private String rowprdtno;
	private BigDecimal rowqty;

	@Override
	public String getBondno() {
		return this.bondno;
	}
 
	@Override
	public void setBondno(final String bondno) {
		this.bondno = bondno; 
	}
 
	@Override
	public String getScrapno() {
		return this.scrapno;
	}
 
	@Override
	public void setScrapno(final String scrapno) {
		this.scrapno = scrapno; 
	}
 
	@Override
	public BigDecimal getItem() {
		return this.item;
	}
 
	@Override
	public void setItem(final BigDecimal item) {
		this.item = item; 
	}
 
	@Override
	public String getPrdtno() {
		return this.prdtno;
	}
 
	@Override
	public void setPrdtno(final String prdtno) {
		this.prdtno = prdtno; 
	}
 
	@Override
	public String getDescrip() {
		return this.descrip;
	}
 
	@Override
	public void setDescrip(final String descrip) {
		this.descrip = descrip; 
	}
 
	@Override
	public BigDecimal getPrdtqty() {
		return this.prdtqty;
	}
 
	@Override
	public void setPrdtqty(final BigDecimal prdtqty) {
		this.prdtqty = prdtqty; 
	}
 
	@Override
	public BigDecimal getUnitprice() {
		return this.unitprice;
	}
 
	@Override
	public void setUnitprice(final BigDecimal unitprice) {
		this.unitprice = unitprice; 
	}
 
	@Override
	public BigDecimal getNet() {
		return this.net;
	}
 
	@Override
	public void setNet(final BigDecimal net) {
		this.net = net; 
	}
 
	@Override
	public String getOdeclno() {
		return this.odeclno;
	}
 
	@Override
	public void setOdeclno(final String odeclno) {
		this.odeclno = odeclno; 
	}
 
	@Override
	public BigDecimal getOitemno() {
		return this.oitemno;
	}
 
	@Override
	public void setOitemno(final BigDecimal oitemno) {
		this.oitemno = oitemno; 
	}
 
	@Override
	public String getImportdate() {
		return this.importdate;
	}
 
	@Override
	public void setImportdate(final String importdate) {
		this.importdate = importdate; 
	}
 
	@Override
	public String getRemrks() {
		return this.remrks;
	}
 
	@Override
	public void setRemrks(final String remrks) {
		this.remrks = remrks; 
	}
 
	@Override
	public String getPrdtunit() {
		return this.prdtunit;
	}
 
	@Override
	public void setPrdtunit(final String prdtunit) {
		this.prdtunit = prdtunit; 
	}
 
	@Override
	public String getOutpost() {
		return this.outpost;
	}
 
	@Override
	public void setOutpost(final String outpost) {
		this.outpost = outpost; 
	}
 
	@Override
	public String getBomno() {
		return this.bomno;
	}
 
	@Override
	public void setBomno(final String bomno) {
		this.bomno = bomno; 
	}
 
	@Override
	public String getRowprdtno() {
		return this.rowprdtno;
	}
 
	@Override
	public void setRowprdtno(final String rowprdtno) {
		this.rowprdtno = rowprdtno; 
	}
 
	@Override
	public BigDecimal getRowqty() {
		return this.rowqty;
	}
 
	@Override
	public void setRowqty(final BigDecimal rowqty) {
		this.rowqty = rowqty; 
	}
 
}
