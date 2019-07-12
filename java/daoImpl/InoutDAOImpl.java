package com.doc.common.dao.impl; 
 
public class InoutDAOImpl extends GeneralDAOImpl<InoutDo> implements InoutDAOImpl { 
	public static final InoutDAOImpl INSTANCE = new InoutDAOImpl(); 
	public static final String TABLENAME = "INOUT"; 

	public InoutDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<InoutDo> CONVERTER = new MapConverter<InoutDo>() { 
 
		@Override 
		public InoutDo convert(final DataObject dataObject) { 
			final InoutDo inoutDo = new InoutDo(); 
			inoutDo.setTransId(dataObject.getString(InoutDo.COLUMNS.TRANS_ID.name())); 
			inoutDo.setBfNo(dataObject.getString(InoutDo.COLUMNS.BF_NO.name())); 
			inoutDo.setDeliverType(dataObject.getString(InoutDo.COLUMNS.DELIVER_TYPE.name())); 
			inoutDo.setDeliverNo(dataObject.getString(InoutDo.COLUMNS.DELIVER_NO.name())); 
			inoutDo.setInvtryType(dataObject.getString(InoutDo.COLUMNS.INVTRY_TYPE.name())); 
			inoutDo.setCtmCode(dataObject.getString(InoutDo.COLUMNS.CTM_CODE.name())); 
			inoutDo.setCocompNo(dataObject.getString(InoutDo.COLUMNS.COCOMP_NO.name())); 
			inoutDo.setDeclNo(dataObject.getString(InoutDo.COLUMNS.DECL_NO.name())); 
			inoutDo.setDeclType(dataObject.getString(InoutDo.COLUMNS.DECL_TYPE.name())); 
			inoutDo.setRefDocNo(dataObject.getString(InoutDo.COLUMNS.REF_DOC_NO.name())); 
			inoutDo.setRefDocVer(dataObject.getString(InoutDo.COLUMNS.REF_DOC_VER.name())); 
			inoutDo.setBatchStatus(dataObject.getString(InoutDo.COLUMNS.BATCH_STATUS.name())); 
			inoutDo.setUserId(dataObject.getString(InoutDo.COLUMNS.USER_ID.name())); 
			inoutDo.setDeclSeqNo(BigDecimalUtils.formObj(dataObject.getString(InoutDo.COLUMNS.DECL_SEQ_NO.name()))); 
			inoutDo.setMawbNo(dataObject.getString(InoutDo.COLUMNS.MAWB_NO.name())); 
			inoutDo.setHawbNo(dataObject.getString(InoutDo.COLUMNS.HAWB_NO.name())); 
			return inoutDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final InoutDo inoutDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(InoutDo.COLUMNS.TRANS_ID.name(), inoutDo.getTransId()); 
			dataObject.setValue(InoutDo.COLUMNS.BF_NO.name(), inoutDo.getBfNo()); 
			dataObject.setValue(InoutDo.COLUMNS.DELIVER_TYPE.name(), inoutDo.getDeliverType()); 
			dataObject.setValue(InoutDo.COLUMNS.DELIVER_NO.name(), inoutDo.getDeliverNo()); 
			dataObject.setValue(InoutDo.COLUMNS.INVTRY_TYPE.name(), inoutDo.getInvtryType()); 
			dataObject.setValue(InoutDo.COLUMNS.CTM_CODE.name(), inoutDo.getCtmCode()); 
			dataObject.setValue(InoutDo.COLUMNS.COCOMP_NO.name(), inoutDo.getCocompNo()); 
			dataObject.setValue(InoutDo.COLUMNS.DECL_NO.name(), inoutDo.getDeclNo()); 
			dataObject.setValue(InoutDo.COLUMNS.DECL_TYPE.name(), inoutDo.getDeclType()); 
			dataObject.setValue(InoutDo.COLUMNS.REF_DOC_NO.name(), inoutDo.getRefDocNo()); 
			dataObject.setValue(InoutDo.COLUMNS.REF_DOC_VER.name(), inoutDo.getRefDocVer()); 
			dataObject.setValue(InoutDo.COLUMNS.BATCH_STATUS.name(), inoutDo.getBatchStatus()); 
			dataObject.setValue(InoutDo.COLUMNS.USER_ID.name(), inoutDo.getUserId()); 
			dataObject.setValue(InoutDo.COLUMNS.DECL_SEQ_NO.name(), inoutDo.getDeclSeqNo()); 
			dataObject.setValue(InoutDo.COLUMNS.MAWB_NO.name(), inoutDo.getMawbNo()); 
			dataObject.setValue(InoutDo.COLUMNS.HAWB_NO.name(), inoutDo.getHawbNo()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<InoutDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(InoutDo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(InoutDo.COLUMNS.TRANS_ID.name(), po.getTransId()); 
		sqlWhere.add(InoutDo.COLUMNS.BF_NO.name(), po.getBfNo()); 
		sqlWhere.add(InoutDo.COLUMNS.DELIVER_TYPE.name(), po.getDeliverType()); 
		sqlWhere.add(InoutDo.COLUMNS.DELIVER_NO.name(), po.getDeliverNo()); 
		return sqlWhere; 
	} 
 
} 
