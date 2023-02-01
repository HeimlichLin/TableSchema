package com.doc.common.dao.impl; 
 
public class WorkimpchargeTDAOImpl extends GeneralDAOImpl<WorkimpchargeTPo> implements WorkimpchargeTDAO { 
	public static final WorkimpchargeTDAOImpl INSTANCE = new WorkimpchargeTDAOImpl(); 
	public static final String TABLENAME = "WORKIMPCHARGE_T"; 

	public WorkimpchargeTDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<WorkimpchargeTPo> CONVERTER = new MapConverter<WorkimpchargeTPo>() { 
 
		@Override 
		public WorkimpchargeTPo convert(final DataObject dataObject) { 
			final WorkimpchargeTPo workimpchargeTPo = new WorkimpchargeTPo(); 
			workimpchargeTPo.setBagno(dataObject.getString(WorkimpchargeTPo.COLUMNS.BAGNO.name())); 
			workimpchargeTPo.setDeclno(dataObject.getString(WorkimpchargeTPo.COLUMNS.DECLNO.name())); 
			workimpchargeTPo.setMwb(dataObject.getString(WorkimpchargeTPo.COLUMNS.MWB.name())); 
			workimpchargeTPo.setHwb(dataObject.getString(WorkimpchargeTPo.COLUMNS.HWB.name())); 
			workimpchargeTPo.setPrevpiece(BigDecimalUtils.formObj(dataObject.getValue(WorkimpchargeTPo.COLUMNS.PREVPIECE.name()))); 
			workimpchargeTPo.setPrevfee(BigDecimalUtils.formObj(dataObject.getValue(WorkimpchargeTPo.COLUMNS.PREVFEE.name()))); 
			workimpchargeTPo.setPrevweight(BigDecimalUtils.formObj(dataObject.getValue(WorkimpchargeTPo.COLUMNS.PREVWEIGHT.name()))); 
			workimpchargeTPo.setDiffpiece(BigDecimalUtils.formObj(dataObject.getValue(WorkimpchargeTPo.COLUMNS.DIFFPIECE.name()))); 
			workimpchargeTPo.setDifffee(BigDecimalUtils.formObj(dataObject.getValue(WorkimpchargeTPo.COLUMNS.DIFFFEE.name()))); 
			workimpchargeTPo.setDiffweight(BigDecimalUtils.formObj(dataObject.getValue(WorkimpchargeTPo.COLUMNS.DIFFWEIGHT.name()))); 
			workimpchargeTPo.setExpressid(dataObject.getString(WorkimpchargeTPo.COLUMNS.EXPRESSID.name())); 
			workimpchargeTPo.setWarehouse(dataObject.getString(WorkimpchargeTPo.COLUMNS.WAREHOUSE.name())); 
			workimpchargeTPo.setChargedate(TimestampUtils.of(dataObject.getValue(WorkimpchargeTPo.COLUMNS.CHARGEDATE.name()))); 
			workimpchargeTPo.setExtrafee(BigDecimalUtils.formObj(dataObject.getValue(WorkimpchargeTPo.COLUMNS.EXTRAFEE.name()))); 
			workimpchargeTPo.setExtrafeemark(dataObject.getString(WorkimpchargeTPo.COLUMNS.EXTRAFEEMARK.name())); 
			workimpchargeTPo.setCreatedate(TimestampUtils.of(dataObject.getValue(WorkimpchargeTPo.COLUMNS.CREATEDATE.name()))); 
			workimpchargeTPo.setLastchargedate(TimestampUtils.of(dataObject.getValue(WorkimpchargeTPo.COLUMNS.LASTCHARGEDATE.name()))); 
			workimpchargeTPo.setIe(dataObject.getString(WorkimpchargeTPo.COLUMNS.IE.name())); 
			return workimpchargeTPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final WorkimpchargeTPo workimpchargeTPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WorkimpchargeTPo.COLUMNS.BAGNO.name(), workimpchargeTPo.getBagno()); 
			dataObject.setValue(WorkimpchargeTPo.COLUMNS.DECLNO.name(), workimpchargeTPo.getDeclno()); 
			dataObject.setValue(WorkimpchargeTPo.COLUMNS.MWB.name(), workimpchargeTPo.getMwb()); 
			dataObject.setValue(WorkimpchargeTPo.COLUMNS.HWB.name(), workimpchargeTPo.getHwb()); 
			dataObject.setValue(WorkimpchargeTPo.COLUMNS.PREVPIECE.name(), workimpchargeTPo.getPrevpiece()); 
			dataObject.setValue(WorkimpchargeTPo.COLUMNS.PREVFEE.name(), workimpchargeTPo.getPrevfee()); 
			dataObject.setValue(WorkimpchargeTPo.COLUMNS.PREVWEIGHT.name(), workimpchargeTPo.getPrevweight()); 
			dataObject.setValue(WorkimpchargeTPo.COLUMNS.DIFFPIECE.name(), workimpchargeTPo.getDiffpiece()); 
			dataObject.setValue(WorkimpchargeTPo.COLUMNS.DIFFFEE.name(), workimpchargeTPo.getDifffee()); 
			dataObject.setValue(WorkimpchargeTPo.COLUMNS.DIFFWEIGHT.name(), workimpchargeTPo.getDiffweight()); 
			dataObject.setValue(WorkimpchargeTPo.COLUMNS.EXPRESSID.name(), workimpchargeTPo.getExpressid()); 
			dataObject.setValue(WorkimpchargeTPo.COLUMNS.WAREHOUSE.name(), workimpchargeTPo.getWarehouse()); 
			dataObject.setValue(WorkimpchargeTPo.COLUMNS.CHARGEDATE.name(), workimpchargeTPo.getChargedate()); 
			dataObject.setValue(WorkimpchargeTPo.COLUMNS.EXTRAFEE.name(), workimpchargeTPo.getExtrafee()); 
			dataObject.setValue(WorkimpchargeTPo.COLUMNS.EXTRAFEEMARK.name(), workimpchargeTPo.getExtrafeemark()); 
			dataObject.setValue(WorkimpchargeTPo.COLUMNS.CREATEDATE.name(), workimpchargeTPo.getCreatedate()); 
			dataObject.setValue(WorkimpchargeTPo.COLUMNS.LASTCHARGEDATE.name(), workimpchargeTPo.getLastchargedate()); 
			dataObject.setValue(WorkimpchargeTPo.COLUMNS.IE.name(), workimpchargeTPo.getIe()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<WorkimpchargeTPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(WorkimpchargeTPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
