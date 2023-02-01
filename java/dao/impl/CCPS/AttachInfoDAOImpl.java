package com.doc.common.dao.impl; 
 
public class AttachInfoDAOImpl extends GeneralDAOImpl<AttachInfoPo> implements AttachInfoDAO { 
	public static final AttachInfoDAOImpl INSTANCE = new AttachInfoDAOImpl(); 
	public static final String TABLENAME = "ATTACH_INFO"; 

	public AttachInfoDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<AttachInfoPo> CONVERTER = new MapConverter<AttachInfoPo>() { 
 
		@Override 
		public AttachInfoPo convert(final DataObject dataObject) { 
			final AttachInfoPo attachInfoPo = new AttachInfoPo(); 
			attachInfoPo.setTransIdenId(dataObject.getString(AttachInfoPo.COLUMNS.TRANS_IDEN_ID.name())); 
			attachInfoPo.setAttachType(dataObject.getString(AttachInfoPo.COLUMNS.ATTACH_TYPE.name())); 
			attachInfoPo.setAttachClob(); 
			attachInfoPo.setAttachBlob(); 
			return attachInfoPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final AttachInfoPo attachInfoPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(AttachInfoPo.COLUMNS.TRANS_IDEN_ID.name(), attachInfoPo.getTransIdenId()); 
			dataObject.setValue(AttachInfoPo.COLUMNS.ATTACH_TYPE.name(), attachInfoPo.getAttachType()); 
			dataObject.setValue(AttachInfoPo.COLUMNS.ATTACH_CLOB.name(), attachInfoPo.getAttachClob()); 
			dataObject.setValue(AttachInfoPo.COLUMNS.ATTACH_BLOB.name(), attachInfoPo.getAttachBlob()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<AttachInfoPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(AttachInfoPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(AttachInfoPo.COLUMNS.TRANS_IDEN_ID.name(), po.getTransIdenId()); 
		return sqlWhere; 
	} 
 
} 
