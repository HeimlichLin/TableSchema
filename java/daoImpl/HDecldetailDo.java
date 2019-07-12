package com.doc.common.dao.impl; 
 
public class HDecldetailDAO extends GeneralDAOImpl<HDecldetailDo> implements HDecldetailDAO { 
	public static final HDecldetailDAOImpl INSTANCE = new HDecldetailDAOImpl(); 
	public static final String TABLENAME = "H_DECLDETAIL"; 

	public HDecldetailDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<HDecldetailDo> CONVERTER = new MapConverter<HDecldetailDo>() { 
 
		@Override 
		public HDecldetailDo convert(final DataObject dataObject) { 
			final HDecldetailDo hDecldetailDo = new HDecldetailDo(); 
			hDecldetailDo.setBondno(dataObject.getString(HDecldetailDo.COLUMNS.BONDNO.name())); 
			hDecldetailDo.setDeclno(dataObject.getString(HDecldetailDo.COLUMNS.DECLNO.name())); 
			hDecldetailDo.setItemno(BigDecimalUtils.formObj(dataObject.getString(HDecldetailDo.COLUMNS.ITEMNO.name()))); 
			hDecldetailDo.setPrdtno(dataObject.getString(HDecldetailDo.COLUMNS.PRDTNO.name())); 
			hDecldetailDo.setDescrip(dataObject.getString(HDecldetailDo.COLUMNS.DESCRIP.name())); 
			hDecldetailDo.setBrand(dataObject.getString(HDecldetailDo.COLUMNS.BRAND.name())); 
			hDecldetailDo.setModel(dataObject.getString(HDecldetailDo.COLUMNS.MODEL.name())); 
			hDecldetailDo.setSpec(dataObject.getString(HDecldetailDo.COLUMNS.SPEC.name())); 
			hDecldetailDo.setNwght(BigDecimalUtils.formObj(dataObject.getString(HDecldetailDo.COLUMNS.NWGHT.name()))); 
			hDecldetailDo.setQty(BigDecimalUtils.formObj(dataObject.getString(HDecldetailDo.COLUMNS.QTY.name()))); 
			hDecldetailDo.setUnit(dataObject.getString(HDecldetailDo.COLUMNS.UNIT.name())); 
			hDecldetailDo.setUprice(BigDecimalUtils.formObj(dataObject.getString(HDecldetailDo.COLUMNS.UPRICE.name()))); 
			hDecldetailDo.setCur(dataObject.getString(HDecldetailDo.COLUMNS.CUR.name())); 
			hDecldetailDo.setValueamt(BigDecimalUtils.formObj(dataObject.getString(HDecldetailDo.COLUMNS.VALUEAMT.name()))); 
			hDecldetailDo.setValueqty(BigDecimalUtils.formObj(dataObject.getString(HDecldetailDo.COLUMNS.VALUEQTY.name()))); 
			hDecldetailDo.setDutyrate(BigDecimalUtils.formObj(dataObject.getString(HDecldetailDo.COLUMNS.DUTYRATE.name()))); 
			hDecldetailDo.setUnitduty(BigDecimalUtils.formObj(dataObject.getString(HDecldetailDo.COLUMNS.UNITDUTY.name()))); 
			hDecldetailDo.setOdeclno(dataObject.getString(HDecldetailDo.COLUMNS.ODECLNO.name())); 
			hDecldetailDo.setOitemno(BigDecimalUtils.formObj(dataObject.getString(HDecldetailDo.COLUMNS.OITEMNO.name()))); 
			hDecldetailDo.setCcccode(dataObject.getString(HDecldetailDo.COLUMNS.CCCCODE.name())); 
			hDecldetailDo.setComdtaxrate(BigDecimalUtils.formObj(dataObject.getString(HDecldetailDo.COLUMNS.COMDTAXRATE.name()))); 
			hDecldetailDo.setStrtype(dataObject.getString(HDecldetailDo.COLUMNS.STRTYPE.name())); 
			hDecldetailDo.setUpdtime(dataObject.getString(HDecldetailDo.COLUMNS.UPDTIME.name())); 
			hDecldetailDo.setDutytype(dataObject.getString(HDecldetailDo.COLUMNS.DUTYTYPE.name())); 
			hDecldetailDo.setStatmode(dataObject.getString(HDecldetailDo.COLUMNS.STATMODE.name())); 
			hDecldetailDo.setMsgtype(dataObject.getString(HDecldetailDo.COLUMNS.MSGTYPE.name())); 
			hDecldetailDo.setD8date(dataObject.getString(HDecldetailDo.COLUMNS.D8DATE.name())); 
			hDecldetailDo.setProdcountry(dataObject.getString(HDecldetailDo.COLUMNS.PRODCOUNTRY.name())); 
			return hDecldetailDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final HDecldetailDo hDecldetailDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(HDecldetailDo.COLUMNS.BONDNO.name(), hDecldetailDo.getBondno()); 
			dataObject.setValue(HDecldetailDo.COLUMNS.DECLNO.name(), hDecldetailDo.getDeclno()); 
			dataObject.setValue(HDecldetailDo.COLUMNS.ITEMNO.name(), hDecldetailDo.getItemno()); 
			dataObject.setValue(HDecldetailDo.COLUMNS.PRDTNO.name(), hDecldetailDo.getPrdtno()); 
			dataObject.setValue(HDecldetailDo.COLUMNS.DESCRIP.name(), hDecldetailDo.getDescrip()); 
			dataObject.setValue(HDecldetailDo.COLUMNS.BRAND.name(), hDecldetailDo.getBrand()); 
			dataObject.setValue(HDecldetailDo.COLUMNS.MODEL.name(), hDecldetailDo.getModel()); 
			dataObject.setValue(HDecldetailDo.COLUMNS.SPEC.name(), hDecldetailDo.getSpec()); 
			dataObject.setValue(HDecldetailDo.COLUMNS.NWGHT.name(), hDecldetailDo.getNwght()); 
			dataObject.setValue(HDecldetailDo.COLUMNS.QTY.name(), hDecldetailDo.getQty()); 
			dataObject.setValue(HDecldetailDo.COLUMNS.UNIT.name(), hDecldetailDo.getUnit()); 
			dataObject.setValue(HDecldetailDo.COLUMNS.UPRICE.name(), hDecldetailDo.getUprice()); 
			dataObject.setValue(HDecldetailDo.COLUMNS.CUR.name(), hDecldetailDo.getCur()); 
			dataObject.setValue(HDecldetailDo.COLUMNS.VALUEAMT.name(), hDecldetailDo.getValueamt()); 
			dataObject.setValue(HDecldetailDo.COLUMNS.VALUEQTY.name(), hDecldetailDo.getValueqty()); 
			dataObject.setValue(HDecldetailDo.COLUMNS.DUTYRATE.name(), hDecldetailDo.getDutyrate()); 
			dataObject.setValue(HDecldetailDo.COLUMNS.UNITDUTY.name(), hDecldetailDo.getUnitduty()); 
			dataObject.setValue(HDecldetailDo.COLUMNS.ODECLNO.name(), hDecldetailDo.getOdeclno()); 
			dataObject.setValue(HDecldetailDo.COLUMNS.OITEMNO.name(), hDecldetailDo.getOitemno()); 
			dataObject.setValue(HDecldetailDo.COLUMNS.CCCCODE.name(), hDecldetailDo.getCcccode()); 
			dataObject.setValue(HDecldetailDo.COLUMNS.COMDTAXRATE.name(), hDecldetailDo.getComdtaxrate()); 
			dataObject.setValue(HDecldetailDo.COLUMNS.STRTYPE.name(), hDecldetailDo.getStrtype()); 
			dataObject.setValue(HDecldetailDo.COLUMNS.UPDTIME.name(), hDecldetailDo.getUpdtime()); 
			dataObject.setValue(HDecldetailDo.COLUMNS.DUTYTYPE.name(), hDecldetailDo.getDutytype()); 
			dataObject.setValue(HDecldetailDo.COLUMNS.STATMODE.name(), hDecldetailDo.getStatmode()); 
			dataObject.setValue(HDecldetailDo.COLUMNS.MSGTYPE.name(), hDecldetailDo.getMsgtype()); 
			dataObject.setValue(HDecldetailDo.COLUMNS.D8DATE.name(), hDecldetailDo.getD8date()); 
			dataObject.setValue(HDecldetailDo.COLUMNS.PRODCOUNTRY.name(), hDecldetailDo.getProdcountry()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<HDecldetailDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(HDecldetailDo po) { 
		sqlWhere.add(HDecldetailDo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(HDecldetailDo.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(HDecldetailDo.COLUMNS.ITEMNO.name(), po.getItemno()); 
		sqlWhere.add(HDecldetailDo.COLUMNS.PRDTNO.name(), po.getPrdtno()); 
		sqlWhere.add(HDecldetailDo.COLUMNS.DESCRIP.name(), po.getDescrip()); 
		sqlWhere.add(HDecldetailDo.COLUMNS.BRAND.name(), po.getBrand()); 
		sqlWhere.add(HDecldetailDo.COLUMNS.MODEL.name(), po.getModel()); 
		sqlWhere.add(HDecldetailDo.COLUMNS.SPEC.name(), po.getSpec()); 
		sqlWhere.add(HDecldetailDo.COLUMNS.NWGHT.name(), po.getNwght()); 
		sqlWhere.add(HDecldetailDo.COLUMNS.QTY.name(), po.getQty()); 
		sqlWhere.add(HDecldetailDo.COLUMNS.UNIT.name(), po.getUnit()); 
		sqlWhere.add(HDecldetailDo.COLUMNS.UPRICE.name(), po.getUprice()); 
		sqlWhere.add(HDecldetailDo.COLUMNS.CUR.name(), po.getCur()); 
		sqlWhere.add(HDecldetailDo.COLUMNS.VALUEAMT.name(), po.getValueamt()); 
		sqlWhere.add(HDecldetailDo.COLUMNS.VALUEQTY.name(), po.getValueqty()); 
		sqlWhere.add(HDecldetailDo.COLUMNS.DUTYRATE.name(), po.getDutyrate()); 
		sqlWhere.add(HDecldetailDo.COLUMNS.UNITDUTY.name(), po.getUnitduty()); 
		sqlWhere.add(HDecldetailDo.COLUMNS.ODECLNO.name(), po.getOdeclno()); 
		sqlWhere.add(HDecldetailDo.COLUMNS.OITEMNO.name(), po.getOitemno()); 
		sqlWhere.add(HDecldetailDo.COLUMNS.CCCCODE.name(), po.getCcccode()); 
		sqlWhere.add(HDecldetailDo.COLUMNS.COMDTAXRATE.name(), po.getComdtaxrate()); 
		sqlWhere.add(HDecldetailDo.COLUMNS.STRTYPE.name(), po.getStrtype()); 
		sqlWhere.add(HDecldetailDo.COLUMNS.UPDTIME.name(), po.getUpdtime()); 
		sqlWhere.add(HDecldetailDo.COLUMNS.DUTYTYPE.name(), po.getDutytype()); 
		sqlWhere.add(HDecldetailDo.COLUMNS.STATMODE.name(), po.getStatmode()); 
		sqlWhere.add(HDecldetailDo.COLUMNS.MSGTYPE.name(), po.getMsgtype()); 
		sqlWhere.add(HDecldetailDo.COLUMNS.D8DATE.name(), po.getD8date()); 
		sqlWhere.add(HDecldetailDo.COLUMNS.PRODCOUNTRY.name(), po.getProdcountry()); 
	} 
 
} 
