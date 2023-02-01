package com.doc.common.dao.impl; 
 
public class InexgcistDAOImpl extends GeneralDAOImpl<InexgcistPo> implements InexgcistDAO { 
	public static final InexgcistDAOImpl INSTANCE = new InexgcistDAOImpl(); 
	public static final String TABLENAME = "INEXGCIST"; 

	public InexgcistDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<InexgcistPo> CONVERTER = new MapConverter<InexgcistPo>() { 
 
		@Override 
		public InexgcistPo convert(final DataObject dataObject) { 
			final InexgcistPo inexgcistPo = new InexgcistPo(); 
			inexgcistPo.setTtype(dataObject.getString(InexgcistPo.COLUMNS.TTYPE.name())); 
			inexgcistPo.setIndicator(dataObject.getString(InexgcistPo.COLUMNS.INDICATOR.name())); 
			inexgcistPo.setDecltype(dataObject.getString(InexgcistPo.COLUMNS.DECLTYPE.name())); 
			inexgcistPo.setDeclno(dataObject.getString(InexgcistPo.COLUMNS.DECLNO.name())); 
			inexgcistPo.setMwb(dataObject.getString(InexgcistPo.COLUMNS.MWB.name())); 
			inexgcistPo.setHwb(dataObject.getString(InexgcistPo.COLUMNS.HWB.name())); 
			inexgcistPo.setGcipiece(dataObject.getString(InexgcistPo.COLUMNS.GCIPIECE.name())); 
			inexgcistPo.setGciweight(dataObject.getString(InexgcistPo.COLUMNS.GCIWEIGHT.name())); 
			inexgcistPo.setClearancetype(dataObject.getString(InexgcistPo.COLUMNS.CLEARANCETYPE.name())); 
			inexgcistPo.setGcidate(dataObject.getString(InexgcistPo.COLUMNS.GCIDATE.name())); 
			return inexgcistPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final InexgcistPo inexgcistPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(InexgcistPo.COLUMNS.TTYPE.name(), inexgcistPo.getTtype()); 
			dataObject.setValue(InexgcistPo.COLUMNS.INDICATOR.name(), inexgcistPo.getIndicator()); 
			dataObject.setValue(InexgcistPo.COLUMNS.DECLTYPE.name(), inexgcistPo.getDecltype()); 
			dataObject.setValue(InexgcistPo.COLUMNS.DECLNO.name(), inexgcistPo.getDeclno()); 
			dataObject.setValue(InexgcistPo.COLUMNS.MWB.name(), inexgcistPo.getMwb()); 
			dataObject.setValue(InexgcistPo.COLUMNS.HWB.name(), inexgcistPo.getHwb()); 
			dataObject.setValue(InexgcistPo.COLUMNS.GCIPIECE.name(), inexgcistPo.getGcipiece()); 
			dataObject.setValue(InexgcistPo.COLUMNS.GCIWEIGHT.name(), inexgcistPo.getGciweight()); 
			dataObject.setValue(InexgcistPo.COLUMNS.CLEARANCETYPE.name(), inexgcistPo.getClearancetype()); 
			dataObject.setValue(InexgcistPo.COLUMNS.GCIDATE.name(), inexgcistPo.getGcidate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<InexgcistPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(InexgcistPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
