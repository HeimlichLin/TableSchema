package com.doc.common.dao.impl; 
 
public class CtmcodeDAO extends GeneralDAOImpl<CtmcodeDo> implements CtmcodeDAO { 
	public static final CtmcodeDAOImpl INSTANCE = new CtmcodeDAOImpl(); 
	public static final String TABLENAME = "CTMCODE"; 

	public CtmcodeDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<CtmcodeDo> CONVERTER = new MapConverter<CtmcodeDo>() { 
 
		@Override 
		public CtmcodeDo convert(final DataObject dataObject) { 
			final CtmcodeDo ctmcodeDo = new CtmcodeDo(); 
			ctmcodeDo.setBondno(dataObject.getString(CtmcodeDo.COLUMNS.BONDNO.name())); 
			ctmcodeDo.setCtmcode(dataObject.getString(CtmcodeDo.COLUMNS.CTMCODE.name())); 
			ctmcodeDo.setCtmname(dataObject.getString(CtmcodeDo.COLUMNS.CTMNAME.name())); 
			ctmcodeDo.setCtmid(dataObject.getString(CtmcodeDo.COLUMNS.CTMID.name())); 
			ctmcodeDo.setCtmban(dataObject.getString(CtmcodeDo.COLUMNS.CTMBAN.name())); 
			ctmcodeDo.setCtmengname(dataObject.getString(CtmcodeDo.COLUMNS.CTMENGNAME.name())); 
			ctmcodeDo.setCtmadd(dataObject.getString(CtmcodeDo.COLUMNS.CTMADD.name())); 
			return ctmcodeDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final CtmcodeDo ctmcodeDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(CtmcodeDo.COLUMNS.BONDNO.name(), ctmcodeDo.getBondno()); 
			dataObject.setValue(CtmcodeDo.COLUMNS.CTMCODE.name(), ctmcodeDo.getCtmcode()); 
			dataObject.setValue(CtmcodeDo.COLUMNS.CTMNAME.name(), ctmcodeDo.getCtmname()); 
			dataObject.setValue(CtmcodeDo.COLUMNS.CTMID.name(), ctmcodeDo.getCtmid()); 
			dataObject.setValue(CtmcodeDo.COLUMNS.CTMBAN.name(), ctmcodeDo.getCtmban()); 
			dataObject.setValue(CtmcodeDo.COLUMNS.CTMENGNAME.name(), ctmcodeDo.getCtmengname()); 
			dataObject.setValue(CtmcodeDo.COLUMNS.CTMADD.name(), ctmcodeDo.getCtmadd()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<CtmcodeDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(CtmcodeDo po) { 
		sqlWhere.add(CtmcodeDo.COLUMNS.CTMNAME.name(), po.getCtmname()); 
		sqlWhere.add(CtmcodeDo.COLUMNS.CTMID.name(), po.getCtmid()); 
		sqlWhere.add(CtmcodeDo.COLUMNS.CTMBAN.name(), po.getCtmban()); 
		sqlWhere.add(CtmcodeDo.COLUMNS.CTMENGNAME.name(), po.getCtmengname()); 
		sqlWhere.add(CtmcodeDo.COLUMNS.CTMADD.name(), po.getCtmadd()); 
	} 
 
} 
