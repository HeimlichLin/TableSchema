package com.doc.common.po.impl; 
 
public class MailaccountPo implements IMailaccountPo {
 
	public enum COLUMNS {
		BONDNO("監管編號"), //
		RECTYPE("R:收件人,C:副本收件人"), //
		RECEIVER("收件人名稱"), //
		MAILADDR("Mail Address") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String bondno;
	private String rectype;
	private String receiver;
	private String mailaddr;

	@Override
	public String getBondno() {
		return this.bondno;
	}
 
	@Override
	public void setBondno(final String bondno) {
		this.bondno = bondno; 
	}
 
	@Override
	public String getRectype() {
		return this.rectype;
	}
 
	@Override
	public void setRectype(final String rectype) {
		this.rectype = rectype; 
	}
 
	@Override
	public String getReceiver() {
		return this.receiver;
	}
 
	@Override
	public void setReceiver(final String receiver) {
		this.receiver = receiver; 
	}
 
	@Override
	public String getMailaddr() {
		return this.mailaddr;
	}
 
	@Override
	public void setMailaddr(final String mailaddr) {
		this.mailaddr = mailaddr; 
	}
 
}
