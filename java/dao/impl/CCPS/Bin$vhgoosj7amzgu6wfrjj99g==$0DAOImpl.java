package com.doc.common.dao.impl; 
 
public class Bin$vhgoosj7amzgu6wfrjj99g==$0DAOImpl extends GeneralDAOImpl<Bin$vhgoosj7amzgu6wfrjj99g==$0Po> implements Bin$vhgoosj7amzgu6wfrjj99g==$0DAO { 
	public static final Bin$vhgoosj7amzgu6wfrjj99g==$0DAOImpl INSTANCE = new Bin$vhgoosj7amzgu6wfrjj99g==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$VHGOOSJ7AMZGU6WFRJJ99G==$0"; 

	public Bin$vhgoosj7amzgu6wfrjj99g==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$vhgoosj7amzgu6wfrjj99g==$0Po> CONVERTER = new MapConverter<Bin$vhgoosj7amzgu6wfrjj99g==$0Po>() { 
 
		@Override 
		public Bin$vhgoosj7amzgu6wfrjj99g==$0Po convert(final DataObject dataObject) { 
			final Bin$vhgoosj7amzgu6wfrjj99g==$0Po bin$vhgoosj7amzgu6wfrjj99g==$0Po = new Bin$vhgoosj7amzgu6wfrjj99g==$0Po(); 
			return bin$vhgoosj7amzgu6wfrjj99g==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$vhgoosj7amzgu6wfrjj99g==$0Po bin$vhgoosj7amzgu6wfrjj99g==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$vhgoosj7amzgu6wfrjj99g==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$vhgoosj7amzgu6wfrjj99g==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
