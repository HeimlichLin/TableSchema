package com.doc.common.dao.impl; 
 
public class WhApplyAcDAOImpl extends GeneralDAOImpl<WhApplyAcPo> implements WhApplyAcDAO { 
	public static final WhApplyAcDAOImpl INSTANCE = new WhApplyAcDAOImpl(); 
	public static final String TABLENAME = "WH_APPLY_AC"; 

	public WhApplyAcDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<WhApplyAcPo> CONVERTER = new MapConverter<WhApplyAcPo>() { 
 
		@Override 
		public WhApplyAcPo convert(final DataObject dataObject) { 
			final WhApplyAcPo whApplyAcPo = new WhApplyAcPo(); 
			whApplyAcPo.setWhApplySerNo(dataObject.getString(WhApplyAcPo.COLUMNS.WH_APPLY_SER_NO.name())); 
			whApplyAcPo.setWhCode(dataObject.getString(WhApplyAcPo.COLUMNS.WH_CODE.name())); 
			whApplyAcPo.setAcId(dataObject.getString(WhApplyAcPo.COLUMNS.AC_ID.name())); 
			return whApplyAcPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final WhApplyAcPo whApplyAcPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WhApplyAcPo.COLUMNS.WH_APPLY_SER_NO.name(), whApplyAcPo.getWhApplySerNo()); 
			dataObject.setValue(WhApplyAcPo.COLUMNS.WH_CODE.name(), whApplyAcPo.getWhCode()); 
			dataObject.setValue(WhApplyAcPo.COLUMNS.AC_ID.name(), whApplyAcPo.getAcId()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<WhApplyAcPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(WhApplyAcPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(WhApplyAcPo.COLUMNS.WH_APPLY_SER_NO.name(), po.getWhApplySerNo()); 
		sqlWhere.add(WhApplyAcPo.COLUMNS.WH_CODE.name(), po.getWhCode()); 
		sqlWhere.add(WhApplyAcPo.COLUMNS.AC_ID.name(), po.getAcId()); 
		return sqlWhere; 
	} 
 
} 
