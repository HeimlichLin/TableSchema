package com.doc.common.dao.impl; 
 
public class ShutdeclarDAOImpl extends GeneralDAOImpl<ShutdeclarPo> implements ShutdeclarDAO { 
	public static final ShutdeclarDAOImpl INSTANCE = new ShutdeclarDAOImpl(); 
	public static final String TABLENAME = "SHUTDECLAR"; 

	public ShutdeclarDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ShutdeclarPo> CONVERTER = new MapConverter<ShutdeclarPo>() { 
 
		@Override 
		public ShutdeclarPo convert(final DataObject dataObject) { 
			final ShutdeclarPo shutdeclarPo = new ShutdeclarPo(); 
			shutdeclarPo.setBondno(dataObject.getString(ShutdeclarPo.COLUMNS.BONDNO.name())); 
			shutdeclarPo.setStrtype(dataObject.getString(ShutdeclarPo.COLUMNS.STRTYPE.name())); 
			shutdeclarPo.setDecltype(dataObject.getString(ShutdeclarPo.COLUMNS.DECLTYPE.name())); 
			shutdeclarPo.setShiptype(dataObject.getString(ShutdeclarPo.COLUMNS.SHIPTYPE.name())); 
			shutdeclarPo.setDeclno(dataObject.getString(ShutdeclarPo.COLUMNS.DECLNO.name())); 
			shutdeclarPo.setDocno(dataObject.getString(ShutdeclarPo.COLUMNS.DOCNO.name())); 
			shutdeclarPo.setShutdate(dataObject.getString(ShutdeclarPo.COLUMNS.SHUTDATE.name())); 
			shutdeclarPo.setMsgfun(dataObject.getString(ShutdeclarPo.COLUMNS.MSGFUN.name())); 
			shutdeclarPo.setRmk(dataObject.getString(ShutdeclarPo.COLUMNS.RMK.name())); 
			shutdeclarPo.setUpdtime(dataObject.getString(ShutdeclarPo.COLUMNS.UPDTIME.name())); 
			return shutdeclarPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ShutdeclarPo shutdeclarPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ShutdeclarPo.COLUMNS.BONDNO.name(), shutdeclarPo.getBondno()); 
			dataObject.setValue(ShutdeclarPo.COLUMNS.STRTYPE.name(), shutdeclarPo.getStrtype()); 
			dataObject.setValue(ShutdeclarPo.COLUMNS.DECLTYPE.name(), shutdeclarPo.getDecltype()); 
			dataObject.setValue(ShutdeclarPo.COLUMNS.SHIPTYPE.name(), shutdeclarPo.getShiptype()); 
			dataObject.setValue(ShutdeclarPo.COLUMNS.DECLNO.name(), shutdeclarPo.getDeclno()); 
			dataObject.setValue(ShutdeclarPo.COLUMNS.DOCNO.name(), shutdeclarPo.getDocno()); 
			dataObject.setValue(ShutdeclarPo.COLUMNS.SHUTDATE.name(), shutdeclarPo.getShutdate()); 
			dataObject.setValue(ShutdeclarPo.COLUMNS.MSGFUN.name(), shutdeclarPo.getMsgfun()); 
			dataObject.setValue(ShutdeclarPo.COLUMNS.RMK.name(), shutdeclarPo.getRmk()); 
			dataObject.setValue(ShutdeclarPo.COLUMNS.UPDTIME.name(), shutdeclarPo.getUpdtime()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ShutdeclarPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ShutdeclarPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(ShutdeclarPo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(ShutdeclarPo.COLUMNS.STRTYPE.name(), po.getStrtype()); 
		sqlWhere.add(ShutdeclarPo.COLUMNS.DECLNO.name(), po.getDeclno()); 
		return sqlWhere; 
	} 
 
} 
