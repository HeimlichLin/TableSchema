package com.doc.common.dao.impl; 
 
public class RelabellogDAOImpl extends GeneralDAOImpl<RelabellogPo> implements RelabellogDAO { 
	public static final RelabellogDAOImpl INSTANCE = new RelabellogDAOImpl(); 
	public static final String TABLENAME = "RELABELLOG"; 

	public RelabellogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<RelabellogPo> CONVERTER = new MapConverter<RelabellogPo>() { 
 
		@Override 
		public RelabellogPo convert(final DataObject dataObject) { 
			final RelabellogPo relabellogPo = new RelabellogPo(); 
			relabellogPo.setReprtdate(dataObject.getString(RelabellogPo.COLUMNS.REPRTDATE.name())); 
			relabellogPo.setReprttime(dataObject.getString(RelabellogPo.COLUMNS.REPRTTIME.name())); 
			relabellogPo.setIe(dataObject.getString(RelabellogPo.COLUMNS.IE.name())); 
			relabellogPo.setOpuserid(dataObject.getString(RelabellogPo.COLUMNS.OPUSERID.name())); 
			relabellogPo.setWs(dataObject.getString(RelabellogPo.COLUMNS.WS.name())); 
			relabellogPo.setMwb(dataObject.getString(RelabellogPo.COLUMNS.MWB.name())); 
			relabellogPo.setHwb(dataObject.getString(RelabellogPo.COLUMNS.HWB.name())); 
			relabellogPo.setExpbagno(dataObject.getString(RelabellogPo.COLUMNS.EXPBAGNO.name())); 
			relabellogPo.setExpressid(dataObject.getString(RelabellogPo.COLUMNS.EXPRESSID.name())); 
			relabellogPo.setCsuserid(dataObject.getString(RelabellogPo.COLUMNS.CSUSERID.name())); 
			return relabellogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final RelabellogPo relabellogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(RelabellogPo.COLUMNS.REPRTDATE.name(), relabellogPo.getReprtdate()); 
			dataObject.setValue(RelabellogPo.COLUMNS.REPRTTIME.name(), relabellogPo.getReprttime()); 
			dataObject.setValue(RelabellogPo.COLUMNS.IE.name(), relabellogPo.getIe()); 
			dataObject.setValue(RelabellogPo.COLUMNS.OPUSERID.name(), relabellogPo.getOpuserid()); 
			dataObject.setValue(RelabellogPo.COLUMNS.WS.name(), relabellogPo.getWs()); 
			dataObject.setValue(RelabellogPo.COLUMNS.MWB.name(), relabellogPo.getMwb()); 
			dataObject.setValue(RelabellogPo.COLUMNS.HWB.name(), relabellogPo.getHwb()); 
			dataObject.setValue(RelabellogPo.COLUMNS.EXPBAGNO.name(), relabellogPo.getExpbagno()); 
			dataObject.setValue(RelabellogPo.COLUMNS.EXPRESSID.name(), relabellogPo.getExpressid()); 
			dataObject.setValue(RelabellogPo.COLUMNS.CSUSERID.name(), relabellogPo.getCsuserid()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<RelabellogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(RelabellogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
