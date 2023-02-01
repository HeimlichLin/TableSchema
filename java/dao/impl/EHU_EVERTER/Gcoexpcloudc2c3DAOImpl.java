package com.doc.common.dao.impl; 
 
public class Gcoexpcloudc2c3DAOImpl extends GeneralDAOImpl<Gcoexpcloudc2c3Po> implements Gcoexpcloudc2c3DAO { 
	public static final Gcoexpcloudc2c3DAOImpl INSTANCE = new Gcoexpcloudc2c3DAOImpl(); 
	public static final String TABLENAME = "GCOEXPCLOUDC2C3"; 

	public Gcoexpcloudc2c3DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Gcoexpcloudc2c3Po> CONVERTER = new MapConverter<Gcoexpcloudc2c3Po>() { 
 
		@Override 
		public Gcoexpcloudc2c3Po convert(final DataObject dataObject) { 
			final Gcoexpcloudc2c3Po gcoexpcloudc2c3Po = new Gcoexpcloudc2c3Po(); 
			gcoexpcloudc2c3Po.setIe(dataObject.getString(Gcoexpcloudc2c3Po.COLUMNS.IE.name())); 
			gcoexpcloudc2c3Po.setExpbagno(dataObject.getString(Gcoexpcloudc2c3Po.COLUMNS.EXPBAGNO.name())); 
			gcoexpcloudc2c3Po.setMwb(dataObject.getString(Gcoexpcloudc2c3Po.COLUMNS.MWB.name())); 
			gcoexpcloudc2c3Po.setHwb(dataObject.getString(Gcoexpcloudc2c3Po.COLUMNS.HWB.name())); 
			gcoexpcloudc2c3Po.setDeclno(dataObject.getString(Gcoexpcloudc2c3Po.COLUMNS.DECLNO.name())); 
			gcoexpcloudc2c3Po.setClearancetype(dataObject.getString(Gcoexpcloudc2c3Po.COLUMNS.CLEARANCETYPE.name())); 
			gcoexpcloudc2c3Po.setPiece(BigDecimalUtils.formObj(dataObject.getValue(Gcoexpcloudc2c3Po.COLUMNS.PIECE.name()))); 
			gcoexpcloudc2c3Po.setLastupdate(TimestampUtils.of(dataObject.getValue(Gcoexpcloudc2c3Po.COLUMNS.LASTUPDATE.name()))); 
			return gcoexpcloudc2c3Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Gcoexpcloudc2c3Po gcoexpcloudc2c3Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Gcoexpcloudc2c3Po.COLUMNS.IE.name(), gcoexpcloudc2c3Po.getIe()); 
			dataObject.setValue(Gcoexpcloudc2c3Po.COLUMNS.EXPBAGNO.name(), gcoexpcloudc2c3Po.getExpbagno()); 
			dataObject.setValue(Gcoexpcloudc2c3Po.COLUMNS.MWB.name(), gcoexpcloudc2c3Po.getMwb()); 
			dataObject.setValue(Gcoexpcloudc2c3Po.COLUMNS.HWB.name(), gcoexpcloudc2c3Po.getHwb()); 
			dataObject.setValue(Gcoexpcloudc2c3Po.COLUMNS.DECLNO.name(), gcoexpcloudc2c3Po.getDeclno()); 
			dataObject.setValue(Gcoexpcloudc2c3Po.COLUMNS.CLEARANCETYPE.name(), gcoexpcloudc2c3Po.getClearancetype()); 
			dataObject.setValue(Gcoexpcloudc2c3Po.COLUMNS.PIECE.name(), gcoexpcloudc2c3Po.getPiece()); 
			dataObject.setValue(Gcoexpcloudc2c3Po.COLUMNS.LASTUPDATE.name(), gcoexpcloudc2c3Po.getLastupdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Gcoexpcloudc2c3Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Gcoexpcloudc2c3Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
