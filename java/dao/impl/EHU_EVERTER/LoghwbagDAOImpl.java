package com.doc.common.dao.impl; 
 
public class LoghwbagDAOImpl extends GeneralDAOImpl<LoghwbagPo> implements LoghwbagDAO { 
	public static final LoghwbagDAOImpl INSTANCE = new LoghwbagDAOImpl(); 
	public static final String TABLENAME = "LOGHWBAG"; 

	public LoghwbagDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LoghwbagPo> CONVERTER = new MapConverter<LoghwbagPo>() { 
 
		@Override 
		public LoghwbagPo convert(final DataObject dataObject) { 
			final LoghwbagPo loghwbagPo = new LoghwbagPo(); 
			loghwbagPo.setHwbBagno(dataObject.getString(LoghwbagPo.COLUMNS.HWB_BAGNO.name())); 
			loghwbagPo.setHwbHwb(dataObject.getString(LoghwbagPo.COLUMNS.HWB_HWB.name())); 
			loghwbagPo.setHwbMwb(dataObject.getString(LoghwbagPo.COLUMNS.HWB_MWB.name())); 
			loghwbagPo.setHwbExpbagno(dataObject.getString(LoghwbagPo.COLUMNS.HWB_EXPBAGNO.name())); 
			loghwbagPo.setHwbDeclno(dataObject.getString(LoghwbagPo.COLUMNS.HWB_DECLNO.name())); 
			loghwbagPo.setHwbDeltype(dataObject.getString(LoghwbagPo.COLUMNS.HWB_DELTYPE.name())); 
			loghwbagPo.setHwbPiece(BigDecimalUtils.formObj(dataObject.getValue(LoghwbagPo.COLUMNS.HWB_PIECE.name()))); 
			loghwbagPo.setHwbGciweight(BigDecimalUtils.formObj(dataObject.getValue(LoghwbagPo.COLUMNS.HWB_GCIWEIGHT.name()))); 
			loghwbagPo.setHwbGcidate1(TimestampUtils.of(dataObject.getValue(LoghwbagPo.COLUMNS.HWB_GCIDATE1.name()))); 
			loghwbagPo.setHwbGcidate2(TimestampUtils.of(dataObject.getValue(LoghwbagPo.COLUMNS.HWB_GCIDATE2.name()))); 
			loghwbagPo.setHwbGcodate1(TimestampUtils.of(dataObject.getValue(LoghwbagPo.COLUMNS.HWB_GCODATE1.name()))); 
			loghwbagPo.setHwbGcodate2(TimestampUtils.of(dataObject.getValue(LoghwbagPo.COLUMNS.HWB_GCODATE2.name()))); 
			loghwbagPo.setHwbLastupdate(TimestampUtils.of(dataObject.getValue(LoghwbagPo.COLUMNS.HWB_LASTUPDATE.name()))); 
			loghwbagPo.setBagBaghwb(BigDecimalUtils.formObj(dataObject.getValue(LoghwbagPo.COLUMNS.BAG_BAGHWB.name()))); 
			loghwbagPo.setBagBagpiece(BigDecimalUtils.formObj(dataObject.getValue(LoghwbagPo.COLUMNS.BAG_BAGPIECE.name()))); 
			loghwbagPo.setBagBagweight(BigDecimalUtils.formObj(dataObject.getValue(LoghwbagPo.COLUMNS.BAG_BAGWEIGHT.name()))); 
			loghwbagPo.setBagBagfee(BigDecimalUtils.formObj(dataObject.getValue(LoghwbagPo.COLUMNS.BAG_BAGFEE.name()))); 
			loghwbagPo.setBagLastupdate(TimestampUtils.of(dataObject.getValue(LoghwbagPo.COLUMNS.BAG_LASTUPDATE.name()))); 
			loghwbagPo.setHwbGcipiece(BigDecimalUtils.formObj(dataObject.getValue(LoghwbagPo.COLUMNS.HWB_GCIPIECE.name()))); 
			loghwbagPo.setHwbGcopiece(BigDecimalUtils.formObj(dataObject.getValue(LoghwbagPo.COLUMNS.HWB_GCOPIECE.name()))); 
			return loghwbagPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final LoghwbagPo loghwbagPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LoghwbagPo.COLUMNS.HWB_BAGNO.name(), loghwbagPo.getHwbBagno()); 
			dataObject.setValue(LoghwbagPo.COLUMNS.HWB_HWB.name(), loghwbagPo.getHwbHwb()); 
			dataObject.setValue(LoghwbagPo.COLUMNS.HWB_MWB.name(), loghwbagPo.getHwbMwb()); 
			dataObject.setValue(LoghwbagPo.COLUMNS.HWB_EXPBAGNO.name(), loghwbagPo.getHwbExpbagno()); 
			dataObject.setValue(LoghwbagPo.COLUMNS.HWB_DECLNO.name(), loghwbagPo.getHwbDeclno()); 
			dataObject.setValue(LoghwbagPo.COLUMNS.HWB_DELTYPE.name(), loghwbagPo.getHwbDeltype()); 
			dataObject.setValue(LoghwbagPo.COLUMNS.HWB_PIECE.name(), loghwbagPo.getHwbPiece()); 
			dataObject.setValue(LoghwbagPo.COLUMNS.HWB_GCIWEIGHT.name(), loghwbagPo.getHwbGciweight()); 
			dataObject.setValue(LoghwbagPo.COLUMNS.HWB_GCIDATE1.name(), loghwbagPo.getHwbGcidate1()); 
			dataObject.setValue(LoghwbagPo.COLUMNS.HWB_GCIDATE2.name(), loghwbagPo.getHwbGcidate2()); 
			dataObject.setValue(LoghwbagPo.COLUMNS.HWB_GCODATE1.name(), loghwbagPo.getHwbGcodate1()); 
			dataObject.setValue(LoghwbagPo.COLUMNS.HWB_GCODATE2.name(), loghwbagPo.getHwbGcodate2()); 
			dataObject.setValue(LoghwbagPo.COLUMNS.HWB_LASTUPDATE.name(), loghwbagPo.getHwbLastupdate()); 
			dataObject.setValue(LoghwbagPo.COLUMNS.BAG_BAGHWB.name(), loghwbagPo.getBagBaghwb()); 
			dataObject.setValue(LoghwbagPo.COLUMNS.BAG_BAGPIECE.name(), loghwbagPo.getBagBagpiece()); 
			dataObject.setValue(LoghwbagPo.COLUMNS.BAG_BAGWEIGHT.name(), loghwbagPo.getBagBagweight()); 
			dataObject.setValue(LoghwbagPo.COLUMNS.BAG_BAGFEE.name(), loghwbagPo.getBagBagfee()); 
			dataObject.setValue(LoghwbagPo.COLUMNS.BAG_LASTUPDATE.name(), loghwbagPo.getBagLastupdate()); 
			dataObject.setValue(LoghwbagPo.COLUMNS.HWB_GCIPIECE.name(), loghwbagPo.getHwbGcipiece()); 
			dataObject.setValue(LoghwbagPo.COLUMNS.HWB_GCOPIECE.name(), loghwbagPo.getHwbGcopiece()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LoghwbagPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LoghwbagPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
