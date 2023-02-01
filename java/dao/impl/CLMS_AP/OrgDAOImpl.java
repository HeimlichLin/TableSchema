package com.doc.common.dao.impl; 
 
public class OrgDAOImpl extends GeneralDAOImpl<OrgPo> implements OrgDAO { 
	public static final OrgDAOImpl INSTANCE = new OrgDAOImpl(); 
	public static final String TABLENAME = "ORG"; 

	public OrgDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<OrgPo> CONVERTER = new MapConverter<OrgPo>() { 
 
		@Override 
		public OrgPo convert(final DataObject dataObject) { 
			final OrgPo orgPo = new OrgPo(); 
			orgPo.setId(BigDecimalUtils.formObj(dataObject.getValue(OrgPo.COLUMNS.ID.name()))); 
			orgPo.setName(); 
			orgPo.setYear(BigDecimalUtils.formObj(dataObject.getValue(OrgPo.COLUMNS.YEAR.name()))); 
			orgPo.setCode(); 
			return orgPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final OrgPo orgPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(OrgPo.COLUMNS.ID.name(), orgPo.getId()); 
			dataObject.setValue(OrgPo.COLUMNS.NAME.name(), orgPo.getName()); 
			dataObject.setValue(OrgPo.COLUMNS.YEAR.name(), orgPo.getYear()); 
			dataObject.setValue(OrgPo.COLUMNS.CODE.name(), orgPo.getCode()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<OrgPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(OrgPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
