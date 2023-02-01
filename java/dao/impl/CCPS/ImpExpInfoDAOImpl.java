package com.doc.common.dao.impl; 
 
public class ImpExpInfoDAOImpl extends GeneralDAOImpl<ImpExpInfoPo> implements ImpExpInfoDAO { 
	public static final ImpExpInfoDAOImpl INSTANCE = new ImpExpInfoDAOImpl(); 
	public static final String TABLENAME = "IMP_EXP_INFO"; 

	public ImpExpInfoDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ImpExpInfoPo> CONVERTER = new MapConverter<ImpExpInfoPo>() { 
 
		@Override 
		public ImpExpInfoPo convert(final DataObject dataObject) { 
			final ImpExpInfoPo impExpInfoPo = new ImpExpInfoPo(); 
			impExpInfoPo.setId(dataObject.getString(ImpExpInfoPo.COLUMNS.ID.name())); 
			impExpInfoPo.setCtrlNode(dataObject.getString(ImpExpInfoPo.COLUMNS.CTRL_NODE.name())); 
			impExpInfoPo.setIcNo(dataObject.getString(ImpExpInfoPo.COLUMNS.IC_NO.name())); 
			impExpInfoPo.setIcPhoto(dataObject.getString(ImpExpInfoPo.COLUMNS.IC_PHOTO.name())); 
			impExpInfoPo.setSchedInDataTime(); 
			impExpInfoPo.setSchedOutDataTime(); 
			return impExpInfoPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ImpExpInfoPo impExpInfoPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ImpExpInfoPo.COLUMNS.ID.name(), impExpInfoPo.getId()); 
			dataObject.setValue(ImpExpInfoPo.COLUMNS.CTRL_NODE.name(), impExpInfoPo.getCtrlNode()); 
			dataObject.setValue(ImpExpInfoPo.COLUMNS.IC_NO.name(), impExpInfoPo.getIcNo()); 
			dataObject.setValue(ImpExpInfoPo.COLUMNS.IC_PHOTO.name(), impExpInfoPo.getIcPhoto()); 
			dataObject.setValue(ImpExpInfoPo.COLUMNS.SCHED_IN_DATA_TIME.name(), impExpInfoPo.getSchedInDataTime()); 
			dataObject.setValue(ImpExpInfoPo.COLUMNS.SCHED_OUT_DATA_TIME.name(), impExpInfoPo.getSchedOutDataTime()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ImpExpInfoPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ImpExpInfoPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(ImpExpInfoPo.COLUMNS.ID.name(), po.getId()); 
		return sqlWhere; 
	} 
 
} 
