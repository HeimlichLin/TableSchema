package com.doc.common.dao.impl; 
 
public class T5116DAOImpl extends GeneralDAOImpl<T5116Po> implements T5116DAO { 
	public static final T5116DAOImpl INSTANCE = new T5116DAOImpl(); 
	public static final String TABLENAME = "T5116"; 

	public T5116DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<T5116Po> CONVERTER = new MapConverter<T5116Po>() { 
 
		@Override 
		public T5116Po convert(final DataObject dataObject) { 
			final T5116Po t5116Po = new T5116Po(); 
			t5116Po.setControlno(dataObject.getString(T5116Po.COLUMNS.CONTROLNO.name())); 
			t5116Po.setWdate(dataObject.getString(T5116Po.COLUMNS.WDATE.name())); 
			t5116Po.setWtime(dataObject.getString(T5116Po.COLUMNS.WTIME.name())); 
			t5116Po.setImportationdate(dataObject.getString(T5116Po.COLUMNS.IMPORTATIONDATE.name())); 
			t5116Po.setFlightno(dataObject.getString(T5116Po.COLUMNS.FLIGHTNO.name())); 
			t5116Po.setIndicator(dataObject.getString(T5116Po.COLUMNS.INDICATOR.name())); 
			t5116Po.setMwb(dataObject.getString(T5116Po.COLUMNS.MWB.name())); 
			t5116Po.setHwb(dataObject.getString(T5116Po.COLUMNS.HWB.name())); 
			t5116Po.setReleasedate(dataObject.getString(T5116Po.COLUMNS.RELEASEDATE.name())); 
			t5116Po.setReleasetime(dataObject.getString(T5116Po.COLUMNS.RELEASETIME.name())); 
			t5116Po.setTtype(dataObject.getString(T5116Po.COLUMNS.TTYPE.name())); 
			t5116Po.setExtracondition(dataObject.getString(T5116Po.COLUMNS.EXTRACONDITION.name())); 
			t5116Po.setBoxno(dataObject.getString(T5116Po.COLUMNS.BOXNO.name())); 
			t5116Po.setDeclno(dataObject.getString(T5116Po.COLUMNS.DECLNO.name())); 
			t5116Po.setDecltype(dataObject.getString(T5116Po.COLUMNS.DECLTYPE.name())); 
			t5116Po.setQuantitylanded(BigDecimalUtils.formObj(dataObject.getValue(T5116Po.COLUMNS.QUANTITYLANDED.name()))); 
			t5116Po.setLandedunit(dataObject.getString(T5116Po.COLUMNS.LANDEDUNIT.name())); 
			t5116Po.setQuantityreleased(BigDecimalUtils.formObj(dataObject.getValue(T5116Po.COLUMNS.QUANTITYRELEASED.name()))); 
			t5116Po.setReleasedunit(dataObject.getString(T5116Po.COLUMNS.RELEASEDUNIT.name())); 
			t5116Po.setGrossweight(BigDecimalUtils.formObj(dataObject.getValue(T5116Po.COLUMNS.GROSSWEIGHT.name()))); 
			t5116Po.setExaminationnote(dataObject.getString(T5116Po.COLUMNS.EXAMINATIONNOTE.name())); 
			t5116Po.setCopackage(dataObject.getString(T5116Po.COLUMNS.COPACKAGE.name())); 
			t5116Po.setSenderid(dataObject.getString(T5116Po.COLUMNS.SENDERID.name())); 
			t5116Po.setSenderqualifier(dataObject.getString(T5116Po.COLUMNS.SENDERQUALIFIER.name())); 
			t5116Po.setReceiverid(dataObject.getString(T5116Po.COLUMNS.RECEIVERID.name())); 
			t5116Po.setReceiverqualifier(dataObject.getString(T5116Po.COLUMNS.RECEIVERQUALIFIER.name())); 
			t5116Po.setReleasetypecode(dataObject.getString(T5116Po.COLUMNS.RELEASETYPECODE.name())); 
			t5116Po.setWarehouseno(dataObject.getString(T5116Po.COLUMNS.WAREHOUSENO.name())); 
			t5116Po.setUnreleasedpiece(dataObject.getString(T5116Po.COLUMNS.UNRELEASEDPIECE.name())); 
			t5116Po.setSono(dataObject.getString(T5116Po.COLUMNS.SONO.name())); 
			t5116Po.setExtracode1(dataObject.getString(T5116Po.COLUMNS.EXTRACODE1.name())); 
			t5116Po.setExtracode2(dataObject.getString(T5116Po.COLUMNS.EXTRACODE2.name())); 
			t5116Po.setExtracode3(dataObject.getString(T5116Po.COLUMNS.EXTRACODE3.name())); 
			t5116Po.setShipnote(dataObject.getString(T5116Po.COLUMNS.SHIPNOTE.name())); 
			t5116Po.setExpbagno(dataObject.getString(T5116Po.COLUMNS.EXPBAGNO.name())); 
			t5116Po.setBaghwb(dataObject.getString(T5116Po.COLUMNS.BAGHWB.name())); 
			t5116Po.setClearancetype(dataObject.getString(T5116Po.COLUMNS.CLEARANCETYPE.name())); 
			return t5116Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final T5116Po t5116Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(T5116Po.COLUMNS.CONTROLNO.name(), t5116Po.getControlno()); 
			dataObject.setValue(T5116Po.COLUMNS.WDATE.name(), t5116Po.getWdate()); 
			dataObject.setValue(T5116Po.COLUMNS.WTIME.name(), t5116Po.getWtime()); 
			dataObject.setValue(T5116Po.COLUMNS.IMPORTATIONDATE.name(), t5116Po.getImportationdate()); 
			dataObject.setValue(T5116Po.COLUMNS.FLIGHTNO.name(), t5116Po.getFlightno()); 
			dataObject.setValue(T5116Po.COLUMNS.INDICATOR.name(), t5116Po.getIndicator()); 
			dataObject.setValue(T5116Po.COLUMNS.MWB.name(), t5116Po.getMwb()); 
			dataObject.setValue(T5116Po.COLUMNS.HWB.name(), t5116Po.getHwb()); 
			dataObject.setValue(T5116Po.COLUMNS.RELEASEDATE.name(), t5116Po.getReleasedate()); 
			dataObject.setValue(T5116Po.COLUMNS.RELEASETIME.name(), t5116Po.getReleasetime()); 
			dataObject.setValue(T5116Po.COLUMNS.TTYPE.name(), t5116Po.getTtype()); 
			dataObject.setValue(T5116Po.COLUMNS.EXTRACONDITION.name(), t5116Po.getExtracondition()); 
			dataObject.setValue(T5116Po.COLUMNS.BOXNO.name(), t5116Po.getBoxno()); 
			dataObject.setValue(T5116Po.COLUMNS.DECLNO.name(), t5116Po.getDeclno()); 
			dataObject.setValue(T5116Po.COLUMNS.DECLTYPE.name(), t5116Po.getDecltype()); 
			dataObject.setValue(T5116Po.COLUMNS.QUANTITYLANDED.name(), t5116Po.getQuantitylanded()); 
			dataObject.setValue(T5116Po.COLUMNS.LANDEDUNIT.name(), t5116Po.getLandedunit()); 
			dataObject.setValue(T5116Po.COLUMNS.QUANTITYRELEASED.name(), t5116Po.getQuantityreleased()); 
			dataObject.setValue(T5116Po.COLUMNS.RELEASEDUNIT.name(), t5116Po.getReleasedunit()); 
			dataObject.setValue(T5116Po.COLUMNS.GROSSWEIGHT.name(), t5116Po.getGrossweight()); 
			dataObject.setValue(T5116Po.COLUMNS.EXAMINATIONNOTE.name(), t5116Po.getExaminationnote()); 
			dataObject.setValue(T5116Po.COLUMNS.COPACKAGE.name(), t5116Po.getCopackage()); 
			dataObject.setValue(T5116Po.COLUMNS.SENDERID.name(), t5116Po.getSenderid()); 
			dataObject.setValue(T5116Po.COLUMNS.SENDERQUALIFIER.name(), t5116Po.getSenderqualifier()); 
			dataObject.setValue(T5116Po.COLUMNS.RECEIVERID.name(), t5116Po.getReceiverid()); 
			dataObject.setValue(T5116Po.COLUMNS.RECEIVERQUALIFIER.name(), t5116Po.getReceiverqualifier()); 
			dataObject.setValue(T5116Po.COLUMNS.RELEASETYPECODE.name(), t5116Po.getReleasetypecode()); 
			dataObject.setValue(T5116Po.COLUMNS.WAREHOUSENO.name(), t5116Po.getWarehouseno()); 
			dataObject.setValue(T5116Po.COLUMNS.UNRELEASEDPIECE.name(), t5116Po.getUnreleasedpiece()); 
			dataObject.setValue(T5116Po.COLUMNS.SONO.name(), t5116Po.getSono()); 
			dataObject.setValue(T5116Po.COLUMNS.EXTRACODE1.name(), t5116Po.getExtracode1()); 
			dataObject.setValue(T5116Po.COLUMNS.EXTRACODE2.name(), t5116Po.getExtracode2()); 
			dataObject.setValue(T5116Po.COLUMNS.EXTRACODE3.name(), t5116Po.getExtracode3()); 
			dataObject.setValue(T5116Po.COLUMNS.SHIPNOTE.name(), t5116Po.getShipnote()); 
			dataObject.setValue(T5116Po.COLUMNS.EXPBAGNO.name(), t5116Po.getExpbagno()); 
			dataObject.setValue(T5116Po.COLUMNS.BAGHWB.name(), t5116Po.getBaghwb()); 
			dataObject.setValue(T5116Po.COLUMNS.CLEARANCETYPE.name(), t5116Po.getClearancetype()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<T5116Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(T5116Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
