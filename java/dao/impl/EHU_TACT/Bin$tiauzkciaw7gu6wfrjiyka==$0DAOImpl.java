package com.doc.common.dao.impl; 
 
public class Bin$tiauzkciaw7gu6wfrjiyka==$0DAOImpl extends GeneralDAOImpl<Bin$tiauzkciaw7gu6wfrjiyka==$0Po> implements Bin$tiauzkciaw7gu6wfrjiyka==$0DAO { 
	public static final Bin$tiauzkciaw7gu6wfrjiyka==$0DAOImpl INSTANCE = new Bin$tiauzkciaw7gu6wfrjiyka==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$TIAUZKCIAW7GU6WFRJIYKA==$0"; 

	public Bin$tiauzkciaw7gu6wfrjiyka==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$tiauzkciaw7gu6wfrjiyka==$0Po> CONVERTER = new MapConverter<Bin$tiauzkciaw7gu6wfrjiyka==$0Po>() { 
 
		@Override 
		public Bin$tiauzkciaw7gu6wfrjiyka==$0Po convert(final DataObject dataObject) { 
			final Bin$tiauzkciaw7gu6wfrjiyka==$0Po bin$tiauzkciaw7gu6wfrjiyka==$0Po = new Bin$tiauzkciaw7gu6wfrjiyka==$0Po(); 
			return bin$tiauzkciaw7gu6wfrjiyka==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$tiauzkciaw7gu6wfrjiyka==$0Po bin$tiauzkciaw7gu6wfrjiyka==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$tiauzkciaw7gu6wfrjiyka==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$tiauzkciaw7gu6wfrjiyka==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
