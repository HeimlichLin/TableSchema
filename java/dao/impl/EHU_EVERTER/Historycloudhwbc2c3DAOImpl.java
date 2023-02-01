package com.doc.common.dao.impl; 
 
public class Historycloudhwbc2c3DAOImpl extends GeneralDAOImpl<Historycloudhwbc2c3Po> implements Historycloudhwbc2c3DAO { 
	public static final Historycloudhwbc2c3DAOImpl INSTANCE = new Historycloudhwbc2c3DAOImpl(); 
	public static final String TABLENAME = "HISTORYCLOUDHWBC2C3"; 

	public Historycloudhwbc2c3DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Historycloudhwbc2c3Po> CONVERTER = new MapConverter<Historycloudhwbc2c3Po>() { 
 
		@Override 
		public Historycloudhwbc2c3Po convert(final DataObject dataObject) { 
			final Historycloudhwbc2c3Po historycloudhwbc2c3Po = new Historycloudhwbc2c3Po(); 
			historycloudhwbc2c3Po.setIe(dataObject.getString(Historycloudhwbc2c3Po.COLUMNS.IE.name())); 
			historycloudhwbc2c3Po.setExpbagno(dataObject.getString(Historycloudhwbc2c3Po.COLUMNS.EXPBAGNO.name())); 
			historycloudhwbc2c3Po.setMwb(dataObject.getString(Historycloudhwbc2c3Po.COLUMNS.MWB.name())); 
			historycloudhwbc2c3Po.setHwb(dataObject.getString(Historycloudhwbc2c3Po.COLUMNS.HWB.name())); 
			historycloudhwbc2c3Po.setDeclno(dataObject.getString(Historycloudhwbc2c3Po.COLUMNS.DECLNO.name())); 
			historycloudhwbc2c3Po.setClearancetype(dataObject.getString(Historycloudhwbc2c3Po.COLUMNS.CLEARANCETYPE.name())); 
			historycloudhwbc2c3Po.setPiece(BigDecimalUtils.formObj(dataObject.getValue(Historycloudhwbc2c3Po.COLUMNS.PIECE.name()))); 
			historycloudhwbc2c3Po.setLastupdate(TimestampUtils.of(dataObject.getValue(Historycloudhwbc2c3Po.COLUMNS.LASTUPDATE.name()))); 
			return historycloudhwbc2c3Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Historycloudhwbc2c3Po historycloudhwbc2c3Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Historycloudhwbc2c3Po.COLUMNS.IE.name(), historycloudhwbc2c3Po.getIe()); 
			dataObject.setValue(Historycloudhwbc2c3Po.COLUMNS.EXPBAGNO.name(), historycloudhwbc2c3Po.getExpbagno()); 
			dataObject.setValue(Historycloudhwbc2c3Po.COLUMNS.MWB.name(), historycloudhwbc2c3Po.getMwb()); 
			dataObject.setValue(Historycloudhwbc2c3Po.COLUMNS.HWB.name(), historycloudhwbc2c3Po.getHwb()); 
			dataObject.setValue(Historycloudhwbc2c3Po.COLUMNS.DECLNO.name(), historycloudhwbc2c3Po.getDeclno()); 
			dataObject.setValue(Historycloudhwbc2c3Po.COLUMNS.CLEARANCETYPE.name(), historycloudhwbc2c3Po.getClearancetype()); 
			dataObject.setValue(Historycloudhwbc2c3Po.COLUMNS.PIECE.name(), historycloudhwbc2c3Po.getPiece()); 
			dataObject.setValue(Historycloudhwbc2c3Po.COLUMNS.LASTUPDATE.name(), historycloudhwbc2c3Po.getLastupdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Historycloudhwbc2c3Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Historycloudhwbc2c3Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
