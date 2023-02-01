package com.doc.common.dao.impl; 
 
public class HistorybagDAOImpl extends GeneralDAOImpl<HistorybagPo> implements HistorybagDAO { 
	public static final HistorybagDAOImpl INSTANCE = new HistorybagDAOImpl(); 
	public static final String TABLENAME = "HISTORYBAG"; 

	public HistorybagDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<HistorybagPo> CONVERTER = new MapConverter<HistorybagPo>() { 
 
		@Override 
		public HistorybagPo convert(final DataObject dataObject) { 
			final HistorybagPo historybagPo = new HistorybagPo(); 
			historybagPo.setBagno(dataObject.getString(HistorybagPo.COLUMNS.BAGNO.name())); 
			historybagPo.setExpbagno(dataObject.getString(HistorybagPo.COLUMNS.EXPBAGNO.name())); 
			historybagPo.setBaghwb(BigDecimalUtils.formObj(dataObject.getValue(HistorybagPo.COLUMNS.BAGHWB.name()))); 
			historybagPo.setBagpiece(BigDecimalUtils.formObj(dataObject.getValue(HistorybagPo.COLUMNS.BAGPIECE.name()))); 
			historybagPo.setBagweight(BigDecimalUtils.formObj(dataObject.getValue(HistorybagPo.COLUMNS.BAGWEIGHT.name()))); 
			historybagPo.setBagfee(BigDecimalUtils.formObj(dataObject.getValue(HistorybagPo.COLUMNS.BAGFEE.name()))); 
			historybagPo.setExpressid(dataObject.getString(HistorybagPo.COLUMNS.EXPRESSID.name())); 
			historybagPo.setAirlineid(dataObject.getString(HistorybagPo.COLUMNS.AIRLINEID.name())); 
			historybagPo.setChargebox(dataObject.getString(HistorybagPo.COLUMNS.CHARGEBOX.name())); 
			historybagPo.setChargedate(TimestampUtils.of(dataObject.getValue(HistorybagPo.COLUMNS.CHARGEDATE.name()))); 
			historybagPo.setIe(dataObject.getString(HistorybagPo.COLUMNS.IE.name())); 
			historybagPo.setGcibagsn(BigDecimalUtils.formObj(dataObject.getValue(HistorybagPo.COLUMNS.GCIBAGSN.name()))); 
			historybagPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(HistorybagPo.COLUMNS.GCOBAGSN.name()))); 
			historybagPo.setLastupdate(TimestampUtils.of(dataObject.getValue(HistorybagPo.COLUMNS.LASTUPDATE.name()))); 
			return historybagPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final HistorybagPo historybagPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(HistorybagPo.COLUMNS.BAGNO.name(), historybagPo.getBagno()); 
			dataObject.setValue(HistorybagPo.COLUMNS.EXPBAGNO.name(), historybagPo.getExpbagno()); 
			dataObject.setValue(HistorybagPo.COLUMNS.BAGHWB.name(), historybagPo.getBaghwb()); 
			dataObject.setValue(HistorybagPo.COLUMNS.BAGPIECE.name(), historybagPo.getBagpiece()); 
			dataObject.setValue(HistorybagPo.COLUMNS.BAGWEIGHT.name(), historybagPo.getBagweight()); 
			dataObject.setValue(HistorybagPo.COLUMNS.BAGFEE.name(), historybagPo.getBagfee()); 
			dataObject.setValue(HistorybagPo.COLUMNS.EXPRESSID.name(), historybagPo.getExpressid()); 
			dataObject.setValue(HistorybagPo.COLUMNS.AIRLINEID.name(), historybagPo.getAirlineid()); 
			dataObject.setValue(HistorybagPo.COLUMNS.CHARGEBOX.name(), historybagPo.getChargebox()); 
			dataObject.setValue(HistorybagPo.COLUMNS.CHARGEDATE.name(), historybagPo.getChargedate()); 
			dataObject.setValue(HistorybagPo.COLUMNS.IE.name(), historybagPo.getIe()); 
			dataObject.setValue(HistorybagPo.COLUMNS.GCIBAGSN.name(), historybagPo.getGcibagsn()); 
			dataObject.setValue(HistorybagPo.COLUMNS.GCOBAGSN.name(), historybagPo.getGcobagsn()); 
			dataObject.setValue(HistorybagPo.COLUMNS.LASTUPDATE.name(), historybagPo.getLastupdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<HistorybagPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(HistorybagPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
