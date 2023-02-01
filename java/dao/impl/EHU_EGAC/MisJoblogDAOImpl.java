package com.doc.common.dao.impl; 
 
public class MisJoblogDAOImpl extends GeneralDAOImpl<MisJoblogPo> implements MisJoblogDAO { 
	public static final MisJoblogDAOImpl INSTANCE = new MisJoblogDAOImpl(); 
	public static final String TABLENAME = "MIS_JOBLOG"; 

	public MisJoblogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<MisJoblogPo> CONVERTER = new MapConverter<MisJoblogPo>() { 
 
		@Override 
		public MisJoblogPo convert(final DataObject dataObject) { 
			final MisJoblogPo misJoblogPo = new MisJoblogPo(); 
			misJoblogPo.setStarttime(TimestampUtils.of(dataObject.getValue(MisJoblogPo.COLUMNS.STARTTIME.name()))); 
			misJoblogPo.setEndtime(TimestampUtils.of(dataObject.getValue(MisJoblogPo.COLUMNS.ENDTIME.name()))); 
			misJoblogPo.setDatabdate(TimestampUtils.of(dataObject.getValue(MisJoblogPo.COLUMNS.DATABDATE.name()))); 
			misJoblogPo.setDataedate(TimestampUtils.of(dataObject.getValue(MisJoblogPo.COLUMNS.DATAEDATE.name()))); 
			misJoblogPo.setImportbagnew(BigDecimalUtils.formObj(dataObject.getValue(MisJoblogPo.COLUMNS.IMPORTBAGNEW.name()))); 
			misJoblogPo.setImportbagupd(BigDecimalUtils.formObj(dataObject.getValue(MisJoblogPo.COLUMNS.IMPORTBAGUPD.name()))); 
			misJoblogPo.setImporthwbnew(BigDecimalUtils.formObj(dataObject.getValue(MisJoblogPo.COLUMNS.IMPORTHWBNEW.name()))); 
			misJoblogPo.setImporthwbupd(BigDecimalUtils.formObj(dataObject.getValue(MisJoblogPo.COLUMNS.IMPORTHWBUPD.name()))); 
			misJoblogPo.setImportitemsnew(BigDecimalUtils.formObj(dataObject.getValue(MisJoblogPo.COLUMNS.IMPORTITEMSNEW.name()))); 
			misJoblogPo.setImportitemsupd(BigDecimalUtils.formObj(dataObject.getValue(MisJoblogPo.COLUMNS.IMPORTITEMSUPD.name()))); 
			misJoblogPo.setExportbagnew(BigDecimalUtils.formObj(dataObject.getValue(MisJoblogPo.COLUMNS.EXPORTBAGNEW.name()))); 
			misJoblogPo.setExportbagupd(BigDecimalUtils.formObj(dataObject.getValue(MisJoblogPo.COLUMNS.EXPORTBAGUPD.name()))); 
			misJoblogPo.setExporthwbnew(BigDecimalUtils.formObj(dataObject.getValue(MisJoblogPo.COLUMNS.EXPORTHWBNEW.name()))); 
			misJoblogPo.setExporthwbupd(BigDecimalUtils.formObj(dataObject.getValue(MisJoblogPo.COLUMNS.EXPORTHWBUPD.name()))); 
			misJoblogPo.setExportitemsnew(BigDecimalUtils.formObj(dataObject.getValue(MisJoblogPo.COLUMNS.EXPORTITEMSNEW.name()))); 
			misJoblogPo.setExportitemsupd(BigDecimalUtils.formObj(dataObject.getValue(MisJoblogPo.COLUMNS.EXPORTITEMSUPD.name()))); 
			misJoblogPo.setDailysumnew(BigDecimalUtils.formObj(dataObject.getValue(MisJoblogPo.COLUMNS.DAILYSUMNEW.name()))); 
			misJoblogPo.setDailysumupd(BigDecimalUtils.formObj(dataObject.getValue(MisJoblogPo.COLUMNS.DAILYSUMUPD.name()))); 
			misJoblogPo.setAirlinenew(BigDecimalUtils.formObj(dataObject.getValue(MisJoblogPo.COLUMNS.AIRLINENEW.name()))); 
			misJoblogPo.setAirlineupd(BigDecimalUtils.formObj(dataObject.getValue(MisJoblogPo.COLUMNS.AIRLINEUPD.name()))); 
			misJoblogPo.setExpressnew(BigDecimalUtils.formObj(dataObject.getValue(MisJoblogPo.COLUMNS.EXPRESSNEW.name()))); 
			misJoblogPo.setExpressupd(BigDecimalUtils.formObj(dataObject.getValue(MisJoblogPo.COLUMNS.EXPRESSUPD.name()))); 
			return misJoblogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final MisJoblogPo misJoblogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(MisJoblogPo.COLUMNS.STARTTIME.name(), misJoblogPo.getStarttime()); 
			dataObject.setValue(MisJoblogPo.COLUMNS.ENDTIME.name(), misJoblogPo.getEndtime()); 
			dataObject.setValue(MisJoblogPo.COLUMNS.DATABDATE.name(), misJoblogPo.getDatabdate()); 
			dataObject.setValue(MisJoblogPo.COLUMNS.DATAEDATE.name(), misJoblogPo.getDataedate()); 
			dataObject.setValue(MisJoblogPo.COLUMNS.IMPORTBAGNEW.name(), misJoblogPo.getImportbagnew()); 
			dataObject.setValue(MisJoblogPo.COLUMNS.IMPORTBAGUPD.name(), misJoblogPo.getImportbagupd()); 
			dataObject.setValue(MisJoblogPo.COLUMNS.IMPORTHWBNEW.name(), misJoblogPo.getImporthwbnew()); 
			dataObject.setValue(MisJoblogPo.COLUMNS.IMPORTHWBUPD.name(), misJoblogPo.getImporthwbupd()); 
			dataObject.setValue(MisJoblogPo.COLUMNS.IMPORTITEMSNEW.name(), misJoblogPo.getImportitemsnew()); 
			dataObject.setValue(MisJoblogPo.COLUMNS.IMPORTITEMSUPD.name(), misJoblogPo.getImportitemsupd()); 
			dataObject.setValue(MisJoblogPo.COLUMNS.EXPORTBAGNEW.name(), misJoblogPo.getExportbagnew()); 
			dataObject.setValue(MisJoblogPo.COLUMNS.EXPORTBAGUPD.name(), misJoblogPo.getExportbagupd()); 
			dataObject.setValue(MisJoblogPo.COLUMNS.EXPORTHWBNEW.name(), misJoblogPo.getExporthwbnew()); 
			dataObject.setValue(MisJoblogPo.COLUMNS.EXPORTHWBUPD.name(), misJoblogPo.getExporthwbupd()); 
			dataObject.setValue(MisJoblogPo.COLUMNS.EXPORTITEMSNEW.name(), misJoblogPo.getExportitemsnew()); 
			dataObject.setValue(MisJoblogPo.COLUMNS.EXPORTITEMSUPD.name(), misJoblogPo.getExportitemsupd()); 
			dataObject.setValue(MisJoblogPo.COLUMNS.DAILYSUMNEW.name(), misJoblogPo.getDailysumnew()); 
			dataObject.setValue(MisJoblogPo.COLUMNS.DAILYSUMUPD.name(), misJoblogPo.getDailysumupd()); 
			dataObject.setValue(MisJoblogPo.COLUMNS.AIRLINENEW.name(), misJoblogPo.getAirlinenew()); 
			dataObject.setValue(MisJoblogPo.COLUMNS.AIRLINEUPD.name(), misJoblogPo.getAirlineupd()); 
			dataObject.setValue(MisJoblogPo.COLUMNS.EXPRESSNEW.name(), misJoblogPo.getExpressnew()); 
			dataObject.setValue(MisJoblogPo.COLUMNS.EXPRESSUPD.name(), misJoblogPo.getExpressupd()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<MisJoblogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(MisJoblogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
