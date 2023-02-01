package com.doc.common.dao.impl; 
 
public class LogmnrSessionActions$DAOImpl extends GeneralDAOImpl<LogmnrSessionActions$Po> implements ILogmnrSessionActions$DAO { 
	public static final LogmnrSessionActions$DAOImpl INSTANCE = new LogmnrSessionActions$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_SESSION_ACTIONS$"; 

	public LogmnrSessionActions$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrSessionActions$Po> CONVERTER = new MapConverter<LogmnrSessionActions$Po>() { 
 
		@Override 
		public LogmnrSessionActions$Po convert(final DataObject dataObject) { 
			final LogmnrSessionActions$Po logmnrSessionActions$Po = new LogmnrSessionActions$Po(); 
			logmnrSessionActions$Po.setFlagsruntime(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSessionActions$Po.COLUMNS.FLAGSRUNTIME.name()))); 
			logmnrSessionActions$Po.setDropscn(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSessionActions$Po.COLUMNS.DROPSCN.name()))); 
			logmnrSessionActions$Po.setModifytime(); 
			logmnrSessionActions$Po.setDispatchtime(); 
			logmnrSessionActions$Po.setDroptime(); 
			logmnrSessionActions$Po.setLcrcount(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSessionActions$Po.COLUMNS.LCRCOUNT.name()))); 
			logmnrSessionActions$Po.setActionname(dataObject.getString(LogmnrSessionActions$Po.COLUMNS.ACTIONNAME.name())); 
			logmnrSessionActions$Po.setLogmnrsession#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSessionActions$Po.COLUMNS.LOGMNRSESSION#.name()))); 
			logmnrSessionActions$Po.setProcessrole#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSessionActions$Po.COLUMNS.PROCESSROLE#.name()))); 
			logmnrSessionActions$Po.setActiontype#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSessionActions$Po.COLUMNS.ACTIONTYPE#.name()))); 
			logmnrSessionActions$Po.setFlagsdefinetime(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSessionActions$Po.COLUMNS.FLAGSDEFINETIME.name()))); 
			logmnrSessionActions$Po.setCreatetime(); 
			logmnrSessionActions$Po.setXidusn(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSessionActions$Po.COLUMNS.XIDUSN.name()))); 
			logmnrSessionActions$Po.setXidslt(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSessionActions$Po.COLUMNS.XIDSLT.name()))); 
			logmnrSessionActions$Po.setXidsqn(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSessionActions$Po.COLUMNS.XIDSQN.name()))); 
			logmnrSessionActions$Po.setThread#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSessionActions$Po.COLUMNS.THREAD#.name()))); 
			logmnrSessionActions$Po.setStartscn(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSessionActions$Po.COLUMNS.STARTSCN.name()))); 
			logmnrSessionActions$Po.setStartsubscn(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSessionActions$Po.COLUMNS.STARTSUBSCN.name()))); 
			logmnrSessionActions$Po.setEndscn(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSessionActions$Po.COLUMNS.ENDSCN.name()))); 
			logmnrSessionActions$Po.setEndsubscn(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSessionActions$Po.COLUMNS.ENDSUBSCN.name()))); 
			logmnrSessionActions$Po.setRbasqn(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSessionActions$Po.COLUMNS.RBASQN.name()))); 
			logmnrSessionActions$Po.setRbablk(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSessionActions$Po.COLUMNS.RBABLK.name()))); 
			logmnrSessionActions$Po.setRbabyte(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSessionActions$Po.COLUMNS.RBABYTE.name()))); 
			logmnrSessionActions$Po.setSession#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSessionActions$Po.COLUMNS.SESSION#.name()))); 
			logmnrSessionActions$Po.setObj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSessionActions$Po.COLUMNS.OBJ#.name()))); 
			logmnrSessionActions$Po.setAttr1(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSessionActions$Po.COLUMNS.ATTR1.name()))); 
			logmnrSessionActions$Po.setAttr2(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSessionActions$Po.COLUMNS.ATTR2.name()))); 
			logmnrSessionActions$Po.setAttr3(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSessionActions$Po.COLUMNS.ATTR3.name()))); 
			logmnrSessionActions$Po.setSpare1(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSessionActions$Po.COLUMNS.SPARE1.name()))); 
			logmnrSessionActions$Po.setSpare2(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSessionActions$Po.COLUMNS.SPARE2.name()))); 
			logmnrSessionActions$Po.setSpare3(); 
			logmnrSessionActions$Po.setSpare4(dataObject.getString(LogmnrSessionActions$Po.COLUMNS.SPARE4.name())); 
			return logmnrSessionActions$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrSessionActions$Po logmnrSessionActions$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrSessionActions$Po.COLUMNS.FLAGSRUNTIME.name(), logmnrSessionActions$Po.getFlagsruntime()); 
			dataObject.setValue(LogmnrSessionActions$Po.COLUMNS.DROPSCN.name(), logmnrSessionActions$Po.getDropscn()); 
			dataObject.setValue(LogmnrSessionActions$Po.COLUMNS.MODIFYTIME.name(), logmnrSessionActions$Po.getModifytime()); 
			dataObject.setValue(LogmnrSessionActions$Po.COLUMNS.DISPATCHTIME.name(), logmnrSessionActions$Po.getDispatchtime()); 
			dataObject.setValue(LogmnrSessionActions$Po.COLUMNS.DROPTIME.name(), logmnrSessionActions$Po.getDroptime()); 
			dataObject.setValue(LogmnrSessionActions$Po.COLUMNS.LCRCOUNT.name(), logmnrSessionActions$Po.getLcrcount()); 
			dataObject.setValue(LogmnrSessionActions$Po.COLUMNS.ACTIONNAME.name(), logmnrSessionActions$Po.getActionname()); 
			dataObject.setValue(LogmnrSessionActions$Po.COLUMNS.LOGMNRSESSION#.name(), logmnrSessionActions$Po.getLogmnrsession#()); 
			dataObject.setValue(LogmnrSessionActions$Po.COLUMNS.PROCESSROLE#.name(), logmnrSessionActions$Po.getProcessrole#()); 
			dataObject.setValue(LogmnrSessionActions$Po.COLUMNS.ACTIONTYPE#.name(), logmnrSessionActions$Po.getActiontype#()); 
			dataObject.setValue(LogmnrSessionActions$Po.COLUMNS.FLAGSDEFINETIME.name(), logmnrSessionActions$Po.getFlagsdefinetime()); 
			dataObject.setValue(LogmnrSessionActions$Po.COLUMNS.CREATETIME.name(), logmnrSessionActions$Po.getCreatetime()); 
			dataObject.setValue(LogmnrSessionActions$Po.COLUMNS.XIDUSN.name(), logmnrSessionActions$Po.getXidusn()); 
			dataObject.setValue(LogmnrSessionActions$Po.COLUMNS.XIDSLT.name(), logmnrSessionActions$Po.getXidslt()); 
			dataObject.setValue(LogmnrSessionActions$Po.COLUMNS.XIDSQN.name(), logmnrSessionActions$Po.getXidsqn()); 
			dataObject.setValue(LogmnrSessionActions$Po.COLUMNS.THREAD#.name(), logmnrSessionActions$Po.getThread#()); 
			dataObject.setValue(LogmnrSessionActions$Po.COLUMNS.STARTSCN.name(), logmnrSessionActions$Po.getStartscn()); 
			dataObject.setValue(LogmnrSessionActions$Po.COLUMNS.STARTSUBSCN.name(), logmnrSessionActions$Po.getStartsubscn()); 
			dataObject.setValue(LogmnrSessionActions$Po.COLUMNS.ENDSCN.name(), logmnrSessionActions$Po.getEndscn()); 
			dataObject.setValue(LogmnrSessionActions$Po.COLUMNS.ENDSUBSCN.name(), logmnrSessionActions$Po.getEndsubscn()); 
			dataObject.setValue(LogmnrSessionActions$Po.COLUMNS.RBASQN.name(), logmnrSessionActions$Po.getRbasqn()); 
			dataObject.setValue(LogmnrSessionActions$Po.COLUMNS.RBABLK.name(), logmnrSessionActions$Po.getRbablk()); 
			dataObject.setValue(LogmnrSessionActions$Po.COLUMNS.RBABYTE.name(), logmnrSessionActions$Po.getRbabyte()); 
			dataObject.setValue(LogmnrSessionActions$Po.COLUMNS.SESSION#.name(), logmnrSessionActions$Po.getSession#()); 
			dataObject.setValue(LogmnrSessionActions$Po.COLUMNS.OBJ#.name(), logmnrSessionActions$Po.getObj#()); 
			dataObject.setValue(LogmnrSessionActions$Po.COLUMNS.ATTR1.name(), logmnrSessionActions$Po.getAttr1()); 
			dataObject.setValue(LogmnrSessionActions$Po.COLUMNS.ATTR2.name(), logmnrSessionActions$Po.getAttr2()); 
			dataObject.setValue(LogmnrSessionActions$Po.COLUMNS.ATTR3.name(), logmnrSessionActions$Po.getAttr3()); 
			dataObject.setValue(LogmnrSessionActions$Po.COLUMNS.SPARE1.name(), logmnrSessionActions$Po.getSpare1()); 
			dataObject.setValue(LogmnrSessionActions$Po.COLUMNS.SPARE2.name(), logmnrSessionActions$Po.getSpare2()); 
			dataObject.setValue(LogmnrSessionActions$Po.COLUMNS.SPARE3.name(), logmnrSessionActions$Po.getSpare3()); 
			dataObject.setValue(LogmnrSessionActions$Po.COLUMNS.SPARE4.name(), logmnrSessionActions$Po.getSpare4()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrSessionActions$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrSessionActions$Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrSessionActions$Po.COLUMNS.ACTIONNAME.name(), po.getActionname()); 
		sqlWhere.add(LogmnrSessionActions$Po.COLUMNS.LOGMNRSESSION#.name(), po.getLogmnrsession#()); 
		return sqlWhere; 
	} 
 
} 
