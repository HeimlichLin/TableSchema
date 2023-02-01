package com.doc.common.dao.impl; 
 
public class Mview$AdvFilterDAOImpl extends GeneralDAOImpl<Mview$AdvFilterPo> implements IMview$AdvFilterDAO { 
	public static final Mview$AdvFilterDAOImpl INSTANCE = new Mview$AdvFilterDAOImpl(); 
	public static final String TABLENAME = "MVIEW$_ADV_FILTER"; 

	public Mview$AdvFilterDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Mview$AdvFilterPo> CONVERTER = new MapConverter<Mview$AdvFilterPo>() { 
 
		@Override 
		public Mview$AdvFilterPo convert(final DataObject dataObject) { 
			final Mview$AdvFilterPo mview$AdvFilterPo = new Mview$AdvFilterPo(); 
			mview$AdvFilterPo.setFilterid#(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvFilterPo.COLUMNS.FILTERID#.name()))); 
			mview$AdvFilterPo.setSubfilternum#(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvFilterPo.COLUMNS.SUBFILTERNUM#.name()))); 
			mview$AdvFilterPo.setSubfiltertype(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvFilterPo.COLUMNS.SUBFILTERTYPE.name()))); 
			mview$AdvFilterPo.setStrValue(dataObject.getString(Mview$AdvFilterPo.COLUMNS.STR_VALUE.name())); 
			mview$AdvFilterPo.setNumValue1(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvFilterPo.COLUMNS.NUM_VALUE1.name()))); 
			mview$AdvFilterPo.setNumValue2(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvFilterPo.COLUMNS.NUM_VALUE2.name()))); 
			mview$AdvFilterPo.setDateValue1(TimestampUtils.of(dataObject.getValue(Mview$AdvFilterPo.COLUMNS.DATE_VALUE1.name()))); 
			mview$AdvFilterPo.setDateValue2(TimestampUtils.of(dataObject.getValue(Mview$AdvFilterPo.COLUMNS.DATE_VALUE2.name()))); 
			return mview$AdvFilterPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Mview$AdvFilterPo mview$AdvFilterPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Mview$AdvFilterPo.COLUMNS.FILTERID#.name(), mview$AdvFilterPo.getFilterid#()); 
			dataObject.setValue(Mview$AdvFilterPo.COLUMNS.SUBFILTERNUM#.name(), mview$AdvFilterPo.getSubfilternum#()); 
			dataObject.setValue(Mview$AdvFilterPo.COLUMNS.SUBFILTERTYPE.name(), mview$AdvFilterPo.getSubfiltertype()); 
			dataObject.setValue(Mview$AdvFilterPo.COLUMNS.STR_VALUE.name(), mview$AdvFilterPo.getStrValue()); 
			dataObject.setValue(Mview$AdvFilterPo.COLUMNS.NUM_VALUE1.name(), mview$AdvFilterPo.getNumValue1()); 
			dataObject.setValue(Mview$AdvFilterPo.COLUMNS.NUM_VALUE2.name(), mview$AdvFilterPo.getNumValue2()); 
			dataObject.setValue(Mview$AdvFilterPo.COLUMNS.DATE_VALUE1.name(), mview$AdvFilterPo.getDateValue1()); 
			dataObject.setValue(Mview$AdvFilterPo.COLUMNS.DATE_VALUE2.name(), mview$AdvFilterPo.getDateValue2()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Mview$AdvFilterPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Mview$AdvFilterPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Mview$AdvFilterPo.COLUMNS.FILTERID#.name(), po.getFilterid#()); 
		sqlWhere.add(Mview$AdvFilterPo.COLUMNS.SUBFILTERNUM#.name(), po.getSubfilternum#()); 
		return sqlWhere; 
	} 
 
} 
