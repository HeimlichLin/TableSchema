package com.doc.common.dao.impl; 
 
public class PostDAOImpl extends GeneralDAOImpl<PostPo> implements PostDAO { 
	public static final PostDAOImpl INSTANCE = new PostDAOImpl(); 
	public static final String TABLENAME = "POST"; 

	public PostDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<PostPo> CONVERTER = new MapConverter<PostPo>() { 
 
		@Override 
		public PostPo convert(final DataObject dataObject) { 
			final PostPo postPo = new PostPo(); 
			postPo.setBfNo(dataObject.getString(PostPo.COLUMNS.BF_NO.name())); 
			postPo.setPost(dataObject.getString(PostPo.COLUMNS.POST.name())); 
			postPo.setDescrip(dataObject.getString(PostPo.COLUMNS.DESCRIP.name())); 
			postPo.setStatus(dataObject.getString(PostPo.COLUMNS.STATUS.name())); 
			postPo.setAttribute(dataObject.getString(PostPo.COLUMNS.ATTRIBUTE.name())); 
			return postPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final PostPo postPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(PostPo.COLUMNS.BF_NO.name(), postPo.getBfNo()); 
			dataObject.setValue(PostPo.COLUMNS.POST.name(), postPo.getPost()); 
			dataObject.setValue(PostPo.COLUMNS.DESCRIP.name(), postPo.getDescrip()); 
			dataObject.setValue(PostPo.COLUMNS.STATUS.name(), postPo.getStatus()); 
			dataObject.setValue(PostPo.COLUMNS.ATTRIBUTE.name(), postPo.getAttribute()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<PostPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(PostPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(PostPo.COLUMNS.BF_NO.name(), po.getBfNo()); 
		sqlWhere.add(PostPo.COLUMNS.POST.name(), po.getPost()); 
		return sqlWhere; 
	} 
 
} 
