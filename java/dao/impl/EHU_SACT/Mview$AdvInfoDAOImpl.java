package com.doc.common.dao.impl; 
 
public class Mview$AdvInfoDAOImpl extends GeneralDAOImpl<Mview$AdvInfoPo> implements IMview$AdvInfoDAO { 
	public static final Mview$AdvInfoDAOImpl INSTANCE = new Mview$AdvInfoDAOImpl(); 
	public static final String TABLENAME = "MVIEW$_ADV_INFO"; 

	public Mview$AdvInfoDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Mview$AdvInfoPo> CONVERTER = new MapConverter<Mview$AdvInfoPo>() { 
 
		@Override 
		public Mview$AdvInfoPo convert(final DataObject dataObject) { 
			final Mview$AdvInfoPo mview$AdvInfoPo = new Mview$AdvInfoPo(); 
			mview$AdvInfoPo.setRunid#(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvInfoPo.COLUMNS.RUNID#.name()))); 
			mview$AdvInfoPo.setSeq#(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvInfoPo.COLUMNS.SEQ#.name()))); 
			mview$AdvInfoPo.setType(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvInfoPo.COLUMNS.TYPE.name()))); 
			mview$AdvInfoPo.setInfolen(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvInfoPo.COLUMNS.INFOLEN.name()))); 
			mview$AdvInfoPo.setInfo(); 
			mview$AdvInfoPo.setStatus(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvInfoPo.COLUMNS.STATUS.name()))); 
			mview$AdvInfoPo.setFlag(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvInfoPo.COLUMNS.FLAG.name()))); 
			return mview$AdvInfoPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Mview$AdvInfoPo mview$AdvInfoPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Mview$AdvInfoPo.COLUMNS.RUNID#.name(), mview$AdvInfoPo.getRunid#()); 
			dataObject.setValue(Mview$AdvInfoPo.COLUMNS.SEQ#.name(), mview$AdvInfoPo.getSeq#()); 
			dataObject.setValue(Mview$AdvInfoPo.COLUMNS.TYPE.name(), mview$AdvInfoPo.getType()); 
			dataObject.setValue(Mview$AdvInfoPo.COLUMNS.INFOLEN.name(), mview$AdvInfoPo.getInfolen()); 
			dataObject.setValue(Mview$AdvInfoPo.COLUMNS.INFO.name(), mview$AdvInfoPo.getInfo()); 
			dataObject.setValue(Mview$AdvInfoPo.COLUMNS.STATUS.name(), mview$AdvInfoPo.getStatus()); 
			dataObject.setValue(Mview$AdvInfoPo.COLUMNS.FLAG.name(), mview$AdvInfoPo.getFlag()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Mview$AdvInfoPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Mview$AdvInfoPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Mview$AdvInfoPo.COLUMNS.RUNID#.name(), po.getRunid#()); 
		sqlWhere.add(Mview$AdvInfoPo.COLUMNS.SEQ#.name(), po.getSeq#()); 
		return sqlWhere; 
	} 
 
} 
