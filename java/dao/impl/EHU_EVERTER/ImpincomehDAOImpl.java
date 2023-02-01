package com.doc.common.dao.impl; 
 
public class ImpincomehDAOImpl extends GeneralDAOImpl<ImpincomehPo> implements ImpincomehDAO { 
	public static final ImpincomehDAOImpl INSTANCE = new ImpincomehDAOImpl(); 
	public static final String TABLENAME = "IMPINCOMEH"; 

	public ImpincomehDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ImpincomehPo> CONVERTER = new MapConverter<ImpincomehPo>() { 
 
		@Override 
		public ImpincomehPo convert(final DataObject dataObject) { 
			final ImpincomehPo impincomehPo = new ImpincomehPo(); 
			impincomehPo.setAwb(dataObject.getString(ImpincomehPo.COLUMNS.AWB.name())); 
			impincomehPo.setHwb(dataObject.getString(ImpincomehPo.COLUMNS.HWB.name())); 
			impincomehPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(ImpincomehPo.COLUMNS.PIECE.name()))); 
			impincomehPo.setIncomedate(TimestampUtils.of(dataObject.getValue(ImpincomehPo.COLUMNS.INCOMEDATE.name()))); 
			impincomehPo.setIncomepiece(BigDecimalUtils.formObj(dataObject.getValue(ImpincomehPo.COLUMNS.INCOMEPIECE.name()))); 
			impincomehPo.setUldno(dataObject.getString(ImpincomehPo.COLUMNS.ULDNO.name())); 
			impincomehPo.setDele(dataObject.getString(ImpincomehPo.COLUMNS.DELE.name())); 
			impincomehPo.setNote(dataObject.getString(ImpincomehPo.COLUMNS.NOTE.name())); 
			return impincomehPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ImpincomehPo impincomehPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ImpincomehPo.COLUMNS.AWB.name(), impincomehPo.getAwb()); 
			dataObject.setValue(ImpincomehPo.COLUMNS.HWB.name(), impincomehPo.getHwb()); 
			dataObject.setValue(ImpincomehPo.COLUMNS.PIECE.name(), impincomehPo.getPiece()); 
			dataObject.setValue(ImpincomehPo.COLUMNS.INCOMEDATE.name(), impincomehPo.getIncomedate()); 
			dataObject.setValue(ImpincomehPo.COLUMNS.INCOMEPIECE.name(), impincomehPo.getIncomepiece()); 
			dataObject.setValue(ImpincomehPo.COLUMNS.ULDNO.name(), impincomehPo.getUldno()); 
			dataObject.setValue(ImpincomehPo.COLUMNS.DELE.name(), impincomehPo.getDele()); 
			dataObject.setValue(ImpincomehPo.COLUMNS.NOTE.name(), impincomehPo.getNote()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ImpincomehPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ImpincomehPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
