package com.doc.common.dao.impl; 
 
public class Bin$vioqtloaavbgu6wfrjjhcw==$0DAOImpl extends GeneralDAOImpl<Bin$vioqtloaavbgu6wfrjjhcw==$0Po> implements Bin$vioqtloaavbgu6wfrjjhcw==$0DAO { 
	public static final Bin$vioqtloaavbgu6wfrjjhcw==$0DAOImpl INSTANCE = new Bin$vioqtloaavbgu6wfrjjhcw==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$VIOQTLOAAVBGU6WFRJJHCW==$0"; 

	public Bin$vioqtloaavbgu6wfrjjhcw==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$vioqtloaavbgu6wfrjjhcw==$0Po> CONVERTER = new MapConverter<Bin$vioqtloaavbgu6wfrjjhcw==$0Po>() { 
 
		@Override 
		public Bin$vioqtloaavbgu6wfrjjhcw==$0Po convert(final DataObject dataObject) { 
			final Bin$vioqtloaavbgu6wfrjjhcw==$0Po bin$vioqtloaavbgu6wfrjjhcw==$0Po = new Bin$vioqtloaavbgu6wfrjjhcw==$0Po(); 
			return bin$vioqtloaavbgu6wfrjjhcw==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$vioqtloaavbgu6wfrjjhcw==$0Po bin$vioqtloaavbgu6wfrjjhcw==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$vioqtloaavbgu6wfrjjhcw==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$vioqtloaavbgu6wfrjjhcw==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
