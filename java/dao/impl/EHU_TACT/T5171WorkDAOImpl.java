package com.doc.common.dao.impl; 
 
public class T5171WorkDAOImpl extends GeneralDAOImpl<T5171WorkPo> implements T5171WorkDAO { 
	public static final T5171WorkDAOImpl INSTANCE = new T5171WorkDAOImpl(); 
	public static final String TABLENAME = "T5171_WORK"; 

	public T5171WorkDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<T5171WorkPo> CONVERTER = new MapConverter<T5171WorkPo>() { 
 
		@Override 
		public T5171WorkPo convert(final DataObject dataObject) { 
			final T5171WorkPo t5171WorkPo = new T5171WorkPo(); 
			t5171WorkPo.setWdate(dataObject.getString(T5171WorkPo.COLUMNS.WDATE.name())); 
			t5171WorkPo.setWtime(dataObject.getString(T5171WorkPo.COLUMNS.WTIME.name())); 
			t5171WorkPo.setTtype(dataObject.getString(T5171WorkPo.COLUMNS.TTYPE.name())); 
			t5171WorkPo.setImportationdate(dataObject.getString(T5171WorkPo.COLUMNS.IMPORTATIONDATE.name())); 
			t5171WorkPo.setMwb(dataObject.getString(T5171WorkPo.COLUMNS.MWB.name())); 
			t5171WorkPo.setHwb(dataObject.getString(T5171WorkPo.COLUMNS.HWB.name())); 
			t5171WorkPo.setExpbagno(dataObject.getString(T5171WorkPo.COLUMNS.EXPBAGNO.name())); 
			t5171WorkPo.setBagpiece(dataObject.getString(T5171WorkPo.COLUMNS.BAGPIECE.name())); 
			t5171WorkPo.setFlightno(dataObject.getString(T5171WorkPo.COLUMNS.FLIGHTNO.name())); 
			t5171WorkPo.setPiece(dataObject.getString(T5171WorkPo.COLUMNS.PIECE.name())); 
			t5171WorkPo.setUnit(dataObject.getString(T5171WorkPo.COLUMNS.UNIT.name())); 
			t5171WorkPo.setWeight(dataObject.getString(T5171WorkPo.COLUMNS.WEIGHT.name())); 
			t5171WorkPo.setCheckcode(dataObject.getString(T5171WorkPo.COLUMNS.CHECKCODE.name())); 
			t5171WorkPo.setBriefnote(dataObject.getString(T5171WorkPo.COLUMNS.BRIEFNOTE.name())); 
			t5171WorkPo.setReservedcode1(dataObject.getString(T5171WorkPo.COLUMNS.RESERVEDCODE1.name())); 
			t5171WorkPo.setReservedfield1(dataObject.getString(T5171WorkPo.COLUMNS.RESERVEDFIELD1.name())); 
			t5171WorkPo.setReservedcode2(dataObject.getString(T5171WorkPo.COLUMNS.RESERVEDCODE2.name())); 
			t5171WorkPo.setReservedfield2(dataObject.getString(T5171WorkPo.COLUMNS.RESERVEDFIELD2.name())); 
			t5171WorkPo.setReservedcode3(dataObject.getString(T5171WorkPo.COLUMNS.RESERVEDCODE3.name())); 
			t5171WorkPo.setReservedfield3(dataObject.getString(T5171WorkPo.COLUMNS.RESERVEDFIELD3.name())); 
			t5171WorkPo.setReservedcode4(dataObject.getString(T5171WorkPo.COLUMNS.RESERVEDCODE4.name())); 
			t5171WorkPo.setReservedfield4(dataObject.getString(T5171WorkPo.COLUMNS.RESERVEDFIELD4.name())); 
			t5171WorkPo.setReservedcode5(dataObject.getString(T5171WorkPo.COLUMNS.RESERVEDCODE5.name())); 
			t5171WorkPo.setReservedfield5(dataObject.getString(T5171WorkPo.COLUMNS.RESERVEDFIELD5.name())); 
			t5171WorkPo.setDeclno(dataObject.getString(T5171WorkPo.COLUMNS.DECLNO.name())); 
			t5171WorkPo.setBagno(dataObject.getString(T5171WorkPo.COLUMNS.BAGNO.name())); 
			t5171WorkPo.setPkghwb(dataObject.getString(T5171WorkPo.COLUMNS.PKGHWB.name())); 
			t5171WorkPo.setPkghwbqty(dataObject.getString(T5171WorkPo.COLUMNS.PKGHWBQTY.name())); 
			t5171WorkPo.setPkgbagweight(dataObject.getString(T5171WorkPo.COLUMNS.PKGBAGWEIGHT.name())); 
			t5171WorkPo.setPkgbagpce(dataObject.getString(T5171WorkPo.COLUMNS.PKGBAGPCE.name())); 
			t5171WorkPo.setPkgbagno(dataObject.getString(T5171WorkPo.COLUMNS.PKGBAGNO.name())); 
			t5171WorkPo.setSenddate(dataObject.getString(T5171WorkPo.COLUMNS.SENDDATE.name())); 
			return t5171WorkPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final T5171WorkPo t5171WorkPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(T5171WorkPo.COLUMNS.WDATE.name(), t5171WorkPo.getWdate()); 
			dataObject.setValue(T5171WorkPo.COLUMNS.WTIME.name(), t5171WorkPo.getWtime()); 
			dataObject.setValue(T5171WorkPo.COLUMNS.TTYPE.name(), t5171WorkPo.getTtype()); 
			dataObject.setValue(T5171WorkPo.COLUMNS.IMPORTATIONDATE.name(), t5171WorkPo.getImportationdate()); 
			dataObject.setValue(T5171WorkPo.COLUMNS.MWB.name(), t5171WorkPo.getMwb()); 
			dataObject.setValue(T5171WorkPo.COLUMNS.HWB.name(), t5171WorkPo.getHwb()); 
			dataObject.setValue(T5171WorkPo.COLUMNS.EXPBAGNO.name(), t5171WorkPo.getExpbagno()); 
			dataObject.setValue(T5171WorkPo.COLUMNS.BAGPIECE.name(), t5171WorkPo.getBagpiece()); 
			dataObject.setValue(T5171WorkPo.COLUMNS.FLIGHTNO.name(), t5171WorkPo.getFlightno()); 
			dataObject.setValue(T5171WorkPo.COLUMNS.PIECE.name(), t5171WorkPo.getPiece()); 
			dataObject.setValue(T5171WorkPo.COLUMNS.UNIT.name(), t5171WorkPo.getUnit()); 
			dataObject.setValue(T5171WorkPo.COLUMNS.WEIGHT.name(), t5171WorkPo.getWeight()); 
			dataObject.setValue(T5171WorkPo.COLUMNS.CHECKCODE.name(), t5171WorkPo.getCheckcode()); 
			dataObject.setValue(T5171WorkPo.COLUMNS.BRIEFNOTE.name(), t5171WorkPo.getBriefnote()); 
			dataObject.setValue(T5171WorkPo.COLUMNS.RESERVEDCODE1.name(), t5171WorkPo.getReservedcode1()); 
			dataObject.setValue(T5171WorkPo.COLUMNS.RESERVEDFIELD1.name(), t5171WorkPo.getReservedfield1()); 
			dataObject.setValue(T5171WorkPo.COLUMNS.RESERVEDCODE2.name(), t5171WorkPo.getReservedcode2()); 
			dataObject.setValue(T5171WorkPo.COLUMNS.RESERVEDFIELD2.name(), t5171WorkPo.getReservedfield2()); 
			dataObject.setValue(T5171WorkPo.COLUMNS.RESERVEDCODE3.name(), t5171WorkPo.getReservedcode3()); 
			dataObject.setValue(T5171WorkPo.COLUMNS.RESERVEDFIELD3.name(), t5171WorkPo.getReservedfield3()); 
			dataObject.setValue(T5171WorkPo.COLUMNS.RESERVEDCODE4.name(), t5171WorkPo.getReservedcode4()); 
			dataObject.setValue(T5171WorkPo.COLUMNS.RESERVEDFIELD4.name(), t5171WorkPo.getReservedfield4()); 
			dataObject.setValue(T5171WorkPo.COLUMNS.RESERVEDCODE5.name(), t5171WorkPo.getReservedcode5()); 
			dataObject.setValue(T5171WorkPo.COLUMNS.RESERVEDFIELD5.name(), t5171WorkPo.getReservedfield5()); 
			dataObject.setValue(T5171WorkPo.COLUMNS.DECLNO.name(), t5171WorkPo.getDeclno()); 
			dataObject.setValue(T5171WorkPo.COLUMNS.BAGNO.name(), t5171WorkPo.getBagno()); 
			dataObject.setValue(T5171WorkPo.COLUMNS.PKGHWB.name(), t5171WorkPo.getPkghwb()); 
			dataObject.setValue(T5171WorkPo.COLUMNS.PKGHWBQTY.name(), t5171WorkPo.getPkghwbqty()); 
			dataObject.setValue(T5171WorkPo.COLUMNS.PKGBAGWEIGHT.name(), t5171WorkPo.getPkgbagweight()); 
			dataObject.setValue(T5171WorkPo.COLUMNS.PKGBAGPCE.name(), t5171WorkPo.getPkgbagpce()); 
			dataObject.setValue(T5171WorkPo.COLUMNS.PKGBAGNO.name(), t5171WorkPo.getPkgbagno()); 
			dataObject.setValue(T5171WorkPo.COLUMNS.SENDDATE.name(), t5171WorkPo.getSenddate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<T5171WorkPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(T5171WorkPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
