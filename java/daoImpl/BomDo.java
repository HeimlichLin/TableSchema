package com.doc.common.dao.impl; 
 
public class BomDAO extends GeneralDAOImpl<BomDo> implements BomDAO { 
	public static final BomDAOImpl INSTANCE = new BomDAOImpl(); 
	public static final String TABLENAME = "BOM"; 

	public BomDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<BomDo> CONVERTER = new MapConverter<BomDo>() { 
 
		@Override 
		public BomDo convert(final DataObject dataObject) { 
			final BomDo bomDo = new BomDo(); 
			bomDo.setBondno(dataObject.getString(BomDo.COLUMNS.BONDNO.name())); 
			bomDo.setCtmcode(dataObject.getString(BomDo.COLUMNS.CTMCODE.name())); 
			bomDo.setPrdtno(dataObject.getString(BomDo.COLUMNS.PRDTNO.name())); 
			bomDo.setPrdtname(dataObject.getString(BomDo.COLUMNS.PRDTNAME.name())); 
			bomDo.setPrdtspec(dataObject.getString(BomDo.COLUMNS.PRDTSPEC.name())); 
			bomDo.setPrdtunit(dataObject.getString(BomDo.COLUMNS.PRDTUNIT.name())); 
			bomDo.setProcess(dataObject.getString(BomDo.COLUMNS.PROCESS.name())); 
			bomDo.setWhs(BigDecimalUtils.formObj(dataObject.getString(BomDo.COLUMNS.WHS.name()))); 
			bomDo.setApprovedno(dataObject.getString(BomDo.COLUMNS.APPROVEDNO.name())); 
			bomDo.setBomno(dataObject.getString(BomDo.COLUMNS.BOMNO.name())); 
			bomDo.setBomdate(dataObject.getString(BomDo.COLUMNS.BOMDATE.name())); 
			bomDo.setBomtype(dataObject.getString(BomDo.COLUMNS.BOMTYPE.name())); 
			return bomDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final BomDo bomDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(BomDo.COLUMNS.BONDNO.name(), bomDo.getBondno()); 
			dataObject.setValue(BomDo.COLUMNS.CTMCODE.name(), bomDo.getCtmcode()); 
			dataObject.setValue(BomDo.COLUMNS.PRDTNO.name(), bomDo.getPrdtno()); 
			dataObject.setValue(BomDo.COLUMNS.PRDTNAME.name(), bomDo.getPrdtname()); 
			dataObject.setValue(BomDo.COLUMNS.PRDTSPEC.name(), bomDo.getPrdtspec()); 
			dataObject.setValue(BomDo.COLUMNS.PRDTUNIT.name(), bomDo.getPrdtunit()); 
			dataObject.setValue(BomDo.COLUMNS.PROCESS.name(), bomDo.getProcess()); 
			dataObject.setValue(BomDo.COLUMNS.WHS.name(), bomDo.getWhs()); 
			dataObject.setValue(BomDo.COLUMNS.APPROVEDNO.name(), bomDo.getApprovedno()); 
			dataObject.setValue(BomDo.COLUMNS.BOMNO.name(), bomDo.getBomno()); 
			dataObject.setValue(BomDo.COLUMNS.BOMDATE.name(), bomDo.getBomdate()); 
			dataObject.setValue(BomDo.COLUMNS.BOMTYPE.name(), bomDo.getBomtype()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<BomDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(BomDo po) { 
		sqlWhere.add(BomDo.COLUMNS.PRDTNAME.name(), po.getPrdtname()); 
		sqlWhere.add(BomDo.COLUMNS.PRDTSPEC.name(), po.getPrdtspec()); 
		sqlWhere.add(BomDo.COLUMNS.PRDTUNIT.name(), po.getPrdtunit()); 
		sqlWhere.add(BomDo.COLUMNS.PROCESS.name(), po.getProcess()); 
		sqlWhere.add(BomDo.COLUMNS.WHS.name(), po.getWhs()); 
		sqlWhere.add(BomDo.COLUMNS.APPROVEDNO.name(), po.getApprovedno()); 
		sqlWhere.add(BomDo.COLUMNS.BOMNO.name(), po.getBomno()); 
		sqlWhere.add(BomDo.COLUMNS.BOMDATE.name(), po.getBomdate()); 
		sqlWhere.add(BomDo.COLUMNS.BOMTYPE.name(), po.getBomtype()); 
	} 
 
} 
