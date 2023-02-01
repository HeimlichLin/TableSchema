package com.doc.common.dao.impl; 
 
public class EhuMsgSwitchLogDAOImpl extends GeneralDAOImpl<EhuMsgSwitchLogPo> implements EhuMsgSwitchLogDAO { 
	public static final EhuMsgSwitchLogDAOImpl INSTANCE = new EhuMsgSwitchLogDAOImpl(); 
	public static final String TABLENAME = "EHU_MSG_SWITCH_LOG"; 

	public EhuMsgSwitchLogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<EhuMsgSwitchLogPo> CONVERTER = new MapConverter<EhuMsgSwitchLogPo>() { 
 
		@Override 
		public EhuMsgSwitchLogPo convert(final DataObject dataObject) { 
			final EhuMsgSwitchLogPo ehuMsgSwitchLogPo = new EhuMsgSwitchLogPo(); 
			ehuMsgSwitchLogPo.setEhustatus(dataObject.getString(EhuMsgSwitchLogPo.COLUMNS.EHUSTATUS.name())); 
			ehuMsgSwitchLogPo.setLastupdate(TimestampUtils.of(dataObject.getValue(EhuMsgSwitchLogPo.COLUMNS.LASTUPDATE.name()))); 
			ehuMsgSwitchLogPo.setUpdateuserid(dataObject.getString(EhuMsgSwitchLogPo.COLUMNS.UPDATEUSERID.name())); 
			ehuMsgSwitchLogPo.setLinetype(dataObject.getString(EhuMsgSwitchLogPo.COLUMNS.LINETYPE.name())); 
			return ehuMsgSwitchLogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final EhuMsgSwitchLogPo ehuMsgSwitchLogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(EhuMsgSwitchLogPo.COLUMNS.EHUSTATUS.name(), ehuMsgSwitchLogPo.getEhustatus()); 
			dataObject.setValue(EhuMsgSwitchLogPo.COLUMNS.LASTUPDATE.name(), ehuMsgSwitchLogPo.getLastupdate()); 
			dataObject.setValue(EhuMsgSwitchLogPo.COLUMNS.UPDATEUSERID.name(), ehuMsgSwitchLogPo.getUpdateuserid()); 
			dataObject.setValue(EhuMsgSwitchLogPo.COLUMNS.LINETYPE.name(), ehuMsgSwitchLogPo.getLinetype()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<EhuMsgSwitchLogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(EhuMsgSwitchLogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
