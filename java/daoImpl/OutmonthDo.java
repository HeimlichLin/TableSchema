package com.doc.common.dao.impl; 
 
public class OutmonthDAO extends GeneralDAOImpl<OutmonthDo> implements OutmonthDAO { 
	public static final OutmonthDAOImpl INSTANCE = new OutmonthDAOImpl(); 
	public static final String TABLENAME = "OUTMONTH"; 

	public OutmonthDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<OutmonthDo> CONVERTER = new MapConverter<OutmonthDo>() { 
 
		@Override 
		public OutmonthDo convert(final DataObject dataObject) { 
			final OutmonthDo outmonthDo = new OutmonthDo(); 
			outmonthDo.setBondno(dataObject.getString(OutmonthDo.COLUMNS.BONDNO.name())); 
			outmonthDo.setMonthno(dataObject.getString(OutmonthDo.COLUMNS.MONTHNO.name())); 
			outmonthDo.setItem(BigDecimalUtils.formObj(dataObject.getString(OutmonthDo.COLUMNS.ITEM.name()))); 
			outmonthDo.setPrdtno(dataObject.getString(OutmonthDo.COLUMNS.PRDTNO.name())); 
			outmonthDo.setMoutqty(BigDecimalUtils.formObj(dataObject.getString(OutmonthDo.COLUMNS.MOUTQTY.name()))); 
			outmonthDo.setOutunit(dataObject.getString(OutmonthDo.COLUMNS.OUTUNIT.name())); 
			return outmonthDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final OutmonthDo outmonthDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(OutmonthDo.COLUMNS.BONDNO.name(), outmonthDo.getBondno()); 
			dataObject.setValue(OutmonthDo.COLUMNS.MONTHNO.name(), outmonthDo.getMonthno()); 
			dataObject.setValue(OutmonthDo.COLUMNS.ITEM.name(), outmonthDo.getItem()); 
			dataObject.setValue(OutmonthDo.COLUMNS.PRDTNO.name(), outmonthDo.getPrdtno()); 
			dataObject.setValue(OutmonthDo.COLUMNS.MOUTQTY.name(), outmonthDo.getMoutqty()); 
			dataObject.setValue(OutmonthDo.COLUMNS.OUTUNIT.name(), outmonthDo.getOutunit()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<OutmonthDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(OutmonthDo po) { 
		sqlWhere.add(OutmonthDo.COLUMNS.PRDTNO.name(), po.getPrdtno()); 
		sqlWhere.add(OutmonthDo.COLUMNS.MOUTQTY.name(), po.getMoutqty()); 
		sqlWhere.add(OutmonthDo.COLUMNS.OUTUNIT.name(), po.getOutunit()); 
	} 
 
} 
