package com.doc.common.dao.impl; 
 
public class Express00iTemp1DAOImpl extends GeneralDAOImpl<Express00iTemp1Po> implements Express00iTemp1DAO { 
	public static final Express00iTemp1DAOImpl INSTANCE = new Express00iTemp1DAOImpl(); 
	public static final String TABLENAME = "EXPRESS00I_TEMP1"; 

	public Express00iTemp1DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Express00iTemp1Po> CONVERTER = new MapConverter<Express00iTemp1Po>() { 
 
		@Override 
		public Express00iTemp1Po convert(final DataObject dataObject) { 
			final Express00iTemp1Po express00iTemp1Po = new Express00iTemp1Po(); 
			express00iTemp1Po.setDeclno(dataObject.getString(Express00iTemp1Po.COLUMNS.DECLNO.name())); 
			express00iTemp1Po.setMwb(dataObject.getString(Express00iTemp1Po.COLUMNS.MWB.name())); 
			express00iTemp1Po.setHwb(dataObject.getString(Express00iTemp1Po.COLUMNS.HWB.name())); 
			express00iTemp1Po.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(Express00iTemp1Po.COLUMNS.GCIPIECE.name()))); 
			express00iTemp1Po.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(Express00iTemp1Po.COLUMNS.GCIWEIGHT.name()))); 
			express00iTemp1Po.setWeight(BigDecimalUtils.formObj(dataObject.getValue(Express00iTemp1Po.COLUMNS.WEIGHT.name()))); 
			express00iTemp1Po.setBagfee(BigDecimalUtils.formObj(dataObject.getValue(Express00iTemp1Po.COLUMNS.BAGFEE.name()))); 
			express00iTemp1Po.setFlightno(dataObject.getString(Express00iTemp1Po.COLUMNS.FLIGHTNO.name())); 
			express00iTemp1Po.setDecltype(dataObject.getString(Express00iTemp1Po.COLUMNS.DECLTYPE.name())); 
			express00iTemp1Po.setClearancetype(dataObject.getString(Express00iTemp1Po.COLUMNS.CLEARANCETYPE.name())); 
			express00iTemp1Po.setPiece(BigDecimalUtils.formObj(dataObject.getValue(Express00iTemp1Po.COLUMNS.PIECE.name()))); 
			return express00iTemp1Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Express00iTemp1Po express00iTemp1Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Express00iTemp1Po.COLUMNS.DECLNO.name(), express00iTemp1Po.getDeclno()); 
			dataObject.setValue(Express00iTemp1Po.COLUMNS.MWB.name(), express00iTemp1Po.getMwb()); 
			dataObject.setValue(Express00iTemp1Po.COLUMNS.HWB.name(), express00iTemp1Po.getHwb()); 
			dataObject.setValue(Express00iTemp1Po.COLUMNS.GCIPIECE.name(), express00iTemp1Po.getGcipiece()); 
			dataObject.setValue(Express00iTemp1Po.COLUMNS.GCIWEIGHT.name(), express00iTemp1Po.getGciweight()); 
			dataObject.setValue(Express00iTemp1Po.COLUMNS.WEIGHT.name(), express00iTemp1Po.getWeight()); 
			dataObject.setValue(Express00iTemp1Po.COLUMNS.BAGFEE.name(), express00iTemp1Po.getBagfee()); 
			dataObject.setValue(Express00iTemp1Po.COLUMNS.FLIGHTNO.name(), express00iTemp1Po.getFlightno()); 
			dataObject.setValue(Express00iTemp1Po.COLUMNS.DECLTYPE.name(), express00iTemp1Po.getDecltype()); 
			dataObject.setValue(Express00iTemp1Po.COLUMNS.CLEARANCETYPE.name(), express00iTemp1Po.getClearancetype()); 
			dataObject.setValue(Express00iTemp1Po.COLUMNS.PIECE.name(), express00iTemp1Po.getPiece()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Express00iTemp1Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Express00iTemp1Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
