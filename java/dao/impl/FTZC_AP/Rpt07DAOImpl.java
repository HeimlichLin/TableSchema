package com.doc.common.dao.impl; 
 
public class Rpt07DAOImpl extends GeneralDAOImpl<Rpt07Po> implements Rpt07DAO { 
	public static final Rpt07DAOImpl INSTANCE = new Rpt07DAOImpl(); 
	public static final String TABLENAME = "RPT_07"; 

	public Rpt07DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Rpt07Po> CONVERTER = new MapConverter<Rpt07Po>() { 
 
		@Override 
		public Rpt07Po convert(final DataObject dataObject) { 
			final Rpt07Po rpt07Po = new Rpt07Po(); 
			rpt07Po.setOutDate(dataObject.getString(Rpt07Po.COLUMNS.OUT_DATE.name())); 
			rpt07Po.setDeclNo(dataObject.getString(Rpt07Po.COLUMNS.DECL_NO.name())); 
			rpt07Po.setGoodsDesc(dataObject.getString(Rpt07Po.COLUMNS.GOODS_DESC.name())); 
			rpt07Po.setGoodsBrand(dataObject.getString(Rpt07Po.COLUMNS.GOODS_BRAND.name())); 
			rpt07Po.setGoodsSpec(dataObject.getString(Rpt07Po.COLUMNS.GOODS_SPEC.name())); 
			rpt07Po.setCommodityNo(dataObject.getString(Rpt07Po.COLUMNS.COMMODITY_NO.name())); 
			rpt07Po.setGoodsUnit(dataObject.getString(Rpt07Po.COLUMNS.GOODS_UNIT.name())); 
			rpt07Po.setTotalQty(BigDecimalUtils.formObj(dataObject.getValue(Rpt07Po.COLUMNS.TOTAL_QTY.name()))); 
			rpt07Po.setMaterialinQty(BigDecimalUtils.formObj(dataObject.getValue(Rpt07Po.COLUMNS.MATERIALIN_QTY.name()))); 
			rpt07Po.setMaterialtaxQty(BigDecimalUtils.formObj(dataObject.getValue(Rpt07Po.COLUMNS.MATERIALTAX_QTY.name()))); 
			rpt07Po.setProductinQty(BigDecimalUtils.formObj(dataObject.getValue(Rpt07Po.COLUMNS.PRODUCTIN_QTY.name()))); 
			rpt07Po.setProductoutQty(BigDecimalUtils.formObj(dataObject.getValue(Rpt07Po.COLUMNS.PRODUCTOUT_QTY.name()))); 
			rpt07Po.setProducttaxQty(BigDecimalUtils.formObj(dataObject.getValue(Rpt07Po.COLUMNS.PRODUCTTAX_QTY.name()))); 
			rpt07Po.setScrpQty(BigDecimalUtils.formObj(dataObject.getValue(Rpt07Po.COLUMNS.SCRP_QTY.name()))); 
			rpt07Po.setVerifyUnit(BigDecimalUtils.formObj(dataObject.getValue(Rpt07Po.COLUMNS.VERIFY_UNIT.name()))); 
			rpt07Po.setVerifyQty(BigDecimalUtils.formObj(dataObject.getValue(Rpt07Po.COLUMNS.VERIFY_QTY.name()))); 
			rpt07Po.setBalanceQty(BigDecimalUtils.formObj(dataObject.getValue(Rpt07Po.COLUMNS.BALANCE_QTY.name()))); 
			rpt07Po.setOutDoc(dataObject.getString(Rpt07Po.COLUMNS.OUT_DOC.name())); 
			rpt07Po.setBomNo(dataObject.getString(Rpt07Po.COLUMNS.BOM_NO.name())); 
			rpt07Po.setScrapDoc(dataObject.getString(Rpt07Po.COLUMNS.SCRAP_DOC.name())); 
			rpt07Po.setProductDoc(dataObject.getString(Rpt07Po.COLUMNS.PRODUCT_DOC.name())); 
			rpt07Po.setExtendDoc(dataObject.getString(Rpt07Po.COLUMNS.EXTEND_DOC.name())); 
			rpt07Po.setApproveTime(dataObject.getString(Rpt07Po.COLUMNS.APPROVE_TIME.name())); 
			rpt07Po.setMemo(dataObject.getString(Rpt07Po.COLUMNS.MEMO.name())); 
			rpt07Po.setBfNo(dataObject.getString(Rpt07Po.COLUMNS.BF_NO.name())); 
			rpt07Po.setCtmCode(dataObject.getString(Rpt07Po.COLUMNS.CTM_CODE.name())); 
			rpt07Po.setSerialNo(BigDecimalUtils.formObj(dataObject.getValue(Rpt07Po.COLUMNS.SERIAL_NO.name()))); 
			rpt07Po.setCocompName(dataObject.getString(Rpt07Po.COLUMNS.COCOMP_NAME.name())); 
			rpt07Po.setCtmAdd(dataObject.getString(Rpt07Po.COLUMNS.CTM_ADD.name())); 
			rpt07Po.setVat(dataObject.getString(Rpt07Po.COLUMNS.VAT.name())); 
			rpt07Po.setGoodsType(dataObject.getString(Rpt07Po.COLUMNS.GOODS_TYPE.name())); 
			return rpt07Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Rpt07Po rpt07Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Rpt07Po.COLUMNS.OUT_DATE.name(), rpt07Po.getOutDate()); 
			dataObject.setValue(Rpt07Po.COLUMNS.DECL_NO.name(), rpt07Po.getDeclNo()); 
			dataObject.setValue(Rpt07Po.COLUMNS.GOODS_DESC.name(), rpt07Po.getGoodsDesc()); 
			dataObject.setValue(Rpt07Po.COLUMNS.GOODS_BRAND.name(), rpt07Po.getGoodsBrand()); 
			dataObject.setValue(Rpt07Po.COLUMNS.GOODS_SPEC.name(), rpt07Po.getGoodsSpec()); 
			dataObject.setValue(Rpt07Po.COLUMNS.COMMODITY_NO.name(), rpt07Po.getCommodityNo()); 
			dataObject.setValue(Rpt07Po.COLUMNS.GOODS_UNIT.name(), rpt07Po.getGoodsUnit()); 
			dataObject.setValue(Rpt07Po.COLUMNS.TOTAL_QTY.name(), rpt07Po.getTotalQty()); 
			dataObject.setValue(Rpt07Po.COLUMNS.MATERIALIN_QTY.name(), rpt07Po.getMaterialinQty()); 
			dataObject.setValue(Rpt07Po.COLUMNS.MATERIALTAX_QTY.name(), rpt07Po.getMaterialtaxQty()); 
			dataObject.setValue(Rpt07Po.COLUMNS.PRODUCTIN_QTY.name(), rpt07Po.getProductinQty()); 
			dataObject.setValue(Rpt07Po.COLUMNS.PRODUCTOUT_QTY.name(), rpt07Po.getProductoutQty()); 
			dataObject.setValue(Rpt07Po.COLUMNS.PRODUCTTAX_QTY.name(), rpt07Po.getProducttaxQty()); 
			dataObject.setValue(Rpt07Po.COLUMNS.SCRP_QTY.name(), rpt07Po.getScrpQty()); 
			dataObject.setValue(Rpt07Po.COLUMNS.VERIFY_UNIT.name(), rpt07Po.getVerifyUnit()); 
			dataObject.setValue(Rpt07Po.COLUMNS.VERIFY_QTY.name(), rpt07Po.getVerifyQty()); 
			dataObject.setValue(Rpt07Po.COLUMNS.BALANCE_QTY.name(), rpt07Po.getBalanceQty()); 
			dataObject.setValue(Rpt07Po.COLUMNS.OUT_DOC.name(), rpt07Po.getOutDoc()); 
			dataObject.setValue(Rpt07Po.COLUMNS.BOM_NO.name(), rpt07Po.getBomNo()); 
			dataObject.setValue(Rpt07Po.COLUMNS.SCRAP_DOC.name(), rpt07Po.getScrapDoc()); 
			dataObject.setValue(Rpt07Po.COLUMNS.PRODUCT_DOC.name(), rpt07Po.getProductDoc()); 
			dataObject.setValue(Rpt07Po.COLUMNS.EXTEND_DOC.name(), rpt07Po.getExtendDoc()); 
			dataObject.setValue(Rpt07Po.COLUMNS.APPROVE_TIME.name(), rpt07Po.getApproveTime()); 
			dataObject.setValue(Rpt07Po.COLUMNS.MEMO.name(), rpt07Po.getMemo()); 
			dataObject.setValue(Rpt07Po.COLUMNS.BF_NO.name(), rpt07Po.getBfNo()); 
			dataObject.setValue(Rpt07Po.COLUMNS.CTM_CODE.name(), rpt07Po.getCtmCode()); 
			dataObject.setValue(Rpt07Po.COLUMNS.SERIAL_NO.name(), rpt07Po.getSerialNo()); 
			dataObject.setValue(Rpt07Po.COLUMNS.COCOMP_NAME.name(), rpt07Po.getCocompName()); 
			dataObject.setValue(Rpt07Po.COLUMNS.CTM_ADD.name(), rpt07Po.getCtmAdd()); 
			dataObject.setValue(Rpt07Po.COLUMNS.VAT.name(), rpt07Po.getVat()); 
			dataObject.setValue(Rpt07Po.COLUMNS.GOODS_TYPE.name(), rpt07Po.getGoodsType()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Rpt07Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Rpt07Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
