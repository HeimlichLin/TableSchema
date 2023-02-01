package com.doc.common.dao.impl; 
 
public class GcochargeDAOImpl extends GeneralDAOImpl<GcochargePo> implements GcochargeDAO { 
	public static final GcochargeDAOImpl INSTANCE = new GcochargeDAOImpl(); 
	public static final String TABLENAME = "GCOCHARGE"; 

	public GcochargeDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<GcochargePo> CONVERTER = new MapConverter<GcochargePo>() { 
 
		@Override 
		public GcochargePo convert(final DataObject dataObject) { 
			final GcochargePo gcochargePo = new GcochargePo(); 
			gcochargePo.setBagno(dataObject.getString(GcochargePo.COLUMNS.BAGNO.name())); 
			gcochargePo.setExpbagno(dataObject.getString(GcochargePo.COLUMNS.EXPBAGNO.name())); 
			gcochargePo.setBagweight(BigDecimalUtils.formObj(dataObject.getValue(GcochargePo.COLUMNS.BAGWEIGHT.name()))); 
			gcochargePo.setBagfee(BigDecimalUtils.formObj(dataObject.getValue(GcochargePo.COLUMNS.BAGFEE.name()))); 
			gcochargePo.setExpressid(dataObject.getString(GcochargePo.COLUMNS.EXPRESSID.name())); 
			gcochargePo.setAirlineid(dataObject.getString(GcochargePo.COLUMNS.AIRLINEID.name())); 
			gcochargePo.setChargebox(dataObject.getString(GcochargePo.COLUMNS.CHARGEBOX.name())); 
			gcochargePo.setChargedate(TimestampUtils.of(dataObject.getValue(GcochargePo.COLUMNS.CHARGEDATE.name()))); 
			gcochargePo.setIe(dataObject.getString(GcochargePo.COLUMNS.IE.name())); 
			gcochargePo.setGcibagsn(BigDecimalUtils.formObj(dataObject.getValue(GcochargePo.COLUMNS.GCIBAGSN.name()))); 
			gcochargePo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(GcochargePo.COLUMNS.GCOBAGSN.name()))); 
			gcochargePo.setGcidate1(TimestampUtils.of(dataObject.getValue(GcochargePo.COLUMNS.GCIDATE1.name()))); 
			gcochargePo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(GcochargePo.COLUMNS.GCIWEIGHT.name()))); 
			gcochargePo.setLastupdate(TimestampUtils.of(dataObject.getValue(GcochargePo.COLUMNS.LASTUPDATE.name()))); 
			gcochargePo.setBagWeight(BigDecimalUtils.formObj(dataObject.getValue(GcochargePo.COLUMNS.BAG_WEIGHT.name()))); 
			gcochargePo.setBagFee(BigDecimalUtils.formObj(dataObject.getValue(GcochargePo.COLUMNS.BAG_FEE.name()))); 
			gcochargePo.setBaghwb(BigDecimalUtils.formObj(dataObject.getValue(GcochargePo.COLUMNS.BAGHWB.name()))); 
			gcochargePo.setTotalFee(BigDecimalUtils.formObj(dataObject.getValue(GcochargePo.COLUMNS.TOTAL_FEE.name()))); 
			return gcochargePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final GcochargePo gcochargePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(GcochargePo.COLUMNS.BAGNO.name(), gcochargePo.getBagno()); 
			dataObject.setValue(GcochargePo.COLUMNS.EXPBAGNO.name(), gcochargePo.getExpbagno()); 
			dataObject.setValue(GcochargePo.COLUMNS.BAGWEIGHT.name(), gcochargePo.getBagweight()); 
			dataObject.setValue(GcochargePo.COLUMNS.BAGFEE.name(), gcochargePo.getBagfee()); 
			dataObject.setValue(GcochargePo.COLUMNS.EXPRESSID.name(), gcochargePo.getExpressid()); 
			dataObject.setValue(GcochargePo.COLUMNS.AIRLINEID.name(), gcochargePo.getAirlineid()); 
			dataObject.setValue(GcochargePo.COLUMNS.CHARGEBOX.name(), gcochargePo.getChargebox()); 
			dataObject.setValue(GcochargePo.COLUMNS.CHARGEDATE.name(), gcochargePo.getChargedate()); 
			dataObject.setValue(GcochargePo.COLUMNS.IE.name(), gcochargePo.getIe()); 
			dataObject.setValue(GcochargePo.COLUMNS.GCIBAGSN.name(), gcochargePo.getGcibagsn()); 
			dataObject.setValue(GcochargePo.COLUMNS.GCOBAGSN.name(), gcochargePo.getGcobagsn()); 
			dataObject.setValue(GcochargePo.COLUMNS.GCIDATE1.name(), gcochargePo.getGcidate1()); 
			dataObject.setValue(GcochargePo.COLUMNS.GCIWEIGHT.name(), gcochargePo.getGciweight()); 
			dataObject.setValue(GcochargePo.COLUMNS.LASTUPDATE.name(), gcochargePo.getLastupdate()); 
			dataObject.setValue(GcochargePo.COLUMNS.BAG_WEIGHT.name(), gcochargePo.getBagWeight()); 
			dataObject.setValue(GcochargePo.COLUMNS.BAG_FEE.name(), gcochargePo.getBagFee()); 
			dataObject.setValue(GcochargePo.COLUMNS.BAGHWB.name(), gcochargePo.getBaghwb()); 
			dataObject.setValue(GcochargePo.COLUMNS.TOTAL_FEE.name(), gcochargePo.getTotalFee()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<GcochargePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(GcochargePo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
