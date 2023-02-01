package com.doc.common.dao.impl; 
 
public class ReleaseDAOImpl extends GeneralDAOImpl<ReleasePo> implements ReleaseDAO { 
	public static final ReleaseDAOImpl INSTANCE = new ReleaseDAOImpl(); 
	public static final String TABLENAME = "RELEASE"; 

	public ReleaseDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ReleasePo> CONVERTER = new MapConverter<ReleasePo>() { 
 
		@Override 
		public ReleasePo convert(final DataObject dataObject) { 
			final ReleasePo releasePo = new ReleasePo(); 
			releasePo.setBoxno(dataObject.getString(ReleasePo.COLUMNS.BOXNO.name())); 
			releasePo.setDecltype(dataObject.getString(ReleasePo.COLUMNS.DECLTYPE.name())); 
			releasePo.setDeclno(dataObject.getString(ReleasePo.COLUMNS.DECLNO.name())); 
			releasePo.setStgplace(dataObject.getString(ReleasePo.COLUMNS.STGPLACE.name())); 
			releasePo.setRlstime(TimestampUtils.of(dataObject.getValue(ReleasePo.COLUMNS.RLSTIME.name()))); 
			releasePo.setRlspkg(BigDecimalUtils.formObj(dataObject.getValue(ReleasePo.COLUMNS.RLSPKG.name()))); 
			releasePo.setPkgunit(dataObject.getString(ReleasePo.COLUMNS.PKGUNIT.name())); 
			releasePo.setGwgt(BigDecimalUtils.formObj(dataObject.getValue(ReleasePo.COLUMNS.GWGT.name()))); 
			releasePo.setExtracond(dataObject.getString(ReleasePo.COLUMNS.EXTRACOND.name())); 
			releasePo.setVesselsign(dataObject.getString(ReleasePo.COLUMNS.VESSELSIGN.name())); 
			releasePo.setVoyageno(dataObject.getString(ReleasePo.COLUMNS.VOYAGENO.name())); 
			releasePo.setShipcode(dataObject.getString(ReleasePo.COLUMNS.SHIPCODE.name())); 
			releasePo.setExporter(dataObject.getString(ReleasePo.COLUMNS.EXPORTER.name())); 
			releasePo.setCleartype(dataObject.getString(ReleasePo.COLUMNS.CLEARTYPE.name())); 
			releasePo.setMsgtype(dataObject.getString(ReleasePo.COLUMNS.MSGTYPE.name())); 
			releasePo.setStrtype(dataObject.getString(ReleasePo.COLUMNS.STRTYPE.name())); 
			releasePo.setAstype(dataObject.getString(ReleasePo.COLUMNS.ASTYPE.name())); 
			releasePo.setMawbno(dataObject.getString(ReleasePo.COLUMNS.MAWBNO.name())); 
			releasePo.setHawbno(dataObject.getString(ReleasePo.COLUMNS.HAWBNO.name())); 
			releasePo.setUnrlspkg(BigDecimalUtils.formObj(dataObject.getValue(ReleasePo.COLUMNS.UNRLSPKG.name()))); 
			releasePo.setUnpkgunit(dataObject.getString(ReleasePo.COLUMNS.UNPKGUNIT.name())); 
			return releasePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ReleasePo releasePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ReleasePo.COLUMNS.BOXNO.name(), releasePo.getBoxno()); 
			dataObject.setValue(ReleasePo.COLUMNS.DECLTYPE.name(), releasePo.getDecltype()); 
			dataObject.setValue(ReleasePo.COLUMNS.DECLNO.name(), releasePo.getDeclno()); 
			dataObject.setValue(ReleasePo.COLUMNS.STGPLACE.name(), releasePo.getStgplace()); 
			dataObject.setValue(ReleasePo.COLUMNS.RLSTIME.name(), releasePo.getRlstime()); 
			dataObject.setValue(ReleasePo.COLUMNS.RLSPKG.name(), releasePo.getRlspkg()); 
			dataObject.setValue(ReleasePo.COLUMNS.PKGUNIT.name(), releasePo.getPkgunit()); 
			dataObject.setValue(ReleasePo.COLUMNS.GWGT.name(), releasePo.getGwgt()); 
			dataObject.setValue(ReleasePo.COLUMNS.EXTRACOND.name(), releasePo.getExtracond()); 
			dataObject.setValue(ReleasePo.COLUMNS.VESSELSIGN.name(), releasePo.getVesselsign()); 
			dataObject.setValue(ReleasePo.COLUMNS.VOYAGENO.name(), releasePo.getVoyageno()); 
			dataObject.setValue(ReleasePo.COLUMNS.SHIPCODE.name(), releasePo.getShipcode()); 
			dataObject.setValue(ReleasePo.COLUMNS.EXPORTER.name(), releasePo.getExporter()); 
			dataObject.setValue(ReleasePo.COLUMNS.CLEARTYPE.name(), releasePo.getCleartype()); 
			dataObject.setValue(ReleasePo.COLUMNS.MSGTYPE.name(), releasePo.getMsgtype()); 
			dataObject.setValue(ReleasePo.COLUMNS.STRTYPE.name(), releasePo.getStrtype()); 
			dataObject.setValue(ReleasePo.COLUMNS.ASTYPE.name(), releasePo.getAstype()); 
			dataObject.setValue(ReleasePo.COLUMNS.MAWBNO.name(), releasePo.getMawbno()); 
			dataObject.setValue(ReleasePo.COLUMNS.HAWBNO.name(), releasePo.getHawbno()); 
			dataObject.setValue(ReleasePo.COLUMNS.UNRLSPKG.name(), releasePo.getUnrlspkg()); 
			dataObject.setValue(ReleasePo.COLUMNS.UNPKGUNIT.name(), releasePo.getUnpkgunit()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ReleasePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ReleasePo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(ReleasePo.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(ReleasePo.COLUMNS.MSGTYPE.name(), po.getMsgtype()); 
		sqlWhere.add(ReleasePo.COLUMNS.ASTYPE.name(), po.getAstype()); 
		return sqlWhere; 
	} 
 
} 
