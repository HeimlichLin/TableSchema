package com.doc.common.dao.impl; 
 
public class OutmonthDAOImpl extends GeneralDAOImpl<OutmonthPo> implements OutmonthDAO { 
	public static final OutmonthDAOImpl INSTANCE = new OutmonthDAOImpl(); 
	public static final String TABLENAME = "OUTMONTH"; 

	public OutmonthDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<OutmonthPo> CONVERTER = new MapConverter<OutmonthPo>() { 
 
		@Override 
		public OutmonthPo convert(final DataObject dataObject) { 
			final OutmonthPo outmonthPo = new OutmonthPo(); 
			outmonthPo.setBondno(dataObject.getString(OutmonthPo.COLUMNS.BONDNO.name())); 
			outmonthPo.setMonthno(dataObject.getString(OutmonthPo.COLUMNS.MONTHNO.name())); 
			outmonthPo.setItem(BigDecimalUtils.formObj(dataObject.getValue(OutmonthPo.COLUMNS.ITEM.name()))); 
			outmonthPo.setPrdtno(dataObject.getString(OutmonthPo.COLUMNS.PRDTNO.name())); 
			outmonthPo.setMoutqty(BigDecimalUtils.formObj(dataObject.getValue(OutmonthPo.COLUMNS.MOUTQTY.name()))); 
			outmonthPo.setOutunit(dataObject.getString(OutmonthPo.COLUMNS.OUTUNIT.name())); 
			return outmonthPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final OutmonthPo outmonthPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(OutmonthPo.COLUMNS.BONDNO.name(), outmonthPo.getBondno()); 
			dataObject.setValue(OutmonthPo.COLUMNS.MONTHNO.name(), outmonthPo.getMonthno()); 
			dataObject.setValue(OutmonthPo.COLUMNS.ITEM.name(), outmonthPo.getItem()); 
			dataObject.setValue(OutmonthPo.COLUMNS.PRDTNO.name(), outmonthPo.getPrdtno()); 
			dataObject.setValue(OutmonthPo.COLUMNS.MOUTQTY.name(), outmonthPo.getMoutqty()); 
			dataObject.setValue(OutmonthPo.COLUMNS.OUTUNIT.name(), outmonthPo.getOutunit()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<OutmonthPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(OutmonthPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(OutmonthPo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(OutmonthPo.COLUMNS.MONTHNO.name(), po.getMonthno()); 
		sqlWhere.add(OutmonthPo.COLUMNS.ITEM.name(), po.getItem()); 
		return sqlWhere; 
	} 
 
} 
