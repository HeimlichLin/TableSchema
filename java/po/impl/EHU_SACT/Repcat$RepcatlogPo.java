package com.doc.common.po.impl; 
 
public class Repcat$RepcatlogPo implements IRepcat$RepcatlogPo {
 
	public enum COLUMNS {
		VERSION("Version of the repcat log record"), //
		ID("Identifying number of repcat log record"), //
		SOURCE("Name of the database at which the request originated"), //
		USERID("Name of the user who submitted the request"), //
		TIMESTAMP("When the request was submitted"), //
		ROLE("Is this database the masterdef for the request"), //
		MASTER("Name of the database that processes this request$_ddl"), //
		SNAME("Schema of replicated object"), //
		REQUEST("Name of the requested operation"), //
		ONAME("Replicated object name, if applicable"), //
		TYPE("Type of replicated object, if applicable"), //
		A_COMMENT("Textual argument used for comments"), //
		BOOL_ARG("Boolean argument"), //
		ANO_BOOL_ARG("Another Boolean argument"), //
		INT_ARG("Integer argument"), //
		ANO_INT_ARG("Another integer argument"), //
		LINES("The number of rows in system.repcat$_ddl at the processing site"), //
		STATUS("Status of the request at this database"), //
		MESSAGE("Error message associated with processing the request"), //
		ERRNUM("Oracle error number associated with processing the request"), //
		GNAME("Name of the replicated object group") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal version;
	private BigDecimal id;
	private String source;
	private String userid;
	private java.sql.Timestamp timestamp;
	private String role;
	private String master;
	private String sname;
	private BigDecimal request;
	private String oname;
	private BigDecimal type;
	private String aComment;
	private String boolArg;
	private String anoBoolArg;
	private BigDecimal intArg;
	private BigDecimal anoIntArg;
	private BigDecimal lines;
	private BigDecimal status;
	private String message;
	private BigDecimal errnum;
	private String gname;

	@Override
	public BigDecimal getVersion() {
		return this.version;
	}
 
	@Override
	public void setVersion(final BigDecimal version) {
		this.version = version; 
	}
 
	@Override
	public BigDecimal getId() {
		return this.id;
	}
 
	@Override
	public void setId(final BigDecimal id) {
		this.id = id; 
	}
 
	@Override
	public String getSource() {
		return this.source;
	}
 
	@Override
	public void setSource(final String source) {
		this.source = source; 
	}
 
	@Override
	public String getUserid() {
		return this.userid;
	}
 
	@Override
	public void setUserid(final String userid) {
		this.userid = userid; 
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
	public String getRole() {
		return this.role;
	}
 
	@Override
	public void setRole(final String role) {
		this.role = role; 
	}
 
	@Override
	public String getMaster() {
		return this.master;
	}
 
	@Override
	public void setMaster(final String master) {
		this.master = master; 
	}
 
	@Override
	public String getSname() {
		return this.sname;
	}
 
	@Override
	public void setSname(final String sname) {
		this.sname = sname; 
	}
 
	@Override
	public BigDecimal getRequest() {
		return this.request;
	}
 
	@Override
	public void setRequest(final BigDecimal request) {
		this.request = request; 
	}
 
	@Override
	public String getOname() {
		return this.oname;
	}
 
	@Override
	public void setOname(final String oname) {
		this.oname = oname; 
	}
 
	@Override
	public BigDecimal getType() {
		return this.type;
	}
 
	@Override
	public void setType(final BigDecimal type) {
		this.type = type; 
	}
 
	@Override
	public String getAComment() {
		return this.aComment;
	}
 
	@Override
	public void setAComment(final String aComment) {
		this.aComment = aComment; 
	}
 
	@Override
	public String getBoolArg() {
		return this.boolArg;
	}
 
	@Override
	public void setBoolArg(final String boolArg) {
		this.boolArg = boolArg; 
	}
 
	@Override
	public String getAnoBoolArg() {
		return this.anoBoolArg;
	}
 
	@Override
	public void setAnoBoolArg(final String anoBoolArg) {
		this.anoBoolArg = anoBoolArg; 
	}
 
	@Override
	public BigDecimal getIntArg() {
		return this.intArg;
	}
 
	@Override
	public void setIntArg(final BigDecimal intArg) {
		this.intArg = intArg; 
	}
 
	@Override
	public BigDecimal getAnoIntArg() {
		return this.anoIntArg;
	}
 
	@Override
	public void setAnoIntArg(final BigDecimal anoIntArg) {
		this.anoIntArg = anoIntArg; 
	}
 
	@Override
	public BigDecimal getLines() {
		return this.lines;
	}
 
	@Override
	public void setLines(final BigDecimal lines) {
		this.lines = lines; 
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
	public String getMessage() {
		return this.message;
	}
 
	@Override
	public void setMessage(final String message) {
		this.message = message; 
	}
 
	@Override
	public BigDecimal getErrnum() {
		return this.errnum;
	}
 
	@Override
	public void setErrnum(final BigDecimal errnum) {
		this.errnum = errnum; 
	}
 
	@Override
	public String getGname() {
		return this.gname;
	}
 
	@Override
	public void setGname(final String gname) {
		this.gname = gname; 
	}
 
}
