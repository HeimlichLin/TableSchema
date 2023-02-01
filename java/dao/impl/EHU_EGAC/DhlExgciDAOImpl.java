package com.doc.common.dao.impl; 
 
public class DhlExgciDAOImpl extends GeneralDAOImpl<DhlExgciPo> implements DhlExgciDAO { 
	public static final DhlExgciDAOImpl INSTANCE = new DhlExgciDAOImpl(); 
	public static final String TABLENAME = "DHL_EXGCI"; 

	public DhlExgciDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DhlExgciPo> CONVERTER = new MapConverter<DhlExgciPo>() { 
 
		@Override 
		public DhlExgciPo convert(final DataObject dataObject) { 
			final DhlExgciPo dhlExgciPo = new DhlExgciPo(); 
			dhlExgciPo.setMwb(dataObject.getString(DhlExgciPo.COLUMNS.MWB.name())); 
			dhlExgciPo.setHwb(dataObject.getString(DhlExgciPo.COLUMNS.HWB.name())); 
			dhlExgciPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(DhlExgciPo.COLUMNS.PIECE.name()))); 
			dhlExgciPo.setNop(BigDecimalUtils.formObj(dataObject.getValue(DhlExgciPo.COLUMNS.NOP.name()))); 
			dhlExgciPo.setClearancetype(dataObject.getString(DhlExgciPo.COLUMNS.CLEARANCETYPE.name())); 
			dhlExgciPo.setGcidate(TimestampUtils.of(dataObject.getValue(DhlExgciPo.COLUMNS.GCIDATE.name()))); 
			dhlExgciPo.setWdate(TimestampUtils.of(dataObject.getValue(DhlExgciPo.COLUMNS.WDATE.name()))); 
			dhlExgciPo.setFtpdate(TimestampUtils.of(dataObject.getValue(DhlExgciPo.COLUMNS.FTPDATE.name()))); 
			dhlExgciPo.setFtpfile(dataObject.getString(DhlExgciPo.COLUMNS.FTPFILE.name())); 
			return dhlExgciPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DhlExgciPo dhlExgciPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DhlExgciPo.COLUMNS.MWB.name(), dhlExgciPo.getMwb()); 
			dataObject.setValue(DhlExgciPo.COLUMNS.HWB.name(), dhlExgciPo.getHwb()); 
			dataObject.setValue(DhlExgciPo.COLUMNS.PIECE.name(), dhlExgciPo.getPiece()); 
			dataObject.setValue(DhlExgciPo.COLUMNS.NOP.name(), dhlExgciPo.getNop()); 
			dataObject.setValue(DhlExgciPo.COLUMNS.CLEARANCETYPE.name(), dhlExgciPo.getClearancetype()); 
			dataObject.setValue(DhlExgciPo.COLUMNS.GCIDATE.name(), dhlExgciPo.getGcidate()); 
			dataObject.setValue(DhlExgciPo.COLUMNS.WDATE.name(), dhlExgciPo.getWdate()); 
			dataObject.setValue(DhlExgciPo.COLUMNS.FTPDATE.name(), dhlExgciPo.getFtpdate()); 
			dataObject.setValue(DhlExgciPo.COLUMNS.FTPFILE.name(), dhlExgciPo.getFtpfile()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DhlExgciPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DhlExgciPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
