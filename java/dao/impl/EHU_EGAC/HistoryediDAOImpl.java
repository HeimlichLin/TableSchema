package com.doc.common.dao.impl; 
 
public class HistoryediDAOImpl extends GeneralDAOImpl<HistoryediPo> implements HistoryediDAO { 
	public static final HistoryediDAOImpl INSTANCE = new HistoryediDAOImpl(); 
	public static final String TABLENAME = "HISTORYEDI"; 

	public HistoryediDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<HistoryediPo> CONVERTER = new MapConverter<HistoryediPo>() { 
 
		@Override 
		public HistoryediPo convert(final DataObject dataObject) { 
			final HistoryediPo historyediPo = new HistoryediPo(); 
			historyediPo.setControlno(dataObject.getString(HistoryediPo.COLUMNS.CONTROLNO.name())); 
			historyediPo.setDeclno(dataObject.getString(HistoryediPo.COLUMNS.DECLNO.name())); 
			historyediPo.setMwb(dataObject.getString(HistoryediPo.COLUMNS.MWB.name())); 
			historyediPo.setHwb(dataObject.getString(HistoryediPo.COLUMNS.HWB.name())); 
			historyediPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(HistoryediPo.COLUMNS.PIECE.name()))); 
			historyediPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(HistoryediPo.COLUMNS.WEIGHT.name()))); 
			historyediPo.setReleasedate(dataObject.getString(HistoryediPo.COLUMNS.RELEASEDATE.name())); 
			historyediPo.setReleasetime(dataObject.getString(HistoryediPo.COLUMNS.RELEASETIME.name())); 
			historyediPo.setLastupdate(TimestampUtils.of(dataObject.getValue(HistoryediPo.COLUMNS.LASTUPDATE.name()))); 
			historyediPo.setClearancetype(dataObject.getString(HistoryediPo.COLUMNS.CLEARANCETYPE.name())); 
			historyediPo.setTranstype(dataObject.getString(HistoryediPo.COLUMNS.TRANSTYPE.name())); 
			historyediPo.setMessagetype(dataObject.getString(HistoryediPo.COLUMNS.MESSAGETYPE.name())); 
			historyediPo.setDutyno(dataObject.getString(HistoryediPo.COLUMNS.DUTYNO.name())); 
			historyediPo.setIe(dataObject.getString(HistoryediPo.COLUMNS.IE.name())); 
			historyediPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(HistoryediPo.COLUMNS.GCIWEIGHT.name()))); 
			historyediPo.setDutypayment(dataObject.getString(HistoryediPo.COLUMNS.DUTYPAYMENT.name())); 
			return historyediPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final HistoryediPo historyediPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(HistoryediPo.COLUMNS.CONTROLNO.name(), historyediPo.getControlno()); 
			dataObject.setValue(HistoryediPo.COLUMNS.DECLNO.name(), historyediPo.getDeclno()); 
			dataObject.setValue(HistoryediPo.COLUMNS.MWB.name(), historyediPo.getMwb()); 
			dataObject.setValue(HistoryediPo.COLUMNS.HWB.name(), historyediPo.getHwb()); 
			dataObject.setValue(HistoryediPo.COLUMNS.PIECE.name(), historyediPo.getPiece()); 
			dataObject.setValue(HistoryediPo.COLUMNS.WEIGHT.name(), historyediPo.getWeight()); 
			dataObject.setValue(HistoryediPo.COLUMNS.RELEASEDATE.name(), historyediPo.getReleasedate()); 
			dataObject.setValue(HistoryediPo.COLUMNS.RELEASETIME.name(), historyediPo.getReleasetime()); 
			dataObject.setValue(HistoryediPo.COLUMNS.LASTUPDATE.name(), historyediPo.getLastupdate()); 
			dataObject.setValue(HistoryediPo.COLUMNS.CLEARANCETYPE.name(), historyediPo.getClearancetype()); 
			dataObject.setValue(HistoryediPo.COLUMNS.TRANSTYPE.name(), historyediPo.getTranstype()); 
			dataObject.setValue(HistoryediPo.COLUMNS.MESSAGETYPE.name(), historyediPo.getMessagetype()); 
			dataObject.setValue(HistoryediPo.COLUMNS.DUTYNO.name(), historyediPo.getDutyno()); 
			dataObject.setValue(HistoryediPo.COLUMNS.IE.name(), historyediPo.getIe()); 
			dataObject.setValue(HistoryediPo.COLUMNS.GCIWEIGHT.name(), historyediPo.getGciweight()); 
			dataObject.setValue(HistoryediPo.COLUMNS.DUTYPAYMENT.name(), historyediPo.getDutypayment()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<HistoryediPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(HistoryediPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
