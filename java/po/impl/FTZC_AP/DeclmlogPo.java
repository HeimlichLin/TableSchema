package com.doc.common.po.impl; 
 
public class DeclmlogPo implements IDeclmlogPo {
 
	public enum COLUMNS {
		DECL_NO("報單號碼"), //
		DECL_TYPE("報單類別"), //
		BF_NO("監管編號"), //
		USER_ID("使用者ID"), //
		LOG_DATM("異動時間"), //
		LOG_TABLE("異動TABLE"), //
		LOG_ACTION("異動行為ADU"), //
		LOG_COLUMN("異動欄位"), //
		LOG_NEW("新資料"), //
		LOG_OLD("舊資料"), //
		LOG_PGM("執行程式"), //
		DECL_SEQ_NO("報單序號(5205使用)") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String declNo;
	private String declType;
	private String bfNo;
	private String userId;
	private String logDatm;
	private String logTable;
	private String logAction;
	private String logColumn;
	private String logNew;
	private String logOld;
	private String logPgm;
	private BigDecimal declSeqNo;

	@Override
	public String getDeclNo() {
		return this.declNo;
	}
 
	@Override
	public void setDeclNo(final String declNo) {
		this.declNo = declNo; 
	}
 
	@Override
	public String getDeclType() {
		return this.declType;
	}
 
	@Override
	public void setDeclType(final String declType) {
		this.declType = declType; 
	}
 
	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
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
	public String getLogDatm() {
		return this.logDatm;
	}
 
	@Override
	public void setLogDatm(final String logDatm) {
		this.logDatm = logDatm; 
	}
 
	@Override
	public String getLogTable() {
		return this.logTable;
	}
 
	@Override
	public void setLogTable(final String logTable) {
		this.logTable = logTable; 
	}
 
	@Override
	public String getLogAction() {
		return this.logAction;
	}
 
	@Override
	public void setLogAction(final String logAction) {
		this.logAction = logAction; 
	}
 
	@Override
	public String getLogColumn() {
		return this.logColumn;
	}
 
	@Override
	public void setLogColumn(final String logColumn) {
		this.logColumn = logColumn; 
	}
 
	@Override
	public String getLogNew() {
		return this.logNew;
	}
 
	@Override
	public void setLogNew(final String logNew) {
		this.logNew = logNew; 
	}
 
	@Override
	public String getLogOld() {
		return this.logOld;
	}
 
	@Override
	public void setLogOld(final String logOld) {
		this.logOld = logOld; 
	}
 
	@Override
	public String getLogPgm() {
		return this.logPgm;
	}
 
	@Override
	public void setLogPgm(final String logPgm) {
		this.logPgm = logPgm; 
	}
 
	@Override
	public BigDecimal getDeclSeqNo() {
		return this.declSeqNo;
	}
 
	@Override
	public void setDeclSeqNo(final BigDecimal declSeqNo) {
		this.declSeqNo = declSeqNo; 
	}
 
}
