package com.doc.common.dao.impl; 
 
public class CocompanyDAOImpl extends GeneralDAOImpl<CocompanyPo> implements CocompanyDAO { 
	public static final CocompanyDAOImpl INSTANCE = new CocompanyDAOImpl(); 
	public static final String TABLENAME = "COCOMPANY"; 

	public CocompanyDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<CocompanyPo> CONVERTER = new MapConverter<CocompanyPo>() { 
 
		@Override 
		public CocompanyPo convert(final DataObject dataObject) { 
			final CocompanyPo cocompanyPo = new CocompanyPo(); 
			cocompanyPo.setBfNo(dataObject.getString(CocompanyPo.COLUMNS.BF_NO.name())); 
			cocompanyPo.setCocompNo(dataObject.getString(CocompanyPo.COLUMNS.COCOMP_NO.name())); 
			cocompanyPo.setCocompName(dataObject.getString(CocompanyPo.COLUMNS.COCOMP_NAME.name())); 
			cocompanyPo.setSpecialst(dataObject.getString(CocompanyPo.COLUMNS.SPECIALST.name())); 
			cocompanyPo.setTel(dataObject.getString(CocompanyPo.COLUMNS.TEL.name())); 
			cocompanyPo.setCtmAdd(dataObject.getString(CocompanyPo.COLUMNS.CTM_ADD.name())); 
			cocompanyPo.setStatus(dataObject.getString(CocompanyPo.COLUMNS.STATUS.name())); 
			return cocompanyPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final CocompanyPo cocompanyPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(CocompanyPo.COLUMNS.BF_NO.name(), cocompanyPo.getBfNo()); 
			dataObject.setValue(CocompanyPo.COLUMNS.COCOMP_NO.name(), cocompanyPo.getCocompNo()); 
			dataObject.setValue(CocompanyPo.COLUMNS.COCOMP_NAME.name(), cocompanyPo.getCocompName()); 
			dataObject.setValue(CocompanyPo.COLUMNS.SPECIALST.name(), cocompanyPo.getSpecialst()); 
			dataObject.setValue(CocompanyPo.COLUMNS.TEL.name(), cocompanyPo.getTel()); 
			dataObject.setValue(CocompanyPo.COLUMNS.CTM_ADD.name(), cocompanyPo.getCtmAdd()); 
			dataObject.setValue(CocompanyPo.COLUMNS.STATUS.name(), cocompanyPo.getStatus()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<CocompanyPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(CocompanyPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(CocompanyPo.COLUMNS.BF_NO.name(), po.getBfNo()); 
		sqlWhere.add(CocompanyPo.COLUMNS.COCOMP_NO.name(), po.getCocompNo()); 
		return sqlWhere; 
	} 
 
} 
