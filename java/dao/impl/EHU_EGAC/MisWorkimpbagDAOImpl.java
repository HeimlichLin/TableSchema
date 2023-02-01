package com.doc.common.dao.impl; 
 
public class MisWorkimpbagDAOImpl extends GeneralDAOImpl<MisWorkimpbagPo> implements MisWorkimpbagDAO { 
	public static final MisWorkimpbagDAOImpl INSTANCE = new MisWorkimpbagDAOImpl(); 
	public static final String TABLENAME = "MIS_WORKIMPBAG"; 

	public MisWorkimpbagDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<MisWorkimpbagPo> CONVERTER = new MapConverter<MisWorkimpbagPo>() { 
 
		@Override 
		public MisWorkimpbagPo convert(final DataObject dataObject) { 
			final MisWorkimpbagPo misWorkimpbagPo = new MisWorkimpbagPo(); 
			misWorkimpbagPo.setBagno(dataObject.getString(MisWorkimpbagPo.COLUMNS.BAGNO.name())); 
			misWorkimpbagPo.setExpbagno(dataObject.getString(MisWorkimpbagPo.COLUMNS.EXPBAGNO.name())); 
			misWorkimpbagPo.setBaghwb(BigDecimalUtils.formObj(dataObject.getValue(MisWorkimpbagPo.COLUMNS.BAGHWB.name()))); 
			misWorkimpbagPo.setBagpiece(BigDecimalUtils.formObj(dataObject.getValue(MisWorkimpbagPo.COLUMNS.BAGPIECE.name()))); 
			misWorkimpbagPo.setBagweight(BigDecimalUtils.formObj(dataObject.getValue(MisWorkimpbagPo.COLUMNS.BAGWEIGHT.name()))); 
			misWorkimpbagPo.setBagfee(BigDecimalUtils.formObj(dataObject.getValue(MisWorkimpbagPo.COLUMNS.BAGFEE.name()))); 
			misWorkimpbagPo.setExpressid(dataObject.getString(MisWorkimpbagPo.COLUMNS.EXPRESSID.name())); 
			misWorkimpbagPo.setAirlineid(dataObject.getString(MisWorkimpbagPo.COLUMNS.AIRLINEID.name())); 
			misWorkimpbagPo.setChargebox(dataObject.getString(MisWorkimpbagPo.COLUMNS.CHARGEBOX.name())); 
			misWorkimpbagPo.setChargedate(TimestampUtils.of(dataObject.getValue(MisWorkimpbagPo.COLUMNS.CHARGEDATE.name()))); 
			misWorkimpbagPo.setIe(dataObject.getString(MisWorkimpbagPo.COLUMNS.IE.name())); 
			misWorkimpbagPo.setGcibagsn(BigDecimalUtils.formObj(dataObject.getValue(MisWorkimpbagPo.COLUMNS.GCIBAGSN.name()))); 
			misWorkimpbagPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(MisWorkimpbagPo.COLUMNS.GCOBAGSN.name()))); 
			misWorkimpbagPo.setLastupdate(TimestampUtils.of(dataObject.getValue(MisWorkimpbagPo.COLUMNS.LASTUPDATE.name()))); 
			return misWorkimpbagPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final MisWorkimpbagPo misWorkimpbagPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(MisWorkimpbagPo.COLUMNS.BAGNO.name(), misWorkimpbagPo.getBagno()); 
			dataObject.setValue(MisWorkimpbagPo.COLUMNS.EXPBAGNO.name(), misWorkimpbagPo.getExpbagno()); 
			dataObject.setValue(MisWorkimpbagPo.COLUMNS.BAGHWB.name(), misWorkimpbagPo.getBaghwb()); 
			dataObject.setValue(MisWorkimpbagPo.COLUMNS.BAGPIECE.name(), misWorkimpbagPo.getBagpiece()); 
			dataObject.setValue(MisWorkimpbagPo.COLUMNS.BAGWEIGHT.name(), misWorkimpbagPo.getBagweight()); 
			dataObject.setValue(MisWorkimpbagPo.COLUMNS.BAGFEE.name(), misWorkimpbagPo.getBagfee()); 
			dataObject.setValue(MisWorkimpbagPo.COLUMNS.EXPRESSID.name(), misWorkimpbagPo.getExpressid()); 
			dataObject.setValue(MisWorkimpbagPo.COLUMNS.AIRLINEID.name(), misWorkimpbagPo.getAirlineid()); 
			dataObject.setValue(MisWorkimpbagPo.COLUMNS.CHARGEBOX.name(), misWorkimpbagPo.getChargebox()); 
			dataObject.setValue(MisWorkimpbagPo.COLUMNS.CHARGEDATE.name(), misWorkimpbagPo.getChargedate()); 
			dataObject.setValue(MisWorkimpbagPo.COLUMNS.IE.name(), misWorkimpbagPo.getIe()); 
			dataObject.setValue(MisWorkimpbagPo.COLUMNS.GCIBAGSN.name(), misWorkimpbagPo.getGcibagsn()); 
			dataObject.setValue(MisWorkimpbagPo.COLUMNS.GCOBAGSN.name(), misWorkimpbagPo.getGcobagsn()); 
			dataObject.setValue(MisWorkimpbagPo.COLUMNS.LASTUPDATE.name(), misWorkimpbagPo.getLastupdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<MisWorkimpbagPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(MisWorkimpbagPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
