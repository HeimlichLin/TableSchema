package com.doc.common.dao.impl; 
 
public class TmpHDeclar20070801DAO extends GeneralDAOImpl<TmpHDeclar20070801Do> implements TmpHDeclar20070801DAO { 
	public static final TmpHDeclar20070801DAOImpl INSTANCE = new TmpHDeclar20070801DAOImpl(); 
	public static final String TABLENAME = "TMP_H_DECLAR_20070801"; 

	public TmpHDeclar20070801DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<TmpHDeclar20070801Do> CONVERTER = new MapConverter<TmpHDeclar20070801Do>() { 
 
		@Override 
		public TmpHDeclar20070801Do convert(final DataObject dataObject) { 
			final TmpHDeclar20070801Do tmpHDeclar20070801Do = new TmpHDeclar20070801Do(); 
			tmpHDeclar20070801Do.setMsgfun(dataObject.getString(TmpHDeclar20070801Do.COLUMNS.MSGFUN.name())); 
			tmpHDeclar20070801Do.setBondno(dataObject.getString(TmpHDeclar20070801Do.COLUMNS.BONDNO.name())); 
			tmpHDeclar20070801Do.setStrtype(dataObject.getString(TmpHDeclar20070801Do.COLUMNS.STRTYPE.name())); 
			tmpHDeclar20070801Do.setDecltype(dataObject.getString(TmpHDeclar20070801Do.COLUMNS.DECLTYPE.name())); 
			tmpHDeclar20070801Do.setDeclno(dataObject.getString(TmpHDeclar20070801Do.COLUMNS.DECLNO.name())); 
			tmpHDeclar20070801Do.setImportdate(CommUtils.objConver2Time(dataObject.getString(TmpHDeclar20070801Do.COLUMNS.IMPORTDATE.name()))); 
			tmpHDeclar20070801Do.setDecldate(CommUtils.objConver2Time(dataObject.getString(TmpHDeclar20070801Do.COLUMNS.DECLDATE.name()))); 
			tmpHDeclar20070801Do.setRlstime(CommUtils.objConver2Time(dataObject.getString(TmpHDeclar20070801Do.COLUMNS.RLSTIME.name()))); 
			tmpHDeclar20070801Do.setStgplace(dataObject.getString(TmpHDeclar20070801Do.COLUMNS.STGPLACE.name())); 
			tmpHDeclar20070801Do.setNopkg(BigDecimalUtils.formObj(dataObject.getString(TmpHDeclar20070801Do.COLUMNS.NOPKG.name()))); 
			tmpHDeclar20070801Do.setPkgunit(dataObject.getString(TmpHDeclar20070801Do.COLUMNS.PKGUNIT.name())); 
			tmpHDeclar20070801Do.setGwgt(BigDecimalUtils.formObj(dataObject.getString(TmpHDeclar20070801Do.COLUMNS.GWGT.name()))); 
			tmpHDeclar20070801Do.setRefbillno(dataObject.getString(TmpHDeclar20070801Do.COLUMNS.REFBILLNO.name())); 
			tmpHDeclar20070801Do.setBoxno(dataObject.getString(TmpHDeclar20070801Do.COLUMNS.BOXNO.name())); 
			tmpHDeclar20070801Do.setInbondno(dataObject.getString(TmpHDeclar20070801Do.COLUMNS.INBONDNO.name())); 
			tmpHDeclar20070801Do.setOutbondno(dataObject.getString(TmpHDeclar20070801Do.COLUMNS.OUTBONDNO.name())); 
			tmpHDeclar20070801Do.setSendid(dataObject.getString(TmpHDeclar20070801Do.COLUMNS.SENDID.name())); 
			tmpHDeclar20070801Do.setSendqulf(dataObject.getString(TmpHDeclar20070801Do.COLUMNS.SENDQULF.name())); 
			tmpHDeclar20070801Do.setRecvid(dataObject.getString(TmpHDeclar20070801Do.COLUMNS.RECVID.name())); 
			tmpHDeclar20070801Do.setRecvqulf(dataObject.getString(TmpHDeclar20070801Do.COLUMNS.RECVQULF.name())); 
			tmpHDeclar20070801Do.setRlsflag(dataObject.getString(TmpHDeclar20070801Do.COLUMNS.RLSFLAG.name())); 
			tmpHDeclar20070801Do.setMawbno(dataObject.getString(TmpHDeclar20070801Do.COLUMNS.MAWBNO.name())); 
			tmpHDeclar20070801Do.setHawbno(dataObject.getString(TmpHDeclar20070801Do.COLUMNS.HAWBNO.name())); 
			tmpHDeclar20070801Do.setOwnerban(dataObject.getString(TmpHDeclar20070801Do.COLUMNS.OWNERBAN.name())); 
			tmpHDeclar20070801Do.setIconfirmed(dataObject.getString(TmpHDeclar20070801Do.COLUMNS.ICONFIRMED.name())); 
			tmpHDeclar20070801Do.setMonrpt(dataObject.getString(TmpHDeclar20070801Do.COLUMNS.MONRPT.name())); 
			tmpHDeclar20070801Do.setUpdtime(dataObject.getString(TmpHDeclar20070801Do.COLUMNS.UPDTIME.name())); 
			tmpHDeclar20070801Do.setMsgtype(dataObject.getString(TmpHDeclar20070801Do.COLUMNS.MSGTYPE.name())); 
			return tmpHDeclar20070801Do; 
		} 
 
		@Override 
		public DataObject toDataObject(final TmpHDeclar20070801Do tmpHDeclar20070801Do) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TmpHDeclar20070801Do.COLUMNS.MSGFUN.name(), tmpHDeclar20070801Do.getMsgfun()); 
			dataObject.setValue(TmpHDeclar20070801Do.COLUMNS.BONDNO.name(), tmpHDeclar20070801Do.getBondno()); 
			dataObject.setValue(TmpHDeclar20070801Do.COLUMNS.STRTYPE.name(), tmpHDeclar20070801Do.getStrtype()); 
			dataObject.setValue(TmpHDeclar20070801Do.COLUMNS.DECLTYPE.name(), tmpHDeclar20070801Do.getDecltype()); 
			dataObject.setValue(TmpHDeclar20070801Do.COLUMNS.DECLNO.name(), tmpHDeclar20070801Do.getDeclno()); 
			dataObject.setValue(TmpHDeclar20070801Do.COLUMNS.IMPORTDATE.name(), tmpHDeclar20070801Do.getImportdate()); 
			dataObject.setValue(TmpHDeclar20070801Do.COLUMNS.DECLDATE.name(), tmpHDeclar20070801Do.getDecldate()); 
			dataObject.setValue(TmpHDeclar20070801Do.COLUMNS.RLSTIME.name(), tmpHDeclar20070801Do.getRlstime()); 
			dataObject.setValue(TmpHDeclar20070801Do.COLUMNS.STGPLACE.name(), tmpHDeclar20070801Do.getStgplace()); 
			dataObject.setValue(TmpHDeclar20070801Do.COLUMNS.NOPKG.name(), tmpHDeclar20070801Do.getNopkg()); 
			dataObject.setValue(TmpHDeclar20070801Do.COLUMNS.PKGUNIT.name(), tmpHDeclar20070801Do.getPkgunit()); 
			dataObject.setValue(TmpHDeclar20070801Do.COLUMNS.GWGT.name(), tmpHDeclar20070801Do.getGwgt()); 
			dataObject.setValue(TmpHDeclar20070801Do.COLUMNS.REFBILLNO.name(), tmpHDeclar20070801Do.getRefbillno()); 
			dataObject.setValue(TmpHDeclar20070801Do.COLUMNS.BOXNO.name(), tmpHDeclar20070801Do.getBoxno()); 
			dataObject.setValue(TmpHDeclar20070801Do.COLUMNS.INBONDNO.name(), tmpHDeclar20070801Do.getInbondno()); 
			dataObject.setValue(TmpHDeclar20070801Do.COLUMNS.OUTBONDNO.name(), tmpHDeclar20070801Do.getOutbondno()); 
			dataObject.setValue(TmpHDeclar20070801Do.COLUMNS.SENDID.name(), tmpHDeclar20070801Do.getSendid()); 
			dataObject.setValue(TmpHDeclar20070801Do.COLUMNS.SENDQULF.name(), tmpHDeclar20070801Do.getSendqulf()); 
			dataObject.setValue(TmpHDeclar20070801Do.COLUMNS.RECVID.name(), tmpHDeclar20070801Do.getRecvid()); 
			dataObject.setValue(TmpHDeclar20070801Do.COLUMNS.RECVQULF.name(), tmpHDeclar20070801Do.getRecvqulf()); 
			dataObject.setValue(TmpHDeclar20070801Do.COLUMNS.RLSFLAG.name(), tmpHDeclar20070801Do.getRlsflag()); 
			dataObject.setValue(TmpHDeclar20070801Do.COLUMNS.MAWBNO.name(), tmpHDeclar20070801Do.getMawbno()); 
			dataObject.setValue(TmpHDeclar20070801Do.COLUMNS.HAWBNO.name(), tmpHDeclar20070801Do.getHawbno()); 
			dataObject.setValue(TmpHDeclar20070801Do.COLUMNS.OWNERBAN.name(), tmpHDeclar20070801Do.getOwnerban()); 
			dataObject.setValue(TmpHDeclar20070801Do.COLUMNS.ICONFIRMED.name(), tmpHDeclar20070801Do.getIconfirmed()); 
			dataObject.setValue(TmpHDeclar20070801Do.COLUMNS.MONRPT.name(), tmpHDeclar20070801Do.getMonrpt()); 
			dataObject.setValue(TmpHDeclar20070801Do.COLUMNS.UPDTIME.name(), tmpHDeclar20070801Do.getUpdtime()); 
			dataObject.setValue(TmpHDeclar20070801Do.COLUMNS.MSGTYPE.name(), tmpHDeclar20070801Do.getMsgtype()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TmpHDeclar20070801Do> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TmpHDeclar20070801Do po) { 
		sqlWhere.add(TmpHDeclar20070801Do.COLUMNS.MSGFUN.name(), po.getMsgfun()); 
		sqlWhere.add(TmpHDeclar20070801Do.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(TmpHDeclar20070801Do.COLUMNS.STRTYPE.name(), po.getStrtype()); 
		sqlWhere.add(TmpHDeclar20070801Do.COLUMNS.DECLTYPE.name(), po.getDecltype()); 
		sqlWhere.add(TmpHDeclar20070801Do.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(TmpHDeclar20070801Do.COLUMNS.IMPORTDATE.name(), po.getImportdate()); 
		sqlWhere.add(TmpHDeclar20070801Do.COLUMNS.DECLDATE.name(), po.getDecldate()); 
		sqlWhere.add(TmpHDeclar20070801Do.COLUMNS.RLSTIME.name(), po.getRlstime()); 
		sqlWhere.add(TmpHDeclar20070801Do.COLUMNS.STGPLACE.name(), po.getStgplace()); 
		sqlWhere.add(TmpHDeclar20070801Do.COLUMNS.NOPKG.name(), po.getNopkg()); 
		sqlWhere.add(TmpHDeclar20070801Do.COLUMNS.PKGUNIT.name(), po.getPkgunit()); 
		sqlWhere.add(TmpHDeclar20070801Do.COLUMNS.GWGT.name(), po.getGwgt()); 
		sqlWhere.add(TmpHDeclar20070801Do.COLUMNS.REFBILLNO.name(), po.getRefbillno()); 
		sqlWhere.add(TmpHDeclar20070801Do.COLUMNS.BOXNO.name(), po.getBoxno()); 
		sqlWhere.add(TmpHDeclar20070801Do.COLUMNS.INBONDNO.name(), po.getInbondno()); 
		sqlWhere.add(TmpHDeclar20070801Do.COLUMNS.OUTBONDNO.name(), po.getOutbondno()); 
		sqlWhere.add(TmpHDeclar20070801Do.COLUMNS.SENDID.name(), po.getSendid()); 
		sqlWhere.add(TmpHDeclar20070801Do.COLUMNS.SENDQULF.name(), po.getSendqulf()); 
		sqlWhere.add(TmpHDeclar20070801Do.COLUMNS.RECVID.name(), po.getRecvid()); 
		sqlWhere.add(TmpHDeclar20070801Do.COLUMNS.RECVQULF.name(), po.getRecvqulf()); 
		sqlWhere.add(TmpHDeclar20070801Do.COLUMNS.RLSFLAG.name(), po.getRlsflag()); 
		sqlWhere.add(TmpHDeclar20070801Do.COLUMNS.MAWBNO.name(), po.getMawbno()); 
		sqlWhere.add(TmpHDeclar20070801Do.COLUMNS.HAWBNO.name(), po.getHawbno()); 
		sqlWhere.add(TmpHDeclar20070801Do.COLUMNS.OWNERBAN.name(), po.getOwnerban()); 
		sqlWhere.add(TmpHDeclar20070801Do.COLUMNS.ICONFIRMED.name(), po.getIconfirmed()); 
		sqlWhere.add(TmpHDeclar20070801Do.COLUMNS.MONRPT.name(), po.getMonrpt()); 
		sqlWhere.add(TmpHDeclar20070801Do.COLUMNS.UPDTIME.name(), po.getUpdtime()); 
		sqlWhere.add(TmpHDeclar20070801Do.COLUMNS.MSGTYPE.name(), po.getMsgtype()); 
	} 
 
} 
