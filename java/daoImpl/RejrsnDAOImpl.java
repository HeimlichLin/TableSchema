package com.doc.common.dao.impl; 
 
public class RejrsnDAOImpl extends GeneralDAOImpl<RejrsnDo> implements RejrsnDAOImpl { 
	public static final RejrsnDAOImpl INSTANCE = new RejrsnDAOImpl(); 
	public static final String TABLENAME = "REJRSN"; 

	public RejrsnDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<RejrsnDo> CONVERTER = new MapConverter<RejrsnDo>() { 
 
		@Override 
		public RejrsnDo convert(final DataObject dataObject) { 
			final RejrsnDo rejrsnDo = new RejrsnDo(); 
			rejrsnDo.setRejno(dataObject.getString(RejrsnDo.COLUMNS.REJNO.name())); 
			rejrsnDo.setRejname(dataObject.getString(RejrsnDo.COLUMNS.REJNAME.name())); 
			return rejrsnDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final RejrsnDo rejrsnDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(RejrsnDo.COLUMNS.REJNO.name(), rejrsnDo.getRejno()); 
			dataObject.setValue(RejrsnDo.COLUMNS.REJNAME.name(), rejrsnDo.getRejname()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<RejrsnDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(RejrsnDo po) { 
	} 
 
} 
