package com.doc.common.dao.impl; 
 
public class Gcocloudhwbc2c3DAOImpl extends GeneralDAOImpl<Gcocloudhwbc2c3Po> implements Gcocloudhwbc2c3DAO { 
	public static final Gcocloudhwbc2c3DAOImpl INSTANCE = new Gcocloudhwbc2c3DAOImpl(); 
	public static final String TABLENAME = "GCOCLOUDHWBC2C3"; 

	public Gcocloudhwbc2c3DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Gcocloudhwbc2c3Po> CONVERTER = new MapConverter<Gcocloudhwbc2c3Po>() { 
 
		@Override 
		public Gcocloudhwbc2c3Po convert(final DataObject dataObject) { 
			final Gcocloudhwbc2c3Po gcocloudhwbc2c3Po = new Gcocloudhwbc2c3Po(); 
			gcocloudhwbc2c3Po.setIe(dataObject.getString(Gcocloudhwbc2c3Po.COLUMNS.IE.name())); 
			gcocloudhwbc2c3Po.setExpbagno(dataObject.getString(Gcocloudhwbc2c3Po.COLUMNS.EXPBAGNO.name())); 
			gcocloudhwbc2c3Po.setMwb(dataObject.getString(Gcocloudhwbc2c3Po.COLUMNS.MWB.name())); 
			gcocloudhwbc2c3Po.setHwb(dataObject.getString(Gcocloudhwbc2c3Po.COLUMNS.HWB.name())); 
			gcocloudhwbc2c3Po.setDeclno(dataObject.getString(Gcocloudhwbc2c3Po.COLUMNS.DECLNO.name())); 
			gcocloudhwbc2c3Po.setClearancetype(dataObject.getString(Gcocloudhwbc2c3Po.COLUMNS.CLEARANCETYPE.name())); 
			gcocloudhwbc2c3Po.setPiece(BigDecimalUtils.formObj(dataObject.getValue(Gcocloudhwbc2c3Po.COLUMNS.PIECE.name()))); 
			gcocloudhwbc2c3Po.setLastupdate(TimestampUtils.of(dataObject.getValue(Gcocloudhwbc2c3Po.COLUMNS.LASTUPDATE.name()))); 
			return gcocloudhwbc2c3Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Gcocloudhwbc2c3Po gcocloudhwbc2c3Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Gcocloudhwbc2c3Po.COLUMNS.IE.name(), gcocloudhwbc2c3Po.getIe()); 
			dataObject.setValue(Gcocloudhwbc2c3Po.COLUMNS.EXPBAGNO.name(), gcocloudhwbc2c3Po.getExpbagno()); 
			dataObject.setValue(Gcocloudhwbc2c3Po.COLUMNS.MWB.name(), gcocloudhwbc2c3Po.getMwb()); 
			dataObject.setValue(Gcocloudhwbc2c3Po.COLUMNS.HWB.name(), gcocloudhwbc2c3Po.getHwb()); 
			dataObject.setValue(Gcocloudhwbc2c3Po.COLUMNS.DECLNO.name(), gcocloudhwbc2c3Po.getDeclno()); 
			dataObject.setValue(Gcocloudhwbc2c3Po.COLUMNS.CLEARANCETYPE.name(), gcocloudhwbc2c3Po.getClearancetype()); 
			dataObject.setValue(Gcocloudhwbc2c3Po.COLUMNS.PIECE.name(), gcocloudhwbc2c3Po.getPiece()); 
			dataObject.setValue(Gcocloudhwbc2c3Po.COLUMNS.LASTUPDATE.name(), gcocloudhwbc2c3Po.getLastupdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Gcocloudhwbc2c3Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Gcocloudhwbc2c3Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
