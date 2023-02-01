package com.doc.common.dao.impl; 
 
public class N1AT1DAOImpl extends GeneralDAOImpl<N1AT1Po> implements N1AT1DAO { 
	public static final N1AT1DAOImpl INSTANCE = new N1AT1DAOImpl(); 
	public static final String TABLENAME = "N1_A_T1"; 

	public N1AT1DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<N1AT1Po> CONVERTER = new MapConverter<N1AT1Po>() { 
 
		@Override 
		public N1AT1Po convert(final DataObject dataObject) { 
			final N1AT1Po n1AT1Po = new N1AT1Po(); 
			n1AT1Po.setBfNo(dataObject.getString(N1AT1Po.COLUMNS.BF_NO.name())); 
			n1AT1Po.setControlNo(dataObject.getString(N1AT1Po.COLUMNS.CONTROL_NO.name())); 
			n1AT1Po.setRecvTime(TimestampUtils.of(dataObject.getValue(N1AT1Po.COLUMNS.RECV_TIME.name()))); 
			n1AT1Po.setVersion(BigDecimalUtils.formObj(dataObject.getValue(N1AT1Po.COLUMNS.VERSION.name()))); 
			n1AT1Po.setSeqNo(BigDecimalUtils.formObj(dataObject.getValue(N1AT1Po.COLUMNS.SEQ_NO.name()))); 
			n1AT1Po.setRefBillNo(dataObject.getString(N1AT1Po.COLUMNS.REF_BILL_NO.name())); 
			n1AT1Po.setItem(dataObject.getString(N1AT1Po.COLUMNS.ITEM.name())); 
			n1AT1Po.setOutStorageArea(dataObject.getString(N1AT1Po.COLUMNS.OUT_STORAGE_AREA.name())); 
			n1AT1Po.setCommodityNo(dataObject.getString(N1AT1Po.COLUMNS.COMMODITY_NO.name())); 
			n1AT1Po.setDeclNo(dataObject.getString(N1AT1Po.COLUMNS.DECL_NO.name())); 
			n1AT1Po.setItemNo(BigDecimalUtils.formObj(dataObject.getValue(N1AT1Po.COLUMNS.ITEM_NO.name()))); 
			n1AT1Po.setDeclType(dataObject.getString(N1AT1Po.COLUMNS.DECL_TYPE.name())); 
			n1AT1Po.setExtendDate(dataObject.getString(N1AT1Po.COLUMNS.EXTEND_DATE.name())); 
			n1AT1Po.setExtendDoc(dataObject.getString(N1AT1Po.COLUMNS.EXTEND_DOC.name())); 
			n1AT1Po.setIConfirmed(dataObject.getString(N1AT1Po.COLUMNS.I_CONFIRMED.name())); 
			return n1AT1Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final N1AT1Po n1AT1Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(N1AT1Po.COLUMNS.BF_NO.name(), n1AT1Po.getBfNo()); 
			dataObject.setValue(N1AT1Po.COLUMNS.CONTROL_NO.name(), n1AT1Po.getControlNo()); 
			dataObject.setValue(N1AT1Po.COLUMNS.RECV_TIME.name(), n1AT1Po.getRecvTime()); 
			dataObject.setValue(N1AT1Po.COLUMNS.VERSION.name(), n1AT1Po.getVersion()); 
			dataObject.setValue(N1AT1Po.COLUMNS.SEQ_NO.name(), n1AT1Po.getSeqNo()); 
			dataObject.setValue(N1AT1Po.COLUMNS.REF_BILL_NO.name(), n1AT1Po.getRefBillNo()); 
			dataObject.setValue(N1AT1Po.COLUMNS.ITEM.name(), n1AT1Po.getItem()); 
			dataObject.setValue(N1AT1Po.COLUMNS.OUT_STORAGE_AREA.name(), n1AT1Po.getOutStorageArea()); 
			dataObject.setValue(N1AT1Po.COLUMNS.COMMODITY_NO.name(), n1AT1Po.getCommodityNo()); 
			dataObject.setValue(N1AT1Po.COLUMNS.DECL_NO.name(), n1AT1Po.getDeclNo()); 
			dataObject.setValue(N1AT1Po.COLUMNS.ITEM_NO.name(), n1AT1Po.getItemNo()); 
			dataObject.setValue(N1AT1Po.COLUMNS.DECL_TYPE.name(), n1AT1Po.getDeclType()); 
			dataObject.setValue(N1AT1Po.COLUMNS.EXTEND_DATE.name(), n1AT1Po.getExtendDate()); 
			dataObject.setValue(N1AT1Po.COLUMNS.EXTEND_DOC.name(), n1AT1Po.getExtendDoc()); 
			dataObject.setValue(N1AT1Po.COLUMNS.I_CONFIRMED.name(), n1AT1Po.getIConfirmed()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<N1AT1Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(N1AT1Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(N1AT1Po.COLUMNS.BF_NO.name(), po.getBfNo()); 
		sqlWhere.add(N1AT1Po.COLUMNS.CONTROL_NO.name(), po.getControlNo()); 
		sqlWhere.add(N1AT1Po.COLUMNS.VERSION.name(), po.getVersion()); 
		sqlWhere.add(N1AT1Po.COLUMNS.SEQ_NO.name(), po.getSeqNo()); 
		return sqlWhere; 
	} 
 
} 
