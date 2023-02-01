package com.doc.common.dao.impl; 
 
public class Tempimpbag1113DAOImpl extends GeneralDAOImpl<Tempimpbag1113Po> implements Tempimpbag1113DAO { 
	public static final Tempimpbag1113DAOImpl INSTANCE = new Tempimpbag1113DAOImpl(); 
	public static final String TABLENAME = "TEMPIMPBAG_1113"; 

	public Tempimpbag1113DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Tempimpbag1113Po> CONVERTER = new MapConverter<Tempimpbag1113Po>() { 
 
		@Override 
		public Tempimpbag1113Po convert(final DataObject dataObject) { 
			final Tempimpbag1113Po tempimpbag1113Po = new Tempimpbag1113Po(); 
			tempimpbag1113Po.setBagno(dataObject.getString(Tempimpbag1113Po.COLUMNS.BAGNO.name())); 
			tempimpbag1113Po.setExpbagno(dataObject.getString(Tempimpbag1113Po.COLUMNS.EXPBAGNO.name())); 
			tempimpbag1113Po.setBaghwb(BigDecimalUtils.formObj(dataObject.getValue(Tempimpbag1113Po.COLUMNS.BAGHWB.name()))); 
			tempimpbag1113Po.setBagpiece(BigDecimalUtils.formObj(dataObject.getValue(Tempimpbag1113Po.COLUMNS.BAGPIECE.name()))); 
			tempimpbag1113Po.setBagweight(BigDecimalUtils.formObj(dataObject.getValue(Tempimpbag1113Po.COLUMNS.BAGWEIGHT.name()))); 
			tempimpbag1113Po.setBagfee(BigDecimalUtils.formObj(dataObject.getValue(Tempimpbag1113Po.COLUMNS.BAGFEE.name()))); 
			tempimpbag1113Po.setExpressid(dataObject.getString(Tempimpbag1113Po.COLUMNS.EXPRESSID.name())); 
			tempimpbag1113Po.setAirlineid(dataObject.getString(Tempimpbag1113Po.COLUMNS.AIRLINEID.name())); 
			tempimpbag1113Po.setChargebox(dataObject.getString(Tempimpbag1113Po.COLUMNS.CHARGEBOX.name())); 
			tempimpbag1113Po.setChargedate(TimestampUtils.of(dataObject.getValue(Tempimpbag1113Po.COLUMNS.CHARGEDATE.name()))); 
			tempimpbag1113Po.setIe(dataObject.getString(Tempimpbag1113Po.COLUMNS.IE.name())); 
			tempimpbag1113Po.setGcibagsn(BigDecimalUtils.formObj(dataObject.getValue(Tempimpbag1113Po.COLUMNS.GCIBAGSN.name()))); 
			tempimpbag1113Po.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(Tempimpbag1113Po.COLUMNS.GCOBAGSN.name()))); 
			tempimpbag1113Po.setLastupdate(TimestampUtils.of(dataObject.getValue(Tempimpbag1113Po.COLUMNS.LASTUPDATE.name()))); 
			tempimpbag1113Po.setChargeuser(dataObject.getString(Tempimpbag1113Po.COLUMNS.CHARGEUSER.name())); 
			tempimpbag1113Po.setExpressfee(BigDecimalUtils.formObj(dataObject.getValue(Tempimpbag1113Po.COLUMNS.EXPRESSFEE.name()))); 
			tempimpbag1113Po.setAirlinefee(BigDecimalUtils.formObj(dataObject.getValue(Tempimpbag1113Po.COLUMNS.AIRLINEFEE.name()))); 
			tempimpbag1113Po.setFlightno(dataObject.getString(Tempimpbag1113Po.COLUMNS.FLIGHTNO.name())); 
			return tempimpbag1113Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Tempimpbag1113Po tempimpbag1113Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Tempimpbag1113Po.COLUMNS.BAGNO.name(), tempimpbag1113Po.getBagno()); 
			dataObject.setValue(Tempimpbag1113Po.COLUMNS.EXPBAGNO.name(), tempimpbag1113Po.getExpbagno()); 
			dataObject.setValue(Tempimpbag1113Po.COLUMNS.BAGHWB.name(), tempimpbag1113Po.getBaghwb()); 
			dataObject.setValue(Tempimpbag1113Po.COLUMNS.BAGPIECE.name(), tempimpbag1113Po.getBagpiece()); 
			dataObject.setValue(Tempimpbag1113Po.COLUMNS.BAGWEIGHT.name(), tempimpbag1113Po.getBagweight()); 
			dataObject.setValue(Tempimpbag1113Po.COLUMNS.BAGFEE.name(), tempimpbag1113Po.getBagfee()); 
			dataObject.setValue(Tempimpbag1113Po.COLUMNS.EXPRESSID.name(), tempimpbag1113Po.getExpressid()); 
			dataObject.setValue(Tempimpbag1113Po.COLUMNS.AIRLINEID.name(), tempimpbag1113Po.getAirlineid()); 
			dataObject.setValue(Tempimpbag1113Po.COLUMNS.CHARGEBOX.name(), tempimpbag1113Po.getChargebox()); 
			dataObject.setValue(Tempimpbag1113Po.COLUMNS.CHARGEDATE.name(), tempimpbag1113Po.getChargedate()); 
			dataObject.setValue(Tempimpbag1113Po.COLUMNS.IE.name(), tempimpbag1113Po.getIe()); 
			dataObject.setValue(Tempimpbag1113Po.COLUMNS.GCIBAGSN.name(), tempimpbag1113Po.getGcibagsn()); 
			dataObject.setValue(Tempimpbag1113Po.COLUMNS.GCOBAGSN.name(), tempimpbag1113Po.getGcobagsn()); 
			dataObject.setValue(Tempimpbag1113Po.COLUMNS.LASTUPDATE.name(), tempimpbag1113Po.getLastupdate()); 
			dataObject.setValue(Tempimpbag1113Po.COLUMNS.CHARGEUSER.name(), tempimpbag1113Po.getChargeuser()); 
			dataObject.setValue(Tempimpbag1113Po.COLUMNS.EXPRESSFEE.name(), tempimpbag1113Po.getExpressfee()); 
			dataObject.setValue(Tempimpbag1113Po.COLUMNS.AIRLINEFEE.name(), tempimpbag1113Po.getAirlinefee()); 
			dataObject.setValue(Tempimpbag1113Po.COLUMNS.FLIGHTNO.name(), tempimpbag1113Po.getFlightno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Tempimpbag1113Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Tempimpbag1113Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
