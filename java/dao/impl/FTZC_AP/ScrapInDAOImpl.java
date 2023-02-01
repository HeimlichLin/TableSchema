package com.doc.common.dao.impl; 
 
public class ScrapInDAOImpl extends GeneralDAOImpl<ScrapInPo> implements ScrapInDAO { 
	public static final ScrapInDAOImpl INSTANCE = new ScrapInDAOImpl(); 
	public static final String TABLENAME = "SCRAP_IN"; 

	public ScrapInDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ScrapInPo> CONVERTER = new MapConverter<ScrapInPo>() { 
 
		@Override 
		public ScrapInPo convert(final DataObject dataObject) { 
			final ScrapInPo scrapInPo = new ScrapInPo(); 
			scrapInPo.setBfNo(dataObject.getString(ScrapInPo.COLUMNS.BF_NO.name())); 
			scrapInPo.setScrapNo(dataObject.getString(ScrapInPo.COLUMNS.SCRAP_NO.name())); 
			scrapInPo.setItem(BigDecimalUtils.formObj(dataObject.getValue(ScrapInPo.COLUMNS.ITEM.name()))); 
			scrapInPo.setPrdtNo(dataObject.getString(ScrapInPo.COLUMNS.PRDT_NO.name())); 
			scrapInPo.setDescrip(dataObject.getString(ScrapInPo.COLUMNS.DESCRIP.name())); 
			scrapInPo.setQty(BigDecimalUtils.formObj(dataObject.getValue(ScrapInPo.COLUMNS.QTY.name()))); 
			scrapInPo.setUnit(dataObject.getString(ScrapInPo.COLUMNS.UNIT.name())); 
			scrapInPo.setUnitPrice(BigDecimalUtils.formObj(dataObject.getValue(ScrapInPo.COLUMNS.UNIT_PRICE.name()))); 
			scrapInPo.setValueAmt(BigDecimalUtils.formObj(dataObject.getValue(ScrapInPo.COLUMNS.VALUE_AMT.name()))); 
			scrapInPo.setInPost(dataObject.getString(ScrapInPo.COLUMNS.IN_POST.name())); 
			scrapInPo.setDeclNo(dataObject.getString(ScrapInPo.COLUMNS.DECL_NO.name())); 
			return scrapInPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ScrapInPo scrapInPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ScrapInPo.COLUMNS.BF_NO.name(), scrapInPo.getBfNo()); 
			dataObject.setValue(ScrapInPo.COLUMNS.SCRAP_NO.name(), scrapInPo.getScrapNo()); 
			dataObject.setValue(ScrapInPo.COLUMNS.ITEM.name(), scrapInPo.getItem()); 
			dataObject.setValue(ScrapInPo.COLUMNS.PRDT_NO.name(), scrapInPo.getPrdtNo()); 
			dataObject.setValue(ScrapInPo.COLUMNS.DESCRIP.name(), scrapInPo.getDescrip()); 
			dataObject.setValue(ScrapInPo.COLUMNS.QTY.name(), scrapInPo.getQty()); 
			dataObject.setValue(ScrapInPo.COLUMNS.UNIT.name(), scrapInPo.getUnit()); 
			dataObject.setValue(ScrapInPo.COLUMNS.UNIT_PRICE.name(), scrapInPo.getUnitPrice()); 
			dataObject.setValue(ScrapInPo.COLUMNS.VALUE_AMT.name(), scrapInPo.getValueAmt()); 
			dataObject.setValue(ScrapInPo.COLUMNS.IN_POST.name(), scrapInPo.getInPost()); 
			dataObject.setValue(ScrapInPo.COLUMNS.DECL_NO.name(), scrapInPo.getDeclNo()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ScrapInPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ScrapInPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(ScrapInPo.COLUMNS.BF_NO.name(), po.getBfNo()); 
		sqlWhere.add(ScrapInPo.COLUMNS.SCRAP_NO.name(), po.getScrapNo()); 
		sqlWhere.add(ScrapInPo.COLUMNS.ITEM.name(), po.getItem()); 
		sqlWhere.add(ScrapInPo.COLUMNS.IN_POST.name(), po.getInPost()); 
		return sqlWhere; 
	} 
 
} 
