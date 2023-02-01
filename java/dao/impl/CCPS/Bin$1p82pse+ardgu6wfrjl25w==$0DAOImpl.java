package com.doc.common.dao.impl; 
 
public class Bin$1p82pse+ardgu6wfrjl25w==$0DAOImpl extends GeneralDAOImpl<Bin$1p82pse+ardgu6wfrjl25w==$0Po> implements Bin$1p82pse+ardgu6wfrjl25w==$0DAO { 
	public static final Bin$1p82pse+ardgu6wfrjl25w==$0DAOImpl INSTANCE = new Bin$1p82pse+ardgu6wfrjl25w==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$1P82PSE+ARDGU6WFRJL25W==$0"; 

	public Bin$1p82pse+ardgu6wfrjl25w==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$1p82pse+ardgu6wfrjl25w==$0Po> CONVERTER = new MapConverter<Bin$1p82pse+ardgu6wfrjl25w==$0Po>() { 
 
		@Override 
		public Bin$1p82pse+ardgu6wfrjl25w==$0Po convert(final DataObject dataObject) { 
			final Bin$1p82pse+ardgu6wfrjl25w==$0Po bin$1p82pse+ardgu6wfrjl25w==$0Po = new Bin$1p82pse+ardgu6wfrjl25w==$0Po(); 
			return bin$1p82pse+ardgu6wfrjl25w==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$1p82pse+ardgu6wfrjl25w==$0Po bin$1p82pse+ardgu6wfrjl25w==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$1p82pse+ardgu6wfrjl25w==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$1p82pse+ardgu6wfrjl25w==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
