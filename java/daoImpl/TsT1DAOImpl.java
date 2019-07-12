package com.doc.common.dao.impl; 
 
public class TsT1DAOImpl extends GeneralDAOImpl<TsT1Do> implements TsT1DAOImpl { 
	public static final TsT1DAOImpl INSTANCE = new TsT1DAOImpl(); 
	public static final String TABLENAME = "TS_T1"; 

	public TsT1DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<TsT1Do> CONVERTER = new MapConverter<TsT1Do>() { 
 
		@Override 
		public TsT1Do convert(final DataObject dataObject) { 
			final TsT1Do tsT1Do = new TsT1Do(); 
			tsT1Do.setT1bondno(dataObject.getString(TsT1Do.COLUMNS.T1BONDNO.name())); 
			tsT1Do.setT1testno(dataObject.getString(TsT1Do.COLUMNS.T1TESTNO.name())); 
			tsT1Do.setT1ctmcode(dataObject.getString(TsT1Do.COLUMNS.T1CTMCODE.name())); 
			tsT1Do.setT1reqrdate(dataObject.getString(TsT1Do.COLUMNS.T1REQRDATE.name())); 
			tsT1Do.setT1applydate(dataObject.getString(TsT1Do.COLUMNS.T1APPLYDATE.name())); 
			tsT1Do.setT1approveddate(dataObject.getString(TsT1Do.COLUMNS.T1APPROVEDDATE.name())); 
			tsT1Do.setT1approvedno(dataObject.getString(TsT1Do.COLUMNS.T1APPROVEDNO.name())); 
			tsT1Do.setT1destplace(dataObject.getString(TsT1Do.COLUMNS.T1DESTPLACE.name())); 
			tsT1Do.setT1testtype(dataObject.getString(TsT1Do.COLUMNS.T1TESTTYPE.name())); 
			tsT1Do.setT1strtype(dataObject.getString(TsT1Do.COLUMNS.T1STRTYPE.name())); 
			tsT1Do.setControlno(dataObject.getString(TsT1Do.COLUMNS.CONTROLNO.name())); 
			tsT1Do.setSerialno(BigDecimalUtils.formObj(dataObject.getString(TsT1Do.COLUMNS.SERIALNO.name()))); 
			tsT1Do.setSeqno(BigDecimalUtils.formObj(dataObject.getString(TsT1Do.COLUMNS.SEQNO.name()))); 
			tsT1Do.setIconfirmed(dataObject.getString(TsT1Do.COLUMNS.ICONFIRMED.name())); 
			return tsT1Do; 
		} 
 
		@Override 
		public DataObject toDataObject(final TsT1Do tsT1Do) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TsT1Do.COLUMNS.T1BONDNO.name(), tsT1Do.getT1bondno()); 
			dataObject.setValue(TsT1Do.COLUMNS.T1TESTNO.name(), tsT1Do.getT1testno()); 
			dataObject.setValue(TsT1Do.COLUMNS.T1CTMCODE.name(), tsT1Do.getT1ctmcode()); 
			dataObject.setValue(TsT1Do.COLUMNS.T1REQRDATE.name(), tsT1Do.getT1reqrdate()); 
			dataObject.setValue(TsT1Do.COLUMNS.T1APPLYDATE.name(), tsT1Do.getT1applydate()); 
			dataObject.setValue(TsT1Do.COLUMNS.T1APPROVEDDATE.name(), tsT1Do.getT1approveddate()); 
			dataObject.setValue(TsT1Do.COLUMNS.T1APPROVEDNO.name(), tsT1Do.getT1approvedno()); 
			dataObject.setValue(TsT1Do.COLUMNS.T1DESTPLACE.name(), tsT1Do.getT1destplace()); 
			dataObject.setValue(TsT1Do.COLUMNS.T1TESTTYPE.name(), tsT1Do.getT1testtype()); 
			dataObject.setValue(TsT1Do.COLUMNS.T1STRTYPE.name(), tsT1Do.getT1strtype()); 
			dataObject.setValue(TsT1Do.COLUMNS.CONTROLNO.name(), tsT1Do.getControlno()); 
			dataObject.setValue(TsT1Do.COLUMNS.SERIALNO.name(), tsT1Do.getSerialno()); 
			dataObject.setValue(TsT1Do.COLUMNS.SEQNO.name(), tsT1Do.getSeqno()); 
			dataObject.setValue(TsT1Do.COLUMNS.ICONFIRMED.name(), tsT1Do.getIconfirmed()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TsT1Do> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TsT1Do po) { 
	} 
 
} 
