package com.doc.common.dao.impl; 
 
public class Aq$Def$AqerrorFDAOImpl extends GeneralDAOImpl<Aq$Def$AqerrorFPo> implements IAq$Def$AqerrorFDAO { 
	public static final Aq$Def$AqerrorFDAOImpl INSTANCE = new Aq$Def$AqerrorFDAOImpl(); 
	public static final String TABLENAME = "AQ$_DEF$_AQERROR_F"; 

	public Aq$Def$AqerrorFDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Aq$Def$AqerrorFPo> CONVERTER = new MapConverter<Aq$Def$AqerrorFPo>() { 
 
		@Override 
		public Aq$Def$AqerrorFPo convert(final DataObject dataObject) { 
			final Aq$Def$AqerrorFPo aq$Def$AqerrorFPo = new Aq$Def$AqerrorFPo(); 
			return aq$Def$AqerrorFPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Aq$Def$AqerrorFPo aq$Def$AqerrorFPo) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Aq$Def$AqerrorFPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Aq$Def$AqerrorFPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
