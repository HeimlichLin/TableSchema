package com.doc.common.dao.impl; 
 
public class T5116TempDAOImpl extends GeneralDAOImpl<T5116TempPo> implements T5116TempDAO { 
	public static final T5116TempDAOImpl INSTANCE = new T5116TempDAOImpl(); 
	public static final String TABLENAME = "T5116_TEMP"; 

	public T5116TempDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<T5116TempPo> CONVERTER = new MapConverter<T5116TempPo>() { 
 
		@Override 
		public T5116TempPo convert(final DataObject dataObject) { 
			final T5116TempPo t5116TempPo = new T5116TempPo(); 
			t5116TempPo.setControlno(dataObject.getString(T5116TempPo.COLUMNS.CONTROLNO.name())); 
			t5116TempPo.setWdate(dataObject.getString(T5116TempPo.COLUMNS.WDATE.name())); 
			t5116TempPo.setWtime(dataObject.getString(T5116TempPo.COLUMNS.WTIME.name())); 
			t5116TempPo.setImportationdate(dataObject.getString(T5116TempPo.COLUMNS.IMPORTATIONDATE.name())); 
			t5116TempPo.setFlightno(dataObject.getString(T5116TempPo.COLUMNS.FLIGHTNO.name())); 
			t5116TempPo.setIndicator(dataObject.getString(T5116TempPo.COLUMNS.INDICATOR.name())); 
			t5116TempPo.setMwb(dataObject.getString(T5116TempPo.COLUMNS.MWB.name())); 
			t5116TempPo.setHwb(dataObject.getString(T5116TempPo.COLUMNS.HWB.name())); 
			t5116TempPo.setReleasedate(dataObject.getString(T5116TempPo.COLUMNS.RELEASEDATE.name())); 
			t5116TempPo.setReleasetime(dataObject.getString(T5116TempPo.COLUMNS.RELEASETIME.name())); 
			t5116TempPo.setTtype(dataObject.getString(T5116TempPo.COLUMNS.TTYPE.name())); 
			t5116TempPo.setExtracondition(dataObject.getString(T5116TempPo.COLUMNS.EXTRACONDITION.name())); 
			t5116TempPo.setBoxno(dataObject.getString(T5116TempPo.COLUMNS.BOXNO.name())); 
			t5116TempPo.setDeclno(dataObject.getString(T5116TempPo.COLUMNS.DECLNO.name())); 
			t5116TempPo.setDecltype(dataObject.getString(T5116TempPo.COLUMNS.DECLTYPE.name())); 
			t5116TempPo.setQuantitylanded(BigDecimalUtils.formObj(dataObject.getValue(T5116TempPo.COLUMNS.QUANTITYLANDED.name()))); 
			t5116TempPo.setLandedunit(dataObject.getString(T5116TempPo.COLUMNS.LANDEDUNIT.name())); 
			t5116TempPo.setQuantityreleased(BigDecimalUtils.formObj(dataObject.getValue(T5116TempPo.COLUMNS.QUANTITYRELEASED.name()))); 
			t5116TempPo.setReleasedunit(dataObject.getString(T5116TempPo.COLUMNS.RELEASEDUNIT.name())); 
			t5116TempPo.setGrossweight(BigDecimalUtils.formObj(dataObject.getValue(T5116TempPo.COLUMNS.GROSSWEIGHT.name()))); 
			t5116TempPo.setExaminationnote(dataObject.getString(T5116TempPo.COLUMNS.EXAMINATIONNOTE.name())); 
			t5116TempPo.setCopackage(dataObject.getString(T5116TempPo.COLUMNS.COPACKAGE.name())); 
			t5116TempPo.setSenderid(dataObject.getString(T5116TempPo.COLUMNS.SENDERID.name())); 
			t5116TempPo.setSenderqualifier(dataObject.getString(T5116TempPo.COLUMNS.SENDERQUALIFIER.name())); 
			t5116TempPo.setReceiverid(dataObject.getString(T5116TempPo.COLUMNS.RECEIVERID.name())); 
			t5116TempPo.setReceiverqualifier(dataObject.getString(T5116TempPo.COLUMNS.RECEIVERQUALIFIER.name())); 
			t5116TempPo.setReleasetypecode(dataObject.getString(T5116TempPo.COLUMNS.RELEASETYPECODE.name())); 
			t5116TempPo.setWarehouseno(dataObject.getString(T5116TempPo.COLUMNS.WAREHOUSENO.name())); 
			t5116TempPo.setUnreleasedpiece(dataObject.getString(T5116TempPo.COLUMNS.UNRELEASEDPIECE.name())); 
			t5116TempPo.setSono(dataObject.getString(T5116TempPo.COLUMNS.SONO.name())); 
			t5116TempPo.setExtracode1(dataObject.getString(T5116TempPo.COLUMNS.EXTRACODE1.name())); 
			t5116TempPo.setExtracode2(dataObject.getString(T5116TempPo.COLUMNS.EXTRACODE2.name())); 
			t5116TempPo.setExtracode3(dataObject.getString(T5116TempPo.COLUMNS.EXTRACODE3.name())); 
			t5116TempPo.setShipnote(dataObject.getString(T5116TempPo.COLUMNS.SHIPNOTE.name())); 
			t5116TempPo.setExpbagno(dataObject.getString(T5116TempPo.COLUMNS.EXPBAGNO.name())); 
			t5116TempPo.setBaghwb(dataObject.getString(T5116TempPo.COLUMNS.BAGHWB.name())); 
			t5116TempPo.setSubboxno(dataObject.getString(T5116TempPo.COLUMNS.SUBBOXNO.name())); 
			t5116TempPo.setCcccode(dataObject.getString(T5116TempPo.COLUMNS.CCCCODE.name())); 
			t5116TempPo.setUnreleasedunit(dataObject.getString(T5116TempPo.COLUMNS.UNRELEASEDUNIT.name())); 
			t5116TempPo.setClearancetype(dataObject.getString(T5116TempPo.COLUMNS.CLEARANCETYPE.name())); 
			t5116TempPo.setImporterename(dataObject.getString(T5116TempPo.COLUMNS.IMPORTERENAME.name())); 
			t5116TempPo.setImporterid(dataObject.getString(T5116TempPo.COLUMNS.IMPORTERID.name())); 
			t5116TempPo.setMarks(dataObject.getString(T5116TempPo.COLUMNS.MARKS.name())); 
			t5116TempPo.setVehiclecode(dataObject.getString(T5116TempPo.COLUMNS.VEHICLECODE.name())); 
			t5116TempPo.setIdentitycode(dataObject.getString(T5116TempPo.COLUMNS.IDENTITYCODE.name())); 
			t5116TempPo.setShortlandednote(dataObject.getString(T5116TempPo.COLUMNS.SHORTLANDEDNOTE.name())); 
			t5116TempPo.setExtracode4(dataObject.getString(T5116TempPo.COLUMNS.EXTRACODE4.name())); 
			t5116TempPo.setExtracode5(dataObject.getString(T5116TempPo.COLUMNS.EXTRACODE5.name())); 
			t5116TempPo.setExtracode6(dataObject.getString(T5116TempPo.COLUMNS.EXTRACODE6.name())); 
			t5116TempPo.setExtracode7(dataObject.getString(T5116TempPo.COLUMNS.EXTRACODE7.name())); 
			t5116TempPo.setExtracode8(dataObject.getString(T5116TempPo.COLUMNS.EXTRACODE8.name())); 
			t5116TempPo.setExtracode9(dataObject.getString(T5116TempPo.COLUMNS.EXTRACODE9.name())); 
			t5116TempPo.setImportercname(dataObject.getString(T5116TempPo.COLUMNS.IMPORTERCNAME.name())); 
			t5116TempPo.setCustomscode(dataObject.getString(T5116TempPo.COLUMNS.CUSTOMSCODE.name())); 
			t5116TempPo.setBondedwcode(dataObject.getString(T5116TempPo.COLUMNS.BONDEDWCODE.name())); 
			t5116TempPo.setEntryofficeid(dataObject.getString(T5116TempPo.COLUMNS.ENTRYOFFICEID.name())); 
			return t5116TempPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final T5116TempPo t5116TempPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(T5116TempPo.COLUMNS.CONTROLNO.name(), t5116TempPo.getControlno()); 
			dataObject.setValue(T5116TempPo.COLUMNS.WDATE.name(), t5116TempPo.getWdate()); 
			dataObject.setValue(T5116TempPo.COLUMNS.WTIME.name(), t5116TempPo.getWtime()); 
			dataObject.setValue(T5116TempPo.COLUMNS.IMPORTATIONDATE.name(), t5116TempPo.getImportationdate()); 
			dataObject.setValue(T5116TempPo.COLUMNS.FLIGHTNO.name(), t5116TempPo.getFlightno()); 
			dataObject.setValue(T5116TempPo.COLUMNS.INDICATOR.name(), t5116TempPo.getIndicator()); 
			dataObject.setValue(T5116TempPo.COLUMNS.MWB.name(), t5116TempPo.getMwb()); 
			dataObject.setValue(T5116TempPo.COLUMNS.HWB.name(), t5116TempPo.getHwb()); 
			dataObject.setValue(T5116TempPo.COLUMNS.RELEASEDATE.name(), t5116TempPo.getReleasedate()); 
			dataObject.setValue(T5116TempPo.COLUMNS.RELEASETIME.name(), t5116TempPo.getReleasetime()); 
			dataObject.setValue(T5116TempPo.COLUMNS.TTYPE.name(), t5116TempPo.getTtype()); 
			dataObject.setValue(T5116TempPo.COLUMNS.EXTRACONDITION.name(), t5116TempPo.getExtracondition()); 
			dataObject.setValue(T5116TempPo.COLUMNS.BOXNO.name(), t5116TempPo.getBoxno()); 
			dataObject.setValue(T5116TempPo.COLUMNS.DECLNO.name(), t5116TempPo.getDeclno()); 
			dataObject.setValue(T5116TempPo.COLUMNS.DECLTYPE.name(), t5116TempPo.getDecltype()); 
			dataObject.setValue(T5116TempPo.COLUMNS.QUANTITYLANDED.name(), t5116TempPo.getQuantitylanded()); 
			dataObject.setValue(T5116TempPo.COLUMNS.LANDEDUNIT.name(), t5116TempPo.getLandedunit()); 
			dataObject.setValue(T5116TempPo.COLUMNS.QUANTITYRELEASED.name(), t5116TempPo.getQuantityreleased()); 
			dataObject.setValue(T5116TempPo.COLUMNS.RELEASEDUNIT.name(), t5116TempPo.getReleasedunit()); 
			dataObject.setValue(T5116TempPo.COLUMNS.GROSSWEIGHT.name(), t5116TempPo.getGrossweight()); 
			dataObject.setValue(T5116TempPo.COLUMNS.EXAMINATIONNOTE.name(), t5116TempPo.getExaminationnote()); 
			dataObject.setValue(T5116TempPo.COLUMNS.COPACKAGE.name(), t5116TempPo.getCopackage()); 
			dataObject.setValue(T5116TempPo.COLUMNS.SENDERID.name(), t5116TempPo.getSenderid()); 
			dataObject.setValue(T5116TempPo.COLUMNS.SENDERQUALIFIER.name(), t5116TempPo.getSenderqualifier()); 
			dataObject.setValue(T5116TempPo.COLUMNS.RECEIVERID.name(), t5116TempPo.getReceiverid()); 
			dataObject.setValue(T5116TempPo.COLUMNS.RECEIVERQUALIFIER.name(), t5116TempPo.getReceiverqualifier()); 
			dataObject.setValue(T5116TempPo.COLUMNS.RELEASETYPECODE.name(), t5116TempPo.getReleasetypecode()); 
			dataObject.setValue(T5116TempPo.COLUMNS.WAREHOUSENO.name(), t5116TempPo.getWarehouseno()); 
			dataObject.setValue(T5116TempPo.COLUMNS.UNRELEASEDPIECE.name(), t5116TempPo.getUnreleasedpiece()); 
			dataObject.setValue(T5116TempPo.COLUMNS.SONO.name(), t5116TempPo.getSono()); 
			dataObject.setValue(T5116TempPo.COLUMNS.EXTRACODE1.name(), t5116TempPo.getExtracode1()); 
			dataObject.setValue(T5116TempPo.COLUMNS.EXTRACODE2.name(), t5116TempPo.getExtracode2()); 
			dataObject.setValue(T5116TempPo.COLUMNS.EXTRACODE3.name(), t5116TempPo.getExtracode3()); 
			dataObject.setValue(T5116TempPo.COLUMNS.SHIPNOTE.name(), t5116TempPo.getShipnote()); 
			dataObject.setValue(T5116TempPo.COLUMNS.EXPBAGNO.name(), t5116TempPo.getExpbagno()); 
			dataObject.setValue(T5116TempPo.COLUMNS.BAGHWB.name(), t5116TempPo.getBaghwb()); 
			dataObject.setValue(T5116TempPo.COLUMNS.SUBBOXNO.name(), t5116TempPo.getSubboxno()); 
			dataObject.setValue(T5116TempPo.COLUMNS.CCCCODE.name(), t5116TempPo.getCcccode()); 
			dataObject.setValue(T5116TempPo.COLUMNS.UNRELEASEDUNIT.name(), t5116TempPo.getUnreleasedunit()); 
			dataObject.setValue(T5116TempPo.COLUMNS.CLEARANCETYPE.name(), t5116TempPo.getClearancetype()); 
			dataObject.setValue(T5116TempPo.COLUMNS.IMPORTERENAME.name(), t5116TempPo.getImporterename()); 
			dataObject.setValue(T5116TempPo.COLUMNS.IMPORTERID.name(), t5116TempPo.getImporterid()); 
			dataObject.setValue(T5116TempPo.COLUMNS.MARKS.name(), t5116TempPo.getMarks()); 
			dataObject.setValue(T5116TempPo.COLUMNS.VEHICLECODE.name(), t5116TempPo.getVehiclecode()); 
			dataObject.setValue(T5116TempPo.COLUMNS.IDENTITYCODE.name(), t5116TempPo.getIdentitycode()); 
			dataObject.setValue(T5116TempPo.COLUMNS.SHORTLANDEDNOTE.name(), t5116TempPo.getShortlandednote()); 
			dataObject.setValue(T5116TempPo.COLUMNS.EXTRACODE4.name(), t5116TempPo.getExtracode4()); 
			dataObject.setValue(T5116TempPo.COLUMNS.EXTRACODE5.name(), t5116TempPo.getExtracode5()); 
			dataObject.setValue(T5116TempPo.COLUMNS.EXTRACODE6.name(), t5116TempPo.getExtracode6()); 
			dataObject.setValue(T5116TempPo.COLUMNS.EXTRACODE7.name(), t5116TempPo.getExtracode7()); 
			dataObject.setValue(T5116TempPo.COLUMNS.EXTRACODE8.name(), t5116TempPo.getExtracode8()); 
			dataObject.setValue(T5116TempPo.COLUMNS.EXTRACODE9.name(), t5116TempPo.getExtracode9()); 
			dataObject.setValue(T5116TempPo.COLUMNS.IMPORTERCNAME.name(), t5116TempPo.getImportercname()); 
			dataObject.setValue(T5116TempPo.COLUMNS.CUSTOMSCODE.name(), t5116TempPo.getCustomscode()); 
			dataObject.setValue(T5116TempPo.COLUMNS.BONDEDWCODE.name(), t5116TempPo.getBondedwcode()); 
			dataObject.setValue(T5116TempPo.COLUMNS.ENTRYOFFICEID.name(), t5116TempPo.getEntryofficeid()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<T5116TempPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(T5116TempPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
