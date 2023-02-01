package com.doc.common.dao.impl; 
 
public class ErrimpbagDAOImpl extends GeneralDAOImpl<ErrimpbagPo> implements ErrimpbagDAO { 
	public static final ErrimpbagDAOImpl INSTANCE = new ErrimpbagDAOImpl(); 
	public static final String TABLENAME = "ERRIMPBAG"; 

	public ErrimpbagDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ErrimpbagPo> CONVERTER = new MapConverter<ErrimpbagPo>() { 
 
		@Override 
		public ErrimpbagPo convert(final DataObject dataObject) { 
			final ErrimpbagPo errimpbagPo = new ErrimpbagPo(); 
			errimpbagPo.setBagno(dataObject.getString(ErrimpbagPo.COLUMNS.BAGNO.name())); 
			errimpbagPo.setExpbagno(dataObject.getString(ErrimpbagPo.COLUMNS.EXPBAGNO.name())); 
			errimpbagPo.setBaghwb(BigDecimalUtils.formObj(dataObject.getValue(ErrimpbagPo.COLUMNS.BAGHWB.name()))); 
			errimpbagPo.setBagpiece(BigDecimalUtils.formObj(dataObject.getValue(ErrimpbagPo.COLUMNS.BAGPIECE.name()))); 
			errimpbagPo.setBagweight(BigDecimalUtils.formObj(dataObject.getValue(ErrimpbagPo.COLUMNS.BAGWEIGHT.name()))); 
			errimpbagPo.setBagfee(BigDecimalUtils.formObj(dataObject.getValue(ErrimpbagPo.COLUMNS.BAGFEE.name()))); 
			errimpbagPo.setExpressid(dataObject.getString(ErrimpbagPo.COLUMNS.EXPRESSID.name())); 
			errimpbagPo.setAirlineid(dataObject.getString(ErrimpbagPo.COLUMNS.AIRLINEID.name())); 
			errimpbagPo.setChargebox(dataObject.getString(ErrimpbagPo.COLUMNS.CHARGEBOX.name())); 
			errimpbagPo.setChargedate(TimestampUtils.of(dataObject.getValue(ErrimpbagPo.COLUMNS.CHARGEDATE.name()))); 
			errimpbagPo.setIe(dataObject.getString(ErrimpbagPo.COLUMNS.IE.name())); 
			errimpbagPo.setGcibagsn(BigDecimalUtils.formObj(dataObject.getValue(ErrimpbagPo.COLUMNS.GCIBAGSN.name()))); 
			errimpbagPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(ErrimpbagPo.COLUMNS.GCOBAGSN.name()))); 
			errimpbagPo.setLastupdate(TimestampUtils.of(dataObject.getValue(ErrimpbagPo.COLUMNS.LASTUPDATE.name()))); 
			errimpbagPo.setChargeuser(dataObject.getString(ErrimpbagPo.COLUMNS.CHARGEUSER.name())); 
			errimpbagPo.setExpressfee(BigDecimalUtils.formObj(dataObject.getValue(ErrimpbagPo.COLUMNS.EXPRESSFEE.name()))); 
			errimpbagPo.setAirlinefee(BigDecimalUtils.formObj(dataObject.getValue(ErrimpbagPo.COLUMNS.AIRLINEFEE.name()))); 
			errimpbagPo.setFlightno(dataObject.getString(ErrimpbagPo.COLUMNS.FLIGHTNO.name())); 
			errimpbagPo.setLastchargedate(TimestampUtils.of(dataObject.getValue(ErrimpbagPo.COLUMNS.LASTCHARGEDATE.name()))); 
			return errimpbagPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ErrimpbagPo errimpbagPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ErrimpbagPo.COLUMNS.BAGNO.name(), errimpbagPo.getBagno()); 
			dataObject.setValue(ErrimpbagPo.COLUMNS.EXPBAGNO.name(), errimpbagPo.getExpbagno()); 
			dataObject.setValue(ErrimpbagPo.COLUMNS.BAGHWB.name(), errimpbagPo.getBaghwb()); 
			dataObject.setValue(ErrimpbagPo.COLUMNS.BAGPIECE.name(), errimpbagPo.getBagpiece()); 
			dataObject.setValue(ErrimpbagPo.COLUMNS.BAGWEIGHT.name(), errimpbagPo.getBagweight()); 
			dataObject.setValue(ErrimpbagPo.COLUMNS.BAGFEE.name(), errimpbagPo.getBagfee()); 
			dataObject.setValue(ErrimpbagPo.COLUMNS.EXPRESSID.name(), errimpbagPo.getExpressid()); 
			dataObject.setValue(ErrimpbagPo.COLUMNS.AIRLINEID.name(), errimpbagPo.getAirlineid()); 
			dataObject.setValue(ErrimpbagPo.COLUMNS.CHARGEBOX.name(), errimpbagPo.getChargebox()); 
			dataObject.setValue(ErrimpbagPo.COLUMNS.CHARGEDATE.name(), errimpbagPo.getChargedate()); 
			dataObject.setValue(ErrimpbagPo.COLUMNS.IE.name(), errimpbagPo.getIe()); 
			dataObject.setValue(ErrimpbagPo.COLUMNS.GCIBAGSN.name(), errimpbagPo.getGcibagsn()); 
			dataObject.setValue(ErrimpbagPo.COLUMNS.GCOBAGSN.name(), errimpbagPo.getGcobagsn()); 
			dataObject.setValue(ErrimpbagPo.COLUMNS.LASTUPDATE.name(), errimpbagPo.getLastupdate()); 
			dataObject.setValue(ErrimpbagPo.COLUMNS.CHARGEUSER.name(), errimpbagPo.getChargeuser()); 
			dataObject.setValue(ErrimpbagPo.COLUMNS.EXPRESSFEE.name(), errimpbagPo.getExpressfee()); 
			dataObject.setValue(ErrimpbagPo.COLUMNS.AIRLINEFEE.name(), errimpbagPo.getAirlinefee()); 
			dataObject.setValue(ErrimpbagPo.COLUMNS.FLIGHTNO.name(), errimpbagPo.getFlightno()); 
			dataObject.setValue(ErrimpbagPo.COLUMNS.LASTCHARGEDATE.name(), errimpbagPo.getLastchargedate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ErrimpbagPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ErrimpbagPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
