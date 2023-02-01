package com.doc.common.dao.impl; 
 
public class TempexpbagDAOImpl extends GeneralDAOImpl<TempexpbagPo> implements TempexpbagDAO { 
	public static final TempexpbagDAOImpl INSTANCE = new TempexpbagDAOImpl(); 
	public static final String TABLENAME = "TEMPEXPBAG"; 

	public TempexpbagDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TempexpbagPo> CONVERTER = new MapConverter<TempexpbagPo>() { 
 
		@Override 
		public TempexpbagPo convert(final DataObject dataObject) { 
			final TempexpbagPo tempexpbagPo = new TempexpbagPo(); 
			tempexpbagPo.setBagno(dataObject.getString(TempexpbagPo.COLUMNS.BAGNO.name())); 
			tempexpbagPo.setExpbagno(dataObject.getString(TempexpbagPo.COLUMNS.EXPBAGNO.name())); 
			tempexpbagPo.setBaghwb(BigDecimalUtils.formObj(dataObject.getValue(TempexpbagPo.COLUMNS.BAGHWB.name()))); 
			tempexpbagPo.setBagpiece(BigDecimalUtils.formObj(dataObject.getValue(TempexpbagPo.COLUMNS.BAGPIECE.name()))); 
			tempexpbagPo.setBagweight(BigDecimalUtils.formObj(dataObject.getValue(TempexpbagPo.COLUMNS.BAGWEIGHT.name()))); 
			tempexpbagPo.setBagfee(BigDecimalUtils.formObj(dataObject.getValue(TempexpbagPo.COLUMNS.BAGFEE.name()))); 
			tempexpbagPo.setExpressid(dataObject.getString(TempexpbagPo.COLUMNS.EXPRESSID.name())); 
			tempexpbagPo.setAirlineid(dataObject.getString(TempexpbagPo.COLUMNS.AIRLINEID.name())); 
			tempexpbagPo.setChargebox(dataObject.getString(TempexpbagPo.COLUMNS.CHARGEBOX.name())); 
			tempexpbagPo.setChargedate(TimestampUtils.of(dataObject.getValue(TempexpbagPo.COLUMNS.CHARGEDATE.name()))); 
			tempexpbagPo.setIe(dataObject.getString(TempexpbagPo.COLUMNS.IE.name())); 
			tempexpbagPo.setGcibagsn(BigDecimalUtils.formObj(dataObject.getValue(TempexpbagPo.COLUMNS.GCIBAGSN.name()))); 
			tempexpbagPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(TempexpbagPo.COLUMNS.GCOBAGSN.name()))); 
			tempexpbagPo.setLastupdate(TimestampUtils.of(dataObject.getValue(TempexpbagPo.COLUMNS.LASTUPDATE.name()))); 
			return tempexpbagPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TempexpbagPo tempexpbagPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TempexpbagPo.COLUMNS.BAGNO.name(), tempexpbagPo.getBagno()); 
			dataObject.setValue(TempexpbagPo.COLUMNS.EXPBAGNO.name(), tempexpbagPo.getExpbagno()); 
			dataObject.setValue(TempexpbagPo.COLUMNS.BAGHWB.name(), tempexpbagPo.getBaghwb()); 
			dataObject.setValue(TempexpbagPo.COLUMNS.BAGPIECE.name(), tempexpbagPo.getBagpiece()); 
			dataObject.setValue(TempexpbagPo.COLUMNS.BAGWEIGHT.name(), tempexpbagPo.getBagweight()); 
			dataObject.setValue(TempexpbagPo.COLUMNS.BAGFEE.name(), tempexpbagPo.getBagfee()); 
			dataObject.setValue(TempexpbagPo.COLUMNS.EXPRESSID.name(), tempexpbagPo.getExpressid()); 
			dataObject.setValue(TempexpbagPo.COLUMNS.AIRLINEID.name(), tempexpbagPo.getAirlineid()); 
			dataObject.setValue(TempexpbagPo.COLUMNS.CHARGEBOX.name(), tempexpbagPo.getChargebox()); 
			dataObject.setValue(TempexpbagPo.COLUMNS.CHARGEDATE.name(), tempexpbagPo.getChargedate()); 
			dataObject.setValue(TempexpbagPo.COLUMNS.IE.name(), tempexpbagPo.getIe()); 
			dataObject.setValue(TempexpbagPo.COLUMNS.GCIBAGSN.name(), tempexpbagPo.getGcibagsn()); 
			dataObject.setValue(TempexpbagPo.COLUMNS.GCOBAGSN.name(), tempexpbagPo.getGcobagsn()); 
			dataObject.setValue(TempexpbagPo.COLUMNS.LASTUPDATE.name(), tempexpbagPo.getLastupdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TempexpbagPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TempexpbagPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
