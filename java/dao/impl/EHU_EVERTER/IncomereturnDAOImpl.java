package com.doc.common.dao.impl; 
 
public class IncomereturnDAOImpl extends GeneralDAOImpl<IncomereturnPo> implements IncomereturnDAO { 
	public static final IncomereturnDAOImpl INSTANCE = new IncomereturnDAOImpl(); 
	public static final String TABLENAME = "INCOMERETURN"; 

	public IncomereturnDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<IncomereturnPo> CONVERTER = new MapConverter<IncomereturnPo>() { 
 
		@Override 
		public IncomereturnPo convert(final DataObject dataObject) { 
			final IncomereturnPo incomereturnPo = new IncomereturnPo(); 
			incomereturnPo.setHwb(dataObject.getString(IncomereturnPo.COLUMNS.HWB.name())); 
			incomereturnPo.setUldno(dataObject.getString(IncomereturnPo.COLUMNS.ULDNO.name())); 
			incomereturnPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(IncomereturnPo.COLUMNS.PIECE.name()))); 
			incomereturnPo.setReturndate(dataObject.getString(IncomereturnPo.COLUMNS.RETURNDATE.name())); 
			incomereturnPo.setNote(dataObject.getString(IncomereturnPo.COLUMNS.NOTE.name())); 
			incomereturnPo.setDele(dataObject.getString(IncomereturnPo.COLUMNS.DELE.name())); 
			return incomereturnPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final IncomereturnPo incomereturnPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(IncomereturnPo.COLUMNS.HWB.name(), incomereturnPo.getHwb()); 
			dataObject.setValue(IncomereturnPo.COLUMNS.ULDNO.name(), incomereturnPo.getUldno()); 
			dataObject.setValue(IncomereturnPo.COLUMNS.PIECE.name(), incomereturnPo.getPiece()); 
			dataObject.setValue(IncomereturnPo.COLUMNS.RETURNDATE.name(), incomereturnPo.getReturndate()); 
			dataObject.setValue(IncomereturnPo.COLUMNS.NOTE.name(), incomereturnPo.getNote()); 
			dataObject.setValue(IncomereturnPo.COLUMNS.DELE.name(), incomereturnPo.getDele()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<IncomereturnPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(IncomereturnPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
