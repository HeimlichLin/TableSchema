package com.doc.common.dao.impl; 
 
public class AbnormalDAOImpl extends GeneralDAOImpl<AbnormalPo> implements AbnormalDAO { 
	public static final AbnormalDAOImpl INSTANCE = new AbnormalDAOImpl(); 
	public static final String TABLENAME = "ABNORMAL"; 

	public AbnormalDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<AbnormalPo> CONVERTER = new MapConverter<AbnormalPo>() { 
 
		@Override 
		public AbnormalPo convert(final DataObject dataObject) { 
			final AbnormalPo abnormalPo = new AbnormalPo(); 
			abnormalPo.setBfNo(dataObject.getString(AbnormalPo.COLUMNS.BF_NO.name())); 
			abnormalPo.setAbnormalType(dataObject.getString(AbnormalPo.COLUMNS.ABNORMAL_TYPE.name())); 
			abnormalPo.setAbnormalName(dataObject.getString(AbnormalPo.COLUMNS.ABNORMAL_NAME.name())); 
			abnormalPo.setDocNo(dataObject.getString(AbnormalPo.COLUMNS.DOC_NO.name())); 
			abnormalPo.setDocItemNo(BigDecimalUtils.formObj(dataObject.getValue(AbnormalPo.COLUMNS.DOC_ITEM_NO.name()))); 
			abnormalPo.setDocDate(dataObject.getString(AbnormalPo.COLUMNS.DOC_DATE.name())); 
			abnormalPo.setRemark(dataObject.getString(AbnormalPo.COLUMNS.REMARK.name())); 
			abnormalPo.setRef1Name(dataObject.getString(AbnormalPo.COLUMNS.REF1_NAME.name())); 
			abnormalPo.setRef1(dataObject.getString(AbnormalPo.COLUMNS.REF1.name())); 
			abnormalPo.setDateType(dataObject.getString(AbnormalPo.COLUMNS.DATE_TYPE.name())); 
			return abnormalPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final AbnormalPo abnormalPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(AbnormalPo.COLUMNS.BF_NO.name(), abnormalPo.getBfNo()); 
			dataObject.setValue(AbnormalPo.COLUMNS.ABNORMAL_TYPE.name(), abnormalPo.getAbnormalType()); 
			dataObject.setValue(AbnormalPo.COLUMNS.ABNORMAL_NAME.name(), abnormalPo.getAbnormalName()); 
			dataObject.setValue(AbnormalPo.COLUMNS.DOC_NO.name(), abnormalPo.getDocNo()); 
			dataObject.setValue(AbnormalPo.COLUMNS.DOC_ITEM_NO.name(), abnormalPo.getDocItemNo()); 
			dataObject.setValue(AbnormalPo.COLUMNS.DOC_DATE.name(), abnormalPo.getDocDate()); 
			dataObject.setValue(AbnormalPo.COLUMNS.REMARK.name(), abnormalPo.getRemark()); 
			dataObject.setValue(AbnormalPo.COLUMNS.REF1_NAME.name(), abnormalPo.getRef1Name()); 
			dataObject.setValue(AbnormalPo.COLUMNS.REF1.name(), abnormalPo.getRef1()); 
			dataObject.setValue(AbnormalPo.COLUMNS.DATE_TYPE.name(), abnormalPo.getDateType()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<AbnormalPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(AbnormalPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
