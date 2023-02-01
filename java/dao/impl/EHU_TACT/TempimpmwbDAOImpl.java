package com.doc.common.dao.impl; 
 
public class TempimpmwbDAOImpl extends GeneralDAOImpl<TempimpmwbPo> implements TempimpmwbDAO { 
	public static final TempimpmwbDAOImpl INSTANCE = new TempimpmwbDAOImpl(); 
	public static final String TABLENAME = "TEMPIMPMWB"; 

	public TempimpmwbDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TempimpmwbPo> CONVERTER = new MapConverter<TempimpmwbPo>() { 
 
		@Override 
		public TempimpmwbPo convert(final DataObject dataObject) { 
			final TempimpmwbPo tempimpmwbPo = new TempimpmwbPo(); 
			tempimpmwbPo.setLastupdate(TimestampUtils.of(dataObject.getValue(TempimpmwbPo.COLUMNS.LASTUPDATE.name()))); 
			tempimpmwbPo.setMwb(dataObject.getString(TempimpmwbPo.COLUMNS.MWB.name())); 
			tempimpmwbPo.setHwbcount(BigDecimalUtils.formObj(dataObject.getValue(TempimpmwbPo.COLUMNS.HWBCOUNT.name()))); 
			tempimpmwbPo.setHwbpiece(BigDecimalUtils.formObj(dataObject.getValue(TempimpmwbPo.COLUMNS.HWBPIECE.name()))); 
			tempimpmwbPo.setBagcount(BigDecimalUtils.formObj(dataObject.getValue(TempimpmwbPo.COLUMNS.BAGCOUNT.name()))); 
			tempimpmwbPo.setBaghwb(BigDecimalUtils.formObj(dataObject.getValue(TempimpmwbPo.COLUMNS.BAGHWB.name()))); 
			tempimpmwbPo.setBagpiece(BigDecimalUtils.formObj(dataObject.getValue(TempimpmwbPo.COLUMNS.BAGPIECE.name()))); 
			tempimpmwbPo.setGcihwbcount(BigDecimalUtils.formObj(dataObject.getValue(TempimpmwbPo.COLUMNS.GCIHWBCOUNT.name()))); 
			tempimpmwbPo.setGcihwbpiece(BigDecimalUtils.formObj(dataObject.getValue(TempimpmwbPo.COLUMNS.GCIHWBPIECE.name()))); 
			tempimpmwbPo.setGcibagcount(BigDecimalUtils.formObj(dataObject.getValue(TempimpmwbPo.COLUMNS.GCIBAGCOUNT.name()))); 
			tempimpmwbPo.setGcibaghwb(BigDecimalUtils.formObj(dataObject.getValue(TempimpmwbPo.COLUMNS.GCIBAGHWB.name()))); 
			tempimpmwbPo.setGcibagpiece(BigDecimalUtils.formObj(dataObject.getValue(TempimpmwbPo.COLUMNS.GCIBAGPIECE.name()))); 
			tempimpmwbPo.setWorking(dataObject.getString(TempimpmwbPo.COLUMNS.WORKING.name())); 
			tempimpmwbPo.setRelease(TimestampUtils.of(dataObject.getValue(TempimpmwbPo.COLUMNS.RELEASE.name()))); 
			tempimpmwbPo.setIe(dataObject.getString(TempimpmwbPo.COLUMNS.IE.name())); 
			tempimpmwbPo.setWorkarea(dataObject.getString(TempimpmwbPo.COLUMNS.WORKAREA.name())); 
			return tempimpmwbPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TempimpmwbPo tempimpmwbPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TempimpmwbPo.COLUMNS.LASTUPDATE.name(), tempimpmwbPo.getLastupdate()); 
			dataObject.setValue(TempimpmwbPo.COLUMNS.MWB.name(), tempimpmwbPo.getMwb()); 
			dataObject.setValue(TempimpmwbPo.COLUMNS.HWBCOUNT.name(), tempimpmwbPo.getHwbcount()); 
			dataObject.setValue(TempimpmwbPo.COLUMNS.HWBPIECE.name(), tempimpmwbPo.getHwbpiece()); 
			dataObject.setValue(TempimpmwbPo.COLUMNS.BAGCOUNT.name(), tempimpmwbPo.getBagcount()); 
			dataObject.setValue(TempimpmwbPo.COLUMNS.BAGHWB.name(), tempimpmwbPo.getBaghwb()); 
			dataObject.setValue(TempimpmwbPo.COLUMNS.BAGPIECE.name(), tempimpmwbPo.getBagpiece()); 
			dataObject.setValue(TempimpmwbPo.COLUMNS.GCIHWBCOUNT.name(), tempimpmwbPo.getGcihwbcount()); 
			dataObject.setValue(TempimpmwbPo.COLUMNS.GCIHWBPIECE.name(), tempimpmwbPo.getGcihwbpiece()); 
			dataObject.setValue(TempimpmwbPo.COLUMNS.GCIBAGCOUNT.name(), tempimpmwbPo.getGcibagcount()); 
			dataObject.setValue(TempimpmwbPo.COLUMNS.GCIBAGHWB.name(), tempimpmwbPo.getGcibaghwb()); 
			dataObject.setValue(TempimpmwbPo.COLUMNS.GCIBAGPIECE.name(), tempimpmwbPo.getGcibagpiece()); 
			dataObject.setValue(TempimpmwbPo.COLUMNS.WORKING.name(), tempimpmwbPo.getWorking()); 
			dataObject.setValue(TempimpmwbPo.COLUMNS.RELEASE.name(), tempimpmwbPo.getRelease()); 
			dataObject.setValue(TempimpmwbPo.COLUMNS.IE.name(), tempimpmwbPo.getIe()); 
			dataObject.setValue(TempimpmwbPo.COLUMNS.WORKAREA.name(), tempimpmwbPo.getWorkarea()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TempimpmwbPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TempimpmwbPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
