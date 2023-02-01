package com.doc.common.dao.impl; 
 
public class LogmnrcGtloDAOImpl extends GeneralDAOImpl<LogmnrcGtloPo> implements ILogmnrcGtloDAO { 
	public static final LogmnrcGtloDAOImpl INSTANCE = new LogmnrcGtloDAOImpl(); 
	public static final String TABLENAME = "LOGMNRC_GTLO"; 

	public LogmnrcGtloDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrcGtloPo> CONVERTER = new MapConverter<LogmnrcGtloPo>() { 
 
		@Override 
		public LogmnrcGtloPo convert(final DataObject dataObject) { 
			final LogmnrcGtloPo logmnrcGtloPo = new LogmnrcGtloPo(); 
			logmnrcGtloPo.setLogmnrUid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtloPo.COLUMNS.LOGMNR_UID.name()))); 
			logmnrcGtloPo.setKeyobj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtloPo.COLUMNS.KEYOBJ#.name()))); 
			logmnrcGtloPo.setLvlcnt(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtloPo.COLUMNS.LVLCNT.name()))); 
			logmnrcGtloPo.setBaseobj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtloPo.COLUMNS.BASEOBJ#.name()))); 
			logmnrcGtloPo.setBaseobjv#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtloPo.COLUMNS.BASEOBJV#.name()))); 
			logmnrcGtloPo.setLvl1obj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtloPo.COLUMNS.LVL1OBJ#.name()))); 
			logmnrcGtloPo.setLvl2obj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtloPo.COLUMNS.LVL2OBJ#.name()))); 
			logmnrcGtloPo.setLvl0type#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtloPo.COLUMNS.LVL0TYPE#.name()))); 
			logmnrcGtloPo.setLvl1type#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtloPo.COLUMNS.LVL1TYPE#.name()))); 
			logmnrcGtloPo.setLvl2type#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtloPo.COLUMNS.LVL2TYPE#.name()))); 
			logmnrcGtloPo.setOwner#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtloPo.COLUMNS.OWNER#.name()))); 
			logmnrcGtloPo.setOwnername(dataObject.getString(LogmnrcGtloPo.COLUMNS.OWNERNAME.name())); 
			logmnrcGtloPo.setLvl0name(dataObject.getString(LogmnrcGtloPo.COLUMNS.LVL0NAME.name())); 
			logmnrcGtloPo.setLvl1name(dataObject.getString(LogmnrcGtloPo.COLUMNS.LVL1NAME.name())); 
			logmnrcGtloPo.setLvl2name(dataObject.getString(LogmnrcGtloPo.COLUMNS.LVL2NAME.name())); 
			logmnrcGtloPo.setIntcols(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtloPo.COLUMNS.INTCOLS.name()))); 
			logmnrcGtloPo.setCols(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtloPo.COLUMNS.COLS.name()))); 
			logmnrcGtloPo.setKernelcols(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtloPo.COLUMNS.KERNELCOLS.name()))); 
			logmnrcGtloPo.setTabFlags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtloPo.COLUMNS.TAB_FLAGS.name()))); 
			logmnrcGtloPo.setTrigflag(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtloPo.COLUMNS.TRIGFLAG.name()))); 
			logmnrcGtloPo.setAssoc#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtloPo.COLUMNS.ASSOC#.name()))); 
			logmnrcGtloPo.setObjFlags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtloPo.COLUMNS.OBJ_FLAGS.name()))); 
			logmnrcGtloPo.setTs#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtloPo.COLUMNS.TS#.name()))); 
			logmnrcGtloPo.setTsname(dataObject.getString(LogmnrcGtloPo.COLUMNS.TSNAME.name())); 
			logmnrcGtloPo.setProperty(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtloPo.COLUMNS.PROPERTY.name()))); 
			logmnrcGtloPo.setStartScn(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtloPo.COLUMNS.START_SCN.name()))); 
			logmnrcGtloPo.setDropScn(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtloPo.COLUMNS.DROP_SCN.name()))); 
			logmnrcGtloPo.setXidusn(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtloPo.COLUMNS.XIDUSN.name()))); 
			logmnrcGtloPo.setXidslt(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtloPo.COLUMNS.XIDSLT.name()))); 
			logmnrcGtloPo.setXidsqn(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtloPo.COLUMNS.XIDSQN.name()))); 
			logmnrcGtloPo.setFlags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtloPo.COLUMNS.FLAGS.name()))); 
			logmnrcGtloPo.setLogmnrSpare1(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtloPo.COLUMNS.LOGMNR_SPARE1.name()))); 
			logmnrcGtloPo.setLogmnrSpare2(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtloPo.COLUMNS.LOGMNR_SPARE2.name()))); 
			logmnrcGtloPo.setLogmnrSpare3(dataObject.getString(LogmnrcGtloPo.COLUMNS.LOGMNR_SPARE3.name())); 
			logmnrcGtloPo.setLogmnrSpare4(TimestampUtils.of(dataObject.getValue(LogmnrcGtloPo.COLUMNS.LOGMNR_SPARE4.name()))); 
			logmnrcGtloPo.setLogmnrSpare5(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtloPo.COLUMNS.LOGMNR_SPARE5.name()))); 
			logmnrcGtloPo.setLogmnrSpare6(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtloPo.COLUMNS.LOGMNR_SPARE6.name()))); 
			logmnrcGtloPo.setLogmnrSpare7(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtloPo.COLUMNS.LOGMNR_SPARE7.name()))); 
			logmnrcGtloPo.setLogmnrSpare8(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtloPo.COLUMNS.LOGMNR_SPARE8.name()))); 
			logmnrcGtloPo.setLogmnrSpare9(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtloPo.COLUMNS.LOGMNR_SPARE9.name()))); 
			logmnrcGtloPo.setParttype(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtloPo.COLUMNS.PARTTYPE.name()))); 
			logmnrcGtloPo.setSubparttype(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtloPo.COLUMNS.SUBPARTTYPE.name()))); 
			logmnrcGtloPo.setUnsupportedcols(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtloPo.COLUMNS.UNSUPPORTEDCOLS.name()))); 
			logmnrcGtloPo.setComplextypecols(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtloPo.COLUMNS.COMPLEXTYPECOLS.name()))); 
			logmnrcGtloPo.setNtparentobjnum(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtloPo.COLUMNS.NTPARENTOBJNUM.name()))); 
			logmnrcGtloPo.setNtparentobjversion(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtloPo.COLUMNS.NTPARENTOBJVERSION.name()))); 
			logmnrcGtloPo.setNtparentintcolnum(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtloPo.COLUMNS.NTPARENTINTCOLNUM.name()))); 
			logmnrcGtloPo.setLogmnrtloflags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtloPo.COLUMNS.LOGMNRTLOFLAGS.name()))); 
			logmnrcGtloPo.setLogmnrmcv(dataObject.getString(LogmnrcGtloPo.COLUMNS.LOGMNRMCV.name())); 
			return logmnrcGtloPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrcGtloPo logmnrcGtloPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrcGtloPo.COLUMNS.LOGMNR_UID.name(), logmnrcGtloPo.getLogmnrUid()); 
			dataObject.setValue(LogmnrcGtloPo.COLUMNS.KEYOBJ#.name(), logmnrcGtloPo.getKeyobj#()); 
			dataObject.setValue(LogmnrcGtloPo.COLUMNS.LVLCNT.name(), logmnrcGtloPo.getLvlcnt()); 
			dataObject.setValue(LogmnrcGtloPo.COLUMNS.BASEOBJ#.name(), logmnrcGtloPo.getBaseobj#()); 
			dataObject.setValue(LogmnrcGtloPo.COLUMNS.BASEOBJV#.name(), logmnrcGtloPo.getBaseobjv#()); 
			dataObject.setValue(LogmnrcGtloPo.COLUMNS.LVL1OBJ#.name(), logmnrcGtloPo.getLvl1obj#()); 
			dataObject.setValue(LogmnrcGtloPo.COLUMNS.LVL2OBJ#.name(), logmnrcGtloPo.getLvl2obj#()); 
			dataObject.setValue(LogmnrcGtloPo.COLUMNS.LVL0TYPE#.name(), logmnrcGtloPo.getLvl0type#()); 
			dataObject.setValue(LogmnrcGtloPo.COLUMNS.LVL1TYPE#.name(), logmnrcGtloPo.getLvl1type#()); 
			dataObject.setValue(LogmnrcGtloPo.COLUMNS.LVL2TYPE#.name(), logmnrcGtloPo.getLvl2type#()); 
			dataObject.setValue(LogmnrcGtloPo.COLUMNS.OWNER#.name(), logmnrcGtloPo.getOwner#()); 
			dataObject.setValue(LogmnrcGtloPo.COLUMNS.OWNERNAME.name(), logmnrcGtloPo.getOwnername()); 
			dataObject.setValue(LogmnrcGtloPo.COLUMNS.LVL0NAME.name(), logmnrcGtloPo.getLvl0name()); 
			dataObject.setValue(LogmnrcGtloPo.COLUMNS.LVL1NAME.name(), logmnrcGtloPo.getLvl1name()); 
			dataObject.setValue(LogmnrcGtloPo.COLUMNS.LVL2NAME.name(), logmnrcGtloPo.getLvl2name()); 
			dataObject.setValue(LogmnrcGtloPo.COLUMNS.INTCOLS.name(), logmnrcGtloPo.getIntcols()); 
			dataObject.setValue(LogmnrcGtloPo.COLUMNS.COLS.name(), logmnrcGtloPo.getCols()); 
			dataObject.setValue(LogmnrcGtloPo.COLUMNS.KERNELCOLS.name(), logmnrcGtloPo.getKernelcols()); 
			dataObject.setValue(LogmnrcGtloPo.COLUMNS.TAB_FLAGS.name(), logmnrcGtloPo.getTabFlags()); 
			dataObject.setValue(LogmnrcGtloPo.COLUMNS.TRIGFLAG.name(), logmnrcGtloPo.getTrigflag()); 
			dataObject.setValue(LogmnrcGtloPo.COLUMNS.ASSOC#.name(), logmnrcGtloPo.getAssoc#()); 
			dataObject.setValue(LogmnrcGtloPo.COLUMNS.OBJ_FLAGS.name(), logmnrcGtloPo.getObjFlags()); 
			dataObject.setValue(LogmnrcGtloPo.COLUMNS.TS#.name(), logmnrcGtloPo.getTs#()); 
			dataObject.setValue(LogmnrcGtloPo.COLUMNS.TSNAME.name(), logmnrcGtloPo.getTsname()); 
			dataObject.setValue(LogmnrcGtloPo.COLUMNS.PROPERTY.name(), logmnrcGtloPo.getProperty()); 
			dataObject.setValue(LogmnrcGtloPo.COLUMNS.START_SCN.name(), logmnrcGtloPo.getStartScn()); 
			dataObject.setValue(LogmnrcGtloPo.COLUMNS.DROP_SCN.name(), logmnrcGtloPo.getDropScn()); 
			dataObject.setValue(LogmnrcGtloPo.COLUMNS.XIDUSN.name(), logmnrcGtloPo.getXidusn()); 
			dataObject.setValue(LogmnrcGtloPo.COLUMNS.XIDSLT.name(), logmnrcGtloPo.getXidslt()); 
			dataObject.setValue(LogmnrcGtloPo.COLUMNS.XIDSQN.name(), logmnrcGtloPo.getXidsqn()); 
			dataObject.setValue(LogmnrcGtloPo.COLUMNS.FLAGS.name(), logmnrcGtloPo.getFlags()); 
			dataObject.setValue(LogmnrcGtloPo.COLUMNS.LOGMNR_SPARE1.name(), logmnrcGtloPo.getLogmnrSpare1()); 
			dataObject.setValue(LogmnrcGtloPo.COLUMNS.LOGMNR_SPARE2.name(), logmnrcGtloPo.getLogmnrSpare2()); 
			dataObject.setValue(LogmnrcGtloPo.COLUMNS.LOGMNR_SPARE3.name(), logmnrcGtloPo.getLogmnrSpare3()); 
			dataObject.setValue(LogmnrcGtloPo.COLUMNS.LOGMNR_SPARE4.name(), logmnrcGtloPo.getLogmnrSpare4()); 
			dataObject.setValue(LogmnrcGtloPo.COLUMNS.LOGMNR_SPARE5.name(), logmnrcGtloPo.getLogmnrSpare5()); 
			dataObject.setValue(LogmnrcGtloPo.COLUMNS.LOGMNR_SPARE6.name(), logmnrcGtloPo.getLogmnrSpare6()); 
			dataObject.setValue(LogmnrcGtloPo.COLUMNS.LOGMNR_SPARE7.name(), logmnrcGtloPo.getLogmnrSpare7()); 
			dataObject.setValue(LogmnrcGtloPo.COLUMNS.LOGMNR_SPARE8.name(), logmnrcGtloPo.getLogmnrSpare8()); 
			dataObject.setValue(LogmnrcGtloPo.COLUMNS.LOGMNR_SPARE9.name(), logmnrcGtloPo.getLogmnrSpare9()); 
			dataObject.setValue(LogmnrcGtloPo.COLUMNS.PARTTYPE.name(), logmnrcGtloPo.getParttype()); 
			dataObject.setValue(LogmnrcGtloPo.COLUMNS.SUBPARTTYPE.name(), logmnrcGtloPo.getSubparttype()); 
			dataObject.setValue(LogmnrcGtloPo.COLUMNS.UNSUPPORTEDCOLS.name(), logmnrcGtloPo.getUnsupportedcols()); 
			dataObject.setValue(LogmnrcGtloPo.COLUMNS.COMPLEXTYPECOLS.name(), logmnrcGtloPo.getComplextypecols()); 
			dataObject.setValue(LogmnrcGtloPo.COLUMNS.NTPARENTOBJNUM.name(), logmnrcGtloPo.getNtparentobjnum()); 
			dataObject.setValue(LogmnrcGtloPo.COLUMNS.NTPARENTOBJVERSION.name(), logmnrcGtloPo.getNtparentobjversion()); 
			dataObject.setValue(LogmnrcGtloPo.COLUMNS.NTPARENTINTCOLNUM.name(), logmnrcGtloPo.getNtparentintcolnum()); 
			dataObject.setValue(LogmnrcGtloPo.COLUMNS.LOGMNRTLOFLAGS.name(), logmnrcGtloPo.getLogmnrtloflags()); 
			dataObject.setValue(LogmnrcGtloPo.COLUMNS.LOGMNRMCV.name(), logmnrcGtloPo.getLogmnrmcv()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrcGtloPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrcGtloPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrcGtloPo.COLUMNS.LOGMNR_UID.name(), po.getLogmnrUid()); 
		sqlWhere.add(LogmnrcGtloPo.COLUMNS.KEYOBJ#.name(), po.getKeyobj#()); 
		sqlWhere.add(LogmnrcGtloPo.COLUMNS.BASEOBJV#.name(), po.getBaseobjv#()); 
		return sqlWhere; 
	} 
 
} 
