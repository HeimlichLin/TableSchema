package com.doc.common.dao.impl; 
 
public class CloudgciBackupDAOImpl extends GeneralDAOImpl<CloudgciBackupPo> implements CloudgciBackupDAO { 
	public static final CloudgciBackupDAOImpl INSTANCE = new CloudgciBackupDAOImpl(); 
	public static final String TABLENAME = "CLOUDGCI_BACKUP"; 

	public CloudgciBackupDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<CloudgciBackupPo> CONVERTER = new MapConverter<CloudgciBackupPo>() { 
 
		@Override 
		public CloudgciBackupPo convert(final DataObject dataObject) { 
			final CloudgciBackupPo cloudgciBackupPo = new CloudgciBackupPo(); 
			cloudgciBackupPo.setHwb(dataObject.getString(CloudgciBackupPo.COLUMNS.HWB.name())); 
			cloudgciBackupPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(CloudgciBackupPo.COLUMNS.WEIGHT.name()))); 
			cloudgciBackupPo.setGcidate(TimestampUtils.of(dataObject.getValue(CloudgciBackupPo.COLUMNS.GCIDATE.name()))); 
			cloudgciBackupPo.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(CloudgciBackupPo.COLUMNS.GCIPIECE.name()))); 
			cloudgciBackupPo.setExpressid(dataObject.getString(CloudgciBackupPo.COLUMNS.EXPRESSID.name())); 
			cloudgciBackupPo.setFlightno(dataObject.getString(CloudgciBackupPo.COLUMNS.FLIGHTNO.name())); 
			cloudgciBackupPo.setFlightdest(dataObject.getString(CloudgciBackupPo.COLUMNS.FLIGHTDEST.name())); 
			return cloudgciBackupPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final CloudgciBackupPo cloudgciBackupPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(CloudgciBackupPo.COLUMNS.HWB.name(), cloudgciBackupPo.getHwb()); 
			dataObject.setValue(CloudgciBackupPo.COLUMNS.WEIGHT.name(), cloudgciBackupPo.getWeight()); 
			dataObject.setValue(CloudgciBackupPo.COLUMNS.GCIDATE.name(), cloudgciBackupPo.getGcidate()); 
			dataObject.setValue(CloudgciBackupPo.COLUMNS.GCIPIECE.name(), cloudgciBackupPo.getGcipiece()); 
			dataObject.setValue(CloudgciBackupPo.COLUMNS.EXPRESSID.name(), cloudgciBackupPo.getExpressid()); 
			dataObject.setValue(CloudgciBackupPo.COLUMNS.FLIGHTNO.name(), cloudgciBackupPo.getFlightno()); 
			dataObject.setValue(CloudgciBackupPo.COLUMNS.FLIGHTDEST.name(), cloudgciBackupPo.getFlightdest()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<CloudgciBackupPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(CloudgciBackupPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
