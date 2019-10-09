package com.doc.common.dao.impl; 
 
public class HDeclarDAOImpl extends GeneralDAOImpl<HDeclarDo> implements HDeclarDAOImpl { 
	public static final HDeclarDAOImpl INSTANCE = new HDeclarDAOImpl(); 
	public static final String TABLENAME = "H_DECLAR"; 

	public HDeclarDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<HDeclarDo> CONVERTER = new MapConverter<HDeclarDo>() { 
 
		@Override 
		public HDeclarDo convert(final DataObject dataObject) { 
			final HDeclarDo hDeclarDo = new HDeclarDo(); 
			hDeclarDo.setMsgfun(dataObject.getString(HDeclarDo.COLUMNS.MSGFUN.name())); 
			hDeclarDo.setBondno(dataObject.getString(HDeclarDo.COLUMNS.BONDNO.name())); 
			hDeclarDo.setStrtype(dataObject.getString(HDeclarDo.COLUMNS.STRTYPE.name())); 
			hDeclarDo.setDecltype(dataObject.getString(HDeclarDo.COLUMNS.DECLTYPE.name())); 
			hDeclarDo.setDeclno(dataObject.getString(HDeclarDo.COLUMNS.DECLNO.name())); 
			hDeclarDo.setImportdate(CommUtils.objConver2Time(dataObject.getString(HDeclarDo.COLUMNS.IMPORTDATE.name()))); 
			hDeclarDo.setDecldate(CommUtils.objConver2Time(dataObject.getString(HDeclarDo.COLUMNS.DECLDATE.name()))); 
			hDeclarDo.setRlstime(CommUtils.objConver2Time(dataObject.getString(HDeclarDo.COLUMNS.RLSTIME.name()))); 
			hDeclarDo.setStgplace(dataObject.getString(HDeclarDo.COLUMNS.STGPLACE.name())); 
			hDeclarDo.setNopkg(BigDecimalUtils.formObj(dataObject.getString(HDeclarDo.COLUMNS.NOPKG.name()))); 
			hDeclarDo.setPkgunit(dataObject.getString(HDeclarDo.COLUMNS.PKGUNIT.name())); 
			hDeclarDo.setGwgt(BigDecimalUtils.formObj(dataObject.getString(HDeclarDo.COLUMNS.GWGT.name()))); 
			hDeclarDo.setRefbillno(dataObject.getString(HDeclarDo.COLUMNS.REFBILLNO.name())); 
			hDeclarDo.setBoxno(dataObject.getString(HDeclarDo.COLUMNS.BOXNO.name())); 
			hDeclarDo.setInbondno(dataObject.getString(HDeclarDo.COLUMNS.INBONDNO.name())); 
			hDeclarDo.setOutbondno(dataObject.getString(HDeclarDo.COLUMNS.OUTBONDNO.name())); 
			hDeclarDo.setSendid(dataObject.getString(HDeclarDo.COLUMNS.SENDID.name())); 
			hDeclarDo.setSendqulf(dataObject.getString(HDeclarDo.COLUMNS.SENDQULF.name())); 
			hDeclarDo.setRecvid(dataObject.getString(HDeclarDo.COLUMNS.RECVID.name())); 
			hDeclarDo.setRecvqulf(dataObject.getString(HDeclarDo.COLUMNS.RECVQULF.name())); 
			hDeclarDo.setRlsflag(dataObject.getString(HDeclarDo.COLUMNS.RLSFLAG.name())); 
			hDeclarDo.setMawbno(dataObject.getString(HDeclarDo.COLUMNS.MAWBNO.name())); 
			hDeclarDo.setHawbno(dataObject.getString(HDeclarDo.COLUMNS.HAWBNO.name())); 
			hDeclarDo.setOwnerban(dataObject.getString(HDeclarDo.COLUMNS.OWNERBAN.name())); 
			hDeclarDo.setIconfirmed(dataObject.getString(HDeclarDo.COLUMNS.ICONFIRMED.name())); 
			hDeclarDo.setMonrpt(dataObject.getString(HDeclarDo.COLUMNS.MONRPT.name())); 
			hDeclarDo.setUpdtime(dataObject.getString(HDeclarDo.COLUMNS.UPDTIME.name())); 
			hDeclarDo.setMsgtype(dataObject.getString(HDeclarDo.COLUMNS.MSGTYPE.name())); 
			return hDeclarDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final HDeclarDo hDeclarDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(HDeclarDo.COLUMNS.MSGFUN.name(), hDeclarDo.getMsgfun()); 
			dataObject.setValue(HDeclarDo.COLUMNS.BONDNO.name(), hDeclarDo.getBondno()); 
			dataObject.setValue(HDeclarDo.COLUMNS.STRTYPE.name(), hDeclarDo.getStrtype()); 
			dataObject.setValue(HDeclarDo.COLUMNS.DECLTYPE.name(), hDeclarDo.getDecltype()); 
			dataObject.setValue(HDeclarDo.COLUMNS.DECLNO.name(), hDeclarDo.getDeclno()); 
			dataObject.setValue(HDeclarDo.COLUMNS.IMPORTDATE.name(), hDeclarDo.getImportdate()); 
			dataObject.setValue(HDeclarDo.COLUMNS.DECLDATE.name(), hDeclarDo.getDecldate()); 
			dataObject.setValue(HDeclarDo.COLUMNS.RLSTIME.name(), hDeclarDo.getRlstime()); 
			dataObject.setValue(HDeclarDo.COLUMNS.STGPLACE.name(), hDeclarDo.getStgplace()); 
			dataObject.setValue(HDeclarDo.COLUMNS.NOPKG.name(), hDeclarDo.getNopkg()); 
			dataObject.setValue(HDeclarDo.COLUMNS.PKGUNIT.name(), hDeclarDo.getPkgunit()); 
			dataObject.setValue(HDeclarDo.COLUMNS.GWGT.name(), hDeclarDo.getGwgt()); 
			dataObject.setValue(HDeclarDo.COLUMNS.REFBILLNO.name(), hDeclarDo.getRefbillno()); 
			dataObject.setValue(HDeclarDo.COLUMNS.BOXNO.name(), hDeclarDo.getBoxno()); 
			dataObject.setValue(HDeclarDo.COLUMNS.INBONDNO.name(), hDeclarDo.getInbondno()); 
			dataObject.setValue(HDeclarDo.COLUMNS.OUTBONDNO.name(), hDeclarDo.getOutbondno()); 
			dataObject.setValue(HDeclarDo.COLUMNS.SENDID.name(), hDeclarDo.getSendid()); 
			dataObject.setValue(HDeclarDo.COLUMNS.SENDQULF.name(), hDeclarDo.getSendqulf()); 
			dataObject.setValue(HDeclarDo.COLUMNS.RECVID.name(), hDeclarDo.getRecvid()); 
			dataObject.setValue(HDeclarDo.COLUMNS.RECVQULF.name(), hDeclarDo.getRecvqulf()); 
			dataObject.setValue(HDeclarDo.COLUMNS.RLSFLAG.name(), hDeclarDo.getRlsflag()); 
			dataObject.setValue(HDeclarDo.COLUMNS.MAWBNO.name(), hDeclarDo.getMawbno()); 
			dataObject.setValue(HDeclarDo.COLUMNS.HAWBNO.name(), hDeclarDo.getHawbno()); 
			dataObject.setValue(HDeclarDo.COLUMNS.OWNERBAN.name(), hDeclarDo.getOwnerban()); 
			dataObject.setValue(HDeclarDo.COLUMNS.ICONFIRMED.name(), hDeclarDo.getIconfirmed()); 
			dataObject.setValue(HDeclarDo.COLUMNS.MONRPT.name(), hDeclarDo.getMonrpt()); 
			dataObject.setValue(HDeclarDo.COLUMNS.UPDTIME.name(), hDeclarDo.getUpdtime()); 
			dataObject.setValue(HDeclarDo.COLUMNS.MSGTYPE.name(), hDeclarDo.getMsgtype()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<HDeclarDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(HDeclarDo po) { 
		sqlWhere.add(HDeclarDo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(HDeclarDo.COLUMNS.DECLNO.name(), po.getDeclno()); 
	} 
 
} 