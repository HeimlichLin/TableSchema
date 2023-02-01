package com.doc.common.dao.impl; 
 
public class TsT3DAOImpl extends GeneralDAOImpl<TsT3Po> implements TsT3DAO { 
	public static final TsT3DAOImpl INSTANCE = new TsT3DAOImpl(); 
	public static final String TABLENAME = "TS_T3"; 

	public TsT3DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TsT3Po> CONVERTER = new MapConverter<TsT3Po>() { 
 
		@Override 
		public TsT3Po convert(final DataObject dataObject) { 
			final TsT3Po tsT3Po = new TsT3Po(); 
			tsT3Po.setT3item(BigDecimalUtils.formObj(dataObject.getValue(TsT3Po.COLUMNS.T3ITEM.name()))); 
			tsT3Po.setT3prdtno(dataObject.getString(TsT3Po.COLUMNS.T3PRDTNO.name())); 
			tsT3Po.setT3rstrqty(BigDecimalUtils.formObj(dataObject.getValue(TsT3Po.COLUMNS.T3RSTRQTY.name()))); 
			tsT3Po.setT3backdate(dataObject.getString(TsT3Po.COLUMNS.T3BACKDATE.name())); 
			tsT3Po.setT3batchno(BigDecimalUtils.formObj(dataObject.getValue(TsT3Po.COLUMNS.T3BATCHNO.name()))); 
			tsT3Po.setControlno(dataObject.getString(TsT3Po.COLUMNS.CONTROLNO.name())); 
			tsT3Po.setSerialno(BigDecimalUtils.formObj(dataObject.getValue(TsT3Po.COLUMNS.SERIALNO.name()))); 
			tsT3Po.setSeqno(BigDecimalUtils.formObj(dataObject.getValue(TsT3Po.COLUMNS.SEQNO.name()))); 
			tsT3Po.setIconfirmed(dataObject.getString(TsT3Po.COLUMNS.ICONFIRMED.name())); 
			tsT3Po.setT1bondno(dataObject.getString(TsT3Po.COLUMNS.T1BONDNO.name())); 
			tsT3Po.setT1testno(dataObject.getString(TsT3Po.COLUMNS.T1TESTNO.name())); 
			tsT3Po.setT1Seqno(BigDecimalUtils.formObj(dataObject.getValue(TsT3Po.COLUMNS.T1_SEQNO.name()))); 
			tsT3Po.setT3inpost(dataObject.getString(TsT3Po.COLUMNS.T3INPOST.name())); 
			return tsT3Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final TsT3Po tsT3Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TsT3Po.COLUMNS.T3ITEM.name(), tsT3Po.getT3item()); 
			dataObject.setValue(TsT3Po.COLUMNS.T3PRDTNO.name(), tsT3Po.getT3prdtno()); 
			dataObject.setValue(TsT3Po.COLUMNS.T3RSTRQTY.name(), tsT3Po.getT3rstrqty()); 
			dataObject.setValue(TsT3Po.COLUMNS.T3BACKDATE.name(), tsT3Po.getT3backdate()); 
			dataObject.setValue(TsT3Po.COLUMNS.T3BATCHNO.name(), tsT3Po.getT3batchno()); 
			dataObject.setValue(TsT3Po.COLUMNS.CONTROLNO.name(), tsT3Po.getControlno()); 
			dataObject.setValue(TsT3Po.COLUMNS.SERIALNO.name(), tsT3Po.getSerialno()); 
			dataObject.setValue(TsT3Po.COLUMNS.SEQNO.name(), tsT3Po.getSeqno()); 
			dataObject.setValue(TsT3Po.COLUMNS.ICONFIRMED.name(), tsT3Po.getIconfirmed()); 
			dataObject.setValue(TsT3Po.COLUMNS.T1BONDNO.name(), tsT3Po.getT1bondno()); 
			dataObject.setValue(TsT3Po.COLUMNS.T1TESTNO.name(), tsT3Po.getT1testno()); 
			dataObject.setValue(TsT3Po.COLUMNS.T1_SEQNO.name(), tsT3Po.getT1Seqno()); 
			dataObject.setValue(TsT3Po.COLUMNS.T3INPOST.name(), tsT3Po.getT3inpost()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TsT3Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TsT3Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
