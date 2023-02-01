package com.doc.common.dao.impl; 
 
public class Im5105mNDAOImpl extends GeneralDAOImpl<Im5105mNPo> implements Im5105mNDAO { 
	public static final Im5105mNDAOImpl INSTANCE = new Im5105mNDAOImpl(); 
	public static final String TABLENAME = "IM_5105M_N"; 

	public Im5105mNDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Im5105mNPo> CONVERTER = new MapConverter<Im5105mNPo>() { 
 
		@Override 
		public Im5105mNPo convert(final DataObject dataObject) { 
			final Im5105mNPo im5105mNPo = new Im5105mNPo(); 
			im5105mNPo.setInBondWarehouseNo(dataObject.getString(Im5105mNPo.COLUMNS.IN_BOND_WAREHOUSE_NO.name())); 
			im5105mNPo.setDeclNo(dataObject.getString(Im5105mNPo.COLUMNS.DECL_NO.name())); 
			im5105mNPo.setDeclType(dataObject.getString(Im5105mNPo.COLUMNS.DECL_TYPE.name())); 
			im5105mNPo.setAsType(dataObject.getString(Im5105mNPo.COLUMNS.AS_TYPE.name())); 
			im5105mNPo.setDeclDate(dataObject.getString(Im5105mNPo.COLUMNS.DECL_DATE.name())); 
			im5105mNPo.setLoadPortCode(dataObject.getString(Im5105mNPo.COLUMNS.LOAD_PORT_CODE.name())); 
			im5105mNPo.setDutyPayerId(dataObject.getString(Im5105mNPo.COLUMNS.DUTY_PAYER_ID.name())); 
			return im5105mNPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Im5105mNPo im5105mNPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Im5105mNPo.COLUMNS.IN_BOND_WAREHOUSE_NO.name(), im5105mNPo.getInBondWarehouseNo()); 
			dataObject.setValue(Im5105mNPo.COLUMNS.DECL_NO.name(), im5105mNPo.getDeclNo()); 
			dataObject.setValue(Im5105mNPo.COLUMNS.DECL_TYPE.name(), im5105mNPo.getDeclType()); 
			dataObject.setValue(Im5105mNPo.COLUMNS.AS_TYPE.name(), im5105mNPo.getAsType()); 
			dataObject.setValue(Im5105mNPo.COLUMNS.DECL_DATE.name(), im5105mNPo.getDeclDate()); 
			dataObject.setValue(Im5105mNPo.COLUMNS.LOAD_PORT_CODE.name(), im5105mNPo.getLoadPortCode()); 
			dataObject.setValue(Im5105mNPo.COLUMNS.DUTY_PAYER_ID.name(), im5105mNPo.getDutyPayerId()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Im5105mNPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Im5105mNPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Im5105mNPo.COLUMNS.DECL_NO.name(), po.getDeclNo()); 
		return sqlWhere; 
	} 
 
} 
