package com.doc.common.dao.impl; 
 
public class Bin$vbg2akioar7gu6wfrjkmja==$0DAOImpl extends GeneralDAOImpl<Bin$vbg2akioar7gu6wfrjkmja==$0Po> implements Bin$vbg2akioar7gu6wfrjkmja==$0DAO { 
	public static final Bin$vbg2akioar7gu6wfrjkmja==$0DAOImpl INSTANCE = new Bin$vbg2akioar7gu6wfrjkmja==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$VBG2AKIOAR7GU6WFRJKMJA==$0"; 

	public Bin$vbg2akioar7gu6wfrjkmja==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$vbg2akioar7gu6wfrjkmja==$0Po> CONVERTER = new MapConverter<Bin$vbg2akioar7gu6wfrjkmja==$0Po>() { 
 
		@Override 
		public Bin$vbg2akioar7gu6wfrjkmja==$0Po convert(final DataObject dataObject) { 
			final Bin$vbg2akioar7gu6wfrjkmja==$0Po bin$vbg2akioar7gu6wfrjkmja==$0Po = new Bin$vbg2akioar7gu6wfrjkmja==$0Po(); 
			return bin$vbg2akioar7gu6wfrjkmja==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$vbg2akioar7gu6wfrjkmja==$0Po bin$vbg2akioar7gu6wfrjkmja==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$vbg2akioar7gu6wfrjkmja==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$vbg2akioar7gu6wfrjkmja==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
