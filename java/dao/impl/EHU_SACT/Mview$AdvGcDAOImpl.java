package com.doc.common.dao.impl; 
 
public class Mview$AdvGcDAOImpl extends GeneralDAOImpl<Mview$AdvGcPo> implements IMview$AdvGcDAO { 
	public static final Mview$AdvGcDAOImpl INSTANCE = new Mview$AdvGcDAOImpl(); 
	public static final String TABLENAME = "MVIEW$_ADV_GC"; 

	public Mview$AdvGcDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Mview$AdvGcPo> CONVERTER = new MapConverter<Mview$AdvGcPo>() { 
 
		@Override 
		public Mview$AdvGcPo convert(final DataObject dataObject) { 
			final Mview$AdvGcPo mview$AdvGcPo = new Mview$AdvGcPo(); 
			mview$AdvGcPo.setGcid#(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvGcPo.COLUMNS.GCID#.name()))); 
			mview$AdvGcPo.setFjgid#(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvGcPo.COLUMNS.FJGID#.name()))); 
			mview$AdvGcPo.setGcdeslen(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvGcPo.COLUMNS.GCDESLEN.name()))); 
			mview$AdvGcPo.setGcdes(); 
			mview$AdvGcPo.setHashvalue(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvGcPo.COLUMNS.HASHVALUE.name()))); 
			mview$AdvGcPo.setFrequency(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvGcPo.COLUMNS.FREQUENCY.name()))); 
			return mview$AdvGcPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Mview$AdvGcPo mview$AdvGcPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Mview$AdvGcPo.COLUMNS.GCID#.name(), mview$AdvGcPo.getGcid#()); 
			dataObject.setValue(Mview$AdvGcPo.COLUMNS.FJGID#.name(), mview$AdvGcPo.getFjgid#()); 
			dataObject.setValue(Mview$AdvGcPo.COLUMNS.GCDESLEN.name(), mview$AdvGcPo.getGcdeslen()); 
			dataObject.setValue(Mview$AdvGcPo.COLUMNS.GCDES.name(), mview$AdvGcPo.getGcdes()); 
			dataObject.setValue(Mview$AdvGcPo.COLUMNS.HASHVALUE.name(), mview$AdvGcPo.getHashvalue()); 
			dataObject.setValue(Mview$AdvGcPo.COLUMNS.FREQUENCY.name(), mview$AdvGcPo.getFrequency()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Mview$AdvGcPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Mview$AdvGcPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Mview$AdvGcPo.COLUMNS.GCID#.name(), po.getGcid#()); 
		sqlWhere.add(Mview$AdvGcPo.COLUMNS.FJGID#.name(), po.getFjgid#()); 
		return sqlWhere; 
	} 
 
} 
