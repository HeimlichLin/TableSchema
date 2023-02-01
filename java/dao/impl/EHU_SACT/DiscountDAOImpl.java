package com.doc.common.dao.impl; 
 
public class DiscountDAOImpl extends GeneralDAOImpl<DiscountPo> implements DiscountDAO { 
	public static final DiscountDAOImpl INSTANCE = new DiscountDAOImpl(); 
	public static final String TABLENAME = "DISCOUNT"; 

	public DiscountDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DiscountPo> CONVERTER = new MapConverter<DiscountPo>() { 
 
		@Override 
		public DiscountPo convert(final DataObject dataObject) { 
			final DiscountPo discountPo = new DiscountPo(); 
			discountPo.setBdate(TimestampUtils.of(dataObject.getValue(DiscountPo.COLUMNS.BDATE.name()))); 
			discountPo.setEdate(TimestampUtils.of(dataObject.getValue(DiscountPo.COLUMNS.EDATE.name()))); 
			discountPo.setKeyvalue(dataObject.getString(DiscountPo.COLUMNS.KEYVALUE.name())); 
			discountPo.setKeytype(dataObject.getString(DiscountPo.COLUMNS.KEYTYPE.name())); 
			discountPo.setRate(BigDecimalUtils.formObj(dataObject.getValue(DiscountPo.COLUMNS.RATE.name()))); 
			discountPo.setCdate(TimestampUtils.of(dataObject.getValue(DiscountPo.COLUMNS.CDATE.name()))); 
			discountPo.setRoundtype(BigDecimalUtils.formObj(dataObject.getValue(DiscountPo.COLUMNS.ROUNDTYPE.name()))); 
			discountPo.setMinweight(BigDecimalUtils.formObj(dataObject.getValue(DiscountPo.COLUMNS.MINWEIGHT.name()))); 
			discountPo.setAcctype(dataObject.getString(DiscountPo.COLUMNS.ACCTYPE.name())); 
			discountPo.setMdate(TimestampUtils.of(dataObject.getValue(DiscountPo.COLUMNS.MDATE.name()))); 
			discountPo.setLastupdate(TimestampUtils.of(dataObject.getValue(DiscountPo.COLUMNS.LASTUPDATE.name()))); 
			discountPo.setLdate(TimestampUtils.of(dataObject.getValue(DiscountPo.COLUMNS.LDATE.name()))); 
			discountPo.setDiscountbox(dataObject.getString(DiscountPo.COLUMNS.DISCOUNTBOX.name())); 
			return discountPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DiscountPo discountPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DiscountPo.COLUMNS.BDATE.name(), discountPo.getBdate()); 
			dataObject.setValue(DiscountPo.COLUMNS.EDATE.name(), discountPo.getEdate()); 
			dataObject.setValue(DiscountPo.COLUMNS.KEYVALUE.name(), discountPo.getKeyvalue()); 
			dataObject.setValue(DiscountPo.COLUMNS.KEYTYPE.name(), discountPo.getKeytype()); 
			dataObject.setValue(DiscountPo.COLUMNS.RATE.name(), discountPo.getRate()); 
			dataObject.setValue(DiscountPo.COLUMNS.CDATE.name(), discountPo.getCdate()); 
			dataObject.setValue(DiscountPo.COLUMNS.ROUNDTYPE.name(), discountPo.getRoundtype()); 
			dataObject.setValue(DiscountPo.COLUMNS.MINWEIGHT.name(), discountPo.getMinweight()); 
			dataObject.setValue(DiscountPo.COLUMNS.ACCTYPE.name(), discountPo.getAcctype()); 
			dataObject.setValue(DiscountPo.COLUMNS.MDATE.name(), discountPo.getMdate()); 
			dataObject.setValue(DiscountPo.COLUMNS.LASTUPDATE.name(), discountPo.getLastupdate()); 
			dataObject.setValue(DiscountPo.COLUMNS.LDATE.name(), discountPo.getLdate()); 
			dataObject.setValue(DiscountPo.COLUMNS.DISCOUNTBOX.name(), discountPo.getDiscountbox()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DiscountPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DiscountPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
