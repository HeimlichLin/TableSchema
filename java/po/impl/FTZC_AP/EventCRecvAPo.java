package com.doc.common.po.impl; 
 
public class EventCRecvAPo implements IEventCRecvAPo {
 
	public enum COLUMNS {
		POSTSPECIALACCOUNT("特約戶號"), //
		POSTTYPE("郵件類別"), //
		TYPE("格        式"), //
		YEAR("年        度"), //
		COUNTRYCODE("國名代碼"), //
		EXCHANGEAGENCY("互換局名"), //
		TOTALPACKAGENO("總包號碼"), //
		POSTMBLNO("貨提單號碼"), //
		SEALDATETIME("封發時間"), //
		TOTALQTY("總  件  數"), //
		TOTALPAGECOUNT("總  頁  數"), //
		TOTALBAGNUMBER("總  袋  數"), //
		TOTALWEIGHT("總  重  量"), //
		FILENAME("檔名"), //
		GOODTOTALPACKAGEYEAR("貨總包年度"), //
		GOODTOTALPACKAGENO("貨總包號碼"), //
		OLDFILENAME("原接收檔名"), //
		TAKEOFFFLIGHT("起飛班機"), //
		SENDTIME("起飛時間"), //
		ARRIVALTIME("預定到達時間"), //
		CREATETIME("收檔時間(YYYYMMDDhhmmss)") //
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
	private String postmblno;
	private String sealdatetime;
	private BigDecimal totalqty;
	private BigDecimal totalpagecount;
	private BigDecimal totalbagnumber;
	private BigDecimal totalweight;
	private String filename;
	private String goodtotalpackageyear;
	private String goodtotalpackageno;
	private String oldfilename;
	private String takeoffflight;
	private String sendtime;
	private String arrivaltime;
	private String createtime;

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
	public String getPostmblno() {
		return this.postmblno;
	}
 
	@Override
	public void setPostmblno(final String postmblno) {
		this.postmblno = postmblno; 
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
	public BigDecimal getTotalqty() {
		return this.totalqty;
	}
 
	@Override
	public void setTotalqty(final BigDecimal totalqty) {
		this.totalqty = totalqty; 
	}
 
	@Override
	public BigDecimal getTotalpagecount() {
		return this.totalpagecount;
	}
 
	@Override
	public void setTotalpagecount(final BigDecimal totalpagecount) {
		this.totalpagecount = totalpagecount; 
	}
 
	@Override
	public BigDecimal getTotalbagnumber() {
		return this.totalbagnumber;
	}
 
	@Override
	public void setTotalbagnumber(final BigDecimal totalbagnumber) {
		this.totalbagnumber = totalbagnumber; 
	}
 
	@Override
	public BigDecimal getTotalweight() {
		return this.totalweight;
	}
 
	@Override
	public void setTotalweight(final BigDecimal totalweight) {
		this.totalweight = totalweight; 
	}
 
	@Override
	public String getFilename() {
		return this.filename;
	}
 
	@Override
	public void setFilename(final String filename) {
		this.filename = filename; 
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
 
	@Override
	public String getOldfilename() {
		return this.oldfilename;
	}
 
	@Override
	public void setOldfilename(final String oldfilename) {
		this.oldfilename = oldfilename; 
	}
 
	@Override
	public String getTakeoffflight() {
		return this.takeoffflight;
	}
 
	@Override
	public void setTakeoffflight(final String takeoffflight) {
		this.takeoffflight = takeoffflight; 
	}
 
	@Override
	public String getSendtime() {
		return this.sendtime;
	}
 
	@Override
	public void setSendtime(final String sendtime) {
		this.sendtime = sendtime; 
	}
 
	@Override
	public String getArrivaltime() {
		return this.arrivaltime;
	}
 
	@Override
	public void setArrivaltime(final String arrivaltime) {
		this.arrivaltime = arrivaltime; 
	}
 
	@Override
	public String getCreatetime() {
		return this.createtime;
	}
 
	@Override
	public void setCreatetime(final String createtime) {
		this.createtime = createtime; 
	}
 
}
