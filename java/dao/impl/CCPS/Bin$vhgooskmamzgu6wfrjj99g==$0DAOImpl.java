package com.doc.common.dao.impl; 
 
public class Bin$vhgooskmamzgu6wfrjj99g==$0DAOImpl extends GeneralDAOImpl<Bin$vhgooskmamzgu6wfrjj99g==$0Po> implements Bin$vhgooskmamzgu6wfrjj99g==$0DAO { 
	public static final Bin$vhgooskmamzgu6wfrjj99g==$0DAOImpl INSTANCE = new Bin$vhgooskmamzgu6wfrjj99g==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$VHGOOSKMAMZGU6WFRJJ99G==$0"; 

	public Bin$vhgooskmamzgu6wfrjj99g==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$vhgooskmamzgu6wfrjj99g==$0Po> CONVERTER = new MapConverter<Bin$vhgooskmamzgu6wfrjj99g==$0Po>() { 
 
		@Override 
		public Bin$vhgooskmamzgu6wfrjj99g==$0Po convert(final DataObject dataObject) { 
			final Bin$vhgooskmamzgu6wfrjj99g==$0Po bin$vhgooskmamzgu6wfrjj99g==$0Po = new Bin$vhgooskmamzgu6wfrjj99g==$0Po(); 
			return bin$vhgooskmamzgu6wfrjj99g==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$vhgooskmamzgu6wfrjj99g==$0Po bin$vhgooskmamzgu6wfrjj99g==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$vhgooskmamzgu6wfrjj99g==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$vhgooskmamzgu6wfrjj99g==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
