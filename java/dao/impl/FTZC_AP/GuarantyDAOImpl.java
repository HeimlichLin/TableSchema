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
			guarantyPo.setBfNo(dataObject.getString(GuarantyPo.COLUMNS.BF_NO.name())); 
			guarantyPo.setGrntAmt(BigDecimalUtils.formObj(dataObject.getValue(GuarantyPo.COLUMNS.GRNT_AMT.name()))); 
			guarantyPo.setGrntAmtI(BigDecimalUtils.formObj(dataObject.getValue(GuarantyPo.COLUMNS.GRNT_AMT_I.name()))); 
			return guarantyPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final GuarantyPo guarantyPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(GuarantyPo.COLUMNS.BF_NO.name(), guarantyPo.getBfNo()); 
			dataObject.setValue(GuarantyPo.COLUMNS.GRNT_AMT.name(), guarantyPo.getGrntAmt()); 
			dataObject.setValue(GuarantyPo.COLUMNS.GRNT_AMT_I.name(), guarantyPo.getGrntAmtI()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<GuarantyPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(GuarantyPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
