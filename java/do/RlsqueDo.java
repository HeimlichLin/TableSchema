package com.doc.common.bean; 
 
public class RlsqueDo { 
 
	public enum COLUMNS { 
		DECL_NO("null"), 
		RLS_DATE("null"), 
		TRANS_ID("null"), 
		ERR_TYPE("null"), 
		RSN("null"), 
		LOG_DATM("null") 
		; 
		final String name; 
	 
		private COLUMNS(final String name) { 
			this.name = name; 
		} 
	 
		public String getName() { 
			return this.name; 
		} 
	} 
 
	private String declNo; 
	private java.sql.Timestamp rlsDate; 
	private String transId; 
	private String errType; 
	private String rsn; 
	private String logDatm; 
	
	public String getDeclNo() { 
		return declNo; 
	} 
 
	public void setDeclNo(String declNo) { 
		this.declNo = declNo; 
	} 
 
	public java.sql.Timestamp getRlsDate() { 
		return rlsDate; 
	} 
 
	public void setRlsDate(java.sql.Timestamp rlsDate) { 
		this.rlsDate = rlsDate; 
	} 
 
	public String getTransId() { 
		return transId; 
	} 
 
	public void setTransId(String transId) { 
		this.transId = transId; 
	} 
 
	public String getErrType() { 
		return errType; 
	} 
 
	public void setErrType(String errType) { 
		this.errType = errType; 
	} 
 
	public String getRsn() { 
		return rsn; 
	} 
 
	public void setRsn(String rsn) { 
		this.rsn = rsn; 
	} 
 
	public String getLogDatm() { 
		return logDatm; 
	} 
 
	public void setLogDatm(String logDatm) { 
		this.logDatm = logDatm; 
	} 
 
} 
