package com.doc.common.dao.impl; 
 
public class T5171backupDAOImpl extends GeneralDAOImpl<T5171backupPo> implements T5171backupDAO { 
	public static final T5171backupDAOImpl INSTANCE = new T5171backupDAOImpl(); 
	public static final String TABLENAME = "T5171BACKUP"; 

	public T5171backupDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<T5171backupPo> CONVERTER = new MapConverter<T5171backupPo>() { 
 
		@Override 
		public T5171backupPo convert(final DataObject dataObject) { 
			final T5171backupPo t5171backupPo = new T5171backupPo(); 
			t5171backupPo.setWdate(dataObject.getString(T5171backupPo.COLUMNS.WDATE.name())); 
			t5171backupPo.setWtime(dataObject.getString(T5171backupPo.COLUMNS.WTIME.name())); 
			t5171backupPo.setTtype(dataObject.getString(T5171backupPo.COLUMNS.TTYPE.name())); 
			t5171backupPo.setImportationdate(dataObject.getString(T5171backupPo.COLUMNS.IMPORTATIONDATE.name())); 
			t5171backupPo.setMwb(dataObject.getString(T5171backupPo.COLUMNS.MWB.name())); 
			t5171backupPo.setHwb(dataObject.getString(T5171backupPo.COLUMNS.HWB.name())); 
			t5171backupPo.setExpbagno(dataObject.getString(T5171backupPo.COLUMNS.EXPBAGNO.name())); 
			t5171backupPo.setBagpiece(dataObject.getString(T5171backupPo.COLUMNS.BAGPIECE.name())); 
			t5171backupPo.setFlightno(dataObject.getString(T5171backupPo.COLUMNS.FLIGHTNO.name())); 
			t5171backupPo.setPiece(dataObject.getString(T5171backupPo.COLUMNS.PIECE.name())); 
			t5171backupPo.setUnit(dataObject.getString(T5171backupPo.COLUMNS.UNIT.name())); 
			t5171backupPo.setWeight(dataObject.getString(T5171backupPo.COLUMNS.WEIGHT.name())); 
			t5171backupPo.setCheckcode(dataObject.getString(T5171backupPo.COLUMNS.CHECKCODE.name())); 
			t5171backupPo.setBriefnote(dataObject.getString(T5171backupPo.COLUMNS.BRIEFNOTE.name())); 
			t5171backupPo.setReservedcode1(dataObject.getString(T5171backupPo.COLUMNS.RESERVEDCODE1.name())); 
			t5171backupPo.setReservedfield1(dataObject.getString(T5171backupPo.COLUMNS.RESERVEDFIELD1.name())); 
			t5171backupPo.setReservedcode2(dataObject.getString(T5171backupPo.COLUMNS.RESERVEDCODE2.name())); 
			t5171backupPo.setReservedfield2(dataObject.getString(T5171backupPo.COLUMNS.RESERVEDFIELD2.name())); 
			t5171backupPo.setReservedcode3(dataObject.getString(T5171backupPo.COLUMNS.RESERVEDCODE3.name())); 
			t5171backupPo.setReservedfield3(dataObject.getString(T5171backupPo.COLUMNS.RESERVEDFIELD3.name())); 
			t5171backupPo.setReservedcode4(dataObject.getString(T5171backupPo.COLUMNS.RESERVEDCODE4.name())); 
			t5171backupPo.setReservedfield4(dataObject.getString(T5171backupPo.COLUMNS.RESERVEDFIELD4.name())); 
			t5171backupPo.setReservedcode5(dataObject.getString(T5171backupPo.COLUMNS.RESERVEDCODE5.name())); 
			t5171backupPo.setReservedfield5(dataObject.getString(T5171backupPo.COLUMNS.RESERVEDFIELD5.name())); 
			return t5171backupPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final T5171backupPo t5171backupPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(T5171backupPo.COLUMNS.WDATE.name(), t5171backupPo.getWdate()); 
			dataObject.setValue(T5171backupPo.COLUMNS.WTIME.name(), t5171backupPo.getWtime()); 
			dataObject.setValue(T5171backupPo.COLUMNS.TTYPE.name(), t5171backupPo.getTtype()); 
			dataObject.setValue(T5171backupPo.COLUMNS.IMPORTATIONDATE.name(), t5171backupPo.getImportationdate()); 
			dataObject.setValue(T5171backupPo.COLUMNS.MWB.name(), t5171backupPo.getMwb()); 
			dataObject.setValue(T5171backupPo.COLUMNS.HWB.name(), t5171backupPo.getHwb()); 
			dataObject.setValue(T5171backupPo.COLUMNS.EXPBAGNO.name(), t5171backupPo.getExpbagno()); 
			dataObject.setValue(T5171backupPo.COLUMNS.BAGPIECE.name(), t5171backupPo.getBagpiece()); 
			dataObject.setValue(T5171backupPo.COLUMNS.FLIGHTNO.name(), t5171backupPo.getFlightno()); 
			dataObject.setValue(T5171backupPo.COLUMNS.PIECE.name(), t5171backupPo.getPiece()); 
			dataObject.setValue(T5171backupPo.COLUMNS.UNIT.name(), t5171backupPo.getUnit()); 
			dataObject.setValue(T5171backupPo.COLUMNS.WEIGHT.name(), t5171backupPo.getWeight()); 
			dataObject.setValue(T5171backupPo.COLUMNS.CHECKCODE.name(), t5171backupPo.getCheckcode()); 
			dataObject.setValue(T5171backupPo.COLUMNS.BRIEFNOTE.name(), t5171backupPo.getBriefnote()); 
			dataObject.setValue(T5171backupPo.COLUMNS.RESERVEDCODE1.name(), t5171backupPo.getReservedcode1()); 
			dataObject.setValue(T5171backupPo.COLUMNS.RESERVEDFIELD1.name(), t5171backupPo.getReservedfield1()); 
			dataObject.setValue(T5171backupPo.COLUMNS.RESERVEDCODE2.name(), t5171backupPo.getReservedcode2()); 
			dataObject.setValue(T5171backupPo.COLUMNS.RESERVEDFIELD2.name(), t5171backupPo.getReservedfield2()); 
			dataObject.setValue(T5171backupPo.COLUMNS.RESERVEDCODE3.name(), t5171backupPo.getReservedcode3()); 
			dataObject.setValue(T5171backupPo.COLUMNS.RESERVEDFIELD3.name(), t5171backupPo.getReservedfield3()); 
			dataObject.setValue(T5171backupPo.COLUMNS.RESERVEDCODE4.name(), t5171backupPo.getReservedcode4()); 
			dataObject.setValue(T5171backupPo.COLUMNS.RESERVEDFIELD4.name(), t5171backupPo.getReservedfield4()); 
			dataObject.setValue(T5171backupPo.COLUMNS.RESERVEDCODE5.name(), t5171backupPo.getReservedcode5()); 
			dataObject.setValue(T5171backupPo.COLUMNS.RESERVEDFIELD5.name(), t5171backupPo.getReservedfield5()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<T5171backupPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(T5171backupPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
