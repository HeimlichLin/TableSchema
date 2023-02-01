package com.doc.common.dao.impl; 
 
public class HistorychargeDAOImpl extends GeneralDAOImpl<HistorychargePo> implements HistorychargeDAO { 
	public static final HistorychargeDAOImpl INSTANCE = new HistorychargeDAOImpl(); 
	public static final String TABLENAME = "HISTORYCHARGE"; 

	public HistorychargeDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<HistorychargePo> CONVERTER = new MapConverter<HistorychargePo>() { 
 
		@Override 
		public HistorychargePo convert(final DataObject dataObject) { 
			final HistorychargePo historychargePo = new HistorychargePo(); 
			historychargePo.setBagno(dataObject.getString(HistorychargePo.COLUMNS.BAGNO.name())); 
			historychargePo.setDeclno(dataObject.getString(HistorychargePo.COLUMNS.DECLNO.name())); 
			historychargePo.setMwb(dataObject.getString(HistorychargePo.COLUMNS.MWB.name())); 
			historychargePo.setHwb(dataObject.getString(HistorychargePo.COLUMNS.HWB.name())); 
			historychargePo.setPrevpiece(BigDecimalUtils.formObj(dataObject.getValue(HistorychargePo.COLUMNS.PREVPIECE.name()))); 
			historychargePo.setPrevfee(BigDecimalUtils.formObj(dataObject.getValue(HistorychargePo.COLUMNS.PREVFEE.name()))); 
			historychargePo.setPrevweight(BigDecimalUtils.formObj(dataObject.getValue(HistorychargePo.COLUMNS.PREVWEIGHT.name()))); 
			historychargePo.setDiffpiece(BigDecimalUtils.formObj(dataObject.getValue(HistorychargePo.COLUMNS.DIFFPIECE.name()))); 
			historychargePo.setDifffee(BigDecimalUtils.formObj(dataObject.getValue(HistorychargePo.COLUMNS.DIFFFEE.name()))); 
			historychargePo.setDiffweight(BigDecimalUtils.formObj(dataObject.getValue(HistorychargePo.COLUMNS.DIFFWEIGHT.name()))); 
			historychargePo.setExpressid(dataObject.getString(HistorychargePo.COLUMNS.EXPRESSID.name())); 
			historychargePo.setWarehouse(dataObject.getString(HistorychargePo.COLUMNS.WAREHOUSE.name())); 
			historychargePo.setChargedate(TimestampUtils.of(dataObject.getValue(HistorychargePo.COLUMNS.CHARGEDATE.name()))); 
			historychargePo.setExtrafee(BigDecimalUtils.formObj(dataObject.getValue(HistorychargePo.COLUMNS.EXTRAFEE.name()))); 
			historychargePo.setExtrafeemark(dataObject.getString(HistorychargePo.COLUMNS.EXTRAFEEMARK.name())); 
			historychargePo.setCreatedate(TimestampUtils.of(dataObject.getValue(HistorychargePo.COLUMNS.CREATEDATE.name()))); 
			historychargePo.setLastchargedate(TimestampUtils.of(dataObject.getValue(HistorychargePo.COLUMNS.LASTCHARGEDATE.name()))); 
			historychargePo.setIe(dataObject.getString(HistorychargePo.COLUMNS.IE.name())); 
			historychargePo.setWorkarea(dataObject.getString(HistorychargePo.COLUMNS.WORKAREA.name())); 
			return historychargePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final HistorychargePo historychargePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(HistorychargePo.COLUMNS.BAGNO.name(), historychargePo.getBagno()); 
			dataObject.setValue(HistorychargePo.COLUMNS.DECLNO.name(), historychargePo.getDeclno()); 
			dataObject.setValue(HistorychargePo.COLUMNS.MWB.name(), historychargePo.getMwb()); 
			dataObject.setValue(HistorychargePo.COLUMNS.HWB.name(), historychargePo.getHwb()); 
			dataObject.setValue(HistorychargePo.COLUMNS.PREVPIECE.name(), historychargePo.getPrevpiece()); 
			dataObject.setValue(HistorychargePo.COLUMNS.PREVFEE.name(), historychargePo.getPrevfee()); 
			dataObject.setValue(HistorychargePo.COLUMNS.PREVWEIGHT.name(), historychargePo.getPrevweight()); 
			dataObject.setValue(HistorychargePo.COLUMNS.DIFFPIECE.name(), historychargePo.getDiffpiece()); 
			dataObject.setValue(HistorychargePo.COLUMNS.DIFFFEE.name(), historychargePo.getDifffee()); 
			dataObject.setValue(HistorychargePo.COLUMNS.DIFFWEIGHT.name(), historychargePo.getDiffweight()); 
			dataObject.setValue(HistorychargePo.COLUMNS.EXPRESSID.name(), historychargePo.getExpressid()); 
			dataObject.setValue(HistorychargePo.COLUMNS.WAREHOUSE.name(), historychargePo.getWarehouse()); 
			dataObject.setValue(HistorychargePo.COLUMNS.CHARGEDATE.name(), historychargePo.getChargedate()); 
			dataObject.setValue(HistorychargePo.COLUMNS.EXTRAFEE.name(), historychargePo.getExtrafee()); 
			dataObject.setValue(HistorychargePo.COLUMNS.EXTRAFEEMARK.name(), historychargePo.getExtrafeemark()); 
			dataObject.setValue(HistorychargePo.COLUMNS.CREATEDATE.name(), historychargePo.getCreatedate()); 
			dataObject.setValue(HistorychargePo.COLUMNS.LASTCHARGEDATE.name(), historychargePo.getLastchargedate()); 
			dataObject.setValue(HistorychargePo.COLUMNS.IE.name(), historychargePo.getIe()); 
			dataObject.setValue(HistorychargePo.COLUMNS.WORKAREA.name(), historychargePo.getWorkarea()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<HistorychargePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(HistorychargePo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
