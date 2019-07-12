package com.doc.common.dao.impl; 
 
public class Msg5109DAO extends GeneralDAOImpl<Msg5109Do> implements Msg5109DAO { 
	public static final Msg5109DAOImpl INSTANCE = new Msg5109DAOImpl(); 
	public static final String TABLENAME = "MSG5109"; 

	public Msg5109DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<Msg5109Do> CONVERTER = new MapConverter<Msg5109Do>() { 
 
		@Override 
		public Msg5109Do convert(final DataObject dataObject) { 
			final Msg5109Do msg5109Do = new Msg5109Do(); 
			msg5109Do.setBondno(dataObject.getString(Msg5109Do.COLUMNS.BONDNO.name())); 
			msg5109Do.setDeclno(dataObject.getString(Msg5109Do.COLUMNS.DECLNO.name())); 
			msg5109Do.setDocnum(dataObject.getString(Msg5109Do.COLUMNS.DOCNUM.name())); 
			msg5109Do.setProctime(CommUtils.objConver2Time(dataObject.getString(Msg5109Do.COLUMNS.PROCTIME.name()))); 
			msg5109Do.setCnname(dataObject.getString(Msg5109Do.COLUMNS.CNNAME.name())); 
			msg5109Do.setProcessid(dataObject.getString(Msg5109Do.COLUMNS.PROCESSID.name())); 
			msg5109Do.setIntctlno(dataObject.getString(Msg5109Do.COLUMNS.INTCTLNO.name())); 
			msg5109Do.setSendtime(CommUtils.objConver2Time(dataObject.getString(Msg5109Do.COLUMNS.SENDTIME.name()))); 
			msg5109Do.setMsgrefno(dataObject.getString(Msg5109Do.COLUMNS.MSGREFNO.name())); 
			msg5109Do.setContrno(dataObject.getString(Msg5109Do.COLUMNS.CONTRNO.name())); 
			return msg5109Do; 
		} 
 
		@Override 
		public DataObject toDataObject(final Msg5109Do msg5109Do) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Msg5109Do.COLUMNS.BONDNO.name(), msg5109Do.getBondno()); 
			dataObject.setValue(Msg5109Do.COLUMNS.DECLNO.name(), msg5109Do.getDeclno()); 
			dataObject.setValue(Msg5109Do.COLUMNS.DOCNUM.name(), msg5109Do.getDocnum()); 
			dataObject.setValue(Msg5109Do.COLUMNS.PROCTIME.name(), msg5109Do.getProctime()); 
			dataObject.setValue(Msg5109Do.COLUMNS.CNNAME.name(), msg5109Do.getCnname()); 
			dataObject.setValue(Msg5109Do.COLUMNS.PROCESSID.name(), msg5109Do.getProcessid()); 
			dataObject.setValue(Msg5109Do.COLUMNS.INTCTLNO.name(), msg5109Do.getIntctlno()); 
			dataObject.setValue(Msg5109Do.COLUMNS.SENDTIME.name(), msg5109Do.getSendtime()); 
			dataObject.setValue(Msg5109Do.COLUMNS.MSGREFNO.name(), msg5109Do.getMsgrefno()); 
			dataObject.setValue(Msg5109Do.COLUMNS.CONTRNO.name(), msg5109Do.getContrno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Msg5109Do> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Msg5109Do po) { 
		sqlWhere.add(Msg5109Do.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(Msg5109Do.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(Msg5109Do.COLUMNS.DOCNUM.name(), po.getDocnum()); 
		sqlWhere.add(Msg5109Do.COLUMNS.PROCTIME.name(), po.getProctime()); 
		sqlWhere.add(Msg5109Do.COLUMNS.CNNAME.name(), po.getCnname()); 
		sqlWhere.add(Msg5109Do.COLUMNS.PROCESSID.name(), po.getProcessid()); 
		sqlWhere.add(Msg5109Do.COLUMNS.INTCTLNO.name(), po.getIntctlno()); 
		sqlWhere.add(Msg5109Do.COLUMNS.SENDTIME.name(), po.getSendtime()); 
		sqlWhere.add(Msg5109Do.COLUMNS.MSGREFNO.name(), po.getMsgrefno()); 
		sqlWhere.add(Msg5109Do.COLUMNS.CONTRNO.name(), po.getContrno()); 
	} 
 
} 
