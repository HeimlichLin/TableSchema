package com.doc.common.dao.impl; 
 
public class Inv2mardtlDAOImpl extends GeneralDAOImpl<Inv2mardtlPo> implements Inv2mardtlDAO { 
	public static final Inv2mardtlDAOImpl INSTANCE = new Inv2mardtlDAOImpl(); 
	public static final String TABLENAME = "INV2MARDTL"; 

	public Inv2mardtlDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Inv2mardtlPo> CONVERTER = new MapConverter<Inv2mardtlPo>() { 
 
		@Override 
		public Inv2mardtlPo convert(final DataObject dataObject) { 
			final Inv2mardtlPo inv2mardtlPo = new Inv2mardtlPo(); 
			inv2mardtlPo.setInvMId(dataObject.getString(Inv2mardtlPo.COLUMNS.INV_M_ID.name())); 
			inv2mardtlPo.setInvMType(dataObject.getString(Inv2mardtlPo.COLUMNS.INV_M_TYPE.name())); 
			inv2mardtlPo.setInvDtlItem(dataObject.getString(Inv2mardtlPo.COLUMNS.INV_DTL_ITEM.name())); 
			inv2mardtlPo.setMarNo(dataObject.getString(Inv2mardtlPo.COLUMNS.MAR_NO.name())); 
			inv2mardtlPo.setGoodsUnit(dataObject.getString(Inv2mardtlPo.COLUMNS.GOODS_UNIT.name())); 
			inv2mardtlPo.setUnitQty(BigDecimalUtils.formObj(dataObject.getValue(Inv2mardtlPo.COLUMNS.UNIT_QTY.name()))); 
			inv2mardtlPo.setMarQty(BigDecimalUtils.formObj(dataObject.getValue(Inv2mardtlPo.COLUMNS.MAR_QTY.name()))); 
			inv2mardtlPo.setRefGuid(dataObject.getString(Inv2mardtlPo.COLUMNS.REF_GUID.name())); 
			inv2mardtlPo.setPlevel(dataObject.getString(Inv2mardtlPo.COLUMNS.PLEVEL.name())); 
			inv2mardtlPo.setRemark(dataObject.getString(Inv2mardtlPo.COLUMNS.REMARK.name())); 
			inv2mardtlPo.setPrdtMark(dataObject.getString(Inv2mardtlPo.COLUMNS.PRDT_MARK.name())); 
			return inv2mardtlPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Inv2mardtlPo inv2mardtlPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Inv2mardtlPo.COLUMNS.INV_M_ID.name(), inv2mardtlPo.getInvMId()); 
			dataObject.setValue(Inv2mardtlPo.COLUMNS.INV_M_TYPE.name(), inv2mardtlPo.getInvMType()); 
			dataObject.setValue(Inv2mardtlPo.COLUMNS.INV_DTL_ITEM.name(), inv2mardtlPo.getInvDtlItem()); 
			dataObject.setValue(Inv2mardtlPo.COLUMNS.MAR_NO.name(), inv2mardtlPo.getMarNo()); 
			dataObject.setValue(Inv2mardtlPo.COLUMNS.GOODS_UNIT.name(), inv2mardtlPo.getGoodsUnit()); 
			dataObject.setValue(Inv2mardtlPo.COLUMNS.UNIT_QTY.name(), inv2mardtlPo.getUnitQty()); 
			dataObject.setValue(Inv2mardtlPo.COLUMNS.MAR_QTY.name(), inv2mardtlPo.getMarQty()); 
			dataObject.setValue(Inv2mardtlPo.COLUMNS.REF_GUID.name(), inv2mardtlPo.getRefGuid()); 
			dataObject.setValue(Inv2mardtlPo.COLUMNS.PLEVEL.name(), inv2mardtlPo.getPlevel()); 
			dataObject.setValue(Inv2mardtlPo.COLUMNS.REMARK.name(), inv2mardtlPo.getRemark()); 
			dataObject.setValue(Inv2mardtlPo.COLUMNS.PRDT_MARK.name(), inv2mardtlPo.getPrdtMark()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Inv2mardtlPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Inv2mardtlPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
