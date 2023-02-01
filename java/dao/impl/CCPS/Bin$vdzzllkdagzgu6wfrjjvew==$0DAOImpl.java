package com.doc.common.dao.impl; 
 
public class Bin$vdzzllkdagzgu6wfrjjvew==$0DAOImpl extends GeneralDAOImpl<Bin$vdzzllkdagzgu6wfrjjvew==$0Po> implements Bin$vdzzllkdagzgu6wfrjjvew==$0DAO { 
	public static final Bin$vdzzllkdagzgu6wfrjjvew==$0DAOImpl INSTANCE = new Bin$vdzzllkdagzgu6wfrjjvew==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$VDZZLLKDAGZGU6WFRJJVEW==$0"; 

	public Bin$vdzzllkdagzgu6wfrjjvew==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$vdzzllkdagzgu6wfrjjvew==$0Po> CONVERTER = new MapConverter<Bin$vdzzllkdagzgu6wfrjjvew==$0Po>() { 
 
		@Override 
		public Bin$vdzzllkdagzgu6wfrjjvew==$0Po convert(final DataObject dataObject) { 
			final Bin$vdzzllkdagzgu6wfrjjvew==$0Po bin$vdzzllkdagzgu6wfrjjvew==$0Po = new Bin$vdzzllkdagzgu6wfrjjvew==$0Po(); 
			return bin$vdzzllkdagzgu6wfrjjvew==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$vdzzllkdagzgu6wfrjjvew==$0Po bin$vdzzllkdagzgu6wfrjjvew==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$vdzzllkdagzgu6wfrjjvew==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$vdzzllkdagzgu6wfrjjvew==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
