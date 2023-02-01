package com.doc.common.dao.impl; 
 
public class GrntitemLogDAOImpl extends GeneralDAOImpl<GrntitemLogPo> implements GrntitemLogDAO { 
	public static final GrntitemLogDAOImpl INSTANCE = new GrntitemLogDAOImpl(); 
	public static final String TABLENAME = "GRNTITEM_LOG"; 

	public GrntitemLogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<GrntitemLogPo> CONVERTER = new MapConverter<GrntitemLogPo>() { 
 
		@Override 
		public GrntitemLogPo convert(final DataObject dataObject) { 
			final GrntitemLogPo grntitemLogPo = new GrntitemLogPo(); 
			grntitemLogPo.setBondno(dataObject.getString(GrntitemLogPo.COLUMNS.BONDNO.name())); 
			grntitemLogPo.setRefbillno(dataObject.getString(GrntitemLogPo.COLUMNS.REFBILLNO.name())); 
			grntitemLogPo.setDeclno(dataObject.getString(GrntitemLogPo.COLUMNS.DECLNO.name())); 
			grntitemLogPo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(GrntitemLogPo.COLUMNS.ITEMNO.name()))); 
			grntitemLogPo.setStrpost(dataObject.getString(GrntitemLogPo.COLUMNS.STRPOST.name())); 
			grntitemLogPo.setDecltype(dataObject.getString(GrntitemLogPo.COLUMNS.DECLTYPE.name())); 
			grntitemLogPo.setStrtype(dataObject.getString(GrntitemLogPo.COLUMNS.STRTYPE.name())); 
			grntitemLogPo.setStrdate(dataObject.getString(GrntitemLogPo.COLUMNS.STRDATE.name())); 
			grntitemLogPo.setStrqty(BigDecimalUtils.formObj(dataObject.getValue(GrntitemLogPo.COLUMNS.STRQTY.name()))); 
			grntitemLogPo.setValueamt(BigDecimalUtils.formObj(dataObject.getValue(GrntitemLogPo.COLUMNS.VALUEAMT.name()))); 
			grntitemLogPo.setDutyrate(BigDecimalUtils.formObj(dataObject.getValue(GrntitemLogPo.COLUMNS.DUTYRATE.name()))); 
			grntitemLogPo.setAvlgrntamt(BigDecimalUtils.formObj(dataObject.getValue(GrntitemLogPo.COLUMNS.AVLGRNTAMT.name()))); 
			grntitemLogPo.setOdeclno(dataObject.getString(GrntitemLogPo.COLUMNS.ODECLNO.name())); 
			grntitemLogPo.setPrdtno(dataObject.getString(GrntitemLogPo.COLUMNS.PRDTNO.name())); 
			grntitemLogPo.setSerialno(dataObject.getString(GrntitemLogPo.COLUMNS.SERIALNO.name())); 
			grntitemLogPo.setRmks(dataObject.getString(GrntitemLogPo.COLUMNS.RMKS.name())); 
			grntitemLogPo.setComdtaxrate(BigDecimalUtils.formObj(dataObject.getValue(GrntitemLogPo.COLUMNS.COMDTAXRATE.name()))); 
			grntitemLogPo.setVataxrate(BigDecimalUtils.formObj(dataObject.getValue(GrntitemLogPo.COLUMNS.VATAXRATE.name()))); 
			grntitemLogPo.setDeclqty(BigDecimalUtils.formObj(dataObject.getValue(GrntitemLogPo.COLUMNS.DECLQTY.name()))); 
			grntitemLogPo.setTaxamt(BigDecimalUtils.formObj(dataObject.getValue(GrntitemLogPo.COLUMNS.TAXAMT.name()))); 
			grntitemLogPo.setIseval(dataObject.getString(GrntitemLogPo.COLUMNS.ISEVAL.name())); 
			grntitemLogPo.setOitemno(BigDecimalUtils.formObj(dataObject.getValue(GrntitemLogPo.COLUMNS.OITEMNO.name()))); 
			grntitemLogPo.setCcccode(dataObject.getString(GrntitemLogPo.COLUMNS.CCCCODE.name())); 
			grntitemLogPo.setItem(BigDecimalUtils.formObj(dataObject.getValue(GrntitemLogPo.COLUMNS.ITEM.name()))); 
			grntitemLogPo.setMoitemno(BigDecimalUtils.formObj(dataObject.getValue(GrntitemLogPo.COLUMNS.MOITEMNO.name()))); 
			grntitemLogPo.setProcesstime(dataObject.getString(GrntitemLogPo.COLUMNS.PROCESSTIME.name())); 
			grntitemLogPo.setProcessstate(dataObject.getString(GrntitemLogPo.COLUMNS.PROCESSSTATE.name())); 
			return grntitemLogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final GrntitemLogPo grntitemLogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(GrntitemLogPo.COLUMNS.BONDNO.name(), grntitemLogPo.getBondno()); 
			dataObject.setValue(GrntitemLogPo.COLUMNS.REFBILLNO.name(), grntitemLogPo.getRefbillno()); 
			dataObject.setValue(GrntitemLogPo.COLUMNS.DECLNO.name(), grntitemLogPo.getDeclno()); 
			dataObject.setValue(GrntitemLogPo.COLUMNS.ITEMNO.name(), grntitemLogPo.getItemno()); 
			dataObject.setValue(GrntitemLogPo.COLUMNS.STRPOST.name(), grntitemLogPo.getStrpost()); 
			dataObject.setValue(GrntitemLogPo.COLUMNS.DECLTYPE.name(), grntitemLogPo.getDecltype()); 
			dataObject.setValue(GrntitemLogPo.COLUMNS.STRTYPE.name(), grntitemLogPo.getStrtype()); 
			dataObject.setValue(GrntitemLogPo.COLUMNS.STRDATE.name(), grntitemLogPo.getStrdate()); 
			dataObject.setValue(GrntitemLogPo.COLUMNS.STRQTY.name(), grntitemLogPo.getStrqty()); 
			dataObject.setValue(GrntitemLogPo.COLUMNS.VALUEAMT.name(), grntitemLogPo.getValueamt()); 
			dataObject.setValue(GrntitemLogPo.COLUMNS.DUTYRATE.name(), grntitemLogPo.getDutyrate()); 
			dataObject.setValue(GrntitemLogPo.COLUMNS.AVLGRNTAMT.name(), grntitemLogPo.getAvlgrntamt()); 
			dataObject.setValue(GrntitemLogPo.COLUMNS.ODECLNO.name(), grntitemLogPo.getOdeclno()); 
			dataObject.setValue(GrntitemLogPo.COLUMNS.PRDTNO.name(), grntitemLogPo.getPrdtno()); 
			dataObject.setValue(GrntitemLogPo.COLUMNS.SERIALNO.name(), grntitemLogPo.getSerialno()); 
			dataObject.setValue(GrntitemLogPo.COLUMNS.RMKS.name(), grntitemLogPo.getRmks()); 
			dataObject.setValue(GrntitemLogPo.COLUMNS.COMDTAXRATE.name(), grntitemLogPo.getComdtaxrate()); 
			dataObject.setValue(GrntitemLogPo.COLUMNS.VATAXRATE.name(), grntitemLogPo.getVataxrate()); 
			dataObject.setValue(GrntitemLogPo.COLUMNS.DECLQTY.name(), grntitemLogPo.getDeclqty()); 
			dataObject.setValue(GrntitemLogPo.COLUMNS.TAXAMT.name(), grntitemLogPo.getTaxamt()); 
			dataObject.setValue(GrntitemLogPo.COLUMNS.ISEVAL.name(), grntitemLogPo.getIseval()); 
			dataObject.setValue(GrntitemLogPo.COLUMNS.OITEMNO.name(), grntitemLogPo.getOitemno()); 
			dataObject.setValue(GrntitemLogPo.COLUMNS.CCCCODE.name(), grntitemLogPo.getCcccode()); 
			dataObject.setValue(GrntitemLogPo.COLUMNS.ITEM.name(), grntitemLogPo.getItem()); 
			dataObject.setValue(GrntitemLogPo.COLUMNS.MOITEMNO.name(), grntitemLogPo.getMoitemno()); 
			dataObject.setValue(GrntitemLogPo.COLUMNS.PROCESSTIME.name(), grntitemLogPo.getProcesstime()); 
			dataObject.setValue(GrntitemLogPo.COLUMNS.PROCESSSTATE.name(), grntitemLogPo.getProcessstate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<GrntitemLogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(GrntitemLogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
