package com.doc.common.dao.impl; 
 
public class ManifestpieceDAOImpl extends GeneralDAOImpl<ManifestpiecePo> implements ManifestpieceDAO { 
	public static final ManifestpieceDAOImpl INSTANCE = new ManifestpieceDAOImpl(); 
	public static final String TABLENAME = "MANIFESTPIECE"; 

	public ManifestpieceDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ManifestpiecePo> CONVERTER = new MapConverter<ManifestpiecePo>() { 
 
		@Override 
		public ManifestpiecePo convert(final DataObject dataObject) { 
			final ManifestpiecePo manifestpiecePo = new ManifestpiecePo(); 
			manifestpiecePo.setAwb(dataObject.getString(ManifestpiecePo.COLUMNS.AWB.name())); 
			manifestpiecePo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(ManifestpiecePo.COLUMNS.PIECE.name()))); 
			manifestpiecePo.setCreatedate(TimestampUtils.of(dataObject.getValue(ManifestpiecePo.COLUMNS.CREATEDATE.name()))); 
			manifestpiecePo.setCreateuser(dataObject.getString(ManifestpiecePo.COLUMNS.CREATEUSER.name())); 
			manifestpiecePo.setFlightno(dataObject.getString(ManifestpiecePo.COLUMNS.FLIGHTNO.name())); 
			return manifestpiecePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ManifestpiecePo manifestpiecePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ManifestpiecePo.COLUMNS.AWB.name(), manifestpiecePo.getAwb()); 
			dataObject.setValue(ManifestpiecePo.COLUMNS.PIECE.name(), manifestpiecePo.getPiece()); 
			dataObject.setValue(ManifestpiecePo.COLUMNS.CREATEDATE.name(), manifestpiecePo.getCreatedate()); 
			dataObject.setValue(ManifestpiecePo.COLUMNS.CREATEUSER.name(), manifestpiecePo.getCreateuser()); 
			dataObject.setValue(ManifestpiecePo.COLUMNS.FLIGHTNO.name(), manifestpiecePo.getFlightno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ManifestpiecePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ManifestpiecePo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
