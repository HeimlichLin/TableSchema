package com.doc.common.dao.impl; 
 
public class MwbdestDAOImpl extends GeneralDAOImpl<MwbdestPo> implements MwbdestDAO { 
	public static final MwbdestDAOImpl INSTANCE = new MwbdestDAOImpl(); 
	public static final String TABLENAME = "MWBDEST"; 

	public MwbdestDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<MwbdestPo> CONVERTER = new MapConverter<MwbdestPo>() { 
 
		@Override 
		public MwbdestPo convert(final DataObject dataObject) { 
			final MwbdestPo mwbdestPo = new MwbdestPo(); 
			mwbdestPo.setMwb(dataObject.getString(MwbdestPo.COLUMNS.MWB.name())); 
			mwbdestPo.setFlightno(dataObject.getString(MwbdestPo.COLUMNS.FLIGHTNO.name())); 
			mwbdestPo.setFlightdate(TimestampUtils.of(dataObject.getValue(MwbdestPo.COLUMNS.FLIGHTDATE.name()))); 
			mwbdestPo.setFlightdest(dataObject.getString(MwbdestPo.COLUMNS.FLIGHTDEST.name())); 
			mwbdestPo.setLastupdate(TimestampUtils.of(dataObject.getValue(MwbdestPo.COLUMNS.LASTUPDATE.name()))); 
			return mwbdestPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final MwbdestPo mwbdestPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(MwbdestPo.COLUMNS.MWB.name(), mwbdestPo.getMwb()); 
			dataObject.setValue(MwbdestPo.COLUMNS.FLIGHTNO.name(), mwbdestPo.getFlightno()); 
			dataObject.setValue(MwbdestPo.COLUMNS.FLIGHTDATE.name(), mwbdestPo.getFlightdate()); 
			dataObject.setValue(MwbdestPo.COLUMNS.FLIGHTDEST.name(), mwbdestPo.getFlightdest()); 
			dataObject.setValue(MwbdestPo.COLUMNS.LASTUPDATE.name(), mwbdestPo.getLastupdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<MwbdestPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(MwbdestPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
