package com.doc.common.dao.impl; 
 
public class UldreportqueryDAOImpl extends GeneralDAOImpl<UldreportqueryPo> implements UldreportqueryDAO { 
	public static final UldreportqueryDAOImpl INSTANCE = new UldreportqueryDAOImpl(); 
	public static final String TABLENAME = "ULDREPORTQUERY"; 

	public UldreportqueryDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<UldreportqueryPo> CONVERTER = new MapConverter<UldreportqueryPo>() { 
 
		@Override 
		public UldreportqueryPo convert(final DataObject dataObject) { 
			final UldreportqueryPo uldreportqueryPo = new UldreportqueryPo(); 
			uldreportqueryPo.setQuerytime(dataObject.getString(UldreportqueryPo.COLUMNS.QUERYTIME.name())); 
			uldreportqueryPo.setContainer(dataObject.getString(UldreportqueryPo.COLUMNS.CONTAINER.name())); 
			return uldreportqueryPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final UldreportqueryPo uldreportqueryPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(UldreportqueryPo.COLUMNS.QUERYTIME.name(), uldreportqueryPo.getQuerytime()); 
			dataObject.setValue(UldreportqueryPo.COLUMNS.CONTAINER.name(), uldreportqueryPo.getContainer()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<UldreportqueryPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(UldreportqueryPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
