package com.doc.common.dao.impl; 
 
public class MailaccountDAOImpl extends GeneralDAOImpl<MailaccountPo> implements MailaccountDAO { 
	public static final MailaccountDAOImpl INSTANCE = new MailaccountDAOImpl(); 
	public static final String TABLENAME = "MAILACCOUNT"; 

	public MailaccountDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<MailaccountPo> CONVERTER = new MapConverter<MailaccountPo>() { 
 
		@Override 
		public MailaccountPo convert(final DataObject dataObject) { 
			final MailaccountPo mailaccountPo = new MailaccountPo(); 
			mailaccountPo.setBondno(dataObject.getString(MailaccountPo.COLUMNS.BONDNO.name())); 
			mailaccountPo.setRectype(dataObject.getString(MailaccountPo.COLUMNS.RECTYPE.name())); 
			mailaccountPo.setReceiver(dataObject.getString(MailaccountPo.COLUMNS.RECEIVER.name())); 
			mailaccountPo.setMailaddr(dataObject.getString(MailaccountPo.COLUMNS.MAILADDR.name())); 
			return mailaccountPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final MailaccountPo mailaccountPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(MailaccountPo.COLUMNS.BONDNO.name(), mailaccountPo.getBondno()); 
			dataObject.setValue(MailaccountPo.COLUMNS.RECTYPE.name(), mailaccountPo.getRectype()); 
			dataObject.setValue(MailaccountPo.COLUMNS.RECEIVER.name(), mailaccountPo.getReceiver()); 
			dataObject.setValue(MailaccountPo.COLUMNS.MAILADDR.name(), mailaccountPo.getMailaddr()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<MailaccountPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(MailaccountPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
