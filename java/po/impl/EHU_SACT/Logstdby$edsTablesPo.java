package com.doc.common.po.impl; 
 
public class Logstdby$edsTablesPo implements ILogstdby$edsTablesPo {
 
	public enum COLUMNS {
		OWNER("null"), //
		TABLE_NAME("null"), //
		SHADOW_TABLE_NAME("null"), //
		BASE_TRIGGER_NAME("null"), //
		SHADOW_TRIGGER_NAME("null"), //
		DBLINK("null"), //
		FLAGS("null"), //
		STATE("null"), //
		OBJV("null"), //
		OBJ#("null"), //
		SOBJ#("null"), //
		CTIME("null"), //
		SPARE1("null"), //
		SPARE2("null"), //
		SPARE3("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String owner;
	private String tableName;
	private String shadowTableName;
	private String baseTriggerName;
	private String shadowTriggerName;
	private String dblink;
	private BigDecimal flags;
	private String state;
	private BigDecimal objv;
	private BigDecimal obj#;
	private BigDecimal sobj#;
	private String ctime;
	private BigDecimal spare1;
	private String spare2;
	private BigDecimal spare3;

	@Override
	public String getOwner() {
		return this.owner;
	}
 
	@Override
	public void setOwner(final String owner) {
		this.owner = owner; 
	}
 
	@Override
	public String getTableName() {
		return this.tableName;
	}
 
	@Override
	public void setTableName(final String tableName) {
		this.tableName = tableName; 
	}
 
	@Override
	public String getShadowTableName() {
		return this.shadowTableName;
	}
 
	@Override
	public void setShadowTableName(final String shadowTableName) {
		this.shadowTableName = shadowTableName; 
	}
 
	@Override
	public String getBaseTriggerName() {
		return this.baseTriggerName;
	}
 
	@Override
	public void setBaseTriggerName(final String baseTriggerName) {
		this.baseTriggerName = baseTriggerName; 
	}
 
	@Override
	public String getShadowTriggerName() {
		return this.shadowTriggerName;
	}
 
	@Override
	public void setShadowTriggerName(final String shadowTriggerName) {
		this.shadowTriggerName = shadowTriggerName; 
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
	public BigDecimal getFlags() {
		return this.flags;
	}
 
	@Override
	public void setFlags(final BigDecimal flags) {
		this.flags = flags; 
	}
 
	@Override
	public String getState() {
		return this.state;
	}
 
	@Override
	public void setState(final String state) {
		this.state = state; 
	}
 
	@Override
	public BigDecimal getObjv() {
		return this.objv;
	}
 
	@Override
	public void setObjv(final BigDecimal objv) {
		this.objv = objv; 
	}
 
	@Override
	public BigDecimal getObj#() {
		return this.obj#;
	}
 
	@Override
	public void setObj#(final BigDecimal obj#) {
		this.obj# = obj#; 
	}
 
	@Override
	public BigDecimal getSobj#() {
		return this.sobj#;
	}
 
	@Override
	public void setSobj#(final BigDecimal sobj#) {
		this.sobj# = sobj#; 
	}
 
	@Override
	public String getCtime() {
		return this.ctime;
	}
 
	@Override
	public void setCtime(final String ctime) {
		this.ctime = ctime; 
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
	public String getSpare2() {
		return this.spare2;
	}
 
	@Override
	public void setSpare2(final String spare2) {
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
 
}
