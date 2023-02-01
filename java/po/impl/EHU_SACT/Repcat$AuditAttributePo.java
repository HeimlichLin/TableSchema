package com.doc.common.po.impl; 
 
public class Repcat$AuditAttributePo implements IRepcat$AuditAttributePo {
 
	public enum COLUMNS {
		ATTRIBUTE("Description of the attribute"), //
		DATA_TYPE_ID("Datatype of the attribute value"), //
		DATA_LENGTH("Length of the attribute value in byte"), //
		SOURCE("Name of the function which returns the attribute value") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String attribute;
	private BigDecimal dataTypeId;
	private BigDecimal dataLength;
	private String source;

	@Override
	public String getAttribute() {
		return this.attribute;
	}
 
	@Override
	public void setAttribute(final String attribute) {
		this.attribute = attribute; 
	}
 
	@Override
	public BigDecimal getDataTypeId() {
		return this.dataTypeId;
	}
 
	@Override
	public void setDataTypeId(final BigDecimal dataTypeId) {
		this.dataTypeId = dataTypeId; 
	}
 
	@Override
	public BigDecimal getDataLength() {
		return this.dataLength;
	}
 
	@Override
	public void setDataLength(final BigDecimal dataLength) {
		this.dataLength = dataLength; 
	}
 
	@Override
	public String getSource() {
		return this.source;
	}
 
	@Override
	public void setSource(final String source) {
		this.source = source; 
	}
 
}
