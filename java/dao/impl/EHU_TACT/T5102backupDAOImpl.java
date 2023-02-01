package com.doc.common.dao.impl; 
 
public class T5102backupDAOImpl extends GeneralDAOImpl<T5102backupPo> implements T5102backupDAO { 
	public static final T5102backupDAOImpl INSTANCE = new T5102backupDAOImpl(); 
	public static final String TABLENAME = "T5102BACKUP"; 

	public T5102backupDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<T5102backupPo> CONVERTER = new MapConverter<T5102backupPo>() { 
 
		@Override 
		public T5102backupPo convert(final DataObject dataObject) { 
			final T5102backupPo t5102backupPo = new T5102backupPo(); 
			t5102backupPo.setControlno(dataObject.getString(T5102backupPo.COLUMNS.CONTROLNO.name())); 
			t5102backupPo.setArrivaldate(dataObject.getString(T5102backupPo.COLUMNS.ARRIVALDATE.name())); 
			t5102backupPo.setFlightno(dataObject.getString(T5102backupPo.COLUMNS.FLIGHTNO.name())); 
			t5102backupPo.setMwb(dataObject.getString(T5102backupPo.COLUMNS.MWB.name())); 
			t5102backupPo.setHwb(dataObject.getString(T5102backupPo.COLUMNS.HWB.name())); 
			t5102backupPo.setTtype(dataObject.getString(T5102backupPo.COLUMNS.TTYPE.name())); 
			t5102backupPo.setPiece(dataObject.getString(T5102backupPo.COLUMNS.PIECE.name())); 
			t5102backupPo.setMainfestpiece(dataObject.getString(T5102backupPo.COLUMNS.MAINFESTPIECE.name())); 
			t5102backupPo.setMainfestweight(dataObject.getString(T5102backupPo.COLUMNS.MAINFESTWEIGHT.name())); 
			t5102backupPo.setLoadingport(dataObject.getString(T5102backupPo.COLUMNS.LOADINGPORT.name())); 
			t5102backupPo.setCopackage(dataObject.getString(T5102backupPo.COLUMNS.COPACKAGE.name())); 
			t5102backupPo.setGcidate(dataObject.getString(T5102backupPo.COLUMNS.GCIDATE.name())); 
			t5102backupPo.setGcitime(dataObject.getString(T5102backupPo.COLUMNS.GCITIME.name())); 
			t5102backupPo.setIrregularityreason(dataObject.getString(T5102backupPo.COLUMNS.IRREGULARITYREASON.name())); 
			t5102backupPo.setWarehouseno(dataObject.getString(T5102backupPo.COLUMNS.WAREHOUSENO.name())); 
			t5102backupPo.setStorage(dataObject.getString(T5102backupPo.COLUMNS.STORAGE.name())); 
			t5102backupPo.setStoragearea(dataObject.getString(T5102backupPo.COLUMNS.STORAGEAREA.name())); 
			t5102backupPo.setIndicator(dataObject.getString(T5102backupPo.COLUMNS.INDICATOR.name())); 
			t5102backupPo.setUnit(dataObject.getString(T5102backupPo.COLUMNS.UNIT.name())); 
			t5102backupPo.setDeparturedate(dataObject.getString(T5102backupPo.COLUMNS.DEPARTUREDATE.name())); 
			t5102backupPo.setSenderid(dataObject.getString(T5102backupPo.COLUMNS.SENDERID.name())); 
			t5102backupPo.setSenderqualifier(dataObject.getString(T5102backupPo.COLUMNS.SENDERQUALIFIER.name())); 
			t5102backupPo.setReceiverid(dataObject.getString(T5102backupPo.COLUMNS.RECEIVERID.name())); 
			t5102backupPo.setReceiverqualifier(dataObject.getString(T5102backupPo.COLUMNS.RECEIVERQUALIFIER.name())); 
			t5102backupPo.setDecltype(dataObject.getString(T5102backupPo.COLUMNS.DECLTYPE.name())); 
			t5102backupPo.setSendstatus(dataObject.getString(T5102backupPo.COLUMNS.SENDSTATUS.name())); 
			return t5102backupPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final T5102backupPo t5102backupPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(T5102backupPo.COLUMNS.CONTROLNO.name(), t5102backupPo.getControlno()); 
			dataObject.setValue(T5102backupPo.COLUMNS.ARRIVALDATE.name(), t5102backupPo.getArrivaldate()); 
			dataObject.setValue(T5102backupPo.COLUMNS.FLIGHTNO.name(), t5102backupPo.getFlightno()); 
			dataObject.setValue(T5102backupPo.COLUMNS.MWB.name(), t5102backupPo.getMwb()); 
			dataObject.setValue(T5102backupPo.COLUMNS.HWB.name(), t5102backupPo.getHwb()); 
			dataObject.setValue(T5102backupPo.COLUMNS.TTYPE.name(), t5102backupPo.getTtype()); 
			dataObject.setValue(T5102backupPo.COLUMNS.PIECE.name(), t5102backupPo.getPiece()); 
			dataObject.setValue(T5102backupPo.COLUMNS.MAINFESTPIECE.name(), t5102backupPo.getMainfestpiece()); 
			dataObject.setValue(T5102backupPo.COLUMNS.MAINFESTWEIGHT.name(), t5102backupPo.getMainfestweight()); 
			dataObject.setValue(T5102backupPo.COLUMNS.LOADINGPORT.name(), t5102backupPo.getLoadingport()); 
			dataObject.setValue(T5102backupPo.COLUMNS.COPACKAGE.name(), t5102backupPo.getCopackage()); 
			dataObject.setValue(T5102backupPo.COLUMNS.GCIDATE.name(), t5102backupPo.getGcidate()); 
			dataObject.setValue(T5102backupPo.COLUMNS.GCITIME.name(), t5102backupPo.getGcitime()); 
			dataObject.setValue(T5102backupPo.COLUMNS.IRREGULARITYREASON.name(), t5102backupPo.getIrregularityreason()); 
			dataObject.setValue(T5102backupPo.COLUMNS.WAREHOUSENO.name(), t5102backupPo.getWarehouseno()); 
			dataObject.setValue(T5102backupPo.COLUMNS.STORAGE.name(), t5102backupPo.getStorage()); 
			dataObject.setValue(T5102backupPo.COLUMNS.STORAGEAREA.name(), t5102backupPo.getStoragearea()); 
			dataObject.setValue(T5102backupPo.COLUMNS.INDICATOR.name(), t5102backupPo.getIndicator()); 
			dataObject.setValue(T5102backupPo.COLUMNS.UNIT.name(), t5102backupPo.getUnit()); 
			dataObject.setValue(T5102backupPo.COLUMNS.DEPARTUREDATE.name(), t5102backupPo.getDeparturedate()); 
			dataObject.setValue(T5102backupPo.COLUMNS.SENDERID.name(), t5102backupPo.getSenderid()); 
			dataObject.setValue(T5102backupPo.COLUMNS.SENDERQUALIFIER.name(), t5102backupPo.getSenderqualifier()); 
			dataObject.setValue(T5102backupPo.COLUMNS.RECEIVERID.name(), t5102backupPo.getReceiverid()); 
			dataObject.setValue(T5102backupPo.COLUMNS.RECEIVERQUALIFIER.name(), t5102backupPo.getReceiverqualifier()); 
			dataObject.setValue(T5102backupPo.COLUMNS.DECLTYPE.name(), t5102backupPo.getDecltype()); 
			dataObject.setValue(T5102backupPo.COLUMNS.SENDSTATUS.name(), t5102backupPo.getSendstatus()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<T5102backupPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(T5102backupPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
