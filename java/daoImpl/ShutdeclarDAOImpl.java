package com.doc.common.dao.impl; 
 
public class ShutdeclarDAOImpl extends GeneralDAOImpl<ShutdeclarDo> implements ShutdeclarDAOImpl { 
	public static final ShutdeclarDAOImpl INSTANCE = new ShutdeclarDAOImpl(); 
	public static final String TABLENAME = "SHUTDECLAR"; 

	public ShutdeclarDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<ShutdeclarDo> CONVERTER = new MapConverter<ShutdeclarDo>() { 
 
		@Override 
		public ShutdeclarDo convert(final DataObject dataObject) { 
			final ShutdeclarDo shutdeclarDo = new ShutdeclarDo(); 
			shutdeclarDo.setBondno(dataObject.getString(ShutdeclarDo.COLUMNS.BONDNO.name())); 
			shutdeclarDo.setStrtype(dataObject.getString(ShutdeclarDo.COLUMNS.STRTYPE.name())); 
			shutdeclarDo.setDecltype(dataObject.getString(ShutdeclarDo.COLUMNS.DECLTYPE.name())); 
			shutdeclarDo.setShiptype(dataObject.getString(ShutdeclarDo.COLUMNS.SHIPTYPE.name())); 
			shutdeclarDo.setDeclno(dataObject.getString(ShutdeclarDo.COLUMNS.DECLNO.name())); 
			shutdeclarDo.setDocno(dataObject.getString(ShutdeclarDo.COLUMNS.DOCNO.name())); 
			shutdeclarDo.setShutdate(dataObject.getString(ShutdeclarDo.COLUMNS.SHUTDATE.name())); 
			shutdeclarDo.setMsgfun(dataObject.getString(ShutdeclarDo.COLUMNS.MSGFUN.name())); 
			shutdeclarDo.setRmk(dataObject.getString(ShutdeclarDo.COLUMNS.RMK.name())); 
			shutdeclarDo.setUpdtime(dataObject.getString(ShutdeclarDo.COLUMNS.UPDTIME.name())); 
			return shutdeclarDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ShutdeclarDo shutdeclarDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ShutdeclarDo.COLUMNS.BONDNO.name(), shutdeclarDo.getBondno()); 
			dataObject.setValue(ShutdeclarDo.COLUMNS.STRTYPE.name(), shutdeclarDo.getStrtype()); 
			dataObject.setValue(ShutdeclarDo.COLUMNS.DECLTYPE.name(), shutdeclarDo.getDecltype()); 
			dataObject.setValue(ShutdeclarDo.COLUMNS.SHIPTYPE.name(), shutdeclarDo.getShiptype()); 
			dataObject.setValue(ShutdeclarDo.COLUMNS.DECLNO.name(), shutdeclarDo.getDeclno()); 
			dataObject.setValue(ShutdeclarDo.COLUMNS.DOCNO.name(), shutdeclarDo.getDocno()); 
			dataObject.setValue(ShutdeclarDo.COLUMNS.SHUTDATE.name(), shutdeclarDo.getShutdate()); 
			dataObject.setValue(ShutdeclarDo.COLUMNS.MSGFUN.name(), shutdeclarDo.getMsgfun()); 
			dataObject.setValue(ShutdeclarDo.COLUMNS.RMK.name(), shutdeclarDo.getRmk()); 
			dataObject.setValue(ShutdeclarDo.COLUMNS.UPDTIME.name(), shutdeclarDo.getUpdtime()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ShutdeclarDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ShutdeclarDo po) { 
		sqlWhere.add(ShutdeclarDo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(ShutdeclarDo.COLUMNS.STRTYPE.name(), po.getStrtype()); 
		sqlWhere.add(ShutdeclarDo.COLUMNS.DECLNO.name(), po.getDeclno()); 
	} 
 
} 
