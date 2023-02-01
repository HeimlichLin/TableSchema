package com.doc.common.dao.impl; 
 
public class ReleaseDAOImpl extends GeneralDAOImpl<ReleasePo> implements ReleaseDAO { 
	public static final ReleaseDAOImpl INSTANCE = new ReleaseDAOImpl(); 
	public static final String TABLENAME = "RELEASE"; 

	public ReleaseDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ReleasePo> CONVERTER = new MapConverter<ReleasePo>() { 
 
		@Override 
		public ReleasePo convert(final DataObject dataObject) { 
			final ReleasePo releasePo = new ReleasePo(); 
			releasePo.setBoxNo(dataObject.getString(ReleasePo.COLUMNS.BOX_NO.name())); 
			releasePo.setDeclType(dataObject.getString(ReleasePo.COLUMNS.DECL_TYPE.name())); 
			releasePo.setDeclNo(dataObject.getString(ReleasePo.COLUMNS.DECL_NO.name())); 
			releasePo.setStgPlace(dataObject.getString(ReleasePo.COLUMNS.STG_PLACE.name())); 
			releasePo.setRlsTime(TimestampUtils.of(dataObject.getValue(ReleasePo.COLUMNS.RLS_TIME.name()))); 
			releasePo.setRlsPkg(BigDecimalUtils.formObj(dataObject.getValue(ReleasePo.COLUMNS.RLS_PKG.name()))); 
			releasePo.setPkgUnit(dataObject.getString(ReleasePo.COLUMNS.PKG_UNIT.name())); 
			releasePo.setGWgt(BigDecimalUtils.formObj(dataObject.getValue(ReleasePo.COLUMNS.G_WGT.name()))); 
			releasePo.setExtracond(dataObject.getString(ReleasePo.COLUMNS.EXTRACOND.name())); 
			releasePo.setVesselSign(dataObject.getString(ReleasePo.COLUMNS.VESSEL_SIGN.name())); 
			releasePo.setVoyageNo(dataObject.getString(ReleasePo.COLUMNS.VOYAGE_NO.name())); 
			releasePo.setShipCode(dataObject.getString(ReleasePo.COLUMNS.SHIP_CODE.name())); 
			releasePo.setExporter(dataObject.getString(ReleasePo.COLUMNS.EXPORTER.name())); 
			releasePo.setClearType(dataObject.getString(ReleasePo.COLUMNS.CLEAR_TYPE.name())); 
			releasePo.setMsgType(dataObject.getString(ReleasePo.COLUMNS.MSG_TYPE.name())); 
			releasePo.setStrType(dataObject.getString(ReleasePo.COLUMNS.STR_TYPE.name())); 
			releasePo.setTransId(dataObject.getString(ReleasePo.COLUMNS.TRANS_ID.name())); 
			releasePo.setAsType(dataObject.getString(ReleasePo.COLUMNS.AS_TYPE.name())); 
			releasePo.setIoType(dataObject.getString(ReleasePo.COLUMNS.IO_TYPE.name())); 
			releasePo.setMawbNo(dataObject.getString(ReleasePo.COLUMNS.MAWB_NO.name())); 
			releasePo.setHawbNo(dataObject.getString(ReleasePo.COLUMNS.HAWB_NO.name())); 
			releasePo.setDeclSeqNo(BigDecimalUtils.formObj(dataObject.getValue(ReleasePo.COLUMNS.DECL_SEQ_NO.name()))); 
			return releasePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ReleasePo releasePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ReleasePo.COLUMNS.BOX_NO.name(), releasePo.getBoxNo()); 
			dataObject.setValue(ReleasePo.COLUMNS.DECL_TYPE.name(), releasePo.getDeclType()); 
			dataObject.setValue(ReleasePo.COLUMNS.DECL_NO.name(), releasePo.getDeclNo()); 
			dataObject.setValue(ReleasePo.COLUMNS.STG_PLACE.name(), releasePo.getStgPlace()); 
			dataObject.setValue(ReleasePo.COLUMNS.RLS_TIME.name(), releasePo.getRlsTime()); 
			dataObject.setValue(ReleasePo.COLUMNS.RLS_PKG.name(), releasePo.getRlsPkg()); 
			dataObject.setValue(ReleasePo.COLUMNS.PKG_UNIT.name(), releasePo.getPkgUnit()); 
			dataObject.setValue(ReleasePo.COLUMNS.G_WGT.name(), releasePo.getGWgt()); 
			dataObject.setValue(ReleasePo.COLUMNS.EXTRACOND.name(), releasePo.getExtracond()); 
			dataObject.setValue(ReleasePo.COLUMNS.VESSEL_SIGN.name(), releasePo.getVesselSign()); 
			dataObject.setValue(ReleasePo.COLUMNS.VOYAGE_NO.name(), releasePo.getVoyageNo()); 
			dataObject.setValue(ReleasePo.COLUMNS.SHIP_CODE.name(), releasePo.getShipCode()); 
			dataObject.setValue(ReleasePo.COLUMNS.EXPORTER.name(), releasePo.getExporter()); 
			dataObject.setValue(ReleasePo.COLUMNS.CLEAR_TYPE.name(), releasePo.getClearType()); 
			dataObject.setValue(ReleasePo.COLUMNS.MSG_TYPE.name(), releasePo.getMsgType()); 
			dataObject.setValue(ReleasePo.COLUMNS.STR_TYPE.name(), releasePo.getStrType()); 
			dataObject.setValue(ReleasePo.COLUMNS.TRANS_ID.name(), releasePo.getTransId()); 
			dataObject.setValue(ReleasePo.COLUMNS.AS_TYPE.name(), releasePo.getAsType()); 
			dataObject.setValue(ReleasePo.COLUMNS.IO_TYPE.name(), releasePo.getIoType()); 
			dataObject.setValue(ReleasePo.COLUMNS.MAWB_NO.name(), releasePo.getMawbNo()); 
			dataObject.setValue(ReleasePo.COLUMNS.HAWB_NO.name(), releasePo.getHawbNo()); 
			dataObject.setValue(ReleasePo.COLUMNS.DECL_SEQ_NO.name(), releasePo.getDeclSeqNo()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ReleasePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ReleasePo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
