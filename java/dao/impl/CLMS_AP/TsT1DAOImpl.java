package com.doc.common.dao.impl; 
 
public class TsT1DAOImpl extends GeneralDAOImpl<TsT1Po> implements TsT1DAO { 
	public static final TsT1DAOImpl INSTANCE = new TsT1DAOImpl(); 
	public static final String TABLENAME = "TS_T1"; 

	public TsT1DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TsT1Po> CONVERTER = new MapConverter<TsT1Po>() { 
 
		@Override 
		public TsT1Po convert(final DataObject dataObject) { 
			final TsT1Po tsT1Po = new TsT1Po(); 
			tsT1Po.setT1bondno(dataObject.getString(TsT1Po.COLUMNS.T1BONDNO.name())); 
			tsT1Po.setT1testno(dataObject.getString(TsT1Po.COLUMNS.T1TESTNO.name())); 
			tsT1Po.setT1ctmcode(dataObject.getString(TsT1Po.COLUMNS.T1CTMCODE.name())); 
			tsT1Po.setT1reqrdate(dataObject.getString(TsT1Po.COLUMNS.T1REQRDATE.name())); 
			tsT1Po.setT1applydate(dataObject.getString(TsT1Po.COLUMNS.T1APPLYDATE.name())); 
			tsT1Po.setT1approveddate(dataObject.getString(TsT1Po.COLUMNS.T1APPROVEDDATE.name())); 
			tsT1Po.setT1approvedno(dataObject.getString(TsT1Po.COLUMNS.T1APPROVEDNO.name())); 
			tsT1Po.setT1destplace(dataObject.getString(TsT1Po.COLUMNS.T1DESTPLACE.name())); 
			tsT1Po.setT1testtype(dataObject.getString(TsT1Po.COLUMNS.T1TESTTYPE.name())); 
			tsT1Po.setT1strtype(dataObject.getString(TsT1Po.COLUMNS.T1STRTYPE.name())); 
			tsT1Po.setControlno(dataObject.getString(TsT1Po.COLUMNS.CONTROLNO.name())); 
			tsT1Po.setSerialno(BigDecimalUtils.formObj(dataObject.getValue(TsT1Po.COLUMNS.SERIALNO.name()))); 
			tsT1Po.setSeqno(BigDecimalUtils.formObj(dataObject.getValue(TsT1Po.COLUMNS.SEQNO.name()))); 
			tsT1Po.setIconfirmed(dataObject.getString(TsT1Po.COLUMNS.ICONFIRMED.name())); 
			return tsT1Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final TsT1Po tsT1Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TsT1Po.COLUMNS.T1BONDNO.name(), tsT1Po.getT1bondno()); 
			dataObject.setValue(TsT1Po.COLUMNS.T1TESTNO.name(), tsT1Po.getT1testno()); 
			dataObject.setValue(TsT1Po.COLUMNS.T1CTMCODE.name(), tsT1Po.getT1ctmcode()); 
			dataObject.setValue(TsT1Po.COLUMNS.T1REQRDATE.name(), tsT1Po.getT1reqrdate()); 
			dataObject.setValue(TsT1Po.COLUMNS.T1APPLYDATE.name(), tsT1Po.getT1applydate()); 
			dataObject.setValue(TsT1Po.COLUMNS.T1APPROVEDDATE.name(), tsT1Po.getT1approveddate()); 
			dataObject.setValue(TsT1Po.COLUMNS.T1APPROVEDNO.name(), tsT1Po.getT1approvedno()); 
			dataObject.setValue(TsT1Po.COLUMNS.T1DESTPLACE.name(), tsT1Po.getT1destplace()); 
			dataObject.setValue(TsT1Po.COLUMNS.T1TESTTYPE.name(), tsT1Po.getT1testtype()); 
			dataObject.setValue(TsT1Po.COLUMNS.T1STRTYPE.name(), tsT1Po.getT1strtype()); 
			dataObject.setValue(TsT1Po.COLUMNS.CONTROLNO.name(), tsT1Po.getControlno()); 
			dataObject.setValue(TsT1Po.COLUMNS.SERIALNO.name(), tsT1Po.getSerialno()); 
			dataObject.setValue(TsT1Po.COLUMNS.SEQNO.name(), tsT1Po.getSeqno()); 
			dataObject.setValue(TsT1Po.COLUMNS.ICONFIRMED.name(), tsT1Po.getIconfirmed()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TsT1Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TsT1Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
