package com.doc.common.dao.impl; 
 
public class Bin$tiauzkcoaw7gu6wfrjiyka==$0DAOImpl extends GeneralDAOImpl<Bin$tiauzkcoaw7gu6wfrjiyka==$0Po> implements Bin$tiauzkcoaw7gu6wfrjiyka==$0DAO { 
	public static final Bin$tiauzkcoaw7gu6wfrjiyka==$0DAOImpl INSTANCE = new Bin$tiauzkcoaw7gu6wfrjiyka==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$TIAUZKCOAW7GU6WFRJIYKA==$0"; 

	public Bin$tiauzkcoaw7gu6wfrjiyka==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$tiauzkcoaw7gu6wfrjiyka==$0Po> CONVERTER = new MapConverter<Bin$tiauzkcoaw7gu6wfrjiyka==$0Po>() { 
 
		@Override 
		public Bin$tiauzkcoaw7gu6wfrjiyka==$0Po convert(final DataObject dataObject) { 
			final Bin$tiauzkcoaw7gu6wfrjiyka==$0Po bin$tiauzkcoaw7gu6wfrjiyka==$0Po = new Bin$tiauzkcoaw7gu6wfrjiyka==$0Po(); 
			return bin$tiauzkcoaw7gu6wfrjiyka==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$tiauzkcoaw7gu6wfrjiyka==$0Po bin$tiauzkcoaw7gu6wfrjiyka==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$tiauzkcoaw7gu6wfrjiyka==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$tiauzkcoaw7gu6wfrjiyka==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
