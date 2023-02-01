package com.doc.common.dao.impl; 
 
public class MisWorkexpbagDAOImpl extends GeneralDAOImpl<MisWorkexpbagPo> implements MisWorkexpbagDAO { 
	public static final MisWorkexpbagDAOImpl INSTANCE = new MisWorkexpbagDAOImpl(); 
	public static final String TABLENAME = "MIS_WORKEXPBAG"; 

	public MisWorkexpbagDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<MisWorkexpbagPo> CONVERTER = new MapConverter<MisWorkexpbagPo>() { 
 
		@Override 
		public MisWorkexpbagPo convert(final DataObject dataObject) { 
			final MisWorkexpbagPo misWorkexpbagPo = new MisWorkexpbagPo(); 
			misWorkexpbagPo.setBagno(dataObject.getString(MisWorkexpbagPo.COLUMNS.BAGNO.name())); 
			misWorkexpbagPo.setExpbagno(dataObject.getString(MisWorkexpbagPo.COLUMNS.EXPBAGNO.name())); 
			misWorkexpbagPo.setBaghwb(BigDecimalUtils.formObj(dataObject.getValue(MisWorkexpbagPo.COLUMNS.BAGHWB.name()))); 
			misWorkexpbagPo.setBagpiece(BigDecimalUtils.formObj(dataObject.getValue(MisWorkexpbagPo.COLUMNS.BAGPIECE.name()))); 
			misWorkexpbagPo.setBagweight(BigDecimalUtils.formObj(dataObject.getValue(MisWorkexpbagPo.COLUMNS.BAGWEIGHT.name()))); 
			misWorkexpbagPo.setBagfee(BigDecimalUtils.formObj(dataObject.getValue(MisWorkexpbagPo.COLUMNS.BAGFEE.name()))); 
			misWorkexpbagPo.setExpressid(dataObject.getString(MisWorkexpbagPo.COLUMNS.EXPRESSID.name())); 
			misWorkexpbagPo.setAirlineid(dataObject.getString(MisWorkexpbagPo.COLUMNS.AIRLINEID.name())); 
			misWorkexpbagPo.setChargebox(dataObject.getString(MisWorkexpbagPo.COLUMNS.CHARGEBOX.name())); 
			misWorkexpbagPo.setChargedate(TimestampUtils.of(dataObject.getValue(MisWorkexpbagPo.COLUMNS.CHARGEDATE.name()))); 
			misWorkexpbagPo.setIe(dataObject.getString(MisWorkexpbagPo.COLUMNS.IE.name())); 
			misWorkexpbagPo.setGcibagsn(BigDecimalUtils.formObj(dataObject.getValue(MisWorkexpbagPo.COLUMNS.GCIBAGSN.name()))); 
			misWorkexpbagPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(MisWorkexpbagPo.COLUMNS.GCOBAGSN.name()))); 
			misWorkexpbagPo.setLastupdate(TimestampUtils.of(dataObject.getValue(MisWorkexpbagPo.COLUMNS.LASTUPDATE.name()))); 
			return misWorkexpbagPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final MisWorkexpbagPo misWorkexpbagPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(MisWorkexpbagPo.COLUMNS.BAGNO.name(), misWorkexpbagPo.getBagno()); 
			dataObject.setValue(MisWorkexpbagPo.COLUMNS.EXPBAGNO.name(), misWorkexpbagPo.getExpbagno()); 
			dataObject.setValue(MisWorkexpbagPo.COLUMNS.BAGHWB.name(), misWorkexpbagPo.getBaghwb()); 
			dataObject.setValue(MisWorkexpbagPo.COLUMNS.BAGPIECE.name(), misWorkexpbagPo.getBagpiece()); 
			dataObject.setValue(MisWorkexpbagPo.COLUMNS.BAGWEIGHT.name(), misWorkexpbagPo.getBagweight()); 
			dataObject.setValue(MisWorkexpbagPo.COLUMNS.BAGFEE.name(), misWorkexpbagPo.getBagfee()); 
			dataObject.setValue(MisWorkexpbagPo.COLUMNS.EXPRESSID.name(), misWorkexpbagPo.getExpressid()); 
			dataObject.setValue(MisWorkexpbagPo.COLUMNS.AIRLINEID.name(), misWorkexpbagPo.getAirlineid()); 
			dataObject.setValue(MisWorkexpbagPo.COLUMNS.CHARGEBOX.name(), misWorkexpbagPo.getChargebox()); 
			dataObject.setValue(MisWorkexpbagPo.COLUMNS.CHARGEDATE.name(), misWorkexpbagPo.getChargedate()); 
			dataObject.setValue(MisWorkexpbagPo.COLUMNS.IE.name(), misWorkexpbagPo.getIe()); 
			dataObject.setValue(MisWorkexpbagPo.COLUMNS.GCIBAGSN.name(), misWorkexpbagPo.getGcibagsn()); 
			dataObject.setValue(MisWorkexpbagPo.COLUMNS.GCOBAGSN.name(), misWorkexpbagPo.getGcobagsn()); 
			dataObject.setValue(MisWorkexpbagPo.COLUMNS.LASTUPDATE.name(), misWorkexpbagPo.getLastupdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<MisWorkexpbagPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(MisWorkexpbagPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
