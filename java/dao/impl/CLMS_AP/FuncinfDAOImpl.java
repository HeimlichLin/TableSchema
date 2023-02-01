package com.doc.common.dao.impl; 
 
public class FuncinfDAOImpl extends GeneralDAOImpl<FuncinfPo> implements FuncinfDAO { 
	public static final FuncinfDAOImpl INSTANCE = new FuncinfDAOImpl(); 
	public static final String TABLENAME = "FUNCINF"; 

	public FuncinfDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<FuncinfPo> CONVERTER = new MapConverter<FuncinfPo>() { 
 
		@Override 
		public FuncinfPo convert(final DataObject dataObject) { 
			final FuncinfPo funcinfPo = new FuncinfPo(); 
			funcinfPo.setFuncid(dataObject.getString(FuncinfPo.COLUMNS.FUNCID.name())); 
			funcinfPo.setFuncname(dataObject.getString(FuncinfPo.COLUMNS.FUNCNAME.name())); 
			funcinfPo.setCodename(dataObject.getString(FuncinfPo.COLUMNS.CODENAME.name())); 
			return funcinfPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final FuncinfPo funcinfPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(FuncinfPo.COLUMNS.FUNCID.name(), funcinfPo.getFuncid()); 
			dataObject.setValue(FuncinfPo.COLUMNS.FUNCNAME.name(), funcinfPo.getFuncname()); 
			dataObject.setValue(FuncinfPo.COLUMNS.CODENAME.name(), funcinfPo.getCodename()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<FuncinfPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(FuncinfPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(FuncinfPo.COLUMNS.FUNCID.name(), po.getFuncid()); 
		return sqlWhere; 
	} 
 
} 
