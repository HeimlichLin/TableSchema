package com.doc.common.dao.impl; 
 
public class T5107mTempDAOImpl extends GeneralDAOImpl<T5107mTempPo> implements T5107mTempDAO { 
	public static final T5107mTempDAOImpl INSTANCE = new T5107mTempDAOImpl(); 
	public static final String TABLENAME = "T5107M_TEMP"; 

	public T5107mTempDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<T5107mTempPo> CONVERTER = new MapConverter<T5107mTempPo>() { 
 
		@Override 
		public T5107mTempPo convert(final DataObject dataObject) { 
			final T5107mTempPo t5107mTempPo = new T5107mTempPo(); 
			t5107mTempPo.setControlno(dataObject.getString(T5107mTempPo.COLUMNS.CONTROLNO.name())); 
			t5107mTempPo.setWdate(dataObject.getString(T5107mTempPo.COLUMNS.WDATE.name())); 
			t5107mTempPo.setWtime(dataObject.getString(T5107mTempPo.COLUMNS.WTIME.name())); 
			t5107mTempPo.setDeclno(dataObject.getString(T5107mTempPo.COLUMNS.DECLNO.name())); 
			t5107mTempPo.setDecltype(dataObject.getString(T5107mTempPo.COLUMNS.DECLTYPE.name())); 
			t5107mTempPo.setBoxno(dataObject.getString(T5107mTempPo.COLUMNS.BOXNO.name())); 
			t5107mTempPo.setMwb(dataObject.getString(T5107mTempPo.COLUMNS.MWB.name())); 
			t5107mTempPo.setHwb(dataObject.getString(T5107mTempPo.COLUMNS.HWB.name())); 
			t5107mTempPo.setProcessingunit(dataObject.getString(T5107mTempPo.COLUMNS.PROCESSINGUNIT.name())); 
			t5107mTempPo.setNoticedate(dataObject.getString(T5107mTempPo.COLUMNS.NOTICEDATE.name())); 
			t5107mTempPo.setDeadline(dataObject.getString(T5107mTempPo.COLUMNS.DEADLINE.name())); 
			t5107mTempPo.setReleasedate(dataObject.getString(T5107mTempPo.COLUMNS.RELEASEDATE.name())); 
			t5107mTempPo.setIndicator(dataObject.getString(T5107mTempPo.COLUMNS.INDICATOR.name())); 
			t5107mTempPo.setClearancetype(dataObject.getString(T5107mTempPo.COLUMNS.CLEARANCETYPE.name())); 
			t5107mTempPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(T5107mTempPo.COLUMNS.PIECE.name()))); 
			t5107mTempPo.setUnit(dataObject.getString(T5107mTempPo.COLUMNS.UNIT.name())); 
			t5107mTempPo.setPermitno1(dataObject.getString(T5107mTempPo.COLUMNS.PERMITNO1.name())); 
			t5107mTempPo.setPermitno2(dataObject.getString(T5107mTempPo.COLUMNS.PERMITNO2.name())); 
			t5107mTempPo.setPermitno3(dataObject.getString(T5107mTempPo.COLUMNS.PERMITNO3.name())); 
			t5107mTempPo.setPermitno4(dataObject.getString(T5107mTempPo.COLUMNS.PERMITNO4.name())); 
			t5107mTempPo.setPermitno5(dataObject.getString(T5107mTempPo.COLUMNS.PERMITNO5.name())); 
			t5107mTempPo.setPermitno6(dataObject.getString(T5107mTempPo.COLUMNS.PERMITNO6.name())); 
			t5107mTempPo.setPermitno7(dataObject.getString(T5107mTempPo.COLUMNS.PERMITNO7.name())); 
			t5107mTempPo.setPermitno8(dataObject.getString(T5107mTempPo.COLUMNS.PERMITNO8.name())); 
			t5107mTempPo.setPermitno9(dataObject.getString(T5107mTempPo.COLUMNS.PERMITNO9.name())); 
			t5107mTempPo.setSenderid(dataObject.getString(T5107mTempPo.COLUMNS.SENDERID.name())); 
			t5107mTempPo.setSenderqualifier(dataObject.getString(T5107mTempPo.COLUMNS.SENDERQUALIFIER.name())); 
			t5107mTempPo.setReceiverid(dataObject.getString(T5107mTempPo.COLUMNS.RECEIVERID.name())); 
			t5107mTempPo.setReceiverqualifier(dataObject.getString(T5107mTempPo.COLUMNS.RECEIVERQUALIFIER.name())); 
			t5107mTempPo.setSubboxno(dataObject.getString(T5107mTempPo.COLUMNS.SUBBOXNO.name())); 
			t5107mTempPo.setImportationDate(dataObject.getString(T5107mTempPo.COLUMNS.IMPORTATION_DATE.name())); 
			t5107mTempPo.setImpMwb(dataObject.getString(T5107mTempPo.COLUMNS.IMP_MWB.name())); 
			t5107mTempPo.setImpHwb(dataObject.getString(T5107mTempPo.COLUMNS.IMP_HWB.name())); 
			t5107mTempPo.setExpbagno(dataObject.getString(T5107mTempPo.COLUMNS.EXPBAGNO.name())); 
			t5107mTempPo.setExpbagnoPiece(BigDecimalUtils.formObj(dataObject.getValue(T5107mTempPo.COLUMNS.EXPBAGNO_PIECE.name()))); 
			t5107mTempPo.setFlightno(dataObject.getString(T5107mTempPo.COLUMNS.FLIGHTNO.name())); 
			return t5107mTempPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final T5107mTempPo t5107mTempPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(T5107mTempPo.COLUMNS.CONTROLNO.name(), t5107mTempPo.getControlno()); 
			dataObject.setValue(T5107mTempPo.COLUMNS.WDATE.name(), t5107mTempPo.getWdate()); 
			dataObject.setValue(T5107mTempPo.COLUMNS.WTIME.name(), t5107mTempPo.getWtime()); 
			dataObject.setValue(T5107mTempPo.COLUMNS.DECLNO.name(), t5107mTempPo.getDeclno()); 
			dataObject.setValue(T5107mTempPo.COLUMNS.DECLTYPE.name(), t5107mTempPo.getDecltype()); 
			dataObject.setValue(T5107mTempPo.COLUMNS.BOXNO.name(), t5107mTempPo.getBoxno()); 
			dataObject.setValue(T5107mTempPo.COLUMNS.MWB.name(), t5107mTempPo.getMwb()); 
			dataObject.setValue(T5107mTempPo.COLUMNS.HWB.name(), t5107mTempPo.getHwb()); 
			dataObject.setValue(T5107mTempPo.COLUMNS.PROCESSINGUNIT.name(), t5107mTempPo.getProcessingunit()); 
			dataObject.setValue(T5107mTempPo.COLUMNS.NOTICEDATE.name(), t5107mTempPo.getNoticedate()); 
			dataObject.setValue(T5107mTempPo.COLUMNS.DEADLINE.name(), t5107mTempPo.getDeadline()); 
			dataObject.setValue(T5107mTempPo.COLUMNS.RELEASEDATE.name(), t5107mTempPo.getReleasedate()); 
			dataObject.setValue(T5107mTempPo.COLUMNS.INDICATOR.name(), t5107mTempPo.getIndicator()); 
			dataObject.setValue(T5107mTempPo.COLUMNS.CLEARANCETYPE.name(), t5107mTempPo.getClearancetype()); 
			dataObject.setValue(T5107mTempPo.COLUMNS.PIECE.name(), t5107mTempPo.getPiece()); 
			dataObject.setValue(T5107mTempPo.COLUMNS.UNIT.name(), t5107mTempPo.getUnit()); 
			dataObject.setValue(T5107mTempPo.COLUMNS.PERMITNO1.name(), t5107mTempPo.getPermitno1()); 
			dataObject.setValue(T5107mTempPo.COLUMNS.PERMITNO2.name(), t5107mTempPo.getPermitno2()); 
			dataObject.setValue(T5107mTempPo.COLUMNS.PERMITNO3.name(), t5107mTempPo.getPermitno3()); 
			dataObject.setValue(T5107mTempPo.COLUMNS.PERMITNO4.name(), t5107mTempPo.getPermitno4()); 
			dataObject.setValue(T5107mTempPo.COLUMNS.PERMITNO5.name(), t5107mTempPo.getPermitno5()); 
			dataObject.setValue(T5107mTempPo.COLUMNS.PERMITNO6.name(), t5107mTempPo.getPermitno6()); 
			dataObject.setValue(T5107mTempPo.COLUMNS.PERMITNO7.name(), t5107mTempPo.getPermitno7()); 
			dataObject.setValue(T5107mTempPo.COLUMNS.PERMITNO8.name(), t5107mTempPo.getPermitno8()); 
			dataObject.setValue(T5107mTempPo.COLUMNS.PERMITNO9.name(), t5107mTempPo.getPermitno9()); 
			dataObject.setValue(T5107mTempPo.COLUMNS.SENDERID.name(), t5107mTempPo.getSenderid()); 
			dataObject.setValue(T5107mTempPo.COLUMNS.SENDERQUALIFIER.name(), t5107mTempPo.getSenderqualifier()); 
			dataObject.setValue(T5107mTempPo.COLUMNS.RECEIVERID.name(), t5107mTempPo.getReceiverid()); 
			dataObject.setValue(T5107mTempPo.COLUMNS.RECEIVERQUALIFIER.name(), t5107mTempPo.getReceiverqualifier()); 
			dataObject.setValue(T5107mTempPo.COLUMNS.SUBBOXNO.name(), t5107mTempPo.getSubboxno()); 
			dataObject.setValue(T5107mTempPo.COLUMNS.IMPORTATION_DATE.name(), t5107mTempPo.getImportationDate()); 
			dataObject.setValue(T5107mTempPo.COLUMNS.IMP_MWB.name(), t5107mTempPo.getImpMwb()); 
			dataObject.setValue(T5107mTempPo.COLUMNS.IMP_HWB.name(), t5107mTempPo.getImpHwb()); 
			dataObject.setValue(T5107mTempPo.COLUMNS.EXPBAGNO.name(), t5107mTempPo.getExpbagno()); 
			dataObject.setValue(T5107mTempPo.COLUMNS.EXPBAGNO_PIECE.name(), t5107mTempPo.getExpbagnoPiece()); 
			dataObject.setValue(T5107mTempPo.COLUMNS.FLIGHTNO.name(), t5107mTempPo.getFlightno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<T5107mTempPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(T5107mTempPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
