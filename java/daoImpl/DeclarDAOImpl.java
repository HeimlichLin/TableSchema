package com.doc.common.dao.impl; 
 
public class DeclarDAOImpl extends GeneralDAOImpl<DeclarDo> implements DeclarDAOImpl { 
	public static final DeclarDAOImpl INSTANCE = new DeclarDAOImpl(); 
	public static final String TABLENAME = "DECLAR"; 

	public DeclarDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<DeclarDo> CONVERTER = new MapConverter<DeclarDo>() { 
 
		@Override 
		public DeclarDo convert(final DataObject dataObject) { 
			final DeclarDo declarDo = new DeclarDo(); 
			declarDo.setMsgfun(dataObject.getString(DeclarDo.COLUMNS.MSGFUN.name())); 
			declarDo.setBondno(dataObject.getString(DeclarDo.COLUMNS.BONDNO.name())); 
			declarDo.setStrtype(dataObject.getString(DeclarDo.COLUMNS.STRTYPE.name())); 
			declarDo.setDecltype(dataObject.getString(DeclarDo.COLUMNS.DECLTYPE.name())); 
			declarDo.setDeclno(dataObject.getString(DeclarDo.COLUMNS.DECLNO.name())); 
			declarDo.setImportdate(CommUtils.objConver2Time(dataObject.getString(DeclarDo.COLUMNS.IMPORTDATE.name()))); 
			declarDo.setDecldate(CommUtils.objConver2Time(dataObject.getString(DeclarDo.COLUMNS.DECLDATE.name()))); 
			declarDo.setRlstime(CommUtils.objConver2Time(dataObject.getString(DeclarDo.COLUMNS.RLSTIME.name()))); 
			declarDo.setStgplace(dataObject.getString(DeclarDo.COLUMNS.STGPLACE.name())); 
			declarDo.setNopkg(BigDecimalUtils.formObj(dataObject.getString(DeclarDo.COLUMNS.NOPKG.name()))); 
			declarDo.setPkgunit(dataObject.getString(DeclarDo.COLUMNS.PKGUNIT.name())); 
			declarDo.setGwgt(BigDecimalUtils.formObj(dataObject.getString(DeclarDo.COLUMNS.GWGT.name()))); 
			declarDo.setRefbillno(dataObject.getString(DeclarDo.COLUMNS.REFBILLNO.name())); 
			declarDo.setBoxno(dataObject.getString(DeclarDo.COLUMNS.BOXNO.name())); 
			declarDo.setInbondno(dataObject.getString(DeclarDo.COLUMNS.INBONDNO.name())); 
			declarDo.setOutbondno(dataObject.getString(DeclarDo.COLUMNS.OUTBONDNO.name())); 
			declarDo.setSendid(dataObject.getString(DeclarDo.COLUMNS.SENDID.name())); 
			declarDo.setSendqulf(dataObject.getString(DeclarDo.COLUMNS.SENDQULF.name())); 
			declarDo.setRecvid(dataObject.getString(DeclarDo.COLUMNS.RECVID.name())); 
			declarDo.setRecvqulf(dataObject.getString(DeclarDo.COLUMNS.RECVQULF.name())); 
			declarDo.setRlsflag(dataObject.getString(DeclarDo.COLUMNS.RLSFLAG.name())); 
			declarDo.setMawbno(dataObject.getString(DeclarDo.COLUMNS.MAWBNO.name())); 
			declarDo.setHawbno(dataObject.getString(DeclarDo.COLUMNS.HAWBNO.name())); 
			declarDo.setOwnerban(dataObject.getString(DeclarDo.COLUMNS.OWNERBAN.name())); 
			declarDo.setIconfirmed(dataObject.getString(DeclarDo.COLUMNS.ICONFIRMED.name())); 
			declarDo.setMonrpt(dataObject.getString(DeclarDo.COLUMNS.MONRPT.name())); 
			declarDo.setMsgtype(dataObject.getString(DeclarDo.COLUMNS.MSGTYPE.name())); 
			declarDo.setUpdtime(dataObject.getString(DeclarDo.COLUMNS.UPDTIME.name())); 
			declarDo.setOthers(dataObject.getString(DeclarDo.COLUMNS.OTHERS.name())); 
			declarDo.setBillingstat(dataObject.getString(DeclarDo.COLUMNS.BILLINGSTAT.name())); 
			declarDo.setChargedate(dataObject.getString(DeclarDo.COLUMNS.CHARGEDATE.name())); 
			declarDo.setMark(dataObject.getString(DeclarDo.COLUMNS.MARK.name())); 
			declarDo.setAstype(dataObject.getString(DeclarDo.COLUMNS.ASTYPE.name())); 
			declarDo.setVrno(dataObject.getString(DeclarDo.COLUMNS.VRNO.name())); 
			declarDo.setSono(dataObject.getString(DeclarDo.COLUMNS.SONO.name())); 
			return declarDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DeclarDo declarDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DeclarDo.COLUMNS.MSGFUN.name(), declarDo.getMsgfun()); 
			dataObject.setValue(DeclarDo.COLUMNS.BONDNO.name(), declarDo.getBondno()); 
			dataObject.setValue(DeclarDo.COLUMNS.STRTYPE.name(), declarDo.getStrtype()); 
			dataObject.setValue(DeclarDo.COLUMNS.DECLTYPE.name(), declarDo.getDecltype()); 
			dataObject.setValue(DeclarDo.COLUMNS.DECLNO.name(), declarDo.getDeclno()); 
			dataObject.setValue(DeclarDo.COLUMNS.IMPORTDATE.name(), declarDo.getImportdate()); 
			dataObject.setValue(DeclarDo.COLUMNS.DECLDATE.name(), declarDo.getDecldate()); 
			dataObject.setValue(DeclarDo.COLUMNS.RLSTIME.name(), declarDo.getRlstime()); 
			dataObject.setValue(DeclarDo.COLUMNS.STGPLACE.name(), declarDo.getStgplace()); 
			dataObject.setValue(DeclarDo.COLUMNS.NOPKG.name(), declarDo.getNopkg()); 
			dataObject.setValue(DeclarDo.COLUMNS.PKGUNIT.name(), declarDo.getPkgunit()); 
			dataObject.setValue(DeclarDo.COLUMNS.GWGT.name(), declarDo.getGwgt()); 
			dataObject.setValue(DeclarDo.COLUMNS.REFBILLNO.name(), declarDo.getRefbillno()); 
			dataObject.setValue(DeclarDo.COLUMNS.BOXNO.name(), declarDo.getBoxno()); 
			dataObject.setValue(DeclarDo.COLUMNS.INBONDNO.name(), declarDo.getInbondno()); 
			dataObject.setValue(DeclarDo.COLUMNS.OUTBONDNO.name(), declarDo.getOutbondno()); 
			dataObject.setValue(DeclarDo.COLUMNS.SENDID.name(), declarDo.getSendid()); 
			dataObject.setValue(DeclarDo.COLUMNS.SENDQULF.name(), declarDo.getSendqulf()); 
			dataObject.setValue(DeclarDo.COLUMNS.RECVID.name(), declarDo.getRecvid()); 
			dataObject.setValue(DeclarDo.COLUMNS.RECVQULF.name(), declarDo.getRecvqulf()); 
			dataObject.setValue(DeclarDo.COLUMNS.RLSFLAG.name(), declarDo.getRlsflag()); 
			dataObject.setValue(DeclarDo.COLUMNS.MAWBNO.name(), declarDo.getMawbno()); 
			dataObject.setValue(DeclarDo.COLUMNS.HAWBNO.name(), declarDo.getHawbno()); 
			dataObject.setValue(DeclarDo.COLUMNS.OWNERBAN.name(), declarDo.getOwnerban()); 
			dataObject.setValue(DeclarDo.COLUMNS.ICONFIRMED.name(), declarDo.getIconfirmed()); 
			dataObject.setValue(DeclarDo.COLUMNS.MONRPT.name(), declarDo.getMonrpt()); 
			dataObject.setValue(DeclarDo.COLUMNS.MSGTYPE.name(), declarDo.getMsgtype()); 
			dataObject.setValue(DeclarDo.COLUMNS.UPDTIME.name(), declarDo.getUpdtime()); 
			dataObject.setValue(DeclarDo.COLUMNS.OTHERS.name(), declarDo.getOthers()); 
			dataObject.setValue(DeclarDo.COLUMNS.BILLINGSTAT.name(), declarDo.getBillingstat()); 
			dataObject.setValue(DeclarDo.COLUMNS.CHARGEDATE.name(), declarDo.getChargedate()); 
			dataObject.setValue(DeclarDo.COLUMNS.MARK.name(), declarDo.getMark()); 
			dataObject.setValue(DeclarDo.COLUMNS.ASTYPE.name(), declarDo.getAstype()); 
			dataObject.setValue(DeclarDo.COLUMNS.VRNO.name(), declarDo.getVrno()); 
			dataObject.setValue(DeclarDo.COLUMNS.SONO.name(), declarDo.getSono()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DeclarDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DeclarDo po) { 
		sqlWhere.add(DeclarDo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(DeclarDo.COLUMNS.STRTYPE.name(), po.getStrtype()); 
		sqlWhere.add(DeclarDo.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(DeclarDo.COLUMNS.MSGTYPE.name(), po.getMsgtype()); 
		sqlWhere.add(DeclarDo.COLUMNS.ASTYPE.name(), po.getAstype()); 
	} 
 
} 
