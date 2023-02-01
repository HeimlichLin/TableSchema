package com.doc.common.dao.impl; 
 
public class BomdetailDAOImpl extends GeneralDAOImpl<BomdetailPo> implements BomdetailDAO { 
	public static final BomdetailDAOImpl INSTANCE = new BomdetailDAOImpl(); 
	public static final String TABLENAME = "BOMDETAIL"; 

	public BomdetailDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<BomdetailPo> CONVERTER = new MapConverter<BomdetailPo>() { 
 
		@Override 
		public BomdetailPo convert(final DataObject dataObject) { 
			final BomdetailPo bomdetailPo = new BomdetailPo(); 
			bomdetailPo.setBondno(dataObject.getString(BomdetailPo.COLUMNS.BONDNO.name())); 
			bomdetailPo.setCtmcode(dataObject.getString(BomdetailPo.COLUMNS.CTMCODE.name())); 
			bomdetailPo.setPrdtno(dataObject.getString(BomdetailPo.COLUMNS.PRDTNO.name())); 
			bomdetailPo.setPartno(dataObject.getString(BomdetailPo.COLUMNS.PARTNO.name())); 
			bomdetailPo.setUnitqty(BigDecimalUtils.formObj(dataObject.getValue(BomdetailPo.COLUMNS.UNITQTY.name()))); 
			bomdetailPo.setUnit(dataObject.getString(BomdetailPo.COLUMNS.UNIT.name())); 
			bomdetailPo.setRemarks(dataObject.getString(BomdetailPo.COLUMNS.REMARKS.name())); 
			bomdetailPo.setDescrip(dataObject.getString(BomdetailPo.COLUMNS.DESCRIP.name())); 
			bomdetailPo.setModel(dataObject.getString(BomdetailPo.COLUMNS.MODEL.name())); 
			bomdetailPo.setSpec(dataObject.getString(BomdetailPo.COLUMNS.SPEC.name())); 
			bomdetailPo.setGoodqty(BigDecimalUtils.formObj(dataObject.getValue(BomdetailPo.COLUMNS.GOODQTY.name()))); 
			bomdetailPo.setBadqty(BigDecimalUtils.formObj(dataObject.getValue(BomdetailPo.COLUMNS.BADQTY.name()))); 
			bomdetailPo.setMixqty(BigDecimalUtils.formObj(dataObject.getValue(BomdetailPo.COLUMNS.MIXQTY.name()))); 
			bomdetailPo.setBomrate(BigDecimalUtils.formObj(dataObject.getValue(BomdetailPo.COLUMNS.BOMRATE.name()))); 
			bomdetailPo.setBomdate(dataObject.getString(BomdetailPo.COLUMNS.BOMDATE.name())); 
			return bomdetailPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final BomdetailPo bomdetailPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(BomdetailPo.COLUMNS.BONDNO.name(), bomdetailPo.getBondno()); 
			dataObject.setValue(BomdetailPo.COLUMNS.CTMCODE.name(), bomdetailPo.getCtmcode()); 
			dataObject.setValue(BomdetailPo.COLUMNS.PRDTNO.name(), bomdetailPo.getPrdtno()); 
			dataObject.setValue(BomdetailPo.COLUMNS.PARTNO.name(), bomdetailPo.getPartno()); 
			dataObject.setValue(BomdetailPo.COLUMNS.UNITQTY.name(), bomdetailPo.getUnitqty()); 
			dataObject.setValue(BomdetailPo.COLUMNS.UNIT.name(), bomdetailPo.getUnit()); 
			dataObject.setValue(BomdetailPo.COLUMNS.REMARKS.name(), bomdetailPo.getRemarks()); 
			dataObject.setValue(BomdetailPo.COLUMNS.DESCRIP.name(), bomdetailPo.getDescrip()); 
			dataObject.setValue(BomdetailPo.COLUMNS.MODEL.name(), bomdetailPo.getModel()); 
			dataObject.setValue(BomdetailPo.COLUMNS.SPEC.name(), bomdetailPo.getSpec()); 
			dataObject.setValue(BomdetailPo.COLUMNS.GOODQTY.name(), bomdetailPo.getGoodqty()); 
			dataObject.setValue(BomdetailPo.COLUMNS.BADQTY.name(), bomdetailPo.getBadqty()); 
			dataObject.setValue(BomdetailPo.COLUMNS.MIXQTY.name(), bomdetailPo.getMixqty()); 
			dataObject.setValue(BomdetailPo.COLUMNS.BOMRATE.name(), bomdetailPo.getBomrate()); 
			dataObject.setValue(BomdetailPo.COLUMNS.BOMDATE.name(), bomdetailPo.getBomdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<BomdetailPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(BomdetailPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(BomdetailPo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(BomdetailPo.COLUMNS.CTMCODE.name(), po.getCtmcode()); 
		sqlWhere.add(BomdetailPo.COLUMNS.PRDTNO.name(), po.getPrdtno()); 
		sqlWhere.add(BomdetailPo.COLUMNS.PARTNO.name(), po.getPartno()); 
		return sqlWhere; 
	} 
 
} 
