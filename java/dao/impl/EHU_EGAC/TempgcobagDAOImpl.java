package com.doc.common.dao.impl; 
 
public class TempgcobagDAOImpl extends GeneralDAOImpl<TempgcobagPo> implements TempgcobagDAO { 
	public static final TempgcobagDAOImpl INSTANCE = new TempgcobagDAOImpl(); 
	public static final String TABLENAME = "TEMPGCOBAG"; 

	public TempgcobagDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TempgcobagPo> CONVERTER = new MapConverter<TempgcobagPo>() { 
 
		@Override 
		public TempgcobagPo convert(final DataObject dataObject) { 
			final TempgcobagPo tempgcobagPo = new TempgcobagPo(); 
			tempgcobagPo.setBagno(dataObject.getString(TempgcobagPo.COLUMNS.BAGNO.name())); 
			return tempgcobagPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TempgcobagPo tempgcobagPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TempgcobagPo.COLUMNS.BAGNO.name(), tempgcobagPo.getBagno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TempgcobagPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TempgcobagPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
