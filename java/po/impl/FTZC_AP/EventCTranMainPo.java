package com.doc.common.po.impl; 
 
public class EventCTranMainPo implements IEventCTranMainPo {
 
	public enum COLUMNS {
		FILENAME("檔名"), //
		SENDFLAG("傳送註記"), //
		SEND_TIME("傳送時間") //
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
 
}
