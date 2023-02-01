package com.doc.common.dao.impl; 
 
public class T5110dbackupDAOImpl extends GeneralDAOImpl<T5110dbackupPo> implements T5110dbackupDAO { 
	public static final T5110dbackupDAOImpl INSTANCE = new T5110dbackupDAOImpl(); 
	public static final String TABLENAME = "T5110DBACKUP"; 

	public T5110dbackupDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<T5110dbackupPo> CONVERTER = new MapConverter<T5110dbackupPo>() { 
 
		@Override 
		public T5110dbackupPo convert(final DataObject dataObject) { 
			final T5110dbackupPo t5110dbackupPo = new T5110dbackupPo(); 
			t5110dbackupPo.setDutyno(dataObject.getString(T5110dbackupPo.COLUMNS.DUTYNO.name())); 
			t5110dbackupPo.setMwb(dataObject.getString(T5110dbackupPo.COLUMNS.MWB.name())); 
			t5110dbackupPo.setHwb(dataObject.getString(T5110dbackupPo.COLUMNS.HWB.name())); 
			t5110dbackupPo.setPaymethord(dataObject.getString(T5110dbackupPo.COLUMNS.PAYMETHORD.name())); 
			t5110dbackupPo.setDuty(BigDecimalUtils.formObj(dataObject.getValue(T5110dbackupPo.COLUMNS.DUTY.name()))); 
			t5110dbackupPo.setLastupdate(TimestampUtils.of(dataObject.getValue(T5110dbackupPo.COLUMNS.LASTUPDATE.name()))); 
			t5110dbackupPo.setPaymethod2(dataObject.getString(T5110dbackupPo.COLUMNS.PAYMETHOD2.name())); 
			t5110dbackupPo.setPaymethod3(dataObject.getString(T5110dbackupPo.COLUMNS.PAYMETHOD3.name())); 
			t5110dbackupPo.setPaymethod4(dataObject.getString(T5110dbackupPo.COLUMNS.PAYMETHOD4.name())); 
			t5110dbackupPo.setPaymethod5(dataObject.getString(T5110dbackupPo.COLUMNS.PAYMETHOD5.name())); 
			t5110dbackupPo.setPaymethod6(dataObject.getString(T5110dbackupPo.COLUMNS.PAYMETHOD6.name())); 
			t5110dbackupPo.setPaymethod7(dataObject.getString(T5110dbackupPo.COLUMNS.PAYMETHOD7.name())); 
			t5110dbackupPo.setPaymethod8(dataObject.getString(T5110dbackupPo.COLUMNS.PAYMETHOD8.name())); 
			t5110dbackupPo.setPaymethod9(dataObject.getString(T5110dbackupPo.COLUMNS.PAYMETHOD9.name())); 
			t5110dbackupPo.setDuty2(dataObject.getString(T5110dbackupPo.COLUMNS.DUTY2.name())); 
			t5110dbackupPo.setDuty3(dataObject.getString(T5110dbackupPo.COLUMNS.DUTY3.name())); 
			t5110dbackupPo.setDuty4(dataObject.getString(T5110dbackupPo.COLUMNS.DUTY4.name())); 
			t5110dbackupPo.setDuty5(dataObject.getString(T5110dbackupPo.COLUMNS.DUTY5.name())); 
			t5110dbackupPo.setDuty6(dataObject.getString(T5110dbackupPo.COLUMNS.DUTY6.name())); 
			t5110dbackupPo.setDuty7(dataObject.getString(T5110dbackupPo.COLUMNS.DUTY7.name())); 
			t5110dbackupPo.setDuty8(dataObject.getString(T5110dbackupPo.COLUMNS.DUTY8.name())); 
			t5110dbackupPo.setDuty9(dataObject.getString(T5110dbackupPo.COLUMNS.DUTY9.name())); 
			return t5110dbackupPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final T5110dbackupPo t5110dbackupPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(T5110dbackupPo.COLUMNS.DUTYNO.name(), t5110dbackupPo.getDutyno()); 
			dataObject.setValue(T5110dbackupPo.COLUMNS.MWB.name(), t5110dbackupPo.getMwb()); 
			dataObject.setValue(T5110dbackupPo.COLUMNS.HWB.name(), t5110dbackupPo.getHwb()); 
			dataObject.setValue(T5110dbackupPo.COLUMNS.PAYMETHORD.name(), t5110dbackupPo.getPaymethord()); 
			dataObject.setValue(T5110dbackupPo.COLUMNS.DUTY.name(), t5110dbackupPo.getDuty()); 
			dataObject.setValue(T5110dbackupPo.COLUMNS.LASTUPDATE.name(), t5110dbackupPo.getLastupdate()); 
			dataObject.setValue(T5110dbackupPo.COLUMNS.PAYMETHOD2.name(), t5110dbackupPo.getPaymethod2()); 
			dataObject.setValue(T5110dbackupPo.COLUMNS.PAYMETHOD3.name(), t5110dbackupPo.getPaymethod3()); 
			dataObject.setValue(T5110dbackupPo.COLUMNS.PAYMETHOD4.name(), t5110dbackupPo.getPaymethod4()); 
			dataObject.setValue(T5110dbackupPo.COLUMNS.PAYMETHOD5.name(), t5110dbackupPo.getPaymethod5()); 
			dataObject.setValue(T5110dbackupPo.COLUMNS.PAYMETHOD6.name(), t5110dbackupPo.getPaymethod6()); 
			dataObject.setValue(T5110dbackupPo.COLUMNS.PAYMETHOD7.name(), t5110dbackupPo.getPaymethod7()); 
			dataObject.setValue(T5110dbackupPo.COLUMNS.PAYMETHOD8.name(), t5110dbackupPo.getPaymethod8()); 
			dataObject.setValue(T5110dbackupPo.COLUMNS.PAYMETHOD9.name(), t5110dbackupPo.getPaymethod9()); 
			dataObject.setValue(T5110dbackupPo.COLUMNS.DUTY2.name(), t5110dbackupPo.getDuty2()); 
			dataObject.setValue(T5110dbackupPo.COLUMNS.DUTY3.name(), t5110dbackupPo.getDuty3()); 
			dataObject.setValue(T5110dbackupPo.COLUMNS.DUTY4.name(), t5110dbackupPo.getDuty4()); 
			dataObject.setValue(T5110dbackupPo.COLUMNS.DUTY5.name(), t5110dbackupPo.getDuty5()); 
			dataObject.setValue(T5110dbackupPo.COLUMNS.DUTY6.name(), t5110dbackupPo.getDuty6()); 
			dataObject.setValue(T5110dbackupPo.COLUMNS.DUTY7.name(), t5110dbackupPo.getDuty7()); 
			dataObject.setValue(T5110dbackupPo.COLUMNS.DUTY8.name(), t5110dbackupPo.getDuty8()); 
			dataObject.setValue(T5110dbackupPo.COLUMNS.DUTY9.name(), t5110dbackupPo.getDuty9()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<T5110dbackupPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(T5110dbackupPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
