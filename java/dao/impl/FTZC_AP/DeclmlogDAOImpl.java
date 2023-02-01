package com.doc.common.dao.impl; 
 
public class DeclmlogDAOImpl extends GeneralDAOImpl<DeclmlogPo> implements DeclmlogDAO { 
	public static final DeclmlogDAOImpl INSTANCE = new DeclmlogDAOImpl(); 
	public static final String TABLENAME = "DECLMLOG"; 

	public DeclmlogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DeclmlogPo> CONVERTER = new MapConverter<DeclmlogPo>() { 
 
		@Override 
		public DeclmlogPo convert(final DataObject dataObject) { 
			final DeclmlogPo declmlogPo = new DeclmlogPo(); 
			declmlogPo.setDeclNo(dataObject.getString(DeclmlogPo.COLUMNS.DECL_NO.name())); 
			declmlogPo.setDeclType(dataObject.getString(DeclmlogPo.COLUMNS.DECL_TYPE.name())); 
			declmlogPo.setBfNo(dataObject.getString(DeclmlogPo.COLUMNS.BF_NO.name())); 
			declmlogPo.setUserId(dataObject.getString(DeclmlogPo.COLUMNS.USER_ID.name())); 
			declmlogPo.setLogDatm(dataObject.getString(DeclmlogPo.COLUMNS.LOG_DATM.name())); 
			declmlogPo.setLogTable(dataObject.getString(DeclmlogPo.COLUMNS.LOG_TABLE.name())); 
			declmlogPo.setLogAction(dataObject.getString(DeclmlogPo.COLUMNS.LOG_ACTION.name())); 
			declmlogPo.setLogColumn(dataObject.getString(DeclmlogPo.COLUMNS.LOG_COLUMN.name())); 
			declmlogPo.setLogNew(dataObject.getString(DeclmlogPo.COLUMNS.LOG_NEW.name())); 
			declmlogPo.setLogOld(dataObject.getString(DeclmlogPo.COLUMNS.LOG_OLD.name())); 
			declmlogPo.setLogPgm(dataObject.getString(DeclmlogPo.COLUMNS.LOG_PGM.name())); 
			declmlogPo.setDeclSeqNo(BigDecimalUtils.formObj(dataObject.getValue(DeclmlogPo.COLUMNS.DECL_SEQ_NO.name()))); 
			return declmlogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DeclmlogPo declmlogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DeclmlogPo.COLUMNS.DECL_NO.name(), declmlogPo.getDeclNo()); 
			dataObject.setValue(DeclmlogPo.COLUMNS.DECL_TYPE.name(), declmlogPo.getDeclType()); 
			dataObject.setValue(DeclmlogPo.COLUMNS.BF_NO.name(), declmlogPo.getBfNo()); 
			dataObject.setValue(DeclmlogPo.COLUMNS.USER_ID.name(), declmlogPo.getUserId()); 
			dataObject.setValue(DeclmlogPo.COLUMNS.LOG_DATM.name(), declmlogPo.getLogDatm()); 
			dataObject.setValue(DeclmlogPo.COLUMNS.LOG_TABLE.name(), declmlogPo.getLogTable()); 
			dataObject.setValue(DeclmlogPo.COLUMNS.LOG_ACTION.name(), declmlogPo.getLogAction()); 
			dataObject.setValue(DeclmlogPo.COLUMNS.LOG_COLUMN.name(), declmlogPo.getLogColumn()); 
			dataObject.setValue(DeclmlogPo.COLUMNS.LOG_NEW.name(), declmlogPo.getLogNew()); 
			dataObject.setValue(DeclmlogPo.COLUMNS.LOG_OLD.name(), declmlogPo.getLogOld()); 
			dataObject.setValue(DeclmlogPo.COLUMNS.LOG_PGM.name(), declmlogPo.getLogPgm()); 
			dataObject.setValue(DeclmlogPo.COLUMNS.DECL_SEQ_NO.name(), declmlogPo.getDeclSeqNo()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DeclmlogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DeclmlogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
