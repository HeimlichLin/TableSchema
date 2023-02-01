package com.doc.common.po.impl; 
 
public class SchedulerJobArgsTblPo implements ISchedulerJobArgsTblPo {
 
	public enum COLUMNS {
		OWNER("null"), //
		JOB_NAME("null"), //
		ARGUMENT_NAME("null"), //
		ARGUMENT_POSITION("null"), //
		ARGUMENT_TYPE("null"), //
		VALUE("null"), //
		ANYDATA_VALUE("null"), //
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
	private String jobName;
	private String argumentName;
	private BigDecimal argumentPosition;
	private String argumentType;
	private String value;
	private String anydataValue;
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
	public String getJobName() {
		return this.jobName;
	}
 
	@Override
	public void setJobName(final String jobName) {
		this.jobName = jobName; 
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
	public String getValue() {
		return this.value;
	}
 
	@Override
	public void setValue(final String value) {
		this.value = value; 
	}
 
	@Override
	public String getAnydataValue() {
		return this.anydataValue;
	}
 
	@Override
	public void setAnydataValue(final String anydataValue) {
		this.anydataValue = anydataValue; 
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
