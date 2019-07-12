package com.doc.common.dao.impl; 
 
public class ViewPdCheckLogDAO extends GeneralDAOImpl<ViewPdCheckLogDo> implements ViewPdCheckLogDAO { 
	public static final ViewPdCheckLogDAOImpl INSTANCE = new ViewPdCheckLogDAOImpl(); 
	public static final String TABLENAME = "VIEW_PD_CHECK_LOG"; 

	public ViewPdCheckLogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<ViewPdCheckLogDo> CONVERTER = new MapConverter<ViewPdCheckLogDo>() { 
 
		@Override 
		public ViewPdCheckLogDo convert(final DataObject dataObject) { 
			final ViewPdCheckLogDo viewPdCheckLogDo = new ViewPdCheckLogDo(); 
			return viewPdCheckLogDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ViewPdCheckLogDo viewPdCheckLogDo) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ViewPdCheckLogDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ViewPdCheckLogDo po) { 
	} 
 
} 
