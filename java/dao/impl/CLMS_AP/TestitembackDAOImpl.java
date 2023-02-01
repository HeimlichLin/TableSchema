package com.doc.common.dao.impl; 
 
public class TestitembackDAOImpl extends GeneralDAOImpl<TestitembackPo> implements TestitembackDAO { 
	public static final TestitembackDAOImpl INSTANCE = new TestitembackDAOImpl(); 
	public static final String TABLENAME = "TESTITEMBACK"; 

	public TestitembackDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TestitembackPo> CONVERTER = new MapConverter<TestitembackPo>() { 
 
		@Override 
		public TestitembackPo convert(final DataObject dataObject) { 
			final TestitembackPo testitembackPo = new TestitembackPo(); 
			testitembackPo.setBondno(dataObject.getString(TestitembackPo.COLUMNS.BONDNO.name())); 
			testitembackPo.setTestno(dataObject.getString(TestitembackPo.COLUMNS.TESTNO.name())); 
			testitembackPo.setPrdtno(dataObject.getString(TestitembackPo.COLUMNS.PRDTNO.name())); 
			testitembackPo.setSerialno(dataObject.getString(TestitembackPo.COLUMNS.SERIALNO.name())); 
			testitembackPo.setBackqty(BigDecimalUtils.formObj(dataObject.getValue(TestitembackPo.COLUMNS.BACKQTY.name()))); 
			testitembackPo.setBackdate(dataObject.getString(TestitembackPo.COLUMNS.BACKDATE.name())); 
			testitembackPo.setItem(BigDecimalUtils.formObj(dataObject.getValue(TestitembackPo.COLUMNS.ITEM.name()))); 
			testitembackPo.setBackpost(dataObject.getString(TestitembackPo.COLUMNS.BACKPOST.name())); 
			return testitembackPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TestitembackPo testitembackPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TestitembackPo.COLUMNS.BONDNO.name(), testitembackPo.getBondno()); 
			dataObject.setValue(TestitembackPo.COLUMNS.TESTNO.name(), testitembackPo.getTestno()); 
			dataObject.setValue(TestitembackPo.COLUMNS.PRDTNO.name(), testitembackPo.getPrdtno()); 
			dataObject.setValue(TestitembackPo.COLUMNS.SERIALNO.name(), testitembackPo.getSerialno()); 
			dataObject.setValue(TestitembackPo.COLUMNS.BACKQTY.name(), testitembackPo.getBackqty()); 
			dataObject.setValue(TestitembackPo.COLUMNS.BACKDATE.name(), testitembackPo.getBackdate()); 
			dataObject.setValue(TestitembackPo.COLUMNS.ITEM.name(), testitembackPo.getItem()); 
			dataObject.setValue(TestitembackPo.COLUMNS.BACKPOST.name(), testitembackPo.getBackpost()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TestitembackPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TestitembackPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(TestitembackPo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(TestitembackPo.COLUMNS.TESTNO.name(), po.getTestno()); 
		sqlWhere.add(TestitembackPo.COLUMNS.PRDTNO.name(), po.getPrdtno()); 
		sqlWhere.add(TestitembackPo.COLUMNS.SERIALNO.name(), po.getSerialno()); 
		sqlWhere.add(TestitembackPo.COLUMNS.ITEM.name(), po.getItem()); 
		return sqlWhere; 
	} 
 
} 
