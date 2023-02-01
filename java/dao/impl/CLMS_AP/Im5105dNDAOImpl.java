package com.doc.common.dao.impl; 
 
public class Im5105dNDAOImpl extends GeneralDAOImpl<Im5105dNPo> implements Im5105dNDAO { 
	public static final Im5105dNDAOImpl INSTANCE = new Im5105dNDAOImpl(); 
	public static final String TABLENAME = "IM_5105D_N"; 

	public Im5105dNDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Im5105dNPo> CONVERTER = new MapConverter<Im5105dNPo>() { 
 
		@Override 
		public Im5105dNPo convert(final DataObject dataObject) { 
			final Im5105dNPo im5105dNPo = new Im5105dNPo(); 
			im5105dNPo.setDeclNo(dataObject.getString(Im5105dNPo.COLUMNS.DECL_NO.name())); 
			im5105dNPo.setItemNo(BigDecimalUtils.formObj(dataObject.getValue(Im5105dNPo.COLUMNS.ITEM_NO.name()))); 
			im5105dNPo.setCccCode(dataObject.getString(Im5105dNPo.COLUMNS.CCC_CODE.name())); 
			im5105dNPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(Im5105dNPo.COLUMNS.WEIGHT.name()))); 
			im5105dNPo.setCustomsValueAmt(BigDecimalUtils.formObj(dataObject.getValue(Im5105dNPo.COLUMNS.CUSTOMS_VALUE_AMT.name()))); 
			return im5105dNPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Im5105dNPo im5105dNPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Im5105dNPo.COLUMNS.DECL_NO.name(), im5105dNPo.getDeclNo()); 
			dataObject.setValue(Im5105dNPo.COLUMNS.ITEM_NO.name(), im5105dNPo.getItemNo()); 
			dataObject.setValue(Im5105dNPo.COLUMNS.CCC_CODE.name(), im5105dNPo.getCccCode()); 
			dataObject.setValue(Im5105dNPo.COLUMNS.WEIGHT.name(), im5105dNPo.getWeight()); 
			dataObject.setValue(Im5105dNPo.COLUMNS.CUSTOMS_VALUE_AMT.name(), im5105dNPo.getCustomsValueAmt()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Im5105dNPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Im5105dNPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Im5105dNPo.COLUMNS.DECL_NO.name(), po.getDeclNo()); 
		sqlWhere.add(Im5105dNPo.COLUMNS.ITEM_NO.name(), po.getItemNo()); 
		return sqlWhere; 
	} 
 
} 
