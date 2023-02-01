package com.doc.common.dao.impl; 
 
public class Mview$AdvPartitionDAOImpl extends GeneralDAOImpl<Mview$AdvPartitionPo> implements IMview$AdvPartitionDAO { 
	public static final Mview$AdvPartitionDAOImpl INSTANCE = new Mview$AdvPartitionDAOImpl(); 
	public static final String TABLENAME = "MVIEW$_ADV_PARTITION"; 

	public Mview$AdvPartitionDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Mview$AdvPartitionPo> CONVERTER = new MapConverter<Mview$AdvPartitionPo>() { 
 
		@Override 
		public Mview$AdvPartitionPo convert(final DataObject dataObject) { 
			final Mview$AdvPartitionPo mview$AdvPartitionPo = new Mview$AdvPartitionPo(); 
			mview$AdvPartitionPo.setRunid#(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvPartitionPo.COLUMNS.RUNID#.name()))); 
			mview$AdvPartitionPo.setRank#(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvPartitionPo.COLUMNS.RANK#.name()))); 
			mview$AdvPartitionPo.setSummaryOwner(dataObject.getString(Mview$AdvPartitionPo.COLUMNS.SUMMARY_OWNER.name())); 
			mview$AdvPartitionPo.setQueryText(); 
			return mview$AdvPartitionPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Mview$AdvPartitionPo mview$AdvPartitionPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Mview$AdvPartitionPo.COLUMNS.RUNID#.name(), mview$AdvPartitionPo.getRunid#()); 
			dataObject.setValue(Mview$AdvPartitionPo.COLUMNS.RANK#.name(), mview$AdvPartitionPo.getRank#()); 
			dataObject.setValue(Mview$AdvPartitionPo.COLUMNS.SUMMARY_OWNER.name(), mview$AdvPartitionPo.getSummaryOwner()); 
			dataObject.setValue(Mview$AdvPartitionPo.COLUMNS.QUERY_TEXT.name(), mview$AdvPartitionPo.getQueryText()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Mview$AdvPartitionPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Mview$AdvPartitionPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
