package com.doc.common.po.impl; 
 
public class LogmnrSeed$Po implements ILogmnrSeed$Po {
 
	public enum COLUMNS {
		SEED_VERSION("null"), //
		GATHER_VERSION("null"), //
		SCHEMANAME("null"), //
		OBJ#("null"), //
		OBJV#("null"), //
		TABLE_NAME("null"), //
		COL_NAME("null"), //
		COL#("null"), //
		INTCOL#("null"), //
		SEGCOL#("null"), //
		TYPE#("null"), //
		LENGTH("null"), //
		PRECISION#("null"), //
		SCALE("null"), //
		NULL$("null"), //
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
 
	private BigDecimal seedVersion;
	private BigDecimal gatherVersion;
	private String schemaname;
	private BigDecimal obj#;
	private BigDecimal objv#;
	private String tableName;
	private String colName;
	private BigDecimal col#;
	private BigDecimal intcol#;
	private BigDecimal segcol#;
	private BigDecimal type#;
	private BigDecimal length;
	private BigDecimal precision#;
	private BigDecimal scale;
	private BigDecimal null$;
	private BigDecimal logmnrUid;
	private BigDecimal logmnrFlags;

	@Override
	public BigDecimal getSeedVersion() {
		return this.seedVersion;
	}
 
	@Override
	public void setSeedVersion(final BigDecimal seedVersion) {
		this.seedVersion = seedVersion; 
	}
 
	@Override
	public BigDecimal getGatherVersion() {
		return this.gatherVersion;
	}
 
	@Override
	public void setGatherVersion(final BigDecimal gatherVersion) {
		this.gatherVersion = gatherVersion; 
	}
 
	@Override
	public String getSchemaname() {
		return this.schemaname;
	}
 
	@Override
	public void setSchemaname(final String schemaname) {
		this.schemaname = schemaname; 
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
	public BigDecimal getObjv#() {
		return this.objv#;
	}
 
	@Override
	public void setObjv#(final BigDecimal objv#) {
		this.objv# = objv#; 
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
	public String getColName() {
		return this.colName;
	}
 
	@Override
	public void setColName(final String colName) {
		this.colName = colName; 
	}
 
	@Override
	public BigDecimal getCol#() {
		return this.col#;
	}
 
	@Override
	public void setCol#(final BigDecimal col#) {
		this.col# = col#; 
	}
 
	@Override
	public BigDecimal getIntcol#() {
		return this.intcol#;
	}
 
	@Override
	public void setIntcol#(final BigDecimal intcol#) {
		this.intcol# = intcol#; 
	}
 
	@Override
	public BigDecimal getSegcol#() {
		return this.segcol#;
	}
 
	@Override
	public void setSegcol#(final BigDecimal segcol#) {
		this.segcol# = segcol#; 
	}
 
	@Override
	public BigDecimal getType#() {
		return this.type#;
	}
 
	@Override
	public void setType#(final BigDecimal type#) {
		this.type# = type#; 
	}
 
	@Override
	public BigDecimal getLength() {
		return this.length;
	}
 
	@Override
	public void setLength(final BigDecimal length) {
		this.length = length; 
	}
 
	@Override
	public BigDecimal getPrecision#() {
		return this.precision#;
	}
 
	@Override
	public void setPrecision#(final BigDecimal precision#) {
		this.precision# = precision#; 
	}
 
	@Override
	public BigDecimal getScale() {
		return this.scale;
	}
 
	@Override
	public void setScale(final BigDecimal scale) {
		this.scale = scale; 
	}
 
	@Override
	public BigDecimal getNull$() {
		return this.null$;
	}
 
	@Override
	public void setNull$(final BigDecimal null$) {
		this.null$ = null$; 
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
