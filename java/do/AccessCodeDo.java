package com.doc.common.bean; 
 
public class AccessCodeDo { 
 
	public enum COLUMNS { 
		CODE("存取碼 UUID"), 
		CREATE_DATE("建立時間"), 
		EXPIRED_DATE("失效時間"), 
		STATUS("狀態 A = Active, D = Disable, F = Frezze"), 
		USER_ID("SAAB USER ID"), 
		REG_REMOTE_ADDR("註冊IP"), 
		LAST_ACC_REMOTE_ADDR("最後一次存取的IP"), 
		LAST_ACC_DATE("最後一次存取時間") 
		; 
		final String name; 
	 
		private COLUMNS(final String name) { 
			this.name = name; 
		} 
	 
		public String getName() { 
			return this.name; 
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
	
	public String getCode() { 
		return code; 
	} 
 
	public void setCode(String code) { 
		this.code = code; 
	} 
 
	public String getCreateDate() { 
		return createDate; 
	} 
 
	public void setCreateDate(String createDate) { 
		this.createDate = createDate; 
	} 
 
	public String getExpiredDate() { 
		return expiredDate; 
	} 
 
	public void setExpiredDate(String expiredDate) { 
		this.expiredDate = expiredDate; 
	} 
 
	public String getStatus() { 
		return status; 
	} 
 
	public void setStatus(String status) { 
		this.status = status; 
	} 
 
	public String getUserId() { 
		return userId; 
	} 
 
	public void setUserId(String userId) { 
		this.userId = userId; 
	} 
 
	public String getRegRemoteAddr() { 
		return regRemoteAddr; 
	} 
 
	public void setRegRemoteAddr(String regRemoteAddr) { 
		this.regRemoteAddr = regRemoteAddr; 
	} 
 
	public String getLastAccRemoteAddr() { 
		return lastAccRemoteAddr; 
	} 
 
	public void setLastAccRemoteAddr(String lastAccRemoteAddr) { 
		this.lastAccRemoteAddr = lastAccRemoteAddr; 
	} 
 
	public String getLastAccDate() { 
		return lastAccDate; 
	} 
 
	public void setLastAccDate(String lastAccDate) { 
		this.lastAccDate = lastAccDate; 
	} 
 
} 
