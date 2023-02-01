package com.doc.common.dao.impl; 
 
public class BrokerDAOImpl extends GeneralDAOImpl<BrokerPo> implements BrokerDAO { 
	public static final BrokerDAOImpl INSTANCE = new BrokerDAOImpl(); 
	public static final String TABLENAME = "BROKER"; 

	public BrokerDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<BrokerPo> CONVERTER = new MapConverter<BrokerPo>() { 
 
		@Override 
		public BrokerPo convert(final DataObject dataObject) { 
			final BrokerPo brokerPo = new BrokerPo(); 
			brokerPo.setBoxno(dataObject.getString(BrokerPo.COLUMNS.BOXNO.name())); 
			brokerPo.setUserid(dataObject.getString(BrokerPo.COLUMNS.USERID.name())); 
			brokerPo.setBrokerban(dataObject.getString(BrokerPo.COLUMNS.BROKERBAN.name())); 
			brokerPo.setBrokername(dataObject.getString(BrokerPo.COLUMNS.BROKERNAME.name())); 
			brokerPo.setBrokeradd(dataObject.getString(BrokerPo.COLUMNS.BROKERADD.name())); 
			brokerPo.setMd(dataObject.getString(BrokerPo.COLUMNS.MD.name())); 
			brokerPo.setTel(dataObject.getString(BrokerPo.COLUMNS.TEL.name())); 
			brokerPo.setFax(dataObject.getString(BrokerPo.COLUMNS.FAX.name())); 
			brokerPo.setStatus(dataObject.getString(BrokerPo.COLUMNS.STATUS.name())); 
			brokerPo.setActivedate(dataObject.getString(BrokerPo.COLUMNS.ACTIVEDATE.name())); 
			brokerPo.setChargedate(dataObject.getString(BrokerPo.COLUMNS.CHARGEDATE.name())); 
			brokerPo.setEnddate(dataObject.getString(BrokerPo.COLUMNS.ENDDATE.name())); 
			return brokerPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final BrokerPo brokerPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(BrokerPo.COLUMNS.BOXNO.name(), brokerPo.getBoxno()); 
			dataObject.setValue(BrokerPo.COLUMNS.USERID.name(), brokerPo.getUserid()); 
			dataObject.setValue(BrokerPo.COLUMNS.BROKERBAN.name(), brokerPo.getBrokerban()); 
			dataObject.setValue(BrokerPo.COLUMNS.BROKERNAME.name(), brokerPo.getBrokername()); 
			dataObject.setValue(BrokerPo.COLUMNS.BROKERADD.name(), brokerPo.getBrokeradd()); 
			dataObject.setValue(BrokerPo.COLUMNS.MD.name(), brokerPo.getMd()); 
			dataObject.setValue(BrokerPo.COLUMNS.TEL.name(), brokerPo.getTel()); 
			dataObject.setValue(BrokerPo.COLUMNS.FAX.name(), brokerPo.getFax()); 
			dataObject.setValue(BrokerPo.COLUMNS.STATUS.name(), brokerPo.getStatus()); 
			dataObject.setValue(BrokerPo.COLUMNS.ACTIVEDATE.name(), brokerPo.getActivedate()); 
			dataObject.setValue(BrokerPo.COLUMNS.CHARGEDATE.name(), brokerPo.getChargedate()); 
			dataObject.setValue(BrokerPo.COLUMNS.ENDDATE.name(), brokerPo.getEnddate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<BrokerPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(BrokerPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(BrokerPo.COLUMNS.BOXNO.name(), po.getBoxno()); 
		return sqlWhere; 
	} 
 
} 
