package com.doc.common.dao.impl; 
 
public class ExpressmailDAOImpl extends GeneralDAOImpl<ExpressmailPo> implements ExpressmailDAO { 
	public static final ExpressmailDAOImpl INSTANCE = new ExpressmailDAOImpl(); 
	public static final String TABLENAME = "EXPRESSMAIL"; 

	public ExpressmailDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ExpressmailPo> CONVERTER = new MapConverter<ExpressmailPo>() { 
 
		@Override 
		public ExpressmailPo convert(final DataObject dataObject) { 
			final ExpressmailPo expressmailPo = new ExpressmailPo(); 
			expressmailPo.setArea(dataObject.getString(ExpressmailPo.COLUMNS.AREA.name())); 
			expressmailPo.setMailsub(dataObject.getString(ExpressmailPo.COLUMNS.MAILSUB.name())); 
			expressmailPo.setMailbody(dataObject.getString(ExpressmailPo.COLUMNS.MAILBODY.name())); 
			return expressmailPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ExpressmailPo expressmailPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ExpressmailPo.COLUMNS.AREA.name(), expressmailPo.getArea()); 
			dataObject.setValue(ExpressmailPo.COLUMNS.MAILSUB.name(), expressmailPo.getMailsub()); 
			dataObject.setValue(ExpressmailPo.COLUMNS.MAILBODY.name(), expressmailPo.getMailbody()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ExpressmailPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ExpressmailPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
