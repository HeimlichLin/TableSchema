package com.doc.common.dao.impl; 
 
public class Bin$tiauzkdiaw7gu6wfrjiyka==$0DAOImpl extends GeneralDAOImpl<Bin$tiauzkdiaw7gu6wfrjiyka==$0Po> implements Bin$tiauzkdiaw7gu6wfrjiyka==$0DAO { 
	public static final Bin$tiauzkdiaw7gu6wfrjiyka==$0DAOImpl INSTANCE = new Bin$tiauzkdiaw7gu6wfrjiyka==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$TIAUZKDIAW7GU6WFRJIYKA==$0"; 

	public Bin$tiauzkdiaw7gu6wfrjiyka==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$tiauzkdiaw7gu6wfrjiyka==$0Po> CONVERTER = new MapConverter<Bin$tiauzkdiaw7gu6wfrjiyka==$0Po>() { 
 
		@Override 
		public Bin$tiauzkdiaw7gu6wfrjiyka==$0Po convert(final DataObject dataObject) { 
			final Bin$tiauzkdiaw7gu6wfrjiyka==$0Po bin$tiauzkdiaw7gu6wfrjiyka==$0Po = new Bin$tiauzkdiaw7gu6wfrjiyka==$0Po(); 
			return bin$tiauzkdiaw7gu6wfrjiyka==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$tiauzkdiaw7gu6wfrjiyka==$0Po bin$tiauzkdiaw7gu6wfrjiyka==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$tiauzkdiaw7gu6wfrjiyka==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$tiauzkdiaw7gu6wfrjiyka==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
