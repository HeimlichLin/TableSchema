package com.doc.common.dao.impl; 
 
public class InvtrybondDAOImpl extends GeneralDAOImpl<InvtrybondPo> implements InvtrybondDAO { 
	public static final InvtrybondDAOImpl INSTANCE = new InvtrybondDAOImpl(); 
	public static final String TABLENAME = "INVTRYBOND"; 

	public InvtrybondDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<InvtrybondPo> CONVERTER = new MapConverter<InvtrybondPo>() { 
 
		@Override 
		public InvtrybondPo convert(final DataObject dataObject) { 
			final InvtrybondPo invtrybondPo = new InvtrybondPo(); 
			invtrybondPo.setBondno(dataObject.getString(InvtrybondPo.COLUMNS.BONDNO.name())); 
			invtrybondPo.setYy(dataObject.getString(InvtrybondPo.COLUMNS.YY.name())); 
			invtrybondPo.setStrtdate(dataObject.getString(InvtrybondPo.COLUMNS.STRTDATE.name())); 
			invtrybondPo.setEnddate(dataObject.getString(InvtrybondPo.COLUMNS.ENDDATE.name())); 
			return invtrybondPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final InvtrybondPo invtrybondPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(InvtrybondPo.COLUMNS.BONDNO.name(), invtrybondPo.getBondno()); 
			dataObject.setValue(InvtrybondPo.COLUMNS.YY.name(), invtrybondPo.getYy()); 
			dataObject.setValue(InvtrybondPo.COLUMNS.STRTDATE.name(), invtrybondPo.getStrtdate()); 
			dataObject.setValue(InvtrybondPo.COLUMNS.ENDDATE.name(), invtrybondPo.getEnddate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<InvtrybondPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(InvtrybondPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
