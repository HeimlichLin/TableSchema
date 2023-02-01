package com.doc.common.po.impl; 
 
public class Repcat$ResolutionPo implements IRepcat$ResolutionPo {
 
	public enum COLUMNS {
		SNAME("Owner of replicated object"), //
		ONAME("Name of the replicated object"), //
		CONFLICT_TYPE_ID("Type of conflict"), //
		CONFLICT_TYPE_ID("Type of conflict"), //
		REFERENCE_NAME("Table name, unique constraint name, or column group name"), //
		SEQUENCE_NO("Ordering on resolution"), //
		METHOD_NAME("Name of the conflict resolution method"), //
		FUNCTION_NAME("Name of the resolution function"), //
		PRIORITY_GROUP("Name of the priority group used in conflict resolution"), //
		RESOLUTION_COMMENT("Description of the conflict resolution") //
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
	private BigDecimal conflictTypeId;
	private String referenceName;
	private BigDecimal sequenceNo;
	private String methodName;
	private String functionName;
	private String priorityGroup;
	private String resolutionComment;

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
	public BigDecimal getSequenceNo() {
		return this.sequenceNo;
	}
 
	@Override
	public void setSequenceNo(final BigDecimal sequenceNo) {
		this.sequenceNo = sequenceNo; 
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
	public String getResolutionComment() {
		return this.resolutionComment;
	}
 
	@Override
	public void setResolutionComment(final String resolutionComment) {
		this.resolutionComment = resolutionComment; 
	}
 
}
