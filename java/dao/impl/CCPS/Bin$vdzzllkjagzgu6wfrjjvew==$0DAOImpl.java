package com.doc.common.dao.impl; 
 
public class Bin$vdzzllkjagzgu6wfrjjvew==$0DAOImpl extends GeneralDAOImpl<Bin$vdzzllkjagzgu6wfrjjvew==$0Po> implements Bin$vdzzllkjagzgu6wfrjjvew==$0DAO { 
	public static final Bin$vdzzllkjagzgu6wfrjjvew==$0DAOImpl INSTANCE = new Bin$vdzzllkjagzgu6wfrjjvew==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$VDZZLLKJAGZGU6WFRJJVEW==$0"; 

	public Bin$vdzzllkjagzgu6wfrjjvew==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$vdzzllkjagzgu6wfrjjvew==$0Po> CONVERTER = new MapConverter<Bin$vdzzllkjagzgu6wfrjjvew==$0Po>() { 
 
		@Override 
		public Bin$vdzzllkjagzgu6wfrjjvew==$0Po convert(final DataObject dataObject) { 
			final Bin$vdzzllkjagzgu6wfrjjvew==$0Po bin$vdzzllkjagzgu6wfrjjvew==$0Po = new Bin$vdzzllkjagzgu6wfrjjvew==$0Po(); 
			return bin$vdzzllkjagzgu6wfrjjvew==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$vdzzllkjagzgu6wfrjjvew==$0Po bin$vdzzllkjagzgu6wfrjjvew==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$vdzzllkjagzgu6wfrjjvew==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$vdzzllkjagzgu6wfrjjvew==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
