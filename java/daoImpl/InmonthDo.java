package com.doc.common.dao.impl; 
 
public class InmonthDAO extends GeneralDAOImpl<InmonthDo> implements InmonthDAO { 
	public static final InmonthDAOImpl INSTANCE = new InmonthDAOImpl(); 
	public static final String TABLENAME = "INMONTH"; 

	public InmonthDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<InmonthDo> CONVERTER = new MapConverter<InmonthDo>() { 
 
		@Override 
		public InmonthDo convert(final DataObject dataObject) { 
			final InmonthDo inmonthDo = new InmonthDo(); 
			inmonthDo.setBondno(dataObject.getString(InmonthDo.COLUMNS.BONDNO.name())); 
			inmonthDo.setMonthno(dataObject.getString(InmonthDo.COLUMNS.MONTHNO.name())); 
			inmonthDo.setItem(BigDecimalUtils.formObj(dataObject.getString(InmonthDo.COLUMNS.ITEM.name()))); 
			inmonthDo.setPrdtno(dataObject.getString(InmonthDo.COLUMNS.PRDTNO.name())); 
			inmonthDo.setMinqty(BigDecimalUtils.formObj(dataObject.getString(InmonthDo.COLUMNS.MINQTY.name()))); 
			inmonthDo.setInunit(dataObject.getString(InmonthDo.COLUMNS.INUNIT.name())); 
			return inmonthDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final InmonthDo inmonthDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(InmonthDo.COLUMNS.BONDNO.name(), inmonthDo.getBondno()); 
			dataObject.setValue(InmonthDo.COLUMNS.MONTHNO.name(), inmonthDo.getMonthno()); 
			dataObject.setValue(InmonthDo.COLUMNS.ITEM.name(), inmonthDo.getItem()); 
			dataObject.setValue(InmonthDo.COLUMNS.PRDTNO.name(), inmonthDo.getPrdtno()); 
			dataObject.setValue(InmonthDo.COLUMNS.MINQTY.name(), inmonthDo.getMinqty()); 
			dataObject.setValue(InmonthDo.COLUMNS.INUNIT.name(), inmonthDo.getInunit()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<InmonthDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(InmonthDo po) { 
		sqlWhere.add(InmonthDo.COLUMNS.PRDTNO.name(), po.getPrdtno()); 
		sqlWhere.add(InmonthDo.COLUMNS.MINQTY.name(), po.getMinqty()); 
		sqlWhere.add(InmonthDo.COLUMNS.INUNIT.name(), po.getInunit()); 
	} 
 
} 
