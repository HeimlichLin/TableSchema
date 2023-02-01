package com.doc.common.dao.impl; 
 
public class WorkpreimpDAOImpl extends GeneralDAOImpl<WorkpreimpPo> implements WorkpreimpDAO { 
	public static final WorkpreimpDAOImpl INSTANCE = new WorkpreimpDAOImpl(); 
	public static final String TABLENAME = "WORKPREIMP"; 

	public WorkpreimpDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<WorkpreimpPo> CONVERTER = new MapConverter<WorkpreimpPo>() { 
 
		@Override 
		public WorkpreimpPo convert(final DataObject dataObject) { 
			final WorkpreimpPo workpreimpPo = new WorkpreimpPo(); 
			workpreimpPo.setDeclno(dataObject.getString(WorkpreimpPo.COLUMNS.DECLNO.name())); 
			workpreimpPo.setMwb(dataObject.getString(WorkpreimpPo.COLUMNS.MWB.name())); 
			workpreimpPo.setHwb(dataObject.getString(WorkpreimpPo.COLUMNS.HWB.name())); 
			workpreimpPo.setBoxno(dataObject.getString(WorkpreimpPo.COLUMNS.BOXNO.name())); 
			workpreimpPo.setClearancetype(dataObject.getString(WorkpreimpPo.COLUMNS.CLEARANCETYPE.name())); 
			workpreimpPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(WorkpreimpPo.COLUMNS.PIECE.name()))); 
			workpreimpPo.setUnit(dataObject.getString(WorkpreimpPo.COLUMNS.UNIT.name())); 
			workpreimpPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(WorkpreimpPo.COLUMNS.WEIGHT.name()))); 
			workpreimpPo.setExpressid(dataObject.getString(WorkpreimpPo.COLUMNS.EXPRESSID.name())); 
			workpreimpPo.setAirlineid(dataObject.getString(WorkpreimpPo.COLUMNS.AIRLINEID.name())); 
			workpreimpPo.setFlightno(dataObject.getString(WorkpreimpPo.COLUMNS.FLIGHTNO.name())); 
			workpreimpPo.setLastupdate(TimestampUtils.of(dataObject.getValue(WorkpreimpPo.COLUMNS.LASTUPDATE.name()))); 
			workpreimpPo.setDatauser(dataObject.getString(WorkpreimpPo.COLUMNS.DATAUSER.name())); 
			workpreimpPo.setDatadate(TimestampUtils.of(dataObject.getValue(WorkpreimpPo.COLUMNS.DATADATE.name()))); 
			workpreimpPo.setClearanceuser(dataObject.getString(WorkpreimpPo.COLUMNS.CLEARANCEUSER.name())); 
			workpreimpPo.setClearancedate(TimestampUtils.of(dataObject.getValue(WorkpreimpPo.COLUMNS.CLEARANCEDATE.name()))); 
			workpreimpPo.setPortuser(dataObject.getString(WorkpreimpPo.COLUMNS.PORTUSER.name())); 
			workpreimpPo.setPortdate(TimestampUtils.of(dataObject.getValue(WorkpreimpPo.COLUMNS.PORTDATE.name()))); 
			workpreimpPo.setClosemark(dataObject.getString(WorkpreimpPo.COLUMNS.CLOSEMARK.name())); 
			return workpreimpPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final WorkpreimpPo workpreimpPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WorkpreimpPo.COLUMNS.DECLNO.name(), workpreimpPo.getDeclno()); 
			dataObject.setValue(WorkpreimpPo.COLUMNS.MWB.name(), workpreimpPo.getMwb()); 
			dataObject.setValue(WorkpreimpPo.COLUMNS.HWB.name(), workpreimpPo.getHwb()); 
			dataObject.setValue(WorkpreimpPo.COLUMNS.BOXNO.name(), workpreimpPo.getBoxno()); 
			dataObject.setValue(WorkpreimpPo.COLUMNS.CLEARANCETYPE.name(), workpreimpPo.getClearancetype()); 
			dataObject.setValue(WorkpreimpPo.COLUMNS.PIECE.name(), workpreimpPo.getPiece()); 
			dataObject.setValue(WorkpreimpPo.COLUMNS.UNIT.name(), workpreimpPo.getUnit()); 
			dataObject.setValue(WorkpreimpPo.COLUMNS.WEIGHT.name(), workpreimpPo.getWeight()); 
			dataObject.setValue(WorkpreimpPo.COLUMNS.EXPRESSID.name(), workpreimpPo.getExpressid()); 
			dataObject.setValue(WorkpreimpPo.COLUMNS.AIRLINEID.name(), workpreimpPo.getAirlineid()); 
			dataObject.setValue(WorkpreimpPo.COLUMNS.FLIGHTNO.name(), workpreimpPo.getFlightno()); 
			dataObject.setValue(WorkpreimpPo.COLUMNS.LASTUPDATE.name(), workpreimpPo.getLastupdate()); 
			dataObject.setValue(WorkpreimpPo.COLUMNS.DATAUSER.name(), workpreimpPo.getDatauser()); 
			dataObject.setValue(WorkpreimpPo.COLUMNS.DATADATE.name(), workpreimpPo.getDatadate()); 
			dataObject.setValue(WorkpreimpPo.COLUMNS.CLEARANCEUSER.name(), workpreimpPo.getClearanceuser()); 
			dataObject.setValue(WorkpreimpPo.COLUMNS.CLEARANCEDATE.name(), workpreimpPo.getClearancedate()); 
			dataObject.setValue(WorkpreimpPo.COLUMNS.PORTUSER.name(), workpreimpPo.getPortuser()); 
			dataObject.setValue(WorkpreimpPo.COLUMNS.PORTDATE.name(), workpreimpPo.getPortdate()); 
			dataObject.setValue(WorkpreimpPo.COLUMNS.CLOSEMARK.name(), workpreimpPo.getClosemark()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<WorkpreimpPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(WorkpreimpPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
