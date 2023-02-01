package com.doc.common.po.impl; 
 
public class CpgTranMainPo implements ICpgTranMainPo {
 
	public enum COLUMNS {
		FILENAME("檔名"), //
		SENDFLAG("傳送註記"), //
		SEND_TIME("傳送時間"), //
		MSGFUNCCODE("異動別
1：刪除
5：修改
9：新增"), //
		POSTSPECIALACCOUNT("特約戶號"), //
		MESSAGETYPE("訊息別(F：自轉郵；C：貨轉郵)") //
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
	private String sendflag;
	private String sendTime;
	private String msgfunccode;
	private String postspecialaccount;
	private String messagetype;

	@Override
	public String getFilename() {
		return this.filename;
	}
 
	@Override
	public void setFilename(final String filename) {
		this.filename = filename; 
	}
 
	@Override
	public String getSendflag() {
		return this.sendflag;
	}
 
	@Override
	public void setSendflag(final String sendflag) {
		this.sendflag = sendflag; 
	}
 
	@Override
	public String getSendTime() {
		return this.sendTime;
	}
 
	@Override
	public void setSendTime(final String sendTime) {
		this.sendTime = sendTime; 
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
	public String getPostspecialaccount() {
		return this.postspecialaccount;
	}
 
	@Override
	public void setPostspecialaccount(final String postspecialaccount) {
		this.postspecialaccount = postspecialaccount; 
	}
 
	@Override
	public String getMessagetype() {
		return this.messagetype;
	}
 
	@Override
	public void setMessagetype(final String messagetype) {
		this.messagetype = messagetype; 
	}
 
}
