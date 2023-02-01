package com.doc.common.dao.impl; 
 
public class AcDataDAOImpl extends GeneralDAOImpl<AcDataPo> implements AcDataDAO { 
	public static final AcDataDAOImpl INSTANCE = new AcDataDAOImpl(); 
	public static final String TABLENAME = "AC_DATA"; 

	public AcDataDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<AcDataPo> CONVERTER = new MapConverter<AcDataPo>() { 
 
		@Override 
		public AcDataPo convert(final DataObject dataObject) { 
			final AcDataPo acDataPo = new AcDataPo(); 
			acDataPo.setWhCode(dataObject.getString(AcDataPo.COLUMNS.WH_CODE.name())); 
			acDataPo.setAcId(dataObject.getString(AcDataPo.COLUMNS.AC_ID.name())); 
			acDataPo.setStoreDesc(dataObject.getString(AcDataPo.COLUMNS.STORE_DESC.name())); 
			acDataPo.setContTel(dataObject.getString(AcDataPo.COLUMNS.CONT_TEL.name())); 
			acDataPo.setExpressGroup(dataObject.getString(AcDataPo.COLUMNS.EXPRESS_GROUP.name())); 
			acDataPo.setCancelMark(dataObject.getString(AcDataPo.COLUMNS.CANCEL_MARK.name())); 
			return acDataPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final AcDataPo acDataPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(AcDataPo.COLUMNS.WH_CODE.name(), acDataPo.getWhCode()); 
			dataObject.setValue(AcDataPo.COLUMNS.AC_ID.name(), acDataPo.getAcId()); 
			dataObject.setValue(AcDataPo.COLUMNS.STORE_DESC.name(), acDataPo.getStoreDesc()); 
			dataObject.setValue(AcDataPo.COLUMNS.CONT_TEL.name(), acDataPo.getContTel()); 
			dataObject.setValue(AcDataPo.COLUMNS.EXPRESS_GROUP.name(), acDataPo.getExpressGroup()); 
			dataObject.setValue(AcDataPo.COLUMNS.CANCEL_MARK.name(), acDataPo.getCancelMark()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<AcDataPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(AcDataPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(AcDataPo.COLUMNS.WH_CODE.name(), po.getWhCode()); 
		sqlWhere.add(AcDataPo.COLUMNS.AC_ID.name(), po.getAcId()); 
		return sqlWhere; 
	} 
 
} 
