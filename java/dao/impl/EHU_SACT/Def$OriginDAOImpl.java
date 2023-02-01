package com.doc.common.dao.impl; 
 
public class Def$OriginDAOImpl extends GeneralDAOImpl<Def$OriginPo> implements IDef$OriginDAO { 
	public static final Def$OriginDAOImpl INSTANCE = new Def$OriginDAOImpl(); 
	public static final String TABLENAME = "DEF$_ORIGIN"; 

	public Def$OriginDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Def$OriginPo> CONVERTER = new MapConverter<Def$OriginPo>() { 
 
		@Override 
		public Def$OriginPo convert(final DataObject dataObject) { 
			final Def$OriginPo def$OriginPo = new Def$OriginPo(); 
			def$OriginPo.setOriginDb(dataObject.getString(Def$OriginPo.COLUMNS.ORIGIN_DB.name())); 
			def$OriginPo.setOriginDblink(dataObject.getString(Def$OriginPo.COLUMNS.ORIGIN_DBLINK.name())); 
			def$OriginPo.setInusr(BigDecimalUtils.formObj(dataObject.getValue(Def$OriginPo.COLUMNS.INUSR.name()))); 
			def$OriginPo.setCscn(BigDecimalUtils.formObj(dataObject.getValue(Def$OriginPo.COLUMNS.CSCN.name()))); 
			def$OriginPo.setEnqTid(dataObject.getString(Def$OriginPo.COLUMNS.ENQ_TID.name())); 
			def$OriginPo.setRecoSeqNo(BigDecimalUtils.formObj(dataObject.getValue(Def$OriginPo.COLUMNS.RECO_SEQ_NO.name()))); 
			def$OriginPo.setCatchup(); 
			return def$OriginPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Def$OriginPo def$OriginPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Def$OriginPo.COLUMNS.ORIGIN_DB.name(), def$OriginPo.getOriginDb()); 
			dataObject.setValue(Def$OriginPo.COLUMNS.ORIGIN_DBLINK.name(), def$OriginPo.getOriginDblink()); 
			dataObject.setValue(Def$OriginPo.COLUMNS.INUSR.name(), def$OriginPo.getInusr()); 
			dataObject.setValue(Def$OriginPo.COLUMNS.CSCN.name(), def$OriginPo.getCscn()); 
			dataObject.setValue(Def$OriginPo.COLUMNS.ENQ_TID.name(), def$OriginPo.getEnqTid()); 
			dataObject.setValue(Def$OriginPo.COLUMNS.RECO_SEQ_NO.name(), def$OriginPo.getRecoSeqNo()); 
			dataObject.setValue(Def$OriginPo.COLUMNS.CATCHUP.name(), def$OriginPo.getCatchup()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Def$OriginPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Def$OriginPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
