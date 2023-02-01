package com.doc.common.po.impl; 
 
public class Repcat$ResolutionStatisticsPo implements IRepcat$ResolutionStatisticsPo {
 
	public enum COLUMNS {
		SNAME("Owner of replicated object"), //
		ONAME("Name of the replicated object"), //
		CONFLICT_TYPE_ID("Type of conflict"), //
		REFERENCE_NAME("Table name, unique constraint name, or column group name"), //
		METHOD_NAME("Name of the conflict resolution method"), //
		FUNCTION_NAME("Name of the resolution function"), //
		PRIORITY_GROUP("Name of the priority group used in conflict resolution"), //
		RESOLVED_DATE("Timestamp for the resolution of the conflict"), //
		PRIMARY_KEY_VALUE("Primary key of the replicated row (character data)") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String sname;
	private String oname;
	private BigDecimal conflictTypeId;
	private String referenceName;
	private String methodName;
	private String functionName;
	private String priorityGroup;
	private java.sql.Timestamp resolvedDate;
	private String primaryKeyValue;

	@Override
	public String getSname() {
		return this.sname;
	}
 
	@Override
	public void setSname(final String sname) {
		this.sname = sname; 
	}
 
	@Override
	public String getOname() {
		return this.oname;
	}
 
	@Override
	public void setOname(final String oname) {
		this.oname = oname; 
	}
 
	@Override
	public BigDecimal getConflictTypeId() {
		return this.conflictTypeId;
	}
 
	@Override
	public void setConflictTypeId(final BigDecimal conflictTypeId) {
		this.conflictTypeId = conflictTypeId; 
	}
 
	@Override
	public String getReferenceName() {
		return this.referenceName;
	}
 
	@Override
	public void setReferenceName(final String referenceName) {
		this.referenceName = referenceName; 
	}
 
	@Override
	public String getMethodName() {
		return this.methodName;
	}
 
	@Override
	public void setMethodName(final String methodName) {
		this.methodName = methodName; 
	}
 
	@Override
	public String getFunctionName() {
		return this.functionName;
	}
 
	@Override
	public void setFunctionName(final String functionName) {
		this.functionName = functionName; 
	}
 
	@Override
	public String getPriorityGroup() {
		return this.priorityGroup;
	}
 
	@Override
	public void setPriorityGroup(final String priorityGroup) {
		this.priorityGroup = priorityGroup; 
	}
 
	@Override
	public java.sql.Timestamp getResolvedDate() {
		return this.resolvedDate;
	}
 
	@Override
	public void setResolvedDate(final java.sql.Timestamp resolvedDate) {
		this.resolvedDate = resolvedDate; 
	}
 
	@Override
	public String getPrimaryKeyValue() {
		return this.primaryKeyValue;
	}
 
	@Override
	public void setPrimaryKeyValue(final String primaryKeyValue) {
		this.primaryKeyValue = primaryKeyValue; 
	}
 
}
