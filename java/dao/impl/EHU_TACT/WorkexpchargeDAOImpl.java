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
			workexpchargePo.setDeclno(dataObject.getString(WorkexpchargePo.COLUMNS.DECLNO.name())); 
			workexpchargePo.setMwb(dataObject.getString(WorkexpchargePo.COLUMNS.MWB.name())); 
			workexpchargePo.setHwb(dataObject.getString(WorkexpchargePo.COLUMNS.HWB.name())); 
			workexpchargePo.setPrevpiece(BigDecimalUtils.formObj(dataObject.getValue(WorkexpchargePo.COLUMNS.PREVPIECE.name()))); 
			workexpchargePo.setPrevfee(BigDecimalUtils.formObj(dataObject.getValue(WorkexpchargePo.COLUMNS.PREVFEE.name()))); 
			workexpchargePo.setPrevweight(BigDecimalUtils.formObj(dataObject.getValue(WorkexpchargePo.COLUMNS.PREVWEIGHT.name()))); 
			workexpchargePo.setDiffpiece(BigDecimalUtils.formObj(dataObject.getValue(WorkexpchargePo.COLUMNS.DIFFPIECE.name()))); 
			workexpchargePo.setDifffee(BigDecimalUtils.formObj(dataObject.getValue(WorkexpchargePo.COLUMNS.DIFFFEE.name()))); 
			workexpchargePo.setDiffweight(BigDecimalUtils.formObj(dataObject.getValue(WorkexpchargePo.COLUMNS.DIFFWEIGHT.name()))); 
			workexpchargePo.setExpressid(dataObject.getString(WorkexpchargePo.COLUMNS.EXPRESSID.name())); 
			workexpchargePo.setWarehouse(dataObject.getString(WorkexpchargePo.COLUMNS.WAREHOUSE.name())); 
			workexpchargePo.setChargedate(TimestampUtils.of(dataObject.getValue(WorkexpchargePo.COLUMNS.CHARGEDATE.name()))); 
			workexpchargePo.setExtrafee(BigDecimalUtils.formObj(dataObject.getValue(WorkexpchargePo.COLUMNS.EXTRAFEE.name()))); 
			workexpchargePo.setExtrafeemark(dataObject.getString(WorkexpchargePo.COLUMNS.EXTRAFEEMARK.name())); 
			workexpchargePo.setCreatedate(TimestampUtils.of(dataObject.getValue(WorkexpchargePo.COLUMNS.CREATEDATE.name()))); 
			workexpchargePo.setLastchargedate(TimestampUtils.of(dataObject.getValue(WorkexpchargePo.COLUMNS.LASTCHARGEDATE.name()))); 
			workexpchargePo.setIe(dataObject.getString(WorkexpchargePo.COLUMNS.IE.name())); 
			workexpchargePo.setWorkarea(dataObject.getString(WorkexpchargePo.COLUMNS.WORKAREA.name())); 
			return workexpchargePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final WorkexpchargePo workexpchargePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WorkexpchargePo.COLUMNS.BAGNO.name(), workexpchargePo.getBagno()); 
			dataObject.setValue(WorkexpchargePo.COLUMNS.DECLNO.name(), workexpchargePo.getDeclno()); 
			dataObject.setValue(WorkexpchargePo.COLUMNS.MWB.name(), workexpchargePo.getMwb()); 
			dataObject.setValue(WorkexpchargePo.COLUMNS.HWB.name(), workexpchargePo.getHwb()); 
			dataObject.setValue(WorkexpchargePo.COLUMNS.PREVPIECE.name(), workexpchargePo.getPrevpiece()); 
			dataObject.setValue(WorkexpchargePo.COLUMNS.PREVFEE.name(), workexpchargePo.getPrevfee()); 
			dataObject.setValue(WorkexpchargePo.COLUMNS.PREVWEIGHT.name(), workexpchargePo.getPrevweight()); 
			dataObject.setValue(WorkexpchargePo.COLUMNS.DIFFPIECE.name(), workexpchargePo.getDiffpiece()); 
			dataObject.setValue(WorkexpchargePo.COLUMNS.DIFFFEE.name(), workexpchargePo.getDifffee()); 
			dataObject.setValue(WorkexpchargePo.COLUMNS.DIFFWEIGHT.name(), workexpchargePo.getDiffweight()); 
			dataObject.setValue(WorkexpchargePo.COLUMNS.EXPRESSID.name(), workexpchargePo.getExpressid()); 
			dataObject.setValue(WorkexpchargePo.COLUMNS.WAREHOUSE.name(), workexpchargePo.getWarehouse()); 
			dataObject.setValue(WorkexpchargePo.COLUMNS.CHARGEDATE.name(), workexpchargePo.getChargedate()); 
			dataObject.setValue(WorkexpchargePo.COLUMNS.EXTRAFEE.name(), workexpchargePo.getExtrafee()); 
			dataObject.setValue(WorkexpchargePo.COLUMNS.EXTRAFEEMARK.name(), workexpchargePo.getExtrafeemark()); 
			dataObject.setValue(WorkexpchargePo.COLUMNS.CREATEDATE.name(), workexpchargePo.getCreatedate()); 
			dataObject.setValue(WorkexpchargePo.COLUMNS.LASTCHARGEDATE.name(), workexpchargePo.getLastchargedate()); 
			dataObject.setValue(WorkexpchargePo.COLUMNS.IE.name(), workexpchargePo.getIe()); 
			dataObject.setValue(WorkexpchargePo.COLUMNS.WORKAREA.name(), workexpchargePo.getWorkarea()); 
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
