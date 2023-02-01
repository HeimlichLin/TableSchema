package com.doc.common.dao.impl; 
 
public class ScrapItemDAOImpl extends GeneralDAOImpl<ScrapItemPo> implements ScrapItemDAO { 
	public static final ScrapItemDAOImpl INSTANCE = new ScrapItemDAOImpl(); 
	public static final String TABLENAME = "SCRAP_ITEM"; 

	public ScrapItemDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ScrapItemPo> CONVERTER = new MapConverter<ScrapItemPo>() { 
 
		@Override 
		public ScrapItemPo convert(final DataObject dataObject) { 
			final ScrapItemPo scrapItemPo = new ScrapItemPo(); 
			scrapItemPo.setBfNo(dataObject.getString(ScrapItemPo.COLUMNS.BF_NO.name())); 
			scrapItemPo.setScrapNo(dataObject.getString(ScrapItemPo.COLUMNS.SCRAP_NO.name())); 
			scrapItemPo.setItem(BigDecimalUtils.formObj(dataObject.getValue(ScrapItemPo.COLUMNS.ITEM.name()))); 
			scrapItemPo.setPrdtNo(dataObject.getString(ScrapItemPo.COLUMNS.PRDT_NO.name())); 
			scrapItemPo.setDescrip(dataObject.getString(ScrapItemPo.COLUMNS.DESCRIP.name())); 
			scrapItemPo.setPrdtQty(BigDecimalUtils.formObj(dataObject.getValue(ScrapItemPo.COLUMNS.PRDT_QTY.name()))); 
			scrapItemPo.setUnitPrice(BigDecimalUtils.formObj(dataObject.getValue(ScrapItemPo.COLUMNS.UNIT_PRICE.name()))); 
			scrapItemPo.setNet(BigDecimalUtils.formObj(dataObject.getValue(ScrapItemPo.COLUMNS.NET.name()))); 
			scrapItemPo.setODeclNo(dataObject.getString(ScrapItemPo.COLUMNS.O_DECL_NO.name())); 
			scrapItemPo.setOItemNo(BigDecimalUtils.formObj(dataObject.getValue(ScrapItemPo.COLUMNS.O_ITEM_NO.name()))); 
			scrapItemPo.setPrdtUnit(dataObject.getString(ScrapItemPo.COLUMNS.PRDT_UNIT.name())); 
			scrapItemPo.setOutPost(dataObject.getString(ScrapItemPo.COLUMNS.OUT_POST.name())); 
			scrapItemPo.setBomNo(dataObject.getString(ScrapItemPo.COLUMNS.BOM_NO.name())); 
			scrapItemPo.setOGdsType(dataObject.getString(ScrapItemPo.COLUMNS.O_GDS_TYPE.name())); 
			scrapItemPo.setRowPrdtNo(dataObject.getString(ScrapItemPo.COLUMNS.ROW_PRDT_NO.name())); 
			scrapItemPo.setRowQty(BigDecimalUtils.formObj(dataObject.getValue(ScrapItemPo.COLUMNS.ROW_QTY.name()))); 
			scrapItemPo.setRemrks(dataObject.getString(ScrapItemPo.COLUMNS.REMRKS.name())); 
			return scrapItemPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ScrapItemPo scrapItemPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ScrapItemPo.COLUMNS.BF_NO.name(), scrapItemPo.getBfNo()); 
			dataObject.setValue(ScrapItemPo.COLUMNS.SCRAP_NO.name(), scrapItemPo.getScrapNo()); 
			dataObject.setValue(ScrapItemPo.COLUMNS.ITEM.name(), scrapItemPo.getItem()); 
			dataObject.setValue(ScrapItemPo.COLUMNS.PRDT_NO.name(), scrapItemPo.getPrdtNo()); 
			dataObject.setValue(ScrapItemPo.COLUMNS.DESCRIP.name(), scrapItemPo.getDescrip()); 
			dataObject.setValue(ScrapItemPo.COLUMNS.PRDT_QTY.name(), scrapItemPo.getPrdtQty()); 
			dataObject.setValue(ScrapItemPo.COLUMNS.UNIT_PRICE.name(), scrapItemPo.getUnitPrice()); 
			dataObject.setValue(ScrapItemPo.COLUMNS.NET.name(), scrapItemPo.getNet()); 
			dataObject.setValue(ScrapItemPo.COLUMNS.O_DECL_NO.name(), scrapItemPo.getODeclNo()); 
			dataObject.setValue(ScrapItemPo.COLUMNS.O_ITEM_NO.name(), scrapItemPo.getOItemNo()); 
			dataObject.setValue(ScrapItemPo.COLUMNS.PRDT_UNIT.name(), scrapItemPo.getPrdtUnit()); 
			dataObject.setValue(ScrapItemPo.COLUMNS.OUT_POST.name(), scrapItemPo.getOutPost()); 
			dataObject.setValue(ScrapItemPo.COLUMNS.BOM_NO.name(), scrapItemPo.getBomNo()); 
			dataObject.setValue(ScrapItemPo.COLUMNS.O_GDS_TYPE.name(), scrapItemPo.getOGdsType()); 
			dataObject.setValue(ScrapItemPo.COLUMNS.ROW_PRDT_NO.name(), scrapItemPo.getRowPrdtNo()); 
			dataObject.setValue(ScrapItemPo.COLUMNS.ROW_QTY.name(), scrapItemPo.getRowQty()); 
			dataObject.setValue(ScrapItemPo.COLUMNS.REMRKS.name(), scrapItemPo.getRemrks()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ScrapItemPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ScrapItemPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(ScrapItemPo.COLUMNS.BF_NO.name(), po.getBfNo()); 
		sqlWhere.add(ScrapItemPo.COLUMNS.SCRAP_NO.name(), po.getScrapNo()); 
		sqlWhere.add(ScrapItemPo.COLUMNS.ITEM.name(), po.getItem()); 
		sqlWhere.add(ScrapItemPo.COLUMNS.OUT_POST.name(), po.getOutPost()); 
		return sqlWhere; 
	} 
 
} 
