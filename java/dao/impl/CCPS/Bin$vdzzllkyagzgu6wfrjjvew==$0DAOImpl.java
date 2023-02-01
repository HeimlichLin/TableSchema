package com.doc.common.dao.impl; 
 
public class Bin$vdzzllkyagzgu6wfrjjvew==$0DAOImpl extends GeneralDAOImpl<Bin$vdzzllkyagzgu6wfrjjvew==$0Po> implements Bin$vdzzllkyagzgu6wfrjjvew==$0DAO { 
	public static final Bin$vdzzllkyagzgu6wfrjjvew==$0DAOImpl INSTANCE = new Bin$vdzzllkyagzgu6wfrjjvew==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$VDZZLLKYAGZGU6WFRJJVEW==$0"; 

	public Bin$vdzzllkyagzgu6wfrjjvew==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$vdzzllkyagzgu6wfrjjvew==$0Po> CONVERTER = new MapConverter<Bin$vdzzllkyagzgu6wfrjjvew==$0Po>() { 
 
		@Override 
		public Bin$vdzzllkyagzgu6wfrjjvew==$0Po convert(final DataObject dataObject) { 
			final Bin$vdzzllkyagzgu6wfrjjvew==$0Po bin$vdzzllkyagzgu6wfrjjvew==$0Po = new Bin$vdzzllkyagzgu6wfrjjvew==$0Po(); 
			return bin$vdzzllkyagzgu6wfrjjvew==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$vdzzllkyagzgu6wfrjjvew==$0Po bin$vdzzllkyagzgu6wfrjjvew==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$vdzzllkyagzgu6wfrjjvew==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$vdzzllkyagzgu6wfrjjvew==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
