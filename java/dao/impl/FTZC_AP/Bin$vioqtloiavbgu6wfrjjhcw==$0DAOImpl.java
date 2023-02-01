package com.doc.common.dao.impl; 
 
public class Bin$vioqtloiavbgu6wfrjjhcw==$0DAOImpl extends GeneralDAOImpl<Bin$vioqtloiavbgu6wfrjjhcw==$0Po> implements Bin$vioqtloiavbgu6wfrjjhcw==$0DAO { 
	public static final Bin$vioqtloiavbgu6wfrjjhcw==$0DAOImpl INSTANCE = new Bin$vioqtloiavbgu6wfrjjhcw==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$VIOQTLOIAVBGU6WFRJJHCW==$0"; 

	public Bin$vioqtloiavbgu6wfrjjhcw==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$vioqtloiavbgu6wfrjjhcw==$0Po> CONVERTER = new MapConverter<Bin$vioqtloiavbgu6wfrjjhcw==$0Po>() { 
 
		@Override 
		public Bin$vioqtloiavbgu6wfrjjhcw==$0Po convert(final DataObject dataObject) { 
			final Bin$vioqtloiavbgu6wfrjjhcw==$0Po bin$vioqtloiavbgu6wfrjjhcw==$0Po = new Bin$vioqtloiavbgu6wfrjjhcw==$0Po(); 
			return bin$vioqtloiavbgu6wfrjjhcw==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$vioqtloiavbgu6wfrjjhcw==$0Po bin$vioqtloiavbgu6wfrjjhcw==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$vioqtloiavbgu6wfrjjhcw==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$vioqtloiavbgu6wfrjjhcw==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
