package com.doc.common.dao.impl; 
 
public class LogmnrcGtcsDAOImpl extends GeneralDAOImpl<LogmnrcGtcsPo> implements ILogmnrcGtcsDAO { 
	public static final LogmnrcGtcsDAOImpl INSTANCE = new LogmnrcGtcsDAOImpl(); 
	public static final String TABLENAME = "LOGMNRC_GTCS"; 

	public LogmnrcGtcsDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrcGtcsPo> CONVERTER = new MapConverter<LogmnrcGtcsPo>() { 
 
		@Override 
		public LogmnrcGtcsPo convert(final DataObject dataObject) { 
			final LogmnrcGtcsPo logmnrcGtcsPo = new LogmnrcGtcsPo(); 
			logmnrcGtcsPo.setLogmnrUid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtcsPo.COLUMNS.LOGMNR_UID.name()))); 
			logmnrcGtcsPo.setObj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtcsPo.COLUMNS.OBJ#.name()))); 
			logmnrcGtcsPo.setObjv#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtcsPo.COLUMNS.OBJV#.name()))); 
			logmnrcGtcsPo.setSegcol#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtcsPo.COLUMNS.SEGCOL#.name()))); 
			logmnrcGtcsPo.setIntcol#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtcsPo.COLUMNS.INTCOL#.name()))); 
			logmnrcGtcsPo.setColname(dataObject.getString(LogmnrcGtcsPo.COLUMNS.COLNAME.name())); 
			logmnrcGtcsPo.setType#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtcsPo.COLUMNS.TYPE#.name()))); 
			logmnrcGtcsPo.setLength(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtcsPo.COLUMNS.LENGTH.name()))); 
			logmnrcGtcsPo.setPrecision(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtcsPo.COLUMNS.PRECISION.name()))); 
			logmnrcGtcsPo.setScale(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtcsPo.COLUMNS.SCALE.name()))); 
			logmnrcGtcsPo.setIntervalLeadingPrecision(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtcsPo.COLUMNS.INTERVAL_LEADING_PRECISION.name()))); 
			logmnrcGtcsPo.setIntervalTrailingPrecision(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtcsPo.COLUMNS.INTERVAL_TRAILING_PRECISION.name()))); 
			logmnrcGtcsPo.setProperty(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtcsPo.COLUMNS.PROPERTY.name()))); 
			logmnrcGtcsPo.setToid(); 
			logmnrcGtcsPo.setCharsetid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtcsPo.COLUMNS.CHARSETID.name()))); 
			logmnrcGtcsPo.setCharsetform(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtcsPo.COLUMNS.CHARSETFORM.name()))); 
			logmnrcGtcsPo.setTypename(dataObject.getString(LogmnrcGtcsPo.COLUMNS.TYPENAME.name())); 
			logmnrcGtcsPo.setFqcolname(dataObject.getString(LogmnrcGtcsPo.COLUMNS.FQCOLNAME.name())); 
			logmnrcGtcsPo.setNumintcols(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtcsPo.COLUMNS.NUMINTCOLS.name()))); 
			logmnrcGtcsPo.setNumattrs(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtcsPo.COLUMNS.NUMATTRS.name()))); 
			logmnrcGtcsPo.setAdtorder(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtcsPo.COLUMNS.ADTORDER.name()))); 
			logmnrcGtcsPo.setLogmnrSpare1(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtcsPo.COLUMNS.LOGMNR_SPARE1.name()))); 
			logmnrcGtcsPo.setLogmnrSpare2(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtcsPo.COLUMNS.LOGMNR_SPARE2.name()))); 
			logmnrcGtcsPo.setLogmnrSpare3(dataObject.getString(LogmnrcGtcsPo.COLUMNS.LOGMNR_SPARE3.name())); 
			logmnrcGtcsPo.setLogmnrSpare4(TimestampUtils.of(dataObject.getValue(LogmnrcGtcsPo.COLUMNS.LOGMNR_SPARE4.name()))); 
			logmnrcGtcsPo.setLogmnrSpare5(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtcsPo.COLUMNS.LOGMNR_SPARE5.name()))); 
			logmnrcGtcsPo.setLogmnrSpare6(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtcsPo.COLUMNS.LOGMNR_SPARE6.name()))); 
			logmnrcGtcsPo.setLogmnrSpare7(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtcsPo.COLUMNS.LOGMNR_SPARE7.name()))); 
			logmnrcGtcsPo.setLogmnrSpare8(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtcsPo.COLUMNS.LOGMNR_SPARE8.name()))); 
			logmnrcGtcsPo.setLogmnrSpare9(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtcsPo.COLUMNS.LOGMNR_SPARE9.name()))); 
			logmnrcGtcsPo.setCol#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtcsPo.COLUMNS.COL#.name()))); 
			logmnrcGtcsPo.setXtypeschemaname(dataObject.getString(LogmnrcGtcsPo.COLUMNS.XTYPESCHEMANAME.name())); 
			logmnrcGtcsPo.setXtypename(dataObject.getString(LogmnrcGtcsPo.COLUMNS.XTYPENAME.name())); 
			logmnrcGtcsPo.setXfqcolname(dataObject.getString(LogmnrcGtcsPo.COLUMNS.XFQCOLNAME.name())); 
			logmnrcGtcsPo.setXtopintcol(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtcsPo.COLUMNS.XTOPINTCOL.name()))); 
			logmnrcGtcsPo.setXreffedtableobjn(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtcsPo.COLUMNS.XREFFEDTABLEOBJN.name()))); 
			logmnrcGtcsPo.setXreffedtableobjv(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtcsPo.COLUMNS.XREFFEDTABLEOBJV.name()))); 
			logmnrcGtcsPo.setXcoltypeflags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtcsPo.COLUMNS.XCOLTYPEFLAGS.name()))); 
			logmnrcGtcsPo.setXopqtypetype(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtcsPo.COLUMNS.XOPQTYPETYPE.name()))); 
			logmnrcGtcsPo.setXopqtypeflags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtcsPo.COLUMNS.XOPQTYPEFLAGS.name()))); 
			logmnrcGtcsPo.setXopqlobintcol(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtcsPo.COLUMNS.XOPQLOBINTCOL.name()))); 
			logmnrcGtcsPo.setXopqobjintcol(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtcsPo.COLUMNS.XOPQOBJINTCOL.name()))); 
			logmnrcGtcsPo.setXxmlintcol(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtcsPo.COLUMNS.XXMLINTCOL.name()))); 
			logmnrcGtcsPo.setEaowner#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtcsPo.COLUMNS.EAOWNER#.name()))); 
			logmnrcGtcsPo.setEamkeyid(dataObject.getString(LogmnrcGtcsPo.COLUMNS.EAMKEYID.name())); 
			logmnrcGtcsPo.setEaencalg(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtcsPo.COLUMNS.EAENCALG.name()))); 
			logmnrcGtcsPo.setEaintalg(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtcsPo.COLUMNS.EAINTALG.name()))); 
			logmnrcGtcsPo.setEacolklc(); 
			logmnrcGtcsPo.setEaklclen(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtcsPo.COLUMNS.EAKLCLEN.name()))); 
			logmnrcGtcsPo.setEaflags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGtcsPo.COLUMNS.EAFLAGS.name()))); 
			return logmnrcGtcsPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrcGtcsPo logmnrcGtcsPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.LOGMNR_UID.name(), logmnrcGtcsPo.getLogmnrUid()); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.OBJ#.name(), logmnrcGtcsPo.getObj#()); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.OBJV#.name(), logmnrcGtcsPo.getObjv#()); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.SEGCOL#.name(), logmnrcGtcsPo.getSegcol#()); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.INTCOL#.name(), logmnrcGtcsPo.getIntcol#()); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.COLNAME.name(), logmnrcGtcsPo.getColname()); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.TYPE#.name(), logmnrcGtcsPo.getType#()); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.LENGTH.name(), logmnrcGtcsPo.getLength()); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.PRECISION.name(), logmnrcGtcsPo.getPrecision()); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.SCALE.name(), logmnrcGtcsPo.getScale()); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.INTERVAL_LEADING_PRECISION.name(), logmnrcGtcsPo.getIntervalLeadingPrecision()); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.INTERVAL_TRAILING_PRECISION.name(), logmnrcGtcsPo.getIntervalTrailingPrecision()); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.PROPERTY.name(), logmnrcGtcsPo.getProperty()); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.TOID.name(), logmnrcGtcsPo.getToid()); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.CHARSETID.name(), logmnrcGtcsPo.getCharsetid()); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.CHARSETFORM.name(), logmnrcGtcsPo.getCharsetform()); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.TYPENAME.name(), logmnrcGtcsPo.getTypename()); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.FQCOLNAME.name(), logmnrcGtcsPo.getFqcolname()); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.NUMINTCOLS.name(), logmnrcGtcsPo.getNumintcols()); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.NUMATTRS.name(), logmnrcGtcsPo.getNumattrs()); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.ADTORDER.name(), logmnrcGtcsPo.getAdtorder()); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.LOGMNR_SPARE1.name(), logmnrcGtcsPo.getLogmnrSpare1()); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.LOGMNR_SPARE2.name(), logmnrcGtcsPo.getLogmnrSpare2()); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.LOGMNR_SPARE3.name(), logmnrcGtcsPo.getLogmnrSpare3()); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.LOGMNR_SPARE4.name(), logmnrcGtcsPo.getLogmnrSpare4()); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.LOGMNR_SPARE5.name(), logmnrcGtcsPo.getLogmnrSpare5()); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.LOGMNR_SPARE6.name(), logmnrcGtcsPo.getLogmnrSpare6()); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.LOGMNR_SPARE7.name(), logmnrcGtcsPo.getLogmnrSpare7()); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.LOGMNR_SPARE8.name(), logmnrcGtcsPo.getLogmnrSpare8()); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.LOGMNR_SPARE9.name(), logmnrcGtcsPo.getLogmnrSpare9()); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.COL#.name(), logmnrcGtcsPo.getCol#()); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.XTYPESCHEMANAME.name(), logmnrcGtcsPo.getXtypeschemaname()); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.XTYPENAME.name(), logmnrcGtcsPo.getXtypename()); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.XFQCOLNAME.name(), logmnrcGtcsPo.getXfqcolname()); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.XTOPINTCOL.name(), logmnrcGtcsPo.getXtopintcol()); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.XREFFEDTABLEOBJN.name(), logmnrcGtcsPo.getXreffedtableobjn()); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.XREFFEDTABLEOBJV.name(), logmnrcGtcsPo.getXreffedtableobjv()); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.XCOLTYPEFLAGS.name(), logmnrcGtcsPo.getXcoltypeflags()); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.XOPQTYPETYPE.name(), logmnrcGtcsPo.getXopqtypetype()); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.XOPQTYPEFLAGS.name(), logmnrcGtcsPo.getXopqtypeflags()); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.XOPQLOBINTCOL.name(), logmnrcGtcsPo.getXopqlobintcol()); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.XOPQOBJINTCOL.name(), logmnrcGtcsPo.getXopqobjintcol()); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.XXMLINTCOL.name(), logmnrcGtcsPo.getXxmlintcol()); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.EAOWNER#.name(), logmnrcGtcsPo.getEaowner#()); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.EAMKEYID.name(), logmnrcGtcsPo.getEamkeyid()); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.EAENCALG.name(), logmnrcGtcsPo.getEaencalg()); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.EAINTALG.name(), logmnrcGtcsPo.getEaintalg()); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.EACOLKLC.name(), logmnrcGtcsPo.getEacolklc()); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.EAKLCLEN.name(), logmnrcGtcsPo.getEaklclen()); 
			dataObject.setValue(LogmnrcGtcsPo.COLUMNS.EAFLAGS.name(), logmnrcGtcsPo.getEaflags()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrcGtcsPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrcGtcsPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrcGtcsPo.COLUMNS.LOGMNR_UID.name(), po.getLogmnrUid()); 
		sqlWhere.add(LogmnrcGtcsPo.COLUMNS.OBJ#.name(), po.getObj#()); 
		sqlWhere.add(LogmnrcGtcsPo.COLUMNS.OBJV#.name(), po.getObjv#()); 
		sqlWhere.add(LogmnrcGtcsPo.COLUMNS.INTCOL#.name(), po.getIntcol#()); 
		return sqlWhere; 
	} 
 
} 
