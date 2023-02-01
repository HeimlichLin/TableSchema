package com.doc.common.dao.impl; 
 
public class BackerrorDAOImpl extends GeneralDAOImpl<BackerrorPo> implements BackerrorDAO { 
	public static final BackerrorDAOImpl INSTANCE = new BackerrorDAOImpl(); 
	public static final String TABLENAME = "BACKERROR"; 

	public BackerrorDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<BackerrorPo> CONVERTER = new MapConverter<BackerrorPo>() { 
 
		@Override 
		public BackerrorPo convert(final DataObject dataObject) { 
			final BackerrorPo backerrorPo = new BackerrorPo(); 
			backerrorPo.setBondno(dataObject.getString(BackerrorPo.COLUMNS.BONDNO.name())); 
			backerrorPo.setRefbillno(dataObject.getString(BackerrorPo.COLUMNS.REFBILLNO.name())); 
			backerrorPo.setItem(BigDecimalUtils.formObj(dataObject.getValue(BackerrorPo.COLUMNS.ITEM.name()))); 
			backerrorPo.setStrpost(dataObject.getString(BackerrorPo.COLUMNS.STRPOST.name())); 
			backerrorPo.setDeclno(dataObject.getString(BackerrorPo.COLUMNS.DECLNO.name())); 
			backerrorPo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(BackerrorPo.COLUMNS.ITEMNO.name()))); 
			backerrorPo.setStrdate(dataObject.getString(BackerrorPo.COLUMNS.STRDATE.name())); 
			backerrorPo.setBacktable(dataObject.getString(BackerrorPo.COLUMNS.BACKTABLE.name())); 
			backerrorPo.setErrcode(BigDecimalUtils.formObj(dataObject.getValue(BackerrorPo.COLUMNS.ERRCODE.name()))); 
			backerrorPo.setErrdesc(dataObject.getString(BackerrorPo.COLUMNS.ERRDESC.name())); 
			backerrorPo.setLogtime(dataObject.getString(BackerrorPo.COLUMNS.LOGTIME.name())); 
			backerrorPo.setStrtype(dataObject.getString(BackerrorPo.COLUMNS.STRTYPE.name())); 
			backerrorPo.setBacktype(dataObject.getString(BackerrorPo.COLUMNS.BACKTYPE.name())); 
			return backerrorPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final BackerrorPo backerrorPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(BackerrorPo.COLUMNS.BONDNO.name(), backerrorPo.getBondno()); 
			dataObject.setValue(BackerrorPo.COLUMNS.REFBILLNO.name(), backerrorPo.getRefbillno()); 
			dataObject.setValue(BackerrorPo.COLUMNS.ITEM.name(), backerrorPo.getItem()); 
			dataObject.setValue(BackerrorPo.COLUMNS.STRPOST.name(), backerrorPo.getStrpost()); 
			dataObject.setValue(BackerrorPo.COLUMNS.DECLNO.name(), backerrorPo.getDeclno()); 
			dataObject.setValue(BackerrorPo.COLUMNS.ITEMNO.name(), backerrorPo.getItemno()); 
			dataObject.setValue(BackerrorPo.COLUMNS.STRDATE.name(), backerrorPo.getStrdate()); 
			dataObject.setValue(BackerrorPo.COLUMNS.BACKTABLE.name(), backerrorPo.getBacktable()); 
			dataObject.setValue(BackerrorPo.COLUMNS.ERRCODE.name(), backerrorPo.getErrcode()); 
			dataObject.setValue(BackerrorPo.COLUMNS.ERRDESC.name(), backerrorPo.getErrdesc()); 
			dataObject.setValue(BackerrorPo.COLUMNS.LOGTIME.name(), backerrorPo.getLogtime()); 
			dataObject.setValue(BackerrorPo.COLUMNS.STRTYPE.name(), backerrorPo.getStrtype()); 
			dataObject.setValue(BackerrorPo.COLUMNS.BACKTYPE.name(), backerrorPo.getBacktype()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<BackerrorPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(BackerrorPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
