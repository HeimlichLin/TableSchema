package com.doc.common.po.impl; 
 
public class LogmnrLog$Po implements ILogmnrLog$Po {
 
	public enum COLUMNS {
		SESSION#("null"), //
		THREAD#("null"), //
		SEQUENCE#("null"), //
		FIRST_CHANGE#("null"), //
		NEXT_CHANGE#("null"), //
		FIRST_TIME("null"), //
		NEXT_TIME("null"), //
		FILE_NAME("null"), //
		STATUS("null"), //
		INFO("null"), //
		TIMESTAMP("null"), //
		DICT_BEGIN("null"), //
		DICT_END("null"), //
		STATUS_INFO("null"), //
		DB_ID("null"), //
		RESETLOGS_CHANGE#("null"), //
		RESET_TIMESTAMP("null"), //
		PREV_RESETLOGS_CHANGE#("null"), //
		PREV_RESET_TIMESTAMP("null"), //
		BLOCKS("null"), //
		BLOCK_SIZE("null"), //
		FLAGS("null"), //
		CONTENTS("null"), //
		RECID("null"), //
		RECSTAMP("null"), //
		MARK_DELETE_TIMESTAMP("null"), //
		SPARE1("null"), //
		SPARE2("null"), //
		SPARE3("null"), //
		SPARE4("null"), //
		SPARE5("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal session#;
	private BigDecimal thread#;
	private BigDecimal sequence#;
	private BigDecimal firstChange#;
	private BigDecimal nextChange#;
	private java.sql.Timestamp firstTime;
	private java.sql.Timestamp nextTime;
	private String fileName;
	private BigDecimal status;
	private String info;
	private java.sql.Timestamp timestamp;
	private String dictBegin;
	private String dictEnd;
	private String statusInfo;
	private BigDecimal dbId;
	private BigDecimal resetlogsChange#;
	private BigDecimal resetTimestamp;
	private BigDecimal prevResetlogsChange#;
	private BigDecimal prevResetTimestamp;
	private BigDecimal blocks;
	private BigDecimal blockSize;
	private BigDecimal flags;
	private BigDecimal contents;
	private BigDecimal recid;
	private BigDecimal recstamp;
	private BigDecimal markDeleteTimestamp;
	private BigDecimal spare1;
	private BigDecimal spare2;
	private BigDecimal spare3;
	private BigDecimal spare4;
	private BigDecimal spare5;

	@Override
	public BigDecimal getSession#() {
		return this.session#;
	}
 
	@Override
	public void setSession#(final BigDecimal session#) {
		this.session# = session#; 
	}
 
