package com.doc.common.dao.impl; 
 
public class GuarantyDAOImpl extends GeneralDAOImpl<GuarantyDo> implements GuarantyDAOImpl { 
	public static final GuarantyDAOImpl INSTANCE = new GuarantyDAOImpl(); 
	public static final String TABLENAME = "GUARANTY"; 

	public GuarantyDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<GuarantyDo> CONVERTER = new MapConverter<GuarantyDo>() { 
 
		@Override 
		public GuarantyDo convert(final DataObject dataObject) { 
			final GuarantyDo guarantyDo = new GuarantyDo(); 
			guarantyDo.setBondno(dataObject.getString(GuarantyDo.COLUMNS.BONDNO.name())); 
			guarantyDo.setGrntamt(BigDecimalUtils.formObj(dataObject.getString(GuarantyDo.COLUMNS.GRNTAMT.name()))); 
			guarantyDo.setGrntamti(BigDecimalUtils.formObj(dataObject.getString(GuarantyDo.COLUMNS.GRNTAMTI.name()))); 
			return guarantyDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final GuarantyDo guarantyDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(GuarantyDo.COLUMNS.BONDNO.name(), guarantyDo.getBondno()); 
			dataObject.setValue(GuarantyDo.COLUMNS.GRNTAMT.name(), guarantyDo.getGrntamt()); 
			dataObject.setValue(GuarantyDo.COLUMNS.GRNTAMTI.name(), guarantyDo.getGrntamti()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<GuarantyDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(GuarantyDo po) { 
		sqlWhere.add(GuarantyDo.COLUMNS.BONDNO.name(), po.getBondno()); 
	} 
 
} 
