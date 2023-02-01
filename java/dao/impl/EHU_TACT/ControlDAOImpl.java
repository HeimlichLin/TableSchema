package com.doc.common.dao.impl; 
 
public class ControlDAOImpl extends GeneralDAOImpl<ControlPo> implements ControlDAO { 
	public static final ControlDAOImpl INSTANCE = new ControlDAOImpl(); 
	public static final String TABLENAME = "CONTROL"; 

	public ControlDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ControlPo> CONVERTER = new MapConverter<ControlPo>() { 
 
		@Override 
		public ControlPo convert(final DataObject dataObject) { 
			final ControlPo controlPo = new ControlPo(); 
			controlPo.setControlno(dataObject.getString(ControlPo.COLUMNS.CONTROLNO.name())); 
			controlPo.setMwb(dataObject.getString(ControlPo.COLUMNS.MWB.name())); 
			controlPo.setHwb(dataObject.getString(ControlPo.COLUMNS.HWB.name())); 
			return controlPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ControlPo controlPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ControlPo.COLUMNS.CONTROLNO.name(), controlPo.getControlno()); 
			dataObject.setValue(ControlPo.COLUMNS.MWB.name(), controlPo.getMwb()); 
			dataObject.setValue(ControlPo.COLUMNS.HWB.name(), controlPo.getHwb()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ControlPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ControlPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
