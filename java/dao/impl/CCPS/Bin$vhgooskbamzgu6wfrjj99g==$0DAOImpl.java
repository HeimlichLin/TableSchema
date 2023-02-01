package com.doc.common.dao.impl; 
 
public class Bin$vhgooskbamzgu6wfrjj99g==$0DAOImpl extends GeneralDAOImpl<Bin$vhgooskbamzgu6wfrjj99g==$0Po> implements Bin$vhgooskbamzgu6wfrjj99g==$0DAO { 
	public static final Bin$vhgooskbamzgu6wfrjj99g==$0DAOImpl INSTANCE = new Bin$vhgooskbamzgu6wfrjj99g==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$VHGOOSKBAMZGU6WFRJJ99G==$0"; 

	public Bin$vhgooskbamzgu6wfrjj99g==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$vhgooskbamzgu6wfrjj99g==$0Po> CONVERTER = new MapConverter<Bin$vhgooskbamzgu6wfrjj99g==$0Po>() { 
 
		@Override 
		public Bin$vhgooskbamzgu6wfrjj99g==$0Po convert(final DataObject dataObject) { 
			final Bin$vhgooskbamzgu6wfrjj99g==$0Po bin$vhgooskbamzgu6wfrjj99g==$0Po = new Bin$vhgooskbamzgu6wfrjj99g==$0Po(); 
			return bin$vhgooskbamzgu6wfrjj99g==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$vhgooskbamzgu6wfrjj99g==$0Po bin$vhgooskbamzgu6wfrjj99g==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$vhgooskbamzgu6wfrjj99g==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$vhgooskbamzgu6wfrjj99g==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
