package com.doc.common.dao.impl; 
 
public class Aq$def$AqcallDAOImpl extends GeneralDAOImpl<Aq$def$AqcallPo> implements IAq$def$AqcallDAO { 
	public static final Aq$def$AqcallDAOImpl INSTANCE = new Aq$def$AqcallDAOImpl(); 
	public static final String TABLENAME = "AQ$DEF$_AQCALL"; 

	public Aq$def$AqcallDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Aq$def$AqcallPo> CONVERTER = new MapConverter<Aq$def$AqcallPo>() { 
 
		@Override 
		public Aq$def$AqcallPo convert(final DataObject dataObject) { 
			final Aq$def$AqcallPo aq$def$AqcallPo = new Aq$def$AqcallPo(); 
			return aq$def$AqcallPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Aq$def$AqcallPo aq$def$AqcallPo) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Aq$def$AqcallPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Aq$def$AqcallPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
