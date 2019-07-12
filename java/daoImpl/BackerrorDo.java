package com.doc.common.dao.impl; 
 
public class BackerrorDAO extends GeneralDAOImpl<BackerrorDo> implements BackerrorDAO { 
	public static final BackerrorDAOImpl INSTANCE = new BackerrorDAOImpl(); 
	public static final String TABLENAME = "BACKERROR"; 

	public BackerrorDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<BackerrorDo> CONVERTER = new MapConverter<BackerrorDo>() { 
 
		@Override 
		public BackerrorDo convert(final DataObject dataObject) { 
			final BackerrorDo backerrorDo = new BackerrorDo(); 
			backerrorDo.setBondno(dataObject.getString(BackerrorDo.COLUMNS.BONDNO.name())); 
			backerrorDo.setRefbillno(dataObject.getString(BackerrorDo.COLUMNS.REFBILLNO.name())); 
			backerrorDo.setItem(BigDecimalUtils.formObj(dataObject.getString(BackerrorDo.COLUMNS.ITEM.name()))); 
			backerrorDo.setStrpost(dataObject.getString(BackerrorDo.COLUMNS.STRPOST.name())); 
			backerrorDo.setDeclno(dataObject.getString(BackerrorDo.COLUMNS.DECLNO.name())); 
			backerrorDo.setItemno(BigDecimalUtils.formObj(dataObject.getString(BackerrorDo.COLUMNS.ITEMNO.name()))); 
			backerrorDo.setStrdate(dataObject.getString(BackerrorDo.COLUMNS.STRDATE.name())); 
			backerrorDo.setBacktable(dataObject.getString(BackerrorDo.COLUMNS.BACKTABLE.name())); 
			backerrorDo.setErrcode(BigDecimalUtils.formObj(dataObject.getString(BackerrorDo.COLUMNS.ERRCODE.name()))); 
			backerrorDo.setErrdesc(dataObject.getString(BackerrorDo.COLUMNS.ERRDESC.name())); 
			backerrorDo.setLogtime(dataObject.getString(BackerrorDo.COLUMNS.LOGTIME.name())); 
			backerrorDo.setStrtype(dataObject.getString(BackerrorDo.COLUMNS.STRTYPE.name())); 
			backerrorDo.setBacktype(dataObject.getString(BackerrorDo.COLUMNS.BACKTYPE.name())); 
			return backerrorDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final BackerrorDo backerrorDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(BackerrorDo.COLUMNS.BONDNO.name(), backerrorDo.getBondno()); 
			dataObject.setValue(BackerrorDo.COLUMNS.REFBILLNO.name(), backerrorDo.getRefbillno()); 
			dataObject.setValue(BackerrorDo.COLUMNS.ITEM.name(), backerrorDo.getItem()); 
			dataObject.setValue(BackerrorDo.COLUMNS.STRPOST.name(), backerrorDo.getStrpost()); 
			dataObject.setValue(BackerrorDo.COLUMNS.DECLNO.name(), backerrorDo.getDeclno()); 
			dataObject.setValue(BackerrorDo.COLUMNS.ITEMNO.name(), backerrorDo.getItemno()); 
			dataObject.setValue(BackerrorDo.COLUMNS.STRDATE.name(), backerrorDo.getStrdate()); 
			dataObject.setValue(BackerrorDo.COLUMNS.BACKTABLE.name(), backerrorDo.getBacktable()); 
			dataObject.setValue(BackerrorDo.COLUMNS.ERRCODE.name(), backerrorDo.getErrcode()); 
			dataObject.setValue(BackerrorDo.COLUMNS.ERRDESC.name(), backerrorDo.getErrdesc()); 
			dataObject.setValue(BackerrorDo.COLUMNS.LOGTIME.name(), backerrorDo.getLogtime()); 
			dataObject.setValue(BackerrorDo.COLUMNS.STRTYPE.name(), backerrorDo.getStrtype()); 
			dataObject.setValue(BackerrorDo.COLUMNS.BACKTYPE.name(), backerrorDo.getBacktype()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<BackerrorDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(BackerrorDo po) { 
		sqlWhere.add(BackerrorDo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(BackerrorDo.COLUMNS.REFBILLNO.name(), po.getRefbillno()); 
		sqlWhere.add(BackerrorDo.COLUMNS.ITEM.name(), po.getItem()); 
		sqlWhere.add(BackerrorDo.COLUMNS.STRPOST.name(), po.getStrpost()); 
		sqlWhere.add(BackerrorDo.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(BackerrorDo.COLUMNS.ITEMNO.name(), po.getItemno()); 
		sqlWhere.add(BackerrorDo.COLUMNS.STRDATE.name(), po.getStrdate()); 
		sqlWhere.add(BackerrorDo.COLUMNS.BACKTABLE.name(), po.getBacktable()); 
		sqlWhere.add(BackerrorDo.COLUMNS.ERRCODE.name(), po.getErrcode()); 
		sqlWhere.add(BackerrorDo.COLUMNS.ERRDESC.name(), po.getErrdesc()); 
		sqlWhere.add(BackerrorDo.COLUMNS.LOGTIME.name(), po.getLogtime()); 
		sqlWhere.add(BackerrorDo.COLUMNS.STRTYPE.name(), po.getStrtype()); 
		sqlWhere.add(BackerrorDo.COLUMNS.BACKTYPE.name(), po.getBacktype()); 
	} 
 
} 
