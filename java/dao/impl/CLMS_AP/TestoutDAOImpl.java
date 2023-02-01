package com.doc.common.dao.impl; 
 
public class TestoutDAOImpl extends GeneralDAOImpl<TestoutPo> implements TestoutDAO { 
	public static final TestoutDAOImpl INSTANCE = new TestoutDAOImpl(); 
	public static final String TABLENAME = "TESTOUT"; 

	public TestoutDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TestoutPo> CONVERTER = new MapConverter<TestoutPo>() { 
 
		@Override 
		public TestoutPo convert(final DataObject dataObject) { 
			final TestoutPo testoutPo = new TestoutPo(); 
			testoutPo.setBondno(dataObject.getString(TestoutPo.COLUMNS.BONDNO.name())); 
			testoutPo.setTestno(dataObject.getString(TestoutPo.COLUMNS.TESTNO.name())); 
			testoutPo.setItem(BigDecimalUtils.formObj(dataObject.getValue(TestoutPo.COLUMNS.ITEM.name()))); 
			testoutPo.setPrdtno(dataObject.getString(TestoutPo.COLUMNS.PRDTNO.name())); 
			testoutPo.setPrdtqty(BigDecimalUtils.formObj(dataObject.getValue(TestoutPo.COLUMNS.PRDTQTY.name()))); 
			testoutPo.setPrdtunit(dataObject.getString(TestoutPo.COLUMNS.PRDTUNIT.name())); 
			testoutPo.setDeclno(dataObject.getString(TestoutPo.COLUMNS.DECLNO.name())); 
			testoutPo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(TestoutPo.COLUMNS.ITEMNO.name()))); 
			testoutPo.setOrefbillno(dataObject.getString(TestoutPo.COLUMNS.OREFBILLNO.name())); 
			testoutPo.setOitem(BigDecimalUtils.formObj(dataObject.getValue(TestoutPo.COLUMNS.OITEM.name()))); 
			testoutPo.setInpost(dataObject.getString(TestoutPo.COLUMNS.INPOST.name())); 
			testoutPo.setD7declno(dataObject.getString(TestoutPo.COLUMNS.D7DECLNO.name())); 
			testoutPo.setD7itemno(BigDecimalUtils.formObj(dataObject.getValue(TestoutPo.COLUMNS.D7ITEMNO.name()))); 
			testoutPo.setD7qty(BigDecimalUtils.formObj(dataObject.getValue(TestoutPo.COLUMNS.D7QTY.name()))); 
			testoutPo.setD7decltype(dataObject.getString(TestoutPo.COLUMNS.D7DECLTYPE.name())); 
			testoutPo.setUpdtime(dataObject.getString(TestoutPo.COLUMNS.UPDTIME.name())); 
			testoutPo.setOutdate(dataObject.getString(TestoutPo.COLUMNS.OUTDATE.name())); 
			return testoutPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TestoutPo testoutPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TestoutPo.COLUMNS.BONDNO.name(), testoutPo.getBondno()); 
			dataObject.setValue(TestoutPo.COLUMNS.TESTNO.name(), testoutPo.getTestno()); 
			dataObject.setValue(TestoutPo.COLUMNS.ITEM.name(), testoutPo.getItem()); 
			dataObject.setValue(TestoutPo.COLUMNS.PRDTNO.name(), testoutPo.getPrdtno()); 
			dataObject.setValue(TestoutPo.COLUMNS.PRDTQTY.name(), testoutPo.getPrdtqty()); 
			dataObject.setValue(TestoutPo.COLUMNS.PRDTUNIT.name(), testoutPo.getPrdtunit()); 
			dataObject.setValue(TestoutPo.COLUMNS.DECLNO.name(), testoutPo.getDeclno()); 
			dataObject.setValue(TestoutPo.COLUMNS.ITEMNO.name(), testoutPo.getItemno()); 
			dataObject.setValue(TestoutPo.COLUMNS.OREFBILLNO.name(), testoutPo.getOrefbillno()); 
			dataObject.setValue(TestoutPo.COLUMNS.OITEM.name(), testoutPo.getOitem()); 
			dataObject.setValue(TestoutPo.COLUMNS.INPOST.name(), testoutPo.getInpost()); 
			dataObject.setValue(TestoutPo.COLUMNS.D7DECLNO.name(), testoutPo.getD7declno()); 
			dataObject.setValue(TestoutPo.COLUMNS.D7ITEMNO.name(), testoutPo.getD7itemno()); 
			dataObject.setValue(TestoutPo.COLUMNS.D7QTY.name(), testoutPo.getD7qty()); 
			dataObject.setValue(TestoutPo.COLUMNS.D7DECLTYPE.name(), testoutPo.getD7decltype()); 
			dataObject.setValue(TestoutPo.COLUMNS.UPDTIME.name(), testoutPo.getUpdtime()); 
			dataObject.setValue(TestoutPo.COLUMNS.OUTDATE.name(), testoutPo.getOutdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TestoutPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TestoutPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(TestoutPo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(TestoutPo.COLUMNS.TESTNO.name(), po.getTestno()); 
		sqlWhere.add(TestoutPo.COLUMNS.ITEM.name(), po.getItem()); 
		sqlWhere.add(TestoutPo.COLUMNS.D7DECLNO.name(), po.getD7declno()); 
		sqlWhere.add(TestoutPo.COLUMNS.D7ITEMNO.name(), po.getD7itemno()); 
		return sqlWhere; 
	} 
 
} 
