package com.doc.common.dao.impl; 
 
public class Repcat$ResolStatsControlDAOImpl extends GeneralDAOImpl<Repcat$ResolStatsControlPo> implements IRepcat$ResolStatsControlDAO { 
	public static final Repcat$ResolStatsControlDAOImpl INSTANCE = new Repcat$ResolStatsControlDAOImpl(); 
	public static final String TABLENAME = "REPCAT$_RESOL_STATS_CONTROL"; 

	public Repcat$ResolStatsControlDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Repcat$ResolStatsControlPo> CONVERTER = new MapConverter<Repcat$ResolStatsControlPo>() { 
 
		@Override 
		public Repcat$ResolStatsControlPo convert(final DataObject dataObject) { 
			final Repcat$ResolStatsControlPo repcat$ResolStatsControlPo = new Repcat$ResolStatsControlPo(); 
			repcat$ResolStatsControlPo.setSname(dataObject.getString(Repcat$ResolStatsControlPo.COLUMNS.SNAME.name())); 
			repcat$ResolStatsControlPo.setOname(dataObject.getString(Repcat$ResolStatsControlPo.COLUMNS.ONAME.name())); 
			repcat$ResolStatsControlPo.setCreated(TimestampUtils.of(dataObject.getValue(Repcat$ResolStatsControlPo.COLUMNS.CREATED.name()))); 
			repcat$ResolStatsControlPo.setStatus(BigDecimalUtils.formObj(dataObject.getValue(Repcat$ResolStatsControlPo.COLUMNS.STATUS.name()))); 
			repcat$ResolStatsControlPo.setStatusUpdateDate(TimestampUtils.of(dataObject.getValue(Repcat$ResolStatsControlPo.COLUMNS.STATUS_UPDATE_DATE.name()))); 
			repcat$ResolStatsControlPo.setPurgedDate(TimestampUtils.of(dataObject.getValue(Repcat$ResolStatsControlPo.COLUMNS.PURGED_DATE.name()))); 
			repcat$ResolStatsControlPo.setLastPurgeStartDate(TimestampUtils.of(dataObject.getValue(Repcat$ResolStatsControlPo.COLUMNS.LAST_PURGE_START_DATE.name()))); 
			repcat$ResolStatsControlPo.setLastPurgeEndDate(TimestampUtils.of(dataObject.getValue(Repcat$ResolStatsControlPo.COLUMNS.LAST_PURGE_END_DATE.name()))); 
			return repcat$ResolStatsControlPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Repcat$ResolStatsControlPo repcat$ResolStatsControlPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Repcat$ResolStatsControlPo.COLUMNS.SNAME.name(), repcat$ResolStatsControlPo.getSname()); 
			dataObject.setValue(Repcat$ResolStatsControlPo.COLUMNS.ONAME.name(), repcat$ResolStatsControlPo.getOname()); 
			dataObject.setValue(Repcat$ResolStatsControlPo.COLUMNS.CREATED.name(), repcat$ResolStatsControlPo.getCreated()); 
			dataObject.setValue(Repcat$ResolStatsControlPo.COLUMNS.STATUS.name(), repcat$ResolStatsControlPo.getStatus()); 
			dataObject.setValue(Repcat$ResolStatsControlPo.COLUMNS.STATUS_UPDATE_DATE.name(), repcat$ResolStatsControlPo.getStatusUpdateDate()); 
			dataObject.setValue(Repcat$ResolStatsControlPo.COLUMNS.PURGED_DATE.name(), repcat$ResolStatsControlPo.getPurgedDate()); 
			dataObject.setValue(Repcat$ResolStatsControlPo.COLUMNS.LAST_PURGE_START_DATE.name(), repcat$ResolStatsControlPo.getLastPurgeStartDate()); 
			dataObject.setValue(Repcat$ResolStatsControlPo.COLUMNS.LAST_PURGE_END_DATE.name(), repcat$ResolStatsControlPo.getLastPurgeEndDate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Repcat$ResolStatsControlPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Repcat$ResolStatsControlPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Repcat$ResolStatsControlPo.COLUMNS.SNAME.name(), po.getSname()); 
		sqlWhere.add(Repcat$ResolStatsControlPo.COLUMNS.ONAME.name(), po.getOname()); 
		return sqlWhere; 
	} 
 
} 
