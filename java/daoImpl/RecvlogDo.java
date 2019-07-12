package com.doc.common.dao.impl; 
 
public class RecvlogDAO extends GeneralDAOImpl<RecvlogDo> implements RecvlogDAO { 
	public static final RecvlogDAOImpl INSTANCE = new RecvlogDAOImpl(); 
	public static final String TABLENAME = "RECVLOG"; 

	public RecvlogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<RecvlogDo> CONVERTER = new MapConverter<RecvlogDo>() { 
 
		@Override 
		public RecvlogDo convert(final DataObject dataObject) { 
			final RecvlogDo recvlogDo = new RecvlogDo(); 
			recvlogDo.setBondno(dataObject.getString(RecvlogDo.COLUMNS.BONDNO.name())); 
			recvlogDo.setRecvtype(dataObject.getString(RecvlogDo.COLUMNS.RECVTYPE.name())); 
			recvlogDo.setKeyword(dataObject.getString(RecvlogDo.COLUMNS.KEYWORD.name())); 
			recvlogDo.setMsgtype(dataObject.getString(RecvlogDo.COLUMNS.MSGTYPE.name())); 
			recvlogDo.setProctime(CommUtils.objConver2Time(dataObject.getString(RecvlogDo.COLUMNS.PROCTIME.name()))); 
			recvlogDo.setProcstatus(BigDecimalUtils.formObj(dataObject.getString(RecvlogDo.COLUMNS.PROCSTATUS.name()))); 
			recvlogDo.setProcrmk(dataObject.getString(RecvlogDo.COLUMNS.PROCRMK.name())); 
			recvlogDo.setControlno(dataObject.getString(RecvlogDo.COLUMNS.CONTROLNO.name())); 
			return recvlogDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final RecvlogDo recvlogDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(RecvlogDo.COLUMNS.BONDNO.name(), recvlogDo.getBondno()); 
			dataObject.setValue(RecvlogDo.COLUMNS.RECVTYPE.name(), recvlogDo.getRecvtype()); 
			dataObject.setValue(RecvlogDo.COLUMNS.KEYWORD.name(), recvlogDo.getKeyword()); 
			dataObject.setValue(RecvlogDo.COLUMNS.MSGTYPE.name(), recvlogDo.getMsgtype()); 
			dataObject.setValue(RecvlogDo.COLUMNS.PROCTIME.name(), recvlogDo.getProctime()); 
			dataObject.setValue(RecvlogDo.COLUMNS.PROCSTATUS.name(), recvlogDo.getProcstatus()); 
			dataObject.setValue(RecvlogDo.COLUMNS.PROCRMK.name(), recvlogDo.getProcrmk()); 
			dataObject.setValue(RecvlogDo.COLUMNS.CONTROLNO.name(), recvlogDo.getControlno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<RecvlogDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(RecvlogDo po) { 
		sqlWhere.add(RecvlogDo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(RecvlogDo.COLUMNS.RECVTYPE.name(), po.getRecvtype()); 
		sqlWhere.add(RecvlogDo.COLUMNS.KEYWORD.name(), po.getKeyword()); 
		sqlWhere.add(RecvlogDo.COLUMNS.MSGTYPE.name(), po.getMsgtype()); 
		sqlWhere.add(RecvlogDo.COLUMNS.PROCTIME.name(), po.getProctime()); 
		sqlWhere.add(RecvlogDo.COLUMNS.PROCSTATUS.name(), po.getProcstatus()); 
		sqlWhere.add(RecvlogDo.COLUMNS.PROCRMK.name(), po.getProcrmk()); 
		sqlWhere.add(RecvlogDo.COLUMNS.CONTROLNO.name(), po.getControlno()); 
	} 
 
} 
