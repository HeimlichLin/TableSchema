package com.doc.common.dao.impl; 
 
public class Tempt5110mDAOImpl extends GeneralDAOImpl<Tempt5110mPo> implements Tempt5110mDAO { 
	public static final Tempt5110mDAOImpl INSTANCE = new Tempt5110mDAOImpl(); 
	public static final String TABLENAME = "TEMPT5110M"; 

	public Tempt5110mDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Tempt5110mPo> CONVERTER = new MapConverter<Tempt5110mPo>() { 
 
		@Override 
		public Tempt5110mPo convert(final DataObject dataObject) { 
			final Tempt5110mPo tempt5110mPo = new Tempt5110mPo(); 
			tempt5110mPo.setControlno(dataObject.getString(Tempt5110mPo.COLUMNS.CONTROLNO.name())); 
			tempt5110mPo.setWdate(dataObject.getString(Tempt5110mPo.COLUMNS.WDATE.name())); 
			tempt5110mPo.setWtime(dataObject.getString(Tempt5110mPo.COLUMNS.WTIME.name())); 
			tempt5110mPo.setDutyno(dataObject.getString(Tempt5110mPo.COLUMNS.DUTYNO.name())); 
			tempt5110mPo.setDutypayerban(dataObject.getString(Tempt5110mPo.COLUMNS.DUTYPAYERBAN.name())); 
			tempt5110mPo.setBoxno(dataObject.getString(Tempt5110mPo.COLUMNS.BOXNO.name())); 
			tempt5110mPo.setDutydeadline(dataObject.getString(Tempt5110mPo.COLUMNS.DUTYDEADLINE.name())); 
			tempt5110mPo.setFlightno(dataObject.getString(Tempt5110mPo.COLUMNS.FLIGHTNO.name())); 
			tempt5110mPo.setShipno(dataObject.getString(Tempt5110mPo.COLUMNS.SHIPNO.name())); 
			tempt5110mPo.setDeclno(dataObject.getString(Tempt5110mPo.COLUMNS.DECLNO.name())); 
			tempt5110mPo.setDutypayment(dataObject.getString(Tempt5110mPo.COLUMNS.DUTYPAYMENT.name())); 
			tempt5110mPo.setMwb(dataObject.getString(Tempt5110mPo.COLUMNS.MWB.name())); 
			tempt5110mPo.setHwb(dataObject.getString(Tempt5110mPo.COLUMNS.HWB.name())); 
			tempt5110mPo.setIssuereason(dataObject.getString(Tempt5110mPo.COLUMNS.ISSUEREASON.name())); 
			tempt5110mPo.setImportationdate(dataObject.getString(Tempt5110mPo.COLUMNS.IMPORTATIONDATE.name())); 
			tempt5110mPo.setExportdecldate(dataObject.getString(Tempt5110mPo.COLUMNS.EXPORTDECLDATE.name())); 
			tempt5110mPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(Tempt5110mPo.COLUMNS.PIECE.name()))); 
			tempt5110mPo.setUnit(dataObject.getString(Tempt5110mPo.COLUMNS.UNIT.name())); 
			tempt5110mPo.setCcccode(dataObject.getString(Tempt5110mPo.COLUMNS.CCCCODE.name())); 
			tempt5110mPo.setFobvalue(dataObject.getString(Tempt5110mPo.COLUMNS.FOBVALUE.name())); 
			tempt5110mPo.setDutybasis(dataObject.getString(Tempt5110mPo.COLUMNS.DUTYBASIS.name())); 
			tempt5110mPo.setExaminationnote(dataObject.getString(Tempt5110mPo.COLUMNS.EXAMINATIONNOTE.name())); 
			tempt5110mPo.setCustomsactno(dataObject.getString(Tempt5110mPo.COLUMNS.CUSTOMSACTNO.name())); 
			tempt5110mPo.setDutypayername(dataObject.getString(Tempt5110mPo.COLUMNS.DUTYPAYERNAME.name())); 
			tempt5110mPo.setSenderid(dataObject.getString(Tempt5110mPo.COLUMNS.SENDERID.name())); 
			tempt5110mPo.setSenderqualifier(dataObject.getString(Tempt5110mPo.COLUMNS.SENDERQUALIFIER.name())); 
			tempt5110mPo.setReceiverid(dataObject.getString(Tempt5110mPo.COLUMNS.RECEIVERID.name())); 
			tempt5110mPo.setReceiverqualifier(dataObject.getString(Tempt5110mPo.COLUMNS.RECEIVERQUALIFIER.name())); 
			tempt5110mPo.setSubboxno(dataObject.getString(Tempt5110mPo.COLUMNS.SUBBOXNO.name())); 
			tempt5110mPo.setCollectionitem(dataObject.getString(Tempt5110mPo.COLUMNS.COLLECTIONITEM.name())); 
			tempt5110mPo.setAgencybarcode(dataObject.getString(Tempt5110mPo.COLUMNS.AGENCYBARCODE.name())); 
			tempt5110mPo.setImporterename(dataObject.getString(Tempt5110mPo.COLUMNS.IMPORTERENAME.name())); 
			tempt5110mPo.setClearancetype(dataObject.getString(Tempt5110mPo.COLUMNS.CLEARANCETYPE.name())); 
			tempt5110mPo.setWriteoffno(dataObject.getString(Tempt5110mPo.COLUMNS.WRITEOFFNO.name())); 
			tempt5110mPo.setDecltype(dataObject.getString(Tempt5110mPo.COLUMNS.DECLTYPE.name())); 
			tempt5110mPo.setCaseno(dataObject.getString(Tempt5110mPo.COLUMNS.CASENO.name())); 
			return tempt5110mPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Tempt5110mPo tempt5110mPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Tempt5110mPo.COLUMNS.CONTROLNO.name(), tempt5110mPo.getControlno()); 
			dataObject.setValue(Tempt5110mPo.COLUMNS.WDATE.name(), tempt5110mPo.getWdate()); 
			dataObject.setValue(Tempt5110mPo.COLUMNS.WTIME.name(), tempt5110mPo.getWtime()); 
			dataObject.setValue(Tempt5110mPo.COLUMNS.DUTYNO.name(), tempt5110mPo.getDutyno()); 
			dataObject.setValue(Tempt5110mPo.COLUMNS.DUTYPAYERBAN.name(), tempt5110mPo.getDutypayerban()); 
			dataObject.setValue(Tempt5110mPo.COLUMNS.BOXNO.name(), tempt5110mPo.getBoxno()); 
			dataObject.setValue(Tempt5110mPo.COLUMNS.DUTYDEADLINE.name(), tempt5110mPo.getDutydeadline()); 
			dataObject.setValue(Tempt5110mPo.COLUMNS.FLIGHTNO.name(), tempt5110mPo.getFlightno()); 
			dataObject.setValue(Tempt5110mPo.COLUMNS.SHIPNO.name(), tempt5110mPo.getShipno()); 
			dataObject.setValue(Tempt5110mPo.COLUMNS.DECLNO.name(), tempt5110mPo.getDeclno()); 
			dataObject.setValue(Tempt5110mPo.COLUMNS.DUTYPAYMENT.name(), tempt5110mPo.getDutypayment()); 
			dataObject.setValue(Tempt5110mPo.COLUMNS.MWB.name(), tempt5110mPo.getMwb()); 
			dataObject.setValue(Tempt5110mPo.COLUMNS.HWB.name(), tempt5110mPo.getHwb()); 
			dataObject.setValue(Tempt5110mPo.COLUMNS.ISSUEREASON.name(), tempt5110mPo.getIssuereason()); 
			dataObject.setValue(Tempt5110mPo.COLUMNS.IMPORTATIONDATE.name(), tempt5110mPo.getImportationdate()); 
			dataObject.setValue(Tempt5110mPo.COLUMNS.EXPORTDECLDATE.name(), tempt5110mPo.getExportdecldate()); 
			dataObject.setValue(Tempt5110mPo.COLUMNS.PIECE.name(), tempt5110mPo.getPiece()); 
			dataObject.setValue(Tempt5110mPo.COLUMNS.UNIT.name(), tempt5110mPo.getUnit()); 
			dataObject.setValue(Tempt5110mPo.COLUMNS.CCCCODE.name(), tempt5110mPo.getCcccode()); 
			dataObject.setValue(Tempt5110mPo.COLUMNS.FOBVALUE.name(), tempt5110mPo.getFobvalue()); 
			dataObject.setValue(Tempt5110mPo.COLUMNS.DUTYBASIS.name(), tempt5110mPo.getDutybasis()); 
			dataObject.setValue(Tempt5110mPo.COLUMNS.EXAMINATIONNOTE.name(), tempt5110mPo.getExaminationnote()); 
			dataObject.setValue(Tempt5110mPo.COLUMNS.CUSTOMSACTNO.name(), tempt5110mPo.getCustomsactno()); 
			dataObject.setValue(Tempt5110mPo.COLUMNS.DUTYPAYERNAME.name(), tempt5110mPo.getDutypayername()); 
			dataObject.setValue(Tempt5110mPo.COLUMNS.SENDERID.name(), tempt5110mPo.getSenderid()); 
			dataObject.setValue(Tempt5110mPo.COLUMNS.SENDERQUALIFIER.name(), tempt5110mPo.getSenderqualifier()); 
			dataObject.setValue(Tempt5110mPo.COLUMNS.RECEIVERID.name(), tempt5110mPo.getReceiverid()); 
			dataObject.setValue(Tempt5110mPo.COLUMNS.RECEIVERQUALIFIER.name(), tempt5110mPo.getReceiverqualifier()); 
			dataObject.setValue(Tempt5110mPo.COLUMNS.SUBBOXNO.name(), tempt5110mPo.getSubboxno()); 
			dataObject.setValue(Tempt5110mPo.COLUMNS.COLLECTIONITEM.name(), tempt5110mPo.getCollectionitem()); 
			dataObject.setValue(Tempt5110mPo.COLUMNS.AGENCYBARCODE.name(), tempt5110mPo.getAgencybarcode()); 
			dataObject.setValue(Tempt5110mPo.COLUMNS.IMPORTERENAME.name(), tempt5110mPo.getImporterename()); 
			dataObject.setValue(Tempt5110mPo.COLUMNS.CLEARANCETYPE.name(), tempt5110mPo.getClearancetype()); 
			dataObject.setValue(Tempt5110mPo.COLUMNS.WRITEOFFNO.name(), tempt5110mPo.getWriteoffno()); 
			dataObject.setValue(Tempt5110mPo.COLUMNS.DECLTYPE.name(), tempt5110mPo.getDecltype()); 
			dataObject.setValue(Tempt5110mPo.COLUMNS.CASENO.name(), tempt5110mPo.getCaseno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Tempt5110mPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Tempt5110mPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
