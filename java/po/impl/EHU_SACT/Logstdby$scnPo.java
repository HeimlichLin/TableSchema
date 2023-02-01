package com.doc.common.po.impl; 
 
public class Logstdby$scnPo implements ILogstdby$scnPo {
 
	public enum COLUMNS {
		OBJ#("null"), //
		OBJNAME("null"), //
		SCHEMA("null"), //
		TYPE("null"), //
		SCN("null"), //
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
 
	private BigDecimal obj#;
	private String objname;
	private String schema;
	private String type;
	private BigDecimal scn;
	private BigDecimal spare1;
	private BigDecimal spare2;
	private String spare3;

	@Override
	public BigDecimal getObj#() {
		return this.obj#;
	}
 
	@Override
	public void setObj#(final BigDecimal obj#) {
		this.obj# = obj#; 
	}
 
	@Override
	public String getObjname() {
		return this.objname;
	}
 
	@Override
	public void setObjname(final String objname) {
		this.objname = objname; 
	}
 
	@Override
	public String getSchema() {
		return this.schema;
	}
 
	@Override
	public void setSchema(final String schema) {
		this.schema = schema; 
	}
 
	@Override
	public String getType() {
		return this.type;
	}
 
	@Override
	public void setType(final String type) {
		this.type = type; 
	}
 
	@Override
	public BigDecimal getScn() {
		return this.scn;
	}
 
	@Override
	public void setScn(final BigDecimal scn) {
		this.scn = scn; 
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
	public String getSpare3() {
		return this.spare3;
	}
 
	@Override
	public void setSpare3(final String spare3) {
		this.spare3 = spare3; 
	}
 
}
