package com.doc.common.dao.impl; 
 
public class TempimpbagDAOImpl extends GeneralDAOImpl<TempimpbagPo> implements TempimpbagDAO { 
	public static final TempimpbagDAOImpl INSTANCE = new TempimpbagDAOImpl(); 
	public static final String TABLENAME = "TEMPIMPBAG"; 

	public TempimpbagDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TempimpbagPo> CONVERTER = new MapConverter<TempimpbagPo>() { 
 
		@Override 
		public TempimpbagPo convert(final DataObject dataObject) { 
			final TempimpbagPo tempimpbagPo = new TempimpbagPo(); 
			tempimpbagPo.setBagno(dataObject.getString(TempimpbagPo.COLUMNS.BAGNO.name())); 
			tempimpbagPo.setExpbagno(dataObject.getString(TempimpbagPo.COLUMNS.EXPBAGNO.name())); 
			tempimpbagPo.setBaghwb(BigDecimalUtils.formObj(dataObject.getValue(TempimpbagPo.COLUMNS.BAGHWB.name()))); 
			tempimpbagPo.setBagpiece(BigDecimalUtils.formObj(dataObject.getValue(TempimpbagPo.COLUMNS.BAGPIECE.name()))); 
			tempimpbagPo.setBagweight(BigDecimalUtils.formObj(dataObject.getValue(TempimpbagPo.COLUMNS.BAGWEIGHT.name()))); 
			tempimpbagPo.setBagfee(BigDecimalUtils.formObj(dataObject.getValue(TempimpbagPo.COLUMNS.BAGFEE.name()))); 
			tempimpbagPo.setExpressid(dataObject.getString(TempimpbagPo.COLUMNS.EXPRESSID.name())); 
			tempimpbagPo.setAirlineid(dataObject.getString(TempimpbagPo.COLUMNS.AIRLINEID.name())); 
			tempimpbagPo.setChargebox(dataObject.getString(TempimpbagPo.COLUMNS.CHARGEBOX.name())); 
			tempimpbagPo.setChargedate(TimestampUtils.of(dataObject.getValue(TempimpbagPo.COLUMNS.CHARGEDATE.name()))); 
			tempimpbagPo.setIe(dataObject.getString(TempimpbagPo.COLUMNS.IE.name())); 
			tempimpbagPo.setGcibagsn(BigDecimalUtils.formObj(dataObject.getValue(TempimpbagPo.COLUMNS.GCIBAGSN.name()))); 
			tempimpbagPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(TempimpbagPo.COLUMNS.GCOBAGSN.name()))); 
			tempimpbagPo.setLastupdate(TimestampUtils.of(dataObject.getValue(TempimpbagPo.COLUMNS.LASTUPDATE.name()))); 
			return tempimpbagPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TempimpbagPo tempimpbagPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TempimpbagPo.COLUMNS.BAGNO.name(), tempimpbagPo.getBagno()); 
			dataObject.setValue(TempimpbagPo.COLUMNS.EXPBAGNO.name(), tempimpbagPo.getExpbagno()); 
			dataObject.setValue(TempimpbagPo.COLUMNS.BAGHWB.name(), tempimpbagPo.getBaghwb()); 
			dataObject.setValue(TempimpbagPo.COLUMNS.BAGPIECE.name(), tempimpbagPo.getBagpiece()); 
			dataObject.setValue(TempimpbagPo.COLUMNS.BAGWEIGHT.name(), tempimpbagPo.getBagweight()); 
			dataObject.setValue(TempimpbagPo.COLUMNS.BAGFEE.name(), tempimpbagPo.getBagfee()); 
			dataObject.setValue(TempimpbagPo.COLUMNS.EXPRESSID.name(), tempimpbagPo.getExpressid()); 
			dataObject.setValue(TempimpbagPo.COLUMNS.AIRLINEID.name(), tempimpbagPo.getAirlineid()); 
			dataObject.setValue(TempimpbagPo.COLUMNS.CHARGEBOX.name(), tempimpbagPo.getChargebox()); 
			dataObject.setValue(TempimpbagPo.COLUMNS.CHARGEDATE.name(), tempimpbagPo.getChargedate()); 
			dataObject.setValue(TempimpbagPo.COLUMNS.IE.name(), tempimpbagPo.getIe()); 
			dataObject.setValue(TempimpbagPo.COLUMNS.GCIBAGSN.name(), tempimpbagPo.getGcibagsn()); 
			dataObject.setValue(TempimpbagPo.COLUMNS.GCOBAGSN.name(), tempimpbagPo.getGcobagsn()); 
			dataObject.setValue(TempimpbagPo.COLUMNS.LASTUPDATE.name(), tempimpbagPo.getLastupdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TempimpbagPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TempimpbagPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
