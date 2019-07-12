package com.doc.common.bean; 
 
public class TranslogDo { 
 
	public enum COLUMNS { 
		S_TABLE("null"), 
		TRANS_ID("null"), 
		RMK("null"), 
		PROC_DATM("null"), 
		DAO_NUM("null") 
		; 
		final String name; 
	 
		private COLUMNS(final String name) { 
			this.name = name; 
		} 
	 
		public String getName() { 
			return this.name; 
		} 
	} 
 
	private String sTable; 
	private String transId; 
	private String rmk; 
	private java.sql.Timestamp procDatm; 
	private BigDecimal daoNum; 
	
	public String getSTable() { 
		return sTable; 
	} 
 
	public void setSTable(String sTable) { 
		this.sTable = sTable; 
	} 
 
	public String getTransId() { 
		return transId; 
	} 
 
	public void setTransId(String transId) { 
		this.transId = transId; 
	} 
 
	public String getRmk() { 
		return rmk; 
	} 
 
	public void setRmk(String rmk) { 
		this.rmk = rmk; 
	} 
 
	public java.sql.Timestamp getProcDatm() { 
		return procDatm; 
	} 
 
	public void setProcDatm(java.sql.Timestamp procDatm) { 
		this.procDatm = procDatm; 
	} 
 
	public BigDecimal getDaoNum() { 
		return daoNum; 
	} 
 
	public void setDaoNum(BigDecimal daoNum) { 
		this.daoNum = daoNum; 
	} 
 
} 
