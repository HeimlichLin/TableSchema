package com.doc.common.dao.impl; 
 
public class InvtrybomdDAOImpl extends GeneralDAOImpl<InvtrybomdPo> implements InvtrybomdDAO { 
	public static final InvtrybomdDAOImpl INSTANCE = new InvtrybomdDAOImpl(); 
	public static final String TABLENAME = "INVTRYBOMD"; 

	public InvtrybomdDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<InvtrybomdPo> CONVERTER = new MapConverter<InvtrybomdPo>() { 
 
		@Override 
		public InvtrybomdPo convert(final DataObject dataObject) { 
			final InvtrybomdPo invtrybomdPo = new InvtrybomdPo(); 
			invtrybomdPo.setSetNo(dataObject.getString(InvtrybomdPo.COLUMNS.SET_NO.name())); 
			invtrybomdPo.setCtmCode(dataObject.getString(InvtrybomdPo.COLUMNS.CTM_CODE.name())); 
			invtrybomdPo.setCocompNo(dataObject.getString(InvtrybomdPo.COLUMNS.COCOMP_NO.name())); 
			invtrybomdPo.setRpt(dataObject.getString(InvtrybomdPo.COLUMNS.RPT.name())); 
			invtrybomdPo.setBfNo(dataObject.getString(InvtrybomdPo.COLUMNS.BF_NO.name())); 
			invtrybomdPo.setPg(BigDecimalUtils.formObj(dataObject.getValue(InvtrybomdPo.COLUMNS.PG.name()))); 
			invtrybomdPo.setPrdtNo(dataObject.getString(InvtrybomdPo.COLUMNS.PRDT_NO.name())); 
			invtrybomdPo.setUnit(dataObject.getString(InvtrybomdPo.COLUMNS.UNIT.name())); 
			invtrybomdPo.setSno(BigDecimalUtils.formObj(dataObject.getValue(InvtrybomdPo.COLUMNS.SNO.name()))); 
			invtrybomdPo.setUq1(BigDecimalUtils.formObj(dataObject.getValue(InvtrybomdPo.COLUMNS.UQ1.name()))); 
			invtrybomdPo.setWq1(BigDecimalUtils.formObj(dataObject.getValue(InvtrybomdPo.COLUMNS.WQ1.name()))); 
			invtrybomdPo.setUq2(BigDecimalUtils.formObj(dataObject.getValue(InvtrybomdPo.COLUMNS.UQ2.name()))); 
			invtrybomdPo.setWq2(BigDecimalUtils.formObj(dataObject.getValue(InvtrybomdPo.COLUMNS.WQ2.name()))); 
			invtrybomdPo.setUq3(BigDecimalUtils.formObj(dataObject.getValue(InvtrybomdPo.COLUMNS.UQ3.name()))); 
			invtrybomdPo.setWq3(BigDecimalUtils.formObj(dataObject.getValue(InvtrybomdPo.COLUMNS.WQ3.name()))); 
			invtrybomdPo.setUq4(BigDecimalUtils.formObj(dataObject.getValue(InvtrybomdPo.COLUMNS.UQ4.name()))); 
			invtrybomdPo.setWq4(BigDecimalUtils.formObj(dataObject.getValue(InvtrybomdPo.COLUMNS.WQ4.name()))); 
			invtrybomdPo.setUq5(BigDecimalUtils.formObj(dataObject.getValue(InvtrybomdPo.COLUMNS.UQ5.name()))); 
			invtrybomdPo.setWq5(BigDecimalUtils.formObj(dataObject.getValue(InvtrybomdPo.COLUMNS.WQ5.name()))); 
			invtrybomdPo.setUq6(BigDecimalUtils.formObj(dataObject.getValue(InvtrybomdPo.COLUMNS.UQ6.name()))); 
			invtrybomdPo.setWq6(BigDecimalUtils.formObj(dataObject.getValue(InvtrybomdPo.COLUMNS.WQ6.name()))); 
			invtrybomdPo.setUq7(BigDecimalUtils.formObj(dataObject.getValue(InvtrybomdPo.COLUMNS.UQ7.name()))); 
			invtrybomdPo.setWq7(BigDecimalUtils.formObj(dataObject.getValue(InvtrybomdPo.COLUMNS.WQ7.name()))); 
			invtrybomdPo.setUq8(BigDecimalUtils.formObj(dataObject.getValue(InvtrybomdPo.COLUMNS.UQ8.name()))); 
			invtrybomdPo.setWq8(BigDecimalUtils.formObj(dataObject.getValue(InvtrybomdPo.COLUMNS.WQ8.name()))); 
			invtrybomdPo.setUq9(BigDecimalUtils.formObj(dataObject.getValue(InvtrybomdPo.COLUMNS.UQ9.name()))); 
			invtrybomdPo.setWq9(BigDecimalUtils.formObj(dataObject.getValue(InvtrybomdPo.COLUMNS.WQ9.name()))); 
			invtrybomdPo.setSumq(BigDecimalUtils.formObj(dataObject.getValue(InvtrybomdPo.COLUMNS.SUMQ.name()))); 
			invtrybomdPo.setRmks(dataObject.getString(InvtrybomdPo.COLUMNS.RMKS.name())); 
			invtrybomdPo.setLkyn(dataObject.getString(InvtrybomdPo.COLUMNS.LKYN.name())); 
			return invtrybomdPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final InvtrybomdPo invtrybomdPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(InvtrybomdPo.COLUMNS.SET_NO.name(), invtrybomdPo.getSetNo()); 
			dataObject.setValue(InvtrybomdPo.COLUMNS.CTM_CODE.name(), invtrybomdPo.getCtmCode()); 
			dataObject.setValue(InvtrybomdPo.COLUMNS.COCOMP_NO.name(), invtrybomdPo.getCocompNo()); 
			dataObject.setValue(InvtrybomdPo.COLUMNS.RPT.name(), invtrybomdPo.getRpt()); 
			dataObject.setValue(InvtrybomdPo.COLUMNS.BF_NO.name(), invtrybomdPo.getBfNo()); 
			dataObject.setValue(InvtrybomdPo.COLUMNS.PG.name(), invtrybomdPo.getPg()); 
			dataObject.setValue(InvtrybomdPo.COLUMNS.PRDT_NO.name(), invtrybomdPo.getPrdtNo()); 
			dataObject.setValue(InvtrybomdPo.COLUMNS.UNIT.name(), invtrybomdPo.getUnit()); 
			dataObject.setValue(InvtrybomdPo.COLUMNS.SNO.name(), invtrybomdPo.getSno()); 
			dataObject.setValue(InvtrybomdPo.COLUMNS.UQ1.name(), invtrybomdPo.getUq1()); 
			dataObject.setValue(InvtrybomdPo.COLUMNS.WQ1.name(), invtrybomdPo.getWq1()); 
			dataObject.setValue(InvtrybomdPo.COLUMNS.UQ2.name(), invtrybomdPo.getUq2()); 
			dataObject.setValue(InvtrybomdPo.COLUMNS.WQ2.name(), invtrybomdPo.getWq2()); 
			dataObject.setValue(InvtrybomdPo.COLUMNS.UQ3.name(), invtrybomdPo.getUq3()); 
			dataObject.setValue(InvtrybomdPo.COLUMNS.WQ3.name(), invtrybomdPo.getWq3()); 
			dataObject.setValue(InvtrybomdPo.COLUMNS.UQ4.name(), invtrybomdPo.getUq4()); 
			dataObject.setValue(InvtrybomdPo.COLUMNS.WQ4.name(), invtrybomdPo.getWq4()); 
			dataObject.setValue(InvtrybomdPo.COLUMNS.UQ5.name(), invtrybomdPo.getUq5()); 
			dataObject.setValue(InvtrybomdPo.COLUMNS.WQ5.name(), invtrybomdPo.getWq5()); 
			dataObject.setValue(InvtrybomdPo.COLUMNS.UQ6.name(), invtrybomdPo.getUq6()); 
			dataObject.setValue(InvtrybomdPo.COLUMNS.WQ6.name(), invtrybomdPo.getWq6()); 
			dataObject.setValue(InvtrybomdPo.COLUMNS.UQ7.name(), invtrybomdPo.getUq7()); 
			dataObject.setValue(InvtrybomdPo.COLUMNS.WQ7.name(), invtrybomdPo.getWq7()); 
			dataObject.setValue(InvtrybomdPo.COLUMNS.UQ8.name(), invtrybomdPo.getUq8()); 
			dataObject.setValue(InvtrybomdPo.COLUMNS.WQ8.name(), invtrybomdPo.getWq8()); 
			dataObject.setValue(InvtrybomdPo.COLUMNS.UQ9.name(), invtrybomdPo.getUq9()); 
			dataObject.setValue(InvtrybomdPo.COLUMNS.WQ9.name(), invtrybomdPo.getWq9()); 
			dataObject.setValue(InvtrybomdPo.COLUMNS.SUMQ.name(), invtrybomdPo.getSumq()); 
			dataObject.setValue(InvtrybomdPo.COLUMNS.RMKS.name(), invtrybomdPo.getRmks()); 
			dataObject.setValue(InvtrybomdPo.COLUMNS.LKYN.name(), invtrybomdPo.getLkyn()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<InvtrybomdPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(InvtrybomdPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
