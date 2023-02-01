package com.doc.common.dao.impl; 
 
public class DeclarDAOImpl extends GeneralDAOImpl<DeclarPo> implements DeclarDAO { 
	public static final DeclarDAOImpl INSTANCE = new DeclarDAOImpl(); 
	public static final String TABLENAME = "DECLAR"; 

	public DeclarDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DeclarPo> CONVERTER = new MapConverter<DeclarPo>() { 
 
		@Override 
		public DeclarPo convert(final DataObject dataObject) { 
			final DeclarPo declarPo = new DeclarPo(); 
			declarPo.setMsgfun(dataObject.getString(DeclarPo.COLUMNS.MSGFUN.name())); 
			declarPo.setBondno(dataObject.getString(DeclarPo.COLUMNS.BONDNO.name())); 
			declarPo.setStrtype(dataObject.getString(DeclarPo.COLUMNS.STRTYPE.name())); 
			declarPo.setDecltype(dataObject.getString(DeclarPo.COLUMNS.DECLTYPE.name())); 
			declarPo.setDeclno(dataObject.getString(DeclarPo.COLUMNS.DECLNO.name())); 
			declarPo.setImportdate(TimestampUtils.of(dataObject.getValue(DeclarPo.COLUMNS.IMPORTDATE.name()))); 
			declarPo.setDecldate(TimestampUtils.of(dataObject.getValue(DeclarPo.COLUMNS.DECLDATE.name()))); 
			declarPo.setRlstime(TimestampUtils.of(dataObject.getValue(DeclarPo.COLUMNS.RLSTIME.name()))); 
			declarPo.setStgplace(dataObject.getString(DeclarPo.COLUMNS.STGPLACE.name())); 
			declarPo.setNopkg(BigDecimalUtils.formObj(dataObject.getValue(DeclarPo.COLUMNS.NOPKG.name()))); 
			declarPo.setPkgunit(dataObject.getString(DeclarPo.COLUMNS.PKGUNIT.name())); 
			declarPo.setGwgt(BigDecimalUtils.formObj(dataObject.getValue(DeclarPo.COLUMNS.GWGT.name()))); 
			declarPo.setRefbillno(dataObject.getString(DeclarPo.COLUMNS.REFBILLNO.name())); 
			declarPo.setBoxno(dataObject.getString(DeclarPo.COLUMNS.BOXNO.name())); 
			declarPo.setInbondno(dataObject.getString(DeclarPo.COLUMNS.INBONDNO.name())); 
			declarPo.setOutbondno(dataObject.getString(DeclarPo.COLUMNS.OUTBONDNO.name())); 
			declarPo.setSendid(dataObject.getString(DeclarPo.COLUMNS.SENDID.name())); 
			declarPo.setSendqulf(dataObject.getString(DeclarPo.COLUMNS.SENDQULF.name())); 
			declarPo.setRecvid(dataObject.getString(DeclarPo.COLUMNS.RECVID.name())); 
			declarPo.setRecvqulf(dataObject.getString(DeclarPo.COLUMNS.RECVQULF.name())); 
			declarPo.setRlsflag(dataObject.getString(DeclarPo.COLUMNS.RLSFLAG.name())); 
			declarPo.setMawbno(dataObject.getString(DeclarPo.COLUMNS.MAWBNO.name())); 
			declarPo.setHawbno(dataObject.getString(DeclarPo.COLUMNS.HAWBNO.name())); 
			declarPo.setOwnerban(dataObject.getString(DeclarPo.COLUMNS.OWNERBAN.name())); 
			declarPo.setIconfirmed(dataObject.getString(DeclarPo.COLUMNS.ICONFIRMED.name())); 
			declarPo.setMonrpt(dataObject.getString(DeclarPo.COLUMNS.MONRPT.name())); 
			declarPo.setMsgtype(dataObject.getString(DeclarPo.COLUMNS.MSGTYPE.name())); 
			declarPo.setUpdtime(dataObject.getString(DeclarPo.COLUMNS.UPDTIME.name())); 
			declarPo.setOthers(dataObject.getString(DeclarPo.COLUMNS.OTHERS.name())); 
			declarPo.setBillingstat(dataObject.getString(DeclarPo.COLUMNS.BILLINGSTAT.name())); 
			declarPo.setChargedate(dataObject.getString(DeclarPo.COLUMNS.CHARGEDATE.name())); 
			declarPo.setMark(dataObject.getString(DeclarPo.COLUMNS.MARK.name())); 
			declarPo.setAstype(dataObject.getString(DeclarPo.COLUMNS.ASTYPE.name())); 
			declarPo.setVrno(dataObject.getString(DeclarPo.COLUMNS.VRNO.name())); 
			declarPo.setSono(dataObject.getString(DeclarPo.COLUMNS.SONO.name())); 
			declarPo.setExchangeRate(BigDecimalUtils.formObj(dataObject.getValue(DeclarPo.COLUMNS.EXCHANGE_RATE.name()))); 
			declarPo.setTotFobValue(BigDecimalUtils.formObj(dataObject.getValue(DeclarPo.COLUMNS.TOT_FOB_VALUE.name()))); 
			declarPo.setLoadPortCode(dataObject.getString(DeclarPo.COLUMNS.LOAD_PORT_CODE.name())); 
			declarPo.setInsuranceFee(BigDecimalUtils.formObj(dataObject.getValue(DeclarPo.COLUMNS.INSURANCE_FEE.name()))); 
			declarPo.setFreightFee(BigDecimalUtils.formObj(dataObject.getValue(DeclarPo.COLUMNS.FREIGHT_FEE.name()))); 
			return declarPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DeclarPo declarPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DeclarPo.COLUMNS.MSGFUN.name(), declarPo.getMsgfun()); 
			dataObject.setValue(DeclarPo.COLUMNS.BONDNO.name(), declarPo.getBondno()); 
			dataObject.setValue(DeclarPo.COLUMNS.STRTYPE.name(), declarPo.getStrtype()); 
			dataObject.setValue(DeclarPo.COLUMNS.DECLTYPE.name(), declarPo.getDecltype()); 
			dataObject.setValue(DeclarPo.COLUMNS.DECLNO.name(), declarPo.getDeclno()); 
			dataObject.setValue(DeclarPo.COLUMNS.IMPORTDATE.name(), declarPo.getImportdate()); 
			dataObject.setValue(DeclarPo.COLUMNS.DECLDATE.name(), declarPo.getDecldate()); 
			dataObject.setValue(DeclarPo.COLUMNS.RLSTIME.name(), declarPo.getRlstime()); 
			dataObject.setValue(DeclarPo.COLUMNS.STGPLACE.name(), declarPo.getStgplace()); 
			dataObject.setValue(DeclarPo.COLUMNS.NOPKG.name(), declarPo.getNopkg()); 
			dataObject.setValue(DeclarPo.COLUMNS.PKGUNIT.name(), declarPo.getPkgunit()); 
			dataObject.setValue(DeclarPo.COLUMNS.GWGT.name(), declarPo.getGwgt()); 
			dataObject.setValue(DeclarPo.COLUMNS.REFBILLNO.name(), declarPo.getRefbillno()); 
			dataObject.setValue(DeclarPo.COLUMNS.BOXNO.name(), declarPo.getBoxno()); 
			dataObject.setValue(DeclarPo.COLUMNS.INBONDNO.name(), declarPo.getInbondno()); 
			dataObject.setValue(DeclarPo.COLUMNS.OUTBONDNO.name(), declarPo.getOutbondno()); 
			dataObject.setValue(DeclarPo.COLUMNS.SENDID.name(), declarPo.getSendid()); 
			dataObject.setValue(DeclarPo.COLUMNS.SENDQULF.name(), declarPo.getSendqulf()); 
			dataObject.setValue(DeclarPo.COLUMNS.RECVID.name(), declarPo.getRecvid()); 
			dataObject.setValue(DeclarPo.COLUMNS.RECVQULF.name(), declarPo.getRecvqulf()); 
			dataObject.setValue(DeclarPo.COLUMNS.RLSFLAG.name(), declarPo.getRlsflag()); 
			dataObject.setValue(DeclarPo.COLUMNS.MAWBNO.name(), declarPo.getMawbno()); 
			dataObject.setValue(DeclarPo.COLUMNS.HAWBNO.name(), declarPo.getHawbno()); 
			dataObject.setValue(DeclarPo.COLUMNS.OWNERBAN.name(), declarPo.getOwnerban()); 
			dataObject.setValue(DeclarPo.COLUMNS.ICONFIRMED.name(), declarPo.getIconfirmed()); 
			dataObject.setValue(DeclarPo.COLUMNS.MONRPT.name(), declarPo.getMonrpt()); 
			dataObject.setValue(DeclarPo.COLUMNS.MSGTYPE.name(), declarPo.getMsgtype()); 
			dataObject.setValue(DeclarPo.COLUMNS.UPDTIME.name(), declarPo.getUpdtime()); 
			dataObject.setValue(DeclarPo.COLUMNS.OTHERS.name(), declarPo.getOthers()); 
			dataObject.setValue(DeclarPo.COLUMNS.BILLINGSTAT.name(), declarPo.getBillingstat()); 
			dataObject.setValue(DeclarPo.COLUMNS.CHARGEDATE.name(), declarPo.getChargedate()); 
			dataObject.setValue(DeclarPo.COLUMNS.MARK.name(), declarPo.getMark()); 
			dataObject.setValue(DeclarPo.COLUMNS.ASTYPE.name(), declarPo.getAstype()); 
			dataObject.setValue(DeclarPo.COLUMNS.VRNO.name(), declarPo.getVrno()); 
			dataObject.setValue(DeclarPo.COLUMNS.SONO.name(), declarPo.getSono()); 
			dataObject.setValue(DeclarPo.COLUMNS.EXCHANGE_RATE.name(), declarPo.getExchangeRate()); 
			dataObject.setValue(DeclarPo.COLUMNS.TOT_FOB_VALUE.name(), declarPo.getTotFobValue()); 
			dataObject.setValue(DeclarPo.COLUMNS.LOAD_PORT_CODE.name(), declarPo.getLoadPortCode()); 
			dataObject.setValue(DeclarPo.COLUMNS.INSURANCE_FEE.name(), declarPo.getInsuranceFee()); 
			dataObject.setValue(DeclarPo.COLUMNS.FREIGHT_FEE.name(), declarPo.getFreightFee()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DeclarPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DeclarPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(DeclarPo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(DeclarPo.COLUMNS.STRTYPE.name(), po.getStrtype()); 
		sqlWhere.add(DeclarPo.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(DeclarPo.COLUMNS.MSGTYPE.name(), po.getMsgtype()); 
		return sqlWhere; 
	} 
 
} 
