package com.doc.common.dao.impl; 
 
public class Bin$tiauzkbraw7gu6wfrjiyka==$0DAOImpl extends GeneralDAOImpl<Bin$tiauzkbraw7gu6wfrjiyka==$0Po> implements Bin$tiauzkbraw7gu6wfrjiyka==$0DAO { 
	public static final Bin$tiauzkbraw7gu6wfrjiyka==$0DAOImpl INSTANCE = new Bin$tiauzkbraw7gu6wfrjiyka==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$TIAUZKBRAW7GU6WFRJIYKA==$0"; 

	public Bin$tiauzkbraw7gu6wfrjiyka==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$tiauzkbraw7gu6wfrjiyka==$0Po> CONVERTER = new MapConverter<Bin$tiauzkbraw7gu6wfrjiyka==$0Po>() { 
 
		@Override 
		public Bin$tiauzkbraw7gu6wfrjiyka==$0Po convert(final DataObject dataObject) { 
			final Bin$tiauzkbraw7gu6wfrjiyka==$0Po bin$tiauzkbraw7gu6wfrjiyka==$0Po = new Bin$tiauzkbraw7gu6wfrjiyka==$0Po(); 
			return bin$tiauzkbraw7gu6wfrjiyka==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$tiauzkbraw7gu6wfrjiyka==$0Po bin$tiauzkbraw7gu6wfrjiyka==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$tiauzkbraw7gu6wfrjiyka==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$tiauzkbraw7gu6wfrjiyka==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
