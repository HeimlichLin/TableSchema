package com.doc.common.dao.impl; 
 
public class CtmcodeDAOImpl extends GeneralDAOImpl<CtmcodePo> implements CtmcodeDAO { 
	public static final CtmcodeDAOImpl INSTANCE = new CtmcodeDAOImpl(); 
	public static final String TABLENAME = "CTMCODE"; 

	public CtmcodeDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<CtmcodePo> CONVERTER = new MapConverter<CtmcodePo>() { 
 
		@Override 
		public CtmcodePo convert(final DataObject dataObject) { 
			final CtmcodePo ctmcodePo = new CtmcodePo(); 
			ctmcodePo.setBondno(dataObject.getString(CtmcodePo.COLUMNS.BONDNO.name())); 
			ctmcodePo.setCtmcode(dataObject.getString(CtmcodePo.COLUMNS.CTMCODE.name())); 
			ctmcodePo.setCtmname(dataObject.getString(CtmcodePo.COLUMNS.CTMNAME.name())); 
			ctmcodePo.setCtmid(dataObject.getString(CtmcodePo.COLUMNS.CTMID.name())); 
			ctmcodePo.setCtmban(dataObject.getString(CtmcodePo.COLUMNS.CTMBAN.name())); 
			ctmcodePo.setCtmengname(dataObject.getString(CtmcodePo.COLUMNS.CTMENGNAME.name())); 
			ctmcodePo.setCtmadd(dataObject.getString(CtmcodePo.COLUMNS.CTMADD.name())); 
			return ctmcodePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final CtmcodePo ctmcodePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(CtmcodePo.COLUMNS.BONDNO.name(), ctmcodePo.getBondno()); 
			dataObject.setValue(CtmcodePo.COLUMNS.CTMCODE.name(), ctmcodePo.getCtmcode()); 
			dataObject.setValue(CtmcodePo.COLUMNS.CTMNAME.name(), ctmcodePo.getCtmname()); 
			dataObject.setValue(CtmcodePo.COLUMNS.CTMID.name(), ctmcodePo.getCtmid()); 
			dataObject.setValue(CtmcodePo.COLUMNS.CTMBAN.name(), ctmcodePo.getCtmban()); 
			dataObject.setValue(CtmcodePo.COLUMNS.CTMENGNAME.name(), ctmcodePo.getCtmengname()); 
			dataObject.setValue(CtmcodePo.COLUMNS.CTMADD.name(), ctmcodePo.getCtmadd()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<CtmcodePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(CtmcodePo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(CtmcodePo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(CtmcodePo.COLUMNS.CTMCODE.name(), po.getCtmcode()); 
		return sqlWhere; 
	} 
 
} 
