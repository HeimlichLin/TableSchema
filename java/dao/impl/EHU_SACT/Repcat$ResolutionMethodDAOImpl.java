package com.doc.common.dao.impl; 
 
public class Repcat$ResolutionMethodDAOImpl extends GeneralDAOImpl<Repcat$ResolutionMethodPo> implements IRepcat$ResolutionMethodDAO { 
	public static final Repcat$ResolutionMethodDAOImpl INSTANCE = new Repcat$ResolutionMethodDAOImpl(); 
	public static final String TABLENAME = "REPCAT$_RESOLUTION_METHOD"; 

	public Repcat$ResolutionMethodDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Repcat$ResolutionMethodPo> CONVERTER = new MapConverter<Repcat$ResolutionMethodPo>() { 
 
		@Override 
		public Repcat$ResolutionMethodPo convert(final DataObject dataObject) { 
			final Repcat$ResolutionMethodPo repcat$ResolutionMethodPo = new Repcat$ResolutionMethodPo(); 
			repcat$ResolutionMethodPo.setConflictTypeId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$ResolutionMethodPo.COLUMNS.CONFLICT_TYPE_ID.name()))); 
			repcat$ResolutionMethodPo.setMethodName(dataObject.getString(Repcat$ResolutionMethodPo.COLUMNS.METHOD_NAME.name())); 
			return repcat$ResolutionMethodPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Repcat$ResolutionMethodPo repcat$ResolutionMethodPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Repcat$ResolutionMethodPo.COLUMNS.CONFLICT_TYPE_ID.name(), repcat$ResolutionMethodPo.getConflictTypeId()); 
			dataObject.setValue(Repcat$ResolutionMethodPo.COLUMNS.METHOD_NAME.name(), repcat$ResolutionMethodPo.getMethodName()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Repcat$ResolutionMethodPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Repcat$ResolutionMethodPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Repcat$ResolutionMethodPo.COLUMNS.CONFLICT_TYPE_ID.name(), po.getConflictTypeId()); 
		sqlWhere.add(Repcat$ResolutionMethodPo.COLUMNS.METHOD_NAME.name(), po.getMethodName()); 
		return sqlWhere; 
	} 
 
} 
