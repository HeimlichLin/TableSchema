package com.doc.common.dao.impl; 
 
public class Bin$vcwm2y0eamjgu6wfrjlxqq==$0DAOImpl extends GeneralDAOImpl<Bin$vcwm2y0eamjgu6wfrjlxqq==$0Po> implements Bin$vcwm2y0eamjgu6wfrjlxqq==$0DAO { 
	public static final Bin$vcwm2y0eamjgu6wfrjlxqq==$0DAOImpl INSTANCE = new Bin$vcwm2y0eamjgu6wfrjlxqq==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$VCWM2Y0EAMJGU6WFRJLXQQ==$0"; 

	public Bin$vcwm2y0eamjgu6wfrjlxqq==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$vcwm2y0eamjgu6wfrjlxqq==$0Po> CONVERTER = new MapConverter<Bin$vcwm2y0eamjgu6wfrjlxqq==$0Po>() { 
 
		@Override 
		public Bin$vcwm2y0eamjgu6wfrjlxqq==$0Po convert(final DataObject dataObject) { 
			final Bin$vcwm2y0eamjgu6wfrjlxqq==$0Po bin$vcwm2y0eamjgu6wfrjlxqq==$0Po = new Bin$vcwm2y0eamjgu6wfrjlxqq==$0Po(); 
			return bin$vcwm2y0eamjgu6wfrjlxqq==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$vcwm2y0eamjgu6wfrjlxqq==$0Po bin$vcwm2y0eamjgu6wfrjlxqq==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$vcwm2y0eamjgu6wfrjlxqq==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$vcwm2y0eamjgu6wfrjlxqq==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
