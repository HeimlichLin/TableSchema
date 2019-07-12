package com.doc.common.dao.impl; 
 
public class DecldetailDAOImpl extends GeneralDAOImpl<DecldetailDo> implements DecldetailDAOImpl { 
	public static final DecldetailDAOImpl INSTANCE = new DecldetailDAOImpl(); 
	public static final String TABLENAME = "DECLDETAIL"; 

	public DecldetailDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<DecldetailDo> CONVERTER = new MapConverter<DecldetailDo>() { 
 
		@Override 
		public DecldetailDo convert(final DataObject dataObject) { 
			final DecldetailDo decldetailDo = new DecldetailDo(); 
			decldetailDo.setBondno(dataObject.getString(DecldetailDo.COLUMNS.BONDNO.name())); 
			decldetailDo.setDeclno(dataObject.getString(DecldetailDo.COLUMNS.DECLNO.name())); 
			decldetailDo.setItemno(BigDecimalUtils.formObj(dataObject.getString(DecldetailDo.COLUMNS.ITEMNO.name()))); 
			decldetailDo.setPrdtno(dataObject.getString(DecldetailDo.COLUMNS.PRDTNO.name())); 
			decldetailDo.setDescrip(dataObject.getString(DecldetailDo.COLUMNS.DESCRIP.name())); 
			decldetailDo.setBrand(dataObject.getString(DecldetailDo.COLUMNS.BRAND.name())); 
			decldetailDo.setModel(dataObject.getString(DecldetailDo.COLUMNS.MODEL.name())); 
			decldetailDo.setSpec(dataObject.getString(DecldetailDo.COLUMNS.SPEC.name())); 
			decldetailDo.setQty(BigDecimalUtils.formObj(dataObject.getString(DecldetailDo.COLUMNS.QTY.name()))); 
			decldetailDo.setUnit(dataObject.getString(DecldetailDo.COLUMNS.UNIT.name())); 
			decldetailDo.setUprice(BigDecimalUtils.formObj(dataObject.getString(DecldetailDo.COLUMNS.UPRICE.name()))); 
			decldetailDo.setCur(dataObject.getString(DecldetailDo.COLUMNS.CUR.name())); 
			decldetailDo.setValueamt(BigDecimalUtils.formObj(dataObject.getString(DecldetailDo.COLUMNS.VALUEAMT.name()))); 
			decldetailDo.setValueqty(BigDecimalUtils.formObj(dataObject.getString(DecldetailDo.COLUMNS.VALUEQTY.name()))); 
			decldetailDo.setDutyrate(BigDecimalUtils.formObj(dataObject.getString(DecldetailDo.COLUMNS.DUTYRATE.name()))); 
			decldetailDo.setUnitduty(BigDecimalUtils.formObj(dataObject.getString(DecldetailDo.COLUMNS.UNITDUTY.name()))); 
			decldetailDo.setOdeclno(dataObject.getString(DecldetailDo.COLUMNS.ODECLNO.name())); 
			decldetailDo.setOitemno(BigDecimalUtils.formObj(dataObject.getString(DecldetailDo.COLUMNS.OITEMNO.name()))); 
			decldetailDo.setCcccode(dataObject.getString(DecldetailDo.COLUMNS.CCCCODE.name())); 
			decldetailDo.setComdtaxrate(BigDecimalUtils.formObj(dataObject.getString(DecldetailDo.COLUMNS.COMDTAXRATE.name()))); 
			decldetailDo.setStrtype(dataObject.getString(DecldetailDo.COLUMNS.STRTYPE.name())); 
			decldetailDo.setDutytype(dataObject.getString(DecldetailDo.COLUMNS.DUTYTYPE.name())); 
			decldetailDo.setStatmode(dataObject.getString(DecldetailDo.COLUMNS.STATMODE.name())); 
			decldetailDo.setMsgtype(dataObject.getString(DecldetailDo.COLUMNS.MSGTYPE.name())); 
			decldetailDo.setD8date(dataObject.getString(DecldetailDo.COLUMNS.D8DATE.name())); 
			decldetailDo.setProdcountry(dataObject.getString(DecldetailDo.COLUMNS.PRODCOUNTRY.name())); 
			decldetailDo.setD8declno(dataObject.getString(DecldetailDo.COLUMNS.D8DECLNO.name())); 
			decldetailDo.setNwght(BigDecimalUtils.formObj(dataObject.getString(DecldetailDo.COLUMNS.NWGHT.name()))); 
			return decldetailDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DecldetailDo decldetailDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DecldetailDo.COLUMNS.BONDNO.name(), decldetailDo.getBondno()); 
			dataObject.setValue(DecldetailDo.COLUMNS.DECLNO.name(), decldetailDo.getDeclno()); 
			dataObject.setValue(DecldetailDo.COLUMNS.ITEMNO.name(), decldetailDo.getItemno()); 
			dataObject.setValue(DecldetailDo.COLUMNS.PRDTNO.name(), decldetailDo.getPrdtno()); 
			dataObject.setValue(DecldetailDo.COLUMNS.DESCRIP.name(), decldetailDo.getDescrip()); 
			dataObject.setValue(DecldetailDo.COLUMNS.BRAND.name(), decldetailDo.getBrand()); 
			dataObject.setValue(DecldetailDo.COLUMNS.MODEL.name(), decldetailDo.getModel()); 
			dataObject.setValue(DecldetailDo.COLUMNS.SPEC.name(), decldetailDo.getSpec()); 
			dataObject.setValue(DecldetailDo.COLUMNS.QTY.name(), decldetailDo.getQty()); 
			dataObject.setValue(DecldetailDo.COLUMNS.UNIT.name(), decldetailDo.getUnit()); 
			dataObject.setValue(DecldetailDo.COLUMNS.UPRICE.name(), decldetailDo.getUprice()); 
			dataObject.setValue(DecldetailDo.COLUMNS.CUR.name(), decldetailDo.getCur()); 
			dataObject.setValue(DecldetailDo.COLUMNS.VALUEAMT.name(), decldetailDo.getValueamt()); 
			dataObject.setValue(DecldetailDo.COLUMNS.VALUEQTY.name(), decldetailDo.getValueqty()); 
			dataObject.setValue(DecldetailDo.COLUMNS.DUTYRATE.name(), decldetailDo.getDutyrate()); 
			dataObject.setValue(DecldetailDo.COLUMNS.UNITDUTY.name(), decldetailDo.getUnitduty()); 
			dataObject.setValue(DecldetailDo.COLUMNS.ODECLNO.name(), decldetailDo.getOdeclno()); 
			dataObject.setValue(DecldetailDo.COLUMNS.OITEMNO.name(), decldetailDo.getOitemno()); 
			dataObject.setValue(DecldetailDo.COLUMNS.CCCCODE.name(), decldetailDo.getCcccode()); 
			dataObject.setValue(DecldetailDo.COLUMNS.COMDTAXRATE.name(), decldetailDo.getComdtaxrate()); 
			dataObject.setValue(DecldetailDo.COLUMNS.STRTYPE.name(), decldetailDo.getStrtype()); 
			dataObject.setValue(DecldetailDo.COLUMNS.DUTYTYPE.name(), decldetailDo.getDutytype()); 
			dataObject.setValue(DecldetailDo.COLUMNS.STATMODE.name(), decldetailDo.getStatmode()); 
			dataObject.setValue(DecldetailDo.COLUMNS.MSGTYPE.name(), decldetailDo.getMsgtype()); 
			dataObject.setValue(DecldetailDo.COLUMNS.D8DATE.name(), decldetailDo.getD8date()); 
			dataObject.setValue(DecldetailDo.COLUMNS.PRODCOUNTRY.name(), decldetailDo.getProdcountry()); 
			dataObject.setValue(DecldetailDo.COLUMNS.D8DECLNO.name(), decldetailDo.getD8declno()); 
			dataObject.setValue(DecldetailDo.COLUMNS.NWGHT.name(), decldetailDo.getNwght()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DecldetailDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DecldetailDo po) { 
		sqlWhere.add(DecldetailDo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(DecldetailDo.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(DecldetailDo.COLUMNS.ITEMNO.name(), po.getItemno()); 
		sqlWhere.add(DecldetailDo.COLUMNS.STRTYPE.name(), po.getStrtype()); 
		sqlWhere.add(DecldetailDo.COLUMNS.MSGTYPE.name(), po.getMsgtype()); 
	} 
 
} 
