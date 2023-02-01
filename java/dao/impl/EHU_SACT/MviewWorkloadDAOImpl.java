package com.doc.common.dao.impl; 
 
public class MviewWorkloadDAOImpl extends GeneralDAOImpl<MviewWorkloadPo> implements IMviewWorkloadDAO { 
	public static final MviewWorkloadDAOImpl INSTANCE = new MviewWorkloadDAOImpl(); 
	public static final String TABLENAME = "MVIEW_WORKLOAD"; 

	public MviewWorkloadDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<MviewWorkloadPo> CONVERTER = new MapConverter<MviewWorkloadPo>() { 
 
		@Override 
		public MviewWorkloadPo convert(final DataObject dataObject) { 
			final MviewWorkloadPo mviewWorkloadPo = new MviewWorkloadPo(); 
			return mviewWorkloadPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final MviewWorkloadPo mviewWorkloadPo) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<MviewWorkloadPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(MviewWorkloadPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
