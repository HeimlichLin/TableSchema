package com.doc.common.dao.impl; 
 
public class OpgroupDAOImpl extends GeneralDAOImpl<OpgroupPo> implements OpgroupDAO { 
	public static final OpgroupDAOImpl INSTANCE = new OpgroupDAOImpl(); 
	public static final String TABLENAME = "OPGROUP"; 

	public OpgroupDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<OpgroupPo> CONVERTER = new MapConverter<OpgroupPo>() { 
 
		@Override 
		public OpgroupPo convert(final DataObject dataObject) { 
			final OpgroupPo opgroupPo = new OpgroupPo(); 
			opgroupPo.setOpgroupid(dataObject.getString(OpgroupPo.COLUMNS.OPGROUPID.name())); 
			opgroupPo.setOpid(dataObject.getString(OpgroupPo.COLUMNS.OPID.name())); 
			return opgroupPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final OpgroupPo opgroupPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(OpgroupPo.COLUMNS.OPGROUPID.name(), opgroupPo.getOpgroupid()); 
			dataObject.setValue(OpgroupPo.COLUMNS.OPID.name(), opgroupPo.getOpid()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<OpgroupPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(OpgroupPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
