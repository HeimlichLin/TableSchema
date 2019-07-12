package com.doc.common.dao.impl; 
 
public class TestorderDAO extends GeneralDAOImpl<TestorderDo> implements TestorderDAO { 
	public static final TestorderDAOImpl INSTANCE = new TestorderDAOImpl(); 
	public static final String TABLENAME = "TESTORDER"; 

	public TestorderDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<TestorderDo> CONVERTER = new MapConverter<TestorderDo>() { 
 
		@Override 
		public TestorderDo convert(final DataObject dataObject) { 
			final TestorderDo testorderDo = new TestorderDo(); 
			testorderDo.setBondno(dataObject.getString(TestorderDo.COLUMNS.BONDNO.name())); 
			testorderDo.setTestno(dataObject.getString(TestorderDo.COLUMNS.TESTNO.name())); 
			testorderDo.setCtmcode(dataObject.getString(TestorderDo.COLUMNS.CTMCODE.name())); 
			testorderDo.setSubcode(dataObject.getString(TestorderDo.COLUMNS.SUBCODE.name())); 
			testorderDo.setReqrdate(dataObject.getString(TestorderDo.COLUMNS.REQRDATE.name())); 
			testorderDo.setApplydate(dataObject.getString(TestorderDo.COLUMNS.APPLYDATE.name())); 
			testorderDo.setApprvno(dataObject.getString(TestorderDo.COLUMNS.APPRVNO.name())); 
			testorderDo.setApproveddate(dataObject.getString(TestorderDo.COLUMNS.APPROVEDDATE.name())); 
			testorderDo.setDestplace(dataObject.getString(TestorderDo.COLUMNS.DESTPLACE.name())); 
			testorderDo.setTesttype(dataObject.getString(TestorderDo.COLUMNS.TESTTYPE.name())); 
			testorderDo.setConfirmdate(dataObject.getString(TestorderDo.COLUMNS.CONFIRMDATE.name())); 
			return testorderDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TestorderDo testorderDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TestorderDo.COLUMNS.BONDNO.name(), testorderDo.getBondno()); 
			dataObject.setValue(TestorderDo.COLUMNS.TESTNO.name(), testorderDo.getTestno()); 
			dataObject.setValue(TestorderDo.COLUMNS.CTMCODE.name(), testorderDo.getCtmcode()); 
			dataObject.setValue(TestorderDo.COLUMNS.SUBCODE.name(), testorderDo.getSubcode()); 
			dataObject.setValue(TestorderDo.COLUMNS.REQRDATE.name(), testorderDo.getReqrdate()); 
			dataObject.setValue(TestorderDo.COLUMNS.APPLYDATE.name(), testorderDo.getApplydate()); 
			dataObject.setValue(TestorderDo.COLUMNS.APPRVNO.name(), testorderDo.getApprvno()); 
			dataObject.setValue(TestorderDo.COLUMNS.APPROVEDDATE.name(), testorderDo.getApproveddate()); 
			dataObject.setValue(TestorderDo.COLUMNS.DESTPLACE.name(), testorderDo.getDestplace()); 
			dataObject.setValue(TestorderDo.COLUMNS.TESTTYPE.name(), testorderDo.getTesttype()); 
			dataObject.setValue(TestorderDo.COLUMNS.CONFIRMDATE.name(), testorderDo.getConfirmdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TestorderDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TestorderDo po) { 
		sqlWhere.add(TestorderDo.COLUMNS.CTMCODE.name(), po.getCtmcode()); 
		sqlWhere.add(TestorderDo.COLUMNS.SUBCODE.name(), po.getSubcode()); 
		sqlWhere.add(TestorderDo.COLUMNS.REQRDATE.name(), po.getReqrdate()); 
		sqlWhere.add(TestorderDo.COLUMNS.APPLYDATE.name(), po.getApplydate()); 
		sqlWhere.add(TestorderDo.COLUMNS.APPRVNO.name(), po.getApprvno()); 
		sqlWhere.add(TestorderDo.COLUMNS.APPROVEDDATE.name(), po.getApproveddate()); 
		sqlWhere.add(TestorderDo.COLUMNS.DESTPLACE.name(), po.getDestplace()); 
		sqlWhere.add(TestorderDo.COLUMNS.TESTTYPE.name(), po.getTesttype()); 
		sqlWhere.add(TestorderDo.COLUMNS.CONFIRMDATE.name(), po.getConfirmdate()); 
	} 
 
} 
