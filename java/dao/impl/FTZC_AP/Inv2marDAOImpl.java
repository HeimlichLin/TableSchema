package com.doc.common.dao.impl; 
 
public class Inv2marDAOImpl extends GeneralDAOImpl<Inv2marPo> implements Inv2marDAO { 
	public static final Inv2marDAOImpl INSTANCE = new Inv2marDAOImpl(); 
	public static final String TABLENAME = "INV2MAR"; 

	public Inv2marDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Inv2marPo> CONVERTER = new MapConverter<Inv2marPo>() { 
 
		@Override 
		public Inv2marPo convert(final DataObject dataObject) { 
			final Inv2marPo inv2marPo = new Inv2marPo(); 
			inv2marPo.setBfNo(dataObject.getString(Inv2marPo.COLUMNS.BF_NO.name())); 
			inv2marPo.setInvYear(dataObject.getString(Inv2marPo.COLUMNS.INV_YEAR.name())); 
			inv2marPo.setInvItem(dataObject.getString(Inv2marPo.COLUMNS.INV_ITEM.name())); 
			inv2marPo.setInvMId(dataObject.getString(Inv2marPo.COLUMNS.INV_M_ID.name())); 
			inv2marPo.setInvMType(dataObject.getString(Inv2marPo.COLUMNS.INV_M_TYPE.name())); 
			inv2marPo.setPrdtNo(dataObject.getString(Inv2marPo.COLUMNS.PRDT_NO.name())); 
			inv2marPo.setGoodsUnit(dataObject.getString(Inv2marPo.COLUMNS.GOODS_UNIT.name())); 
			inv2marPo.setInvQty(BigDecimalUtils.formObj(dataObject.getValue(Inv2marPo.COLUMNS.INV_QTY.name()))); 
			inv2marPo.setRefDocType(dataObject.getString(Inv2marPo.COLUMNS.REF_DOC_TYPE.name())); 
			inv2marPo.setRefDocNo(dataObject.getString(Inv2marPo.COLUMNS.REF_DOC_NO.name())); 
			inv2marPo.setRefDocDate(dataObject.getString(Inv2marPo.COLUMNS.REF_DOC_DATE.name())); 
			inv2marPo.setRefDocVer(dataObject.getString(Inv2marPo.COLUMNS.REF_DOC_VER.name())); 
			inv2marPo.setRemark(dataObject.getString(Inv2marPo.COLUMNS.REMARK.name())); 
			inv2marPo.setInvDate(dataObject.getString(Inv2marPo.COLUMNS.INV_DATE.name())); 
			inv2marPo.setInout(dataObject.getString(Inv2marPo.COLUMNS.INOUT.name())); 
			inv2marPo.setCocompNo(dataObject.getString(Inv2marPo.COLUMNS.COCOMP_NO.name())); 
			inv2marPo.setCtmCode(dataObject.getString(Inv2marPo.COLUMNS.CTM_CODE.name())); 
			return inv2marPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Inv2marPo inv2marPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Inv2marPo.COLUMNS.BF_NO.name(), inv2marPo.getBfNo()); 
			dataObject.setValue(Inv2marPo.COLUMNS.INV_YEAR.name(), inv2marPo.getInvYear()); 
			dataObject.setValue(Inv2marPo.COLUMNS.INV_ITEM.name(), inv2marPo.getInvItem()); 
			dataObject.setValue(Inv2marPo.COLUMNS.INV_M_ID.name(), inv2marPo.getInvMId()); 
			dataObject.setValue(Inv2marPo.COLUMNS.INV_M_TYPE.name(), inv2marPo.getInvMType()); 
			dataObject.setValue(Inv2marPo.COLUMNS.PRDT_NO.name(), inv2marPo.getPrdtNo()); 
			dataObject.setValue(Inv2marPo.COLUMNS.GOODS_UNIT.name(), inv2marPo.getGoodsUnit()); 
			dataObject.setValue(Inv2marPo.COLUMNS.INV_QTY.name(), inv2marPo.getInvQty()); 
			dataObject.setValue(Inv2marPo.COLUMNS.REF_DOC_TYPE.name(), inv2marPo.getRefDocType()); 
			dataObject.setValue(Inv2marPo.COLUMNS.REF_DOC_NO.name(), inv2marPo.getRefDocNo()); 
			dataObject.setValue(Inv2marPo.COLUMNS.REF_DOC_DATE.name(), inv2marPo.getRefDocDate()); 
			dataObject.setValue(Inv2marPo.COLUMNS.REF_DOC_VER.name(), inv2marPo.getRefDocVer()); 
			dataObject.setValue(Inv2marPo.COLUMNS.REMARK.name(), inv2marPo.getRemark()); 
			dataObject.setValue(Inv2marPo.COLUMNS.INV_DATE.name(), inv2marPo.getInvDate()); 
			dataObject.setValue(Inv2marPo.COLUMNS.INOUT.name(), inv2marPo.getInout()); 
			dataObject.setValue(Inv2marPo.COLUMNS.COCOMP_NO.name(), inv2marPo.getCocompNo()); 
			dataObject.setValue(Inv2marPo.COLUMNS.CTM_CODE.name(), inv2marPo.getCtmCode()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Inv2marPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Inv2marPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
