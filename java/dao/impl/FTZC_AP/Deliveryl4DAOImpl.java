package com.doc.common.dao.impl; 
 
public class Deliveryl4DAOImpl extends GeneralDAOImpl<Deliveryl4Po> implements Deliveryl4DAO { 
	public static final Deliveryl4DAOImpl INSTANCE = new Deliveryl4DAOImpl(); 
	public static final String TABLENAME = "DELIVERYL4"; 

	public Deliveryl4DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Deliveryl4Po> CONVERTER = new MapConverter<Deliveryl4Po>() { 
 
		@Override 
		public Deliveryl4Po convert(final DataObject dataObject) { 
			final Deliveryl4Po deliveryl4Po = new Deliveryl4Po(); 
			deliveryl4Po.setBfNo(dataObject.getString(Deliveryl4Po.COLUMNS.BF_NO.name())); 
			deliveryl4Po.setDeliveryNo(dataObject.getString(Deliveryl4Po.COLUMNS.DELIVERY_NO.name())); 
			deliveryl4Po.setPrdtNo(dataObject.getString(Deliveryl4Po.COLUMNS.PRDT_NO.name())); 
			deliveryl4Po.setUnit(dataObject.getString(Deliveryl4Po.COLUMNS.UNIT.name())); 
			deliveryl4Po.setQty(dataObject.getString(Deliveryl4Po.COLUMNS.QTY.name())); 
			deliveryl4Po.setSpec(dataObject.getString(Deliveryl4Po.COLUMNS.SPEC.name())); 
			deliveryl4Po.setModel(dataObject.getString(Deliveryl4Po.COLUMNS.MODEL.name())); 
			deliveryl4Po.setDescrip(dataObject.getString(Deliveryl4Po.COLUMNS.DESCRIP.name())); 
			deliveryl4Po.setCccCode(dataObject.getString(Deliveryl4Po.COLUMNS.CCC_CODE.name())); 
			deliveryl4Po.setMakePlace(dataObject.getString(Deliveryl4Po.COLUMNS.MAKE_PLACE.name())); 
			deliveryl4Po.setApplyNo(dataObject.getString(Deliveryl4Po.COLUMNS.APPLY_NO.name())); 
			deliveryl4Po.setItem(BigDecimalUtils.formObj(dataObject.getValue(Deliveryl4Po.COLUMNS.ITEM.name()))); 
			deliveryl4Po.setBomDate(dataObject.getString(Deliveryl4Po.COLUMNS.BOM_DATE.name())); 
			deliveryl4Po.setStartPlace(dataObject.getString(Deliveryl4Po.COLUMNS.START_PLACE.name())); 
			deliveryl4Po.setEndPlace(dataObject.getString(Deliveryl4Po.COLUMNS.END_PLACE.name())); 
			deliveryl4Po.setStatusDate(dataObject.getString(Deliveryl4Po.COLUMNS.STATUS_DATE.name())); 
			deliveryl4Po.setProcessType(dataObject.getString(Deliveryl4Po.COLUMNS.PROCESS_TYPE.name())); 
			deliveryl4Po.setBalance(dataObject.getString(Deliveryl4Po.COLUMNS.BALANCE.name())); 
			deliveryl4Po.setDutyType(dataObject.getString(Deliveryl4Po.COLUMNS.DUTY_TYPE.name())); 
			deliveryl4Po.setStatMode(dataObject.getString(Deliveryl4Po.COLUMNS.STAT_MODE.name())); 
			deliveryl4Po.setApplyItem(dataObject.getString(Deliveryl4Po.COLUMNS.APPLY_ITEM.name())); 
			deliveryl4Po.setItemTmp(BigDecimalUtils.formObj(dataObject.getValue(Deliveryl4Po.COLUMNS.ITEM_TMP.name()))); 
			deliveryl4Po.setDutyRate(BigDecimalUtils.formObj(dataObject.getValue(Deliveryl4Po.COLUMNS.DUTY_RATE.name()))); 
			deliveryl4Po.setValueAmt(BigDecimalUtils.formObj(dataObject.getValue(Deliveryl4Po.COLUMNS.VALUE_AMT.name()))); 
			deliveryl4Po.setApplyDate(dataObject.getString(Deliveryl4Po.COLUMNS.APPLY_DATE.name())); 
			deliveryl4Po.setOwnerBan(dataObject.getString(Deliveryl4Po.COLUMNS.OWNER_BAN.name())); 
			return deliveryl4Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Deliveryl4Po deliveryl4Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Deliveryl4Po.COLUMNS.BF_NO.name(), deliveryl4Po.getBfNo()); 
			dataObject.setValue(Deliveryl4Po.COLUMNS.DELIVERY_NO.name(), deliveryl4Po.getDeliveryNo()); 
			dataObject.setValue(Deliveryl4Po.COLUMNS.PRDT_NO.name(), deliveryl4Po.getPrdtNo()); 
			dataObject.setValue(Deliveryl4Po.COLUMNS.UNIT.name(), deliveryl4Po.getUnit()); 
			dataObject.setValue(Deliveryl4Po.COLUMNS.QTY.name(), deliveryl4Po.getQty()); 
			dataObject.setValue(Deliveryl4Po.COLUMNS.SPEC.name(), deliveryl4Po.getSpec()); 
			dataObject.setValue(Deliveryl4Po.COLUMNS.MODEL.name(), deliveryl4Po.getModel()); 
			dataObject.setValue(Deliveryl4Po.COLUMNS.DESCRIP.name(), deliveryl4Po.getDescrip()); 
			dataObject.setValue(Deliveryl4Po.COLUMNS.CCC_CODE.name(), deliveryl4Po.getCccCode()); 
			dataObject.setValue(Deliveryl4Po.COLUMNS.MAKE_PLACE.name(), deliveryl4Po.getMakePlace()); 
			dataObject.setValue(Deliveryl4Po.COLUMNS.APPLY_NO.name(), deliveryl4Po.getApplyNo()); 
			dataObject.setValue(Deliveryl4Po.COLUMNS.ITEM.name(), deliveryl4Po.getItem()); 
			dataObject.setValue(Deliveryl4Po.COLUMNS.BOM_DATE.name(), deliveryl4Po.getBomDate()); 
			dataObject.setValue(Deliveryl4Po.COLUMNS.START_PLACE.name(), deliveryl4Po.getStartPlace()); 
			dataObject.setValue(Deliveryl4Po.COLUMNS.END_PLACE.name(), deliveryl4Po.getEndPlace()); 
			dataObject.setValue(Deliveryl4Po.COLUMNS.STATUS_DATE.name(), deliveryl4Po.getStatusDate()); 
			dataObject.setValue(Deliveryl4Po.COLUMNS.PROCESS_TYPE.name(), deliveryl4Po.getProcessType()); 
			dataObject.setValue(Deliveryl4Po.COLUMNS.BALANCE.name(), deliveryl4Po.getBalance()); 
			dataObject.setValue(Deliveryl4Po.COLUMNS.DUTY_TYPE.name(), deliveryl4Po.getDutyType()); 
			dataObject.setValue(Deliveryl4Po.COLUMNS.STAT_MODE.name(), deliveryl4Po.getStatMode()); 
			dataObject.setValue(Deliveryl4Po.COLUMNS.APPLY_ITEM.name(), deliveryl4Po.getApplyItem()); 
			dataObject.setValue(Deliveryl4Po.COLUMNS.ITEM_TMP.name(), deliveryl4Po.getItemTmp()); 
			dataObject.setValue(Deliveryl4Po.COLUMNS.DUTY_RATE.name(), deliveryl4Po.getDutyRate()); 
			dataObject.setValue(Deliveryl4Po.COLUMNS.VALUE_AMT.name(), deliveryl4Po.getValueAmt()); 
			dataObject.setValue(Deliveryl4Po.COLUMNS.APPLY_DATE.name(), deliveryl4Po.getApplyDate()); 
			dataObject.setValue(Deliveryl4Po.COLUMNS.OWNER_BAN.name(), deliveryl4Po.getOwnerBan()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Deliveryl4Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Deliveryl4Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
