package com.doc.common.dao.impl; 
 
public class T5171DAOImpl extends GeneralDAOImpl<T5171Po> implements T5171DAO { 
	public static final T5171DAOImpl INSTANCE = new T5171DAOImpl(); 
	public static final String TABLENAME = "T5171"; 

	public T5171DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<T5171Po> CONVERTER = new MapConverter<T5171Po>() { 
 
		@Override 
		public T5171Po convert(final DataObject dataObject) { 
			final T5171Po t5171Po = new T5171Po(); 
			t5171Po.setWdate(dataObject.getString(T5171Po.COLUMNS.WDATE.name())); 
			t5171Po.setWtime(dataObject.getString(T5171Po.COLUMNS.WTIME.name())); 
			t5171Po.setTtype(dataObject.getString(T5171Po.COLUMNS.TTYPE.name())); 
			t5171Po.setImportationdate(dataObject.getString(T5171Po.COLUMNS.IMPORTATIONDATE.name())); 
			t5171Po.setMwb(dataObject.getString(T5171Po.COLUMNS.MWB.name())); 
			t5171Po.setHwb(dataObject.getString(T5171Po.COLUMNS.HWB.name())); 
			t5171Po.setExpbagno(dataObject.getString(T5171Po.COLUMNS.EXPBAGNO.name())); 
			t5171Po.setBagpiece(dataObject.getString(T5171Po.COLUMNS.BAGPIECE.name())); 
			t5171Po.setFlightno(dataObject.getString(T5171Po.COLUMNS.FLIGHTNO.name())); 
			t5171Po.setPiece(dataObject.getString(T5171Po.COLUMNS.PIECE.name())); 
			t5171Po.setUnit(dataObject.getString(T5171Po.COLUMNS.UNIT.name())); 
			t5171Po.setWeight(dataObject.getString(T5171Po.COLUMNS.WEIGHT.name())); 
			t5171Po.setCheckcode(dataObject.getString(T5171Po.COLUMNS.CHECKCODE.name())); 
			t5171Po.setBriefnote(dataObject.getString(T5171Po.COLUMNS.BRIEFNOTE.name())); 
			t5171Po.setReservedcode1(dataObject.getString(T5171Po.COLUMNS.RESERVEDCODE1.name())); 
			t5171Po.setReservedfield1(dataObject.getString(T5171Po.COLUMNS.RESERVEDFIELD1.name())); 
			t5171Po.setReservedcode2(dataObject.getString(T5171Po.COLUMNS.RESERVEDCODE2.name())); 
			t5171Po.setReservedfield2(dataObject.getString(T5171Po.COLUMNS.RESERVEDFIELD2.name())); 
			t5171Po.setReservedcode3(dataObject.getString(T5171Po.COLUMNS.RESERVEDCODE3.name())); 
			t5171Po.setReservedfield3(dataObject.getString(T5171Po.COLUMNS.RESERVEDFIELD3.name())); 
			t5171Po.setReservedcode4(dataObject.getString(T5171Po.COLUMNS.RESERVEDCODE4.name())); 
			t5171Po.setReservedfield4(dataObject.getString(T5171Po.COLUMNS.RESERVEDFIELD4.name())); 
			t5171Po.setReservedcode5(dataObject.getString(T5171Po.COLUMNS.RESERVEDCODE5.name())); 
			t5171Po.setReservedfield5(dataObject.getString(T5171Po.COLUMNS.RESERVEDFIELD5.name())); 
			return t5171Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final T5171Po t5171Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(T5171Po.COLUMNS.WDATE.name(), t5171Po.getWdate()); 
			dataObject.setValue(T5171Po.COLUMNS.WTIME.name(), t5171Po.getWtime()); 
			dataObject.setValue(T5171Po.COLUMNS.TTYPE.name(), t5171Po.getTtype()); 
			dataObject.setValue(T5171Po.COLUMNS.IMPORTATIONDATE.name(), t5171Po.getImportationdate()); 
			dataObject.setValue(T5171Po.COLUMNS.MWB.name(), t5171Po.getMwb()); 
			dataObject.setValue(T5171Po.COLUMNS.HWB.name(), t5171Po.getHwb()); 
			dataObject.setValue(T5171Po.COLUMNS.EXPBAGNO.name(), t5171Po.getExpbagno()); 
			dataObject.setValue(T5171Po.COLUMNS.BAGPIECE.name(), t5171Po.getBagpiece()); 
			dataObject.setValue(T5171Po.COLUMNS.FLIGHTNO.name(), t5171Po.getFlightno()); 
			dataObject.setValue(T5171Po.COLUMNS.PIECE.name(), t5171Po.getPiece()); 
			dataObject.setValue(T5171Po.COLUMNS.UNIT.name(), t5171Po.getUnit()); 
			dataObject.setValue(T5171Po.COLUMNS.WEIGHT.name(), t5171Po.getWeight()); 
			dataObject.setValue(T5171Po.COLUMNS.CHECKCODE.name(), t5171Po.getCheckcode()); 
			dataObject.setValue(T5171Po.COLUMNS.BRIEFNOTE.name(), t5171Po.getBriefnote()); 
			dataObject.setValue(T5171Po.COLUMNS.RESERVEDCODE1.name(), t5171Po.getReservedcode1()); 
			dataObject.setValue(T5171Po.COLUMNS.RESERVEDFIELD1.name(), t5171Po.getReservedfield1()); 
			dataObject.setValue(T5171Po.COLUMNS.RESERVEDCODE2.name(), t5171Po.getReservedcode2()); 
			dataObject.setValue(T5171Po.COLUMNS.RESERVEDFIELD2.name(), t5171Po.getReservedfield2()); 
			dataObject.setValue(T5171Po.COLUMNS.RESERVEDCODE3.name(), t5171Po.getReservedcode3()); 
			dataObject.setValue(T5171Po.COLUMNS.RESERVEDFIELD3.name(), t5171Po.getReservedfield3()); 
			dataObject.setValue(T5171Po.COLUMNS.RESERVEDCODE4.name(), t5171Po.getReservedcode4()); 
			dataObject.setValue(T5171Po.COLUMNS.RESERVEDFIELD4.name(), t5171Po.getReservedfield4()); 
			dataObject.setValue(T5171Po.COLUMNS.RESERVEDCODE5.name(), t5171Po.getReservedcode5()); 
			dataObject.setValue(T5171Po.COLUMNS.RESERVEDFIELD5.name(), t5171Po.getReservedfield5()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<T5171Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(T5171Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
