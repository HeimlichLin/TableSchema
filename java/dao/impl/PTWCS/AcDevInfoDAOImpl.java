package com.doc.common.dao.impl; 
 
public class AcDevInfoDAOImpl extends GeneralDAOImpl<AcDevInfoPo> implements AcDevInfoDAO { 
	public static final AcDevInfoDAOImpl INSTANCE = new AcDevInfoDAOImpl(); 
	public static final String TABLENAME = "AC_DEV_INFO"; 

	public AcDevInfoDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<AcDevInfoPo> CONVERTER = new MapConverter<AcDevInfoPo>() { 
 
		@Override 
		public AcDevInfoPo convert(final DataObject dataObject) { 
			final AcDevInfoPo acDevInfoPo = new AcDevInfoPo(); 
			acDevInfoPo.setAcId(dataObject.getString(AcDevInfoPo.COLUMNS.AC_ID.name())); 
			acDevInfoPo.setWhCode(dataObject.getString(AcDevInfoPo.COLUMNS.WH_CODE.name())); 
			acDevInfoPo.setDevToken(dataObject.getString(AcDevInfoPo.COLUMNS.DEV_TOKEN.name())); 
			return acDevInfoPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final AcDevInfoPo acDevInfoPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(AcDevInfoPo.COLUMNS.AC_ID.name(), acDevInfoPo.getAcId()); 
			dataObject.setValue(AcDevInfoPo.COLUMNS.WH_CODE.name(), acDevInfoPo.getWhCode()); 
			dataObject.setValue(AcDevInfoPo.COLUMNS.DEV_TOKEN.name(), acDevInfoPo.getDevToken()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<AcDevInfoPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(AcDevInfoPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(AcDevInfoPo.COLUMNS.AC_ID.name(), po.getAcId()); 
		sqlWhere.add(AcDevInfoPo.COLUMNS.WH_CODE.name(), po.getWhCode()); 
		sqlWhere.add(AcDevInfoPo.COLUMNS.DEV_TOKEN.name(), po.getDevToken()); 
		return sqlWhere; 
	} 
 
} 
