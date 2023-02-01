package com.doc.common.dao.impl; 
 
public class FtzbBomdetailDAOImpl extends GeneralDAOImpl<FtzbBomdetailPo> implements FtzbBomdetailDAO { 
	public static final FtzbBomdetailDAOImpl INSTANCE = new FtzbBomdetailDAOImpl(); 
	public static final String TABLENAME = "FTZB_BOMDETAIL"; 

	public FtzbBomdetailDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<FtzbBomdetailPo> CONVERTER = new MapConverter<FtzbBomdetailPo>() { 
 
		@Override 
		public FtzbBomdetailPo convert(final DataObject dataObject) { 
			final FtzbBomdetailPo ftzbBomdetailPo = new FtzbBomdetailPo(); 
			ftzbBomdetailPo.setBondno(dataObject.getString(FtzbBomdetailPo.COLUMNS.BONDNO.name())); 
			ftzbBomdetailPo.setCtmcode(dataObject.getString(FtzbBomdetailPo.COLUMNS.CTMCODE.name())); 
			ftzbBomdetailPo.setPrdtno(dataObject.getString(FtzbBomdetailPo.COLUMNS.PRDTNO.name())); 
			ftzbBomdetailPo.setPartno(dataObject.getString(FtzbBomdetailPo.COLUMNS.PARTNO.name())); 
			ftzbBomdetailPo.setUnitqty(BigDecimalUtils.formObj(dataObject.getValue(FtzbBomdetailPo.COLUMNS.UNITQTY.name()))); 
			ftzbBomdetailPo.setUnit(dataObject.getString(FtzbBomdetailPo.COLUMNS.UNIT.name())); 
			ftzbBomdetailPo.setRemarks(dataObject.getString(FtzbBomdetailPo.COLUMNS.REMARKS.name())); 
			ftzbBomdetailPo.setDescrip(dataObject.getString(FtzbBomdetailPo.COLUMNS.DESCRIP.name())); 
			ftzbBomdetailPo.setModel(dataObject.getString(FtzbBomdetailPo.COLUMNS.MODEL.name())); 
			ftzbBomdetailPo.setSpec(dataObject.getString(FtzbBomdetailPo.COLUMNS.SPEC.name())); 
			ftzbBomdetailPo.setGoodqty(BigDecimalUtils.formObj(dataObject.getValue(FtzbBomdetailPo.COLUMNS.GOODQTY.name()))); 
			ftzbBomdetailPo.setBadqty(BigDecimalUtils.formObj(dataObject.getValue(FtzbBomdetailPo.COLUMNS.BADQTY.name()))); 
			ftzbBomdetailPo.setMixqty(BigDecimalUtils.formObj(dataObject.getValue(FtzbBomdetailPo.COLUMNS.MIXQTY.name()))); 
			ftzbBomdetailPo.setBomrate(BigDecimalUtils.formObj(dataObject.getValue(FtzbBomdetailPo.COLUMNS.BOMRATE.name()))); 
			ftzbBomdetailPo.setBomdate(dataObject.getString(FtzbBomdetailPo.COLUMNS.BOMDATE.name())); 
			ftzbBomdetailPo.setApprovedno(dataObject.getString(FtzbBomdetailPo.COLUMNS.APPROVEDNO.name())); 
			ftzbBomdetailPo.setRmk(dataObject.getString(FtzbBomdetailPo.COLUMNS.RMK.name())); 
			ftzbBomdetailPo.setSeqno(BigDecimalUtils.formObj(dataObject.getValue(FtzbBomdetailPo.COLUMNS.SEQNO.name()))); 
			return ftzbBomdetailPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final FtzbBomdetailPo ftzbBomdetailPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(FtzbBomdetailPo.COLUMNS.BONDNO.name(), ftzbBomdetailPo.getBondno()); 
			dataObject.setValue(FtzbBomdetailPo.COLUMNS.CTMCODE.name(), ftzbBomdetailPo.getCtmcode()); 
			dataObject.setValue(FtzbBomdetailPo.COLUMNS.PRDTNO.name(), ftzbBomdetailPo.getPrdtno()); 
			dataObject.setValue(FtzbBomdetailPo.COLUMNS.PARTNO.name(), ftzbBomdetailPo.getPartno()); 
			dataObject.setValue(FtzbBomdetailPo.COLUMNS.UNITQTY.name(), ftzbBomdetailPo.getUnitqty()); 
			dataObject.setValue(FtzbBomdetailPo.COLUMNS.UNIT.name(), ftzbBomdetailPo.getUnit()); 
			dataObject.setValue(FtzbBomdetailPo.COLUMNS.REMARKS.name(), ftzbBomdetailPo.getRemarks()); 
			dataObject.setValue(FtzbBomdetailPo.COLUMNS.DESCRIP.name(), ftzbBomdetailPo.getDescrip()); 
			dataObject.setValue(FtzbBomdetailPo.COLUMNS.MODEL.name(), ftzbBomdetailPo.getModel()); 
			dataObject.setValue(FtzbBomdetailPo.COLUMNS.SPEC.name(), ftzbBomdetailPo.getSpec()); 
			dataObject.setValue(FtzbBomdetailPo.COLUMNS.GOODQTY.name(), ftzbBomdetailPo.getGoodqty()); 
			dataObject.setValue(FtzbBomdetailPo.COLUMNS.BADQTY.name(), ftzbBomdetailPo.getBadqty()); 
			dataObject.setValue(FtzbBomdetailPo.COLUMNS.MIXQTY.name(), ftzbBomdetailPo.getMixqty()); 
			dataObject.setValue(FtzbBomdetailPo.COLUMNS.BOMRATE.name(), ftzbBomdetailPo.getBomrate()); 
			dataObject.setValue(FtzbBomdetailPo.COLUMNS.BOMDATE.name(), ftzbBomdetailPo.getBomdate()); 
			dataObject.setValue(FtzbBomdetailPo.COLUMNS.APPROVEDNO.name(), ftzbBomdetailPo.getApprovedno()); 
			dataObject.setValue(FtzbBomdetailPo.COLUMNS.RMK.name(), ftzbBomdetailPo.getRmk()); 
			dataObject.setValue(FtzbBomdetailPo.COLUMNS.SEQNO.name(), ftzbBomdetailPo.getSeqno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<FtzbBomdetailPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(FtzbBomdetailPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
