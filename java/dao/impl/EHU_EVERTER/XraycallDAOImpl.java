package com.doc.common.dao.impl; 
 
public class XraycallDAOImpl extends GeneralDAOImpl<XraycallPo> implements XraycallDAO { 
	public static final XraycallDAOImpl INSTANCE = new XraycallDAOImpl(); 
	public static final String TABLENAME = "XRAYCALL"; 

	public XraycallDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<XraycallPo> CONVERTER = new MapConverter<XraycallPo>() { 
 
		@Override 
		public XraycallPo convert(final DataObject dataObject) { 
			final XraycallPo xraycallPo = new XraycallPo(); 
			xraycallPo.setExpbagno(dataObject.getString(XraycallPo.COLUMNS.EXPBAGNO.name())); 
			xraycallPo.setCalltimestamp(TimestampUtils.of(dataObject.getValue(XraycallPo.COLUMNS.CALLTIMESTAMP.name()))); 
			xraycallPo.setFinish(dataObject.getString(XraycallPo.COLUMNS.FINISH.name())); 
			return xraycallPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final XraycallPo xraycallPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(XraycallPo.COLUMNS.EXPBAGNO.name(), xraycallPo.getExpbagno()); 
			dataObject.setValue(XraycallPo.COLUMNS.CALLTIMESTAMP.name(), xraycallPo.getCalltimestamp()); 
			dataObject.setValue(XraycallPo.COLUMNS.FINISH.name(), xraycallPo.getFinish()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<XraycallPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(XraycallPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
