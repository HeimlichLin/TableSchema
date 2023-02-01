package com.doc.common.po.impl; 
 
public class CpgTranPostPo implements ICpgTranPostPo {
 
	public enum COLUMNS {
		FILENAME("檔名"), //
		POSTMBLNO("貨提單號碼"), //
		ORIRCVFILE("原接收檔名"), //
		FLIGHTNO("起飛班機"), //
		FLIGHTDATETIME("起飛時間"), //
		POSTTYPE("郵件類別"), //
		POSTSPECIALACCOUNT("特約戶號"), //
		TYPE("格        式"), //
		YEAR("年        度"), //
		COUNTRYCODE("國名代碼"), //
		EXCHANGEAGENCY("互換局名"), //
		TOTALPACKAGENO("總包號碼"), //
		GOODTOTALPACKAGEYEAR("貨總包年度"), //
		GOODTOTALPACKAGENO("貨總包號碼") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String filename;
	private String postmblno;
	private String orircvfile;
	private String flightno;
	private String flightdatetime;
	private String posttype;
	private String postspecialaccount;
	private String type;
	private String year;
	private String countrycode;
	private String exchangeagency;
	private BigDecimal totalpackageno;
	private String goodtotalpackageyear;
	private String goodtotalpackageno;

	@Override
	public String getFilename() {
		return this.filename;
	}
 
	@Override
	public void setFilename(final String filename) {
		this.filename = filename; 
	}
 
	@Override
	public String getPostmblno() {
		return this.postmblno;
	}
 
	@Override
	public void setPostmblno(final String postmblno) {
		this.postmblno = postmblno; 
	}
 
	@Override
	public String getOrircvfile() {
		return this.orircvfile;
	}
 
	@Override
	public void setOrircvfile(final String orircvfile) {
		this.orircvfile = orircvfile; 
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
	public String getFlightdatetime() {
		return this.flightdatetime;
	}
 
	@Override
	public void setFlightdatetime(final String flightdatetime) {
		this.flightdatetime = flightdatetime; 
	}
 
	@Override
	public String getPosttype() {
		return this.posttype;
	}
 
	@Override
	public void setPosttype(final String posttype) {
		this.posttype = posttype; 
	}
 
	@Override
	public String getPostspecialaccount() {
		return this.postspecialaccount;
	}
 
	@Override
	public void setPostspecialaccount(final String postspecialaccount) {
		this.postspecialaccount = postspecialaccount; 
	}
 
	@Override
	public String getType() {
		return this.type;
	}
 
	@Override
	public void setType(final String type) {
		this.type = type; 
	}
 
	@Override
	public String getYear() {
		return this.year;
	}
 
	@Override
	public void setYear(final String year) {
		this.year = year; 
	}
 
	@Override
	public String getCountrycode() {
		return this.countrycode;
	}
 
	@Override
	public void setCountrycode(final String countrycode) {
		this.countrycode = countrycode; 
	}
 
	@Override
	public String getExchangeagency() {
		return this.exchangeagency;
	}
 
	@Override
	public void setExchangeagency(final String exchangeagency) {
		this.exchangeagency = exchangeagency; 
	}
 
	@Override
	public BigDecimal getTotalpackageno() {
		return this.totalpackageno;
	}
 
	@Override
	public void setTotalpackageno(final BigDecimal totalpackageno) {
		this.totalpackageno = totalpackageno; 
	}
 
	@Override
	public String getGoodtotalpackageyear() {
		return this.goodtotalpackageyear;
	}
 
	@Override
	public void setGoodtotalpackageyear(final String goodtotalpackageyear) {
		this.goodtotalpackageyear = goodtotalpackageyear; 
	}
 
	@Override
	public String getGoodtotalpackageno() {
		return this.goodtotalpackageno;
	}
 
	@Override
	public void setGoodtotalpackageno(final String goodtotalpackageno) {
		this.goodtotalpackageno = goodtotalpackageno; 
	}
 
}
