package com.doc.common.dao.impl; 
 
public class MwbnologDAOImpl extends GeneralDAOImpl<MwbnologPo> implements MwbnologDAO { 
	public static final MwbnologDAOImpl INSTANCE = new MwbnologDAOImpl(); 
	public static final String TABLENAME = "MWBNOLOG"; 

	public MwbnologDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<MwbnologPo> CONVERTER = new MapConverter<MwbnologPo>() { 
 
		@Override 
		public MwbnologPo convert(final DataObject dataObject) { 
			final MwbnologPo mwbnologPo = new MwbnologPo(); 
			mwbnologPo.setMwb(dataObject.getString(MwbnologPo.COLUMNS.MWB.name())); 
			mwbnologPo.setIe(dataObject.getString(MwbnologPo.COLUMNS.IE.name())); 
			mwbnologPo.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(MwbnologPo.COLUMNS.GCIPIECE.name()))); 
			mwbnologPo.setGcopiece(BigDecimalUtils.formObj(dataObject.getValue(MwbnologPo.COLUMNS.GCOPIECE.name()))); 
			mwbnologPo.setLastupdate(TimestampUtils.of(dataObject.getValue(MwbnologPo.COLUMNS.LASTUPDATE.name()))); 
			return mwbnologPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final MwbnologPo mwbnologPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(MwbnologPo.COLUMNS.MWB.name(), mwbnologPo.getMwb()); 
			dataObject.setValue(MwbnologPo.COLUMNS.IE.name(), mwbnologPo.getIe()); 
			dataObject.setValue(MwbnologPo.COLUMNS.GCIPIECE.name(), mwbnologPo.getGcipiece()); 
			dataObject.setValue(MwbnologPo.COLUMNS.GCOPIECE.name(), mwbnologPo.getGcopiece()); 
			dataObject.setValue(MwbnologPo.COLUMNS.LASTUPDATE.name(), mwbnologPo.getLastupdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<MwbnologPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(MwbnologPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
