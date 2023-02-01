package com.doc.common.dao.impl; 
 
public class L4T1DAOImpl extends GeneralDAOImpl<L4T1Po> implements L4T1DAO { 
	public static final L4T1DAOImpl INSTANCE = new L4T1DAOImpl(); 
	public static final String TABLENAME = "L4_T1"; 

	public L4T1DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<L4T1Po> CONVERTER = new MapConverter<L4T1Po>() { 
 
		@Override 
		public L4T1Po convert(final DataObject dataObject) { 
			final L4T1Po l4T1Po = new L4T1Po(); 
			l4T1Po.setBfNo(dataObject.getString(L4T1Po.COLUMNS.BF_NO.name())); 
			l4T1Po.setControlNo(dataObject.getString(L4T1Po.COLUMNS.CONTROL_NO.name())); 
			l4T1Po.setSerialNo(BigDecimalUtils.formObj(dataObject.getValue(L4T1Po.COLUMNS.SERIAL_NO.name()))); 
			l4T1Po.setSeqNo(BigDecimalUtils.formObj(dataObject.getValue(L4T1Po.COLUMNS.SEQ_NO.name()))); 
			l4T1Po.setMsgFun(dataObject.getString(L4T1Po.COLUMNS.MSG_FUN.name())); 
			l4T1Po.setStrType(dataObject.getString(L4T1Po.COLUMNS.STR_TYPE.name())); 
			l4T1Po.setGdsType(dataObject.getString(L4T1Po.COLUMNS.GDS_TYPE.name())); 
			l4T1Po.setRefBillNo(dataObject.getString(L4T1Po.COLUMNS.REF_BILL_NO.name())); 
			l4T1Po.setCtmCode(dataObject.getString(L4T1Po.COLUMNS.CTM_CODE.name())); 
			l4T1Po.setCocompNo(dataObject.getString(L4T1Po.COLUMNS.COCOMP_NO.name())); 
			l4T1Po.setInvtryType(dataObject.getString(L4T1Po.COLUMNS.INVTRY_TYPE.name())); 
			l4T1Po.setL4Time(TimestampUtils.of(dataObject.getValue(L4T1Po.COLUMNS.L4_TIME.name()))); 
			l4T1Po.setIConfirmed(dataObject.getString(L4T1Po.COLUMNS.I_CONFIRMED.name())); 
			l4T1Po.setDeclSeqNo(BigDecimalUtils.formObj(dataObject.getValue(L4T1Po.COLUMNS.DECL_SEQ_NO.name()))); 
			return l4T1Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final L4T1Po l4T1Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(L4T1Po.COLUMNS.BF_NO.name(), l4T1Po.getBfNo()); 
			dataObject.setValue(L4T1Po.COLUMNS.CONTROL_NO.name(), l4T1Po.getControlNo()); 
			dataObject.setValue(L4T1Po.COLUMNS.SERIAL_NO.name(), l4T1Po.getSerialNo()); 
			dataObject.setValue(L4T1Po.COLUMNS.SEQ_NO.name(), l4T1Po.getSeqNo()); 
			dataObject.setValue(L4T1Po.COLUMNS.MSG_FUN.name(), l4T1Po.getMsgFun()); 
			dataObject.setValue(L4T1Po.COLUMNS.STR_TYPE.name(), l4T1Po.getStrType()); 
			dataObject.setValue(L4T1Po.COLUMNS.GDS_TYPE.name(), l4T1Po.getGdsType()); 
			dataObject.setValue(L4T1Po.COLUMNS.REF_BILL_NO.name(), l4T1Po.getRefBillNo()); 
			dataObject.setValue(L4T1Po.COLUMNS.CTM_CODE.name(), l4T1Po.getCtmCode()); 
			dataObject.setValue(L4T1Po.COLUMNS.COCOMP_NO.name(), l4T1Po.getCocompNo()); 
			dataObject.setValue(L4T1Po.COLUMNS.INVTRY_TYPE.name(), l4T1Po.getInvtryType()); 
			dataObject.setValue(L4T1Po.COLUMNS.L4_TIME.name(), l4T1Po.getL4Time()); 
			dataObject.setValue(L4T1Po.COLUMNS.I_CONFIRMED.name(), l4T1Po.getIConfirmed()); 
			dataObject.setValue(L4T1Po.COLUMNS.DECL_SEQ_NO.name(), l4T1Po.getDeclSeqNo()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<L4T1Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(L4T1Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
