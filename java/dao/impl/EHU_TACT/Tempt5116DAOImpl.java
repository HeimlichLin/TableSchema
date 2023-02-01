package com.doc.common.dao.impl; 
 
public class Tempt5116DAOImpl extends GeneralDAOImpl<Tempt5116Po> implements Tempt5116DAO { 
	public static final Tempt5116DAOImpl INSTANCE = new Tempt5116DAOImpl(); 
	public static final String TABLENAME = "TEMPT5116"; 

	public Tempt5116DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Tempt5116Po> CONVERTER = new MapConverter<Tempt5116Po>() { 
 
		@Override 
		public Tempt5116Po convert(final DataObject dataObject) { 
			final Tempt5116Po tempt5116Po = new Tempt5116Po(); 
			tempt5116Po.setControlno(dataObject.getString(Tempt5116Po.COLUMNS.CONTROLNO.name())); 
			tempt5116Po.setWdate(dataObject.getString(Tempt5116Po.COLUMNS.WDATE.name())); 
			tempt5116Po.setWtime(dataObject.getString(Tempt5116Po.COLUMNS.WTIME.name())); 
			tempt5116Po.setImportationdate(dataObject.getString(Tempt5116Po.COLUMNS.IMPORTATIONDATE.name())); 
			tempt5116Po.setFlightno(dataObject.getString(Tempt5116Po.COLUMNS.FLIGHTNO.name())); 
			tempt5116Po.setIndicator(dataObject.getString(Tempt5116Po.COLUMNS.INDICATOR.name())); 
			tempt5116Po.setMwb(dataObject.getString(Tempt5116Po.COLUMNS.MWB.name())); 
			tempt5116Po.setHwb(dataObject.getString(Tempt5116Po.COLUMNS.HWB.name())); 
			tempt5116Po.setReleasedate(dataObject.getString(Tempt5116Po.COLUMNS.RELEASEDATE.name())); 
			tempt5116Po.setReleasetime(dataObject.getString(Tempt5116Po.COLUMNS.RELEASETIME.name())); 
			tempt5116Po.setTtype(dataObject.getString(Tempt5116Po.COLUMNS.TTYPE.name())); 
			tempt5116Po.setExtracondition(dataObject.getString(Tempt5116Po.COLUMNS.EXTRACONDITION.name())); 
			tempt5116Po.setBoxno(dataObject.getString(Tempt5116Po.COLUMNS.BOXNO.name())); 
			tempt5116Po.setDeclno(dataObject.getString(Tempt5116Po.COLUMNS.DECLNO.name())); 
			tempt5116Po.setDecltype(dataObject.getString(Tempt5116Po.COLUMNS.DECLTYPE.name())); 
			tempt5116Po.setQuantitylanded(BigDecimalUtils.formObj(dataObject.getValue(Tempt5116Po.COLUMNS.QUANTITYLANDED.name()))); 
			tempt5116Po.setLandedunit(dataObject.getString(Tempt5116Po.COLUMNS.LANDEDUNIT.name())); 
			tempt5116Po.setQuantityreleased(BigDecimalUtils.formObj(dataObject.getValue(Tempt5116Po.COLUMNS.QUANTITYRELEASED.name()))); 
			tempt5116Po.setReleasedunit(dataObject.getString(Tempt5116Po.COLUMNS.RELEASEDUNIT.name())); 
			tempt5116Po.setGrossweight(BigDecimalUtils.formObj(dataObject.getValue(Tempt5116Po.COLUMNS.GROSSWEIGHT.name()))); 
			tempt5116Po.setExaminationnote(dataObject.getString(Tempt5116Po.COLUMNS.EXAMINATIONNOTE.name())); 
			tempt5116Po.setCopackage(dataObject.getString(Tempt5116Po.COLUMNS.COPACKAGE.name())); 
			tempt5116Po.setSenderid(dataObject.getString(Tempt5116Po.COLUMNS.SENDERID.name())); 
			tempt5116Po.setSenderqualifier(dataObject.getString(Tempt5116Po.COLUMNS.SENDERQUALIFIER.name())); 
			tempt5116Po.setReceiverid(dataObject.getString(Tempt5116Po.COLUMNS.RECEIVERID.name())); 
			tempt5116Po.setReceiverqualifier(dataObject.getString(Tempt5116Po.COLUMNS.RECEIVERQUALIFIER.name())); 
			tempt5116Po.setReleasetypecode(dataObject.getString(Tempt5116Po.COLUMNS.RELEASETYPECODE.name())); 
			tempt5116Po.setWarehouseno(dataObject.getString(Tempt5116Po.COLUMNS.WAREHOUSENO.name())); 
			tempt5116Po.setUnreleasedpiece(dataObject.getString(Tempt5116Po.COLUMNS.UNRELEASEDPIECE.name())); 
			tempt5116Po.setSono(dataObject.getString(Tempt5116Po.COLUMNS.SONO.name())); 
			tempt5116Po.setExtracode1(dataObject.getString(Tempt5116Po.COLUMNS.EXTRACODE1.name())); 
			tempt5116Po.setExtracode2(dataObject.getString(Tempt5116Po.COLUMNS.EXTRACODE2.name())); 
			tempt5116Po.setExtracode3(dataObject.getString(Tempt5116Po.COLUMNS.EXTRACODE3.name())); 
			tempt5116Po.setShipnote(dataObject.getString(Tempt5116Po.COLUMNS.SHIPNOTE.name())); 
			tempt5116Po.setExpbagno(dataObject.getString(Tempt5116Po.COLUMNS.EXPBAGNO.name())); 
			tempt5116Po.setBaghwb(dataObject.getString(Tempt5116Po.COLUMNS.BAGHWB.name())); 
			return tempt5116Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Tempt5116Po tempt5116Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Tempt5116Po.COLUMNS.CONTROLNO.name(), tempt5116Po.getControlno()); 
			dataObject.setValue(Tempt5116Po.COLUMNS.WDATE.name(), tempt5116Po.getWdate()); 
			dataObject.setValue(Tempt5116Po.COLUMNS.WTIME.name(), tempt5116Po.getWtime()); 
			dataObject.setValue(Tempt5116Po.COLUMNS.IMPORTATIONDATE.name(), tempt5116Po.getImportationdate()); 
			dataObject.setValue(Tempt5116Po.COLUMNS.FLIGHTNO.name(), tempt5116Po.getFlightno()); 
			dataObject.setValue(Tempt5116Po.COLUMNS.INDICATOR.name(), tempt5116Po.getIndicator()); 
			dataObject.setValue(Tempt5116Po.COLUMNS.MWB.name(), tempt5116Po.getMwb()); 
			dataObject.setValue(Tempt5116Po.COLUMNS.HWB.name(), tempt5116Po.getHwb()); 
			dataObject.setValue(Tempt5116Po.COLUMNS.RELEASEDATE.name(), tempt5116Po.getReleasedate()); 
			dataObject.setValue(Tempt5116Po.COLUMNS.RELEASETIME.name(), tempt5116Po.getReleasetime()); 
			dataObject.setValue(Tempt5116Po.COLUMNS.TTYPE.name(), tempt5116Po.getTtype()); 
			dataObject.setValue(Tempt5116Po.COLUMNS.EXTRACONDITION.name(), tempt5116Po.getExtracondition()); 
			dataObject.setValue(Tempt5116Po.COLUMNS.BOXNO.name(), tempt5116Po.getBoxno()); 
			dataObject.setValue(Tempt5116Po.COLUMNS.DECLNO.name(), tempt5116Po.getDeclno()); 
			dataObject.setValue(Tempt5116Po.COLUMNS.DECLTYPE.name(), tempt5116Po.getDecltype()); 
			dataObject.setValue(Tempt5116Po.COLUMNS.QUANTITYLANDED.name(), tempt5116Po.getQuantitylanded()); 
			dataObject.setValue(Tempt5116Po.COLUMNS.LANDEDUNIT.name(), tempt5116Po.getLandedunit()); 
			dataObject.setValue(Tempt5116Po.COLUMNS.QUANTITYRELEASED.name(), tempt5116Po.getQuantityreleased()); 
			dataObject.setValue(Tempt5116Po.COLUMNS.RELEASEDUNIT.name(), tempt5116Po.getReleasedunit()); 
			dataObject.setValue(Tempt5116Po.COLUMNS.GROSSWEIGHT.name(), tempt5116Po.getGrossweight()); 
			dataObject.setValue(Tempt5116Po.COLUMNS.EXAMINATIONNOTE.name(), tempt5116Po.getExaminationnote()); 
			dataObject.setValue(Tempt5116Po.COLUMNS.COPACKAGE.name(), tempt5116Po.getCopackage()); 
			dataObject.setValue(Tempt5116Po.COLUMNS.SENDERID.name(), tempt5116Po.getSenderid()); 
			dataObject.setValue(Tempt5116Po.COLUMNS.SENDERQUALIFIER.name(), tempt5116Po.getSenderqualifier()); 
			dataObject.setValue(Tempt5116Po.COLUMNS.RECEIVERID.name(), tempt5116Po.getReceiverid()); 
			dataObject.setValue(Tempt5116Po.COLUMNS.RECEIVERQUALIFIER.name(), tempt5116Po.getReceiverqualifier()); 
			dataObject.setValue(Tempt5116Po.COLUMNS.RELEASETYPECODE.name(), tempt5116Po.getReleasetypecode()); 
			dataObject.setValue(Tempt5116Po.COLUMNS.WAREHOUSENO.name(), tempt5116Po.getWarehouseno()); 
			dataObject.setValue(Tempt5116Po.COLUMNS.UNRELEASEDPIECE.name(), tempt5116Po.getUnreleasedpiece()); 
			dataObject.setValue(Tempt5116Po.COLUMNS.SONO.name(), tempt5116Po.getSono()); 
			dataObject.setValue(Tempt5116Po.COLUMNS.EXTRACODE1.name(), tempt5116Po.getExtracode1()); 
			dataObject.setValue(Tempt5116Po.COLUMNS.EXTRACODE2.name(), tempt5116Po.getExtracode2()); 
			dataObject.setValue(Tempt5116Po.COLUMNS.EXTRACODE3.name(), tempt5116Po.getExtracode3()); 
			dataObject.setValue(Tempt5116Po.COLUMNS.SHIPNOTE.name(), tempt5116Po.getShipnote()); 
			dataObject.setValue(Tempt5116Po.COLUMNS.EXPBAGNO.name(), tempt5116Po.getExpbagno()); 
			dataObject.setValue(Tempt5116Po.COLUMNS.BAGHWB.name(), tempt5116Po.getBaghwb()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Tempt5116Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Tempt5116Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
