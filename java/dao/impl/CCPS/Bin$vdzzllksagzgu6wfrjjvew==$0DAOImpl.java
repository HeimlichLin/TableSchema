package com.doc.common.dao.impl; 
 
public class Bin$vdzzllksagzgu6wfrjjvew==$0DAOImpl extends GeneralDAOImpl<Bin$vdzzllksagzgu6wfrjjvew==$0Po> implements Bin$vdzzllksagzgu6wfrjjvew==$0DAO { 
	public static final Bin$vdzzllksagzgu6wfrjjvew==$0DAOImpl INSTANCE = new Bin$vdzzllksagzgu6wfrjjvew==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$VDZZLLKSAGZGU6WFRJJVEW==$0"; 

	public Bin$vdzzllksagzgu6wfrjjvew==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$vdzzllksagzgu6wfrjjvew==$0Po> CONVERTER = new MapConverter<Bin$vdzzllksagzgu6wfrjjvew==$0Po>() { 
 
		@Override 
		public Bin$vdzzllksagzgu6wfrjjvew==$0Po convert(final DataObject dataObject) { 
			final Bin$vdzzllksagzgu6wfrjjvew==$0Po bin$vdzzllksagzgu6wfrjjvew==$0Po = new Bin$vdzzllksagzgu6wfrjjvew==$0Po(); 
			return bin$vdzzllksagzgu6wfrjjvew==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$vdzzllksagzgu6wfrjjvew==$0Po bin$vdzzllksagzgu6wfrjjvew==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$vdzzllksagzgu6wfrjjvew==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$vdzzllksagzgu6wfrjjvew==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
