package com.doc.common.po.impl; 
 
public class Repcat$TemplateParmsPo implements IRepcat$TemplateParmsPo {
 
	public enum COLUMNS {
		TEMPLATE_PARAMETER_ID("Internal primary key of the REPCAT$_TEMPLATE_PARMS table."), //
		REFRESH_TEMPLATE_ID("Internal primary key of the REPCAT$_REFRESH_TEMPLATES table."), //
		PARAMETER_NAME("name of the parameter."), //
		DEFAULT_PARM_VALUE("Default value for the parameter."), //
		PROMPT_STRING("String for use in prompting for parameter values."), //
		USER_OVERRIDE("User override flag.") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal templateParameterId;
	private BigDecimal refreshTemplateId;
	private String parameterName;
	private String defaultParmValue;
	private String promptString;
	private String userOverride;

	@Override
	public BigDecimal getTemplateParameterId() {
		return this.templateParameterId;
	}
 
	@Override
	public void setTemplateParameterId(final BigDecimal templateParameterId) {
		this.templateParameterId = templateParameterId; 
	}
 
	@Override
	public BigDecimal getRefreshTemplateId() {
		return this.refreshTemplateId;
	}
 
	@Override
	public void setRefreshTemplateId(final BigDecimal refreshTemplateId) {
		this.refreshTemplateId = refreshTemplateId; 
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
	public String getDefaultParmValue() {
		return this.defaultParmValue;
	}
 
	@Override
	public void setDefaultParmValue(final String defaultParmValue) {
		this.defaultParmValue = defaultParmValue; 
	}
 
	@Override
	public String getPromptString() {
		return this.promptString;
	}
 
	@Override
	public void setPromptString(final String promptString) {
		this.promptString = promptString; 
	}
 
	@Override
	public String getUserOverride() {
		return this.userOverride;
	}
 
	@Override
	public void setUserOverride(final String userOverride) {
		this.userOverride = userOverride; 
	}
 
}
