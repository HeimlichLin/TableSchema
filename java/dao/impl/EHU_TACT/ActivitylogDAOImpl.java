package com.doc.common.dao.impl; 
 
public class ActivitylogDAOImpl extends GeneralDAOImpl<ActivitylogPo> implements ActivitylogDAO { 
	public static final ActivitylogDAOImpl INSTANCE = new ActivitylogDAOImpl(); 
	public static final String TABLENAME = "ACTIVITYLOG"; 

	public ActivitylogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ActivitylogPo> CONVERTER = new MapConverter<ActivitylogPo>() { 
 
		@Override 
		public ActivitylogPo convert(final DataObject dataObject) { 
			final ActivitylogPo activitylogPo = new ActivitylogPo(); 
			activitylogPo.setWs(dataObject.getString(ActivitylogPo.COLUMNS.WS.name())); 
			activitylogPo.setUserid(dataObject.getString(ActivitylogPo.COLUMNS.USERID.name())); 
			activitylogPo.setApuptime(TimestampUtils.of(dataObject.getValue(ActivitylogPo.COLUMNS.APUPTIME.name()))); 
			activitylogPo.setApdowntime(TimestampUtils.of(dataObject.getValue(ActivitylogPo.COLUMNS.APDOWNTIME.name()))); 
			activitylogPo.setUserlogintime(TimestampUtils.of(dataObject.getValue(ActivitylogPo.COLUMNS.USERLOGINTIME.name()))); 
			activitylogPo.setUserlogouttime(TimestampUtils.of(dataObject.getValue(ActivitylogPo.COLUMNS.USERLOGOUTTIME.name()))); 
			activitylogPo.setFormuptime(TimestampUtils.of(dataObject.getValue(ActivitylogPo.COLUMNS.FORMUPTIME.name()))); 
			activitylogPo.setFormdowntime(TimestampUtils.of(dataObject.getValue(ActivitylogPo.COLUMNS.FORMDOWNTIME.name()))); 
			activitylogPo.setForm(dataObject.getString(ActivitylogPo.COLUMNS.FORM.name())); 
			activitylogPo.setExpbagno(dataObject.getString(ActivitylogPo.COLUMNS.EXPBAGNO.name())); 
			activitylogPo.setMwb(dataObject.getString(ActivitylogPo.COLUMNS.MWB.name())); 
			activitylogPo.setHwb(dataObject.getString(ActivitylogPo.COLUMNS.HWB.name())); 
			activitylogPo.setAction(dataObject.getString(ActivitylogPo.COLUMNS.ACTION.name())); 
			activitylogPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(ActivitylogPo.COLUMNS.WEIGHT.name()))); 
			activitylogPo.setOriweight(BigDecimalUtils.formObj(dataObject.getValue(ActivitylogPo.COLUMNS.ORIWEIGHT.name()))); 
			activitylogPo.setLastupdate(TimestampUtils.of(dataObject.getValue(ActivitylogPo.COLUMNS.LASTUPDATE.name()))); 
			activitylogPo.setDownuserid(dataObject.getString(ActivitylogPo.COLUMNS.DOWNUSERID.name())); 
			activitylogPo.setDownformtime(TimestampUtils.of(dataObject.getValue(ActivitylogPo.COLUMNS.DOWNFORMTIME.name()))); 
			activitylogPo.setDownform(dataObject.getString(ActivitylogPo.COLUMNS.DOWNFORM.name())); 
			activitylogPo.setTryinguserid(dataObject.getString(ActivitylogPo.COLUMNS.TRYINGUSERID.name())); 
			activitylogPo.setTryingtime(TimestampUtils.of(dataObject.getValue(ActivitylogPo.COLUMNS.TRYINGTIME.name()))); 
			return activitylogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ActivitylogPo activitylogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ActivitylogPo.COLUMNS.WS.name(), activitylogPo.getWs()); 
			dataObject.setValue(ActivitylogPo.COLUMNS.USERID.name(), activitylogPo.getUserid()); 
			dataObject.setValue(ActivitylogPo.COLUMNS.APUPTIME.name(), activitylogPo.getApuptime()); 
			dataObject.setValue(ActivitylogPo.COLUMNS.APDOWNTIME.name(), activitylogPo.getApdowntime()); 
			dataObject.setValue(ActivitylogPo.COLUMNS.USERLOGINTIME.name(), activitylogPo.getUserlogintime()); 
			dataObject.setValue(ActivitylogPo.COLUMNS.USERLOGOUTTIME.name(), activitylogPo.getUserlogouttime()); 
			dataObject.setValue(ActivitylogPo.COLUMNS.FORMUPTIME.name(), activitylogPo.getFormuptime()); 
			dataObject.setValue(ActivitylogPo.COLUMNS.FORMDOWNTIME.name(), activitylogPo.getFormdowntime()); 
			dataObject.setValue(ActivitylogPo.COLUMNS.FORM.name(), activitylogPo.getForm()); 
			dataObject.setValue(ActivitylogPo.COLUMNS.EXPBAGNO.name(), activitylogPo.getExpbagno()); 
			dataObject.setValue(ActivitylogPo.COLUMNS.MWB.name(), activitylogPo.getMwb()); 
			dataObject.setValue(ActivitylogPo.COLUMNS.HWB.name(), activitylogPo.getHwb()); 
			dataObject.setValue(ActivitylogPo.COLUMNS.ACTION.name(), activitylogPo.getAction()); 
			dataObject.setValue(ActivitylogPo.COLUMNS.WEIGHT.name(), activitylogPo.getWeight()); 
			dataObject.setValue(ActivitylogPo.COLUMNS.ORIWEIGHT.name(), activitylogPo.getOriweight()); 
			dataObject.setValue(ActivitylogPo.COLUMNS.LASTUPDATE.name(), activitylogPo.getLastupdate()); 
			dataObject.setValue(ActivitylogPo.COLUMNS.DOWNUSERID.name(), activitylogPo.getDownuserid()); 
			dataObject.setValue(ActivitylogPo.COLUMNS.DOWNFORMTIME.name(), activitylogPo.getDownformtime()); 
			dataObject.setValue(ActivitylogPo.COLUMNS.DOWNFORM.name(), activitylogPo.getDownform()); 
			dataObject.setValue(ActivitylogPo.COLUMNS.TRYINGUSERID.name(), activitylogPo.getTryinguserid()); 
			dataObject.setValue(ActivitylogPo.COLUMNS.TRYINGTIME.name(), activitylogPo.getTryingtime()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ActivitylogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ActivitylogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
