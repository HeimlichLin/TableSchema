package com.doc.common.po.impl; 
 
public class SqlplusProductProfilePo implements ISqlplusProductProfilePo {
 
	public enum COLUMNS {
		PRODUCT("null"), //
		USERID("null"), //
		ATTRIBUTE("null"), //
		SCOPE("null"), //
		NUMERIC_VALUE("null"), //
		CHAR_VALUE("null"), //
		DATE_VALUE("null"), //
		LONG_VALUE("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String product;
	private String userid;
	private String attribute;
	private String scope;
	private BigDecimal numericValue;
	private String charValue;
	private java.sql.Timestamp dateValue;
	private String longValue;

	@Override
	public String getProduct() {
		return this.product;
	}
 
	@Override
	public void setProduct(final String product) {
		this.product = product; 
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
	public String getAttribute() {
		return this.attribute;
	}
 
	@Override
	public void setAttribute(final String attribute) {
		this.attribute = attribute; 
	}
 
	@Override
	public String getScope() {
		return this.scope;
	}
 
	@Override
	public void setScope(final String scope) {
		this.scope = scope; 
	}
 
	@Override
	public BigDecimal getNumericValue() {
		return this.numericValue;
	}
 
	@Override
	public void setNumericValue(final BigDecimal numericValue) {
		this.numericValue = numericValue; 
	}
 
	@Override
	public String getCharValue() {
		return this.charValue;
	}
 
	@Override
	public void setCharValue(final String charValue) {
		this.charValue = charValue; 
	}
 
	@Override
	public java.sql.Timestamp getDateValue() {
		return this.dateValue;
	}
 
	@Override
	public void setDateValue(final java.sql.Timestamp dateValue) {
		this.dateValue = dateValue; 
	}
 
	@Override
	public String getLongValue() {
		return this.longValue;
	}
 
	@Override
	public void setLongValue(final String longValue) {
		this.longValue = longValue; 
	}
 
}
