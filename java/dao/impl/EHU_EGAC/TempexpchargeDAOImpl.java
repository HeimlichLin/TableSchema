package com.doc.common.dao.impl; 
 
public class TempexpchargeDAOImpl extends GeneralDAOImpl<TempexpchargePo> implements TempexpchargeDAO { 
	public static final TempexpchargeDAOImpl INSTANCE = new TempexpchargeDAOImpl(); 
	public static final String TABLENAME = "TEMPEXPCHARGE"; 

	public TempexpchargeDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TempexpchargePo> CONVERTER = new MapConverter<TempexpchargePo>() { 
 
		@Override 
		public TempexpchargePo convert(final DataObject dataObject) { 
			final TempexpchargePo tempexpchargePo = new TempexpchargePo(); 
			tempexpchargePo.setBagno(dataObject.getString(TempexpchargePo.COLUMNS.BAGNO.name())); 
			tempexpchargePo.setExpbagno(dataObject.getString(TempexpchargePo.COLUMNS.EXPBAGNO.name())); 
			tempexpchargePo.setBagweight(BigDecimalUtils.formObj(dataObject.getValue(TempexpchargePo.COLUMNS.BAGWEIGHT.name()))); 
			tempexpchargePo.setBagfee(BigDecimalUtils.formObj(dataObject.getValue(TempexpchargePo.COLUMNS.BAGFEE.name()))); 
			tempexpchargePo.setExpressid(dataObject.getString(TempexpchargePo.COLUMNS.EXPRESSID.name())); 
			tempexpchargePo.setAirlineid(dataObject.getString(TempexpchargePo.COLUMNS.AIRLINEID.name())); 
			tempexpchargePo.setChargebox(dataObject.getString(TempexpchargePo.COLUMNS.CHARGEBOX.name())); 
			tempexpchargePo.setChargedate(TimestampUtils.of(dataObject.getValue(TempexpchargePo.COLUMNS.CHARGEDATE.name()))); 
			tempexpchargePo.setIe(dataObject.getString(TempexpchargePo.COLUMNS.IE.name())); 
			tempexpchargePo.setGcibagsn(BigDecimalUtils.formObj(dataObject.getValue(TempexpchargePo.COLUMNS.GCIBAGSN.name()))); 
			tempexpchargePo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(TempexpchargePo.COLUMNS.GCOBAGSN.name()))); 
			tempexpchargePo.setGcidate1(TimestampUtils.of(dataObject.getValue(TempexpchargePo.COLUMNS.GCIDATE1.name()))); 
			tempexpchargePo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(TempexpchargePo.COLUMNS.GCIWEIGHT.name()))); 
			tempexpchargePo.setLastupdate(TimestampUtils.of(dataObject.getValue(TempexpchargePo.COLUMNS.LASTUPDATE.name()))); 
			tempexpchargePo.setBagWeight(BigDecimalUtils.formObj(dataObject.getValue(TempexpchargePo.COLUMNS.BAG_WEIGHT.name()))); 
			tempexpchargePo.setBagFee(BigDecimalUtils.formObj(dataObject.getValue(TempexpchargePo.COLUMNS.BAG_FEE.name()))); 
			tempexpchargePo.setBaghwb(BigDecimalUtils.formObj(dataObject.getValue(TempexpchargePo.COLUMNS.BAGHWB.name()))); 
			tempexpchargePo.setTotalFee(BigDecimalUtils.formObj(dataObject.getValue(TempexpchargePo.COLUMNS.TOTAL_FEE.name()))); 
			return tempexpchargePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TempexpchargePo tempexpchargePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TempexpchargePo.COLUMNS.BAGNO.name(), tempexpchargePo.getBagno()); 
			dataObject.setValue(TempexpchargePo.COLUMNS.EXPBAGNO.name(), tempexpchargePo.getExpbagno()); 
			dataObject.setValue(TempexpchargePo.COLUMNS.BAGWEIGHT.name(), tempexpchargePo.getBagweight()); 
			dataObject.setValue(TempexpchargePo.COLUMNS.BAGFEE.name(), tempexpchargePo.getBagfee()); 
			dataObject.setValue(TempexpchargePo.COLUMNS.EXPRESSID.name(), tempexpchargePo.getExpressid()); 
			dataObject.setValue(TempexpchargePo.COLUMNS.AIRLINEID.name(), tempexpchargePo.getAirlineid()); 
			dataObject.setValue(TempexpchargePo.COLUMNS.CHARGEBOX.name(), tempexpchargePo.getChargebox()); 
			dataObject.setValue(TempexpchargePo.COLUMNS.CHARGEDATE.name(), tempexpchargePo.getChargedate()); 
			dataObject.setValue(TempexpchargePo.COLUMNS.IE.name(), tempexpchargePo.getIe()); 
			dataObject.setValue(TempexpchargePo.COLUMNS.GCIBAGSN.name(), tempexpchargePo.getGcibagsn()); 
			dataObject.setValue(TempexpchargePo.COLUMNS.GCOBAGSN.name(), tempexpchargePo.getGcobagsn()); 
			dataObject.setValue(TempexpchargePo.COLUMNS.GCIDATE1.name(), tempexpchargePo.getGcidate1()); 
			dataObject.setValue(TempexpchargePo.COLUMNS.GCIWEIGHT.name(), tempexpchargePo.getGciweight()); 
			dataObject.setValue(TempexpchargePo.COLUMNS.LASTUPDATE.name(), tempexpchargePo.getLastupdate()); 
			dataObject.setValue(TempexpchargePo.COLUMNS.BAG_WEIGHT.name(), tempexpchargePo.getBagWeight()); 
			dataObject.setValue(TempexpchargePo.COLUMNS.BAG_FEE.name(), tempexpchargePo.getBagFee()); 
			dataObject.setValue(TempexpchargePo.COLUMNS.BAGHWB.name(), tempexpchargePo.getBaghwb()); 
			dataObject.setValue(TempexpchargePo.COLUMNS.TOTAL_FEE.name(), tempexpchargePo.getTotalFee()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TempexpchargePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TempexpchargePo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
