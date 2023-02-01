package com.doc.common.dao.impl; 
 
public class Tv02impbagDAOImpl extends GeneralDAOImpl<Tv02impbagPo> implements Tv02impbagDAO { 
	public static final Tv02impbagDAOImpl INSTANCE = new Tv02impbagDAOImpl(); 
	public static final String TABLENAME = "TV02IMPBAG"; 

	public Tv02impbagDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Tv02impbagPo> CONVERTER = new MapConverter<Tv02impbagPo>() { 
 
		@Override 
		public Tv02impbagPo convert(final DataObject dataObject) { 
			final Tv02impbagPo tv02impbagPo = new Tv02impbagPo(); 
			tv02impbagPo.setBagno(dataObject.getString(Tv02impbagPo.COLUMNS.BAGNO.name())); 
			tv02impbagPo.setBaghwb(BigDecimalUtils.formObj(dataObject.getValue(Tv02impbagPo.COLUMNS.BAGHWB.name()))); 
			tv02impbagPo.setBagpiece(BigDecimalUtils.formObj(dataObject.getValue(Tv02impbagPo.COLUMNS.BAGPIECE.name()))); 
			tv02impbagPo.setBagfee(BigDecimalUtils.formObj(dataObject.getValue(Tv02impbagPo.COLUMNS.BAGFEE.name()))); 
			tv02impbagPo.setBagweight(BigDecimalUtils.formObj(dataObject.getValue(Tv02impbagPo.COLUMNS.BAGWEIGHT.name()))); 
			tv02impbagPo.setChargedate(TimestampUtils.of(dataObject.getValue(Tv02impbagPo.COLUMNS.CHARGEDATE.name()))); 
			tv02impbagPo.setChargebox(dataObject.getString(Tv02impbagPo.COLUMNS.CHARGEBOX.name())); 
			tv02impbagPo.setAirlineid(dataObject.getString(Tv02impbagPo.COLUMNS.AIRLINEID.name())); 
			tv02impbagPo.setIe(dataObject.getString(Tv02impbagPo.COLUMNS.IE.name())); 
			tv02impbagPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(Tv02impbagPo.COLUMNS.GCOBAGSN.name()))); 
			tv02impbagPo.setLastupdate(TimestampUtils.of(dataObject.getValue(Tv02impbagPo.COLUMNS.LASTUPDATE.name()))); 
			tv02impbagPo.setExpressid(dataObject.getString(Tv02impbagPo.COLUMNS.EXPRESSID.name())); 
			tv02impbagPo.setGcibagsn(BigDecimalUtils.formObj(dataObject.getValue(Tv02impbagPo.COLUMNS.GCIBAGSN.name()))); 
			tv02impbagPo.setExpbagno(dataObject.getString(Tv02impbagPo.COLUMNS.EXPBAGNO.name())); 
			return tv02impbagPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Tv02impbagPo tv02impbagPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Tv02impbagPo.COLUMNS.BAGNO.name(), tv02impbagPo.getBagno()); 
			dataObject.setValue(Tv02impbagPo.COLUMNS.BAGHWB.name(), tv02impbagPo.getBaghwb()); 
			dataObject.setValue(Tv02impbagPo.COLUMNS.BAGPIECE.name(), tv02impbagPo.getBagpiece()); 
			dataObject.setValue(Tv02impbagPo.COLUMNS.BAGFEE.name(), tv02impbagPo.getBagfee()); 
			dataObject.setValue(Tv02impbagPo.COLUMNS.BAGWEIGHT.name(), tv02impbagPo.getBagweight()); 
			dataObject.setValue(Tv02impbagPo.COLUMNS.CHARGEDATE.name(), tv02impbagPo.getChargedate()); 
			dataObject.setValue(Tv02impbagPo.COLUMNS.CHARGEBOX.name(), tv02impbagPo.getChargebox()); 
			dataObject.setValue(Tv02impbagPo.COLUMNS.AIRLINEID.name(), tv02impbagPo.getAirlineid()); 
			dataObject.setValue(Tv02impbagPo.COLUMNS.IE.name(), tv02impbagPo.getIe()); 
			dataObject.setValue(Tv02impbagPo.COLUMNS.GCOBAGSN.name(), tv02impbagPo.getGcobagsn()); 
			dataObject.setValue(Tv02impbagPo.COLUMNS.LASTUPDATE.name(), tv02impbagPo.getLastupdate()); 
			dataObject.setValue(Tv02impbagPo.COLUMNS.EXPRESSID.name(), tv02impbagPo.getExpressid()); 
			dataObject.setValue(Tv02impbagPo.COLUMNS.GCIBAGSN.name(), tv02impbagPo.getGcibagsn()); 
			dataObject.setValue(Tv02impbagPo.COLUMNS.EXPBAGNO.name(), tv02impbagPo.getExpbagno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Tv02impbagPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Tv02impbagPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
