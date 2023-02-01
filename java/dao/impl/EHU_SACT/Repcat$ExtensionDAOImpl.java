package com.doc.common.dao.impl; 
 
public class Repcat$ExtensionDAOImpl extends GeneralDAOImpl<Repcat$ExtensionPo> implements IRepcat$ExtensionDAO { 
	public static final Repcat$ExtensionDAOImpl INSTANCE = new Repcat$ExtensionDAOImpl(); 
	public static final String TABLENAME = "REPCAT$_EXTENSION"; 

	public Repcat$ExtensionDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Repcat$ExtensionPo> CONVERTER = new MapConverter<Repcat$ExtensionPo>() { 
 
		@Override 
		public Repcat$ExtensionPo convert(final DataObject dataObject) { 
			final Repcat$ExtensionPo repcat$ExtensionPo = new Repcat$ExtensionPo(); 
			repcat$ExtensionPo.setExtensionId(); 
			repcat$ExtensionPo.setExtensionCode(BigDecimalUtils.formObj(dataObject.getValue(Repcat$ExtensionPo.COLUMNS.EXTENSION_CODE.name()))); 
			repcat$ExtensionPo.setMasterdef(dataObject.getString(Repcat$ExtensionPo.COLUMNS.MASTERDEF.name())); 
			repcat$ExtensionPo.setExportRequired(dataObject.getString(Repcat$ExtensionPo.COLUMNS.EXPORT_REQUIRED.name())); 
			repcat$ExtensionPo.setRepcatlogId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$ExtensionPo.COLUMNS.REPCATLOG_ID.name()))); 
			repcat$ExtensionPo.setExtensionStatus(BigDecimalUtils.formObj(dataObject.getValue(Repcat$ExtensionPo.COLUMNS.EXTENSION_STATUS.name()))); 
			repcat$ExtensionPo.setFlashbackScn(BigDecimalUtils.formObj(dataObject.getValue(Repcat$ExtensionPo.COLUMNS.FLASHBACK_SCN.name()))); 
			repcat$ExtensionPo.setPushToMdef(dataObject.getString(Repcat$ExtensionPo.COLUMNS.PUSH_TO_MDEF.name())); 
			repcat$ExtensionPo.setPushToNew(dataObject.getString(Repcat$ExtensionPo.COLUMNS.PUSH_TO_NEW.name())); 
			repcat$ExtensionPo.setPercentageForCatchupMdef(BigDecimalUtils.formObj(dataObject.getValue(Repcat$ExtensionPo.COLUMNS.PERCENTAGE_FOR_CATCHUP_MDEF.name()))); 
			repcat$ExtensionPo.setCycleSecondsMdef(BigDecimalUtils.formObj(dataObject.getValue(Repcat$ExtensionPo.COLUMNS.CYCLE_SECONDS_MDEF.name()))); 
			repcat$ExtensionPo.setPercentageForCatchupNew(BigDecimalUtils.formObj(dataObject.getValue(Repcat$ExtensionPo.COLUMNS.PERCENTAGE_FOR_CATCHUP_NEW.name()))); 
			repcat$ExtensionPo.setCycleSecondsNew(BigDecimalUtils.formObj(dataObject.getValue(Repcat$ExtensionPo.COLUMNS.CYCLE_SECONDS_NEW.name()))); 
			return repcat$ExtensionPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Repcat$ExtensionPo repcat$ExtensionPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Repcat$ExtensionPo.COLUMNS.EXTENSION_ID.name(), repcat$ExtensionPo.getExtensionId()); 
			dataObject.setValue(Repcat$ExtensionPo.COLUMNS.EXTENSION_CODE.name(), repcat$ExtensionPo.getExtensionCode()); 
			dataObject.setValue(Repcat$ExtensionPo.COLUMNS.MASTERDEF.name(), repcat$ExtensionPo.getMasterdef()); 
			dataObject.setValue(Repcat$ExtensionPo.COLUMNS.EXPORT_REQUIRED.name(), repcat$ExtensionPo.getExportRequired()); 
			dataObject.setValue(Repcat$ExtensionPo.COLUMNS.REPCATLOG_ID.name(), repcat$ExtensionPo.getRepcatlogId()); 
			dataObject.setValue(Repcat$ExtensionPo.COLUMNS.EXTENSION_STATUS.name(), repcat$ExtensionPo.getExtensionStatus()); 
			dataObject.setValue(Repcat$ExtensionPo.COLUMNS.FLASHBACK_SCN.name(), repcat$ExtensionPo.getFlashbackScn()); 
			dataObject.setValue(Repcat$ExtensionPo.COLUMNS.PUSH_TO_MDEF.name(), repcat$ExtensionPo.getPushToMdef()); 
			dataObject.setValue(Repcat$ExtensionPo.COLUMNS.PUSH_TO_NEW.name(), repcat$ExtensionPo.getPushToNew()); 
			dataObject.setValue(Repcat$ExtensionPo.COLUMNS.PERCENTAGE_FOR_CATCHUP_MDEF.name(), repcat$ExtensionPo.getPercentageForCatchupMdef()); 
			dataObject.setValue(Repcat$ExtensionPo.COLUMNS.CYCLE_SECONDS_MDEF.name(), repcat$ExtensionPo.getCycleSecondsMdef()); 
			dataObject.setValue(Repcat$ExtensionPo.COLUMNS.PERCENTAGE_FOR_CATCHUP_NEW.name(), repcat$ExtensionPo.getPercentageForCatchupNew()); 
			dataObject.setValue(Repcat$ExtensionPo.COLUMNS.CYCLE_SECONDS_NEW.name(), repcat$ExtensionPo.getCycleSecondsNew()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Repcat$ExtensionPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Repcat$ExtensionPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Repcat$ExtensionPo.COLUMNS.EXTENSION_ID.name(), po.getExtensionId()); 
		return sqlWhere; 
	} 
 
} 
