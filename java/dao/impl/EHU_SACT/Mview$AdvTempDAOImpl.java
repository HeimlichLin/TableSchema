package com.doc.common.dao.impl; 
 
public class Mview$AdvTempDAOImpl extends GeneralDAOImpl<Mview$AdvTempPo> implements IMview$AdvTempDAO { 
	public static final Mview$AdvTempDAOImpl INSTANCE = new Mview$AdvTempDAOImpl(); 
	public static final String TABLENAME = "MVIEW$_ADV_TEMP"; 

	public Mview$AdvTempDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Mview$AdvTempPo> CONVERTER = new MapConverter<Mview$AdvTempPo>() { 
 
		@Override 
		public Mview$AdvTempPo convert(final DataObject dataObject) { 
			final Mview$AdvTempPo mview$AdvTempPo = new Mview$AdvTempPo(); 
			mview$AdvTempPo.setId#(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvTempPo.COLUMNS.ID#.name()))); 
			mview$AdvTempPo.setSeq#(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvTempPo.COLUMNS.SEQ#.name()))); 
			mview$AdvTempPo.setText(); 
			return mview$AdvTempPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Mview$AdvTempPo mview$AdvTempPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Mview$AdvTempPo.COLUMNS.ID#.name(), mview$AdvTempPo.getId#()); 
			dataObject.setValue(Mview$AdvTempPo.COLUMNS.SEQ#.name(), mview$AdvTempPo.getSeq#()); 
			dataObject.setValue(Mview$AdvTempPo.COLUMNS.TEXT.name(), mview$AdvTempPo.getText()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Mview$AdvTempPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Mview$AdvTempPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
