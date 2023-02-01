package com.doc.common.dao.impl; 
 
public class ErrexpbagDAOImpl extends GeneralDAOImpl<ErrexpbagPo> implements ErrexpbagDAO { 
	public static final ErrexpbagDAOImpl INSTANCE = new ErrexpbagDAOImpl(); 
	public static final String TABLENAME = "ERREXPBAG"; 

	public ErrexpbagDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ErrexpbagPo> CONVERTER = new MapConverter<ErrexpbagPo>() { 
 
		@Override 
		public ErrexpbagPo convert(final DataObject dataObject) { 
			final ErrexpbagPo errexpbagPo = new ErrexpbagPo(); 
			errexpbagPo.setBagno(dataObject.getString(ErrexpbagPo.COLUMNS.BAGNO.name())); 
			errexpbagPo.setExpbagno(dataObject.getString(ErrexpbagPo.COLUMNS.EXPBAGNO.name())); 
			errexpbagPo.setBaghwb(BigDecimalUtils.formObj(dataObject.getValue(ErrexpbagPo.COLUMNS.BAGHWB.name()))); 
			errexpbagPo.setBagpiece(BigDecimalUtils.formObj(dataObject.getValue(ErrexpbagPo.COLUMNS.BAGPIECE.name()))); 
			errexpbagPo.setBagweight(BigDecimalUtils.formObj(dataObject.getValue(ErrexpbagPo.COLUMNS.BAGWEIGHT.name()))); 
			errexpbagPo.setBagfee(BigDecimalUtils.formObj(dataObject.getValue(ErrexpbagPo.COLUMNS.BAGFEE.name()))); 
			errexpbagPo.setExpressid(dataObject.getString(ErrexpbagPo.COLUMNS.EXPRESSID.name())); 
			errexpbagPo.setAirlineid(dataObject.getString(ErrexpbagPo.COLUMNS.AIRLINEID.name())); 
			errexpbagPo.setChargebox(dataObject.getString(ErrexpbagPo.COLUMNS.CHARGEBOX.name())); 
			errexpbagPo.setChargedate(TimestampUtils.of(dataObject.getValue(ErrexpbagPo.COLUMNS.CHARGEDATE.name()))); 
			errexpbagPo.setIe(dataObject.getString(ErrexpbagPo.COLUMNS.IE.name())); 
			errexpbagPo.setGcibagsn(BigDecimalUtils.formObj(dataObject.getValue(ErrexpbagPo.COLUMNS.GCIBAGSN.name()))); 
			errexpbagPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(ErrexpbagPo.COLUMNS.GCOBAGSN.name()))); 
			errexpbagPo.setLastupdate(TimestampUtils.of(dataObject.getValue(ErrexpbagPo.COLUMNS.LASTUPDATE.name()))); 
			errexpbagPo.setChargeuser(dataObject.getString(ErrexpbagPo.COLUMNS.CHARGEUSER.name())); 
			errexpbagPo.setExpressfee(BigDecimalUtils.formObj(dataObject.getValue(ErrexpbagPo.COLUMNS.EXPRESSFEE.name()))); 
			errexpbagPo.setAirlinefee(BigDecimalUtils.formObj(dataObject.getValue(ErrexpbagPo.COLUMNS.AIRLINEFEE.name()))); 
			errexpbagPo.setFlightno(dataObject.getString(ErrexpbagPo.COLUMNS.FLIGHTNO.name())); 
			errexpbagPo.setLastchargedate(TimestampUtils.of(dataObject.getValue(ErrexpbagPo.COLUMNS.LASTCHARGEDATE.name()))); 
			return errexpbagPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ErrexpbagPo errexpbagPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ErrexpbagPo.COLUMNS.BAGNO.name(), errexpbagPo.getBagno()); 
			dataObject.setValue(ErrexpbagPo.COLUMNS.EXPBAGNO.name(), errexpbagPo.getExpbagno()); 
			dataObject.setValue(ErrexpbagPo.COLUMNS.BAGHWB.name(), errexpbagPo.getBaghwb()); 
			dataObject.setValue(ErrexpbagPo.COLUMNS.BAGPIECE.name(), errexpbagPo.getBagpiece()); 
			dataObject.setValue(ErrexpbagPo.COLUMNS.BAGWEIGHT.name(), errexpbagPo.getBagweight()); 
			dataObject.setValue(ErrexpbagPo.COLUMNS.BAGFEE.name(), errexpbagPo.getBagfee()); 
			dataObject.setValue(ErrexpbagPo.COLUMNS.EXPRESSID.name(), errexpbagPo.getExpressid()); 
			dataObject.setValue(ErrexpbagPo.COLUMNS.AIRLINEID.name(), errexpbagPo.getAirlineid()); 
			dataObject.setValue(ErrexpbagPo.COLUMNS.CHARGEBOX.name(), errexpbagPo.getChargebox()); 
			dataObject.setValue(ErrexpbagPo.COLUMNS.CHARGEDATE.name(), errexpbagPo.getChargedate()); 
			dataObject.setValue(ErrexpbagPo.COLUMNS.IE.name(), errexpbagPo.getIe()); 
			dataObject.setValue(ErrexpbagPo.COLUMNS.GCIBAGSN.name(), errexpbagPo.getGcibagsn()); 
			dataObject.setValue(ErrexpbagPo.COLUMNS.GCOBAGSN.name(), errexpbagPo.getGcobagsn()); 
			dataObject.setValue(ErrexpbagPo.COLUMNS.LASTUPDATE.name(), errexpbagPo.getLastupdate()); 
			dataObject.setValue(ErrexpbagPo.COLUMNS.CHARGEUSER.name(), errexpbagPo.getChargeuser()); 
			dataObject.setValue(ErrexpbagPo.COLUMNS.EXPRESSFEE.name(), errexpbagPo.getExpressfee()); 
			dataObject.setValue(ErrexpbagPo.COLUMNS.AIRLINEFEE.name(), errexpbagPo.getAirlinefee()); 
			dataObject.setValue(ErrexpbagPo.COLUMNS.FLIGHTNO.name(), errexpbagPo.getFlightno()); 
			dataObject.setValue(ErrexpbagPo.COLUMNS.LASTCHARGEDATE.name(), errexpbagPo.getLastchargedate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ErrexpbagPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ErrexpbagPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
