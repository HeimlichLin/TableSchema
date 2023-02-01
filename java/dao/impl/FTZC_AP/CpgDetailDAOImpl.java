package com.doc.common.dao.impl; 
 
public class CpgDetailDAOImpl extends GeneralDAOImpl<CpgDetailPo> implements CpgDetailDAO { 
	public static final CpgDetailDAOImpl INSTANCE = new CpgDetailDAOImpl(); 
	public static final String TABLENAME = "CPG_DETAIL"; 

	public CpgDetailDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<CpgDetailPo> CONVERTER = new MapConverter<CpgDetailPo>() { 
 
		@Override 
		public CpgDetailPo convert(final DataObject dataObject) { 
			final CpgDetailPo cpgDetailPo = new CpgDetailPo(); 
			cpgDetailPo.setBagsfieldname(dataObject.getString(CpgDetailPo.COLUMNS.BAGSFIELDNAME.name())); 
			cpgDetailPo.setBagsfieldvalue(dataObject.getString(CpgDetailPo.COLUMNS.BAGSFIELDVALUE.name())); 
			cpgDetailPo.setBagno(dataObject.getString(CpgDetailPo.COLUMNS.BAGNO.name())); 
			cpgDetailPo.setBagslastmark(dataObject.getString(CpgDetailPo.COLUMNS.BAGSLASTMARK.name())); 
			cpgDetailPo.setBagspageno(dataObject.getString(CpgDetailPo.COLUMNS.BAGSPAGENO.name())); 
			cpgDetailPo.setBagsqty(BigDecimalUtils.formObj(dataObject.getValue(CpgDetailPo.COLUMNS.BAGSQTY.name()))); 
			cpgDetailPo.setBagsweight(BigDecimalUtils.formObj(dataObject.getValue(CpgDetailPo.COLUMNS.BAGSWEIGHT.name()))); 
			cpgDetailPo.setBagsotherfields(dataObject.getString(CpgDetailPo.COLUMNS.BAGSOTHERFIELDS.name())); 
			cpgDetailPo.setItemsfieldname(dataObject.getString(CpgDetailPo.COLUMNS.ITEMSFIELDNAME.name())); 
			cpgDetailPo.setItemsfieldvalue(dataObject.getString(CpgDetailPo.COLUMNS.ITEMSFIELDVALUE.name())); 
			cpgDetailPo.setItemspageno(dataObject.getString(CpgDetailPo.COLUMNS.ITEMSPAGENO.name())); 
			cpgDetailPo.setItemscellno(dataObject.getString(CpgDetailPo.COLUMNS.ITEMSCELLNO.name())); 
			cpgDetailPo.setItemspostno(dataObject.getString(CpgDetailPo.COLUMNS.ITEMSPOSTNO.name())); 
			cpgDetailPo.setItemsqty(dataObject.getString(CpgDetailPo.COLUMNS.ITEMSQTY.name())); 
			cpgDetailPo.setItemsqtyunit(dataObject.getString(CpgDetailPo.COLUMNS.ITEMSQTYUNIT.name())); 
			cpgDetailPo.setItemsweight(BigDecimalUtils.formObj(dataObject.getValue(CpgDetailPo.COLUMNS.ITEMSWEIGHT.name()))); 
			cpgDetailPo.setDeclarevalueamt(dataObject.getString(CpgDetailPo.COLUMNS.DECLAREVALUEAMT.name())); 
			cpgDetailPo.setOrigincountry(dataObject.getString(CpgDetailPo.COLUMNS.ORIGINCOUNTRY.name())); 
			cpgDetailPo.setProvincetype(dataObject.getString(CpgDetailPo.COLUMNS.PROVINCETYPE.name())); 
			cpgDetailPo.setBoxtype(dataObject.getString(CpgDetailPo.COLUMNS.BOXTYPE.name())); 
			cpgDetailPo.setDeliverdatetime(dataObject.getString(CpgDetailPo.COLUMNS.DELIVERDATETIME.name())); 
			cpgDetailPo.setSendername(dataObject.getString(CpgDetailPo.COLUMNS.SENDERNAME.name())); 
			cpgDetailPo.setSenderaddress(dataObject.getString(CpgDetailPo.COLUMNS.SENDERADDRESS.name())); 
			cpgDetailPo.setReceivername(dataObject.getString(CpgDetailPo.COLUMNS.RECEIVERNAME.name())); 
			cpgDetailPo.setReceiveraddress(dataObject.getString(CpgDetailPo.COLUMNS.RECEIVERADDRESS.name())); 
			cpgDetailPo.setGoodsdescription(dataObject.getString(CpgDetailPo.COLUMNS.GOODSDESCRIPTION.name())); 
			cpgDetailPo.setOtherfields(dataObject.getString(CpgDetailPo.COLUMNS.OTHERFIELDS.name())); 
			cpgDetailPo.setFilename(dataObject.getString(CpgDetailPo.COLUMNS.FILENAME.name())); 
			return cpgDetailPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final CpgDetailPo cpgDetailPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(CpgDetailPo.COLUMNS.BAGSFIELDNAME.name(), cpgDetailPo.getBagsfieldname()); 
			dataObject.setValue(CpgDetailPo.COLUMNS.BAGSFIELDVALUE.name(), cpgDetailPo.getBagsfieldvalue()); 
			dataObject.setValue(CpgDetailPo.COLUMNS.BAGNO.name(), cpgDetailPo.getBagno()); 
			dataObject.setValue(CpgDetailPo.COLUMNS.BAGSLASTMARK.name(), cpgDetailPo.getBagslastmark()); 
			dataObject.setValue(CpgDetailPo.COLUMNS.BAGSPAGENO.name(), cpgDetailPo.getBagspageno()); 
			dataObject.setValue(CpgDetailPo.COLUMNS.BAGSQTY.name(), cpgDetailPo.getBagsqty()); 
			dataObject.setValue(CpgDetailPo.COLUMNS.BAGSWEIGHT.name(), cpgDetailPo.getBagsweight()); 
			dataObject.setValue(CpgDetailPo.COLUMNS.BAGSOTHERFIELDS.name(), cpgDetailPo.getBagsotherfields()); 
			dataObject.setValue(CpgDetailPo.COLUMNS.ITEMSFIELDNAME.name(), cpgDetailPo.getItemsfieldname()); 
			dataObject.setValue(CpgDetailPo.COLUMNS.ITEMSFIELDVALUE.name(), cpgDetailPo.getItemsfieldvalue()); 
			dataObject.setValue(CpgDetailPo.COLUMNS.ITEMSPAGENO.name(), cpgDetailPo.getItemspageno()); 
			dataObject.setValue(CpgDetailPo.COLUMNS.ITEMSCELLNO.name(), cpgDetailPo.getItemscellno()); 
			dataObject.setValue(CpgDetailPo.COLUMNS.ITEMSPOSTNO.name(), cpgDetailPo.getItemspostno()); 
			dataObject.setValue(CpgDetailPo.COLUMNS.ITEMSQTY.name(), cpgDetailPo.getItemsqty()); 
			dataObject.setValue(CpgDetailPo.COLUMNS.ITEMSQTYUNIT.name(), cpgDetailPo.getItemsqtyunit()); 
			dataObject.setValue(CpgDetailPo.COLUMNS.ITEMSWEIGHT.name(), cpgDetailPo.getItemsweight()); 
			dataObject.setValue(CpgDetailPo.COLUMNS.DECLAREVALUEAMT.name(), cpgDetailPo.getDeclarevalueamt()); 
			dataObject.setValue(CpgDetailPo.COLUMNS.ORIGINCOUNTRY.name(), cpgDetailPo.getOrigincountry()); 
			dataObject.setValue(CpgDetailPo.COLUMNS.PROVINCETYPE.name(), cpgDetailPo.getProvincetype()); 
			dataObject.setValue(CpgDetailPo.COLUMNS.BOXTYPE.name(), cpgDetailPo.getBoxtype()); 
			dataObject.setValue(CpgDetailPo.COLUMNS.DELIVERDATETIME.name(), cpgDetailPo.getDeliverdatetime()); 
			dataObject.setValue(CpgDetailPo.COLUMNS.SENDERNAME.name(), cpgDetailPo.getSendername()); 
			dataObject.setValue(CpgDetailPo.COLUMNS.SENDERADDRESS.name(), cpgDetailPo.getSenderaddress()); 
			dataObject.setValue(CpgDetailPo.COLUMNS.RECEIVERNAME.name(), cpgDetailPo.getReceivername()); 
			dataObject.setValue(CpgDetailPo.COLUMNS.RECEIVERADDRESS.name(), cpgDetailPo.getReceiveraddress()); 
			dataObject.setValue(CpgDetailPo.COLUMNS.GOODSDESCRIPTION.name(), cpgDetailPo.getGoodsdescription()); 
			dataObject.setValue(CpgDetailPo.COLUMNS.OTHERFIELDS.name(), cpgDetailPo.getOtherfields()); 
			dataObject.setValue(CpgDetailPo.COLUMNS.FILENAME.name(), cpgDetailPo.getFilename()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<CpgDetailPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(CpgDetailPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
