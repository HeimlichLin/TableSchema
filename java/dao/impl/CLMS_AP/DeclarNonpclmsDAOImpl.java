package com.doc.common.dao.impl; 
 
public class DeclarNonpclmsDAOImpl extends GeneralDAOImpl<DeclarNonpclmsPo> implements DeclarNonpclmsDAO { 
	public static final DeclarNonpclmsDAOImpl INSTANCE = new DeclarNonpclmsDAOImpl(); 
	public static final String TABLENAME = "DECLAR_NONPCLMS"; 

	public DeclarNonpclmsDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DeclarNonpclmsPo> CONVERTER = new MapConverter<DeclarNonpclmsPo>() { 
 
		@Override 
		public DeclarNonpclmsPo convert(final DataObject dataObject) { 
			final DeclarNonpclmsPo declarNonpclmsPo = new DeclarNonpclmsPo(); 
			declarNonpclmsPo.setBondno(dataObject.getString(DeclarNonpclmsPo.COLUMNS.BONDNO.name())); 
			declarNonpclmsPo.setStrtype(dataObject.getString(DeclarNonpclmsPo.COLUMNS.STRTYPE.name())); 
			declarNonpclmsPo.setDeclno(dataObject.getString(DeclarNonpclmsPo.COLUMNS.DECLNO.name())); 
			declarNonpclmsPo.setUpdtime(dataObject.getString(DeclarNonpclmsPo.COLUMNS.UPDTIME.name())); 
			declarNonpclmsPo.setGdstype(dataObject.getString(DeclarNonpclmsPo.COLUMNS.GDSTYPE.name())); 
			return declarNonpclmsPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DeclarNonpclmsPo declarNonpclmsPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DeclarNonpclmsPo.COLUMNS.BONDNO.name(), declarNonpclmsPo.getBondno()); 
			dataObject.setValue(DeclarNonpclmsPo.COLUMNS.STRTYPE.name(), declarNonpclmsPo.getStrtype()); 
			dataObject.setValue(DeclarNonpclmsPo.COLUMNS.DECLNO.name(), declarNonpclmsPo.getDeclno()); 
			dataObject.setValue(DeclarNonpclmsPo.COLUMNS.UPDTIME.name(), declarNonpclmsPo.getUpdtime()); 
			dataObject.setValue(DeclarNonpclmsPo.COLUMNS.GDSTYPE.name(), declarNonpclmsPo.getGdstype()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DeclarNonpclmsPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DeclarNonpclmsPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
