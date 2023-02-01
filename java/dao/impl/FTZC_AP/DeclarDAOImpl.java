package com.doc.common.dao.impl; 
 
public class DeclarDAOImpl extends GeneralDAOImpl<DeclarPo> implements DeclarDAO { 
	public static final DeclarDAOImpl INSTANCE = new DeclarDAOImpl(); 
	public static final String TABLENAME = "DECLAR"; 

	public DeclarDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DeclarPo> CONVERTER = new MapConverter<DeclarPo>() { 
 
		@Override 
		public DeclarPo convert(final DataObject dataObject) { 
			final DeclarPo declarPo = new DeclarPo(); 
			declarPo.setMsgFun(dataObject.getString(DeclarPo.COLUMNS.MSG_FUN.name())); 
			declarPo.setBfNo(dataObject.getString(DeclarPo.COLUMNS.BF_NO.name())); 
			declarPo.setStrType(dataObject.getString(DeclarPo.COLUMNS.STR_TYPE.name())); 
			declarPo.setDeclType(dataObject.getString(DeclarPo.COLUMNS.DECL_TYPE.name())); 
			declarPo.setDeclNo(dataObject.getString(DeclarPo.COLUMNS.DECL_NO.name())); 
			declarPo.setImportDate(dataObject.getString(DeclarPo.COLUMNS.IMPORT_DATE.name())); 
			declarPo.setDeclDate(dataObject.getString(DeclarPo.COLUMNS.DECL_DATE.name())); 
			declarPo.setRlsDate(TimestampUtils.of(dataObject.getValue(DeclarPo.COLUMNS.RLS_DATE.name()))); 
			declarPo.setStgPlace(dataObject.getString(DeclarPo.COLUMNS.STG_PLACE.name())); 
			declarPo.setNoPkg(BigDecimalUtils.formObj(dataObject.getValue(DeclarPo.COLUMNS.NO_PKG.name()))); 
			declarPo.setPkgUnit(dataObject.getString(DeclarPo.COLUMNS.PKG_UNIT.name())); 
			declarPo.setGWgt(BigDecimalUtils.formObj(dataObject.getValue(DeclarPo.COLUMNS.G_WGT.name()))); 
			declarPo.setRefBillNo(dataObject.getString(DeclarPo.COLUMNS.REF_BILL_NO.name())); 
			declarPo.setBoxNo(dataObject.getString(DeclarPo.COLUMNS.BOX_NO.name())); 
			declarPo.setInbondNo(dataObject.getString(DeclarPo.COLUMNS.INBOND_NO.name())); 
			declarPo.setOutbondNo(dataObject.getString(DeclarPo.COLUMNS.OUTBOND_NO.name())); 
			declarPo.setSendId(dataObject.getString(DeclarPo.COLUMNS.SEND_ID.name())); 
			declarPo.setSendQulf(dataObject.getString(DeclarPo.COLUMNS.SEND_QULF.name())); 
			declarPo.setRecvId(dataObject.getString(DeclarPo.COLUMNS.RECV_ID.name())); 
			declarPo.setRecvQulf(dataObject.getString(DeclarPo.COLUMNS.RECV_QULF.name())); 
			declarPo.setRlsFlag(dataObject.getString(DeclarPo.COLUMNS.RLS_FLAG.name())); 
			declarPo.setMawbNo(dataObject.getString(DeclarPo.COLUMNS.MAWB_NO.name())); 
			declarPo.setHawbNo(dataObject.getString(DeclarPo.COLUMNS.HAWB_NO.name())); 
			declarPo.setOwnerBan(dataObject.getString(DeclarPo.COLUMNS.OWNER_BAN.name())); 
			declarPo.setConfirmed(dataObject.getString(DeclarPo.COLUMNS.CONFIRMED.name())); 
			declarPo.setMnRpt(dataObject.getString(DeclarPo.COLUMNS.MN_RPT.name())); 
			declarPo.setRmks(dataObject.getString(DeclarPo.COLUMNS.RMKS.name())); 
			declarPo.setFobAmt(BigDecimalUtils.formObj(dataObject.getValue(DeclarPo.COLUMNS.FOB_AMT.name()))); 
			declarPo.setShipPort(dataObject.getString(DeclarPo.COLUMNS.SHIP_PORT.name())); 
			declarPo.setDestPort(dataObject.getString(DeclarPo.COLUMNS.DEST_PORT.name())); 
			declarPo.setTransType(dataObject.getString(DeclarPo.COLUMNS.TRANS_TYPE.name())); 
			declarPo.setCifAmt(BigDecimalUtils.formObj(dataObject.getValue(DeclarPo.COLUMNS.CIF_AMT.name()))); 
			declarPo.setMark(dataObject.getString(DeclarPo.COLUMNS.MARK.name())); 
			declarPo.setBillingStat(dataObject.getString(DeclarPo.COLUMNS.BILLING_STAT.name())); 
			declarPo.setMsgType(dataObject.getString(DeclarPo.COLUMNS.MSG_TYPE.name())); 
			declarPo.setUserId(dataObject.getString(DeclarPo.COLUMNS.USER_ID.name())); 
			declarPo.setStatus(dataObject.getString(DeclarPo.COLUMNS.STATUS.name())); 
			declarPo.setTransId(dataObject.getString(DeclarPo.COLUMNS.TRANS_ID.name())); 
			declarPo.setCfmDate(dataObject.getString(DeclarPo.COLUMNS.CFM_DATE.name())); 
			declarPo.setTaxRsn(dataObject.getString(DeclarPo.COLUMNS.TAX_RSN.name())); 
			declarPo.setManMark(dataObject.getString(DeclarPo.COLUMNS.MAN_MARK.name())); 
			declarPo.setAsType(dataObject.getString(DeclarPo.COLUMNS.AS_TYPE.name())); 
			declarPo.setIoType(dataObject.getString(DeclarPo.COLUMNS.IO_TYPE.name())); 
			declarPo.setVrNo(dataObject.getString(DeclarPo.COLUMNS.VR_NO.name())); 
			declarPo.setSoNo(dataObject.getString(DeclarPo.COLUMNS.SO_NO.name())); 
			declarPo.setDeclSeqNo(BigDecimalUtils.formObj(dataObject.getValue(DeclarPo.COLUMNS.DECL_SEQ_NO.name()))); 
			declarPo.setTotInvoiceAmt(BigDecimalUtils.formObj(dataObject.getValue(DeclarPo.COLUMNS.TOT_INVOICE_AMT.name()))); 
			declarPo.setDeclRemark1(dataObject.getString(DeclarPo.COLUMNS.DECL_REMARK1.name())); 
			declarPo.setDeclRemark2(dataObject.getString(DeclarPo.COLUMNS.DECL_REMARK2.name())); 
			return declarPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DeclarPo declarPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DeclarPo.COLUMNS.MSG_FUN.name(), declarPo.getMsgFun()); 
			dataObject.setValue(DeclarPo.COLUMNS.BF_NO.name(), declarPo.getBfNo()); 
			dataObject.setValue(DeclarPo.COLUMNS.STR_TYPE.name(), declarPo.getStrType()); 
			dataObject.setValue(DeclarPo.COLUMNS.DECL_TYPE.name(), declarPo.getDeclType()); 
			dataObject.setValue(DeclarPo.COLUMNS.DECL_NO.name(), declarPo.getDeclNo()); 
			dataObject.setValue(DeclarPo.COLUMNS.IMPORT_DATE.name(), declarPo.getImportDate()); 
			dataObject.setValue(DeclarPo.COLUMNS.DECL_DATE.name(), declarPo.getDeclDate()); 
			dataObject.setValue(DeclarPo.COLUMNS.RLS_DATE.name(), declarPo.getRlsDate()); 
			dataObject.setValue(DeclarPo.COLUMNS.STG_PLACE.name(), declarPo.getStgPlace()); 
			dataObject.setValue(DeclarPo.COLUMNS.NO_PKG.name(), declarPo.getNoPkg()); 
			dataObject.setValue(DeclarPo.COLUMNS.PKG_UNIT.name(), declarPo.getPkgUnit()); 
			dataObject.setValue(DeclarPo.COLUMNS.G_WGT.name(), declarPo.getGWgt()); 
			dataObject.setValue(DeclarPo.COLUMNS.REF_BILL_NO.name(), declarPo.getRefBillNo()); 
			dataObject.setValue(DeclarPo.COLUMNS.BOX_NO.name(), declarPo.getBoxNo()); 
			dataObject.setValue(DeclarPo.COLUMNS.INBOND_NO.name(), declarPo.getInbondNo()); 
			dataObject.setValue(DeclarPo.COLUMNS.OUTBOND_NO.name(), declarPo.getOutbondNo()); 
			dataObject.setValue(DeclarPo.COLUMNS.SEND_ID.name(), declarPo.getSendId()); 
			dataObject.setValue(DeclarPo.COLUMNS.SEND_QULF.name(), declarPo.getSendQulf()); 
			dataObject.setValue(DeclarPo.COLUMNS.RECV_ID.name(), declarPo.getRecvId()); 
			dataObject.setValue(DeclarPo.COLUMNS.RECV_QULF.name(), declarPo.getRecvQulf()); 
			dataObject.setValue(DeclarPo.COLUMNS.RLS_FLAG.name(), declarPo.getRlsFlag()); 
			dataObject.setValue(DeclarPo.COLUMNS.MAWB_NO.name(), declarPo.getMawbNo()); 
			dataObject.setValue(DeclarPo.COLUMNS.HAWB_NO.name(), declarPo.getHawbNo()); 
			dataObject.setValue(DeclarPo.COLUMNS.OWNER_BAN.name(), declarPo.getOwnerBan()); 
			dataObject.setValue(DeclarPo.COLUMNS.CONFIRMED.name(), declarPo.getConfirmed()); 
			dataObject.setValue(DeclarPo.COLUMNS.MN_RPT.name(), declarPo.getMnRpt()); 
			dataObject.setValue(DeclarPo.COLUMNS.RMKS.name(), declarPo.getRmks()); 
			dataObject.setValue(DeclarPo.COLUMNS.FOB_AMT.name(), declarPo.getFobAmt()); 
			dataObject.setValue(DeclarPo.COLUMNS.SHIP_PORT.name(), declarPo.getShipPort()); 
			dataObject.setValue(DeclarPo.COLUMNS.DEST_PORT.name(), declarPo.getDestPort()); 
			dataObject.setValue(DeclarPo.COLUMNS.TRANS_TYPE.name(), declarPo.getTransType()); 
			dataObject.setValue(DeclarPo.COLUMNS.CIF_AMT.name(), declarPo.getCifAmt()); 
			dataObject.setValue(DeclarPo.COLUMNS.MARK.name(), declarPo.getMark()); 
			dataObject.setValue(DeclarPo.COLUMNS.BILLING_STAT.name(), declarPo.getBillingStat()); 
			dataObject.setValue(DeclarPo.COLUMNS.MSG_TYPE.name(), declarPo.getMsgType()); 
			dataObject.setValue(DeclarPo.COLUMNS.USER_ID.name(), declarPo.getUserId()); 
			dataObject.setValue(DeclarPo.COLUMNS.STATUS.name(), declarPo.getStatus()); 
			dataObject.setValue(DeclarPo.COLUMNS.TRANS_ID.name(), declarPo.getTransId()); 
			dataObject.setValue(DeclarPo.COLUMNS.CFM_DATE.name(), declarPo.getCfmDate()); 
			dataObject.setValue(DeclarPo.COLUMNS.TAX_RSN.name(), declarPo.getTaxRsn()); 
			dataObject.setValue(DeclarPo.COLUMNS.MAN_MARK.name(), declarPo.getManMark()); 
			dataObject.setValue(DeclarPo.COLUMNS.AS_TYPE.name(), declarPo.getAsType()); 
			dataObject.setValue(DeclarPo.COLUMNS.IO_TYPE.name(), declarPo.getIoType()); 
			dataObject.setValue(DeclarPo.COLUMNS.VR_NO.name(), declarPo.getVrNo()); 
			dataObject.setValue(DeclarPo.COLUMNS.SO_NO.name(), declarPo.getSoNo()); 
			dataObject.setValue(DeclarPo.COLUMNS.DECL_SEQ_NO.name(), declarPo.getDeclSeqNo()); 
			dataObject.setValue(DeclarPo.COLUMNS.TOT_INVOICE_AMT.name(), declarPo.getTotInvoiceAmt()); 
			dataObject.setValue(DeclarPo.COLUMNS.DECL_REMARK1.name(), declarPo.getDeclRemark1()); 
			dataObject.setValue(DeclarPo.COLUMNS.DECL_REMARK2.name(), declarPo.getDeclRemark2()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DeclarPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DeclarPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
