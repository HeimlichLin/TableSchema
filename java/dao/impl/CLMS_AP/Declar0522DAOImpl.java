package com.doc.common.dao.impl; 
 
public class Declar0522DAOImpl extends GeneralDAOImpl<Declar0522Po> implements Declar0522DAO { 
	public static final Declar0522DAOImpl INSTANCE = new Declar0522DAOImpl(); 
	public static final String TABLENAME = "DECLAR0522"; 

	public Declar0522DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Declar0522Po> CONVERTER = new MapConverter<Declar0522Po>() { 
 
		@Override 
		public Declar0522Po convert(final DataObject dataObject) { 
			final Declar0522Po declar0522Po = new Declar0522Po(); 
			declar0522Po.setMsgfun(dataObject.getString(Declar0522Po.COLUMNS.MSGFUN.name())); 
			declar0522Po.setBondno(dataObject.getString(Declar0522Po.COLUMNS.BONDNO.name())); 
			declar0522Po.setStrtype(dataObject.getString(Declar0522Po.COLUMNS.STRTYPE.name())); 
			declar0522Po.setDecltype(dataObject.getString(Declar0522Po.COLUMNS.DECLTYPE.name())); 
			declar0522Po.setDeclno(dataObject.getString(Declar0522Po.COLUMNS.DECLNO.name())); 
			declar0522Po.setImportdate(TimestampUtils.of(dataObject.getValue(Declar0522Po.COLUMNS.IMPORTDATE.name()))); 
			declar0522Po.setDecldate(TimestampUtils.of(dataObject.getValue(Declar0522Po.COLUMNS.DECLDATE.name()))); 
			declar0522Po.setRlstime(TimestampUtils.of(dataObject.getValue(Declar0522Po.COLUMNS.RLSTIME.name()))); 
			declar0522Po.setStgplace(dataObject.getString(Declar0522Po.COLUMNS.STGPLACE.name())); 
			declar0522Po.setNopkg(BigDecimalUtils.formObj(dataObject.getValue(Declar0522Po.COLUMNS.NOPKG.name()))); 
			declar0522Po.setPkgunit(dataObject.getString(Declar0522Po.COLUMNS.PKGUNIT.name())); 
			declar0522Po.setGwgt(BigDecimalUtils.formObj(dataObject.getValue(Declar0522Po.COLUMNS.GWGT.name()))); 
			declar0522Po.setRefbillno(dataObject.getString(Declar0522Po.COLUMNS.REFBILLNO.name())); 
			declar0522Po.setBoxno(dataObject.getString(Declar0522Po.COLUMNS.BOXNO.name())); 
			declar0522Po.setInbondno(dataObject.getString(Declar0522Po.COLUMNS.INBONDNO.name())); 
			declar0522Po.setOutbondno(dataObject.getString(Declar0522Po.COLUMNS.OUTBONDNO.name())); 
			declar0522Po.setSendid(dataObject.getString(Declar0522Po.COLUMNS.SENDID.name())); 
			declar0522Po.setSendqulf(dataObject.getString(Declar0522Po.COLUMNS.SENDQULF.name())); 
			declar0522Po.setRecvid(dataObject.getString(Declar0522Po.COLUMNS.RECVID.name())); 
			declar0522Po.setRecvqulf(dataObject.getString(Declar0522Po.COLUMNS.RECVQULF.name())); 
			declar0522Po.setRlsflag(dataObject.getString(Declar0522Po.COLUMNS.RLSFLAG.name())); 
			declar0522Po.setMawbno(dataObject.getString(Declar0522Po.COLUMNS.MAWBNO.name())); 
			declar0522Po.setHawbno(dataObject.getString(Declar0522Po.COLUMNS.HAWBNO.name())); 
			declar0522Po.setOwnerban(dataObject.getString(Declar0522Po.COLUMNS.OWNERBAN.name())); 
			declar0522Po.setIconfirmed(dataObject.getString(Declar0522Po.COLUMNS.ICONFIRMED.name())); 
			declar0522Po.setMonrpt(dataObject.getString(Declar0522Po.COLUMNS.MONRPT.name())); 
			declar0522Po.setMsgtype(dataObject.getString(Declar0522Po.COLUMNS.MSGTYPE.name())); 
			declar0522Po.setUpdtime(dataObject.getString(Declar0522Po.COLUMNS.UPDTIME.name())); 
			declar0522Po.setOthers(dataObject.getString(Declar0522Po.COLUMNS.OTHERS.name())); 
			declar0522Po.setBillingstat(dataObject.getString(Declar0522Po.COLUMNS.BILLINGSTAT.name())); 
			declar0522Po.setChargedate(dataObject.getString(Declar0522Po.COLUMNS.CHARGEDATE.name())); 
			return declar0522Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Declar0522Po declar0522Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Declar0522Po.COLUMNS.MSGFUN.name(), declar0522Po.getMsgfun()); 
			dataObject.setValue(Declar0522Po.COLUMNS.BONDNO.name(), declar0522Po.getBondno()); 
			dataObject.setValue(Declar0522Po.COLUMNS.STRTYPE.name(), declar0522Po.getStrtype()); 
			dataObject.setValue(Declar0522Po.COLUMNS.DECLTYPE.name(), declar0522Po.getDecltype()); 
			dataObject.setValue(Declar0522Po.COLUMNS.DECLNO.name(), declar0522Po.getDeclno()); 
			dataObject.setValue(Declar0522Po.COLUMNS.IMPORTDATE.name(), declar0522Po.getImportdate()); 
			dataObject.setValue(Declar0522Po.COLUMNS.DECLDATE.name(), declar0522Po.getDecldate()); 
			dataObject.setValue(Declar0522Po.COLUMNS.RLSTIME.name(), declar0522Po.getRlstime()); 
			dataObject.setValue(Declar0522Po.COLUMNS.STGPLACE.name(), declar0522Po.getStgplace()); 
			dataObject.setValue(Declar0522Po.COLUMNS.NOPKG.name(), declar0522Po.getNopkg()); 
			dataObject.setValue(Declar0522Po.COLUMNS.PKGUNIT.name(), declar0522Po.getPkgunit()); 
			dataObject.setValue(Declar0522Po.COLUMNS.GWGT.name(), declar0522Po.getGwgt()); 
			dataObject.setValue(Declar0522Po.COLUMNS.REFBILLNO.name(), declar0522Po.getRefbillno()); 
			dataObject.setValue(Declar0522Po.COLUMNS.BOXNO.name(), declar0522Po.getBoxno()); 
			dataObject.setValue(Declar0522Po.COLUMNS.INBONDNO.name(), declar0522Po.getInbondno()); 
			dataObject.setValue(Declar0522Po.COLUMNS.OUTBONDNO.name(), declar0522Po.getOutbondno()); 
			dataObject.setValue(Declar0522Po.COLUMNS.SENDID.name(), declar0522Po.getSendid()); 
			dataObject.setValue(Declar0522Po.COLUMNS.SENDQULF.name(), declar0522Po.getSendqulf()); 
			dataObject.setValue(Declar0522Po.COLUMNS.RECVID.name(), declar0522Po.getRecvid()); 
			dataObject.setValue(Declar0522Po.COLUMNS.RECVQULF.name(), declar0522Po.getRecvqulf()); 
			dataObject.setValue(Declar0522Po.COLUMNS.RLSFLAG.name(), declar0522Po.getRlsflag()); 
			dataObject.setValue(Declar0522Po.COLUMNS.MAWBNO.name(), declar0522Po.getMawbno()); 
			dataObject.setValue(Declar0522Po.COLUMNS.HAWBNO.name(), declar0522Po.getHawbno()); 
			dataObject.setValue(Declar0522Po.COLUMNS.OWNERBAN.name(), declar0522Po.getOwnerban()); 
			dataObject.setValue(Declar0522Po.COLUMNS.ICONFIRMED.name(), declar0522Po.getIconfirmed()); 
			dataObject.setValue(Declar0522Po.COLUMNS.MONRPT.name(), declar0522Po.getMonrpt()); 
			dataObject.setValue(Declar0522Po.COLUMNS.MSGTYPE.name(), declar0522Po.getMsgtype()); 
			dataObject.setValue(Declar0522Po.COLUMNS.UPDTIME.name(), declar0522Po.getUpdtime()); 
			dataObject.setValue(Declar0522Po.COLUMNS.OTHERS.name(), declar0522Po.getOthers()); 
			dataObject.setValue(Declar0522Po.COLUMNS.BILLINGSTAT.name(), declar0522Po.getBillingstat()); 
			dataObject.setValue(Declar0522Po.COLUMNS.CHARGEDATE.name(), declar0522Po.getChargedate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Declar0522Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Declar0522Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
