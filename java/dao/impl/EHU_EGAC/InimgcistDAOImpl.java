package com.doc.common.dao.impl; 
 
public class InimgcistDAOImpl extends GeneralDAOImpl<InimgcistPo> implements InimgcistDAO { 
	public static final InimgcistDAOImpl INSTANCE = new InimgcistDAOImpl(); 
	public static final String TABLENAME = "INIMGCIST"; 

	public InimgcistDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<InimgcistPo> CONVERTER = new MapConverter<InimgcistPo>() { 
 
		@Override 
		public InimgcistPo convert(final DataObject dataObject) { 
			final InimgcistPo inimgcistPo = new InimgcistPo(); 
			inimgcistPo.setTtype(dataObject.getString(InimgcistPo.COLUMNS.TTYPE.name())); 
			inimgcistPo.setIndicator(dataObject.getString(InimgcistPo.COLUMNS.INDICATOR.name())); 
			inimgcistPo.setDecltype(dataObject.getString(InimgcistPo.COLUMNS.DECLTYPE.name())); 
			inimgcistPo.setDeclno(dataObject.getString(InimgcistPo.COLUMNS.DECLNO.name())); 
			inimgcistPo.setMwb(dataObject.getString(InimgcistPo.COLUMNS.MWB.name())); 
			inimgcistPo.setHwb(dataObject.getString(InimgcistPo.COLUMNS.HWB.name())); 
			inimgcistPo.setGcipiece(dataObject.getString(InimgcistPo.COLUMNS.GCIPIECE.name())); 
			inimgcistPo.setGciweight(dataObject.getString(InimgcistPo.COLUMNS.GCIWEIGHT.name())); 
			inimgcistPo.setClearancetype(dataObject.getString(InimgcistPo.COLUMNS.CLEARANCETYPE.name())); 
			inimgcistPo.setGcidate(dataObject.getString(InimgcistPo.COLUMNS.GCIDATE.name())); 
			return inimgcistPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final InimgcistPo inimgcistPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(InimgcistPo.COLUMNS.TTYPE.name(), inimgcistPo.getTtype()); 
			dataObject.setValue(InimgcistPo.COLUMNS.INDICATOR.name(), inimgcistPo.getIndicator()); 
			dataObject.setValue(InimgcistPo.COLUMNS.DECLTYPE.name(), inimgcistPo.getDecltype()); 
			dataObject.setValue(InimgcistPo.COLUMNS.DECLNO.name(), inimgcistPo.getDeclno()); 
			dataObject.setValue(InimgcistPo.COLUMNS.MWB.name(), inimgcistPo.getMwb()); 
			dataObject.setValue(InimgcistPo.COLUMNS.HWB.name(), inimgcistPo.getHwb()); 
			dataObject.setValue(InimgcistPo.COLUMNS.GCIPIECE.name(), inimgcistPo.getGcipiece()); 
			dataObject.setValue(InimgcistPo.COLUMNS.GCIWEIGHT.name(), inimgcistPo.getGciweight()); 
			dataObject.setValue(InimgcistPo.COLUMNS.CLEARANCETYPE.name(), inimgcistPo.getClearancetype()); 
			dataObject.setValue(InimgcistPo.COLUMNS.GCIDATE.name(), inimgcistPo.getGcidate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<InimgcistPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(InimgcistPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
