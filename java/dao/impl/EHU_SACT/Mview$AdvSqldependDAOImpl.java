package com.doc.common.dao.impl; 
 
public class Mview$AdvSqldependDAOImpl extends GeneralDAOImpl<Mview$AdvSqldependPo> implements IMview$AdvSqldependDAO { 
	public static final Mview$AdvSqldependDAOImpl INSTANCE = new Mview$AdvSqldependDAOImpl(); 
	public static final String TABLENAME = "MVIEW$_ADV_SQLDEPEND"; 

	public Mview$AdvSqldependDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Mview$AdvSqldependPo> CONVERTER = new MapConverter<Mview$AdvSqldependPo>() { 
 
		@Override 
		public Mview$AdvSqldependPo convert(final DataObject dataObject) { 
			final Mview$AdvSqldependPo mview$AdvSqldependPo = new Mview$AdvSqldependPo(); 
			mview$AdvSqldependPo.setCollectionid#(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvSqldependPo.COLUMNS.COLLECTIONID#.name()))); 
			mview$AdvSqldependPo.setInstId(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvSqldependPo.COLUMNS.INST_ID.name()))); 
			mview$AdvSqldependPo.setFromAddress(); 
			mview$AdvSqldependPo.setFromHash(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvSqldependPo.COLUMNS.FROM_HASH.name()))); 
			mview$AdvSqldependPo.setToOwner(dataObject.getString(Mview$AdvSqldependPo.COLUMNS.TO_OWNER.name())); 
			mview$AdvSqldependPo.setToName(dataObject.getString(Mview$AdvSqldependPo.COLUMNS.TO_NAME.name())); 
			mview$AdvSqldependPo.setToType(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvSqldependPo.COLUMNS.TO_TYPE.name()))); 
			mview$AdvSqldependPo.setCardinality(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvSqldependPo.COLUMNS.CARDINALITY.name()))); 
			return mview$AdvSqldependPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Mview$AdvSqldependPo mview$AdvSqldependPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Mview$AdvSqldependPo.COLUMNS.COLLECTIONID#.name(), mview$AdvSqldependPo.getCollectionid#()); 
			dataObject.setValue(Mview$AdvSqldependPo.COLUMNS.INST_ID.name(), mview$AdvSqldependPo.getInstId()); 
			dataObject.setValue(Mview$AdvSqldependPo.COLUMNS.FROM_ADDRESS.name(), mview$AdvSqldependPo.getFromAddress()); 
			dataObject.setValue(Mview$AdvSqldependPo.COLUMNS.FROM_HASH.name(), mview$AdvSqldependPo.getFromHash()); 
			dataObject.setValue(Mview$AdvSqldependPo.COLUMNS.TO_OWNER.name(), mview$AdvSqldependPo.getToOwner()); 
			dataObject.setValue(Mview$AdvSqldependPo.COLUMNS.TO_NAME.name(), mview$AdvSqldependPo.getToName()); 
			dataObject.setValue(Mview$AdvSqldependPo.COLUMNS.TO_TYPE.name(), mview$AdvSqldependPo.getToType()); 
			dataObject.setValue(Mview$AdvSqldependPo.COLUMNS.CARDINALITY.name(), mview$AdvSqldependPo.getCardinality()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Mview$AdvSqldependPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Mview$AdvSqldependPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
