package com.doc.common.dao.impl; 
 
public class WorkimpmwbDAOImpl extends GeneralDAOImpl<WorkimpmwbPo> implements WorkimpmwbDAO { 
	public static final WorkimpmwbDAOImpl INSTANCE = new WorkimpmwbDAOImpl(); 
	public static final String TABLENAME = "WORKIMPMWB"; 

	public WorkimpmwbDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<WorkimpmwbPo> CONVERTER = new MapConverter<WorkimpmwbPo>() { 
 
		@Override 
		public WorkimpmwbPo convert(final DataObject dataObject) { 
			final WorkimpmwbPo workimpmwbPo = new WorkimpmwbPo(); 
			workimpmwbPo.setLastupdate(TimestampUtils.of(dataObject.getValue(WorkimpmwbPo.COLUMNS.LASTUPDATE.name()))); 
			workimpmwbPo.setMwb(dataObject.getString(WorkimpmwbPo.COLUMNS.MWB.name())); 
			workimpmwbPo.setHwbcount(BigDecimalUtils.formObj(dataObject.getValue(WorkimpmwbPo.COLUMNS.HWBCOUNT.name()))); 
			workimpmwbPo.setHwbpiece(BigDecimalUtils.formObj(dataObject.getValue(WorkimpmwbPo.COLUMNS.HWBPIECE.name()))); 
			workimpmwbPo.setBagcount(BigDecimalUtils.formObj(dataObject.getValue(WorkimpmwbPo.COLUMNS.BAGCOUNT.name()))); 
			workimpmwbPo.setBaghwb(BigDecimalUtils.formObj(dataObject.getValue(WorkimpmwbPo.COLUMNS.BAGHWB.name()))); 
			workimpmwbPo.setBagpiece(BigDecimalUtils.formObj(dataObject.getValue(WorkimpmwbPo.COLUMNS.BAGPIECE.name()))); 
			workimpmwbPo.setGcihwbcount(BigDecimalUtils.formObj(dataObject.getValue(WorkimpmwbPo.COLUMNS.GCIHWBCOUNT.name()))); 
			workimpmwbPo.setGcihwbpiece(BigDecimalUtils.formObj(dataObject.getValue(WorkimpmwbPo.COLUMNS.GCIHWBPIECE.name()))); 
			workimpmwbPo.setGcibagcount(BigDecimalUtils.formObj(dataObject.getValue(WorkimpmwbPo.COLUMNS.GCIBAGCOUNT.name()))); 
			workimpmwbPo.setGcibaghwb(BigDecimalUtils.formObj(dataObject.getValue(WorkimpmwbPo.COLUMNS.GCIBAGHWB.name()))); 
			workimpmwbPo.setGcibagpiece(BigDecimalUtils.formObj(dataObject.getValue(WorkimpmwbPo.COLUMNS.GCIBAGPIECE.name()))); 
			workimpmwbPo.setWorking(dataObject.getString(WorkimpmwbPo.COLUMNS.WORKING.name())); 
			workimpmwbPo.setRelease(TimestampUtils.of(dataObject.getValue(WorkimpmwbPo.COLUMNS.RELEASE.name()))); 
			workimpmwbPo.setIe(dataObject.getString(WorkimpmwbPo.COLUMNS.IE.name())); 
			workimpmwbPo.setWorkarea(dataObject.getString(WorkimpmwbPo.COLUMNS.WORKAREA.name())); 
			return workimpmwbPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final WorkimpmwbPo workimpmwbPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WorkimpmwbPo.COLUMNS.LASTUPDATE.name(), workimpmwbPo.getLastupdate()); 
			dataObject.setValue(WorkimpmwbPo.COLUMNS.MWB.name(), workimpmwbPo.getMwb()); 
			dataObject.setValue(WorkimpmwbPo.COLUMNS.HWBCOUNT.name(), workimpmwbPo.getHwbcount()); 
			dataObject.setValue(WorkimpmwbPo.COLUMNS.HWBPIECE.name(), workimpmwbPo.getHwbpiece()); 
			dataObject.setValue(WorkimpmwbPo.COLUMNS.BAGCOUNT.name(), workimpmwbPo.getBagcount()); 
			dataObject.setValue(WorkimpmwbPo.COLUMNS.BAGHWB.name(), workimpmwbPo.getBaghwb()); 
			dataObject.setValue(WorkimpmwbPo.COLUMNS.BAGPIECE.name(), workimpmwbPo.getBagpiece()); 
			dataObject.setValue(WorkimpmwbPo.COLUMNS.GCIHWBCOUNT.name(), workimpmwbPo.getGcihwbcount()); 
			dataObject.setValue(WorkimpmwbPo.COLUMNS.GCIHWBPIECE.name(), workimpmwbPo.getGcihwbpiece()); 
			dataObject.setValue(WorkimpmwbPo.COLUMNS.GCIBAGCOUNT.name(), workimpmwbPo.getGcibagcount()); 
			dataObject.setValue(WorkimpmwbPo.COLUMNS.GCIBAGHWB.name(), workimpmwbPo.getGcibaghwb()); 
			dataObject.setValue(WorkimpmwbPo.COLUMNS.GCIBAGPIECE.name(), workimpmwbPo.getGcibagpiece()); 
			dataObject.setValue(WorkimpmwbPo.COLUMNS.WORKING.name(), workimpmwbPo.getWorking()); 
			dataObject.setValue(WorkimpmwbPo.COLUMNS.RELEASE.name(), workimpmwbPo.getRelease()); 
			dataObject.setValue(WorkimpmwbPo.COLUMNS.IE.name(), workimpmwbPo.getIe()); 
			dataObject.setValue(WorkimpmwbPo.COLUMNS.WORKAREA.name(), workimpmwbPo.getWorkarea()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<WorkimpmwbPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(WorkimpmwbPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
