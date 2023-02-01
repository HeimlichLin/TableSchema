package com.doc.common.dao.impl; 
 
public class RejrsnDAOImpl extends GeneralDAOImpl<RejrsnPo> implements RejrsnDAO { 
	public static final RejrsnDAOImpl INSTANCE = new RejrsnDAOImpl(); 
	public static final String TABLENAME = "REJRSN"; 

	public RejrsnDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<RejrsnPo> CONVERTER = new MapConverter<RejrsnPo>() { 
 
		@Override 
		public RejrsnPo convert(final DataObject dataObject) { 
			final RejrsnPo rejrsnPo = new RejrsnPo(); 
			rejrsnPo.setRejno(dataObject.getString(RejrsnPo.COLUMNS.REJNO.name())); 
			rejrsnPo.setRejname(dataObject.getString(RejrsnPo.COLUMNS.REJNAME.name())); 
			return rejrsnPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final RejrsnPo rejrsnPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(RejrsnPo.COLUMNS.REJNO.name(), rejrsnPo.getRejno()); 
			dataObject.setValue(RejrsnPo.COLUMNS.REJNAME.name(), rejrsnPo.getRejname()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<RejrsnPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(RejrsnPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
