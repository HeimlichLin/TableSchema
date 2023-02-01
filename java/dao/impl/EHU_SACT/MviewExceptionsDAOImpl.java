package com.doc.common.dao.impl; 
 
public class MviewExceptionsDAOImpl extends GeneralDAOImpl<MviewExceptionsPo> implements IMviewExceptionsDAO { 
	public static final MviewExceptionsDAOImpl INSTANCE = new MviewExceptionsDAOImpl(); 
	public static final String TABLENAME = "MVIEW_EXCEPTIONS"; 

	public MviewExceptionsDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<MviewExceptionsPo> CONVERTER = new MapConverter<MviewExceptionsPo>() { 
 
		@Override 
		public MviewExceptionsPo convert(final DataObject dataObject) { 
			final MviewExceptionsPo mviewExceptionsPo = new MviewExceptionsPo(); 
			return mviewExceptionsPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final MviewExceptionsPo mviewExceptionsPo) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<MviewExceptionsPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(MviewExceptionsPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
