package com.doc.common.dao.impl; 
 
public class InstockDAOImpl extends GeneralDAOImpl<InstockPo> implements InstockDAO { 
	public static final InstockDAOImpl INSTANCE = new InstockDAOImpl(); 
	public static final String TABLENAME = "INSTOCK"; 

	public InstockDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<InstockPo> CONVERTER = new MapConverter<InstockPo>() { 
 
		@Override 
		public InstockPo convert(final DataObject dataObject) { 
			final InstockPo instockPo = new InstockPo(); 
			instockPo.setBondno(dataObject.getString(InstockPo.COLUMNS.BONDNO.name())); 
			instockPo.setStockno(dataObject.getString(InstockPo.COLUMNS.STOCKNO.name())); 
			instockPo.setIndate(dataObject.getString(InstockPo.COLUMNS.INDATE.name())); 
			instockPo.setDeclno(dataObject.getString(InstockPo.COLUMNS.DECLNO.name())); 
			instockPo.setDecltype(dataObject.getString(InstockPo.COLUMNS.DECLTYPE.name())); 
			instockPo.setInvoice(dataObject.getString(InstockPo.COLUMNS.INVOICE.name())); 
			instockPo.setManifno(dataObject.getString(InstockPo.COLUMNS.MANIFNO.name())); 
			instockPo.setVesselno(dataObject.getString(InstockPo.COLUMNS.VESSELNO.name())); 
			instockPo.setGdstype(dataObject.getString(InstockPo.COLUMNS.GDSTYPE.name())); 
			instockPo.setOptype(dataObject.getString(InstockPo.COLUMNS.OPTYPE.name())); 
			instockPo.setPrdttype(dataObject.getString(InstockPo.COLUMNS.PRDTTYPE.name())); 
			instockPo.setRefbillno(dataObject.getString(InstockPo.COLUMNS.REFBILLNO.name())); 
			instockPo.setCtmcode(dataObject.getString(InstockPo.COLUMNS.CTMCODE.name())); 
			instockPo.setUpdtime(dataObject.getString(InstockPo.COLUMNS.UPDTIME.name())); 
			return instockPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final InstockPo instockPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(InstockPo.COLUMNS.BONDNO.name(), instockPo.getBondno()); 
			dataObject.setValue(InstockPo.COLUMNS.STOCKNO.name(), instockPo.getStockno()); 
			dataObject.setValue(InstockPo.COLUMNS.INDATE.name(), instockPo.getIndate()); 
			dataObject.setValue(InstockPo.COLUMNS.DECLNO.name(), instockPo.getDeclno()); 
			dataObject.setValue(InstockPo.COLUMNS.DECLTYPE.name(), instockPo.getDecltype()); 
			dataObject.setValue(InstockPo.COLUMNS.INVOICE.name(), instockPo.getInvoice()); 
			dataObject.setValue(InstockPo.COLUMNS.MANIFNO.name(), instockPo.getManifno()); 
			dataObject.setValue(InstockPo.COLUMNS.VESSELNO.name(), instockPo.getVesselno()); 
			dataObject.setValue(InstockPo.COLUMNS.GDSTYPE.name(), instockPo.getGdstype()); 
			dataObject.setValue(InstockPo.COLUMNS.OPTYPE.name(), instockPo.getOptype()); 
			dataObject.setValue(InstockPo.COLUMNS.PRDTTYPE.name(), instockPo.getPrdttype()); 
			dataObject.setValue(InstockPo.COLUMNS.REFBILLNO.name(), instockPo.getRefbillno()); 
			dataObject.setValue(InstockPo.COLUMNS.CTMCODE.name(), instockPo.getCtmcode()); 
			dataObject.setValue(InstockPo.COLUMNS.UPDTIME.name(), instockPo.getUpdtime()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<InstockPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(InstockPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(InstockPo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(InstockPo.COLUMNS.STOCKNO.name(), po.getStockno()); 
		return sqlWhere; 
	} 
 
} 
