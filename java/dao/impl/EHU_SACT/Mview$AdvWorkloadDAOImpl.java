package com.doc.common.dao.impl; 
 
public class Mview$AdvWorkloadDAOImpl extends GeneralDAOImpl<Mview$AdvWorkloadPo> implements IMview$AdvWorkloadDAO { 
	public static final Mview$AdvWorkloadDAOImpl INSTANCE = new Mview$AdvWorkloadDAOImpl(); 
	public static final String TABLENAME = "MVIEW$_ADV_WORKLOAD"; 

	public Mview$AdvWorkloadDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Mview$AdvWorkloadPo> CONVERTER = new MapConverter<Mview$AdvWorkloadPo>() { 
 
		@Override 
		public Mview$AdvWorkloadPo convert(final DataObject dataObject) { 
			final Mview$AdvWorkloadPo mview$AdvWorkloadPo = new Mview$AdvWorkloadPo(); 
			mview$AdvWorkloadPo.setQueryid#(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvWorkloadPo.COLUMNS.QUERYID#.name()))); 
			mview$AdvWorkloadPo.setCollectionid#(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvWorkloadPo.COLUMNS.COLLECTIONID#.name()))); 
			mview$AdvWorkloadPo.setCollecttime(TimestampUtils.of(dataObject.getValue(Mview$AdvWorkloadPo.COLUMNS.COLLECTTIME.name()))); 
			mview$AdvWorkloadPo.setApplication(dataObject.getString(Mview$AdvWorkloadPo.COLUMNS.APPLICATION.name())); 
			mview$AdvWorkloadPo.setCardinality(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvWorkloadPo.COLUMNS.CARDINALITY.name()))); 
			mview$AdvWorkloadPo.setResultsize(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvWorkloadPo.COLUMNS.RESULTSIZE.name()))); 
			mview$AdvWorkloadPo.setUname(dataObject.getString(Mview$AdvWorkloadPo.COLUMNS.UNAME.name())); 
			mview$AdvWorkloadPo.setQdate(TimestampUtils.of(dataObject.getValue(Mview$AdvWorkloadPo.COLUMNS.QDATE.name()))); 
			mview$AdvWorkloadPo.setPriority(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvWorkloadPo.COLUMNS.PRIORITY.name()))); 
			mview$AdvWorkloadPo.setExecTime(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvWorkloadPo.COLUMNS.EXEC_TIME.name()))); 
			mview$AdvWorkloadPo.setSqlText(); 
			mview$AdvWorkloadPo.setSqlTextlen(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvWorkloadPo.COLUMNS.SQL_TEXTLEN.name()))); 
			mview$AdvWorkloadPo.setSqlHash(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvWorkloadPo.COLUMNS.SQL_HASH.name()))); 
			mview$AdvWorkloadPo.setSqlAddr(); 
			mview$AdvWorkloadPo.setFrequency(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvWorkloadPo.COLUMNS.FREQUENCY.name()))); 
			return mview$AdvWorkloadPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Mview$AdvWorkloadPo mview$AdvWorkloadPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Mview$AdvWorkloadPo.COLUMNS.QUERYID#.name(), mview$AdvWorkloadPo.getQueryid#()); 
			dataObject.setValue(Mview$AdvWorkloadPo.COLUMNS.COLLECTIONID#.name(), mview$AdvWorkloadPo.getCollectionid#()); 
			dataObject.setValue(Mview$AdvWorkloadPo.COLUMNS.COLLECTTIME.name(), mview$AdvWorkloadPo.getCollecttime()); 
			dataObject.setValue(Mview$AdvWorkloadPo.COLUMNS.APPLICATION.name(), mview$AdvWorkloadPo.getApplication()); 
			dataObject.setValue(Mview$AdvWorkloadPo.COLUMNS.CARDINALITY.name(), mview$AdvWorkloadPo.getCardinality()); 
			dataObject.setValue(Mview$AdvWorkloadPo.COLUMNS.RESULTSIZE.name(), mview$AdvWorkloadPo.getResultsize()); 
			dataObject.setValue(Mview$AdvWorkloadPo.COLUMNS.UNAME.name(), mview$AdvWorkloadPo.getUname()); 
			dataObject.setValue(Mview$AdvWorkloadPo.COLUMNS.QDATE.name(), mview$AdvWorkloadPo.getQdate()); 
			dataObject.setValue(Mview$AdvWorkloadPo.COLUMNS.PRIORITY.name(), mview$AdvWorkloadPo.getPriority()); 
			dataObject.setValue(Mview$AdvWorkloadPo.COLUMNS.EXEC_TIME.name(), mview$AdvWorkloadPo.getExecTime()); 
			dataObject.setValue(Mview$AdvWorkloadPo.COLUMNS.SQL_TEXT.name(), mview$AdvWorkloadPo.getSqlText()); 
			dataObject.setValue(Mview$AdvWorkloadPo.COLUMNS.SQL_TEXTLEN.name(), mview$AdvWorkloadPo.getSqlTextlen()); 
			dataObject.setValue(Mview$AdvWorkloadPo.COLUMNS.SQL_HASH.name(), mview$AdvWorkloadPo.getSqlHash()); 
			dataObject.setValue(Mview$AdvWorkloadPo.COLUMNS.SQL_ADDR.name(), mview$AdvWorkloadPo.getSqlAddr()); 
			dataObject.setValue(Mview$AdvWorkloadPo.COLUMNS.FREQUENCY.name(), mview$AdvWorkloadPo.getFrequency()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Mview$AdvWorkloadPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Mview$AdvWorkloadPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Mview$AdvWorkloadPo.COLUMNS.QUERYID#.name(), po.getQueryid#()); 
		return sqlWhere; 
	} 
 
} 
