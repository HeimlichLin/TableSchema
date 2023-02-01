package com.doc.common.dao.impl; 
 
public class ImpStockDAOImpl extends GeneralDAOImpl<ImpStockPo> implements ImpStockDAO { 
	public static final ImpStockDAOImpl INSTANCE = new ImpStockDAOImpl(); 
	public static final String TABLENAME = "IMP_STOCK"; 

	public ImpStockDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ImpStockPo> CONVERTER = new MapConverter<ImpStockPo>() { 
 
		@Override 
		public ImpStockPo convert(final DataObject dataObject) { 
			final ImpStockPo impStockPo = new ImpStockPo(); 
			impStockPo.setMwb(dataObject.getString(ImpStockPo.COLUMNS.MWB.name())); 
			impStockPo.setExpbagno(dataObject.getString(ImpStockPo.COLUMNS.EXPBAGNO.name())); 
			impStockPo.setContainer(dataObject.getString(ImpStockPo.COLUMNS.CONTAINER.name())); 
			impStockPo.setStocktype(dataObject.getString(ImpStockPo.COLUMNS.STOCKTYPE.name())); 
			impStockPo.setStockno(dataObject.getString(ImpStockPo.COLUMNS.STOCKNO.name())); 
			impStockPo.setInputmode(dataObject.getString(ImpStockPo.COLUMNS.INPUTMODE.name())); 
			impStockPo.setChkpiece(BigDecimalUtils.formObj(dataObject.getValue(ImpStockPo.COLUMNS.CHKPIECE.name()))); 
			impStockPo.setChkuser(dataObject.getString(ImpStockPo.COLUMNS.CHKUSER.name())); 
			impStockPo.setCheckdate(TimestampUtils.of(dataObject.getValue(ImpStockPo.COLUMNS.CHECKDATE.name()))); 
			impStockPo.setLastupdate(TimestampUtils.of(dataObject.getValue(ImpStockPo.COLUMNS.LASTUPDATE.name()))); 
			impStockPo.setLastupuser(dataObject.getString(ImpStockPo.COLUMNS.LASTUPUSER.name())); 
			impStockPo.setUniqueid(BigDecimalUtils.formObj(dataObject.getValue(ImpStockPo.COLUMNS.UNIQUEID.name()))); 
			return impStockPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ImpStockPo impStockPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ImpStockPo.COLUMNS.MWB.name(), impStockPo.getMwb()); 
			dataObject.setValue(ImpStockPo.COLUMNS.EXPBAGNO.name(), impStockPo.getExpbagno()); 
			dataObject.setValue(ImpStockPo.COLUMNS.CONTAINER.name(), impStockPo.getContainer()); 
			dataObject.setValue(ImpStockPo.COLUMNS.STOCKTYPE.name(), impStockPo.getStocktype()); 
			dataObject.setValue(ImpStockPo.COLUMNS.STOCKNO.name(), impStockPo.getStockno()); 
			dataObject.setValue(ImpStockPo.COLUMNS.INPUTMODE.name(), impStockPo.getInputmode()); 
			dataObject.setValue(ImpStockPo.COLUMNS.CHKPIECE.name(), impStockPo.getChkpiece()); 
			dataObject.setValue(ImpStockPo.COLUMNS.CHKUSER.name(), impStockPo.getChkuser()); 
			dataObject.setValue(ImpStockPo.COLUMNS.CHECKDATE.name(), impStockPo.getCheckdate()); 
			dataObject.setValue(ImpStockPo.COLUMNS.LASTUPDATE.name(), impStockPo.getLastupdate()); 
			dataObject.setValue(ImpStockPo.COLUMNS.LASTUPUSER.name(), impStockPo.getLastupuser()); 
			dataObject.setValue(ImpStockPo.COLUMNS.UNIQUEID.name(), impStockPo.getUniqueid()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ImpStockPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ImpStockPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
