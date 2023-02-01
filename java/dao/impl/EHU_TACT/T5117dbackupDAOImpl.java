package com.doc.common.dao.impl; 
 
public class T5117dbackupDAOImpl extends GeneralDAOImpl<T5117dbackupPo> implements T5117dbackupDAO { 
	public static final T5117dbackupDAOImpl INSTANCE = new T5117dbackupDAOImpl(); 
	public static final String TABLENAME = "T5117DBACKUP"; 

	public T5117dbackupDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<T5117dbackupPo> CONVERTER = new MapConverter<T5117dbackupPo>() { 
 
		@Override 
		public T5117dbackupPo convert(final DataObject dataObject) { 
			final T5117dbackupPo t5117dbackupPo = new T5117dbackupPo(); 
			t5117dbackupPo.setControlno(dataObject.getString(T5117dbackupPo.COLUMNS.CONTROLNO.name())); 
			t5117dbackupPo.setDeclno(dataObject.getString(T5117dbackupPo.COLUMNS.DECLNO.name())); 
			t5117dbackupPo.setPartialreleasenote(dataObject.getString(T5117dbackupPo.COLUMNS.PARTIALRELEASENOTE.name())); 
			t5117dbackupPo.setGcodate(dataObject.getString(T5117dbackupPo.COLUMNS.GCODATE.name())); 
			t5117dbackupPo.setDecltype(dataObject.getString(T5117dbackupPo.COLUMNS.DECLTYPE.name())); 
			t5117dbackupPo.setIe(dataObject.getString(T5117dbackupPo.COLUMNS.IE.name())); 
			t5117dbackupPo.setWarehouseno(dataObject.getString(T5117dbackupPo.COLUMNS.WAREHOUSENO.name())); 
			t5117dbackupPo.setMwb(dataObject.getString(T5117dbackupPo.COLUMNS.MWB.name())); 
			t5117dbackupPo.setHwb(dataObject.getString(T5117dbackupPo.COLUMNS.HWB.name())); 
			t5117dbackupPo.setSono(dataObject.getString(T5117dbackupPo.COLUMNS.SONO.name())); 
			t5117dbackupPo.setVrno(dataObject.getString(T5117dbackupPo.COLUMNS.VRNO.name())); 
			t5117dbackupPo.setPartreleasenote(dataObject.getString(T5117dbackupPo.COLUMNS.PARTRELEASENOTE.name())); 
			t5117dbackupPo.setGcopiece(dataObject.getString(T5117dbackupPo.COLUMNS.GCOPIECE.name())); 
			t5117dbackupPo.setUnreleasedunit(dataObject.getString(T5117dbackupPo.COLUMNS.UNRELEASEDUNIT.name())); 
			t5117dbackupPo.setTtype(dataObject.getString(T5117dbackupPo.COLUMNS.TTYPE.name())); 
			t5117dbackupPo.setBriefnote(dataObject.getString(T5117dbackupPo.COLUMNS.BRIEFNOTE.name())); 
			t5117dbackupPo.setSendstatus(dataObject.getString(T5117dbackupPo.COLUMNS.SENDSTATUS.name())); 
			return t5117dbackupPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final T5117dbackupPo t5117dbackupPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(T5117dbackupPo.COLUMNS.CONTROLNO.name(), t5117dbackupPo.getControlno()); 
			dataObject.setValue(T5117dbackupPo.COLUMNS.DECLNO.name(), t5117dbackupPo.getDeclno()); 
			dataObject.setValue(T5117dbackupPo.COLUMNS.PARTIALRELEASENOTE.name(), t5117dbackupPo.getPartialreleasenote()); 
			dataObject.setValue(T5117dbackupPo.COLUMNS.GCODATE.name(), t5117dbackupPo.getGcodate()); 
			dataObject.setValue(T5117dbackupPo.COLUMNS.DECLTYPE.name(), t5117dbackupPo.getDecltype()); 
			dataObject.setValue(T5117dbackupPo.COLUMNS.IE.name(), t5117dbackupPo.getIe()); 
			dataObject.setValue(T5117dbackupPo.COLUMNS.WAREHOUSENO.name(), t5117dbackupPo.getWarehouseno()); 
			dataObject.setValue(T5117dbackupPo.COLUMNS.MWB.name(), t5117dbackupPo.getMwb()); 
			dataObject.setValue(T5117dbackupPo.COLUMNS.HWB.name(), t5117dbackupPo.getHwb()); 
			dataObject.setValue(T5117dbackupPo.COLUMNS.SONO.name(), t5117dbackupPo.getSono()); 
			dataObject.setValue(T5117dbackupPo.COLUMNS.VRNO.name(), t5117dbackupPo.getVrno()); 
			dataObject.setValue(T5117dbackupPo.COLUMNS.PARTRELEASENOTE.name(), t5117dbackupPo.getPartreleasenote()); 
			dataObject.setValue(T5117dbackupPo.COLUMNS.GCOPIECE.name(), t5117dbackupPo.getGcopiece()); 
			dataObject.setValue(T5117dbackupPo.COLUMNS.UNRELEASEDUNIT.name(), t5117dbackupPo.getUnreleasedunit()); 
			dataObject.setValue(T5117dbackupPo.COLUMNS.TTYPE.name(), t5117dbackupPo.getTtype()); 
			dataObject.setValue(T5117dbackupPo.COLUMNS.BRIEFNOTE.name(), t5117dbackupPo.getBriefnote()); 
			dataObject.setValue(T5117dbackupPo.COLUMNS.SENDSTATUS.name(), t5117dbackupPo.getSendstatus()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<T5117dbackupPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(T5117dbackupPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
