package com.doc.common.dao.impl; 
 
public class N1BLogDAOImpl extends GeneralDAOImpl<N1BLogPo> implements N1BLogDAO { 
	public static final N1BLogDAOImpl INSTANCE = new N1BLogDAOImpl(); 
	public static final String TABLENAME = "N1_B_LOG"; 

	public N1BLogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<N1BLogPo> CONVERTER = new MapConverter<N1BLogPo>() { 
 
		@Override 
		public N1BLogPo convert(final DataObject dataObject) { 
			final N1BLogPo n1BLogPo = new N1BLogPo(); 
			n1BLogPo.setBfNo(dataObject.getString(N1BLogPo.COLUMNS.BF_NO.name())); 
			n1BLogPo.setControlNo(dataObject.getString(N1BLogPo.COLUMNS.CONTROL_NO.name())); 
			n1BLogPo.setVersion(BigDecimalUtils.formObj(dataObject.getValue(N1BLogPo.COLUMNS.VERSION.name()))); 
			n1BLogPo.setSeqNo(BigDecimalUtils.formObj(dataObject.getValue(N1BLogPo.COLUMNS.SEQ_NO.name()))); 
			n1BLogPo.setLogStatus(dataObject.getString(N1BLogPo.COLUMNS.LOG_STATUS.name())); 
			n1BLogPo.setLogRmk(dataObject.getString(N1BLogPo.COLUMNS.LOG_RMK.name())); 
			n1BLogPo.setRecvTime(TimestampUtils.of(dataObject.getValue(N1BLogPo.COLUMNS.RECV_TIME.name()))); 
			n1BLogPo.setFuncType(dataObject.getString(N1BLogPo.COLUMNS.FUNC_TYPE.name())); 
			n1BLogPo.setPost(dataObject.getString(N1BLogPo.COLUMNS.POST.name())); 
			n1BLogPo.setAttribute(dataObject.getString(N1BLogPo.COLUMNS.ATTRIBUTE.name())); 
			return n1BLogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final N1BLogPo n1BLogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(N1BLogPo.COLUMNS.BF_NO.name(), n1BLogPo.getBfNo()); 
			dataObject.setValue(N1BLogPo.COLUMNS.CONTROL_NO.name(), n1BLogPo.getControlNo()); 
			dataObject.setValue(N1BLogPo.COLUMNS.VERSION.name(), n1BLogPo.getVersion()); 
			dataObject.setValue(N1BLogPo.COLUMNS.SEQ_NO.name(), n1BLogPo.getSeqNo()); 
			dataObject.setValue(N1BLogPo.COLUMNS.LOG_STATUS.name(), n1BLogPo.getLogStatus()); 
			dataObject.setValue(N1BLogPo.COLUMNS.LOG_RMK.name(), n1BLogPo.getLogRmk()); 
			dataObject.setValue(N1BLogPo.COLUMNS.RECV_TIME.name(), n1BLogPo.getRecvTime()); 
			dataObject.setValue(N1BLogPo.COLUMNS.FUNC_TYPE.name(), n1BLogPo.getFuncType()); 
			dataObject.setValue(N1BLogPo.COLUMNS.POST.name(), n1BLogPo.getPost()); 
			dataObject.setValue(N1BLogPo.COLUMNS.ATTRIBUTE.name(), n1BLogPo.getAttribute()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<N1BLogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(N1BLogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
