package com.doc.common.dao.impl; 
 
public class AwbtempDAOImpl extends GeneralDAOImpl<AwbtempPo> implements AwbtempDAO { 
	public static final AwbtempDAOImpl INSTANCE = new AwbtempDAOImpl(); 
	public static final String TABLENAME = "AWBTEMP"; 

	public AwbtempDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<AwbtempPo> CONVERTER = new MapConverter<AwbtempPo>() { 
 
		@Override 
		public AwbtempPo convert(final DataObject dataObject) { 
			final AwbtempPo awbtempPo = new AwbtempPo(); 
			awbtempPo.setAwb(dataObject.getString(AwbtempPo.COLUMNS.AWB.name())); 
			awbtempPo.setHawb(dataObject.getString(AwbtempPo.COLUMNS.HAWB.name())); 
			awbtempPo.setCreatedate(TimestampUtils.of(dataObject.getValue(AwbtempPo.COLUMNS.CREATEDATE.name()))); 
			awbtempPo.setDele(dataObject.getString(AwbtempPo.COLUMNS.DELE.name())); 
			return awbtempPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final AwbtempPo awbtempPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(AwbtempPo.COLUMNS.AWB.name(), awbtempPo.getAwb()); 
			dataObject.setValue(AwbtempPo.COLUMNS.HAWB.name(), awbtempPo.getHawb()); 
			dataObject.setValue(AwbtempPo.COLUMNS.CREATEDATE.name(), awbtempPo.getCreatedate()); 
			dataObject.setValue(AwbtempPo.COLUMNS.DELE.name(), awbtempPo.getDele()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<AwbtempPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(AwbtempPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
