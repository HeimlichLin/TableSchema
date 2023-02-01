package com.doc.common.dao.impl; 
 
public class ImpincomeDAOImpl extends GeneralDAOImpl<ImpincomePo> implements ImpincomeDAO { 
	public static final ImpincomeDAOImpl INSTANCE = new ImpincomeDAOImpl(); 
	public static final String TABLENAME = "IMPINCOME"; 

	public ImpincomeDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ImpincomePo> CONVERTER = new MapConverter<ImpincomePo>() { 
 
		@Override 
		public ImpincomePo convert(final DataObject dataObject) { 
			final ImpincomePo impincomePo = new ImpincomePo(); 
			impincomePo.setAwb(dataObject.getString(ImpincomePo.COLUMNS.AWB.name())); 
			impincomePo.setHwb(dataObject.getString(ImpincomePo.COLUMNS.HWB.name())); 
			impincomePo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(ImpincomePo.COLUMNS.PIECE.name()))); 
			impincomePo.setIncomedate(TimestampUtils.of(dataObject.getValue(ImpincomePo.COLUMNS.INCOMEDATE.name()))); 
			impincomePo.setIncomepiece(BigDecimalUtils.formObj(dataObject.getValue(ImpincomePo.COLUMNS.INCOMEPIECE.name()))); 
			impincomePo.setUldno(dataObject.getString(ImpincomePo.COLUMNS.ULDNO.name())); 
			impincomePo.setDele(dataObject.getString(ImpincomePo.COLUMNS.DELE.name())); 
			impincomePo.setNote(dataObject.getString(ImpincomePo.COLUMNS.NOTE.name())); 
			impincomePo.setIncomedate1(TimestampUtils.of(dataObject.getValue(ImpincomePo.COLUMNS.INCOMEDATE1.name()))); 
			return impincomePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ImpincomePo impincomePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ImpincomePo.COLUMNS.AWB.name(), impincomePo.getAwb()); 
			dataObject.setValue(ImpincomePo.COLUMNS.HWB.name(), impincomePo.getHwb()); 
			dataObject.setValue(ImpincomePo.COLUMNS.PIECE.name(), impincomePo.getPiece()); 
			dataObject.setValue(ImpincomePo.COLUMNS.INCOMEDATE.name(), impincomePo.getIncomedate()); 
			dataObject.setValue(ImpincomePo.COLUMNS.INCOMEPIECE.name(), impincomePo.getIncomepiece()); 
			dataObject.setValue(ImpincomePo.COLUMNS.ULDNO.name(), impincomePo.getUldno()); 
			dataObject.setValue(ImpincomePo.COLUMNS.DELE.name(), impincomePo.getDele()); 
			dataObject.setValue(ImpincomePo.COLUMNS.NOTE.name(), impincomePo.getNote()); 
			dataObject.setValue(ImpincomePo.COLUMNS.INCOMEDATE1.name(), impincomePo.getIncomedate1()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ImpincomePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ImpincomePo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
