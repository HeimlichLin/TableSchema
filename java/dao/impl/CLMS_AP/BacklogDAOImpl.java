package com.doc.common.dao.impl; 
 
public class BacklogDAOImpl extends GeneralDAOImpl<BacklogPo> implements BacklogDAO { 
	public static final BacklogDAOImpl INSTANCE = new BacklogDAOImpl(); 
	public static final String TABLENAME = "BACKLOG"; 

	public BacklogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<BacklogPo> CONVERTER = new MapConverter<BacklogPo>() { 
 
		@Override 
		public BacklogPo convert(final DataObject dataObject) { 
			final BacklogPo backlogPo = new BacklogPo(); 
			backlogPo.setLogtable(dataObject.getString(BacklogPo.COLUMNS.LOGTABLE.name())); 
			backlogPo.setInscnt(BigDecimalUtils.formObj(dataObject.getValue(BacklogPo.COLUMNS.INSCNT.name()))); 
			backlogPo.setDelcnt(BigDecimalUtils.formObj(dataObject.getValue(BacklogPo.COLUMNS.DELCNT.name()))); 
			backlogPo.setLogtime(dataObject.getString(BacklogPo.COLUMNS.LOGTIME.name())); 
			backlogPo.setBackupdate(dataObject.getString(BacklogPo.COLUMNS.BACKUPDATE.name())); 
			backlogPo.setExpdate(dataObject.getString(BacklogPo.COLUMNS.EXPDATE.name())); 
			backlogPo.setCleardate(dataObject.getString(BacklogPo.COLUMNS.CLEARDATE.name())); 
			backlogPo.setCleardate2(dataObject.getString(BacklogPo.COLUMNS.CLEARDATE2.name())); 
			return backlogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final BacklogPo backlogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(BacklogPo.COLUMNS.LOGTABLE.name(), backlogPo.getLogtable()); 
			dataObject.setValue(BacklogPo.COLUMNS.INSCNT.name(), backlogPo.getInscnt()); 
			dataObject.setValue(BacklogPo.COLUMNS.DELCNT.name(), backlogPo.getDelcnt()); 
			dataObject.setValue(BacklogPo.COLUMNS.LOGTIME.name(), backlogPo.getLogtime()); 
			dataObject.setValue(BacklogPo.COLUMNS.BACKUPDATE.name(), backlogPo.getBackupdate()); 
			dataObject.setValue(BacklogPo.COLUMNS.EXPDATE.name(), backlogPo.getExpdate()); 
			dataObject.setValue(BacklogPo.COLUMNS.CLEARDATE.name(), backlogPo.getCleardate()); 
			dataObject.setValue(BacklogPo.COLUMNS.CLEARDATE2.name(), backlogPo.getCleardate2()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<BacklogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(BacklogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
