package com.doc.common.dao.impl; 
 
public class GrntitemLogDAOImpl extends GeneralDAOImpl<GrntitemLogDo> implements GrntitemLogDAOImpl { 
	public static final GrntitemLogDAOImpl INSTANCE = new GrntitemLogDAOImpl(); 
	public static final String TABLENAME = "GRNTITEM_LOG"; 

	public GrntitemLogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<GrntitemLogDo> CONVERTER = new MapConverter<GrntitemLogDo>() { 
 
		@Override 
		public GrntitemLogDo convert(final DataObject dataObject) { 
			final GrntitemLogDo grntitemLogDo = new GrntitemLogDo(); 
			grntitemLogDo.setBondno(dataObject.getString(GrntitemLogDo.COLUMNS.BONDNO.name())); 
			grntitemLogDo.setRefbillno(dataObject.getString(GrntitemLogDo.COLUMNS.REFBILLNO.name())); 
			grntitemLogDo.setDeclno(dataObject.getString(GrntitemLogDo.COLUMNS.DECLNO.name())); 
			grntitemLogDo.setItemno(BigDecimalUtils.formObj(dataObject.getString(GrntitemLogDo.COLUMNS.ITEMNO.name()))); 
			grntitemLogDo.setStrpost(dataObject.getString(GrntitemLogDo.COLUMNS.STRPOST.name())); 
			grntitemLogDo.setDecltype(dataObject.getString(GrntitemLogDo.COLUMNS.DECLTYPE.name())); 
			grntitemLogDo.setStrtype(dataObject.getString(GrntitemLogDo.COLUMNS.STRTYPE.name())); 
			grntitemLogDo.setStrdate(dataObject.getString(GrntitemLogDo.COLUMNS.STRDATE.name())); 
			grntitemLogDo.setStrqty(BigDecimalUtils.formObj(dataObject.getString(GrntitemLogDo.COLUMNS.STRQTY.name()))); 
			grntitemLogDo.setValueamt(BigDecimalUtils.formObj(dataObject.getString(GrntitemLogDo.COLUMNS.VALUEAMT.name()))); 
			grntitemLogDo.setDutyrate(BigDecimalUtils.formObj(dataObject.getString(GrntitemLogDo.COLUMNS.DUTYRATE.name()))); 
			grntitemLogDo.setAvlgrntamt(BigDecimalUtils.formObj(dataObject.getString(GrntitemLogDo.COLUMNS.AVLGRNTAMT.name()))); 
			grntitemLogDo.setOdeclno(dataObject.getString(GrntitemLogDo.COLUMNS.ODECLNO.name())); 
			grntitemLogDo.setPrdtno(dataObject.getString(GrntitemLogDo.COLUMNS.PRDTNO.name())); 
			grntitemLogDo.setSerialno(dataObject.getString(GrntitemLogDo.COLUMNS.SERIALNO.name())); 
			grntitemLogDo.setRmks(dataObject.getString(GrntitemLogDo.COLUMNS.RMKS.name())); 
			grntitemLogDo.setComdtaxrate(BigDecimalUtils.formObj(dataObject.getString(GrntitemLogDo.COLUMNS.COMDTAXRATE.name()))); 
			grntitemLogDo.setVataxrate(BigDecimalUtils.formObj(dataObject.getString(GrntitemLogDo.COLUMNS.VATAXRATE.name()))); 
			grntitemLogDo.setDeclqty(BigDecimalUtils.formObj(dataObject.getString(GrntitemLogDo.COLUMNS.DECLQTY.name()))); 
			grntitemLogDo.setTaxamt(BigDecimalUtils.formObj(dataObject.getString(GrntitemLogDo.COLUMNS.TAXAMT.name()))); 
			grntitemLogDo.setIseval(dataObject.getString(GrntitemLogDo.COLUMNS.ISEVAL.name())); 
			grntitemLogDo.setOitemno(BigDecimalUtils.formObj(dataObject.getString(GrntitemLogDo.COLUMNS.OITEMNO.name()))); 
			grntitemLogDo.setCcccode(dataObject.getString(GrntitemLogDo.COLUMNS.CCCCODE.name())); 
			grntitemLogDo.setItem(BigDecimalUtils.formObj(dataObject.getString(GrntitemLogDo.COLUMNS.ITEM.name()))); 
			grntitemLogDo.setMoitemno(BigDecimalUtils.formObj(dataObject.getString(GrntitemLogDo.COLUMNS.MOITEMNO.name()))); 
			grntitemLogDo.setProcesstime(dataObject.getString(GrntitemLogDo.COLUMNS.PROCESSTIME.name())); 
			grntitemLogDo.setProcessstate(dataObject.getString(GrntitemLogDo.COLUMNS.PROCESSSTATE.name())); 
			return grntitemLogDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final GrntitemLogDo grntitemLogDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(GrntitemLogDo.COLUMNS.BONDNO.name(), grntitemLogDo.getBondno()); 
			dataObject.setValue(GrntitemLogDo.COLUMNS.REFBILLNO.name(), grntitemLogDo.getRefbillno()); 
			dataObject.setValue(GrntitemLogDo.COLUMNS.DECLNO.name(), grntitemLogDo.getDeclno()); 
			dataObject.setValue(GrntitemLogDo.COLUMNS.ITEMNO.name(), grntitemLogDo.getItemno()); 
			dataObject.setValue(GrntitemLogDo.COLUMNS.STRPOST.name(), grntitemLogDo.getStrpost()); 
			dataObject.setValue(GrntitemLogDo.COLUMNS.DECLTYPE.name(), grntitemLogDo.getDecltype()); 
			dataObject.setValue(GrntitemLogDo.COLUMNS.STRTYPE.name(), grntitemLogDo.getStrtype()); 
			dataObject.setValue(GrntitemLogDo.COLUMNS.STRDATE.name(), grntitemLogDo.getStrdate()); 
			dataObject.setValue(GrntitemLogDo.COLUMNS.STRQTY.name(), grntitemLogDo.getStrqty()); 
			dataObject.setValue(GrntitemLogDo.COLUMNS.VALUEAMT.name(), grntitemLogDo.getValueamt()); 
			dataObject.setValue(GrntitemLogDo.COLUMNS.DUTYRATE.name(), grntitemLogDo.getDutyrate()); 
			dataObject.setValue(GrntitemLogDo.COLUMNS.AVLGRNTAMT.name(), grntitemLogDo.getAvlgrntamt()); 
			dataObject.setValue(GrntitemLogDo.COLUMNS.ODECLNO.name(), grntitemLogDo.getOdeclno()); 
			dataObject.setValue(GrntitemLogDo.COLUMNS.PRDTNO.name(), grntitemLogDo.getPrdtno()); 
			dataObject.setValue(GrntitemLogDo.COLUMNS.SERIALNO.name(), grntitemLogDo.getSerialno()); 
			dataObject.setValue(GrntitemLogDo.COLUMNS.RMKS.name(), grntitemLogDo.getRmks()); 
			dataObject.setValue(GrntitemLogDo.COLUMNS.COMDTAXRATE.name(), grntitemLogDo.getComdtaxrate()); 
			dataObject.setValue(GrntitemLogDo.COLUMNS.VATAXRATE.name(), grntitemLogDo.getVataxrate()); 
			dataObject.setValue(GrntitemLogDo.COLUMNS.DECLQTY.name(), grntitemLogDo.getDeclqty()); 
			dataObject.setValue(GrntitemLogDo.COLUMNS.TAXAMT.name(), grntitemLogDo.getTaxamt()); 
			dataObject.setValue(GrntitemLogDo.COLUMNS.ISEVAL.name(), grntitemLogDo.getIseval()); 
			dataObject.setValue(GrntitemLogDo.COLUMNS.OITEMNO.name(), grntitemLogDo.getOitemno()); 
			dataObject.setValue(GrntitemLogDo.COLUMNS.CCCCODE.name(), grntitemLogDo.getCcccode()); 
			dataObject.setValue(GrntitemLogDo.COLUMNS.ITEM.name(), grntitemLogDo.getItem()); 
			dataObject.setValue(GrntitemLogDo.COLUMNS.MOITEMNO.name(), grntitemLogDo.getMoitemno()); 
			dataObject.setValue(GrntitemLogDo.COLUMNS.PROCESSTIME.name(), grntitemLogDo.getProcesstime()); 
			dataObject.setValue(GrntitemLogDo.COLUMNS.PROCESSSTATE.name(), grntitemLogDo.getProcessstate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<GrntitemLogDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(GrntitemLogDo po) { 
	} 
 
} 