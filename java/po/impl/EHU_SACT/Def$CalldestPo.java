package com.doc.common.po.impl; 
 
public class Def$CalldestPo implements IDef$CalldestPo {
 
	public enum COLUMNS {
		ENQ_TID("Transaction ID"), //
		STEP_NO("Unique ID of call within transaction"), //
		DBLINK("The destination database"), //
		DBLINK("The destination database"), //
		SCHEMA_NAME("The schema of the deferred remote procedure call"), //
		PACKAGE_NAME("The package of the deferred remote procedure call"), //
		CATCHUP("Dummy column for foreign key") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String enqTid;
	private BigDecimal stepNo;
	private String dblink;
	private String dblink;
	private String schemaName;
	private String packageName;
	private String catchup;

	@Override
	public String getEnqTid() {
		return this.enqTid;
	}
 
	@Override
	public void setEnqTid(final String enqTid) {
		this.enqTid = enqTid; 
	}
 
	@Override
	public BigDecimal getStepNo() {
		return this.stepNo;
	}
 
	@Override
	public void setStepNo(final BigDecimal stepNo) {
		this.stepNo = stepNo; 
	}
 
	@Override
	public String getDblink() {
		return this.dblink;
	}
 
	@Override
	public void setDblink(final String dblink) {
		this.dblink = dblink; 
	}
 
	@Override
	public String getDblink() {
		return this.dblink;
	}
 
	@Override
	public void setDblink(final String dblink) {
		this.dblink = dblink; 
	}
 
	@Override
	public String getSchemaName() {
		return this.schemaName;
	}
 
	@Override
	public void setSchemaName(final String schemaName) {
		this.schemaName = schemaName; 
	}
 
	@Override
	public String getPackageName() {
		return this.packageName;
	}
 
	@Override
	public void setPackageName(final String packageName) {
		this.packageName = packageName; 
	}
 
	@Override
	public String getCatchup() {
		return this.catchup;
	}
 
	@Override
	public void setCatchup(final String catchup) {
		this.catchup = catchup; 
	}
 
}
