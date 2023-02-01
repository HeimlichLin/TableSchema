package com.doc.common.dao.impl; 
 
public class Mview$AdvAjgDAOImpl extends GeneralDAOImpl<Mview$AdvAjgPo> implements IMview$AdvAjgDAO { 
	public static final Mview$AdvAjgDAOImpl INSTANCE = new Mview$AdvAjgDAOImpl(); 
	public static final String TABLENAME = "MVIEW$_ADV_AJG"; 

	public Mview$AdvAjgDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Mview$AdvAjgPo> CONVERTER = new MapConverter<Mview$AdvAjgPo>() { 
 
		@Override 
		public Mview$AdvAjgPo convert(final DataObject dataObject) { 
			final Mview$AdvAjgPo mview$AdvAjgPo = new Mview$AdvAjgPo(); 
			mview$AdvAjgPo.setAjgid#(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvAjgPo.COLUMNS.AJGID#.name()))); 
			mview$AdvAjgPo.setRunid#(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvAjgPo.COLUMNS.RUNID#.name()))); 
			mview$AdvAjgPo.setAjgdeslen(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvAjgPo.COLUMNS.AJGDESLEN.name()))); 
			mview$AdvAjgPo.setAjgdes(); 
			mview$AdvAjgPo.setHashvalue(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvAjgPo.COLUMNS.HASHVALUE.name()))); 
			mview$AdvAjgPo.setFrequency(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvAjgPo.COLUMNS.FREQUENCY.name()))); 
			return mview$AdvAjgPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Mview$AdvAjgPo mview$AdvAjgPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Mview$AdvAjgPo.COLUMNS.AJGID#.name(), mview$AdvAjgPo.getAjgid#()); 
			dataObject.setValue(Mview$AdvAjgPo.COLUMNS.RUNID#.name(), mview$AdvAjgPo.getRunid#()); 
			dataObject.setValue(Mview$AdvAjgPo.COLUMNS.AJGDESLEN.name(), mview$AdvAjgPo.getAjgdeslen()); 
			dataObject.setValue(Mview$AdvAjgPo.COLUMNS.AJGDES.name(), mview$AdvAjgPo.getAjgdes()); 
			dataObject.setValue(Mview$AdvAjgPo.COLUMNS.HASHVALUE.name(), mview$AdvAjgPo.getHashvalue()); 
			dataObject.setValue(Mview$AdvAjgPo.COLUMNS.FREQUENCY.name(), mview$AdvAjgPo.getFrequency()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Mview$AdvAjgPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Mview$AdvAjgPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Mview$AdvAjgPo.COLUMNS.AJGID#.name(), po.getAjgid#()); 
		sqlWhere.add(Mview$AdvAjgPo.COLUMNS.RUNID#.name(), po.getRunid#()); 
		return sqlWhere; 
	} 
 
} 
