package com.doc.common.dao.impl; 
 
public class TempimpmwbBackupDAOImpl extends GeneralDAOImpl<TempimpmwbBackupPo> implements TempimpmwbBackupDAO { 
	public static final TempimpmwbBackupDAOImpl INSTANCE = new TempimpmwbBackupDAOImpl(); 
	public static final String TABLENAME = "TEMPIMPMWB_BACKUP"; 

	public TempimpmwbBackupDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TempimpmwbBackupPo> CONVERTER = new MapConverter<TempimpmwbBackupPo>() { 
 
		@Override 
		public TempimpmwbBackupPo convert(final DataObject dataObject) { 
			final TempimpmwbBackupPo tempimpmwbBackupPo = new TempimpmwbBackupPo(); 
			tempimpmwbBackupPo.setLastupdate(TimestampUtils.of(dataObject.getValue(TempimpmwbBackupPo.COLUMNS.LASTUPDATE.name()))); 
			tempimpmwbBackupPo.setMwb(dataObject.getString(TempimpmwbBackupPo.COLUMNS.MWB.name())); 
			tempimpmwbBackupPo.setHwbcount(BigDecimalUtils.formObj(dataObject.getValue(TempimpmwbBackupPo.COLUMNS.HWBCOUNT.name()))); 
			tempimpmwbBackupPo.setHwbpiece(BigDecimalUtils.formObj(dataObject.getValue(TempimpmwbBackupPo.COLUMNS.HWBPIECE.name()))); 
			tempimpmwbBackupPo.setBagcount(BigDecimalUtils.formObj(dataObject.getValue(TempimpmwbBackupPo.COLUMNS.BAGCOUNT.name()))); 
			tempimpmwbBackupPo.setBaghwb(BigDecimalUtils.formObj(dataObject.getValue(TempimpmwbBackupPo.COLUMNS.BAGHWB.name()))); 
			tempimpmwbBackupPo.setBagpiece(BigDecimalUtils.formObj(dataObject.getValue(TempimpmwbBackupPo.COLUMNS.BAGPIECE.name()))); 
			tempimpmwbBackupPo.setGcihwbcount(BigDecimalUtils.formObj(dataObject.getValue(TempimpmwbBackupPo.COLUMNS.GCIHWBCOUNT.name()))); 
			tempimpmwbBackupPo.setGcihwbpiece(BigDecimalUtils.formObj(dataObject.getValue(TempimpmwbBackupPo.COLUMNS.GCIHWBPIECE.name()))); 
			tempimpmwbBackupPo.setGcibagcount(BigDecimalUtils.formObj(dataObject.getValue(TempimpmwbBackupPo.COLUMNS.GCIBAGCOUNT.name()))); 
			tempimpmwbBackupPo.setGcibaghwb(BigDecimalUtils.formObj(dataObject.getValue(TempimpmwbBackupPo.COLUMNS.GCIBAGHWB.name()))); 
			tempimpmwbBackupPo.setGcibagpiece(BigDecimalUtils.formObj(dataObject.getValue(TempimpmwbBackupPo.COLUMNS.GCIBAGPIECE.name()))); 
			tempimpmwbBackupPo.setWorking(dataObject.getString(TempimpmwbBackupPo.COLUMNS.WORKING.name())); 
			tempimpmwbBackupPo.setRelease(TimestampUtils.of(dataObject.getValue(TempimpmwbBackupPo.COLUMNS.RELEASE.name()))); 
			tempimpmwbBackupPo.setIe(dataObject.getString(TempimpmwbBackupPo.COLUMNS.IE.name())); 
			tempimpmwbBackupPo.setWorkarea(dataObject.getString(TempimpmwbBackupPo.COLUMNS.WORKAREA.name())); 
			return tempimpmwbBackupPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TempimpmwbBackupPo tempimpmwbBackupPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TempimpmwbBackupPo.COLUMNS.LASTUPDATE.name(), tempimpmwbBackupPo.getLastupdate()); 
			dataObject.setValue(TempimpmwbBackupPo.COLUMNS.MWB.name(), tempimpmwbBackupPo.getMwb()); 
			dataObject.setValue(TempimpmwbBackupPo.COLUMNS.HWBCOUNT.name(), tempimpmwbBackupPo.getHwbcount()); 
			dataObject.setValue(TempimpmwbBackupPo.COLUMNS.HWBPIECE.name(), tempimpmwbBackupPo.getHwbpiece()); 
			dataObject.setValue(TempimpmwbBackupPo.COLUMNS.BAGCOUNT.name(), tempimpmwbBackupPo.getBagcount()); 
			dataObject.setValue(TempimpmwbBackupPo.COLUMNS.BAGHWB.name(), tempimpmwbBackupPo.getBaghwb()); 
			dataObject.setValue(TempimpmwbBackupPo.COLUMNS.BAGPIECE.name(), tempimpmwbBackupPo.getBagpiece()); 
			dataObject.setValue(TempimpmwbBackupPo.COLUMNS.GCIHWBCOUNT.name(), tempimpmwbBackupPo.getGcihwbcount()); 
			dataObject.setValue(TempimpmwbBackupPo.COLUMNS.GCIHWBPIECE.name(), tempimpmwbBackupPo.getGcihwbpiece()); 
			dataObject.setValue(TempimpmwbBackupPo.COLUMNS.GCIBAGCOUNT.name(), tempimpmwbBackupPo.getGcibagcount()); 
			dataObject.setValue(TempimpmwbBackupPo.COLUMNS.GCIBAGHWB.name(), tempimpmwbBackupPo.getGcibaghwb()); 
			dataObject.setValue(TempimpmwbBackupPo.COLUMNS.GCIBAGPIECE.name(), tempimpmwbBackupPo.getGcibagpiece()); 
			dataObject.setValue(TempimpmwbBackupPo.COLUMNS.WORKING.name(), tempimpmwbBackupPo.getWorking()); 
			dataObject.setValue(TempimpmwbBackupPo.COLUMNS.RELEASE.name(), tempimpmwbBackupPo.getRelease()); 
			dataObject.setValue(TempimpmwbBackupPo.COLUMNS.IE.name(), tempimpmwbBackupPo.getIe()); 
			dataObject.setValue(TempimpmwbBackupPo.COLUMNS.WORKAREA.name(), tempimpmwbBackupPo.getWorkarea()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TempimpmwbBackupPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TempimpmwbBackupPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
