package com.doc.common.dao.impl; 
 
public class IdpDAOImpl extends GeneralDAOImpl<IdpPo> implements IdpDAO { 
	public static final IdpDAOImpl INSTANCE = new IdpDAOImpl(); 
	public static final String TABLENAME = "IDP"; 

	public IdpDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<IdpPo> CONVERTER = new MapConverter<IdpPo>() { 
 
		@Override 
		public IdpPo convert(final DataObject dataObject) { 
			final IdpPo idpPo = new IdpPo(); 
			idpPo.setDutyno(dataObject.getString(IdpPo.COLUMNS.DUTYNO.name())); 
			idpPo.setMwb(dataObject.getString(IdpPo.COLUMNS.MWB.name())); 
			idpPo.setHwb(dataObject.getString(IdpPo.COLUMNS.HWB.name())); 
			idpPo.setPaymethord1(dataObject.getString(IdpPo.COLUMNS.PAYMETHORD_1.name())); 
			idpPo.setPaymethord2(dataObject.getString(IdpPo.COLUMNS.PAYMETHORD_2.name())); 
			idpPo.setPaymethord3(dataObject.getString(IdpPo.COLUMNS.PAYMETHORD_3.name())); 
			idpPo.setPaymethord4(dataObject.getString(IdpPo.COLUMNS.PAYMETHORD_4.name())); 
			idpPo.setPaymethord5(dataObject.getString(IdpPo.COLUMNS.PAYMETHORD_5.name())); 
			idpPo.setPaymethord6(dataObject.getString(IdpPo.COLUMNS.PAYMETHORD_6.name())); 
			idpPo.setPaymethord7(dataObject.getString(IdpPo.COLUMNS.PAYMETHORD_7.name())); 
			idpPo.setPaymethord8(dataObject.getString(IdpPo.COLUMNS.PAYMETHORD_8.name())); 
			idpPo.setPaymethord9(dataObject.getString(IdpPo.COLUMNS.PAYMETHORD_9.name())); 
			idpPo.setDuty1(BigDecimalUtils.formObj(dataObject.getValue(IdpPo.COLUMNS.DUTY_1.name()))); 
			idpPo.setDuty2(BigDecimalUtils.formObj(dataObject.getValue(IdpPo.COLUMNS.DUTY_2.name()))); 
			idpPo.setDuty3(BigDecimalUtils.formObj(dataObject.getValue(IdpPo.COLUMNS.DUTY_3.name()))); 
			idpPo.setDuty4(BigDecimalUtils.formObj(dataObject.getValue(IdpPo.COLUMNS.DUTY_4.name()))); 
			idpPo.setDuty5(BigDecimalUtils.formObj(dataObject.getValue(IdpPo.COLUMNS.DUTY_5.name()))); 
			idpPo.setDuty6(BigDecimalUtils.formObj(dataObject.getValue(IdpPo.COLUMNS.DUTY_6.name()))); 
			idpPo.setDuty7(BigDecimalUtils.formObj(dataObject.getValue(IdpPo.COLUMNS.DUTY_7.name()))); 
			idpPo.setDuty8(BigDecimalUtils.formObj(dataObject.getValue(IdpPo.COLUMNS.DUTY_8.name()))); 
			idpPo.setDuty9(BigDecimalUtils.formObj(dataObject.getValue(IdpPo.COLUMNS.DUTY_9.name()))); 
			idpPo.setDutypayment(BigDecimalUtils.formObj(dataObject.getValue(IdpPo.COLUMNS.DUTYPAYMENT.name()))); 
			idpPo.setWdate(TimestampUtils.of(dataObject.getValue(IdpPo.COLUMNS.WDATE.name()))); 
			idpPo.setExpressid(dataObject.getString(IdpPo.COLUMNS.EXPRESSID.name())); 
			return idpPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final IdpPo idpPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(IdpPo.COLUMNS.DUTYNO.name(), idpPo.getDutyno()); 
			dataObject.setValue(IdpPo.COLUMNS.MWB.name(), idpPo.getMwb()); 
			dataObject.setValue(IdpPo.COLUMNS.HWB.name(), idpPo.getHwb()); 
			dataObject.setValue(IdpPo.COLUMNS.PAYMETHORD_1.name(), idpPo.getPaymethord1()); 
			dataObject.setValue(IdpPo.COLUMNS.PAYMETHORD_2.name(), idpPo.getPaymethord2()); 
			dataObject.setValue(IdpPo.COLUMNS.PAYMETHORD_3.name(), idpPo.getPaymethord3()); 
			dataObject.setValue(IdpPo.COLUMNS.PAYMETHORD_4.name(), idpPo.getPaymethord4()); 
			dataObject.setValue(IdpPo.COLUMNS.PAYMETHORD_5.name(), idpPo.getPaymethord5()); 
			dataObject.setValue(IdpPo.COLUMNS.PAYMETHORD_6.name(), idpPo.getPaymethord6()); 
			dataObject.setValue(IdpPo.COLUMNS.PAYMETHORD_7.name(), idpPo.getPaymethord7()); 
			dataObject.setValue(IdpPo.COLUMNS.PAYMETHORD_8.name(), idpPo.getPaymethord8()); 
			dataObject.setValue(IdpPo.COLUMNS.PAYMETHORD_9.name(), idpPo.getPaymethord9()); 
			dataObject.setValue(IdpPo.COLUMNS.DUTY_1.name(), idpPo.getDuty1()); 
			dataObject.setValue(IdpPo.COLUMNS.DUTY_2.name(), idpPo.getDuty2()); 
			dataObject.setValue(IdpPo.COLUMNS.DUTY_3.name(), idpPo.getDuty3()); 
			dataObject.setValue(IdpPo.COLUMNS.DUTY_4.name(), idpPo.getDuty4()); 
			dataObject.setValue(IdpPo.COLUMNS.DUTY_5.name(), idpPo.getDuty5()); 
			dataObject.setValue(IdpPo.COLUMNS.DUTY_6.name(), idpPo.getDuty6()); 
			dataObject.setValue(IdpPo.COLUMNS.DUTY_7.name(), idpPo.getDuty7()); 
			dataObject.setValue(IdpPo.COLUMNS.DUTY_8.name(), idpPo.getDuty8()); 
			dataObject.setValue(IdpPo.COLUMNS.DUTY_9.name(), idpPo.getDuty9()); 
			dataObject.setValue(IdpPo.COLUMNS.DUTYPAYMENT.name(), idpPo.getDutypayment()); 
			dataObject.setValue(IdpPo.COLUMNS.WDATE.name(), idpPo.getWdate()); 
			dataObject.setValue(IdpPo.COLUMNS.EXPRESSID.name(), idpPo.getExpressid()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<IdpPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(IdpPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
