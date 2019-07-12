package com.doc.common.dao.impl; 
 
public class OutstockDAOImpl extends GeneralDAOImpl<OutstockDo> implements OutstockDAOImpl { 
	public static final OutstockDAOImpl INSTANCE = new OutstockDAOImpl(); 
	public static final String TABLENAME = "OUTSTOCK"; 

	public OutstockDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<OutstockDo> CONVERTER = new MapConverter<OutstockDo>() { 
 
		@Override 
		public OutstockDo convert(final DataObject dataObject) { 
			final OutstockDo outstockDo = new OutstockDo(); 
			outstockDo.setBondno(dataObject.getString(OutstockDo.COLUMNS.BONDNO.name())); 
			outstockDo.setOutstrno(dataObject.getString(OutstockDo.COLUMNS.OUTSTRNO.name())); 
			outstockDo.setOutdate(dataObject.getString(OutstockDo.COLUMNS.OUTDATE.name())); 
			outstockDo.setDeclno(dataObject.getString(OutstockDo.COLUMNS.DECLNO.name())); 
			outstockDo.setDecltype(dataObject.getString(OutstockDo.COLUMNS.DECLTYPE.name())); 
			outstockDo.setInvoice(dataObject.getString(OutstockDo.COLUMNS.INVOICE.name())); 
			outstockDo.setManifno(dataObject.getString(OutstockDo.COLUMNS.MANIFNO.name())); 
			outstockDo.setVesselno(dataObject.getString(OutstockDo.COLUMNS.VESSELNO.name())); 
			outstockDo.setGdstype(dataObject.getString(OutstockDo.COLUMNS.GDSTYPE.name())); 
			outstockDo.setOptype(dataObject.getString(OutstockDo.COLUMNS.OPTYPE.name())); 
			outstockDo.setPrdttype(dataObject.getString(OutstockDo.COLUMNS.PRDTTYPE.name())); 
			outstockDo.setRefbillno(dataObject.getString(OutstockDo.COLUMNS.REFBILLNO.name())); 
			outstockDo.setCtmcode(dataObject.getString(OutstockDo.COLUMNS.CTMCODE.name())); 
			outstockDo.setRefdeclno(dataObject.getString(OutstockDo.COLUMNS.REFDECLNO.name())); 
			outstockDo.setRefitemno(BigDecimalUtils.formObj(dataObject.getString(OutstockDo.COLUMNS.REFITEMNO.name()))); 
			outstockDo.setRefinpost(dataObject.getString(OutstockDo.COLUMNS.REFINPOST.name())); 
			outstockDo.setUpdtime(dataObject.getString(OutstockDo.COLUMNS.UPDTIME.name())); 
			return outstockDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final OutstockDo outstockDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(OutstockDo.COLUMNS.BONDNO.name(), outstockDo.getBondno()); 
			dataObject.setValue(OutstockDo.COLUMNS.OUTSTRNO.name(), outstockDo.getOutstrno()); 
			dataObject.setValue(OutstockDo.COLUMNS.OUTDATE.name(), outstockDo.getOutdate()); 
			dataObject.setValue(OutstockDo.COLUMNS.DECLNO.name(), outstockDo.getDeclno()); 
			dataObject.setValue(OutstockDo.COLUMNS.DECLTYPE.name(), outstockDo.getDecltype()); 
			dataObject.setValue(OutstockDo.COLUMNS.INVOICE.name(), outstockDo.getInvoice()); 
			dataObject.setValue(OutstockDo.COLUMNS.MANIFNO.name(), outstockDo.getManifno()); 
			dataObject.setValue(OutstockDo.COLUMNS.VESSELNO.name(), outstockDo.getVesselno()); 
			dataObject.setValue(OutstockDo.COLUMNS.GDSTYPE.name(), outstockDo.getGdstype()); 
			dataObject.setValue(OutstockDo.COLUMNS.OPTYPE.name(), outstockDo.getOptype()); 
			dataObject.setValue(OutstockDo.COLUMNS.PRDTTYPE.name(), outstockDo.getPrdttype()); 
			dataObject.setValue(OutstockDo.COLUMNS.REFBILLNO.name(), outstockDo.getRefbillno()); 
			dataObject.setValue(OutstockDo.COLUMNS.CTMCODE.name(), outstockDo.getCtmcode()); 
			dataObject.setValue(OutstockDo.COLUMNS.REFDECLNO.name(), outstockDo.getRefdeclno()); 
			dataObject.setValue(OutstockDo.COLUMNS.REFITEMNO.name(), outstockDo.getRefitemno()); 
			dataObject.setValue(OutstockDo.COLUMNS.REFINPOST.name(), outstockDo.getRefinpost()); 
			dataObject.setValue(OutstockDo.COLUMNS.UPDTIME.name(), outstockDo.getUpdtime()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<OutstockDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(OutstockDo po) { 
		sqlWhere.add(OutstockDo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(OutstockDo.COLUMNS.OUTSTRNO.name(), po.getOutstrno()); 
	} 
 
} 
