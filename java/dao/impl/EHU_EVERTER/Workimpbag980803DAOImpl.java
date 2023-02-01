package com.doc.common.dao.impl; 
 
public class Workimpbag980803DAOImpl extends GeneralDAOImpl<Workimpbag980803Po> implements Workimpbag980803DAO { 
	public static final Workimpbag980803DAOImpl INSTANCE = new Workimpbag980803DAOImpl(); 
	public static final String TABLENAME = "WORKIMPBAG_980803"; 

	public Workimpbag980803DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Workimpbag980803Po> CONVERTER = new MapConverter<Workimpbag980803Po>() { 
 
		@Override 
		public Workimpbag980803Po convert(final DataObject dataObject) { 
			final Workimpbag980803Po workimpbag980803Po = new Workimpbag980803Po(); 
			workimpbag980803Po.setBagno(dataObject.getString(Workimpbag980803Po.COLUMNS.BAGNO.name())); 
			workimpbag980803Po.setExpbagno(dataObject.getString(Workimpbag980803Po.COLUMNS.EXPBAGNO.name())); 
			workimpbag980803Po.setBaghwb(BigDecimalUtils.formObj(dataObject.getValue(Workimpbag980803Po.COLUMNS.BAGHWB.name()))); 
			workimpbag980803Po.setBagpiece(BigDecimalUtils.formObj(dataObject.getValue(Workimpbag980803Po.COLUMNS.BAGPIECE.name()))); 
			workimpbag980803Po.setBagweight(BigDecimalUtils.formObj(dataObject.getValue(Workimpbag980803Po.COLUMNS.BAGWEIGHT.name()))); 
			workimpbag980803Po.setBagfee(BigDecimalUtils.formObj(dataObject.getValue(Workimpbag980803Po.COLUMNS.BAGFEE.name()))); 
			workimpbag980803Po.setExpressid(dataObject.getString(Workimpbag980803Po.COLUMNS.EXPRESSID.name())); 
			workimpbag980803Po.setAirlineid(dataObject.getString(Workimpbag980803Po.COLUMNS.AIRLINEID.name())); 
			workimpbag980803Po.setChargebox(dataObject.getString(Workimpbag980803Po.COLUMNS.CHARGEBOX.name())); 
			workimpbag980803Po.setChargedate(TimestampUtils.of(dataObject.getValue(Workimpbag980803Po.COLUMNS.CHARGEDATE.name()))); 
			workimpbag980803Po.setIe(dataObject.getString(Workimpbag980803Po.COLUMNS.IE.name())); 
			workimpbag980803Po.setGcibagsn(BigDecimalUtils.formObj(dataObject.getValue(Workimpbag980803Po.COLUMNS.GCIBAGSN.name()))); 
			workimpbag980803Po.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(Workimpbag980803Po.COLUMNS.GCOBAGSN.name()))); 
			workimpbag980803Po.setLastupdate(TimestampUtils.of(dataObject.getValue(Workimpbag980803Po.COLUMNS.LASTUPDATE.name()))); 
			workimpbag980803Po.setChargeuser(dataObject.getString(Workimpbag980803Po.COLUMNS.CHARGEUSER.name())); 
			workimpbag980803Po.setExpressfee(BigDecimalUtils.formObj(dataObject.getValue(Workimpbag980803Po.COLUMNS.EXPRESSFEE.name()))); 
			workimpbag980803Po.setAirlinefee(BigDecimalUtils.formObj(dataObject.getValue(Workimpbag980803Po.COLUMNS.AIRLINEFEE.name()))); 
			workimpbag980803Po.setFlightno(dataObject.getString(Workimpbag980803Po.COLUMNS.FLIGHTNO.name())); 
			return workimpbag980803Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Workimpbag980803Po workimpbag980803Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Workimpbag980803Po.COLUMNS.BAGNO.name(), workimpbag980803Po.getBagno()); 
			dataObject.setValue(Workimpbag980803Po.COLUMNS.EXPBAGNO.name(), workimpbag980803Po.getExpbagno()); 
			dataObject.setValue(Workimpbag980803Po.COLUMNS.BAGHWB.name(), workimpbag980803Po.getBaghwb()); 
			dataObject.setValue(Workimpbag980803Po.COLUMNS.BAGPIECE.name(), workimpbag980803Po.getBagpiece()); 
			dataObject.setValue(Workimpbag980803Po.COLUMNS.BAGWEIGHT.name(), workimpbag980803Po.getBagweight()); 
			dataObject.setValue(Workimpbag980803Po.COLUMNS.BAGFEE.name(), workimpbag980803Po.getBagfee()); 
			dataObject.setValue(Workimpbag980803Po.COLUMNS.EXPRESSID.name(), workimpbag980803Po.getExpressid()); 
			dataObject.setValue(Workimpbag980803Po.COLUMNS.AIRLINEID.name(), workimpbag980803Po.getAirlineid()); 
			dataObject.setValue(Workimpbag980803Po.COLUMNS.CHARGEBOX.name(), workimpbag980803Po.getChargebox()); 
			dataObject.setValue(Workimpbag980803Po.COLUMNS.CHARGEDATE.name(), workimpbag980803Po.getChargedate()); 
			dataObject.setValue(Workimpbag980803Po.COLUMNS.IE.name(), workimpbag980803Po.getIe()); 
			dataObject.setValue(Workimpbag980803Po.COLUMNS.GCIBAGSN.name(), workimpbag980803Po.getGcibagsn()); 
			dataObject.setValue(Workimpbag980803Po.COLUMNS.GCOBAGSN.name(), workimpbag980803Po.getGcobagsn()); 
			dataObject.setValue(Workimpbag980803Po.COLUMNS.LASTUPDATE.name(), workimpbag980803Po.getLastupdate()); 
			dataObject.setValue(Workimpbag980803Po.COLUMNS.CHARGEUSER.name(), workimpbag980803Po.getChargeuser()); 
			dataObject.setValue(Workimpbag980803Po.COLUMNS.EXPRESSFEE.name(), workimpbag980803Po.getExpressfee()); 
			dataObject.setValue(Workimpbag980803Po.COLUMNS.AIRLINEFEE.name(), workimpbag980803Po.getAirlinefee()); 
			dataObject.setValue(Workimpbag980803Po.COLUMNS.FLIGHTNO.name(), workimpbag980803Po.getFlightno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Workimpbag980803Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Workimpbag980803Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
