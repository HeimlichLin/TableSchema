package com.doc.common.dao.impl; 
 
public class ScrapitemDAO extends GeneralDAOImpl<ScrapitemDo> implements ScrapitemDAO { 
	public static final ScrapitemDAOImpl INSTANCE = new ScrapitemDAOImpl(); 
	public static final String TABLENAME = "SCRAPITEM"; 

	public ScrapitemDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<ScrapitemDo> CONVERTER = new MapConverter<ScrapitemDo>() { 
 
		@Override 
		public ScrapitemDo convert(final DataObject dataObject) { 
			final ScrapitemDo scrapitemDo = new ScrapitemDo(); 
			scrapitemDo.setBondno(dataObject.getString(ScrapitemDo.COLUMNS.BONDNO.name())); 
			scrapitemDo.setScrapno(dataObject.getString(ScrapitemDo.COLUMNS.SCRAPNO.name())); 
			scrapitemDo.setItem(BigDecimalUtils.formObj(dataObject.getString(ScrapitemDo.COLUMNS.ITEM.name()))); 
			scrapitemDo.setPrdtno(dataObject.getString(ScrapitemDo.COLUMNS.PRDTNO.name())); 
			scrapitemDo.setDescrip(dataObject.getString(ScrapitemDo.COLUMNS.DESCRIP.name())); 
			scrapitemDo.setPrdtqty(BigDecimalUtils.formObj(dataObject.getString(ScrapitemDo.COLUMNS.PRDTQTY.name()))); 
			scrapitemDo.setUnitprice(BigDecimalUtils.formObj(dataObject.getString(ScrapitemDo.COLUMNS.UNITPRICE.name()))); 
			scrapitemDo.setNet(BigDecimalUtils.formObj(dataObject.getString(ScrapitemDo.COLUMNS.NET.name()))); 
			scrapitemDo.setOdeclno(dataObject.getString(ScrapitemDo.COLUMNS.ODECLNO.name())); 
			scrapitemDo.setOitemno(BigDecimalUtils.formObj(dataObject.getString(ScrapitemDo.COLUMNS.OITEMNO.name()))); 
			scrapitemDo.setImportdate(dataObject.getString(ScrapitemDo.COLUMNS.IMPORTDATE.name())); 
			scrapitemDo.setRemrks(dataObject.getString(ScrapitemDo.COLUMNS.REMRKS.name())); 
			scrapitemDo.setPrdtunit(dataObject.getString(ScrapitemDo.COLUMNS.PRDTUNIT.name())); 
			scrapitemDo.setOutpost(dataObject.getString(ScrapitemDo.COLUMNS.OUTPOST.name())); 
			scrapitemDo.setBomno(dataObject.getString(ScrapitemDo.COLUMNS.BOMNO.name())); 
			scrapitemDo.setRowprdtno(dataObject.getString(ScrapitemDo.COLUMNS.ROWPRDTNO.name())); 
			scrapitemDo.setRowqty(BigDecimalUtils.formObj(dataObject.getString(ScrapitemDo.COLUMNS.ROWQTY.name()))); 
			return scrapitemDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ScrapitemDo scrapitemDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ScrapitemDo.COLUMNS.BONDNO.name(), scrapitemDo.getBondno()); 
			dataObject.setValue(ScrapitemDo.COLUMNS.SCRAPNO.name(), scrapitemDo.getScrapno()); 
			dataObject.setValue(ScrapitemDo.COLUMNS.ITEM.name(), scrapitemDo.getItem()); 
			dataObject.setValue(ScrapitemDo.COLUMNS.PRDTNO.name(), scrapitemDo.getPrdtno()); 
			dataObject.setValue(ScrapitemDo.COLUMNS.DESCRIP.name(), scrapitemDo.getDescrip()); 
			dataObject.setValue(ScrapitemDo.COLUMNS.PRDTQTY.name(), scrapitemDo.getPrdtqty()); 
			dataObject.setValue(ScrapitemDo.COLUMNS.UNITPRICE.name(), scrapitemDo.getUnitprice()); 
			dataObject.setValue(ScrapitemDo.COLUMNS.NET.name(), scrapitemDo.getNet()); 
			dataObject.setValue(ScrapitemDo.COLUMNS.ODECLNO.name(), scrapitemDo.getOdeclno()); 
			dataObject.setValue(ScrapitemDo.COLUMNS.OITEMNO.name(), scrapitemDo.getOitemno()); 
			dataObject.setValue(ScrapitemDo.COLUMNS.IMPORTDATE.name(), scrapitemDo.getImportdate()); 
			dataObject.setValue(ScrapitemDo.COLUMNS.REMRKS.name(), scrapitemDo.getRemrks()); 
			dataObject.setValue(ScrapitemDo.COLUMNS.PRDTUNIT.name(), scrapitemDo.getPrdtunit()); 
			dataObject.setValue(ScrapitemDo.COLUMNS.OUTPOST.name(), scrapitemDo.getOutpost()); 
			dataObject.setValue(ScrapitemDo.COLUMNS.BOMNO.name(), scrapitemDo.getBomno()); 
			dataObject.setValue(ScrapitemDo.COLUMNS.ROWPRDTNO.name(), scrapitemDo.getRowprdtno()); 
			dataObject.setValue(ScrapitemDo.COLUMNS.ROWQTY.name(), scrapitemDo.getRowqty()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ScrapitemDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ScrapitemDo po) { 
		sqlWhere.add(ScrapitemDo.COLUMNS.PRDTNO.name(), po.getPrdtno()); 
		sqlWhere.add(ScrapitemDo.COLUMNS.DESCRIP.name(), po.getDescrip()); 
		sqlWhere.add(ScrapitemDo.COLUMNS.PRDTQTY.name(), po.getPrdtqty()); 
		sqlWhere.add(ScrapitemDo.COLUMNS.UNITPRICE.name(), po.getUnitprice()); 
		sqlWhere.add(ScrapitemDo.COLUMNS.NET.name(), po.getNet()); 
		sqlWhere.add(ScrapitemDo.COLUMNS.ODECLNO.name(), po.getOdeclno()); 
		sqlWhere.add(ScrapitemDo.COLUMNS.OITEMNO.name(), po.getOitemno()); 
		sqlWhere.add(ScrapitemDo.COLUMNS.IMPORTDATE.name(), po.getImportdate()); 
		sqlWhere.add(ScrapitemDo.COLUMNS.REMRKS.name(), po.getRemrks()); 
		sqlWhere.add(ScrapitemDo.COLUMNS.PRDTUNIT.name(), po.getPrdtunit()); 
		sqlWhere.add(ScrapitemDo.COLUMNS.BOMNO.name(), po.getBomno()); 
		sqlWhere.add(ScrapitemDo.COLUMNS.ROWPRDTNO.name(), po.getRowprdtno()); 
		sqlWhere.add(ScrapitemDo.COLUMNS.ROWQTY.name(), po.getRowqty()); 
	} 
 
} 
