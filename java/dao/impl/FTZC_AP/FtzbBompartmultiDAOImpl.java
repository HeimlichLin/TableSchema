package com.doc.common.dao.impl; 
 
public class FtzbBompartmultiDAOImpl extends GeneralDAOImpl<FtzbBompartmultiPo> implements FtzbBompartmultiDAO { 
	public static final FtzbBompartmultiDAOImpl INSTANCE = new FtzbBompartmultiDAOImpl(); 
	public static final String TABLENAME = "FTZB_BOMPARTMULTI"; 

	public FtzbBompartmultiDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<FtzbBompartmultiPo> CONVERTER = new MapConverter<FtzbBompartmultiPo>() { 
 
		@Override 
		public FtzbBompartmultiPo convert(final DataObject dataObject) { 
			final FtzbBompartmultiPo ftzbBompartmultiPo = new FtzbBompartmultiPo(); 
			ftzbBompartmultiPo.setBondno(dataObject.getString(FtzbBompartmultiPo.COLUMNS.BONDNO.name())); 
			ftzbBompartmultiPo.setCtmcode(dataObject.getString(FtzbBompartmultiPo.COLUMNS.CTMCODE.name())); 
			ftzbBompartmultiPo.setPrdtno(dataObject.getString(FtzbBompartmultiPo.COLUMNS.PRDTNO.name())); 
			ftzbBompartmultiPo.setPartno(dataObject.getString(FtzbBompartmultiPo.COLUMNS.PARTNO.name())); 
			ftzbBompartmultiPo.setPartno2(dataObject.getString(FtzbBompartmultiPo.COLUMNS.PARTNO2.name())); 
			ftzbBompartmultiPo.setUnitqty(BigDecimalUtils.formObj(dataObject.getValue(FtzbBompartmultiPo.COLUMNS.UNITQTY.name()))); 
			ftzbBompartmultiPo.setUnit(dataObject.getString(FtzbBompartmultiPo.COLUMNS.UNIT.name())); 
			ftzbBompartmultiPo.setDescrip(dataObject.getString(FtzbBompartmultiPo.COLUMNS.DESCRIP.name())); 
			ftzbBompartmultiPo.setItem(BigDecimalUtils.formObj(dataObject.getValue(FtzbBompartmultiPo.COLUMNS.ITEM.name()))); 
			ftzbBompartmultiPo.setUpdtime(dataObject.getString(FtzbBompartmultiPo.COLUMNS.UPDTIME.name())); 
			ftzbBompartmultiPo.setBomdate(dataObject.getString(FtzbBompartmultiPo.COLUMNS.BOMDATE.name())); 
			return ftzbBompartmultiPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final FtzbBompartmultiPo ftzbBompartmultiPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(FtzbBompartmultiPo.COLUMNS.BONDNO.name(), ftzbBompartmultiPo.getBondno()); 
			dataObject.setValue(FtzbBompartmultiPo.COLUMNS.CTMCODE.name(), ftzbBompartmultiPo.getCtmcode()); 
			dataObject.setValue(FtzbBompartmultiPo.COLUMNS.PRDTNO.name(), ftzbBompartmultiPo.getPrdtno()); 
			dataObject.setValue(FtzbBompartmultiPo.COLUMNS.PARTNO.name(), ftzbBompartmultiPo.getPartno()); 
			dataObject.setValue(FtzbBompartmultiPo.COLUMNS.PARTNO2.name(), ftzbBompartmultiPo.getPartno2()); 
			dataObject.setValue(FtzbBompartmultiPo.COLUMNS.UNITQTY.name(), ftzbBompartmultiPo.getUnitqty()); 
			dataObject.setValue(FtzbBompartmultiPo.COLUMNS.UNIT.name(), ftzbBompartmultiPo.getUnit()); 
			dataObject.setValue(FtzbBompartmultiPo.COLUMNS.DESCRIP.name(), ftzbBompartmultiPo.getDescrip()); 
			dataObject.setValue(FtzbBompartmultiPo.COLUMNS.ITEM.name(), ftzbBompartmultiPo.getItem()); 
			dataObject.setValue(FtzbBompartmultiPo.COLUMNS.UPDTIME.name(), ftzbBompartmultiPo.getUpdtime()); 
			dataObject.setValue(FtzbBompartmultiPo.COLUMNS.BOMDATE.name(), ftzbBompartmultiPo.getBomdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<FtzbBompartmultiPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(FtzbBompartmultiPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
