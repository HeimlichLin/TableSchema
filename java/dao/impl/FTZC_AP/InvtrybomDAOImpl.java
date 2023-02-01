package com.doc.common.dao.impl; 
 
public class InvtrybomDAOImpl extends GeneralDAOImpl<InvtrybomPo> implements InvtrybomDAO { 
	public static final InvtrybomDAOImpl INSTANCE = new InvtrybomDAOImpl(); 
	public static final String TABLENAME = "INVTRYBOM"; 

	public InvtrybomDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<InvtrybomPo> CONVERTER = new MapConverter<InvtrybomPo>() { 
 
		@Override 
		public InvtrybomPo convert(final DataObject dataObject) { 
			final InvtrybomPo invtrybomPo = new InvtrybomPo(); 
			invtrybomPo.setBfNo(dataObject.getString(InvtrybomPo.COLUMNS.BF_NO.name())); 
			invtrybomPo.setSetNo(dataObject.getString(InvtrybomPo.COLUMNS.SET_NO.name())); 
			invtrybomPo.setCtmCode(dataObject.getString(InvtrybomPo.COLUMNS.CTM_CODE.name())); 
			invtrybomPo.setCocompNo(dataObject.getString(InvtrybomPo.COLUMNS.COCOMP_NO.name())); 
			invtrybomPo.setRpt(dataObject.getString(InvtrybomPo.COLUMNS.RPT.name())); 
			invtrybomPo.setPg(BigDecimalUtils.formObj(dataObject.getValue(InvtrybomPo.COLUMNS.PG.name()))); 
			invtrybomPo.setBs(BigDecimalUtils.formObj(dataObject.getValue(InvtrybomPo.COLUMNS.BS.name()))); 
			invtrybomPo.setBht(dataObject.getString(InvtrybomPo.COLUMNS.BHT.name())); 
			invtrybomPo.setB1(dataObject.getString(InvtrybomPo.COLUMNS.B1.name())); 
			invtrybomPo.setB2(dataObject.getString(InvtrybomPo.COLUMNS.B2.name())); 
			invtrybomPo.setB3(dataObject.getString(InvtrybomPo.COLUMNS.B3.name())); 
			invtrybomPo.setB4(dataObject.getString(InvtrybomPo.COLUMNS.B4.name())); 
			invtrybomPo.setB5(dataObject.getString(InvtrybomPo.COLUMNS.B5.name())); 
			invtrybomPo.setB6(dataObject.getString(InvtrybomPo.COLUMNS.B6.name())); 
			invtrybomPo.setB7(dataObject.getString(InvtrybomPo.COLUMNS.B7.name())); 
			invtrybomPo.setB8(dataObject.getString(InvtrybomPo.COLUMNS.B8.name())); 
			invtrybomPo.setB9(dataObject.getString(InvtrybomPo.COLUMNS.B9.name())); 
			invtrybomPo.setLkyn(dataObject.getString(InvtrybomPo.COLUMNS.LKYN.name())); 
			return invtrybomPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final InvtrybomPo invtrybomPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(InvtrybomPo.COLUMNS.BF_NO.name(), invtrybomPo.getBfNo()); 
			dataObject.setValue(InvtrybomPo.COLUMNS.SET_NO.name(), invtrybomPo.getSetNo()); 
			dataObject.setValue(InvtrybomPo.COLUMNS.CTM_CODE.name(), invtrybomPo.getCtmCode()); 
			dataObject.setValue(InvtrybomPo.COLUMNS.COCOMP_NO.name(), invtrybomPo.getCocompNo()); 
			dataObject.setValue(InvtrybomPo.COLUMNS.RPT.name(), invtrybomPo.getRpt()); 
			dataObject.setValue(InvtrybomPo.COLUMNS.PG.name(), invtrybomPo.getPg()); 
			dataObject.setValue(InvtrybomPo.COLUMNS.BS.name(), invtrybomPo.getBs()); 
			dataObject.setValue(InvtrybomPo.COLUMNS.BHT.name(), invtrybomPo.getBht()); 
			dataObject.setValue(InvtrybomPo.COLUMNS.B1.name(), invtrybomPo.getB1()); 
			dataObject.setValue(InvtrybomPo.COLUMNS.B2.name(), invtrybomPo.getB2()); 
			dataObject.setValue(InvtrybomPo.COLUMNS.B3.name(), invtrybomPo.getB3()); 
			dataObject.setValue(InvtrybomPo.COLUMNS.B4.name(), invtrybomPo.getB4()); 
			dataObject.setValue(InvtrybomPo.COLUMNS.B5.name(), invtrybomPo.getB5()); 
			dataObject.setValue(InvtrybomPo.COLUMNS.B6.name(), invtrybomPo.getB6()); 
			dataObject.setValue(InvtrybomPo.COLUMNS.B7.name(), invtrybomPo.getB7()); 
			dataObject.setValue(InvtrybomPo.COLUMNS.B8.name(), invtrybomPo.getB8()); 
			dataObject.setValue(InvtrybomPo.COLUMNS.B9.name(), invtrybomPo.getB9()); 
			dataObject.setValue(InvtrybomPo.COLUMNS.LKYN.name(), invtrybomPo.getLkyn()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<InvtrybomPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(InvtrybomPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
