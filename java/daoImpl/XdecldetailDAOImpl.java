package com.doc.common.dao.impl; 
 
public class XdecldetailDAOImpl extends GeneralDAOImpl<XdecldetailDo> implements XdecldetailDAOImpl { 
	public static final XdecldetailDAOImpl INSTANCE = new XdecldetailDAOImpl(); 
	public static final String TABLENAME = "XDECLDETAIL"; 

	public XdecldetailDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<XdecldetailDo> CONVERTER = new MapConverter<XdecldetailDo>() { 
 
		@Override 
		public XdecldetailDo convert(final DataObject dataObject) { 
			final XdecldetailDo xdecldetailDo = new XdecldetailDo(); 
			xdecldetailDo.setBondno(dataObject.getString(XdecldetailDo.COLUMNS.BONDNO.name())); 
			xdecldetailDo.setDeclno(dataObject.getString(XdecldetailDo.COLUMNS.DECLNO.name())); 
			xdecldetailDo.setItemno(BigDecimalUtils.formObj(dataObject.getString(XdecldetailDo.COLUMNS.ITEMNO.name()))); 
			xdecldetailDo.setPrdtno(dataObject.getString(XdecldetailDo.COLUMNS.PRDTNO.name())); 
			xdecldetailDo.setDescrip(dataObject.getString(XdecldetailDo.COLUMNS.DESCRIP.name())); 
			xdecldetailDo.setBrand(dataObject.getString(XdecldetailDo.COLUMNS.BRAND.name())); 
			xdecldetailDo.setModel(dataObject.getString(XdecldetailDo.COLUMNS.MODEL.name())); 
			xdecldetailDo.setSpec(dataObject.getString(XdecldetailDo.COLUMNS.SPEC.name())); 
			xdecldetailDo.setNwght(BigDecimalUtils.formObj(dataObject.getString(XdecldetailDo.COLUMNS.NWGHT.name()))); 
			xdecldetailDo.setQty(BigDecimalUtils.formObj(dataObject.getString(XdecldetailDo.COLUMNS.QTY.name()))); 
			xdecldetailDo.setUnit(dataObject.getString(XdecldetailDo.COLUMNS.UNIT.name())); 
			xdecldetailDo.setUprice(BigDecimalUtils.formObj(dataObject.getString(XdecldetailDo.COLUMNS.UPRICE.name()))); 
			xdecldetailDo.setCur(dataObject.getString(XdecldetailDo.COLUMNS.CUR.name())); 
			xdecldetailDo.setValueamt(BigDecimalUtils.formObj(dataObject.getString(XdecldetailDo.COLUMNS.VALUEAMT.name()))); 
			xdecldetailDo.setValueqty(BigDecimalUtils.formObj(dataObject.getString(XdecldetailDo.COLUMNS.VALUEQTY.name()))); 
			xdecldetailDo.setDutyrate(BigDecimalUtils.formObj(dataObject.getString(XdecldetailDo.COLUMNS.DUTYRATE.name()))); 
			xdecldetailDo.setUnitduty(BigDecimalUtils.formObj(dataObject.getString(XdecldetailDo.COLUMNS.UNITDUTY.name()))); 
			xdecldetailDo.setOdeclno(dataObject.getString(XdecldetailDo.COLUMNS.ODECLNO.name())); 
			xdecldetailDo.setOitemno(BigDecimalUtils.formObj(dataObject.getString(XdecldetailDo.COLUMNS.OITEMNO.name()))); 
			xdecldetailDo.setCcccode(dataObject.getString(XdecldetailDo.COLUMNS.CCCCODE.name())); 
			xdecldetailDo.setComdtaxrate(BigDecimalUtils.formObj(dataObject.getString(XdecldetailDo.COLUMNS.COMDTAXRATE.name()))); 
			xdecldetailDo.setStrtype(dataObject.getString(XdecldetailDo.COLUMNS.STRTYPE.name())); 
			return xdecldetailDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final XdecldetailDo xdecldetailDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(XdecldetailDo.COLUMNS.BONDNO.name(), xdecldetailDo.getBondno()); 
			dataObject.setValue(XdecldetailDo.COLUMNS.DECLNO.name(), xdecldetailDo.getDeclno()); 
			dataObject.setValue(XdecldetailDo.COLUMNS.ITEMNO.name(), xdecldetailDo.getItemno()); 
			dataObject.setValue(XdecldetailDo.COLUMNS.PRDTNO.name(), xdecldetailDo.getPrdtno()); 
			dataObject.setValue(XdecldetailDo.COLUMNS.DESCRIP.name(), xdecldetailDo.getDescrip()); 
			dataObject.setValue(XdecldetailDo.COLUMNS.BRAND.name(), xdecldetailDo.getBrand()); 
			dataObject.setValue(XdecldetailDo.COLUMNS.MODEL.name(), xdecldetailDo.getModel()); 
			dataObject.setValue(XdecldetailDo.COLUMNS.SPEC.name(), xdecldetailDo.getSpec()); 
			dataObject.setValue(XdecldetailDo.COLUMNS.NWGHT.name(), xdecldetailDo.getNwght()); 
			dataObject.setValue(XdecldetailDo.COLUMNS.QTY.name(), xdecldetailDo.getQty()); 
			dataObject.setValue(XdecldetailDo.COLUMNS.UNIT.name(), xdecldetailDo.getUnit()); 
			dataObject.setValue(XdecldetailDo.COLUMNS.UPRICE.name(), xdecldetailDo.getUprice()); 
			dataObject.setValue(XdecldetailDo.COLUMNS.CUR.name(), xdecldetailDo.getCur()); 
			dataObject.setValue(XdecldetailDo.COLUMNS.VALUEAMT.name(), xdecldetailDo.getValueamt()); 
			dataObject.setValue(XdecldetailDo.COLUMNS.VALUEQTY.name(), xdecldetailDo.getValueqty()); 
			dataObject.setValue(XdecldetailDo.COLUMNS.DUTYRATE.name(), xdecldetailDo.getDutyrate()); 
			dataObject.setValue(XdecldetailDo.COLUMNS.UNITDUTY.name(), xdecldetailDo.getUnitduty()); 
			dataObject.setValue(XdecldetailDo.COLUMNS.ODECLNO.name(), xdecldetailDo.getOdeclno()); 
			dataObject.setValue(XdecldetailDo.COLUMNS.OITEMNO.name(), xdecldetailDo.getOitemno()); 
			dataObject.setValue(XdecldetailDo.COLUMNS.CCCCODE.name(), xdecldetailDo.getCcccode()); 
			dataObject.setValue(XdecldetailDo.COLUMNS.COMDTAXRATE.name(), xdecldetailDo.getComdtaxrate()); 
			dataObject.setValue(XdecldetailDo.COLUMNS.STRTYPE.name(), xdecldetailDo.getStrtype()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<XdecldetailDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(XdecldetailDo po) { 
		sqlWhere.add(XdecldetailDo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(XdecldetailDo.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(XdecldetailDo.COLUMNS.ITEMNO.name(), po.getItemno()); 
	} 
 
} 
