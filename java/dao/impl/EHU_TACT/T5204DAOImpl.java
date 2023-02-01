package com.doc.common.dao.impl; 
 
public class T5204DAOImpl extends GeneralDAOImpl<T5204Po> implements T5204DAO { 
	public static final T5204DAOImpl INSTANCE = new T5204DAOImpl(); 
	public static final String TABLENAME = "T5204"; 

	public T5204DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<T5204Po> CONVERTER = new MapConverter<T5204Po>() { 
 
		@Override 
		public T5204Po convert(final DataObject dataObject) { 
			final T5204Po t5204Po = new T5204Po(); 
			t5204Po.setControlno(dataObject.getString(T5204Po.COLUMNS.CONTROLNO.name())); 
			t5204Po.setWdate(dataObject.getString(T5204Po.COLUMNS.WDATE.name())); 
			t5204Po.setWtime(dataObject.getString(T5204Po.COLUMNS.WTIME.name())); 
			t5204Po.setMwb(dataObject.getString(T5204Po.COLUMNS.MWB.name())); 
			t5204Po.setHwb(dataObject.getString(T5204Po.COLUMNS.HWB.name())); 
			t5204Po.setReleasedate(dataObject.getString(T5204Po.COLUMNS.RELEASEDATE.name())); 
			t5204Po.setReleasetime(dataObject.getString(T5204Po.COLUMNS.RELEASETIME.name())); 
			t5204Po.setTtype(dataObject.getString(T5204Po.COLUMNS.TTYPE.name())); 
			t5204Po.setExtracondition(dataObject.getString(T5204Po.COLUMNS.EXTRACONDITION.name())); 
			t5204Po.setBoxno(dataObject.getString(T5204Po.COLUMNS.BOXNO.name())); 
			t5204Po.setDeclno(dataObject.getString(T5204Po.COLUMNS.DECLNO.name())); 
			t5204Po.setDecltype(dataObject.getString(T5204Po.COLUMNS.DECLTYPE.name())); 
			t5204Po.setPiece(BigDecimalUtils.formObj(dataObject.getValue(T5204Po.COLUMNS.PIECE.name()))); 
			t5204Po.setUnit(dataObject.getString(T5204Po.COLUMNS.UNIT.name())); 
			t5204Po.setSenderid(dataObject.getString(T5204Po.COLUMNS.SENDERID.name())); 
			t5204Po.setSenderqualifier(dataObject.getString(T5204Po.COLUMNS.SENDERQUALIFIER.name())); 
			t5204Po.setReceiverid(dataObject.getString(T5204Po.COLUMNS.RECEIVERID.name())); 
			t5204Po.setReceiverqualifier(dataObject.getString(T5204Po.COLUMNS.RECEIVERQUALIFIER.name())); 
			t5204Po.setSubboxno(dataObject.getString(T5204Po.COLUMNS.SUBBOXNO.name())); 
			t5204Po.setFlightno(dataObject.getString(T5204Po.COLUMNS.FLIGHTNO.name())); 
			t5204Po.setGoodscoded(dataObject.getString(T5204Po.COLUMNS.GOODSCODED.name())); 
			t5204Po.setExporterid(dataObject.getString(T5204Po.COLUMNS.EXPORTERID.name())); 
			t5204Po.setIdentifiercoded(dataObject.getString(T5204Po.COLUMNS.IDENTIFIERCODED.name())); 
			t5204Po.setExportername(dataObject.getString(T5204Po.COLUMNS.EXPORTERNAME.name())); 
			t5204Po.setClearancetype(dataObject.getString(T5204Po.COLUMNS.CLEARANCETYPE.name())); 
			return t5204Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final T5204Po t5204Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(T5204Po.COLUMNS.CONTROLNO.name(), t5204Po.getControlno()); 
			dataObject.setValue(T5204Po.COLUMNS.WDATE.name(), t5204Po.getWdate()); 
			dataObject.setValue(T5204Po.COLUMNS.WTIME.name(), t5204Po.getWtime()); 
			dataObject.setValue(T5204Po.COLUMNS.MWB.name(), t5204Po.getMwb()); 
			dataObject.setValue(T5204Po.COLUMNS.HWB.name(), t5204Po.getHwb()); 
			dataObject.setValue(T5204Po.COLUMNS.RELEASEDATE.name(), t5204Po.getReleasedate()); 
			dataObject.setValue(T5204Po.COLUMNS.RELEASETIME.name(), t5204Po.getReleasetime()); 
			dataObject.setValue(T5204Po.COLUMNS.TTYPE.name(), t5204Po.getTtype()); 
			dataObject.setValue(T5204Po.COLUMNS.EXTRACONDITION.name(), t5204Po.getExtracondition()); 
			dataObject.setValue(T5204Po.COLUMNS.BOXNO.name(), t5204Po.getBoxno()); 
			dataObject.setValue(T5204Po.COLUMNS.DECLNO.name(), t5204Po.getDeclno()); 
			dataObject.setValue(T5204Po.COLUMNS.DECLTYPE.name(), t5204Po.getDecltype()); 
			dataObject.setValue(T5204Po.COLUMNS.PIECE.name(), t5204Po.getPiece()); 
			dataObject.setValue(T5204Po.COLUMNS.UNIT.name(), t5204Po.getUnit()); 
			dataObject.setValue(T5204Po.COLUMNS.SENDERID.name(), t5204Po.getSenderid()); 
			dataObject.setValue(T5204Po.COLUMNS.SENDERQUALIFIER.name(), t5204Po.getSenderqualifier()); 
			dataObject.setValue(T5204Po.COLUMNS.RECEIVERID.name(), t5204Po.getReceiverid()); 
			dataObject.setValue(T5204Po.COLUMNS.RECEIVERQUALIFIER.name(), t5204Po.getReceiverqualifier()); 
			dataObject.setValue(T5204Po.COLUMNS.SUBBOXNO.name(), t5204Po.getSubboxno()); 
			dataObject.setValue(T5204Po.COLUMNS.FLIGHTNO.name(), t5204Po.getFlightno()); 
			dataObject.setValue(T5204Po.COLUMNS.GOODSCODED.name(), t5204Po.getGoodscoded()); 
			dataObject.setValue(T5204Po.COLUMNS.EXPORTERID.name(), t5204Po.getExporterid()); 
			dataObject.setValue(T5204Po.COLUMNS.IDENTIFIERCODED.name(), t5204Po.getIdentifiercoded()); 
			dataObject.setValue(T5204Po.COLUMNS.EXPORTERNAME.name(), t5204Po.getExportername()); 
			dataObject.setValue(T5204Po.COLUMNS.CLEARANCETYPE.name(), t5204Po.getClearancetype()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<T5204Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(T5204Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
