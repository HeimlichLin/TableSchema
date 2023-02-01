package com.doc.common.dao.impl; 
 
public class DhlImmawblistDAOImpl extends GeneralDAOImpl<DhlImmawblistPo> implements DhlImmawblistDAO { 
	public static final DhlImmawblistDAOImpl INSTANCE = new DhlImmawblistDAOImpl(); 
	public static final String TABLENAME = "DHL_IMMAWBLIST"; 

	public DhlImmawblistDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DhlImmawblistPo> CONVERTER = new MapConverter<DhlImmawblistPo>() { 
 
		@Override 
		public DhlImmawblistPo convert(final DataObject dataObject) { 
			final DhlImmawblistPo dhlImmawblistPo = new DhlImmawblistPo(); 
			dhlImmawblistPo.setFlightno(dataObject.getString(DhlImmawblistPo.COLUMNS.FLIGHTNO.name())); 
			dhlImmawblistPo.setMawb(dataObject.getString(DhlImmawblistPo.COLUMNS.MAWB.name())); 
			return dhlImmawblistPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DhlImmawblistPo dhlImmawblistPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DhlImmawblistPo.COLUMNS.FLIGHTNO.name(), dhlImmawblistPo.getFlightno()); 
			dataObject.setValue(DhlImmawblistPo.COLUMNS.MAWB.name(), dhlImmawblistPo.getMawb()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DhlImmawblistPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DhlImmawblistPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
