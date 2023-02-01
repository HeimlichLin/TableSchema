package com.doc.common.dao.impl; 
 
public class ReleaselogDAOImpl extends GeneralDAOImpl<ReleaselogPo> implements ReleaselogDAO { 
	public static final ReleaselogDAOImpl INSTANCE = new ReleaselogDAOImpl(); 
	public static final String TABLENAME = "RELEASELOG"; 

	public ReleaselogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ReleaselogPo> CONVERTER = new MapConverter<ReleaselogPo>() { 
 
		@Override 
		public ReleaselogPo convert(final DataObject dataObject) { 
			final ReleaselogPo releaselogPo = new ReleaselogPo(); 
			releaselogPo.setUserid(dataObject.getString(ReleaselogPo.COLUMNS.USERID.name())); 
			releaselogPo.setLogdate(TimestampUtils.of(dataObject.getValue(ReleaselogPo.COLUMNS.LOGDATE.name()))); 
			releaselogPo.setWs(dataObject.getString(ReleaselogPo.COLUMNS.WS.name())); 
			releaselogPo.setAction(dataObject.getString(ReleaselogPo.COLUMNS.ACTION.name())); 
			releaselogPo.setDeclno(dataObject.getString(ReleaselogPo.COLUMNS.DECLNO.name())); 
			releaselogPo.setMwb(dataObject.getString(ReleaselogPo.COLUMNS.MWB.name())); 
			releaselogPo.setHwb(dataObject.getString(ReleaselogPo.COLUMNS.HWB.name())); 
			releaselogPo.setIe(dataObject.getString(ReleaselogPo.COLUMNS.IE.name())); 
			releaselogPo.setClearancetype(dataObject.getString(ReleaselogPo.COLUMNS.CLEARANCETYPE.name())); 
			return releaselogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ReleaselogPo releaselogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ReleaselogPo.COLUMNS.USERID.name(), releaselogPo.getUserid()); 
			dataObject.setValue(ReleaselogPo.COLUMNS.LOGDATE.name(), releaselogPo.getLogdate()); 
			dataObject.setValue(ReleaselogPo.COLUMNS.WS.name(), releaselogPo.getWs()); 
			dataObject.setValue(ReleaselogPo.COLUMNS.ACTION.name(), releaselogPo.getAction()); 
			dataObject.setValue(ReleaselogPo.COLUMNS.DECLNO.name(), releaselogPo.getDeclno()); 
			dataObject.setValue(ReleaselogPo.COLUMNS.MWB.name(), releaselogPo.getMwb()); 
			dataObject.setValue(ReleaselogPo.COLUMNS.HWB.name(), releaselogPo.getHwb()); 
			dataObject.setValue(ReleaselogPo.COLUMNS.IE.name(), releaselogPo.getIe()); 
			dataObject.setValue(ReleaselogPo.COLUMNS.CLEARANCETYPE.name(), releaselogPo.getClearancetype()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ReleaselogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ReleaselogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
