package com.doc.common.dao.impl; 
 
public class TestCompanyDataDAOImpl extends GeneralDAOImpl<TestCompanyDataPo> implements TestCompanyDataDAO { 
	public static final TestCompanyDataDAOImpl INSTANCE = new TestCompanyDataDAOImpl(); 
	public static final String TABLENAME = "TEST_COMPANY_DATA"; 

	public TestCompanyDataDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TestCompanyDataPo> CONVERTER = new MapConverter<TestCompanyDataPo>() { 
 
		@Override 
		public TestCompanyDataPo convert(final DataObject dataObject) { 
			final TestCompanyDataPo testCompanyDataPo = new TestCompanyDataPo(); 
			testCompanyDataPo.setBan(); 
			testCompanyDataPo.setName(); 
			testCompanyDataPo.setUpdtime(); 
			return testCompanyDataPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TestCompanyDataPo testCompanyDataPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TestCompanyDataPo.COLUMNS.BAN.name(), testCompanyDataPo.getBan()); 
			dataObject.setValue(TestCompanyDataPo.COLUMNS.NAME.name(), testCompanyDataPo.getName()); 
			dataObject.setValue(TestCompanyDataPo.COLUMNS.UPDTIME.name(), testCompanyDataPo.getUpdtime()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TestCompanyDataPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TestCompanyDataPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(TestCompanyDataPo.COLUMNS.BAN.name(), po.getBan()); 
		return sqlWhere; 
	} 
 
} 
