package com.doc.common.dao.impl; 
 
public class Mview$AdvLevelDAOImpl extends GeneralDAOImpl<Mview$AdvLevelPo> implements IMview$AdvLevelDAO { 
	public static final Mview$AdvLevelDAOImpl INSTANCE = new Mview$AdvLevelDAOImpl(); 
	public static final String TABLENAME = "MVIEW$_ADV_LEVEL"; 

	public Mview$AdvLevelDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Mview$AdvLevelPo> CONVERTER = new MapConverter<Mview$AdvLevelPo>() { 
 
		@Override 
		public Mview$AdvLevelPo convert(final DataObject dataObject) { 
			final Mview$AdvLevelPo mview$AdvLevelPo = new Mview$AdvLevelPo(); 
			mview$AdvLevelPo.setRunid#(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvLevelPo.COLUMNS.RUNID#.name()))); 
			mview$AdvLevelPo.setLevelid#(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvLevelPo.COLUMNS.LEVELID#.name()))); 
			mview$AdvLevelPo.setDimobj#(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvLevelPo.COLUMNS.DIMOBJ#.name()))); 
			mview$AdvLevelPo.setFlags(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvLevelPo.COLUMNS.FLAGS.name()))); 
			mview$AdvLevelPo.setTblobj#(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvLevelPo.COLUMNS.TBLOBJ#.name()))); 
			mview$AdvLevelPo.setColumnlist(); 
			mview$AdvLevelPo.setLevelname(dataObject.getString(Mview$AdvLevelPo.COLUMNS.LEVELNAME.name())); 
			return mview$AdvLevelPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Mview$AdvLevelPo mview$AdvLevelPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Mview$AdvLevelPo.COLUMNS.RUNID#.name(), mview$AdvLevelPo.getRunid#()); 
			dataObject.setValue(Mview$AdvLevelPo.COLUMNS.LEVELID#.name(), mview$AdvLevelPo.getLevelid#()); 
			dataObject.setValue(Mview$AdvLevelPo.COLUMNS.DIMOBJ#.name(), mview$AdvLevelPo.getDimobj#()); 
			dataObject.setValue(Mview$AdvLevelPo.COLUMNS.FLAGS.name(), mview$AdvLevelPo.getFlags()); 
			dataObject.setValue(Mview$AdvLevelPo.COLUMNS.TBLOBJ#.name(), mview$AdvLevelPo.getTblobj#()); 
			dataObject.setValue(Mview$AdvLevelPo.COLUMNS.COLUMNLIST.name(), mview$AdvLevelPo.getColumnlist()); 
			dataObject.setValue(Mview$AdvLevelPo.COLUMNS.LEVELNAME.name(), mview$AdvLevelPo.getLevelname()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Mview$AdvLevelPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Mview$AdvLevelPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Mview$AdvLevelPo.COLUMNS.RUNID#.name(), po.getRunid#()); 
		sqlWhere.add(Mview$AdvLevelPo.COLUMNS.LEVELID#.name(), po.getLevelid#()); 
		return sqlWhere; 
	} 
 
} 
