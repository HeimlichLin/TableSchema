package com.doc.common.dao.impl; 
 
public class L5LogDAOImpl extends GeneralDAOImpl<L5LogPo> implements L5LogDAO { 
	public static final L5LogDAOImpl INSTANCE = new L5LogDAOImpl(); 
	public static final String TABLENAME = "L5_LOG"; 

	public L5LogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<L5LogPo> CONVERTER = new MapConverter<L5LogPo>() { 
 
		@Override 
		public L5LogPo convert(final DataObject dataObject) { 
			final L5LogPo l5LogPo = new L5LogPo(); 
			l5LogPo.setBfNo(dataObject.getString(L5LogPo.COLUMNS.BF_NO.name())); 
			l5LogPo.setControlNo(dataObject.getString(L5LogPo.COLUMNS.CONTROL_NO.name())); 
			l5LogPo.setVersion(BigDecimalUtils.formObj(dataObject.getValue(L5LogPo.COLUMNS.VERSION.name()))); 
			l5LogPo.setSeqNo(BigDecimalUtils.formObj(dataObject.getValue(L5LogPo.COLUMNS.SEQ_NO.name()))); 
			l5LogPo.setLogStatus(dataObject.getString(L5LogPo.COLUMNS.LOG_STATUS.name())); 
			l5LogPo.setLogRmk(dataObject.getString(L5LogPo.COLUMNS.LOG_RMK.name())); 
			l5LogPo.setL5Time(TimestampUtils.of(dataObject.getValue(L5LogPo.COLUMNS.L5_TIME.name()))); 
			l5LogPo.setMsgFun(dataObject.getString(L5LogPo.COLUMNS.MSG_FUN.name())); 
			l5LogPo.setRefBillNo(dataObject.getString(L5LogPo.COLUMNS.REF_BILL_NO.name())); 
			l5LogPo.setItem(BigDecimalUtils.formObj(dataObject.getValue(L5LogPo.COLUMNS.ITEM.name()))); 
			return l5LogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final L5LogPo l5LogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(L5LogPo.COLUMNS.BF_NO.name(), l5LogPo.getBfNo()); 
			dataObject.setValue(L5LogPo.COLUMNS.CONTROL_NO.name(), l5LogPo.getControlNo()); 
			dataObject.setValue(L5LogPo.COLUMNS.VERSION.name(), l5LogPo.getVersion()); 
			dataObject.setValue(L5LogPo.COLUMNS.SEQ_NO.name(), l5LogPo.getSeqNo()); 
			dataObject.setValue(L5LogPo.COLUMNS.LOG_STATUS.name(), l5LogPo.getLogStatus()); 
			dataObject.setValue(L5LogPo.COLUMNS.LOG_RMK.name(), l5LogPo.getLogRmk()); 
			dataObject.setValue(L5LogPo.COLUMNS.L5_TIME.name(), l5LogPo.getL5Time()); 
			dataObject.setValue(L5LogPo.COLUMNS.MSG_FUN.name(), l5LogPo.getMsgFun()); 
			dataObject.setValue(L5LogPo.COLUMNS.REF_BILL_NO.name(), l5LogPo.getRefBillNo()); 
			dataObject.setValue(L5LogPo.COLUMNS.ITEM.name(), l5LogPo.getItem()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<L5LogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(L5LogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
