package com.doc.common.dao.impl; 
 
public class TestorderDAOImpl extends GeneralDAOImpl<TestorderPo> implements TestorderDAO { 
	public static final TestorderDAOImpl INSTANCE = new TestorderDAOImpl(); 
	public static final String TABLENAME = "TESTORDER"; 

	public TestorderDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TestorderPo> CONVERTER = new MapConverter<TestorderPo>() { 
 
		@Override 
		public TestorderPo convert(final DataObject dataObject) { 
			final TestorderPo testorderPo = new TestorderPo(); 
			testorderPo.setBondno(dataObject.getString(TestorderPo.COLUMNS.BONDNO.name())); 
			testorderPo.setTestno(dataObject.getString(TestorderPo.COLUMNS.TESTNO.name())); 
			testorderPo.setCtmcode(dataObject.getString(TestorderPo.COLUMNS.CTMCODE.name())); 
			testorderPo.setSubcode(dataObject.getString(TestorderPo.COLUMNS.SUBCODE.name())); 
			testorderPo.setReqrdate(dataObject.getString(TestorderPo.COLUMNS.REQRDATE.name())); 
			testorderPo.setApplydate(dataObject.getString(TestorderPo.COLUMNS.APPLYDATE.name())); 
			testorderPo.setApprvno(dataObject.getString(TestorderPo.COLUMNS.APPRVNO.name())); 
			testorderPo.setApproveddate(dataObject.getString(TestorderPo.COLUMNS.APPROVEDDATE.name())); 
			testorderPo.setDestplace(dataObject.getString(TestorderPo.COLUMNS.DESTPLACE.name())); 
			testorderPo.setTesttype(dataObject.getString(TestorderPo.COLUMNS.TESTTYPE.name())); 
			testorderPo.setConfirmdate(dataObject.getString(TestorderPo.COLUMNS.CONFIRMDATE.name())); 
			return testorderPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TestorderPo testorderPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TestorderPo.COLUMNS.BONDNO.name(), testorderPo.getBondno()); 
			dataObject.setValue(TestorderPo.COLUMNS.TESTNO.name(), testorderPo.getTestno()); 
			dataObject.setValue(TestorderPo.COLUMNS.CTMCODE.name(), testorderPo.getCtmcode()); 
			dataObject.setValue(TestorderPo.COLUMNS.SUBCODE.name(), testorderPo.getSubcode()); 
			dataObject.setValue(TestorderPo.COLUMNS.REQRDATE.name(), testorderPo.getReqrdate()); 
			dataObject.setValue(TestorderPo.COLUMNS.APPLYDATE.name(), testorderPo.getApplydate()); 
			dataObject.setValue(TestorderPo.COLUMNS.APPRVNO.name(), testorderPo.getApprvno()); 
			dataObject.setValue(TestorderPo.COLUMNS.APPROVEDDATE.name(), testorderPo.getApproveddate()); 
			dataObject.setValue(TestorderPo.COLUMNS.DESTPLACE.name(), testorderPo.getDestplace()); 
			dataObject.setValue(TestorderPo.COLUMNS.TESTTYPE.name(), testorderPo.getTesttype()); 
			dataObject.setValue(TestorderPo.COLUMNS.CONFIRMDATE.name(), testorderPo.getConfirmdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TestorderPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TestorderPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(TestorderPo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(TestorderPo.COLUMNS.TESTNO.name(), po.getTestno()); 
		return sqlWhere; 
	} 
 
} 
