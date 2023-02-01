package com.doc.common.dao.impl; 
 
public class T5117dDAOImpl extends GeneralDAOImpl<T5117dPo> implements T5117dDAO { 
	public static final T5117dDAOImpl INSTANCE = new T5117dDAOImpl(); 
	public static final String TABLENAME = "T5117D"; 

	public T5117dDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<T5117dPo> CONVERTER = new MapConverter<T5117dPo>() { 
 
		@Override 
		public T5117dPo convert(final DataObject dataObject) { 
			final T5117dPo t5117dPo = new T5117dPo(); 
			t5117dPo.setControlno(dataObject.getString(T5117dPo.COLUMNS.CONTROLNO.name())); 
			t5117dPo.setDeclno(dataObject.getString(T5117dPo.COLUMNS.DECLNO.name())); 
			t5117dPo.setPartialreleasenote(dataObject.getString(T5117dPo.COLUMNS.PARTIALRELEASENOTE.name())); 
			t5117dPo.setGcodate(dataObject.getString(T5117dPo.COLUMNS.GCODATE.name())); 
			t5117dPo.setDecltype(dataObject.getString(T5117dPo.COLUMNS.DECLTYPE.name())); 
			t5117dPo.setIe(dataObject.getString(T5117dPo.COLUMNS.IE.name())); 
			t5117dPo.setWarehouseno(dataObject.getString(T5117dPo.COLUMNS.WAREHOUSENO.name())); 
			t5117dPo.setMwb(dataObject.getString(T5117dPo.COLUMNS.MWB.name())); 
			t5117dPo.setHwb(dataObject.getString(T5117dPo.COLUMNS.HWB.name())); 
			t5117dPo.setSono(dataObject.getString(T5117dPo.COLUMNS.SONO.name())); 
			t5117dPo.setVrno(dataObject.getString(T5117dPo.COLUMNS.VRNO.name())); 
			t5117dPo.setPartreleasenote(dataObject.getString(T5117dPo.COLUMNS.PARTRELEASENOTE.name())); 
			t5117dPo.setGcopiece(dataObject.getString(T5117dPo.COLUMNS.GCOPIECE.name())); 
			t5117dPo.setUnreleasedunit(dataObject.getString(T5117dPo.COLUMNS.UNRELEASEDUNIT.name())); 
			t5117dPo.setTtype(dataObject.getString(T5117dPo.COLUMNS.TTYPE.name())); 
			t5117dPo.setBriefnote(dataObject.getString(T5117dPo.COLUMNS.BRIEFNOTE.name())); 
			t5117dPo.setSendstatus(dataObject.getString(T5117dPo.COLUMNS.SENDSTATUS.name())); 
			return t5117dPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final T5117dPo t5117dPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(T5117dPo.COLUMNS.CONTROLNO.name(), t5117dPo.getControlno()); 
			dataObject.setValue(T5117dPo.COLUMNS.DECLNO.name(), t5117dPo.getDeclno()); 
			dataObject.setValue(T5117dPo.COLUMNS.PARTIALRELEASENOTE.name(), t5117dPo.getPartialreleasenote()); 
			dataObject.setValue(T5117dPo.COLUMNS.GCODATE.name(), t5117dPo.getGcodate()); 
			dataObject.setValue(T5117dPo.COLUMNS.DECLTYPE.name(), t5117dPo.getDecltype()); 
			dataObject.setValue(T5117dPo.COLUMNS.IE.name(), t5117dPo.getIe()); 
			dataObject.setValue(T5117dPo.COLUMNS.WAREHOUSENO.name(), t5117dPo.getWarehouseno()); 
			dataObject.setValue(T5117dPo.COLUMNS.MWB.name(), t5117dPo.getMwb()); 
			dataObject.setValue(T5117dPo.COLUMNS.HWB.name(), t5117dPo.getHwb()); 
			dataObject.setValue(T5117dPo.COLUMNS.SONO.name(), t5117dPo.getSono()); 
			dataObject.setValue(T5117dPo.COLUMNS.VRNO.name(), t5117dPo.getVrno()); 
			dataObject.setValue(T5117dPo.COLUMNS.PARTRELEASENOTE.name(), t5117dPo.getPartreleasenote()); 
			dataObject.setValue(T5117dPo.COLUMNS.GCOPIECE.name(), t5117dPo.getGcopiece()); 
			dataObject.setValue(T5117dPo.COLUMNS.UNRELEASEDUNIT.name(), t5117dPo.getUnreleasedunit()); 
			dataObject.setValue(T5117dPo.COLUMNS.TTYPE.name(), t5117dPo.getTtype()); 
			dataObject.setValue(T5117dPo.COLUMNS.BRIEFNOTE.name(), t5117dPo.getBriefnote()); 
			dataObject.setValue(T5117dPo.COLUMNS.SENDSTATUS.name(), t5117dPo.getSendstatus()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<T5117dPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(T5117dPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
