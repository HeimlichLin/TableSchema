package com.doc.common.po.impl; 
 
public class BatchdtlPo implements IBatchdtlPo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		TRANS_ID("交易ID"), //
		DELIVER_NO("進出倉單號"), //
		ITEM_NO("項次
"), //
		DELIVER_TYPE("進出倉類別"), //
		SPLIT_NO("批號"), //
		DELIVER_QTY("進出倉數量"), //
		DELIVER_DATE("進出倉日期"), //
		USER_ID("使用者代碼"), //
		REMARK("備註") //
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
	private String transId;
	private String deliverNo;
	private BigDecimal itemNo;
	private String deliverType;
	private String splitNo;
	private BigDecimal deliverQty;
	private String deliverDate;
	private String userId;
	private String remark;

	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
	}
 
	@Override
	public String getTransId() {
		return this.transId;
	}
 
	@Override
	public void setTransId(final String transId) {
		this.transId = transId; 
	}
 
	@Override
	public String getDeliverNo() {
		return this.deliverNo;
	}
 
	@Override
	public void setDeliverNo(final String deliverNo) {
		this.deliverNo = deliverNo; 
	}
 
	@Override
	public BigDecimal getItemNo() {
		return this.itemNo;
	}
 
	@Override
	public void setItemNo(final BigDecimal itemNo) {
		this.itemNo = itemNo; 
	}
 
	@Override
	public String getDeliverType() {
		return this.deliverType;
	}
 
	@Override
	public void setDeliverType(final String deliverType) {
		this.deliverType = deliverType; 
	}
 
	@Override
	public String getSplitNo() {
		return this.splitNo;
	}
 
	@Override
	public void setSplitNo(final String splitNo) {
		this.splitNo = splitNo; 
	}
 
	@Override
	public BigDecimal getDeliverQty() {
		return this.deliverQty;
	}
 
	@Override
	public void setDeliverQty(final BigDecimal deliverQty) {
		this.deliverQty = deliverQty; 
	}
 
	@Override
	public String getDeliverDate() {
		return this.deliverDate;
	}
 
	@Override
	public void setDeliverDate(final String deliverDate) {
		this.deliverDate = deliverDate; 
	}
 
	@Override
	public String getUserId() {
		return this.userId;
	}
 
	@Override
	public void setUserId(final String userId) {
		this.userId = userId; 
	}
 
	@Override
	public String getRemark() {
		return this.remark;
	}
 
	@Override
	public void setRemark(final String remark) {
		this.remark = remark; 
	}
 
}
