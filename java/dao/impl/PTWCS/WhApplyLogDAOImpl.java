package com.doc.common.dao.impl; 
 
public class WhApplyLogDAOImpl extends GeneralDAOImpl<WhApplyLogPo> implements WhApplyLogDAO { 
	public static final WhApplyLogDAOImpl INSTANCE = new WhApplyLogDAOImpl(); 
	public static final String TABLENAME = "WH_APPLY_LOG"; 

	public WhApplyLogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<WhApplyLogPo> CONVERTER = new MapConverter<WhApplyLogPo>() { 
 
		@Override 
		public WhApplyLogPo convert(final DataObject dataObject) { 
			final WhApplyLogPo whApplyLogPo = new WhApplyLogPo(); 
			whApplyLogPo.setWhApplySerNo(dataObject.getString(WhApplyLogPo.COLUMNS.WH_APPLY_SER_NO.name())); 
			whApplyLogPo.setRecordNo(dataObject.getString(WhApplyLogPo.COLUMNS.RECORD_NO.name())); 
			whApplyLogPo.setUpdateItem(dataObject.getString(WhApplyLogPo.COLUMNS.UPDATE_ITEM.name())); 
			whApplyLogPo.setUpdateContentB(dataObject.getString(WhApplyLogPo.COLUMNS.UPDATE_CONTENT_B.name())); 
			whApplyLogPo.setUpdateContentA(dataObject.getString(WhApplyLogPo.COLUMNS.UPDATE_CONTENT_A.name())); 
			whApplyLogPo.setUpdateUser(dataObject.getString(WhApplyLogPo.COLUMNS.UPDATE_USER.name())); 
			whApplyLogPo.setUpdateDate(TimestampUtils.of(dataObject.getValue(WhApplyLogPo.COLUMNS.UPDATE_DATE.name()))); 
			return whApplyLogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final WhApplyLogPo whApplyLogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WhApplyLogPo.COLUMNS.WH_APPLY_SER_NO.name(), whApplyLogPo.getWhApplySerNo()); 
			dataObject.setValue(WhApplyLogPo.COLUMNS.RECORD_NO.name(), whApplyLogPo.getRecordNo()); 
			dataObject.setValue(WhApplyLogPo.COLUMNS.UPDATE_ITEM.name(), whApplyLogPo.getUpdateItem()); 
			dataObject.setValue(WhApplyLogPo.COLUMNS.UPDATE_CONTENT_B.name(), whApplyLogPo.getUpdateContentB()); 
			dataObject.setValue(WhApplyLogPo.COLUMNS.UPDATE_CONTENT_A.name(), whApplyLogPo.getUpdateContentA()); 
			dataObject.setValue(WhApplyLogPo.COLUMNS.UPDATE_USER.name(), whApplyLogPo.getUpdateUser()); 
			dataObject.setValue(WhApplyLogPo.COLUMNS.UPDATE_DATE.name(), whApplyLogPo.getUpdateDate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<WhApplyLogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(WhApplyLogPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(WhApplyLogPo.COLUMNS.WH_APPLY_SER_NO.name(), po.getWhApplySerNo()); 
		sqlWhere.add(WhApplyLogPo.COLUMNS.RECORD_NO.name(), po.getRecordNo()); 
		sqlWhere.add(WhApplyLogPo.COLUMNS.UPDATE_ITEM.name(), po.getUpdateItem()); 
		return sqlWhere; 
	} 
 
} 
