package com.doc.common.dao.impl; 
 
public class Bin$tiauzkafaw7gu6wfrjiyka==$0DAOImpl extends GeneralDAOImpl<Bin$tiauzkafaw7gu6wfrjiyka==$0Po> implements Bin$tiauzkafaw7gu6wfrjiyka==$0DAO { 
	public static final Bin$tiauzkafaw7gu6wfrjiyka==$0DAOImpl INSTANCE = new Bin$tiauzkafaw7gu6wfrjiyka==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$TIAUZKAFAW7GU6WFRJIYKA==$0"; 

	public Bin$tiauzkafaw7gu6wfrjiyka==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$tiauzkafaw7gu6wfrjiyka==$0Po> CONVERTER = new MapConverter<Bin$tiauzkafaw7gu6wfrjiyka==$0Po>() { 
 
		@Override 
		public Bin$tiauzkafaw7gu6wfrjiyka==$0Po convert(final DataObject dataObject) { 
			final Bin$tiauzkafaw7gu6wfrjiyka==$0Po bin$tiauzkafaw7gu6wfrjiyka==$0Po = new Bin$tiauzkafaw7gu6wfrjiyka==$0Po(); 
			return bin$tiauzkafaw7gu6wfrjiyka==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$tiauzkafaw7gu6wfrjiyka==$0Po bin$tiauzkafaw7gu6wfrjiyka==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$tiauzkafaw7gu6wfrjiyka==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$tiauzkafaw7gu6wfrjiyka==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
