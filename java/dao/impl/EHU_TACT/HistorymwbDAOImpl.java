package com.doc.common.dao.impl; 
 
public class HistorymwbDAOImpl extends GeneralDAOImpl<HistorymwbPo> implements HistorymwbDAO { 
	public static final HistorymwbDAOImpl INSTANCE = new HistorymwbDAOImpl(); 
	public static final String TABLENAME = "HISTORYMWB"; 

	public HistorymwbDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<HistorymwbPo> CONVERTER = new MapConverter<HistorymwbPo>() { 
 
		@Override 
		public HistorymwbPo convert(final DataObject dataObject) { 
			final HistorymwbPo historymwbPo = new HistorymwbPo(); 
			historymwbPo.setLastupdate(TimestampUtils.of(dataObject.getValue(HistorymwbPo.COLUMNS.LASTUPDATE.name()))); 
			historymwbPo.setMwb(dataObject.getString(HistorymwbPo.COLUMNS.MWB.name())); 
			historymwbPo.setHwbcount(BigDecimalUtils.formObj(dataObject.getValue(HistorymwbPo.COLUMNS.HWBCOUNT.name()))); 
			historymwbPo.setHwbpiece(BigDecimalUtils.formObj(dataObject.getValue(HistorymwbPo.COLUMNS.HWBPIECE.name()))); 
			historymwbPo.setBagcount(BigDecimalUtils.formObj(dataObject.getValue(HistorymwbPo.COLUMNS.BAGCOUNT.name()))); 
			historymwbPo.setBaghwb(BigDecimalUtils.formObj(dataObject.getValue(HistorymwbPo.COLUMNS.BAGHWB.name()))); 
			historymwbPo.setBagpiece(BigDecimalUtils.formObj(dataObject.getValue(HistorymwbPo.COLUMNS.BAGPIECE.name()))); 
			historymwbPo.setGcihwbcount(BigDecimalUtils.formObj(dataObject.getValue(HistorymwbPo.COLUMNS.GCIHWBCOUNT.name()))); 
			historymwbPo.setGcihwbpiece(BigDecimalUtils.formObj(dataObject.getValue(HistorymwbPo.COLUMNS.GCIHWBPIECE.name()))); 
			historymwbPo.setGcibagcount(BigDecimalUtils.formObj(dataObject.getValue(HistorymwbPo.COLUMNS.GCIBAGCOUNT.name()))); 
			historymwbPo.setGcibaghwb(BigDecimalUtils.formObj(dataObject.getValue(HistorymwbPo.COLUMNS.GCIBAGHWB.name()))); 
			historymwbPo.setGcibagpiece(BigDecimalUtils.formObj(dataObject.getValue(HistorymwbPo.COLUMNS.GCIBAGPIECE.name()))); 
			historymwbPo.setWorking(dataObject.getString(HistorymwbPo.COLUMNS.WORKING.name())); 
			historymwbPo.setRelease(TimestampUtils.of(dataObject.getValue(HistorymwbPo.COLUMNS.RELEASE.name()))); 
			historymwbPo.setIe(dataObject.getString(HistorymwbPo.COLUMNS.IE.name())); 
			historymwbPo.setWorkarea(dataObject.getString(HistorymwbPo.COLUMNS.WORKAREA.name())); 
			return historymwbPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final HistorymwbPo historymwbPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(HistorymwbPo.COLUMNS.LASTUPDATE.name(), historymwbPo.getLastupdate()); 
			dataObject.setValue(HistorymwbPo.COLUMNS.MWB.name(), historymwbPo.getMwb()); 
			dataObject.setValue(HistorymwbPo.COLUMNS.HWBCOUNT.name(), historymwbPo.getHwbcount()); 
			dataObject.setValue(HistorymwbPo.COLUMNS.HWBPIECE.name(), historymwbPo.getHwbpiece()); 
			dataObject.setValue(HistorymwbPo.COLUMNS.BAGCOUNT.name(), historymwbPo.getBagcount()); 
			dataObject.setValue(HistorymwbPo.COLUMNS.BAGHWB.name(), historymwbPo.getBaghwb()); 
			dataObject.setValue(HistorymwbPo.COLUMNS.BAGPIECE.name(), historymwbPo.getBagpiece()); 
			dataObject.setValue(HistorymwbPo.COLUMNS.GCIHWBCOUNT.name(), historymwbPo.getGcihwbcount()); 
			dataObject.setValue(HistorymwbPo.COLUMNS.GCIHWBPIECE.name(), historymwbPo.getGcihwbpiece()); 
			dataObject.setValue(HistorymwbPo.COLUMNS.GCIBAGCOUNT.name(), historymwbPo.getGcibagcount()); 
			dataObject.setValue(HistorymwbPo.COLUMNS.GCIBAGHWB.name(), historymwbPo.getGcibaghwb()); 
			dataObject.setValue(HistorymwbPo.COLUMNS.GCIBAGPIECE.name(), historymwbPo.getGcibagpiece()); 
			dataObject.setValue(HistorymwbPo.COLUMNS.WORKING.name(), historymwbPo.getWorking()); 
			dataObject.setValue(HistorymwbPo.COLUMNS.RELEASE.name(), historymwbPo.getRelease()); 
			dataObject.setValue(HistorymwbPo.COLUMNS.IE.name(), historymwbPo.getIe()); 
			dataObject.setValue(HistorymwbPo.COLUMNS.WORKAREA.name(), historymwbPo.getWorkarea()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<HistorymwbPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(HistorymwbPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
