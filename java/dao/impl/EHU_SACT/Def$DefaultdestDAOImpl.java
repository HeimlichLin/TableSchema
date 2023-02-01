package com.doc.common.dao.impl; 
 
public class Def$DefaultdestDAOImpl extends GeneralDAOImpl<Def$DefaultdestPo> implements IDef$DefaultdestDAO { 
	public static final Def$DefaultdestDAOImpl INSTANCE = new Def$DefaultdestDAOImpl(); 
	public static final String TABLENAME = "DEF$_DEFAULTDEST"; 

	public Def$DefaultdestDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Def$DefaultdestPo> CONVERTER = new MapConverter<Def$DefaultdestPo>() { 
 
		@Override 
		public Def$DefaultdestPo convert(final DataObject dataObject) { 
			final Def$DefaultdestPo def$DefaultdestPo = new Def$DefaultdestPo(); 
			def$DefaultdestPo.setDblink(dataObject.getString(Def$DefaultdestPo.COLUMNS.DBLINK.name())); 
			return def$DefaultdestPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Def$DefaultdestPo def$DefaultdestPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Def$DefaultdestPo.COLUMNS.DBLINK.name(), def$DefaultdestPo.getDblink()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Def$DefaultdestPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Def$DefaultdestPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Def$DefaultdestPo.COLUMNS.DBLINK.name(), po.getDblink()); 
		return sqlWhere; 
	} 
 
} 
