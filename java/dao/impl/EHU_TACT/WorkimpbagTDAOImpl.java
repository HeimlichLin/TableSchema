package com.doc.common.dao.impl; 
 
public class WorkimpbagTDAOImpl extends GeneralDAOImpl<WorkimpbagTPo> implements WorkimpbagTDAO { 
	public static final WorkimpbagTDAOImpl INSTANCE = new WorkimpbagTDAOImpl(); 
	public static final String TABLENAME = "WORKIMPBAG_T"; 

	public WorkimpbagTDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<WorkimpbagTPo> CONVERTER = new MapConverter<WorkimpbagTPo>() { 
 
		@Override 
		public WorkimpbagTPo convert(final DataObject dataObject) { 
			final WorkimpbagTPo workimpbagTPo = new WorkimpbagTPo(); 
			workimpbagTPo.setBagno(dataObject.getString(WorkimpbagTPo.COLUMNS.BAGNO.name())); 
			workimpbagTPo.setExpbagno(dataObject.getString(WorkimpbagTPo.COLUMNS.EXPBAGNO.name())); 
			workimpbagTPo.setBaghwb(BigDecimalUtils.formObj(dataObject.getValue(WorkimpbagTPo.COLUMNS.BAGHWB.name()))); 
			workimpbagTPo.setBagpiece(BigDecimalUtils.formObj(dataObject.getValue(WorkimpbagTPo.COLUMNS.BAGPIECE.name()))); 
			workimpbagTPo.setBagweight(BigDecimalUtils.formObj(dataObject.getValue(WorkimpbagTPo.COLUMNS.BAGWEIGHT.name()))); 
			workimpbagTPo.setBagfee(BigDecimalUtils.formObj(dataObject.getValue(WorkimpbagTPo.COLUMNS.BAGFEE.name()))); 
			workimpbagTPo.setExpressid(dataObject.getString(WorkimpbagTPo.COLUMNS.EXPRESSID.name())); 
			workimpbagTPo.setAirlineid(dataObject.getString(WorkimpbagTPo.COLUMNS.AIRLINEID.name())); 
			workimpbagTPo.setChargebox(dataObject.getString(WorkimpbagTPo.COLUMNS.CHARGEBOX.name())); 
			workimpbagTPo.setChargedate(TimestampUtils.of(dataObject.getValue(WorkimpbagTPo.COLUMNS.CHARGEDATE.name()))); 
			workimpbagTPo.setIe(dataObject.getString(WorkimpbagTPo.COLUMNS.IE.name())); 
			workimpbagTPo.setGcibagsn(BigDecimalUtils.formObj(dataObject.getValue(WorkimpbagTPo.COLUMNS.GCIBAGSN.name()))); 
			workimpbagTPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(WorkimpbagTPo.COLUMNS.GCOBAGSN.name()))); 
			workimpbagTPo.setLastupdate(TimestampUtils.of(dataObject.getValue(WorkimpbagTPo.COLUMNS.LASTUPDATE.name()))); 
			workimpbagTPo.setChargeuser(dataObject.getString(WorkimpbagTPo.COLUMNS.CHARGEUSER.name())); 
			workimpbagTPo.setExpressfee(BigDecimalUtils.formObj(dataObject.getValue(WorkimpbagTPo.COLUMNS.EXPRESSFEE.name()))); 
			workimpbagTPo.setAirlinefee(BigDecimalUtils.formObj(dataObject.getValue(WorkimpbagTPo.COLUMNS.AIRLINEFEE.name()))); 
			workimpbagTPo.setFlightno(dataObject.getString(WorkimpbagTPo.COLUMNS.FLIGHTNO.name())); 
			workimpbagTPo.setLastchargedate(TimestampUtils.of(dataObject.getValue(WorkimpbagTPo.COLUMNS.LASTCHARGEDATE.name()))); 
			return workimpbagTPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final WorkimpbagTPo workimpbagTPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WorkimpbagTPo.COLUMNS.BAGNO.name(), workimpbagTPo.getBagno()); 
			dataObject.setValue(WorkimpbagTPo.COLUMNS.EXPBAGNO.name(), workimpbagTPo.getExpbagno()); 
			dataObject.setValue(WorkimpbagTPo.COLUMNS.BAGHWB.name(), workimpbagTPo.getBaghwb()); 
			dataObject.setValue(WorkimpbagTPo.COLUMNS.BAGPIECE.name(), workimpbagTPo.getBagpiece()); 
			dataObject.setValue(WorkimpbagTPo.COLUMNS.BAGWEIGHT.name(), workimpbagTPo.getBagweight()); 
			dataObject.setValue(WorkimpbagTPo.COLUMNS.BAGFEE.name(), workimpbagTPo.getBagfee()); 
			dataObject.setValue(WorkimpbagTPo.COLUMNS.EXPRESSID.name(), workimpbagTPo.getExpressid()); 
			dataObject.setValue(WorkimpbagTPo.COLUMNS.AIRLINEID.name(), workimpbagTPo.getAirlineid()); 
			dataObject.setValue(WorkimpbagTPo.COLUMNS.CHARGEBOX.name(), workimpbagTPo.getChargebox()); 
			dataObject.setValue(WorkimpbagTPo.COLUMNS.CHARGEDATE.name(), workimpbagTPo.getChargedate()); 
			dataObject.setValue(WorkimpbagTPo.COLUMNS.IE.name(), workimpbagTPo.getIe()); 
			dataObject.setValue(WorkimpbagTPo.COLUMNS.GCIBAGSN.name(), workimpbagTPo.getGcibagsn()); 
			dataObject.setValue(WorkimpbagTPo.COLUMNS.GCOBAGSN.name(), workimpbagTPo.getGcobagsn()); 
			dataObject.setValue(WorkimpbagTPo.COLUMNS.LASTUPDATE.name(), workimpbagTPo.getLastupdate()); 
			dataObject.setValue(WorkimpbagTPo.COLUMNS.CHARGEUSER.name(), workimpbagTPo.getChargeuser()); 
			dataObject.setValue(WorkimpbagTPo.COLUMNS.EXPRESSFEE.name(), workimpbagTPo.getExpressfee()); 
			dataObject.setValue(WorkimpbagTPo.COLUMNS.AIRLINEFEE.name(), workimpbagTPo.getAirlinefee()); 
			dataObject.setValue(WorkimpbagTPo.COLUMNS.FLIGHTNO.name(), workimpbagTPo.getFlightno()); 
			dataObject.setValue(WorkimpbagTPo.COLUMNS.LASTCHARGEDATE.name(), workimpbagTPo.getLastchargedate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<WorkimpbagTPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(WorkimpbagTPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
