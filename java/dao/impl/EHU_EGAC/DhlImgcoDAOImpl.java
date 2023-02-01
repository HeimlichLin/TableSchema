package com.doc.common.dao.impl; 
 
public class DhlImgcoDAOImpl extends GeneralDAOImpl<DhlImgcoPo> implements DhlImgcoDAO { 
	public static final DhlImgcoDAOImpl INSTANCE = new DhlImgcoDAOImpl(); 
	public static final String TABLENAME = "DHL_IMGCO"; 

	public DhlImgcoDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DhlImgcoPo> CONVERTER = new MapConverter<DhlImgcoPo>() { 
 
		@Override 
		public DhlImgcoPo convert(final DataObject dataObject) { 
			final DhlImgcoPo dhlImgcoPo = new DhlImgcoPo(); 
			dhlImgcoPo.setMwb(dataObject.getString(DhlImgcoPo.COLUMNS.MWB.name())); 
			dhlImgcoPo.setHwb(dataObject.getString(DhlImgcoPo.COLUMNS.HWB.name())); 
			dhlImgcoPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(DhlImgcoPo.COLUMNS.PIECE.name()))); 
			dhlImgcoPo.setNop(BigDecimalUtils.formObj(dataObject.getValue(DhlImgcoPo.COLUMNS.NOP.name()))); 
			dhlImgcoPo.setReleasetime(dataObject.getString(DhlImgcoPo.COLUMNS.RELEASETIME.name())); 
			dhlImgcoPo.setGcodate(TimestampUtils.of(dataObject.getValue(DhlImgcoPo.COLUMNS.GCODATE.name()))); 
			dhlImgcoPo.setWdate(TimestampUtils.of(dataObject.getValue(DhlImgcoPo.COLUMNS.WDATE.name()))); 
			dhlImgcoPo.setFtpdate(TimestampUtils.of(dataObject.getValue(DhlImgcoPo.COLUMNS.FTPDATE.name()))); 
			dhlImgcoPo.setFtpfile(dataObject.getString(DhlImgcoPo.COLUMNS.FTPFILE.name())); 
			return dhlImgcoPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DhlImgcoPo dhlImgcoPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DhlImgcoPo.COLUMNS.MWB.name(), dhlImgcoPo.getMwb()); 
			dataObject.setValue(DhlImgcoPo.COLUMNS.HWB.name(), dhlImgcoPo.getHwb()); 
			dataObject.setValue(DhlImgcoPo.COLUMNS.PIECE.name(), dhlImgcoPo.getPiece()); 
			dataObject.setValue(DhlImgcoPo.COLUMNS.NOP.name(), dhlImgcoPo.getNop()); 
			dataObject.setValue(DhlImgcoPo.COLUMNS.RELEASETIME.name(), dhlImgcoPo.getReleasetime()); 
			dataObject.setValue(DhlImgcoPo.COLUMNS.GCODATE.name(), dhlImgcoPo.getGcodate()); 
			dataObject.setValue(DhlImgcoPo.COLUMNS.WDATE.name(), dhlImgcoPo.getWdate()); 
			dataObject.setValue(DhlImgcoPo.COLUMNS.FTPDATE.name(), dhlImgcoPo.getFtpdate()); 
			dataObject.setValue(DhlImgcoPo.COLUMNS.FTPFILE.name(), dhlImgcoPo.getFtpfile()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DhlImgcoPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DhlImgcoPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
