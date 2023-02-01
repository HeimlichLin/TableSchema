package com.doc.common.dao.impl; 
 
public class ScrapOrderDAOImpl extends GeneralDAOImpl<ScrapOrderPo> implements ScrapOrderDAO { 
	public static final ScrapOrderDAOImpl INSTANCE = new ScrapOrderDAOImpl(); 
	public static final String TABLENAME = "SCRAP_ORDER"; 

	public ScrapOrderDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ScrapOrderPo> CONVERTER = new MapConverter<ScrapOrderPo>() { 
 
		@Override 
		public ScrapOrderPo convert(final DataObject dataObject) { 
			final ScrapOrderPo scrapOrderPo = new ScrapOrderPo(); 
			scrapOrderPo.setBfNo(dataObject.getString(ScrapOrderPo.COLUMNS.BF_NO.name())); 
			scrapOrderPo.setScrapNo(dataObject.getString(ScrapOrderPo.COLUMNS.SCRAP_NO.name())); 
			scrapOrderPo.setSeriesNo(dataObject.getString(ScrapOrderPo.COLUMNS.SERIES_NO.name())); 
			scrapOrderPo.setScrapDate(dataObject.getString(ScrapOrderPo.COLUMNS.SCRAP_DATE.name())); 
			scrapOrderPo.setApplyDate(dataObject.getString(ScrapOrderPo.COLUMNS.APPLY_DATE.name())); 
			scrapOrderPo.setApprvNo(dataObject.getString(ScrapOrderPo.COLUMNS.APPRV_NO.name())); 
			scrapOrderPo.setApprvDate(dataObject.getString(ScrapOrderPo.COLUMNS.APPRV_DATE.name())); 
			scrapOrderPo.setScrapPlace(dataObject.getString(ScrapOrderPo.COLUMNS.SCRAP_PLACE.name())); 
			scrapOrderPo.setScrapType(dataObject.getString(ScrapOrderPo.COLUMNS.SCRAP_TYPE.name())); 
			scrapOrderPo.setScrapStatus(dataObject.getString(ScrapOrderPo.COLUMNS.SCRAP_STATUS.name())); 
			scrapOrderPo.setOpType(dataObject.getString(ScrapOrderPo.COLUMNS.OP_TYPE.name())); 
			scrapOrderPo.setPrdtType(dataObject.getString(ScrapOrderPo.COLUMNS.PRDT_TYPE.name())); 
			return scrapOrderPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ScrapOrderPo scrapOrderPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ScrapOrderPo.COLUMNS.BF_NO.name(), scrapOrderPo.getBfNo()); 
			dataObject.setValue(ScrapOrderPo.COLUMNS.SCRAP_NO.name(), scrapOrderPo.getScrapNo()); 
			dataObject.setValue(ScrapOrderPo.COLUMNS.SERIES_NO.name(), scrapOrderPo.getSeriesNo()); 
			dataObject.setValue(ScrapOrderPo.COLUMNS.SCRAP_DATE.name(), scrapOrderPo.getScrapDate()); 
			dataObject.setValue(ScrapOrderPo.COLUMNS.APPLY_DATE.name(), scrapOrderPo.getApplyDate()); 
			dataObject.setValue(ScrapOrderPo.COLUMNS.APPRV_NO.name(), scrapOrderPo.getApprvNo()); 
			dataObject.setValue(ScrapOrderPo.COLUMNS.APPRV_DATE.name(), scrapOrderPo.getApprvDate()); 
			dataObject.setValue(ScrapOrderPo.COLUMNS.SCRAP_PLACE.name(), scrapOrderPo.getScrapPlace()); 
			dataObject.setValue(ScrapOrderPo.COLUMNS.SCRAP_TYPE.name(), scrapOrderPo.getScrapType()); 
			dataObject.setValue(ScrapOrderPo.COLUMNS.SCRAP_STATUS.name(), scrapOrderPo.getScrapStatus()); 
			dataObject.setValue(ScrapOrderPo.COLUMNS.OP_TYPE.name(), scrapOrderPo.getOpType()); 
			dataObject.setValue(ScrapOrderPo.COLUMNS.PRDT_TYPE.name(), scrapOrderPo.getPrdtType()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ScrapOrderPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ScrapOrderPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(ScrapOrderPo.COLUMNS.BF_NO.name(), po.getBfNo()); 
		sqlWhere.add(ScrapOrderPo.COLUMNS.SCRAP_NO.name(), po.getScrapNo()); 
		return sqlWhere; 
	} 
 
} 
