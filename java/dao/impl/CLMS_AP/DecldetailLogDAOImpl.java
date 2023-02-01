package com.doc.common.dao.impl; 
 
public class DecldetailLogDAOImpl extends GeneralDAOImpl<DecldetailLogPo> implements DecldetailLogDAO { 
	public static final DecldetailLogDAOImpl INSTANCE = new DecldetailLogDAOImpl(); 
	public static final String TABLENAME = "DECLDETAIL_LOG"; 

	public DecldetailLogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DecldetailLogPo> CONVERTER = new MapConverter<DecldetailLogPo>() { 
 
		@Override 
		public DecldetailLogPo convert(final DataObject dataObject) { 
			final DecldetailLogPo decldetailLogPo = new DecldetailLogPo(); 
			decldetailLogPo.setBondno(dataObject.getString(DecldetailLogPo.COLUMNS.BONDNO.name())); 
			decldetailLogPo.setDeclno(dataObject.getString(DecldetailLogPo.COLUMNS.DECLNO.name())); 
			decldetailLogPo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(DecldetailLogPo.COLUMNS.ITEMNO.name()))); 
			decldetailLogPo.setPrdtno(dataObject.getString(DecldetailLogPo.COLUMNS.PRDTNO.name())); 
			decldetailLogPo.setDescrip(dataObject.getString(DecldetailLogPo.COLUMNS.DESCRIP.name())); 
			decldetailLogPo.setBrand(dataObject.getString(DecldetailLogPo.COLUMNS.BRAND.name())); 
			decldetailLogPo.setModel(dataObject.getString(DecldetailLogPo.COLUMNS.MODEL.name())); 
			decldetailLogPo.setSpec(dataObject.getString(DecldetailLogPo.COLUMNS.SPEC.name())); 
			decldetailLogPo.setQty(BigDecimalUtils.formObj(dataObject.getValue(DecldetailLogPo.COLUMNS.QTY.name()))); 
			decldetailLogPo.setUnit(dataObject.getString(DecldetailLogPo.COLUMNS.UNIT.name())); 
			decldetailLogPo.setUprice(BigDecimalUtils.formObj(dataObject.getValue(DecldetailLogPo.COLUMNS.UPRICE.name()))); 
			decldetailLogPo.setCur(dataObject.getString(DecldetailLogPo.COLUMNS.CUR.name())); 
			decldetailLogPo.setValueamt(BigDecimalUtils.formObj(dataObject.getValue(DecldetailLogPo.COLUMNS.VALUEAMT.name()))); 
			decldetailLogPo.setValueqty(BigDecimalUtils.formObj(dataObject.getValue(DecldetailLogPo.COLUMNS.VALUEQTY.name()))); 
			decldetailLogPo.setDutyrate(BigDecimalUtils.formObj(dataObject.getValue(DecldetailLogPo.COLUMNS.DUTYRATE.name()))); 
			decldetailLogPo.setUnitduty(BigDecimalUtils.formObj(dataObject.getValue(DecldetailLogPo.COLUMNS.UNITDUTY.name()))); 
			decldetailLogPo.setOdeclno(dataObject.getString(DecldetailLogPo.COLUMNS.ODECLNO.name())); 
			decldetailLogPo.setOitemno(BigDecimalUtils.formObj(dataObject.getValue(DecldetailLogPo.COLUMNS.OITEMNO.name()))); 
			decldetailLogPo.setCcccode(dataObject.getString(DecldetailLogPo.COLUMNS.CCCCODE.name())); 
			decldetailLogPo.setComdtaxrate(BigDecimalUtils.formObj(dataObject.getValue(DecldetailLogPo.COLUMNS.COMDTAXRATE.name()))); 
			decldetailLogPo.setStrtype(dataObject.getString(DecldetailLogPo.COLUMNS.STRTYPE.name())); 
			decldetailLogPo.setDutytype(dataObject.getString(DecldetailLogPo.COLUMNS.DUTYTYPE.name())); 
			decldetailLogPo.setStatmode(dataObject.getString(DecldetailLogPo.COLUMNS.STATMODE.name())); 
			decldetailLogPo.setMsgtype(dataObject.getString(DecldetailLogPo.COLUMNS.MSGTYPE.name())); 
			decldetailLogPo.setD8date(dataObject.getString(DecldetailLogPo.COLUMNS.D8DATE.name())); 
			decldetailLogPo.setProdcountry(dataObject.getString(DecldetailLogPo.COLUMNS.PRODCOUNTRY.name())); 
			decldetailLogPo.setD8declno(dataObject.getString(DecldetailLogPo.COLUMNS.D8DECLNO.name())); 
			decldetailLogPo.setNwght(BigDecimalUtils.formObj(dataObject.getValue(DecldetailLogPo.COLUMNS.NWGHT.name()))); 
			decldetailLogPo.setProcesstime(dataObject.getString(DecldetailLogPo.COLUMNS.PROCESSTIME.name())); 
			decldetailLogPo.setProcessstate(dataObject.getString(DecldetailLogPo.COLUMNS.PROCESSSTATE.name())); 
			return decldetailLogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DecldetailLogPo decldetailLogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DecldetailLogPo.COLUMNS.BONDNO.name(), decldetailLogPo.getBondno()); 
			dataObject.setValue(DecldetailLogPo.COLUMNS.DECLNO.name(), decldetailLogPo.getDeclno()); 
			dataObject.setValue(DecldetailLogPo.COLUMNS.ITEMNO.name(), decldetailLogPo.getItemno()); 
			dataObject.setValue(DecldetailLogPo.COLUMNS.PRDTNO.name(), decldetailLogPo.getPrdtno()); 
			dataObject.setValue(DecldetailLogPo.COLUMNS.DESCRIP.name(), decldetailLogPo.getDescrip()); 
			dataObject.setValue(DecldetailLogPo.COLUMNS.BRAND.name(), decldetailLogPo.getBrand()); 
			dataObject.setValue(DecldetailLogPo.COLUMNS.MODEL.name(), decldetailLogPo.getModel()); 
			dataObject.setValue(DecldetailLogPo.COLUMNS.SPEC.name(), decldetailLogPo.getSpec()); 
			dataObject.setValue(DecldetailLogPo.COLUMNS.QTY.name(), decldetailLogPo.getQty()); 
			dataObject.setValue(DecldetailLogPo.COLUMNS.UNIT.name(), decldetailLogPo.getUnit()); 
			dataObject.setValue(DecldetailLogPo.COLUMNS.UPRICE.name(), decldetailLogPo.getUprice()); 
			dataObject.setValue(DecldetailLogPo.COLUMNS.CUR.name(), decldetailLogPo.getCur()); 
			dataObject.setValue(DecldetailLogPo.COLUMNS.VALUEAMT.name(), decldetailLogPo.getValueamt()); 
			dataObject.setValue(DecldetailLogPo.COLUMNS.VALUEQTY.name(), decldetailLogPo.getValueqty()); 
			dataObject.setValue(DecldetailLogPo.COLUMNS.DUTYRATE.name(), decldetailLogPo.getDutyrate()); 
			dataObject.setValue(DecldetailLogPo.COLUMNS.UNITDUTY.name(), decldetailLogPo.getUnitduty()); 
			dataObject.setValue(DecldetailLogPo.COLUMNS.ODECLNO.name(), decldetailLogPo.getOdeclno()); 
			dataObject.setValue(DecldetailLogPo.COLUMNS.OITEMNO.name(), decldetailLogPo.getOitemno()); 
			dataObject.setValue(DecldetailLogPo.COLUMNS.CCCCODE.name(), decldetailLogPo.getCcccode()); 
			dataObject.setValue(DecldetailLogPo.COLUMNS.COMDTAXRATE.name(), decldetailLogPo.getComdtaxrate()); 
			dataObject.setValue(DecldetailLogPo.COLUMNS.STRTYPE.name(), decldetailLogPo.getStrtype()); 
			dataObject.setValue(DecldetailLogPo.COLUMNS.DUTYTYPE.name(), decldetailLogPo.getDutytype()); 
			dataObject.setValue(DecldetailLogPo.COLUMNS.STATMODE.name(), decldetailLogPo.getStatmode()); 
			dataObject.setValue(DecldetailLogPo.COLUMNS.MSGTYPE.name(), decldetailLogPo.getMsgtype()); 
			dataObject.setValue(DecldetailLogPo.COLUMNS.D8DATE.name(), decldetailLogPo.getD8date()); 
			dataObject.setValue(DecldetailLogPo.COLUMNS.PRODCOUNTRY.name(), decldetailLogPo.getProdcountry()); 
			dataObject.setValue(DecldetailLogPo.COLUMNS.D8DECLNO.name(), decldetailLogPo.getD8declno()); 
			dataObject.setValue(DecldetailLogPo.COLUMNS.NWGHT.name(), decldetailLogPo.getNwght()); 
			dataObject.setValue(DecldetailLogPo.COLUMNS.PROCESSTIME.name(), decldetailLogPo.getProcesstime()); 
			dataObject.setValue(DecldetailLogPo.COLUMNS.PROCESSSTATE.name(), decldetailLogPo.getProcessstate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DecldetailLogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DecldetailLogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
