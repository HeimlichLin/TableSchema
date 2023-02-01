package com.doc.common.dao.impl; 
 
public class Bin$vhgooskgamzgu6wfrjj99g==$0DAOImpl extends GeneralDAOImpl<Bin$vhgooskgamzgu6wfrjj99g==$0Po> implements Bin$vhgooskgamzgu6wfrjj99g==$0DAO { 
	public static final Bin$vhgooskgamzgu6wfrjj99g==$0DAOImpl INSTANCE = new Bin$vhgooskgamzgu6wfrjj99g==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$VHGOOSKGAMZGU6WFRJJ99G==$0"; 

	public Bin$vhgooskgamzgu6wfrjj99g==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$vhgooskgamzgu6wfrjj99g==$0Po> CONVERTER = new MapConverter<Bin$vhgooskgamzgu6wfrjj99g==$0Po>() { 
 
		@Override 
		public Bin$vhgooskgamzgu6wfrjj99g==$0Po convert(final DataObject dataObject) { 
			final Bin$vhgooskgamzgu6wfrjj99g==$0Po bin$vhgooskgamzgu6wfrjj99g==$0Po = new Bin$vhgooskgamzgu6wfrjj99g==$0Po(); 
			return bin$vhgooskgamzgu6wfrjj99g==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$vhgooskgamzgu6wfrjj99g==$0Po bin$vhgooskgamzgu6wfrjj99g==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$vhgooskgamzgu6wfrjj99g==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$vhgooskgamzgu6wfrjj99g==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
