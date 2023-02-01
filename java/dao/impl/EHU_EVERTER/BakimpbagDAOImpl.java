package com.doc.common.dao.impl; 
 
public class BakimpbagDAOImpl extends GeneralDAOImpl<BakimpbagPo> implements BakimpbagDAO { 
	public static final BakimpbagDAOImpl INSTANCE = new BakimpbagDAOImpl(); 
	public static final String TABLENAME = "BAKIMPBAG"; 

	public BakimpbagDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<BakimpbagPo> CONVERTER = new MapConverter<BakimpbagPo>() { 
 
		@Override 
		public BakimpbagPo convert(final DataObject dataObject) { 
			final BakimpbagPo bakimpbagPo = new BakimpbagPo(); 
			bakimpbagPo.setBagno(dataObject.getString(BakimpbagPo.COLUMNS.BAGNO.name())); 
			bakimpbagPo.setExpbagno(dataObject.getString(BakimpbagPo.COLUMNS.EXPBAGNO.name())); 
			bakimpbagPo.setBaghwb(BigDecimalUtils.formObj(dataObject.getValue(BakimpbagPo.COLUMNS.BAGHWB.name()))); 
			bakimpbagPo.setBagpiece(BigDecimalUtils.formObj(dataObject.getValue(BakimpbagPo.COLUMNS.BAGPIECE.name()))); 
			bakimpbagPo.setBagweight(BigDecimalUtils.formObj(dataObject.getValue(BakimpbagPo.COLUMNS.BAGWEIGHT.name()))); 
			bakimpbagPo.setBagfee(BigDecimalUtils.formObj(dataObject.getValue(BakimpbagPo.COLUMNS.BAGFEE.name()))); 
			bakimpbagPo.setExpressid(dataObject.getString(BakimpbagPo.COLUMNS.EXPRESSID.name())); 
			bakimpbagPo.setAirlineid(dataObject.getString(BakimpbagPo.COLUMNS.AIRLINEID.name())); 
			bakimpbagPo.setChargebox(dataObject.getString(BakimpbagPo.COLUMNS.CHARGEBOX.name())); 
			bakimpbagPo.setChargedate(TimestampUtils.of(dataObject.getValue(BakimpbagPo.COLUMNS.CHARGEDATE.name()))); 
			bakimpbagPo.setIe(dataObject.getString(BakimpbagPo.COLUMNS.IE.name())); 
			bakimpbagPo.setGcibagsn(BigDecimalUtils.formObj(dataObject.getValue(BakimpbagPo.COLUMNS.GCIBAGSN.name()))); 
			bakimpbagPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(BakimpbagPo.COLUMNS.GCOBAGSN.name()))); 
			bakimpbagPo.setLastupdate(TimestampUtils.of(dataObject.getValue(BakimpbagPo.COLUMNS.LASTUPDATE.name()))); 
			bakimpbagPo.setChargeuser(dataObject.getString(BakimpbagPo.COLUMNS.CHARGEUSER.name())); 
			bakimpbagPo.setExpressfee(BigDecimalUtils.formObj(dataObject.getValue(BakimpbagPo.COLUMNS.EXPRESSFEE.name()))); 
			bakimpbagPo.setAirlinefee(BigDecimalUtils.formObj(dataObject.getValue(BakimpbagPo.COLUMNS.AIRLINEFEE.name()))); 
			bakimpbagPo.setFlightno(dataObject.getString(BakimpbagPo.COLUMNS.FLIGHTNO.name())); 
			return bakimpbagPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final BakimpbagPo bakimpbagPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(BakimpbagPo.COLUMNS.BAGNO.name(), bakimpbagPo.getBagno()); 
			dataObject.setValue(BakimpbagPo.COLUMNS.EXPBAGNO.name(), bakimpbagPo.getExpbagno()); 
			dataObject.setValue(BakimpbagPo.COLUMNS.BAGHWB.name(), bakimpbagPo.getBaghwb()); 
			dataObject.setValue(BakimpbagPo.COLUMNS.BAGPIECE.name(), bakimpbagPo.getBagpiece()); 
			dataObject.setValue(BakimpbagPo.COLUMNS.BAGWEIGHT.name(), bakimpbagPo.getBagweight()); 
			dataObject.setValue(BakimpbagPo.COLUMNS.BAGFEE.name(), bakimpbagPo.getBagfee()); 
			dataObject.setValue(BakimpbagPo.COLUMNS.EXPRESSID.name(), bakimpbagPo.getExpressid()); 
			dataObject.setValue(BakimpbagPo.COLUMNS.AIRLINEID.name(), bakimpbagPo.getAirlineid()); 
			dataObject.setValue(BakimpbagPo.COLUMNS.CHARGEBOX.name(), bakimpbagPo.getChargebox()); 
			dataObject.setValue(BakimpbagPo.COLUMNS.CHARGEDATE.name(), bakimpbagPo.getChargedate()); 
			dataObject.setValue(BakimpbagPo.COLUMNS.IE.name(), bakimpbagPo.getIe()); 
			dataObject.setValue(BakimpbagPo.COLUMNS.GCIBAGSN.name(), bakimpbagPo.getGcibagsn()); 
			dataObject.setValue(BakimpbagPo.COLUMNS.GCOBAGSN.name(), bakimpbagPo.getGcobagsn()); 
			dataObject.setValue(BakimpbagPo.COLUMNS.LASTUPDATE.name(), bakimpbagPo.getLastupdate()); 
			dataObject.setValue(BakimpbagPo.COLUMNS.CHARGEUSER.name(), bakimpbagPo.getChargeuser()); 
			dataObject.setValue(BakimpbagPo.COLUMNS.EXPRESSFEE.name(), bakimpbagPo.getExpressfee()); 
			dataObject.setValue(BakimpbagPo.COLUMNS.AIRLINEFEE.name(), bakimpbagPo.getAirlinefee()); 
			dataObject.setValue(BakimpbagPo.COLUMNS.FLIGHTNO.name(), bakimpbagPo.getFlightno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<BakimpbagPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(BakimpbagPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
