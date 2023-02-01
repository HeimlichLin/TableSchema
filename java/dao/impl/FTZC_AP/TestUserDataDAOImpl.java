package com.doc.common.dao.impl; 
 
public class TestUserDataDAOImpl extends GeneralDAOImpl<TestUserDataPo> implements TestUserDataDAO { 
	public static final TestUserDataDAOImpl INSTANCE = new TestUserDataDAOImpl(); 
	public static final String TABLENAME = "TEST_USER_DATA"; 

	public TestUserDataDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TestUserDataPo> CONVERTER = new MapConverter<TestUserDataPo>() { 
 
		@Override 
		public TestUserDataPo convert(final DataObject dataObject) { 
			final TestUserDataPo testUserDataPo = new TestUserDataPo(); 
			testUserDataPo.setId(); 
			testUserDataPo.setName(); 
			testUserDataPo.setPassword(); 
			testUserDataPo.setAge(BigDecimalUtils.formObj(dataObject.getValue(TestUserDataPo.COLUMNS.AGE.name()))); 
			testUserDataPo.setUpdtime(); 
			testUserDataPo.setBan(); 
			return testUserDataPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TestUserDataPo testUserDataPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TestUserDataPo.COLUMNS.ID.name(), testUserDataPo.getId()); 
			dataObject.setValue(TestUserDataPo.COLUMNS.NAME.name(), testUserDataPo.getName()); 
			dataObject.setValue(TestUserDataPo.COLUMNS.PASSWORD.name(), testUserDataPo.getPassword()); 
			dataObject.setValue(TestUserDataPo.COLUMNS.AGE.name(), testUserDataPo.getAge()); 
			dataObject.setValue(TestUserDataPo.COLUMNS.UPDTIME.name(), testUserDataPo.getUpdtime()); 
			dataObject.setValue(TestUserDataPo.COLUMNS.BAN.name(), testUserDataPo.getBan()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TestUserDataPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TestUserDataPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(TestUserDataPo.COLUMNS.ID.name(), po.getId()); 
		return sqlWhere; 
	} 
 
} 
