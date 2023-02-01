package com.doc.common.dao.impl; 
 
public class LogmnrggcGtloDAOImpl extends GeneralDAOImpl<LogmnrggcGtloPo> implements ILogmnrggcGtloDAO { 
	public static final LogmnrggcGtloDAOImpl INSTANCE = new LogmnrggcGtloDAOImpl(); 
	public static final String TABLENAME = "LOGMNRGGC_GTLO"; 

	public LogmnrggcGtloDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrggcGtloPo> CONVERTER = new MapConverter<LogmnrggcGtloPo>() { 
 
		@Override 
		public LogmnrggcGtloPo convert(final DataObject dataObject) { 
			final LogmnrggcGtloPo logmnrggcGtloPo = new LogmnrggcGtloPo(); 
			logmnrggcGtloPo.setLogmnrUid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtloPo.COLUMNS.LOGMNR_UID.name()))); 
			logmnrggcGtloPo.setKeyobj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtloPo.COLUMNS.KEYOBJ#.name()))); 
			logmnrggcGtloPo.setLvlcnt(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtloPo.COLUMNS.LVLCNT.name()))); 
			logmnrggcGtloPo.setBaseobj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtloPo.COLUMNS.BASEOBJ#.name()))); 
			logmnrggcGtloPo.setBaseobjv#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtloPo.COLUMNS.BASEOBJV#.name()))); 
			logmnrggcGtloPo.setLvl1obj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtloPo.COLUMNS.LVL1OBJ#.name()))); 
			logmnrggcGtloPo.setLvl2obj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtloPo.COLUMNS.LVL2OBJ#.name()))); 
			logmnrggcGtloPo.setLvl0type#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtloPo.COLUMNS.LVL0TYPE#.name()))); 
			logmnrggcGtloPo.setLvl1type#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtloPo.COLUMNS.LVL1TYPE#.name()))); 
			logmnrggcGtloPo.setLvl2type#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtloPo.COLUMNS.LVL2TYPE#.name()))); 
			logmnrggcGtloPo.setOwner#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtloPo.COLUMNS.OWNER#.name()))); 
			logmnrggcGtloPo.setOwnername(dataObject.getString(LogmnrggcGtloPo.COLUMNS.OWNERNAME.name())); 
			logmnrggcGtloPo.setLvl0name(dataObject.getString(LogmnrggcGtloPo.COLUMNS.LVL0NAME.name())); 
			logmnrggcGtloPo.setLvl1name(dataObject.getString(LogmnrggcGtloPo.COLUMNS.LVL1NAME.name())); 
			logmnrggcGtloPo.setLvl2name(dataObject.getString(LogmnrggcGtloPo.COLUMNS.LVL2NAME.name())); 
			logmnrggcGtloPo.setIntcols(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtloPo.COLUMNS.INTCOLS.name()))); 
			logmnrggcGtloPo.setCols(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtloPo.COLUMNS.COLS.name()))); 
			logmnrggcGtloPo.setKernelcols(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtloPo.COLUMNS.KERNELCOLS.name()))); 
			logmnrggcGtloPo.setTabFlags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtloPo.COLUMNS.TAB_FLAGS.name()))); 
			logmnrggcGtloPo.setTrigflag(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtloPo.COLUMNS.TRIGFLAG.name()))); 
			logmnrggcGtloPo.setAssoc#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtloPo.COLUMNS.ASSOC#.name()))); 
			logmnrggcGtloPo.setObjFlags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtloPo.COLUMNS.OBJ_FLAGS.name()))); 
			logmnrggcGtloPo.setTs#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtloPo.COLUMNS.TS#.name()))); 
			logmnrggcGtloPo.setTsname(dataObject.getString(LogmnrggcGtloPo.COLUMNS.TSNAME.name())); 
			logmnrggcGtloPo.setProperty(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtloPo.COLUMNS.PROPERTY.name()))); 
			logmnrggcGtloPo.setStartScn(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtloPo.COLUMNS.START_SCN.name()))); 
			logmnrggcGtloPo.setDropScn(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtloPo.COLUMNS.DROP_SCN.name()))); 
			logmnrggcGtloPo.setXidusn(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtloPo.COLUMNS.XIDUSN.name()))); 
			logmnrggcGtloPo.setXidslt(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtloPo.COLUMNS.XIDSLT.name()))); 
			logmnrggcGtloPo.setXidsqn(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtloPo.COLUMNS.XIDSQN.name()))); 
			logmnrggcGtloPo.setFlags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtloPo.COLUMNS.FLAGS.name()))); 
			logmnrggcGtloPo.setLogmnrSpare1(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtloPo.COLUMNS.LOGMNR_SPARE1.name()))); 
			logmnrggcGtloPo.setLogmnrSpare2(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtloPo.COLUMNS.LOGMNR_SPARE2.name()))); 
			logmnrggcGtloPo.setLogmnrSpare3(dataObject.getString(LogmnrggcGtloPo.COLUMNS.LOGMNR_SPARE3.name())); 
			logmnrggcGtloPo.setLogmnrSpare4(TimestampUtils.of(dataObject.getValue(LogmnrggcGtloPo.COLUMNS.LOGMNR_SPARE4.name()))); 
			logmnrggcGtloPo.setLogmnrSpare5(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtloPo.COLUMNS.LOGMNR_SPARE5.name()))); 
			logmnrggcGtloPo.setLogmnrSpare6(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtloPo.COLUMNS.LOGMNR_SPARE6.name()))); 
			logmnrggcGtloPo.setLogmnrSpare7(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtloPo.COLUMNS.LOGMNR_SPARE7.name()))); 
			logmnrggcGtloPo.setLogmnrSpare8(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtloPo.COLUMNS.LOGMNR_SPARE8.name()))); 
			logmnrggcGtloPo.setLogmnrSpare9(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtloPo.COLUMNS.LOGMNR_SPARE9.name()))); 
			logmnrggcGtloPo.setParttype(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtloPo.COLUMNS.PARTTYPE.name()))); 
			logmnrggcGtloPo.setSubparttype(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtloPo.COLUMNS.SUBPARTTYPE.name()))); 
			logmnrggcGtloPo.setUnsupportedcols(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtloPo.COLUMNS.UNSUPPORTEDCOLS.name()))); 
			logmnrggcGtloPo.setComplextypecols(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtloPo.COLUMNS.COMPLEXTYPECOLS.name()))); 
			logmnrggcGtloPo.setNtparentobjnum(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtloPo.COLUMNS.NTPARENTOBJNUM.name()))); 
			logmnrggcGtloPo.setNtparentobjversion(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtloPo.COLUMNS.NTPARENTOBJVERSION.name()))); 
			logmnrggcGtloPo.setNtparentintcolnum(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtloPo.COLUMNS.NTPARENTINTCOLNUM.name()))); 
			logmnrggcGtloPo.setLogmnrtloflags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtloPo.COLUMNS.LOGMNRTLOFLAGS.name()))); 
			logmnrggcGtloPo.setLogmnrmcv(dataObject.getString(LogmnrggcGtloPo.COLUMNS.LOGMNRMCV.name())); 
			return logmnrggcGtloPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrggcGtloPo logmnrggcGtloPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrggcGtloPo.COLUMNS.LOGMNR_UID.name(), logmnrggcGtloPo.getLogmnrUid()); 
			dataObject.setValue(LogmnrggcGtloPo.COLUMNS.KEYOBJ#.name(), logmnrggcGtloPo.getKeyobj#()); 
			dataObject.setValue(LogmnrggcGtloPo.COLUMNS.LVLCNT.name(), logmnrggcGtloPo.getLvlcnt()); 
			dataObject.setValue(LogmnrggcGtloPo.COLUMNS.BASEOBJ#.name(), logmnrggcGtloPo.getBaseobj#()); 
			dataObject.setValue(LogmnrggcGtloPo.COLUMNS.BASEOBJV#.name(), logmnrggcGtloPo.getBaseobjv#()); 
			dataObject.setValue(LogmnrggcGtloPo.COLUMNS.LVL1OBJ#.name(), logmnrggcGtloPo.getLvl1obj#()); 
			dataObject.setValue(LogmnrggcGtloPo.COLUMNS.LVL2OBJ#.name(), logmnrggcGtloPo.getLvl2obj#()); 
			dataObject.setValue(LogmnrggcGtloPo.COLUMNS.LVL0TYPE#.name(), logmnrggcGtloPo.getLvl0type#()); 
			dataObject.setValue(LogmnrggcGtloPo.COLUMNS.LVL1TYPE#.name(), logmnrggcGtloPo.getLvl1type#()); 
			dataObject.setValue(LogmnrggcGtloPo.COLUMNS.LVL2TYPE#.name(), logmnrggcGtloPo.getLvl2type#()); 
			dataObject.setValue(LogmnrggcGtloPo.COLUMNS.OWNER#.name(), logmnrggcGtloPo.getOwner#()); 
			dataObject.setValue(LogmnrggcGtloPo.COLUMNS.OWNERNAME.name(), logmnrggcGtloPo.getOwnername()); 
			dataObject.setValue(LogmnrggcGtloPo.COLUMNS.LVL0NAME.name(), logmnrggcGtloPo.getLvl0name()); 
			dataObject.setValue(LogmnrggcGtloPo.COLUMNS.LVL1NAME.name(), logmnrggcGtloPo.getLvl1name()); 
			dataObject.setValue(LogmnrggcGtloPo.COLUMNS.LVL2NAME.name(), logmnrggcGtloPo.getLvl2name()); 
			dataObject.setValue(LogmnrggcGtloPo.COLUMNS.INTCOLS.name(), logmnrggcGtloPo.getIntcols()); 
			dataObject.setValue(LogmnrggcGtloPo.COLUMNS.COLS.name(), logmnrggcGtloPo.getCols()); 
			dataObject.setValue(LogmnrggcGtloPo.COLUMNS.KERNELCOLS.name(), logmnrggcGtloPo.getKernelcols()); 
			dataObject.setValue(LogmnrggcGtloPo.COLUMNS.TAB_FLAGS.name(), logmnrggcGtloPo.getTabFlags()); 
			dataObject.setValue(LogmnrggcGtloPo.COLUMNS.TRIGFLAG.name(), logmnrggcGtloPo.getTrigflag()); 
			dataObject.setValue(LogmnrggcGtloPo.COLUMNS.ASSOC#.name(), logmnrggcGtloPo.getAssoc#()); 
			dataObject.setValue(LogmnrggcGtloPo.COLUMNS.OBJ_FLAGS.name(), logmnrggcGtloPo.getObjFlags()); 
			dataObject.setValue(LogmnrggcGtloPo.COLUMNS.TS#.name(), logmnrggcGtloPo.getTs#()); 
			dataObject.setValue(LogmnrggcGtloPo.COLUMNS.TSNAME.name(), logmnrggcGtloPo.getTsname()); 
			dataObject.setValue(LogmnrggcGtloPo.COLUMNS.PROPERTY.name(), logmnrggcGtloPo.getProperty()); 
			dataObject.setValue(LogmnrggcGtloPo.COLUMNS.START_SCN.name(), logmnrggcGtloPo.getStartScn()); 
			dataObject.setValue(LogmnrggcGtloPo.COLUMNS.DROP_SCN.name(), logmnrggcGtloPo.getDropScn()); 
			dataObject.setValue(LogmnrggcGtloPo.COLUMNS.XIDUSN.name(), logmnrggcGtloPo.getXidusn()); 
			dataObject.setValue(LogmnrggcGtloPo.COLUMNS.XIDSLT.name(), logmnrggcGtloPo.getXidslt()); 
			dataObject.setValue(LogmnrggcGtloPo.COLUMNS.XIDSQN.name(), logmnrggcGtloPo.getXidsqn()); 
			dataObject.setValue(LogmnrggcGtloPo.COLUMNS.FLAGS.name(), logmnrggcGtloPo.getFlags()); 
			dataObject.setValue(LogmnrggcGtloPo.COLUMNS.LOGMNR_SPARE1.name(), logmnrggcGtloPo.getLogmnrSpare1()); 
			dataObject.setValue(LogmnrggcGtloPo.COLUMNS.LOGMNR_SPARE2.name(), logmnrggcGtloPo.getLogmnrSpare2()); 
			dataObject.setValue(LogmnrggcGtloPo.COLUMNS.LOGMNR_SPARE3.name(), logmnrggcGtloPo.getLogmnrSpare3()); 
			dataObject.setValue(LogmnrggcGtloPo.COLUMNS.LOGMNR_SPARE4.name(), logmnrggcGtloPo.getLogmnrSpare4()); 
			dataObject.setValue(LogmnrggcGtloPo.COLUMNS.LOGMNR_SPARE5.name(), logmnrggcGtloPo.getLogmnrSpare5()); 
			dataObject.setValue(LogmnrggcGtloPo.COLUMNS.LOGMNR_SPARE6.name(), logmnrggcGtloPo.getLogmnrSpare6()); 
			dataObject.setValue(LogmnrggcGtloPo.COLUMNS.LOGMNR_SPARE7.name(), logmnrggcGtloPo.getLogmnrSpare7()); 
			dataObject.setValue(LogmnrggcGtloPo.COLUMNS.LOGMNR_SPARE8.name(), logmnrggcGtloPo.getLogmnrSpare8()); 
			dataObject.setValue(LogmnrggcGtloPo.COLUMNS.LOGMNR_SPARE9.name(), logmnrggcGtloPo.getLogmnrSpare9()); 
			dataObject.setValue(LogmnrggcGtloPo.COLUMNS.PARTTYPE.name(), logmnrggcGtloPo.getParttype()); 
			dataObject.setValue(LogmnrggcGtloPo.COLUMNS.SUBPARTTYPE.name(), logmnrggcGtloPo.getSubparttype()); 
			dataObject.setValue(LogmnrggcGtloPo.COLUMNS.UNSUPPORTEDCOLS.name(), logmnrggcGtloPo.getUnsupportedcols()); 
			dataObject.setValue(LogmnrggcGtloPo.COLUMNS.COMPLEXTYPECOLS.name(), logmnrggcGtloPo.getComplextypecols()); 
			dataObject.setValue(LogmnrggcGtloPo.COLUMNS.NTPARENTOBJNUM.name(), logmnrggcGtloPo.getNtparentobjnum()); 
			dataObject.setValue(LogmnrggcGtloPo.COLUMNS.NTPARENTOBJVERSION.name(), logmnrggcGtloPo.getNtparentobjversion()); 
			dataObject.setValue(LogmnrggcGtloPo.COLUMNS.NTPARENTINTCOLNUM.name(), logmnrggcGtloPo.getNtparentintcolnum()); 
			dataObject.setValue(LogmnrggcGtloPo.COLUMNS.LOGMNRTLOFLAGS.name(), logmnrggcGtloPo.getLogmnrtloflags()); 
			dataObject.setValue(LogmnrggcGtloPo.COLUMNS.LOGMNRMCV.name(), logmnrggcGtloPo.getLogmnrmcv()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrggcGtloPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrggcGtloPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrggcGtloPo.COLUMNS.LOGMNR_UID.name(), po.getLogmnrUid()); 
		sqlWhere.add(LogmnrggcGtloPo.COLUMNS.KEYOBJ#.name(), po.getKeyobj#()); 
		sqlWhere.add(LogmnrggcGtloPo.COLUMNS.BASEOBJV#.name(), po.getBaseobjv#()); 
		return sqlWhere; 
	} 
 
} 
