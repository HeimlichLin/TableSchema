package com.doc.common.dao.impl; 
 
public class Mview$AdvEligibleDAOImpl extends GeneralDAOImpl<Mview$AdvEligiblePo> implements IMview$AdvEligibleDAO { 
	public static final Mview$AdvEligibleDAOImpl INSTANCE = new Mview$AdvEligibleDAOImpl(); 
	public static final String TABLENAME = "MVIEW$_ADV_ELIGIBLE"; 

	public Mview$AdvEligibleDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Mview$AdvEligiblePo> CONVERTER = new MapConverter<Mview$AdvEligiblePo>() { 
 
		@Override 
		public Mview$AdvEligiblePo convert(final DataObject dataObject) { 
			final Mview$AdvEligiblePo mview$AdvEligiblePo = new Mview$AdvEligiblePo(); 
			mview$AdvEligiblePo.setSumobjn#(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvEligiblePo.COLUMNS.SUMOBJN#.name()))); 
			mview$AdvEligiblePo.setRunid#(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvEligiblePo.COLUMNS.RUNID#.name()))); 
			mview$AdvEligiblePo.setRunid#(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvEligiblePo.COLUMNS.RUNID#.name()))); 
			mview$AdvEligiblePo.setBytecost(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvEligiblePo.COLUMNS.BYTECOST.name()))); 
			mview$AdvEligiblePo.setFlags(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvEligiblePo.COLUMNS.FLAGS.name()))); 
			mview$AdvEligiblePo.setFrequency(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvEligiblePo.COLUMNS.FREQUENCY.name()))); 
			return mview$AdvEligiblePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Mview$AdvEligiblePo mview$AdvEligiblePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Mview$AdvEligiblePo.COLUMNS.SUMOBJN#.name(), mview$AdvEligiblePo.getSumobjn#()); 
			dataObject.setValue(Mview$AdvEligiblePo.COLUMNS.RUNID#.name(), mview$AdvEligiblePo.getRunid#()); 
			dataObject.setValue(Mview$AdvEligiblePo.COLUMNS.RUNID#.name(), mview$AdvEligiblePo.getRunid#()); 
			dataObject.setValue(Mview$AdvEligiblePo.COLUMNS.BYTECOST.name(), mview$AdvEligiblePo.getBytecost()); 
			dataObject.setValue(Mview$AdvEligiblePo.COLUMNS.FLAGS.name(), mview$AdvEligiblePo.getFlags()); 
			dataObject.setValue(Mview$AdvEligiblePo.COLUMNS.FREQUENCY.name(), mview$AdvEligiblePo.getFrequency()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Mview$AdvEligiblePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Mview$AdvEligiblePo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Mview$AdvEligiblePo.COLUMNS.SUMOBJN#.name(), po.getSumobjn#()); 
		sqlWhere.add(Mview$AdvEligiblePo.COLUMNS.RUNID#.name(), po.getRunid#()); 
		sqlWhere.add(Mview$AdvEligiblePo.COLUMNS.RUNID#.name(), po.getRunid#()); 
		return sqlWhere; 
	} 
 
} 
