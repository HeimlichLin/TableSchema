package com.doc.common.dao.impl; 
 
public class Mview$AdvFjgDAOImpl extends GeneralDAOImpl<Mview$AdvFjgPo> implements IMview$AdvFjgDAO { 
	public static final Mview$AdvFjgDAOImpl INSTANCE = new Mview$AdvFjgDAOImpl(); 
	public static final String TABLENAME = "MVIEW$_ADV_FJG"; 

	public Mview$AdvFjgDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Mview$AdvFjgPo> CONVERTER = new MapConverter<Mview$AdvFjgPo>() { 
 
		@Override 
		public Mview$AdvFjgPo convert(final DataObject dataObject) { 
			final Mview$AdvFjgPo mview$AdvFjgPo = new Mview$AdvFjgPo(); 
			mview$AdvFjgPo.setFjgid#(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvFjgPo.COLUMNS.FJGID#.name()))); 
			mview$AdvFjgPo.setAjgid#(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvFjgPo.COLUMNS.AJGID#.name()))); 
			mview$AdvFjgPo.setFjgdeslen(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvFjgPo.COLUMNS.FJGDESLEN.name()))); 
			mview$AdvFjgPo.setFjgdes(); 
			mview$AdvFjgPo.setHashvalue(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvFjgPo.COLUMNS.HASHVALUE.name()))); 
			mview$AdvFjgPo.setFrequency(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvFjgPo.COLUMNS.FREQUENCY.name()))); 
			return mview$AdvFjgPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Mview$AdvFjgPo mview$AdvFjgPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Mview$AdvFjgPo.COLUMNS.FJGID#.name(), mview$AdvFjgPo.getFjgid#()); 
			dataObject.setValue(Mview$AdvFjgPo.COLUMNS.AJGID#.name(), mview$AdvFjgPo.getAjgid#()); 
			dataObject.setValue(Mview$AdvFjgPo.COLUMNS.FJGDESLEN.name(), mview$AdvFjgPo.getFjgdeslen()); 
			dataObject.setValue(Mview$AdvFjgPo.COLUMNS.FJGDES.name(), mview$AdvFjgPo.getFjgdes()); 
			dataObject.setValue(Mview$AdvFjgPo.COLUMNS.HASHVALUE.name(), mview$AdvFjgPo.getHashvalue()); 
			dataObject.setValue(Mview$AdvFjgPo.COLUMNS.FREQUENCY.name(), mview$AdvFjgPo.getFrequency()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Mview$AdvFjgPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Mview$AdvFjgPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Mview$AdvFjgPo.COLUMNS.FJGID#.name(), po.getFjgid#()); 
		sqlWhere.add(Mview$AdvFjgPo.COLUMNS.AJGID#.name(), po.getAjgid#()); 
		return sqlWhere; 
	} 
 
} 
