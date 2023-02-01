package com.doc.common.dao.impl; 
 
public class Ex5203dNDAOImpl extends GeneralDAOImpl<Ex5203dNPo> implements Ex5203dNDAO { 
	public static final Ex5203dNDAOImpl INSTANCE = new Ex5203dNDAOImpl(); 
	public static final String TABLENAME = "EX_5203D_N"; 

	public Ex5203dNDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Ex5203dNPo> CONVERTER = new MapConverter<Ex5203dNPo>() { 
 
		@Override 
		public Ex5203dNPo convert(final DataObject dataObject) { 
			final Ex5203dNPo ex5203dNPo = new Ex5203dNPo(); 
			ex5203dNPo.setDeclNo(dataObject.getString(Ex5203dNPo.COLUMNS.DECL_NO.name())); 
			ex5203dNPo.setItemNo(BigDecimalUtils.formObj(dataObject.getValue(Ex5203dNPo.COLUMNS.ITEM_NO.name()))); 
			ex5203dNPo.setCccCode(dataObject.getString(Ex5203dNPo.COLUMNS.CCC_CODE.name())); 
			ex5203dNPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(Ex5203dNPo.COLUMNS.WEIGHT.name()))); 
			ex5203dNPo.setFobValueTwd(BigDecimalUtils.formObj(dataObject.getValue(Ex5203dNPo.COLUMNS.FOB_VALUE_TWD.name()))); 
			return ex5203dNPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Ex5203dNPo ex5203dNPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Ex5203dNPo.COLUMNS.DECL_NO.name(), ex5203dNPo.getDeclNo()); 
			dataObject.setValue(Ex5203dNPo.COLUMNS.ITEM_NO.name(), ex5203dNPo.getItemNo()); 
			dataObject.setValue(Ex5203dNPo.COLUMNS.CCC_CODE.name(), ex5203dNPo.getCccCode()); 
			dataObject.setValue(Ex5203dNPo.COLUMNS.WEIGHT.name(), ex5203dNPo.getWeight()); 
			dataObject.setValue(Ex5203dNPo.COLUMNS.FOB_VALUE_TWD.name(), ex5203dNPo.getFobValueTwd()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Ex5203dNPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Ex5203dNPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Ex5203dNPo.COLUMNS.DECL_NO.name(), po.getDeclNo()); 
		sqlWhere.add(Ex5203dNPo.COLUMNS.ITEM_NO.name(), po.getItemNo()); 
		return sqlWhere; 
	} 
 
} 
