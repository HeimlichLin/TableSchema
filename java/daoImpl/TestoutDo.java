package com.doc.common.dao.impl; 
 
public class TestoutDAO extends GeneralDAOImpl<TestoutDo> implements TestoutDAO { 
	public static final TestoutDAOImpl INSTANCE = new TestoutDAOImpl(); 
	public static final String TABLENAME = "TESTOUT"; 

	public TestoutDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<TestoutDo> CONVERTER = new MapConverter<TestoutDo>() { 
 
		@Override 
		public TestoutDo convert(final DataObject dataObject) { 
			final TestoutDo testoutDo = new TestoutDo(); 
			testoutDo.setBondno(dataObject.getString(TestoutDo.COLUMNS.BONDNO.name())); 
			testoutDo.setTestno(dataObject.getString(TestoutDo.COLUMNS.TESTNO.name())); 
			testoutDo.setItem(BigDecimalUtils.formObj(dataObject.getString(TestoutDo.COLUMNS.ITEM.name()))); 
			testoutDo.setPrdtno(dataObject.getString(TestoutDo.COLUMNS.PRDTNO.name())); 
			testoutDo.setPrdtqty(BigDecimalUtils.formObj(dataObject.getString(TestoutDo.COLUMNS.PRDTQTY.name()))); 
			testoutDo.setPrdtunit(dataObject.getString(TestoutDo.COLUMNS.PRDTUNIT.name())); 
			testoutDo.setDeclno(dataObject.getString(TestoutDo.COLUMNS.DECLNO.name())); 
			testoutDo.setItemno(BigDecimalUtils.formObj(dataObject.getString(TestoutDo.COLUMNS.ITEMNO.name()))); 
			testoutDo.setOrefbillno(dataObject.getString(TestoutDo.COLUMNS.OREFBILLNO.name())); 
			testoutDo.setOitem(BigDecimalUtils.formObj(dataObject.getString(TestoutDo.COLUMNS.OITEM.name()))); 
			testoutDo.setInpost(dataObject.getString(TestoutDo.COLUMNS.INPOST.name())); 
			testoutDo.setD7declno(dataObject.getString(TestoutDo.COLUMNS.D7DECLNO.name())); 
			testoutDo.setD7itemno(BigDecimalUtils.formObj(dataObject.getString(TestoutDo.COLUMNS.D7ITEMNO.name()))); 
			testoutDo.setD7qty(BigDecimalUtils.formObj(dataObject.getString(TestoutDo.COLUMNS.D7QTY.name()))); 
			testoutDo.setD7decltype(dataObject.getString(TestoutDo.COLUMNS.D7DECLTYPE.name())); 
			testoutDo.setUpdtime(dataObject.getString(TestoutDo.COLUMNS.UPDTIME.name())); 
			testoutDo.setOutdate(dataObject.getString(TestoutDo.COLUMNS.OUTDATE.name())); 
			return testoutDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TestoutDo testoutDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TestoutDo.COLUMNS.BONDNO.name(), testoutDo.getBondno()); 
			dataObject.setValue(TestoutDo.COLUMNS.TESTNO.name(), testoutDo.getTestno()); 
			dataObject.setValue(TestoutDo.COLUMNS.ITEM.name(), testoutDo.getItem()); 
			dataObject.setValue(TestoutDo.COLUMNS.PRDTNO.name(), testoutDo.getPrdtno()); 
			dataObject.setValue(TestoutDo.COLUMNS.PRDTQTY.name(), testoutDo.getPrdtqty()); 
			dataObject.setValue(TestoutDo.COLUMNS.PRDTUNIT.name(), testoutDo.getPrdtunit()); 
			dataObject.setValue(TestoutDo.COLUMNS.DECLNO.name(), testoutDo.getDeclno()); 
			dataObject.setValue(TestoutDo.COLUMNS.ITEMNO.name(), testoutDo.getItemno()); 
			dataObject.setValue(TestoutDo.COLUMNS.OREFBILLNO.name(), testoutDo.getOrefbillno()); 
			dataObject.setValue(TestoutDo.COLUMNS.OITEM.name(), testoutDo.getOitem()); 
			dataObject.setValue(TestoutDo.COLUMNS.INPOST.name(), testoutDo.getInpost()); 
			dataObject.setValue(TestoutDo.COLUMNS.D7DECLNO.name(), testoutDo.getD7declno()); 
			dataObject.setValue(TestoutDo.COLUMNS.D7ITEMNO.name(), testoutDo.getD7itemno()); 
			dataObject.setValue(TestoutDo.COLUMNS.D7QTY.name(), testoutDo.getD7qty()); 
			dataObject.setValue(TestoutDo.COLUMNS.D7DECLTYPE.name(), testoutDo.getD7decltype()); 
			dataObject.setValue(TestoutDo.COLUMNS.UPDTIME.name(), testoutDo.getUpdtime()); 
			dataObject.setValue(TestoutDo.COLUMNS.OUTDATE.name(), testoutDo.getOutdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TestoutDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TestoutDo po) { 
		sqlWhere.add(TestoutDo.COLUMNS.PRDTNO.name(), po.getPrdtno()); 
		sqlWhere.add(TestoutDo.COLUMNS.PRDTQTY.name(), po.getPrdtqty()); 
		sqlWhere.add(TestoutDo.COLUMNS.PRDTUNIT.name(), po.getPrdtunit()); 
		sqlWhere.add(TestoutDo.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(TestoutDo.COLUMNS.ITEMNO.name(), po.getItemno()); 
		sqlWhere.add(TestoutDo.COLUMNS.OREFBILLNO.name(), po.getOrefbillno()); 
		sqlWhere.add(TestoutDo.COLUMNS.OITEM.name(), po.getOitem()); 
		sqlWhere.add(TestoutDo.COLUMNS.INPOST.name(), po.getInpost()); 
		sqlWhere.add(TestoutDo.COLUMNS.D7QTY.name(), po.getD7qty()); 
		sqlWhere.add(TestoutDo.COLUMNS.D7DECLTYPE.name(), po.getD7decltype()); 
		sqlWhere.add(TestoutDo.COLUMNS.UPDTIME.name(), po.getUpdtime()); 
		sqlWhere.add(TestoutDo.COLUMNS.OUTDATE.name(), po.getOutdate()); 
	} 
 
} 
