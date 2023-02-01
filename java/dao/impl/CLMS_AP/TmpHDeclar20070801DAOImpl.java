package com.doc.common.dao.impl; 
 
public class TmpHDeclar20070801DAOImpl extends GeneralDAOImpl<TmpHDeclar20070801Po> implements TmpHDeclar20070801DAO { 
	public static final TmpHDeclar20070801DAOImpl INSTANCE = new TmpHDeclar20070801DAOImpl(); 
	public static final String TABLENAME = "TMP_H_DECLAR_20070801"; 

	public TmpHDeclar20070801DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TmpHDeclar20070801Po> CONVERTER = new MapConverter<TmpHDeclar20070801Po>() { 
 
		@Override 
		public TmpHDeclar20070801Po convert(final DataObject dataObject) { 
			final TmpHDeclar20070801Po tmpHDeclar20070801Po = new TmpHDeclar20070801Po(); 
			tmpHDeclar20070801Po.setMsgfun(dataObject.getString(TmpHDeclar20070801Po.COLUMNS.MSGFUN.name())); 
			tmpHDeclar20070801Po.setBondno(dataObject.getString(TmpHDeclar20070801Po.COLUMNS.BONDNO.name())); 
			tmpHDeclar20070801Po.setStrtype(dataObject.getString(TmpHDeclar20070801Po.COLUMNS.STRTYPE.name())); 
			tmpHDeclar20070801Po.setDecltype(dataObject.getString(TmpHDeclar20070801Po.COLUMNS.DECLTYPE.name())); 
			tmpHDeclar20070801Po.setDeclno(dataObject.getString(TmpHDeclar20070801Po.COLUMNS.DECLNO.name())); 
			tmpHDeclar20070801Po.setImportdate(TimestampUtils.of(dataObject.getValue(TmpHDeclar20070801Po.COLUMNS.IMPORTDATE.name()))); 
			tmpHDeclar20070801Po.setDecldate(TimestampUtils.of(dataObject.getValue(TmpHDeclar20070801Po.COLUMNS.DECLDATE.name()))); 
			tmpHDeclar20070801Po.setRlstime(TimestampUtils.of(dataObject.getValue(TmpHDeclar20070801Po.COLUMNS.RLSTIME.name()))); 
			tmpHDeclar20070801Po.setStgplace(dataObject.getString(TmpHDeclar20070801Po.COLUMNS.STGPLACE.name())); 
			tmpHDeclar20070801Po.setNopkg(BigDecimalUtils.formObj(dataObject.getValue(TmpHDeclar20070801Po.COLUMNS.NOPKG.name()))); 
			tmpHDeclar20070801Po.setPkgunit(dataObject.getString(TmpHDeclar20070801Po.COLUMNS.PKGUNIT.name())); 
			tmpHDeclar20070801Po.setGwgt(BigDecimalUtils.formObj(dataObject.getValue(TmpHDeclar20070801Po.COLUMNS.GWGT.name()))); 
			tmpHDeclar20070801Po.setRefbillno(dataObject.getString(TmpHDeclar20070801Po.COLUMNS.REFBILLNO.name())); 
			tmpHDeclar20070801Po.setBoxno(dataObject.getString(TmpHDeclar20070801Po.COLUMNS.BOXNO.name())); 
			tmpHDeclar20070801Po.setInbondno(dataObject.getString(TmpHDeclar20070801Po.COLUMNS.INBONDNO.name())); 
			tmpHDeclar20070801Po.setOutbondno(dataObject.getString(TmpHDeclar20070801Po.COLUMNS.OUTBONDNO.name())); 
			tmpHDeclar20070801Po.setSendid(dataObject.getString(TmpHDeclar20070801Po.COLUMNS.SENDID.name())); 
			tmpHDeclar20070801Po.setSendqulf(dataObject.getString(TmpHDeclar20070801Po.COLUMNS.SENDQULF.name())); 
			tmpHDeclar20070801Po.setRecvid(dataObject.getString(TmpHDeclar20070801Po.COLUMNS.RECVID.name())); 
			tmpHDeclar20070801Po.setRecvqulf(dataObject.getString(TmpHDeclar20070801Po.COLUMNS.RECVQULF.name())); 
			tmpHDeclar20070801Po.setRlsflag(dataObject.getString(TmpHDeclar20070801Po.COLUMNS.RLSFLAG.name())); 
			tmpHDeclar20070801Po.setMawbno(dataObject.getString(TmpHDeclar20070801Po.COLUMNS.MAWBNO.name())); 
			tmpHDeclar20070801Po.setHawbno(dataObject.getString(TmpHDeclar20070801Po.COLUMNS.HAWBNO.name())); 
			tmpHDeclar20070801Po.setOwnerban(dataObject.getString(TmpHDeclar20070801Po.COLUMNS.OWNERBAN.name())); 
			tmpHDeclar20070801Po.setIconfirmed(dataObject.getString(TmpHDeclar20070801Po.COLUMNS.ICONFIRMED.name())); 
			tmpHDeclar20070801Po.setMonrpt(dataObject.getString(TmpHDeclar20070801Po.COLUMNS.MONRPT.name())); 
			tmpHDeclar20070801Po.setUpdtime(dataObject.getString(TmpHDeclar20070801Po.COLUMNS.UPDTIME.name())); 
			tmpHDeclar20070801Po.setMsgtype(dataObject.getString(TmpHDeclar20070801Po.COLUMNS.MSGTYPE.name())); 
			return tmpHDeclar20070801Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final TmpHDeclar20070801Po tmpHDeclar20070801Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TmpHDeclar20070801Po.COLUMNS.MSGFUN.name(), tmpHDeclar20070801Po.getMsgfun()); 
			dataObject.setValue(TmpHDeclar20070801Po.COLUMNS.BONDNO.name(), tmpHDeclar20070801Po.getBondno()); 
			dataObject.setValue(TmpHDeclar20070801Po.COLUMNS.STRTYPE.name(), tmpHDeclar20070801Po.getStrtype()); 
			dataObject.setValue(TmpHDeclar20070801Po.COLUMNS.DECLTYPE.name(), tmpHDeclar20070801Po.getDecltype()); 
			dataObject.setValue(TmpHDeclar20070801Po.COLUMNS.DECLNO.name(), tmpHDeclar20070801Po.getDeclno()); 
			dataObject.setValue(TmpHDeclar20070801Po.COLUMNS.IMPORTDATE.name(), tmpHDeclar20070801Po.getImportdate()); 
			dataObject.setValue(TmpHDeclar20070801Po.COLUMNS.DECLDATE.name(), tmpHDeclar20070801Po.getDecldate()); 
			dataObject.setValue(TmpHDeclar20070801Po.COLUMNS.RLSTIME.name(), tmpHDeclar20070801Po.getRlstime()); 
			dataObject.setValue(TmpHDeclar20070801Po.COLUMNS.STGPLACE.name(), tmpHDeclar20070801Po.getStgplace()); 
			dataObject.setValue(TmpHDeclar20070801Po.COLUMNS.NOPKG.name(), tmpHDeclar20070801Po.getNopkg()); 
			dataObject.setValue(TmpHDeclar20070801Po.COLUMNS.PKGUNIT.name(), tmpHDeclar20070801Po.getPkgunit()); 
			dataObject.setValue(TmpHDeclar20070801Po.COLUMNS.GWGT.name(), tmpHDeclar20070801Po.getGwgt()); 
			dataObject.setValue(TmpHDeclar20070801Po.COLUMNS.REFBILLNO.name(), tmpHDeclar20070801Po.getRefbillno()); 
			dataObject.setValue(TmpHDeclar20070801Po.COLUMNS.BOXNO.name(), tmpHDeclar20070801Po.getBoxno()); 
			dataObject.setValue(TmpHDeclar20070801Po.COLUMNS.INBONDNO.name(), tmpHDeclar20070801Po.getInbondno()); 
			dataObject.setValue(TmpHDeclar20070801Po.COLUMNS.OUTBONDNO.name(), tmpHDeclar20070801Po.getOutbondno()); 
			dataObject.setValue(TmpHDeclar20070801Po.COLUMNS.SENDID.name(), tmpHDeclar20070801Po.getSendid()); 
			dataObject.setValue(TmpHDeclar20070801Po.COLUMNS.SENDQULF.name(), tmpHDeclar20070801Po.getSendqulf()); 
			dataObject.setValue(TmpHDeclar20070801Po.COLUMNS.RECVID.name(), tmpHDeclar20070801Po.getRecvid()); 
			dataObject.setValue(TmpHDeclar20070801Po.COLUMNS.RECVQULF.name(), tmpHDeclar20070801Po.getRecvqulf()); 
			dataObject.setValue(TmpHDeclar20070801Po.COLUMNS.RLSFLAG.name(), tmpHDeclar20070801Po.getRlsflag()); 
			dataObject.setValue(TmpHDeclar20070801Po.COLUMNS.MAWBNO.name(), tmpHDeclar20070801Po.getMawbno()); 
			dataObject.setValue(TmpHDeclar20070801Po.COLUMNS.HAWBNO.name(), tmpHDeclar20070801Po.getHawbno()); 
			dataObject.setValue(TmpHDeclar20070801Po.COLUMNS.OWNERBAN.name(), tmpHDeclar20070801Po.getOwnerban()); 
			dataObject.setValue(TmpHDeclar20070801Po.COLUMNS.ICONFIRMED.name(), tmpHDeclar20070801Po.getIconfirmed()); 
			dataObject.setValue(TmpHDeclar20070801Po.COLUMNS.MONRPT.name(), tmpHDeclar20070801Po.getMonrpt()); 
			dataObject.setValue(TmpHDeclar20070801Po.COLUMNS.UPDTIME.name(), tmpHDeclar20070801Po.getUpdtime()); 
			dataObject.setValue(TmpHDeclar20070801Po.COLUMNS.MSGTYPE.name(), tmpHDeclar20070801Po.getMsgtype()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TmpHDeclar20070801Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TmpHDeclar20070801Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
