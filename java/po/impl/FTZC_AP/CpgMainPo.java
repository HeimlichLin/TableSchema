package com.doc.common.po.impl; 
 
public class CpgMainPo implements ICpgMainPo {
 
	public enum COLUMNS {
		MESSAGEID("訊息代碼(CPG)"), //
		MESSAGENAME("訊息名稱(自轉郵貨物清單)"), //
		MESSAGEVERSION("訊息版本"), //
		SENDERID("傳入者ID"), //
		RECIPIENTTYPE("接收者代碼類型(TVP)"), //
		RECIPIENTID("接收者ID"), //
		MSGFUNCCODE("異動別(1：刪除
5：修改
9：新增)"), //
		MESSAGETYPE("訊息別(F：自轉郵；C：貨轉郵)"), //
		POSTSPECIALACCOUNT("特約戶號"), //
		POSTTYPE("郵件類別(1：EMS
2：掛號R
3：平件M
4：速遞空運
5：ｅ小包
6：速遞海運)"), //
		YEAR("年度"), //
		COUNTRYCODE("國名代碼"), //
		EXCHANGEAGENCY("互換局名(FOCE)"), //
		TOTALPACKAGENO("總包號碼"), //
		SEALDATETIME("封發時間(YYYYMMDDhhmm)"), //
		POSTMBLNO("提單號碼"), //
		LASTYEARTOTALPACKAGENO("去年最後總包"), //
		TOTALQTY("總件數"), //
		TOTALPAGECOUNT("總頁數"), //
		TOTALBAGNUMBER("總袋數"), //
		TOTALWEIGHT("總重量"), //
		OTHERFIELDS("其他欄位"), //
		FILENAME("檔名"), //
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
 
	private String messageid;
	private String messagename;
	private String messageversion;
	private String senderid;
	private String recipienttype;
	private String recipientid;
	private String msgfunccode;
	private String messagetype;
	private String postspecialaccount;
	private String posttype;
	private String year;
	private String countrycode;
	private String exchangeagency;
	private BigDecimal totalpackageno;
	private String sealdatetime;
	private String postmblno;
	private String lastyeartotalpackageno;
	private BigDecimal totalqty;
	private BigDecimal totalpagecount;
	private BigDecimal totalbagnumber;
	private BigDecimal totalweight;
	private String otherfields;
	private String filename;
	private String createtime;

	@Override
	public String getMessageid() {
		return this.messageid;
	}
 
	@Override
	public void setMessageid(final String messageid) {
		this.messageid = messageid; 
	}
 
	@Override
	public String getMessagename() {
		return this.messagename;
	}
 
	@Override
	public void setMessagename(final String messagename) {
		this.messagename = messagename; 
	}
 
	@Override
	public String getMessageversion() {
		return this.messageversion;
	}
 
	@Override
	public void setMessageversion(final String messageversion) {
		this.messageversion = messageversion; 
	}
 
	@Override
	public String getSenderid() {
		return this.senderid;
	}
 
	@Override
	public void setSenderid(final String senderid) {
		this.senderid = senderid; 
	}
 
	@Override
	public String getRecipienttype() {
		return this.recipienttype;
	}
 
	@Override
	public void setRecipienttype(final String recipienttype) {
		this.recipienttype = recipienttype; 
	}
 
	@Override
	public String getRecipientid() {
		return this.recipientid;
	}
 
	@Override
	public void setRecipientid(final String recipientid) {
		this.recipientid = recipientid; 
	}
 
	@Override
	public String getMsgfunccode() {
		return this.msgfunccode;
	}
 
	@Override
	public void setMsgfunccode(final String msgfunccode) {
		this.msgfunccode = msgfunccode; 
	}
 
	@Override
	public String getMessagetype() {
		return this.messagetype;
	}
 
	@Override
	public void setMessagetype(final String messagetype) {
		this.messagetype = messagetype; 
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
	public String getSealdatetime() {
		return this.sealdatetime;
	}
 
	@Override
	public void setSealdatetime(final String sealdatetime) {
		this.sealdatetime = sealdatetime; 
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
	public String getLastyeartotalpackageno() {
		return this.lastyeartotalpackageno;
	}
 
	@Override
	public void setLastyeartotalpackageno(final String lastyeartotalpackageno) {
		this.lastyeartotalpackageno = lastyeartotalpackageno; 
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
	public String getOtherfields() {
		return this.otherfields;
	}
 
	@Override
	public void setOtherfields(final String otherfields) {
		this.otherfields = otherfields; 
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
	public String getCreatetime() {
		return this.createtime;
	}
 
	@Override
	public void setCreatetime(final String createtime) {
		this.createtime = createtime; 
	}
 
}
