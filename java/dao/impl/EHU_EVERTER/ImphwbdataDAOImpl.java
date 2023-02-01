package com.doc.common.dao.impl; 
 
public class ImphwbdataDAOImpl extends GeneralDAOImpl<ImphwbdataPo> implements ImphwbdataDAO { 
	public static final ImphwbdataDAOImpl INSTANCE = new ImphwbdataDAOImpl(); 
	public static final String TABLENAME = "IMPHWBDATA"; 

	public ImphwbdataDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ImphwbdataPo> CONVERTER = new MapConverter<ImphwbdataPo>() { 
 
		@Override 
		public ImphwbdataPo convert(final DataObject dataObject) { 
			final ImphwbdataPo imphwbdataPo = new ImphwbdataPo(); 
			imphwbdataPo.setForid(dataObject.getString(ImphwbdataPo.COLUMNS.FORID.name())); 
			imphwbdataPo.setFlight(dataObject.getString(ImphwbdataPo.COLUMNS.FLIGHT.name())); 
			imphwbdataPo.setAwb(dataObject.getString(ImphwbdataPo.COLUMNS.AWB.name())); 
			imphwbdataPo.setHwb(dataObject.getString(ImphwbdataPo.COLUMNS.HWB.name())); 
			imphwbdataPo.setPc(BigDecimalUtils.formObj(dataObject.getValue(ImphwbdataPo.COLUMNS.PC.name()))); 
			imphwbdataPo.setCreatedate(TimestampUtils.of(dataObject.getValue(ImphwbdataPo.COLUMNS.CREATEDATE.name()))); 
			imphwbdataPo.setIncome(dataObject.getString(ImphwbdataPo.COLUMNS.INCOME.name())); 
			imphwbdataPo.setDele(dataObject.getString(ImphwbdataPo.COLUMNS.DELE.name())); 
			imphwbdataPo.setFlightdate(dataObject.getString(ImphwbdataPo.COLUMNS.FLIGHTDATE.name())); 
			return imphwbdataPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ImphwbdataPo imphwbdataPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ImphwbdataPo.COLUMNS.FORID.name(), imphwbdataPo.getForid()); 
			dataObject.setValue(ImphwbdataPo.COLUMNS.FLIGHT.name(), imphwbdataPo.getFlight()); 
			dataObject.setValue(ImphwbdataPo.COLUMNS.AWB.name(), imphwbdataPo.getAwb()); 
			dataObject.setValue(ImphwbdataPo.COLUMNS.HWB.name(), imphwbdataPo.getHwb()); 
			dataObject.setValue(ImphwbdataPo.COLUMNS.PC.name(), imphwbdataPo.getPc()); 
			dataObject.setValue(ImphwbdataPo.COLUMNS.CREATEDATE.name(), imphwbdataPo.getCreatedate()); 
			dataObject.setValue(ImphwbdataPo.COLUMNS.INCOME.name(), imphwbdataPo.getIncome()); 
			dataObject.setValue(ImphwbdataPo.COLUMNS.DELE.name(), imphwbdataPo.getDele()); 
			dataObject.setValue(ImphwbdataPo.COLUMNS.FLIGHTDATE.name(), imphwbdataPo.getFlightdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ImphwbdataPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ImphwbdataPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
