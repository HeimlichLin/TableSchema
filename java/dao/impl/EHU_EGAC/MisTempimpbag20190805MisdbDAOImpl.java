package com.doc.common.dao.impl; 
 
public class MisTempimpbag20190805MisdbDAOImpl extends GeneralDAOImpl<MisTempimpbag20190805MisdbPo> implements MisTempimpbag20190805MisdbDAO { 
	public static final MisTempimpbag20190805MisdbDAOImpl INSTANCE = new MisTempimpbag20190805MisdbDAOImpl(); 
	public static final String TABLENAME = "MIS_TEMPIMPBAG_20190805_MISDB"; 

	public MisTempimpbag20190805MisdbDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<MisTempimpbag20190805MisdbPo> CONVERTER = new MapConverter<MisTempimpbag20190805MisdbPo>() { 
 
		@Override 
		public MisTempimpbag20190805MisdbPo convert(final DataObject dataObject) { 
			final MisTempimpbag20190805MisdbPo misTempimpbag20190805MisdbPo = new MisTempimpbag20190805MisdbPo(); 
			misTempimpbag20190805MisdbPo.setBagno(dataObject.getString(MisTempimpbag20190805MisdbPo.COLUMNS.BAGNO.name())); 
			misTempimpbag20190805MisdbPo.setExpbagno(dataObject.getString(MisTempimpbag20190805MisdbPo.COLUMNS.EXPBAGNO.name())); 
			misTempimpbag20190805MisdbPo.setBaghwb(BigDecimalUtils.formObj(dataObject.getValue(MisTempimpbag20190805MisdbPo.COLUMNS.BAGHWB.name()))); 
			misTempimpbag20190805MisdbPo.setBagpiece(BigDecimalUtils.formObj(dataObject.getValue(MisTempimpbag20190805MisdbPo.COLUMNS.BAGPIECE.name()))); 
			misTempimpbag20190805MisdbPo.setBagweight(BigDecimalUtils.formObj(dataObject.getValue(MisTempimpbag20190805MisdbPo.COLUMNS.BAGWEIGHT.name()))); 
			misTempimpbag20190805MisdbPo.setBagfee(BigDecimalUtils.formObj(dataObject.getValue(MisTempimpbag20190805MisdbPo.COLUMNS.BAGFEE.name()))); 
			misTempimpbag20190805MisdbPo.setExpressid(dataObject.getString(MisTempimpbag20190805MisdbPo.COLUMNS.EXPRESSID.name())); 
			misTempimpbag20190805MisdbPo.setAirlineid(dataObject.getString(MisTempimpbag20190805MisdbPo.COLUMNS.AIRLINEID.name())); 
			misTempimpbag20190805MisdbPo.setChargebox(dataObject.getString(MisTempimpbag20190805MisdbPo.COLUMNS.CHARGEBOX.name())); 
			misTempimpbag20190805MisdbPo.setChargedate(TimestampUtils.of(dataObject.getValue(MisTempimpbag20190805MisdbPo.COLUMNS.CHARGEDATE.name()))); 
			misTempimpbag20190805MisdbPo.setIe(dataObject.getString(MisTempimpbag20190805MisdbPo.COLUMNS.IE.name())); 
			misTempimpbag20190805MisdbPo.setGcibagsn(BigDecimalUtils.formObj(dataObject.getValue(MisTempimpbag20190805MisdbPo.COLUMNS.GCIBAGSN.name()))); 
			misTempimpbag20190805MisdbPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(MisTempimpbag20190805MisdbPo.COLUMNS.GCOBAGSN.name()))); 
			misTempimpbag20190805MisdbPo.setLastupdate(TimestampUtils.of(dataObject.getValue(MisTempimpbag20190805MisdbPo.COLUMNS.LASTUPDATE.name()))); 
			return misTempimpbag20190805MisdbPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final MisTempimpbag20190805MisdbPo misTempimpbag20190805MisdbPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(MisTempimpbag20190805MisdbPo.COLUMNS.BAGNO.name(), misTempimpbag20190805MisdbPo.getBagno()); 
			dataObject.setValue(MisTempimpbag20190805MisdbPo.COLUMNS.EXPBAGNO.name(), misTempimpbag20190805MisdbPo.getExpbagno()); 
			dataObject.setValue(MisTempimpbag20190805MisdbPo.COLUMNS.BAGHWB.name(), misTempimpbag20190805MisdbPo.getBaghwb()); 
			dataObject.setValue(MisTempimpbag20190805MisdbPo.COLUMNS.BAGPIECE.name(), misTempimpbag20190805MisdbPo.getBagpiece()); 
			dataObject.setValue(MisTempimpbag20190805MisdbPo.COLUMNS.BAGWEIGHT.name(), misTempimpbag20190805MisdbPo.getBagweight()); 
			dataObject.setValue(MisTempimpbag20190805MisdbPo.COLUMNS.BAGFEE.name(), misTempimpbag20190805MisdbPo.getBagfee()); 
			dataObject.setValue(MisTempimpbag20190805MisdbPo.COLUMNS.EXPRESSID.name(), misTempimpbag20190805MisdbPo.getExpressid()); 
			dataObject.setValue(MisTempimpbag20190805MisdbPo.COLUMNS.AIRLINEID.name(), misTempimpbag20190805MisdbPo.getAirlineid()); 
			dataObject.setValue(MisTempimpbag20190805MisdbPo.COLUMNS.CHARGEBOX.name(), misTempimpbag20190805MisdbPo.getChargebox()); 
			dataObject.setValue(MisTempimpbag20190805MisdbPo.COLUMNS.CHARGEDATE.name(), misTempimpbag20190805MisdbPo.getChargedate()); 
			dataObject.setValue(MisTempimpbag20190805MisdbPo.COLUMNS.IE.name(), misTempimpbag20190805MisdbPo.getIe()); 
			dataObject.setValue(MisTempimpbag20190805MisdbPo.COLUMNS.GCIBAGSN.name(), misTempimpbag20190805MisdbPo.getGcibagsn()); 
			dataObject.setValue(MisTempimpbag20190805MisdbPo.COLUMNS.GCOBAGSN.name(), misTempimpbag20190805MisdbPo.getGcobagsn()); 
			dataObject.setValue(MisTempimpbag20190805MisdbPo.COLUMNS.LASTUPDATE.name(), misTempimpbag20190805MisdbPo.getLastupdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<MisTempimpbag20190805MisdbPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(MisTempimpbag20190805MisdbPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
