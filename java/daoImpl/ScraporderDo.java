package com.doc.common.dao.impl; 
 
public class ScraporderDAO extends GeneralDAOImpl<ScraporderDo> implements ScraporderDAO { 
	public static final ScraporderDAOImpl INSTANCE = new ScraporderDAOImpl(); 
	public static final String TABLENAME = "SCRAPORDER"; 

	public ScraporderDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<ScraporderDo> CONVERTER = new MapConverter<ScraporderDo>() { 
 
		@Override 
		public ScraporderDo convert(final DataObject dataObject) { 
			final ScraporderDo scraporderDo = new ScraporderDo(); 
			scraporderDo.setBondno(dataObject.getString(ScraporderDo.COLUMNS.BONDNO.name())); 
			scraporderDo.setScrapno(dataObject.getString(ScraporderDo.COLUMNS.SCRAPNO.name())); 
			scraporderDo.setSeriesno(dataObject.getString(ScraporderDo.COLUMNS.SERIESNO.name())); 
			scraporderDo.setScrapdate(CommUtils.objConver2Time(dataObject.getString(ScraporderDo.COLUMNS.SCRAPDATE.name()))); 
			scraporderDo.setWorkno(dataObject.getString(ScraporderDo.COLUMNS.WORKNO.name())); 
			scraporderDo.setApplydate(CommUtils.objConver2Time(dataObject.getString(ScraporderDo.COLUMNS.APPLYDATE.name()))); 
			scraporderDo.setApprvno(dataObject.getString(ScraporderDo.COLUMNS.APPRVNO.name())); 
			scraporderDo.setApprvdate(CommUtils.objConver2Time(dataObject.getString(ScraporderDo.COLUMNS.APPRVDATE.name()))); 
			scraporderDo.setScrapplace(dataObject.getString(ScraporderDo.COLUMNS.SCRAPPLACE.name())); 
			scraporderDo.setScraptype(dataObject.getString(ScraporderDo.COLUMNS.SCRAPTYPE.name())); 
			scraporderDo.setScrapstatus(dataObject.getString(ScraporderDo.COLUMNS.SCRAPSTATUS.name())); 
			scraporderDo.setOptype(dataObject.getString(ScraporderDo.COLUMNS.OPTYPE.name())); 
			scraporderDo.setPrdttype(dataObject.getString(ScraporderDo.COLUMNS.PRDTTYPE.name())); 
			return scraporderDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ScraporderDo scraporderDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ScraporderDo.COLUMNS.BONDNO.name(), scraporderDo.getBondno()); 
			dataObject.setValue(ScraporderDo.COLUMNS.SCRAPNO.name(), scraporderDo.getScrapno()); 
			dataObject.setValue(ScraporderDo.COLUMNS.SERIESNO.name(), scraporderDo.getSeriesno()); 
			dataObject.setValue(ScraporderDo.COLUMNS.SCRAPDATE.name(), scraporderDo.getScrapdate()); 
			dataObject.setValue(ScraporderDo.COLUMNS.WORKNO.name(), scraporderDo.getWorkno()); 
			dataObject.setValue(ScraporderDo.COLUMNS.APPLYDATE.name(), scraporderDo.getApplydate()); 
			dataObject.setValue(ScraporderDo.COLUMNS.APPRVNO.name(), scraporderDo.getApprvno()); 
			dataObject.setValue(ScraporderDo.COLUMNS.APPRVDATE.name(), scraporderDo.getApprvdate()); 
			dataObject.setValue(ScraporderDo.COLUMNS.SCRAPPLACE.name(), scraporderDo.getScrapplace()); 
			dataObject.setValue(ScraporderDo.COLUMNS.SCRAPTYPE.name(), scraporderDo.getScraptype()); 
			dataObject.setValue(ScraporderDo.COLUMNS.SCRAPSTATUS.name(), scraporderDo.getScrapstatus()); 
			dataObject.setValue(ScraporderDo.COLUMNS.OPTYPE.name(), scraporderDo.getOptype()); 
			dataObject.setValue(ScraporderDo.COLUMNS.PRDTTYPE.name(), scraporderDo.getPrdttype()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ScraporderDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ScraporderDo po) { 
		sqlWhere.add(ScraporderDo.COLUMNS.SERIESNO.name(), po.getSeriesno()); 
		sqlWhere.add(ScraporderDo.COLUMNS.SCRAPDATE.name(), po.getScrapdate()); 
		sqlWhere.add(ScraporderDo.COLUMNS.WORKNO.name(), po.getWorkno()); 
		sqlWhere.add(ScraporderDo.COLUMNS.APPLYDATE.name(), po.getApplydate()); 
		sqlWhere.add(ScraporderDo.COLUMNS.APPRVNO.name(), po.getApprvno()); 
		sqlWhere.add(ScraporderDo.COLUMNS.APPRVDATE.name(), po.getApprvdate()); 
		sqlWhere.add(ScraporderDo.COLUMNS.SCRAPPLACE.name(), po.getScrapplace()); 
		sqlWhere.add(ScraporderDo.COLUMNS.SCRAPTYPE.name(), po.getScraptype()); 
		sqlWhere.add(ScraporderDo.COLUMNS.SCRAPSTATUS.name(), po.getScrapstatus()); 
		sqlWhere.add(ScraporderDo.COLUMNS.OPTYPE.name(), po.getOptype()); 
		sqlWhere.add(ScraporderDo.COLUMNS.PRDTTYPE.name(), po.getPrdttype()); 
	} 
 
} 
