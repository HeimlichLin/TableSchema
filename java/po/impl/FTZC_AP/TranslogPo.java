package com.doc.common.po.impl; 
 
public class TranslogPo implements ITranslogPo {
 
	public enum COLUMNS {
		S_TABLE("來源"), //
		TRANS_ID("該次處理最大的TRANSACTION_ID"), //
		RMK("程式備註"), //
		PROC_DATM("程式執行時間"), //
		DAO_NUM("報單數量") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String sTable;
	private String transId;
	private String rmk;
	private java.sql.Timestamp procDatm;
	private BigDecimal daoNum;

	@Override
	public String getSTable() {
		return this.sTable;
	}
 
	@Override
	public void setSTable(final String sTable) {
		this.sTable = sTable; 
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
	public String getRmk() {
		return this.rmk;
	}
 
	@Override
	public void setRmk(final String rmk) {
		this.rmk = rmk; 
	}
 
	@Override
	public java.sql.Timestamp getProcDatm() {
		return this.procDatm;
	}
 
	@Override
	public void setProcDatm(final java.sql.Timestamp procDatm) {
		this.procDatm = procDatm; 
	}
 
	@Override
	public BigDecimal getDaoNum() {
		return this.daoNum;
	}
 
	@Override
	public void setDaoNum(final BigDecimal daoNum) {
		this.daoNum = daoNum; 
	}
 
}
