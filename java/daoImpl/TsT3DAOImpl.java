package com.doc.common.dao.impl; 
 
public class TsT3DAOImpl extends GeneralDAOImpl<TsT3Do> implements TsT3DAOImpl { 
	public static final TsT3DAOImpl INSTANCE = new TsT3DAOImpl(); 
	public static final String TABLENAME = "TS_T3"; 

	public TsT3DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<TsT3Do> CONVERTER = new MapConverter<TsT3Do>() { 
 
		@Override 
		public TsT3Do convert(final DataObject dataObject) { 
			final TsT3Do tsT3Do = new TsT3Do(); 
			tsT3Do.setT3item(BigDecimalUtils.formObj(dataObject.getString(TsT3Do.COLUMNS.T3ITEM.name()))); 
			tsT3Do.setT3prdtno(dataObject.getString(TsT3Do.COLUMNS.T3PRDTNO.name())); 
			tsT3Do.setT3rstrqty(BigDecimalUtils.formObj(dataObject.getString(TsT3Do.COLUMNS.T3RSTRQTY.name()))); 
			tsT3Do.setT3backdate(dataObject.getString(TsT3Do.COLUMNS.T3BACKDATE.name())); 
			tsT3Do.setT3batchno(BigDecimalUtils.formObj(dataObject.getString(TsT3Do.COLUMNS.T3BATCHNO.name()))); 
			tsT3Do.setControlno(dataObject.getString(TsT3Do.COLUMNS.CONTROLNO.name())); 
			tsT3Do.setSerialno(BigDecimalUtils.formObj(dataObject.getString(TsT3Do.COLUMNS.SERIALNO.name()))); 
			tsT3Do.setSeqno(BigDecimalUtils.formObj(dataObject.getString(TsT3Do.COLUMNS.SEQNO.name()))); 
			tsT3Do.setIconfirmed(dataObject.getString(TsT3Do.COLUMNS.ICONFIRMED.name())); 
			tsT3Do.setT1bondno(dataObject.getString(TsT3Do.COLUMNS.T1BONDNO.name())); 
			tsT3Do.setT1testno(dataObject.getString(TsT3Do.COLUMNS.T1TESTNO.name())); 
			tsT3Do.setT1Seqno(BigDecimalUtils.formObj(dataObject.getString(TsT3Do.COLUMNS.T1_SEQNO.name()))); 
			tsT3Do.setT3inpost(dataObject.getString(TsT3Do.COLUMNS.T3INPOST.name())); 
			return tsT3Do; 
		} 
 
		@Override 
		public DataObject toDataObject(final TsT3Do tsT3Do) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TsT3Do.COLUMNS.T3ITEM.name(), tsT3Do.getT3item()); 
			dataObject.setValue(TsT3Do.COLUMNS.T3PRDTNO.name(), tsT3Do.getT3prdtno()); 
			dataObject.setValue(TsT3Do.COLUMNS.T3RSTRQTY.name(), tsT3Do.getT3rstrqty()); 
			dataObject.setValue(TsT3Do.COLUMNS.T3BACKDATE.name(), tsT3Do.getT3backdate()); 
			dataObject.setValue(TsT3Do.COLUMNS.T3BATCHNO.name(), tsT3Do.getT3batchno()); 
			dataObject.setValue(TsT3Do.COLUMNS.CONTROLNO.name(), tsT3Do.getControlno()); 
			dataObject.setValue(TsT3Do.COLUMNS.SERIALNO.name(), tsT3Do.getSerialno()); 
			dataObject.setValue(TsT3Do.COLUMNS.SEQNO.name(), tsT3Do.getSeqno()); 
			dataObject.setValue(TsT3Do.COLUMNS.ICONFIRMED.name(), tsT3Do.getIconfirmed()); 
			dataObject.setValue(TsT3Do.COLUMNS.T1BONDNO.name(), tsT3Do.getT1bondno()); 
			dataObject.setValue(TsT3Do.COLUMNS.T1TESTNO.name(), tsT3Do.getT1testno()); 
			dataObject.setValue(TsT3Do.COLUMNS.T1_SEQNO.name(), tsT3Do.getT1Seqno()); 
			dataObject.setValue(TsT3Do.COLUMNS.T3INPOST.name(), tsT3Do.getT3inpost()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TsT3Do> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TsT3Do po) { 
	} 
 
} 
