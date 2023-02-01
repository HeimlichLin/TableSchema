package com.doc.common.dao.impl; 
 
public class Bin$vdzzllkwagzgu6wfrjjvew==$0DAOImpl extends GeneralDAOImpl<Bin$vdzzllkwagzgu6wfrjjvew==$0Po> implements Bin$vdzzllkwagzgu6wfrjjvew==$0DAO { 
	public static final Bin$vdzzllkwagzgu6wfrjjvew==$0DAOImpl INSTANCE = new Bin$vdzzllkwagzgu6wfrjjvew==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$VDZZLLKWAGZGU6WFRJJVEW==$0"; 

	public Bin$vdzzllkwagzgu6wfrjjvew==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$vdzzllkwagzgu6wfrjjvew==$0Po> CONVERTER = new MapConverter<Bin$vdzzllkwagzgu6wfrjjvew==$0Po>() { 
 
		@Override 
		public Bin$vdzzllkwagzgu6wfrjjvew==$0Po convert(final DataObject dataObject) { 
			final Bin$vdzzllkwagzgu6wfrjjvew==$0Po bin$vdzzllkwagzgu6wfrjjvew==$0Po = new Bin$vdzzllkwagzgu6wfrjjvew==$0Po(); 
			return bin$vdzzllkwagzgu6wfrjjvew==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$vdzzllkwagzgu6wfrjjvew==$0Po bin$vdzzllkwagzgu6wfrjjvew==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$vdzzllkwagzgu6wfrjjvew==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$vdzzllkwagzgu6wfrjjvew==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
