package com.doc.common.dao.impl; 
 
public class Bin$tiauzkdhaw7gu6wfrjiyka==$0DAOImpl extends GeneralDAOImpl<Bin$tiauzkdhaw7gu6wfrjiyka==$0Po> implements Bin$tiauzkdhaw7gu6wfrjiyka==$0DAO { 
	public static final Bin$tiauzkdhaw7gu6wfrjiyka==$0DAOImpl INSTANCE = new Bin$tiauzkdhaw7gu6wfrjiyka==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$TIAUZKDHAW7GU6WFRJIYKA==$0"; 

	public Bin$tiauzkdhaw7gu6wfrjiyka==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$tiauzkdhaw7gu6wfrjiyka==$0Po> CONVERTER = new MapConverter<Bin$tiauzkdhaw7gu6wfrjiyka==$0Po>() { 
 
		@Override 
		public Bin$tiauzkdhaw7gu6wfrjiyka==$0Po convert(final DataObject dataObject) { 
			final Bin$tiauzkdhaw7gu6wfrjiyka==$0Po bin$tiauzkdhaw7gu6wfrjiyka==$0Po = new Bin$tiauzkdhaw7gu6wfrjiyka==$0Po(); 
			return bin$tiauzkdhaw7gu6wfrjiyka==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$tiauzkdhaw7gu6wfrjiyka==$0Po bin$tiauzkdhaw7gu6wfrjiyka==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$tiauzkdhaw7gu6wfrjiyka==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$tiauzkdhaw7gu6wfrjiyka==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
