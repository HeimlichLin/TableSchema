package com.doc.common.dao.impl; 
 
public class Mview$AdvIndexDAOImpl extends GeneralDAOImpl<Mview$AdvIndexPo> implements IMview$AdvIndexDAO { 
	public static final Mview$AdvIndexDAOImpl INSTANCE = new Mview$AdvIndexDAOImpl(); 
	public static final String TABLENAME = "MVIEW$_ADV_INDEX"; 

	public Mview$AdvIndexDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Mview$AdvIndexPo> CONVERTER = new MapConverter<Mview$AdvIndexPo>() { 
 
		@Override 
		public Mview$AdvIndexPo convert(final DataObject dataObject) { 
			final Mview$AdvIndexPo mview$AdvIndexPo = new Mview$AdvIndexPo(); 
			mview$AdvIndexPo.setRunid#(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvIndexPo.COLUMNS.RUNID#.name()))); 
			mview$AdvIndexPo.setRank#(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvIndexPo.COLUMNS.RANK#.name()))); 
			mview$AdvIndexPo.setMvindex#(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvIndexPo.COLUMNS.MVINDEX#.name()))); 
			mview$AdvIndexPo.setIndexType(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvIndexPo.COLUMNS.INDEX_TYPE.name()))); 
			mview$AdvIndexPo.setIndexName(dataObject.getString(Mview$AdvIndexPo.COLUMNS.INDEX_NAME.name())); 
			mview$AdvIndexPo.setColumnName(dataObject.getString(Mview$AdvIndexPo.COLUMNS.COLUMN_NAME.name())); 
			mview$AdvIndexPo.setIndexContent(dataObject.getString(Mview$AdvIndexPo.COLUMNS.INDEX_CONTENT.name())); 
			mview$AdvIndexPo.setSummaryOwner(dataObject.getString(Mview$AdvIndexPo.COLUMNS.SUMMARY_OWNER.name())); 
			return mview$AdvIndexPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Mview$AdvIndexPo mview$AdvIndexPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Mview$AdvIndexPo.COLUMNS.RUNID#.name(), mview$AdvIndexPo.getRunid#()); 
			dataObject.setValue(Mview$AdvIndexPo.COLUMNS.RANK#.name(), mview$AdvIndexPo.getRank#()); 
			dataObject.setValue(Mview$AdvIndexPo.COLUMNS.MVINDEX#.name(), mview$AdvIndexPo.getMvindex#()); 
			dataObject.setValue(Mview$AdvIndexPo.COLUMNS.INDEX_TYPE.name(), mview$AdvIndexPo.getIndexType()); 
			dataObject.setValue(Mview$AdvIndexPo.COLUMNS.INDEX_NAME.name(), mview$AdvIndexPo.getIndexName()); 
			dataObject.setValue(Mview$AdvIndexPo.COLUMNS.COLUMN_NAME.name(), mview$AdvIndexPo.getColumnName()); 
			dataObject.setValue(Mview$AdvIndexPo.COLUMNS.INDEX_CONTENT.name(), mview$AdvIndexPo.getIndexContent()); 
			dataObject.setValue(Mview$AdvIndexPo.COLUMNS.SUMMARY_OWNER.name(), mview$AdvIndexPo.getSummaryOwner()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Mview$AdvIndexPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Mview$AdvIndexPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
