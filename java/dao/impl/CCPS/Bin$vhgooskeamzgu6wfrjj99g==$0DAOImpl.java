package com.doc.common.dao.impl; 
 
public class Bin$vhgooskeamzgu6wfrjj99g==$0DAOImpl extends GeneralDAOImpl<Bin$vhgooskeamzgu6wfrjj99g==$0Po> implements Bin$vhgooskeamzgu6wfrjj99g==$0DAO { 
	public static final Bin$vhgooskeamzgu6wfrjj99g==$0DAOImpl INSTANCE = new Bin$vhgooskeamzgu6wfrjj99g==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$VHGOOSKEAMZGU6WFRJJ99G==$0"; 

	public Bin$vhgooskeamzgu6wfrjj99g==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$vhgooskeamzgu6wfrjj99g==$0Po> CONVERTER = new MapConverter<Bin$vhgooskeamzgu6wfrjj99g==$0Po>() { 
 
		@Override 
		public Bin$vhgooskeamzgu6wfrjj99g==$0Po convert(final DataObject dataObject) { 
			final Bin$vhgooskeamzgu6wfrjj99g==$0Po bin$vhgooskeamzgu6wfrjj99g==$0Po = new Bin$vhgooskeamzgu6wfrjj99g==$0Po(); 
			return bin$vhgooskeamzgu6wfrjj99g==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$vhgooskeamzgu6wfrjj99g==$0Po bin$vhgooskeamzgu6wfrjj99g==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$vhgooskeamzgu6wfrjj99g==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$vhgooskeamzgu6wfrjj99g==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
