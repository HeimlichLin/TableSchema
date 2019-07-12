package com.doc.common.dao.impl; 
 
public class BrokerDAOImpl extends GeneralDAOImpl<BrokerDo> implements BrokerDAOImpl { 
	public static final BrokerDAOImpl INSTANCE = new BrokerDAOImpl(); 
	public static final String TABLENAME = "BROKER"; 

	public BrokerDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<BrokerDo> CONVERTER = new MapConverter<BrokerDo>() { 
 
		@Override 
		public BrokerDo convert(final DataObject dataObject) { 
			final BrokerDo brokerDo = new BrokerDo(); 
			brokerDo.setBoxno(dataObject.getString(BrokerDo.COLUMNS.BOXNO.name())); 
			brokerDo.setUserid(dataObject.getString(BrokerDo.COLUMNS.USERID.name())); 
			brokerDo.setBrokerban(dataObject.getString(BrokerDo.COLUMNS.BROKERBAN.name())); 
			brokerDo.setBrokername(dataObject.getString(BrokerDo.COLUMNS.BROKERNAME.name())); 
			brokerDo.setBrokeradd(dataObject.getString(BrokerDo.COLUMNS.BROKERADD.name())); 
			brokerDo.setMd(dataObject.getString(BrokerDo.COLUMNS.MD.name())); 
			brokerDo.setTel(dataObject.getString(BrokerDo.COLUMNS.TEL.name())); 
			brokerDo.setFax(dataObject.getString(BrokerDo.COLUMNS.FAX.name())); 
			brokerDo.setStatus(dataObject.getString(BrokerDo.COLUMNS.STATUS.name())); 
			brokerDo.setActivedate(dataObject.getString(BrokerDo.COLUMNS.ACTIVEDATE.name())); 
			brokerDo.setChargedate(dataObject.getString(BrokerDo.COLUMNS.CHARGEDATE.name())); 
			brokerDo.setEnddate(dataObject.getString(BrokerDo.COLUMNS.ENDDATE.name())); 
			return brokerDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final BrokerDo brokerDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(BrokerDo.COLUMNS.BOXNO.name(), brokerDo.getBoxno()); 
			dataObject.setValue(BrokerDo.COLUMNS.USERID.name(), brokerDo.getUserid()); 
			dataObject.setValue(BrokerDo.COLUMNS.BROKERBAN.name(), brokerDo.getBrokerban()); 
			dataObject.setValue(BrokerDo.COLUMNS.BROKERNAME.name(), brokerDo.getBrokername()); 
			dataObject.setValue(BrokerDo.COLUMNS.BROKERADD.name(), brokerDo.getBrokeradd()); 
			dataObject.setValue(BrokerDo.COLUMNS.MD.name(), brokerDo.getMd()); 
			dataObject.setValue(BrokerDo.COLUMNS.TEL.name(), brokerDo.getTel()); 
			dataObject.setValue(BrokerDo.COLUMNS.FAX.name(), brokerDo.getFax()); 
			dataObject.setValue(BrokerDo.COLUMNS.STATUS.name(), brokerDo.getStatus()); 
			dataObject.setValue(BrokerDo.COLUMNS.ACTIVEDATE.name(), brokerDo.getActivedate()); 
			dataObject.setValue(BrokerDo.COLUMNS.CHARGEDATE.name(), brokerDo.getChargedate()); 
			dataObject.setValue(BrokerDo.COLUMNS.ENDDATE.name(), brokerDo.getEnddate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<BrokerDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(BrokerDo po) { 
		sqlWhere.add(BrokerDo.COLUMNS.BOXNO.name(), po.getBoxno()); 
	} 
 
} 
