package com.doc.common.po.impl; 
 
public class MicrosoftdtpropertiesPo implements IMicrosoftdtpropertiesPo {
 
	public enum COLUMNS {
		ID("null"), //
		OBJECTID("null"), //
		PROPERTY("null"), //
		VALUE("null"), //
		LVALUE("null"), //
		VERSION("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal id;
	private BigDecimal objectid;
	private String property;
	private String value;
	private String lvalue;
	private BigDecimal version;

	@Override
	public BigDecimal getId() {
		return this.id;
	}
 
	@Override
	public void setId(final BigDecimal id) {
		this.id = id; 
	}
 
	@Override
	public BigDecimal getObjectid() {
		return this.objectid;
	}
 
	@Override
	public void setObjectid(final BigDecimal objectid) {
		this.objectid = objectid; 
	}
 
	@Override
	public String getProperty() {
		return this.property;
	}
 
	@Override
	public void setProperty(final String property) {
		this.property = property; 
	}
 
	@Override
	public String getValue() {
		return this.value;
	}
 
	@Override
	public void setValue(final String value) {
		this.value = value; 
	}
 
	@Override
	public String getLvalue() {
		return this.lvalue;
	}
 
	@Override
	public void setLvalue(final String lvalue) {
		this.lvalue = lvalue; 
	}
 
	@Override
	public BigDecimal getVersion() {
		return this.version;
	}
 
	@Override
	public void setVersion(final BigDecimal version) {
		this.version = version; 
	}
 
}
