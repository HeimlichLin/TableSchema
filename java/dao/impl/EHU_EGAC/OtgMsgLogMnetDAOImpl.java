package com.doc.common.dao.impl; 
 
public class OtgMsgLogMnetDAOImpl extends GeneralDAOImpl<OtgMsgLogMnetPo> implements OtgMsgLogMnetDAO { 
	public static final OtgMsgLogMnetDAOImpl INSTANCE = new OtgMsgLogMnetDAOImpl(); 
	public static final String TABLENAME = "OTG_MSG_LOG_MNET"; 

	public OtgMsgLogMnetDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<OtgMsgLogMnetPo> CONVERTER = new MapConverter<OtgMsgLogMnetPo>() { 
 
		@Override 
		public OtgMsgLogMnetPo convert(final DataObject dataObject) { 
			final OtgMsgLogMnetPo otgMsgLogMnetPo = new OtgMsgLogMnetPo(); 
			otgMsgLogMnetPo.setCodMsgTyp(dataObject.getString(OtgMsgLogMnetPo.COLUMNS.COD_MSG_TYP.name())); 
			otgMsgLogMnetPo.setDatMsgLog(TimestampUtils.of(dataObject.getValue(OtgMsgLogMnetPo.COLUMNS.DAT_MSG_LOG.name()))); 
			otgMsgLogMnetPo.setCodSeqNum(dataObject.getString(OtgMsgLogMnetPo.COLUMNS.COD_SEQ_NUM.name())); 
			otgMsgLogMnetPo.setCodMsgVer(dataObject.getString(OtgMsgLogMnetPo.COLUMNS.COD_MSG_VER.name())); 
			otgMsgLogMnetPo.setDesMsgHdr(dataObject.getString(OtgMsgLogMnetPo.COLUMNS.DES_MSG_HDR.name())); 
			otgMsgLogMnetPo.setMintNum(dataObject.getString(OtgMsgLogMnetPo.COLUMNS.MINT_NUM.name())); 
			otgMsgLogMnetPo.setSitaNum(dataObject.getString(OtgMsgLogMnetPo.COLUMNS.SITA_NUM.name())); 
			otgMsgLogMnetPo.setDesErr(dataObject.getString(OtgMsgLogMnetPo.COLUMNS.DES_ERR.name())); 
			otgMsgLogMnetPo.setDesMsg(); 
			otgMsgLogMnetPo.setFlgMnet(dataObject.getString(OtgMsgLogMnetPo.COLUMNS.FLG_MNET.name())); 
			otgMsgLogMnetPo.setCodDstAdd(dataObject.getString(OtgMsgLogMnetPo.COLUMNS.COD_DST_ADD.name())); 
			otgMsgLogMnetPo.setTlxPriCod(dataObject.getString(OtgMsgLogMnetPo.COLUMNS.TLX_PRI_COD.name())); 
			otgMsgLogMnetPo.setOriChgCod(dataObject.getString(OtgMsgLogMnetPo.COLUMNS.ORI_CHG_COD.name())); 
			otgMsgLogMnetPo.setCodEvaAcc(dataObject.getString(OtgMsgLogMnetPo.COLUMNS.COD_EVA_ACC.name())); 
			otgMsgLogMnetPo.setCodOriAdd(dataObject.getString(OtgMsgLogMnetPo.COLUMNS.COD_ORI_ADD.name())); 
			return otgMsgLogMnetPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final OtgMsgLogMnetPo otgMsgLogMnetPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(OtgMsgLogMnetPo.COLUMNS.COD_MSG_TYP.name(), otgMsgLogMnetPo.getCodMsgTyp()); 
			dataObject.setValue(OtgMsgLogMnetPo.COLUMNS.DAT_MSG_LOG.name(), otgMsgLogMnetPo.getDatMsgLog()); 
			dataObject.setValue(OtgMsgLogMnetPo.COLUMNS.COD_SEQ_NUM.name(), otgMsgLogMnetPo.getCodSeqNum()); 
			dataObject.setValue(OtgMsgLogMnetPo.COLUMNS.COD_MSG_VER.name(), otgMsgLogMnetPo.getCodMsgVer()); 
			dataObject.setValue(OtgMsgLogMnetPo.COLUMNS.DES_MSG_HDR.name(), otgMsgLogMnetPo.getDesMsgHdr()); 
			dataObject.setValue(OtgMsgLogMnetPo.COLUMNS.MINT_NUM.name(), otgMsgLogMnetPo.getMintNum()); 
			dataObject.setValue(OtgMsgLogMnetPo.COLUMNS.SITA_NUM.name(), otgMsgLogMnetPo.getSitaNum()); 
			dataObject.setValue(OtgMsgLogMnetPo.COLUMNS.DES_ERR.name(), otgMsgLogMnetPo.getDesErr()); 
			dataObject.setValue(OtgMsgLogMnetPo.COLUMNS.DES_MSG.name(), otgMsgLogMnetPo.getDesMsg()); 
			dataObject.setValue(OtgMsgLogMnetPo.COLUMNS.FLG_MNET.name(), otgMsgLogMnetPo.getFlgMnet()); 
			dataObject.setValue(OtgMsgLogMnetPo.COLUMNS.COD_DST_ADD.name(), otgMsgLogMnetPo.getCodDstAdd()); 
			dataObject.setValue(OtgMsgLogMnetPo.COLUMNS.TLX_PRI_COD.name(), otgMsgLogMnetPo.getTlxPriCod()); 
			dataObject.setValue(OtgMsgLogMnetPo.COLUMNS.ORI_CHG_COD.name(), otgMsgLogMnetPo.getOriChgCod()); 
			dataObject.setValue(OtgMsgLogMnetPo.COLUMNS.COD_EVA_ACC.name(), otgMsgLogMnetPo.getCodEvaAcc()); 
			dataObject.setValue(OtgMsgLogMnetPo.COLUMNS.COD_ORI_ADD.name(), otgMsgLogMnetPo.getCodOriAdd()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<OtgMsgLogMnetPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(OtgMsgLogMnetPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(OtgMsgLogMnetPo.COLUMNS.COD_MSG_TYP.name(), po.getCodMsgTyp()); 
		sqlWhere.add(OtgMsgLogMnetPo.COLUMNS.DAT_MSG_LOG.name(), po.getDatMsgLog()); 
		sqlWhere.add(OtgMsgLogMnetPo.COLUMNS.COD_SEQ_NUM.name(), po.getCodSeqNum()); 
		return sqlWhere; 
	} 
 
} 
