package com.doc.common.dao.impl; 
 
public class OpconfigDAOImpl extends GeneralDAOImpl<OpconfigPo> implements OpconfigDAO { 
	public static final OpconfigDAOImpl INSTANCE = new OpconfigDAOImpl(); 
	public static final String TABLENAME = "OPCONFIG"; 

	public OpconfigDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<OpconfigPo> CONVERTER = new MapConverter<OpconfigPo>() { 
 
		@Override 
		public OpconfigPo convert(final DataObject dataObject) { 
			final OpconfigPo opconfigPo = new OpconfigPo(); 
			opconfigPo.setOpCode(dataObject.getString(OpconfigPo.COLUMNS.OP_CODE.name())); 
			opconfigPo.setOpComment(dataObject.getString(OpconfigPo.COLUMNS.OP_COMMENT.name())); 
			opconfigPo.setDesc(dataObject.getString(OpconfigPo.COLUMNS.DESC.name())); 
			return opconfigPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final OpconfigPo opconfigPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(OpconfigPo.COLUMNS.OP_CODE.name(), opconfigPo.getOpCode()); 
			dataObject.setValue(OpconfigPo.COLUMNS.OP_COMMENT.name(), opconfigPo.getOpComment()); 
			dataObject.setValue(OpconfigPo.COLUMNS.DESC.name(), opconfigPo.getDesc()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<OpconfigPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(OpconfigPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(OpconfigPo.COLUMNS.OP_CODE.name(), po.getOpCode()); 
		return sqlWhere; 
	} 
 
} 
