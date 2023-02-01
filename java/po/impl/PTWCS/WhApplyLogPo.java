package com.doc.common.po.impl; 
 
public class WhApplyLogPo implements IWhApplyLogPo {
 
	public enum COLUMNS {
		WH_APPLY_SER_NO("入倉申請序號"), //
		RECORD_NO("yyyyMMddHHMMssSSS+三位流水號"), //
		UPDATE_ITEM("更新項目"), //
		UPDATE_CONTENT_B("更新前內容"), //
		UPDATE_CONTENT_A("更新後內容"), //
		UPDATE_USER("更新使用者"), //
		UPDATE_DATE("更新日期") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String whApplySerNo;
	private String recordNo;
	private String updateItem;
	private String updateContentB;
	private String updateContentA;
	private String updateUser;
	private java.sql.Timestamp updateDate;

	@Override
	public String getWhApplySerNo() {
		return this.whApplySerNo;
	}
 
	@Override
	public void setWhApplySerNo(final String whApplySerNo) {
		this.whApplySerNo = whApplySerNo; 
	}
 
	@Override
	public String getRecordNo() {
		return this.recordNo;
	}
 
	@Override
	public void setRecordNo(final String recordNo) {
		this.recordNo = recordNo; 
	}
 
	@Override
	public String getUpdateItem() {
		return this.updateItem;
	}
 
	@Override
	public void setUpdateItem(final String updateItem) {
		this.updateItem = updateItem; 
	}
 
	@Override
	public String getUpdateContentB() {
		return this.updateContentB;
	}
 
	@Override
	public void setUpdateContentB(final String updateContentB) {
		this.updateContentB = updateContentB; 
	}
 
	@Override
	public String getUpdateContentA() {
		return this.updateContentA;
	}
 
	@Override
	public void setUpdateContentA(final String updateContentA) {
		this.updateContentA = updateContentA; 
	}
 
	@Override
	public String getUpdateUser() {
		return this.updateUser;
	}
 
	@Override
	public void setUpdateUser(final String updateUser) {
		this.updateUser = updateUser; 
	}
 
	@Override
	public java.sql.Timestamp getUpdateDate() {
		return this.updateDate;
	}
 
	@Override
	public void setUpdateDate(final java.sql.Timestamp updateDate) {
		this.updateDate = updateDate; 
	}
 
}
