package com.doc.common.po.impl; 
 
public class SchedulerProgramArgsTblPo implements ISchedulerProgramArgsTblPo {
 
	public enum COLUMNS {
		OWNER("null"), //
		PROGRAM_NAME("null"), //
		ARGUMENT_NAME("null"), //
		ARGUMENT_POSITION("null"), //
		ARGUMENT_TYPE("null"), //
		METADATA_ATTRIBUTE("null"), //
		DEFAULT_VALUE("null"), //
		DEFAULT_ANYDATA_VALUE("null"), //
		OUT_ARGUMENT("null") //
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
	private String programName;
	private String argumentName;
	private BigDecimal argumentPosition;
	private String argumentType;
	private String metadataAttribute;
	private String defaultValue;
	private String defaultAnydataValue;
	private String outArgument;

	@Override
	public String getOwner() {
		return this.owner;
	}
 
	@Override
	public void setOwner(final String owner) {
		this.owner = owner; 
	}
 
	@Override
	public String getProgramName() {
		return this.programName;
	}
 
	@Override
	public void setProgramName(final String programName) {
		this.programName = programName; 
	}
 
	@Override
	public String getArgumentName() {
		return this.argumentName;
	}
 
	@Override
	public void setArgumentName(final String argumentName) {
		this.argumentName = argumentName; 
	}
 
	@Override
	public BigDecimal getArgumentPosition() {
		return this.argumentPosition;
	}
 
	@Override
	public void setArgumentPosition(final BigDecimal argumentPosition) {
		this.argumentPosition = argumentPosition; 
	}
 
	@Override
	public String getArgumentType() {
		return this.argumentType;
	}
 
	@Override
	public void setArgumentType(final String argumentType) {
		this.argumentType = argumentType; 
	}
 
	@Override
	public String getMetadataAttribute() {
		return this.metadataAttribute;
	}
 
	@Override
	public void setMetadataAttribute(final String metadataAttribute) {
		this.metadataAttribute = metadataAttribute; 
	}
 
	@Override
	public String getDefaultValue() {
		return this.defaultValue;
	}
 
	@Override
	public void setDefaultValue(final String defaultValue) {
		this.defaultValue = defaultValue; 
	}
 
	@Override
	public String getDefaultAnydataValue() {
		return this.defaultAnydataValue;
	}
 
	@Override
	public void setDefaultAnydataValue(final String defaultAnydataValue) {
		this.defaultAnydataValue = defaultAnydataValue; 
	}
 
	@Override
	public String getOutArgument() {
		return this.outArgument;
	}
 
	@Override
	public void setOutArgument(final String outArgument) {
		this.outArgument = outArgument; 
	}
 
}
