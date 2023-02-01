package com.doc.common.dao.impl; 
 
public class TempexpmwbDAOImpl extends GeneralDAOImpl<TempexpmwbPo> implements TempexpmwbDAO { 
	public static final TempexpmwbDAOImpl INSTANCE = new TempexpmwbDAOImpl(); 
	public static final String TABLENAME = "TEMPEXPMWB"; 

	public TempexpmwbDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TempexpmwbPo> CONVERTER = new MapConverter<TempexpmwbPo>() { 
 
		@Override 
		public TempexpmwbPo convert(final DataObject dataObject) { 
			final TempexpmwbPo tempexpmwbPo = new TempexpmwbPo(); 
			tempexpmwbPo.setLastupdate(TimestampUtils.of(dataObject.getValue(TempexpmwbPo.COLUMNS.LASTUPDATE.name()))); 
			tempexpmwbPo.setMwb(dataObject.getString(TempexpmwbPo.COLUMNS.MWB.name())); 
			tempexpmwbPo.setHwbcount(BigDecimalUtils.formObj(dataObject.getValue(TempexpmwbPo.COLUMNS.HWBCOUNT.name()))); 
			tempexpmwbPo.setHwbpiece(BigDecimalUtils.formObj(dataObject.getValue(TempexpmwbPo.COLUMNS.HWBPIECE.name()))); 
			tempexpmwbPo.setBagcount(BigDecimalUtils.formObj(dataObject.getValue(TempexpmwbPo.COLUMNS.BAGCOUNT.name()))); 
			tempexpmwbPo.setBaghwb(BigDecimalUtils.formObj(dataObject.getValue(TempexpmwbPo.COLUMNS.BAGHWB.name()))); 
			tempexpmwbPo.setBagpiece(BigDecimalUtils.formObj(dataObject.getValue(TempexpmwbPo.COLUMNS.BAGPIECE.name()))); 
			tempexpmwbPo.setGcihwbcount(BigDecimalUtils.formObj(dataObject.getValue(TempexpmwbPo.COLUMNS.GCIHWBCOUNT.name()))); 
			tempexpmwbPo.setGcihwbpiece(BigDecimalUtils.formObj(dataObject.getValue(TempexpmwbPo.COLUMNS.GCIHWBPIECE.name()))); 
			tempexpmwbPo.setGcibagcount(BigDecimalUtils.formObj(dataObject.getValue(TempexpmwbPo.COLUMNS.GCIBAGCOUNT.name()))); 
			tempexpmwbPo.setGcibaghwb(BigDecimalUtils.formObj(dataObject.getValue(TempexpmwbPo.COLUMNS.GCIBAGHWB.name()))); 
			tempexpmwbPo.setGcibagpiece(BigDecimalUtils.formObj(dataObject.getValue(TempexpmwbPo.COLUMNS.GCIBAGPIECE.name()))); 
			tempexpmwbPo.setWorking(dataObject.getString(TempexpmwbPo.COLUMNS.WORKING.name())); 
			tempexpmwbPo.setRelease(TimestampUtils.of(dataObject.getValue(TempexpmwbPo.COLUMNS.RELEASE.name()))); 
			tempexpmwbPo.setIe(dataObject.getString(TempexpmwbPo.COLUMNS.IE.name())); 
			tempexpmwbPo.setWorkarea(dataObject.getString(TempexpmwbPo.COLUMNS.WORKAREA.name())); 
			return tempexpmwbPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TempexpmwbPo tempexpmwbPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TempexpmwbPo.COLUMNS.LASTUPDATE.name(), tempexpmwbPo.getLastupdate()); 
			dataObject.setValue(TempexpmwbPo.COLUMNS.MWB.name(), tempexpmwbPo.getMwb()); 
			dataObject.setValue(TempexpmwbPo.COLUMNS.HWBCOUNT.name(), tempexpmwbPo.getHwbcount()); 
			dataObject.setValue(TempexpmwbPo.COLUMNS.HWBPIECE.name(), tempexpmwbPo.getHwbpiece()); 
			dataObject.setValue(TempexpmwbPo.COLUMNS.BAGCOUNT.name(), tempexpmwbPo.getBagcount()); 
			dataObject.setValue(TempexpmwbPo.COLUMNS.BAGHWB.name(), tempexpmwbPo.getBaghwb()); 
			dataObject.setValue(TempexpmwbPo.COLUMNS.BAGPIECE.name(), tempexpmwbPo.getBagpiece()); 
			dataObject.setValue(TempexpmwbPo.COLUMNS.GCIHWBCOUNT.name(), tempexpmwbPo.getGcihwbcount()); 
			dataObject.setValue(TempexpmwbPo.COLUMNS.GCIHWBPIECE.name(), tempexpmwbPo.getGcihwbpiece()); 
			dataObject.setValue(TempexpmwbPo.COLUMNS.GCIBAGCOUNT.name(), tempexpmwbPo.getGcibagcount()); 
			dataObject.setValue(TempexpmwbPo.COLUMNS.GCIBAGHWB.name(), tempexpmwbPo.getGcibaghwb()); 
			dataObject.setValue(TempexpmwbPo.COLUMNS.GCIBAGPIECE.name(), tempexpmwbPo.getGcibagpiece()); 
			dataObject.setValue(TempexpmwbPo.COLUMNS.WORKING.name(), tempexpmwbPo.getWorking()); 
			dataObject.setValue(TempexpmwbPo.COLUMNS.RELEASE.name(), tempexpmwbPo.getRelease()); 
			dataObject.setValue(TempexpmwbPo.COLUMNS.IE.name(), tempexpmwbPo.getIe()); 
			dataObject.setValue(TempexpmwbPo.COLUMNS.WORKAREA.name(), tempexpmwbPo.getWorkarea()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TempexpmwbPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TempexpmwbPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
