package com.doc.common.dao.impl; 
 
public class Mview$AdvFilterinstanceDAOImpl extends GeneralDAOImpl<Mview$AdvFilterinstancePo> implements IMview$AdvFilterinstanceDAO { 
	public static final Mview$AdvFilterinstanceDAOImpl INSTANCE = new Mview$AdvFilterinstanceDAOImpl(); 
	public static final String TABLENAME = "MVIEW$_ADV_FILTERINSTANCE"; 

	public Mview$AdvFilterinstanceDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Mview$AdvFilterinstancePo> CONVERTER = new MapConverter<Mview$AdvFilterinstancePo>() { 
 
		@Override 
		public Mview$AdvFilterinstancePo convert(final DataObject dataObject) { 
			final Mview$AdvFilterinstancePo mview$AdvFilterinstancePo = new Mview$AdvFilterinstancePo(); 
			mview$AdvFilterinstancePo.setRunid#(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvFilterinstancePo.COLUMNS.RUNID#.name()))); 
			mview$AdvFilterinstancePo.setFilterid#(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvFilterinstancePo.COLUMNS.FILTERID#.name()))); 
			mview$AdvFilterinstancePo.setSubfilternum#(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvFilterinstancePo.COLUMNS.SUBFILTERNUM#.name()))); 
			mview$AdvFilterinstancePo.setSubfiltertype(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvFilterinstancePo.COLUMNS.SUBFILTERTYPE.name()))); 
			mview$AdvFilterinstancePo.setStrValue(dataObject.getString(Mview$AdvFilterinstancePo.COLUMNS.STR_VALUE.name())); 
			mview$AdvFilterinstancePo.setNumValue1(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvFilterinstancePo.COLUMNS.NUM_VALUE1.name()))); 
			mview$AdvFilterinstancePo.setNumValue2(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvFilterinstancePo.COLUMNS.NUM_VALUE2.name()))); 
			mview$AdvFilterinstancePo.setDateValue1(TimestampUtils.of(dataObject.getValue(Mview$AdvFilterinstancePo.COLUMNS.DATE_VALUE1.name()))); 
			mview$AdvFilterinstancePo.setDateValue2(TimestampUtils.of(dataObject.getValue(Mview$AdvFilterinstancePo.COLUMNS.DATE_VALUE2.name()))); 
			return mview$AdvFilterinstancePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Mview$AdvFilterinstancePo mview$AdvFilterinstancePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Mview$AdvFilterinstancePo.COLUMNS.RUNID#.name(), mview$AdvFilterinstancePo.getRunid#()); 
			dataObject.setValue(Mview$AdvFilterinstancePo.COLUMNS.FILTERID#.name(), mview$AdvFilterinstancePo.getFilterid#()); 
			dataObject.setValue(Mview$AdvFilterinstancePo.COLUMNS.SUBFILTERNUM#.name(), mview$AdvFilterinstancePo.getSubfilternum#()); 
			dataObject.setValue(Mview$AdvFilterinstancePo.COLUMNS.SUBFILTERTYPE.name(), mview$AdvFilterinstancePo.getSubfiltertype()); 
			dataObject.setValue(Mview$AdvFilterinstancePo.COLUMNS.STR_VALUE.name(), mview$AdvFilterinstancePo.getStrValue()); 
			dataObject.setValue(Mview$AdvFilterinstancePo.COLUMNS.NUM_VALUE1.name(), mview$AdvFilterinstancePo.getNumValue1()); 
			dataObject.setValue(Mview$AdvFilterinstancePo.COLUMNS.NUM_VALUE2.name(), mview$AdvFilterinstancePo.getNumValue2()); 
			dataObject.setValue(Mview$AdvFilterinstancePo.COLUMNS.DATE_VALUE1.name(), mview$AdvFilterinstancePo.getDateValue1()); 
			dataObject.setValue(Mview$AdvFilterinstancePo.COLUMNS.DATE_VALUE2.name(), mview$AdvFilterinstancePo.getDateValue2()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Mview$AdvFilterinstancePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Mview$AdvFilterinstancePo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Mview$AdvFilterinstancePo.COLUMNS.RUNID#.name(), po.getRunid#()); 
		return sqlWhere; 
	} 
 
} 
