package com.doc.common.dao.impl; 
 
public class Mview$AdvOwbDAOImpl extends GeneralDAOImpl<Mview$AdvOwbPo> implements IMview$AdvOwbDAO { 
	public static final Mview$AdvOwbDAOImpl INSTANCE = new Mview$AdvOwbDAOImpl(); 
	public static final String TABLENAME = "MVIEW$_ADV_OWB"; 

	public Mview$AdvOwbDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Mview$AdvOwbPo> CONVERTER = new MapConverter<Mview$AdvOwbPo>() { 
 
		@Override 
		public Mview$AdvOwbPo convert(final DataObject dataObject) { 
			final Mview$AdvOwbPo mview$AdvOwbPo = new Mview$AdvOwbPo(); 
			mview$AdvOwbPo.setRunid#(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvOwbPo.COLUMNS.RUNID#.name()))); 
			mview$AdvOwbPo.setObjname(dataObject.getString(Mview$AdvOwbPo.COLUMNS.OBJNAME.name())); 
			mview$AdvOwbPo.setOwnername(dataObject.getString(Mview$AdvOwbPo.COLUMNS.OWNERNAME.name())); 
			mview$AdvOwbPo.setMvscript(); 
			mview$AdvOwbPo.setIndexscript(); 
			return mview$AdvOwbPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Mview$AdvOwbPo mview$AdvOwbPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Mview$AdvOwbPo.COLUMNS.RUNID#.name(), mview$AdvOwbPo.getRunid#()); 
			dataObject.setValue(Mview$AdvOwbPo.COLUMNS.OBJNAME.name(), mview$AdvOwbPo.getObjname()); 
			dataObject.setValue(Mview$AdvOwbPo.COLUMNS.OWNERNAME.name(), mview$AdvOwbPo.getOwnername()); 
			dataObject.setValue(Mview$AdvOwbPo.COLUMNS.MVSCRIPT.name(), mview$AdvOwbPo.getMvscript()); 
			dataObject.setValue(Mview$AdvOwbPo.COLUMNS.INDEXSCRIPT.name(), mview$AdvOwbPo.getIndexscript()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Mview$AdvOwbPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Mview$AdvOwbPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
