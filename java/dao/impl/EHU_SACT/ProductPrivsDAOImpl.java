package com.doc.common.dao.impl; 
 
public class ProductPrivsDAOImpl extends GeneralDAOImpl<ProductPrivsPo> implements IProductPrivsDAO { 
	public static final ProductPrivsDAOImpl INSTANCE = new ProductPrivsDAOImpl(); 
	public static final String TABLENAME = "PRODUCT_PRIVS"; 

	public ProductPrivsDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ProductPrivsPo> CONVERTER = new MapConverter<ProductPrivsPo>() { 
 
		@Override 
		public ProductPrivsPo convert(final DataObject dataObject) { 
			final ProductPrivsPo productPrivsPo = new ProductPrivsPo(); 
			return productPrivsPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ProductPrivsPo productPrivsPo) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ProductPrivsPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ProductPrivsPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
