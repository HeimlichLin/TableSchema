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
			whRecPo.setDocType(dataObject.getString(WhRecPo.COLUMNS.DOC_TYPE.name())); 
			whRecPo.setDocNo(dataObject.getString(WhRecPo.COLUMNS.DOC_NO.name())); 
			whRecPo.setIcNo(dataObject.getString(WhRecPo.COLUMNS.IC_NO.name())); 
			whRecPo.setWhDt(TimestampUtils.of(dataObject.getValue(WhRecPo.COLUMNS.WH_DT.name()))); 
			whRecPo.setWhComment(dataObject.getString(WhRecPo.COLUMNS.WH_COMMENT.name())); 
			whRecPo.setWhApplySerNo(dataObject.getString(WhRecPo.COLUMNS.WH_APPLY_SER_NO.name())); 
			whRecPo.setWriteType(dataObject.getString(WhRecPo.COLUMNS.WRITE_TYPE.name())); 
			whRecPo.setIoType(dataObject.getString(WhRecPo.COLUMNS.IO_TYPE.name())); 
			return whRecPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final WhRecPo whRecPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WhRecPo.COLUMNS.WH_REC_SER_NO.name(), whRecPo.getWhRecSerNo()); 
			dataObject.setValue(WhRecPo.COLUMNS.AC_ID.name(), whRecPo.getAcId()); 
			dataObject.setValue(WhRecPo.COLUMNS.DOC_TYPE.name(), whRecPo.getDocType()); 
			dataObject.setValue(WhRecPo.COLUMNS.DOC_NO.name(), whRecPo.getDocNo()); 
			dataObject.setValue(WhRecPo.COLUMNS.IC_NO.name(), whRecPo.getIcNo()); 
			dataObject.setValue(WhRecPo.COLUMNS.WH_DT.name(), whRecPo.getWhDt()); 
			dataObject.setValue(WhRecPo.COLUMNS.WH_COMMENT.name(), whRecPo.getWhComment()); 
			dataObject.setValue(WhRecPo.COLUMNS.WH_APPLY_SER_NO.name(), whRecPo.getWhApplySerNo()); 
			dataObject.setValue(WhRecPo.COLUMNS.WRITE_TYPE.name(), whRecPo.getWriteType()); 
			dataObject.setValue(WhRecPo.COLUMNS.IO_TYPE.name(), whRecPo.getIoType()); 
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
