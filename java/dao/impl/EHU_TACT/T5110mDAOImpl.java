package com.doc.common.dao.impl; 
 
public class T5110mDAOImpl extends GeneralDAOImpl<T5110mPo> implements T5110mDAO { 
	public static final T5110mDAOImpl INSTANCE = new T5110mDAOImpl(); 
	public static final String TABLENAME = "T5110M"; 

	public T5110mDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<T5110mPo> CONVERTER = new MapConverter<T5110mPo>() { 
 
		@Override 
		public T5110mPo convert(final DataObject dataObject) { 
			final T5110mPo t5110mPo = new T5110mPo(); 
			t5110mPo.setControlno(dataObject.getString(T5110mPo.COLUMNS.CONTROLNO.name())); 
			t5110mPo.setWdate(dataObject.getString(T5110mPo.COLUMNS.WDATE.name())); 
			t5110mPo.setWtime(dataObject.getString(T5110mPo.COLUMNS.WTIME.name())); 
			t5110mPo.setDutyno(dataObject.getString(T5110mPo.COLUMNS.DUTYNO.name())); 
			t5110mPo.setDutypayerban(dataObject.getString(T5110mPo.COLUMNS.DUTYPAYERBAN.name())); 
			t5110mPo.setBoxno(dataObject.getString(T5110mPo.COLUMNS.BOXNO.name())); 
			t5110mPo.setDutydeadline(dataObject.getString(T5110mPo.COLUMNS.DUTYDEADLINE.name())); 
			t5110mPo.setFlightno(dataObject.getString(T5110mPo.COLUMNS.FLIGHTNO.name())); 
			t5110mPo.setShipno(dataObject.getString(T5110mPo.COLUMNS.SHIPNO.name())); 
			t5110mPo.setDeclno(dataObject.getString(T5110mPo.COLUMNS.DECLNO.name())); 
			t5110mPo.setDutypayment(dataObject.getString(T5110mPo.COLUMNS.DUTYPAYMENT.name())); 
			t5110mPo.setMwb(dataObject.getString(T5110mPo.COLUMNS.MWB.name())); 
			t5110mPo.setHwb(dataObject.getString(T5110mPo.COLUMNS.HWB.name())); 
			t5110mPo.setIssuereason(dataObject.getString(T5110mPo.COLUMNS.ISSUEREASON.name())); 
			t5110mPo.setImportationdate(dataObject.getString(T5110mPo.COLUMNS.IMPORTATIONDATE.name())); 
			t5110mPo.setExportdecldate(dataObject.getString(T5110mPo.COLUMNS.EXPORTDECLDATE.name())); 
			t5110mPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(T5110mPo.COLUMNS.PIECE.name()))); 
			t5110mPo.setUnit(dataObject.getString(T5110mPo.COLUMNS.UNIT.name())); 
			t5110mPo.setCcccode(dataObject.getString(T5110mPo.COLUMNS.CCCCODE.name())); 
			t5110mPo.setFobvalue(dataObject.getString(T5110mPo.COLUMNS.FOBVALUE.name())); 
			t5110mPo.setDutybasis(dataObject.getString(T5110mPo.COLUMNS.DUTYBASIS.name())); 
			t5110mPo.setExaminationnote(dataObject.getString(T5110mPo.COLUMNS.EXAMINATIONNOTE.name())); 
			t5110mPo.setCustomsactno(dataObject.getString(T5110mPo.COLUMNS.CUSTOMSACTNO.name())); 
			t5110mPo.setDutypayername(dataObject.getString(T5110mPo.COLUMNS.DUTYPAYERNAME.name())); 
			t5110mPo.setSenderid(dataObject.getString(T5110mPo.COLUMNS.SENDERID.name())); 
			t5110mPo.setSenderqualifier(dataObject.getString(T5110mPo.COLUMNS.SENDERQUALIFIER.name())); 
			t5110mPo.setReceiverid(dataObject.getString(T5110mPo.COLUMNS.RECEIVERID.name())); 
			t5110mPo.setReceiverqualifier(dataObject.getString(T5110mPo.COLUMNS.RECEIVERQUALIFIER.name())); 
			t5110mPo.setPrintduty(TimestampUtils.of(dataObject.getValue(T5110mPo.COLUMNS.PRINTDUTY.name()))); 
			t5110mPo.setSubboxno(dataObject.getString(T5110mPo.COLUMNS.SUBBOXNO.name())); 
			t5110mPo.setCollectionitem(dataObject.getString(T5110mPo.COLUMNS.COLLECTIONITEM.name())); 
			t5110mPo.setAgencybarcode(dataObject.getString(T5110mPo.COLUMNS.AGENCYBARCODE.name())); 
			t5110mPo.setImporterename(dataObject.getString(T5110mPo.COLUMNS.IMPORTERENAME.name())); 
			t5110mPo.setClearancetype(dataObject.getString(T5110mPo.COLUMNS.CLEARANCETYPE.name())); 
			t5110mPo.setWriteoffno(dataObject.getString(T5110mPo.COLUMNS.WRITEOFFNO.name())); 
			t5110mPo.setDecltype(dataObject.getString(T5110mPo.COLUMNS.DECLTYPE.name())); 
			t5110mPo.setCaseno(dataObject.getString(T5110mPo.COLUMNS.CASENO.name())); 
			return t5110mPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final T5110mPo t5110mPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(T5110mPo.COLUMNS.CONTROLNO.name(), t5110mPo.getControlno()); 
			dataObject.setValue(T5110mPo.COLUMNS.WDATE.name(), t5110mPo.getWdate()); 
			dataObject.setValue(T5110mPo.COLUMNS.WTIME.name(), t5110mPo.getWtime()); 
			dataObject.setValue(T5110mPo.COLUMNS.DUTYNO.name(), t5110mPo.getDutyno()); 
			dataObject.setValue(T5110mPo.COLUMNS.DUTYPAYERBAN.name(), t5110mPo.getDutypayerban()); 
			dataObject.setValue(T5110mPo.COLUMNS.BOXNO.name(), t5110mPo.getBoxno()); 
			dataObject.setValue(T5110mPo.COLUMNS.DUTYDEADLINE.name(), t5110mPo.getDutydeadline()); 
			dataObject.setValue(T5110mPo.COLUMNS.FLIGHTNO.name(), t5110mPo.getFlightno()); 
			dataObject.setValue(T5110mPo.COLUMNS.SHIPNO.name(), t5110mPo.getShipno()); 
			dataObject.setValue(T5110mPo.COLUMNS.DECLNO.name(), t5110mPo.getDeclno()); 
			dataObject.setValue(T5110mPo.COLUMNS.DUTYPAYMENT.name(), t5110mPo.getDutypayment()); 
			dataObject.setValue(T5110mPo.COLUMNS.MWB.name(), t5110mPo.getMwb()); 
			dataObject.setValue(T5110mPo.COLUMNS.HWB.name(), t5110mPo.getHwb()); 
			dataObject.setValue(T5110mPo.COLUMNS.ISSUEREASON.name(), t5110mPo.getIssuereason()); 
			dataObject.setValue(T5110mPo.COLUMNS.IMPORTATIONDATE.name(), t5110mPo.getImportationdate()); 
			dataObject.setValue(T5110mPo.COLUMNS.EXPORTDECLDATE.name(), t5110mPo.getExportdecldate()); 
			dataObject.setValue(T5110mPo.COLUMNS.PIECE.name(), t5110mPo.getPiece()); 
			dataObject.setValue(T5110mPo.COLUMNS.UNIT.name(), t5110mPo.getUnit()); 
			dataObject.setValue(T5110mPo.COLUMNS.CCCCODE.name(), t5110mPo.getCcccode()); 
			dataObject.setValue(T5110mPo.COLUMNS.FOBVALUE.name(), t5110mPo.getFobvalue()); 
			dataObject.setValue(T5110mPo.COLUMNS.DUTYBASIS.name(), t5110mPo.getDutybasis()); 
			dataObject.setValue(T5110mPo.COLUMNS.EXAMINATIONNOTE.name(), t5110mPo.getExaminationnote()); 
			dataObject.setValue(T5110mPo.COLUMNS.CUSTOMSACTNO.name(), t5110mPo.getCustomsactno()); 
			dataObject.setValue(T5110mPo.COLUMNS.DUTYPAYERNAME.name(), t5110mPo.getDutypayername()); 
			dataObject.setValue(T5110mPo.COLUMNS.SENDERID.name(), t5110mPo.getSenderid()); 
			dataObject.setValue(T5110mPo.COLUMNS.SENDERQUALIFIER.name(), t5110mPo.getSenderqualifier()); 
			dataObject.setValue(T5110mPo.COLUMNS.RECEIVERID.name(), t5110mPo.getReceiverid()); 
			dataObject.setValue(T5110mPo.COLUMNS.RECEIVERQUALIFIER.name(), t5110mPo.getReceiverqualifier()); 
			dataObject.setValue(T5110mPo.COLUMNS.PRINTDUTY.name(), t5110mPo.getPrintduty()); 
			dataObject.setValue(T5110mPo.COLUMNS.SUBBOXNO.name(), t5110mPo.getSubboxno()); 
			dataObject.setValue(T5110mPo.COLUMNS.COLLECTIONITEM.name(), t5110mPo.getCollectionitem()); 
			dataObject.setValue(T5110mPo.COLUMNS.AGENCYBARCODE.name(), t5110mPo.getAgencybarcode()); 
			dataObject.setValue(T5110mPo.COLUMNS.IMPORTERENAME.name(), t5110mPo.getImporterename()); 
			dataObject.setValue(T5110mPo.COLUMNS.CLEARANCETYPE.name(), t5110mPo.getClearancetype()); 
			dataObject.setValue(T5110mPo.COLUMNS.WRITEOFFNO.name(), t5110mPo.getWriteoffno()); 
			dataObject.setValue(T5110mPo.COLUMNS.DECLTYPE.name(), t5110mPo.getDecltype()); 
			dataObject.setValue(T5110mPo.COLUMNS.CASENO.name(), t5110mPo.getCaseno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<T5110mPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(T5110mPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
