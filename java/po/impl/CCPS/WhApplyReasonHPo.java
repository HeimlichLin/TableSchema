package com.doc.common.po.impl; 
 
public class WhApplyReasonHPo implements IWhApplyReasonHPo {
 
	public enum COLUMNS {
		RECORD_NO("紀錄編號"), //
		WH_APPLY_SER_NO("入倉申請序號"), //
		WH_REASON_TYPE("入倉事由類別"), //
		WH_REASON_ID("入倉事由編號"), //
		WH_REASON_COMMENT("入倉事由補充說明") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String recordNo;
	private String whApplySerNo;
	private String whReasonType;
	private String whReasonId;
	private String whReasonComment;

	@Override
	public String getRecordNo() {
		return this.recordNo;
	}
 
	@Override
	public void setRecordNo(final String recordNo) {
		this.recordNo = recordNo; 
	}
 
	@Override
	public String getWhApplySerNo() {
		return this.whApplySerNo;
	}
 
	@Override
	public void setWhApplySerNo(final String whApplySerNo) {
		this.whApplySerNo = whApplySerNo; 
	}
 
	@Override
	public String getWhReasonType() {
		return this.whReasonType;
	}
 
	@Override
	public void setWhReasonType(final String whReasonType) {
		this.whReasonType = whReasonType; 
	}
 
	@Override
	public String getWhReasonId() {
		return this.whReasonId;
	}
 
	@Override
	public void setWhReasonId(final String whReasonId) {
		this.whReasonId = whReasonId; 
	}
 
	@Override
	public String getWhReasonComment() {
		return this.whReasonComment;
	}
 
	@Override
	public void setWhReasonComment(final String whReasonComment) {
		this.whReasonComment = whReasonComment; 
	}
 
}
