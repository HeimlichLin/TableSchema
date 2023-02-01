package com.doc.common.dao.impl; 
 
public class BomdtldescDAOImpl extends GeneralDAOImpl<BomdtldescPo> implements BomdtldescDAO { 
	public static final BomdtldescDAOImpl INSTANCE = new BomdtldescDAOImpl(); 
	public static final String TABLENAME = "BOMDTLDESC"; 

	public BomdtldescDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<BomdtldescPo> CONVERTER = new MapConverter<BomdtldescPo>() { 
 
		@Override 
		public BomdtldescPo convert(final DataObject dataObject) { 
			final BomdtldescPo bomdtldescPo = new BomdtldescPo(); 
			bomdtldescPo.setBfNo(dataObject.getString(BomdtldescPo.COLUMNS.BF_NO.name())); 
			bomdtldescPo.setCtmCode(dataObject.getString(BomdtldescPo.COLUMNS.CTM_CODE.name())); 
			bomdtldescPo.setPrdtNo(dataObject.getString(BomdtldescPo.COLUMNS.PRDT_NO.name())); 
			bomdtldescPo.setPartNo(dataObject.getString(BomdtldescPo.COLUMNS.PART_NO.name())); 
			bomdtldescPo.setBomDate(dataObject.getString(BomdtldescPo.COLUMNS.BOM_DATE.name())); 
			bomdtldescPo.setPartNo2(dataObject.getString(BomdtldescPo.COLUMNS.PART_NO2.name())); 
			bomdtldescPo.setDescrip(dataObject.getString(BomdtldescPo.COLUMNS.DESCRIP.name())); 
			return bomdtldescPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final BomdtldescPo bomdtldescPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(BomdtldescPo.COLUMNS.BF_NO.name(), bomdtldescPo.getBfNo()); 
			dataObject.setValue(BomdtldescPo.COLUMNS.CTM_CODE.name(), bomdtldescPo.getCtmCode()); 
			dataObject.setValue(BomdtldescPo.COLUMNS.PRDT_NO.name(), bomdtldescPo.getPrdtNo()); 
			dataObject.setValue(BomdtldescPo.COLUMNS.PART_NO.name(), bomdtldescPo.getPartNo()); 
			dataObject.setValue(BomdtldescPo.COLUMNS.BOM_DATE.name(), bomdtldescPo.getBomDate()); 
			dataObject.setValue(BomdtldescPo.COLUMNS.PART_NO2.name(), bomdtldescPo.getPartNo2()); 
			dataObject.setValue(BomdtldescPo.COLUMNS.DESCRIP.name(), bomdtldescPo.getDescrip()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<BomdtldescPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(BomdtldescPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
