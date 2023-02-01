package com.doc.common.dao.impl; 
 
public class TempimpbagbDAOImpl extends GeneralDAOImpl<TempimpbagbPo> implements TempimpbagbDAO { 
	public static final TempimpbagbDAOImpl INSTANCE = new TempimpbagbDAOImpl(); 
	public static final String TABLENAME = "TEMPIMPBAGB"; 

	public TempimpbagbDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TempimpbagbPo> CONVERTER = new MapConverter<TempimpbagbPo>() { 
 
		@Override 
		public TempimpbagbPo convert(final DataObject dataObject) { 
			final TempimpbagbPo tempimpbagbPo = new TempimpbagbPo(); 
			tempimpbagbPo.setBagno(dataObject.getString(TempimpbagbPo.COLUMNS.BAGNO.name())); 
			tempimpbagbPo.setExpbagno(dataObject.getString(TempimpbagbPo.COLUMNS.EXPBAGNO.name())); 
			tempimpbagbPo.setBaghwb(BigDecimalUtils.formObj(dataObject.getValue(TempimpbagbPo.COLUMNS.BAGHWB.name()))); 
			tempimpbagbPo.setBagpiece(BigDecimalUtils.formObj(dataObject.getValue(TempimpbagbPo.COLUMNS.BAGPIECE.name()))); 
			tempimpbagbPo.setBagweight(BigDecimalUtils.formObj(dataObject.getValue(TempimpbagbPo.COLUMNS.BAGWEIGHT.name()))); 
			tempimpbagbPo.setBagfee(BigDecimalUtils.formObj(dataObject.getValue(TempimpbagbPo.COLUMNS.BAGFEE.name()))); 
			tempimpbagbPo.setExpressid(dataObject.getString(TempimpbagbPo.COLUMNS.EXPRESSID.name())); 
			tempimpbagbPo.setAirlineid(dataObject.getString(TempimpbagbPo.COLUMNS.AIRLINEID.name())); 
			tempimpbagbPo.setChargebox(dataObject.getString(TempimpbagbPo.COLUMNS.CHARGEBOX.name())); 
			tempimpbagbPo.setChargedate(TimestampUtils.of(dataObject.getValue(TempimpbagbPo.COLUMNS.CHARGEDATE.name()))); 
			tempimpbagbPo.setIe(dataObject.getString(TempimpbagbPo.COLUMNS.IE.name())); 
			tempimpbagbPo.setGcibagsn(BigDecimalUtils.formObj(dataObject.getValue(TempimpbagbPo.COLUMNS.GCIBAGSN.name()))); 
			tempimpbagbPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(TempimpbagbPo.COLUMNS.GCOBAGSN.name()))); 
			tempimpbagbPo.setLastupdate(TimestampUtils.of(dataObject.getValue(TempimpbagbPo.COLUMNS.LASTUPDATE.name()))); 
			tempimpbagbPo.setChargeuser(dataObject.getString(TempimpbagbPo.COLUMNS.CHARGEUSER.name())); 
			tempimpbagbPo.setExpressfee(BigDecimalUtils.formObj(dataObject.getValue(TempimpbagbPo.COLUMNS.EXPRESSFEE.name()))); 
			tempimpbagbPo.setAirlinefee(BigDecimalUtils.formObj(dataObject.getValue(TempimpbagbPo.COLUMNS.AIRLINEFEE.name()))); 
			tempimpbagbPo.setFlightno(dataObject.getString(TempimpbagbPo.COLUMNS.FLIGHTNO.name())); 
			return tempimpbagbPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TempimpbagbPo tempimpbagbPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TempimpbagbPo.COLUMNS.BAGNO.name(), tempimpbagbPo.getBagno()); 
			dataObject.setValue(TempimpbagbPo.COLUMNS.EXPBAGNO.name(), tempimpbagbPo.getExpbagno()); 
			dataObject.setValue(TempimpbagbPo.COLUMNS.BAGHWB.name(), tempimpbagbPo.getBaghwb()); 
			dataObject.setValue(TempimpbagbPo.COLUMNS.BAGPIECE.name(), tempimpbagbPo.getBagpiece()); 
			dataObject.setValue(TempimpbagbPo.COLUMNS.BAGWEIGHT.name(), tempimpbagbPo.getBagweight()); 
			dataObject.setValue(TempimpbagbPo.COLUMNS.BAGFEE.name(), tempimpbagbPo.getBagfee()); 
			dataObject.setValue(TempimpbagbPo.COLUMNS.EXPRESSID.name(), tempimpbagbPo.getExpressid()); 
			dataObject.setValue(TempimpbagbPo.COLUMNS.AIRLINEID.name(), tempimpbagbPo.getAirlineid()); 
			dataObject.setValue(TempimpbagbPo.COLUMNS.CHARGEBOX.name(), tempimpbagbPo.getChargebox()); 
			dataObject.setValue(TempimpbagbPo.COLUMNS.CHARGEDATE.name(), tempimpbagbPo.getChargedate()); 
			dataObject.setValue(TempimpbagbPo.COLUMNS.IE.name(), tempimpbagbPo.getIe()); 
			dataObject.setValue(TempimpbagbPo.COLUMNS.GCIBAGSN.name(), tempimpbagbPo.getGcibagsn()); 
			dataObject.setValue(TempimpbagbPo.COLUMNS.GCOBAGSN.name(), tempimpbagbPo.getGcobagsn()); 
			dataObject.setValue(TempimpbagbPo.COLUMNS.LASTUPDATE.name(), tempimpbagbPo.getLastupdate()); 
			dataObject.setValue(TempimpbagbPo.COLUMNS.CHARGEUSER.name(), tempimpbagbPo.getChargeuser()); 
			dataObject.setValue(TempimpbagbPo.COLUMNS.EXPRESSFEE.name(), tempimpbagbPo.getExpressfee()); 
			dataObject.setValue(TempimpbagbPo.COLUMNS.AIRLINEFEE.name(), tempimpbagbPo.getAirlinefee()); 
			dataObject.setValue(TempimpbagbPo.COLUMNS.FLIGHTNO.name(), tempimpbagbPo.getFlightno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TempimpbagbPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TempimpbagbPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
