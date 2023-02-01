package com.doc.common.dao.impl; 
 
public class MonthDAOImpl extends GeneralDAOImpl<MonthPo> implements MonthDAO { 
	public static final MonthDAOImpl INSTANCE = new MonthDAOImpl(); 
	public static final String TABLENAME = "MONTH"; 

	public MonthDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<MonthPo> CONVERTER = new MapConverter<MonthPo>() { 
 
		@Override 
		public MonthPo convert(final DataObject dataObject) { 
			final MonthPo monthPo = new MonthPo(); 
			monthPo.setBondno(dataObject.getString(MonthPo.COLUMNS.BONDNO.name())); 
			monthPo.setStrtype(dataObject.getString(MonthPo.COLUMNS.STRTYPE.name())); 
			monthPo.setCtmcode(dataObject.getString(MonthPo.COLUMNS.CTMCODE.name())); 
			monthPo.setMonthno(dataObject.getString(MonthPo.COLUMNS.MONTHNO.name())); 
			monthPo.setDecltype(dataObject.getString(MonthPo.COLUMNS.DECLTYPE.name())); 
			monthPo.setDeclno(dataObject.getString(MonthPo.COLUMNS.DECLNO.name())); 
			monthPo.setMdate(dataObject.getString(MonthPo.COLUMNS.MDATE.name())); 
			monthPo.setOrderby(dataObject.getString(MonthPo.COLUMNS.ORDERBY.name())); 
			monthPo.setConfirmdate(dataObject.getString(MonthPo.COLUMNS.CONFIRMDATE.name())); 
			return monthPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final MonthPo monthPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(MonthPo.COLUMNS.BONDNO.name(), monthPo.getBondno()); 
			dataObject.setValue(MonthPo.COLUMNS.STRTYPE.name(), monthPo.getStrtype()); 
			dataObject.setValue(MonthPo.COLUMNS.CTMCODE.name(), monthPo.getCtmcode()); 
			dataObject.setValue(MonthPo.COLUMNS.MONTHNO.name(), monthPo.getMonthno()); 
			dataObject.setValue(MonthPo.COLUMNS.DECLTYPE.name(), monthPo.getDecltype()); 
			dataObject.setValue(MonthPo.COLUMNS.DECLNO.name(), monthPo.getDeclno()); 
			dataObject.setValue(MonthPo.COLUMNS.MDATE.name(), monthPo.getMdate()); 
			dataObject.setValue(MonthPo.COLUMNS.ORDERBY.name(), monthPo.getOrderby()); 
			dataObject.setValue(MonthPo.COLUMNS.CONFIRMDATE.name(), monthPo.getConfirmdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<MonthPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(MonthPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(MonthPo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(MonthPo.COLUMNS.STRTYPE.name(), po.getStrtype()); 
		sqlWhere.add(MonthPo.COLUMNS.MONTHNO.name(), po.getMonthno()); 
		return sqlWhere; 
	} 
 
} 
