package com.doc.common.dao.impl; 
 
public class DeclarNonpclmsDAO extends GeneralDAOImpl<DeclarNonpclmsDo> implements DeclarNonpclmsDAO { 
	public static final DeclarNonpclmsDAOImpl INSTANCE = new DeclarNonpclmsDAOImpl(); 
	public static final String TABLENAME = "DECLAR_NONPCLMS"; 

	public DeclarNonpclmsDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<DeclarNonpclmsDo> CONVERTER = new MapConverter<DeclarNonpclmsDo>() { 
 
		@Override 
		public DeclarNonpclmsDo convert(final DataObject dataObject) { 
			final DeclarNonpclmsDo declarNonpclmsDo = new DeclarNonpclmsDo(); 
			declarNonpclmsDo.setBondno(dataObject.getString(DeclarNonpclmsDo.COLUMNS.BONDNO.name())); 
			declarNonpclmsDo.setStrtype(dataObject.getString(DeclarNonpclmsDo.COLUMNS.STRTYPE.name())); 
			declarNonpclmsDo.setDeclno(dataObject.getString(DeclarNonpclmsDo.COLUMNS.DECLNO.name())); 
			declarNonpclmsDo.setUpdtime(dataObject.getString(DeclarNonpclmsDo.COLUMNS.UPDTIME.name())); 
			declarNonpclmsDo.setGdstype(dataObject.getString(DeclarNonpclmsDo.COLUMNS.GDSTYPE.name())); 
			return declarNonpclmsDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DeclarNonpclmsDo declarNonpclmsDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DeclarNonpclmsDo.COLUMNS.BONDNO.name(), declarNonpclmsDo.getBondno()); 
			dataObject.setValue(DeclarNonpclmsDo.COLUMNS.STRTYPE.name(), declarNonpclmsDo.getStrtype()); 
			dataObject.setValue(DeclarNonpclmsDo.COLUMNS.DECLNO.name(), declarNonpclmsDo.getDeclno()); 
			dataObject.setValue(DeclarNonpclmsDo.COLUMNS.UPDTIME.name(), declarNonpclmsDo.getUpdtime()); 
			dataObject.setValue(DeclarNonpclmsDo.COLUMNS.GDSTYPE.name(), declarNonpclmsDo.getGdstype()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DeclarNonpclmsDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DeclarNonpclmsDo po) { 
		sqlWhere.add(DeclarNonpclmsDo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(DeclarNonpclmsDo.COLUMNS.STRTYPE.name(), po.getStrtype()); 
		sqlWhere.add(DeclarNonpclmsDo.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(DeclarNonpclmsDo.COLUMNS.UPDTIME.name(), po.getUpdtime()); 
		sqlWhere.add(DeclarNonpclmsDo.COLUMNS.GDSTYPE.name(), po.getGdstype()); 
	} 
 
} 
