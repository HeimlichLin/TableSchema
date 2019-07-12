package com.doc.common.dao.impl; 
 
public class TmpHDdetail20070801DAOImpl extends GeneralDAOImpl<TmpHDdetail20070801Do> implements TmpHDdetail20070801DAOImpl { 
	public static final TmpHDdetail20070801DAOImpl INSTANCE = new TmpHDdetail20070801DAOImpl(); 
	public static final String TABLENAME = "TMP_H_DDETAIL_20070801"; 

	public TmpHDdetail20070801DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<TmpHDdetail20070801Do> CONVERTER = new MapConverter<TmpHDdetail20070801Do>() { 
 
		@Override 
		public TmpHDdetail20070801Do convert(final DataObject dataObject) { 
			final TmpHDdetail20070801Do tmpHDdetail20070801Do = new TmpHDdetail20070801Do(); 
			tmpHDdetail20070801Do.setBondno(dataObject.getString(TmpHDdetail20070801Do.COLUMNS.BONDNO.name())); 
			tmpHDdetail20070801Do.setDeclno(dataObject.getString(TmpHDdetail20070801Do.COLUMNS.DECLNO.name())); 
			tmpHDdetail20070801Do.setItemno(BigDecimalUtils.formObj(dataObject.getString(TmpHDdetail20070801Do.COLUMNS.ITEMNO.name()))); 
			tmpHDdetail20070801Do.setPrdtno(dataObject.getString(TmpHDdetail20070801Do.COLUMNS.PRDTNO.name())); 
			tmpHDdetail20070801Do.setDescrip(dataObject.getString(TmpHDdetail20070801Do.COLUMNS.DESCRIP.name())); 
			tmpHDdetail20070801Do.setBrand(dataObject.getString(TmpHDdetail20070801Do.COLUMNS.BRAND.name())); 
			tmpHDdetail20070801Do.setModel(dataObject.getString(TmpHDdetail20070801Do.COLUMNS.MODEL.name())); 
			tmpHDdetail20070801Do.setSpec(dataObject.getString(TmpHDdetail20070801Do.COLUMNS.SPEC.name())); 
			tmpHDdetail20070801Do.setNwght(BigDecimalUtils.formObj(dataObject.getString(TmpHDdetail20070801Do.COLUMNS.NWGHT.name()))); 
			tmpHDdetail20070801Do.setQty(BigDecimalUtils.formObj(dataObject.getString(TmpHDdetail20070801Do.COLUMNS.QTY.name()))); 
			tmpHDdetail20070801Do.setUnit(dataObject.getString(TmpHDdetail20070801Do.COLUMNS.UNIT.name())); 
			tmpHDdetail20070801Do.setUprice(BigDecimalUtils.formObj(dataObject.getString(TmpHDdetail20070801Do.COLUMNS.UPRICE.name()))); 
			tmpHDdetail20070801Do.setCur(dataObject.getString(TmpHDdetail20070801Do.COLUMNS.CUR.name())); 
			tmpHDdetail20070801Do.setValueamt(BigDecimalUtils.formObj(dataObject.getString(TmpHDdetail20070801Do.COLUMNS.VALUEAMT.name()))); 
			tmpHDdetail20070801Do.setValueqty(BigDecimalUtils.formObj(dataObject.getString(TmpHDdetail20070801Do.COLUMNS.VALUEQTY.name()))); 
			tmpHDdetail20070801Do.setDutyrate(BigDecimalUtils.formObj(dataObject.getString(TmpHDdetail20070801Do.COLUMNS.DUTYRATE.name()))); 
			tmpHDdetail20070801Do.setUnitduty(BigDecimalUtils.formObj(dataObject.getString(TmpHDdetail20070801Do.COLUMNS.UNITDUTY.name()))); 
			tmpHDdetail20070801Do.setOdeclno(dataObject.getString(TmpHDdetail20070801Do.COLUMNS.ODECLNO.name())); 
			tmpHDdetail20070801Do.setOitemno(BigDecimalUtils.formObj(dataObject.getString(TmpHDdetail20070801Do.COLUMNS.OITEMNO.name()))); 
			tmpHDdetail20070801Do.setCcccode(dataObject.getString(TmpHDdetail20070801Do.COLUMNS.CCCCODE.name())); 
			tmpHDdetail20070801Do.setComdtaxrate(BigDecimalUtils.formObj(dataObject.getString(TmpHDdetail20070801Do.COLUMNS.COMDTAXRATE.name()))); 
			tmpHDdetail20070801Do.setStrtype(dataObject.getString(TmpHDdetail20070801Do.COLUMNS.STRTYPE.name())); 
			tmpHDdetail20070801Do.setUpdtime(dataObject.getString(TmpHDdetail20070801Do.COLUMNS.UPDTIME.name())); 
			tmpHDdetail20070801Do.setDutytype(dataObject.getString(TmpHDdetail20070801Do.COLUMNS.DUTYTYPE.name())); 
			tmpHDdetail20070801Do.setStatmode(dataObject.getString(TmpHDdetail20070801Do.COLUMNS.STATMODE.name())); 
			tmpHDdetail20070801Do.setMsgtype(dataObject.getString(TmpHDdetail20070801Do.COLUMNS.MSGTYPE.name())); 
			tmpHDdetail20070801Do.setD8date(dataObject.getString(TmpHDdetail20070801Do.COLUMNS.D8DATE.name())); 
			tmpHDdetail20070801Do.setProdcountry(dataObject.getString(TmpHDdetail20070801Do.COLUMNS.PRODCOUNTRY.name())); 
			return tmpHDdetail20070801Do; 
		} 
 
		@Override 
		public DataObject toDataObject(final TmpHDdetail20070801Do tmpHDdetail20070801Do) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TmpHDdetail20070801Do.COLUMNS.BONDNO.name(), tmpHDdetail20070801Do.getBondno()); 
			dataObject.setValue(TmpHDdetail20070801Do.COLUMNS.DECLNO.name(), tmpHDdetail20070801Do.getDeclno()); 
			dataObject.setValue(TmpHDdetail20070801Do.COLUMNS.ITEMNO.name(), tmpHDdetail20070801Do.getItemno()); 
			dataObject.setValue(TmpHDdetail20070801Do.COLUMNS.PRDTNO.name(), tmpHDdetail20070801Do.getPrdtno()); 
			dataObject.setValue(TmpHDdetail20070801Do.COLUMNS.DESCRIP.name(), tmpHDdetail20070801Do.getDescrip()); 
			dataObject.setValue(TmpHDdetail20070801Do.COLUMNS.BRAND.name(), tmpHDdetail20070801Do.getBrand()); 
			dataObject.setValue(TmpHDdetail20070801Do.COLUMNS.MODEL.name(), tmpHDdetail20070801Do.getModel()); 
			dataObject.setValue(TmpHDdetail20070801Do.COLUMNS.SPEC.name(), tmpHDdetail20070801Do.getSpec()); 
			dataObject.setValue(TmpHDdetail20070801Do.COLUMNS.NWGHT.name(), tmpHDdetail20070801Do.getNwght()); 
			dataObject.setValue(TmpHDdetail20070801Do.COLUMNS.QTY.name(), tmpHDdetail20070801Do.getQty()); 
			dataObject.setValue(TmpHDdetail20070801Do.COLUMNS.UNIT.name(), tmpHDdetail20070801Do.getUnit()); 
			dataObject.setValue(TmpHDdetail20070801Do.COLUMNS.UPRICE.name(), tmpHDdetail20070801Do.getUprice()); 
			dataObject.setValue(TmpHDdetail20070801Do.COLUMNS.CUR.name(), tmpHDdetail20070801Do.getCur()); 
			dataObject.setValue(TmpHDdetail20070801Do.COLUMNS.VALUEAMT.name(), tmpHDdetail20070801Do.getValueamt()); 
			dataObject.setValue(TmpHDdetail20070801Do.COLUMNS.VALUEQTY.name(), tmpHDdetail20070801Do.getValueqty()); 
			dataObject.setValue(TmpHDdetail20070801Do.COLUMNS.DUTYRATE.name(), tmpHDdetail20070801Do.getDutyrate()); 
			dataObject.setValue(TmpHDdetail20070801Do.COLUMNS.UNITDUTY.name(), tmpHDdetail20070801Do.getUnitduty()); 
			dataObject.setValue(TmpHDdetail20070801Do.COLUMNS.ODECLNO.name(), tmpHDdetail20070801Do.getOdeclno()); 
			dataObject.setValue(TmpHDdetail20070801Do.COLUMNS.OITEMNO.name(), tmpHDdetail20070801Do.getOitemno()); 
			dataObject.setValue(TmpHDdetail20070801Do.COLUMNS.CCCCODE.name(), tmpHDdetail20070801Do.getCcccode()); 
			dataObject.setValue(TmpHDdetail20070801Do.COLUMNS.COMDTAXRATE.name(), tmpHDdetail20070801Do.getComdtaxrate()); 
			dataObject.setValue(TmpHDdetail20070801Do.COLUMNS.STRTYPE.name(), tmpHDdetail20070801Do.getStrtype()); 
			dataObject.setValue(TmpHDdetail20070801Do.COLUMNS.UPDTIME.name(), tmpHDdetail20070801Do.getUpdtime()); 
			dataObject.setValue(TmpHDdetail20070801Do.COLUMNS.DUTYTYPE.name(), tmpHDdetail20070801Do.getDutytype()); 
			dataObject.setValue(TmpHDdetail20070801Do.COLUMNS.STATMODE.name(), tmpHDdetail20070801Do.getStatmode()); 
			dataObject.setValue(TmpHDdetail20070801Do.COLUMNS.MSGTYPE.name(), tmpHDdetail20070801Do.getMsgtype()); 
			dataObject.setValue(TmpHDdetail20070801Do.COLUMNS.D8DATE.name(), tmpHDdetail20070801Do.getD8date()); 
			dataObject.setValue(TmpHDdetail20070801Do.COLUMNS.PRODCOUNTRY.name(), tmpHDdetail20070801Do.getProdcountry()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TmpHDdetail20070801Do> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TmpHDdetail20070801Do po) { 
	} 
 
} 
