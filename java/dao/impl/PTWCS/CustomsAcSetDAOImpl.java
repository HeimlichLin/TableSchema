package com.doc.common.dao.impl; 
 
public class CustomsAcSetDAOImpl extends GeneralDAOImpl<CustomsAcSetPo> implements CustomsAcSetDAO { 
	public static final CustomsAcSetDAOImpl INSTANCE = new CustomsAcSetDAOImpl(); 
	public static final String TABLENAME = "CUSTOMS_AC_SET"; 

	public CustomsAcSetDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<CustomsAcSetPo> CONVERTER = new MapConverter<CustomsAcSetPo>() { 
 
		@Override 
		public CustomsAcSetPo convert(final DataObject dataObject) { 
			final CustomsAcSetPo customsAcSetPo = new CustomsAcSetPo(); 
			customsAcSetPo.setCustomsId(dataObject.getString(CustomsAcSetPo.COLUMNS.CUSTOMS_ID.name())); 
			customsAcSetPo.setAcId(dataObject.getString(CustomsAcSetPo.COLUMNS.AC_ID.name())); 
			return customsAcSetPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final CustomsAcSetPo customsAcSetPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(CustomsAcSetPo.COLUMNS.CUSTOMS_ID.name(), customsAcSetPo.getCustomsId()); 
			dataObject.setValue(CustomsAcSetPo.COLUMNS.AC_ID.name(), customsAcSetPo.getAcId()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<CustomsAcSetPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(CustomsAcSetPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(CustomsAcSetPo.COLUMNS.CUSTOMS_ID.name(), po.getCustomsId()); 
		sqlWhere.add(CustomsAcSetPo.COLUMNS.AC_ID.name(), po.getAcId()); 
		return sqlWhere; 
	} 
 
} 
