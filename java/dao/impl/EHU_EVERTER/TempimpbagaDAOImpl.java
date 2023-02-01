package com.doc.common.dao.impl; 
 
public class TempimpbagaDAOImpl extends GeneralDAOImpl<TempimpbagaPo> implements TempimpbagaDAO { 
	public static final TempimpbagaDAOImpl INSTANCE = new TempimpbagaDAOImpl(); 
	public static final String TABLENAME = "TEMPIMPBAGA"; 

	public TempimpbagaDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TempimpbagaPo> CONVERTER = new MapConverter<TempimpbagaPo>() { 
 
		@Override 
		public TempimpbagaPo convert(final DataObject dataObject) { 
			final TempimpbagaPo tempimpbagaPo = new TempimpbagaPo(); 
			tempimpbagaPo.setBagno(dataObject.getString(TempimpbagaPo.COLUMNS.BAGNO.name())); 
			tempimpbagaPo.setExpbagno(dataObject.getString(TempimpbagaPo.COLUMNS.EXPBAGNO.name())); 
			tempimpbagaPo.setBaghwb(BigDecimalUtils.formObj(dataObject.getValue(TempimpbagaPo.COLUMNS.BAGHWB.name()))); 
			tempimpbagaPo.setBagpiece(BigDecimalUtils.formObj(dataObject.getValue(TempimpbagaPo.COLUMNS.BAGPIECE.name()))); 
			tempimpbagaPo.setBagweight(BigDecimalUtils.formObj(dataObject.getValue(TempimpbagaPo.COLUMNS.BAGWEIGHT.name()))); 
			tempimpbagaPo.setBagfee(BigDecimalUtils.formObj(dataObject.getValue(TempimpbagaPo.COLUMNS.BAGFEE.name()))); 
			tempimpbagaPo.setExpressid(dataObject.getString(TempimpbagaPo.COLUMNS.EXPRESSID.name())); 
			tempimpbagaPo.setAirlineid(dataObject.getString(TempimpbagaPo.COLUMNS.AIRLINEID.name())); 
			tempimpbagaPo.setChargebox(dataObject.getString(TempimpbagaPo.COLUMNS.CHARGEBOX.name())); 
			tempimpbagaPo.setChargedate(TimestampUtils.of(dataObject.getValue(TempimpbagaPo.COLUMNS.CHARGEDATE.name()))); 
			tempimpbagaPo.setIe(dataObject.getString(TempimpbagaPo.COLUMNS.IE.name())); 
			tempimpbagaPo.setGcibagsn(BigDecimalUtils.formObj(dataObject.getValue(TempimpbagaPo.COLUMNS.GCIBAGSN.name()))); 
			tempimpbagaPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(TempimpbagaPo.COLUMNS.GCOBAGSN.name()))); 
			tempimpbagaPo.setLastupdate(TimestampUtils.of(dataObject.getValue(TempimpbagaPo.COLUMNS.LASTUPDATE.name()))); 
			tempimpbagaPo.setChargeuser(dataObject.getString(TempimpbagaPo.COLUMNS.CHARGEUSER.name())); 
			tempimpbagaPo.setExpressfee(BigDecimalUtils.formObj(dataObject.getValue(TempimpbagaPo.COLUMNS.EXPRESSFEE.name()))); 
			tempimpbagaPo.setAirlinefee(BigDecimalUtils.formObj(dataObject.getValue(TempimpbagaPo.COLUMNS.AIRLINEFEE.name()))); 
			tempimpbagaPo.setFlightno(dataObject.getString(TempimpbagaPo.COLUMNS.FLIGHTNO.name())); 
			return tempimpbagaPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TempimpbagaPo tempimpbagaPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TempimpbagaPo.COLUMNS.BAGNO.name(), tempimpbagaPo.getBagno()); 
			dataObject.setValue(TempimpbagaPo.COLUMNS.EXPBAGNO.name(), tempimpbagaPo.getExpbagno()); 
			dataObject.setValue(TempimpbagaPo.COLUMNS.BAGHWB.name(), tempimpbagaPo.getBaghwb()); 
			dataObject.setValue(TempimpbagaPo.COLUMNS.BAGPIECE.name(), tempimpbagaPo.getBagpiece()); 
			dataObject.setValue(TempimpbagaPo.COLUMNS.BAGWEIGHT.name(), tempimpbagaPo.getBagweight()); 
			dataObject.setValue(TempimpbagaPo.COLUMNS.BAGFEE.name(), tempimpbagaPo.getBagfee()); 
			dataObject.setValue(TempimpbagaPo.COLUMNS.EXPRESSID.name(), tempimpbagaPo.getExpressid()); 
			dataObject.setValue(TempimpbagaPo.COLUMNS.AIRLINEID.name(), tempimpbagaPo.getAirlineid()); 
			dataObject.setValue(TempimpbagaPo.COLUMNS.CHARGEBOX.name(), tempimpbagaPo.getChargebox()); 
			dataObject.setValue(TempimpbagaPo.COLUMNS.CHARGEDATE.name(), tempimpbagaPo.getChargedate()); 
			dataObject.setValue(TempimpbagaPo.COLUMNS.IE.name(), tempimpbagaPo.getIe()); 
			dataObject.setValue(TempimpbagaPo.COLUMNS.GCIBAGSN.name(), tempimpbagaPo.getGcibagsn()); 
			dataObject.setValue(TempimpbagaPo.COLUMNS.GCOBAGSN.name(), tempimpbagaPo.getGcobagsn()); 
			dataObject.setValue(TempimpbagaPo.COLUMNS.LASTUPDATE.name(), tempimpbagaPo.getLastupdate()); 
			dataObject.setValue(TempimpbagaPo.COLUMNS.CHARGEUSER.name(), tempimpbagaPo.getChargeuser()); 
			dataObject.setValue(TempimpbagaPo.COLUMNS.EXPRESSFEE.name(), tempimpbagaPo.getExpressfee()); 
			dataObject.setValue(TempimpbagaPo.COLUMNS.AIRLINEFEE.name(), tempimpbagaPo.getAirlinefee()); 
			dataObject.setValue(TempimpbagaPo.COLUMNS.FLIGHTNO.name(), tempimpbagaPo.getFlightno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TempimpbagaPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TempimpbagaPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
