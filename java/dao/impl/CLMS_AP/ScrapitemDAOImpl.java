package com.doc.common.dao.impl; 
 
public class ScrapitemDAOImpl extends GeneralDAOImpl<ScrapitemPo> implements ScrapitemDAO { 
	public static final ScrapitemDAOImpl INSTANCE = new ScrapitemDAOImpl(); 
	public static final String TABLENAME = "SCRAPITEM"; 

	public ScrapitemDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ScrapitemPo> CONVERTER = new MapConverter<ScrapitemPo>() { 
 
		@Override 
		public ScrapitemPo convert(final DataObject dataObject) { 
			final ScrapitemPo scrapitemPo = new ScrapitemPo(); 
			scrapitemPo.setBondno(dataObject.getString(ScrapitemPo.COLUMNS.BONDNO.name())); 
			scrapitemPo.setScrapno(dataObject.getString(ScrapitemPo.COLUMNS.SCRAPNO.name())); 
			scrapitemPo.setItem(BigDecimalUtils.formObj(dataObject.getValue(ScrapitemPo.COLUMNS.ITEM.name()))); 
			scrapitemPo.setPrdtno(dataObject.getString(ScrapitemPo.COLUMNS.PRDTNO.name())); 
			scrapitemPo.setDescrip(dataObject.getString(ScrapitemPo.COLUMNS.DESCRIP.name())); 
			scrapitemPo.setPrdtqty(BigDecimalUtils.formObj(dataObject.getValue(ScrapitemPo.COLUMNS.PRDTQTY.name()))); 
			scrapitemPo.setUnitprice(BigDecimalUtils.formObj(dataObject.getValue(ScrapitemPo.COLUMNS.UNITPRICE.name()))); 
			scrapitemPo.setNet(BigDecimalUtils.formObj(dataObject.getValue(ScrapitemPo.COLUMNS.NET.name()))); 
			scrapitemPo.setOdeclno(dataObject.getString(ScrapitemPo.COLUMNS.ODECLNO.name())); 
			scrapitemPo.setOitemno(BigDecimalUtils.formObj(dataObject.getValue(ScrapitemPo.COLUMNS.OITEMNO.name()))); 
			scrapitemPo.setImportdate(dataObject.getString(ScrapitemPo.COLUMNS.IMPORTDATE.name())); 
			scrapitemPo.setRemrks(dataObject.getString(ScrapitemPo.COLUMNS.REMRKS.name())); 
			scrapitemPo.setPrdtunit(dataObject.getString(ScrapitemPo.COLUMNS.PRDTUNIT.name())); 
			scrapitemPo.setOutpost(dataObject.getString(ScrapitemPo.COLUMNS.OUTPOST.name())); 
			scrapitemPo.setBomno(dataObject.getString(ScrapitemPo.COLUMNS.BOMNO.name())); 
			scrapitemPo.setRowprdtno(dataObject.getString(ScrapitemPo.COLUMNS.ROWPRDTNO.name())); 
			scrapitemPo.setRowqty(BigDecimalUtils.formObj(dataObject.getValue(ScrapitemPo.COLUMNS.ROWQTY.name()))); 
			return scrapitemPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ScrapitemPo scrapitemPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ScrapitemPo.COLUMNS.BONDNO.name(), scrapitemPo.getBondno()); 
			dataObject.setValue(ScrapitemPo.COLUMNS.SCRAPNO.name(), scrapitemPo.getScrapno()); 
			dataObject.setValue(ScrapitemPo.COLUMNS.ITEM.name(), scrapitemPo.getItem()); 
			dataObject.setValue(ScrapitemPo.COLUMNS.PRDTNO.name(), scrapitemPo.getPrdtno()); 
			dataObject.setValue(ScrapitemPo.COLUMNS.DESCRIP.name(), scrapitemPo.getDescrip()); 
			dataObject.setValue(ScrapitemPo.COLUMNS.PRDTQTY.name(), scrapitemPo.getPrdtqty()); 
			dataObject.setValue(ScrapitemPo.COLUMNS.UNITPRICE.name(), scrapitemPo.getUnitprice()); 
			dataObject.setValue(ScrapitemPo.COLUMNS.NET.name(), scrapitemPo.getNet()); 
			dataObject.setValue(ScrapitemPo.COLUMNS.ODECLNO.name(), scrapitemPo.getOdeclno()); 
			dataObject.setValue(ScrapitemPo.COLUMNS.OITEMNO.name(), scrapitemPo.getOitemno()); 
			dataObject.setValue(ScrapitemPo.COLUMNS.IMPORTDATE.name(), scrapitemPo.getImportdate()); 
			dataObject.setValue(ScrapitemPo.COLUMNS.REMRKS.name(), scrapitemPo.getRemrks()); 
			dataObject.setValue(ScrapitemPo.COLUMNS.PRDTUNIT.name(), scrapitemPo.getPrdtunit()); 
			dataObject.setValue(ScrapitemPo.COLUMNS.OUTPOST.name(), scrapitemPo.getOutpost()); 
			dataObject.setValue(ScrapitemPo.COLUMNS.BOMNO.name(), scrapitemPo.getBomno()); 
			dataObject.setValue(ScrapitemPo.COLUMNS.ROWPRDTNO.name(), scrapitemPo.getRowprdtno()); 
			dataObject.setValue(ScrapitemPo.COLUMNS.ROWQTY.name(), scrapitemPo.getRowqty()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ScrapitemPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ScrapitemPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(ScrapitemPo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(ScrapitemPo.COLUMNS.SCRAPNO.name(), po.getScrapno()); 
		sqlWhere.add(ScrapitemPo.COLUMNS.ITEM.name(), po.getItem()); 
		sqlWhere.add(ScrapitemPo.COLUMNS.OUTPOST.name(), po.getOutpost()); 
		return sqlWhere; 
	} 
 
} 
