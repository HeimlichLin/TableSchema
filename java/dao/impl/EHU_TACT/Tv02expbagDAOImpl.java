package com.doc.common.dao.impl; 
 
public class Tv02expbagDAOImpl extends GeneralDAOImpl<Tv02expbagPo> implements Tv02expbagDAO { 
	public static final Tv02expbagDAOImpl INSTANCE = new Tv02expbagDAOImpl(); 
	public static final String TABLENAME = "TV02EXPBAG"; 

	public Tv02expbagDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Tv02expbagPo> CONVERTER = new MapConverter<Tv02expbagPo>() { 
 
		@Override 
		public Tv02expbagPo convert(final DataObject dataObject) { 
			final Tv02expbagPo tv02expbagPo = new Tv02expbagPo(); 
			tv02expbagPo.setBagno(dataObject.getString(Tv02expbagPo.COLUMNS.BAGNO.name())); 
			tv02expbagPo.setBaghwb(BigDecimalUtils.formObj(dataObject.getValue(Tv02expbagPo.COLUMNS.BAGHWB.name()))); 
			tv02expbagPo.setBagpiece(BigDecimalUtils.formObj(dataObject.getValue(Tv02expbagPo.COLUMNS.BAGPIECE.name()))); 
			tv02expbagPo.setBagfee(BigDecimalUtils.formObj(dataObject.getValue(Tv02expbagPo.COLUMNS.BAGFEE.name()))); 
			tv02expbagPo.setBagweight(BigDecimalUtils.formObj(dataObject.getValue(Tv02expbagPo.COLUMNS.BAGWEIGHT.name()))); 
			tv02expbagPo.setChargedate(TimestampUtils.of(dataObject.getValue(Tv02expbagPo.COLUMNS.CHARGEDATE.name()))); 
			tv02expbagPo.setChargebox(dataObject.getString(Tv02expbagPo.COLUMNS.CHARGEBOX.name())); 
			tv02expbagPo.setAirlineid(dataObject.getString(Tv02expbagPo.COLUMNS.AIRLINEID.name())); 
			tv02expbagPo.setIe(dataObject.getString(Tv02expbagPo.COLUMNS.IE.name())); 
			tv02expbagPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(Tv02expbagPo.COLUMNS.GCOBAGSN.name()))); 
			tv02expbagPo.setLastupdate(TimestampUtils.of(dataObject.getValue(Tv02expbagPo.COLUMNS.LASTUPDATE.name()))); 
			tv02expbagPo.setExpressid(dataObject.getString(Tv02expbagPo.COLUMNS.EXPRESSID.name())); 
			tv02expbagPo.setGcibagsn(BigDecimalUtils.formObj(dataObject.getValue(Tv02expbagPo.COLUMNS.GCIBAGSN.name()))); 
			tv02expbagPo.setExpbagno(dataObject.getString(Tv02expbagPo.COLUMNS.EXPBAGNO.name())); 
			return tv02expbagPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Tv02expbagPo tv02expbagPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Tv02expbagPo.COLUMNS.BAGNO.name(), tv02expbagPo.getBagno()); 
			dataObject.setValue(Tv02expbagPo.COLUMNS.BAGHWB.name(), tv02expbagPo.getBaghwb()); 
			dataObject.setValue(Tv02expbagPo.COLUMNS.BAGPIECE.name(), tv02expbagPo.getBagpiece()); 
			dataObject.setValue(Tv02expbagPo.COLUMNS.BAGFEE.name(), tv02expbagPo.getBagfee()); 
			dataObject.setValue(Tv02expbagPo.COLUMNS.BAGWEIGHT.name(), tv02expbagPo.getBagweight()); 
			dataObject.setValue(Tv02expbagPo.COLUMNS.CHARGEDATE.name(), tv02expbagPo.getChargedate()); 
			dataObject.setValue(Tv02expbagPo.COLUMNS.CHARGEBOX.name(), tv02expbagPo.getChargebox()); 
			dataObject.setValue(Tv02expbagPo.COLUMNS.AIRLINEID.name(), tv02expbagPo.getAirlineid()); 
			dataObject.setValue(Tv02expbagPo.COLUMNS.IE.name(), tv02expbagPo.getIe()); 
			dataObject.setValue(Tv02expbagPo.COLUMNS.GCOBAGSN.name(), tv02expbagPo.getGcobagsn()); 
			dataObject.setValue(Tv02expbagPo.COLUMNS.LASTUPDATE.name(), tv02expbagPo.getLastupdate()); 
			dataObject.setValue(Tv02expbagPo.COLUMNS.EXPRESSID.name(), tv02expbagPo.getExpressid()); 
			dataObject.setValue(Tv02expbagPo.COLUMNS.GCIBAGSN.name(), tv02expbagPo.getGcibagsn()); 
			dataObject.setValue(Tv02expbagPo.COLUMNS.EXPBAGNO.name(), tv02expbagPo.getExpbagno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Tv02expbagPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Tv02expbagPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
