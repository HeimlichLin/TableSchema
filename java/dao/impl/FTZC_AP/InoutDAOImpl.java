package com.doc.common.dao.impl; 
 
public class InoutDAOImpl extends GeneralDAOImpl<InoutPo> implements InoutDAO { 
	public static final InoutDAOImpl INSTANCE = new InoutDAOImpl(); 
	public static final String TABLENAME = "INOUT"; 

	public InoutDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<InoutPo> CONVERTER = new MapConverter<InoutPo>() { 
 
		@Override 
		public InoutPo convert(final DataObject dataObject) { 
			final InoutPo inoutPo = new InoutPo(); 
			inoutPo.setTransId(dataObject.getString(InoutPo.COLUMNS.TRANS_ID.name())); 
			inoutPo.setBfNo(dataObject.getString(InoutPo.COLUMNS.BF_NO.name())); 
			inoutPo.setDeliverType(dataObject.getString(InoutPo.COLUMNS.DELIVER_TYPE.name())); 
			inoutPo.setDeliverNo(dataObject.getString(InoutPo.COLUMNS.DELIVER_NO.name())); 
			inoutPo.setInvtryType(dataObject.getString(InoutPo.COLUMNS.INVTRY_TYPE.name())); 
			inoutPo.setCtmCode(dataObject.getString(InoutPo.COLUMNS.CTM_CODE.name())); 
			inoutPo.setCocompNo(dataObject.getString(InoutPo.COLUMNS.COCOMP_NO.name())); 
			inoutPo.setDeclNo(dataObject.getString(InoutPo.COLUMNS.DECL_NO.name())); 
			inoutPo.setDeclType(dataObject.getString(InoutPo.COLUMNS.DECL_TYPE.name())); 
			inoutPo.setRefDocNo(dataObject.getString(InoutPo.COLUMNS.REF_DOC_NO.name())); 
			inoutPo.setRefDocVer(dataObject.getString(InoutPo.COLUMNS.REF_DOC_VER.name())); 
			inoutPo.setBatchStatus(dataObject.getString(InoutPo.COLUMNS.BATCH_STATUS.name())); 
			inoutPo.setUserId(dataObject.getString(InoutPo.COLUMNS.USER_ID.name())); 
			inoutPo.setDeclSeqNo(BigDecimalUtils.formObj(dataObject.getValue(InoutPo.COLUMNS.DECL_SEQ_NO.name()))); 
			inoutPo.setMawbNo(dataObject.getString(InoutPo.COLUMNS.MAWB_NO.name())); 
			inoutPo.setHawbNo(dataObject.getString(InoutPo.COLUMNS.HAWB_NO.name())); 
			return inoutPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final InoutPo inoutPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(InoutPo.COLUMNS.TRANS_ID.name(), inoutPo.getTransId()); 
			dataObject.setValue(InoutPo.COLUMNS.BF_NO.name(), inoutPo.getBfNo()); 
			dataObject.setValue(InoutPo.COLUMNS.DELIVER_TYPE.name(), inoutPo.getDeliverType()); 
			dataObject.setValue(InoutPo.COLUMNS.DELIVER_NO.name(), inoutPo.getDeliverNo()); 
			dataObject.setValue(InoutPo.COLUMNS.INVTRY_TYPE.name(), inoutPo.getInvtryType()); 
			dataObject.setValue(InoutPo.COLUMNS.CTM_CODE.name(), inoutPo.getCtmCode()); 
			dataObject.setValue(InoutPo.COLUMNS.COCOMP_NO.name(), inoutPo.getCocompNo()); 
			dataObject.setValue(InoutPo.COLUMNS.DECL_NO.name(), inoutPo.getDeclNo()); 
			dataObject.setValue(InoutPo.COLUMNS.DECL_TYPE.name(), inoutPo.getDeclType()); 
			dataObject.setValue(InoutPo.COLUMNS.REF_DOC_NO.name(), inoutPo.getRefDocNo()); 
			dataObject.setValue(InoutPo.COLUMNS.REF_DOC_VER.name(), inoutPo.getRefDocVer()); 
			dataObject.setValue(InoutPo.COLUMNS.BATCH_STATUS.name(), inoutPo.getBatchStatus()); 
			dataObject.setValue(InoutPo.COLUMNS.USER_ID.name(), inoutPo.getUserId()); 
			dataObject.setValue(InoutPo.COLUMNS.DECL_SEQ_NO.name(), inoutPo.getDeclSeqNo()); 
			dataObject.setValue(InoutPo.COLUMNS.MAWB_NO.name(), inoutPo.getMawbNo()); 
			dataObject.setValue(InoutPo.COLUMNS.HAWB_NO.name(), inoutPo.getHawbNo()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<InoutPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(InoutPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(InoutPo.COLUMNS.BF_NO.name(), po.getBfNo()); 
		sqlWhere.add(InoutPo.COLUMNS.DELIVER_TYPE.name(), po.getDeliverType()); 
		sqlWhere.add(InoutPo.COLUMNS.DELIVER_NO.name(), po.getDeliverNo()); 
		return sqlWhere; 
	} 
 
} 
