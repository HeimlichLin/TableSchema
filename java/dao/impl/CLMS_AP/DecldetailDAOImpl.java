package com.doc.common.dao.impl; 
 
public class DecldetailDAOImpl extends GeneralDAOImpl<DecldetailPo> implements DecldetailDAO { 
	public static final DecldetailDAOImpl INSTANCE = new DecldetailDAOImpl(); 
	public static final String TABLENAME = "DECLDETAIL"; 

	public DecldetailDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DecldetailPo> CONVERTER = new MapConverter<DecldetailPo>() { 
 
		@Override 
		public DecldetailPo convert(final DataObject dataObject) { 
			final DecldetailPo decldetailPo = new DecldetailPo(); 
			decldetailPo.setBondno(dataObject.getString(DecldetailPo.COLUMNS.BONDNO.name())); 
			decldetailPo.setDeclno(dataObject.getString(DecldetailPo.COLUMNS.DECLNO.name())); 
			decldetailPo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(DecldetailPo.COLUMNS.ITEMNO.name()))); 
			decldetailPo.setPrdtno(dataObject.getString(DecldetailPo.COLUMNS.PRDTNO.name())); 
			decldetailPo.setDescrip(dataObject.getString(DecldetailPo.COLUMNS.DESCRIP.name())); 
			decldetailPo.setBrand(dataObject.getString(DecldetailPo.COLUMNS.BRAND.name())); 
			decldetailPo.setModel(dataObject.getString(DecldetailPo.COLUMNS.MODEL.name())); 
			decldetailPo.setSpec(dataObject.getString(DecldetailPo.COLUMNS.SPEC.name())); 
			decldetailPo.setQty(BigDecimalUtils.formObj(dataObject.getValue(DecldetailPo.COLUMNS.QTY.name()))); 
			decldetailPo.setUnit(dataObject.getString(DecldetailPo.COLUMNS.UNIT.name())); 
			decldetailPo.setUprice(BigDecimalUtils.formObj(dataObject.getValue(DecldetailPo.COLUMNS.UPRICE.name()))); 
			decldetailPo.setCur(dataObject.getString(DecldetailPo.COLUMNS.CUR.name())); 
			decldetailPo.setValueamt(BigDecimalUtils.formObj(dataObject.getValue(DecldetailPo.COLUMNS.VALUEAMT.name()))); 
			decldetailPo.setValueqty(BigDecimalUtils.formObj(dataObject.getValue(DecldetailPo.COLUMNS.VALUEQTY.name()))); 
			decldetailPo.setDutyrate(BigDecimalUtils.formObj(dataObject.getValue(DecldetailPo.COLUMNS.DUTYRATE.name()))); 
			decldetailPo.setUnitduty(BigDecimalUtils.formObj(dataObject.getValue(DecldetailPo.COLUMNS.UNITDUTY.name()))); 
			decldetailPo.setOdeclno(dataObject.getString(DecldetailPo.COLUMNS.ODECLNO.name())); 
			decldetailPo.setOitemno(BigDecimalUtils.formObj(dataObject.getValue(DecldetailPo.COLUMNS.OITEMNO.name()))); 
			decldetailPo.setCcccode(dataObject.getString(DecldetailPo.COLUMNS.CCCCODE.name())); 
			decldetailPo.setComdtaxrate(BigDecimalUtils.formObj(dataObject.getValue(DecldetailPo.COLUMNS.COMDTAXRATE.name()))); 
			decldetailPo.setStrtype(dataObject.getString(DecldetailPo.COLUMNS.STRTYPE.name())); 
			decldetailPo.setDutytype(dataObject.getString(DecldetailPo.COLUMNS.DUTYTYPE.name())); 
			decldetailPo.setStatmode(dataObject.getString(DecldetailPo.COLUMNS.STATMODE.name())); 
			decldetailPo.setMsgtype(dataObject.getString(DecldetailPo.COLUMNS.MSGTYPE.name())); 
			decldetailPo.setD8date(dataObject.getString(DecldetailPo.COLUMNS.D8DATE.name())); 
			decldetailPo.setProdcountry(dataObject.getString(DecldetailPo.COLUMNS.PRODCOUNTRY.name())); 
			decldetailPo.setD8declno(dataObject.getString(DecldetailPo.COLUMNS.D8DECLNO.name())); 
			decldetailPo.setNwght(BigDecimalUtils.formObj(dataObject.getValue(DecldetailPo.COLUMNS.NWGHT.name()))); 
			decldetailPo.setOexdeclno(dataObject.getString(DecldetailPo.COLUMNS.OEXDECLNO.name())); 
			decldetailPo.setOexitemno(BigDecimalUtils.formObj(dataObject.getValue(DecldetailPo.COLUMNS.OEXITEMNO.name()))); 
			return decldetailPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DecldetailPo decldetailPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DecldetailPo.COLUMNS.BONDNO.name(), decldetailPo.getBondno()); 
			dataObject.setValue(DecldetailPo.COLUMNS.DECLNO.name(), decldetailPo.getDeclno()); 
			dataObject.setValue(DecldetailPo.COLUMNS.ITEMNO.name(), decldetailPo.getItemno()); 
			dataObject.setValue(DecldetailPo.COLUMNS.PRDTNO.name(), decldetailPo.getPrdtno()); 
			dataObject.setValue(DecldetailPo.COLUMNS.DESCRIP.name(), decldetailPo.getDescrip()); 
			dataObject.setValue(DecldetailPo.COLUMNS.BRAND.name(), decldetailPo.getBrand()); 
			dataObject.setValue(DecldetailPo.COLUMNS.MODEL.name(), decldetailPo.getModel()); 
			dataObject.setValue(DecldetailPo.COLUMNS.SPEC.name(), decldetailPo.getSpec()); 
			dataObject.setValue(DecldetailPo.COLUMNS.QTY.name(), decldetailPo.getQty()); 
			dataObject.setValue(DecldetailPo.COLUMNS.UNIT.name(), decldetailPo.getUnit()); 
			dataObject.setValue(DecldetailPo.COLUMNS.UPRICE.name(), decldetailPo.getUprice()); 
			dataObject.setValue(DecldetailPo.COLUMNS.CUR.name(), decldetailPo.getCur()); 
			dataObject.setValue(DecldetailPo.COLUMNS.VALUEAMT.name(), decldetailPo.getValueamt()); 
			dataObject.setValue(DecldetailPo.COLUMNS.VALUEQTY.name(), decldetailPo.getValueqty()); 
			dataObject.setValue(DecldetailPo.COLUMNS.DUTYRATE.name(), decldetailPo.getDutyrate()); 
			dataObject.setValue(DecldetailPo.COLUMNS.UNITDUTY.name(), decldetailPo.getUnitduty()); 
			dataObject.setValue(DecldetailPo.COLUMNS.ODECLNO.name(), decldetailPo.getOdeclno()); 
			dataObject.setValue(DecldetailPo.COLUMNS.OITEMNO.name(), decldetailPo.getOitemno()); 
			dataObject.setValue(DecldetailPo.COLUMNS.CCCCODE.name(), decldetailPo.getCcccode()); 
			dataObject.setValue(DecldetailPo.COLUMNS.COMDTAXRATE.name(), decldetailPo.getComdtaxrate()); 
			dataObject.setValue(DecldetailPo.COLUMNS.STRTYPE.name(), decldetailPo.getStrtype()); 
			dataObject.setValue(DecldetailPo.COLUMNS.DUTYTYPE.name(), decldetailPo.getDutytype()); 
			dataObject.setValue(DecldetailPo.COLUMNS.STATMODE.name(), decldetailPo.getStatmode()); 
			dataObject.setValue(DecldetailPo.COLUMNS.MSGTYPE.name(), decldetailPo.getMsgtype()); 
			dataObject.setValue(DecldetailPo.COLUMNS.D8DATE.name(), decldetailPo.getD8date()); 
			dataObject.setValue(DecldetailPo.COLUMNS.PRODCOUNTRY.name(), decldetailPo.getProdcountry()); 
			dataObject.setValue(DecldetailPo.COLUMNS.D8DECLNO.name(), decldetailPo.getD8declno()); 
			dataObject.setValue(DecldetailPo.COLUMNS.NWGHT.name(), decldetailPo.getNwght()); 
			dataObject.setValue(DecldetailPo.COLUMNS.OEXDECLNO.name(), decldetailPo.getOexdeclno()); 
			dataObject.setValue(DecldetailPo.COLUMNS.OEXITEMNO.name(), decldetailPo.getOexitemno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DecldetailPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DecldetailPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(DecldetailPo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(DecldetailPo.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(DecldetailPo.COLUMNS.ITEMNO.name(), po.getItemno()); 
		sqlWhere.add(DecldetailPo.COLUMNS.STRTYPE.name(), po.getStrtype()); 
		sqlWhere.add(DecldetailPo.COLUMNS.MSGTYPE.name(), po.getMsgtype()); 
		return sqlWhere; 
	} 
 
} 
