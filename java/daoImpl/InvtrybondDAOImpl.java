package com.doc.common.dao.impl; 
 
public class InvtrybondDAOImpl extends GeneralDAOImpl<InvtrybondDo> implements InvtrybondDAOImpl { 
	public static final InvtrybondDAOImpl INSTANCE = new InvtrybondDAOImpl(); 
	public static final String TABLENAME = "INVTRYBOND"; 

	public InvtrybondDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<InvtrybondDo> CONVERTER = new MapConverter<InvtrybondDo>() { 
 
		@Override 
		public InvtrybondDo convert(final DataObject dataObject) { 
			final InvtrybondDo invtrybondDo = new InvtrybondDo(); 
			invtrybondDo.setBondno(dataObject.getString(InvtrybondDo.COLUMNS.BONDNO.name())); 
			invtrybondDo.setYy(dataObject.getString(InvtrybondDo.COLUMNS.YY.name())); 
			invtrybondDo.setStrtdate(dataObject.getString(InvtrybondDo.COLUMNS.STRTDATE.name())); 
			invtrybondDo.setEnddate(dataObject.getString(InvtrybondDo.COLUMNS.ENDDATE.name())); 
			return invtrybondDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final InvtrybondDo invtrybondDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(InvtrybondDo.COLUMNS.BONDNO.name(), invtrybondDo.getBondno()); 
			dataObject.setValue(InvtrybondDo.COLUMNS.YY.name(), invtrybondDo.getYy()); 
			dataObject.setValue(InvtrybondDo.COLUMNS.STRTDATE.name(), invtrybondDo.getStrtdate()); 
			dataObject.setValue(InvtrybondDo.COLUMNS.ENDDATE.name(), invtrybondDo.getEnddate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<InvtrybondDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(InvtrybondDo po) { 
	} 
 
} 
