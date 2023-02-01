package com.doc.common.dao.impl; 
 
public class WorkexpbagBackup070316DAOImpl extends GeneralDAOImpl<WorkexpbagBackup070316Po> implements WorkexpbagBackup070316DAO { 
	public static final WorkexpbagBackup070316DAOImpl INSTANCE = new WorkexpbagBackup070316DAOImpl(); 
	public static final String TABLENAME = "WORKEXPBAG_BACKUP070316"; 

	public WorkexpbagBackup070316DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<WorkexpbagBackup070316Po> CONVERTER = new MapConverter<WorkexpbagBackup070316Po>() { 
 
		@Override 
		public WorkexpbagBackup070316Po convert(final DataObject dataObject) { 
			final WorkexpbagBackup070316Po workexpbagBackup070316Po = new WorkexpbagBackup070316Po(); 
			workexpbagBackup070316Po.setBagno(dataObject.getString(WorkexpbagBackup070316Po.COLUMNS.BAGNO.name())); 
			workexpbagBackup070316Po.setExpbagno(dataObject.getString(WorkexpbagBackup070316Po.COLUMNS.EXPBAGNO.name())); 
			workexpbagBackup070316Po.setBaghwb(BigDecimalUtils.formObj(dataObject.getValue(WorkexpbagBackup070316Po.COLUMNS.BAGHWB.name()))); 
			workexpbagBackup070316Po.setBagpiece(BigDecimalUtils.formObj(dataObject.getValue(WorkexpbagBackup070316Po.COLUMNS.BAGPIECE.name()))); 
			workexpbagBackup070316Po.setBagweight(BigDecimalUtils.formObj(dataObject.getValue(WorkexpbagBackup070316Po.COLUMNS.BAGWEIGHT.name()))); 
			workexpbagBackup070316Po.setBagfee(BigDecimalUtils.formObj(dataObject.getValue(WorkexpbagBackup070316Po.COLUMNS.BAGFEE.name()))); 
			workexpbagBackup070316Po.setExpressid(dataObject.getString(WorkexpbagBackup070316Po.COLUMNS.EXPRESSID.name())); 
			workexpbagBackup070316Po.setAirlineid(dataObject.getString(WorkexpbagBackup070316Po.COLUMNS.AIRLINEID.name())); 
			workexpbagBackup070316Po.setChargebox(dataObject.getString(WorkexpbagBackup070316Po.COLUMNS.CHARGEBOX.name())); 
			workexpbagBackup070316Po.setChargedate(TimestampUtils.of(dataObject.getValue(WorkexpbagBackup070316Po.COLUMNS.CHARGEDATE.name()))); 
			workexpbagBackup070316Po.setIe(dataObject.getString(WorkexpbagBackup070316Po.COLUMNS.IE.name())); 
			workexpbagBackup070316Po.setGcibagsn(BigDecimalUtils.formObj(dataObject.getValue(WorkexpbagBackup070316Po.COLUMNS.GCIBAGSN.name()))); 
			workexpbagBackup070316Po.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(WorkexpbagBackup070316Po.COLUMNS.GCOBAGSN.name()))); 
			workexpbagBackup070316Po.setLastupdate(TimestampUtils.of(dataObject.getValue(WorkexpbagBackup070316Po.COLUMNS.LASTUPDATE.name()))); 
			workexpbagBackup070316Po.setChargeuser(dataObject.getString(WorkexpbagBackup070316Po.COLUMNS.CHARGEUSER.name())); 
			workexpbagBackup070316Po.setExpressfee(BigDecimalUtils.formObj(dataObject.getValue(WorkexpbagBackup070316Po.COLUMNS.EXPRESSFEE.name()))); 
			workexpbagBackup070316Po.setAirlinefee(BigDecimalUtils.formObj(dataObject.getValue(WorkexpbagBackup070316Po.COLUMNS.AIRLINEFEE.name()))); 
			workexpbagBackup070316Po.setFlightno(dataObject.getString(WorkexpbagBackup070316Po.COLUMNS.FLIGHTNO.name())); 
			return workexpbagBackup070316Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final WorkexpbagBackup070316Po workexpbagBackup070316Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WorkexpbagBackup070316Po.COLUMNS.BAGNO.name(), workexpbagBackup070316Po.getBagno()); 
			dataObject.setValue(WorkexpbagBackup070316Po.COLUMNS.EXPBAGNO.name(), workexpbagBackup070316Po.getExpbagno()); 
			dataObject.setValue(WorkexpbagBackup070316Po.COLUMNS.BAGHWB.name(), workexpbagBackup070316Po.getBaghwb()); 
			dataObject.setValue(WorkexpbagBackup070316Po.COLUMNS.BAGPIECE.name(), workexpbagBackup070316Po.getBagpiece()); 
			dataObject.setValue(WorkexpbagBackup070316Po.COLUMNS.BAGWEIGHT.name(), workexpbagBackup070316Po.getBagweight()); 
			dataObject.setValue(WorkexpbagBackup070316Po.COLUMNS.BAGFEE.name(), workexpbagBackup070316Po.getBagfee()); 
			dataObject.setValue(WorkexpbagBackup070316Po.COLUMNS.EXPRESSID.name(), workexpbagBackup070316Po.getExpressid()); 
			dataObject.setValue(WorkexpbagBackup070316Po.COLUMNS.AIRLINEID.name(), workexpbagBackup070316Po.getAirlineid()); 
			dataObject.setValue(WorkexpbagBackup070316Po.COLUMNS.CHARGEBOX.name(), workexpbagBackup070316Po.getChargebox()); 
			dataObject.setValue(WorkexpbagBackup070316Po.COLUMNS.CHARGEDATE.name(), workexpbagBackup070316Po.getChargedate()); 
			dataObject.setValue(WorkexpbagBackup070316Po.COLUMNS.IE.name(), workexpbagBackup070316Po.getIe()); 
			dataObject.setValue(WorkexpbagBackup070316Po.COLUMNS.GCIBAGSN.name(), workexpbagBackup070316Po.getGcibagsn()); 
			dataObject.setValue(WorkexpbagBackup070316Po.COLUMNS.GCOBAGSN.name(), workexpbagBackup070316Po.getGcobagsn()); 
			dataObject.setValue(WorkexpbagBackup070316Po.COLUMNS.LASTUPDATE.name(), workexpbagBackup070316Po.getLastupdate()); 
			dataObject.setValue(WorkexpbagBackup070316Po.COLUMNS.CHARGEUSER.name(), workexpbagBackup070316Po.getChargeuser()); 
			dataObject.setValue(WorkexpbagBackup070316Po.COLUMNS.EXPRESSFEE.name(), workexpbagBackup070316Po.getExpressfee()); 
			dataObject.setValue(WorkexpbagBackup070316Po.COLUMNS.AIRLINEFEE.name(), workexpbagBackup070316Po.getAirlinefee()); 
			dataObject.setValue(WorkexpbagBackup070316Po.COLUMNS.FLIGHTNO.name(), workexpbagBackup070316Po.getFlightno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<WorkexpbagBackup070316Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(WorkexpbagBackup070316Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
