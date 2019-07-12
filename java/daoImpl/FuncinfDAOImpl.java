package com.doc.common.dao.impl; 
 
public class FuncinfDAOImpl extends GeneralDAOImpl<FuncinfDo> implements FuncinfDAOImpl { 
	public static final FuncinfDAOImpl INSTANCE = new FuncinfDAOImpl(); 
	public static final String TABLENAME = "FUNCINF"; 

	public FuncinfDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<FuncinfDo> CONVERTER = new MapConverter<FuncinfDo>() { 
 
		@Override 
		public FuncinfDo convert(final DataObject dataObject) { 
			final FuncinfDo funcinfDo = new FuncinfDo(); 
			funcinfDo.setFuncid(dataObject.getString(FuncinfDo.COLUMNS.FUNCID.name())); 
			funcinfDo.setFuncname(dataObject.getString(FuncinfDo.COLUMNS.FUNCNAME.name())); 
			funcinfDo.setCodename(dataObject.getString(FuncinfDo.COLUMNS.CODENAME.name())); 
			return funcinfDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final FuncinfDo funcinfDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(FuncinfDo.COLUMNS.FUNCID.name(), funcinfDo.getFuncid()); 
			dataObject.setValue(FuncinfDo.COLUMNS.FUNCNAME.name(), funcinfDo.getFuncname()); 
			dataObject.setValue(FuncinfDo.COLUMNS.CODENAME.name(), funcinfDo.getCodename()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<FuncinfDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(FuncinfDo po) { 
		sqlWhere.add(FuncinfDo.COLUMNS.FUNCID.name(), po.getFuncid()); 
	} 
 
} 
