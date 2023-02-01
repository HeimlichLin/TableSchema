package com.doc.common.dao.impl; 
 
public class Bin$vdzzllknagzgu6wfrjjvew==$0DAOImpl extends GeneralDAOImpl<Bin$vdzzllknagzgu6wfrjjvew==$0Po> implements Bin$vdzzllknagzgu6wfrjjvew==$0DAO { 
	public static final Bin$vdzzllknagzgu6wfrjjvew==$0DAOImpl INSTANCE = new Bin$vdzzllknagzgu6wfrjjvew==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$VDZZLLKNAGZGU6WFRJJVEW==$0"; 

	public Bin$vdzzllknagzgu6wfrjjvew==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$vdzzllknagzgu6wfrjjvew==$0Po> CONVERTER = new MapConverter<Bin$vdzzllknagzgu6wfrjjvew==$0Po>() { 
 
		@Override 
		public Bin$vdzzllknagzgu6wfrjjvew==$0Po convert(final DataObject dataObject) { 
			final Bin$vdzzllknagzgu6wfrjjvew==$0Po bin$vdzzllknagzgu6wfrjjvew==$0Po = new Bin$vdzzllknagzgu6wfrjjvew==$0Po(); 
			return bin$vdzzllknagzgu6wfrjjvew==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$vdzzllknagzgu6wfrjjvew==$0Po bin$vdzzllknagzgu6wfrjjvew==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$vdzzllknagzgu6wfrjjvew==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$vdzzllknagzgu6wfrjjvew==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
