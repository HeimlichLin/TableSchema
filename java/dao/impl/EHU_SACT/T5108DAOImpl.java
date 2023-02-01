package com.doc.common.dao.impl; 
 
public class T5108DAOImpl extends GeneralDAOImpl<T5108Po> implements T5108DAO { 
	public static final T5108DAOImpl INSTANCE = new T5108DAOImpl(); 
	public static final String TABLENAME = "T5108"; 

	public T5108DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<T5108Po> CONVERTER = new MapConverter<T5108Po>() { 
 
		@Override 
		public T5108Po convert(final DataObject dataObject) { 
			final T5108Po t5108Po = new T5108Po(); 
			t5108Po.setControlno(dataObject.getString(T5108Po.COLUMNS.CONTROLNO.name())); 
			t5108Po.setWdate(dataObject.getString(T5108Po.COLUMNS.WDATE.name())); 
			t5108Po.setWtime(dataObject.getString(T5108Po.COLUMNS.WTIME.name())); 
			t5108Po.setIndicator(dataObject.getString(T5108Po.COLUMNS.INDICATOR.name())); 
			t5108Po.setMwb(dataObject.getString(T5108Po.COLUMNS.MWB.name())); 
			t5108Po.setHwb(dataObject.getString(T5108Po.COLUMNS.HWB.name())); 
			t5108Po.setFlightno(dataObject.getString(T5108Po.COLUMNS.FLIGHTNO.name())); 
			t5108Po.setArrivaldate(dataObject.getString(T5108Po.COLUMNS.ARRIVALDATE.name())); 
			t5108Po.setCustomsoffice(dataObject.getString(T5108Po.COLUMNS.CUSTOMSOFFICE.name())); 
			t5108Po.setErrorcode1(dataObject.getString(T5108Po.COLUMNS.ERRORCODE1.name())); 
			t5108Po.setErrorcode2(dataObject.getString(T5108Po.COLUMNS.ERRORCODE2.name())); 
			t5108Po.setErrorcode3(dataObject.getString(T5108Po.COLUMNS.ERRORCODE3.name())); 
			t5108Po.setErrorcode4(dataObject.getString(T5108Po.COLUMNS.ERRORCODE4.name())); 
			t5108Po.setErrorcode5(dataObject.getString(T5108Po.COLUMNS.ERRORCODE5.name())); 
			t5108Po.setSenderid(dataObject.getString(T5108Po.COLUMNS.SENDERID.name())); 
			t5108Po.setSenderqualifier(dataObject.getString(T5108Po.COLUMNS.SENDERQUALIFIER.name())); 
			t5108Po.setReceiverid(dataObject.getString(T5108Po.COLUMNS.RECEIVERID.name())); 
			t5108Po.setReceiverqualifier(dataObject.getString(T5108Po.COLUMNS.RECEIVERQUALIFIER.name())); 
			t5108Po.setErrorcode6(dataObject.getString(T5108Po.COLUMNS.ERRORCODE6.name())); 
			t5108Po.setErrorcode7(dataObject.getString(T5108Po.COLUMNS.ERRORCODE7.name())); 
			t5108Po.setErrorcode8(dataObject.getString(T5108Po.COLUMNS.ERRORCODE8.name())); 
			t5108Po.setErrorcode9(dataObject.getString(T5108Po.COLUMNS.ERRORCODE9.name())); 
			t5108Po.setOrgmsgtype(dataObject.getString(T5108Po.COLUMNS.ORGMSGTYPE.name())); 
			t5108Po.setOrgmsgsendercode(dataObject.getString(T5108Po.COLUMNS.ORGMSGSENDERCODE.name())); 
			t5108Po.setOrgmsgid(dataObject.getString(T5108Po.COLUMNS.ORGMSGID.name())); 
			t5108Po.setResponsecode(dataObject.getString(T5108Po.COLUMNS.RESPONSECODE.name())); 
			t5108Po.setVehiclecode(dataObject.getString(T5108Po.COLUMNS.VEHICLECODE.name())); 
			return t5108Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final T5108Po t5108Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(T5108Po.COLUMNS.CONTROLNO.name(), t5108Po.getControlno()); 
			dataObject.setValue(T5108Po.COLUMNS.WDATE.name(), t5108Po.getWdate()); 
			dataObject.setValue(T5108Po.COLUMNS.WTIME.name(), t5108Po.getWtime()); 
			dataObject.setValue(T5108Po.COLUMNS.INDICATOR.name(), t5108Po.getIndicator()); 
			dataObject.setValue(T5108Po.COLUMNS.MWB.name(), t5108Po.getMwb()); 
			dataObject.setValue(T5108Po.COLUMNS.HWB.name(), t5108Po.getHwb()); 
			dataObject.setValue(T5108Po.COLUMNS.FLIGHTNO.name(), t5108Po.getFlightno()); 
			dataObject.setValue(T5108Po.COLUMNS.ARRIVALDATE.name(), t5108Po.getArrivaldate()); 
			dataObject.setValue(T5108Po.COLUMNS.CUSTOMSOFFICE.name(), t5108Po.getCustomsoffice()); 
			dataObject.setValue(T5108Po.COLUMNS.ERRORCODE1.name(), t5108Po.getErrorcode1()); 
			dataObject.setValue(T5108Po.COLUMNS.ERRORCODE2.name(), t5108Po.getErrorcode2()); 
			dataObject.setValue(T5108Po.COLUMNS.ERRORCODE3.name(), t5108Po.getErrorcode3()); 
			dataObject.setValue(T5108Po.COLUMNS.ERRORCODE4.name(), t5108Po.getErrorcode4()); 
			dataObject.setValue(T5108Po.COLUMNS.ERRORCODE5.name(), t5108Po.getErrorcode5()); 
			dataObject.setValue(T5108Po.COLUMNS.SENDERID.name(), t5108Po.getSenderid()); 
			dataObject.setValue(T5108Po.COLUMNS.SENDERQUALIFIER.name(), t5108Po.getSenderqualifier()); 
			dataObject.setValue(T5108Po.COLUMNS.RECEIVERID.name(), t5108Po.getReceiverid()); 
			dataObject.setValue(T5108Po.COLUMNS.RECEIVERQUALIFIER.name(), t5108Po.getReceiverqualifier()); 
			dataObject.setValue(T5108Po.COLUMNS.ERRORCODE6.name(), t5108Po.getErrorcode6()); 
			dataObject.setValue(T5108Po.COLUMNS.ERRORCODE7.name(), t5108Po.getErrorcode7()); 
			dataObject.setValue(T5108Po.COLUMNS.ERRORCODE8.name(), t5108Po.getErrorcode8()); 
			dataObject.setValue(T5108Po.COLUMNS.ERRORCODE9.name(), t5108Po.getErrorcode9()); 
			dataObject.setValue(T5108Po.COLUMNS.ORGMSGTYPE.name(), t5108Po.getOrgmsgtype()); 
			dataObject.setValue(T5108Po.COLUMNS.ORGMSGSENDERCODE.name(), t5108Po.getOrgmsgsendercode()); 
			dataObject.setValue(T5108Po.COLUMNS.ORGMSGID.name(), t5108Po.getOrgmsgid()); 
			dataObject.setValue(T5108Po.COLUMNS.RESPONSECODE.name(), t5108Po.getResponsecode()); 
			dataObject.setValue(T5108Po.COLUMNS.VEHICLECODE.name(), t5108Po.getVehiclecode()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<T5108Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(T5108Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
