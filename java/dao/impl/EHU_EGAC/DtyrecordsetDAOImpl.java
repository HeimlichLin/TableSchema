package com.doc.common.dao.impl; 
 
public class DtyrecordsetDAOImpl extends GeneralDAOImpl<DtyrecordsetPo> implements DtyrecordsetDAO { 
	public static final DtyrecordsetDAOImpl INSTANCE = new DtyrecordsetDAOImpl(); 
	public static final String TABLENAME = "DTYRECORDSET"; 

	public DtyrecordsetDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DtyrecordsetPo> CONVERTER = new MapConverter<DtyrecordsetPo>() { 
 
		@Override 
		public DtyrecordsetPo convert(final DataObject dataObject) { 
			final DtyrecordsetPo dtyrecordsetPo = new DtyrecordsetPo(); 
			dtyrecordsetPo.setDtyn(dataObject.getString(DtyrecordsetPo.COLUMNS.DTYN.name())); 
			dtyrecordsetPo.setMb(dataObject.getString(DtyrecordsetPo.COLUMNS.MB.name())); 
			dtyrecordsetPo.setHb(dataObject.getString(DtyrecordsetPo.COLUMNS.HB.name())); 
			dtyrecordsetPo.setPu(dataObject.getString(DtyrecordsetPo.COLUMNS.PU.name())); 
			dtyrecordsetPo.setUsu(dataObject.getString(DtyrecordsetPo.COLUMNS.USU.name())); 
			dtyrecordsetPo.setPt(dataObject.getString(DtyrecordsetPo.COLUMNS.PT.name())); 
			dtyrecordsetPo.setWs(dataObject.getString(DtyrecordsetPo.COLUMNS.WS.name())); 
			return dtyrecordsetPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DtyrecordsetPo dtyrecordsetPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DtyrecordsetPo.COLUMNS.DTYN.name(), dtyrecordsetPo.getDtyn()); 
			dataObject.setValue(DtyrecordsetPo.COLUMNS.MB.name(), dtyrecordsetPo.getMb()); 
			dataObject.setValue(DtyrecordsetPo.COLUMNS.HB.name(), dtyrecordsetPo.getHb()); 
			dataObject.setValue(DtyrecordsetPo.COLUMNS.PU.name(), dtyrecordsetPo.getPu()); 
			dataObject.setValue(DtyrecordsetPo.COLUMNS.USU.name(), dtyrecordsetPo.getUsu()); 
			dataObject.setValue(DtyrecordsetPo.COLUMNS.PT.name(), dtyrecordsetPo.getPt()); 
			dataObject.setValue(DtyrecordsetPo.COLUMNS.WS.name(), dtyrecordsetPo.getWs()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DtyrecordsetPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DtyrecordsetPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
