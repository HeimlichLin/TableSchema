package com.doc.common.dao.impl; 
 
public class OutstockDAOImpl extends GeneralDAOImpl<OutstockPo> implements OutstockDAO { 
	public static final OutstockDAOImpl INSTANCE = new OutstockDAOImpl(); 
	public static final String TABLENAME = "OUTSTOCK"; 

	public OutstockDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<OutstockPo> CONVERTER = new MapConverter<OutstockPo>() { 
 
		@Override 
		public OutstockPo convert(final DataObject dataObject) { 
			final OutstockPo outstockPo = new OutstockPo(); 
			outstockPo.setBondno(dataObject.getString(OutstockPo.COLUMNS.BONDNO.name())); 
			outstockPo.setOutstrno(dataObject.getString(OutstockPo.COLUMNS.OUTSTRNO.name())); 
			outstockPo.setOutdate(dataObject.getString(OutstockPo.COLUMNS.OUTDATE.name())); 
			outstockPo.setDeclno(dataObject.getString(OutstockPo.COLUMNS.DECLNO.name())); 
			outstockPo.setDecltype(dataObject.getString(OutstockPo.COLUMNS.DECLTYPE.name())); 
			outstockPo.setInvoice(dataObject.getString(OutstockPo.COLUMNS.INVOICE.name())); 
			outstockPo.setManifno(dataObject.getString(OutstockPo.COLUMNS.MANIFNO.name())); 
			outstockPo.setVesselno(dataObject.getString(OutstockPo.COLUMNS.VESSELNO.name())); 
			outstockPo.setGdstype(dataObject.getString(OutstockPo.COLUMNS.GDSTYPE.name())); 
			outstockPo.setOptype(dataObject.getString(OutstockPo.COLUMNS.OPTYPE.name())); 
			outstockPo.setPrdttype(dataObject.getString(OutstockPo.COLUMNS.PRDTTYPE.name())); 
			outstockPo.setRefbillno(dataObject.getString(OutstockPo.COLUMNS.REFBILLNO.name())); 
			outstockPo.setCtmcode(dataObject.getString(OutstockPo.COLUMNS.CTMCODE.name())); 
			outstockPo.setRefdeclno(dataObject.getString(OutstockPo.COLUMNS.REFDECLNO.name())); 
			outstockPo.setRefitemno(BigDecimalUtils.formObj(dataObject.getValue(OutstockPo.COLUMNS.REFITEMNO.name()))); 
			outstockPo.setRefinpost(dataObject.getString(OutstockPo.COLUMNS.REFINPOST.name())); 
			outstockPo.setUpdtime(dataObject.getString(OutstockPo.COLUMNS.UPDTIME.name())); 
			return outstockPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final OutstockPo outstockPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(OutstockPo.COLUMNS.BONDNO.name(), outstockPo.getBondno()); 
			dataObject.setValue(OutstockPo.COLUMNS.OUTSTRNO.name(), outstockPo.getOutstrno()); 
			dataObject.setValue(OutstockPo.COLUMNS.OUTDATE.name(), outstockPo.getOutdate()); 
			dataObject.setValue(OutstockPo.COLUMNS.DECLNO.name(), outstockPo.getDeclno()); 
			dataObject.setValue(OutstockPo.COLUMNS.DECLTYPE.name(), outstockPo.getDecltype()); 
			dataObject.setValue(OutstockPo.COLUMNS.INVOICE.name(), outstockPo.getInvoice()); 
			dataObject.setValue(OutstockPo.COLUMNS.MANIFNO.name(), outstockPo.getManifno()); 
			dataObject.setValue(OutstockPo.COLUMNS.VESSELNO.name(), outstockPo.getVesselno()); 
			dataObject.setValue(OutstockPo.COLUMNS.GDSTYPE.name(), outstockPo.getGdstype()); 
			dataObject.setValue(OutstockPo.COLUMNS.OPTYPE.name(), outstockPo.getOptype()); 
			dataObject.setValue(OutstockPo.COLUMNS.PRDTTYPE.name(), outstockPo.getPrdttype()); 
			dataObject.setValue(OutstockPo.COLUMNS.REFBILLNO.name(), outstockPo.getRefbillno()); 
			dataObject.setValue(OutstockPo.COLUMNS.CTMCODE.name(), outstockPo.getCtmcode()); 
			dataObject.setValue(OutstockPo.COLUMNS.REFDECLNO.name(), outstockPo.getRefdeclno()); 
			dataObject.setValue(OutstockPo.COLUMNS.REFITEMNO.name(), outstockPo.getRefitemno()); 
			dataObject.setValue(OutstockPo.COLUMNS.REFINPOST.name(), outstockPo.getRefinpost()); 
			dataObject.setValue(OutstockPo.COLUMNS.UPDTIME.name(), outstockPo.getUpdtime()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<OutstockPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(OutstockPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(OutstockPo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(OutstockPo.COLUMNS.OUTSTRNO.name(), po.getOutstrno()); 
		return sqlWhere; 
	} 
 
} 
