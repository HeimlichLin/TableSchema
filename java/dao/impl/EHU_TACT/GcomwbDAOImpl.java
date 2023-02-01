package com.doc.common.dao.impl; 
 
public class GcomwbDAOImpl extends GeneralDAOImpl<GcomwbPo> implements GcomwbDAO { 
	public static final GcomwbDAOImpl INSTANCE = new GcomwbDAOImpl(); 
	public static final String TABLENAME = "GCOMWB"; 

	public GcomwbDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<GcomwbPo> CONVERTER = new MapConverter<GcomwbPo>() { 
 
		@Override 
		public GcomwbPo convert(final DataObject dataObject) { 
			final GcomwbPo gcomwbPo = new GcomwbPo(); 
			gcomwbPo.setLastupdate(TimestampUtils.of(dataObject.getValue(GcomwbPo.COLUMNS.LASTUPDATE.name()))); 
			gcomwbPo.setMwb(dataObject.getString(GcomwbPo.COLUMNS.MWB.name())); 
			gcomwbPo.setHwbcount(BigDecimalUtils.formObj(dataObject.getValue(GcomwbPo.COLUMNS.HWBCOUNT.name()))); 
			gcomwbPo.setHwbpiece(BigDecimalUtils.formObj(dataObject.getValue(GcomwbPo.COLUMNS.HWBPIECE.name()))); 
			gcomwbPo.setBagcount(BigDecimalUtils.formObj(dataObject.getValue(GcomwbPo.COLUMNS.BAGCOUNT.name()))); 
			gcomwbPo.setBaghwb(BigDecimalUtils.formObj(dataObject.getValue(GcomwbPo.COLUMNS.BAGHWB.name()))); 
			gcomwbPo.setBagpiece(BigDecimalUtils.formObj(dataObject.getValue(GcomwbPo.COLUMNS.BAGPIECE.name()))); 
			gcomwbPo.setGcihwbcount(BigDecimalUtils.formObj(dataObject.getValue(GcomwbPo.COLUMNS.GCIHWBCOUNT.name()))); 
			gcomwbPo.setGcihwbpiece(BigDecimalUtils.formObj(dataObject.getValue(GcomwbPo.COLUMNS.GCIHWBPIECE.name()))); 
			gcomwbPo.setGcibagcount(BigDecimalUtils.formObj(dataObject.getValue(GcomwbPo.COLUMNS.GCIBAGCOUNT.name()))); 
			gcomwbPo.setGcibaghwb(BigDecimalUtils.formObj(dataObject.getValue(GcomwbPo.COLUMNS.GCIBAGHWB.name()))); 
			gcomwbPo.setGcibagpiece(BigDecimalUtils.formObj(dataObject.getValue(GcomwbPo.COLUMNS.GCIBAGPIECE.name()))); 
			gcomwbPo.setWorking(dataObject.getString(GcomwbPo.COLUMNS.WORKING.name())); 
			gcomwbPo.setRelease(TimestampUtils.of(dataObject.getValue(GcomwbPo.COLUMNS.RELEASE.name()))); 
			gcomwbPo.setIe(dataObject.getString(GcomwbPo.COLUMNS.IE.name())); 
			gcomwbPo.setWorkarea(dataObject.getString(GcomwbPo.COLUMNS.WORKAREA.name())); 
			return gcomwbPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final GcomwbPo gcomwbPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(GcomwbPo.COLUMNS.LASTUPDATE.name(), gcomwbPo.getLastupdate()); 
			dataObject.setValue(GcomwbPo.COLUMNS.MWB.name(), gcomwbPo.getMwb()); 
			dataObject.setValue(GcomwbPo.COLUMNS.HWBCOUNT.name(), gcomwbPo.getHwbcount()); 
			dataObject.setValue(GcomwbPo.COLUMNS.HWBPIECE.name(), gcomwbPo.getHwbpiece()); 
			dataObject.setValue(GcomwbPo.COLUMNS.BAGCOUNT.name(), gcomwbPo.getBagcount()); 
			dataObject.setValue(GcomwbPo.COLUMNS.BAGHWB.name(), gcomwbPo.getBaghwb()); 
			dataObject.setValue(GcomwbPo.COLUMNS.BAGPIECE.name(), gcomwbPo.getBagpiece()); 
			dataObject.setValue(GcomwbPo.COLUMNS.GCIHWBCOUNT.name(), gcomwbPo.getGcihwbcount()); 
			dataObject.setValue(GcomwbPo.COLUMNS.GCIHWBPIECE.name(), gcomwbPo.getGcihwbpiece()); 
			dataObject.setValue(GcomwbPo.COLUMNS.GCIBAGCOUNT.name(), gcomwbPo.getGcibagcount()); 
			dataObject.setValue(GcomwbPo.COLUMNS.GCIBAGHWB.name(), gcomwbPo.getGcibaghwb()); 
			dataObject.setValue(GcomwbPo.COLUMNS.GCIBAGPIECE.name(), gcomwbPo.getGcibagpiece()); 
			dataObject.setValue(GcomwbPo.COLUMNS.WORKING.name(), gcomwbPo.getWorking()); 
			dataObject.setValue(GcomwbPo.COLUMNS.RELEASE.name(), gcomwbPo.getRelease()); 
			dataObject.setValue(GcomwbPo.COLUMNS.IE.name(), gcomwbPo.getIe()); 
			dataObject.setValue(GcomwbPo.COLUMNS.WORKAREA.name(), gcomwbPo.getWorkarea()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<GcomwbPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(GcomwbPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
