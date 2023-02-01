package com.doc.common.dao.impl; 
 
public class EhuMsgSwitchDAOImpl extends GeneralDAOImpl<EhuMsgSwitchPo> implements EhuMsgSwitchDAO { 
	public static final EhuMsgSwitchDAOImpl INSTANCE = new EhuMsgSwitchDAOImpl(); 
	public static final String TABLENAME = "EHU_MSG_SWITCH"; 

	public EhuMsgSwitchDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<EhuMsgSwitchPo> CONVERTER = new MapConverter<EhuMsgSwitchPo>() { 
 
		@Override 
		public EhuMsgSwitchPo convert(final DataObject dataObject) { 
			final EhuMsgSwitchPo ehuMsgSwitchPo = new EhuMsgSwitchPo(); 
			ehuMsgSwitchPo.setEhustatus(dataObject.getString(EhuMsgSwitchPo.COLUMNS.EHUSTATUS.name())); 
			ehuMsgSwitchPo.setLastupdate(TimestampUtils.of(dataObject.getValue(EhuMsgSwitchPo.COLUMNS.LASTUPDATE.name()))); 
			ehuMsgSwitchPo.setUpdateuserid(dataObject.getString(EhuMsgSwitchPo.COLUMNS.UPDATEUSERID.name())); 
			ehuMsgSwitchPo.setLinetype(dataObject.getString(EhuMsgSwitchPo.COLUMNS.LINETYPE.name())); 
			return ehuMsgSwitchPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final EhuMsgSwitchPo ehuMsgSwitchPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(EhuMsgSwitchPo.COLUMNS.EHUSTATUS.name(), ehuMsgSwitchPo.getEhustatus()); 
			dataObject.setValue(EhuMsgSwitchPo.COLUMNS.LASTUPDATE.name(), ehuMsgSwitchPo.getLastupdate()); 
			dataObject.setValue(EhuMsgSwitchPo.COLUMNS.UPDATEUSERID.name(), ehuMsgSwitchPo.getUpdateuserid()); 
			dataObject.setValue(EhuMsgSwitchPo.COLUMNS.LINETYPE.name(), ehuMsgSwitchPo.getLinetype()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<EhuMsgSwitchPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(EhuMsgSwitchPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
