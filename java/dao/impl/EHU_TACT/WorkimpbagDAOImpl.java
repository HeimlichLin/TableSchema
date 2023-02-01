package com.doc.common.dao.impl; 
 
public class WorkimpbagDAOImpl extends GeneralDAOImpl<WorkimpbagPo> implements WorkimpbagDAO { 
	public static final WorkimpbagDAOImpl INSTANCE = new WorkimpbagDAOImpl(); 
	public static final String TABLENAME = "WORKIMPBAG"; 

	public WorkimpbagDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<WorkimpbagPo> CONVERTER = new MapConverter<WorkimpbagPo>() { 
 
		@Override 
		public WorkimpbagPo convert(final DataObject dataObject) { 
			final WorkimpbagPo workimpbagPo = new WorkimpbagPo(); 
			workimpbagPo.setBagno(dataObject.getString(WorkimpbagPo.COLUMNS.BAGNO.name())); 
			workimpbagPo.setExpbagno(dataObject.getString(WorkimpbagPo.COLUMNS.EXPBAGNO.name())); 
			workimpbagPo.setBaghwb(BigDecimalUtils.formObj(dataObject.getValue(WorkimpbagPo.COLUMNS.BAGHWB.name()))); 
			workimpbagPo.setBagpiece(BigDecimalUtils.formObj(dataObject.getValue(WorkimpbagPo.COLUMNS.BAGPIECE.name()))); 
			workimpbagPo.setBagweight(BigDecimalUtils.formObj(dataObject.getValue(WorkimpbagPo.COLUMNS.BAGWEIGHT.name()))); 
			workimpbagPo.setBagfee(BigDecimalUtils.formObj(dataObject.getValue(WorkimpbagPo.COLUMNS.BAGFEE.name()))); 
			workimpbagPo.setExpressid(dataObject.getString(WorkimpbagPo.COLUMNS.EXPRESSID.name())); 
			workimpbagPo.setAirlineid(dataObject.getString(WorkimpbagPo.COLUMNS.AIRLINEID.name())); 
			workimpbagPo.setChargebox(dataObject.getString(WorkimpbagPo.COLUMNS.CHARGEBOX.name())); 
			workimpbagPo.setChargedate(TimestampUtils.of(dataObject.getValue(WorkimpbagPo.COLUMNS.CHARGEDATE.name()))); 
			workimpbagPo.setIe(dataObject.getString(WorkimpbagPo.COLUMNS.IE.name())); 
			workimpbagPo.setGcibagsn(BigDecimalUtils.formObj(dataObject.getValue(WorkimpbagPo.COLUMNS.GCIBAGSN.name()))); 
			workimpbagPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(WorkimpbagPo.COLUMNS.GCOBAGSN.name()))); 
			workimpbagPo.setLastupdate(TimestampUtils.of(dataObject.getValue(WorkimpbagPo.COLUMNS.LASTUPDATE.name()))); 
			workimpbagPo.setChargeuser(dataObject.getString(WorkimpbagPo.COLUMNS.CHARGEUSER.name())); 
			workimpbagPo.setExpressfee(BigDecimalUtils.formObj(dataObject.getValue(WorkimpbagPo.COLUMNS.EXPRESSFEE.name()))); 
			workimpbagPo.setAirlinefee(BigDecimalUtils.formObj(dataObject.getValue(WorkimpbagPo.COLUMNS.AIRLINEFEE.name()))); 
			workimpbagPo.setFlightno(dataObject.getString(WorkimpbagPo.COLUMNS.FLIGHTNO.name())); 
			workimpbagPo.setLastchargedate(TimestampUtils.of(dataObject.getValue(WorkimpbagPo.COLUMNS.LASTCHARGEDATE.name()))); 
			workimpbagPo.setWorkarea(dataObject.getString(WorkimpbagPo.COLUMNS.WORKAREA.name())); 
			return workimpbagPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final WorkimpbagPo workimpbagPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WorkimpbagPo.COLUMNS.BAGNO.name(), workimpbagPo.getBagno()); 
			dataObject.setValue(WorkimpbagPo.COLUMNS.EXPBAGNO.name(), workimpbagPo.getExpbagno()); 
			dataObject.setValue(WorkimpbagPo.COLUMNS.BAGHWB.name(), workimpbagPo.getBaghwb()); 
			dataObject.setValue(WorkimpbagPo.COLUMNS.BAGPIECE.name(), workimpbagPo.getBagpiece()); 
			dataObject.setValue(WorkimpbagPo.COLUMNS.BAGWEIGHT.name(), workimpbagPo.getBagweight()); 
			dataObject.setValue(WorkimpbagPo.COLUMNS.BAGFEE.name(), workimpbagPo.getBagfee()); 
			dataObject.setValue(WorkimpbagPo.COLUMNS.EXPRESSID.name(), workimpbagPo.getExpressid()); 
			dataObject.setValue(WorkimpbagPo.COLUMNS.AIRLINEID.name(), workimpbagPo.getAirlineid()); 
			dataObject.setValue(WorkimpbagPo.COLUMNS.CHARGEBOX.name(), workimpbagPo.getChargebox()); 
			dataObject.setValue(WorkimpbagPo.COLUMNS.CHARGEDATE.name(), workimpbagPo.getChargedate()); 
			dataObject.setValue(WorkimpbagPo.COLUMNS.IE.name(), workimpbagPo.getIe()); 
			dataObject.setValue(WorkimpbagPo.COLUMNS.GCIBAGSN.name(), workimpbagPo.getGcibagsn()); 
			dataObject.setValue(WorkimpbagPo.COLUMNS.GCOBAGSN.name(), workimpbagPo.getGcobagsn()); 
			dataObject.setValue(WorkimpbagPo.COLUMNS.LASTUPDATE.name(), workimpbagPo.getLastupdate()); 
			dataObject.setValue(WorkimpbagPo.COLUMNS.CHARGEUSER.name(), workimpbagPo.getChargeuser()); 
			dataObject.setValue(WorkimpbagPo.COLUMNS.EXPRESSFEE.name(), workimpbagPo.getExpressfee()); 
			dataObject.setValue(WorkimpbagPo.COLUMNS.AIRLINEFEE.name(), workimpbagPo.getAirlinefee()); 
			dataObject.setValue(WorkimpbagPo.COLUMNS.FLIGHTNO.name(), workimpbagPo.getFlightno()); 
			dataObject.setValue(WorkimpbagPo.COLUMNS.LASTCHARGEDATE.name(), workimpbagPo.getLastchargedate()); 
			dataObject.setValue(WorkimpbagPo.COLUMNS.WORKAREA.name(), workimpbagPo.getWorkarea()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<WorkimpbagPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(WorkimpbagPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
