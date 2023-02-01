package com.doc.common.dao.impl; 
 
public class InoutrelationDAOImpl extends GeneralDAOImpl<InoutrelationPo> implements InoutrelationDAO { 
	public static final InoutrelationDAOImpl INSTANCE = new InoutrelationDAOImpl(); 
	public static final String TABLENAME = "INOUTRELATION"; 

	public InoutrelationDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<InoutrelationPo> CONVERTER = new MapConverter<InoutrelationPo>() { 
 
		@Override 
		public InoutrelationPo convert(final DataObject dataObject) { 
			final InoutrelationPo inoutrelationPo = new InoutrelationPo(); 
			inoutrelationPo.setTransid(dataObject.getString(InoutrelationPo.COLUMNS.TRANSID.name())); 
			inoutrelationPo.setParentno(dataObject.getString(InoutrelationPo.COLUMNS.PARENTNO.name())); 
			inoutrelationPo.setParentitem(dataObject.getString(InoutrelationPo.COLUMNS.PARENTITEM.name())); 
			inoutrelationPo.setChildno(dataObject.getString(InoutrelationPo.COLUMNS.CHILDNO.name())); 
			inoutrelationPo.setChilditem(dataObject.getString(InoutrelationPo.COLUMNS.CHILDITEM.name())); 
			inoutrelationPo.setTransdate(dataObject.getString(InoutrelationPo.COLUMNS.TRANSDATE.name())); 
			return inoutrelationPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final InoutrelationPo inoutrelationPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(InoutrelationPo.COLUMNS.TRANSID.name(), inoutrelationPo.getTransid()); 
			dataObject.setValue(InoutrelationPo.COLUMNS.PARENTNO.name(), inoutrelationPo.getParentno()); 
			dataObject.setValue(InoutrelationPo.COLUMNS.PARENTITEM.name(), inoutrelationPo.getParentitem()); 
			dataObject.setValue(InoutrelationPo.COLUMNS.CHILDNO.name(), inoutrelationPo.getChildno()); 
			dataObject.setValue(InoutrelationPo.COLUMNS.CHILDITEM.name(), inoutrelationPo.getChilditem()); 
			dataObject.setValue(InoutrelationPo.COLUMNS.TRANSDATE.name(), inoutrelationPo.getTransdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<InoutrelationPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(InoutrelationPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
