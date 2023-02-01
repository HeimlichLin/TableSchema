package com.doc.common.dao.impl; 
 
public class MviewFilterinstanceDAOImpl extends GeneralDAOImpl<MviewFilterinstancePo> implements IMviewFilterinstanceDAO { 
	public static final MviewFilterinstanceDAOImpl INSTANCE = new MviewFilterinstanceDAOImpl(); 
	public static final String TABLENAME = "MVIEW_FILTERINSTANCE"; 

	public MviewFilterinstanceDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<MviewFilterinstancePo> CONVERTER = new MapConverter<MviewFilterinstancePo>() { 
 
		@Override 
		public MviewFilterinstancePo convert(final DataObject dataObject) { 
			final MviewFilterinstancePo mviewFilterinstancePo = new MviewFilterinstancePo(); 
			return mviewFilterinstancePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final MviewFilterinstancePo mviewFilterinstancePo) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<MviewFilterinstancePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(MviewFilterinstancePo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
