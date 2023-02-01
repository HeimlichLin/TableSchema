package com.doc.common.dao.impl; 
 
public class T5110mTest980105DAOImpl extends GeneralDAOImpl<T5110mTest980105Po> implements T5110mTest980105DAO { 
	public static final T5110mTest980105DAOImpl INSTANCE = new T5110mTest980105DAOImpl(); 
	public static final String TABLENAME = "T5110M_TEST980105"; 

	public T5110mTest980105DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<T5110mTest980105Po> CONVERTER = new MapConverter<T5110mTest980105Po>() { 
 
		@Override 
		public T5110mTest980105Po convert(final DataObject dataObject) { 
			final T5110mTest980105Po t5110mTest980105Po = new T5110mTest980105Po(); 
			t5110mTest980105Po.setControlno(dataObject.getString(T5110mTest980105Po.COLUMNS.CONTROLNO.name())); 
			t5110mTest980105Po.setWdate(dataObject.getString(T5110mTest980105Po.COLUMNS.WDATE.name())); 
			t5110mTest980105Po.setWtime(dataObject.getString(T5110mTest980105Po.COLUMNS.WTIME.name())); 
			t5110mTest980105Po.setDutyno(dataObject.getString(T5110mTest980105Po.COLUMNS.DUTYNO.name())); 
			t5110mTest980105Po.setDutypayerban(dataObject.getString(T5110mTest980105Po.COLUMNS.DUTYPAYERBAN.name())); 
			t5110mTest980105Po.setBoxno(dataObject.getString(T5110mTest980105Po.COLUMNS.BOXNO.name())); 
			t5110mTest980105Po.setDutydeadline(dataObject.getString(T5110mTest980105Po.COLUMNS.DUTYDEADLINE.name())); 
			t5110mTest980105Po.setFlightno(dataObject.getString(T5110mTest980105Po.COLUMNS.FLIGHTNO.name())); 
			t5110mTest980105Po.setShipno(dataObject.getString(T5110mTest980105Po.COLUMNS.SHIPNO.name())); 
			t5110mTest980105Po.setDeclno(dataObject.getString(T5110mTest980105Po.COLUMNS.DECLNO.name())); 
			t5110mTest980105Po.setDutypayment(dataObject.getString(T5110mTest980105Po.COLUMNS.DUTYPAYMENT.name())); 
			t5110mTest980105Po.setMwb(dataObject.getString(T5110mTest980105Po.COLUMNS.MWB.name())); 
			t5110mTest980105Po.setHwb(dataObject.getString(T5110mTest980105Po.COLUMNS.HWB.name())); 
			t5110mTest980105Po.setIssuereason(dataObject.getString(T5110mTest980105Po.COLUMNS.ISSUEREASON.name())); 
			t5110mTest980105Po.setImportationdate(dataObject.getString(T5110mTest980105Po.COLUMNS.IMPORTATIONDATE.name())); 
			t5110mTest980105Po.setExportdecldate(dataObject.getString(T5110mTest980105Po.COLUMNS.EXPORTDECLDATE.name())); 
			t5110mTest980105Po.setPiece(BigDecimalUtils.formObj(dataObject.getValue(T5110mTest980105Po.COLUMNS.PIECE.name()))); 
			t5110mTest980105Po.setUnit(dataObject.getString(T5110mTest980105Po.COLUMNS.UNIT.name())); 
			t5110mTest980105Po.setCcccode(dataObject.getString(T5110mTest980105Po.COLUMNS.CCCCODE.name())); 
			t5110mTest980105Po.setFobvalue(dataObject.getString(T5110mTest980105Po.COLUMNS.FOBVALUE.name())); 
			t5110mTest980105Po.setDutybasis(dataObject.getString(T5110mTest980105Po.COLUMNS.DUTYBASIS.name())); 
			t5110mTest980105Po.setExaminationnote(dataObject.getString(T5110mTest980105Po.COLUMNS.EXAMINATIONNOTE.name())); 
			t5110mTest980105Po.setCustomsactno(dataObject.getString(T5110mTest980105Po.COLUMNS.CUSTOMSACTNO.name())); 
			t5110mTest980105Po.setDutypayername(dataObject.getString(T5110mTest980105Po.COLUMNS.DUTYPAYERNAME.name())); 
			t5110mTest980105Po.setSenderid(dataObject.getString(T5110mTest980105Po.COLUMNS.SENDERID.name())); 
			t5110mTest980105Po.setSenderqualifier(dataObject.getString(T5110mTest980105Po.COLUMNS.SENDERQUALIFIER.name())); 
			t5110mTest980105Po.setReceiverid(dataObject.getString(T5110mTest980105Po.COLUMNS.RECEIVERID.name())); 
			t5110mTest980105Po.setReceiverqualifier(dataObject.getString(T5110mTest980105Po.COLUMNS.RECEIVERQUALIFIER.name())); 
			return t5110mTest980105Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final T5110mTest980105Po t5110mTest980105Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(T5110mTest980105Po.COLUMNS.CONTROLNO.name(), t5110mTest980105Po.getControlno()); 
			dataObject.setValue(T5110mTest980105Po.COLUMNS.WDATE.name(), t5110mTest980105Po.getWdate()); 
			dataObject.setValue(T5110mTest980105Po.COLUMNS.WTIME.name(), t5110mTest980105Po.getWtime()); 
			dataObject.setValue(T5110mTest980105Po.COLUMNS.DUTYNO.name(), t5110mTest980105Po.getDutyno()); 
			dataObject.setValue(T5110mTest980105Po.COLUMNS.DUTYPAYERBAN.name(), t5110mTest980105Po.getDutypayerban()); 
			dataObject.setValue(T5110mTest980105Po.COLUMNS.BOXNO.name(), t5110mTest980105Po.getBoxno()); 
			dataObject.setValue(T5110mTest980105Po.COLUMNS.DUTYDEADLINE.name(), t5110mTest980105Po.getDutydeadline()); 
			dataObject.setValue(T5110mTest980105Po.COLUMNS.FLIGHTNO.name(), t5110mTest980105Po.getFlightno()); 
			dataObject.setValue(T5110mTest980105Po.COLUMNS.SHIPNO.name(), t5110mTest980105Po.getShipno()); 
			dataObject.setValue(T5110mTest980105Po.COLUMNS.DECLNO.name(), t5110mTest980105Po.getDeclno()); 
			dataObject.setValue(T5110mTest980105Po.COLUMNS.DUTYPAYMENT.name(), t5110mTest980105Po.getDutypayment()); 
			dataObject.setValue(T5110mTest980105Po.COLUMNS.MWB.name(), t5110mTest980105Po.getMwb()); 
			dataObject.setValue(T5110mTest980105Po.COLUMNS.HWB.name(), t5110mTest980105Po.getHwb()); 
			dataObject.setValue(T5110mTest980105Po.COLUMNS.ISSUEREASON.name(), t5110mTest980105Po.getIssuereason()); 
			dataObject.setValue(T5110mTest980105Po.COLUMNS.IMPORTATIONDATE.name(), t5110mTest980105Po.getImportationdate()); 
			dataObject.setValue(T5110mTest980105Po.COLUMNS.EXPORTDECLDATE.name(), t5110mTest980105Po.getExportdecldate()); 
			dataObject.setValue(T5110mTest980105Po.COLUMNS.PIECE.name(), t5110mTest980105Po.getPiece()); 
			dataObject.setValue(T5110mTest980105Po.COLUMNS.UNIT.name(), t5110mTest980105Po.getUnit()); 
			dataObject.setValue(T5110mTest980105Po.COLUMNS.CCCCODE.name(), t5110mTest980105Po.getCcccode()); 
			dataObject.setValue(T5110mTest980105Po.COLUMNS.FOBVALUE.name(), t5110mTest980105Po.getFobvalue()); 
			dataObject.setValue(T5110mTest980105Po.COLUMNS.DUTYBASIS.name(), t5110mTest980105Po.getDutybasis()); 
			dataObject.setValue(T5110mTest980105Po.COLUMNS.EXAMINATIONNOTE.name(), t5110mTest980105Po.getExaminationnote()); 
			dataObject.setValue(T5110mTest980105Po.COLUMNS.CUSTOMSACTNO.name(), t5110mTest980105Po.getCustomsactno()); 
			dataObject.setValue(T5110mTest980105Po.COLUMNS.DUTYPAYERNAME.name(), t5110mTest980105Po.getDutypayername()); 
			dataObject.setValue(T5110mTest980105Po.COLUMNS.SENDERID.name(), t5110mTest980105Po.getSenderid()); 
			dataObject.setValue(T5110mTest980105Po.COLUMNS.SENDERQUALIFIER.name(), t5110mTest980105Po.getSenderqualifier()); 
			dataObject.setValue(T5110mTest980105Po.COLUMNS.RECEIVERID.name(), t5110mTest980105Po.getReceiverid()); 
			dataObject.setValue(T5110mTest980105Po.COLUMNS.RECEIVERQUALIFIER.name(), t5110mTest980105Po.getReceiverqualifier()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<T5110mTest980105Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(T5110mTest980105Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
