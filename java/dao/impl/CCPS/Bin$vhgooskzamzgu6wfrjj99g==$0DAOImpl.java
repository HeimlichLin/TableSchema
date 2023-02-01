package com.doc.common.dao.impl; 
 
public class Bin$vhgooskzamzgu6wfrjj99g==$0DAOImpl extends GeneralDAOImpl<Bin$vhgooskzamzgu6wfrjj99g==$0Po> implements Bin$vhgooskzamzgu6wfrjj99g==$0DAO { 
	public static final Bin$vhgooskzamzgu6wfrjj99g==$0DAOImpl INSTANCE = new Bin$vhgooskzamzgu6wfrjj99g==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$VHGOOSKZAMZGU6WFRJJ99G==$0"; 

	public Bin$vhgooskzamzgu6wfrjj99g==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$vhgooskzamzgu6wfrjj99g==$0Po> CONVERTER = new MapConverter<Bin$vhgooskzamzgu6wfrjj99g==$0Po>() { 
 
		@Override 
		public Bin$vhgooskzamzgu6wfrjj99g==$0Po convert(final DataObject dataObject) { 
			final Bin$vhgooskzamzgu6wfrjj99g==$0Po bin$vhgooskzamzgu6wfrjj99g==$0Po = new Bin$vhgooskzamzgu6wfrjj99g==$0Po(); 
			return bin$vhgooskzamzgu6wfrjj99g==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$vhgooskzamzgu6wfrjj99g==$0Po bin$vhgooskzamzgu6wfrjj99g==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$vhgooskzamzgu6wfrjj99g==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$vhgooskzamzgu6wfrjj99g==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
