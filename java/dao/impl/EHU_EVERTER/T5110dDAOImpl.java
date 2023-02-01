package com.doc.common.dao.impl; 
 
public class T5110dDAOImpl extends GeneralDAOImpl<T5110dPo> implements T5110dDAO { 
	public static final T5110dDAOImpl INSTANCE = new T5110dDAOImpl(); 
	public static final String TABLENAME = "T5110D"; 

	public T5110dDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<T5110dPo> CONVERTER = new MapConverter<T5110dPo>() { 
 
		@Override 
		public T5110dPo convert(final DataObject dataObject) { 
			final T5110dPo t5110dPo = new T5110dPo(); 
			t5110dPo.setDutyno(dataObject.getString(T5110dPo.COLUMNS.DUTYNO.name())); 
			t5110dPo.setMwb(dataObject.getString(T5110dPo.COLUMNS.MWB.name())); 
			t5110dPo.setHwb(dataObject.getString(T5110dPo.COLUMNS.HWB.name())); 
			t5110dPo.setPaymethord(dataObject.getString(T5110dPo.COLUMNS.PAYMETHORD.name())); 
			t5110dPo.setDuty(BigDecimalUtils.formObj(dataObject.getValue(T5110dPo.COLUMNS.DUTY.name()))); 
			t5110dPo.setLastupdate(TimestampUtils.of(dataObject.getValue(T5110dPo.COLUMNS.LASTUPDATE.name()))); 
			t5110dPo.setPaymethod2(dataObject.getString(T5110dPo.COLUMNS.PAYMETHOD2.name())); 
			t5110dPo.setPaymethod3(dataObject.getString(T5110dPo.COLUMNS.PAYMETHOD3.name())); 
			t5110dPo.setPaymethod4(dataObject.getString(T5110dPo.COLUMNS.PAYMETHOD4.name())); 
			t5110dPo.setPaymethod5(dataObject.getString(T5110dPo.COLUMNS.PAYMETHOD5.name())); 
			t5110dPo.setPaymethod6(dataObject.getString(T5110dPo.COLUMNS.PAYMETHOD6.name())); 
			t5110dPo.setPaymethod7(dataObject.getString(T5110dPo.COLUMNS.PAYMETHOD7.name())); 
			t5110dPo.setPaymethod8(dataObject.getString(T5110dPo.COLUMNS.PAYMETHOD8.name())); 
			t5110dPo.setPaymethod9(dataObject.getString(T5110dPo.COLUMNS.PAYMETHOD9.name())); 
			t5110dPo.setDuty2(dataObject.getString(T5110dPo.COLUMNS.DUTY2.name())); 
			t5110dPo.setDuty3(dataObject.getString(T5110dPo.COLUMNS.DUTY3.name())); 
			t5110dPo.setDuty4(dataObject.getString(T5110dPo.COLUMNS.DUTY4.name())); 
			t5110dPo.setDuty5(dataObject.getString(T5110dPo.COLUMNS.DUTY5.name())); 
			t5110dPo.setDuty6(dataObject.getString(T5110dPo.COLUMNS.DUTY6.name())); 
			t5110dPo.setDuty7(dataObject.getString(T5110dPo.COLUMNS.DUTY7.name())); 
			t5110dPo.setDuty8(dataObject.getString(T5110dPo.COLUMNS.DUTY8.name())); 
			t5110dPo.setDuty9(dataObject.getString(T5110dPo.COLUMNS.DUTY9.name())); 
			return t5110dPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final T5110dPo t5110dPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(T5110dPo.COLUMNS.DUTYNO.name(), t5110dPo.getDutyno()); 
			dataObject.setValue(T5110dPo.COLUMNS.MWB.name(), t5110dPo.getMwb()); 
			dataObject.setValue(T5110dPo.COLUMNS.HWB.name(), t5110dPo.getHwb()); 
			dataObject.setValue(T5110dPo.COLUMNS.PAYMETHORD.name(), t5110dPo.getPaymethord()); 
			dataObject.setValue(T5110dPo.COLUMNS.DUTY.name(), t5110dPo.getDuty()); 
			dataObject.setValue(T5110dPo.COLUMNS.LASTUPDATE.name(), t5110dPo.getLastupdate()); 
			dataObject.setValue(T5110dPo.COLUMNS.PAYMETHOD2.name(), t5110dPo.getPaymethod2()); 
			dataObject.setValue(T5110dPo.COLUMNS.PAYMETHOD3.name(), t5110dPo.getPaymethod3()); 
			dataObject.setValue(T5110dPo.COLUMNS.PAYMETHOD4.name(), t5110dPo.getPaymethod4()); 
			dataObject.setValue(T5110dPo.COLUMNS.PAYMETHOD5.name(), t5110dPo.getPaymethod5()); 
			dataObject.setValue(T5110dPo.COLUMNS.PAYMETHOD6.name(), t5110dPo.getPaymethod6()); 
			dataObject.setValue(T5110dPo.COLUMNS.PAYMETHOD7.name(), t5110dPo.getPaymethod7()); 
			dataObject.setValue(T5110dPo.COLUMNS.PAYMETHOD8.name(), t5110dPo.getPaymethod8()); 
			dataObject.setValue(T5110dPo.COLUMNS.PAYMETHOD9.name(), t5110dPo.getPaymethod9()); 
			dataObject.setValue(T5110dPo.COLUMNS.DUTY2.name(), t5110dPo.getDuty2()); 
			dataObject.setValue(T5110dPo.COLUMNS.DUTY3.name(), t5110dPo.getDuty3()); 
			dataObject.setValue(T5110dPo.COLUMNS.DUTY4.name(), t5110dPo.getDuty4()); 
			dataObject.setValue(T5110dPo.COLUMNS.DUTY5.name(), t5110dPo.getDuty5()); 
			dataObject.setValue(T5110dPo.COLUMNS.DUTY6.name(), t5110dPo.getDuty6()); 
			dataObject.setValue(T5110dPo.COLUMNS.DUTY7.name(), t5110dPo.getDuty7()); 
			dataObject.setValue(T5110dPo.COLUMNS.DUTY8.name(), t5110dPo.getDuty8()); 
			dataObject.setValue(T5110dPo.COLUMNS.DUTY9.name(), t5110dPo.getDuty9()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<T5110dPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(T5110dPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
