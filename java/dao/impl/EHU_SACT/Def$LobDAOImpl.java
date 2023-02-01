package com.doc.common.dao.impl; 
 
public class Def$LobDAOImpl extends GeneralDAOImpl<Def$LobPo> implements IDef$LobDAO { 
	public static final Def$LobDAOImpl INSTANCE = new Def$LobDAOImpl(); 
	public static final String TABLENAME = "DEF$_LOB"; 

	public Def$LobDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Def$LobPo> CONVERTER = new MapConverter<Def$LobPo>() { 
 
		@Override 
		public Def$LobPo convert(final DataObject dataObject) { 
			final Def$LobPo def$LobPo = new Def$LobPo(); 
			def$LobPo.setId(); 
			def$LobPo.setEnqTid(dataObject.getString(Def$LobPo.COLUMNS.ENQ_TID.name())); 
			def$LobPo.setBlobCol(); 
			def$LobPo.setClobCol(); 
			def$LobPo.setNclobCol(); 
			return def$LobPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Def$LobPo def$LobPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Def$LobPo.COLUMNS.ID.name(), def$LobPo.getId()); 
			dataObject.setValue(Def$LobPo.COLUMNS.ENQ_TID.name(), def$LobPo.getEnqTid()); 
			dataObject.setValue(Def$LobPo.COLUMNS.BLOB_COL.name(), def$LobPo.getBlobCol()); 
			dataObject.setValue(Def$LobPo.COLUMNS.CLOB_COL.name(), def$LobPo.getClobCol()); 
			dataObject.setValue(Def$LobPo.COLUMNS.NCLOB_COL.name(), def$LobPo.getNclobCol()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Def$LobPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Def$LobPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Def$LobPo.COLUMNS.ID.name(), po.getId()); 
		return sqlWhere; 
	} 
 
} 
