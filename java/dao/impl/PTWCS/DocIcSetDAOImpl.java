package com.doc.common.dao.impl; 
 
public class DocIcSetDAOImpl extends GeneralDAOImpl<DocIcSetPo> implements DocIcSetDAO { 
	public static final DocIcSetDAOImpl INSTANCE = new DocIcSetDAOImpl(); 
	public static final String TABLENAME = "DOC_IC_SET"; 

	public DocIcSetDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DocIcSetPo> CONVERTER = new MapConverter<DocIcSetPo>() { 
 
		@Override 
		public DocIcSetPo convert(final DataObject dataObject) { 
			final DocIcSetPo docIcSetPo = new DocIcSetPo(); 
			docIcSetPo.setDocType(dataObject.getString(DocIcSetPo.COLUMNS.DOC_TYPE.name())); 
			docIcSetPo.setDocNo(dataObject.getString(DocIcSetPo.COLUMNS.DOC_NO.name())); 
			docIcSetPo.setId(dataObject.getString(DocIcSetPo.COLUMNS.ID.name())); 
			docIcSetPo.setName(dataObject.getString(DocIcSetPo.COLUMNS.NAME.name())); 
			docIcSetPo.setCompName(dataObject.getString(DocIcSetPo.COLUMNS.COMP_NAME.name())); 
			docIcSetPo.setPhoto(); 
			docIcSetPo.setIcNo(dataObject.getString(DocIcSetPo.COLUMNS.IC_NO.name())); 
			docIcSetPo.setValidDeadLine(TimestampUtils.of(dataObject.getValue(DocIcSetPo.COLUMNS.VALID_DEAD_LINE.name()))); 
			docIcSetPo.setSuspendMark(dataObject.getString(DocIcSetPo.COLUMNS.SUSPEND_MARK.name())); 
			docIcSetPo.setSuspendDtS(TimestampUtils.of(dataObject.getValue(DocIcSetPo.COLUMNS.SUSPEND_DT_S.name()))); 
			docIcSetPo.setSuspendDtE(TimestampUtils.of(dataObject.getValue(DocIcSetPo.COLUMNS.SUSPEND_DT_E.name()))); 
			return docIcSetPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DocIcSetPo docIcSetPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DocIcSetPo.COLUMNS.DOC_TYPE.name(), docIcSetPo.getDocType()); 
			dataObject.setValue(DocIcSetPo.COLUMNS.DOC_NO.name(), docIcSetPo.getDocNo()); 
			dataObject.setValue(DocIcSetPo.COLUMNS.ID.name(), docIcSetPo.getId()); 
			dataObject.setValue(DocIcSetPo.COLUMNS.NAME.name(), docIcSetPo.getName()); 
			dataObject.setValue(DocIcSetPo.COLUMNS.COMP_NAME.name(), docIcSetPo.getCompName()); 
			dataObject.setValue(DocIcSetPo.COLUMNS.PHOTO.name(), docIcSetPo.getPhoto()); 
			dataObject.setValue(DocIcSetPo.COLUMNS.IC_NO.name(), docIcSetPo.getIcNo()); 
			dataObject.setValue(DocIcSetPo.COLUMNS.VALID_DEAD_LINE.name(), docIcSetPo.getValidDeadLine()); 
			dataObject.setValue(DocIcSetPo.COLUMNS.SUSPEND_MARK.name(), docIcSetPo.getSuspendMark()); 
			dataObject.setValue(DocIcSetPo.COLUMNS.SUSPEND_DT_S.name(), docIcSetPo.getSuspendDtS()); 
			dataObject.setValue(DocIcSetPo.COLUMNS.SUSPEND_DT_E.name(), docIcSetPo.getSuspendDtE()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DocIcSetPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DocIcSetPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(DocIcSetPo.COLUMNS.DOC_TYPE.name(), po.getDocType()); 
		sqlWhere.add(DocIcSetPo.COLUMNS.DOC_NO.name(), po.getDocNo()); 
		sqlWhere.add(DocIcSetPo.COLUMNS.NAME.name(), po.getName()); 
		return sqlWhere; 
	} 
 
} 
