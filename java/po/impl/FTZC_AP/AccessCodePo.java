package com.doc.common.po.impl; 
 
public class AccessCodePo implements IAccessCodePo {
 
	public enum COLUMNS {
		CODE("存取碼 UUID"), //
		CREATE_DATE("建立時間"), //
		EXPIRED_DATE("失效時間"), //
		STATUS("狀態 A = Active, D = Disable, F = Frezze"), //
		USER_ID("SAAB USER ID"), //
		REG_REMOTE_ADDR("註冊IP"), //
		LAST_ACC_REMOTE_ADDR("最後一次存取的IP"), //
		LAST_ACC_DATE("最後一次存取時間") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String code;
	private String createDate;
	private String expiredDate;
	private String status;
	private String userId;
	private String regRemoteAddr;
	private String lastAccRemoteAddr;
	private String lastAccDate;

	@Override
	public String getCode() {
		return this.code;
	}
 
	@Override
	public void setCode(final String code) {
		this.code = code; 
	}
 
	@Override
	public String getCreateDate() {
		return this.createDate;
	}
 
	@Override
	public void setCreateDate(final String createDate) {
		this.createDate = createDate; 
	}
 
	@Override
	public String getExpiredDate() {
		return this.expiredDate;
	}
 
	@Override
	public void setExpiredDate(final String expiredDate) {
		this.expiredDate = expiredDate; 
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
	public String getUserId() {
		return this.userId;
	}
 
	@Override
	public void setUserId(final String userId) {
		this.userId = userId; 
	}
 
	@Override
	public String getRegRemoteAddr() {
		return this.regRemoteAddr;
	}
 
	@Override
	public void setRegRemoteAddr(final String regRemoteAddr) {
		this.regRemoteAddr = regRemoteAddr; 
	}
 
	@Override
	public String getLastAccRemoteAddr() {
		return this.lastAccRemoteAddr;
	}
 
	@Override
	public void setLastAccRemoteAddr(final String lastAccRemoteAddr) {
		this.lastAccRemoteAddr = lastAccRemoteAddr; 
	}
 
	@Override
	public String getLastAccDate() {
		return this.lastAccDate;
	}
 
	@Override
	public void setLastAccDate(final String lastAccDate) {
		this.lastAccDate = lastAccDate; 
	}
 
}
