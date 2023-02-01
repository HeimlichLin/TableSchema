package com.doc.common.dao.impl; 
 
public class Bin$ycegszucaklgu6wfrjkeyg==$0DAOImpl extends GeneralDAOImpl<Bin$ycegszucaklgu6wfrjkeyg==$0Po> implements Bin$ycegszucaklgu6wfrjkeyg==$0DAO { 
	public static final Bin$ycegszucaklgu6wfrjkeyg==$0DAOImpl INSTANCE = new Bin$ycegszucaklgu6wfrjkeyg==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$YCEGSZUCAKLGU6WFRJKEYG==$0"; 

	public Bin$ycegszucaklgu6wfrjkeyg==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$ycegszucaklgu6wfrjkeyg==$0Po> CONVERTER = new MapConverter<Bin$ycegszucaklgu6wfrjkeyg==$0Po>() { 
 
		@Override 
		public Bin$ycegszucaklgu6wfrjkeyg==$0Po convert(final DataObject dataObject) { 
			final Bin$ycegszucaklgu6wfrjkeyg==$0Po bin$ycegszucaklgu6wfrjkeyg==$0Po = new Bin$ycegszucaklgu6wfrjkeyg==$0Po(); 
			return bin$ycegszucaklgu6wfrjkeyg==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$ycegszucaklgu6wfrjkeyg==$0Po bin$ycegszucaklgu6wfrjkeyg==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$ycegszucaklgu6wfrjkeyg==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$ycegszucaklgu6wfrjkeyg==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
