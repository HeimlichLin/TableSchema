package com.doc.common.dao.impl; 
 
public class T5116Test980105DAOImpl extends GeneralDAOImpl<T5116Test980105Po> implements T5116Test980105DAO { 
	public static final T5116Test980105DAOImpl INSTANCE = new T5116Test980105DAOImpl(); 
	public static final String TABLENAME = "T5116_TEST980105"; 

	public T5116Test980105DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<T5116Test980105Po> CONVERTER = new MapConverter<T5116Test980105Po>() { 
 
		@Override 
		public T5116Test980105Po convert(final DataObject dataObject) { 
			final T5116Test980105Po t5116Test980105Po = new T5116Test980105Po(); 
			t5116Test980105Po.setControlno(dataObject.getString(T5116Test980105Po.COLUMNS.CONTROLNO.name())); 
			t5116Test980105Po.setWdate(dataObject.getString(T5116Test980105Po.COLUMNS.WDATE.name())); 
			t5116Test980105Po.setWtime(dataObject.getString(T5116Test980105Po.COLUMNS.WTIME.name())); 
			t5116Test980105Po.setImportationdate(dataObject.getString(T5116Test980105Po.COLUMNS.IMPORTATIONDATE.name())); 
			t5116Test980105Po.setFlightno(dataObject.getString(T5116Test980105Po.COLUMNS.FLIGHTNO.name())); 
			t5116Test980105Po.setIndicator(dataObject.getString(T5116Test980105Po.COLUMNS.INDICATOR.name())); 
			t5116Test980105Po.setMwb(dataObject.getString(T5116Test980105Po.COLUMNS.MWB.name())); 
			t5116Test980105Po.setHwb(dataObject.getString(T5116Test980105Po.COLUMNS.HWB.name())); 
			t5116Test980105Po.setReleasedate(dataObject.getString(T5116Test980105Po.COLUMNS.RELEASEDATE.name())); 
			t5116Test980105Po.setReleasetime(dataObject.getString(T5116Test980105Po.COLUMNS.RELEASETIME.name())); 
			t5116Test980105Po.setTtype(dataObject.getString(T5116Test980105Po.COLUMNS.TTYPE.name())); 
			t5116Test980105Po.setExtracondition(dataObject.getString(T5116Test980105Po.COLUMNS.EXTRACONDITION.name())); 
			t5116Test980105Po.setBoxno(dataObject.getString(T5116Test980105Po.COLUMNS.BOXNO.name())); 
			t5116Test980105Po.setDeclno(dataObject.getString(T5116Test980105Po.COLUMNS.DECLNO.name())); 
			t5116Test980105Po.setDecltype(dataObject.getString(T5116Test980105Po.COLUMNS.DECLTYPE.name())); 
			t5116Test980105Po.setQuantitylanded(BigDecimalUtils.formObj(dataObject.getValue(T5116Test980105Po.COLUMNS.QUANTITYLANDED.name()))); 
			t5116Test980105Po.setLandedunit(dataObject.getString(T5116Test980105Po.COLUMNS.LANDEDUNIT.name())); 
			t5116Test980105Po.setQuantityreleased(BigDecimalUtils.formObj(dataObject.getValue(T5116Test980105Po.COLUMNS.QUANTITYRELEASED.name()))); 
			t5116Test980105Po.setReleasedunit(dataObject.getString(T5116Test980105Po.COLUMNS.RELEASEDUNIT.name())); 
			t5116Test980105Po.setGrossweight(BigDecimalUtils.formObj(dataObject.getValue(T5116Test980105Po.COLUMNS.GROSSWEIGHT.name()))); 
			t5116Test980105Po.setExaminationnote(dataObject.getString(T5116Test980105Po.COLUMNS.EXAMINATIONNOTE.name())); 
			t5116Test980105Po.setCopackage(dataObject.getString(T5116Test980105Po.COLUMNS.COPACKAGE.name())); 
			t5116Test980105Po.setSenderid(dataObject.getString(T5116Test980105Po.COLUMNS.SENDERID.name())); 
			t5116Test980105Po.setSenderqualifier(dataObject.getString(T5116Test980105Po.COLUMNS.SENDERQUALIFIER.name())); 
			t5116Test980105Po.setReceiverid(dataObject.getString(T5116Test980105Po.COLUMNS.RECEIVERID.name())); 
			t5116Test980105Po.setReceiverqualifier(dataObject.getString(T5116Test980105Po.COLUMNS.RECEIVERQUALIFIER.name())); 
			return t5116Test980105Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final T5116Test980105Po t5116Test980105Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(T5116Test980105Po.COLUMNS.CONTROLNO.name(), t5116Test980105Po.getControlno()); 
			dataObject.setValue(T5116Test980105Po.COLUMNS.WDATE.name(), t5116Test980105Po.getWdate()); 
			dataObject.setValue(T5116Test980105Po.COLUMNS.WTIME.name(), t5116Test980105Po.getWtime()); 
			dataObject.setValue(T5116Test980105Po.COLUMNS.IMPORTATIONDATE.name(), t5116Test980105Po.getImportationdate()); 
			dataObject.setValue(T5116Test980105Po.COLUMNS.FLIGHTNO.name(), t5116Test980105Po.getFlightno()); 
			dataObject.setValue(T5116Test980105Po.COLUMNS.INDICATOR.name(), t5116Test980105Po.getIndicator()); 
			dataObject.setValue(T5116Test980105Po.COLUMNS.MWB.name(), t5116Test980105Po.getMwb()); 
			dataObject.setValue(T5116Test980105Po.COLUMNS.HWB.name(), t5116Test980105Po.getHwb()); 
			dataObject.setValue(T5116Test980105Po.COLUMNS.RELEASEDATE.name(), t5116Test980105Po.getReleasedate()); 
			dataObject.setValue(T5116Test980105Po.COLUMNS.RELEASETIME.name(), t5116Test980105Po.getReleasetime()); 
			dataObject.setValue(T5116Test980105Po.COLUMNS.TTYPE.name(), t5116Test980105Po.getTtype()); 
			dataObject.setValue(T5116Test980105Po.COLUMNS.EXTRACONDITION.name(), t5116Test980105Po.getExtracondition()); 
			dataObject.setValue(T5116Test980105Po.COLUMNS.BOXNO.name(), t5116Test980105Po.getBoxno()); 
			dataObject.setValue(T5116Test980105Po.COLUMNS.DECLNO.name(), t5116Test980105Po.getDeclno()); 
			dataObject.setValue(T5116Test980105Po.COLUMNS.DECLTYPE.name(), t5116Test980105Po.getDecltype()); 
			dataObject.setValue(T5116Test980105Po.COLUMNS.QUANTITYLANDED.name(), t5116Test980105Po.getQuantitylanded()); 
			dataObject.setValue(T5116Test980105Po.COLUMNS.LANDEDUNIT.name(), t5116Test980105Po.getLandedunit()); 
			dataObject.setValue(T5116Test980105Po.COLUMNS.QUANTITYRELEASED.name(), t5116Test980105Po.getQuantityreleased()); 
			dataObject.setValue(T5116Test980105Po.COLUMNS.RELEASEDUNIT.name(), t5116Test980105Po.getReleasedunit()); 
			dataObject.setValue(T5116Test980105Po.COLUMNS.GROSSWEIGHT.name(), t5116Test980105Po.getGrossweight()); 
			dataObject.setValue(T5116Test980105Po.COLUMNS.EXAMINATIONNOTE.name(), t5116Test980105Po.getExaminationnote()); 
			dataObject.setValue(T5116Test980105Po.COLUMNS.COPACKAGE.name(), t5116Test980105Po.getCopackage()); 
			dataObject.setValue(T5116Test980105Po.COLUMNS.SENDERID.name(), t5116Test980105Po.getSenderid()); 
			dataObject.setValue(T5116Test980105Po.COLUMNS.SENDERQUALIFIER.name(), t5116Test980105Po.getSenderqualifier()); 
			dataObject.setValue(T5116Test980105Po.COLUMNS.RECEIVERID.name(), t5116Test980105Po.getReceiverid()); 
			dataObject.setValue(T5116Test980105Po.COLUMNS.RECEIVERQUALIFIER.name(), t5116Test980105Po.getReceiverqualifier()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<T5116Test980105Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(T5116Test980105Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
