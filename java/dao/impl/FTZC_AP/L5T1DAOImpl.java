package com.doc.common.dao.impl; 
 
public class L5T1DAOImpl extends GeneralDAOImpl<L5T1Po> implements L5T1DAO { 
	public static final L5T1DAOImpl INSTANCE = new L5T1DAOImpl(); 
	public static final String TABLENAME = "L5_T1"; 

	public L5T1DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<L5T1Po> CONVERTER = new MapConverter<L5T1Po>() { 
 
		@Override 
		public L5T1Po convert(final DataObject dataObject) { 
			final L5T1Po l5T1Po = new L5T1Po(); 
			l5T1Po.setBfNo(dataObject.getString(L5T1Po.COLUMNS.BF_NO.name())); 
			l5T1Po.setMsgFun(dataObject.getString(L5T1Po.COLUMNS.MSG_FUN.name())); 
			l5T1Po.setDeclNo(dataObject.getString(L5T1Po.COLUMNS.DECL_NO.name())); 
			l5T1Po.setItemNo(BigDecimalUtils.formObj(dataObject.getValue(L5T1Po.COLUMNS.ITEM_NO.name()))); 
			l5T1Po.setDeclType(dataObject.getString(L5T1Po.COLUMNS.DECL_TYPE.name())); 
			l5T1Po.setPrdtNo(dataObject.getString(L5T1Po.COLUMNS.PRDT_NO.name())); 
			l5T1Po.setQty(BigDecimalUtils.formObj(dataObject.getValue(L5T1Po.COLUMNS.QTY.name()))); 
			l5T1Po.setPost(dataObject.getString(L5T1Po.COLUMNS.POST.name())); 
			l5T1Po.setDutyType(dataObject.getString(L5T1Po.COLUMNS.DUTY_TYPE.name())); 
			l5T1Po.setODeclNo(dataObject.getString(L5T1Po.COLUMNS.O_DECL_NO.name())); 
			l5T1Po.setOItemNo(BigDecimalUtils.formObj(dataObject.getValue(L5T1Po.COLUMNS.O_ITEM_NO.name()))); 
			l5T1Po.setODeclType(dataObject.getString(L5T1Po.COLUMNS.O_DECL_TYPE.name())); 
			l5T1Po.setOPrdtNo(dataObject.getString(L5T1Po.COLUMNS.O_PRDT_NO.name())); 
			l5T1Po.setOQty(BigDecimalUtils.formObj(dataObject.getValue(L5T1Po.COLUMNS.O_QTY.name()))); 
			l5T1Po.setOPost(dataObject.getString(L5T1Po.COLUMNS.O_POST.name())); 
			l5T1Po.setODutyType(dataObject.getString(L5T1Po.COLUMNS.O_DUTY_TYPE.name())); 
			l5T1Po.setOutStatus(dataObject.getString(L5T1Po.COLUMNS.OUT_STATUS.name())); 
			l5T1Po.setF4Date(dataObject.getString(L5T1Po.COLUMNS.F4_DATE.name())); 
			l5T1Po.setF2Date(dataObject.getString(L5T1Po.COLUMNS.F2_DATE.name())); 
			l5T1Po.setUnit(dataObject.getString(L5T1Po.COLUMNS.UNIT.name())); 
			l5T1Po.setF2Unit(dataObject.getString(L5T1Po.COLUMNS.F2_UNIT.name())); 
			l5T1Po.setBomQty(BigDecimalUtils.formObj(dataObject.getValue(L5T1Po.COLUMNS.BOM_QTY.name()))); 
			l5T1Po.setSerialNo(BigDecimalUtils.formObj(dataObject.getValue(L5T1Po.COLUMNS.SERIAL_NO.name()))); 
			l5T1Po.setUnclearQty(BigDecimalUtils.formObj(dataObject.getValue(L5T1Po.COLUMNS.UNCLEAR_QTY.name()))); 
			l5T1Po.setRefBillNo(dataObject.getString(L5T1Po.COLUMNS.REF_BILL_NO.name())); 
			l5T1Po.setItem(BigDecimalUtils.formObj(dataObject.getValue(L5T1Po.COLUMNS.ITEM.name()))); 
			l5T1Po.setORefBillNo(dataObject.getString(L5T1Po.COLUMNS.O_REF_BILL_NO.name())); 
			l5T1Po.setOItem(BigDecimalUtils.formObj(dataObject.getValue(L5T1Po.COLUMNS.O_ITEM.name()))); 
			l5T1Po.setCtmCode(dataObject.getString(L5T1Po.COLUMNS.CTM_CODE.name())); 
			l5T1Po.setConfirmDate(dataObject.getString(L5T1Po.COLUMNS.CONFIRM_DATE.name())); 
			l5T1Po.setOBfNo(dataObject.getString(L5T1Po.COLUMNS.O_BF_NO.name())); 
			l5T1Po.setCoBfNo(dataObject.getString(L5T1Po.COLUMNS.CO_BF_NO.name())); 
			l5T1Po.setOODeclNo(dataObject.getString(L5T1Po.COLUMNS.O_O_DECL_NO.name())); 
			l5T1Po.setOOItemNo(BigDecimalUtils.formObj(dataObject.getValue(L5T1Po.COLUMNS.O_O_ITEM_NO.name()))); 
			l5T1Po.setOOPrdtNo(dataObject.getString(L5T1Po.COLUMNS.O_O_PRDT_NO.name())); 
			l5T1Po.setControlNo(dataObject.getString(L5T1Po.COLUMNS.CONTROL_NO.name())); 
			l5T1Po.setVersion(BigDecimalUtils.formObj(dataObject.getValue(L5T1Po.COLUMNS.VERSION.name()))); 
			l5T1Po.setSeqNo(BigDecimalUtils.formObj(dataObject.getValue(L5T1Po.COLUMNS.SEQ_NO.name()))); 
			l5T1Po.setIConfirmed(dataObject.getString(L5T1Po.COLUMNS.I_CONFIRMED.name())); 
			l5T1Po.setOPrdtNoQty(BigDecimalUtils.formObj(dataObject.getValue(L5T1Po.COLUMNS.O_PRDT_NO_QTY.name()))); 
			return l5T1Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final L5T1Po l5T1Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(L5T1Po.COLUMNS.BF_NO.name(), l5T1Po.getBfNo()); 
			dataObject.setValue(L5T1Po.COLUMNS.MSG_FUN.name(), l5T1Po.getMsgFun()); 
			dataObject.setValue(L5T1Po.COLUMNS.DECL_NO.name(), l5T1Po.getDeclNo()); 
			dataObject.setValue(L5T1Po.COLUMNS.ITEM_NO.name(), l5T1Po.getItemNo()); 
			dataObject.setValue(L5T1Po.COLUMNS.DECL_TYPE.name(), l5T1Po.getDeclType()); 
			dataObject.setValue(L5T1Po.COLUMNS.PRDT_NO.name(), l5T1Po.getPrdtNo()); 
			dataObject.setValue(L5T1Po.COLUMNS.QTY.name(), l5T1Po.getQty()); 
			dataObject.setValue(L5T1Po.COLUMNS.POST.name(), l5T1Po.getPost()); 
			dataObject.setValue(L5T1Po.COLUMNS.DUTY_TYPE.name(), l5T1Po.getDutyType()); 
			dataObject.setValue(L5T1Po.COLUMNS.O_DECL_NO.name(), l5T1Po.getODeclNo()); 
			dataObject.setValue(L5T1Po.COLUMNS.O_ITEM_NO.name(), l5T1Po.getOItemNo()); 
			dataObject.setValue(L5T1Po.COLUMNS.O_DECL_TYPE.name(), l5T1Po.getODeclType()); 
			dataObject.setValue(L5T1Po.COLUMNS.O_PRDT_NO.name(), l5T1Po.getOPrdtNo()); 
			dataObject.setValue(L5T1Po.COLUMNS.O_QTY.name(), l5T1Po.getOQty()); 
			dataObject.setValue(L5T1Po.COLUMNS.O_POST.name(), l5T1Po.getOPost()); 
			dataObject.setValue(L5T1Po.COLUMNS.O_DUTY_TYPE.name(), l5T1Po.getODutyType()); 
			dataObject.setValue(L5T1Po.COLUMNS.OUT_STATUS.name(), l5T1Po.getOutStatus()); 
			dataObject.setValue(L5T1Po.COLUMNS.F4_DATE.name(), l5T1Po.getF4Date()); 
			dataObject.setValue(L5T1Po.COLUMNS.F2_DATE.name(), l5T1Po.getF2Date()); 
			dataObject.setValue(L5T1Po.COLUMNS.UNIT.name(), l5T1Po.getUnit()); 
			dataObject.setValue(L5T1Po.COLUMNS.F2_UNIT.name(), l5T1Po.getF2Unit()); 
			dataObject.setValue(L5T1Po.COLUMNS.BOM_QTY.name(), l5T1Po.getBomQty()); 
			dataObject.setValue(L5T1Po.COLUMNS.SERIAL_NO.name(), l5T1Po.getSerialNo()); 
			dataObject.setValue(L5T1Po.COLUMNS.UNCLEAR_QTY.name(), l5T1Po.getUnclearQty()); 
			dataObject.setValue(L5T1Po.COLUMNS.REF_BILL_NO.name(), l5T1Po.getRefBillNo()); 
			dataObject.setValue(L5T1Po.COLUMNS.ITEM.name(), l5T1Po.getItem()); 
			dataObject.setValue(L5T1Po.COLUMNS.O_REF_BILL_NO.name(), l5T1Po.getORefBillNo()); 
			dataObject.setValue(L5T1Po.COLUMNS.O_ITEM.name(), l5T1Po.getOItem()); 
			dataObject.setValue(L5T1Po.COLUMNS.CTM_CODE.name(), l5T1Po.getCtmCode()); 
			dataObject.setValue(L5T1Po.COLUMNS.CONFIRM_DATE.name(), l5T1Po.getConfirmDate()); 
			dataObject.setValue(L5T1Po.COLUMNS.O_BF_NO.name(), l5T1Po.getOBfNo()); 
			dataObject.setValue(L5T1Po.COLUMNS.CO_BF_NO.name(), l5T1Po.getCoBfNo()); 
			dataObject.setValue(L5T1Po.COLUMNS.O_O_DECL_NO.name(), l5T1Po.getOODeclNo()); 
			dataObject.setValue(L5T1Po.COLUMNS.O_O_ITEM_NO.name(), l5T1Po.getOOItemNo()); 
			dataObject.setValue(L5T1Po.COLUMNS.O_O_PRDT_NO.name(), l5T1Po.getOOPrdtNo()); 
			dataObject.setValue(L5T1Po.COLUMNS.CONTROL_NO.name(), l5T1Po.getControlNo()); 
			dataObject.setValue(L5T1Po.COLUMNS.VERSION.name(), l5T1Po.getVersion()); 
			dataObject.setValue(L5T1Po.COLUMNS.SEQ_NO.name(), l5T1Po.getSeqNo()); 
			dataObject.setValue(L5T1Po.COLUMNS.I_CONFIRMED.name(), l5T1Po.getIConfirmed()); 
			dataObject.setValue(L5T1Po.COLUMNS.O_PRDT_NO_QTY.name(), l5T1Po.getOPrdtNoQty()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<L5T1Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(L5T1Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
