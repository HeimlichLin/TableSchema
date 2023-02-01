package com.doc.common.dao.impl; 
 
public class RptDailysummaryDAOImpl extends GeneralDAOImpl<RptDailysummaryPo> implements RptDailysummaryDAO { 
	public static final RptDailysummaryDAOImpl INSTANCE = new RptDailysummaryDAOImpl(); 
	public static final String TABLENAME = "RPT_DAILYSUMMARY"; 

	public RptDailysummaryDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<RptDailysummaryPo> CONVERTER = new MapConverter<RptDailysummaryPo>() { 
 
		@Override 
		public RptDailysummaryPo convert(final DataObject dataObject) { 
			final RptDailysummaryPo rptDailysummaryPo = new RptDailysummaryPo(); 
			rptDailysummaryPo.setUniqueid(BigDecimalUtils.formObj(dataObject.getValue(RptDailysummaryPo.COLUMNS.UNIQUEID.name()))); 
			rptDailysummaryPo.setTranid(BigDecimalUtils.formObj(dataObject.getValue(RptDailysummaryPo.COLUMNS.TRANID.name()))); 
			rptDailysummaryPo.setAirlinecname(dataObject.getString(RptDailysummaryPo.COLUMNS.AIRLINECNAME.name())); 
			rptDailysummaryPo.setAirlineid(dataObject.getString(RptDailysummaryPo.COLUMNS.AIRLINEID.name())); 
			rptDailysummaryPo.setExpresscname(dataObject.getString(RptDailysummaryPo.COLUMNS.EXPRESSCNAME.name())); 
			rptDailysummaryPo.setChargebox(dataObject.getString(RptDailysummaryPo.COLUMNS.CHARGEBOX.name())); 
			rptDailysummaryPo.setImporthwb(BigDecimalUtils.formObj(dataObject.getValue(RptDailysummaryPo.COLUMNS.IMPORTHWB.name()))); 
			rptDailysummaryPo.setImportpiece(BigDecimalUtils.formObj(dataObject.getValue(RptDailysummaryPo.COLUMNS.IMPORTPIECE.name()))); 
			rptDailysummaryPo.setImportweight(BigDecimalUtils.formObj(dataObject.getValue(RptDailysummaryPo.COLUMNS.IMPORTWEIGHT.name()))); 
			rptDailysummaryPo.setImportfee(BigDecimalUtils.formObj(dataObject.getValue(RptDailysummaryPo.COLUMNS.IMPORTFEE.name()))); 
			rptDailysummaryPo.setExporthwb(BigDecimalUtils.formObj(dataObject.getValue(RptDailysummaryPo.COLUMNS.EXPORTHWB.name()))); 
			rptDailysummaryPo.setExportpiece(BigDecimalUtils.formObj(dataObject.getValue(RptDailysummaryPo.COLUMNS.EXPORTPIECE.name()))); 
			rptDailysummaryPo.setExportweight(BigDecimalUtils.formObj(dataObject.getValue(RptDailysummaryPo.COLUMNS.EXPORTWEIGHT.name()))); 
			rptDailysummaryPo.setExportfee(BigDecimalUtils.formObj(dataObject.getValue(RptDailysummaryPo.COLUMNS.EXPORTFEE.name()))); 
			rptDailysummaryPo.setTotalhwb(BigDecimalUtils.formObj(dataObject.getValue(RptDailysummaryPo.COLUMNS.TOTALHWB.name()))); 
			rptDailysummaryPo.setTotalpiece(BigDecimalUtils.formObj(dataObject.getValue(RptDailysummaryPo.COLUMNS.TOTALPIECE.name()))); 
			rptDailysummaryPo.setTotalweight(BigDecimalUtils.formObj(dataObject.getValue(RptDailysummaryPo.COLUMNS.TOTALWEIGHT.name()))); 
			rptDailysummaryPo.setTotalfee(BigDecimalUtils.formObj(dataObject.getValue(RptDailysummaryPo.COLUMNS.TOTALFEE.name()))); 
			rptDailysummaryPo.setCreatedate(TimestampUtils.of(dataObject.getValue(RptDailysummaryPo.COLUMNS.CREATEDATE.name()))); 
			return rptDailysummaryPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final RptDailysummaryPo rptDailysummaryPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(RptDailysummaryPo.COLUMNS.UNIQUEID.name(), rptDailysummaryPo.getUniqueid()); 
			dataObject.setValue(RptDailysummaryPo.COLUMNS.TRANID.name(), rptDailysummaryPo.getTranid()); 
			dataObject.setValue(RptDailysummaryPo.COLUMNS.AIRLINECNAME.name(), rptDailysummaryPo.getAirlinecname()); 
			dataObject.setValue(RptDailysummaryPo.COLUMNS.AIRLINEID.name(), rptDailysummaryPo.getAirlineid()); 
			dataObject.setValue(RptDailysummaryPo.COLUMNS.EXPRESSCNAME.name(), rptDailysummaryPo.getExpresscname()); 
			dataObject.setValue(RptDailysummaryPo.COLUMNS.CHARGEBOX.name(), rptDailysummaryPo.getChargebox()); 
			dataObject.setValue(RptDailysummaryPo.COLUMNS.IMPORTHWB.name(), rptDailysummaryPo.getImporthwb()); 
			dataObject.setValue(RptDailysummaryPo.COLUMNS.IMPORTPIECE.name(), rptDailysummaryPo.getImportpiece()); 
			dataObject.setValue(RptDailysummaryPo.COLUMNS.IMPORTWEIGHT.name(), rptDailysummaryPo.getImportweight()); 
			dataObject.setValue(RptDailysummaryPo.COLUMNS.IMPORTFEE.name(), rptDailysummaryPo.getImportfee()); 
			dataObject.setValue(RptDailysummaryPo.COLUMNS.EXPORTHWB.name(), rptDailysummaryPo.getExporthwb()); 
			dataObject.setValue(RptDailysummaryPo.COLUMNS.EXPORTPIECE.name(), rptDailysummaryPo.getExportpiece()); 
			dataObject.setValue(RptDailysummaryPo.COLUMNS.EXPORTWEIGHT.name(), rptDailysummaryPo.getExportweight()); 
			dataObject.setValue(RptDailysummaryPo.COLUMNS.EXPORTFEE.name(), rptDailysummaryPo.getExportfee()); 
			dataObject.setValue(RptDailysummaryPo.COLUMNS.TOTALHWB.name(), rptDailysummaryPo.getTotalhwb()); 
			dataObject.setValue(RptDailysummaryPo.COLUMNS.TOTALPIECE.name(), rptDailysummaryPo.getTotalpiece()); 
			dataObject.setValue(RptDailysummaryPo.COLUMNS.TOTALWEIGHT.name(), rptDailysummaryPo.getTotalweight()); 
			dataObject.setValue(RptDailysummaryPo.COLUMNS.TOTALFEE.name(), rptDailysummaryPo.getTotalfee()); 
			dataObject.setValue(RptDailysummaryPo.COLUMNS.CREATEDATE.name(), rptDailysummaryPo.getCreatedate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<RptDailysummaryPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(RptDailysummaryPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
