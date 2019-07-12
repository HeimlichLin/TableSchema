package com.doc.common.bean; 
 
public class MicrosoftdtpropertiesDo { 
 
	public enum COLUMNS { 
		ID("null"), 
		OBJECTID("null"), 
		PROPERTY("null"), 
		VALUE("null"), 
		LVALUE("null"), 
		VERSION("null") 
		; 
		final String name; 
	 
		private COLUMNS(final String name) { 
			this.name = name; 
		} 
	 
		public String getName() { 
			return this.name; 
		} 
	} 
 
	private BigDecimal id; 
	private BigDecimal objectid; 
	private String property; 
	private String value; 
	private String lvalue; 
	private BigDecimal version; 
	
	public BigDecimal getId() { 
		return id; 
	} 
 
	public void setId(BigDecimal id) { 
		this.id = id; 
	} 
 
	public BigDecimal getObjectid() { 
		return objectid; 
	} 
 
	public void setObjectid(BigDecimal objectid) { 
		this.objectid = objectid; 
	} 
 
	public String getProperty() { 
		return property; 
	} 
 
	public void setProperty(String property) { 
		this.property = property; 
	} 
 
	public String getValue() { 
		return value; 
	} 
 
	public void setValue(String value) { 
		this.value = value; 
	} 
 
	public String getLvalue() { 
		return lvalue; 
	} 
 
	public void setLvalue(String lvalue) { 
		this.lvalue = lvalue; 
	} 
 
	public BigDecimal getVersion() { 
		return version; 
	} 
 
	public void setVersion(BigDecimal version) { 
		this.version = version; 
	} 
 
} 
