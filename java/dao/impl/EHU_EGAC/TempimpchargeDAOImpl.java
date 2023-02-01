package com.doc.common.dao.impl; 
 
public class TempimpchargeDAOImpl extends GeneralDAOImpl<TempimpchargePo> implements TempimpchargeDAO { 
	public static final TempimpchargeDAOImpl INSTANCE = new TempimpchargeDAOImpl(); 
	public static final String TABLENAME = "TEMPIMPCHARGE"; 

	public TempimpchargeDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TempimpchargePo> CONVERTER = new MapConverter<TempimpchargePo>() { 
 
		@Override 
		public TempimpchargePo convert(final DataObject dataObject) { 
			final TempimpchargePo tempimpchargePo = new TempimpchargePo(); 
			tempimpchargePo.setBagno(dataObject.getString(TempimpchargePo.COLUMNS.BAGNO.name())); 
			tempimpchargePo.setExpbagno(dataObject.getString(TempimpchargePo.COLUMNS.EXPBAGNO.name())); 
			tempimpchargePo.setBagweight(BigDecimalUtils.formObj(dataObject.getValue(TempimpchargePo.COLUMNS.BAGWEIGHT.name()))); 
			tempimpchargePo.setBagfee(BigDecimalUtils.formObj(dataObject.getValue(TempimpchargePo.COLUMNS.BAGFEE.name()))); 
			tempimpchargePo.setExpressid(dataObject.getString(TempimpchargePo.COLUMNS.EXPRESSID.name())); 
			tempimpchargePo.setAirlineid(dataObject.getString(TempimpchargePo.COLUMNS.AIRLINEID.name())); 
			tempimpchargePo.setChargebox(dataObject.getString(TempimpchargePo.COLUMNS.CHARGEBOX.name())); 
			tempimpchargePo.setChargedate(TimestampUtils.of(dataObject.getValue(TempimpchargePo.COLUMNS.CHARGEDATE.name()))); 
			tempimpchargePo.setIe(dataObject.getString(TempimpchargePo.COLUMNS.IE.name())); 
			tempimpchargePo.setGcibagsn(BigDecimalUtils.formObj(dataObject.getValue(TempimpchargePo.COLUMNS.GCIBAGSN.name()))); 
			tempimpchargePo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(TempimpchargePo.COLUMNS.GCOBAGSN.name()))); 
			tempimpchargePo.setGcidate1(TimestampUtils.of(dataObject.getValue(TempimpchargePo.COLUMNS.GCIDATE1.name()))); 
			tempimpchargePo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(TempimpchargePo.COLUMNS.GCIWEIGHT.name()))); 
			tempimpchargePo.setLastupdate(TimestampUtils.of(dataObject.getValue(TempimpchargePo.COLUMNS.LASTUPDATE.name()))); 
			tempimpchargePo.setBagWeight(BigDecimalUtils.formObj(dataObject.getValue(TempimpchargePo.COLUMNS.BAG_WEIGHT.name()))); 
			tempimpchargePo.setBagFee(BigDecimalUtils.formObj(dataObject.getValue(TempimpchargePo.COLUMNS.BAG_FEE.name()))); 
			tempimpchargePo.setBaghwb(BigDecimalUtils.formObj(dataObject.getValue(TempimpchargePo.COLUMNS.BAGHWB.name()))); 
			tempimpchargePo.setTotalFee(BigDecimalUtils.formObj(dataObject.getValue(TempimpchargePo.COLUMNS.TOTAL_FEE.name()))); 
			return tempimpchargePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TempimpchargePo tempimpchargePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TempimpchargePo.COLUMNS.BAGNO.name(), tempimpchargePo.getBagno()); 
			dataObject.setValue(TempimpchargePo.COLUMNS.EXPBAGNO.name(), tempimpchargePo.getExpbagno()); 
			dataObject.setValue(TempimpchargePo.COLUMNS.BAGWEIGHT.name(), tempimpchargePo.getBagweight()); 
			dataObject.setValue(TempimpchargePo.COLUMNS.BAGFEE.name(), tempimpchargePo.getBagfee()); 
			dataObject.setValue(TempimpchargePo.COLUMNS.EXPRESSID.name(), tempimpchargePo.getExpressid()); 
			dataObject.setValue(TempimpchargePo.COLUMNS.AIRLINEID.name(), tempimpchargePo.getAirlineid()); 
			dataObject.setValue(TempimpchargePo.COLUMNS.CHARGEBOX.name(), tempimpchargePo.getChargebox()); 
			dataObject.setValue(TempimpchargePo.COLUMNS.CHARGEDATE.name(), tempimpchargePo.getChargedate()); 
			dataObject.setValue(TempimpchargePo.COLUMNS.IE.name(), tempimpchargePo.getIe()); 
			dataObject.setValue(TempimpchargePo.COLUMNS.GCIBAGSN.name(), tempimpchargePo.getGcibagsn()); 
			dataObject.setValue(TempimpchargePo.COLUMNS.GCOBAGSN.name(), tempimpchargePo.getGcobagsn()); 
			dataObject.setValue(TempimpchargePo.COLUMNS.GCIDATE1.name(), tempimpchargePo.getGcidate1()); 
			dataObject.setValue(TempimpchargePo.COLUMNS.GCIWEIGHT.name(), tempimpchargePo.getGciweight()); 
			dataObject.setValue(TempimpchargePo.COLUMNS.LASTUPDATE.name(), tempimpchargePo.getLastupdate()); 
			dataObject.setValue(TempimpchargePo.COLUMNS.BAG_WEIGHT.name(), tempimpchargePo.getBagWeight()); 
			dataObject.setValue(TempimpchargePo.COLUMNS.BAG_FEE.name(), tempimpchargePo.getBagFee()); 
			dataObject.setValue(TempimpchargePo.COLUMNS.BAGHWB.name(), tempimpchargePo.getBaghwb()); 
			dataObject.setValue(TempimpchargePo.COLUMNS.TOTAL_FEE.name(), tempimpchargePo.getTotalFee()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TempimpchargePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TempimpchargePo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
