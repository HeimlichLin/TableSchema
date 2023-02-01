package com.doc.common.dao.impl; 
 
public class FxxxDAOImpl extends GeneralDAOImpl<FxxxPo> implements FxxxDAO { 
	public static final FxxxDAOImpl INSTANCE = new FxxxDAOImpl(); 
	public static final String TABLENAME = "FXXX"; 

	public FxxxDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<FxxxPo> CONVERTER = new MapConverter<FxxxPo>() { 
 
		@Override 
		public FxxxPo convert(final DataObject dataObject) { 
			final FxxxPo fxxxPo = new FxxxPo(); 
			fxxxPo.setBagno(dataObject.getString(FxxxPo.COLUMNS.BAGNO.name())); 
			fxxxPo.setA1(dataObject.getString(FxxxPo.COLUMNS.A1.name())); 
			fxxxPo.setF1(dataObject.getString(FxxxPo.COLUMNS.F1.name())); 
			fxxxPo.setA2(dataObject.getString(FxxxPo.COLUMNS.A2.name())); 
			fxxxPo.setF2(dataObject.getString(FxxxPo.COLUMNS.F2.name())); 
			return fxxxPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final FxxxPo fxxxPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(FxxxPo.COLUMNS.BAGNO.name(), fxxxPo.getBagno()); 
			dataObject.setValue(FxxxPo.COLUMNS.A1.name(), fxxxPo.getA1()); 
			dataObject.setValue(FxxxPo.COLUMNS.F1.name(), fxxxPo.getF1()); 
			dataObject.setValue(FxxxPo.COLUMNS.A2.name(), fxxxPo.getA2()); 
			dataObject.setValue(FxxxPo.COLUMNS.F2.name(), fxxxPo.getF2()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<FxxxPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(FxxxPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
