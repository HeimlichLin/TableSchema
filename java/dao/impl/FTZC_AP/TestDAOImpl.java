package com.doc.common.dao.impl; 
 
public class TestDAOImpl extends GeneralDAOImpl<TestPo> implements TestDAO { 
	public static final TestDAOImpl INSTANCE = new TestDAOImpl(); 
	public static final String TABLENAME = "TEST"; 

	public TestDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TestPo> CONVERTER = new MapConverter<TestPo>() { 
 
		@Override 
		public TestPo convert(final DataObject dataObject) { 
			final TestPo testPo = new TestPo(); 
			testPo.setId(dataObject.getString(TestPo.COLUMNS.ID.name())); 
			testPo.setQty(BigDecimalUtils.formObj(dataObject.getValue(TestPo.COLUMNS.QTY.name()))); 
			testPo.setOld(BigDecimalUtils.formObj(dataObject.getValue(TestPo.COLUMNS.OLD.name()))); 
			return testPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TestPo testPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TestPo.COLUMNS.ID.name(), testPo.getId()); 
			dataObject.setValue(TestPo.COLUMNS.QTY.name(), testPo.getQty()); 
			dataObject.setValue(TestPo.COLUMNS.OLD.name(), testPo.getOld()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TestPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TestPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
