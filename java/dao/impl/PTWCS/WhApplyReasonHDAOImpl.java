package com.doc.common.dao.impl; 
 
public class WhApplyReasonHDAOImpl extends GeneralDAOImpl<WhApplyReasonHPo> implements WhApplyReasonHDAO { 
	public static final WhApplyReasonHDAOImpl INSTANCE = new WhApplyReasonHDAOImpl(); 
	public static final String TABLENAME = "WH_APPLY_REASON_H"; 

	public WhApplyReasonHDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<WhApplyReasonHPo> CONVERTER = new MapConverter<WhApplyReasonHPo>() { 
 
		@Override 
		public WhApplyReasonHPo convert(final DataObject dataObject) { 
			final WhApplyReasonHPo whApplyReasonHPo = new WhApplyReasonHPo(); 
			whApplyReasonHPo.setRecordNo(dataObject.getString(WhApplyReasonHPo.COLUMNS.RECORD_NO.name())); 
			whApplyReasonHPo.setWhApplySerNo(dataObject.getString(WhApplyReasonHPo.COLUMNS.WH_APPLY_SER_NO.name())); 
			whApplyReasonHPo.setWhReasonType(dataObject.getString(WhApplyReasonHPo.COLUMNS.WH_REASON_TYPE.name())); 
			whApplyReasonHPo.setWhReasonId(dataObject.getString(WhApplyReasonHPo.COLUMNS.WH_REASON_ID.name())); 
			whApplyReasonHPo.setWhReasonComment(dataObject.getString(WhApplyReasonHPo.COLUMNS.WH_REASON_COMMENT.name())); 
			return whApplyReasonHPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final WhApplyReasonHPo whApplyReasonHPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WhApplyReasonHPo.COLUMNS.RECORD_NO.name(), whApplyReasonHPo.getRecordNo()); 
			dataObject.setValue(WhApplyReasonHPo.COLUMNS.WH_APPLY_SER_NO.name(), whApplyReasonHPo.getWhApplySerNo()); 
			dataObject.setValue(WhApplyReasonHPo.COLUMNS.WH_REASON_TYPE.name(), whApplyReasonHPo.getWhReasonType()); 
			dataObject.setValue(WhApplyReasonHPo.COLUMNS.WH_REASON_ID.name(), whApplyReasonHPo.getWhReasonId()); 
			dataObject.setValue(WhApplyReasonHPo.COLUMNS.WH_REASON_COMMENT.name(), whApplyReasonHPo.getWhReasonComment()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<WhApplyReasonHPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(WhApplyReasonHPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(WhApplyReasonHPo.COLUMNS.RECORD_NO.name(), po.getRecordNo()); 
		sqlWhere.add(WhApplyReasonHPo.COLUMNS.WH_APPLY_SER_NO.name(), po.getWhApplySerNo()); 
		sqlWhere.add(WhApplyReasonHPo.COLUMNS.WH_REASON_TYPE.name(), po.getWhReasonType()); 
		sqlWhere.add(WhApplyReasonHPo.COLUMNS.WH_REASON_ID.name(), po.getWhReasonId()); 
		return sqlWhere; 
	} 
 
} 
