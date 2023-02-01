package com.doc.common.dao.impl; 
 
public class IcAcSetDAOImpl extends GeneralDAOImpl<IcAcSetPo> implements IcAcSetDAO { 
	public static final IcAcSetDAOImpl INSTANCE = new IcAcSetDAOImpl(); 
	public static final String TABLENAME = "IC_AC_SET"; 

	public IcAcSetDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<IcAcSetPo> CONVERTER = new MapConverter<IcAcSetPo>() { 
 
		@Override 
		public IcAcSetPo convert(final DataObject dataObject) { 
			final IcAcSetPo icAcSetPo = new IcAcSetPo(); 
			icAcSetPo.setIcNo(dataObject.getString(IcAcSetPo.COLUMNS.IC_NO.name())); 
			icAcSetPo.setWhCode(dataObject.getString(IcAcSetPo.COLUMNS.WH_CODE.name())); 
			icAcSetPo.setAcId(dataObject.getString(IcAcSetPo.COLUMNS.AC_ID.name())); 
			return icAcSetPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final IcAcSetPo icAcSetPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(IcAcSetPo.COLUMNS.IC_NO.name(), icAcSetPo.getIcNo()); 
			dataObject.setValue(IcAcSetPo.COLUMNS.WH_CODE.name(), icAcSetPo.getWhCode()); 
			dataObject.setValue(IcAcSetPo.COLUMNS.AC_ID.name(), icAcSetPo.getAcId()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<IcAcSetPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(IcAcSetPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(IcAcSetPo.COLUMNS.IC_NO.name(), po.getIcNo()); 
		sqlWhere.add(IcAcSetPo.COLUMNS.WH_CODE.name(), po.getWhCode()); 
		sqlWhere.add(IcAcSetPo.COLUMNS.AC_ID.name(), po.getAcId()); 
		return sqlWhere; 
	} 
 
} 
