package com.doc.common.dao.impl; 
 
public class Bin$yjdmci/dadrgu6wfrji1zq==$0DAOImpl extends GeneralDAOImpl<Bin$yjdmci/dadrgu6wfrji1zq==$0Po> implements Bin$yjdmci/dadrgu6wfrji1zq==$0DAO { 
	public static final Bin$yjdmci/dadrgu6wfrji1zq==$0DAOImpl INSTANCE = new Bin$yjdmci/dadrgu6wfrji1zq==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$YJDMCI/DADRGU6WFRJI1ZQ==$0"; 

	public Bin$yjdmci/dadrgu6wfrji1zq==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$yjdmci/dadrgu6wfrji1zq==$0Po> CONVERTER = new MapConverter<Bin$yjdmci/dadrgu6wfrji1zq==$0Po>() { 
 
		@Override 
		public Bin$yjdmci/dadrgu6wfrji1zq==$0Po convert(final DataObject dataObject) { 
			final Bin$yjdmci/dadrgu6wfrji1zq==$0Po bin$yjdmci/dadrgu6wfrji1zq==$0Po = new Bin$yjdmci/dadrgu6wfrji1zq==$0Po(); 
			return bin$yjdmci/dadrgu6wfrji1zq==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$yjdmci/dadrgu6wfrji1zq==$0Po bin$yjdmci/dadrgu6wfrji1zq==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$yjdmci/dadrgu6wfrji1zq==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$yjdmci/dadrgu6wfrji1zq==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
