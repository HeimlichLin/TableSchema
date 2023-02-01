package com.doc.common.dao.impl; 
 
public class L4LogDAOImpl extends GeneralDAOImpl<L4LogPo> implements L4LogDAO { 
	public static final L4LogDAOImpl INSTANCE = new L4LogDAOImpl(); 
	public static final String TABLENAME = "L4_LOG"; 

	public L4LogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<L4LogPo> CONVERTER = new MapConverter<L4LogPo>() { 
 
		@Override 
		public L4LogPo convert(final DataObject dataObject) { 
			final L4LogPo l4LogPo = new L4LogPo(); 
			l4LogPo.setControlNo(dataObject.getString(L4LogPo.COLUMNS.CONTROL_NO.name())); 
			l4LogPo.setVersion(BigDecimalUtils.formObj(dataObject.getValue(L4LogPo.COLUMNS.VERSION.name()))); 
			l4LogPo.setSeqNo(BigDecimalUtils.formObj(dataObject.getValue(L4LogPo.COLUMNS.SEQ_NO.name()))); 
			l4LogPo.setLogStatus(dataObject.getString(L4LogPo.COLUMNS.LOG_STATUS.name())); 
			l4LogPo.setLogRmk(dataObject.getString(L4LogPo.COLUMNS.LOG_RMK.name())); 
			l4LogPo.setL4Time(TimestampUtils.of(dataObject.getValue(L4LogPo.COLUMNS.L4_TIME.name()))); 
			l4LogPo.setMsgFun(dataObject.getString(L4LogPo.COLUMNS.MSG_FUN.name())); 
			l4LogPo.setRefBillNo(dataObject.getString(L4LogPo.COLUMNS.REF_BILL_NO.name())); 
			l4LogPo.setItem(dataObject.getString(L4LogPo.COLUMNS.ITEM.name())); 
			l4LogPo.setBfNo(dataObject.getString(L4LogPo.COLUMNS.BF_NO.name())); 
			l4LogPo.setDeclNo(dataObject.getString(L4LogPo.COLUMNS.DECL_NO.name())); 
			l4LogPo.setItemNo(dataObject.getString(L4LogPo.COLUMNS.ITEM_NO.name())); 
			l4LogPo.setDeclSeqNo(BigDecimalUtils.formObj(dataObject.getValue(L4LogPo.COLUMNS.DECL_SEQ_NO.name()))); 
			return l4LogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final L4LogPo l4LogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(L4LogPo.COLUMNS.CONTROL_NO.name(), l4LogPo.getControlNo()); 
			dataObject.setValue(L4LogPo.COLUMNS.VERSION.name(), l4LogPo.getVersion()); 
			dataObject.setValue(L4LogPo.COLUMNS.SEQ_NO.name(), l4LogPo.getSeqNo()); 
			dataObject.setValue(L4LogPo.COLUMNS.LOG_STATUS.name(), l4LogPo.getLogStatus()); 
			dataObject.setValue(L4LogPo.COLUMNS.LOG_RMK.name(), l4LogPo.getLogRmk()); 
			dataObject.setValue(L4LogPo.COLUMNS.L4_TIME.name(), l4LogPo.getL4Time()); 
			dataObject.setValue(L4LogPo.COLUMNS.MSG_FUN.name(), l4LogPo.getMsgFun()); 
			dataObject.setValue(L4LogPo.COLUMNS.REF_BILL_NO.name(), l4LogPo.getRefBillNo()); 
			dataObject.setValue(L4LogPo.COLUMNS.ITEM.name(), l4LogPo.getItem()); 
			dataObject.setValue(L4LogPo.COLUMNS.BF_NO.name(), l4LogPo.getBfNo()); 
			dataObject.setValue(L4LogPo.COLUMNS.DECL_NO.name(), l4LogPo.getDeclNo()); 
			dataObject.setValue(L4LogPo.COLUMNS.ITEM_NO.name(), l4LogPo.getItemNo()); 
			dataObject.setValue(L4LogPo.COLUMNS.DECL_SEQ_NO.name(), l4LogPo.getDeclSeqNo()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<L4LogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(L4LogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
