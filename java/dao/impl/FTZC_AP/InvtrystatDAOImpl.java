package com.doc.common.dao.impl; 
 
public class InvtrystatDAOImpl extends GeneralDAOImpl<InvtrystatPo> implements InvtrystatDAO { 
	public static final InvtrystatDAOImpl INSTANCE = new InvtrystatDAOImpl(); 
	public static final String TABLENAME = "INVTRYSTAT"; 

	public InvtrystatDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<InvtrystatPo> CONVERTER = new MapConverter<InvtrystatPo>() { 
 
		@Override 
		public InvtrystatPo convert(final DataObject dataObject) { 
			final InvtrystatPo invtrystatPo = new InvtrystatPo(); 
			invtrystatPo.setBfNo(dataObject.getString(InvtrystatPo.COLUMNS.BF_NO.name())); 
			invtrystatPo.setInvYear(dataObject.getString(InvtrystatPo.COLUMNS.INV_YEAR.name())); 
			invtrystatPo.setInvItem(BigDecimalUtils.formObj(dataObject.getValue(InvtrystatPo.COLUMNS.INV_ITEM.name()))); 
			invtrystatPo.setCommodityNo(dataObject.getString(InvtrystatPo.COLUMNS.COMMODITY_NO.name())); 
			invtrystatPo.setGoodType(dataObject.getString(InvtrystatPo.COLUMNS.GOOD_TYPE.name())); 
			invtrystatPo.setGoodKind(dataObject.getString(InvtrystatPo.COLUMNS.GOOD_KIND.name())); 
			invtrystatPo.setGoodUnit(dataObject.getString(InvtrystatPo.COLUMNS.GOOD_UNIT.name())); 
			invtrystatPo.setGoodsSpec(dataObject.getString(InvtrystatPo.COLUMNS.GOODS_SPEC.name())); 
			invtrystatPo.setGoodsModel(dataObject.getString(InvtrystatPo.COLUMNS.GOODS_MODEL.name())); 
			invtrystatPo.setGoodsDesc(dataObject.getString(InvtrystatPo.COLUMNS.GOODS_DESC.name())); 
			invtrystatPo.setModifyDate(dataObject.getString(InvtrystatPo.COLUMNS.MODIFY_DATE.name())); 
			invtrystatPo.setMarQty(BigDecimalUtils.formObj(dataObject.getValue(InvtrystatPo.COLUMNS.MAR_QTY.name()))); 
			invtrystatPo.setLinemarQty(BigDecimalUtils.formObj(dataObject.getValue(InvtrystatPo.COLUMNS.LINEMAR_QTY.name()))); 
			invtrystatPo.setPrd2marQty(BigDecimalUtils.formObj(dataObject.getValue(InvtrystatPo.COLUMNS.PRD2MAR_QTY.name()))); 
			invtrystatPo.setLineprd2marQty(BigDecimalUtils.formObj(dataObject.getValue(InvtrystatPo.COLUMNS.LINEPRD2MAR_QTY.name()))); 
			invtrystatPo.setStatQty(BigDecimalUtils.formObj(dataObject.getValue(InvtrystatPo.COLUMNS.STAT_QTY.name()))); 
			invtrystatPo.setRemark(dataObject.getString(InvtrystatPo.COLUMNS.REMARK.name())); 
			invtrystatPo.setInout(dataObject.getString(InvtrystatPo.COLUMNS.INOUT.name())); 
			invtrystatPo.setCtmCode(dataObject.getString(InvtrystatPo.COLUMNS.CTM_CODE.name())); 
			invtrystatPo.setCocompNo(dataObject.getString(InvtrystatPo.COLUMNS.COCOMP_NO.name())); 
			invtrystatPo.setInvDate(dataObject.getString(InvtrystatPo.COLUMNS.INV_DATE.name())); 
			return invtrystatPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final InvtrystatPo invtrystatPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(InvtrystatPo.COLUMNS.BF_NO.name(), invtrystatPo.getBfNo()); 
			dataObject.setValue(InvtrystatPo.COLUMNS.INV_YEAR.name(), invtrystatPo.getInvYear()); 
			dataObject.setValue(InvtrystatPo.COLUMNS.INV_ITEM.name(), invtrystatPo.getInvItem()); 
			dataObject.setValue(InvtrystatPo.COLUMNS.COMMODITY_NO.name(), invtrystatPo.getCommodityNo()); 
			dataObject.setValue(InvtrystatPo.COLUMNS.GOOD_TYPE.name(), invtrystatPo.getGoodType()); 
			dataObject.setValue(InvtrystatPo.COLUMNS.GOOD_KIND.name(), invtrystatPo.getGoodKind()); 
			dataObject.setValue(InvtrystatPo.COLUMNS.GOOD_UNIT.name(), invtrystatPo.getGoodUnit()); 
			dataObject.setValue(InvtrystatPo.COLUMNS.GOODS_SPEC.name(), invtrystatPo.getGoodsSpec()); 
			dataObject.setValue(InvtrystatPo.COLUMNS.GOODS_MODEL.name(), invtrystatPo.getGoodsModel()); 
			dataObject.setValue(InvtrystatPo.COLUMNS.GOODS_DESC.name(), invtrystatPo.getGoodsDesc()); 
			dataObject.setValue(InvtrystatPo.COLUMNS.MODIFY_DATE.name(), invtrystatPo.getModifyDate()); 
			dataObject.setValue(InvtrystatPo.COLUMNS.MAR_QTY.name(), invtrystatPo.getMarQty()); 
			dataObject.setValue(InvtrystatPo.COLUMNS.LINEMAR_QTY.name(), invtrystatPo.getLinemarQty()); 
			dataObject.setValue(InvtrystatPo.COLUMNS.PRD2MAR_QTY.name(), invtrystatPo.getPrd2marQty()); 
			dataObject.setValue(InvtrystatPo.COLUMNS.LINEPRD2MAR_QTY.name(), invtrystatPo.getLineprd2marQty()); 
			dataObject.setValue(InvtrystatPo.COLUMNS.STAT_QTY.name(), invtrystatPo.getStatQty()); 
			dataObject.setValue(InvtrystatPo.COLUMNS.REMARK.name(), invtrystatPo.getRemark()); 
			dataObject.setValue(InvtrystatPo.COLUMNS.INOUT.name(), invtrystatPo.getInout()); 
			dataObject.setValue(InvtrystatPo.COLUMNS.CTM_CODE.name(), invtrystatPo.getCtmCode()); 
			dataObject.setValue(InvtrystatPo.COLUMNS.COCOMP_NO.name(), invtrystatPo.getCocompNo()); 
			dataObject.setValue(InvtrystatPo.COLUMNS.INV_DATE.name(), invtrystatPo.getInvDate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<InvtrystatPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(InvtrystatPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
