package com.doc.common.dao.impl; 
 
public class ImpcheckDAOImpl extends GeneralDAOImpl<ImpcheckPo> implements ImpcheckDAO { 
	public static final ImpcheckDAOImpl INSTANCE = new ImpcheckDAOImpl(); 
	public static final String TABLENAME = "IMPCHECK"; 

	public ImpcheckDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ImpcheckPo> CONVERTER = new MapConverter<ImpcheckPo>() { 
 
		@Override 
		public ImpcheckPo convert(final DataObject dataObject) { 
			final ImpcheckPo impcheckPo = new ImpcheckPo(); 
			impcheckPo.setCheckdate(TimestampUtils.of(dataObject.getValue(ImpcheckPo.COLUMNS.CHECKDATE.name()))); 
			impcheckPo.setCheckuser(dataObject.getString(ImpcheckPo.COLUMNS.CHECKUSER.name())); 
			impcheckPo.setExpbagno(dataObject.getString(ImpcheckPo.COLUMNS.EXPBAGNO.name())); 
			impcheckPo.setStatus(BigDecimalUtils.formObj(dataObject.getValue(ImpcheckPo.COLUMNS.STATUS.name()))); 
			impcheckPo.setHoldarea(dataObject.getString(ImpcheckPo.COLUMNS.HOLDAREA.name())); 
			impcheckPo.setSn(BigDecimalUtils.formObj(dataObject.getValue(ImpcheckPo.COLUMNS.SN.name()))); 
			impcheckPo.setCnt(BigDecimalUtils.formObj(dataObject.getValue(ImpcheckPo.COLUMNS.CNT.name()))); 
			return impcheckPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ImpcheckPo impcheckPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ImpcheckPo.COLUMNS.CHECKDATE.name(), impcheckPo.getCheckdate()); 
			dataObject.setValue(ImpcheckPo.COLUMNS.CHECKUSER.name(), impcheckPo.getCheckuser()); 
			dataObject.setValue(ImpcheckPo.COLUMNS.EXPBAGNO.name(), impcheckPo.getExpbagno()); 
			dataObject.setValue(ImpcheckPo.COLUMNS.STATUS.name(), impcheckPo.getStatus()); 
			dataObject.setValue(ImpcheckPo.COLUMNS.HOLDAREA.name(), impcheckPo.getHoldarea()); 
			dataObject.setValue(ImpcheckPo.COLUMNS.SN.name(), impcheckPo.getSn()); 
			dataObject.setValue(ImpcheckPo.COLUMNS.CNT.name(), impcheckPo.getCnt()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ImpcheckPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ImpcheckPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
