package com.doc.common.dao.impl; 
 
public class DocumentDAOImpl extends GeneralDAOImpl<DocumentPo> implements DocumentDAO { 
	public static final DocumentDAOImpl INSTANCE = new DocumentDAOImpl(); 
	public static final String TABLENAME = "DOCUMENT"; 

	public DocumentDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DocumentPo> CONVERTER = new MapConverter<DocumentPo>() { 
 
		@Override 
		public DocumentPo convert(final DataObject dataObject) { 
			final DocumentPo documentPo = new DocumentPo(); 
			documentPo.setBfNo(dataObject.getString(DocumentPo.COLUMNS.BF_NO.name())); 
			documentPo.setDocNo(dataObject.getString(DocumentPo.COLUMNS.DOC_NO.name())); 
			documentPo.setCreateDate(dataObject.getString(DocumentPo.COLUMNS.CREATE_DATE.name())); 
			documentPo.setDocType(dataObject.getString(DocumentPo.COLUMNS.DOC_TYPE.name())); 
			documentPo.setCtmCode(dataObject.getString(DocumentPo.COLUMNS.CTM_CODE.name())); 
			documentPo.setRefDocNo(dataObject.getString(DocumentPo.COLUMNS.REF_DOC_NO.name())); 
			documentPo.setRefDocVer(dataObject.getString(DocumentPo.COLUMNS.REF_DOC_VER.name())); 
			documentPo.setCreator(dataObject.getString(DocumentPo.COLUMNS.CREATOR.name())); 
			documentPo.setModifier(dataObject.getString(DocumentPo.COLUMNS.MODIFIER.name())); 
			documentPo.setStatus(dataObject.getString(DocumentPo.COLUMNS.STATUS.name())); 
			documentPo.setPermitDate(dataObject.getString(DocumentPo.COLUMNS.PERMIT_DATE.name())); 
			documentPo.setPermitDocNo(dataObject.getString(DocumentPo.COLUMNS.PERMIT_DOC_NO.name())); 
			documentPo.setRemark1(dataObject.getString(DocumentPo.COLUMNS.REMARK1.name())); 
			documentPo.setRemark2(dataObject.getString(DocumentPo.COLUMNS.REMARK2.name())); 
			documentPo.setRemark3(dataObject.getString(DocumentPo.COLUMNS.REMARK3.name())); 
			documentPo.setDocDate(dataObject.getString(DocumentPo.COLUMNS.DOC_DATE.name())); 
			documentPo.setRefDate(dataObject.getString(DocumentPo.COLUMNS.REF_DATE.name())); 
			return documentPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DocumentPo documentPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DocumentPo.COLUMNS.BF_NO.name(), documentPo.getBfNo()); 
			dataObject.setValue(DocumentPo.COLUMNS.DOC_NO.name(), documentPo.getDocNo()); 
			dataObject.setValue(DocumentPo.COLUMNS.CREATE_DATE.name(), documentPo.getCreateDate()); 
			dataObject.setValue(DocumentPo.COLUMNS.DOC_TYPE.name(), documentPo.getDocType()); 
			dataObject.setValue(DocumentPo.COLUMNS.CTM_CODE.name(), documentPo.getCtmCode()); 
			dataObject.setValue(DocumentPo.COLUMNS.REF_DOC_NO.name(), documentPo.getRefDocNo()); 
			dataObject.setValue(DocumentPo.COLUMNS.REF_DOC_VER.name(), documentPo.getRefDocVer()); 
			dataObject.setValue(DocumentPo.COLUMNS.CREATOR.name(), documentPo.getCreator()); 
			dataObject.setValue(DocumentPo.COLUMNS.MODIFIER.name(), documentPo.getModifier()); 
			dataObject.setValue(DocumentPo.COLUMNS.STATUS.name(), documentPo.getStatus()); 
			dataObject.setValue(DocumentPo.COLUMNS.PERMIT_DATE.name(), documentPo.getPermitDate()); 
			dataObject.setValue(DocumentPo.COLUMNS.PERMIT_DOC_NO.name(), documentPo.getPermitDocNo()); 
			dataObject.setValue(DocumentPo.COLUMNS.REMARK1.name(), documentPo.getRemark1()); 
			dataObject.setValue(DocumentPo.COLUMNS.REMARK2.name(), documentPo.getRemark2()); 
			dataObject.setValue(DocumentPo.COLUMNS.REMARK3.name(), documentPo.getRemark3()); 
			dataObject.setValue(DocumentPo.COLUMNS.DOC_DATE.name(), documentPo.getDocDate()); 
			dataObject.setValue(DocumentPo.COLUMNS.REF_DATE.name(), documentPo.getRefDate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DocumentPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DocumentPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(DocumentPo.COLUMNS.BF_NO.name(), po.getBfNo()); 
		sqlWhere.add(DocumentPo.COLUMNS.DOC_NO.name(), po.getDocNo()); 
		sqlWhere.add(DocumentPo.COLUMNS.DOC_TYPE.name(), po.getDocType()); 
		return sqlWhere; 
	} 
 
} 
