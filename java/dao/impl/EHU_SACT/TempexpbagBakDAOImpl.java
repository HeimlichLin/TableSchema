package com.doc.common.dao.impl; 
 
public class TempexpbagBakDAOImpl extends GeneralDAOImpl<TempexpbagBakPo> implements TempexpbagBakDAO { 
	public static final TempexpbagBakDAOImpl INSTANCE = new TempexpbagBakDAOImpl(); 
	public static final String TABLENAME = "TEMPEXPBAG_BAK"; 

	public TempexpbagBakDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TempexpbagBakPo> CONVERTER = new MapConverter<TempexpbagBakPo>() { 
 
		@Override 
		public TempexpbagBakPo convert(final DataObject dataObject) { 
			final TempexpbagBakPo tempexpbagBakPo = new TempexpbagBakPo(); 
			tempexpbagBakPo.setBagno(dataObject.getString(TempexpbagBakPo.COLUMNS.BAGNO.name())); 
			tempexpbagBakPo.setExpbagno(dataObject.getString(TempexpbagBakPo.COLUMNS.EXPBAGNO.name())); 
			tempexpbagBakPo.setBaghwb(BigDecimalUtils.formObj(dataObject.getValue(TempexpbagBakPo.COLUMNS.BAGHWB.name()))); 
			tempexpbagBakPo.setBagpiece(BigDecimalUtils.formObj(dataObject.getValue(TempexpbagBakPo.COLUMNS.BAGPIECE.name()))); 
			tempexpbagBakPo.setBagweight(BigDecimalUtils.formObj(dataObject.getValue(TempexpbagBakPo.COLUMNS.BAGWEIGHT.name()))); 
			tempexpbagBakPo.setBagfee(BigDecimalUtils.formObj(dataObject.getValue(TempexpbagBakPo.COLUMNS.BAGFEE.name()))); 
			tempexpbagBakPo.setExpressid(dataObject.getString(TempexpbagBakPo.COLUMNS.EXPRESSID.name())); 
			tempexpbagBakPo.setAirlineid(dataObject.getString(TempexpbagBakPo.COLUMNS.AIRLINEID.name())); 
			tempexpbagBakPo.setChargebox(dataObject.getString(TempexpbagBakPo.COLUMNS.CHARGEBOX.name())); 
			tempexpbagBakPo.setChargedate(TimestampUtils.of(dataObject.getValue(TempexpbagBakPo.COLUMNS.CHARGEDATE.name()))); 
			tempexpbagBakPo.setIe(dataObject.getString(TempexpbagBakPo.COLUMNS.IE.name())); 
			tempexpbagBakPo.setGcibagsn(BigDecimalUtils.formObj(dataObject.getValue(TempexpbagBakPo.COLUMNS.GCIBAGSN.name()))); 
			tempexpbagBakPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(TempexpbagBakPo.COLUMNS.GCOBAGSN.name()))); 
			tempexpbagBakPo.setLastupdate(TimestampUtils.of(dataObject.getValue(TempexpbagBakPo.COLUMNS.LASTUPDATE.name()))); 
			tempexpbagBakPo.setChargeuser(dataObject.getString(TempexpbagBakPo.COLUMNS.CHARGEUSER.name())); 
			tempexpbagBakPo.setExpressfee(BigDecimalUtils.formObj(dataObject.getValue(TempexpbagBakPo.COLUMNS.EXPRESSFEE.name()))); 
			tempexpbagBakPo.setAirlinefee(BigDecimalUtils.formObj(dataObject.getValue(TempexpbagBakPo.COLUMNS.AIRLINEFEE.name()))); 
			tempexpbagBakPo.setFlightno(dataObject.getString(TempexpbagBakPo.COLUMNS.FLIGHTNO.name())); 
			return tempexpbagBakPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TempexpbagBakPo tempexpbagBakPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TempexpbagBakPo.COLUMNS.BAGNO.name(), tempexpbagBakPo.getBagno()); 
			dataObject.setValue(TempexpbagBakPo.COLUMNS.EXPBAGNO.name(), tempexpbagBakPo.getExpbagno()); 
			dataObject.setValue(TempexpbagBakPo.COLUMNS.BAGHWB.name(), tempexpbagBakPo.getBaghwb()); 
			dataObject.setValue(TempexpbagBakPo.COLUMNS.BAGPIECE.name(), tempexpbagBakPo.getBagpiece()); 
			dataObject.setValue(TempexpbagBakPo.COLUMNS.BAGWEIGHT.name(), tempexpbagBakPo.getBagweight()); 
			dataObject.setValue(TempexpbagBakPo.COLUMNS.BAGFEE.name(), tempexpbagBakPo.getBagfee()); 
			dataObject.setValue(TempexpbagBakPo.COLUMNS.EXPRESSID.name(), tempexpbagBakPo.getExpressid()); 
			dataObject.setValue(TempexpbagBakPo.COLUMNS.AIRLINEID.name(), tempexpbagBakPo.getAirlineid()); 
			dataObject.setValue(TempexpbagBakPo.COLUMNS.CHARGEBOX.name(), tempexpbagBakPo.getChargebox()); 
			dataObject.setValue(TempexpbagBakPo.COLUMNS.CHARGEDATE.name(), tempexpbagBakPo.getChargedate()); 
			dataObject.setValue(TempexpbagBakPo.COLUMNS.IE.name(), tempexpbagBakPo.getIe()); 
			dataObject.setValue(TempexpbagBakPo.COLUMNS.GCIBAGSN.name(), tempexpbagBakPo.getGcibagsn()); 
			dataObject.setValue(TempexpbagBakPo.COLUMNS.GCOBAGSN.name(), tempexpbagBakPo.getGcobagsn()); 
			dataObject.setValue(TempexpbagBakPo.COLUMNS.LASTUPDATE.name(), tempexpbagBakPo.getLastupdate()); 
			dataObject.setValue(TempexpbagBakPo.COLUMNS.CHARGEUSER.name(), tempexpbagBakPo.getChargeuser()); 
			dataObject.setValue(TempexpbagBakPo.COLUMNS.EXPRESSFEE.name(), tempexpbagBakPo.getExpressfee()); 
			dataObject.setValue(TempexpbagBakPo.COLUMNS.AIRLINEFEE.name(), tempexpbagBakPo.getAirlinefee()); 
			dataObject.setValue(TempexpbagBakPo.COLUMNS.FLIGHTNO.name(), tempexpbagBakPo.getFlightno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TempexpbagBakPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TempexpbagBakPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
