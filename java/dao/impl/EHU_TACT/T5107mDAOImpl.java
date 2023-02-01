package com.doc.common.dao.impl; 
 
public class T5107mDAOImpl extends GeneralDAOImpl<T5107mPo> implements T5107mDAO { 
	public static final T5107mDAOImpl INSTANCE = new T5107mDAOImpl(); 
	public static final String TABLENAME = "T5107M"; 

	public T5107mDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<T5107mPo> CONVERTER = new MapConverter<T5107mPo>() { 
 
		@Override 
		public T5107mPo convert(final DataObject dataObject) { 
			final T5107mPo t5107mPo = new T5107mPo(); 
			t5107mPo.setControlno(dataObject.getString(T5107mPo.COLUMNS.CONTROLNO.name())); 
			t5107mPo.setWdate(dataObject.getString(T5107mPo.COLUMNS.WDATE.name())); 
			t5107mPo.setWtime(dataObject.getString(T5107mPo.COLUMNS.WTIME.name())); 
			t5107mPo.setDeclno(dataObject.getString(T5107mPo.COLUMNS.DECLNO.name())); 
			t5107mPo.setDecltype(dataObject.getString(T5107mPo.COLUMNS.DECLTYPE.name())); 
			t5107mPo.setBoxno(dataObject.getString(T5107mPo.COLUMNS.BOXNO.name())); 
			t5107mPo.setMwb(dataObject.getString(T5107mPo.COLUMNS.MWB.name())); 
			t5107mPo.setHwb(dataObject.getString(T5107mPo.COLUMNS.HWB.name())); 
			t5107mPo.setProcessingunit(dataObject.getString(T5107mPo.COLUMNS.PROCESSINGUNIT.name())); 
			t5107mPo.setNoticedate(dataObject.getString(T5107mPo.COLUMNS.NOTICEDATE.name())); 
			t5107mPo.setDeadline(dataObject.getString(T5107mPo.COLUMNS.DEADLINE.name())); 
			t5107mPo.setReleasedate(dataObject.getString(T5107mPo.COLUMNS.RELEASEDATE.name())); 
			t5107mPo.setIndicator(dataObject.getString(T5107mPo.COLUMNS.INDICATOR.name())); 
			t5107mPo.setClearancetype(dataObject.getString(T5107mPo.COLUMNS.CLEARANCETYPE.name())); 
			t5107mPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(T5107mPo.COLUMNS.PIECE.name()))); 
			t5107mPo.setUnit(dataObject.getString(T5107mPo.COLUMNS.UNIT.name())); 
			t5107mPo.setPermitno1(dataObject.getString(T5107mPo.COLUMNS.PERMITNO1.name())); 
			t5107mPo.setPermitno2(dataObject.getString(T5107mPo.COLUMNS.PERMITNO2.name())); 
			t5107mPo.setPermitno3(dataObject.getString(T5107mPo.COLUMNS.PERMITNO3.name())); 
			t5107mPo.setPermitno4(dataObject.getString(T5107mPo.COLUMNS.PERMITNO4.name())); 
			t5107mPo.setPermitno5(dataObject.getString(T5107mPo.COLUMNS.PERMITNO5.name())); 
			t5107mPo.setPermitno6(dataObject.getString(T5107mPo.COLUMNS.PERMITNO6.name())); 
			t5107mPo.setPermitno7(dataObject.getString(T5107mPo.COLUMNS.PERMITNO7.name())); 
			t5107mPo.setPermitno8(dataObject.getString(T5107mPo.COLUMNS.PERMITNO8.name())); 
			t5107mPo.setPermitno9(dataObject.getString(T5107mPo.COLUMNS.PERMITNO9.name())); 
			t5107mPo.setPermitno10(dataObject.getString(T5107mPo.COLUMNS.PERMITNO10.name())); 
			t5107mPo.setSenderid(dataObject.getString(T5107mPo.COLUMNS.SENDERID.name())); 
			t5107mPo.setSenderqualifier(dataObject.getString(T5107mPo.COLUMNS.SENDERQUALIFIER.name())); 
			t5107mPo.setReceiverid(dataObject.getString(T5107mPo.COLUMNS.RECEIVERID.name())); 
			t5107mPo.setReceiverqualifier(dataObject.getString(T5107mPo.COLUMNS.RECEIVERQUALIFIER.name())); 
			t5107mPo.setSubboxno(dataObject.getString(T5107mPo.COLUMNS.SUBBOXNO.name())); 
			t5107mPo.setImportationDate(dataObject.getString(T5107mPo.COLUMNS.IMPORTATION_DATE.name())); 
			t5107mPo.setImpMwb(dataObject.getString(T5107mPo.COLUMNS.IMP_MWB.name())); 
			t5107mPo.setImpHwb(dataObject.getString(T5107mPo.COLUMNS.IMP_HWB.name())); 
			t5107mPo.setExpbagno(dataObject.getString(T5107mPo.COLUMNS.EXPBAGNO.name())); 
			t5107mPo.setExpbagnoPiece(BigDecimalUtils.formObj(dataObject.getValue(T5107mPo.COLUMNS.EXPBAGNO_PIECE.name()))); 
			t5107mPo.setTypecode(dataObject.getString(T5107mPo.COLUMNS.TYPECODE.name())); 
			t5107mPo.setFlightno(dataObject.getString(T5107mPo.COLUMNS.FLIGHTNO.name())); 
			t5107mPo.setVrno(dataObject.getString(T5107mPo.COLUMNS.VRNO.name())); 
			t5107mPo.setSono(dataObject.getString(T5107mPo.COLUMNS.SONO.name())); 
			t5107mPo.setCarriercode(dataObject.getString(T5107mPo.COLUMNS.CARRIERCODE.name())); 
			t5107mPo.setConsolidatorcode(dataObject.getString(T5107mPo.COLUMNS.CONSOLIDATORCODE.name())); 
			return t5107mPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final T5107mPo t5107mPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(T5107mPo.COLUMNS.CONTROLNO.name(), t5107mPo.getControlno()); 
			dataObject.setValue(T5107mPo.COLUMNS.WDATE.name(), t5107mPo.getWdate()); 
			dataObject.setValue(T5107mPo.COLUMNS.WTIME.name(), t5107mPo.getWtime()); 
			dataObject.setValue(T5107mPo.COLUMNS.DECLNO.name(), t5107mPo.getDeclno()); 
			dataObject.setValue(T5107mPo.COLUMNS.DECLTYPE.name(), t5107mPo.getDecltype()); 
			dataObject.setValue(T5107mPo.COLUMNS.BOXNO.name(), t5107mPo.getBoxno()); 
			dataObject.setValue(T5107mPo.COLUMNS.MWB.name(), t5107mPo.getMwb()); 
			dataObject.setValue(T5107mPo.COLUMNS.HWB.name(), t5107mPo.getHwb()); 
			dataObject.setValue(T5107mPo.COLUMNS.PROCESSINGUNIT.name(), t5107mPo.getProcessingunit()); 
			dataObject.setValue(T5107mPo.COLUMNS.NOTICEDATE.name(), t5107mPo.getNoticedate()); 
			dataObject.setValue(T5107mPo.COLUMNS.DEADLINE.name(), t5107mPo.getDeadline()); 
			dataObject.setValue(T5107mPo.COLUMNS.RELEASEDATE.name(), t5107mPo.getReleasedate()); 
			dataObject.setValue(T5107mPo.COLUMNS.INDICATOR.name(), t5107mPo.getIndicator()); 
			dataObject.setValue(T5107mPo.COLUMNS.CLEARANCETYPE.name(), t5107mPo.getClearancetype()); 
			dataObject.setValue(T5107mPo.COLUMNS.PIECE.name(), t5107mPo.getPiece()); 
			dataObject.setValue(T5107mPo.COLUMNS.UNIT.name(), t5107mPo.getUnit()); 
			dataObject.setValue(T5107mPo.COLUMNS.PERMITNO1.name(), t5107mPo.getPermitno1()); 
			dataObject.setValue(T5107mPo.COLUMNS.PERMITNO2.name(), t5107mPo.getPermitno2()); 
			dataObject.setValue(T5107mPo.COLUMNS.PERMITNO3.name(), t5107mPo.getPermitno3()); 
			dataObject.setValue(T5107mPo.COLUMNS.PERMITNO4.name(), t5107mPo.getPermitno4()); 
			dataObject.setValue(T5107mPo.COLUMNS.PERMITNO5.name(), t5107mPo.getPermitno5()); 
			dataObject.setValue(T5107mPo.COLUMNS.PERMITNO6.name(), t5107mPo.getPermitno6()); 
			dataObject.setValue(T5107mPo.COLUMNS.PERMITNO7.name(), t5107mPo.getPermitno7()); 
			dataObject.setValue(T5107mPo.COLUMNS.PERMITNO8.name(), t5107mPo.getPermitno8()); 
			dataObject.setValue(T5107mPo.COLUMNS.PERMITNO9.name(), t5107mPo.getPermitno9()); 
			dataObject.setValue(T5107mPo.COLUMNS.PERMITNO10.name(), t5107mPo.getPermitno10()); 
			dataObject.setValue(T5107mPo.COLUMNS.SENDERID.name(), t5107mPo.getSenderid()); 
			dataObject.setValue(T5107mPo.COLUMNS.SENDERQUALIFIER.name(), t5107mPo.getSenderqualifier()); 
			dataObject.setValue(T5107mPo.COLUMNS.RECEIVERID.name(), t5107mPo.getReceiverid()); 
			dataObject.setValue(T5107mPo.COLUMNS.RECEIVERQUALIFIER.name(), t5107mPo.getReceiverqualifier()); 
			dataObject.setValue(T5107mPo.COLUMNS.SUBBOXNO.name(), t5107mPo.getSubboxno()); 
			dataObject.setValue(T5107mPo.COLUMNS.IMPORTATION_DATE.name(), t5107mPo.getImportationDate()); 
			dataObject.setValue(T5107mPo.COLUMNS.IMP_MWB.name(), t5107mPo.getImpMwb()); 
			dataObject.setValue(T5107mPo.COLUMNS.IMP_HWB.name(), t5107mPo.getImpHwb()); 
			dataObject.setValue(T5107mPo.COLUMNS.EXPBAGNO.name(), t5107mPo.getExpbagno()); 
			dataObject.setValue(T5107mPo.COLUMNS.EXPBAGNO_PIECE.name(), t5107mPo.getExpbagnoPiece()); 
			dataObject.setValue(T5107mPo.COLUMNS.TYPECODE.name(), t5107mPo.getTypecode()); 
			dataObject.setValue(T5107mPo.COLUMNS.FLIGHTNO.name(), t5107mPo.getFlightno()); 
			dataObject.setValue(T5107mPo.COLUMNS.VRNO.name(), t5107mPo.getVrno()); 
			dataObject.setValue(T5107mPo.COLUMNS.SONO.name(), t5107mPo.getSono()); 
			dataObject.setValue(T5107mPo.COLUMNS.CARRIERCODE.name(), t5107mPo.getCarriercode()); 
			dataObject.setValue(T5107mPo.COLUMNS.CONSOLIDATORCODE.name(), t5107mPo.getConsolidatorcode()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<T5107mPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(T5107mPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
