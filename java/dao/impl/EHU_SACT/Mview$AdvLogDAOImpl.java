package com.doc.common.dao.impl; 
 
public class Mview$AdvLogDAOImpl extends GeneralDAOImpl<Mview$AdvLogPo> implements IMview$AdvLogDAO { 
	public static final Mview$AdvLogDAOImpl INSTANCE = new Mview$AdvLogDAOImpl(); 
	public static final String TABLENAME = "MVIEW$_ADV_LOG"; 

	public Mview$AdvLogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Mview$AdvLogPo> CONVERTER = new MapConverter<Mview$AdvLogPo>() { 
 
		@Override 
		public Mview$AdvLogPo convert(final DataObject dataObject) { 
			final Mview$AdvLogPo mview$AdvLogPo = new Mview$AdvLogPo(); 
			mview$AdvLogPo.setRunid#(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvLogPo.COLUMNS.RUNID#.name()))); 
			mview$AdvLogPo.setFilterid#(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvLogPo.COLUMNS.FILTERID#.name()))); 
			mview$AdvLogPo.setRunBegin(TimestampUtils.of(dataObject.getValue(Mview$AdvLogPo.COLUMNS.RUN_BEGIN.name()))); 
			mview$AdvLogPo.setRunEnd(TimestampUtils.of(dataObject.getValue(Mview$AdvLogPo.COLUMNS.RUN_END.name()))); 
			mview$AdvLogPo.setRunType(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvLogPo.COLUMNS.RUN_TYPE.name()))); 
			mview$AdvLogPo.setUname(dataObject.getString(Mview$AdvLogPo.COLUMNS.UNAME.name())); 
			mview$AdvLogPo.setStatus(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvLogPo.COLUMNS.STATUS.name()))); 
			mview$AdvLogPo.setMessage(dataObject.getString(Mview$AdvLogPo.COLUMNS.MESSAGE.name())); 
			mview$AdvLogPo.setCompleted(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvLogPo.COLUMNS.COMPLETED.name()))); 
			mview$AdvLogPo.setTotal(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvLogPo.COLUMNS.TOTAL.name()))); 
			mview$AdvLogPo.setErrorCode(dataObject.getString(Mview$AdvLogPo.COLUMNS.ERROR_CODE.name())); 
			return mview$AdvLogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Mview$AdvLogPo mview$AdvLogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Mview$AdvLogPo.COLUMNS.RUNID#.name(), mview$AdvLogPo.getRunid#()); 
			dataObject.setValue(Mview$AdvLogPo.COLUMNS.FILTERID#.name(), mview$AdvLogPo.getFilterid#()); 
			dataObject.setValue(Mview$AdvLogPo.COLUMNS.RUN_BEGIN.name(), mview$AdvLogPo.getRunBegin()); 
			dataObject.setValue(Mview$AdvLogPo.COLUMNS.RUN_END.name(), mview$AdvLogPo.getRunEnd()); 
			dataObject.setValue(Mview$AdvLogPo.COLUMNS.RUN_TYPE.name(), mview$AdvLogPo.getRunType()); 
			dataObject.setValue(Mview$AdvLogPo.COLUMNS.UNAME.name(), mview$AdvLogPo.getUname()); 
			dataObject.setValue(Mview$AdvLogPo.COLUMNS.STATUS.name(), mview$AdvLogPo.getStatus()); 
			dataObject.setValue(Mview$AdvLogPo.COLUMNS.MESSAGE.name(), mview$AdvLogPo.getMessage()); 
			dataObject.setValue(Mview$AdvLogPo.COLUMNS.COMPLETED.name(), mview$AdvLogPo.getCompleted()); 
			dataObject.setValue(Mview$AdvLogPo.COLUMNS.TOTAL.name(), mview$AdvLogPo.getTotal()); 
			dataObject.setValue(Mview$AdvLogPo.COLUMNS.ERROR_CODE.name(), mview$AdvLogPo.getErrorCode()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Mview$AdvLogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Mview$AdvLogPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Mview$AdvLogPo.COLUMNS.RUNID#.name(), po.getRunid#()); 
		return sqlWhere; 
	} 
 
} 
