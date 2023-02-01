package com.doc.common.dao.impl; 
 
public class SqlplusProductProfileDAOImpl extends GeneralDAOImpl<SqlplusProductProfilePo> implements ISqlplusProductProfileDAO { 
	public static final SqlplusProductProfileDAOImpl INSTANCE = new SqlplusProductProfileDAOImpl(); 
	public static final String TABLENAME = "SQLPLUS_PRODUCT_PROFILE"; 

	public SqlplusProductProfileDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<SqlplusProductProfilePo> CONVERTER = new MapConverter<SqlplusProductProfilePo>() { 
 
		@Override 
		public SqlplusProductProfilePo convert(final DataObject dataObject) { 
			final SqlplusProductProfilePo sqlplusProductProfilePo = new SqlplusProductProfilePo(); 
			sqlplusProductProfilePo.setProduct(dataObject.getString(SqlplusProductProfilePo.COLUMNS.PRODUCT.name())); 
			sqlplusProductProfilePo.setUserid(dataObject.getString(SqlplusProductProfilePo.COLUMNS.USERID.name())); 
			sqlplusProductProfilePo.setAttribute(dataObject.getString(SqlplusProductProfilePo.COLUMNS.ATTRIBUTE.name())); 
			sqlplusProductProfilePo.setScope(dataObject.getString(SqlplusProductProfilePo.COLUMNS.SCOPE.name())); 
			sqlplusProductProfilePo.setNumericValue(BigDecimalUtils.formObj(dataObject.getValue(SqlplusProductProfilePo.COLUMNS.NUMERIC_VALUE.name()))); 
			sqlplusProductProfilePo.setCharValue(dataObject.getString(SqlplusProductProfilePo.COLUMNS.CHAR_VALUE.name())); 
			sqlplusProductProfilePo.setDateValue(TimestampUtils.of(dataObject.getValue(SqlplusProductProfilePo.COLUMNS.DATE_VALUE.name()))); 
			sqlplusProductProfilePo.setLongValue(); 
			return sqlplusProductProfilePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final SqlplusProductProfilePo sqlplusProductProfilePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(SqlplusProductProfilePo.COLUMNS.PRODUCT.name(), sqlplusProductProfilePo.getProduct()); 
			dataObject.setValue(SqlplusProductProfilePo.COLUMNS.USERID.name(), sqlplusProductProfilePo.getUserid()); 
			dataObject.setValue(SqlplusProductProfilePo.COLUMNS.ATTRIBUTE.name(), sqlplusProductProfilePo.getAttribute()); 
			dataObject.setValue(SqlplusProductProfilePo.COLUMNS.SCOPE.name(), sqlplusProductProfilePo.getScope()); 
			dataObject.setValue(SqlplusProductProfilePo.COLUMNS.NUMERIC_VALUE.name(), sqlplusProductProfilePo.getNumericValue()); 
			dataObject.setValue(SqlplusProductProfilePo.COLUMNS.CHAR_VALUE.name(), sqlplusProductProfilePo.getCharValue()); 
			dataObject.setValue(SqlplusProductProfilePo.COLUMNS.DATE_VALUE.name(), sqlplusProductProfilePo.getDateValue()); 
			dataObject.setValue(SqlplusProductProfilePo.COLUMNS.LONG_VALUE.name(), sqlplusProductProfilePo.getLongValue()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<SqlplusProductProfilePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(SqlplusProductProfilePo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
