package com.doc.common.dao.impl; 
 
public class HDelokDAOImpl extends GeneralDAOImpl<HDelokPo> implements HDelokDAO { 
	public static final HDelokDAOImpl INSTANCE = new HDelokDAOImpl(); 
	public static final String TABLENAME = "H_DELOK"; 

	public HDelokDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<HDelokPo> CONVERTER = new MapConverter<HDelokPo>() { 
 
		@Override 
		public HDelokPo convert(final DataObject dataObject) { 
			final HDelokPo hDelokPo = new HDelokPo(); 
			hDelokPo.setLogtable(dataObject.getString(HDelokPo.COLUMNS.LOGTABLE.name())); 
			hDelokPo.setDelcnt(BigDecimalUtils.formObj(dataObject.getValue(HDelokPo.COLUMNS.DELCNT.name()))); 
			hDelokPo.setOkflg(dataObject.getString(HDelokPo.COLUMNS.OKFLG.name())); 
			hDelokPo.setLogtime(dataObject.getString(HDelokPo.COLUMNS.LOGTIME.name())); 
			return hDelokPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final HDelokPo hDelokPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(HDelokPo.COLUMNS.LOGTABLE.name(), hDelokPo.getLogtable()); 
			dataObject.setValue(HDelokPo.COLUMNS.DELCNT.name(), hDelokPo.getDelcnt()); 
			dataObject.setValue(HDelokPo.COLUMNS.OKFLG.name(), hDelokPo.getOkflg()); 
			dataObject.setValue(HDelokPo.COLUMNS.LOGTIME.name(), hDelokPo.getLogtime()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<HDelokPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(HDelokPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
