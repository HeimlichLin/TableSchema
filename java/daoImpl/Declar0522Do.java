package com.doc.common.dao.impl; 
 
public class Declar0522DAO extends GeneralDAOImpl<Declar0522Do> implements Declar0522DAO { 
	public static final Declar0522DAOImpl INSTANCE = new Declar0522DAOImpl(); 
	public static final String TABLENAME = "DECLAR0522"; 

	public Declar0522DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<Declar0522Do> CONVERTER = new MapConverter<Declar0522Do>() { 
 
		@Override 
		public Declar0522Do convert(final DataObject dataObject) { 
			final Declar0522Do declar0522Do = new Declar0522Do(); 
			declar0522Do.setMsgfun(dataObject.getString(Declar0522Do.COLUMNS.MSGFUN.name())); 
			declar0522Do.setBondno(dataObject.getString(Declar0522Do.COLUMNS.BONDNO.name())); 
			declar0522Do.setStrtype(dataObject.getString(Declar0522Do.COLUMNS.STRTYPE.name())); 
			declar0522Do.setDecltype(dataObject.getString(Declar0522Do.COLUMNS.DECLTYPE.name())); 
			declar0522Do.setDeclno(dataObject.getString(Declar0522Do.COLUMNS.DECLNO.name())); 
			declar0522Do.setImportdate(CommUtils.objConver2Time(dataObject.getString(Declar0522Do.COLUMNS.IMPORTDATE.name()))); 
			declar0522Do.setDecldate(CommUtils.objConver2Time(dataObject.getString(Declar0522Do.COLUMNS.DECLDATE.name()))); 
			declar0522Do.setRlstime(CommUtils.objConver2Time(dataObject.getString(Declar0522Do.COLUMNS.RLSTIME.name()))); 
			declar0522Do.setStgplace(dataObject.getString(Declar0522Do.COLUMNS.STGPLACE.name())); 
			declar0522Do.setNopkg(BigDecimalUtils.formObj(dataObject.getString(Declar0522Do.COLUMNS.NOPKG.name()))); 
			declar0522Do.setPkgunit(dataObject.getString(Declar0522Do.COLUMNS.PKGUNIT.name())); 
			declar0522Do.setGwgt(BigDecimalUtils.formObj(dataObject.getString(Declar0522Do.COLUMNS.GWGT.name()))); 
			declar0522Do.setRefbillno(dataObject.getString(Declar0522Do.COLUMNS.REFBILLNO.name())); 
			declar0522Do.setBoxno(dataObject.getString(Declar0522Do.COLUMNS.BOXNO.name())); 
			declar0522Do.setInbondno(dataObject.getString(Declar0522Do.COLUMNS.INBONDNO.name())); 
			declar0522Do.setOutbondno(dataObject.getString(Declar0522Do.COLUMNS.OUTBONDNO.name())); 
			declar0522Do.setSendid(dataObject.getString(Declar0522Do.COLUMNS.SENDID.name())); 
			declar0522Do.setSendqulf(dataObject.getString(Declar0522Do.COLUMNS.SENDQULF.name())); 
			declar0522Do.setRecvid(dataObject.getString(Declar0522Do.COLUMNS.RECVID.name())); 
			declar0522Do.setRecvqulf(dataObject.getString(Declar0522Do.COLUMNS.RECVQULF.name())); 
			declar0522Do.setRlsflag(dataObject.getString(Declar0522Do.COLUMNS.RLSFLAG.name())); 
			declar0522Do.setMawbno(dataObject.getString(Declar0522Do.COLUMNS.MAWBNO.name())); 
			declar0522Do.setHawbno(dataObject.getString(Declar0522Do.COLUMNS.HAWBNO.name())); 
			declar0522Do.setOwnerban(dataObject.getString(Declar0522Do.COLUMNS.OWNERBAN.name())); 
			declar0522Do.setIconfirmed(dataObject.getString(Declar0522Do.COLUMNS.ICONFIRMED.name())); 
			declar0522Do.setMonrpt(dataObject.getString(Declar0522Do.COLUMNS.MONRPT.name())); 
			declar0522Do.setMsgtype(dataObject.getString(Declar0522Do.COLUMNS.MSGTYPE.name())); 
			declar0522Do.setUpdtime(dataObject.getString(Declar0522Do.COLUMNS.UPDTIME.name())); 
			declar0522Do.setOthers(dataObject.getString(Declar0522Do.COLUMNS.OTHERS.name())); 
			declar0522Do.setBillingstat(dataObject.getString(Declar0522Do.COLUMNS.BILLINGSTAT.name())); 
			declar0522Do.setChargedate(dataObject.getString(Declar0522Do.COLUMNS.CHARGEDATE.name())); 
			return declar0522Do; 
		} 
 
		@Override 
		public DataObject toDataObject(final Declar0522Do declar0522Do) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Declar0522Do.COLUMNS.MSGFUN.name(), declar0522Do.getMsgfun()); 
			dataObject.setValue(Declar0522Do.COLUMNS.BONDNO.name(), declar0522Do.getBondno()); 
			dataObject.setValue(Declar0522Do.COLUMNS.STRTYPE.name(), declar0522Do.getStrtype()); 
			dataObject.setValue(Declar0522Do.COLUMNS.DECLTYPE.name(), declar0522Do.getDecltype()); 
			dataObject.setValue(Declar0522Do.COLUMNS.DECLNO.name(), declar0522Do.getDeclno()); 
			dataObject.setValue(Declar0522Do.COLUMNS.IMPORTDATE.name(), declar0522Do.getImportdate()); 
			dataObject.setValue(Declar0522Do.COLUMNS.DECLDATE.name(), declar0522Do.getDecldate()); 
			dataObject.setValue(Declar0522Do.COLUMNS.RLSTIME.name(), declar0522Do.getRlstime()); 
			dataObject.setValue(Declar0522Do.COLUMNS.STGPLACE.name(), declar0522Do.getStgplace()); 
			dataObject.setValue(Declar0522Do.COLUMNS.NOPKG.name(), declar0522Do.getNopkg()); 
			dataObject.setValue(Declar0522Do.COLUMNS.PKGUNIT.name(), declar0522Do.getPkgunit()); 
			dataObject.setValue(Declar0522Do.COLUMNS.GWGT.name(), declar0522Do.getGwgt()); 
			dataObject.setValue(Declar0522Do.COLUMNS.REFBILLNO.name(), declar0522Do.getRefbillno()); 
			dataObject.setValue(Declar0522Do.COLUMNS.BOXNO.name(), declar0522Do.getBoxno()); 
			dataObject.setValue(Declar0522Do.COLUMNS.INBONDNO.name(), declar0522Do.getInbondno()); 
			dataObject.setValue(Declar0522Do.COLUMNS.OUTBONDNO.name(), declar0522Do.getOutbondno()); 
			dataObject.setValue(Declar0522Do.COLUMNS.SENDID.name(), declar0522Do.getSendid()); 
			dataObject.setValue(Declar0522Do.COLUMNS.SENDQULF.name(), declar0522Do.getSendqulf()); 
			dataObject.setValue(Declar0522Do.COLUMNS.RECVID.name(), declar0522Do.getRecvid()); 
			dataObject.setValue(Declar0522Do.COLUMNS.RECVQULF.name(), declar0522Do.getRecvqulf()); 
			dataObject.setValue(Declar0522Do.COLUMNS.RLSFLAG.name(), declar0522Do.getRlsflag()); 
			dataObject.setValue(Declar0522Do.COLUMNS.MAWBNO.name(), declar0522Do.getMawbno()); 
			dataObject.setValue(Declar0522Do.COLUMNS.HAWBNO.name(), declar0522Do.getHawbno()); 
			dataObject.setValue(Declar0522Do.COLUMNS.OWNERBAN.name(), declar0522Do.getOwnerban()); 
			dataObject.setValue(Declar0522Do.COLUMNS.ICONFIRMED.name(), declar0522Do.getIconfirmed()); 
			dataObject.setValue(Declar0522Do.COLUMNS.MONRPT.name(), declar0522Do.getMonrpt()); 
			dataObject.setValue(Declar0522Do.COLUMNS.MSGTYPE.name(), declar0522Do.getMsgtype()); 
			dataObject.setValue(Declar0522Do.COLUMNS.UPDTIME.name(), declar0522Do.getUpdtime()); 
			dataObject.setValue(Declar0522Do.COLUMNS.OTHERS.name(), declar0522Do.getOthers()); 
			dataObject.setValue(Declar0522Do.COLUMNS.BILLINGSTAT.name(), declar0522Do.getBillingstat()); 
			dataObject.setValue(Declar0522Do.COLUMNS.CHARGEDATE.name(), declar0522Do.getChargedate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Declar0522Do> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Declar0522Do po) { 
		sqlWhere.add(Declar0522Do.COLUMNS.MSGFUN.name(), po.getMsgfun()); 
		sqlWhere.add(Declar0522Do.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(Declar0522Do.COLUMNS.STRTYPE.name(), po.getStrtype()); 
		sqlWhere.add(Declar0522Do.COLUMNS.DECLTYPE.name(), po.getDecltype()); 
		sqlWhere.add(Declar0522Do.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(Declar0522Do.COLUMNS.IMPORTDATE.name(), po.getImportdate()); 
		sqlWhere.add(Declar0522Do.COLUMNS.DECLDATE.name(), po.getDecldate()); 
		sqlWhere.add(Declar0522Do.COLUMNS.RLSTIME.name(), po.getRlstime()); 
		sqlWhere.add(Declar0522Do.COLUMNS.STGPLACE.name(), po.getStgplace()); 
		sqlWhere.add(Declar0522Do.COLUMNS.NOPKG.name(), po.getNopkg()); 
		sqlWhere.add(Declar0522Do.COLUMNS.PKGUNIT.name(), po.getPkgunit()); 
		sqlWhere.add(Declar0522Do.COLUMNS.GWGT.name(), po.getGwgt()); 
		sqlWhere.add(Declar0522Do.COLUMNS.REFBILLNO.name(), po.getRefbillno()); 
		sqlWhere.add(Declar0522Do.COLUMNS.BOXNO.name(), po.getBoxno()); 
		sqlWhere.add(Declar0522Do.COLUMNS.INBONDNO.name(), po.getInbondno()); 
		sqlWhere.add(Declar0522Do.COLUMNS.OUTBONDNO.name(), po.getOutbondno()); 
		sqlWhere.add(Declar0522Do.COLUMNS.SENDID.name(), po.getSendid()); 
		sqlWhere.add(Declar0522Do.COLUMNS.SENDQULF.name(), po.getSendqulf()); 
		sqlWhere.add(Declar0522Do.COLUMNS.RECVID.name(), po.getRecvid()); 
		sqlWhere.add(Declar0522Do.COLUMNS.RECVQULF.name(), po.getRecvqulf()); 
		sqlWhere.add(Declar0522Do.COLUMNS.RLSFLAG.name(), po.getRlsflag()); 
		sqlWhere.add(Declar0522Do.COLUMNS.MAWBNO.name(), po.getMawbno()); 
		sqlWhere.add(Declar0522Do.COLUMNS.HAWBNO.name(), po.getHawbno()); 
		sqlWhere.add(Declar0522Do.COLUMNS.OWNERBAN.name(), po.getOwnerban()); 
		sqlWhere.add(Declar0522Do.COLUMNS.ICONFIRMED.name(), po.getIconfirmed()); 
		sqlWhere.add(Declar0522Do.COLUMNS.MONRPT.name(), po.getMonrpt()); 
		sqlWhere.add(Declar0522Do.COLUMNS.MSGTYPE.name(), po.getMsgtype()); 
		sqlWhere.add(Declar0522Do.COLUMNS.UPDTIME.name(), po.getUpdtime()); 
		sqlWhere.add(Declar0522Do.COLUMNS.OTHERS.name(), po.getOthers()); 
		sqlWhere.add(Declar0522Do.COLUMNS.BILLINGSTAT.name(), po.getBillingstat()); 
		sqlWhere.add(Declar0522Do.COLUMNS.CHARGEDATE.name(), po.getChargedate()); 
	} 
 
} 
