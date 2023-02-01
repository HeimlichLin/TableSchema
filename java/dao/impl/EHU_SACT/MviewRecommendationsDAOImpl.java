package com.doc.common.dao.impl; 
 
public class MviewRecommendationsDAOImpl extends GeneralDAOImpl<MviewRecommendationsPo> implements IMviewRecommendationsDAO { 
	public static final MviewRecommendationsDAOImpl INSTANCE = new MviewRecommendationsDAOImpl(); 
	public static final String TABLENAME = "MVIEW_RECOMMENDATIONS"; 

	public MviewRecommendationsDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<MviewRecommendationsPo> CONVERTER = new MapConverter<MviewRecommendationsPo>() { 
 
		@Override 
		public MviewRecommendationsPo convert(final DataObject dataObject) { 
			final MviewRecommendationsPo mviewRecommendationsPo = new MviewRecommendationsPo(); 
			return mviewRecommendationsPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final MviewRecommendationsPo mviewRecommendationsPo) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<MviewRecommendationsPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(MviewRecommendationsPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
