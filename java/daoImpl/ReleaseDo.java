package com.doc.common.dao.impl; 
 
public class ReleaseDAO extends GeneralDAOImpl<ReleaseDo> implements ReleaseDAO { 
	public static final ReleaseDAOImpl INSTANCE = new ReleaseDAOImpl(); 
	public static final String TABLENAME = "RELEASE"; 

	public ReleaseDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<ReleaseDo> CONVERTER = new MapConverter<ReleaseDo>() { 
 
		@Override 
		public ReleaseDo convert(final DataObject dataObject) { 
			final ReleaseDo releaseDo = new ReleaseDo(); 
			releaseDo.setBoxno(dataObject.getString(ReleaseDo.COLUMNS.BOXNO.name())); 
			releaseDo.setDecltype(dataObject.getString(ReleaseDo.COLUMNS.DECLTYPE.name())); 
			releaseDo.setDeclno(dataObject.getString(ReleaseDo.COLUMNS.DECLNO.name())); 
			releaseDo.setStgplace(dataObject.getString(ReleaseDo.COLUMNS.STGPLACE.name())); 
			releaseDo.setRlstime(CommUtils.objConver2Time(dataObject.getString(ReleaseDo.COLUMNS.RLSTIME.name()))); 
			releaseDo.setRlspkg(BigDecimalUtils.formObj(dataObject.getString(ReleaseDo.COLUMNS.RLSPKG.name()))); 
			releaseDo.setPkgunit(dataObject.getString(ReleaseDo.COLUMNS.PKGUNIT.name())); 
			releaseDo.setGwgt(BigDecimalUtils.formObj(dataObject.getString(ReleaseDo.COLUMNS.GWGT.name()))); 
			releaseDo.setExtracond(dataObject.getString(ReleaseDo.COLUMNS.EXTRACOND.name())); 
			releaseDo.setVesselsign(dataObject.getString(ReleaseDo.COLUMNS.VESSELSIGN.name())); 
			releaseDo.setVoyageno(dataObject.getString(ReleaseDo.COLUMNS.VOYAGENO.name())); 
			releaseDo.setShipcode(dataObject.getString(ReleaseDo.COLUMNS.SHIPCODE.name())); 
			releaseDo.setExporter(dataObject.getString(ReleaseDo.COLUMNS.EXPORTER.name())); 
			releaseDo.setCleartype(dataObject.getString(ReleaseDo.COLUMNS.CLEARTYPE.name())); 
			releaseDo.setMsgtype(dataObject.getString(ReleaseDo.COLUMNS.MSGTYPE.name())); 
			releaseDo.setStrtype(dataObject.getString(ReleaseDo.COLUMNS.STRTYPE.name())); 
			releaseDo.setAstype(dataObject.getString(ReleaseDo.COLUMNS.ASTYPE.name())); 
			releaseDo.setMawbno(dataObject.getString(ReleaseDo.COLUMNS.MAWBNO.name())); 
			releaseDo.setHawbno(dataObject.getString(ReleaseDo.COLUMNS.HAWBNO.name())); 
			releaseDo.setUnrlspkg(BigDecimalUtils.formObj(dataObject.getString(ReleaseDo.COLUMNS.UNRLSPKG.name()))); 
			releaseDo.setUnpkgunit(dataObject.getString(ReleaseDo.COLUMNS.UNPKGUNIT.name())); 
			return releaseDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ReleaseDo releaseDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ReleaseDo.COLUMNS.BOXNO.name(), releaseDo.getBoxno()); 
			dataObject.setValue(ReleaseDo.COLUMNS.DECLTYPE.name(), releaseDo.getDecltype()); 
			dataObject.setValue(ReleaseDo.COLUMNS.DECLNO.name(), releaseDo.getDeclno()); 
			dataObject.setValue(ReleaseDo.COLUMNS.STGPLACE.name(), releaseDo.getStgplace()); 
			dataObject.setValue(ReleaseDo.COLUMNS.RLSTIME.name(), releaseDo.getRlstime()); 
			dataObject.setValue(ReleaseDo.COLUMNS.RLSPKG.name(), releaseDo.getRlspkg()); 
			dataObject.setValue(ReleaseDo.COLUMNS.PKGUNIT.name(), releaseDo.getPkgunit()); 
			dataObject.setValue(ReleaseDo.COLUMNS.GWGT.name(), releaseDo.getGwgt()); 
			dataObject.setValue(ReleaseDo.COLUMNS.EXTRACOND.name(), releaseDo.getExtracond()); 
			dataObject.setValue(ReleaseDo.COLUMNS.VESSELSIGN.name(), releaseDo.getVesselsign()); 
			dataObject.setValue(ReleaseDo.COLUMNS.VOYAGENO.name(), releaseDo.getVoyageno()); 
			dataObject.setValue(ReleaseDo.COLUMNS.SHIPCODE.name(), releaseDo.getShipcode()); 
			dataObject.setValue(ReleaseDo.COLUMNS.EXPORTER.name(), releaseDo.getExporter()); 
			dataObject.setValue(ReleaseDo.COLUMNS.CLEARTYPE.name(), releaseDo.getCleartype()); 
			dataObject.setValue(ReleaseDo.COLUMNS.MSGTYPE.name(), releaseDo.getMsgtype()); 
			dataObject.setValue(ReleaseDo.COLUMNS.STRTYPE.name(), releaseDo.getStrtype()); 
			dataObject.setValue(ReleaseDo.COLUMNS.ASTYPE.name(), releaseDo.getAstype()); 
			dataObject.setValue(ReleaseDo.COLUMNS.MAWBNO.name(), releaseDo.getMawbno()); 
			dataObject.setValue(ReleaseDo.COLUMNS.HAWBNO.name(), releaseDo.getHawbno()); 
			dataObject.setValue(ReleaseDo.COLUMNS.UNRLSPKG.name(), releaseDo.getUnrlspkg()); 
			dataObject.setValue(ReleaseDo.COLUMNS.UNPKGUNIT.name(), releaseDo.getUnpkgunit()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ReleaseDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ReleaseDo po) { 
		sqlWhere.add(ReleaseDo.COLUMNS.BOXNO.name(), po.getBoxno()); 
		sqlWhere.add(ReleaseDo.COLUMNS.DECLTYPE.name(), po.getDecltype()); 
		sqlWhere.add(ReleaseDo.COLUMNS.STGPLACE.name(), po.getStgplace()); 
		sqlWhere.add(ReleaseDo.COLUMNS.RLSTIME.name(), po.getRlstime()); 
		sqlWhere.add(ReleaseDo.COLUMNS.RLSPKG.name(), po.getRlspkg()); 
		sqlWhere.add(ReleaseDo.COLUMNS.PKGUNIT.name(), po.getPkgunit()); 
		sqlWhere.add(ReleaseDo.COLUMNS.GWGT.name(), po.getGwgt()); 
		sqlWhere.add(ReleaseDo.COLUMNS.EXTRACOND.name(), po.getExtracond()); 
		sqlWhere.add(ReleaseDo.COLUMNS.VESSELSIGN.name(), po.getVesselsign()); 
		sqlWhere.add(ReleaseDo.COLUMNS.VOYAGENO.name(), po.getVoyageno()); 
		sqlWhere.add(ReleaseDo.COLUMNS.SHIPCODE.name(), po.getShipcode()); 
		sqlWhere.add(ReleaseDo.COLUMNS.EXPORTER.name(), po.getExporter()); 
		sqlWhere.add(ReleaseDo.COLUMNS.CLEARTYPE.name(), po.getCleartype()); 
		sqlWhere.add(ReleaseDo.COLUMNS.STRTYPE.name(), po.getStrtype()); 
		sqlWhere.add(ReleaseDo.COLUMNS.MAWBNO.name(), po.getMawbno()); 
		sqlWhere.add(ReleaseDo.COLUMNS.HAWBNO.name(), po.getHawbno()); 
		sqlWhere.add(ReleaseDo.COLUMNS.UNRLSPKG.name(), po.getUnrlspkg()); 
		sqlWhere.add(ReleaseDo.COLUMNS.UNPKGUNIT.name(), po.getUnpkgunit()); 
	} 
 
} 
