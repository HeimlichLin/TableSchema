package com.doc.common.dao.impl; 
 
public class N1BT1DAOImpl extends GeneralDAOImpl<N1BT1Po> implements N1BT1DAO { 
	public static final N1BT1DAOImpl INSTANCE = new N1BT1DAOImpl(); 
	public static final String TABLENAME = "N1_B_T1"; 

	public N1BT1DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<N1BT1Po> CONVERTER = new MapConverter<N1BT1Po>() { 
 
		@Override 
		public N1BT1Po convert(final DataObject dataObject) { 
			final N1BT1Po n1BT1Po = new N1BT1Po(); 
			n1BT1Po.setBfNo(dataObject.getString(N1BT1Po.COLUMNS.BF_NO.name())); 
			n1BT1Po.setControlNo(dataObject.getString(N1BT1Po.COLUMNS.CONTROL_NO.name())); 
			n1BT1Po.setRecvTime(TimestampUtils.of(dataObject.getValue(N1BT1Po.COLUMNS.RECV_TIME.name()))); 
			n1BT1Po.setVersion(BigDecimalUtils.formObj(dataObject.getValue(N1BT1Po.COLUMNS.VERSION.name()))); 
			n1BT1Po.setSeqNo(BigDecimalUtils.formObj(dataObject.getValue(N1BT1Po.COLUMNS.SEQ_NO.name()))); 
			n1BT1Po.setFuncType(dataObject.getString(N1BT1Po.COLUMNS.FUNC_TYPE.name())); 
			n1BT1Po.setPost(dataObject.getString(N1BT1Po.COLUMNS.POST.name())); 
			n1BT1Po.setAttribute(dataObject.getString(N1BT1Po.COLUMNS.ATTRIBUTE.name())); 
			n1BT1Po.setIConfirmed(dataObject.getString(N1BT1Po.COLUMNS.I_CONFIRMED.name())); 
			return n1BT1Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final N1BT1Po n1BT1Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(N1BT1Po.COLUMNS.BF_NO.name(), n1BT1Po.getBfNo()); 
			dataObject.setValue(N1BT1Po.COLUMNS.CONTROL_NO.name(), n1BT1Po.getControlNo()); 
			dataObject.setValue(N1BT1Po.COLUMNS.RECV_TIME.name(), n1BT1Po.getRecvTime()); 
			dataObject.setValue(N1BT1Po.COLUMNS.VERSION.name(), n1BT1Po.getVersion()); 
			dataObject.setValue(N1BT1Po.COLUMNS.SEQ_NO.name(), n1BT1Po.getSeqNo()); 
			dataObject.setValue(N1BT1Po.COLUMNS.FUNC_TYPE.name(), n1BT1Po.getFuncType()); 
			dataObject.setValue(N1BT1Po.COLUMNS.POST.name(), n1BT1Po.getPost()); 
			dataObject.setValue(N1BT1Po.COLUMNS.ATTRIBUTE.name(), n1BT1Po.getAttribute()); 
			dataObject.setValue(N1BT1Po.COLUMNS.I_CONFIRMED.name(), n1BT1Po.getIConfirmed()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<N1BT1Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(N1BT1Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(N1BT1Po.COLUMNS.BF_NO.name(), po.getBfNo()); 
		sqlWhere.add(N1BT1Po.COLUMNS.CONTROL_NO.name(), po.getControlNo()); 
		sqlWhere.add(N1BT1Po.COLUMNS.VERSION.name(), po.getVersion()); 
		sqlWhere.add(N1BT1Po.COLUMNS.SEQ_NO.name(), po.getSeqNo()); 
		return sqlWhere; 
	} 
 
} 
