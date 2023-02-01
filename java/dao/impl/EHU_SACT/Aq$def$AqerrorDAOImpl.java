package com.doc.common.dao.impl; 
 
public class Aq$def$AqerrorDAOImpl extends GeneralDAOImpl<Aq$def$AqerrorPo> implements IAq$def$AqerrorDAO { 
	public static final Aq$def$AqerrorDAOImpl INSTANCE = new Aq$def$AqerrorDAOImpl(); 
	public static final String TABLENAME = "AQ$DEF$_AQERROR"; 

	public Aq$def$AqerrorDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Aq$def$AqerrorPo> CONVERTER = new MapConverter<Aq$def$AqerrorPo>() { 
 
		@Override 
		public Aq$def$AqerrorPo convert(final DataObject dataObject) { 
			final Aq$def$AqerrorPo aq$def$AqerrorPo = new Aq$def$AqerrorPo(); 
			return aq$def$AqerrorPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Aq$def$AqerrorPo aq$def$AqerrorPo) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Aq$def$AqerrorPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Aq$def$AqerrorPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
