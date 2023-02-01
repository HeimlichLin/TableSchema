package com.doc.common.dao.impl; 
 
public class InimdutyDAOImpl extends GeneralDAOImpl<InimdutyPo> implements InimdutyDAO { 
	public static final InimdutyDAOImpl INSTANCE = new InimdutyDAOImpl(); 
	public static final String TABLENAME = "INIMDUTY"; 

	public InimdutyDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<InimdutyPo> CONVERTER = new MapConverter<InimdutyPo>() { 
 
		@Override 
		public InimdutyPo convert(final DataObject dataObject) { 
			final InimdutyPo inimdutyPo = new InimdutyPo(); 
			inimdutyPo.setDutyno(dataObject.getString(InimdutyPo.COLUMNS.DUTYNO.name())); 
			inimdutyPo.setDutypayername(dataObject.getString(InimdutyPo.COLUMNS.DUTYPAYERNAME.name())); 
			inimdutyPo.setDutypayerban(dataObject.getString(InimdutyPo.COLUMNS.DUTYPAYERBAN.name())); 
			inimdutyPo.setBoxno(dataObject.getString(InimdutyPo.COLUMNS.BOXNO.name())); 
			inimdutyPo.setFlightno(dataObject.getString(InimdutyPo.COLUMNS.FLIGHTNO.name())); 
			inimdutyPo.setMwb(dataObject.getString(InimdutyPo.COLUMNS.MWB.name())); 
			inimdutyPo.setHwb(dataObject.getString(InimdutyPo.COLUMNS.HWB.name())); 
			inimdutyPo.setExaminationnote(dataObject.getString(InimdutyPo.COLUMNS.EXAMINATIONNOTE.name())); 
			inimdutyPo.setCustomsactno(dataObject.getString(InimdutyPo.COLUMNS.CUSTOMSACTNO.name())); 
			inimdutyPo.setImportationdate(dataObject.getString(InimdutyPo.COLUMNS.IMPORTATIONDATE.name())); 
			inimdutyPo.setExportationdate(dataObject.getString(InimdutyPo.COLUMNS.EXPORTATIONDATE.name())); 
			inimdutyPo.setExportdecldate(dataObject.getString(InimdutyPo.COLUMNS.EXPORTDECLDATE.name())); 
			inimdutyPo.setDutydeadline(dataObject.getString(InimdutyPo.COLUMNS.DUTYDEADLINE.name())); 
			inimdutyPo.setDeclno(dataObject.getString(InimdutyPo.COLUMNS.DECLNO.name())); 
			inimdutyPo.setFobvalue(dataObject.getString(InimdutyPo.COLUMNS.FOBVALUE.name())); 
			inimdutyPo.setPaymethord1(dataObject.getString(InimdutyPo.COLUMNS.PAYMETHORD1.name())); 
			inimdutyPo.setPaymethord2(dataObject.getString(InimdutyPo.COLUMNS.PAYMETHORD2.name())); 
			inimdutyPo.setPaymethord3(dataObject.getString(InimdutyPo.COLUMNS.PAYMETHORD3.name())); 
			inimdutyPo.setPaymethord4(dataObject.getString(InimdutyPo.COLUMNS.PAYMETHORD4.name())); 
			inimdutyPo.setPaymethord5(dataObject.getString(InimdutyPo.COLUMNS.PAYMETHORD5.name())); 
			inimdutyPo.setPaymethord6(dataObject.getString(InimdutyPo.COLUMNS.PAYMETHORD6.name())); 
			inimdutyPo.setPaymethord7(dataObject.getString(InimdutyPo.COLUMNS.PAYMETHORD7.name())); 
			inimdutyPo.setPaymethord8(dataObject.getString(InimdutyPo.COLUMNS.PAYMETHORD8.name())); 
			inimdutyPo.setPaymethord9(dataObject.getString(InimdutyPo.COLUMNS.PAYMETHORD9.name())); 
			inimdutyPo.setTax1(dataObject.getString(InimdutyPo.COLUMNS.TAX1.name())); 
			inimdutyPo.setTax2(dataObject.getString(InimdutyPo.COLUMNS.TAX2.name())); 
			inimdutyPo.setTax3(dataObject.getString(InimdutyPo.COLUMNS.TAX3.name())); 
			inimdutyPo.setTax4(dataObject.getString(InimdutyPo.COLUMNS.TAX4.name())); 
			inimdutyPo.setTax5(dataObject.getString(InimdutyPo.COLUMNS.TAX5.name())); 
			inimdutyPo.setTax6(dataObject.getString(InimdutyPo.COLUMNS.TAX6.name())); 
			inimdutyPo.setTax7(dataObject.getString(InimdutyPo.COLUMNS.TAX7.name())); 
			inimdutyPo.setTax8(dataObject.getString(InimdutyPo.COLUMNS.TAX8.name())); 
			inimdutyPo.setTax9(dataObject.getString(InimdutyPo.COLUMNS.TAX9.name())); 
			inimdutyPo.setTaxtotal(dataObject.getString(InimdutyPo.COLUMNS.TAXTOTAL.name())); 
			inimdutyPo.setTaxbasis(dataObject.getString(InimdutyPo.COLUMNS.TAXBASIS.name())); 
			inimdutyPo.setCcccode(dataObject.getString(InimdutyPo.COLUMNS.CCCCODE.name())); 
			inimdutyPo.setPiece(dataObject.getString(InimdutyPo.COLUMNS.PIECE.name())); 
			inimdutyPo.setUnit(dataObject.getString(InimdutyPo.COLUMNS.UNIT.name())); 
			inimdutyPo.setIssuereason(dataObject.getString(InimdutyPo.COLUMNS.ISSUEREASON.name())); 
			inimdutyPo.setDeposit(dataObject.getString(InimdutyPo.COLUMNS.DEPOSIT.name())); 
			inimdutyPo.setCaseno(dataObject.getString(InimdutyPo.COLUMNS.CASENO.name())); 
			inimdutyPo.setDepositbank(dataObject.getString(InimdutyPo.COLUMNS.DEPOSITBANK.name())); 
			inimdutyPo.setCharcode(dataObject.getString(InimdutyPo.COLUMNS.CHARCODE.name())); 
			inimdutyPo.setMessagetype(dataObject.getString(InimdutyPo.COLUMNS.MESSAGETYPE.name())); 
			inimdutyPo.setIetype(dataObject.getString(InimdutyPo.COLUMNS.IETYPE.name())); 
			return inimdutyPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final InimdutyPo inimdutyPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(InimdutyPo.COLUMNS.DUTYNO.name(), inimdutyPo.getDutyno()); 
			dataObject.setValue(InimdutyPo.COLUMNS.DUTYPAYERNAME.name(), inimdutyPo.getDutypayername()); 
			dataObject.setValue(InimdutyPo.COLUMNS.DUTYPAYERBAN.name(), inimdutyPo.getDutypayerban()); 
			dataObject.setValue(InimdutyPo.COLUMNS.BOXNO.name(), inimdutyPo.getBoxno()); 
			dataObject.setValue(InimdutyPo.COLUMNS.FLIGHTNO.name(), inimdutyPo.getFlightno()); 
			dataObject.setValue(InimdutyPo.COLUMNS.MWB.name(), inimdutyPo.getMwb()); 
			dataObject.setValue(InimdutyPo.COLUMNS.HWB.name(), inimdutyPo.getHwb()); 
			dataObject.setValue(InimdutyPo.COLUMNS.EXAMINATIONNOTE.name(), inimdutyPo.getExaminationnote()); 
			dataObject.setValue(InimdutyPo.COLUMNS.CUSTOMSACTNO.name(), inimdutyPo.getCustomsactno()); 
			dataObject.setValue(InimdutyPo.COLUMNS.IMPORTATIONDATE.name(), inimdutyPo.getImportationdate()); 
			dataObject.setValue(InimdutyPo.COLUMNS.EXPORTATIONDATE.name(), inimdutyPo.getExportationdate()); 
			dataObject.setValue(InimdutyPo.COLUMNS.EXPORTDECLDATE.name(), inimdutyPo.getExportdecldate()); 
			dataObject.setValue(InimdutyPo.COLUMNS.DUTYDEADLINE.name(), inimdutyPo.getDutydeadline()); 
			dataObject.setValue(InimdutyPo.COLUMNS.DECLNO.name(), inimdutyPo.getDeclno()); 
			dataObject.setValue(InimdutyPo.COLUMNS.FOBVALUE.name(), inimdutyPo.getFobvalue()); 
			dataObject.setValue(InimdutyPo.COLUMNS.PAYMETHORD1.name(), inimdutyPo.getPaymethord1()); 
			dataObject.setValue(InimdutyPo.COLUMNS.PAYMETHORD2.name(), inimdutyPo.getPaymethord2()); 
			dataObject.setValue(InimdutyPo.COLUMNS.PAYMETHORD3.name(), inimdutyPo.getPaymethord3()); 
			dataObject.setValue(InimdutyPo.COLUMNS.PAYMETHORD4.name(), inimdutyPo.getPaymethord4()); 
			dataObject.setValue(InimdutyPo.COLUMNS.PAYMETHORD5.name(), inimdutyPo.getPaymethord5()); 
			dataObject.setValue(InimdutyPo.COLUMNS.PAYMETHORD6.name(), inimdutyPo.getPaymethord6()); 
			dataObject.setValue(InimdutyPo.COLUMNS.PAYMETHORD7.name(), inimdutyPo.getPaymethord7()); 
			dataObject.setValue(InimdutyPo.COLUMNS.PAYMETHORD8.name(), inimdutyPo.getPaymethord8()); 
			dataObject.setValue(InimdutyPo.COLUMNS.PAYMETHORD9.name(), inimdutyPo.getPaymethord9()); 
			dataObject.setValue(InimdutyPo.COLUMNS.TAX1.name(), inimdutyPo.getTax1()); 
			dataObject.setValue(InimdutyPo.COLUMNS.TAX2.name(), inimdutyPo.getTax2()); 
			dataObject.setValue(InimdutyPo.COLUMNS.TAX3.name(), inimdutyPo.getTax3()); 
			dataObject.setValue(InimdutyPo.COLUMNS.TAX4.name(), inimdutyPo.getTax4()); 
			dataObject.setValue(InimdutyPo.COLUMNS.TAX5.name(), inimdutyPo.getTax5()); 
			dataObject.setValue(InimdutyPo.COLUMNS.TAX6.name(), inimdutyPo.getTax6()); 
			dataObject.setValue(InimdutyPo.COLUMNS.TAX7.name(), inimdutyPo.getTax7()); 
			dataObject.setValue(InimdutyPo.COLUMNS.TAX8.name(), inimdutyPo.getTax8()); 
			dataObject.setValue(InimdutyPo.COLUMNS.TAX9.name(), inimdutyPo.getTax9()); 
			dataObject.setValue(InimdutyPo.COLUMNS.TAXTOTAL.name(), inimdutyPo.getTaxtotal()); 
			dataObject.setValue(InimdutyPo.COLUMNS.TAXBASIS.name(), inimdutyPo.getTaxbasis()); 
			dataObject.setValue(InimdutyPo.COLUMNS.CCCCODE.name(), inimdutyPo.getCcccode()); 
			dataObject.setValue(InimdutyPo.COLUMNS.PIECE.name(), inimdutyPo.getPiece()); 
			dataObject.setValue(InimdutyPo.COLUMNS.UNIT.name(), inimdutyPo.getUnit()); 
			dataObject.setValue(InimdutyPo.COLUMNS.ISSUEREASON.name(), inimdutyPo.getIssuereason()); 
			dataObject.setValue(InimdutyPo.COLUMNS.DEPOSIT.name(), inimdutyPo.getDeposit()); 
			dataObject.setValue(InimdutyPo.COLUMNS.CASENO.name(), inimdutyPo.getCaseno()); 
			dataObject.setValue(InimdutyPo.COLUMNS.DEPOSITBANK.name(), inimdutyPo.getDepositbank()); 
			dataObject.setValue(InimdutyPo.COLUMNS.CHARCODE.name(), inimdutyPo.getCharcode()); 
			dataObject.setValue(InimdutyPo.COLUMNS.MESSAGETYPE.name(), inimdutyPo.getMessagetype()); 
			dataObject.setValue(InimdutyPo.COLUMNS.IETYPE.name(), inimdutyPo.getIetype()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<InimdutyPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(InimdutyPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
