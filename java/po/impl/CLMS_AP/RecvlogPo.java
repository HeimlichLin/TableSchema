package com.doc.common.po.impl; 
 
public class RecvlogPo implements IRecvlogPo {
 
	public enum COLUMNS {
		BONDNO("監管編號"), //
		RECVTYPE("訊息別"), //
		KEYWORD("主鍵"), //
		MSGTYPE("Edi訊息別"), //
		PROCTIME("系統時間"), //
		PROCSTATUS("存檔狀態"), //
		PROCRMK("錯誤訊息"), //
		CONTROLNO("檔名") //
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
	private String recvtype;
	private String keyword;
	private String msgtype;
	private java.sql.Timestamp proctime;
	private BigDecimal procstatus;
	private String procrmk;
	private String controlno;

	@Override
	public String getBondno() {
		return this.bondno;
	}
 
	@Override
	public void setBondno(final String bondno) {
		this.bondno = bondno; 
	}
 
	@Override
	public String getRecvtype() {
		return this.recvtype;
	}
 
	@Override
	public void setRecvtype(final String recvtype) {
		this.recvtype = recvtype; 
	}
 
	@Override
	public String getKeyword() {
		return this.keyword;
	}
 
	@Override
	public void setKeyword(final String keyword) {
		this.keyword = keyword; 
	}
 
	@Override
	public String getMsgtype() {
		return this.msgtype;
	}
 
	@Override
	public void setMsgtype(final String msgtype) {
		this.msgtype = msgtype; 
	}
 
	@Override
	public java.sql.Timestamp getProctime() {
		return this.proctime;
	}
 
	@Override
	public void setProctime(final java.sql.Timestamp proctime) {
		this.proctime = proctime; 
	}
 
	@Override
	public BigDecimal getProcstatus() {
		return this.procstatus;
	}
 
	@Override
	public void setProcstatus(final BigDecimal procstatus) {
		this.procstatus = procstatus; 
	}
 
	@Override
	public String getProcrmk() {
		return this.procrmk;
	}
 
	@Override
	public void setProcrmk(final String procrmk) {
		this.procrmk = procrmk; 
	}
 
	@Override
	public String getControlno() {
		return this.controlno;
	}
 
	@Override
	public void setControlno(final String controlno) {
		this.controlno = controlno; 
	}
 
}
