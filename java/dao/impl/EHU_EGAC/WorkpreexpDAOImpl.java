package com.doc.common.dao.impl; 
 
public class WorkpreexpDAOImpl extends GeneralDAOImpl<WorkpreexpPo> implements WorkpreexpDAO { 
	public static final WorkpreexpDAOImpl INSTANCE = new WorkpreexpDAOImpl(); 
	public static final String TABLENAME = "WORKPREEXP"; 

	public WorkpreexpDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<WorkpreexpPo> CONVERTER = new MapConverter<WorkpreexpPo>() { 
 
		@Override 
		public WorkpreexpPo convert(final DataObject dataObject) { 
			final WorkpreexpPo workpreexpPo = new WorkpreexpPo(); 
			workpreexpPo.setDeclno(dataObject.getString(WorkpreexpPo.COLUMNS.DECLNO.name())); 
			workpreexpPo.setMwb(dataObject.getString(WorkpreexpPo.COLUMNS.MWB.name())); 
			workpreexpPo.setHwb(dataObject.getString(WorkpreexpPo.COLUMNS.HWB.name())); 
			workpreexpPo.setBoxno(dataObject.getString(WorkpreexpPo.COLUMNS.BOXNO.name())); 
			workpreexpPo.setClearancetype(dataObject.getString(WorkpreexpPo.COLUMNS.CLEARANCETYPE.name())); 
			workpreexpPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(WorkpreexpPo.COLUMNS.PIECE.name()))); 
			workpreexpPo.setUnit(dataObject.getString(WorkpreexpPo.COLUMNS.UNIT.name())); 
			workpreexpPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(WorkpreexpPo.COLUMNS.WEIGHT.name()))); 
			workpreexpPo.setExpressid(dataObject.getString(WorkpreexpPo.COLUMNS.EXPRESSID.name())); 
			workpreexpPo.setAirlineid(dataObject.getString(WorkpreexpPo.COLUMNS.AIRLINEID.name())); 
			workpreexpPo.setFlightno(dataObject.getString(WorkpreexpPo.COLUMNS.FLIGHTNO.name())); 
			workpreexpPo.setLastupdate(TimestampUtils.of(dataObject.getValue(WorkpreexpPo.COLUMNS.LASTUPDATE.name()))); 
			workpreexpPo.setDatauser(dataObject.getString(WorkpreexpPo.COLUMNS.DATAUSER.name())); 
			workpreexpPo.setDatadate(TimestampUtils.of(dataObject.getValue(WorkpreexpPo.COLUMNS.DATADATE.name()))); 
			workpreexpPo.setClearanceuser(dataObject.getString(WorkpreexpPo.COLUMNS.CLEARANCEUSER.name())); 
			workpreexpPo.setClearancedate(TimestampUtils.of(dataObject.getValue(WorkpreexpPo.COLUMNS.CLEARANCEDATE.name()))); 
			workpreexpPo.setPortuser(dataObject.getString(WorkpreexpPo.COLUMNS.PORTUSER.name())); 
			workpreexpPo.setPortdate(TimestampUtils.of(dataObject.getValue(WorkpreexpPo.COLUMNS.PORTDATE.name()))); 
			workpreexpPo.setClosemark(dataObject.getString(WorkpreexpPo.COLUMNS.CLOSEMARK.name())); 
			return workpreexpPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final WorkpreexpPo workpreexpPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WorkpreexpPo.COLUMNS.DECLNO.name(), workpreexpPo.getDeclno()); 
			dataObject.setValue(WorkpreexpPo.COLUMNS.MWB.name(), workpreexpPo.getMwb()); 
			dataObject.setValue(WorkpreexpPo.COLUMNS.HWB.name(), workpreexpPo.getHwb()); 
			dataObject.setValue(WorkpreexpPo.COLUMNS.BOXNO.name(), workpreexpPo.getBoxno()); 
			dataObject.setValue(WorkpreexpPo.COLUMNS.CLEARANCETYPE.name(), workpreexpPo.getClearancetype()); 
			dataObject.setValue(WorkpreexpPo.COLUMNS.PIECE.name(), workpreexpPo.getPiece()); 
			dataObject.setValue(WorkpreexpPo.COLUMNS.UNIT.name(), workpreexpPo.getUnit()); 
			dataObject.setValue(WorkpreexpPo.COLUMNS.WEIGHT.name(), workpreexpPo.getWeight()); 
			dataObject.setValue(WorkpreexpPo.COLUMNS.EXPRESSID.name(), workpreexpPo.getExpressid()); 
			dataObject.setValue(WorkpreexpPo.COLUMNS.AIRLINEID.name(), workpreexpPo.getAirlineid()); 
			dataObject.setValue(WorkpreexpPo.COLUMNS.FLIGHTNO.name(), workpreexpPo.getFlightno()); 
			dataObject.setValue(WorkpreexpPo.COLUMNS.LASTUPDATE.name(), workpreexpPo.getLastupdate()); 
			dataObject.setValue(WorkpreexpPo.COLUMNS.DATAUSER.name(), workpreexpPo.getDatauser()); 
			dataObject.setValue(WorkpreexpPo.COLUMNS.DATADATE.name(), workpreexpPo.getDatadate()); 
			dataObject.setValue(WorkpreexpPo.COLUMNS.CLEARANCEUSER.name(), workpreexpPo.getClearanceuser()); 
			dataObject.setValue(WorkpreexpPo.COLUMNS.CLEARANCEDATE.name(), workpreexpPo.getClearancedate()); 
			dataObject.setValue(WorkpreexpPo.COLUMNS.PORTUSER.name(), workpreexpPo.getPortuser()); 
			dataObject.setValue(WorkpreexpPo.COLUMNS.PORTDATE.name(), workpreexpPo.getPortdate()); 
			dataObject.setValue(WorkpreexpPo.COLUMNS.CLOSEMARK.name(), workpreexpPo.getClosemark()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<WorkpreexpPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(WorkpreexpPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
