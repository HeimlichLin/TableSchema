package com.doc.common.dao.impl; 
 
public class InstockDAOImpl extends GeneralDAOImpl<InstockDo> implements InstockDAOImpl { 
	public static final InstockDAOImpl INSTANCE = new InstockDAOImpl(); 
	public static final String TABLENAME = "INSTOCK"; 

	public InstockDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<InstockDo> CONVERTER = new MapConverter<InstockDo>() { 
 
		@Override 
		public InstockDo convert(final DataObject dataObject) { 
			final InstockDo instockDo = new InstockDo(); 
			instockDo.setBondno(dataObject.getString(InstockDo.COLUMNS.BONDNO.name())); 
			instockDo.setStockno(dataObject.getString(InstockDo.COLUMNS.STOCKNO.name())); 
			instockDo.setIndate(dataObject.getString(InstockDo.COLUMNS.INDATE.name())); 
			instockDo.setDeclno(dataObject.getString(InstockDo.COLUMNS.DECLNO.name())); 
			instockDo.setDecltype(dataObject.getString(InstockDo.COLUMNS.DECLTYPE.name())); 
			instockDo.setInvoice(dataObject.getString(InstockDo.COLUMNS.INVOICE.name())); 
			instockDo.setManifno(dataObject.getString(InstockDo.COLUMNS.MANIFNO.name())); 
			instockDo.setVesselno(dataObject.getString(InstockDo.COLUMNS.VESSELNO.name())); 
			instockDo.setGdstype(dataObject.getString(InstockDo.COLUMNS.GDSTYPE.name())); 
			instockDo.setOptype(dataObject.getString(InstockDo.COLUMNS.OPTYPE.name())); 
			instockDo.setPrdttype(dataObject.getString(InstockDo.COLUMNS.PRDTTYPE.name())); 
			instockDo.setRefbillno(dataObject.getString(InstockDo.COLUMNS.REFBILLNO.name())); 
			instockDo.setCtmcode(dataObject.getString(InstockDo.COLUMNS.CTMCODE.name())); 
			instockDo.setUpdtime(dataObject.getString(InstockDo.COLUMNS.UPDTIME.name())); 
			return instockDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final InstockDo instockDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(InstockDo.COLUMNS.BONDNO.name(), instockDo.getBondno()); 
			dataObject.setValue(InstockDo.COLUMNS.STOCKNO.name(), instockDo.getStockno()); 
			dataObject.setValue(InstockDo.COLUMNS.INDATE.name(), instockDo.getIndate()); 
			dataObject.setValue(InstockDo.COLUMNS.DECLNO.name(), instockDo.getDeclno()); 
			dataObject.setValue(InstockDo.COLUMNS.DECLTYPE.name(), instockDo.getDecltype()); 
			dataObject.setValue(InstockDo.COLUMNS.INVOICE.name(), instockDo.getInvoice()); 
			dataObject.setValue(InstockDo.COLUMNS.MANIFNO.name(), instockDo.getManifno()); 
			dataObject.setValue(InstockDo.COLUMNS.VESSELNO.name(), instockDo.getVesselno()); 
			dataObject.setValue(InstockDo.COLUMNS.GDSTYPE.name(), instockDo.getGdstype()); 
			dataObject.setValue(InstockDo.COLUMNS.OPTYPE.name(), instockDo.getOptype()); 
			dataObject.setValue(InstockDo.COLUMNS.PRDTTYPE.name(), instockDo.getPrdttype()); 
			dataObject.setValue(InstockDo.COLUMNS.REFBILLNO.name(), instockDo.getRefbillno()); 
			dataObject.setValue(InstockDo.COLUMNS.CTMCODE.name(), instockDo.getCtmcode()); 
			dataObject.setValue(InstockDo.COLUMNS.UPDTIME.name(), instockDo.getUpdtime()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<InstockDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(InstockDo po) { 
		sqlWhere.add(InstockDo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(InstockDo.COLUMNS.STOCKNO.name(), po.getStockno()); 
	} 
 
} 
