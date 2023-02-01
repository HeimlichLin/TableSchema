package com.doc.common.dao.impl; 
 
public class Repcat$SnapgroupDAOImpl extends GeneralDAOImpl<Repcat$SnapgroupPo> implements IRepcat$SnapgroupDAO { 
	public static final Repcat$SnapgroupDAOImpl INSTANCE = new Repcat$SnapgroupDAOImpl(); 
	public static final String TABLENAME = "REPCAT$_SNAPGROUP"; 

	public Repcat$SnapgroupDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Repcat$SnapgroupPo> CONVERTER = new MapConverter<Repcat$SnapgroupPo>() { 
 
		@Override 
		public Repcat$SnapgroupPo convert(final DataObject dataObject) { 
			final Repcat$SnapgroupPo repcat$SnapgroupPo = new Repcat$SnapgroupPo(); 
			repcat$SnapgroupPo.setGowner(dataObject.getString(Repcat$SnapgroupPo.COLUMNS.GOWNER.name())); 
			repcat$SnapgroupPo.setGname(dataObject.getString(Repcat$SnapgroupPo.COLUMNS.GNAME.name())); 
			repcat$SnapgroupPo.setDblink(dataObject.getString(Repcat$SnapgroupPo.COLUMNS.DBLINK.name())); 
			repcat$SnapgroupPo.setGroupComment(dataObject.getString(Repcat$SnapgroupPo.COLUMNS.GROUP_COMMENT.name())); 
			repcat$SnapgroupPo.setRepType(BigDecimalUtils.formObj(dataObject.getValue(Repcat$SnapgroupPo.COLUMNS.REP_TYPE.name()))); 
			repcat$SnapgroupPo.setFlavorId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$SnapgroupPo.COLUMNS.FLAVOR_ID.name()))); 
			return repcat$SnapgroupPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Repcat$SnapgroupPo repcat$SnapgroupPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Repcat$SnapgroupPo.COLUMNS.GOWNER.name(), repcat$SnapgroupPo.getGowner()); 
			dataObject.setValue(Repcat$SnapgroupPo.COLUMNS.GNAME.name(), repcat$SnapgroupPo.getGname()); 
			dataObject.setValue(Repcat$SnapgroupPo.COLUMNS.DBLINK.name(), repcat$SnapgroupPo.getDblink()); 
			dataObject.setValue(Repcat$SnapgroupPo.COLUMNS.GROUP_COMMENT.name(), repcat$SnapgroupPo.getGroupComment()); 
			dataObject.setValue(Repcat$SnapgroupPo.COLUMNS.REP_TYPE.name(), repcat$SnapgroupPo.getRepType()); 
			dataObject.setValue(Repcat$SnapgroupPo.COLUMNS.FLAVOR_ID.name(), repcat$SnapgroupPo.getFlavorId()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Repcat$SnapgroupPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Repcat$SnapgroupPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
