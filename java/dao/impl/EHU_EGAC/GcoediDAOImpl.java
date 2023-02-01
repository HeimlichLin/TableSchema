package com.doc.common.dao.impl; 
 
public class GcoediDAOImpl extends GeneralDAOImpl<GcoediPo> implements GcoediDAO { 
	public static final GcoediDAOImpl INSTANCE = new GcoediDAOImpl(); 
	public static final String TABLENAME = "GCOEDI"; 

	public GcoediDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<GcoediPo> CONVERTER = new MapConverter<GcoediPo>() { 
 
		@Override 
		public GcoediPo convert(final DataObject dataObject) { 
			final GcoediPo gcoediPo = new GcoediPo(); 
			gcoediPo.setControlno(dataObject.getString(GcoediPo.COLUMNS.CONTROLNO.name())); 
			gcoediPo.setDeclno(dataObject.getString(GcoediPo.COLUMNS.DECLNO.name())); 
			gcoediPo.setMwb(dataObject.getString(GcoediPo.COLUMNS.MWB.name())); 
			gcoediPo.setHwb(dataObject.getString(GcoediPo.COLUMNS.HWB.name())); 
			gcoediPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(GcoediPo.COLUMNS.PIECE.name()))); 
			gcoediPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(GcoediPo.COLUMNS.WEIGHT.name()))); 
			gcoediPo.setReleasedate(dataObject.getString(GcoediPo.COLUMNS.RELEASEDATE.name())); 
			gcoediPo.setReleasetime(dataObject.getString(GcoediPo.COLUMNS.RELEASETIME.name())); 
			gcoediPo.setLastupdate(TimestampUtils.of(dataObject.getValue(GcoediPo.COLUMNS.LASTUPDATE.name()))); 
			gcoediPo.setClearancetype(dataObject.getString(GcoediPo.COLUMNS.CLEARANCETYPE.name())); 
			gcoediPo.setTranstype(dataObject.getString(GcoediPo.COLUMNS.TRANSTYPE.name())); 
			gcoediPo.setMessagetype(dataObject.getString(GcoediPo.COLUMNS.MESSAGETYPE.name())); 
			gcoediPo.setDutyno(dataObject.getString(GcoediPo.COLUMNS.DUTYNO.name())); 
			gcoediPo.setIe(dataObject.getString(GcoediPo.COLUMNS.IE.name())); 
			gcoediPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(GcoediPo.COLUMNS.GCIWEIGHT.name()))); 
			gcoediPo.setDutypayment(dataObject.getString(GcoediPo.COLUMNS.DUTYPAYMENT.name())); 
			return gcoediPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final GcoediPo gcoediPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(GcoediPo.COLUMNS.CONTROLNO.name(), gcoediPo.getControlno()); 
			dataObject.setValue(GcoediPo.COLUMNS.DECLNO.name(), gcoediPo.getDeclno()); 
			dataObject.setValue(GcoediPo.COLUMNS.MWB.name(), gcoediPo.getMwb()); 
			dataObject.setValue(GcoediPo.COLUMNS.HWB.name(), gcoediPo.getHwb()); 
			dataObject.setValue(GcoediPo.COLUMNS.PIECE.name(), gcoediPo.getPiece()); 
			dataObject.setValue(GcoediPo.COLUMNS.WEIGHT.name(), gcoediPo.getWeight()); 
			dataObject.setValue(GcoediPo.COLUMNS.RELEASEDATE.name(), gcoediPo.getReleasedate()); 
			dataObject.setValue(GcoediPo.COLUMNS.RELEASETIME.name(), gcoediPo.getReleasetime()); 
			dataObject.setValue(GcoediPo.COLUMNS.LASTUPDATE.name(), gcoediPo.getLastupdate()); 
			dataObject.setValue(GcoediPo.COLUMNS.CLEARANCETYPE.name(), gcoediPo.getClearancetype()); 
			dataObject.setValue(GcoediPo.COLUMNS.TRANSTYPE.name(), gcoediPo.getTranstype()); 
			dataObject.setValue(GcoediPo.COLUMNS.MESSAGETYPE.name(), gcoediPo.getMessagetype()); 
			dataObject.setValue(GcoediPo.COLUMNS.DUTYNO.name(), gcoediPo.getDutyno()); 
			dataObject.setValue(GcoediPo.COLUMNS.IE.name(), gcoediPo.getIe()); 
			dataObject.setValue(GcoediPo.COLUMNS.GCIWEIGHT.name(), gcoediPo.getGciweight()); 
			dataObject.setValue(GcoediPo.COLUMNS.DUTYPAYMENT.name(), gcoediPo.getDutypayment()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<GcoediPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(GcoediPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
