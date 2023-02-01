package com.doc.common.dao.impl; 
 
public class BomDAOImpl extends GeneralDAOImpl<BomPo> implements BomDAO { 
	public static final BomDAOImpl INSTANCE = new BomDAOImpl(); 
	public static final String TABLENAME = "BOM"; 

	public BomDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<BomPo> CONVERTER = new MapConverter<BomPo>() { 
 
		@Override 
		public BomPo convert(final DataObject dataObject) { 
			final BomPo bomPo = new BomPo(); 
			bomPo.setBondno(dataObject.getString(BomPo.COLUMNS.BONDNO.name())); 
			bomPo.setCtmcode(dataObject.getString(BomPo.COLUMNS.CTMCODE.name())); 
			bomPo.setPrdtno(dataObject.getString(BomPo.COLUMNS.PRDTNO.name())); 
			bomPo.setPrdtname(dataObject.getString(BomPo.COLUMNS.PRDTNAME.name())); 
			bomPo.setPrdtspec(dataObject.getString(BomPo.COLUMNS.PRDTSPEC.name())); 
			bomPo.setPrdtunit(dataObject.getString(BomPo.COLUMNS.PRDTUNIT.name())); 
			bomPo.setProcess(dataObject.getString(BomPo.COLUMNS.PROCESS.name())); 
			bomPo.setWhs(BigDecimalUtils.formObj(dataObject.getValue(BomPo.COLUMNS.WHS.name()))); 
			bomPo.setApprovedno(dataObject.getString(BomPo.COLUMNS.APPROVEDNO.name())); 
			bomPo.setBomno(dataObject.getString(BomPo.COLUMNS.BOMNO.name())); 
			bomPo.setBomdate(dataObject.getString(BomPo.COLUMNS.BOMDATE.name())); 
			bomPo.setBomtype(dataObject.getString(BomPo.COLUMNS.BOMTYPE.name())); 
			return bomPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final BomPo bomPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(BomPo.COLUMNS.BONDNO.name(), bomPo.getBondno()); 
			dataObject.setValue(BomPo.COLUMNS.CTMCODE.name(), bomPo.getCtmcode()); 
			dataObject.setValue(BomPo.COLUMNS.PRDTNO.name(), bomPo.getPrdtno()); 
			dataObject.setValue(BomPo.COLUMNS.PRDTNAME.name(), bomPo.getPrdtname()); 
			dataObject.setValue(BomPo.COLUMNS.PRDTSPEC.name(), bomPo.getPrdtspec()); 
			dataObject.setValue(BomPo.COLUMNS.PRDTUNIT.name(), bomPo.getPrdtunit()); 
			dataObject.setValue(BomPo.COLUMNS.PROCESS.name(), bomPo.getProcess()); 
			dataObject.setValue(BomPo.COLUMNS.WHS.name(), bomPo.getWhs()); 
			dataObject.setValue(BomPo.COLUMNS.APPROVEDNO.name(), bomPo.getApprovedno()); 
			dataObject.setValue(BomPo.COLUMNS.BOMNO.name(), bomPo.getBomno()); 
			dataObject.setValue(BomPo.COLUMNS.BOMDATE.name(), bomPo.getBomdate()); 
			dataObject.setValue(BomPo.COLUMNS.BOMTYPE.name(), bomPo.getBomtype()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<BomPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(BomPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(BomPo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(BomPo.COLUMNS.CTMCODE.name(), po.getCtmcode()); 
		sqlWhere.add(BomPo.COLUMNS.PRDTNO.name(), po.getPrdtno()); 
		return sqlWhere; 
	} 
 
} 
