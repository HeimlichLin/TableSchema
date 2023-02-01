package com.doc.common.dao.impl; 
 
public class Ex5203mNDAOImpl extends GeneralDAOImpl<Ex5203mNPo> implements Ex5203mNDAO { 
	public static final Ex5203mNDAOImpl INSTANCE = new Ex5203mNDAOImpl(); 
	public static final String TABLENAME = "EX_5203M_N"; 

	public Ex5203mNDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Ex5203mNPo> CONVERTER = new MapConverter<Ex5203mNPo>() { 
 
		@Override 
		public Ex5203mNPo convert(final DataObject dataObject) { 
			final Ex5203mNPo ex5203mNPo = new Ex5203mNPo(); 
			ex5203mNPo.setOutBondWarehouseNo(dataObject.getString(Ex5203mNPo.COLUMNS.OUT_BOND_WAREHOUSE_NO.name())); 
			ex5203mNPo.setDeclNo(dataObject.getString(Ex5203mNPo.COLUMNS.DECL_NO.name())); 
			ex5203mNPo.setDeclType(dataObject.getString(Ex5203mNPo.COLUMNS.DECL_TYPE.name())); 
			ex5203mNPo.setAsType(dataObject.getString(Ex5203mNPo.COLUMNS.AS_TYPE.name())); 
			ex5203mNPo.setDeclDate(dataObject.getString(Ex5203mNPo.COLUMNS.DECL_DATE.name())); 
			ex5203mNPo.setDestinationCode(dataObject.getString(Ex5203mNPo.COLUMNS.DESTINATION_CODE.name())); 
			ex5203mNPo.setExporterId(dataObject.getString(Ex5203mNPo.COLUMNS.EXPORTER_ID.name())); 
			return ex5203mNPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Ex5203mNPo ex5203mNPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Ex5203mNPo.COLUMNS.OUT_BOND_WAREHOUSE_NO.name(), ex5203mNPo.getOutBondWarehouseNo()); 
			dataObject.setValue(Ex5203mNPo.COLUMNS.DECL_NO.name(), ex5203mNPo.getDeclNo()); 
			dataObject.setValue(Ex5203mNPo.COLUMNS.DECL_TYPE.name(), ex5203mNPo.getDeclType()); 
			dataObject.setValue(Ex5203mNPo.COLUMNS.AS_TYPE.name(), ex5203mNPo.getAsType()); 
			dataObject.setValue(Ex5203mNPo.COLUMNS.DECL_DATE.name(), ex5203mNPo.getDeclDate()); 
			dataObject.setValue(Ex5203mNPo.COLUMNS.DESTINATION_CODE.name(), ex5203mNPo.getDestinationCode()); 
			dataObject.setValue(Ex5203mNPo.COLUMNS.EXPORTER_ID.name(), ex5203mNPo.getExporterId()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Ex5203mNPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Ex5203mNPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Ex5203mNPo.COLUMNS.DECL_NO.name(), po.getDeclNo()); 
		return sqlWhere; 
	} 
 
} 
