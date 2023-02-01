package com.doc.common.dao.impl; 
 
public class DhlImgciDAOImpl extends GeneralDAOImpl<DhlImgciPo> implements DhlImgciDAO { 
	public static final DhlImgciDAOImpl INSTANCE = new DhlImgciDAOImpl(); 
	public static final String TABLENAME = "DHL_IMGCI"; 

	public DhlImgciDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DhlImgciPo> CONVERTER = new MapConverter<DhlImgciPo>() { 
 
		@Override 
		public DhlImgciPo convert(final DataObject dataObject) { 
			final DhlImgciPo dhlImgciPo = new DhlImgciPo(); 
			dhlImgciPo.setMwb(dataObject.getString(DhlImgciPo.COLUMNS.MWB.name())); 
			dhlImgciPo.setHwb(dataObject.getString(DhlImgciPo.COLUMNS.HWB.name())); 
			dhlImgciPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(DhlImgciPo.COLUMNS.PIECE.name()))); 
			dhlImgciPo.setNop(BigDecimalUtils.formObj(dataObject.getValue(DhlImgciPo.COLUMNS.NOP.name()))); 
			dhlImgciPo.setClearancetype(dataObject.getString(DhlImgciPo.COLUMNS.CLEARANCETYPE.name())); 
			dhlImgciPo.setGcidate(TimestampUtils.of(dataObject.getValue(DhlImgciPo.COLUMNS.GCIDATE.name()))); 
			dhlImgciPo.setWdate(TimestampUtils.of(dataObject.getValue(DhlImgciPo.COLUMNS.WDATE.name()))); 
			dhlImgciPo.setFtpdate(TimestampUtils.of(dataObject.getValue(DhlImgciPo.COLUMNS.FTPDATE.name()))); 
			dhlImgciPo.setFtpfile(dataObject.getString(DhlImgciPo.COLUMNS.FTPFILE.name())); 
			return dhlImgciPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DhlImgciPo dhlImgciPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DhlImgciPo.COLUMNS.MWB.name(), dhlImgciPo.getMwb()); 
			dataObject.setValue(DhlImgciPo.COLUMNS.HWB.name(), dhlImgciPo.getHwb()); 
			dataObject.setValue(DhlImgciPo.COLUMNS.PIECE.name(), dhlImgciPo.getPiece()); 
			dataObject.setValue(DhlImgciPo.COLUMNS.NOP.name(), dhlImgciPo.getNop()); 
			dataObject.setValue(DhlImgciPo.COLUMNS.CLEARANCETYPE.name(), dhlImgciPo.getClearancetype()); 
			dataObject.setValue(DhlImgciPo.COLUMNS.GCIDATE.name(), dhlImgciPo.getGcidate()); 
			dataObject.setValue(DhlImgciPo.COLUMNS.WDATE.name(), dhlImgciPo.getWdate()); 
			dataObject.setValue(DhlImgciPo.COLUMNS.FTPDATE.name(), dhlImgciPo.getFtpdate()); 
			dataObject.setValue(DhlImgciPo.COLUMNS.FTPFILE.name(), dhlImgciPo.getFtpfile()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DhlImgciPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DhlImgciPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
