package com.doc.common.po.impl; 
 
public class CtmcodePo implements ICtmcodePo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		CTM_CODE("客戶代碼"), //
		CTM_NAME("客戶名稱"), //
		CTM_USER_ID("客戶使用代碼"), //
		CTM_BAN("客戶統一編號"), //
		CTM_ENAME("客戶英文名稱"), //
		CTM_ADD("客戶地址"), //
		STATUS("帳戶狀態"), //
		CREATE_DATE("資料產生時間") //
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
	private String ctmCode;
	private String ctmName;
	private String ctmUserId;
	private String ctmBan;
	private String ctmEname;
	private String ctmAdd;
	private String status;
	private String createDate;

	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
	}
 
	@Override
	public String getCtmCode() {
		return this.ctmCode;
	}
 
	@Override
	public void setCtmCode(final String ctmCode) {
		this.ctmCode = ctmCode; 
	}
 
	@Override
	public String getCtmName() {
		return this.ctmName;
	}
 
	@Override
	public void setCtmName(final String ctmName) {
		this.ctmName = ctmName; 
	}
 
	@Override
	public String getCtmUserId() {
		return this.ctmUserId;
	}
 
	@Override
	public void setCtmUserId(final String ctmUserId) {
		this.ctmUserId = ctmUserId; 
	}
 
	@Override
	public String getCtmBan() {
		return this.ctmBan;
	}
 
	@Override
	public void setCtmBan(final String ctmBan) {
		this.ctmBan = ctmBan; 
	}
 
	@Override
	public String getCtmEname() {
		return this.ctmEname;
	}
 
	@Override
	public void setCtmEname(final String ctmEname) {
		this.ctmEname = ctmEname; 
	}
 
	@Override
	public String getCtmAdd() {
		return this.ctmAdd;
	}
 
	@Override
	public void setCtmAdd(final String ctmAdd) {
		this.ctmAdd = ctmAdd; 
	}
 
	@Override
	public String getStatus() {
		return this.status;
	}
 
	@Override
	public void setStatus(final String status) {
		this.status = status; 
	}
 
	@Override
	public String getCreateDate() {
		return this.createDate;
	}
 
	@Override
	public void setCreateDate(final String createDate) {
		this.createDate = createDate; 
	}
 
}
