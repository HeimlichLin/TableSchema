package com.doc.common.po.impl; 
 
public class CpgSettingPo implements ICpgSettingPo {
 
	public enum COLUMNS {
		POSTSPECIALACCOUNT("特約號碼"), //
		HOST("host"), //
		USERID("帳號"), //
		PWD("密碼"), //
		PORT("PORT"), //
		RCV_ID("接收郵箱"), //
		BF_NO("監管編號"), //
		MESSAGETYPE("(F：自轉郵；C：貨轉郵)"), //
		SEND_FTP_PATH("FTP傳送ec路徑"), //
		GET_FTP_PATH("FTP傳送Xml路徑") //
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
	private String host;
	private String userid;
	private String pwd;
	private String port;
	private String rcvId;
	private String bfNo;
	private String messagetype;
	private String sendFtpPath;
	private String getFtpPath;

	@Override
	public String getPostspecialaccount() {
		return this.postspecialaccount;
	}
 
	@Override
	public void setPostspecialaccount(final String postspecialaccount) {
		this.postspecialaccount = postspecialaccount; 
	}
 
	@Override
	public String getHost() {
		return this.host;
	}
 
	@Override
	public void setHost(final String host) {
		this.host = host; 
	}
 
	@Override
	public String getUserid() {
		return this.userid;
	}
 
	@Override
	public void setUserid(final String userid) {
		this.userid = userid; 
	}
 
	@Override
	public String getPwd() {
		return this.pwd;
	}
 
	@Override
	public void setPwd(final String pwd) {
		this.pwd = pwd; 
	}
 
	@Override
	public String getPort() {
		return this.port;
	}
 
	@Override
	public void setPort(final String port) {
		this.port = port; 
	}
 
	@Override
	public String getRcvId() {
		return this.rcvId;
	}
 
	@Override
	public void setRcvId(final String rcvId) {
		this.rcvId = rcvId; 
	}
 
	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
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
	public String getSendFtpPath() {
		return this.sendFtpPath;
	}
 
	@Override
	public void setSendFtpPath(final String sendFtpPath) {
		this.sendFtpPath = sendFtpPath; 
	}
 
	@Override
	public String getGetFtpPath() {
		return this.getFtpPath;
	}
 
	@Override
	public void setGetFtpPath(final String getFtpPath) {
		this.getFtpPath = getFtpPath; 
	}
 
}
