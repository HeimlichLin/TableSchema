package com.doc.common.dao.impl; 
 
public class ItsSendSitaLogDAOImpl extends GeneralDAOImpl<ItsSendSitaLogPo> implements ItsSendSitaLogDAO { 
	public static final ItsSendSitaLogDAOImpl INSTANCE = new ItsSendSitaLogDAOImpl(); 
	public static final String TABLENAME = "ITS_SEND_SITA_LOG"; 

	public ItsSendSitaLogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ItsSendSitaLogPo> CONVERTER = new MapConverter<ItsSendSitaLogPo>() { 
 
		@Override 
		public ItsSendSitaLogPo convert(final DataObject dataObject) { 
			final ItsSendSitaLogPo itsSendSitaLogPo = new ItsSendSitaLogPo(); 
			itsSendSitaLogPo.setDateTime(TimestampUtils.of(dataObject.getValue(ItsSendSitaLogPo.COLUMNS.DATE_TIME.name()))); 
			itsSendSitaLogPo.setStatus(dataObject.getString(ItsSendSitaLogPo.COLUMNS.STATUS.name())); 
			itsSendSitaLogPo.setDes(dataObject.getString(ItsSendSitaLogPo.COLUMNS.DES.name())); 
			itsSendSitaLogPo.setSeq(BigDecimalUtils.formObj(dataObject.getValue(ItsSendSitaLogPo.COLUMNS.SEQ.name()))); 
			itsSendSitaLogPo.setDatMsgLog(TimestampUtils.of(dataObject.getValue(ItsSendSitaLogPo.COLUMNS.DAT_MSG_LOG.name()))); 
			itsSendSitaLogPo.setCodSeqNum(dataObject.getString(ItsSendSitaLogPo.COLUMNS.COD_SEQ_NUM.name())); 
			itsSendSitaLogPo.setMintNum(dataObject.getString(ItsSendSitaLogPo.COLUMNS.MINT_NUM.name())); 
			itsSendSitaLogPo.setSitaNum(dataObject.getString(ItsSendSitaLogPo.COLUMNS.SITA_NUM.name())); 
			itsSendSitaLogPo.setDesErr(dataObject.getString(ItsSendSitaLogPo.COLUMNS.DES_ERR.name())); 
			itsSendSitaLogPo.setReturnDate(dataObject.getString(ItsSendSitaLogPo.COLUMNS.RETURN_DATE.name())); 
			return itsSendSitaLogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ItsSendSitaLogPo itsSendSitaLogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ItsSendSitaLogPo.COLUMNS.DATE_TIME.name(), itsSendSitaLogPo.getDateTime()); 
			dataObject.setValue(ItsSendSitaLogPo.COLUMNS.STATUS.name(), itsSendSitaLogPo.getStatus()); 
			dataObject.setValue(ItsSendSitaLogPo.COLUMNS.DES.name(), itsSendSitaLogPo.getDes()); 
			dataObject.setValue(ItsSendSitaLogPo.COLUMNS.SEQ.name(), itsSendSitaLogPo.getSeq()); 
			dataObject.setValue(ItsSendSitaLogPo.COLUMNS.DAT_MSG_LOG.name(), itsSendSitaLogPo.getDatMsgLog()); 
			dataObject.setValue(ItsSendSitaLogPo.COLUMNS.COD_SEQ_NUM.name(), itsSendSitaLogPo.getCodSeqNum()); 
			dataObject.setValue(ItsSendSitaLogPo.COLUMNS.MINT_NUM.name(), itsSendSitaLogPo.getMintNum()); 
			dataObject.setValue(ItsSendSitaLogPo.COLUMNS.SITA_NUM.name(), itsSendSitaLogPo.getSitaNum()); 
			dataObject.setValue(ItsSendSitaLogPo.COLUMNS.DES_ERR.name(), itsSendSitaLogPo.getDesErr()); 
			dataObject.setValue(ItsSendSitaLogPo.COLUMNS.RETURN_DATE.name(), itsSendSitaLogPo.getReturnDate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ItsSendSitaLogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ItsSendSitaLogPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(ItsSendSitaLogPo.COLUMNS.DATE_TIME.name(), po.getDateTime()); 
		sqlWhere.add(ItsSendSitaLogPo.COLUMNS.SEQ.name(), po.getSeq()); 
		return sqlWhere; 
	} 
 
} 
