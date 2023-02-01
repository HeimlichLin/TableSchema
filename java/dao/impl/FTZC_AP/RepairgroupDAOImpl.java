package com.doc.common.dao.impl; 
 
public class RepairgroupDAOImpl extends GeneralDAOImpl<RepairgroupPo> implements RepairgroupDAO { 
	public static final RepairgroupDAOImpl INSTANCE = new RepairgroupDAOImpl(); 
	public static final String TABLENAME = "REPAIRGROUP"; 

	public RepairgroupDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<RepairgroupPo> CONVERTER = new MapConverter<RepairgroupPo>() { 
 
		@Override 
		public RepairgroupPo convert(final DataObject dataObject) { 
			final RepairgroupPo repairgroupPo = new RepairgroupPo(); 
			repairgroupPo.setBfNo(dataObject.getString(RepairgroupPo.COLUMNS.BF_NO.name())); 
			repairgroupPo.setGroupMonth(dataObject.getString(RepairgroupPo.COLUMNS.GROUP_MONTH.name())); 
			repairgroupPo.setVersion(dataObject.getString(RepairgroupPo.COLUMNS.VERSION.name())); 
			repairgroupPo.setCommodityNo(dataObject.getString(RepairgroupPo.COLUMNS.COMMODITY_NO.name())); 
			repairgroupPo.setGoodsUnit(dataObject.getString(RepairgroupPo.COLUMNS.GOODS_UNIT.name())); 
			repairgroupPo.setGroupQty(BigDecimalUtils.formObj(dataObject.getValue(RepairgroupPo.COLUMNS.GROUP_QTY.name()))); 
			repairgroupPo.setCreateDate(dataObject.getString(RepairgroupPo.COLUMNS.CREATE_DATE.name())); 
			repairgroupPo.setSendDate(dataObject.getString(RepairgroupPo.COLUMNS.SEND_DATE.name())); 
			repairgroupPo.setGroupNo(dataObject.getString(RepairgroupPo.COLUMNS.GROUP_NO.name())); 
			repairgroupPo.setRemark(dataObject.getString(RepairgroupPo.COLUMNS.REMARK.name())); 
			repairgroupPo.setClassNo(dataObject.getString(RepairgroupPo.COLUMNS.CLASS_NO.name())); 
			return repairgroupPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final RepairgroupPo repairgroupPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(RepairgroupPo.COLUMNS.BF_NO.name(), repairgroupPo.getBfNo()); 
			dataObject.setValue(RepairgroupPo.COLUMNS.GROUP_MONTH.name(), repairgroupPo.getGroupMonth()); 
			dataObject.setValue(RepairgroupPo.COLUMNS.VERSION.name(), repairgroupPo.getVersion()); 
			dataObject.setValue(RepairgroupPo.COLUMNS.COMMODITY_NO.name(), repairgroupPo.getCommodityNo()); 
			dataObject.setValue(RepairgroupPo.COLUMNS.GOODS_UNIT.name(), repairgroupPo.getGoodsUnit()); 
			dataObject.setValue(RepairgroupPo.COLUMNS.GROUP_QTY.name(), repairgroupPo.getGroupQty()); 
			dataObject.setValue(RepairgroupPo.COLUMNS.CREATE_DATE.name(), repairgroupPo.getCreateDate()); 
			dataObject.setValue(RepairgroupPo.COLUMNS.SEND_DATE.name(), repairgroupPo.getSendDate()); 
			dataObject.setValue(RepairgroupPo.COLUMNS.GROUP_NO.name(), repairgroupPo.getGroupNo()); 
			dataObject.setValue(RepairgroupPo.COLUMNS.REMARK.name(), repairgroupPo.getRemark()); 
			dataObject.setValue(RepairgroupPo.COLUMNS.CLASS_NO.name(), repairgroupPo.getClassNo()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<RepairgroupPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(RepairgroupPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(RepairgroupPo.COLUMNS.BF_NO.name(), po.getBfNo()); 
		sqlWhere.add(RepairgroupPo.COLUMNS.GROUP_MONTH.name(), po.getGroupMonth()); 
		sqlWhere.add(RepairgroupPo.COLUMNS.VERSION.name(), po.getVersion()); 
		sqlWhere.add(RepairgroupPo.COLUMNS.COMMODITY_NO.name(), po.getCommodityNo()); 
		return sqlWhere; 
	} 
 
} 
