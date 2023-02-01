package com.doc.common.dao.impl; 
 
public class WhRecDAOImpl extends GeneralDAOImpl<WhRecPo> implements WhRecDAO { 
	public static final WhRecDAOImpl INSTANCE = new WhRecDAOImpl(); 
	public static final String TABLENAME = "WH_REC"; 

	public WhRecDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<WhRecPo> CONVERTER = new MapConverter<WhRecPo>() { 
 
		@Override 
		public WhRecPo convert(final DataObject dataObject) { 
			final WhRecPo whRecPo = new WhRecPo(); 
			whRecPo.setWhRecSerNo(dataObject.getString(WhRecPo.COLUMNS.WH_REC_SER_NO.name())); 
			whRecPo.setAcId(dataObject.getString(WhRecPo.COLUMNS.AC_ID.name())); 
			whRecPo.setIcCode(dataObject.getString(WhRecPo.COLUMNS.IC_CODE.name())); 
			whRecPo.setWhDt(TimestampUtils.of(dataObject.getValue(WhRecPo.COLUMNS.WH_DT.name()))); 
			whRecPo.setComment(dataObject.getString(WhRecPo.COLUMNS.COMMENT.name())); 
			whRecPo.setWhApplySerNo(dataObject.getString(WhRecPo.COLUMNS.WH_APPLY_SER_NO.name())); 
			return whRecPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final WhRecPo whRecPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WhRecPo.COLUMNS.WH_REC_SER_NO.name(), whRecPo.getWhRecSerNo()); 
			dataObject.setValue(WhRecPo.COLUMNS.AC_ID.name(), whRecPo.getAcId()); 
			dataObject.setValue(WhRecPo.COLUMNS.IC_CODE.name(), whRecPo.getIcCode()); 
			dataObject.setValue(WhRecPo.COLUMNS.WH_DT.name(), whRecPo.getWhDt()); 
			dataObject.setValue(WhRecPo.COLUMNS.COMMENT.name(), whRecPo.getComment()); 
			dataObject.setValue(WhRecPo.COLUMNS.WH_APPLY_SER_NO.name(), whRecPo.getWhApplySerNo()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<WhRecPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(WhRecPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(WhRecPo.COLUMNS.WH_REC_SER_NO.name(), po.getWhRecSerNo()); 
		return sqlWhere; 
	} 
 
} 
