package com.doc.common.dao.impl; 
 
public class Repcat$RuntimeParmsDAOImpl extends GeneralDAOImpl<Repcat$RuntimeParmsPo> implements IRepcat$RuntimeParmsDAO { 
	public static final Repcat$RuntimeParmsDAOImpl INSTANCE = new Repcat$RuntimeParmsDAOImpl(); 
	public static final String TABLENAME = "REPCAT$_RUNTIME_PARMS"; 

	public Repcat$RuntimeParmsDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Repcat$RuntimeParmsPo> CONVERTER = new MapConverter<Repcat$RuntimeParmsPo>() { 
 
		@Override 
		public Repcat$RuntimeParmsPo convert(final DataObject dataObject) { 
			final Repcat$RuntimeParmsPo repcat$RuntimeParmsPo = new Repcat$RuntimeParmsPo(); 
			repcat$RuntimeParmsPo.setRuntimeParmId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$RuntimeParmsPo.COLUMNS.RUNTIME_PARM_ID.name()))); 
			repcat$RuntimeParmsPo.setParameterName(dataObject.getString(Repcat$RuntimeParmsPo.COLUMNS.PARAMETER_NAME.name())); 
			repcat$RuntimeParmsPo.setParmValue(); 
			return repcat$RuntimeParmsPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Repcat$RuntimeParmsPo repcat$RuntimeParmsPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Repcat$RuntimeParmsPo.COLUMNS.RUNTIME_PARM_ID.name(), repcat$RuntimeParmsPo.getRuntimeParmId()); 
			dataObject.setValue(Repcat$RuntimeParmsPo.COLUMNS.PARAMETER_NAME.name(), repcat$RuntimeParmsPo.getParameterName()); 
			dataObject.setValue(Repcat$RuntimeParmsPo.COLUMNS.PARM_VALUE.name(), repcat$RuntimeParmsPo.getParmValue()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Repcat$RuntimeParmsPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Repcat$RuntimeParmsPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
