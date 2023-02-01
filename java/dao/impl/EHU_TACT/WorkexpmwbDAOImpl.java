package com.doc.common.dao.impl; 
 
public class WorkexpmwbDAOImpl extends GeneralDAOImpl<WorkexpmwbPo> implements WorkexpmwbDAO { 
	public static final WorkexpmwbDAOImpl INSTANCE = new WorkexpmwbDAOImpl(); 
	public static final String TABLENAME = "WORKEXPMWB"; 

	public WorkexpmwbDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<WorkexpmwbPo> CONVERTER = new MapConverter<WorkexpmwbPo>() { 
 
		@Override 
		public WorkexpmwbPo convert(final DataObject dataObject) { 
			final WorkexpmwbPo workexpmwbPo = new WorkexpmwbPo(); 
			workexpmwbPo.setLastupdate(TimestampUtils.of(dataObject.getValue(WorkexpmwbPo.COLUMNS.LASTUPDATE.name()))); 
			workexpmwbPo.setMwb(dataObject.getString(WorkexpmwbPo.COLUMNS.MWB.name())); 
			workexpmwbPo.setHwbcount(BigDecimalUtils.formObj(dataObject.getValue(WorkexpmwbPo.COLUMNS.HWBCOUNT.name()))); 
			workexpmwbPo.setHwbpiece(BigDecimalUtils.formObj(dataObject.getValue(WorkexpmwbPo.COLUMNS.HWBPIECE.name()))); 
			workexpmwbPo.setBagcount(BigDecimalUtils.formObj(dataObject.getValue(WorkexpmwbPo.COLUMNS.BAGCOUNT.name()))); 
			workexpmwbPo.setBaghwb(BigDecimalUtils.formObj(dataObject.getValue(WorkexpmwbPo.COLUMNS.BAGHWB.name()))); 
			workexpmwbPo.setBagpiece(BigDecimalUtils.formObj(dataObject.getValue(WorkexpmwbPo.COLUMNS.BAGPIECE.name()))); 
			workexpmwbPo.setGcihwbcount(BigDecimalUtils.formObj(dataObject.getValue(WorkexpmwbPo.COLUMNS.GCIHWBCOUNT.name()))); 
			workexpmwbPo.setGcihwbpiece(BigDecimalUtils.formObj(dataObject.getValue(WorkexpmwbPo.COLUMNS.GCIHWBPIECE.name()))); 
			workexpmwbPo.setGcibagcount(BigDecimalUtils.formObj(dataObject.getValue(WorkexpmwbPo.COLUMNS.GCIBAGCOUNT.name()))); 
			workexpmwbPo.setGcibaghwb(BigDecimalUtils.formObj(dataObject.getValue(WorkexpmwbPo.COLUMNS.GCIBAGHWB.name()))); 
			workexpmwbPo.setGcibagpiece(BigDecimalUtils.formObj(dataObject.getValue(WorkexpmwbPo.COLUMNS.GCIBAGPIECE.name()))); 
			workexpmwbPo.setWorking(dataObject.getString(WorkexpmwbPo.COLUMNS.WORKING.name())); 
			workexpmwbPo.setRelease(TimestampUtils.of(dataObject.getValue(WorkexpmwbPo.COLUMNS.RELEASE.name()))); 
			workexpmwbPo.setIe(dataObject.getString(WorkexpmwbPo.COLUMNS.IE.name())); 
			workexpmwbPo.setWorkarea(dataObject.getString(WorkexpmwbPo.COLUMNS.WORKAREA.name())); 
			return workexpmwbPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final WorkexpmwbPo workexpmwbPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WorkexpmwbPo.COLUMNS.LASTUPDATE.name(), workexpmwbPo.getLastupdate()); 
			dataObject.setValue(WorkexpmwbPo.COLUMNS.MWB.name(), workexpmwbPo.getMwb()); 
			dataObject.setValue(WorkexpmwbPo.COLUMNS.HWBCOUNT.name(), workexpmwbPo.getHwbcount()); 
			dataObject.setValue(WorkexpmwbPo.COLUMNS.HWBPIECE.name(), workexpmwbPo.getHwbpiece()); 
			dataObject.setValue(WorkexpmwbPo.COLUMNS.BAGCOUNT.name(), workexpmwbPo.getBagcount()); 
			dataObject.setValue(WorkexpmwbPo.COLUMNS.BAGHWB.name(), workexpmwbPo.getBaghwb()); 
			dataObject.setValue(WorkexpmwbPo.COLUMNS.BAGPIECE.name(), workexpmwbPo.getBagpiece()); 
			dataObject.setValue(WorkexpmwbPo.COLUMNS.GCIHWBCOUNT.name(), workexpmwbPo.getGcihwbcount()); 
			dataObject.setValue(WorkexpmwbPo.COLUMNS.GCIHWBPIECE.name(), workexpmwbPo.getGcihwbpiece()); 
			dataObject.setValue(WorkexpmwbPo.COLUMNS.GCIBAGCOUNT.name(), workexpmwbPo.getGcibagcount()); 
			dataObject.setValue(WorkexpmwbPo.COLUMNS.GCIBAGHWB.name(), workexpmwbPo.getGcibaghwb()); 
			dataObject.setValue(WorkexpmwbPo.COLUMNS.GCIBAGPIECE.name(), workexpmwbPo.getGcibagpiece()); 
			dataObject.setValue(WorkexpmwbPo.COLUMNS.WORKING.name(), workexpmwbPo.getWorking()); 
			dataObject.setValue(WorkexpmwbPo.COLUMNS.RELEASE.name(), workexpmwbPo.getRelease()); 
			dataObject.setValue(WorkexpmwbPo.COLUMNS.IE.name(), workexpmwbPo.getIe()); 
			dataObject.setValue(WorkexpmwbPo.COLUMNS.WORKAREA.name(), workexpmwbPo.getWorkarea()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<WorkexpmwbPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(WorkexpmwbPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
