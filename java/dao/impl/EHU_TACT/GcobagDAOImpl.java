package com.doc.common.dao.impl; 
 
public class GcobagDAOImpl extends GeneralDAOImpl<GcobagPo> implements GcobagDAO { 
	public static final GcobagDAOImpl INSTANCE = new GcobagDAOImpl(); 
	public static final String TABLENAME = "GCOBAG"; 

	public GcobagDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<GcobagPo> CONVERTER = new MapConverter<GcobagPo>() { 
 
		@Override 
		public GcobagPo convert(final DataObject dataObject) { 
			final GcobagPo gcobagPo = new GcobagPo(); 
			gcobagPo.setBagno(dataObject.getString(GcobagPo.COLUMNS.BAGNO.name())); 
			gcobagPo.setExpbagno(dataObject.getString(GcobagPo.COLUMNS.EXPBAGNO.name())); 
			gcobagPo.setBaghwb(BigDecimalUtils.formObj(dataObject.getValue(GcobagPo.COLUMNS.BAGHWB.name()))); 
			gcobagPo.setBagpiece(BigDecimalUtils.formObj(dataObject.getValue(GcobagPo.COLUMNS.BAGPIECE.name()))); 
			gcobagPo.setBagweight(BigDecimalUtils.formObj(dataObject.getValue(GcobagPo.COLUMNS.BAGWEIGHT.name()))); 
			gcobagPo.setBagfee(BigDecimalUtils.formObj(dataObject.getValue(GcobagPo.COLUMNS.BAGFEE.name()))); 
			gcobagPo.setExpressid(dataObject.getString(GcobagPo.COLUMNS.EXPRESSID.name())); 
			gcobagPo.setAirlineid(dataObject.getString(GcobagPo.COLUMNS.AIRLINEID.name())); 
			gcobagPo.setChargebox(dataObject.getString(GcobagPo.COLUMNS.CHARGEBOX.name())); 
			gcobagPo.setChargedate(TimestampUtils.of(dataObject.getValue(GcobagPo.COLUMNS.CHARGEDATE.name()))); 
			gcobagPo.setIe(dataObject.getString(GcobagPo.COLUMNS.IE.name())); 
			gcobagPo.setGcibagsn(BigDecimalUtils.formObj(dataObject.getValue(GcobagPo.COLUMNS.GCIBAGSN.name()))); 
			gcobagPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(GcobagPo.COLUMNS.GCOBAGSN.name()))); 
			gcobagPo.setLastupdate(TimestampUtils.of(dataObject.getValue(GcobagPo.COLUMNS.LASTUPDATE.name()))); 
			gcobagPo.setChargeuser(dataObject.getString(GcobagPo.COLUMNS.CHARGEUSER.name())); 
			gcobagPo.setExpressfee(BigDecimalUtils.formObj(dataObject.getValue(GcobagPo.COLUMNS.EXPRESSFEE.name()))); 
			gcobagPo.setAirlinefee(BigDecimalUtils.formObj(dataObject.getValue(GcobagPo.COLUMNS.AIRLINEFEE.name()))); 
			gcobagPo.setFlightno(dataObject.getString(GcobagPo.COLUMNS.FLIGHTNO.name())); 
			gcobagPo.setLastchargedate(TimestampUtils.of(dataObject.getValue(GcobagPo.COLUMNS.LASTCHARGEDATE.name()))); 
			gcobagPo.setWorkarea(dataObject.getString(GcobagPo.COLUMNS.WORKAREA.name())); 
			return gcobagPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final GcobagPo gcobagPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(GcobagPo.COLUMNS.BAGNO.name(), gcobagPo.getBagno()); 
			dataObject.setValue(GcobagPo.COLUMNS.EXPBAGNO.name(), gcobagPo.getExpbagno()); 
			dataObject.setValue(GcobagPo.COLUMNS.BAGHWB.name(), gcobagPo.getBaghwb()); 
			dataObject.setValue(GcobagPo.COLUMNS.BAGPIECE.name(), gcobagPo.getBagpiece()); 
			dataObject.setValue(GcobagPo.COLUMNS.BAGWEIGHT.name(), gcobagPo.getBagweight()); 
			dataObject.setValue(GcobagPo.COLUMNS.BAGFEE.name(), gcobagPo.getBagfee()); 
			dataObject.setValue(GcobagPo.COLUMNS.EXPRESSID.name(), gcobagPo.getExpressid()); 
			dataObject.setValue(GcobagPo.COLUMNS.AIRLINEID.name(), gcobagPo.getAirlineid()); 
			dataObject.setValue(GcobagPo.COLUMNS.CHARGEBOX.name(), gcobagPo.getChargebox()); 
			dataObject.setValue(GcobagPo.COLUMNS.CHARGEDATE.name(), gcobagPo.getChargedate()); 
			dataObject.setValue(GcobagPo.COLUMNS.IE.name(), gcobagPo.getIe()); 
			dataObject.setValue(GcobagPo.COLUMNS.GCIBAGSN.name(), gcobagPo.getGcibagsn()); 
			dataObject.setValue(GcobagPo.COLUMNS.GCOBAGSN.name(), gcobagPo.getGcobagsn()); 
			dataObject.setValue(GcobagPo.COLUMNS.LASTUPDATE.name(), gcobagPo.getLastupdate()); 
			dataObject.setValue(GcobagPo.COLUMNS.CHARGEUSER.name(), gcobagPo.getChargeuser()); 
			dataObject.setValue(GcobagPo.COLUMNS.EXPRESSFEE.name(), gcobagPo.getExpressfee()); 
			dataObject.setValue(GcobagPo.COLUMNS.AIRLINEFEE.name(), gcobagPo.getAirlinefee()); 
			dataObject.setValue(GcobagPo.COLUMNS.FLIGHTNO.name(), gcobagPo.getFlightno()); 
			dataObject.setValue(GcobagPo.COLUMNS.LASTCHARGEDATE.name(), gcobagPo.getLastchargedate()); 
			dataObject.setValue(GcobagPo.COLUMNS.WORKAREA.name(), gcobagPo.getWorkarea()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<GcobagPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(GcobagPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
