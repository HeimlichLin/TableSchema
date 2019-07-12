package com.doc.common.dao.impl; 
 
public class DeclarDAO extends GeneralDAOImpl<DeclarDo> implements DeclarDAO { 
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
		sqlWhere.add(DeclarDo.COLUMNS.MSGFUN.name(), po.getMsgfun()); 
		sqlWhere.add(DeclarDo.COLUMNS.DECLTYPE.name(), po.getDecltype()); 
		sqlWhere.add(DeclarDo.COLUMNS.IMPORTDATE.name(), po.getImportdate()); 
		sqlWhere.add(DeclarDo.COLUMNS.DECLDATE.name(), po.getDecldate()); 
		sqlWhere.add(DeclarDo.COLUMNS.RLSTIME.name(), po.getRlstime()); 
		sqlWhere.add(DeclarDo.COLUMNS.STGPLACE.name(), po.getStgplace()); 
		sqlWhere.add(DeclarDo.COLUMNS.NOPKG.name(), po.getNopkg()); 
		sqlWhere.add(DeclarDo.COLUMNS.PKGUNIT.name(), po.getPkgunit()); 
		sqlWhere.add(DeclarDo.COLUMNS.GWGT.name(), po.getGwgt()); 
		sqlWhere.add(DeclarDo.COLUMNS.REFBILLNO.name(), po.getRefbillno()); 
		sqlWhere.add(DeclarDo.COLUMNS.BOXNO.name(), po.getBoxno()); 
		sqlWhere.add(DeclarDo.COLUMNS.INBONDNO.name(), po.getInbondno()); 
		sqlWhere.add(DeclarDo.COLUMNS.OUTBONDNO.name(), po.getOutbondno()); 
		sqlWhere.add(DeclarDo.COLUMNS.SENDID.name(), po.getSendid()); 
		sqlWhere.add(DeclarDo.COLUMNS.SENDQULF.name(), po.getSendqulf()); 
		sqlWhere.add(DeclarDo.COLUMNS.RECVID.name(), po.getRecvid()); 
		sqlWhere.add(DeclarDo.COLUMNS.RECVQULF.name(), po.getRecvqulf()); 
		sqlWhere.add(DeclarDo.COLUMNS.RLSFLAG.name(), po.getRlsflag()); 
		sqlWhere.add(DeclarDo.COLUMNS.MAWBNO.name(), po.getMawbno()); 
		sqlWhere.add(DeclarDo.COLUMNS.HAWBNO.name(), po.getHawbno()); 
		sqlWhere.add(DeclarDo.COLUMNS.OWNERBAN.name(), po.getOwnerban()); 
		sqlWhere.add(DeclarDo.COLUMNS.ICONFIRMED.name(), po.getIconfirmed()); 
		sqlWhere.add(DeclarDo.COLUMNS.MONRPT.name(), po.getMonrpt()); 
		sqlWhere.add(DeclarDo.COLUMNS.UPDTIME.name(), po.getUpdtime()); 
		sqlWhere.add(DeclarDo.COLUMNS.OTHERS.name(), po.getOthers()); 
		sqlWhere.add(DeclarDo.COLUMNS.BILLINGSTAT.name(), po.getBillingstat()); 
		sqlWhere.add(DeclarDo.COLUMNS.CHARGEDATE.name(), po.getChargedate()); 
		sqlWhere.add(DeclarDo.COLUMNS.MARK.name(), po.getMark()); 
		sqlWhere.add(DeclarDo.COLUMNS.VRNO.name(), po.getVrno()); 
		sqlWhere.add(DeclarDo.COLUMNS.SONO.name(), po.getSono()); 
	} 
 
} 
