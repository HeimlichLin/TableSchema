package com.doc.common.dao.impl; 
 
public class MailaccountDAO extends GeneralDAOImpl<MailaccountDo> implements MailaccountDAO { 
	public static final MailaccountDAOImpl INSTANCE = new MailaccountDAOImpl(); 
	public static final String TABLENAME = "MAILACCOUNT"; 

	public MailaccountDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<MailaccountDo> CONVERTER = new MapConverter<MailaccountDo>() { 
 
		@Override 
		public MailaccountDo convert(final DataObject dataObject) { 
			final MailaccountDo mailaccountDo = new MailaccountDo(); 
			mailaccountDo.setBondno(dataObject.getString(MailaccountDo.COLUMNS.BONDNO.name())); 
			mailaccountDo.setRectype(dataObject.getString(MailaccountDo.COLUMNS.RECTYPE.name())); 
			mailaccountDo.setReceiver(dataObject.getString(MailaccountDo.COLUMNS.RECEIVER.name())); 
			mailaccountDo.setMailaddr(dataObject.getString(MailaccountDo.COLUMNS.MAILADDR.name())); 
			return mailaccountDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final MailaccountDo mailaccountDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(MailaccountDo.COLUMNS.BONDNO.name(), mailaccountDo.getBondno()); 
			dataObject.setValue(MailaccountDo.COLUMNS.RECTYPE.name(), mailaccountDo.getRectype()); 
			dataObject.setValue(MailaccountDo.COLUMNS.RECEIVER.name(), mailaccountDo.getReceiver()); 
			dataObject.setValue(MailaccountDo.COLUMNS.MAILADDR.name(), mailaccountDo.getMailaddr()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<MailaccountDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(MailaccountDo po) { 
		sqlWhere.add(MailaccountDo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(MailaccountDo.COLUMNS.RECTYPE.name(), po.getRectype()); 
		sqlWhere.add(MailaccountDo.COLUMNS.RECEIVER.name(), po.getReceiver()); 
		sqlWhere.add(MailaccountDo.COLUMNS.MAILADDR.name(), po.getMailaddr()); 
	} 
 
} 
