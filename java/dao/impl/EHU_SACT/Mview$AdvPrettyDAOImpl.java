package com.doc.common.dao.impl; 
 
public class Mview$AdvPrettyDAOImpl extends GeneralDAOImpl<Mview$AdvPrettyPo> implements IMview$AdvPrettyDAO { 
	public static final Mview$AdvPrettyDAOImpl INSTANCE = new Mview$AdvPrettyDAOImpl(); 
	public static final String TABLENAME = "MVIEW$_ADV_PRETTY"; 

	public Mview$AdvPrettyDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Mview$AdvPrettyPo> CONVERTER = new MapConverter<Mview$AdvPrettyPo>() { 
 
		@Override 
		public Mview$AdvPrettyPo convert(final DataObject dataObject) { 
			final Mview$AdvPrettyPo mview$AdvPrettyPo = new Mview$AdvPrettyPo(); 
			mview$AdvPrettyPo.setQueryid#(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvPrettyPo.COLUMNS.QUERYID#.name()))); 
			mview$AdvPrettyPo.setSqlText(); 
			return mview$AdvPrettyPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Mview$AdvPrettyPo mview$AdvPrettyPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Mview$AdvPrettyPo.COLUMNS.QUERYID#.name(), mview$AdvPrettyPo.getQueryid#()); 
			dataObject.setValue(Mview$AdvPrettyPo.COLUMNS.SQL_TEXT.name(), mview$AdvPrettyPo.getSqlText()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Mview$AdvPrettyPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Mview$AdvPrettyPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
