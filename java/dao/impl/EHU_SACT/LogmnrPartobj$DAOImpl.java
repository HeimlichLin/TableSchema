package com.doc.common.dao.impl; 
 
public class LogmnrPartobj$DAOImpl extends GeneralDAOImpl<LogmnrPartobj$Po> implements ILogmnrPartobj$DAO { 
	public static final LogmnrPartobj$DAOImpl INSTANCE = new LogmnrPartobj$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_PARTOBJ$"; 

	public LogmnrPartobj$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrPartobj$Po> CONVERTER = new MapConverter<LogmnrPartobj$Po>() { 
 
		@Override 
		public LogmnrPartobj$Po convert(final DataObject dataObject) { 
			final LogmnrPartobj$Po logmnrPartobj$Po = new LogmnrPartobj$Po(); 
			logmnrPartobj$Po.setParttype(BigDecimalUtils.formObj(dataObject.getValue(LogmnrPartobj$Po.COLUMNS.PARTTYPE.name()))); 
			logmnrPartobj$Po.setPartcnt(BigDecimalUtils.formObj(dataObject.getValue(LogmnrPartobj$Po.COLUMNS.PARTCNT.name()))); 
			logmnrPartobj$Po.setPartkeycols(BigDecimalUtils.formObj(dataObject.getValue(LogmnrPartobj$Po.COLUMNS.PARTKEYCOLS.name()))); 
			logmnrPartobj$Po.setFlags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrPartobj$Po.COLUMNS.FLAGS.name()))); 
			logmnrPartobj$Po.setDefts#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrPartobj$Po.COLUMNS.DEFTS#.name()))); 
			logmnrPartobj$Po.setDefpctfree(BigDecimalUtils.formObj(dataObject.getValue(LogmnrPartobj$Po.COLUMNS.DEFPCTFREE.name()))); 
			logmnrPartobj$Po.setDefpctused(BigDecimalUtils.formObj(dataObject.getValue(LogmnrPartobj$Po.COLUMNS.DEFPCTUSED.name()))); 
			logmnrPartobj$Po.setDefpctthres(BigDecimalUtils.formObj(dataObject.getValue(LogmnrPartobj$Po.COLUMNS.DEFPCTTHRES.name()))); 
			logmnrPartobj$Po.setDefinitrans(BigDecimalUtils.formObj(dataObject.getValue(LogmnrPartobj$Po.COLUMNS.DEFINITRANS.name()))); 
			logmnrPartobj$Po.setDefmaxtrans(BigDecimalUtils.formObj(dataObject.getValue(LogmnrPartobj$Po.COLUMNS.DEFMAXTRANS.name()))); 
			logmnrPartobj$Po.setDeftiniexts(BigDecimalUtils.formObj(dataObject.getValue(LogmnrPartobj$Po.COLUMNS.DEFTINIEXTS.name()))); 
			logmnrPartobj$Po.setDefextsize(BigDecimalUtils.formObj(dataObject.getValue(LogmnrPartobj$Po.COLUMNS.DEFEXTSIZE.name()))); 
			logmnrPartobj$Po.setDefminexts(BigDecimalUtils.formObj(dataObject.getValue(LogmnrPartobj$Po.COLUMNS.DEFMINEXTS.name()))); 
			logmnrPartobj$Po.setDefmaxexts(BigDecimalUtils.formObj(dataObject.getValue(LogmnrPartobj$Po.COLUMNS.DEFMAXEXTS.name()))); 
			logmnrPartobj$Po.setDefextpct(BigDecimalUtils.formObj(dataObject.getValue(LogmnrPartobj$Po.COLUMNS.DEFEXTPCT.name()))); 
			logmnrPartobj$Po.setDeflists(BigDecimalUtils.formObj(dataObject.getValue(LogmnrPartobj$Po.COLUMNS.DEFLISTS.name()))); 
			logmnrPartobj$Po.setDefgroups(BigDecimalUtils.formObj(dataObject.getValue(LogmnrPartobj$Po.COLUMNS.DEFGROUPS.name()))); 
			logmnrPartobj$Po.setDeflogging(BigDecimalUtils.formObj(dataObject.getValue(LogmnrPartobj$Po.COLUMNS.DEFLOGGING.name()))); 
			logmnrPartobj$Po.setSpare1(BigDecimalUtils.formObj(dataObject.getValue(LogmnrPartobj$Po.COLUMNS.SPARE1.name()))); 
			logmnrPartobj$Po.setSpare2(BigDecimalUtils.formObj(dataObject.getValue(LogmnrPartobj$Po.COLUMNS.SPARE2.name()))); 
			logmnrPartobj$Po.setSpare3(BigDecimalUtils.formObj(dataObject.getValue(LogmnrPartobj$Po.COLUMNS.SPARE3.name()))); 
			logmnrPartobj$Po.setDefinclcol(BigDecimalUtils.formObj(dataObject.getValue(LogmnrPartobj$Po.COLUMNS.DEFINCLCOL.name()))); 
			logmnrPartobj$Po.setParameters(dataObject.getString(LogmnrPartobj$Po.COLUMNS.PARAMETERS.name())); 
			logmnrPartobj$Po.setObj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrPartobj$Po.COLUMNS.OBJ#.name()))); 
			logmnrPartobj$Po.setLogmnrUid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrPartobj$Po.COLUMNS.LOGMNR_UID.name()))); 
			logmnrPartobj$Po.setLogmnrFlags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrPartobj$Po.COLUMNS.LOGMNR_FLAGS.name()))); 
			return logmnrPartobj$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrPartobj$Po logmnrPartobj$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrPartobj$Po.COLUMNS.PARTTYPE.name(), logmnrPartobj$Po.getParttype()); 
			dataObject.setValue(LogmnrPartobj$Po.COLUMNS.PARTCNT.name(), logmnrPartobj$Po.getPartcnt()); 
			dataObject.setValue(LogmnrPartobj$Po.COLUMNS.PARTKEYCOLS.name(), logmnrPartobj$Po.getPartkeycols()); 
			dataObject.setValue(LogmnrPartobj$Po.COLUMNS.FLAGS.name(), logmnrPartobj$Po.getFlags()); 
			dataObject.setValue(LogmnrPartobj$Po.COLUMNS.DEFTS#.name(), logmnrPartobj$Po.getDefts#()); 
			dataObject.setValue(LogmnrPartobj$Po.COLUMNS.DEFPCTFREE.name(), logmnrPartobj$Po.getDefpctfree()); 
			dataObject.setValue(LogmnrPartobj$Po.COLUMNS.DEFPCTUSED.name(), logmnrPartobj$Po.getDefpctused()); 
			dataObject.setValue(LogmnrPartobj$Po.COLUMNS.DEFPCTTHRES.name(), logmnrPartobj$Po.getDefpctthres()); 
			dataObject.setValue(LogmnrPartobj$Po.COLUMNS.DEFINITRANS.name(), logmnrPartobj$Po.getDefinitrans()); 
			dataObject.setValue(LogmnrPartobj$Po.COLUMNS.DEFMAXTRANS.name(), logmnrPartobj$Po.getDefmaxtrans()); 
			dataObject.setValue(LogmnrPartobj$Po.COLUMNS.DEFTINIEXTS.name(), logmnrPartobj$Po.getDeftiniexts()); 
			dataObject.setValue(LogmnrPartobj$Po.COLUMNS.DEFEXTSIZE.name(), logmnrPartobj$Po.getDefextsize()); 
			dataObject.setValue(LogmnrPartobj$Po.COLUMNS.DEFMINEXTS.name(), logmnrPartobj$Po.getDefminexts()); 
			dataObject.setValue(LogmnrPartobj$Po.COLUMNS.DEFMAXEXTS.name(), logmnrPartobj$Po.getDefmaxexts()); 
			dataObject.setValue(LogmnrPartobj$Po.COLUMNS.DEFEXTPCT.name(), logmnrPartobj$Po.getDefextpct()); 
			dataObject.setValue(LogmnrPartobj$Po.COLUMNS.DEFLISTS.name(), logmnrPartobj$Po.getDeflists()); 
			dataObject.setValue(LogmnrPartobj$Po.COLUMNS.DEFGROUPS.name(), logmnrPartobj$Po.getDefgroups()); 
			dataObject.setValue(LogmnrPartobj$Po.COLUMNS.DEFLOGGING.name(), logmnrPartobj$Po.getDeflogging()); 
			dataObject.setValue(LogmnrPartobj$Po.COLUMNS.SPARE1.name(), logmnrPartobj$Po.getSpare1()); 
			dataObject.setValue(LogmnrPartobj$Po.COLUMNS.SPARE2.name(), logmnrPartobj$Po.getSpare2()); 
			dataObject.setValue(LogmnrPartobj$Po.COLUMNS.SPARE3.name(), logmnrPartobj$Po.getSpare3()); 
			dataObject.setValue(LogmnrPartobj$Po.COLUMNS.DEFINCLCOL.name(), logmnrPartobj$Po.getDefinclcol()); 
			dataObject.setValue(LogmnrPartobj$Po.COLUMNS.PARAMETERS.name(), logmnrPartobj$Po.getParameters()); 
			dataObject.setValue(LogmnrPartobj$Po.COLUMNS.OBJ#.name(), logmnrPartobj$Po.getObj#()); 
			dataObject.setValue(LogmnrPartobj$Po.COLUMNS.LOGMNR_UID.name(), logmnrPartobj$Po.getLogmnrUid()); 
			dataObject.setValue(LogmnrPartobj$Po.COLUMNS.LOGMNR_FLAGS.name(), logmnrPartobj$Po.getLogmnrFlags()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrPartobj$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrPartobj$Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrPartobj$Po.COLUMNS.OBJ#.name(), po.getObj#()); 
		sqlWhere.add(LogmnrPartobj$Po.COLUMNS.LOGMNR_UID.name(), po.getLogmnrUid()); 
		return sqlWhere; 
	} 
 
} 
