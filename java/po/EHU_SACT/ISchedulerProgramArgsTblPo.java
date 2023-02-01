package com.doc.common.po; 
 
public interface ISchedulerProgramArgsTblPo {
 
	String getOwner();
 
	void setOwner(final String owner);
 
	String getProgramName();
 
	void setProgramName(final String programName);
 
	String getArgumentName();
 
	void setArgumentName(final String argumentName);
 
	BigDecimal getArgumentPosition();
 
	void setArgumentPosition(final BigDecimal argumentPosition);
 
	String getArgumentType();
 
	void setArgumentType(final String argumentType);
 
	String getMetadataAttribute();
 
	void setMetadataAttribute(final String metadataAttribute);
 
	String getDefaultValue();
 
	void setDefaultValue(final String defaultValue);
 
	String getDefaultAnydataValue();
 
	void setDefaultAnydataValue(final String defaultAnydataValue);
 
	String getOutArgument();
 
	void setOutArgument(final String outArgument);
 
}
