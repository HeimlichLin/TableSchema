package com.doc.common.dao.impl; 
 
public class LogmnrtMddl$DAOImpl extends GeneralDAOImpl<LogmnrtMddl$Po> implements ILogmnrtMddl$DAO { 
	public static final LogmnrtMddl$DAOImpl INSTANCE = new LogmnrtMddl$DAOImpl(); 
	public static final String TABLENAME = "LOGMNRT_MDDL$"; 

	public LogmnrtMddl$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrtMddl$Po> CONVERTER = new MapConverter<LogmnrtMddl$Po>() { 
 
		@Override 
		public LogmnrtMddl$Po convert(final DataObject dataObject) { 
			final LogmnrtMddl$Po logmnrtMddl$Po = new LogmnrtMddl$Po(); 
			logmnrtMddl$Po.setSourceObj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrtMddl$Po.COLUMNS.SOURCE_OBJ#.name()))); 
			logmnrtMddl$Po.setSourceRowid(); 
			logmnrtMddl$Po.setDestRowid(); 
			return logmnrtMddl$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrtMddl$Po logmnrtMddl$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrtMddl$Po.COLUMNS.SOURCE_OBJ#.name(), logmnrtMddl$Po.getSourceObj#()); 
			dataObject.setValue(LogmnrtMddl$Po.COLUMNS.SOURCE_ROWID.name(), logmnrtMddl$Po.getSourceRowid()); 
			dataObject.setValue(LogmnrtMddl$Po.COLUMNS.DEST_ROWID.name(), logmnrtMddl$Po.getDestRowid()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrtMddl$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrtMddl$Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrtMddl$Po.COLUMNS.SOURCE_OBJ#.name(), po.getSourceObj#()); 
		sqlWhere.add(LogmnrtMddl$Po.COLUMNS.SOURCE_ROWID.name(), po.getSourceRowid()); 
		return sqlWhere; 
	} 
 
} 
