package com.doc.common.dao.impl; 
 
public class ImphwbdatahDAOImpl extends GeneralDAOImpl<ImphwbdatahPo> implements ImphwbdatahDAO { 
	public static final ImphwbdatahDAOImpl INSTANCE = new ImphwbdatahDAOImpl(); 
	public static final String TABLENAME = "IMPHWBDATAH"; 

	public ImphwbdatahDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ImphwbdatahPo> CONVERTER = new MapConverter<ImphwbdatahPo>() { 
 
		@Override 
		public ImphwbdatahPo convert(final DataObject dataObject) { 
			final ImphwbdatahPo imphwbdatahPo = new ImphwbdatahPo(); 
			imphwbdatahPo.setForid(dataObject.getString(ImphwbdatahPo.COLUMNS.FORID.name())); 
			imphwbdatahPo.setFlight(dataObject.getString(ImphwbdatahPo.COLUMNS.FLIGHT.name())); 
			imphwbdatahPo.setAwb(dataObject.getString(ImphwbdatahPo.COLUMNS.AWB.name())); 
			imphwbdatahPo.setHwb(dataObject.getString(ImphwbdatahPo.COLUMNS.HWB.name())); 
			imphwbdatahPo.setPc(BigDecimalUtils.formObj(dataObject.getValue(ImphwbdatahPo.COLUMNS.PC.name()))); 
			imphwbdatahPo.setCreatedate(TimestampUtils.of(dataObject.getValue(ImphwbdatahPo.COLUMNS.CREATEDATE.name()))); 
			imphwbdatahPo.setIncome(dataObject.getString(ImphwbdatahPo.COLUMNS.INCOME.name())); 
			imphwbdatahPo.setDele(dataObject.getString(ImphwbdatahPo.COLUMNS.DELE.name())); 
			imphwbdatahPo.setFlightdate(dataObject.getString(ImphwbdatahPo.COLUMNS.FLIGHTDATE.name())); 
			return imphwbdatahPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ImphwbdatahPo imphwbdatahPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ImphwbdatahPo.COLUMNS.FORID.name(), imphwbdatahPo.getForid()); 
			dataObject.setValue(ImphwbdatahPo.COLUMNS.FLIGHT.name(), imphwbdatahPo.getFlight()); 
			dataObject.setValue(ImphwbdatahPo.COLUMNS.AWB.name(), imphwbdatahPo.getAwb()); 
			dataObject.setValue(ImphwbdatahPo.COLUMNS.HWB.name(), imphwbdatahPo.getHwb()); 
			dataObject.setValue(ImphwbdatahPo.COLUMNS.PC.name(), imphwbdatahPo.getPc()); 
			dataObject.setValue(ImphwbdatahPo.COLUMNS.CREATEDATE.name(), imphwbdatahPo.getCreatedate()); 
			dataObject.setValue(ImphwbdatahPo.COLUMNS.INCOME.name(), imphwbdatahPo.getIncome()); 
			dataObject.setValue(ImphwbdatahPo.COLUMNS.DELE.name(), imphwbdatahPo.getDele()); 
			dataObject.setValue(ImphwbdatahPo.COLUMNS.FLIGHTDATE.name(), imphwbdatahPo.getFlightdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ImphwbdatahPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ImphwbdatahPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
