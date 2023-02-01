package com.doc.common.dao.impl; 
 
public class RecvlogDAOImpl extends GeneralDAOImpl<RecvlogPo> implements RecvlogDAO { 
	public static final RecvlogDAOImpl INSTANCE = new RecvlogDAOImpl(); 
	public static final String TABLENAME = "RECVLOG"; 

	public RecvlogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<RecvlogPo> CONVERTER = new MapConverter<RecvlogPo>() { 
 
		@Override 
		public RecvlogPo convert(final DataObject dataObject) { 
			final RecvlogPo recvlogPo = new RecvlogPo(); 
			recvlogPo.setBfNo(dataObject.getString(RecvlogPo.COLUMNS.BF_NO.name())); 
			recvlogPo.setRecvType(dataObject.getString(RecvlogPo.COLUMNS.RECV_TYPE.name())); 
			recvlogPo.setKeyword(dataObject.getString(RecvlogPo.COLUMNS.KEYWORD.name())); 
			recvlogPo.setMsgType(dataObject.getString(RecvlogPo.COLUMNS.MSG_TYPE.name())); 
			recvlogPo.setProcTime(TimestampUtils.of(dataObject.getValue(RecvlogPo.COLUMNS.PROC_TIME.name()))); 
			recvlogPo.setProcStatus(BigDecimalUtils.formObj(dataObject.getValue(RecvlogPo.COLUMNS.PROC_STATUS.name()))); 
			recvlogPo.setProcRmk(dataObject.getString(RecvlogPo.COLUMNS.PROC_RMK.name())); 
			recvlogPo.setControlNo(dataObject.getString(RecvlogPo.COLUMNS.CONTROL_NO.name())); 
			recvlogPo.setSrcType(dataObject.getString(RecvlogPo.COLUMNS.SRC_TYPE.name())); 
			recvlogPo.setMawbNo(dataObject.getString(RecvlogPo.COLUMNS.MAWB_NO.name())); 
			recvlogPo.setHawbNo(dataObject.getString(RecvlogPo.COLUMNS.HAWB_NO.name())); 
			return recvlogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final RecvlogPo recvlogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(RecvlogPo.COLUMNS.BF_NO.name(), recvlogPo.getBfNo()); 
			dataObject.setValue(RecvlogPo.COLUMNS.RECV_TYPE.name(), recvlogPo.getRecvType()); 
			dataObject.setValue(RecvlogPo.COLUMNS.KEYWORD.name(), recvlogPo.getKeyword()); 
			dataObject.setValue(RecvlogPo.COLUMNS.MSG_TYPE.name(), recvlogPo.getMsgType()); 
			dataObject.setValue(RecvlogPo.COLUMNS.PROC_TIME.name(), recvlogPo.getProcTime()); 
			dataObject.setValue(RecvlogPo.COLUMNS.PROC_STATUS.name(), recvlogPo.getProcStatus()); 
			dataObject.setValue(RecvlogPo.COLUMNS.PROC_RMK.name(), recvlogPo.getProcRmk()); 
			dataObject.setValue(RecvlogPo.COLUMNS.CONTROL_NO.name(), recvlogPo.getControlNo()); 
			dataObject.setValue(RecvlogPo.COLUMNS.SRC_TYPE.name(), recvlogPo.getSrcType()); 
			dataObject.setValue(RecvlogPo.COLUMNS.MAWB_NO.name(), recvlogPo.getMawbNo()); 
			dataObject.setValue(RecvlogPo.COLUMNS.HAWB_NO.name(), recvlogPo.getHawbNo()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<RecvlogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(RecvlogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
