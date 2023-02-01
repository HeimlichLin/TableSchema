package com.doc.common.dao.impl; 
 
public class ClmsL6T1DAOImpl extends GeneralDAOImpl<ClmsL6T1Po> implements ClmsL6T1DAO { 
	public static final ClmsL6T1DAOImpl INSTANCE = new ClmsL6T1DAOImpl(); 
	public static final String TABLENAME = "CLMS_L6_T1"; 

	public ClmsL6T1DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ClmsL6T1Po> CONVERTER = new MapConverter<ClmsL6T1Po>() { 
 
		@Override 
		public ClmsL6T1Po convert(final DataObject dataObject) { 
			final ClmsL6T1Po clmsL6T1Po = new ClmsL6T1Po(); 
			clmsL6T1Po.setBondno(dataObject.getString(ClmsL6T1Po.COLUMNS.BONDNO.name())); 
			clmsL6T1Po.setRefBillNo(dataObject.getString(ClmsL6T1Po.COLUMNS.REF_BILL_NO.name())); 
			clmsL6T1Po.setItem(BigDecimalUtils.formObj(dataObject.getValue(ClmsL6T1Po.COLUMNS.ITEM.name()))); 
			clmsL6T1Po.setOilPost(dataObject.getString(ClmsL6T1Po.COLUMNS.OIL_POST.name())); 
			clmsL6T1Po.setNewPost(dataObject.getString(ClmsL6T1Po.COLUMNS.NEW_POST.name())); 
			clmsL6T1Po.setQty(BigDecimalUtils.formObj(dataObject.getValue(ClmsL6T1Po.COLUMNS.QTY.name()))); 
			clmsL6T1Po.setConfirmDate(dataObject.getString(ClmsL6T1Po.COLUMNS.CONFIRM_DATE.name())); 
			clmsL6T1Po.setControlNo(dataObject.getString(ClmsL6T1Po.COLUMNS.CONTROL_NO.name())); 
			clmsL6T1Po.setVersion(BigDecimalUtils.formObj(dataObject.getValue(ClmsL6T1Po.COLUMNS.VERSION.name()))); 
			clmsL6T1Po.setSeqNo(BigDecimalUtils.formObj(dataObject.getValue(ClmsL6T1Po.COLUMNS.SEQ_NO.name()))); 
			clmsL6T1Po.setIConfirmed(dataObject.getString(ClmsL6T1Po.COLUMNS.I_CONFIRMED.name())); 
			return clmsL6T1Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final ClmsL6T1Po clmsL6T1Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ClmsL6T1Po.COLUMNS.BONDNO.name(), clmsL6T1Po.getBondno()); 
			dataObject.setValue(ClmsL6T1Po.COLUMNS.REF_BILL_NO.name(), clmsL6T1Po.getRefBillNo()); 
			dataObject.setValue(ClmsL6T1Po.COLUMNS.ITEM.name(), clmsL6T1Po.getItem()); 
			dataObject.setValue(ClmsL6T1Po.COLUMNS.OIL_POST.name(), clmsL6T1Po.getOilPost()); 
			dataObject.setValue(ClmsL6T1Po.COLUMNS.NEW_POST.name(), clmsL6T1Po.getNewPost()); 
			dataObject.setValue(ClmsL6T1Po.COLUMNS.QTY.name(), clmsL6T1Po.getQty()); 
			dataObject.setValue(ClmsL6T1Po.COLUMNS.CONFIRM_DATE.name(), clmsL6T1Po.getConfirmDate()); 
			dataObject.setValue(ClmsL6T1Po.COLUMNS.CONTROL_NO.name(), clmsL6T1Po.getControlNo()); 
			dataObject.setValue(ClmsL6T1Po.COLUMNS.VERSION.name(), clmsL6T1Po.getVersion()); 
			dataObject.setValue(ClmsL6T1Po.COLUMNS.SEQ_NO.name(), clmsL6T1Po.getSeqNo()); 
			dataObject.setValue(ClmsL6T1Po.COLUMNS.I_CONFIRMED.name(), clmsL6T1Po.getIConfirmed()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ClmsL6T1Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ClmsL6T1Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(ClmsL6T1Po.COLUMNS.CONTROL_NO.name(), po.getControlNo()); 
		sqlWhere.add(ClmsL6T1Po.COLUMNS.VERSION.name(), po.getVersion()); 
		sqlWhere.add(ClmsL6T1Po.COLUMNS.SEQ_NO.name(), po.getSeqNo()); 
		return sqlWhere; 
	} 
 
} 
