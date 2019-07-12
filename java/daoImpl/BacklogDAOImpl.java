package com.doc.common.dao.impl; 
 
public class BacklogDAOImpl extends GeneralDAOImpl<BacklogDo> implements BacklogDAOImpl { 
	public static final BacklogDAOImpl INSTANCE = new BacklogDAOImpl(); 
	public static final String TABLENAME = "BACKLOG"; 

	public BacklogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<BacklogDo> CONVERTER = new MapConverter<BacklogDo>() { 
 
		@Override 
		public BacklogDo convert(final DataObject dataObject) { 
			final BacklogDo backlogDo = new BacklogDo(); 
			backlogDo.setLogtable(dataObject.getString(BacklogDo.COLUMNS.LOGTABLE.name())); 
			backlogDo.setInscnt(BigDecimalUtils.formObj(dataObject.getString(BacklogDo.COLUMNS.INSCNT.name()))); 
			backlogDo.setDelcnt(BigDecimalUtils.formObj(dataObject.getString(BacklogDo.COLUMNS.DELCNT.name()))); 
			backlogDo.setLogtime(dataObject.getString(BacklogDo.COLUMNS.LOGTIME.name())); 
			backlogDo.setBackupdate(dataObject.getString(BacklogDo.COLUMNS.BACKUPDATE.name())); 
			backlogDo.setExpdate(dataObject.getString(BacklogDo.COLUMNS.EXPDATE.name())); 
			backlogDo.setCleardate(dataObject.getString(BacklogDo.COLUMNS.CLEARDATE.name())); 
			backlogDo.setCleardate2(dataObject.getString(BacklogDo.COLUMNS.CLEARDATE2.name())); 
			return backlogDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final BacklogDo backlogDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(BacklogDo.COLUMNS.LOGTABLE.name(), backlogDo.getLogtable()); 
			dataObject.setValue(BacklogDo.COLUMNS.INSCNT.name(), backlogDo.getInscnt()); 
			dataObject.setValue(BacklogDo.COLUMNS.DELCNT.name(), backlogDo.getDelcnt()); 
			dataObject.setValue(BacklogDo.COLUMNS.LOGTIME.name(), backlogDo.getLogtime()); 
			dataObject.setValue(BacklogDo.COLUMNS.BACKUPDATE.name(), backlogDo.getBackupdate()); 
			dataObject.setValue(BacklogDo.COLUMNS.EXPDATE.name(), backlogDo.getExpdate()); 
			dataObject.setValue(BacklogDo.COLUMNS.CLEARDATE.name(), backlogDo.getCleardate()); 
			dataObject.setValue(BacklogDo.COLUMNS.CLEARDATE2.name(), backlogDo.getCleardate2()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<BacklogDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(BacklogDo po) { 
	} 
 
} 
