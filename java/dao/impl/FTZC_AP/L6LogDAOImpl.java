package com.doc.common.dao.impl; 
 
public class L6LogDAOImpl extends GeneralDAOImpl<L6LogPo> implements L6LogDAO { 
	public static final L6LogDAOImpl INSTANCE = new L6LogDAOImpl(); 
	public static final String TABLENAME = "L6_LOG"; 

	public L6LogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<L6LogPo> CONVERTER = new MapConverter<L6LogPo>() { 
 
		@Override 
		public L6LogPo convert(final DataObject dataObject) { 
			final L6LogPo l6LogPo = new L6LogPo(); 
			l6LogPo.setBfNo(dataObject.getString(L6LogPo.COLUMNS.BF_NO.name())); 
			l6LogPo.setControlNo(dataObject.getString(L6LogPo.COLUMNS.CONTROL_NO.name())); 
			l6LogPo.setVersion(BigDecimalUtils.formObj(dataObject.getValue(L6LogPo.COLUMNS.VERSION.name()))); 
			l6LogPo.setSeqNo(BigDecimalUtils.formObj(dataObject.getValue(L6LogPo.COLUMNS.SEQ_NO.name()))); 
			l6LogPo.setRefBillNo(dataObject.getString(L6LogPo.COLUMNS.REF_BILL_NO.name())); 
			l6LogPo.setItem(BigDecimalUtils.formObj(dataObject.getValue(L6LogPo.COLUMNS.ITEM.name()))); 
			l6LogPo.setOilPost(dataObject.getString(L6LogPo.COLUMNS.OIL_POST.name())); 
			l6LogPo.setNewPost(dataObject.getString(L6LogPo.COLUMNS.NEW_POST.name())); 
			l6LogPo.setQty(BigDecimalUtils.formObj(dataObject.getValue(L6LogPo.COLUMNS.QTY.name()))); 
			l6LogPo.setLogStatus(dataObject.getString(L6LogPo.COLUMNS.LOG_STATUS.name())); 
			l6LogPo.setLogRmk(dataObject.getString(L6LogPo.COLUMNS.LOG_RMK.name())); 
			l6LogPo.setL6Time(TimestampUtils.of(dataObject.getValue(L6LogPo.COLUMNS.L6_TIME.name()))); 
			return l6LogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final L6LogPo l6LogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(L6LogPo.COLUMNS.BF_NO.name(), l6LogPo.getBfNo()); 
			dataObject.setValue(L6LogPo.COLUMNS.CONTROL_NO.name(), l6LogPo.getControlNo()); 
			dataObject.setValue(L6LogPo.COLUMNS.VERSION.name(), l6LogPo.getVersion()); 
			dataObject.setValue(L6LogPo.COLUMNS.SEQ_NO.name(), l6LogPo.getSeqNo()); 
			dataObject.setValue(L6LogPo.COLUMNS.REF_BILL_NO.name(), l6LogPo.getRefBillNo()); 
			dataObject.setValue(L6LogPo.COLUMNS.ITEM.name(), l6LogPo.getItem()); 
			dataObject.setValue(L6LogPo.COLUMNS.OIL_POST.name(), l6LogPo.getOilPost()); 
			dataObject.setValue(L6LogPo.COLUMNS.NEW_POST.name(), l6LogPo.getNewPost()); 
			dataObject.setValue(L6LogPo.COLUMNS.QTY.name(), l6LogPo.getQty()); 
			dataObject.setValue(L6LogPo.COLUMNS.LOG_STATUS.name(), l6LogPo.getLogStatus()); 
			dataObject.setValue(L6LogPo.COLUMNS.LOG_RMK.name(), l6LogPo.getLogRmk()); 
			dataObject.setValue(L6LogPo.COLUMNS.L6_TIME.name(), l6LogPo.getL6Time()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<L6LogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(L6LogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
