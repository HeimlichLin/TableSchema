package com.doc.common.dao.impl; 
 
public class MviewLogDAOImpl extends GeneralDAOImpl<MviewLogPo> implements IMviewLogDAO { 
	public static final MviewLogDAOImpl INSTANCE = new MviewLogDAOImpl(); 
	public static final String TABLENAME = "MVIEW_LOG"; 

	public MviewLogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<MviewLogPo> CONVERTER = new MapConverter<MviewLogPo>() { 
 
		@Override 
		public MviewLogPo convert(final DataObject dataObject) { 
			final MviewLogPo mviewLogPo = new MviewLogPo(); 
			return mviewLogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final MviewLogPo mviewLogPo) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<MviewLogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(MviewLogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
