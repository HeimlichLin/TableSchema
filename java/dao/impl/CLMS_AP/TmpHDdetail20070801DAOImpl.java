package com.doc.common.dao.impl; 
 
public class TmpHDdetail20070801DAOImpl extends GeneralDAOImpl<TmpHDdetail20070801Po> implements TmpHDdetail20070801DAO { 
	public static final TmpHDdetail20070801DAOImpl INSTANCE = new TmpHDdetail20070801DAOImpl(); 
	public static final String TABLENAME = "TMP_H_DDETAIL_20070801"; 

	public TmpHDdetail20070801DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TmpHDdetail20070801Po> CONVERTER = new MapConverter<TmpHDdetail20070801Po>() { 
 
		@Override 
		public TmpHDdetail20070801Po convert(final DataObject dataObject) { 
			final TmpHDdetail20070801Po tmpHDdetail20070801Po = new TmpHDdetail20070801Po(); 
			tmpHDdetail20070801Po.setBondno(dataObject.getString(TmpHDdetail20070801Po.COLUMNS.BONDNO.name())); 
			tmpHDdetail20070801Po.setDeclno(dataObject.getString(TmpHDdetail20070801Po.COLUMNS.DECLNO.name())); 
			tmpHDdetail20070801Po.setItemno(BigDecimalUtils.formObj(dataObject.getValue(TmpHDdetail20070801Po.COLUMNS.ITEMNO.name()))); 
			tmpHDdetail20070801Po.setPrdtno(dataObject.getString(TmpHDdetail20070801Po.COLUMNS.PRDTNO.name())); 
			tmpHDdetail20070801Po.setDescrip(dataObject.getString(TmpHDdetail20070801Po.COLUMNS.DESCRIP.name())); 
			tmpHDdetail20070801Po.setBrand(dataObject.getString(TmpHDdetail20070801Po.COLUMNS.BRAND.name())); 
			tmpHDdetail20070801Po.setModel(dataObject.getString(TmpHDdetail20070801Po.COLUMNS.MODEL.name())); 
			tmpHDdetail20070801Po.setSpec(dataObject.getString(TmpHDdetail20070801Po.COLUMNS.SPEC.name())); 
			tmpHDdetail20070801Po.setNwght(BigDecimalUtils.formObj(dataObject.getValue(TmpHDdetail20070801Po.COLUMNS.NWGHT.name()))); 
			tmpHDdetail20070801Po.setQty(BigDecimalUtils.formObj(dataObject.getValue(TmpHDdetail20070801Po.COLUMNS.QTY.name()))); 
			tmpHDdetail20070801Po.setUnit(dataObject.getString(TmpHDdetail20070801Po.COLUMNS.UNIT.name())); 
			tmpHDdetail20070801Po.setUprice(BigDecimalUtils.formObj(dataObject.getValue(TmpHDdetail20070801Po.COLUMNS.UPRICE.name()))); 
			tmpHDdetail20070801Po.setCur(dataObject.getString(TmpHDdetail20070801Po.COLUMNS.CUR.name())); 
			tmpHDdetail20070801Po.setValueamt(BigDecimalUtils.formObj(dataObject.getValue(TmpHDdetail20070801Po.COLUMNS.VALUEAMT.name()))); 
			tmpHDdetail20070801Po.setValueqty(BigDecimalUtils.formObj(dataObject.getValue(TmpHDdetail20070801Po.COLUMNS.VALUEQTY.name()))); 
			tmpHDdetail20070801Po.setDutyrate(BigDecimalUtils.formObj(dataObject.getValue(TmpHDdetail20070801Po.COLUMNS.DUTYRATE.name()))); 
			tmpHDdetail20070801Po.setUnitduty(BigDecimalUtils.formObj(dataObject.getValue(TmpHDdetail20070801Po.COLUMNS.UNITDUTY.name()))); 
			tmpHDdetail20070801Po.setOdeclno(dataObject.getString(TmpHDdetail20070801Po.COLUMNS.ODECLNO.name())); 
			tmpHDdetail20070801Po.setOitemno(BigDecimalUtils.formObj(dataObject.getValue(TmpHDdetail20070801Po.COLUMNS.OITEMNO.name()))); 
			tmpHDdetail20070801Po.setCcccode(dataObject.getString(TmpHDdetail20070801Po.COLUMNS.CCCCODE.name())); 
			tmpHDdetail20070801Po.setComdtaxrate(BigDecimalUtils.formObj(dataObject.getValue(TmpHDdetail20070801Po.COLUMNS.COMDTAXRATE.name()))); 
			tmpHDdetail20070801Po.setStrtype(dataObject.getString(TmpHDdetail20070801Po.COLUMNS.STRTYPE.name())); 
			tmpHDdetail20070801Po.setUpdtime(dataObject.getString(TmpHDdetail20070801Po.COLUMNS.UPDTIME.name())); 
			tmpHDdetail20070801Po.setDutytype(dataObject.getString(TmpHDdetail20070801Po.COLUMNS.DUTYTYPE.name())); 
			tmpHDdetail20070801Po.setStatmode(dataObject.getString(TmpHDdetail20070801Po.COLUMNS.STATMODE.name())); 
			tmpHDdetail20070801Po.setMsgtype(dataObject.getString(TmpHDdetail20070801Po.COLUMNS.MSGTYPE.name())); 
			tmpHDdetail20070801Po.setD8date(dataObject.getString(TmpHDdetail20070801Po.COLUMNS.D8DATE.name())); 
			tmpHDdetail20070801Po.setProdcountry(dataObject.getString(TmpHDdetail20070801Po.COLUMNS.PRODCOUNTRY.name())); 
			return tmpHDdetail20070801Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final TmpHDdetail20070801Po tmpHDdetail20070801Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TmpHDdetail20070801Po.COLUMNS.BONDNO.name(), tmpHDdetail20070801Po.getBondno()); 
			dataObject.setValue(TmpHDdetail20070801Po.COLUMNS.DECLNO.name(), tmpHDdetail20070801Po.getDeclno()); 
			dataObject.setValue(TmpHDdetail20070801Po.COLUMNS.ITEMNO.name(), tmpHDdetail20070801Po.getItemno()); 
			dataObject.setValue(TmpHDdetail20070801Po.COLUMNS.PRDTNO.name(), tmpHDdetail20070801Po.getPrdtno()); 
			dataObject.setValue(TmpHDdetail20070801Po.COLUMNS.DESCRIP.name(), tmpHDdetail20070801Po.getDescrip()); 
			dataObject.setValue(TmpHDdetail20070801Po.COLUMNS.BRAND.name(), tmpHDdetail20070801Po.getBrand()); 
			dataObject.setValue(TmpHDdetail20070801Po.COLUMNS.MODEL.name(), tmpHDdetail20070801Po.getModel()); 
			dataObject.setValue(TmpHDdetail20070801Po.COLUMNS.SPEC.name(), tmpHDdetail20070801Po.getSpec()); 
			dataObject.setValue(TmpHDdetail20070801Po.COLUMNS.NWGHT.name(), tmpHDdetail20070801Po.getNwght()); 
			dataObject.setValue(TmpHDdetail20070801Po.COLUMNS.QTY.name(), tmpHDdetail20070801Po.getQty()); 
			dataObject.setValue(TmpHDdetail20070801Po.COLUMNS.UNIT.name(), tmpHDdetail20070801Po.getUnit()); 
			dataObject.setValue(TmpHDdetail20070801Po.COLUMNS.UPRICE.name(), tmpHDdetail20070801Po.getUprice()); 
			dataObject.setValue(TmpHDdetail20070801Po.COLUMNS.CUR.name(), tmpHDdetail20070801Po.getCur()); 
			dataObject.setValue(TmpHDdetail20070801Po.COLUMNS.VALUEAMT.name(), tmpHDdetail20070801Po.getValueamt()); 
			dataObject.setValue(TmpHDdetail20070801Po.COLUMNS.VALUEQTY.name(), tmpHDdetail20070801Po.getValueqty()); 
			dataObject.setValue(TmpHDdetail20070801Po.COLUMNS.DUTYRATE.name(), tmpHDdetail20070801Po.getDutyrate()); 
			dataObject.setValue(TmpHDdetail20070801Po.COLUMNS.UNITDUTY.name(), tmpHDdetail20070801Po.getUnitduty()); 
			dataObject.setValue(TmpHDdetail20070801Po.COLUMNS.ODECLNO.name(), tmpHDdetail20070801Po.getOdeclno()); 
			dataObject.setValue(TmpHDdetail20070801Po.COLUMNS.OITEMNO.name(), tmpHDdetail20070801Po.getOitemno()); 
			dataObject.setValue(TmpHDdetail20070801Po.COLUMNS.CCCCODE.name(), tmpHDdetail20070801Po.getCcccode()); 
			dataObject.setValue(TmpHDdetail20070801Po.COLUMNS.COMDTAXRATE.name(), tmpHDdetail20070801Po.getComdtaxrate()); 
			dataObject.setValue(TmpHDdetail20070801Po.COLUMNS.STRTYPE.name(), tmpHDdetail20070801Po.getStrtype()); 
			dataObject.setValue(TmpHDdetail20070801Po.COLUMNS.UPDTIME.name(), tmpHDdetail20070801Po.getUpdtime()); 
			dataObject.setValue(TmpHDdetail20070801Po.COLUMNS.DUTYTYPE.name(), tmpHDdetail20070801Po.getDutytype()); 
			dataObject.setValue(TmpHDdetail20070801Po.COLUMNS.STATMODE.name(), tmpHDdetail20070801Po.getStatmode()); 
			dataObject.setValue(TmpHDdetail20070801Po.COLUMNS.MSGTYPE.name(), tmpHDdetail20070801Po.getMsgtype()); 
			dataObject.setValue(TmpHDdetail20070801Po.COLUMNS.D8DATE.name(), tmpHDdetail20070801Po.getD8date()); 
			dataObject.setValue(TmpHDdetail20070801Po.COLUMNS.PRODCOUNTRY.name(), tmpHDdetail20070801Po.getProdcountry()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TmpHDdetail20070801Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TmpHDdetail20070801Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
