package com.doc.common.dao.impl; 
 
public class Workexpcloudhwbc2c3DAOImpl extends GeneralDAOImpl<Workexpcloudhwbc2c3Po> implements Workexpcloudhwbc2c3DAO { 
	public static final Workexpcloudhwbc2c3DAOImpl INSTANCE = new Workexpcloudhwbc2c3DAOImpl(); 
	public static final String TABLENAME = "WORKEXPCLOUDHWBC2C3"; 

	public Workexpcloudhwbc2c3DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Workexpcloudhwbc2c3Po> CONVERTER = new MapConverter<Workexpcloudhwbc2c3Po>() { 
 
		@Override 
		public Workexpcloudhwbc2c3Po convert(final DataObject dataObject) { 
			final Workexpcloudhwbc2c3Po workexpcloudhwbc2c3Po = new Workexpcloudhwbc2c3Po(); 
			workexpcloudhwbc2c3Po.setIe(dataObject.getString(Workexpcloudhwbc2c3Po.COLUMNS.IE.name())); 
			workexpcloudhwbc2c3Po.setExpbagno(dataObject.getString(Workexpcloudhwbc2c3Po.COLUMNS.EXPBAGNO.name())); 
			workexpcloudhwbc2c3Po.setMwb(dataObject.getString(Workexpcloudhwbc2c3Po.COLUMNS.MWB.name())); 
			workexpcloudhwbc2c3Po.setHwb(dataObject.getString(Workexpcloudhwbc2c3Po.COLUMNS.HWB.name())); 
			workexpcloudhwbc2c3Po.setDeclno(dataObject.getString(Workexpcloudhwbc2c3Po.COLUMNS.DECLNO.name())); 
			workexpcloudhwbc2c3Po.setClearancetype(dataObject.getString(Workexpcloudhwbc2c3Po.COLUMNS.CLEARANCETYPE.name())); 
			workexpcloudhwbc2c3Po.setPiece(BigDecimalUtils.formObj(dataObject.getValue(Workexpcloudhwbc2c3Po.COLUMNS.PIECE.name()))); 
			workexpcloudhwbc2c3Po.setLastupdate(TimestampUtils.of(dataObject.getValue(Workexpcloudhwbc2c3Po.COLUMNS.LASTUPDATE.name()))); 
			return workexpcloudhwbc2c3Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Workexpcloudhwbc2c3Po workexpcloudhwbc2c3Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Workexpcloudhwbc2c3Po.COLUMNS.IE.name(), workexpcloudhwbc2c3Po.getIe()); 
			dataObject.setValue(Workexpcloudhwbc2c3Po.COLUMNS.EXPBAGNO.name(), workexpcloudhwbc2c3Po.getExpbagno()); 
			dataObject.setValue(Workexpcloudhwbc2c3Po.COLUMNS.MWB.name(), workexpcloudhwbc2c3Po.getMwb()); 
			dataObject.setValue(Workexpcloudhwbc2c3Po.COLUMNS.HWB.name(), workexpcloudhwbc2c3Po.getHwb()); 
			dataObject.setValue(Workexpcloudhwbc2c3Po.COLUMNS.DECLNO.name(), workexpcloudhwbc2c3Po.getDeclno()); 
			dataObject.setValue(Workexpcloudhwbc2c3Po.COLUMNS.CLEARANCETYPE.name(), workexpcloudhwbc2c3Po.getClearancetype()); 
			dataObject.setValue(Workexpcloudhwbc2c3Po.COLUMNS.PIECE.name(), workexpcloudhwbc2c3Po.getPiece()); 
			dataObject.setValue(Workexpcloudhwbc2c3Po.COLUMNS.LASTUPDATE.name(), workexpcloudhwbc2c3Po.getLastupdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Workexpcloudhwbc2c3Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Workexpcloudhwbc2c3Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
