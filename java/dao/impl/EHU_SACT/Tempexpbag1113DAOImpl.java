package com.doc.common.dao.impl; 
 
public class Tempexpbag1113DAOImpl extends GeneralDAOImpl<Tempexpbag1113Po> implements Tempexpbag1113DAO { 
	public static final Tempexpbag1113DAOImpl INSTANCE = new Tempexpbag1113DAOImpl(); 
	public static final String TABLENAME = "TEMPEXPBAG_1113"; 

	public Tempexpbag1113DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Tempexpbag1113Po> CONVERTER = new MapConverter<Tempexpbag1113Po>() { 
 
		@Override 
		public Tempexpbag1113Po convert(final DataObject dataObject) { 
			final Tempexpbag1113Po tempexpbag1113Po = new Tempexpbag1113Po(); 
			tempexpbag1113Po.setBagno(dataObject.getString(Tempexpbag1113Po.COLUMNS.BAGNO.name())); 
			tempexpbag1113Po.setExpbagno(dataObject.getString(Tempexpbag1113Po.COLUMNS.EXPBAGNO.name())); 
			tempexpbag1113Po.setBaghwb(BigDecimalUtils.formObj(dataObject.getValue(Tempexpbag1113Po.COLUMNS.BAGHWB.name()))); 
			tempexpbag1113Po.setBagpiece(BigDecimalUtils.formObj(dataObject.getValue(Tempexpbag1113Po.COLUMNS.BAGPIECE.name()))); 
			tempexpbag1113Po.setBagweight(BigDecimalUtils.formObj(dataObject.getValue(Tempexpbag1113Po.COLUMNS.BAGWEIGHT.name()))); 
			tempexpbag1113Po.setBagfee(BigDecimalUtils.formObj(dataObject.getValue(Tempexpbag1113Po.COLUMNS.BAGFEE.name()))); 
			tempexpbag1113Po.setExpressid(dataObject.getString(Tempexpbag1113Po.COLUMNS.EXPRESSID.name())); 
			tempexpbag1113Po.setAirlineid(dataObject.getString(Tempexpbag1113Po.COLUMNS.AIRLINEID.name())); 
			tempexpbag1113Po.setChargebox(dataObject.getString(Tempexpbag1113Po.COLUMNS.CHARGEBOX.name())); 
			tempexpbag1113Po.setChargedate(TimestampUtils.of(dataObject.getValue(Tempexpbag1113Po.COLUMNS.CHARGEDATE.name()))); 
			tempexpbag1113Po.setIe(dataObject.getString(Tempexpbag1113Po.COLUMNS.IE.name())); 
			tempexpbag1113Po.setGcibagsn(BigDecimalUtils.formObj(dataObject.getValue(Tempexpbag1113Po.COLUMNS.GCIBAGSN.name()))); 
			tempexpbag1113Po.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(Tempexpbag1113Po.COLUMNS.GCOBAGSN.name()))); 
			tempexpbag1113Po.setLastupdate(TimestampUtils.of(dataObject.getValue(Tempexpbag1113Po.COLUMNS.LASTUPDATE.name()))); 
			tempexpbag1113Po.setChargeuser(dataObject.getString(Tempexpbag1113Po.COLUMNS.CHARGEUSER.name())); 
			tempexpbag1113Po.setExpressfee(BigDecimalUtils.formObj(dataObject.getValue(Tempexpbag1113Po.COLUMNS.EXPRESSFEE.name()))); 
			tempexpbag1113Po.setAirlinefee(BigDecimalUtils.formObj(dataObject.getValue(Tempexpbag1113Po.COLUMNS.AIRLINEFEE.name()))); 
			tempexpbag1113Po.setFlightno(dataObject.getString(Tempexpbag1113Po.COLUMNS.FLIGHTNO.name())); 
			return tempexpbag1113Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Tempexpbag1113Po tempexpbag1113Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Tempexpbag1113Po.COLUMNS.BAGNO.name(), tempexpbag1113Po.getBagno()); 
			dataObject.setValue(Tempexpbag1113Po.COLUMNS.EXPBAGNO.name(), tempexpbag1113Po.getExpbagno()); 
			dataObject.setValue(Tempexpbag1113Po.COLUMNS.BAGHWB.name(), tempexpbag1113Po.getBaghwb()); 
			dataObject.setValue(Tempexpbag1113Po.COLUMNS.BAGPIECE.name(), tempexpbag1113Po.getBagpiece()); 
			dataObject.setValue(Tempexpbag1113Po.COLUMNS.BAGWEIGHT.name(), tempexpbag1113Po.getBagweight()); 
			dataObject.setValue(Tempexpbag1113Po.COLUMNS.BAGFEE.name(), tempexpbag1113Po.getBagfee()); 
			dataObject.setValue(Tempexpbag1113Po.COLUMNS.EXPRESSID.name(), tempexpbag1113Po.getExpressid()); 
			dataObject.setValue(Tempexpbag1113Po.COLUMNS.AIRLINEID.name(), tempexpbag1113Po.getAirlineid()); 
			dataObject.setValue(Tempexpbag1113Po.COLUMNS.CHARGEBOX.name(), tempexpbag1113Po.getChargebox()); 
			dataObject.setValue(Tempexpbag1113Po.COLUMNS.CHARGEDATE.name(), tempexpbag1113Po.getChargedate()); 
			dataObject.setValue(Tempexpbag1113Po.COLUMNS.IE.name(), tempexpbag1113Po.getIe()); 
			dataObject.setValue(Tempexpbag1113Po.COLUMNS.GCIBAGSN.name(), tempexpbag1113Po.getGcibagsn()); 
			dataObject.setValue(Tempexpbag1113Po.COLUMNS.GCOBAGSN.name(), tempexpbag1113Po.getGcobagsn()); 
			dataObject.setValue(Tempexpbag1113Po.COLUMNS.LASTUPDATE.name(), tempexpbag1113Po.getLastupdate()); 
			dataObject.setValue(Tempexpbag1113Po.COLUMNS.CHARGEUSER.name(), tempexpbag1113Po.getChargeuser()); 
			dataObject.setValue(Tempexpbag1113Po.COLUMNS.EXPRESSFEE.name(), tempexpbag1113Po.getExpressfee()); 
			dataObject.setValue(Tempexpbag1113Po.COLUMNS.AIRLINEFEE.name(), tempexpbag1113Po.getAirlinefee()); 
			dataObject.setValue(Tempexpbag1113Po.COLUMNS.FLIGHTNO.name(), tempexpbag1113Po.getFlightno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Tempexpbag1113Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Tempexpbag1113Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
