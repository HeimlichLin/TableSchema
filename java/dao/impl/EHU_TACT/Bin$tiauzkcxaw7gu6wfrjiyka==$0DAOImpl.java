package com.doc.common.dao.impl; 
 
public class Bin$tiauzkcxaw7gu6wfrjiyka==$0DAOImpl extends GeneralDAOImpl<Bin$tiauzkcxaw7gu6wfrjiyka==$0Po> implements Bin$tiauzkcxaw7gu6wfrjiyka==$0DAO { 
	public static final Bin$tiauzkcxaw7gu6wfrjiyka==$0DAOImpl INSTANCE = new Bin$tiauzkcxaw7gu6wfrjiyka==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$TIAUZKCXAW7GU6WFRJIYKA==$0"; 

	public Bin$tiauzkcxaw7gu6wfrjiyka==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$tiauzkcxaw7gu6wfrjiyka==$0Po> CONVERTER = new MapConverter<Bin$tiauzkcxaw7gu6wfrjiyka==$0Po>() { 
 
		@Override 
		public Bin$tiauzkcxaw7gu6wfrjiyka==$0Po convert(final DataObject dataObject) { 
			final Bin$tiauzkcxaw7gu6wfrjiyka==$0Po bin$tiauzkcxaw7gu6wfrjiyka==$0Po = new Bin$tiauzkcxaw7gu6wfrjiyka==$0Po(); 
			return bin$tiauzkcxaw7gu6wfrjiyka==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$tiauzkcxaw7gu6wfrjiyka==$0Po bin$tiauzkcxaw7gu6wfrjiyka==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$tiauzkcxaw7gu6wfrjiyka==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$tiauzkcxaw7gu6wfrjiyka==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
