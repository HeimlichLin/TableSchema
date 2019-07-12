package com.doc.common.dao.impl; 
 
public class MonthDAO extends GeneralDAOImpl<MonthDo> implements MonthDAO { 
	public static final MonthDAOImpl INSTANCE = new MonthDAOImpl(); 
	public static final String TABLENAME = "MONTH"; 

	public MonthDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<MonthDo> CONVERTER = new MapConverter<MonthDo>() { 
 
		@Override 
		public MonthDo convert(final DataObject dataObject) { 
			final MonthDo monthDo = new MonthDo(); 
			monthDo.setBondno(dataObject.getString(MonthDo.COLUMNS.BONDNO.name())); 
			monthDo.setStrtype(dataObject.getString(MonthDo.COLUMNS.STRTYPE.name())); 
			monthDo.setCtmcode(dataObject.getString(MonthDo.COLUMNS.CTMCODE.name())); 
			monthDo.setMonthno(dataObject.getString(MonthDo.COLUMNS.MONTHNO.name())); 
			monthDo.setDecltype(dataObject.getString(MonthDo.COLUMNS.DECLTYPE.name())); 
			monthDo.setDeclno(dataObject.getString(MonthDo.COLUMNS.DECLNO.name())); 
			monthDo.setMdate(dataObject.getString(MonthDo.COLUMNS.MDATE.name())); 
			monthDo.setOrderby(dataObject.getString(MonthDo.COLUMNS.ORDERBY.name())); 
			monthDo.setConfirmdate(dataObject.getString(MonthDo.COLUMNS.CONFIRMDATE.name())); 
			return monthDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final MonthDo monthDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(MonthDo.COLUMNS.BONDNO.name(), monthDo.getBondno()); 
			dataObject.setValue(MonthDo.COLUMNS.STRTYPE.name(), monthDo.getStrtype()); 
			dataObject.setValue(MonthDo.COLUMNS.CTMCODE.name(), monthDo.getCtmcode()); 
			dataObject.setValue(MonthDo.COLUMNS.MONTHNO.name(), monthDo.getMonthno()); 
			dataObject.setValue(MonthDo.COLUMNS.DECLTYPE.name(), monthDo.getDecltype()); 
			dataObject.setValue(MonthDo.COLUMNS.DECLNO.name(), monthDo.getDeclno()); 
			dataObject.setValue(MonthDo.COLUMNS.MDATE.name(), monthDo.getMdate()); 
			dataObject.setValue(MonthDo.COLUMNS.ORDERBY.name(), monthDo.getOrderby()); 
			dataObject.setValue(MonthDo.COLUMNS.CONFIRMDATE.name(), monthDo.getConfirmdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<MonthDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(MonthDo po) { 
		sqlWhere.add(MonthDo.COLUMNS.CTMCODE.name(), po.getCtmcode()); 
		sqlWhere.add(MonthDo.COLUMNS.DECLTYPE.name(), po.getDecltype()); 
		sqlWhere.add(MonthDo.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(MonthDo.COLUMNS.MDATE.name(), po.getMdate()); 
		sqlWhere.add(MonthDo.COLUMNS.ORDERBY.name(), po.getOrderby()); 
		sqlWhere.add(MonthDo.COLUMNS.CONFIRMDATE.name(), po.getConfirmdate()); 
	} 
 
} 
