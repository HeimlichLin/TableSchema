package com.doc.common.dao.impl; 
 
public class TestitemDAO extends GeneralDAOImpl<TestitemDo> implements TestitemDAO { 
	public static final TestitemDAOImpl INSTANCE = new TestitemDAOImpl(); 
	public static final String TABLENAME = "TESTITEM"; 

	public TestitemDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<TestitemDo> CONVERTER = new MapConverter<TestitemDo>() { 
 
		@Override 
		public TestitemDo convert(final DataObject dataObject) { 
			final TestitemDo testitemDo = new TestitemDo(); 
			testitemDo.setBondno(dataObject.getString(TestitemDo.COLUMNS.BONDNO.name())); 
			testitemDo.setTestno(dataObject.getString(TestitemDo.COLUMNS.TESTNO.name())); 
			testitemDo.setPrdtno(dataObject.getString(TestitemDo.COLUMNS.PRDTNO.name())); 
			testitemDo.setPrdtqty(BigDecimalUtils.formObj(dataObject.getString(TestitemDo.COLUMNS.PRDTQTY.name()))); 
			testitemDo.setPrdtunit(dataObject.getString(TestitemDo.COLUMNS.PRDTUNIT.name())); 
			testitemDo.setRstrqty(BigDecimalUtils.formObj(dataObject.getString(TestitemDo.COLUMNS.RSTRQTY.name()))); 
			testitemDo.setUnitprice(BigDecimalUtils.formObj(dataObject.getString(TestitemDo.COLUMNS.UNITPRICE.name()))); 
			testitemDo.setUninqty(BigDecimalUtils.formObj(dataObject.getString(TestitemDo.COLUMNS.UNINQTY.name()))); 
			testitemDo.setItem(BigDecimalUtils.formObj(dataObject.getString(TestitemDo.COLUMNS.ITEM.name()))); 
			testitemDo.setDeclno(dataObject.getString(TestitemDo.COLUMNS.DECLNO.name())); 
			testitemDo.setItemno(BigDecimalUtils.formObj(dataObject.getString(TestitemDo.COLUMNS.ITEMNO.name()))); 
			testitemDo.setOrefbillno(dataObject.getString(TestitemDo.COLUMNS.OREFBILLNO.name())); 
			testitemDo.setOitem(BigDecimalUtils.formObj(dataObject.getString(TestitemDo.COLUMNS.OITEM.name()))); 
			testitemDo.setInpost(dataObject.getString(TestitemDo.COLUMNS.INPOST.name())); 
			testitemDo.setDescrip(dataObject.getString(TestitemDo.COLUMNS.DESCRIP.name())); 
			testitemDo.setMoitemno(BigDecimalUtils.formObj(dataObject.getString(TestitemDo.COLUMNS.MOITEMNO.name()))); 
			return testitemDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TestitemDo testitemDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TestitemDo.COLUMNS.BONDNO.name(), testitemDo.getBondno()); 
			dataObject.setValue(TestitemDo.COLUMNS.TESTNO.name(), testitemDo.getTestno()); 
			dataObject.setValue(TestitemDo.COLUMNS.PRDTNO.name(), testitemDo.getPrdtno()); 
			dataObject.setValue(TestitemDo.COLUMNS.PRDTQTY.name(), testitemDo.getPrdtqty()); 
			dataObject.setValue(TestitemDo.COLUMNS.PRDTUNIT.name(), testitemDo.getPrdtunit()); 
			dataObject.setValue(TestitemDo.COLUMNS.RSTRQTY.name(), testitemDo.getRstrqty()); 
			dataObject.setValue(TestitemDo.COLUMNS.UNITPRICE.name(), testitemDo.getUnitprice()); 
			dataObject.setValue(TestitemDo.COLUMNS.UNINQTY.name(), testitemDo.getUninqty()); 
			dataObject.setValue(TestitemDo.COLUMNS.ITEM.name(), testitemDo.getItem()); 
			dataObject.setValue(TestitemDo.COLUMNS.DECLNO.name(), testitemDo.getDeclno()); 
			dataObject.setValue(TestitemDo.COLUMNS.ITEMNO.name(), testitemDo.getItemno()); 
			dataObject.setValue(TestitemDo.COLUMNS.OREFBILLNO.name(), testitemDo.getOrefbillno()); 
			dataObject.setValue(TestitemDo.COLUMNS.OITEM.name(), testitemDo.getOitem()); 
			dataObject.setValue(TestitemDo.COLUMNS.INPOST.name(), testitemDo.getInpost()); 
			dataObject.setValue(TestitemDo.COLUMNS.DESCRIP.name(), testitemDo.getDescrip()); 
			dataObject.setValue(TestitemDo.COLUMNS.MOITEMNO.name(), testitemDo.getMoitemno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TestitemDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TestitemDo po) { 
		sqlWhere.add(TestitemDo.COLUMNS.PRDTNO.name(), po.getPrdtno()); 
		sqlWhere.add(TestitemDo.COLUMNS.PRDTQTY.name(), po.getPrdtqty()); 
		sqlWhere.add(TestitemDo.COLUMNS.PRDTUNIT.name(), po.getPrdtunit()); 
		sqlWhere.add(TestitemDo.COLUMNS.RSTRQTY.name(), po.getRstrqty()); 
		sqlWhere.add(TestitemDo.COLUMNS.UNITPRICE.name(), po.getUnitprice()); 
		sqlWhere.add(TestitemDo.COLUMNS.UNINQTY.name(), po.getUninqty()); 
		sqlWhere.add(TestitemDo.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(TestitemDo.COLUMNS.ITEMNO.name(), po.getItemno()); 
		sqlWhere.add(TestitemDo.COLUMNS.OREFBILLNO.name(), po.getOrefbillno()); 
		sqlWhere.add(TestitemDo.COLUMNS.OITEM.name(), po.getOitem()); 
		sqlWhere.add(TestitemDo.COLUMNS.INPOST.name(), po.getInpost()); 
		sqlWhere.add(TestitemDo.COLUMNS.DESCRIP.name(), po.getDescrip()); 
		sqlWhere.add(TestitemDo.COLUMNS.MOITEMNO.name(), po.getMoitemno()); 
	} 
 
} 
