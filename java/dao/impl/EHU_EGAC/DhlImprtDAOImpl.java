package com.doc.common.dao.impl; 
 
public class DhlImprtDAOImpl extends GeneralDAOImpl<DhlImprtPo> implements DhlImprtDAO { 
	public static final DhlImprtDAOImpl INSTANCE = new DhlImprtDAOImpl(); 
	public static final String TABLENAME = "DHL_IMPRT"; 

	public DhlImprtDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DhlImprtPo> CONVERTER = new MapConverter<DhlImprtPo>() { 
 
		@Override 
		public DhlImprtPo convert(final DataObject dataObject) { 
			final DhlImprtPo dhlImprtPo = new DhlImprtPo(); 
			dhlImprtPo.setTaxno(dataObject.getString(DhlImprtPo.COLUMNS.TAXNO.name())); 
			dhlImprtPo.setPrttime(dataObject.getString(DhlImprtPo.COLUMNS.PRTTIME.name())); 
			dhlImprtPo.setServer(dataObject.getString(DhlImprtPo.COLUMNS.SERVER.name())); 
			dhlImprtPo.setPrtno(dataObject.getString(DhlImprtPo.COLUMNS.PRTNO.name())); 
			return dhlImprtPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DhlImprtPo dhlImprtPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DhlImprtPo.COLUMNS.TAXNO.name(), dhlImprtPo.getTaxno()); 
			dataObject.setValue(DhlImprtPo.COLUMNS.PRTTIME.name(), dhlImprtPo.getPrttime()); 
			dataObject.setValue(DhlImprtPo.COLUMNS.SERVER.name(), dhlImprtPo.getServer()); 
			dataObject.setValue(DhlImprtPo.COLUMNS.PRTNO.name(), dhlImprtPo.getPrtno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DhlImprtPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DhlImprtPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
