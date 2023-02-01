package com.doc.common.dao.impl; 
 
public class L6T1DAOImpl extends GeneralDAOImpl<L6T1Po> implements L6T1DAO { 
	public static final L6T1DAOImpl INSTANCE = new L6T1DAOImpl(); 
	public static final String TABLENAME = "L6_T1"; 

	public L6T1DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<L6T1Po> CONVERTER = new MapConverter<L6T1Po>() { 
 
		@Override 
		public L6T1Po convert(final DataObject dataObject) { 
			final L6T1Po l6T1Po = new L6T1Po(); 
			l6T1Po.setBfNo(dataObject.getString(L6T1Po.COLUMNS.BF_NO.name())); 
			l6T1Po.setRefBillNo(dataObject.getString(L6T1Po.COLUMNS.REF_BILL_NO.name())); 
			l6T1Po.setItem(BigDecimalUtils.formObj(dataObject.getValue(L6T1Po.COLUMNS.ITEM.name()))); 
			l6T1Po.setOilPost(dataObject.getString(L6T1Po.COLUMNS.OIL_POST.name())); 
			l6T1Po.setNewPost(dataObject.getString(L6T1Po.COLUMNS.NEW_POST.name())); 
			l6T1Po.setQty(BigDecimalUtils.formObj(dataObject.getValue(L6T1Po.COLUMNS.QTY.name()))); 
			l6T1Po.setConfirmDate(dataObject.getString(L6T1Po.COLUMNS.CONFIRM_DATE.name())); 
			l6T1Po.setControlNo(dataObject.getString(L6T1Po.COLUMNS.CONTROL_NO.name())); 
			l6T1Po.setVersion(BigDecimalUtils.formObj(dataObject.getValue(L6T1Po.COLUMNS.VERSION.name()))); 
			l6T1Po.setSeqNo(BigDecimalUtils.formObj(dataObject.getValue(L6T1Po.COLUMNS.SEQ_NO.name()))); 
			l6T1Po.setIConfirmed(dataObject.getString(L6T1Po.COLUMNS.I_CONFIRMED.name())); 
			return l6T1Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final L6T1Po l6T1Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(L6T1Po.COLUMNS.BF_NO.name(), l6T1Po.getBfNo()); 
			dataObject.setValue(L6T1Po.COLUMNS.REF_BILL_NO.name(), l6T1Po.getRefBillNo()); 
			dataObject.setValue(L6T1Po.COLUMNS.ITEM.name(), l6T1Po.getItem()); 
			dataObject.setValue(L6T1Po.COLUMNS.OIL_POST.name(), l6T1Po.getOilPost()); 
			dataObject.setValue(L6T1Po.COLUMNS.NEW_POST.name(), l6T1Po.getNewPost()); 
			dataObject.setValue(L6T1Po.COLUMNS.QTY.name(), l6T1Po.getQty()); 
			dataObject.setValue(L6T1Po.COLUMNS.CONFIRM_DATE.name(), l6T1Po.getConfirmDate()); 
			dataObject.setValue(L6T1Po.COLUMNS.CONTROL_NO.name(), l6T1Po.getControlNo()); 
			dataObject.setValue(L6T1Po.COLUMNS.VERSION.name(), l6T1Po.getVersion()); 
			dataObject.setValue(L6T1Po.COLUMNS.SEQ_NO.name(), l6T1Po.getSeqNo()); 
			dataObject.setValue(L6T1Po.COLUMNS.I_CONFIRMED.name(), l6T1Po.getIConfirmed()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<L6T1Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(L6T1Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
