package com.doc.common.dao.impl; 
 
public class DailydiscountHistoryDAOImpl extends GeneralDAOImpl<DailydiscountHistoryPo> implements DailydiscountHistoryDAO { 
	public static final DailydiscountHistoryDAOImpl INSTANCE = new DailydiscountHistoryDAOImpl(); 
	public static final String TABLENAME = "DAILYDISCOUNT_HISTORY"; 

	public DailydiscountHistoryDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DailydiscountHistoryPo> CONVERTER = new MapConverter<DailydiscountHistoryPo>() { 
 
		@Override 
		public DailydiscountHistoryPo convert(final DataObject dataObject) { 
			final DailydiscountHistoryPo dailydiscountHistoryPo = new DailydiscountHistoryPo(); 
			dailydiscountHistoryPo.setChargedate(TimestampUtils.of(dataObject.getValue(DailydiscountHistoryPo.COLUMNS.CHARGEDATE.name()))); 
			dailydiscountHistoryPo.setExpressid(dataObject.getString(DailydiscountHistoryPo.COLUMNS.EXPRESSID.name())); 
			dailydiscountHistoryPo.setChargebox(dataObject.getString(DailydiscountHistoryPo.COLUMNS.CHARGEBOX.name())); 
			dailydiscountHistoryPo.setExporthwb(BigDecimalUtils.formObj(dataObject.getValue(DailydiscountHistoryPo.COLUMNS.EXPORTHWB.name()))); 
			dailydiscountHistoryPo.setExportpiece(BigDecimalUtils.formObj(dataObject.getValue(DailydiscountHistoryPo.COLUMNS.EXPORTPIECE.name()))); 
			dailydiscountHistoryPo.setExportweight(BigDecimalUtils.formObj(dataObject.getValue(DailydiscountHistoryPo.COLUMNS.EXPORTWEIGHT.name()))); 
			dailydiscountHistoryPo.setExportfee(BigDecimalUtils.formObj(dataObject.getValue(DailydiscountHistoryPo.COLUMNS.EXPORTFEE.name()))); 
			dailydiscountHistoryPo.setImporthwb(BigDecimalUtils.formObj(dataObject.getValue(DailydiscountHistoryPo.COLUMNS.IMPORTHWB.name()))); 
			dailydiscountHistoryPo.setImportpiece(BigDecimalUtils.formObj(dataObject.getValue(DailydiscountHistoryPo.COLUMNS.IMPORTPIECE.name()))); 
			dailydiscountHistoryPo.setImportweight(BigDecimalUtils.formObj(dataObject.getValue(DailydiscountHistoryPo.COLUMNS.IMPORTWEIGHT.name()))); 
			dailydiscountHistoryPo.setImportfee(BigDecimalUtils.formObj(dataObject.getValue(DailydiscountHistoryPo.COLUMNS.IMPORTFEE.name()))); 
			dailydiscountHistoryPo.setLastupdate(TimestampUtils.of(dataObject.getValue(DailydiscountHistoryPo.COLUMNS.LASTUPDATE.name()))); 
			return dailydiscountHistoryPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DailydiscountHistoryPo dailydiscountHistoryPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DailydiscountHistoryPo.COLUMNS.CHARGEDATE.name(), dailydiscountHistoryPo.getChargedate()); 
			dataObject.setValue(DailydiscountHistoryPo.COLUMNS.EXPRESSID.name(), dailydiscountHistoryPo.getExpressid()); 
			dataObject.setValue(DailydiscountHistoryPo.COLUMNS.CHARGEBOX.name(), dailydiscountHistoryPo.getChargebox()); 
			dataObject.setValue(DailydiscountHistoryPo.COLUMNS.EXPORTHWB.name(), dailydiscountHistoryPo.getExporthwb()); 
			dataObject.setValue(DailydiscountHistoryPo.COLUMNS.EXPORTPIECE.name(), dailydiscountHistoryPo.getExportpiece()); 
			dataObject.setValue(DailydiscountHistoryPo.COLUMNS.EXPORTWEIGHT.name(), dailydiscountHistoryPo.getExportweight()); 
			dataObject.setValue(DailydiscountHistoryPo.COLUMNS.EXPORTFEE.name(), dailydiscountHistoryPo.getExportfee()); 
			dataObject.setValue(DailydiscountHistoryPo.COLUMNS.IMPORTHWB.name(), dailydiscountHistoryPo.getImporthwb()); 
			dataObject.setValue(DailydiscountHistoryPo.COLUMNS.IMPORTPIECE.name(), dailydiscountHistoryPo.getImportpiece()); 
			dataObject.setValue(DailydiscountHistoryPo.COLUMNS.IMPORTWEIGHT.name(), dailydiscountHistoryPo.getImportweight()); 
			dataObject.setValue(DailydiscountHistoryPo.COLUMNS.IMPORTFEE.name(), dailydiscountHistoryPo.getImportfee()); 
			dataObject.setValue(DailydiscountHistoryPo.COLUMNS.LASTUPDATE.name(), dailydiscountHistoryPo.getLastupdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DailydiscountHistoryPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DailydiscountHistoryPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
