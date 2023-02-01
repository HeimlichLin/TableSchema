package com.doc.common.po.impl; 
 
public class Repcat$RuntimeParmsPo implements IRepcat$RuntimeParmsPo {
 
	public enum COLUMNS {
		RUNTIME_PARM_ID("Primary key of the parameter values table."), //
		PARAMETER_NAME("Name of the parameter."), //
		PARM_VALUE("Parameter value.") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal runtimeParmId;
	private String parameterName;
	private String parmValue;

	@Override
	public BigDecimal getRuntimeParmId() {
		return this.runtimeParmId;
	}
 
	@Override
	public void setRuntimeParmId(final BigDecimal runtimeParmId) {
		this.runtimeParmId = runtimeParmId; 
	}
 
	@Override
	public String getParameterName() {
		return this.parameterName;
	}
 
	@Override
	public void setParameterName(final String parameterName) {
		this.parameterName = parameterName; 
	}
 
	@Override
	public String getParmValue() {
		return this.parmValue;
	}
 
	@Override
	public void setParmValue(final String parmValue) {
		this.parmValue = parmValue; 
	}
 
}
