package com.doc.common.dao.impl; 
 
public class Bin$vhgooskvamzgu6wfrjj99g==$0DAOImpl extends GeneralDAOImpl<Bin$vhgooskvamzgu6wfrjj99g==$0Po> implements Bin$vhgooskvamzgu6wfrjj99g==$0DAO { 
	public static final Bin$vhgooskvamzgu6wfrjj99g==$0DAOImpl INSTANCE = new Bin$vhgooskvamzgu6wfrjj99g==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$VHGOOSKVAMZGU6WFRJJ99G==$0"; 

	public Bin$vhgooskvamzgu6wfrjj99g==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$vhgooskvamzgu6wfrjj99g==$0Po> CONVERTER = new MapConverter<Bin$vhgooskvamzgu6wfrjj99g==$0Po>() { 
 
		@Override 
		public Bin$vhgooskvamzgu6wfrjj99g==$0Po convert(final DataObject dataObject) { 
			final Bin$vhgooskvamzgu6wfrjj99g==$0Po bin$vhgooskvamzgu6wfrjj99g==$0Po = new Bin$vhgooskvamzgu6wfrjj99g==$0Po(); 
			return bin$vhgooskvamzgu6wfrjj99g==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$vhgooskvamzgu6wfrjj99g==$0Po bin$vhgooskvamzgu6wfrjj99g==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$vhgooskvamzgu6wfrjj99g==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$vhgooskvamzgu6wfrjj99g==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
