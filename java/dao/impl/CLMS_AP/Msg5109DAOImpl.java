package com.doc.common.dao.impl; 
 
public class Msg5109DAOImpl extends GeneralDAOImpl<Msg5109Po> implements Msg5109DAO { 
	public static final Msg5109DAOImpl INSTANCE = new Msg5109DAOImpl(); 
	public static final String TABLENAME = "MSG5109"; 

	public Msg5109DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Msg5109Po> CONVERTER = new MapConverter<Msg5109Po>() { 
 
		@Override 
		public Msg5109Po convert(final DataObject dataObject) { 
			final Msg5109Po msg5109Po = new Msg5109Po(); 
			msg5109Po.setBondno(dataObject.getString(Msg5109Po.COLUMNS.BONDNO.name())); 
			msg5109Po.setDeclno(dataObject.getString(Msg5109Po.COLUMNS.DECLNO.name())); 
			msg5109Po.setDocnum(dataObject.getString(Msg5109Po.COLUMNS.DOCNUM.name())); 
			msg5109Po.setProctime(TimestampUtils.of(dataObject.getValue(Msg5109Po.COLUMNS.PROCTIME.name()))); 
			msg5109Po.setCnname(dataObject.getString(Msg5109Po.COLUMNS.CNNAME.name())); 
			msg5109Po.setProcessid(dataObject.getString(Msg5109Po.COLUMNS.PROCESSID.name())); 
			msg5109Po.setIntctlno(dataObject.getString(Msg5109Po.COLUMNS.INTCTLNO.name())); 
			msg5109Po.setSendtime(TimestampUtils.of(dataObject.getValue(Msg5109Po.COLUMNS.SENDTIME.name()))); 
			msg5109Po.setMsgrefno(dataObject.getString(Msg5109Po.COLUMNS.MSGREFNO.name())); 
			msg5109Po.setContrno(dataObject.getString(Msg5109Po.COLUMNS.CONTRNO.name())); 
			return msg5109Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Msg5109Po msg5109Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Msg5109Po.COLUMNS.BONDNO.name(), msg5109Po.getBondno()); 
			dataObject.setValue(Msg5109Po.COLUMNS.DECLNO.name(), msg5109Po.getDeclno()); 
			dataObject.setValue(Msg5109Po.COLUMNS.DOCNUM.name(), msg5109Po.getDocnum()); 
			dataObject.setValue(Msg5109Po.COLUMNS.PROCTIME.name(), msg5109Po.getProctime()); 
			dataObject.setValue(Msg5109Po.COLUMNS.CNNAME.name(), msg5109Po.getCnname()); 
			dataObject.setValue(Msg5109Po.COLUMNS.PROCESSID.name(), msg5109Po.getProcessid()); 
			dataObject.setValue(Msg5109Po.COLUMNS.INTCTLNO.name(), msg5109Po.getIntctlno()); 
			dataObject.setValue(Msg5109Po.COLUMNS.SENDTIME.name(), msg5109Po.getSendtime()); 
			dataObject.setValue(Msg5109Po.COLUMNS.MSGREFNO.name(), msg5109Po.getMsgrefno()); 
			dataObject.setValue(Msg5109Po.COLUMNS.CONTRNO.name(), msg5109Po.getContrno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Msg5109Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Msg5109Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
