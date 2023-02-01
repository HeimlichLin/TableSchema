package com.doc.common.dao.impl; 
 
public class WorkimpchargeDAOImpl extends GeneralDAOImpl<WorkimpchargePo> implements WorkimpchargeDAO { 
	public static final WorkimpchargeDAOImpl INSTANCE = new WorkimpchargeDAOImpl(); 
	public static final String TABLENAME = "WORKIMPCHARGE"; 

	public WorkimpchargeDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<WorkimpchargePo> CONVERTER = new MapConverter<WorkimpchargePo>() { 
 
		@Override 
		public WorkimpchargePo convert(final DataObject dataObject) { 
			final WorkimpchargePo workimpchargePo = new WorkimpchargePo(); 
			workimpchargePo.setBagno(dataObject.getString(WorkimpchargePo.COLUMNS.BAGNO.name())); 
			workimpchargePo.setExpbagno(dataObject.getString(WorkimpchargePo.COLUMNS.EXPBAGNO.name())); 
			workimpchargePo.setBagweight(BigDecimalUtils.formObj(dataObject.getValue(WorkimpchargePo.COLUMNS.BAGWEIGHT.name()))); 
			workimpchargePo.setBagfee(BigDecimalUtils.formObj(dataObject.getValue(WorkimpchargePo.COLUMNS.BAGFEE.name()))); 
			workimpchargePo.setExpressid(dataObject.getString(WorkimpchargePo.COLUMNS.EXPRESSID.name())); 
			workimpchargePo.setAirlineid(dataObject.getString(WorkimpchargePo.COLUMNS.AIRLINEID.name())); 
			workimpchargePo.setChargebox(dataObject.getString(WorkimpchargePo.COLUMNS.CHARGEBOX.name())); 
			workimpchargePo.setChargedate(TimestampUtils.of(dataObject.getValue(WorkimpchargePo.COLUMNS.CHARGEDATE.name()))); 
			workimpchargePo.setIe(dataObject.getString(WorkimpchargePo.COLUMNS.IE.name())); 
			workimpchargePo.setGcibagsn(BigDecimalUtils.formObj(dataObject.getValue(WorkimpchargePo.COLUMNS.GCIBAGSN.name()))); 
			workimpchargePo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(WorkimpchargePo.COLUMNS.GCOBAGSN.name()))); 
			workimpchargePo.setGcidate1(TimestampUtils.of(dataObject.getValue(WorkimpchargePo.COLUMNS.GCIDATE1.name()))); 
			workimpchargePo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(WorkimpchargePo.COLUMNS.GCIWEIGHT.name()))); 
			workimpchargePo.setLastupdate(TimestampUtils.of(dataObject.getValue(WorkimpchargePo.COLUMNS.LASTUPDATE.name()))); 
			workimpchargePo.setBagWeight(BigDecimalUtils.formObj(dataObject.getValue(WorkimpchargePo.COLUMNS.BAG_WEIGHT.name()))); 
			workimpchargePo.setBagFee(BigDecimalUtils.formObj(dataObject.getValue(WorkimpchargePo.COLUMNS.BAG_FEE.name()))); 
			workimpchargePo.setBaghwb(BigDecimalUtils.formObj(dataObject.getValue(WorkimpchargePo.COLUMNS.BAGHWB.name()))); 
			workimpchargePo.setTotalFee(BigDecimalUtils.formObj(dataObject.getValue(WorkimpchargePo.COLUMNS.TOTAL_FEE.name()))); 
			return workimpchargePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final WorkimpchargePo workimpchargePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WorkimpchargePo.COLUMNS.BAGNO.name(), workimpchargePo.getBagno()); 
			dataObject.setValue(WorkimpchargePo.COLUMNS.EXPBAGNO.name(), workimpchargePo.getExpbagno()); 
			dataObject.setValue(WorkimpchargePo.COLUMNS.BAGWEIGHT.name(), workimpchargePo.getBagweight()); 
			dataObject.setValue(WorkimpchargePo.COLUMNS.BAGFEE.name(), workimpchargePo.getBagfee()); 
			dataObject.setValue(WorkimpchargePo.COLUMNS.EXPRESSID.name(), workimpchargePo.getExpressid()); 
			dataObject.setValue(WorkimpchargePo.COLUMNS.AIRLINEID.name(), workimpchargePo.getAirlineid()); 
			dataObject.setValue(WorkimpchargePo.COLUMNS.CHARGEBOX.name(), workimpchargePo.getChargebox()); 
			dataObject.setValue(WorkimpchargePo.COLUMNS.CHARGEDATE.name(), workimpchargePo.getChargedate()); 
			dataObject.setValue(WorkimpchargePo.COLUMNS.IE.name(), workimpchargePo.getIe()); 
			dataObject.setValue(WorkimpchargePo.COLUMNS.GCIBAGSN.name(), workimpchargePo.getGcibagsn()); 
			dataObject.setValue(WorkimpchargePo.COLUMNS.GCOBAGSN.name(), workimpchargePo.getGcobagsn()); 
			dataObject.setValue(WorkimpchargePo.COLUMNS.GCIDATE1.name(), workimpchargePo.getGcidate1()); 
			dataObject.setValue(WorkimpchargePo.COLUMNS.GCIWEIGHT.name(), workimpchargePo.getGciweight()); 
			dataObject.setValue(WorkimpchargePo.COLUMNS.LASTUPDATE.name(), workimpchargePo.getLastupdate()); 
			dataObject.setValue(WorkimpchargePo.COLUMNS.BAG_WEIGHT.name(), workimpchargePo.getBagWeight()); 
			dataObject.setValue(WorkimpchargePo.COLUMNS.BAG_FEE.name(), workimpchargePo.getBagFee()); 
			dataObject.setValue(WorkimpchargePo.COLUMNS.BAGHWB.name(), workimpchargePo.getBaghwb()); 
			dataObject.setValue(WorkimpchargePo.COLUMNS.TOTAL_FEE.name(), workimpchargePo.getTotalFee()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<WorkimpchargePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(WorkimpchargePo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
