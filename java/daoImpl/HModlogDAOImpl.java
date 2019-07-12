package com.doc.common.dao.impl; 
 
public class HModlogDAOImpl extends GeneralDAOImpl<HModlogDo> implements HModlogDAOImpl { 
	public static final HModlogDAOImpl INSTANCE = new HModlogDAOImpl(); 
	public static final String TABLENAME = "H_MODLOG"; 

	public HModlogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<HModlogDo> CONVERTER = new MapConverter<HModlogDo>() { 
 
		@Override 
		public HModlogDo convert(final DataObject dataObject) { 
			final HModlogDo hModlogDo = new HModlogDo(); 
			hModlogDo.setBondno(dataObject.getString(HModlogDo.COLUMNS.BONDNO.name())); 
			hModlogDo.setRefbillno(dataObject.getString(HModlogDo.COLUMNS.REFBILLNO.name())); 
			hModlogDo.setItem(BigDecimalUtils.formObj(dataObject.getString(HModlogDo.COLUMNS.ITEM.name()))); 
			hModlogDo.setPost(dataObject.getString(HModlogDo.COLUMNS.POST.name())); 
			hModlogDo.setStrtype(dataObject.getString(HModlogDo.COLUMNS.STRTYPE.name())); 
			hModlogDo.setModifer(dataObject.getString(HModlogDo.COLUMNS.MODIFER.name())); 
			hModlogDo.setModtime(CommUtils.objConver2Time(dataObject.getString(HModlogDo.COLUMNS.MODTIME.name()))); 
			hModlogDo.setModitem(dataObject.getString(HModlogDo.COLUMNS.MODITEM.name())); 
			hModlogDo.setOridata(dataObject.getString(HModlogDo.COLUMNS.ORIDATA.name())); 
			hModlogDo.setModdata(dataObject.getString(HModlogDo.COLUMNS.MODDATA.name())); 
			hModlogDo.setModfile(dataObject.getString(HModlogDo.COLUMNS.MODFILE.name())); 
			hModlogDo.setRemks(dataObject.getString(HModlogDo.COLUMNS.REMKS.name())); 
			return hModlogDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final HModlogDo hModlogDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(HModlogDo.COLUMNS.BONDNO.name(), hModlogDo.getBondno()); 
			dataObject.setValue(HModlogDo.COLUMNS.REFBILLNO.name(), hModlogDo.getRefbillno()); 
			dataObject.setValue(HModlogDo.COLUMNS.ITEM.name(), hModlogDo.getItem()); 
			dataObject.setValue(HModlogDo.COLUMNS.POST.name(), hModlogDo.getPost()); 
			dataObject.setValue(HModlogDo.COLUMNS.STRTYPE.name(), hModlogDo.getStrtype()); 
			dataObject.setValue(HModlogDo.COLUMNS.MODIFER.name(), hModlogDo.getModifer()); 
			dataObject.setValue(HModlogDo.COLUMNS.MODTIME.name(), hModlogDo.getModtime()); 
			dataObject.setValue(HModlogDo.COLUMNS.MODITEM.name(), hModlogDo.getModitem()); 
			dataObject.setValue(HModlogDo.COLUMNS.ORIDATA.name(), hModlogDo.getOridata()); 
			dataObject.setValue(HModlogDo.COLUMNS.MODDATA.name(), hModlogDo.getModdata()); 
			dataObject.setValue(HModlogDo.COLUMNS.MODFILE.name(), hModlogDo.getModfile()); 
			dataObject.setValue(HModlogDo.COLUMNS.REMKS.name(), hModlogDo.getRemks()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<HModlogDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(HModlogDo po) { 
	} 
 
} 
