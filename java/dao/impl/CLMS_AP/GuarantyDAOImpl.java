package com.doc.common.dao.impl; 
 
public class GuarantyDAOImpl extends GeneralDAOImpl<GuarantyPo> implements GuarantyDAO { 
	public static final GuarantyDAOImpl INSTANCE = new GuarantyDAOImpl(); 
	public static final String TABLENAME = "GUARANTY"; 

	public GuarantyDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<GuarantyPo> CONVERTER = new MapConverter<GuarantyPo>() { 
 
		@Override 
		public GuarantyPo convert(final DataObject dataObject) { 
			final GuarantyPo guarantyPo = new GuarantyPo(); 
			guarantyPo.setBondno(dataObject.getString(GuarantyPo.COLUMNS.BONDNO.name())); 
			guarantyPo.setGrntamt(BigDecimalUtils.formObj(dataObject.getValue(GuarantyPo.COLUMNS.GRNTAMT.name()))); 
			guarantyPo.setGrntamti(BigDecimalUtils.formObj(dataObject.getValue(GuarantyPo.COLUMNS.GRNTAMTI.name()))); 
			return guarantyPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final GuarantyPo guarantyPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(GuarantyPo.COLUMNS.BONDNO.name(), guarantyPo.getBondno()); 
			dataObject.setValue(GuarantyPo.COLUMNS.GRNTAMT.name(), guarantyPo.getGrntamt()); 
			dataObject.setValue(GuarantyPo.COLUMNS.GRNTAMTI.name(), guarantyPo.getGrntamti()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<GuarantyPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(GuarantyPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(GuarantyPo.COLUMNS.BONDNO.name(), po.getBondno()); 
		return sqlWhere; 
	} 
 
} 
