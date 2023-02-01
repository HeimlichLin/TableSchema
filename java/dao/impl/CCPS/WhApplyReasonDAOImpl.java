package com.doc.common.dao.impl; 
 
public class WhApplyReasonDAOImpl extends GeneralDAOImpl<WhApplyReasonPo> implements WhApplyReasonDAO { 
	public static final WhApplyReasonDAOImpl INSTANCE = new WhApplyReasonDAOImpl(); 
	public static final String TABLENAME = "WH_APPLY_REASON"; 

	public WhApplyReasonDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<WhApplyReasonPo> CONVERTER = new MapConverter<WhApplyReasonPo>() { 
 
		@Override 
		public WhApplyReasonPo convert(final DataObject dataObject) { 
			final WhApplyReasonPo whApplyReasonPo = new WhApplyReasonPo(); 
			whApplyReasonPo.setWhApplySerNo(dataObject.getString(WhApplyReasonPo.COLUMNS.WH_APPLY_SER_NO.name())); 
			whApplyReasonPo.setWhReasonType(dataObject.getString(WhApplyReasonPo.COLUMNS.WH_REASON_TYPE.name())); 
			whApplyReasonPo.setWhReasonId(dataObject.getString(WhApplyReasonPo.COLUMNS.WH_REASON_ID.name())); 
			whApplyReasonPo.setWhReasonComment(dataObject.getString(WhApplyReasonPo.COLUMNS.WH_REASON_COMMENT.name())); 
			return whApplyReasonPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final WhApplyReasonPo whApplyReasonPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WhApplyReasonPo.COLUMNS.WH_APPLY_SER_NO.name(), whApplyReasonPo.getWhApplySerNo()); 
			dataObject.setValue(WhApplyReasonPo.COLUMNS.WH_REASON_TYPE.name(), whApplyReasonPo.getWhReasonType()); 
			dataObject.setValue(WhApplyReasonPo.COLUMNS.WH_REASON_ID.name(), whApplyReasonPo.getWhReasonId()); 
			dataObject.setValue(WhApplyReasonPo.COLUMNS.WH_REASON_COMMENT.name(), whApplyReasonPo.getWhReasonComment()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<WhApplyReasonPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(WhApplyReasonPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(WhApplyReasonPo.COLUMNS.WH_APPLY_SER_NO.name(), po.getWhApplySerNo()); 
		sqlWhere.add(WhApplyReasonPo.COLUMNS.WH_REASON_TYPE.name(), po.getWhReasonType()); 
		sqlWhere.add(WhApplyReasonPo.COLUMNS.WH_REASON_ID.name(), po.getWhReasonId()); 
		return sqlWhere; 
	} 
 
} 
