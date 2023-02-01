package com.doc.common.dao.impl; 
 
public class AaaaaDAOImpl extends GeneralDAOImpl<AaaaaPo> implements AaaaaDAO { 
	public static final AaaaaDAOImpl INSTANCE = new AaaaaDAOImpl(); 
	public static final String TABLENAME = "AAAAA"; 

	public AaaaaDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<AaaaaPo> CONVERTER = new MapConverter<AaaaaPo>() { 
 
		@Override 
		public AaaaaPo convert(final DataObject dataObject) { 
			final AaaaaPo aaaaaPo = new AaaaaPo(); 
			aaaaaPo.setExpbagno(dataObject.getString(AaaaaPo.COLUMNS.EXPBAGNO.name())); 
			aaaaaPo.setExpCount(BigDecimalUtils.formObj(dataObject.getValue(AaaaaPo.COLUMNS.EXP_COUNT.name()))); 
			return aaaaaPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final AaaaaPo aaaaaPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(AaaaaPo.COLUMNS.EXPBAGNO.name(), aaaaaPo.getExpbagno()); 
			dataObject.setValue(AaaaaPo.COLUMNS.EXP_COUNT.name(), aaaaaPo.getExpCount()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<AaaaaPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(AaaaaPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
