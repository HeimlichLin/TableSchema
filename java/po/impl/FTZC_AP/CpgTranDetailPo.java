package com.doc.common.po.impl; 
 
public class CpgTranDetailPo implements ICpgTranDetailPo {
 
	public enum COLUMNS {
		FILENAME("檔名"), //
		POSTNO("郵件號碼"), //
		POSTSPECIALACCOUNT("特約戶號"), //
		POSTTYPE("郵件類別"), //
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
	private String postno;
	private String postspecialaccount;
	private String posttype;
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
	public String getPostno() {
		return this.postno;
	}
 
	@Override
	public void setPostno(final String postno) {
		this.postno = postno; 
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
	public String getPosttype() {
		return this.posttype;
	}
 
	@Override
	public void setPosttype(final String posttype) {
		this.posttype = posttype; 
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
