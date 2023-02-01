package com.doc.common.dao.impl; 
 
public class OpprofileDAOImpl extends GeneralDAOImpl<OpprofilePo> implements OpprofileDAO { 
	public static final OpprofileDAOImpl INSTANCE = new OpprofileDAOImpl(); 
	public static final String TABLENAME = "OPPROFILE"; 

	public OpprofileDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<OpprofilePo> CONVERTER = new MapConverter<OpprofilePo>() { 
 
		@Override 
		public OpprofilePo convert(final DataObject dataObject) { 
			final OpprofilePo opprofilePo = new OpprofilePo(); 
			opprofilePo.setOpid(dataObject.getString(OpprofilePo.COLUMNS.OPID.name())); 
			opprofilePo.setOpcname(dataObject.getString(OpprofilePo.COLUMNS.OPCNAME.name())); 
			opprofilePo.setOpsname(dataObject.getString(OpprofilePo.COLUMNS.OPSNAME.name())); 
			return opprofilePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final OpprofilePo opprofilePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(OpprofilePo.COLUMNS.OPID.name(), opprofilePo.getOpid()); 
			dataObject.setValue(OpprofilePo.COLUMNS.OPCNAME.name(), opprofilePo.getOpcname()); 
			dataObject.setValue(OpprofilePo.COLUMNS.OPSNAME.name(), opprofilePo.getOpsname()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<OpprofilePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(OpprofilePo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
