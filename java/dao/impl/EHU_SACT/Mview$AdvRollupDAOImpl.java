package com.doc.common.dao.impl; 
 
public class Mview$AdvRollupDAOImpl extends GeneralDAOImpl<Mview$AdvRollupPo> implements IMview$AdvRollupDAO { 
	public static final Mview$AdvRollupDAOImpl INSTANCE = new Mview$AdvRollupDAOImpl(); 
	public static final String TABLENAME = "MVIEW$_ADV_ROLLUP"; 

	public Mview$AdvRollupDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Mview$AdvRollupPo> CONVERTER = new MapConverter<Mview$AdvRollupPo>() { 
 
		@Override 
		public Mview$AdvRollupPo convert(final DataObject dataObject) { 
			final Mview$AdvRollupPo mview$AdvRollupPo = new Mview$AdvRollupPo(); 
			mview$AdvRollupPo.setRunid#(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvRollupPo.COLUMNS.RUNID#.name()))); 
			mview$AdvRollupPo.setClevelid#(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvRollupPo.COLUMNS.CLEVELID#.name()))); 
			mview$AdvRollupPo.setPlevelid#(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvRollupPo.COLUMNS.PLEVELID#.name()))); 
			mview$AdvRollupPo.setPlevelid#(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvRollupPo.COLUMNS.PLEVELID#.name()))); 
			mview$AdvRollupPo.setFlags(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvRollupPo.COLUMNS.FLAGS.name()))); 
			return mview$AdvRollupPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Mview$AdvRollupPo mview$AdvRollupPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Mview$AdvRollupPo.COLUMNS.RUNID#.name(), mview$AdvRollupPo.getRunid#()); 
			dataObject.setValue(Mview$AdvRollupPo.COLUMNS.CLEVELID#.name(), mview$AdvRollupPo.getClevelid#()); 
			dataObject.setValue(Mview$AdvRollupPo.COLUMNS.PLEVELID#.name(), mview$AdvRollupPo.getPlevelid#()); 
			dataObject.setValue(Mview$AdvRollupPo.COLUMNS.PLEVELID#.name(), mview$AdvRollupPo.getPlevelid#()); 
			dataObject.setValue(Mview$AdvRollupPo.COLUMNS.FLAGS.name(), mview$AdvRollupPo.getFlags()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Mview$AdvRollupPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Mview$AdvRollupPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Mview$AdvRollupPo.COLUMNS.RUNID#.name(), po.getRunid#()); 
		sqlWhere.add(Mview$AdvRollupPo.COLUMNS.CLEVELID#.name(), po.getClevelid#()); 
		sqlWhere.add(Mview$AdvRollupPo.COLUMNS.PLEVELID#.name(), po.getPlevelid#()); 
		sqlWhere.add(Mview$AdvRollupPo.COLUMNS.PLEVELID#.name(), po.getPlevelid#()); 
		return sqlWhere; 
	} 
 
} 
