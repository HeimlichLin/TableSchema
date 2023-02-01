package com.doc.common.po; 
 
public interface ISchedulerJobArgsTblPo {
 
	String getOwner();
 
	void setOwner(final String owner);
 
	String getJobName();
 
	void setJobName(final String jobName);
 
	String getArgumentName();
 
	void setArgumentName(final String argumentName);
 
	BigDecimal getArgumentPosition();
 
	void setArgumentPosition(final BigDecimal argumentPosition);
 
	String getArgumentType();
 
	void setArgumentType(final String argumentType);
 
	String getValue();
 
	void setValue(final String value);
 
	String getAnydataValue();
 
	void setAnydataValue(final String anydataValue);
 
	String getOutArgument();
 
	void setOutArgument(final String outArgument);
 
}
