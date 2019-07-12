package com.doc.common.dao.impl; 
 
public class ClmsL6T1DAO extends GeneralDAOImpl<ClmsL6T1Do> implements ClmsL6T1DAO { 
	public static final ClmsL6T1DAOImpl INSTANCE = new ClmsL6T1DAOImpl(); 
	public static final String TABLENAME = "CLMS_L6_T1"; 

	public ClmsL6T1DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<ClmsL6T1Do> CONVERTER = new MapConverter<ClmsL6T1Do>() { 
 
		@Override 
		public ClmsL6T1Do convert(final DataObject dataObject) { 
			final ClmsL6T1Do clmsL6T1Do = new ClmsL6T1Do(); 
			clmsL6T1Do.setBondno(dataObject.getString(ClmsL6T1Do.COLUMNS.BONDNO.name())); 
			clmsL6T1Do.setRefBillNo(dataObject.getString(ClmsL6T1Do.COLUMNS.REF_BILL_NO.name())); 
			clmsL6T1Do.setItem(BigDecimalUtils.formObj(dataObject.getString(ClmsL6T1Do.COLUMNS.ITEM.name()))); 
			clmsL6T1Do.setOilPost(dataObject.getString(ClmsL6T1Do.COLUMNS.OIL_POST.name())); 
			clmsL6T1Do.setNewPost(dataObject.getString(ClmsL6T1Do.COLUMNS.NEW_POST.name())); 
			clmsL6T1Do.setQty(BigDecimalUtils.formObj(dataObject.getString(ClmsL6T1Do.COLUMNS.QTY.name()))); 
			clmsL6T1Do.setConfirmDate(dataObject.getString(ClmsL6T1Do.COLUMNS.CONFIRM_DATE.name())); 
			clmsL6T1Do.setControlNo(dataObject.getString(ClmsL6T1Do.COLUMNS.CONTROL_NO.name())); 
			clmsL6T1Do.setVersion(BigDecimalUtils.formObj(dataObject.getString(ClmsL6T1Do.COLUMNS.VERSION.name()))); 
			clmsL6T1Do.setSeqNo(BigDecimalUtils.formObj(dataObject.getString(ClmsL6T1Do.COLUMNS.SEQ_NO.name()))); 
			clmsL6T1Do.setIConfirmed(dataObject.getString(ClmsL6T1Do.COLUMNS.I_CONFIRMED.name())); 
			return clmsL6T1Do; 
		} 
 
		@Override 
		public DataObject toDataObject(final ClmsL6T1Do clmsL6T1Do) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ClmsL6T1Do.COLUMNS.BONDNO.name(), clmsL6T1Do.getBondno()); 
			dataObject.setValue(ClmsL6T1Do.COLUMNS.REF_BILL_NO.name(), clmsL6T1Do.getRefBillNo()); 
			dataObject.setValue(ClmsL6T1Do.COLUMNS.ITEM.name(), clmsL6T1Do.getItem()); 
			dataObject.setValue(ClmsL6T1Do.COLUMNS.OIL_POST.name(), clmsL6T1Do.getOilPost()); 
			dataObject.setValue(ClmsL6T1Do.COLUMNS.NEW_POST.name(), clmsL6T1Do.getNewPost()); 
			dataObject.setValue(ClmsL6T1Do.COLUMNS.QTY.name(), clmsL6T1Do.getQty()); 
			dataObject.setValue(ClmsL6T1Do.COLUMNS.CONFIRM_DATE.name(), clmsL6T1Do.getConfirmDate()); 
			dataObject.setValue(ClmsL6T1Do.COLUMNS.CONTROL_NO.name(), clmsL6T1Do.getControlNo()); 
			dataObject.setValue(ClmsL6T1Do.COLUMNS.VERSION.name(), clmsL6T1Do.getVersion()); 
			dataObject.setValue(ClmsL6T1Do.COLUMNS.SEQ_NO.name(), clmsL6T1Do.getSeqNo()); 
			dataObject.setValue(ClmsL6T1Do.COLUMNS.I_CONFIRMED.name(), clmsL6T1Do.getIConfirmed()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ClmsL6T1Do> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ClmsL6T1Do po) { 
		sqlWhere.add(ClmsL6T1Do.COLUMNS.QTY.name(), po.getQty()); 
		sqlWhere.add(ClmsL6T1Do.COLUMNS.CONFIRM_DATE.name(), po.getConfirmDate()); 
		sqlWhere.add(ClmsL6T1Do.COLUMNS.I_CONFIRMED.name(), po.getIConfirmed()); 
	} 
 
} 
