package com.doc.common.po.impl; 
 
public class LogmnrDictionary$Po implements ILogmnrDictionary$Po {
 
	public enum COLUMNS {
		DB_NAME("null"), //
		DB_ID("null"), //
		DB_CREATED("null"), //
		DB_DICT_CREATED("null"), //
		DB_DICT_SCN("null"), //
		DB_THREAD_MAP("null"), //
		DB_TXN_SCNBAS("null"), //
		DB_TXN_SCNWRP("null"), //
		DB_RESETLOGS_CHANGE#("null"), //
		DB_RESETLOGS_TIME("null"), //
		DB_VERSION_TIME("null"), //
		DB_REDO_TYPE_ID("null"), //
		DB_REDO_RELEASE("null"), //
		DB_CHARACTER_SET("null"), //
		DB_VERSION("null"), //
		DB_STATUS("null"), //
		DB_GLOBAL_NAME("null"), //
		DB_DICT_MAXOBJECTS("null"), //
		DB_DICT_OBJECTCOUNT("null"), //
		LOGMNR_UID("null"), //
		LOGMNR_FLAGS("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String dbName;
	private BigDecimal dbId;
	private String dbCreated;
	private String dbDictCreated;
	private BigDecimal dbDictScn;
	private String dbThreadMap;
	private BigDecimal dbTxnScnbas;
	private BigDecimal dbTxnScnwrp;
	private BigDecimal dbResetlogsChange#;
	private String dbResetlogsTime;
	private String dbVersionTime;
	private String dbRedoTypeId;
	private String dbRedoRelease;
	private String dbCharacterSet;
	private String dbVersion;
	private String dbStatus;
	private String dbGlobalName;
	private BigDecimal dbDictMaxobjects;
	private BigDecimal dbDictObjectcount;
	private BigDecimal logmnrUid;
	private BigDecimal logmnrFlags;

	@Override
	public String getDbName() {
		return this.dbName;
	}
 
	@Override
	public void setDbName(final String dbName) {
		this.dbName = dbName; 
	}
 
	@Override
	public BigDecimal getDbId() {
		return this.dbId;
	}
 
	@Override
	public void setDbId(final BigDecimal dbId) {
		this.dbId = dbId; 
	}
 
	@Override
	public String getDbCreated() {
		return this.dbCreated;
	}
 
	@Override
	public void setDbCreated(final String dbCreated) {
		this.dbCreated = dbCreated; 
	}
 
	@Override
	public String getDbDictCreated() {
		return this.dbDictCreated;
	}
 
	@Override
	public void setDbDictCreated(final String dbDictCreated) {
		this.dbDictCreated = dbDictCreated; 
	}
 
	@Override
	public BigDecimal getDbDictScn() {
		return this.dbDictScn;
	}
 
	@Override
	public void setDbDictScn(final BigDecimal dbDictScn) {
		this.dbDictScn = dbDictScn; 
	}
 
	@Override
	public String getDbThreadMap() {
		return this.dbThreadMap;
	}
 
	@Override
	public void setDbThreadMap(final String dbThreadMap) {
		this.dbThreadMap = dbThreadMap; 
	}
 
	@Override
	public BigDecimal getDbTxnScnbas() {
		return this.dbTxnScnbas;
	}
 
	@Override
	public void setDbTxnScnbas(final BigDecimal dbTxnScnbas) {
		this.dbTxnScnbas = dbTxnScnbas; 
	}
 
	@Override
	public BigDecimal getDbTxnScnwrp() {
		return this.dbTxnScnwrp;
	}
 
	@Override
	public void setDbTxnScnwrp(final BigDecimal dbTxnScnwrp) {
		this.dbTxnScnwrp = dbTxnScnwrp; 
	}
 
	@Override
	public BigDecimal getDbResetlogsChange#() {
		return this.dbResetlogsChange#;
	}
 
	@Override
	public void setDbResetlogsChange#(final BigDecimal dbResetlogsChange#) {
		this.dbResetlogsChange# = dbResetlogsChange#; 
	}
 
	@Override
	public String getDbResetlogsTime() {
		return this.dbResetlogsTime;
	}
 
	@Override
	public void setDbResetlogsTime(final String dbResetlogsTime) {
		this.dbResetlogsTime = dbResetlogsTime; 
	}
 
	@Override
	public String getDbVersionTime() {
		return this.dbVersionTime;
	}
 
	@Override
	public void setDbVersionTime(final String dbVersionTime) {
		this.dbVersionTime = dbVersionTime; 
	}
 
	@Override
	public String getDbRedoTypeId() {
		return this.dbRedoTypeId;
	}
 
	@Override
	public void setDbRedoTypeId(final String dbRedoTypeId) {
		this.dbRedoTypeId = dbRedoTypeId; 
	}
 
	@Override
	public String getDbRedoRelease() {
		return this.dbRedoRelease;
	}
 
	@Override
	public void setDbRedoRelease(final String dbRedoRelease) {
		this.dbRedoRelease = dbRedoRelease; 
	}
 
	@Override
	public String getDbCharacterSet() {
		return this.dbCharacterSet;
	}
 
	@Override
	public void setDbCharacterSet(final String dbCharacterSet) {
		this.dbCharacterSet = dbCharacterSet; 
	}
 
	@Override
	public String getDbVersion() {
		return this.dbVersion;
	}
 
	@Override
	public void setDbVersion(final String dbVersion) {
		this.dbVersion = dbVersion; 
	}
 
	@Override
	public String getDbStatus() {
		return this.dbStatus;
	}
 
	@Override
	public void setDbStatus(final String dbStatus) {
		this.dbStatus = dbStatus; 
	}
 
	@Override
	public String getDbGlobalName() {
		return this.dbGlobalName;
	}
 
	@Override
	public void setDbGlobalName(final String dbGlobalName) {
		this.dbGlobalName = dbGlobalName; 
	}
 
	@Override
	public BigDecimal getDbDictMaxobjects() {
		return this.dbDictMaxobjects;
	}
 
	@Override
	public void setDbDictMaxobjects(final BigDecimal dbDictMaxobjects) {
		this.dbDictMaxobjects = dbDictMaxobjects; 
	}
 
	@Override
	public BigDecimal getDbDictObjectcount() {
		return this.dbDictObjectcount;
	}
 
	@Override
	public void setDbDictObjectcount(final BigDecimal dbDictObjectcount) {
		this.dbDictObjectcount = dbDictObjectcount; 
	}
 
	@Override
	public BigDecimal getLogmnrUid() {
		return this.logmnrUid;
	}
 
	@Override
	public void setLogmnrUid(final BigDecimal logmnrUid) {
		this.logmnrUid = logmnrUid; 
	}
 
	@Override
	public BigDecimal getLogmnrFlags() {
		return this.logmnrFlags;
	}
 
	@Override
	public void setLogmnrFlags(final BigDecimal logmnrFlags) {
		this.logmnrFlags = logmnrFlags; 
	}
 
}
