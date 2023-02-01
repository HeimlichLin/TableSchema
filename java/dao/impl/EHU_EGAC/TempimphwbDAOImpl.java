package com.doc.common.dao.impl; 
 
public class TempImphwbDAOImpl extends GeneralDAOImpl<TempImphwbPo> implements TempImphwbDAO { 
	public static final TempImphwbDAOImpl INSTANCE = new TempImphwbDAOImpl(); 
	public static final String TABLENAME = "TEMP_IMPHWB"; 

	public TempImphwbDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TempImphwbPo> CONVERTER = new MapConverter<TempImphwbPo>() { 
 
		@Override 
		public TempImphwbPo convert(final DataObject dataObject) { 
			final TempImphwbPo tempImphwbPo = new TempImphwbPo(); 
			tempImphwbPo.setDeclno(dataObject.getString(TempImphwbPo.COLUMNS.DECLNO.name())); 
			tempImphwbPo.setMwb(dataObject.getString(TempImphwbPo.COLUMNS.MWB.name())); 
			tempImphwbPo.setHwb(dataObject.getString(TempImphwbPo.COLUMNS.HWB.name())); 
			tempImphwbPo.setBag(dataObject.getString(TempImphwbPo.COLUMNS.BAG.name())); 
			tempImphwbPo.setBagno(dataObject.getString(TempImphwbPo.COLUMNS.BAGNO.name())); 
			tempImphwbPo.setOut(dataObject.getString(TempImphwbPo.COLUMNS.OUT.name())); 
			return tempImphwbPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TempImphwbPo tempImphwbPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TempImphwbPo.COLUMNS.DECLNO.name(), tempImphwbPo.getDeclno()); 
			dataObject.setValue(TempImphwbPo.COLUMNS.MWB.name(), tempImphwbPo.getMwb()); 
			dataObject.setValue(TempImphwbPo.COLUMNS.HWB.name(), tempImphwbPo.getHwb()); 
			dataObject.setValue(TempImphwbPo.COLUMNS.BAG.name(), tempImphwbPo.getBag()); 
			dataObject.setValue(TempImphwbPo.COLUMNS.BAGNO.name(), tempImphwbPo.getBagno()); 
			dataObject.setValue(TempImphwbPo.COLUMNS.OUT.name(), tempImphwbPo.getOut()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TempImphwbPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TempImphwbPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
