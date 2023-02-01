package com.doc.common.dao.impl; 
 
public class TempimpbagBakDAOImpl extends GeneralDAOImpl<TempimpbagBakPo> implements TempimpbagBakDAO { 
	public static final TempimpbagBakDAOImpl INSTANCE = new TempimpbagBakDAOImpl(); 
	public static final String TABLENAME = "TEMPIMPBAG_BAK"; 

	public TempimpbagBakDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TempimpbagBakPo> CONVERTER = new MapConverter<TempimpbagBakPo>() { 
 
		@Override 
		public TempimpbagBakPo convert(final DataObject dataObject) { 
			final TempimpbagBakPo tempimpbagBakPo = new TempimpbagBakPo(); 
			tempimpbagBakPo.setBagno(dataObject.getString(TempimpbagBakPo.COLUMNS.BAGNO.name())); 
			tempimpbagBakPo.setExpbagno(dataObject.getString(TempimpbagBakPo.COLUMNS.EXPBAGNO.name())); 
			tempimpbagBakPo.setBaghwb(BigDecimalUtils.formObj(dataObject.getValue(TempimpbagBakPo.COLUMNS.BAGHWB.name()))); 
			tempimpbagBakPo.setBagpiece(BigDecimalUtils.formObj(dataObject.getValue(TempimpbagBakPo.COLUMNS.BAGPIECE.name()))); 
			tempimpbagBakPo.setBagweight(BigDecimalUtils.formObj(dataObject.getValue(TempimpbagBakPo.COLUMNS.BAGWEIGHT.name()))); 
			tempimpbagBakPo.setBagfee(BigDecimalUtils.formObj(dataObject.getValue(TempimpbagBakPo.COLUMNS.BAGFEE.name()))); 
			tempimpbagBakPo.setExpressid(dataObject.getString(TempimpbagBakPo.COLUMNS.EXPRESSID.name())); 
			tempimpbagBakPo.setAirlineid(dataObject.getString(TempimpbagBakPo.COLUMNS.AIRLINEID.name())); 
			tempimpbagBakPo.setChargebox(dataObject.getString(TempimpbagBakPo.COLUMNS.CHARGEBOX.name())); 
			tempimpbagBakPo.setChargedate(TimestampUtils.of(dataObject.getValue(TempimpbagBakPo.COLUMNS.CHARGEDATE.name()))); 
			tempimpbagBakPo.setIe(dataObject.getString(TempimpbagBakPo.COLUMNS.IE.name())); 
			tempimpbagBakPo.setGcibagsn(BigDecimalUtils.formObj(dataObject.getValue(TempimpbagBakPo.COLUMNS.GCIBAGSN.name()))); 
			tempimpbagBakPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(TempimpbagBakPo.COLUMNS.GCOBAGSN.name()))); 
			tempimpbagBakPo.setLastupdate(TimestampUtils.of(dataObject.getValue(TempimpbagBakPo.COLUMNS.LASTUPDATE.name()))); 
			tempimpbagBakPo.setChargeuser(dataObject.getString(TempimpbagBakPo.COLUMNS.CHARGEUSER.name())); 
			tempimpbagBakPo.setExpressfee(BigDecimalUtils.formObj(dataObject.getValue(TempimpbagBakPo.COLUMNS.EXPRESSFEE.name()))); 
			tempimpbagBakPo.setAirlinefee(BigDecimalUtils.formObj(dataObject.getValue(TempimpbagBakPo.COLUMNS.AIRLINEFEE.name()))); 
			tempimpbagBakPo.setFlightno(dataObject.getString(TempimpbagBakPo.COLUMNS.FLIGHTNO.name())); 
			return tempimpbagBakPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TempimpbagBakPo tempimpbagBakPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TempimpbagBakPo.COLUMNS.BAGNO.name(), tempimpbagBakPo.getBagno()); 
			dataObject.setValue(TempimpbagBakPo.COLUMNS.EXPBAGNO.name(), tempimpbagBakPo.getExpbagno()); 
			dataObject.setValue(TempimpbagBakPo.COLUMNS.BAGHWB.name(), tempimpbagBakPo.getBaghwb()); 
			dataObject.setValue(TempimpbagBakPo.COLUMNS.BAGPIECE.name(), tempimpbagBakPo.getBagpiece()); 
			dataObject.setValue(TempimpbagBakPo.COLUMNS.BAGWEIGHT.name(), tempimpbagBakPo.getBagweight()); 
			dataObject.setValue(TempimpbagBakPo.COLUMNS.BAGFEE.name(), tempimpbagBakPo.getBagfee()); 
			dataObject.setValue(TempimpbagBakPo.COLUMNS.EXPRESSID.name(), tempimpbagBakPo.getExpressid()); 
			dataObject.setValue(TempimpbagBakPo.COLUMNS.AIRLINEID.name(), tempimpbagBakPo.getAirlineid()); 
			dataObject.setValue(TempimpbagBakPo.COLUMNS.CHARGEBOX.name(), tempimpbagBakPo.getChargebox()); 
			dataObject.setValue(TempimpbagBakPo.COLUMNS.CHARGEDATE.name(), tempimpbagBakPo.getChargedate()); 
			dataObject.setValue(TempimpbagBakPo.COLUMNS.IE.name(), tempimpbagBakPo.getIe()); 
			dataObject.setValue(TempimpbagBakPo.COLUMNS.GCIBAGSN.name(), tempimpbagBakPo.getGcibagsn()); 
			dataObject.setValue(TempimpbagBakPo.COLUMNS.GCOBAGSN.name(), tempimpbagBakPo.getGcobagsn()); 
			dataObject.setValue(TempimpbagBakPo.COLUMNS.LASTUPDATE.name(), tempimpbagBakPo.getLastupdate()); 
			dataObject.setValue(TempimpbagBakPo.COLUMNS.CHARGEUSER.name(), tempimpbagBakPo.getChargeuser()); 
			dataObject.setValue(TempimpbagBakPo.COLUMNS.EXPRESSFEE.name(), tempimpbagBakPo.getExpressfee()); 
			dataObject.setValue(TempimpbagBakPo.COLUMNS.AIRLINEFEE.name(), tempimpbagBakPo.getAirlinefee()); 
			dataObject.setValue(TempimpbagBakPo.COLUMNS.FLIGHTNO.name(), tempimpbagBakPo.getFlightno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TempimpbagBakPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TempimpbagBakPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
