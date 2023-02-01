package com.doc.common.dao.impl; 
 
public class Repcat$ResolutionDAOImpl extends GeneralDAOImpl<Repcat$ResolutionPo> implements IRepcat$ResolutionDAO { 
	public static final Repcat$ResolutionDAOImpl INSTANCE = new Repcat$ResolutionDAOImpl(); 
	public static final String TABLENAME = "REPCAT$_RESOLUTION"; 

	public Repcat$ResolutionDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Repcat$ResolutionPo> CONVERTER = new MapConverter<Repcat$ResolutionPo>() { 
 
		@Override 
		public Repcat$ResolutionPo convert(final DataObject dataObject) { 
			final Repcat$ResolutionPo repcat$ResolutionPo = new Repcat$ResolutionPo(); 
			repcat$ResolutionPo.setSname(dataObject.getString(Repcat$ResolutionPo.COLUMNS.SNAME.name())); 
			repcat$ResolutionPo.setOname(dataObject.getString(Repcat$ResolutionPo.COLUMNS.ONAME.name())); 
			repcat$ResolutionPo.setConflictTypeId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$ResolutionPo.COLUMNS.CONFLICT_TYPE_ID.name()))); 
			repcat$ResolutionPo.setConflictTypeId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$ResolutionPo.COLUMNS.CONFLICT_TYPE_ID.name()))); 
			repcat$ResolutionPo.setReferenceName(dataObject.getString(Repcat$ResolutionPo.COLUMNS.REFERENCE_NAME.name())); 
			repcat$ResolutionPo.setSequenceNo(BigDecimalUtils.formObj(dataObject.getValue(Repcat$ResolutionPo.COLUMNS.SEQUENCE_NO.name()))); 
			repcat$ResolutionPo.setMethodName(dataObject.getString(Repcat$ResolutionPo.COLUMNS.METHOD_NAME.name())); 
			repcat$ResolutionPo.setFunctionName(dataObject.getString(Repcat$ResolutionPo.COLUMNS.FUNCTION_NAME.name())); 
			repcat$ResolutionPo.setPriorityGroup(dataObject.getString(Repcat$ResolutionPo.COLUMNS.PRIORITY_GROUP.name())); 
			repcat$ResolutionPo.setResolutionComment(dataObject.getString(Repcat$ResolutionPo.COLUMNS.RESOLUTION_COMMENT.name())); 
			return repcat$ResolutionPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Repcat$ResolutionPo repcat$ResolutionPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Repcat$ResolutionPo.COLUMNS.SNAME.name(), repcat$ResolutionPo.getSname()); 
			dataObject.setValue(Repcat$ResolutionPo.COLUMNS.ONAME.name(), repcat$ResolutionPo.getOname()); 
			dataObject.setValue(Repcat$ResolutionPo.COLUMNS.CONFLICT_TYPE_ID.name(), repcat$ResolutionPo.getConflictTypeId()); 
			dataObject.setValue(Repcat$ResolutionPo.COLUMNS.CONFLICT_TYPE_ID.name(), repcat$ResolutionPo.getConflictTypeId()); 
			dataObject.setValue(Repcat$ResolutionPo.COLUMNS.REFERENCE_NAME.name(), repcat$ResolutionPo.getReferenceName()); 
			dataObject.setValue(Repcat$ResolutionPo.COLUMNS.SEQUENCE_NO.name(), repcat$ResolutionPo.getSequenceNo()); 
			dataObject.setValue(Repcat$ResolutionPo.COLUMNS.METHOD_NAME.name(), repcat$ResolutionPo.getMethodName()); 
			dataObject.setValue(Repcat$ResolutionPo.COLUMNS.FUNCTION_NAME.name(), repcat$ResolutionPo.getFunctionName()); 
			dataObject.setValue(Repcat$ResolutionPo.COLUMNS.PRIORITY_GROUP.name(), repcat$ResolutionPo.getPriorityGroup()); 
			dataObject.setValue(Repcat$ResolutionPo.COLUMNS.RESOLUTION_COMMENT.name(), repcat$ResolutionPo.getResolutionComment()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Repcat$ResolutionPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Repcat$ResolutionPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Repcat$ResolutionPo.COLUMNS.SNAME.name(), po.getSname()); 
		sqlWhere.add(Repcat$ResolutionPo.COLUMNS.ONAME.name(), po.getOname()); 
		sqlWhere.add(Repcat$ResolutionPo.COLUMNS.CONFLICT_TYPE_ID.name(), po.getConflictTypeId()); 
		sqlWhere.add(Repcat$ResolutionPo.COLUMNS.CONFLICT_TYPE_ID.name(), po.getConflictTypeId()); 
		sqlWhere.add(Repcat$ResolutionPo.COLUMNS.REFERENCE_NAME.name(), po.getReferenceName()); 
		sqlWhere.add(Repcat$ResolutionPo.COLUMNS.SEQUENCE_NO.name(), po.getSequenceNo()); 
		sqlWhere.add(Repcat$ResolutionPo.COLUMNS.METHOD_NAME.name(), po.getMethodName()); 
		return sqlWhere; 
	} 
 
} 
