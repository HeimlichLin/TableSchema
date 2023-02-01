package com.doc.common.dao.impl; 
 
public class XdecldetailDAOImpl extends GeneralDAOImpl<XdecldetailPo> implements XdecldetailDAO { 
	public static final XdecldetailDAOImpl INSTANCE = new XdecldetailDAOImpl(); 
	public static final String TABLENAME = "XDECLDETAIL"; 

	public XdecldetailDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<XdecldetailPo> CONVERTER = new MapConverter<XdecldetailPo>() { 
 
		@Override 
		public XdecldetailPo convert(final DataObject dataObject) { 
			final XdecldetailPo xdecldetailPo = new XdecldetailPo(); 
			xdecldetailPo.setBondno(dataObject.getString(XdecldetailPo.COLUMNS.BONDNO.name())); 
			xdecldetailPo.setDeclno(dataObject.getString(XdecldetailPo.COLUMNS.DECLNO.name())); 
			xdecldetailPo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(XdecldetailPo.COLUMNS.ITEMNO.name()))); 
			xdecldetailPo.setPrdtno(dataObject.getString(XdecldetailPo.COLUMNS.PRDTNO.name())); 
			xdecldetailPo.setDescrip(dataObject.getString(XdecldetailPo.COLUMNS.DESCRIP.name())); 
			xdecldetailPo.setBrand(dataObject.getString(XdecldetailPo.COLUMNS.BRAND.name())); 
			xdecldetailPo.setModel(dataObject.getString(XdecldetailPo.COLUMNS.MODEL.name())); 
			xdecldetailPo.setSpec(dataObject.getString(XdecldetailPo.COLUMNS.SPEC.name())); 
			xdecldetailPo.setNwght(BigDecimalUtils.formObj(dataObject.getValue(XdecldetailPo.COLUMNS.NWGHT.name()))); 
			xdecldetailPo.setQty(BigDecimalUtils.formObj(dataObject.getValue(XdecldetailPo.COLUMNS.QTY.name()))); 
			xdecldetailPo.setUnit(dataObject.getString(XdecldetailPo.COLUMNS.UNIT.name())); 
			xdecldetailPo.setUprice(BigDecimalUtils.formObj(dataObject.getValue(XdecldetailPo.COLUMNS.UPRICE.name()))); 
			xdecldetailPo.setCur(dataObject.getString(XdecldetailPo.COLUMNS.CUR.name())); 
			xdecldetailPo.setValueamt(BigDecimalUtils.formObj(dataObject.getValue(XdecldetailPo.COLUMNS.VALUEAMT.name()))); 
			xdecldetailPo.setValueqty(BigDecimalUtils.formObj(dataObject.getValue(XdecldetailPo.COLUMNS.VALUEQTY.name()))); 
			xdecldetailPo.setDutyrate(BigDecimalUtils.formObj(dataObject.getValue(XdecldetailPo.COLUMNS.DUTYRATE.name()))); 
			xdecldetailPo.setUnitduty(BigDecimalUtils.formObj(dataObject.getValue(XdecldetailPo.COLUMNS.UNITDUTY.name()))); 
			xdecldetailPo.setOdeclno(dataObject.getString(XdecldetailPo.COLUMNS.ODECLNO.name())); 
			xdecldetailPo.setOitemno(BigDecimalUtils.formObj(dataObject.getValue(XdecldetailPo.COLUMNS.OITEMNO.name()))); 
			xdecldetailPo.setCcccode(dataObject.getString(XdecldetailPo.COLUMNS.CCCCODE.name())); 
			xdecldetailPo.setComdtaxrate(BigDecimalUtils.formObj(dataObject.getValue(XdecldetailPo.COLUMNS.COMDTAXRATE.name()))); 
			xdecldetailPo.setStrtype(dataObject.getString(XdecldetailPo.COLUMNS.STRTYPE.name())); 
			return xdecldetailPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final XdecldetailPo xdecldetailPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(XdecldetailPo.COLUMNS.BONDNO.name(), xdecldetailPo.getBondno()); 
			dataObject.setValue(XdecldetailPo.COLUMNS.DECLNO.name(), xdecldetailPo.getDeclno()); 
			dataObject.setValue(XdecldetailPo.COLUMNS.ITEMNO.name(), xdecldetailPo.getItemno()); 
			dataObject.setValue(XdecldetailPo.COLUMNS.PRDTNO.name(), xdecldetailPo.getPrdtno()); 
			dataObject.setValue(XdecldetailPo.COLUMNS.DESCRIP.name(), xdecldetailPo.getDescrip()); 
			dataObject.setValue(XdecldetailPo.COLUMNS.BRAND.name(), xdecldetailPo.getBrand()); 
			dataObject.setValue(XdecldetailPo.COLUMNS.MODEL.name(), xdecldetailPo.getModel()); 
			dataObject.setValue(XdecldetailPo.COLUMNS.SPEC.name(), xdecldetailPo.getSpec()); 
			dataObject.setValue(XdecldetailPo.COLUMNS.NWGHT.name(), xdecldetailPo.getNwght()); 
			dataObject.setValue(XdecldetailPo.COLUMNS.QTY.name(), xdecldetailPo.getQty()); 
			dataObject.setValue(XdecldetailPo.COLUMNS.UNIT.name(), xdecldetailPo.getUnit()); 
			dataObject.setValue(XdecldetailPo.COLUMNS.UPRICE.name(), xdecldetailPo.getUprice()); 
			dataObject.setValue(XdecldetailPo.COLUMNS.CUR.name(), xdecldetailPo.getCur()); 
			dataObject.setValue(XdecldetailPo.COLUMNS.VALUEAMT.name(), xdecldetailPo.getValueamt()); 
			dataObject.setValue(XdecldetailPo.COLUMNS.VALUEQTY.name(), xdecldetailPo.getValueqty()); 
			dataObject.setValue(XdecldetailPo.COLUMNS.DUTYRATE.name(), xdecldetailPo.getDutyrate()); 
			dataObject.setValue(XdecldetailPo.COLUMNS.UNITDUTY.name(), xdecldetailPo.getUnitduty()); 
			dataObject.setValue(XdecldetailPo.COLUMNS.ODECLNO.name(), xdecldetailPo.getOdeclno()); 
			dataObject.setValue(XdecldetailPo.COLUMNS.OITEMNO.name(), xdecldetailPo.getOitemno()); 
			dataObject.setValue(XdecldetailPo.COLUMNS.CCCCODE.name(), xdecldetailPo.getCcccode()); 
			dataObject.setValue(XdecldetailPo.COLUMNS.COMDTAXRATE.name(), xdecldetailPo.getComdtaxrate()); 
			dataObject.setValue(XdecldetailPo.COLUMNS.STRTYPE.name(), xdecldetailPo.getStrtype()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<XdecldetailPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(XdecldetailPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(XdecldetailPo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(XdecldetailPo.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(XdecldetailPo.COLUMNS.ITEMNO.name(), po.getItemno()); 
		return sqlWhere; 
	} 
 
} 
