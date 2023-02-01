package com.doc.common.po.impl; 
 
public class N1BT1Po implements IN1BT1Po {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		CONTROL_NO("上傳檔名"), //
		RECV_TIME("接收時間"), //
		VERSION("上傳版次"), //
		SEQ_NO("資料序號"), //
		FUNC_TYPE("異動別"), //
		POST("儲位"), //
		ATTRIBUTE("屬性"), //
		I_CONFIRMED("是否更新 N/Y") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String bfNo;
	private String controlNo;
	private java.sql.Timestamp recvTime;
	private BigDecimal version;
	private BigDecimal seqNo;
	private String funcType;
	private String post;
	private String attribute;
	private String iConfirmed;

	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
	}
 
	@Override
	public String getControlNo() {
		return this.controlNo;
	}
 
	@Override
	public void setControlNo(final String controlNo) {
		this.controlNo = controlNo; 
	}
 
	@Override
	public java.sql.Timestamp getRecvTime() {
		return this.recvTime;
	}
 
	@Override
	public void setRecvTime(final java.sql.Timestamp recvTime) {
		this.recvTime = recvTime; 
	}
 
	@Override
	public BigDecimal getVersion() {
		return this.version;
	}
 
	@Override
	public void setVersion(final BigDecimal version) {
		this.version = version; 
	}
 
	@Override
	public BigDecimal getSeqNo() {
		return this.seqNo;
	}
 
	@Override
	public void setSeqNo(final BigDecimal seqNo) {
		this.seqNo = seqNo; 
	}
 
	@Override
	public String getFuncType() {
		return this.funcType;
	}
 
	@Override
	public void setFuncType(final String funcType) {
		this.funcType = funcType; 
	}
 
	@Override
	public String getPost() {
		return this.post;
	}
 
	@Override
	public void setPost(final String post) {
		this.post = post; 
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
	public String getIConfirmed() {
		return this.iConfirmed;
	}
 
	@Override
	public void setIConfirmed(final String iConfirmed) {
		this.iConfirmed = iConfirmed; 
	}
 
}
