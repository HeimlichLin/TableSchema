package com.doc.common.dao.impl; 
 
public class DecldetailLogDAOImpl extends GeneralDAOImpl<DecldetailLogDo> implements DecldetailLogDAOImpl { 
	public static final DecldetailLogDAOImpl INSTANCE = new DecldetailLogDAOImpl(); 
	public static final String TABLENAME = "DECLDETAIL_LOG"; 

	public DecldetailLogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<DecldetailLogDo> CONVERTER = new MapConverter<DecldetailLogDo>() { 
 
		@Override 
		public DecldetailLogDo convert(final DataObject dataObject) { 
			final DecldetailLogDo decldetailLogDo = new DecldetailLogDo(); 
			decldetailLogDo.setBondno(dataObject.getString(DecldetailLogDo.COLUMNS.BONDNO.name())); 
			decldetailLogDo.setDeclno(dataObject.getString(DecldetailLogDo.COLUMNS.DECLNO.name())); 
			decldetailLogDo.setItemno(BigDecimalUtils.formObj(dataObject.getString(DecldetailLogDo.COLUMNS.ITEMNO.name()))); 
			decldetailLogDo.setPrdtno(dataObject.getString(DecldetailLogDo.COLUMNS.PRDTNO.name())); 
			decldetailLogDo.setDescrip(dataObject.getString(DecldetailLogDo.COLUMNS.DESCRIP.name())); 
			decldetailLogDo.setBrand(dataObject.getString(DecldetailLogDo.COLUMNS.BRAND.name())); 
			decldetailLogDo.setModel(dataObject.getString(DecldetailLogDo.COLUMNS.MODEL.name())); 
			decldetailLogDo.setSpec(dataObject.getString(DecldetailLogDo.COLUMNS.SPEC.name())); 
			decldetailLogDo.setQty(BigDecimalUtils.formObj(dataObject.getString(DecldetailLogDo.COLUMNS.QTY.name()))); 
			decldetailLogDo.setUnit(dataObject.getString(DecldetailLogDo.COLUMNS.UNIT.name())); 
			decldetailLogDo.setUprice(BigDecimalUtils.formObj(dataObject.getString(DecldetailLogDo.COLUMNS.UPRICE.name()))); 
			decldetailLogDo.setCur(dataObject.getString(DecldetailLogDo.COLUMNS.CUR.name())); 
			decldetailLogDo.setValueamt(BigDecimalUtils.formObj(dataObject.getString(DecldetailLogDo.COLUMNS.VALUEAMT.name()))); 
			decldetailLogDo.setValueqty(BigDecimalUtils.formObj(dataObject.getString(DecldetailLogDo.COLUMNS.VALUEQTY.name()))); 
			decldetailLogDo.setDutyrate(BigDecimalUtils.formObj(dataObject.getString(DecldetailLogDo.COLUMNS.DUTYRATE.name()))); 
			decldetailLogDo.setUnitduty(BigDecimalUtils.formObj(dataObject.getString(DecldetailLogDo.COLUMNS.UNITDUTY.name()))); 
			decldetailLogDo.setOdeclno(dataObject.getString(DecldetailLogDo.COLUMNS.ODECLNO.name())); 
			decldetailLogDo.setOitemno(BigDecimalUtils.formObj(dataObject.getString(DecldetailLogDo.COLUMNS.OITEMNO.name()))); 
			decldetailLogDo.setCcccode(dataObject.getString(DecldetailLogDo.COLUMNS.CCCCODE.name())); 
			decldetailLogDo.setComdtaxrate(BigDecimalUtils.formObj(dataObject.getString(DecldetailLogDo.COLUMNS.COMDTAXRATE.name()))); 
			decldetailLogDo.setStrtype(dataObject.getString(DecldetailLogDo.COLUMNS.STRTYPE.name())); 
			decldetailLogDo.setDutytype(dataObject.getString(DecldetailLogDo.COLUMNS.DUTYTYPE.name())); 
			decldetailLogDo.setStatmode(dataObject.getString(DecldetailLogDo.COLUMNS.STATMODE.name())); 
			decldetailLogDo.setMsgtype(dataObject.getString(DecldetailLogDo.COLUMNS.MSGTYPE.name())); 
			decldetailLogDo.setD8date(dataObject.getString(DecldetailLogDo.COLUMNS.D8DATE.name())); 
			decldetailLogDo.setProdcountry(dataObject.getString(DecldetailLogDo.COLUMNS.PRODCOUNTRY.name())); 
			decldetailLogDo.setD8declno(dataObject.getString(DecldetailLogDo.COLUMNS.D8DECLNO.name())); 
			decldetailLogDo.setNwght(BigDecimalUtils.formObj(dataObject.getString(DecldetailLogDo.COLUMNS.NWGHT.name()))); 
			decldetailLogDo.setProcesstime(dataObject.getString(DecldetailLogDo.COLUMNS.PROCESSTIME.name())); 
			decldetailLogDo.setProcessstate(dataObject.getString(DecldetailLogDo.COLUMNS.PROCESSSTATE.name())); 
			return decldetailLogDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DecldetailLogDo decldetailLogDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DecldetailLogDo.COLUMNS.BONDNO.name(), decldetailLogDo.getBondno()); 
			dataObject.setValue(DecldetailLogDo.COLUMNS.DECLNO.name(), decldetailLogDo.getDeclno()); 
			dataObject.setValue(DecldetailLogDo.COLUMNS.ITEMNO.name(), decldetailLogDo.getItemno()); 
			dataObject.setValue(DecldetailLogDo.COLUMNS.PRDTNO.name(), decldetailLogDo.getPrdtno()); 
			dataObject.setValue(DecldetailLogDo.COLUMNS.DESCRIP.name(), decldetailLogDo.getDescrip()); 
			dataObject.setValue(DecldetailLogDo.COLUMNS.BRAND.name(), decldetailLogDo.getBrand()); 
			dataObject.setValue(DecldetailLogDo.COLUMNS.MODEL.name(), decldetailLogDo.getModel()); 
			dataObject.setValue(DecldetailLogDo.COLUMNS.SPEC.name(), decldetailLogDo.getSpec()); 
			dataObject.setValue(DecldetailLogDo.COLUMNS.QTY.name(), decldetailLogDo.getQty()); 
			dataObject.setValue(DecldetailLogDo.COLUMNS.UNIT.name(), decldetailLogDo.getUnit()); 
			dataObject.setValue(DecldetailLogDo.COLUMNS.UPRICE.name(), decldetailLogDo.getUprice()); 
			dataObject.setValue(DecldetailLogDo.COLUMNS.CUR.name(), decldetailLogDo.getCur()); 
			dataObject.setValue(DecldetailLogDo.COLUMNS.VALUEAMT.name(), decldetailLogDo.getValueamt()); 
			dataObject.setValue(DecldetailLogDo.COLUMNS.VALUEQTY.name(), decldetailLogDo.getValueqty()); 
			dataObject.setValue(DecldetailLogDo.COLUMNS.DUTYRATE.name(), decldetailLogDo.getDutyrate()); 
			dataObject.setValue(DecldetailLogDo.COLUMNS.UNITDUTY.name(), decldetailLogDo.getUnitduty()); 
			dataObject.setValue(DecldetailLogDo.COLUMNS.ODECLNO.name(), decldetailLogDo.getOdeclno()); 
			dataObject.setValue(DecldetailLogDo.COLUMNS.OITEMNO.name(), decldetailLogDo.getOitemno()); 
			dataObject.setValue(DecldetailLogDo.COLUMNS.CCCCODE.name(), decldetailLogDo.getCcccode()); 
			dataObject.setValue(DecldetailLogDo.COLUMNS.COMDTAXRATE.name(), decldetailLogDo.getComdtaxrate()); 
			dataObject.setValue(DecldetailLogDo.COLUMNS.STRTYPE.name(), decldetailLogDo.getStrtype()); 
			dataObject.setValue(DecldetailLogDo.COLUMNS.DUTYTYPE.name(), decldetailLogDo.getDutytype()); 
			dataObject.setValue(DecldetailLogDo.COLUMNS.STATMODE.name(), decldetailLogDo.getStatmode()); 
			dataObject.setValue(DecldetailLogDo.COLUMNS.MSGTYPE.name(), decldetailLogDo.getMsgtype()); 
			dataObject.setValue(DecldetailLogDo.COLUMNS.D8DATE.name(), decldetailLogDo.getD8date()); 
			dataObject.setValue(DecldetailLogDo.COLUMNS.PRODCOUNTRY.name(), decldetailLogDo.getProdcountry()); 
			dataObject.setValue(DecldetailLogDo.COLUMNS.D8DECLNO.name(), decldetailLogDo.getD8declno()); 
			dataObject.setValue(DecldetailLogDo.COLUMNS.NWGHT.name(), decldetailLogDo.getNwght()); 
			dataObject.setValue(DecldetailLogDo.COLUMNS.PROCESSTIME.name(), decldetailLogDo.getProcesstime()); 
			dataObject.setValue(DecldetailLogDo.COLUMNS.PROCESSSTATE.name(), decldetailLogDo.getProcessstate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DecldetailLogDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DecldetailLogDo po) { 
	} 
 
} 
