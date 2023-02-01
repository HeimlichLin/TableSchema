package com.doc.common.dao.impl; 
 
public class WorkexpbagDAOImpl extends GeneralDAOImpl<WorkexpbagPo> implements WorkexpbagDAO { 
	public static final WorkexpbagDAOImpl INSTANCE = new WorkexpbagDAOImpl(); 
	public static final String TABLENAME = "WORKEXPBAG"; 

	public WorkexpbagDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<WorkexpbagPo> CONVERTER = new MapConverter<WorkexpbagPo>() { 
 
		@Override 
		public WorkexpbagPo convert(final DataObject dataObject) { 
			final WorkexpbagPo workexpbagPo = new WorkexpbagPo(); 
			workexpbagPo.setBagno(dataObject.getString(WorkexpbagPo.COLUMNS.BAGNO.name())); 
			workexpbagPo.setExpbagno(dataObject.getString(WorkexpbagPo.COLUMNS.EXPBAGNO.name())); 
			workexpbagPo.setBaghwb(BigDecimalUtils.formObj(dataObject.getValue(WorkexpbagPo.COLUMNS.BAGHWB.name()))); 
			workexpbagPo.setBagpiece(BigDecimalUtils.formObj(dataObject.getValue(WorkexpbagPo.COLUMNS.BAGPIECE.name()))); 
			workexpbagPo.setBagweight(BigDecimalUtils.formObj(dataObject.getValue(WorkexpbagPo.COLUMNS.BAGWEIGHT.name()))); 
			workexpbagPo.setBagfee(BigDecimalUtils.formObj(dataObject.getValue(WorkexpbagPo.COLUMNS.BAGFEE.name()))); 
			workexpbagPo.setExpressid(dataObject.getString(WorkexpbagPo.COLUMNS.EXPRESSID.name())); 
			workexpbagPo.setAirlineid(dataObject.getString(WorkexpbagPo.COLUMNS.AIRLINEID.name())); 
			workexpbagPo.setChargebox(dataObject.getString(WorkexpbagPo.COLUMNS.CHARGEBOX.name())); 
			workexpbagPo.setChargedate(TimestampUtils.of(dataObject.getValue(WorkexpbagPo.COLUMNS.CHARGEDATE.name()))); 
			workexpbagPo.setIe(dataObject.getString(WorkexpbagPo.COLUMNS.IE.name())); 
			workexpbagPo.setGcibagsn(BigDecimalUtils.formObj(dataObject.getValue(WorkexpbagPo.COLUMNS.GCIBAGSN.name()))); 
			workexpbagPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(WorkexpbagPo.COLUMNS.GCOBAGSN.name()))); 
			workexpbagPo.setLastupdate(TimestampUtils.of(dataObject.getValue(WorkexpbagPo.COLUMNS.LASTUPDATE.name()))); 
			workexpbagPo.setChargeuser(dataObject.getString(WorkexpbagPo.COLUMNS.CHARGEUSER.name())); 
			workexpbagPo.setExpressfee(BigDecimalUtils.formObj(dataObject.getValue(WorkexpbagPo.COLUMNS.EXPRESSFEE.name()))); 
			workexpbagPo.setAirlinefee(BigDecimalUtils.formObj(dataObject.getValue(WorkexpbagPo.COLUMNS.AIRLINEFEE.name()))); 
			workexpbagPo.setFlightno(dataObject.getString(WorkexpbagPo.COLUMNS.FLIGHTNO.name())); 
			workexpbagPo.setLastchargedate(TimestampUtils.of(dataObject.getValue(WorkexpbagPo.COLUMNS.LASTCHARGEDATE.name()))); 
			workexpbagPo.setWorkarea(dataObject.getString(WorkexpbagPo.COLUMNS.WORKAREA.name())); 
			return workexpbagPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final WorkexpbagPo workexpbagPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WorkexpbagPo.COLUMNS.BAGNO.name(), workexpbagPo.getBagno()); 
			dataObject.setValue(WorkexpbagPo.COLUMNS.EXPBAGNO.name(), workexpbagPo.getExpbagno()); 
			dataObject.setValue(WorkexpbagPo.COLUMNS.BAGHWB.name(), workexpbagPo.getBaghwb()); 
			dataObject.setValue(WorkexpbagPo.COLUMNS.BAGPIECE.name(), workexpbagPo.getBagpiece()); 
			dataObject.setValue(WorkexpbagPo.COLUMNS.BAGWEIGHT.name(), workexpbagPo.getBagweight()); 
			dataObject.setValue(WorkexpbagPo.COLUMNS.BAGFEE.name(), workexpbagPo.getBagfee()); 
			dataObject.setValue(WorkexpbagPo.COLUMNS.EXPRESSID.name(), workexpbagPo.getExpressid()); 
			dataObject.setValue(WorkexpbagPo.COLUMNS.AIRLINEID.name(), workexpbagPo.getAirlineid()); 
			dataObject.setValue(WorkexpbagPo.COLUMNS.CHARGEBOX.name(), workexpbagPo.getChargebox()); 
			dataObject.setValue(WorkexpbagPo.COLUMNS.CHARGEDATE.name(), workexpbagPo.getChargedate()); 
			dataObject.setValue(WorkexpbagPo.COLUMNS.IE.name(), workexpbagPo.getIe()); 
			dataObject.setValue(WorkexpbagPo.COLUMNS.GCIBAGSN.name(), workexpbagPo.getGcibagsn()); 
			dataObject.setValue(WorkexpbagPo.COLUMNS.GCOBAGSN.name(), workexpbagPo.getGcobagsn()); 
			dataObject.setValue(WorkexpbagPo.COLUMNS.LASTUPDATE.name(), workexpbagPo.getLastupdate()); 
			dataObject.setValue(WorkexpbagPo.COLUMNS.CHARGEUSER.name(), workexpbagPo.getChargeuser()); 
			dataObject.setValue(WorkexpbagPo.COLUMNS.EXPRESSFEE.name(), workexpbagPo.getExpressfee()); 
			dataObject.setValue(WorkexpbagPo.COLUMNS.AIRLINEFEE.name(), workexpbagPo.getAirlinefee()); 
			dataObject.setValue(WorkexpbagPo.COLUMNS.FLIGHTNO.name(), workexpbagPo.getFlightno()); 
			dataObject.setValue(WorkexpbagPo.COLUMNS.LASTCHARGEDATE.name(), workexpbagPo.getLastchargedate()); 
			dataObject.setValue(WorkexpbagPo.COLUMNS.WORKAREA.name(), workexpbagPo.getWorkarea()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<WorkexpbagPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(WorkexpbagPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
