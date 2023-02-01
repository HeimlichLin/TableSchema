package com.doc.common.po.impl; 
 
public class Ol$Po implements IOl$Po {
 
	public enum COLUMNS {
		OL_NAME("null"), //
		SQL_TEXT("null"), //
		TEXTLEN("null"), //
		SIGNATURE("null"), //
		HASH_VALUE("null"), //
		HASH_VALUE2("null"), //
		CATEGORY("null"), //
		VERSION("null"), //
		CREATOR("null"), //
		TIMESTAMP("null"), //
		FLAGS("null"), //
		HINTCOUNT("null"), //
		SPARE1("null"), //
		SPARE2("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String olName;
	private String sqlText;
	private BigDecimal textlen;
	private String signature;
	private BigDecimal hashValue;
	private BigDecimal hashValue2;
	private String category;
	private String version;
	private String creator;
	private java.sql.Timestamp timestamp;
	private BigDecimal flags;
	private BigDecimal hintcount;
	private BigDecimal spare1;
	private String spare2;

	@Override
	public String getOlName() {
		return this.olName;
	}
 
	@Override
	public void setOlName(final String olName) {
		this.olName = olName; 
	}
 
	@Override
	public String getSqlText() {
		return this.sqlText;
	}
 
	@Override
	public void setSqlText(final String sqlText) {
		this.sqlText = sqlText; 
	}
 
	@Override
	public BigDecimal getTextlen() {
		return this.textlen;
	}
 
	@Override
	public void setTextlen(final BigDecimal textlen) {
		this.textlen = textlen; 
	}
 
	@Override
	public String getSignature() {
		return this.signature;
	}
 
	@Override
	public void setSignature(final String signature) {
		this.signature = signature; 
	}
 
	@Override
	public BigDecimal getHashValue() {
		return this.hashValue;
	}
 
	@Override
	public void setHashValue(final BigDecimal hashValue) {
		this.hashValue = hashValue; 
	}
 
	@Override
	public BigDecimal getHashValue2() {
		return this.hashValue2;
	}
 
	@Override
	public void setHashValue2(final BigDecimal hashValue2) {
		this.hashValue2 = hashValue2; 
	}
 
	@Override
	public String getCategory() {
		return this.category;
	}
 
	@Override
	public void setCategory(final String category) {
		this.category = category; 
	}
 
	@Override
	public String getVersion() {
		return this.version;
	}
 
	@Override
	public void setVersion(final String version) {
		this.version = version; 
	}
 
	@Override
	public String getCreator() {
		return this.creator;
	}
 
	@Override
	public void setCreator(final String creator) {
		this.creator = creator; 
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
	public BigDecimal getFlags() {
		return this.flags;
	}
 
	@Override
	public void setFlags(final BigDecimal flags) {
		this.flags = flags; 
	}
 
	@Override
	public BigDecimal getHintcount() {
		return this.hintcount;
	}
 
	@Override
	public void setHintcount(final BigDecimal hintcount) {
		this.hintcount = hintcount; 
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
 
}
