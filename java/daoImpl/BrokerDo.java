package com.doc.common.dao.impl; 
 
public class BrokerDAO extends GeneralDAOImpl<BrokerDo> implements BrokerDAO { 
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
		sqlWhere.add(BrokerDo.COLUMNS.USERID.name(), po.getUserid()); 
		sqlWhere.add(BrokerDo.COLUMNS.BROKERBAN.name(), po.getBrokerban()); 
		sqlWhere.add(BrokerDo.COLUMNS.BROKERNAME.name(), po.getBrokername()); 
		sqlWhere.add(BrokerDo.COLUMNS.BROKERADD.name(), po.getBrokeradd()); 
		sqlWhere.add(BrokerDo.COLUMNS.MD.name(), po.getMd()); 
		sqlWhere.add(BrokerDo.COLUMNS.TEL.name(), po.getTel()); 
		sqlWhere.add(BrokerDo.COLUMNS.FAX.name(), po.getFax()); 
		sqlWhere.add(BrokerDo.COLUMNS.STATUS.name(), po.getStatus()); 
		sqlWhere.add(BrokerDo.COLUMNS.ACTIVEDATE.name(), po.getActivedate()); 
		sqlWhere.add(BrokerDo.COLUMNS.CHARGEDATE.name(), po.getChargedate()); 
		sqlWhere.add(BrokerDo.COLUMNS.ENDDATE.name(), po.getEnddate()); 
	} 
 
} 
