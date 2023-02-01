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
			recvlogPo.setBondno(dataObject.getString(RecvlogPo.COLUMNS.BONDNO.name())); 
			recvlogPo.setRecvtype(dataObject.getString(RecvlogPo.COLUMNS.RECVTYPE.name())); 
			recvlogPo.setKeyword(dataObject.getString(RecvlogPo.COLUMNS.KEYWORD.name())); 
			recvlogPo.setMsgtype(dataObject.getString(RecvlogPo.COLUMNS.MSGTYPE.name())); 
			recvlogPo.setProctime(TimestampUtils.of(dataObject.getValue(RecvlogPo.COLUMNS.PROCTIME.name()))); 
			recvlogPo.setProcstatus(BigDecimalUtils.formObj(dataObject.getValue(RecvlogPo.COLUMNS.PROCSTATUS.name()))); 
			recvlogPo.setProcrmk(dataObject.getString(RecvlogPo.COLUMNS.PROCRMK.name())); 
			recvlogPo.setControlno(dataObject.getString(RecvlogPo.COLUMNS.CONTROLNO.name())); 
			return recvlogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final RecvlogPo recvlogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(RecvlogPo.COLUMNS.BONDNO.name(), recvlogPo.getBondno()); 
			dataObject.setValue(RecvlogPo.COLUMNS.RECVTYPE.name(), recvlogPo.getRecvtype()); 
			dataObject.setValue(RecvlogPo.COLUMNS.KEYWORD.name(), recvlogPo.getKeyword()); 
			dataObject.setValue(RecvlogPo.COLUMNS.MSGTYPE.name(), recvlogPo.getMsgtype()); 
			dataObject.setValue(RecvlogPo.COLUMNS.PROCTIME.name(), recvlogPo.getProctime()); 
			dataObject.setValue(RecvlogPo.COLUMNS.PROCSTATUS.name(), recvlogPo.getProcstatus()); 
			dataObject.setValue(RecvlogPo.COLUMNS.PROCRMK.name(), recvlogPo.getProcrmk()); 
			dataObject.setValue(RecvlogPo.COLUMNS.CONTROLNO.name(), recvlogPo.getControlno()); 
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
