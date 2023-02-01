package com.doc.common.po.impl; 
 
public class EventCTranCPo implements IEventCTranCPo {
 
	public enum COLUMNS {
		POSTSPECIALACCOUNT("資料來源"), //
		POSTTYPE("郵件類別"), //
		TYPE("格        式"), //
		YEAR("年        度"), //
		COUNTRYCODE("國名代碼"), //
		EXCHANGEAGENCY("互換局名"), //
		TOTALPACKAGENO("總包號碼"), //
		BAGNO("袋        序"), //
		PAGENO("頁        序"), //
		CELLNO("格        次"), //
		POSTNO("郵件號碼"), //
		WEIGHT("重        量"), //
		SEALDATETIME("封發時間"), //
		PROVINCETYPE("省        別"), //
		BOXTYPE("箱        別"), //
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
	private BigDecimal pageno;
	private BigDecimal cellno;
	private String postno;
	private BigDecimal weight;
	private String sealdatetime;
	private String provincetype;
	private String boxtype;
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
	public BigDecimal getPageno() {
		return this.pageno;
	}
 
	@Override
	public void setPageno(final BigDecimal pageno) {
		this.pageno = pageno; 
	}
 
	@Override
	public BigDecimal getCellno() {
		return this.cellno;
	}
 
	@Override
	public void setCellno(final BigDecimal cellno) {
		this.cellno = cellno; 
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
	public String getProvincetype() {
		return this.provincetype;
	}
 
	@Override
	public void setProvincetype(final String provincetype) {
		this.provincetype = provincetype; 
	}
 
	@Override
	public String getBoxtype() {
		return this.boxtype;
	}
 
	@Override
	public void setBoxtype(final String boxtype) {
		this.boxtype = boxtype; 
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
