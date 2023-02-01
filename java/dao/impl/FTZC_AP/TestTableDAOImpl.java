package com.doc.common.dao.impl; 
 
public class TestTableDAOImpl extends GeneralDAOImpl<TestTablePo> implements TestTableDAO { 
	public static final TestTableDAOImpl INSTANCE = new TestTableDAOImpl(); 
	public static final String TABLENAME = "TEST_TABLE"; 

	public TestTableDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TestTablePo> CONVERTER = new MapConverter<TestTablePo>() { 
 
		@Override 
		public TestTablePo convert(final DataObject dataObject) { 
			final TestTablePo testTablePo = new TestTablePo(); 
			testTablePo.setUserName(); 
			testTablePo.setComName(); 
			return testTablePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TestTablePo testTablePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TestTablePo.COLUMNS.USER_NAME.name(), testTablePo.getUserName()); 
			dataObject.setValue(TestTablePo.COLUMNS.COM_NAME.name(), testTablePo.getComName()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TestTablePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TestTablePo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
