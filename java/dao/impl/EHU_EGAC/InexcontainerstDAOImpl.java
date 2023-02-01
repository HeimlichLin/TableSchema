package com.doc.common.dao.impl; 
 
public class InexcontainerstDAOImpl extends GeneralDAOImpl<InexcontainerstPo> implements InexcontainerstDAO { 
	public static final InexcontainerstDAOImpl INSTANCE = new InexcontainerstDAOImpl(); 
	public static final String TABLENAME = "INEXCONTAINERST"; 

	public InexcontainerstDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<InexcontainerstPo> CONVERTER = new MapConverter<InexcontainerstPo>() { 
 
		@Override 
		public InexcontainerstPo convert(final DataObject dataObject) { 
			final InexcontainerstPo inexcontainerstPo = new InexcontainerstPo(); 
			inexcontainerstPo.setTtype(dataObject.getString(InexcontainerstPo.COLUMNS.TTYPE.name())); 
			inexcontainerstPo.setIndicator(dataObject.getString(InexcontainerstPo.COLUMNS.INDICATOR.name())); 
			inexcontainerstPo.setDecltype(dataObject.getString(InexcontainerstPo.COLUMNS.DECLTYPE.name())); 
			inexcontainerstPo.setDeclno(dataObject.getString(InexcontainerstPo.COLUMNS.DECLNO.name())); 
			inexcontainerstPo.setMwb(dataObject.getString(InexcontainerstPo.COLUMNS.MWB.name())); 
			inexcontainerstPo.setHwb(dataObject.getString(InexcontainerstPo.COLUMNS.HWB.name())); 
			inexcontainerstPo.setItemno(dataObject.getString(InexcontainerstPo.COLUMNS.ITEMNO.name())); 
			inexcontainerstPo.setContainer(dataObject.getString(InexcontainerstPo.COLUMNS.CONTAINER.name())); 
			return inexcontainerstPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final InexcontainerstPo inexcontainerstPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(InexcontainerstPo.COLUMNS.TTYPE.name(), inexcontainerstPo.getTtype()); 
			dataObject.setValue(InexcontainerstPo.COLUMNS.INDICATOR.name(), inexcontainerstPo.getIndicator()); 
			dataObject.setValue(InexcontainerstPo.COLUMNS.DECLTYPE.name(), inexcontainerstPo.getDecltype()); 
			dataObject.setValue(InexcontainerstPo.COLUMNS.DECLNO.name(), inexcontainerstPo.getDeclno()); 
			dataObject.setValue(InexcontainerstPo.COLUMNS.MWB.name(), inexcontainerstPo.getMwb()); 
			dataObject.setValue(InexcontainerstPo.COLUMNS.HWB.name(), inexcontainerstPo.getHwb()); 
			dataObject.setValue(InexcontainerstPo.COLUMNS.ITEMNO.name(), inexcontainerstPo.getItemno()); 
			dataObject.setValue(InexcontainerstPo.COLUMNS.CONTAINER.name(), inexcontainerstPo.getContainer()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<InexcontainerstPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(InexcontainerstPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
