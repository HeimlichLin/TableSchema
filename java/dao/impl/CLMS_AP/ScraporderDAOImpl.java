package com.doc.common.dao.impl; 
 
public class ScraporderDAOImpl extends GeneralDAOImpl<ScraporderPo> implements ScraporderDAO { 
	public static final ScraporderDAOImpl INSTANCE = new ScraporderDAOImpl(); 
	public static final String TABLENAME = "SCRAPORDER"; 

	public ScraporderDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ScraporderPo> CONVERTER = new MapConverter<ScraporderPo>() { 
 
		@Override 
		public ScraporderPo convert(final DataObject dataObject) { 
			final ScraporderPo scraporderPo = new ScraporderPo(); 
			scraporderPo.setBondno(dataObject.getString(ScraporderPo.COLUMNS.BONDNO.name())); 
			scraporderPo.setScrapno(dataObject.getString(ScraporderPo.COLUMNS.SCRAPNO.name())); 
			scraporderPo.setSeriesno(dataObject.getString(ScraporderPo.COLUMNS.SERIESNO.name())); 
			scraporderPo.setScrapdate(TimestampUtils.of(dataObject.getValue(ScraporderPo.COLUMNS.SCRAPDATE.name()))); 
			scraporderPo.setWorkno(dataObject.getString(ScraporderPo.COLUMNS.WORKNO.name())); 
			scraporderPo.setApplydate(TimestampUtils.of(dataObject.getValue(ScraporderPo.COLUMNS.APPLYDATE.name()))); 
			scraporderPo.setApprvno(dataObject.getString(ScraporderPo.COLUMNS.APPRVNO.name())); 
			scraporderPo.setApprvdate(TimestampUtils.of(dataObject.getValue(ScraporderPo.COLUMNS.APPRVDATE.name()))); 
			scraporderPo.setScrapplace(dataObject.getString(ScraporderPo.COLUMNS.SCRAPPLACE.name())); 
			scraporderPo.setScraptype(dataObject.getString(ScraporderPo.COLUMNS.SCRAPTYPE.name())); 
			scraporderPo.setScrapstatus(dataObject.getString(ScraporderPo.COLUMNS.SCRAPSTATUS.name())); 
			scraporderPo.setOptype(dataObject.getString(ScraporderPo.COLUMNS.OPTYPE.name())); 
			scraporderPo.setPrdttype(dataObject.getString(ScraporderPo.COLUMNS.PRDTTYPE.name())); 
			return scraporderPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ScraporderPo scraporderPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ScraporderPo.COLUMNS.BONDNO.name(), scraporderPo.getBondno()); 
			dataObject.setValue(ScraporderPo.COLUMNS.SCRAPNO.name(), scraporderPo.getScrapno()); 
			dataObject.setValue(ScraporderPo.COLUMNS.SERIESNO.name(), scraporderPo.getSeriesno()); 
			dataObject.setValue(ScraporderPo.COLUMNS.SCRAPDATE.name(), scraporderPo.getScrapdate()); 
			dataObject.setValue(ScraporderPo.COLUMNS.WORKNO.name(), scraporderPo.getWorkno()); 
			dataObject.setValue(ScraporderPo.COLUMNS.APPLYDATE.name(), scraporderPo.getApplydate()); 
			dataObject.setValue(ScraporderPo.COLUMNS.APPRVNO.name(), scraporderPo.getApprvno()); 
			dataObject.setValue(ScraporderPo.COLUMNS.APPRVDATE.name(), scraporderPo.getApprvdate()); 
			dataObject.setValue(ScraporderPo.COLUMNS.SCRAPPLACE.name(), scraporderPo.getScrapplace()); 
			dataObject.setValue(ScraporderPo.COLUMNS.SCRAPTYPE.name(), scraporderPo.getScraptype()); 
			dataObject.setValue(ScraporderPo.COLUMNS.SCRAPSTATUS.name(), scraporderPo.getScrapstatus()); 
			dataObject.setValue(ScraporderPo.COLUMNS.OPTYPE.name(), scraporderPo.getOptype()); 
			dataObject.setValue(ScraporderPo.COLUMNS.PRDTTYPE.name(), scraporderPo.getPrdttype()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ScraporderPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ScraporderPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(ScraporderPo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(ScraporderPo.COLUMNS.SCRAPNO.name(), po.getScrapno()); 
		return sqlWhere; 
	} 
 
} 
