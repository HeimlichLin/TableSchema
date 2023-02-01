package com.doc.common.dao.impl; 
 
public class Bin$vdzzllk1agzgu6wfrjjvew==$0DAOImpl extends GeneralDAOImpl<Bin$vdzzllk1agzgu6wfrjjvew==$0Po> implements Bin$vdzzllk1agzgu6wfrjjvew==$0DAO { 
	public static final Bin$vdzzllk1agzgu6wfrjjvew==$0DAOImpl INSTANCE = new Bin$vdzzllk1agzgu6wfrjjvew==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$VDZZLLK1AGZGU6WFRJJVEW==$0"; 

	public Bin$vdzzllk1agzgu6wfrjjvew==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$vdzzllk1agzgu6wfrjjvew==$0Po> CONVERTER = new MapConverter<Bin$vdzzllk1agzgu6wfrjjvew==$0Po>() { 
 
		@Override 
		public Bin$vdzzllk1agzgu6wfrjjvew==$0Po convert(final DataObject dataObject) { 
			final Bin$vdzzllk1agzgu6wfrjjvew==$0Po bin$vdzzllk1agzgu6wfrjjvew==$0Po = new Bin$vdzzllk1agzgu6wfrjjvew==$0Po(); 
			return bin$vdzzllk1agzgu6wfrjjvew==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$vdzzllk1agzgu6wfrjjvew==$0Po bin$vdzzllk1agzgu6wfrjjvew==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$vdzzllk1agzgu6wfrjjvew==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$vdzzllk1agzgu6wfrjjvew==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
