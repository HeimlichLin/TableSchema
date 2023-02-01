package com.doc.common.dao.impl; 
 
public class HDeclarDAOImpl extends GeneralDAOImpl<HDeclarPo> implements HDeclarDAO { 
	public static final HDeclarDAOImpl INSTANCE = new HDeclarDAOImpl(); 
	public static final String TABLENAME = "H_DECLAR"; 

	public HDeclarDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<HDeclarPo> CONVERTER = new MapConverter<HDeclarPo>() { 
 
		@Override 
		public HDeclarPo convert(final DataObject dataObject) { 
			final HDeclarPo hDeclarPo = new HDeclarPo(); 
			hDeclarPo.setMsgfun(dataObject.getString(HDeclarPo.COLUMNS.MSGFUN.name())); 
			hDeclarPo.setBondno(dataObject.getString(HDeclarPo.COLUMNS.BONDNO.name())); 
			hDeclarPo.setStrtype(dataObject.getString(HDeclarPo.COLUMNS.STRTYPE.name())); 
			hDeclarPo.setDecltype(dataObject.getString(HDeclarPo.COLUMNS.DECLTYPE.name())); 
			hDeclarPo.setDeclno(dataObject.getString(HDeclarPo.COLUMNS.DECLNO.name())); 
			hDeclarPo.setImportdate(TimestampUtils.of(dataObject.getValue(HDeclarPo.COLUMNS.IMPORTDATE.name()))); 
			hDeclarPo.setDecldate(TimestampUtils.of(dataObject.getValue(HDeclarPo.COLUMNS.DECLDATE.name()))); 
			hDeclarPo.setRlstime(TimestampUtils.of(dataObject.getValue(HDeclarPo.COLUMNS.RLSTIME.name()))); 
			hDeclarPo.setStgplace(dataObject.getString(HDeclarPo.COLUMNS.STGPLACE.name())); 
			hDeclarPo.setNopkg(BigDecimalUtils.formObj(dataObject.getValue(HDeclarPo.COLUMNS.NOPKG.name()))); 
			hDeclarPo.setPkgunit(dataObject.getString(HDeclarPo.COLUMNS.PKGUNIT.name())); 
			hDeclarPo.setGwgt(BigDecimalUtils.formObj(dataObject.getValue(HDeclarPo.COLUMNS.GWGT.name()))); 
			hDeclarPo.setRefbillno(dataObject.getString(HDeclarPo.COLUMNS.REFBILLNO.name())); 
			hDeclarPo.setBoxno(dataObject.getString(HDeclarPo.COLUMNS.BOXNO.name())); 
			hDeclarPo.setInbondno(dataObject.getString(HDeclarPo.COLUMNS.INBONDNO.name())); 
			hDeclarPo.setOutbondno(dataObject.getString(HDeclarPo.COLUMNS.OUTBONDNO.name())); 
			hDeclarPo.setSendid(dataObject.getString(HDeclarPo.COLUMNS.SENDID.name())); 
			hDeclarPo.setSendqulf(dataObject.getString(HDeclarPo.COLUMNS.SENDQULF.name())); 
			hDeclarPo.setRecvid(dataObject.getString(HDeclarPo.COLUMNS.RECVID.name())); 
			hDeclarPo.setRecvqulf(dataObject.getString(HDeclarPo.COLUMNS.RECVQULF.name())); 
			hDeclarPo.setRlsflag(dataObject.getString(HDeclarPo.COLUMNS.RLSFLAG.name())); 
			hDeclarPo.setMawbno(dataObject.getString(HDeclarPo.COLUMNS.MAWBNO.name())); 
			hDeclarPo.setHawbno(dataObject.getString(HDeclarPo.COLUMNS.HAWBNO.name())); 
			hDeclarPo.setOwnerban(dataObject.getString(HDeclarPo.COLUMNS.OWNERBAN.name())); 
			hDeclarPo.setIconfirmed(dataObject.getString(HDeclarPo.COLUMNS.ICONFIRMED.name())); 
			hDeclarPo.setMonrpt(dataObject.getString(HDeclarPo.COLUMNS.MONRPT.name())); 
			hDeclarPo.setUpdtime(dataObject.getString(HDeclarPo.COLUMNS.UPDTIME.name())); 
			hDeclarPo.setMsgtype(dataObject.getString(HDeclarPo.COLUMNS.MSGTYPE.name())); 
			return hDeclarPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final HDeclarPo hDeclarPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(HDeclarPo.COLUMNS.MSGFUN.name(), hDeclarPo.getMsgfun()); 
			dataObject.setValue(HDeclarPo.COLUMNS.BONDNO.name(), hDeclarPo.getBondno()); 
			dataObject.setValue(HDeclarPo.COLUMNS.STRTYPE.name(), hDeclarPo.getStrtype()); 
			dataObject.setValue(HDeclarPo.COLUMNS.DECLTYPE.name(), hDeclarPo.getDecltype()); 
			dataObject.setValue(HDeclarPo.COLUMNS.DECLNO.name(), hDeclarPo.getDeclno()); 
			dataObject.setValue(HDeclarPo.COLUMNS.IMPORTDATE.name(), hDeclarPo.getImportdate()); 
			dataObject.setValue(HDeclarPo.COLUMNS.DECLDATE.name(), hDeclarPo.getDecldate()); 
			dataObject.setValue(HDeclarPo.COLUMNS.RLSTIME.name(), hDeclarPo.getRlstime()); 
			dataObject.setValue(HDeclarPo.COLUMNS.STGPLACE.name(), hDeclarPo.getStgplace()); 
			dataObject.setValue(HDeclarPo.COLUMNS.NOPKG.name(), hDeclarPo.getNopkg()); 
			dataObject.setValue(HDeclarPo.COLUMNS.PKGUNIT.name(), hDeclarPo.getPkgunit()); 
			dataObject.setValue(HDeclarPo.COLUMNS.GWGT.name(), hDeclarPo.getGwgt()); 
			dataObject.setValue(HDeclarPo.COLUMNS.REFBILLNO.name(), hDeclarPo.getRefbillno()); 
			dataObject.setValue(HDeclarPo.COLUMNS.BOXNO.name(), hDeclarPo.getBoxno()); 
			dataObject.setValue(HDeclarPo.COLUMNS.INBONDNO.name(), hDeclarPo.getInbondno()); 
			dataObject.setValue(HDeclarPo.COLUMNS.OUTBONDNO.name(), hDeclarPo.getOutbondno()); 
			dataObject.setValue(HDeclarPo.COLUMNS.SENDID.name(), hDeclarPo.getSendid()); 
			dataObject.setValue(HDeclarPo.COLUMNS.SENDQULF.name(), hDeclarPo.getSendqulf()); 
			dataObject.setValue(HDeclarPo.COLUMNS.RECVID.name(), hDeclarPo.getRecvid()); 
			dataObject.setValue(HDeclarPo.COLUMNS.RECVQULF.name(), hDeclarPo.getRecvqulf()); 
			dataObject.setValue(HDeclarPo.COLUMNS.RLSFLAG.name(), hDeclarPo.getRlsflag()); 
			dataObject.setValue(HDeclarPo.COLUMNS.MAWBNO.name(), hDeclarPo.getMawbno()); 
			dataObject.setValue(HDeclarPo.COLUMNS.HAWBNO.name(), hDeclarPo.getHawbno()); 
			dataObject.setValue(HDeclarPo.COLUMNS.OWNERBAN.name(), hDeclarPo.getOwnerban()); 
			dataObject.setValue(HDeclarPo.COLUMNS.ICONFIRMED.name(), hDeclarPo.getIconfirmed()); 
			dataObject.setValue(HDeclarPo.COLUMNS.MONRPT.name(), hDeclarPo.getMonrpt()); 
			dataObject.setValue(HDeclarPo.COLUMNS.UPDTIME.name(), hDeclarPo.getUpdtime()); 
			dataObject.setValue(HDeclarPo.COLUMNS.MSGTYPE.name(), hDeclarPo.getMsgtype()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<HDeclarPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(HDeclarPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(HDeclarPo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(HDeclarPo.COLUMNS.DECLNO.name(), po.getDeclno()); 
		return sqlWhere; 
	} 
 
} 
