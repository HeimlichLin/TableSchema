package com.doc.common.dao.impl; 
 
public class Tempexpcloudc2c3DAOImpl extends GeneralDAOImpl<Tempexpcloudc2c3Po> implements Tempexpcloudc2c3DAO { 
	public static final Tempexpcloudc2c3DAOImpl INSTANCE = new Tempexpcloudc2c3DAOImpl(); 
	public static final String TABLENAME = "TEMPEXPCLOUDC2C3"; 

	public Tempexpcloudc2c3DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Tempexpcloudc2c3Po> CONVERTER = new MapConverter<Tempexpcloudc2c3Po>() { 
 
		@Override 
		public Tempexpcloudc2c3Po convert(final DataObject dataObject) { 
			final Tempexpcloudc2c3Po tempexpcloudc2c3Po = new Tempexpcloudc2c3Po(); 
			tempexpcloudc2c3Po.setIe(dataObject.getString(Tempexpcloudc2c3Po.COLUMNS.IE.name())); 
			tempexpcloudc2c3Po.setExpbagno(dataObject.getString(Tempexpcloudc2c3Po.COLUMNS.EXPBAGNO.name())); 
			tempexpcloudc2c3Po.setMwb(dataObject.getString(Tempexpcloudc2c3Po.COLUMNS.MWB.name())); 
			tempexpcloudc2c3Po.setHwb(dataObject.getString(Tempexpcloudc2c3Po.COLUMNS.HWB.name())); 
			tempexpcloudc2c3Po.setDeclno(dataObject.getString(Tempexpcloudc2c3Po.COLUMNS.DECLNO.name())); 
			tempexpcloudc2c3Po.setClearancetype(dataObject.getString(Tempexpcloudc2c3Po.COLUMNS.CLEARANCETYPE.name())); 
			tempexpcloudc2c3Po.setPiece(BigDecimalUtils.formObj(dataObject.getValue(Tempexpcloudc2c3Po.COLUMNS.PIECE.name()))); 
			tempexpcloudc2c3Po.setLastupdate(TimestampUtils.of(dataObject.getValue(Tempexpcloudc2c3Po.COLUMNS.LASTUPDATE.name()))); 
			return tempexpcloudc2c3Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Tempexpcloudc2c3Po tempexpcloudc2c3Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Tempexpcloudc2c3Po.COLUMNS.IE.name(), tempexpcloudc2c3Po.getIe()); 
			dataObject.setValue(Tempexpcloudc2c3Po.COLUMNS.EXPBAGNO.name(), tempexpcloudc2c3Po.getExpbagno()); 
			dataObject.setValue(Tempexpcloudc2c3Po.COLUMNS.MWB.name(), tempexpcloudc2c3Po.getMwb()); 
			dataObject.setValue(Tempexpcloudc2c3Po.COLUMNS.HWB.name(), tempexpcloudc2c3Po.getHwb()); 
			dataObject.setValue(Tempexpcloudc2c3Po.COLUMNS.DECLNO.name(), tempexpcloudc2c3Po.getDeclno()); 
			dataObject.setValue(Tempexpcloudc2c3Po.COLUMNS.CLEARANCETYPE.name(), tempexpcloudc2c3Po.getClearancetype()); 
			dataObject.setValue(Tempexpcloudc2c3Po.COLUMNS.PIECE.name(), tempexpcloudc2c3Po.getPiece()); 
			dataObject.setValue(Tempexpcloudc2c3Po.COLUMNS.LASTUPDATE.name(), tempexpcloudc2c3Po.getLastupdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Tempexpcloudc2c3Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Tempexpcloudc2c3Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
