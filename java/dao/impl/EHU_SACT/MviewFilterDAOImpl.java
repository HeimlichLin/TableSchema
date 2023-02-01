package com.doc.common.dao.impl; 
 
public class MviewFilterDAOImpl extends GeneralDAOImpl<MviewFilterPo> implements IMviewFilterDAO { 
	public static final MviewFilterDAOImpl INSTANCE = new MviewFilterDAOImpl(); 
	public static final String TABLENAME = "MVIEW_FILTER"; 

	public MviewFilterDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<MviewFilterPo> CONVERTER = new MapConverter<MviewFilterPo>() { 
 
		@Override 
		public MviewFilterPo convert(final DataObject dataObject) { 
			final MviewFilterPo mviewFilterPo = new MviewFilterPo(); 
			return mviewFilterPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final MviewFilterPo mviewFilterPo) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<MviewFilterPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(MviewFilterPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
