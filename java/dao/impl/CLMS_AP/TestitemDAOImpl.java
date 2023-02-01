package com.doc.common.dao.impl; 
 
public class TestitemDAOImpl extends GeneralDAOImpl<TestitemPo> implements TestitemDAO { 
	public static final TestitemDAOImpl INSTANCE = new TestitemDAOImpl(); 
	public static final String TABLENAME = "TESTITEM"; 

	public TestitemDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TestitemPo> CONVERTER = new MapConverter<TestitemPo>() { 
 
		@Override 
		public TestitemPo convert(final DataObject dataObject) { 
			final TestitemPo testitemPo = new TestitemPo(); 
			testitemPo.setBondno(dataObject.getString(TestitemPo.COLUMNS.BONDNO.name())); 
			testitemPo.setTestno(dataObject.getString(TestitemPo.COLUMNS.TESTNO.name())); 
			testitemPo.setPrdtno(dataObject.getString(TestitemPo.COLUMNS.PRDTNO.name())); 
			testitemPo.setPrdtqty(BigDecimalUtils.formObj(dataObject.getValue(TestitemPo.COLUMNS.PRDTQTY.name()))); 
			testitemPo.setPrdtunit(dataObject.getString(TestitemPo.COLUMNS.PRDTUNIT.name())); 
			testitemPo.setRstrqty(BigDecimalUtils.formObj(dataObject.getValue(TestitemPo.COLUMNS.RSTRQTY.name()))); 
			testitemPo.setUnitprice(BigDecimalUtils.formObj(dataObject.getValue(TestitemPo.COLUMNS.UNITPRICE.name()))); 
			testitemPo.setUninqty(BigDecimalUtils.formObj(dataObject.getValue(TestitemPo.COLUMNS.UNINQTY.name()))); 
			testitemPo.setItem(BigDecimalUtils.formObj(dataObject.getValue(TestitemPo.COLUMNS.ITEM.name()))); 
			testitemPo.setDeclno(dataObject.getString(TestitemPo.COLUMNS.DECLNO.name())); 
			testitemPo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(TestitemPo.COLUMNS.ITEMNO.name()))); 
			testitemPo.setOrefbillno(dataObject.getString(TestitemPo.COLUMNS.OREFBILLNO.name())); 
			testitemPo.setOitem(BigDecimalUtils.formObj(dataObject.getValue(TestitemPo.COLUMNS.OITEM.name()))); 
			testitemPo.setInpost(dataObject.getString(TestitemPo.COLUMNS.INPOST.name())); 
			testitemPo.setDescrip(dataObject.getString(TestitemPo.COLUMNS.DESCRIP.name())); 
			testitemPo.setMoitemno(BigDecimalUtils.formObj(dataObject.getValue(TestitemPo.COLUMNS.MOITEMNO.name()))); 
			return testitemPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TestitemPo testitemPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TestitemPo.COLUMNS.BONDNO.name(), testitemPo.getBondno()); 
			dataObject.setValue(TestitemPo.COLUMNS.TESTNO.name(), testitemPo.getTestno()); 
			dataObject.setValue(TestitemPo.COLUMNS.PRDTNO.name(), testitemPo.getPrdtno()); 
			dataObject.setValue(TestitemPo.COLUMNS.PRDTQTY.name(), testitemPo.getPrdtqty()); 
			dataObject.setValue(TestitemPo.COLUMNS.PRDTUNIT.name(), testitemPo.getPrdtunit()); 
			dataObject.setValue(TestitemPo.COLUMNS.RSTRQTY.name(), testitemPo.getRstrqty()); 
			dataObject.setValue(TestitemPo.COLUMNS.UNITPRICE.name(), testitemPo.getUnitprice()); 
			dataObject.setValue(TestitemPo.COLUMNS.UNINQTY.name(), testitemPo.getUninqty()); 
			dataObject.setValue(TestitemPo.COLUMNS.ITEM.name(), testitemPo.getItem()); 
			dataObject.setValue(TestitemPo.COLUMNS.DECLNO.name(), testitemPo.getDeclno()); 
			dataObject.setValue(TestitemPo.COLUMNS.ITEMNO.name(), testitemPo.getItemno()); 
			dataObject.setValue(TestitemPo.COLUMNS.OREFBILLNO.name(), testitemPo.getOrefbillno()); 
			dataObject.setValue(TestitemPo.COLUMNS.OITEM.name(), testitemPo.getOitem()); 
			dataObject.setValue(TestitemPo.COLUMNS.INPOST.name(), testitemPo.getInpost()); 
			dataObject.setValue(TestitemPo.COLUMNS.DESCRIP.name(), testitemPo.getDescrip()); 
			dataObject.setValue(TestitemPo.COLUMNS.MOITEMNO.name(), testitemPo.getMoitemno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TestitemPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TestitemPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(TestitemPo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(TestitemPo.COLUMNS.TESTNO.name(), po.getTestno()); 
		sqlWhere.add(TestitemPo.COLUMNS.ITEM.name(), po.getItem()); 
		return sqlWhere; 
	} 
 
} 
