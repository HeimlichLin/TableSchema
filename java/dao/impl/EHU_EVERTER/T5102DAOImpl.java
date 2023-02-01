package com.doc.common.dao.impl; 
 
public class T5102DAOImpl extends GeneralDAOImpl<T5102Po> implements T5102DAO { 
	public static final T5102DAOImpl INSTANCE = new T5102DAOImpl(); 
	public static final String TABLENAME = "T5102"; 

	public T5102DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<T5102Po> CONVERTER = new MapConverter<T5102Po>() { 
 
		@Override 
		public T5102Po convert(final DataObject dataObject) { 
			final T5102Po t5102Po = new T5102Po(); 
			t5102Po.setControlno(dataObject.getString(T5102Po.COLUMNS.CONTROLNO.name())); 
			t5102Po.setArrivaldate(dataObject.getString(T5102Po.COLUMNS.ARRIVALDATE.name())); 
			t5102Po.setFlightno(dataObject.getString(T5102Po.COLUMNS.FLIGHTNO.name())); 
			t5102Po.setMwb(dataObject.getString(T5102Po.COLUMNS.MWB.name())); 
			t5102Po.setHwb(dataObject.getString(T5102Po.COLUMNS.HWB.name())); 
			t5102Po.setTtype(dataObject.getString(T5102Po.COLUMNS.TTYPE.name())); 
			t5102Po.setPiece(dataObject.getString(T5102Po.COLUMNS.PIECE.name())); 
			t5102Po.setMainfestpiece(dataObject.getString(T5102Po.COLUMNS.MAINFESTPIECE.name())); 
			t5102Po.setMainfestweight(dataObject.getString(T5102Po.COLUMNS.MAINFESTWEIGHT.name())); 
			t5102Po.setLoadingport(dataObject.getString(T5102Po.COLUMNS.LOADINGPORT.name())); 
			t5102Po.setCopackage(dataObject.getString(T5102Po.COLUMNS.COPACKAGE.name())); 
			t5102Po.setGcidate(dataObject.getString(T5102Po.COLUMNS.GCIDATE.name())); 
			t5102Po.setGcitime(dataObject.getString(T5102Po.COLUMNS.GCITIME.name())); 
			t5102Po.setIrregularityreason(dataObject.getString(T5102Po.COLUMNS.IRREGULARITYREASON.name())); 
			t5102Po.setWarehouseno(dataObject.getString(T5102Po.COLUMNS.WAREHOUSENO.name())); 
			t5102Po.setStorage(dataObject.getString(T5102Po.COLUMNS.STORAGE.name())); 
			t5102Po.setStoragearea(dataObject.getString(T5102Po.COLUMNS.STORAGEAREA.name())); 
			t5102Po.setIndicator(dataObject.getString(T5102Po.COLUMNS.INDICATOR.name())); 
			t5102Po.setUnit(dataObject.getString(T5102Po.COLUMNS.UNIT.name())); 
			t5102Po.setDeparturedate(dataObject.getString(T5102Po.COLUMNS.DEPARTUREDATE.name())); 
			t5102Po.setSenderid(dataObject.getString(T5102Po.COLUMNS.SENDERID.name())); 
			t5102Po.setSenderqualifier(dataObject.getString(T5102Po.COLUMNS.SENDERQUALIFIER.name())); 
			t5102Po.setReceiverid(dataObject.getString(T5102Po.COLUMNS.RECEIVERID.name())); 
			t5102Po.setReceiverqualifier(dataObject.getString(T5102Po.COLUMNS.RECEIVERQUALIFIER.name())); 
			t5102Po.setDecltype(dataObject.getString(T5102Po.COLUMNS.DECLTYPE.name())); 
			t5102Po.setVehiclecode(dataObject.getString(T5102Po.COLUMNS.VEHICLECODE.name())); 
			t5102Po.setSendstatus(dataObject.getString(T5102Po.COLUMNS.SENDSTATUS.name())); 
			return t5102Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final T5102Po t5102Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(T5102Po.COLUMNS.CONTROLNO.name(), t5102Po.getControlno()); 
			dataObject.setValue(T5102Po.COLUMNS.ARRIVALDATE.name(), t5102Po.getArrivaldate()); 
			dataObject.setValue(T5102Po.COLUMNS.FLIGHTNO.name(), t5102Po.getFlightno()); 
			dataObject.setValue(T5102Po.COLUMNS.MWB.name(), t5102Po.getMwb()); 
			dataObject.setValue(T5102Po.COLUMNS.HWB.name(), t5102Po.getHwb()); 
			dataObject.setValue(T5102Po.COLUMNS.TTYPE.name(), t5102Po.getTtype()); 
			dataObject.setValue(T5102Po.COLUMNS.PIECE.name(), t5102Po.getPiece()); 
			dataObject.setValue(T5102Po.COLUMNS.MAINFESTPIECE.name(), t5102Po.getMainfestpiece()); 
			dataObject.setValue(T5102Po.COLUMNS.MAINFESTWEIGHT.name(), t5102Po.getMainfestweight()); 
			dataObject.setValue(T5102Po.COLUMNS.LOADINGPORT.name(), t5102Po.getLoadingport()); 
			dataObject.setValue(T5102Po.COLUMNS.COPACKAGE.name(), t5102Po.getCopackage()); 
			dataObject.setValue(T5102Po.COLUMNS.GCIDATE.name(), t5102Po.getGcidate()); 
			dataObject.setValue(T5102Po.COLUMNS.GCITIME.name(), t5102Po.getGcitime()); 
			dataObject.setValue(T5102Po.COLUMNS.IRREGULARITYREASON.name(), t5102Po.getIrregularityreason()); 
			dataObject.setValue(T5102Po.COLUMNS.WAREHOUSENO.name(), t5102Po.getWarehouseno()); 
			dataObject.setValue(T5102Po.COLUMNS.STORAGE.name(), t5102Po.getStorage()); 
			dataObject.setValue(T5102Po.COLUMNS.STORAGEAREA.name(), t5102Po.getStoragearea()); 
			dataObject.setValue(T5102Po.COLUMNS.INDICATOR.name(), t5102Po.getIndicator()); 
			dataObject.setValue(T5102Po.COLUMNS.UNIT.name(), t5102Po.getUnit()); 
			dataObject.setValue(T5102Po.COLUMNS.DEPARTUREDATE.name(), t5102Po.getDeparturedate()); 
			dataObject.setValue(T5102Po.COLUMNS.SENDERID.name(), t5102Po.getSenderid()); 
			dataObject.setValue(T5102Po.COLUMNS.SENDERQUALIFIER.name(), t5102Po.getSenderqualifier()); 
			dataObject.setValue(T5102Po.COLUMNS.RECEIVERID.name(), t5102Po.getReceiverid()); 
			dataObject.setValue(T5102Po.COLUMNS.RECEIVERQUALIFIER.name(), t5102Po.getReceiverqualifier()); 
			dataObject.setValue(T5102Po.COLUMNS.DECLTYPE.name(), t5102Po.getDecltype()); 
			dataObject.setValue(T5102Po.COLUMNS.VEHICLECODE.name(), t5102Po.getVehiclecode()); 
			dataObject.setValue(T5102Po.COLUMNS.SENDSTATUS.name(), t5102Po.getSendstatus()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<T5102Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(T5102Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
