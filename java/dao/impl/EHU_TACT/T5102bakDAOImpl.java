package com.doc.common.dao.impl; 
 
public class T5102bakDAOImpl extends GeneralDAOImpl<T5102bakPo> implements T5102bakDAO { 
	public static final T5102bakDAOImpl INSTANCE = new T5102bakDAOImpl(); 
	public static final String TABLENAME = "T5102BAK"; 

	public T5102bakDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<T5102bakPo> CONVERTER = new MapConverter<T5102bakPo>() { 
 
		@Override 
		public T5102bakPo convert(final DataObject dataObject) { 
			final T5102bakPo t5102bakPo = new T5102bakPo(); 
			t5102bakPo.setControlno(dataObject.getString(T5102bakPo.COLUMNS.CONTROLNO.name())); 
			t5102bakPo.setArrivaldate(dataObject.getString(T5102bakPo.COLUMNS.ARRIVALDATE.name())); 
			t5102bakPo.setFlightno(dataObject.getString(T5102bakPo.COLUMNS.FLIGHTNO.name())); 
			t5102bakPo.setMwb(dataObject.getString(T5102bakPo.COLUMNS.MWB.name())); 
			t5102bakPo.setHwb(dataObject.getString(T5102bakPo.COLUMNS.HWB.name())); 
			t5102bakPo.setTtype(dataObject.getString(T5102bakPo.COLUMNS.TTYPE.name())); 
			t5102bakPo.setPiece(dataObject.getString(T5102bakPo.COLUMNS.PIECE.name())); 
			t5102bakPo.setMainfestpiece(dataObject.getString(T5102bakPo.COLUMNS.MAINFESTPIECE.name())); 
			t5102bakPo.setMainfestweight(dataObject.getString(T5102bakPo.COLUMNS.MAINFESTWEIGHT.name())); 
			t5102bakPo.setLoadingport(dataObject.getString(T5102bakPo.COLUMNS.LOADINGPORT.name())); 
			t5102bakPo.setCopackage(dataObject.getString(T5102bakPo.COLUMNS.COPACKAGE.name())); 
			t5102bakPo.setGcidate(dataObject.getString(T5102bakPo.COLUMNS.GCIDATE.name())); 
			t5102bakPo.setGcitime(dataObject.getString(T5102bakPo.COLUMNS.GCITIME.name())); 
			t5102bakPo.setIrregularityreason(dataObject.getString(T5102bakPo.COLUMNS.IRREGULARITYREASON.name())); 
			t5102bakPo.setWarehouseno(dataObject.getString(T5102bakPo.COLUMNS.WAREHOUSENO.name())); 
			t5102bakPo.setStorage(dataObject.getString(T5102bakPo.COLUMNS.STORAGE.name())); 
			t5102bakPo.setStoragearea(dataObject.getString(T5102bakPo.COLUMNS.STORAGEAREA.name())); 
			t5102bakPo.setIndicator(dataObject.getString(T5102bakPo.COLUMNS.INDICATOR.name())); 
			t5102bakPo.setUnit(dataObject.getString(T5102bakPo.COLUMNS.UNIT.name())); 
			t5102bakPo.setDeparturedate(dataObject.getString(T5102bakPo.COLUMNS.DEPARTUREDATE.name())); 
			t5102bakPo.setSenderid(dataObject.getString(T5102bakPo.COLUMNS.SENDERID.name())); 
			t5102bakPo.setSenderqualifier(dataObject.getString(T5102bakPo.COLUMNS.SENDERQUALIFIER.name())); 
			t5102bakPo.setReceiverid(dataObject.getString(T5102bakPo.COLUMNS.RECEIVERID.name())); 
			t5102bakPo.setReceiverqualifier(dataObject.getString(T5102bakPo.COLUMNS.RECEIVERQUALIFIER.name())); 
			t5102bakPo.setDecltype(dataObject.getString(T5102bakPo.COLUMNS.DECLTYPE.name())); 
			t5102bakPo.setSendstatus(dataObject.getString(T5102bakPo.COLUMNS.SENDSTATUS.name())); 
			return t5102bakPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final T5102bakPo t5102bakPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(T5102bakPo.COLUMNS.CONTROLNO.name(), t5102bakPo.getControlno()); 
			dataObject.setValue(T5102bakPo.COLUMNS.ARRIVALDATE.name(), t5102bakPo.getArrivaldate()); 
			dataObject.setValue(T5102bakPo.COLUMNS.FLIGHTNO.name(), t5102bakPo.getFlightno()); 
			dataObject.setValue(T5102bakPo.COLUMNS.MWB.name(), t5102bakPo.getMwb()); 
			dataObject.setValue(T5102bakPo.COLUMNS.HWB.name(), t5102bakPo.getHwb()); 
			dataObject.setValue(T5102bakPo.COLUMNS.TTYPE.name(), t5102bakPo.getTtype()); 
			dataObject.setValue(T5102bakPo.COLUMNS.PIECE.name(), t5102bakPo.getPiece()); 
			dataObject.setValue(T5102bakPo.COLUMNS.MAINFESTPIECE.name(), t5102bakPo.getMainfestpiece()); 
			dataObject.setValue(T5102bakPo.COLUMNS.MAINFESTWEIGHT.name(), t5102bakPo.getMainfestweight()); 
			dataObject.setValue(T5102bakPo.COLUMNS.LOADINGPORT.name(), t5102bakPo.getLoadingport()); 
			dataObject.setValue(T5102bakPo.COLUMNS.COPACKAGE.name(), t5102bakPo.getCopackage()); 
			dataObject.setValue(T5102bakPo.COLUMNS.GCIDATE.name(), t5102bakPo.getGcidate()); 
			dataObject.setValue(T5102bakPo.COLUMNS.GCITIME.name(), t5102bakPo.getGcitime()); 
			dataObject.setValue(T5102bakPo.COLUMNS.IRREGULARITYREASON.name(), t5102bakPo.getIrregularityreason()); 
			dataObject.setValue(T5102bakPo.COLUMNS.WAREHOUSENO.name(), t5102bakPo.getWarehouseno()); 
			dataObject.setValue(T5102bakPo.COLUMNS.STORAGE.name(), t5102bakPo.getStorage()); 
			dataObject.setValue(T5102bakPo.COLUMNS.STORAGEAREA.name(), t5102bakPo.getStoragearea()); 
			dataObject.setValue(T5102bakPo.COLUMNS.INDICATOR.name(), t5102bakPo.getIndicator()); 
			dataObject.setValue(T5102bakPo.COLUMNS.UNIT.name(), t5102bakPo.getUnit()); 
			dataObject.setValue(T5102bakPo.COLUMNS.DEPARTUREDATE.name(), t5102bakPo.getDeparturedate()); 
			dataObject.setValue(T5102bakPo.COLUMNS.SENDERID.name(), t5102bakPo.getSenderid()); 
			dataObject.setValue(T5102bakPo.COLUMNS.SENDERQUALIFIER.name(), t5102bakPo.getSenderqualifier()); 
			dataObject.setValue(T5102bakPo.COLUMNS.RECEIVERID.name(), t5102bakPo.getReceiverid()); 
			dataObject.setValue(T5102bakPo.COLUMNS.RECEIVERQUALIFIER.name(), t5102bakPo.getReceiverqualifier()); 
			dataObject.setValue(T5102bakPo.COLUMNS.DECLTYPE.name(), t5102bakPo.getDecltype()); 
			dataObject.setValue(T5102bakPo.COLUMNS.SENDSTATUS.name(), t5102bakPo.getSendstatus()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<T5102bakPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(T5102bakPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