	@Override
	public BigDecimal getThread#() {
		return this.thread#;
	}
 
	@Override
	public void setThread#(final BigDecimal thread#) {
		this.thread# = thread#; 
	}
 
	@Override
	public BigDecimal getSequence#() {
		return this.sequence#;
	}
 
	@Override
	public void setSequence#(final BigDecimal sequence#) {
		this.sequence# = sequence#; 
	}
 
	@Override
	public BigDecimal getFirstChange#() {
		return this.firstChange#;
	}
 
	@Override
	public void setFirstChange#(final BigDecimal firstChange#) {
		this.firstChange# = firstChange#; 
	}
 
	@Override
	public BigDecimal getNextChange#() {
		return this.nextChange#;
	}
 
	@Override
	public void setNextChange#(final BigDecimal nextChange#) {
		this.nextChange# = nextChange#; 
	}
 
	@Override
	public java.sql.Timestamp getFirstTime() {
		return this.firstTime;
	}
 
	@Override
	public void setFirstTime(final java.sql.Timestamp firstTime) {
		this.firstTime = firstTime; 
	}
 
	@Override
	public java.sql.Timestamp getNextTime() {
		return this.nextTime;
	}
 
	@Override
	public void setNextTime(final java.sql.Timestamp nextTime) {
		this.nextTime = nextTime; 
	}
 
	@Override
	public String getFileName() {
		return this.fileName;
	}
 
	@Override
	public void setFileName(final String fileName) {
		this.fileName = fileName; 
	}
 
	@Override
	public BigDecimal getStatus() {
		return this.status;
	}
 
	@Override
	public void setStatus(final BigDecimal status) {
		this.status = status; 
	}
 
	@Override
	public String getInfo() {
		return this.info;
	}
 
	@Override
	public void setInfo(final String info) {
		this.info = info; 
	}
 
	@Override
	public java.sql.Timestamp getTimestamp() {
		return this.timestamp;
	}
 
	@Override
	public void setTimestamp(final java.sql.Timestamp timestamp) {
		this.timestamp = timestamp; 
	}
 
	@Override
	public String getDictBegin() {
		return this.dictBegin;
	}
 
	@Override
	public void setDictBegin(final String dictBegin) {
		this.dictBegin = dictBegin; 
	}
 
	@Override
	public String getDictEnd() {
		return this.dictEnd;
	}
 
	@Override
	public void setDictEnd(final String dictEnd) {
		this.dictEnd = dictEnd; 
	}
 
	@Override
	public String getStatusInfo() {
		return this.statusInfo;
	}
 
	@Override
	public void setStatusInfo(final String statusInfo) {
		this.statusInfo = statusInfo; 
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
	public BigDecimal getResetlogsChange#() {
		return this.resetlogsChange#;
	}
 
	@Override
	public void setResetlogsChange#(final BigDecimal resetlogsChange#) {
		this.resetlogsChange# = resetlogsChange#; 
	}
 
	@Override
	public BigDecimal getResetTimestamp() {
		return this.resetTimestamp;
	}
 
	@Override
	public void setResetTimestamp(final BigDecimal resetTimestamp) {
		this.resetTimestamp = resetTimestamp; 
	}
 
	@Override
	public BigDecimal getPrevResetlogsChange#() {
		return this.prevResetlogsChange#;
	}
 
	@Override
	public void setPrevResetlogsChange#(final BigDecimal prevResetlogsChange#) {
		this.prevResetlogsChange# = prevResetlogsChange#; 
	}
 
	@Override
	public BigDecimal getPrevResetTimestamp() {
		return this.prevResetTimestamp;
	}
 
	@Override
	public void setPrevResetTimestamp(final BigDecimal prevResetTimestamp) {
		this.prevResetTimestamp = prevResetTimestamp; 
	}
 
	@Override
	public BigDecimal getBlocks() {
		return this.blocks;
	}
 
	@Override
	public void setBlocks(final BigDecimal blocks) {
		this.blocks = blocks; 
	}
 
	@Override
	public BigDecimal getBlockSize() {
		return this.blockSize;
	}
 
	@Override
	public void setBlockSize(final BigDecimal blockSize) {
		this.blockSize = blockSize; 
	}
 
	@Override
	public BigDecimal getFlags() {
		return this.flags;
	}
 
	@Override
	public void setFlags(final BigDecimal flags) {
		this.flags = flags; 
	}
 
	@Override
	public BigDecimal getContents() {
		return this.contents;
	}
 
	@Override
	public void setContents(final BigDecimal contents) {
		this.contents = contents; 
	}
 
	@Override
	public BigDecimal getRecid() {
		return this.recid;
	}
 
	@Override
	public void setRecid(final BigDecimal recid) {
		this.recid = recid; 
	}
 
	@Override
	public BigDecimal getRecstamp() {
		return this.recstamp;
	}
 
	@Override
	public void setRecstamp(final BigDecimal recstamp) {
		this.recstamp = recstamp; 
	}
 
	@Override
	public BigDecimal getMarkDeleteTimestamp() {
		return this.markDeleteTimestamp;
	}
 
	@Override
	public void setMarkDeleteTimestamp(final BigDecimal markDeleteTimestamp) {
		this.markDeleteTimestamp = markDeleteTimestamp; 
	}
 
	@Override
	public BigDecimal getSpare1() {
		return this.spare1;
	}
 
	@Override
	public void setSpare1(final BigDecimal spare1) {
		this.spare1 = spare1; 
	}
 
	@Override
	public BigDecimal getSpare2() {
		return this.spare2;
	}
 
	@Override
	public void setSpare2(final BigDecimal spare2) {
		this.spare2 = spare2; 
	}
 
	@Override
	public BigDecimal getSpare3() {
		return this.spare3;
	}
 
	@Override
	public void setSpare3(final BigDecimal spare3) {
		this.spare3 = spare3; 
	}
 
	@Override
	public BigDecimal getSpare4() {
		return this.spare4;
	}
 
	@Override
	public void setSpare4(final BigDecimal spare4) {
		this.spare4 = spare4; 
	}
 
	@Override
	public BigDecimal getSpare5() {
		return this.spare5;
	}
 
	@Override
	public void setSpare5(final BigDecimal spare5) {
		this.spare5 = spare5; 
	}
 
}
