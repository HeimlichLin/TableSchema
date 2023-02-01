package com.doc.common.dao.impl; 
 
public class DocmlogDAOImpl extends GeneralDAOImpl<DocmlogPo> implements DocmlogDAO { 
	public static final DocmlogDAOImpl INSTANCE = new DocmlogDAOImpl(); 
	public static final String TABLENAME = "DOCMLOG"; 

	public DocmlogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DocmlogPo> CONVERTER = new MapConverter<DocmlogPo>() { 
 
		@Override 
		public DocmlogPo convert(final DataObject dataObject) { 
			final DocmlogPo docmlogPo = new DocmlogPo(); 
			docmlogPo.setBfNo(dataObject.getString(DocmlogPo.COLUMNS.BF_NO.name())); 
			docmlogPo.setLogDatm(dataObject.getString(DocmlogPo.COLUMNS.LOG_DATM.name())); 
			docmlogPo.setLogType(dataObject.getString(DocmlogPo.COLUMNS.LOG_TYPE.name())); 
			docmlogPo.setLogAction(dataObject.getString(DocmlogPo.COLUMNS.LOG_ACTION.name())); 
			docmlogPo.setLogOld(dataObject.getString(DocmlogPo.COLUMNS.LOG_OLD.name())); 
			docmlogPo.setLogNew(dataObject.getString(DocmlogPo.COLUMNS.LOG_NEW.name())); 
			docmlogPo.setUserId(dataObject.getString(DocmlogPo.COLUMNS.USER_ID.name())); 
			docmlogPo.setLogPgm(dataObject.getString(DocmlogPo.COLUMNS.LOG_PGM.name())); 
			docmlogPo.setLogTable(dataObject.getString(DocmlogPo.COLUMNS.LOG_TABLE.name())); 
			docmlogPo.setRef1(dataObject.getString(DocmlogPo.COLUMNS.REF1.name())); 
			docmlogPo.setRef2(dataObject.getString(DocmlogPo.COLUMNS.REF2.name())); 
			docmlogPo.setRef3(dataObject.getString(DocmlogPo.COLUMNS.REF3.name())); 
			docmlogPo.setLogColumn(dataObject.getString(DocmlogPo.COLUMNS.LOG_COLUMN.name())); 
			return docmlogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DocmlogPo docmlogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DocmlogPo.COLUMNS.BF_NO.name(), docmlogPo.getBfNo()); 
			dataObject.setValue(DocmlogPo.COLUMNS.LOG_DATM.name(), docmlogPo.getLogDatm()); 
			dataObject.setValue(DocmlogPo.COLUMNS.LOG_TYPE.name(), docmlogPo.getLogType()); 
			dataObject.setValue(DocmlogPo.COLUMNS.LOG_ACTION.name(), docmlogPo.getLogAction()); 
			dataObject.setValue(DocmlogPo.COLUMNS.LOG_OLD.name(), docmlogPo.getLogOld()); 
			dataObject.setValue(DocmlogPo.COLUMNS.LOG_NEW.name(), docmlogPo.getLogNew()); 
			dataObject.setValue(DocmlogPo.COLUMNS.USER_ID.name(), docmlogPo.getUserId()); 
			dataObject.setValue(DocmlogPo.COLUMNS.LOG_PGM.name(), docmlogPo.getLogPgm()); 
			dataObject.setValue(DocmlogPo.COLUMNS.LOG_TABLE.name(), docmlogPo.getLogTable()); 
			dataObject.setValue(DocmlogPo.COLUMNS.REF1.name(), docmlogPo.getRef1()); 
			dataObject.setValue(DocmlogPo.COLUMNS.REF2.name(), docmlogPo.getRef2()); 
			dataObject.setValue(DocmlogPo.COLUMNS.REF3.name(), docmlogPo.getRef3()); 
			dataObject.setValue(DocmlogPo.COLUMNS.LOG_COLUMN.name(), docmlogPo.getLogColumn()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DocmlogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DocmlogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
