package com.doc.common.dao.impl; 
 
public class InmonthDAOImpl extends GeneralDAOImpl<InmonthPo> implements InmonthDAO { 
	public static final InmonthDAOImpl INSTANCE = new InmonthDAOImpl(); 
	public static final String TABLENAME = "INMONTH"; 

	public InmonthDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<InmonthPo> CONVERTER = new MapConverter<InmonthPo>() { 
 
		@Override 
		public InmonthPo convert(final DataObject dataObject) { 
			final InmonthPo inmonthPo = new InmonthPo(); 
			inmonthPo.setBondno(dataObject.getString(InmonthPo.COLUMNS.BONDNO.name())); 
			inmonthPo.setMonthno(dataObject.getString(InmonthPo.COLUMNS.MONTHNO.name())); 
			inmonthPo.setItem(BigDecimalUtils.formObj(dataObject.getValue(InmonthPo.COLUMNS.ITEM.name()))); 
			inmonthPo.setPrdtno(dataObject.getString(InmonthPo.COLUMNS.PRDTNO.name())); 
			inmonthPo.setMinqty(BigDecimalUtils.formObj(dataObject.getValue(InmonthPo.COLUMNS.MINQTY.name()))); 
			inmonthPo.setInunit(dataObject.getString(InmonthPo.COLUMNS.INUNIT.name())); 
			return inmonthPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final InmonthPo inmonthPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(InmonthPo.COLUMNS.BONDNO.name(), inmonthPo.getBondno()); 
			dataObject.setValue(InmonthPo.COLUMNS.MONTHNO.name(), inmonthPo.getMonthno()); 
			dataObject.setValue(InmonthPo.COLUMNS.ITEM.name(), inmonthPo.getItem()); 
			dataObject.setValue(InmonthPo.COLUMNS.PRDTNO.name(), inmonthPo.getPrdtno()); 
			dataObject.setValue(InmonthPo.COLUMNS.MINQTY.name(), inmonthPo.getMinqty()); 
			dataObject.setValue(InmonthPo.COLUMNS.INUNIT.name(), inmonthPo.getInunit()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<InmonthPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(InmonthPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(InmonthPo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(InmonthPo.COLUMNS.MONTHNO.name(), po.getMonthno()); 
		sqlWhere.add(InmonthPo.COLUMNS.ITEM.name(), po.getItem()); 
		return sqlWhere; 
	} 
 
} 
