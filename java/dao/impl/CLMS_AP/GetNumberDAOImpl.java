package com.doc.common.dao.impl; 
 
public class GetNumberDAOImpl extends GeneralDAOImpl<GetNumberPo> implements GetNumberDAO { 
	public static final GetNumberDAOImpl INSTANCE = new GetNumberDAOImpl(); 
	public static final String TABLENAME = "GET_NUMBER"; 

	public GetNumberDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<GetNumberPo> CONVERTER = new MapConverter<GetNumberPo>() { 
 
		@Override 
		public GetNumberPo convert(final DataObject dataObject) { 
			final GetNumberPo getNumberPo = new GetNumberPo(); 
			getNumberPo.setPgmId(dataObject.getString(GetNumberPo.COLUMNS.PGM_ID.name())); 
			getNumberPo.setSyscode1(dataObject.getString(GetNumberPo.COLUMNS.SYSCODE1.name())); 
			getNumberPo.setSyscode2(dataObject.getString(GetNumberPo.COLUMNS.SYSCODE2.name())); 
			getNumberPo.setSyscode3(dataObject.getString(GetNumberPo.COLUMNS.SYSCODE3.name())); 
			getNumberPo.setCount(BigDecimalUtils.formObj(dataObject.getValue(GetNumberPo.COLUMNS.COUNT.name()))); 
			return getNumberPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final GetNumberPo getNumberPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(GetNumberPo.COLUMNS.PGM_ID.name(), getNumberPo.getPgmId()); 
			dataObject.setValue(GetNumberPo.COLUMNS.SYSCODE1.name(), getNumberPo.getSyscode1()); 
			dataObject.setValue(GetNumberPo.COLUMNS.SYSCODE2.name(), getNumberPo.getSyscode2()); 
			dataObject.setValue(GetNumberPo.COLUMNS.SYSCODE3.name(), getNumberPo.getSyscode3()); 
			dataObject.setValue(GetNumberPo.COLUMNS.COUNT.name(), getNumberPo.getCount()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<GetNumberPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(GetNumberPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(GetNumberPo.COLUMNS.PGM_ID.name(), po.getPgmId()); 
		sqlWhere.add(GetNumberPo.COLUMNS.SYSCODE1.name(), po.getSyscode1()); 
		sqlWhere.add(GetNumberPo.COLUMNS.SYSCODE2.name(), po.getSyscode2()); 
		sqlWhere.add(GetNumberPo.COLUMNS.SYSCODE3.name(), po.getSyscode3()); 
		return sqlWhere; 
	} 
 
} 
