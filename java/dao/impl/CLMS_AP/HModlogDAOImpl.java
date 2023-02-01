package com.doc.common.dao.impl; 
 
public class HModlogDAOImpl extends GeneralDAOImpl<HModlogPo> implements HModlogDAO { 
	public static final HModlogDAOImpl INSTANCE = new HModlogDAOImpl(); 
	public static final String TABLENAME = "H_MODLOG"; 

	public HModlogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<HModlogPo> CONVERTER = new MapConverter<HModlogPo>() { 
 
		@Override 
		public HModlogPo convert(final DataObject dataObject) { 
			final HModlogPo hModlogPo = new HModlogPo(); 
			hModlogPo.setBondno(dataObject.getString(HModlogPo.COLUMNS.BONDNO.name())); 
			hModlogPo.setRefbillno(dataObject.getString(HModlogPo.COLUMNS.REFBILLNO.name())); 
			hModlogPo.setItem(BigDecimalUtils.formObj(dataObject.getValue(HModlogPo.COLUMNS.ITEM.name()))); 
			hModlogPo.setPost(dataObject.getString(HModlogPo.COLUMNS.POST.name())); 
			hModlogPo.setStrtype(dataObject.getString(HModlogPo.COLUMNS.STRTYPE.name())); 
			hModlogPo.setModifer(dataObject.getString(HModlogPo.COLUMNS.MODIFER.name())); 
			hModlogPo.setModtime(TimestampUtils.of(dataObject.getValue(HModlogPo.COLUMNS.MODTIME.name()))); 
			hModlogPo.setModitem(dataObject.getString(HModlogPo.COLUMNS.MODITEM.name())); 
			hModlogPo.setOridata(dataObject.getString(HModlogPo.COLUMNS.ORIDATA.name())); 
			hModlogPo.setModdata(dataObject.getString(HModlogPo.COLUMNS.MODDATA.name())); 
			hModlogPo.setModfile(dataObject.getString(HModlogPo.COLUMNS.MODFILE.name())); 
			hModlogPo.setRemks(dataObject.getString(HModlogPo.COLUMNS.REMKS.name())); 
			hModlogPo.setDeclno(dataObject.getString(HModlogPo.COLUMNS.DECLNO.name())); 
			hModlogPo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(HModlogPo.COLUMNS.ITEMNO.name()))); 
			hModlogPo.setOdeclno(dataObject.getString(HModlogPo.COLUMNS.ODECLNO.name())); 
			hModlogPo.setOitemno(dataObject.getString(HModlogPo.COLUMNS.OITEMNO.name())); 
			hModlogPo.setProcesstime(TimestampUtils.of(dataObject.getValue(HModlogPo.COLUMNS.PROCESSTIME.name()))); 
			hModlogPo.setProcessstate(dataObject.getString(HModlogPo.COLUMNS.PROCESSSTATE.name())); 
			return hModlogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final HModlogPo hModlogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(HModlogPo.COLUMNS.BONDNO.name(), hModlogPo.getBondno()); 
			dataObject.setValue(HModlogPo.COLUMNS.REFBILLNO.name(), hModlogPo.getRefbillno()); 
			dataObject.setValue(HModlogPo.COLUMNS.ITEM.name(), hModlogPo.getItem()); 
			dataObject.setValue(HModlogPo.COLUMNS.POST.name(), hModlogPo.getPost()); 
			dataObject.setValue(HModlogPo.COLUMNS.STRTYPE.name(), hModlogPo.getStrtype()); 
			dataObject.setValue(HModlogPo.COLUMNS.MODIFER.name(), hModlogPo.getModifer()); 
			dataObject.setValue(HModlogPo.COLUMNS.MODTIME.name(), hModlogPo.getModtime()); 
			dataObject.setValue(HModlogPo.COLUMNS.MODITEM.name(), hModlogPo.getModitem()); 
			dataObject.setValue(HModlogPo.COLUMNS.ORIDATA.name(), hModlogPo.getOridata()); 
			dataObject.setValue(HModlogPo.COLUMNS.MODDATA.name(), hModlogPo.getModdata()); 
			dataObject.setValue(HModlogPo.COLUMNS.MODFILE.name(), hModlogPo.getModfile()); 
			dataObject.setValue(HModlogPo.COLUMNS.REMKS.name(), hModlogPo.getRemks()); 
			dataObject.setValue(HModlogPo.COLUMNS.DECLNO.name(), hModlogPo.getDeclno()); 
			dataObject.setValue(HModlogPo.COLUMNS.ITEMNO.name(), hModlogPo.getItemno()); 
			dataObject.setValue(HModlogPo.COLUMNS.ODECLNO.name(), hModlogPo.getOdeclno()); 
			dataObject.setValue(HModlogPo.COLUMNS.OITEMNO.name(), hModlogPo.getOitemno()); 
			dataObject.setValue(HModlogPo.COLUMNS.PROCESSTIME.name(), hModlogPo.getProcesstime()); 
			dataObject.setValue(HModlogPo.COLUMNS.PROCESSSTATE.name(), hModlogPo.getProcessstate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<HModlogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(HModlogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
