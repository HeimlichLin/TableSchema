package com.doc.common.dao.impl; 
 
public class ViewPdCheckLogDAO extends GeneralDAOImpl<ViewPdCheckLogPo> implements IViewPdCheckLogDAO { 
	public static final ViewPdCheckLogDAOImpl INSTANCE = new ViewPdCheckLogDAOImpl(); 
	public static final String TABLENAME = "VIEW_PD_CHECK_LOG"; 

	public ViewPdCheckLogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ViewPdCheckLogPo> CONVERTER = new MapConverter<ViewPdCheckLogPo>() { 
 
		@Override 
		public ViewPdCheckLogPo convert(final DataObject dataObject) { 
			final ViewPdCheckLogPo viewPdCheckLogPo = new ViewPdCheckLogPo(); 
			return viewPdCheckLogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ViewPdCheckLogPo viewPdCheckLogPo) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ViewPdCheckLogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ViewPdCheckLogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
