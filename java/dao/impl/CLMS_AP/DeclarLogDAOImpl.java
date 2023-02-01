package com.doc.common.dao.impl; 
 
public class DeclarLogDAOImpl extends GeneralDAOImpl<DeclarLogPo> implements DeclarLogDAO { 
	public static final DeclarLogDAOImpl INSTANCE = new DeclarLogDAOImpl(); 
	public static final String TABLENAME = "DECLAR_LOG"; 

	public DeclarLogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DeclarLogPo> CONVERTER = new MapConverter<DeclarLogPo>() { 
 
		@Override 
		public DeclarLogPo convert(final DataObject dataObject) { 
			final DeclarLogPo declarLogPo = new DeclarLogPo(); 
			declarLogPo.setMsgfun(dataObject.getString(DeclarLogPo.COLUMNS.MSGFUN.name())); 
			declarLogPo.setBondno(dataObject.getString(DeclarLogPo.COLUMNS.BONDNO.name())); 
			declarLogPo.setStrtype(dataObject.getString(DeclarLogPo.COLUMNS.STRTYPE.name())); 
			declarLogPo.setDecltype(dataObject.getString(DeclarLogPo.COLUMNS.DECLTYPE.name())); 
			declarLogPo.setDeclno(dataObject.getString(DeclarLogPo.COLUMNS.DECLNO.name())); 
			declarLogPo.setImportdate(TimestampUtils.of(dataObject.getValue(DeclarLogPo.COLUMNS.IMPORTDATE.name()))); 
			declarLogPo.setDecldate(TimestampUtils.of(dataObject.getValue(DeclarLogPo.COLUMNS.DECLDATE.name()))); 
			declarLogPo.setRlstime(TimestampUtils.of(dataObject.getValue(DeclarLogPo.COLUMNS.RLSTIME.name()))); 
			declarLogPo.setStgplace(dataObject.getString(DeclarLogPo.COLUMNS.STGPLACE.name())); 
			declarLogPo.setNopkg(BigDecimalUtils.formObj(dataObject.getValue(DeclarLogPo.COLUMNS.NOPKG.name()))); 
			declarLogPo.setPkgunit(dataObject.getString(DeclarLogPo.COLUMNS.PKGUNIT.name())); 
			declarLogPo.setGwgt(BigDecimalUtils.formObj(dataObject.getValue(DeclarLogPo.COLUMNS.GWGT.name()))); 
			declarLogPo.setRefbillno(dataObject.getString(DeclarLogPo.COLUMNS.REFBILLNO.name())); 
			declarLogPo.setBoxno(dataObject.getString(DeclarLogPo.COLUMNS.BOXNO.name())); 
			declarLogPo.setInbondno(dataObject.getString(DeclarLogPo.COLUMNS.INBONDNO.name())); 
			declarLogPo.setOutbondno(dataObject.getString(DeclarLogPo.COLUMNS.OUTBONDNO.name())); 
			declarLogPo.setSendid(dataObject.getString(DeclarLogPo.COLUMNS.SENDID.name())); 
			declarLogPo.setSendqulf(dataObject.getString(DeclarLogPo.COLUMNS.SENDQULF.name())); 
			declarLogPo.setRecvid(dataObject.getString(DeclarLogPo.COLUMNS.RECVID.name())); 
			declarLogPo.setRecvqulf(dataObject.getString(DeclarLogPo.COLUMNS.RECVQULF.name())); 
			declarLogPo.setRlsflag(dataObject.getString(DeclarLogPo.COLUMNS.RLSFLAG.name())); 
			declarLogPo.setMawbno(dataObject.getString(DeclarLogPo.COLUMNS.MAWBNO.name())); 
			declarLogPo.setHawbno(dataObject.getString(DeclarLogPo.COLUMNS.HAWBNO.name())); 
			declarLogPo.setOwnerban(dataObject.getString(DeclarLogPo.COLUMNS.OWNERBAN.name())); 
			declarLogPo.setIconfirmed(dataObject.getString(DeclarLogPo.COLUMNS.ICONFIRMED.name())); 
			declarLogPo.setMonrpt(dataObject.getString(DeclarLogPo.COLUMNS.MONRPT.name())); 
			declarLogPo.setMsgtype(dataObject.getString(DeclarLogPo.COLUMNS.MSGTYPE.name())); 
			declarLogPo.setUpdtime(dataObject.getString(DeclarLogPo.COLUMNS.UPDTIME.name())); 
			declarLogPo.setOthers(dataObject.getString(DeclarLogPo.COLUMNS.OTHERS.name())); 
			declarLogPo.setBillingstat(dataObject.getString(DeclarLogPo.COLUMNS.BILLINGSTAT.name())); 
			declarLogPo.setChargedate(dataObject.getString(DeclarLogPo.COLUMNS.CHARGEDATE.name())); 
			declarLogPo.setMark(dataObject.getString(DeclarLogPo.COLUMNS.MARK.name())); 
			declarLogPo.setAstype(dataObject.getString(DeclarLogPo.COLUMNS.ASTYPE.name())); 
			declarLogPo.setVrno(dataObject.getString(DeclarLogPo.COLUMNS.VRNO.name())); 
			declarLogPo.setSono(dataObject.getString(DeclarLogPo.COLUMNS.SONO.name())); 
			declarLogPo.setProcesstime(dataObject.getString(DeclarLogPo.COLUMNS.PROCESSTIME.name())); 
			declarLogPo.setProcessstate(dataObject.getString(DeclarLogPo.COLUMNS.PROCESSSTATE.name())); 
			return declarLogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DeclarLogPo declarLogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DeclarLogPo.COLUMNS.MSGFUN.name(), declarLogPo.getMsgfun()); 
			dataObject.setValue(DeclarLogPo.COLUMNS.BONDNO.name(), declarLogPo.getBondno()); 
			dataObject.setValue(DeclarLogPo.COLUMNS.STRTYPE.name(), declarLogPo.getStrtype()); 
			dataObject.setValue(DeclarLogPo.COLUMNS.DECLTYPE.name(), declarLogPo.getDecltype()); 
			dataObject.setValue(DeclarLogPo.COLUMNS.DECLNO.name(), declarLogPo.getDeclno()); 
			dataObject.setValue(DeclarLogPo.COLUMNS.IMPORTDATE.name(), declarLogPo.getImportdate()); 
			dataObject.setValue(DeclarLogPo.COLUMNS.DECLDATE.name(), declarLogPo.getDecldate()); 
			dataObject.setValue(DeclarLogPo.COLUMNS.RLSTIME.name(), declarLogPo.getRlstime()); 
			dataObject.setValue(DeclarLogPo.COLUMNS.STGPLACE.name(), declarLogPo.getStgplace()); 
			dataObject.setValue(DeclarLogPo.COLUMNS.NOPKG.name(), declarLogPo.getNopkg()); 
			dataObject.setValue(DeclarLogPo.COLUMNS.PKGUNIT.name(), declarLogPo.getPkgunit()); 
			dataObject.setValue(DeclarLogPo.COLUMNS.GWGT.name(), declarLogPo.getGwgt()); 
			dataObject.setValue(DeclarLogPo.COLUMNS.REFBILLNO.name(), declarLogPo.getRefbillno()); 
			dataObject.setValue(DeclarLogPo.COLUMNS.BOXNO.name(), declarLogPo.getBoxno()); 
			dataObject.setValue(DeclarLogPo.COLUMNS.INBONDNO.name(), declarLogPo.getInbondno()); 
			dataObject.setValue(DeclarLogPo.COLUMNS.OUTBONDNO.name(), declarLogPo.getOutbondno()); 
			dataObject.setValue(DeclarLogPo.COLUMNS.SENDID.name(), declarLogPo.getSendid()); 
			dataObject.setValue(DeclarLogPo.COLUMNS.SENDQULF.name(), declarLogPo.getSendqulf()); 
			dataObject.setValue(DeclarLogPo.COLUMNS.RECVID.name(), declarLogPo.getRecvid()); 
			dataObject.setValue(DeclarLogPo.COLUMNS.RECVQULF.name(), declarLogPo.getRecvqulf()); 
			dataObject.setValue(DeclarLogPo.COLUMNS.RLSFLAG.name(), declarLogPo.getRlsflag()); 
			dataObject.setValue(DeclarLogPo.COLUMNS.MAWBNO.name(), declarLogPo.getMawbno()); 
			dataObject.setValue(DeclarLogPo.COLUMNS.HAWBNO.name(), declarLogPo.getHawbno()); 
			dataObject.setValue(DeclarLogPo.COLUMNS.OWNERBAN.name(), declarLogPo.getOwnerban()); 
			dataObject.setValue(DeclarLogPo.COLUMNS.ICONFIRMED.name(), declarLogPo.getIconfirmed()); 
			dataObject.setValue(DeclarLogPo.COLUMNS.MONRPT.name(), declarLogPo.getMonrpt()); 
			dataObject.setValue(DeclarLogPo.COLUMNS.MSGTYPE.name(), declarLogPo.getMsgtype()); 
			dataObject.setValue(DeclarLogPo.COLUMNS.UPDTIME.name(), declarLogPo.getUpdtime()); 
			dataObject.setValue(DeclarLogPo.COLUMNS.OTHERS.name(), declarLogPo.getOthers()); 
			dataObject.setValue(DeclarLogPo.COLUMNS.BILLINGSTAT.name(), declarLogPo.getBillingstat()); 
			dataObject.setValue(DeclarLogPo.COLUMNS.CHARGEDATE.name(), declarLogPo.getChargedate()); 
			dataObject.setValue(DeclarLogPo.COLUMNS.MARK.name(), declarLogPo.getMark()); 
			dataObject.setValue(DeclarLogPo.COLUMNS.ASTYPE.name(), declarLogPo.getAstype()); 
			dataObject.setValue(DeclarLogPo.COLUMNS.VRNO.name(), declarLogPo.getVrno()); 
			dataObject.setValue(DeclarLogPo.COLUMNS.SONO.name(), declarLogPo.getSono()); 
			dataObject.setValue(DeclarLogPo.COLUMNS.PROCESSTIME.name(), declarLogPo.getProcesstime()); 
			dataObject.setValue(DeclarLogPo.COLUMNS.PROCESSSTATE.name(), declarLogPo.getProcessstate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DeclarLogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DeclarLogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
