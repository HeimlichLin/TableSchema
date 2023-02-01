package com.doc.common.dao.impl; 
 
public class MailqueDAOImpl extends GeneralDAOImpl<MailquePo> implements MailqueDAO { 
	public static final MailqueDAOImpl INSTANCE = new MailqueDAOImpl(); 
	public static final String TABLENAME = "MAILQUE"; 

	public MailqueDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<MailquePo> CONVERTER = new MapConverter<MailquePo>() { 
 
		@Override 
		public MailquePo convert(final DataObject dataObject) { 
			final MailquePo mailquePo = new MailquePo(); 
			mailquePo.setPgmId(dataObject.getString(MailquePo.COLUMNS.PGM_ID.name())); 
			mailquePo.setCreateDate(dataObject.getString(MailquePo.COLUMNS.CREATE_DATE.name())); 
			mailquePo.setSubject(dataObject.getString(MailquePo.COLUMNS.SUBJECT.name())); 
			mailquePo.setMailTo(dataObject.getString(MailquePo.COLUMNS.MAIL_TO.name())); 
			mailquePo.setMailCc(dataObject.getString(MailquePo.COLUMNS.MAIL_CC.name())); 
			mailquePo.setMailBcc(dataObject.getString(MailquePo.COLUMNS.MAIL_BCC.name())); 
			mailquePo.setMailFrom(dataObject.getString(MailquePo.COLUMNS.MAIL_FROM.name())); 
			mailquePo.setMessage(dataObject.getString(MailquePo.COLUMNS.MESSAGE.name())); 
			mailquePo.setRemarks(dataObject.getString(MailquePo.COLUMNS.REMARKS.name())); 
			mailquePo.setMailId(dataObject.getString(MailquePo.COLUMNS.MAIL_ID.name())); 
			mailquePo.setStatus(dataObject.getString(MailquePo.COLUMNS.STATUS.name())); 
			mailquePo.setSendDate(dataObject.getString(MailquePo.COLUMNS.SEND_DATE.name())); 
			mailquePo.setFilePath(dataObject.getString(MailquePo.COLUMNS.FILE_PATH.name())); 
			return mailquePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final MailquePo mailquePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(MailquePo.COLUMNS.PGM_ID.name(), mailquePo.getPgmId()); 
			dataObject.setValue(MailquePo.COLUMNS.CREATE_DATE.name(), mailquePo.getCreateDate()); 
			dataObject.setValue(MailquePo.COLUMNS.SUBJECT.name(), mailquePo.getSubject()); 
			dataObject.setValue(MailquePo.COLUMNS.MAIL_TO.name(), mailquePo.getMailTo()); 
			dataObject.setValue(MailquePo.COLUMNS.MAIL_CC.name(), mailquePo.getMailCc()); 
			dataObject.setValue(MailquePo.COLUMNS.MAIL_BCC.name(), mailquePo.getMailBcc()); 
			dataObject.setValue(MailquePo.COLUMNS.MAIL_FROM.name(), mailquePo.getMailFrom()); 
			dataObject.setValue(MailquePo.COLUMNS.MESSAGE.name(), mailquePo.getMessage()); 
			dataObject.setValue(MailquePo.COLUMNS.REMARKS.name(), mailquePo.getRemarks()); 
			dataObject.setValue(MailquePo.COLUMNS.MAIL_ID.name(), mailquePo.getMailId()); 
			dataObject.setValue(MailquePo.COLUMNS.STATUS.name(), mailquePo.getStatus()); 
			dataObject.setValue(MailquePo.COLUMNS.SEND_DATE.name(), mailquePo.getSendDate()); 
			dataObject.setValue(MailquePo.COLUMNS.FILE_PATH.name(), mailquePo.getFilePath()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<MailquePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(MailquePo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(MailquePo.COLUMNS.MAIL_ID.name(), po.getMailId()); 
		return sqlWhere; 
	} 
 
} 
