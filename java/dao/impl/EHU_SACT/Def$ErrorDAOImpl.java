package com.doc.common.dao.impl; 
 
public class Def$ErrorDAOImpl extends GeneralDAOImpl<Def$ErrorPo> implements IDef$ErrorDAO { 
	public static final Def$ErrorDAOImpl INSTANCE = new Def$ErrorDAOImpl(); 
	public static final String TABLENAME = "DEF$_ERROR"; 

	public Def$ErrorDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Def$ErrorPo> CONVERTER = new MapConverter<Def$ErrorPo>() { 
 
		@Override 
		public Def$ErrorPo convert(final DataObject dataObject) { 
			final Def$ErrorPo def$ErrorPo = new Def$ErrorPo(); 
			def$ErrorPo.setEnqTid(dataObject.getString(Def$ErrorPo.COLUMNS.ENQ_TID.name())); 
			def$ErrorPo.setOriginTranDb(dataObject.getString(Def$ErrorPo.COLUMNS.ORIGIN_TRAN_DB.name())); 
			def$ErrorPo.setOriginEnqTid(dataObject.getString(Def$ErrorPo.COLUMNS.ORIGIN_ENQ_TID.name())); 
			def$ErrorPo.setDestination(dataObject.getString(Def$ErrorPo.COLUMNS.DESTINATION.name())); 
			def$ErrorPo.setStepNo(BigDecimalUtils.formObj(dataObject.getValue(Def$ErrorPo.COLUMNS.STEP_NO.name()))); 
			def$ErrorPo.setReceiver(BigDecimalUtils.formObj(dataObject.getValue(Def$ErrorPo.COLUMNS.RECEIVER.name()))); 
			def$ErrorPo.setEnqTime(TimestampUtils.of(dataObject.getValue(Def$ErrorPo.COLUMNS.ENQ_TIME.name()))); 
			def$ErrorPo.setErrorNumber(BigDecimalUtils.formObj(dataObject.getValue(Def$ErrorPo.COLUMNS.ERROR_NUMBER.name()))); 
			def$ErrorPo.setErrorMsg(dataObject.getString(Def$ErrorPo.COLUMNS.ERROR_MSG.name())); 
			return def$ErrorPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Def$ErrorPo def$ErrorPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Def$ErrorPo.COLUMNS.ENQ_TID.name(), def$ErrorPo.getEnqTid()); 
			dataObject.setValue(Def$ErrorPo.COLUMNS.ORIGIN_TRAN_DB.name(), def$ErrorPo.getOriginTranDb()); 
			dataObject.setValue(Def$ErrorPo.COLUMNS.ORIGIN_ENQ_TID.name(), def$ErrorPo.getOriginEnqTid()); 
			dataObject.setValue(Def$ErrorPo.COLUMNS.DESTINATION.name(), def$ErrorPo.getDestination()); 
			dataObject.setValue(Def$ErrorPo.COLUMNS.STEP_NO.name(), def$ErrorPo.getStepNo()); 
			dataObject.setValue(Def$ErrorPo.COLUMNS.RECEIVER.name(), def$ErrorPo.getReceiver()); 
			dataObject.setValue(Def$ErrorPo.COLUMNS.ENQ_TIME.name(), def$ErrorPo.getEnqTime()); 
			dataObject.setValue(Def$ErrorPo.COLUMNS.ERROR_NUMBER.name(), def$ErrorPo.getErrorNumber()); 
			dataObject.setValue(Def$ErrorPo.COLUMNS.ERROR_MSG.name(), def$ErrorPo.getErrorMsg()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Def$ErrorPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Def$ErrorPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Def$ErrorPo.COLUMNS.ENQ_TID.name(), po.getEnqTid()); 
		return sqlWhere; 
	} 
 
} 
