package com.doc.common.po.impl; 
 
public class Repcat$ResolutionMethodPo implements IRepcat$ResolutionMethodPo {
 
	public enum COLUMNS {
		CONFLICT_TYPE_ID("Type of conflict"), //
		METHOD_NAME("Name of the conflict resolution method") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal conflictTypeId;
	private String methodName;

	@Override
	public BigDecimal getConflictTypeId() {
		return this.conflictTypeId;
	}
 
	@Override
	public void setConflictTypeId(final BigDecimal conflictTypeId) {
		this.conflictTypeId = conflictTypeId; 
	}
 
	@Override
	public String getMethodName() {
		return this.methodName;
	}
 
	@Override
	public void setMethodName(final String methodName) {
		this.methodName = methodName; 
	}
 
}
