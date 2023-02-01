package com.doc.common.po.impl; 
 
public class DocmlogPo implements IDocmlogPo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		LOG_DATM("日期"), //
		LOG_TYPE("文件種類"), //
		LOG_ACTION("修改類別:I新增D刪除U修改"), //
		LOG_OLD("修改前資料"), //
		LOG_NEW("修改後資料"), //
		USER_ID("使用者帳號"), //
		LOG_PGM("執行程式"), //
		LOG_TABLE("異動TABLE"), //
		REF1("參考值1"), //
		REF2("參考值2"), //
		REF3("參考值3"), //
		LOG_COLUMN("紀錄欄位") //
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
	private String logDatm;
	private String logType;
	private String logAction;
	private String logOld;
	private String logNew;
	private String userId;
	private String logPgm;
	private String logTable;
	private String ref1;
	private String ref2;
	private String ref3;
	private String logColumn;

	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
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
	public String getLogType() {
		return this.logType;
	}
 
	@Override
	public void setLogType(final String logType) {
		this.logType = logType; 
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
	public String getLogOld() {
		return this.logOld;
	}
 
	@Override
	public void setLogOld(final String logOld) {
		this.logOld = logOld; 
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
	public String getUserId() {
		return this.userId;
	}
 
	@Override
	public void setUserId(final String userId) {
		this.userId = userId; 
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
	public String getLogTable() {
		return this.logTable;
	}
 
	@Override
	public void setLogTable(final String logTable) {
		this.logTable = logTable; 
	}
 
	@Override
	public String getRef1() {
		return this.ref1;
	}
 
	@Override
	public void setRef1(final String ref1) {
		this.ref1 = ref1; 
	}
 
	@Override
	public String getRef2() {
		return this.ref2;
	}
 
	@Override
	public void setRef2(final String ref2) {
		this.ref2 = ref2; 
	}
 
	@Override
	public String getRef3() {
		return this.ref3;
	}
 
	@Override
	public void setRef3(final String ref3) {
		this.ref3 = ref3; 
	}
 
	@Override
	public String getLogColumn() {
		return this.logColumn;
	}
 
	@Override
	public void setLogColumn(final String logColumn) {
		this.logColumn = logColumn; 
	}
 
}
