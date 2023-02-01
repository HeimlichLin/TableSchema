package com.doc.common.dao.impl; 
 
public class Bin$tiauzkdvaw7gu6wfrjiyka==$0DAOImpl extends GeneralDAOImpl<Bin$tiauzkdvaw7gu6wfrjiyka==$0Po> implements Bin$tiauzkdvaw7gu6wfrjiyka==$0DAO { 
	public static final Bin$tiauzkdvaw7gu6wfrjiyka==$0DAOImpl INSTANCE = new Bin$tiauzkdvaw7gu6wfrjiyka==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$TIAUZKDVAW7GU6WFRJIYKA==$0"; 

	public Bin$tiauzkdvaw7gu6wfrjiyka==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$tiauzkdvaw7gu6wfrjiyka==$0Po> CONVERTER = new MapConverter<Bin$tiauzkdvaw7gu6wfrjiyka==$0Po>() { 
 
		@Override 
		public Bin$tiauzkdvaw7gu6wfrjiyka==$0Po convert(final DataObject dataObject) { 
			final Bin$tiauzkdvaw7gu6wfrjiyka==$0Po bin$tiauzkdvaw7gu6wfrjiyka==$0Po = new Bin$tiauzkdvaw7gu6wfrjiyka==$0Po(); 
			return bin$tiauzkdvaw7gu6wfrjiyka==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$tiauzkdvaw7gu6wfrjiyka==$0Po bin$tiauzkdvaw7gu6wfrjiyka==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$tiauzkdvaw7gu6wfrjiyka==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$tiauzkdvaw7gu6wfrjiyka==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
