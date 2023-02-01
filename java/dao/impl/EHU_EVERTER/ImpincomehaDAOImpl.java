package com.doc.common.dao.impl; 
 
public class ImpincomehaDAOImpl extends GeneralDAOImpl<ImpincomehaPo> implements ImpincomehaDAO { 
	public static final ImpincomehaDAOImpl INSTANCE = new ImpincomehaDAOImpl(); 
	public static final String TABLENAME = "IMPINCOMEHA"; 

	public ImpincomehaDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ImpincomehaPo> CONVERTER = new MapConverter<ImpincomehaPo>() { 
 
		@Override 
		public ImpincomehaPo convert(final DataObject dataObject) { 
			final ImpincomehaPo impincomehaPo = new ImpincomehaPo(); 
			impincomehaPo.setAwb(dataObject.getString(ImpincomehaPo.COLUMNS.AWB.name())); 
			impincomehaPo.setHwb(dataObject.getString(ImpincomehaPo.COLUMNS.HWB.name())); 
			impincomehaPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(ImpincomehaPo.COLUMNS.PIECE.name()))); 
			impincomehaPo.setIncomedate(TimestampUtils.of(dataObject.getValue(ImpincomehaPo.COLUMNS.INCOMEDATE.name()))); 
			impincomehaPo.setIncomepiece(BigDecimalUtils.formObj(dataObject.getValue(ImpincomehaPo.COLUMNS.INCOMEPIECE.name()))); 
			impincomehaPo.setUldno(dataObject.getString(ImpincomehaPo.COLUMNS.ULDNO.name())); 
			impincomehaPo.setDele(dataObject.getString(ImpincomehaPo.COLUMNS.DELE.name())); 
			impincomehaPo.setNote(dataObject.getString(ImpincomehaPo.COLUMNS.NOTE.name())); 
			impincomehaPo.setIncomedate1(TimestampUtils.of(dataObject.getValue(ImpincomehaPo.COLUMNS.INCOMEDATE1.name()))); 
			return impincomehaPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ImpincomehaPo impincomehaPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ImpincomehaPo.COLUMNS.AWB.name(), impincomehaPo.getAwb()); 
			dataObject.setValue(ImpincomehaPo.COLUMNS.HWB.name(), impincomehaPo.getHwb()); 
			dataObject.setValue(ImpincomehaPo.COLUMNS.PIECE.name(), impincomehaPo.getPiece()); 
			dataObject.setValue(ImpincomehaPo.COLUMNS.INCOMEDATE.name(), impincomehaPo.getIncomedate()); 
			dataObject.setValue(ImpincomehaPo.COLUMNS.INCOMEPIECE.name(), impincomehaPo.getIncomepiece()); 
			dataObject.setValue(ImpincomehaPo.COLUMNS.ULDNO.name(), impincomehaPo.getUldno()); 
			dataObject.setValue(ImpincomehaPo.COLUMNS.DELE.name(), impincomehaPo.getDele()); 
			dataObject.setValue(ImpincomehaPo.COLUMNS.NOTE.name(), impincomehaPo.getNote()); 
			dataObject.setValue(ImpincomehaPo.COLUMNS.INCOMEDATE1.name(), impincomehaPo.getIncomedate1()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ImpincomehaPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ImpincomehaPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
