package com.doc.common.dao.impl; 
 
public class T5110mbackupDAOImpl extends GeneralDAOImpl<T5110mbackupPo> implements T5110mbackupDAO { 
	public static final T5110mbackupDAOImpl INSTANCE = new T5110mbackupDAOImpl(); 
	public static final String TABLENAME = "T5110MBACKUP"; 

	public T5110mbackupDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<T5110mbackupPo> CONVERTER = new MapConverter<T5110mbackupPo>() { 
 
		@Override 
		public T5110mbackupPo convert(final DataObject dataObject) { 
			final T5110mbackupPo t5110mbackupPo = new T5110mbackupPo(); 
			t5110mbackupPo.setControlno(dataObject.getString(T5110mbackupPo.COLUMNS.CONTROLNO.name())); 
			t5110mbackupPo.setWdate(dataObject.getString(T5110mbackupPo.COLUMNS.WDATE.name())); 
			t5110mbackupPo.setWtime(dataObject.getString(T5110mbackupPo.COLUMNS.WTIME.name())); 
			t5110mbackupPo.setDutyno(dataObject.getString(T5110mbackupPo.COLUMNS.DUTYNO.name())); 
			t5110mbackupPo.setDutypayerban(dataObject.getString(T5110mbackupPo.COLUMNS.DUTYPAYERBAN.name())); 
			t5110mbackupPo.setBoxno(dataObject.getString(T5110mbackupPo.COLUMNS.BOXNO.name())); 
			t5110mbackupPo.setDutydeadline(dataObject.getString(T5110mbackupPo.COLUMNS.DUTYDEADLINE.name())); 
			t5110mbackupPo.setFlightno(dataObject.getString(T5110mbackupPo.COLUMNS.FLIGHTNO.name())); 
			t5110mbackupPo.setShipno(dataObject.getString(T5110mbackupPo.COLUMNS.SHIPNO.name())); 
			t5110mbackupPo.setDeclno(dataObject.getString(T5110mbackupPo.COLUMNS.DECLNO.name())); 
			t5110mbackupPo.setDutypayment(dataObject.getString(T5110mbackupPo.COLUMNS.DUTYPAYMENT.name())); 
			t5110mbackupPo.setMwb(dataObject.getString(T5110mbackupPo.COLUMNS.MWB.name())); 
			t5110mbackupPo.setHwb(dataObject.getString(T5110mbackupPo.COLUMNS.HWB.name())); 
			t5110mbackupPo.setIssuereason(dataObject.getString(T5110mbackupPo.COLUMNS.ISSUEREASON.name())); 
			t5110mbackupPo.setImportationdate(dataObject.getString(T5110mbackupPo.COLUMNS.IMPORTATIONDATE.name())); 
			t5110mbackupPo.setExportdecldate(dataObject.getString(T5110mbackupPo.COLUMNS.EXPORTDECLDATE.name())); 
			t5110mbackupPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(T5110mbackupPo.COLUMNS.PIECE.name()))); 
			t5110mbackupPo.setUnit(dataObject.getString(T5110mbackupPo.COLUMNS.UNIT.name())); 
			t5110mbackupPo.setCcccode(dataObject.getString(T5110mbackupPo.COLUMNS.CCCCODE.name())); 
			t5110mbackupPo.setFobvalue(dataObject.getString(T5110mbackupPo.COLUMNS.FOBVALUE.name())); 
			t5110mbackupPo.setDutybasis(dataObject.getString(T5110mbackupPo.COLUMNS.DUTYBASIS.name())); 
			t5110mbackupPo.setExaminationnote(dataObject.getString(T5110mbackupPo.COLUMNS.EXAMINATIONNOTE.name())); 
			t5110mbackupPo.setCustomsactno(dataObject.getString(T5110mbackupPo.COLUMNS.CUSTOMSACTNO.name())); 
			t5110mbackupPo.setDutypayername(dataObject.getString(T5110mbackupPo.COLUMNS.DUTYPAYERNAME.name())); 
			t5110mbackupPo.setSenderid(dataObject.getString(T5110mbackupPo.COLUMNS.SENDERID.name())); 
			t5110mbackupPo.setSenderqualifier(dataObject.getString(T5110mbackupPo.COLUMNS.SENDERQUALIFIER.name())); 
			t5110mbackupPo.setReceiverid(dataObject.getString(T5110mbackupPo.COLUMNS.RECEIVERID.name())); 
			t5110mbackupPo.setReceiverqualifier(dataObject.getString(T5110mbackupPo.COLUMNS.RECEIVERQUALIFIER.name())); 
			t5110mbackupPo.setPrintduty(TimestampUtils.of(dataObject.getValue(T5110mbackupPo.COLUMNS.PRINTDUTY.name()))); 
			t5110mbackupPo.setSubboxno(dataObject.getString(T5110mbackupPo.COLUMNS.SUBBOXNO.name())); 
			t5110mbackupPo.setCollectionitem(dataObject.getString(T5110mbackupPo.COLUMNS.COLLECTIONITEM.name())); 
			t5110mbackupPo.setAgencybarcode(dataObject.getString(T5110mbackupPo.COLUMNS.AGENCYBARCODE.name())); 
			t5110mbackupPo.setImporterename(dataObject.getString(T5110mbackupPo.COLUMNS.IMPORTERENAME.name())); 
			t5110mbackupPo.setClearancetype(dataObject.getString(T5110mbackupPo.COLUMNS.CLEARANCETYPE.name())); 
			t5110mbackupPo.setWriteoffno(dataObject.getString(T5110mbackupPo.COLUMNS.WRITEOFFNO.name())); 
			t5110mbackupPo.setDecltype(dataObject.getString(T5110mbackupPo.COLUMNS.DECLTYPE.name())); 
			t5110mbackupPo.setCaseno(dataObject.getString(T5110mbackupPo.COLUMNS.CASENO.name())); 
			return t5110mbackupPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final T5110mbackupPo t5110mbackupPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(T5110mbackupPo.COLUMNS.CONTROLNO.name(), t5110mbackupPo.getControlno()); 
			dataObject.setValue(T5110mbackupPo.COLUMNS.WDATE.name(), t5110mbackupPo.getWdate()); 
			dataObject.setValue(T5110mbackupPo.COLUMNS.WTIME.name(), t5110mbackupPo.getWtime()); 
			dataObject.setValue(T5110mbackupPo.COLUMNS.DUTYNO.name(), t5110mbackupPo.getDutyno()); 
			dataObject.setValue(T5110mbackupPo.COLUMNS.DUTYPAYERBAN.name(), t5110mbackupPo.getDutypayerban()); 
			dataObject.setValue(T5110mbackupPo.COLUMNS.BOXNO.name(), t5110mbackupPo.getBoxno()); 
			dataObject.setValue(T5110mbackupPo.COLUMNS.DUTYDEADLINE.name(), t5110mbackupPo.getDutydeadline()); 
			dataObject.setValue(T5110mbackupPo.COLUMNS.FLIGHTNO.name(), t5110mbackupPo.getFlightno()); 
			dataObject.setValue(T5110mbackupPo.COLUMNS.SHIPNO.name(), t5110mbackupPo.getShipno()); 
			dataObject.setValue(T5110mbackupPo.COLUMNS.DECLNO.name(), t5110mbackupPo.getDeclno()); 
			dataObject.setValue(T5110mbackupPo.COLUMNS.DUTYPAYMENT.name(), t5110mbackupPo.getDutypayment()); 
			dataObject.setValue(T5110mbackupPo.COLUMNS.MWB.name(), t5110mbackupPo.getMwb()); 
			dataObject.setValue(T5110mbackupPo.COLUMNS.HWB.name(), t5110mbackupPo.getHwb()); 
			dataObject.setValue(T5110mbackupPo.COLUMNS.ISSUEREASON.name(), t5110mbackupPo.getIssuereason()); 
			dataObject.setValue(T5110mbackupPo.COLUMNS.IMPORTATIONDATE.name(), t5110mbackupPo.getImportationdate()); 
			dataObject.setValue(T5110mbackupPo.COLUMNS.EXPORTDECLDATE.name(), t5110mbackupPo.getExportdecldate()); 
			dataObject.setValue(T5110mbackupPo.COLUMNS.PIECE.name(), t5110mbackupPo.getPiece()); 
			dataObject.setValue(T5110mbackupPo.COLUMNS.UNIT.name(), t5110mbackupPo.getUnit()); 
			dataObject.setValue(T5110mbackupPo.COLUMNS.CCCCODE.name(), t5110mbackupPo.getCcccode()); 
			dataObject.setValue(T5110mbackupPo.COLUMNS.FOBVALUE.name(), t5110mbackupPo.getFobvalue()); 
			dataObject.setValue(T5110mbackupPo.COLUMNS.DUTYBASIS.name(), t5110mbackupPo.getDutybasis()); 
			dataObject.setValue(T5110mbackupPo.COLUMNS.EXAMINATIONNOTE.name(), t5110mbackupPo.getExaminationnote()); 
			dataObject.setValue(T5110mbackupPo.COLUMNS.CUSTOMSACTNO.name(), t5110mbackupPo.getCustomsactno()); 
			dataObject.setValue(T5110mbackupPo.COLUMNS.DUTYPAYERNAME.name(), t5110mbackupPo.getDutypayername()); 
			dataObject.setValue(T5110mbackupPo.COLUMNS.SENDERID.name(), t5110mbackupPo.getSenderid()); 
			dataObject.setValue(T5110mbackupPo.COLUMNS.SENDERQUALIFIER.name(), t5110mbackupPo.getSenderqualifier()); 
			dataObject.setValue(T5110mbackupPo.COLUMNS.RECEIVERID.name(), t5110mbackupPo.getReceiverid()); 
			dataObject.setValue(T5110mbackupPo.COLUMNS.RECEIVERQUALIFIER.name(), t5110mbackupPo.getReceiverqualifier()); 
			dataObject.setValue(T5110mbackupPo.COLUMNS.PRINTDUTY.name(), t5110mbackupPo.getPrintduty()); 
			dataObject.setValue(T5110mbackupPo.COLUMNS.SUBBOXNO.name(), t5110mbackupPo.getSubboxno()); 
			dataObject.setValue(T5110mbackupPo.COLUMNS.COLLECTIONITEM.name(), t5110mbackupPo.getCollectionitem()); 
			dataObject.setValue(T5110mbackupPo.COLUMNS.AGENCYBARCODE.name(), t5110mbackupPo.getAgencybarcode()); 
			dataObject.setValue(T5110mbackupPo.COLUMNS.IMPORTERENAME.name(), t5110mbackupPo.getImporterename()); 
			dataObject.setValue(T5110mbackupPo.COLUMNS.CLEARANCETYPE.name(), t5110mbackupPo.getClearancetype()); 
			dataObject.setValue(T5110mbackupPo.COLUMNS.WRITEOFFNO.name(), t5110mbackupPo.getWriteoffno()); 
			dataObject.setValue(T5110mbackupPo.COLUMNS.DECLTYPE.name(), t5110mbackupPo.getDecltype()); 
			dataObject.setValue(T5110mbackupPo.COLUMNS.CASENO.name(), t5110mbackupPo.getCaseno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<T5110mbackupPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(T5110mbackupPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
