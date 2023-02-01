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
			workimpchargePo.setDeclno(dataObject.getString(WorkimpchargePo.COLUMNS.DECLNO.name())); 
			workimpchargePo.setMwb(dataObject.getString(WorkimpchargePo.COLUMNS.MWB.name())); 
			workimpchargePo.setHwb(dataObject.getString(WorkimpchargePo.COLUMNS.HWB.name())); 
			workimpchargePo.setPrevpiece(BigDecimalUtils.formObj(dataObject.getValue(WorkimpchargePo.COLUMNS.PREVPIECE.name()))); 
			workimpchargePo.setPrevfee(BigDecimalUtils.formObj(dataObject.getValue(WorkimpchargePo.COLUMNS.PREVFEE.name()))); 
			workimpchargePo.setPrevweight(BigDecimalUtils.formObj(dataObject.getValue(WorkimpchargePo.COLUMNS.PREVWEIGHT.name()))); 
			workimpchargePo.setDiffpiece(BigDecimalUtils.formObj(dataObject.getValue(WorkimpchargePo.COLUMNS.DIFFPIECE.name()))); 
			workimpchargePo.setDifffee(BigDecimalUtils.formObj(dataObject.getValue(WorkimpchargePo.COLUMNS.DIFFFEE.name()))); 
			workimpchargePo.setDiffweight(BigDecimalUtils.formObj(dataObject.getValue(WorkimpchargePo.COLUMNS.DIFFWEIGHT.name()))); 
			workimpchargePo.setExpressid(dataObject.getString(WorkimpchargePo.COLUMNS.EXPRESSID.name())); 
			workimpchargePo.setWarehouse(dataObject.getString(WorkimpchargePo.COLUMNS.WAREHOUSE.name())); 
			workimpchargePo.setChargedate(TimestampUtils.of(dataObject.getValue(WorkimpchargePo.COLUMNS.CHARGEDATE.name()))); 
			workimpchargePo.setExtrafee(BigDecimalUtils.formObj(dataObject.getValue(WorkimpchargePo.COLUMNS.EXTRAFEE.name()))); 
			workimpchargePo.setExtrafeemark(dataObject.getString(WorkimpchargePo.COLUMNS.EXTRAFEEMARK.name())); 
			workimpchargePo.setCreatedate(TimestampUtils.of(dataObject.getValue(WorkimpchargePo.COLUMNS.CREATEDATE.name()))); 
			workimpchargePo.setLastchargedate(TimestampUtils.of(dataObject.getValue(WorkimpchargePo.COLUMNS.LASTCHARGEDATE.name()))); 
			workimpchargePo.setIe(dataObject.getString(WorkimpchargePo.COLUMNS.IE.name())); 
			workimpchargePo.setWorkarea(dataObject.getString(WorkimpchargePo.COLUMNS.WORKAREA.name())); 
			return workimpchargePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final WorkimpchargePo workimpchargePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WorkimpchargePo.COLUMNS.BAGNO.name(), workimpchargePo.getBagno()); 
			dataObject.setValue(WorkimpchargePo.COLUMNS.DECLNO.name(), workimpchargePo.getDeclno()); 
			dataObject.setValue(WorkimpchargePo.COLUMNS.MWB.name(), workimpchargePo.getMwb()); 
			dataObject.setValue(WorkimpchargePo.COLUMNS.HWB.name(), workimpchargePo.getHwb()); 
			dataObject.setValue(WorkimpchargePo.COLUMNS.PREVPIECE.name(), workimpchargePo.getPrevpiece()); 
			dataObject.setValue(WorkimpchargePo.COLUMNS.PREVFEE.name(), workimpchargePo.getPrevfee()); 
			dataObject.setValue(WorkimpchargePo.COLUMNS.PREVWEIGHT.name(), workimpchargePo.getPrevweight()); 
			dataObject.setValue(WorkimpchargePo.COLUMNS.DIFFPIECE.name(), workimpchargePo.getDiffpiece()); 
			dataObject.setValue(WorkimpchargePo.COLUMNS.DIFFFEE.name(), workimpchargePo.getDifffee()); 
			dataObject.setValue(WorkimpchargePo.COLUMNS.DIFFWEIGHT.name(), workimpchargePo.getDiffweight()); 
			dataObject.setValue(WorkimpchargePo.COLUMNS.EXPRESSID.name(), workimpchargePo.getExpressid()); 
			dataObject.setValue(WorkimpchargePo.COLUMNS.WAREHOUSE.name(), workimpchargePo.getWarehouse()); 
			dataObject.setValue(WorkimpchargePo.COLUMNS.CHARGEDATE.name(), workimpchargePo.getChargedate()); 
			dataObject.setValue(WorkimpchargePo.COLUMNS.EXTRAFEE.name(), workimpchargePo.getExtrafee()); 
			dataObject.setValue(WorkimpchargePo.COLUMNS.EXTRAFEEMARK.name(), workimpchargePo.getExtrafeemark()); 
			dataObject.setValue(WorkimpchargePo.COLUMNS.CREATEDATE.name(), workimpchargePo.getCreatedate()); 
			dataObject.setValue(WorkimpchargePo.COLUMNS.LASTCHARGEDATE.name(), workimpchargePo.getLastchargedate()); 
			dataObject.setValue(WorkimpchargePo.COLUMNS.IE.name(), workimpchargePo.getIe()); 
			dataObject.setValue(WorkimpchargePo.COLUMNS.WORKAREA.name(), workimpchargePo.getWorkarea()); 
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
