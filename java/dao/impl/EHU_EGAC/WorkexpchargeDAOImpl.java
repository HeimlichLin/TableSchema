package com.doc.common.dao.impl; 
 
public class WorkexpchargeDAOImpl extends GeneralDAOImpl<WorkexpchargePo> implements WorkexpchargeDAO { 
	public static final WorkexpchargeDAOImpl INSTANCE = new WorkexpchargeDAOImpl(); 
	public static final String TABLENAME = "WORKEXPCHARGE"; 

	public WorkexpchargeDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<WorkexpchargePo> CONVERTER = new MapConverter<WorkexpchargePo>() { 
 
		@Override 
		public WorkexpchargePo convert(final DataObject dataObject) { 
			final WorkexpchargePo workexpchargePo = new WorkexpchargePo(); 
			workexpchargePo.setBagno(dataObject.getString(WorkexpchargePo.COLUMNS.BAGNO.name())); 
			workexpchargePo.setExpbagno(dataObject.getString(WorkexpchargePo.COLUMNS.EXPBAGNO.name())); 
			workexpchargePo.setBagweight(BigDecimalUtils.formObj(dataObject.getValue(WorkexpchargePo.COLUMNS.BAGWEIGHT.name()))); 
			workexpchargePo.setBagfee(BigDecimalUtils.formObj(dataObject.getValue(WorkexpchargePo.COLUMNS.BAGFEE.name()))); 
			workexpchargePo.setExpressid(dataObject.getString(WorkexpchargePo.COLUMNS.EXPRESSID.name())); 
			workexpchargePo.setAirlineid(dataObject.getString(WorkexpchargePo.COLUMNS.AIRLINEID.name())); 
			workexpchargePo.setChargebox(dataObject.getString(WorkexpchargePo.COLUMNS.CHARGEBOX.name())); 
			workexpchargePo.setChargedate(TimestampUtils.of(dataObject.getValue(WorkexpchargePo.COLUMNS.CHARGEDATE.name()))); 
			workexpchargePo.setIe(dataObject.getString(WorkexpchargePo.COLUMNS.IE.name())); 
			workexpchargePo.setGcibagsn(BigDecimalUtils.formObj(dataObject.getValue(WorkexpchargePo.COLUMNS.GCIBAGSN.name()))); 
			workexpchargePo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(WorkexpchargePo.COLUMNS.GCOBAGSN.name()))); 
			workexpchargePo.setGcidate1(TimestampUtils.of(dataObject.getValue(WorkexpchargePo.COLUMNS.GCIDATE1.name()))); 
			workexpchargePo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(WorkexpchargePo.COLUMNS.GCIWEIGHT.name()))); 
			workexpchargePo.setLastupdate(TimestampUtils.of(dataObject.getValue(WorkexpchargePo.COLUMNS.LASTUPDATE.name()))); 
			workexpchargePo.setBagWeight(BigDecimalUtils.formObj(dataObject.getValue(WorkexpchargePo.COLUMNS.BAG_WEIGHT.name()))); 
			workexpchargePo.setBagFee(BigDecimalUtils.formObj(dataObject.getValue(WorkexpchargePo.COLUMNS.BAG_FEE.name()))); 
			workexpchargePo.setBaghwb(BigDecimalUtils.formObj(dataObject.getValue(WorkexpchargePo.COLUMNS.BAGHWB.name()))); 
			workexpchargePo.setTotalFee(BigDecimalUtils.formObj(dataObject.getValue(WorkexpchargePo.COLUMNS.TOTAL_FEE.name()))); 
			return workexpchargePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final WorkexpchargePo workexpchargePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WorkexpchargePo.COLUMNS.BAGNO.name(), workexpchargePo.getBagno()); 
			dataObject.setValue(WorkexpchargePo.COLUMNS.EXPBAGNO.name(), workexpchargePo.getExpbagno()); 
			dataObject.setValue(WorkexpchargePo.COLUMNS.BAGWEIGHT.name(), workexpchargePo.getBagweight()); 
			dataObject.setValue(WorkexpchargePo.COLUMNS.BAGFEE.name(), workexpchargePo.getBagfee()); 
			dataObject.setValue(WorkexpchargePo.COLUMNS.EXPRESSID.name(), workexpchargePo.getExpressid()); 
			dataObject.setValue(WorkexpchargePo.COLUMNS.AIRLINEID.name(), workexpchargePo.getAirlineid()); 
			dataObject.setValue(WorkexpchargePo.COLUMNS.CHARGEBOX.name(), workexpchargePo.getChargebox()); 
			dataObject.setValue(WorkexpchargePo.COLUMNS.CHARGEDATE.name(), workexpchargePo.getChargedate()); 
			dataObject.setValue(WorkexpchargePo.COLUMNS.IE.name(), workexpchargePo.getIe()); 
			dataObject.setValue(WorkexpchargePo.COLUMNS.GCIBAGSN.name(), workexpchargePo.getGcibagsn()); 
			dataObject.setValue(WorkexpchargePo.COLUMNS.GCOBAGSN.name(), workexpchargePo.getGcobagsn()); 
			dataObject.setValue(WorkexpchargePo.COLUMNS.GCIDATE1.name(), workexpchargePo.getGcidate1()); 
			dataObject.setValue(WorkexpchargePo.COLUMNS.GCIWEIGHT.name(), workexpchargePo.getGciweight()); 
			dataObject.setValue(WorkexpchargePo.COLUMNS.LASTUPDATE.name(), workexpchargePo.getLastupdate()); 
			dataObject.setValue(WorkexpchargePo.COLUMNS.BAG_WEIGHT.name(), workexpchargePo.getBagWeight()); 
			dataObject.setValue(WorkexpchargePo.COLUMNS.BAG_FEE.name(), workexpchargePo.getBagFee()); 
			dataObject.setValue(WorkexpchargePo.COLUMNS.BAGHWB.name(), workexpchargePo.getBaghwb()); 
			dataObject.setValue(WorkexpchargePo.COLUMNS.TOTAL_FEE.name(), workexpchargePo.getTotalFee()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<WorkexpchargePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(WorkexpchargePo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
