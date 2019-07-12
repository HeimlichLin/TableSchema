package com.doc.common.dao.impl; 
 
public class ScrapinDAO extends GeneralDAOImpl<ScrapinDo> implements ScrapinDAO { 
	public static final ScrapinDAOImpl INSTANCE = new ScrapinDAOImpl(); 
	public static final String TABLENAME = "SCRAPIN"; 

	public ScrapinDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<ScrapinDo> CONVERTER = new MapConverter<ScrapinDo>() { 
 
		@Override 
		public ScrapinDo convert(final DataObject dataObject) { 
			final ScrapinDo scrapinDo = new ScrapinDo(); 
			scrapinDo.setBondno(dataObject.getString(ScrapinDo.COLUMNS.BONDNO.name())); 
			scrapinDo.setScrapno(dataObject.getString(ScrapinDo.COLUMNS.SCRAPNO.name())); 
			scrapinDo.setItem(BigDecimalUtils.formObj(dataObject.getString(ScrapinDo.COLUMNS.ITEM.name()))); 
			scrapinDo.setPrdtno(dataObject.getString(ScrapinDo.COLUMNS.PRDTNO.name())); 
			scrapinDo.setCcccode(dataObject.getString(ScrapinDo.COLUMNS.CCCCODE.name())); 
			scrapinDo.setDescrip(dataObject.getString(ScrapinDo.COLUMNS.DESCRIP.name())); 
			scrapinDo.setQty(BigDecimalUtils.formObj(dataObject.getString(ScrapinDo.COLUMNS.QTY.name()))); 
			scrapinDo.setUnit(dataObject.getString(ScrapinDo.COLUMNS.UNIT.name())); 
			scrapinDo.setUnitprice(BigDecimalUtils.formObj(dataObject.getString(ScrapinDo.COLUMNS.UNITPRICE.name()))); 
			scrapinDo.setNwght(BigDecimalUtils.formObj(dataObject.getString(ScrapinDo.COLUMNS.NWGHT.name()))); 
			scrapinDo.setGross(BigDecimalUtils.formObj(dataObject.getString(ScrapinDo.COLUMNS.GROSS.name()))); 
			scrapinDo.setDeclno(dataObject.getString(ScrapinDo.COLUMNS.DECLNO.name())); 
			scrapinDo.setValueamt(BigDecimalUtils.formObj(dataObject.getString(ScrapinDo.COLUMNS.VALUEAMT.name()))); 
			scrapinDo.setInpost(dataObject.getString(ScrapinDo.COLUMNS.INPOST.name())); 
			return scrapinDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ScrapinDo scrapinDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ScrapinDo.COLUMNS.BONDNO.name(), scrapinDo.getBondno()); 
			dataObject.setValue(ScrapinDo.COLUMNS.SCRAPNO.name(), scrapinDo.getScrapno()); 
			dataObject.setValue(ScrapinDo.COLUMNS.ITEM.name(), scrapinDo.getItem()); 
			dataObject.setValue(ScrapinDo.COLUMNS.PRDTNO.name(), scrapinDo.getPrdtno()); 
			dataObject.setValue(ScrapinDo.COLUMNS.CCCCODE.name(), scrapinDo.getCcccode()); 
			dataObject.setValue(ScrapinDo.COLUMNS.DESCRIP.name(), scrapinDo.getDescrip()); 
			dataObject.setValue(ScrapinDo.COLUMNS.QTY.name(), scrapinDo.getQty()); 
			dataObject.setValue(ScrapinDo.COLUMNS.UNIT.name(), scrapinDo.getUnit()); 
			dataObject.setValue(ScrapinDo.COLUMNS.UNITPRICE.name(), scrapinDo.getUnitprice()); 
			dataObject.setValue(ScrapinDo.COLUMNS.NWGHT.name(), scrapinDo.getNwght()); 
			dataObject.setValue(ScrapinDo.COLUMNS.GROSS.name(), scrapinDo.getGross()); 
			dataObject.setValue(ScrapinDo.COLUMNS.DECLNO.name(), scrapinDo.getDeclno()); 
			dataObject.setValue(ScrapinDo.COLUMNS.VALUEAMT.name(), scrapinDo.getValueamt()); 
			dataObject.setValue(ScrapinDo.COLUMNS.INPOST.name(), scrapinDo.getInpost()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ScrapinDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ScrapinDo po) { 
		sqlWhere.add(ScrapinDo.COLUMNS.PRDTNO.name(), po.getPrdtno()); 
		sqlWhere.add(ScrapinDo.COLUMNS.CCCCODE.name(), po.getCcccode()); 
		sqlWhere.add(ScrapinDo.COLUMNS.DESCRIP.name(), po.getDescrip()); 
		sqlWhere.add(ScrapinDo.COLUMNS.QTY.name(), po.getQty()); 
		sqlWhere.add(ScrapinDo.COLUMNS.UNIT.name(), po.getUnit()); 
		sqlWhere.add(ScrapinDo.COLUMNS.UNITPRICE.name(), po.getUnitprice()); 
		sqlWhere.add(ScrapinDo.COLUMNS.NWGHT.name(), po.getNwght()); 
		sqlWhere.add(ScrapinDo.COLUMNS.GROSS.name(), po.getGross()); 
		sqlWhere.add(ScrapinDo.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(ScrapinDo.COLUMNS.VALUEAMT.name(), po.getValueamt()); 
	} 
 
} 
