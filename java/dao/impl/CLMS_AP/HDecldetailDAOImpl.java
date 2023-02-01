package com.doc.common.dao.impl; 
 
public class HDecldetailDAOImpl extends GeneralDAOImpl<HDecldetailPo> implements HDecldetailDAO { 
	public static final HDecldetailDAOImpl INSTANCE = new HDecldetailDAOImpl(); 
	public static final String TABLENAME = "H_DECLDETAIL"; 

	public HDecldetailDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<HDecldetailPo> CONVERTER = new MapConverter<HDecldetailPo>() { 
 
		@Override 
		public HDecldetailPo convert(final DataObject dataObject) { 
			final HDecldetailPo hDecldetailPo = new HDecldetailPo(); 
			hDecldetailPo.setBondno(dataObject.getString(HDecldetailPo.COLUMNS.BONDNO.name())); 
			hDecldetailPo.setDeclno(dataObject.getString(HDecldetailPo.COLUMNS.DECLNO.name())); 
			hDecldetailPo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(HDecldetailPo.COLUMNS.ITEMNO.name()))); 
			hDecldetailPo.setPrdtno(dataObject.getString(HDecldetailPo.COLUMNS.PRDTNO.name())); 
			hDecldetailPo.setDescrip(dataObject.getString(HDecldetailPo.COLUMNS.DESCRIP.name())); 
			hDecldetailPo.setBrand(dataObject.getString(HDecldetailPo.COLUMNS.BRAND.name())); 
			hDecldetailPo.setModel(dataObject.getString(HDecldetailPo.COLUMNS.MODEL.name())); 
			hDecldetailPo.setSpec(dataObject.getString(HDecldetailPo.COLUMNS.SPEC.name())); 
			hDecldetailPo.setNwght(BigDecimalUtils.formObj(dataObject.getValue(HDecldetailPo.COLUMNS.NWGHT.name()))); 
			hDecldetailPo.setQty(BigDecimalUtils.formObj(dataObject.getValue(HDecldetailPo.COLUMNS.QTY.name()))); 
			hDecldetailPo.setUnit(dataObject.getString(HDecldetailPo.COLUMNS.UNIT.name())); 
			hDecldetailPo.setUprice(BigDecimalUtils.formObj(dataObject.getValue(HDecldetailPo.COLUMNS.UPRICE.name()))); 
			hDecldetailPo.setCur(dataObject.getString(HDecldetailPo.COLUMNS.CUR.name())); 
			hDecldetailPo.setValueamt(BigDecimalUtils.formObj(dataObject.getValue(HDecldetailPo.COLUMNS.VALUEAMT.name()))); 
			hDecldetailPo.setValueqty(BigDecimalUtils.formObj(dataObject.getValue(HDecldetailPo.COLUMNS.VALUEQTY.name()))); 
			hDecldetailPo.setDutyrate(BigDecimalUtils.formObj(dataObject.getValue(HDecldetailPo.COLUMNS.DUTYRATE.name()))); 
			hDecldetailPo.setUnitduty(BigDecimalUtils.formObj(dataObject.getValue(HDecldetailPo.COLUMNS.UNITDUTY.name()))); 
			hDecldetailPo.setOdeclno(dataObject.getString(HDecldetailPo.COLUMNS.ODECLNO.name())); 
			hDecldetailPo.setOitemno(BigDecimalUtils.formObj(dataObject.getValue(HDecldetailPo.COLUMNS.OITEMNO.name()))); 
			hDecldetailPo.setCcccode(dataObject.getString(HDecldetailPo.COLUMNS.CCCCODE.name())); 
			hDecldetailPo.setComdtaxrate(BigDecimalUtils.formObj(dataObject.getValue(HDecldetailPo.COLUMNS.COMDTAXRATE.name()))); 
			hDecldetailPo.setStrtype(dataObject.getString(HDecldetailPo.COLUMNS.STRTYPE.name())); 
			hDecldetailPo.setUpdtime(dataObject.getString(HDecldetailPo.COLUMNS.UPDTIME.name())); 
			hDecldetailPo.setDutytype(dataObject.getString(HDecldetailPo.COLUMNS.DUTYTYPE.name())); 
			hDecldetailPo.setStatmode(dataObject.getString(HDecldetailPo.COLUMNS.STATMODE.name())); 
			hDecldetailPo.setMsgtype(dataObject.getString(HDecldetailPo.COLUMNS.MSGTYPE.name())); 
			hDecldetailPo.setD8date(dataObject.getString(HDecldetailPo.COLUMNS.D8DATE.name())); 
			hDecldetailPo.setProdcountry(dataObject.getString(HDecldetailPo.COLUMNS.PRODCOUNTRY.name())); 
			return hDecldetailPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final HDecldetailPo hDecldetailPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(HDecldetailPo.COLUMNS.BONDNO.name(), hDecldetailPo.getBondno()); 
			dataObject.setValue(HDecldetailPo.COLUMNS.DECLNO.name(), hDecldetailPo.getDeclno()); 
			dataObject.setValue(HDecldetailPo.COLUMNS.ITEMNO.name(), hDecldetailPo.getItemno()); 
			dataObject.setValue(HDecldetailPo.COLUMNS.PRDTNO.name(), hDecldetailPo.getPrdtno()); 
			dataObject.setValue(HDecldetailPo.COLUMNS.DESCRIP.name(), hDecldetailPo.getDescrip()); 
			dataObject.setValue(HDecldetailPo.COLUMNS.BRAND.name(), hDecldetailPo.getBrand()); 
			dataObject.setValue(HDecldetailPo.COLUMNS.MODEL.name(), hDecldetailPo.getModel()); 
			dataObject.setValue(HDecldetailPo.COLUMNS.SPEC.name(), hDecldetailPo.getSpec()); 
			dataObject.setValue(HDecldetailPo.COLUMNS.NWGHT.name(), hDecldetailPo.getNwght()); 
			dataObject.setValue(HDecldetailPo.COLUMNS.QTY.name(), hDecldetailPo.getQty()); 
			dataObject.setValue(HDecldetailPo.COLUMNS.UNIT.name(), hDecldetailPo.getUnit()); 
			dataObject.setValue(HDecldetailPo.COLUMNS.UPRICE.name(), hDecldetailPo.getUprice()); 
			dataObject.setValue(HDecldetailPo.COLUMNS.CUR.name(), hDecldetailPo.getCur()); 
			dataObject.setValue(HDecldetailPo.COLUMNS.VALUEAMT.name(), hDecldetailPo.getValueamt()); 
			dataObject.setValue(HDecldetailPo.COLUMNS.VALUEQTY.name(), hDecldetailPo.getValueqty()); 
			dataObject.setValue(HDecldetailPo.COLUMNS.DUTYRATE.name(), hDecldetailPo.getDutyrate()); 
			dataObject.setValue(HDecldetailPo.COLUMNS.UNITDUTY.name(), hDecldetailPo.getUnitduty()); 
			dataObject.setValue(HDecldetailPo.COLUMNS.ODECLNO.name(), hDecldetailPo.getOdeclno()); 
			dataObject.setValue(HDecldetailPo.COLUMNS.OITEMNO.name(), hDecldetailPo.getOitemno()); 
			dataObject.setValue(HDecldetailPo.COLUMNS.CCCCODE.name(), hDecldetailPo.getCcccode()); 
			dataObject.setValue(HDecldetailPo.COLUMNS.COMDTAXRATE.name(), hDecldetailPo.getComdtaxrate()); 
			dataObject.setValue(HDecldetailPo.COLUMNS.STRTYPE.name(), hDecldetailPo.getStrtype()); 
			dataObject.setValue(HDecldetailPo.COLUMNS.UPDTIME.name(), hDecldetailPo.getUpdtime()); 
			dataObject.setValue(HDecldetailPo.COLUMNS.DUTYTYPE.name(), hDecldetailPo.getDutytype()); 
			dataObject.setValue(HDecldetailPo.COLUMNS.STATMODE.name(), hDecldetailPo.getStatmode()); 
			dataObject.setValue(HDecldetailPo.COLUMNS.MSGTYPE.name(), hDecldetailPo.getMsgtype()); 
			dataObject.setValue(HDecldetailPo.COLUMNS.D8DATE.name(), hDecldetailPo.getD8date()); 
			dataObject.setValue(HDecldetailPo.COLUMNS.PRODCOUNTRY.name(), hDecldetailPo.getProdcountry()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<HDecldetailPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(HDecldetailPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
