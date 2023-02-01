package com.doc.common.dao.impl; 
 
public class Aq$Def$AqcallFDAOImpl extends GeneralDAOImpl<Aq$Def$AqcallFPo> implements IAq$Def$AqcallFDAO { 
	public static final Aq$Def$AqcallFDAOImpl INSTANCE = new Aq$Def$AqcallFDAOImpl(); 
	public static final String TABLENAME = "AQ$_DEF$_AQCALL_F"; 

	public Aq$Def$AqcallFDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Aq$Def$AqcallFPo> CONVERTER = new MapConverter<Aq$Def$AqcallFPo>() { 
 
		@Override 
		public Aq$Def$AqcallFPo convert(final DataObject dataObject) { 
			final Aq$Def$AqcallFPo aq$Def$AqcallFPo = new Aq$Def$AqcallFPo(); 
			return aq$Def$AqcallFPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Aq$Def$AqcallFPo aq$Def$AqcallFPo) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Aq$Def$AqcallFPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Aq$Def$AqcallFPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
