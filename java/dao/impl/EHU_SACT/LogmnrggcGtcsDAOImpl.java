package com.doc.common.dao.impl; 
 
public class LogmnrggcGtcsDAOImpl extends GeneralDAOImpl<LogmnrggcGtcsPo> implements ILogmnrggcGtcsDAO { 
	public static final LogmnrggcGtcsDAOImpl INSTANCE = new LogmnrggcGtcsDAOImpl(); 
	public static final String TABLENAME = "LOGMNRGGC_GTCS"; 

	public LogmnrggcGtcsDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrggcGtcsPo> CONVERTER = new MapConverter<LogmnrggcGtcsPo>() { 
 
		@Override 
		public LogmnrggcGtcsPo convert(final DataObject dataObject) { 
			final LogmnrggcGtcsPo logmnrggcGtcsPo = new LogmnrggcGtcsPo(); 
			logmnrggcGtcsPo.setLogmnrUid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtcsPo.COLUMNS.LOGMNR_UID.name()))); 
			logmnrggcGtcsPo.setObj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtcsPo.COLUMNS.OBJ#.name()))); 
			logmnrggcGtcsPo.setObjv#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtcsPo.COLUMNS.OBJV#.name()))); 
			logmnrggcGtcsPo.setSegcol#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtcsPo.COLUMNS.SEGCOL#.name()))); 
			logmnrggcGtcsPo.setIntcol#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtcsPo.COLUMNS.INTCOL#.name()))); 
			logmnrggcGtcsPo.setColname(dataObject.getString(LogmnrggcGtcsPo.COLUMNS.COLNAME.name())); 
			logmnrggcGtcsPo.setType#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtcsPo.COLUMNS.TYPE#.name()))); 
			logmnrggcGtcsPo.setLength(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtcsPo.COLUMNS.LENGTH.name()))); 
			logmnrggcGtcsPo.setPrecision(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtcsPo.COLUMNS.PRECISION.name()))); 
			logmnrggcGtcsPo.setScale(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtcsPo.COLUMNS.SCALE.name()))); 
			logmnrggcGtcsPo.setIntervalLeadingPrecision(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtcsPo.COLUMNS.INTERVAL_LEADING_PRECISION.name()))); 
			logmnrggcGtcsPo.setIntervalTrailingPrecision(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtcsPo.COLUMNS.INTERVAL_TRAILING_PRECISION.name()))); 
			logmnrggcGtcsPo.setProperty(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtcsPo.COLUMNS.PROPERTY.name()))); 
			logmnrggcGtcsPo.setToid(); 
			logmnrggcGtcsPo.setCharsetid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtcsPo.COLUMNS.CHARSETID.name()))); 
			logmnrggcGtcsPo.setCharsetform(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtcsPo.COLUMNS.CHARSETFORM.name()))); 
			logmnrggcGtcsPo.setTypename(dataObject.getString(LogmnrggcGtcsPo.COLUMNS.TYPENAME.name())); 
			logmnrggcGtcsPo.setFqcolname(dataObject.getString(LogmnrggcGtcsPo.COLUMNS.FQCOLNAME.name())); 
			logmnrggcGtcsPo.setNumintcols(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtcsPo.COLUMNS.NUMINTCOLS.name()))); 
			logmnrggcGtcsPo.setNumattrs(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtcsPo.COLUMNS.NUMATTRS.name()))); 
			logmnrggcGtcsPo.setAdtorder(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtcsPo.COLUMNS.ADTORDER.name()))); 
			logmnrggcGtcsPo.setLogmnrSpare1(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtcsPo.COLUMNS.LOGMNR_SPARE1.name()))); 
			logmnrggcGtcsPo.setLogmnrSpare2(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtcsPo.COLUMNS.LOGMNR_SPARE2.name()))); 
			logmnrggcGtcsPo.setLogmnrSpare3(dataObject.getString(LogmnrggcGtcsPo.COLUMNS.LOGMNR_SPARE3.name())); 
			logmnrggcGtcsPo.setLogmnrSpare4(TimestampUtils.of(dataObject.getValue(LogmnrggcGtcsPo.COLUMNS.LOGMNR_SPARE4.name()))); 
			logmnrggcGtcsPo.setLogmnrSpare5(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtcsPo.COLUMNS.LOGMNR_SPARE5.name()))); 
			logmnrggcGtcsPo.setLogmnrSpare6(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtcsPo.COLUMNS.LOGMNR_SPARE6.name()))); 
			logmnrggcGtcsPo.setLogmnrSpare7(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtcsPo.COLUMNS.LOGMNR_SPARE7.name()))); 
			logmnrggcGtcsPo.setLogmnrSpare8(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtcsPo.COLUMNS.LOGMNR_SPARE8.name()))); 
			logmnrggcGtcsPo.setLogmnrSpare9(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtcsPo.COLUMNS.LOGMNR_SPARE9.name()))); 
			logmnrggcGtcsPo.setCol#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtcsPo.COLUMNS.COL#.name()))); 
			logmnrggcGtcsPo.setXtypeschemaname(dataObject.getString(LogmnrggcGtcsPo.COLUMNS.XTYPESCHEMANAME.name())); 
			logmnrggcGtcsPo.setXtypename(dataObject.getString(LogmnrggcGtcsPo.COLUMNS.XTYPENAME.name())); 
			logmnrggcGtcsPo.setXfqcolname(dataObject.getString(LogmnrggcGtcsPo.COLUMNS.XFQCOLNAME.name())); 
			logmnrggcGtcsPo.setXtopintcol(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtcsPo.COLUMNS.XTOPINTCOL.name()))); 
			logmnrggcGtcsPo.setXreffedtableobjn(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtcsPo.COLUMNS.XREFFEDTABLEOBJN.name()))); 
			logmnrggcGtcsPo.setXreffedtableobjv(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtcsPo.COLUMNS.XREFFEDTABLEOBJV.name()))); 
			logmnrggcGtcsPo.setXcoltypeflags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtcsPo.COLUMNS.XCOLTYPEFLAGS.name()))); 
			logmnrggcGtcsPo.setXopqtypetype(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtcsPo.COLUMNS.XOPQTYPETYPE.name()))); 
			logmnrggcGtcsPo.setXopqtypeflags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtcsPo.COLUMNS.XOPQTYPEFLAGS.name()))); 
			logmnrggcGtcsPo.setXopqlobintcol(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtcsPo.COLUMNS.XOPQLOBINTCOL.name()))); 
			logmnrggcGtcsPo.setXopqobjintcol(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtcsPo.COLUMNS.XOPQOBJINTCOL.name()))); 
			logmnrggcGtcsPo.setXxmlintcol(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtcsPo.COLUMNS.XXMLINTCOL.name()))); 
			logmnrggcGtcsPo.setEaowner#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtcsPo.COLUMNS.EAOWNER#.name()))); 
			logmnrggcGtcsPo.setEamkeyid(dataObject.getString(LogmnrggcGtcsPo.COLUMNS.EAMKEYID.name())); 
			logmnrggcGtcsPo.setEaencalg(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtcsPo.COLUMNS.EAENCALG.name()))); 
			logmnrggcGtcsPo.setEaintalg(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtcsPo.COLUMNS.EAINTALG.name()))); 
			logmnrggcGtcsPo.setEacolklc(); 
			logmnrggcGtcsPo.setEaklclen(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtcsPo.COLUMNS.EAKLCLEN.name()))); 
			logmnrggcGtcsPo.setEaflags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrggcGtcsPo.COLUMNS.EAFLAGS.name()))); 
			return logmnrggcGtcsPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrggcGtcsPo logmnrggcGtcsPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.LOGMNR_UID.name(), logmnrggcGtcsPo.getLogmnrUid()); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.OBJ#.name(), logmnrggcGtcsPo.getObj#()); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.OBJV#.name(), logmnrggcGtcsPo.getObjv#()); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.SEGCOL#.name(), logmnrggcGtcsPo.getSegcol#()); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.INTCOL#.name(), logmnrggcGtcsPo.getIntcol#()); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.COLNAME.name(), logmnrggcGtcsPo.getColname()); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.TYPE#.name(), logmnrggcGtcsPo.getType#()); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.LENGTH.name(), logmnrggcGtcsPo.getLength()); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.PRECISION.name(), logmnrggcGtcsPo.getPrecision()); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.SCALE.name(), logmnrggcGtcsPo.getScale()); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.INTERVAL_LEADING_PRECISION.name(), logmnrggcGtcsPo.getIntervalLeadingPrecision()); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.INTERVAL_TRAILING_PRECISION.name(), logmnrggcGtcsPo.getIntervalTrailingPrecision()); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.PROPERTY.name(), logmnrggcGtcsPo.getProperty()); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.TOID.name(), logmnrggcGtcsPo.getToid()); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.CHARSETID.name(), logmnrggcGtcsPo.getCharsetid()); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.CHARSETFORM.name(), logmnrggcGtcsPo.getCharsetform()); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.TYPENAME.name(), logmnrggcGtcsPo.getTypename()); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.FQCOLNAME.name(), logmnrggcGtcsPo.getFqcolname()); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.NUMINTCOLS.name(), logmnrggcGtcsPo.getNumintcols()); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.NUMATTRS.name(), logmnrggcGtcsPo.getNumattrs()); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.ADTORDER.name(), logmnrggcGtcsPo.getAdtorder()); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.LOGMNR_SPARE1.name(), logmnrggcGtcsPo.getLogmnrSpare1()); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.LOGMNR_SPARE2.name(), logmnrggcGtcsPo.getLogmnrSpare2()); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.LOGMNR_SPARE3.name(), logmnrggcGtcsPo.getLogmnrSpare3()); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.LOGMNR_SPARE4.name(), logmnrggcGtcsPo.getLogmnrSpare4()); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.LOGMNR_SPARE5.name(), logmnrggcGtcsPo.getLogmnrSpare5()); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.LOGMNR_SPARE6.name(), logmnrggcGtcsPo.getLogmnrSpare6()); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.LOGMNR_SPARE7.name(), logmnrggcGtcsPo.getLogmnrSpare7()); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.LOGMNR_SPARE8.name(), logmnrggcGtcsPo.getLogmnrSpare8()); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.LOGMNR_SPARE9.name(), logmnrggcGtcsPo.getLogmnrSpare9()); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.COL#.name(), logmnrggcGtcsPo.getCol#()); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.XTYPESCHEMANAME.name(), logmnrggcGtcsPo.getXtypeschemaname()); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.XTYPENAME.name(), logmnrggcGtcsPo.getXtypename()); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.XFQCOLNAME.name(), logmnrggcGtcsPo.getXfqcolname()); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.XTOPINTCOL.name(), logmnrggcGtcsPo.getXtopintcol()); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.XREFFEDTABLEOBJN.name(), logmnrggcGtcsPo.getXreffedtableobjn()); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.XREFFEDTABLEOBJV.name(), logmnrggcGtcsPo.getXreffedtableobjv()); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.XCOLTYPEFLAGS.name(), logmnrggcGtcsPo.getXcoltypeflags()); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.XOPQTYPETYPE.name(), logmnrggcGtcsPo.getXopqtypetype()); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.XOPQTYPEFLAGS.name(), logmnrggcGtcsPo.getXopqtypeflags()); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.XOPQLOBINTCOL.name(), logmnrggcGtcsPo.getXopqlobintcol()); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.XOPQOBJINTCOL.name(), logmnrggcGtcsPo.getXopqobjintcol()); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.XXMLINTCOL.name(), logmnrggcGtcsPo.getXxmlintcol()); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.EAOWNER#.name(), logmnrggcGtcsPo.getEaowner#()); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.EAMKEYID.name(), logmnrggcGtcsPo.getEamkeyid()); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.EAENCALG.name(), logmnrggcGtcsPo.getEaencalg()); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.EAINTALG.name(), logmnrggcGtcsPo.getEaintalg()); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.EACOLKLC.name(), logmnrggcGtcsPo.getEacolklc()); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.EAKLCLEN.name(), logmnrggcGtcsPo.getEaklclen()); 
			dataObject.setValue(LogmnrggcGtcsPo.COLUMNS.EAFLAGS.name(), logmnrggcGtcsPo.getEaflags()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrggcGtcsPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrggcGtcsPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrggcGtcsPo.COLUMNS.LOGMNR_UID.name(), po.getLogmnrUid()); 
		sqlWhere.add(LogmnrggcGtcsPo.COLUMNS.OBJ#.name(), po.getObj#()); 
		sqlWhere.add(LogmnrggcGtcsPo.COLUMNS.OBJV#.name(), po.getObjv#()); 
		sqlWhere.add(LogmnrggcGtcsPo.COLUMNS.INTCOL#.name(), po.getIntcol#()); 
		return sqlWhere; 
	} 
 
} 
