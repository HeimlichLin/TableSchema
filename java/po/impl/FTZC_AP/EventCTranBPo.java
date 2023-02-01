package com.doc.common.po.impl; 
 
public class EventCTranBPo implements IEventCTranBPo {
 
	public enum COLUMNS {
		POSTSPECIALACCOUNT("資料來源"), //
		POSTTYPE("郵件類別"), //
		TYPE("格        式"), //
		YEAR("年        度"), //
		COUNTRYCODE("國名代碼"), //
		EXCHANGEAGENCY("互換局名"), //
		TOTALPACKAGENO("總包號碼"), //
		BAGNO("袋        序"), //
		LASTMARK("最後一袋"), //
		PAGENO("該袋頁數"), //
		QTY("件        數"), //
		WEIGHT("重        量"), //
		SEALDATETIME("封發時間"), //
		FILENAME("檔名") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String postspecialaccount;
	private String posttype;
	private String type;
	private String year;
	private String countrycode;
	private String exchangeagency;
	private BigDecimal totalpackageno;
	private BigDecimal bagno;
	private String lastmark;
	private BigDecimal pageno;
	private BigDecimal qty;
	private BigDecimal weight;
	private String sealdatetime;
	private String filename;

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
	public BigDecimal getBagno() {
		return this.bagno;
	}
 
	@Override
	public void setBagno(final BigDecimal bagno) {
		this.bagno = bagno; 
	}
 
	@Override
	public String getLastmark() {
		return this.lastmark;
	}
 
	@Override
	public void setLastmark(final String lastmark) {
		this.lastmark = lastmark; 
	}
 
	@Override
	public BigDecimal getPageno() {
		return this.pageno;
	}
 
	@Override
	public void setPageno(final BigDecimal pageno) {
		this.pageno = pageno; 
	}
 
	@Override
	public BigDecimal getQty() {
		return this.qty;
	}
 
	@Override
	public void setQty(final BigDecimal qty) {
		this.qty = qty; 
	}
 
	@Override
	public BigDecimal getWeight() {
		return this.weight;
	}
 
	@Override
	public void setWeight(final BigDecimal weight) {
		this.weight = weight; 
	}
 
	@Override
	public String getSealdatetime() {
		return this.sealdatetime;
	}
 
	@Override
	public void setSealdatetime(final String sealdatetime) {
		this.sealdatetime = sealdatetime; 
	}
 
	@Override
	public String getFilename() {
		return this.filename;
	}
 
	@Override
	public void setFilename(final String filename) {
		this.filename = filename; 
	}
 
}
