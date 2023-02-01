package com.doc.common.dao.impl; 
 
public class MviewEvaluationsDAOImpl extends GeneralDAOImpl<MviewEvaluationsPo> implements IMviewEvaluationsDAO { 
	public static final MviewEvaluationsDAOImpl INSTANCE = new MviewEvaluationsDAOImpl(); 
	public static final String TABLENAME = "MVIEW_EVALUATIONS"; 

	public MviewEvaluationsDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<MviewEvaluationsPo> CONVERTER = new MapConverter<MviewEvaluationsPo>() { 
 
		@Override 
		public MviewEvaluationsPo convert(final DataObject dataObject) { 
			final MviewEvaluationsPo mviewEvaluationsPo = new MviewEvaluationsPo(); 
			return mviewEvaluationsPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final MviewEvaluationsPo mviewEvaluationsPo) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<MviewEvaluationsPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(MviewEvaluationsPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
