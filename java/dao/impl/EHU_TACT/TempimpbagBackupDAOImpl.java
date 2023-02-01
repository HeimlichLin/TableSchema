package com.doc.common.dao.impl; 
 
public class TempimpbagBackupDAOImpl extends GeneralDAOImpl<TempimpbagBackupPo> implements TempimpbagBackupDAO { 
	public static final TempimpbagBackupDAOImpl INSTANCE = new TempimpbagBackupDAOImpl(); 
	public static final String TABLENAME = "TEMPIMPBAG_BACKUP"; 

	public TempimpbagBackupDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TempimpbagBackupPo> CONVERTER = new MapConverter<TempimpbagBackupPo>() { 
 
		@Override 
		public TempimpbagBackupPo convert(final DataObject dataObject) { 
			final TempimpbagBackupPo tempimpbagBackupPo = new TempimpbagBackupPo(); 
			tempimpbagBackupPo.setBagno(dataObject.getString(TempimpbagBackupPo.COLUMNS.BAGNO.name())); 
			tempimpbagBackupPo.setExpbagno(dataObject.getString(TempimpbagBackupPo.COLUMNS.EXPBAGNO.name())); 
			tempimpbagBackupPo.setBaghwb(BigDecimalUtils.formObj(dataObject.getValue(TempimpbagBackupPo.COLUMNS.BAGHWB.name()))); 
			tempimpbagBackupPo.setBagpiece(BigDecimalUtils.formObj(dataObject.getValue(TempimpbagBackupPo.COLUMNS.BAGPIECE.name()))); 
			tempimpbagBackupPo.setBagweight(BigDecimalUtils.formObj(dataObject.getValue(TempimpbagBackupPo.COLUMNS.BAGWEIGHT.name()))); 
			tempimpbagBackupPo.setBagfee(BigDecimalUtils.formObj(dataObject.getValue(TempimpbagBackupPo.COLUMNS.BAGFEE.name()))); 
			tempimpbagBackupPo.setExpressid(dataObject.getString(TempimpbagBackupPo.COLUMNS.EXPRESSID.name())); 
			tempimpbagBackupPo.setAirlineid(dataObject.getString(TempimpbagBackupPo.COLUMNS.AIRLINEID.name())); 
			tempimpbagBackupPo.setChargebox(dataObject.getString(TempimpbagBackupPo.COLUMNS.CHARGEBOX.name())); 
			tempimpbagBackupPo.setChargedate(TimestampUtils.of(dataObject.getValue(TempimpbagBackupPo.COLUMNS.CHARGEDATE.name()))); 
			tempimpbagBackupPo.setIe(dataObject.getString(TempimpbagBackupPo.COLUMNS.IE.name())); 
			tempimpbagBackupPo.setGcibagsn(BigDecimalUtils.formObj(dataObject.getValue(TempimpbagBackupPo.COLUMNS.GCIBAGSN.name()))); 
			tempimpbagBackupPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(TempimpbagBackupPo.COLUMNS.GCOBAGSN.name()))); 
			tempimpbagBackupPo.setLastupdate(TimestampUtils.of(dataObject.getValue(TempimpbagBackupPo.COLUMNS.LASTUPDATE.name()))); 
			tempimpbagBackupPo.setChargeuser(dataObject.getString(TempimpbagBackupPo.COLUMNS.CHARGEUSER.name())); 
			tempimpbagBackupPo.setExpressfee(BigDecimalUtils.formObj(dataObject.getValue(TempimpbagBackupPo.COLUMNS.EXPRESSFEE.name()))); 
			tempimpbagBackupPo.setAirlinefee(BigDecimalUtils.formObj(dataObject.getValue(TempimpbagBackupPo.COLUMNS.AIRLINEFEE.name()))); 
			tempimpbagBackupPo.setFlightno(dataObject.getString(TempimpbagBackupPo.COLUMNS.FLIGHTNO.name())); 
			tempimpbagBackupPo.setLastchargedate(TimestampUtils.of(dataObject.getValue(TempimpbagBackupPo.COLUMNS.LASTCHARGEDATE.name()))); 
			tempimpbagBackupPo.setWorkarea(dataObject.getString(TempimpbagBackupPo.COLUMNS.WORKAREA.name())); 
			return tempimpbagBackupPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TempimpbagBackupPo tempimpbagBackupPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TempimpbagBackupPo.COLUMNS.BAGNO.name(), tempimpbagBackupPo.getBagno()); 
			dataObject.setValue(TempimpbagBackupPo.COLUMNS.EXPBAGNO.name(), tempimpbagBackupPo.getExpbagno()); 
			dataObject.setValue(TempimpbagBackupPo.COLUMNS.BAGHWB.name(), tempimpbagBackupPo.getBaghwb()); 
			dataObject.setValue(TempimpbagBackupPo.COLUMNS.BAGPIECE.name(), tempimpbagBackupPo.getBagpiece()); 
			dataObject.setValue(TempimpbagBackupPo.COLUMNS.BAGWEIGHT.name(), tempimpbagBackupPo.getBagweight()); 
			dataObject.setValue(TempimpbagBackupPo.COLUMNS.BAGFEE.name(), tempimpbagBackupPo.getBagfee()); 
			dataObject.setValue(TempimpbagBackupPo.COLUMNS.EXPRESSID.name(), tempimpbagBackupPo.getExpressid()); 
			dataObject.setValue(TempimpbagBackupPo.COLUMNS.AIRLINEID.name(), tempimpbagBackupPo.getAirlineid()); 
			dataObject.setValue(TempimpbagBackupPo.COLUMNS.CHARGEBOX.name(), tempimpbagBackupPo.getChargebox()); 
			dataObject.setValue(TempimpbagBackupPo.COLUMNS.CHARGEDATE.name(), tempimpbagBackupPo.getChargedate()); 
			dataObject.setValue(TempimpbagBackupPo.COLUMNS.IE.name(), tempimpbagBackupPo.getIe()); 
			dataObject.setValue(TempimpbagBackupPo.COLUMNS.GCIBAGSN.name(), tempimpbagBackupPo.getGcibagsn()); 
			dataObject.setValue(TempimpbagBackupPo.COLUMNS.GCOBAGSN.name(), tempimpbagBackupPo.getGcobagsn()); 
			dataObject.setValue(TempimpbagBackupPo.COLUMNS.LASTUPDATE.name(), tempimpbagBackupPo.getLastupdate()); 
			dataObject.setValue(TempimpbagBackupPo.COLUMNS.CHARGEUSER.name(), tempimpbagBackupPo.getChargeuser()); 
			dataObject.setValue(TempimpbagBackupPo.COLUMNS.EXPRESSFEE.name(), tempimpbagBackupPo.getExpressfee()); 
			dataObject.setValue(TempimpbagBackupPo.COLUMNS.AIRLINEFEE.name(), tempimpbagBackupPo.getAirlinefee()); 
			dataObject.setValue(TempimpbagBackupPo.COLUMNS.FLIGHTNO.name(), tempimpbagBackupPo.getFlightno()); 
			dataObject.setValue(TempimpbagBackupPo.COLUMNS.LASTCHARGEDATE.name(), tempimpbagBackupPo.getLastchargedate()); 
			dataObject.setValue(TempimpbagBackupPo.COLUMNS.WORKAREA.name(), tempimpbagBackupPo.getWorkarea()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TempimpbagBackupPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TempimpbagBackupPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
