package com.doc.common.dao.impl; 
 
public class OrderworkimphDAOImpl extends GeneralDAOImpl<OrderworkimphPo> implements OrderworkimphDAO { 
	public static final OrderworkimphDAOImpl INSTANCE = new OrderworkimphDAOImpl(); 
	public static final String TABLENAME = "ORDERWORKIMPH"; 

	public OrderworkimphDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<OrderworkimphPo> CONVERTER = new MapConverter<OrderworkimphPo>() { 
 
		@Override 
		public OrderworkimphPo convert(final DataObject dataObject) { 
			final OrderworkimphPo orderworkimphPo = new OrderworkimphPo(); 
			orderworkimphPo.setWdate(dataObject.getString(OrderworkimphPo.COLUMNS.WDATE.name())); 
			orderworkimphPo.setWtime(dataObject.getString(OrderworkimphPo.COLUMNS.WTIME.name())); 
			orderworkimphPo.setTtype(dataObject.getString(OrderworkimphPo.COLUMNS.TTYPE.name())); 
			orderworkimphPo.setImportdate(dataObject.getString(OrderworkimphPo.COLUMNS.IMPORTDATE.name())); 
			orderworkimphPo.setMwb(dataObject.getString(OrderworkimphPo.COLUMNS.MWB.name())); 
			orderworkimphPo.setHwb(dataObject.getString(OrderworkimphPo.COLUMNS.HWB.name())); 
			orderworkimphPo.setExpbagno(dataObject.getString(OrderworkimphPo.COLUMNS.EXPBAGNO.name())); 
			orderworkimphPo.setBagpiece(dataObject.getString(OrderworkimphPo.COLUMNS.BAGPIECE.name())); 
			orderworkimphPo.setFlightno(dataObject.getString(OrderworkimphPo.COLUMNS.FLIGHTNO.name())); 
			orderworkimphPo.setPiece(dataObject.getString(OrderworkimphPo.COLUMNS.PIECE.name())); 
			orderworkimphPo.setWeight(dataObject.getString(OrderworkimphPo.COLUMNS.WEIGHT.name())); 
			orderworkimphPo.setCheckcode(dataObject.getString(OrderworkimphPo.COLUMNS.CHECKCODE.name())); 
			orderworkimphPo.setBriefnote(dataObject.getString(OrderworkimphPo.COLUMNS.BRIEFNOTE.name())); 
			orderworkimphPo.setInpiece(BigDecimalUtils.formObj(dataObject.getValue(OrderworkimphPo.COLUMNS.INPIECE.name()))); 
			orderworkimphPo.setIndate1(TimestampUtils.of(dataObject.getValue(OrderworkimphPo.COLUMNS.INDATE1.name()))); 
			orderworkimphPo.setIndate2(TimestampUtils.of(dataObject.getValue(OrderworkimphPo.COLUMNS.INDATE2.name()))); 
			orderworkimphPo.setInuser(dataObject.getString(OrderworkimphPo.COLUMNS.INUSER.name())); 
			orderworkimphPo.setInfinish(dataObject.getString(OrderworkimphPo.COLUMNS.INFINISH.name())); 
			orderworkimphPo.setMark(dataObject.getString(OrderworkimphPo.COLUMNS.MARK.name())); 
			orderworkimphPo.setUldno(dataObject.getString(OrderworkimphPo.COLUMNS.ULDNO.name())); 
			orderworkimphPo.setUnit(dataObject.getString(OrderworkimphPo.COLUMNS.UNIT.name())); 
			return orderworkimphPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final OrderworkimphPo orderworkimphPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(OrderworkimphPo.COLUMNS.WDATE.name(), orderworkimphPo.getWdate()); 
			dataObject.setValue(OrderworkimphPo.COLUMNS.WTIME.name(), orderworkimphPo.getWtime()); 
			dataObject.setValue(OrderworkimphPo.COLUMNS.TTYPE.name(), orderworkimphPo.getTtype()); 
			dataObject.setValue(OrderworkimphPo.COLUMNS.IMPORTDATE.name(), orderworkimphPo.getImportdate()); 
			dataObject.setValue(OrderworkimphPo.COLUMNS.MWB.name(), orderworkimphPo.getMwb()); 
			dataObject.setValue(OrderworkimphPo.COLUMNS.HWB.name(), orderworkimphPo.getHwb()); 
			dataObject.setValue(OrderworkimphPo.COLUMNS.EXPBAGNO.name(), orderworkimphPo.getExpbagno()); 
			dataObject.setValue(OrderworkimphPo.COLUMNS.BAGPIECE.name(), orderworkimphPo.getBagpiece()); 
			dataObject.setValue(OrderworkimphPo.COLUMNS.FLIGHTNO.name(), orderworkimphPo.getFlightno()); 
			dataObject.setValue(OrderworkimphPo.COLUMNS.PIECE.name(), orderworkimphPo.getPiece()); 
			dataObject.setValue(OrderworkimphPo.COLUMNS.WEIGHT.name(), orderworkimphPo.getWeight()); 
			dataObject.setValue(OrderworkimphPo.COLUMNS.CHECKCODE.name(), orderworkimphPo.getCheckcode()); 
			dataObject.setValue(OrderworkimphPo.COLUMNS.BRIEFNOTE.name(), orderworkimphPo.getBriefnote()); 
			dataObject.setValue(OrderworkimphPo.COLUMNS.INPIECE.name(), orderworkimphPo.getInpiece()); 
			dataObject.setValue(OrderworkimphPo.COLUMNS.INDATE1.name(), orderworkimphPo.getIndate1()); 
			dataObject.setValue(OrderworkimphPo.COLUMNS.INDATE2.name(), orderworkimphPo.getIndate2()); 
			dataObject.setValue(OrderworkimphPo.COLUMNS.INUSER.name(), orderworkimphPo.getInuser()); 
			dataObject.setValue(OrderworkimphPo.COLUMNS.INFINISH.name(), orderworkimphPo.getInfinish()); 
			dataObject.setValue(OrderworkimphPo.COLUMNS.MARK.name(), orderworkimphPo.getMark()); 
			dataObject.setValue(OrderworkimphPo.COLUMNS.ULDNO.name(), orderworkimphPo.getUldno()); 
			dataObject.setValue(OrderworkimphPo.COLUMNS.UNIT.name(), orderworkimphPo.getUnit()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<OrderworkimphPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(OrderworkimphPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
