package com.doc.common.dao.impl; 
 
public class DhlExgcoDAOImpl extends GeneralDAOImpl<DhlExgcoPo> implements DhlExgcoDAO { 
	public static final DhlExgcoDAOImpl INSTANCE = new DhlExgcoDAOImpl(); 
	public static final String TABLENAME = "DHL_EXGCO"; 

	public DhlExgcoDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DhlExgcoPo> CONVERTER = new MapConverter<DhlExgcoPo>() { 
 
		@Override 
		public DhlExgcoPo convert(final DataObject dataObject) { 
			final DhlExgcoPo dhlExgcoPo = new DhlExgcoPo(); 
			dhlExgcoPo.setMwb(dataObject.getString(DhlExgcoPo.COLUMNS.MWB.name())); 
			dhlExgcoPo.setHwb(dataObject.getString(DhlExgcoPo.COLUMNS.HWB.name())); 
			dhlExgcoPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(DhlExgcoPo.COLUMNS.PIECE.name()))); 
			dhlExgcoPo.setNop(BigDecimalUtils.formObj(dataObject.getValue(DhlExgcoPo.COLUMNS.NOP.name()))); 
			dhlExgcoPo.setReleasetime(dataObject.getString(DhlExgcoPo.COLUMNS.RELEASETIME.name())); 
			dhlExgcoPo.setGcodate(TimestampUtils.of(dataObject.getValue(DhlExgcoPo.COLUMNS.GCODATE.name()))); 
			dhlExgcoPo.setWdate(TimestampUtils.of(dataObject.getValue(DhlExgcoPo.COLUMNS.WDATE.name()))); 
			dhlExgcoPo.setFtpdate(TimestampUtils.of(dataObject.getValue(DhlExgcoPo.COLUMNS.FTPDATE.name()))); 
			dhlExgcoPo.setFtpfile(dataObject.getString(DhlExgcoPo.COLUMNS.FTPFILE.name())); 
			return dhlExgcoPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DhlExgcoPo dhlExgcoPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DhlExgcoPo.COLUMNS.MWB.name(), dhlExgcoPo.getMwb()); 
			dataObject.setValue(DhlExgcoPo.COLUMNS.HWB.name(), dhlExgcoPo.getHwb()); 
			dataObject.setValue(DhlExgcoPo.COLUMNS.PIECE.name(), dhlExgcoPo.getPiece()); 
			dataObject.setValue(DhlExgcoPo.COLUMNS.NOP.name(), dhlExgcoPo.getNop()); 
			dataObject.setValue(DhlExgcoPo.COLUMNS.RELEASETIME.name(), dhlExgcoPo.getReleasetime()); 
			dataObject.setValue(DhlExgcoPo.COLUMNS.GCODATE.name(), dhlExgcoPo.getGcodate()); 
			dataObject.setValue(DhlExgcoPo.COLUMNS.WDATE.name(), dhlExgcoPo.getWdate()); 
			dataObject.setValue(DhlExgcoPo.COLUMNS.FTPDATE.name(), dhlExgcoPo.getFtpdate()); 
			dataObject.setValue(DhlExgcoPo.COLUMNS.FTPFILE.name(), dhlExgcoPo.getFtpfile()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DhlExgcoPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DhlExgcoPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
