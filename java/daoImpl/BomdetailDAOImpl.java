package com.doc.common.dao.impl; 
 
public class BomdetailDAOImpl extends GeneralDAOImpl<BomdetailDo> implements BomdetailDAOImpl { 
	public static final BomdetailDAOImpl INSTANCE = new BomdetailDAOImpl(); 
	public static final String TABLENAME = "BOMDETAIL"; 

	public BomdetailDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<BomdetailDo> CONVERTER = new MapConverter<BomdetailDo>() { 
 
		@Override 
		public BomdetailDo convert(final DataObject dataObject) { 
			final BomdetailDo bomdetailDo = new BomdetailDo(); 
			bomdetailDo.setBondno(dataObject.getString(BomdetailDo.COLUMNS.BONDNO.name())); 
			bomdetailDo.setCtmcode(dataObject.getString(BomdetailDo.COLUMNS.CTMCODE.name())); 
			bomdetailDo.setPrdtno(dataObject.getString(BomdetailDo.COLUMNS.PRDTNO.name())); 
			bomdetailDo.setPartno(dataObject.getString(BomdetailDo.COLUMNS.PARTNO.name())); 
			bomdetailDo.setUnitqty(BigDecimalUtils.formObj(dataObject.getString(BomdetailDo.COLUMNS.UNITQTY.name()))); 
			bomdetailDo.setUnit(dataObject.getString(BomdetailDo.COLUMNS.UNIT.name())); 
			bomdetailDo.setRemarks(dataObject.getString(BomdetailDo.COLUMNS.REMARKS.name())); 
			bomdetailDo.setDescrip(dataObject.getString(BomdetailDo.COLUMNS.DESCRIP.name())); 
			bomdetailDo.setModel(dataObject.getString(BomdetailDo.COLUMNS.MODEL.name())); 
			bomdetailDo.setSpec(dataObject.getString(BomdetailDo.COLUMNS.SPEC.name())); 
			bomdetailDo.setGoodqty(BigDecimalUtils.formObj(dataObject.getString(BomdetailDo.COLUMNS.GOODQTY.name()))); 
			bomdetailDo.setBadqty(BigDecimalUtils.formObj(dataObject.getString(BomdetailDo.COLUMNS.BADQTY.name()))); 
			bomdetailDo.setMixqty(BigDecimalUtils.formObj(dataObject.getString(BomdetailDo.COLUMNS.MIXQTY.name()))); 
			bomdetailDo.setBomrate(BigDecimalUtils.formObj(dataObject.getString(BomdetailDo.COLUMNS.BOMRATE.name()))); 
			bomdetailDo.setBomdate(dataObject.getString(BomdetailDo.COLUMNS.BOMDATE.name())); 
			return bomdetailDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final BomdetailDo bomdetailDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(BomdetailDo.COLUMNS.BONDNO.name(), bomdetailDo.getBondno()); 
			dataObject.setValue(BomdetailDo.COLUMNS.CTMCODE.name(), bomdetailDo.getCtmcode()); 
			dataObject.setValue(BomdetailDo.COLUMNS.PRDTNO.name(), bomdetailDo.getPrdtno()); 
			dataObject.setValue(BomdetailDo.COLUMNS.PARTNO.name(), bomdetailDo.getPartno()); 
			dataObject.setValue(BomdetailDo.COLUMNS.UNITQTY.name(), bomdetailDo.getUnitqty()); 
			dataObject.setValue(BomdetailDo.COLUMNS.UNIT.name(), bomdetailDo.getUnit()); 
			dataObject.setValue(BomdetailDo.COLUMNS.REMARKS.name(), bomdetailDo.getRemarks()); 
			dataObject.setValue(BomdetailDo.COLUMNS.DESCRIP.name(), bomdetailDo.getDescrip()); 
			dataObject.setValue(BomdetailDo.COLUMNS.MODEL.name(), bomdetailDo.getModel()); 
			dataObject.setValue(BomdetailDo.COLUMNS.SPEC.name(), bomdetailDo.getSpec()); 
			dataObject.setValue(BomdetailDo.COLUMNS.GOODQTY.name(), bomdetailDo.getGoodqty()); 
			dataObject.setValue(BomdetailDo.COLUMNS.BADQTY.name(), bomdetailDo.getBadqty()); 
			dataObject.setValue(BomdetailDo.COLUMNS.MIXQTY.name(), bomdetailDo.getMixqty()); 
			dataObject.setValue(BomdetailDo.COLUMNS.BOMRATE.name(), bomdetailDo.getBomrate()); 
			dataObject.setValue(BomdetailDo.COLUMNS.BOMDATE.name(), bomdetailDo.getBomdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<BomdetailDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(BomdetailDo po) { 
		sqlWhere.add(BomdetailDo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(BomdetailDo.COLUMNS.CTMCODE.name(), po.getCtmcode()); 
		sqlWhere.add(BomdetailDo.COLUMNS.PRDTNO.name(), po.getPrdtno()); 
		sqlWhere.add(BomdetailDo.COLUMNS.PARTNO.name(), po.getPartno()); 
	} 
 
} 
