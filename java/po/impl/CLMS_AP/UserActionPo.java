package com.doc.common.po.impl; 
 
public class UserActionPo implements IUserActionPo {
 
	public enum COLUMNS {
		USER_ID("使用者帳號"), //
		BOND_NO("業者監管編號"), //
		STARTDATE("進入日期"), //
		ENDDATE("結束日期"), //
		STARTTIME("進入時間"), //
		ENDTIME("結束時間"), //
		IP("IP"), //
		URL("URL"), //
		ATTRIBUTE("參數"), //
		DECLNO("報單號碼"), //
		REFBILLNO("參考單號"), //
		MESSAGE("訊息") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String userId;
	private String bondNo;
	private String startdate;
	private String enddate;
	private String starttime;
	private String endtime;
	private String ip;
	private String url;
	private String attribute;
	private String declno;
	private String refbillno;
	private String message;

	@Override
	public String getUserId() {
		return this.userId;
	}
 
	@Override
	public void setUserId(final String userId) {
		this.userId = userId; 
	}
 
	@Override
	public String getBondNo() {
		return this.bondNo;
	}
 
	@Override
	public void setBondNo(final String bondNo) {
		this.bondNo = bondNo; 
	}
 
	@Override
	public String getStartdate() {
		return this.startdate;
	}
 
	@Override
	public void setStartdate(final String startdate) {
		this.startdate = startdate; 
	}
 
	@Override
	public String getEnddate() {
		return this.enddate;
	}
 
	@Override
	public void setEnddate(final String enddate) {
		this.enddate = enddate; 
	}
 
	@Override
	public String getStarttime() {
		return this.starttime;
	}
 
	@Override
	public void setStarttime(final String starttime) {
		this.starttime = starttime; 
	}
 
	@Override
	public String getEndtime() {
		return this.endtime;
	}
 
	@Override
	public void setEndtime(final String endtime) {
		this.endtime = endtime; 
	}
 
	@Override
	public String getIp() {
		return this.ip;
	}
 
	@Override
	public void setIp(final String ip) {
		this.ip = ip; 
	}
 
	@Override
	public String getUrl() {
		return this.url;
	}
 
	@Override
	public void setUrl(final String url) {
		this.url = url; 
	}
 
	@Override
	public String getAttribute() {
		return this.attribute;
	}
 
	@Override
	public void setAttribute(final String attribute) {
		this.attribute = attribute; 
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
	public String getRefbillno() {
		return this.refbillno;
	}
 
	@Override
	public void setRefbillno(final String refbillno) {
		this.refbillno = refbillno; 
	}
 
	@Override
	public String getMessage() {
		return this.message;
	}
 
	@Override
	public void setMessage(final String message) {
		this.message = message; 
	}
 
}
