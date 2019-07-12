package com.doc.common.dao.impl; 
 
public class TestitembackDAO extends GeneralDAOImpl<TestitembackDo> implements TestitembackDAO { 
	public static final TestitembackDAOImpl INSTANCE = new TestitembackDAOImpl(); 
	public static final String TABLENAME = "TESTITEMBACK"; 

	public TestitembackDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<TestitembackDo> CONVERTER = new MapConverter<TestitembackDo>() { 
 
		@Override 
		public TestitembackDo convert(final DataObject dataObject) { 
			final TestitembackDo testitembackDo = new TestitembackDo(); 
			testitembackDo.setBondno(dataObject.getString(TestitembackDo.COLUMNS.BONDNO.name())); 
			testitembackDo.setTestno(dataObject.getString(TestitembackDo.COLUMNS.TESTNO.name())); 
			testitembackDo.setPrdtno(dataObject.getString(TestitembackDo.COLUMNS.PRDTNO.name())); 
			testitembackDo.setSerialno(dataObject.getString(TestitembackDo.COLUMNS.SERIALNO.name())); 
			testitembackDo.setBackqty(BigDecimalUtils.formObj(dataObject.getString(TestitembackDo.COLUMNS.BACKQTY.name()))); 
			testitembackDo.setBackdate(dataObject.getString(TestitembackDo.COLUMNS.BACKDATE.name())); 
			testitembackDo.setItem(BigDecimalUtils.formObj(dataObject.getString(TestitembackDo.COLUMNS.ITEM.name()))); 
			testitembackDo.setBackpost(dataObject.getString(TestitembackDo.COLUMNS.BACKPOST.name())); 
			return testitembackDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TestitembackDo testitembackDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TestitembackDo.COLUMNS.BONDNO.name(), testitembackDo.getBondno()); 
			dataObject.setValue(TestitembackDo.COLUMNS.TESTNO.name(), testitembackDo.getTestno()); 
			dataObject.setValue(TestitembackDo.COLUMNS.PRDTNO.name(), testitembackDo.getPrdtno()); 
			dataObject.setValue(TestitembackDo.COLUMNS.SERIALNO.name(), testitembackDo.getSerialno()); 
			dataObject.setValue(TestitembackDo.COLUMNS.BACKQTY.name(), testitembackDo.getBackqty()); 
			dataObject.setValue(TestitembackDo.COLUMNS.BACKDATE.name(), testitembackDo.getBackdate()); 
			dataObject.setValue(TestitembackDo.COLUMNS.ITEM.name(), testitembackDo.getItem()); 
			dataObject.setValue(TestitembackDo.COLUMNS.BACKPOST.name(), testitembackDo.getBackpost()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TestitembackDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TestitembackDo po) { 
		sqlWhere.add(TestitembackDo.COLUMNS.BACKQTY.name(), po.getBackqty()); 
		sqlWhere.add(TestitembackDo.COLUMNS.BACKDATE.name(), po.getBackdate()); 
		sqlWhere.add(TestitembackDo.COLUMNS.BACKPOST.name(), po.getBackpost()); 
	} 
 
} 
