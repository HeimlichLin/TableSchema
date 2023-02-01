package com.doc.common.dao.impl; 
 
public class WhApplyAcHDAOImpl extends GeneralDAOImpl<WhApplyAcHPo> implements WhApplyAcHDAO { 
	public static final WhApplyAcHDAOImpl INSTANCE = new WhApplyAcHDAOImpl(); 
	public static final String TABLENAME = "WH_APPLY_AC_H"; 

	public WhApplyAcHDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<WhApplyAcHPo> CONVERTER = new MapConverter<WhApplyAcHPo>() { 
 
		@Override 
		public WhApplyAcHPo convert(final DataObject dataObject) { 
			final WhApplyAcHPo whApplyAcHPo = new WhApplyAcHPo(); 
			whApplyAcHPo.setRecordNo(dataObject.getString(WhApplyAcHPo.COLUMNS.RECORD_NO.name())); 
			whApplyAcHPo.setWhApplySerNo(dataObject.getString(WhApplyAcHPo.COLUMNS.WH_APPLY_SER_NO.name())); 
			whApplyAcHPo.setWhCode(dataObject.getString(WhApplyAcHPo.COLUMNS.WH_CODE.name())); 
			whApplyAcHPo.setAcId(dataObject.getString(WhApplyAcHPo.COLUMNS.AC_ID.name())); 
			return whApplyAcHPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final WhApplyAcHPo whApplyAcHPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WhApplyAcHPo.COLUMNS.RECORD_NO.name(), whApplyAcHPo.getRecordNo()); 
			dataObject.setValue(WhApplyAcHPo.COLUMNS.WH_APPLY_SER_NO.name(), whApplyAcHPo.getWhApplySerNo()); 
			dataObject.setValue(WhApplyAcHPo.COLUMNS.WH_CODE.name(), whApplyAcHPo.getWhCode()); 
			dataObject.setValue(WhApplyAcHPo.COLUMNS.AC_ID.name(), whApplyAcHPo.getAcId()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<WhApplyAcHPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(WhApplyAcHPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(WhApplyAcHPo.COLUMNS.RECORD_NO.name(), po.getRecordNo()); 
		sqlWhere.add(WhApplyAcHPo.COLUMNS.WH_APPLY_SER_NO.name(), po.getWhApplySerNo()); 
		sqlWhere.add(WhApplyAcHPo.COLUMNS.WH_CODE.name(), po.getWhCode()); 
		sqlWhere.add(WhApplyAcHPo.COLUMNS.AC_ID.name(), po.getAcId()); 
		return sqlWhere; 
	} 
 
} 
