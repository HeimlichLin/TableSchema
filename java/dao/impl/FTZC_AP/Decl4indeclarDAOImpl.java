package com.doc.common.dao.impl; 
 
public class Decl4indeclarDAOImpl extends GeneralDAOImpl<Decl4indeclarPo> implements Decl4indeclarDAO { 
	public static final Decl4indeclarDAOImpl INSTANCE = new Decl4indeclarDAOImpl(); 
	public static final String TABLENAME = "DECL4INDECLAR"; 

	public Decl4indeclarDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Decl4indeclarPo> CONVERTER = new MapConverter<Decl4indeclarPo>() { 
 
		@Override 
		public Decl4indeclarPo convert(final DataObject dataObject) { 
			final Decl4indeclarPo decl4indeclarPo = new Decl4indeclarPo(); 
			decl4indeclarPo.setBfNo(dataObject.getString(Decl4indeclarPo.COLUMNS.BF_NO.name())); 
			decl4indeclarPo.setControlNo(dataObject.getString(Decl4indeclarPo.COLUMNS.CONTROL_NO.name())); 
			decl4indeclarPo.setDeclNo(dataObject.getString(Decl4indeclarPo.COLUMNS.DECL_NO.name())); 
			decl4indeclarPo.setSeqNo(BigDecimalUtils.formObj(dataObject.getValue(Decl4indeclarPo.COLUMNS.SEQ_NO.name()))); 
			return decl4indeclarPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Decl4indeclarPo decl4indeclarPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Decl4indeclarPo.COLUMNS.BF_NO.name(), decl4indeclarPo.getBfNo()); 
			dataObject.setValue(Decl4indeclarPo.COLUMNS.CONTROL_NO.name(), decl4indeclarPo.getControlNo()); 
			dataObject.setValue(Decl4indeclarPo.COLUMNS.DECL_NO.name(), decl4indeclarPo.getDeclNo()); 
			dataObject.setValue(Decl4indeclarPo.COLUMNS.SEQ_NO.name(), decl4indeclarPo.getSeqNo()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Decl4indeclarPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Decl4indeclarPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
