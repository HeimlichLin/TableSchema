package com.doc.common.dao.impl; 
 
public class Mview$AdvCliqueDAOImpl extends GeneralDAOImpl<Mview$AdvCliquePo> implements IMview$AdvCliqueDAO { 
	public static final Mview$AdvCliqueDAOImpl INSTANCE = new Mview$AdvCliqueDAOImpl(); 
	public static final String TABLENAME = "MVIEW$_ADV_CLIQUE"; 

	public Mview$AdvCliqueDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Mview$AdvCliquePo> CONVERTER = new MapConverter<Mview$AdvCliquePo>() { 
 
		@Override 
		public Mview$AdvCliquePo convert(final DataObject dataObject) { 
			final Mview$AdvCliquePo mview$AdvCliquePo = new Mview$AdvCliquePo(); 
			mview$AdvCliquePo.setCliqueid#(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvCliquePo.COLUMNS.CLIQUEID#.name()))); 
			mview$AdvCliquePo.setRunid#(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvCliquePo.COLUMNS.RUNID#.name()))); 
			mview$AdvCliquePo.setCliquedeslen(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvCliquePo.COLUMNS.CLIQUEDESLEN.name()))); 
			mview$AdvCliquePo.setCliquedes(); 
			mview$AdvCliquePo.setHashvalue(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvCliquePo.COLUMNS.HASHVALUE.name()))); 
			mview$AdvCliquePo.setFrequency(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvCliquePo.COLUMNS.FREQUENCY.name()))); 
			mview$AdvCliquePo.setBytecost(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvCliquePo.COLUMNS.BYTECOST.name()))); 
			mview$AdvCliquePo.setRowsize(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvCliquePo.COLUMNS.ROWSIZE.name()))); 
			mview$AdvCliquePo.setNumrows(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvCliquePo.COLUMNS.NUMROWS.name()))); 
			return mview$AdvCliquePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Mview$AdvCliquePo mview$AdvCliquePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Mview$AdvCliquePo.COLUMNS.CLIQUEID#.name(), mview$AdvCliquePo.getCliqueid#()); 
			dataObject.setValue(Mview$AdvCliquePo.COLUMNS.RUNID#.name(), mview$AdvCliquePo.getRunid#()); 
			dataObject.setValue(Mview$AdvCliquePo.COLUMNS.CLIQUEDESLEN.name(), mview$AdvCliquePo.getCliquedeslen()); 
			dataObject.setValue(Mview$AdvCliquePo.COLUMNS.CLIQUEDES.name(), mview$AdvCliquePo.getCliquedes()); 
			dataObject.setValue(Mview$AdvCliquePo.COLUMNS.HASHVALUE.name(), mview$AdvCliquePo.getHashvalue()); 
			dataObject.setValue(Mview$AdvCliquePo.COLUMNS.FREQUENCY.name(), mview$AdvCliquePo.getFrequency()); 
			dataObject.setValue(Mview$AdvCliquePo.COLUMNS.BYTECOST.name(), mview$AdvCliquePo.getBytecost()); 
			dataObject.setValue(Mview$AdvCliquePo.COLUMNS.ROWSIZE.name(), mview$AdvCliquePo.getRowsize()); 
			dataObject.setValue(Mview$AdvCliquePo.COLUMNS.NUMROWS.name(), mview$AdvCliquePo.getNumrows()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Mview$AdvCliquePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Mview$AdvCliquePo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Mview$AdvCliquePo.COLUMNS.CLIQUEID#.name(), po.getCliqueid#()); 
		sqlWhere.add(Mview$AdvCliquePo.COLUMNS.RUNID#.name(), po.getRunid#()); 
		return sqlWhere; 
	} 
 
} 
