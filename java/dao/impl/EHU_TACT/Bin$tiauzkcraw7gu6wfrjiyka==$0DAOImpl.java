package com.doc.common.dao.impl; 
 
public class Bin$tiauzkcraw7gu6wfrjiyka==$0DAOImpl extends GeneralDAOImpl<Bin$tiauzkcraw7gu6wfrjiyka==$0Po> implements Bin$tiauzkcraw7gu6wfrjiyka==$0DAO { 
	public static final Bin$tiauzkcraw7gu6wfrjiyka==$0DAOImpl INSTANCE = new Bin$tiauzkcraw7gu6wfrjiyka==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$TIAUZKCRAW7GU6WFRJIYKA==$0"; 

	public Bin$tiauzkcraw7gu6wfrjiyka==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$tiauzkcraw7gu6wfrjiyka==$0Po> CONVERTER = new MapConverter<Bin$tiauzkcraw7gu6wfrjiyka==$0Po>() { 
 
		@Override 
		public Bin$tiauzkcraw7gu6wfrjiyka==$0Po convert(final DataObject dataObject) { 
			final Bin$tiauzkcraw7gu6wfrjiyka==$0Po bin$tiauzkcraw7gu6wfrjiyka==$0Po = new Bin$tiauzkcraw7gu6wfrjiyka==$0Po(); 
			return bin$tiauzkcraw7gu6wfrjiyka==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$tiauzkcraw7gu6wfrjiyka==$0Po bin$tiauzkcraw7gu6wfrjiyka==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$tiauzkcraw7gu6wfrjiyka==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$tiauzkcraw7gu6wfrjiyka==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
