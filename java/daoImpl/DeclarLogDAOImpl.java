package com.doc.common.dao.impl; 
 
public class DeclarLogDAOImpl extends GeneralDAOImpl<DeclarLogDo> implements DeclarLogDAOImpl { 
	public static final DeclarLogDAOImpl INSTANCE = new DeclarLogDAOImpl(); 
	public static final String TABLENAME = "DECLAR_LOG"; 

	public DeclarLogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<DeclarLogDo> CONVERTER = new MapConverter<DeclarLogDo>() { 
 
		@Override 
		public DeclarLogDo convert(final DataObject dataObject) { 
			final DeclarLogDo declarLogDo = new DeclarLogDo(); 
			declarLogDo.setMsgfun(dataObject.getString(DeclarLogDo.COLUMNS.MSGFUN.name())); 
			declarLogDo.setBondno(dataObject.getString(DeclarLogDo.COLUMNS.BONDNO.name())); 
			declarLogDo.setStrtype(dataObject.getString(DeclarLogDo.COLUMNS.STRTYPE.name())); 
			declarLogDo.setDecltype(dataObject.getString(DeclarLogDo.COLUMNS.DECLTYPE.name())); 
			declarLogDo.setDeclno(dataObject.getString(DeclarLogDo.COLUMNS.DECLNO.name())); 
			declarLogDo.setImportdate(CommUtils.objConver2Time(dataObject.getString(DeclarLogDo.COLUMNS.IMPORTDATE.name()))); 
			declarLogDo.setDecldate(CommUtils.objConver2Time(dataObject.getString(DeclarLogDo.COLUMNS.DECLDATE.name()))); 
			declarLogDo.setRlstime(CommUtils.objConver2Time(dataObject.getString(DeclarLogDo.COLUMNS.RLSTIME.name()))); 
			declarLogDo.setStgplace(dataObject.getString(DeclarLogDo.COLUMNS.STGPLACE.name())); 
			declarLogDo.setNopkg(BigDecimalUtils.formObj(dataObject.getString(DeclarLogDo.COLUMNS.NOPKG.name()))); 
			declarLogDo.setPkgunit(dataObject.getString(DeclarLogDo.COLUMNS.PKGUNIT.name())); 
			declarLogDo.setGwgt(BigDecimalUtils.formObj(dataObject.getString(DeclarLogDo.COLUMNS.GWGT.name()))); 
			declarLogDo.setRefbillno(dataObject.getString(DeclarLogDo.COLUMNS.REFBILLNO.name())); 
			declarLogDo.setBoxno(dataObject.getString(DeclarLogDo.COLUMNS.BOXNO.name())); 
			declarLogDo.setInbondno(dataObject.getString(DeclarLogDo.COLUMNS.INBONDNO.name())); 
			declarLogDo.setOutbondno(dataObject.getString(DeclarLogDo.COLUMNS.OUTBONDNO.name())); 
			declarLogDo.setSendid(dataObject.getString(DeclarLogDo.COLUMNS.SENDID.name())); 
			declarLogDo.setSendqulf(dataObject.getString(DeclarLogDo.COLUMNS.SENDQULF.name())); 
			declarLogDo.setRecvid(dataObject.getString(DeclarLogDo.COLUMNS.RECVID.name())); 
			declarLogDo.setRecvqulf(dataObject.getString(DeclarLogDo.COLUMNS.RECVQULF.name())); 
			declarLogDo.setRlsflag(dataObject.getString(DeclarLogDo.COLUMNS.RLSFLAG.name())); 
			declarLogDo.setMawbno(dataObject.getString(DeclarLogDo.COLUMNS.MAWBNO.name())); 
			declarLogDo.setHawbno(dataObject.getString(DeclarLogDo.COLUMNS.HAWBNO.name())); 
			declarLogDo.setOwnerban(dataObject.getString(DeclarLogDo.COLUMNS.OWNERBAN.name())); 
			declarLogDo.setIconfirmed(dataObject.getString(DeclarLogDo.COLUMNS.ICONFIRMED.name())); 
			declarLogDo.setMonrpt(dataObject.getString(DeclarLogDo.COLUMNS.MONRPT.name())); 
			declarLogDo.setMsgtype(dataObject.getString(DeclarLogDo.COLUMNS.MSGTYPE.name())); 
			declarLogDo.setUpdtime(dataObject.getString(DeclarLogDo.COLUMNS.UPDTIME.name())); 
			declarLogDo.setOthers(dataObject.getString(DeclarLogDo.COLUMNS.OTHERS.name())); 
			declarLogDo.setBillingstat(dataObject.getString(DeclarLogDo.COLUMNS.BILLINGSTAT.name())); 
			declarLogDo.setChargedate(dataObject.getString(DeclarLogDo.COLUMNS.CHARGEDATE.name())); 
			declarLogDo.setMark(dataObject.getString(DeclarLogDo.COLUMNS.MARK.name())); 
			declarLogDo.setAstype(dataObject.getString(DeclarLogDo.COLUMNS.ASTYPE.name())); 
			declarLogDo.setVrno(dataObject.getString(DeclarLogDo.COLUMNS.VRNO.name())); 
			declarLogDo.setSono(dataObject.getString(DeclarLogDo.COLUMNS.SONO.name())); 
			declarLogDo.setProcesstime(dataObject.getString(DeclarLogDo.COLUMNS.PROCESSTIME.name())); 
			declarLogDo.setProcessstate(dataObject.getString(DeclarLogDo.COLUMNS.PROCESSSTATE.name())); 
			return declarLogDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DeclarLogDo declarLogDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DeclarLogDo.COLUMNS.MSGFUN.name(), declarLogDo.getMsgfun()); 
			dataObject.setValue(DeclarLogDo.COLUMNS.BONDNO.name(), declarLogDo.getBondno()); 
			dataObject.setValue(DeclarLogDo.COLUMNS.STRTYPE.name(), declarLogDo.getStrtype()); 
			dataObject.setValue(DeclarLogDo.COLUMNS.DECLTYPE.name(), declarLogDo.getDecltype()); 
			dataObject.setValue(DeclarLogDo.COLUMNS.DECLNO.name(), declarLogDo.getDeclno()); 
			dataObject.setValue(DeclarLogDo.COLUMNS.IMPORTDATE.name(), declarLogDo.getImportdate()); 
			dataObject.setValue(DeclarLogDo.COLUMNS.DECLDATE.name(), declarLogDo.getDecldate()); 
			dataObject.setValue(DeclarLogDo.COLUMNS.RLSTIME.name(), declarLogDo.getRlstime()); 
			dataObject.setValue(DeclarLogDo.COLUMNS.STGPLACE.name(), declarLogDo.getStgplace()); 
			dataObject.setValue(DeclarLogDo.COLUMNS.NOPKG.name(), declarLogDo.getNopkg()); 
			dataObject.setValue(DeclarLogDo.COLUMNS.PKGUNIT.name(), declarLogDo.getPkgunit()); 
			dataObject.setValue(DeclarLogDo.COLUMNS.GWGT.name(), declarLogDo.getGwgt()); 
			dataObject.setValue(DeclarLogDo.COLUMNS.REFBILLNO.name(), declarLogDo.getRefbillno()); 
			dataObject.setValue(DeclarLogDo.COLUMNS.BOXNO.name(), declarLogDo.getBoxno()); 
			dataObject.setValue(DeclarLogDo.COLUMNS.INBONDNO.name(), declarLogDo.getInbondno()); 
			dataObject.setValue(DeclarLogDo.COLUMNS.OUTBONDNO.name(), declarLogDo.getOutbondno()); 
			dataObject.setValue(DeclarLogDo.COLUMNS.SENDID.name(), declarLogDo.getSendid()); 
			dataObject.setValue(DeclarLogDo.COLUMNS.SENDQULF.name(), declarLogDo.getSendqulf()); 
			dataObject.setValue(DeclarLogDo.COLUMNS.RECVID.name(), declarLogDo.getRecvid()); 
			dataObject.setValue(DeclarLogDo.COLUMNS.RECVQULF.name(), declarLogDo.getRecvqulf()); 
			dataObject.setValue(DeclarLogDo.COLUMNS.RLSFLAG.name(), declarLogDo.getRlsflag()); 
			dataObject.setValue(DeclarLogDo.COLUMNS.MAWBNO.name(), declarLogDo.getMawbno()); 
			dataObject.setValue(DeclarLogDo.COLUMNS.HAWBNO.name(), declarLogDo.getHawbno()); 
			dataObject.setValue(DeclarLogDo.COLUMNS.OWNERBAN.name(), declarLogDo.getOwnerban()); 
			dataObject.setValue(DeclarLogDo.COLUMNS.ICONFIRMED.name(), declarLogDo.getIconfirmed()); 
			dataObject.setValue(DeclarLogDo.COLUMNS.MONRPT.name(), declarLogDo.getMonrpt()); 
			dataObject.setValue(DeclarLogDo.COLUMNS.MSGTYPE.name(), declarLogDo.getMsgtype()); 
			dataObject.setValue(DeclarLogDo.COLUMNS.UPDTIME.name(), declarLogDo.getUpdtime()); 
			dataObject.setValue(DeclarLogDo.COLUMNS.OTHERS.name(), declarLogDo.getOthers()); 
			dataObject.setValue(DeclarLogDo.COLUMNS.BILLINGSTAT.name(), declarLogDo.getBillingstat()); 
			dataObject.setValue(DeclarLogDo.COLUMNS.CHARGEDATE.name(), declarLogDo.getChargedate()); 
			dataObject.setValue(DeclarLogDo.COLUMNS.MARK.name(), declarLogDo.getMark()); 
			dataObject.setValue(DeclarLogDo.COLUMNS.ASTYPE.name(), declarLogDo.getAstype()); 
			dataObject.setValue(DeclarLogDo.COLUMNS.VRNO.name(), declarLogDo.getVrno()); 
			dataObject.setValue(DeclarLogDo.COLUMNS.SONO.name(), declarLogDo.getSono()); 
			dataObject.setValue(DeclarLogDo.COLUMNS.PROCESSTIME.name(), declarLogDo.getProcesstime()); 
			dataObject.setValue(DeclarLogDo.COLUMNS.PROCESSSTATE.name(), declarLogDo.getProcessstate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DeclarLogDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DeclarLogDo po) { 
	} 
 
} 
