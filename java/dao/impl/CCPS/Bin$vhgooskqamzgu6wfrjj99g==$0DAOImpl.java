package com.doc.common.dao.impl; 
 
public class Bin$vhgooskqamzgu6wfrjj99g==$0DAOImpl extends GeneralDAOImpl<Bin$vhgooskqamzgu6wfrjj99g==$0Po> implements Bin$vhgooskqamzgu6wfrjj99g==$0DAO { 
	public static final Bin$vhgooskqamzgu6wfrjj99g==$0DAOImpl INSTANCE = new Bin$vhgooskqamzgu6wfrjj99g==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$VHGOOSKQAMZGU6WFRJJ99G==$0"; 

	public Bin$vhgooskqamzgu6wfrjj99g==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$vhgooskqamzgu6wfrjj99g==$0Po> CONVERTER = new MapConverter<Bin$vhgooskqamzgu6wfrjj99g==$0Po>() { 
 
		@Override 
		public Bin$vhgooskqamzgu6wfrjj99g==$0Po convert(final DataObject dataObject) { 
			final Bin$vhgooskqamzgu6wfrjj99g==$0Po bin$vhgooskqamzgu6wfrjj99g==$0Po = new Bin$vhgooskqamzgu6wfrjj99g==$0Po(); 
			return bin$vhgooskqamzgu6wfrjj99g==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$vhgooskqamzgu6wfrjj99g==$0Po bin$vhgooskqamzgu6wfrjj99g==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$vhgooskqamzgu6wfrjj99g==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$vhgooskqamzgu6wfrjj99g==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
