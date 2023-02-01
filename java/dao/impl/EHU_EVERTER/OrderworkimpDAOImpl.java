package com.doc.common.dao.impl; 
 
public class OrderworkimpDAOImpl extends GeneralDAOImpl<OrderworkimpPo> implements OrderworkimpDAO { 
	public static final OrderworkimpDAOImpl INSTANCE = new OrderworkimpDAOImpl(); 
	public static final String TABLENAME = "ORDERWORKIMP"; 

	public OrderworkimpDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<OrderworkimpPo> CONVERTER = new MapConverter<OrderworkimpPo>() { 
 
		@Override 
		public OrderworkimpPo convert(final DataObject dataObject) { 
			final OrderworkimpPo orderworkimpPo = new OrderworkimpPo(); 
			orderworkimpPo.setWdate(dataObject.getString(OrderworkimpPo.COLUMNS.WDATE.name())); 
			orderworkimpPo.setWtime(dataObject.getString(OrderworkimpPo.COLUMNS.WTIME.name())); 
			orderworkimpPo.setTtype(dataObject.getString(OrderworkimpPo.COLUMNS.TTYPE.name())); 
			orderworkimpPo.setImportdate(dataObject.getString(OrderworkimpPo.COLUMNS.IMPORTDATE.name())); 
			orderworkimpPo.setMwb(dataObject.getString(OrderworkimpPo.COLUMNS.MWB.name())); 
			orderworkimpPo.setHwb(dataObject.getString(OrderworkimpPo.COLUMNS.HWB.name())); 
			orderworkimpPo.setExpbagno(dataObject.getString(OrderworkimpPo.COLUMNS.EXPBAGNO.name())); 
			orderworkimpPo.setBagpiece(dataObject.getString(OrderworkimpPo.COLUMNS.BAGPIECE.name())); 
			orderworkimpPo.setFlightno(dataObject.getString(OrderworkimpPo.COLUMNS.FLIGHTNO.name())); 
			orderworkimpPo.setPiece(dataObject.getString(OrderworkimpPo.COLUMNS.PIECE.name())); 
			orderworkimpPo.setWeight(dataObject.getString(OrderworkimpPo.COLUMNS.WEIGHT.name())); 
			orderworkimpPo.setCheckcode(dataObject.getString(OrderworkimpPo.COLUMNS.CHECKCODE.name())); 
			orderworkimpPo.setBriefnote(dataObject.getString(OrderworkimpPo.COLUMNS.BRIEFNOTE.name())); 
			orderworkimpPo.setInpiece(BigDecimalUtils.formObj(dataObject.getValue(OrderworkimpPo.COLUMNS.INPIECE.name()))); 
			orderworkimpPo.setIndate1(TimestampUtils.of(dataObject.getValue(OrderworkimpPo.COLUMNS.INDATE1.name()))); 
			orderworkimpPo.setIndate2(TimestampUtils.of(dataObject.getValue(OrderworkimpPo.COLUMNS.INDATE2.name()))); 
			orderworkimpPo.setInuser(dataObject.getString(OrderworkimpPo.COLUMNS.INUSER.name())); 
			orderworkimpPo.setInfinish(dataObject.getString(OrderworkimpPo.COLUMNS.INFINISH.name())); 
			orderworkimpPo.setMark(dataObject.getString(OrderworkimpPo.COLUMNS.MARK.name())); 
			orderworkimpPo.setUldno(dataObject.getString(OrderworkimpPo.COLUMNS.ULDNO.name())); 
			orderworkimpPo.setUnit(dataObject.getString(OrderworkimpPo.COLUMNS.UNIT.name())); 
			return orderworkimpPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final OrderworkimpPo orderworkimpPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(OrderworkimpPo.COLUMNS.WDATE.name(), orderworkimpPo.getWdate()); 
			dataObject.setValue(OrderworkimpPo.COLUMNS.WTIME.name(), orderworkimpPo.getWtime()); 
			dataObject.setValue(OrderworkimpPo.COLUMNS.TTYPE.name(), orderworkimpPo.getTtype()); 
			dataObject.setValue(OrderworkimpPo.COLUMNS.IMPORTDATE.name(), orderworkimpPo.getImportdate()); 
			dataObject.setValue(OrderworkimpPo.COLUMNS.MWB.name(), orderworkimpPo.getMwb()); 
			dataObject.setValue(OrderworkimpPo.COLUMNS.HWB.name(), orderworkimpPo.getHwb()); 
			dataObject.setValue(OrderworkimpPo.COLUMNS.EXPBAGNO.name(), orderworkimpPo.getExpbagno()); 
			dataObject.setValue(OrderworkimpPo.COLUMNS.BAGPIECE.name(), orderworkimpPo.getBagpiece()); 
			dataObject.setValue(OrderworkimpPo.COLUMNS.FLIGHTNO.name(), orderworkimpPo.getFlightno()); 
			dataObject.setValue(OrderworkimpPo.COLUMNS.PIECE.name(), orderworkimpPo.getPiece()); 
			dataObject.setValue(OrderworkimpPo.COLUMNS.WEIGHT.name(), orderworkimpPo.getWeight()); 
			dataObject.setValue(OrderworkimpPo.COLUMNS.CHECKCODE.name(), orderworkimpPo.getCheckcode()); 
			dataObject.setValue(OrderworkimpPo.COLUMNS.BRIEFNOTE.name(), orderworkimpPo.getBriefnote()); 
			dataObject.setValue(OrderworkimpPo.COLUMNS.INPIECE.name(), orderworkimpPo.getInpiece()); 
			dataObject.setValue(OrderworkimpPo.COLUMNS.INDATE1.name(), orderworkimpPo.getIndate1()); 
			dataObject.setValue(OrderworkimpPo.COLUMNS.INDATE2.name(), orderworkimpPo.getIndate2()); 
			dataObject.setValue(OrderworkimpPo.COLUMNS.INUSER.name(), orderworkimpPo.getInuser()); 
			dataObject.setValue(OrderworkimpPo.COLUMNS.INFINISH.name(), orderworkimpPo.getInfinish()); 
			dataObject.setValue(OrderworkimpPo.COLUMNS.MARK.name(), orderworkimpPo.getMark()); 
			dataObject.setValue(OrderworkimpPo.COLUMNS.ULDNO.name(), orderworkimpPo.getUldno()); 
			dataObject.setValue(OrderworkimpPo.COLUMNS.UNIT.name(), orderworkimpPo.getUnit()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<OrderworkimpPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(OrderworkimpPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
