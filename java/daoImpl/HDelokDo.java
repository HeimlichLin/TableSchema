package com.doc.common.dao.impl; 
 
public class HDelokDAO extends GeneralDAOImpl<HDelokDo> implements HDelokDAO { 
	public static final HDelokDAOImpl INSTANCE = new HDelokDAOImpl(); 
	public static final String TABLENAME = "H_DELOK"; 

	public HDelokDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<HDelokDo> CONVERTER = new MapConverter<HDelokDo>() { 
 
		@Override 
		public HDelokDo convert(final DataObject dataObject) { 
			final HDelokDo hDelokDo = new HDelokDo(); 
			hDelokDo.setLogtable(dataObject.getString(HDelokDo.COLUMNS.LOGTABLE.name())); 
			hDelokDo.setDelcnt(BigDecimalUtils.formObj(dataObject.getString(HDelokDo.COLUMNS.DELCNT.name()))); 
			hDelokDo.setOkflg(dataObject.getString(HDelokDo.COLUMNS.OKFLG.name())); 
			hDelokDo.setLogtime(dataObject.getString(HDelokDo.COLUMNS.LOGTIME.name())); 
			return hDelokDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final HDelokDo hDelokDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(HDelokDo.COLUMNS.LOGTABLE.name(), hDelokDo.getLogtable()); 
			dataObject.setValue(HDelokDo.COLUMNS.DELCNT.name(), hDelokDo.getDelcnt()); 
			dataObject.setValue(HDelokDo.COLUMNS.OKFLG.name(), hDelokDo.getOkflg()); 
			dataObject.setValue(HDelokDo.COLUMNS.LOGTIME.name(), hDelokDo.getLogtime()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<HDelokDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(HDelokDo po) { 
		sqlWhere.add(HDelokDo.COLUMNS.LOGTABLE.name(), po.getLogtable()); 
		sqlWhere.add(HDelokDo.COLUMNS.DELCNT.name(), po.getDelcnt()); 
		sqlWhere.add(HDelokDo.COLUMNS.OKFLG.name(), po.getOkflg()); 
		sqlWhere.add(HDelokDo.COLUMNS.LOGTIME.name(), po.getLogtime()); 
	} 
 
} 
