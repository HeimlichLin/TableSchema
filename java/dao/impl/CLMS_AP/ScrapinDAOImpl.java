package com.doc.common.dao.impl; 
 
public class ScrapinDAOImpl extends GeneralDAOImpl<ScrapinPo> implements ScrapinDAO { 
	public static final ScrapinDAOImpl INSTANCE = new ScrapinDAOImpl(); 
	public static final String TABLENAME = "SCRAPIN"; 

	public ScrapinDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ScrapinPo> CONVERTER = new MapConverter<ScrapinPo>() { 
 
		@Override 
		public ScrapinPo convert(final DataObject dataObject) { 
			final ScrapinPo scrapinPo = new ScrapinPo(); 
			scrapinPo.setBondno(dataObject.getString(ScrapinPo.COLUMNS.BONDNO.name())); 
			scrapinPo.setScrapno(dataObject.getString(ScrapinPo.COLUMNS.SCRAPNO.name())); 
			scrapinPo.setItem(BigDecimalUtils.formObj(dataObject.getValue(ScrapinPo.COLUMNS.ITEM.name()))); 
			scrapinPo.setPrdtno(dataObject.getString(ScrapinPo.COLUMNS.PRDTNO.name())); 
			scrapinPo.setCcccode(dataObject.getString(ScrapinPo.COLUMNS.CCCCODE.name())); 
			scrapinPo.setDescrip(dataObject.getString(ScrapinPo.COLUMNS.DESCRIP.name())); 
			scrapinPo.setQty(BigDecimalUtils.formObj(dataObject.getValue(ScrapinPo.COLUMNS.QTY.name()))); 
			scrapinPo.setUnit(dataObject.getString(ScrapinPo.COLUMNS.UNIT.name())); 
			scrapinPo.setUnitprice(BigDecimalUtils.formObj(dataObject.getValue(ScrapinPo.COLUMNS.UNITPRICE.name()))); 
			scrapinPo.setNwght(BigDecimalUtils.formObj(dataObject.getValue(ScrapinPo.COLUMNS.NWGHT.name()))); 
			scrapinPo.setGross(BigDecimalUtils.formObj(dataObject.getValue(ScrapinPo.COLUMNS.GROSS.name()))); 
			scrapinPo.setDeclno(dataObject.getString(ScrapinPo.COLUMNS.DECLNO.name())); 
			scrapinPo.setValueamt(BigDecimalUtils.formObj(dataObject.getValue(ScrapinPo.COLUMNS.VALUEAMT.name()))); 
			scrapinPo.setInpost(dataObject.getString(ScrapinPo.COLUMNS.INPOST.name())); 
			return scrapinPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ScrapinPo scrapinPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ScrapinPo.COLUMNS.BONDNO.name(), scrapinPo.getBondno()); 
			dataObject.setValue(ScrapinPo.COLUMNS.SCRAPNO.name(), scrapinPo.getScrapno()); 
			dataObject.setValue(ScrapinPo.COLUMNS.ITEM.name(), scrapinPo.getItem()); 
			dataObject.setValue(ScrapinPo.COLUMNS.PRDTNO.name(), scrapinPo.getPrdtno()); 
			dataObject.setValue(ScrapinPo.COLUMNS.CCCCODE.name(), scrapinPo.getCcccode()); 
			dataObject.setValue(ScrapinPo.COLUMNS.DESCRIP.name(), scrapinPo.getDescrip()); 
			dataObject.setValue(ScrapinPo.COLUMNS.QTY.name(), scrapinPo.getQty()); 
			dataObject.setValue(ScrapinPo.COLUMNS.UNIT.name(), scrapinPo.getUnit()); 
			dataObject.setValue(ScrapinPo.COLUMNS.UNITPRICE.name(), scrapinPo.getUnitprice()); 
			dataObject.setValue(ScrapinPo.COLUMNS.NWGHT.name(), scrapinPo.getNwght()); 
			dataObject.setValue(ScrapinPo.COLUMNS.GROSS.name(), scrapinPo.getGross()); 
			dataObject.setValue(ScrapinPo.COLUMNS.DECLNO.name(), scrapinPo.getDeclno()); 
			dataObject.setValue(ScrapinPo.COLUMNS.VALUEAMT.name(), scrapinPo.getValueamt()); 
			dataObject.setValue(ScrapinPo.COLUMNS.INPOST.name(), scrapinPo.getInpost()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ScrapinPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ScrapinPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(ScrapinPo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(ScrapinPo.COLUMNS.SCRAPNO.name(), po.getScrapno()); 
		sqlWhere.add(ScrapinPo.COLUMNS.ITEM.name(), po.getItem()); 
		sqlWhere.add(ScrapinPo.COLUMNS.INPOST.name(), po.getInpost()); 
		return sqlWhere; 
	} 
 
} 
