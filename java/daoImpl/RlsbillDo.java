package com.doc.common.dao.impl; 
 
public class RlsbillDAO extends GeneralDAOImpl<RlsbillDo> implements RlsbillDAO { 
	public static final RlsbillDAOImpl INSTANCE = new RlsbillDAOImpl(); 
	public static final String TABLENAME = "RLSBILL"; 

	public RlsbillDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<RlsbillDo> CONVERTER = new MapConverter<RlsbillDo>() { 
 
		@Override 
		public RlsbillDo convert(final DataObject dataObject) { 
			final RlsbillDo rlsbillDo = new RlsbillDo(); 
			rlsbillDo.setBondno(dataObject.getString(RlsbillDo.COLUMNS.BONDNO.name())); 
			rlsbillDo.setPassno(dataObject.getString(RlsbillDo.COLUMNS.PASSNO.name())); 
			rlsbillDo.setPassdate(dataObject.getString(RlsbillDo.COLUMNS.PASSDATE.name())); 
			rlsbillDo.setIntime(dataObject.getString(RlsbillDo.COLUMNS.INTIME.name())); 
			rlsbillDo.setOuttime(dataObject.getString(RlsbillDo.COLUMNS.OUTTIME.name())); 
			rlsbillDo.setVesselname(dataObject.getString(RlsbillDo.COLUMNS.VESSELNAME.name())); 
			rlsbillDo.setVoyageno(dataObject.getString(RlsbillDo.COLUMNS.VOYAGENO.name())); 
			rlsbillDo.setVesselreg(dataObject.getString(RlsbillDo.COLUMNS.VESSELREG.name())); 
			rlsbillDo.setLoccode(dataObject.getString(RlsbillDo.COLUMNS.LOCCODE.name())); 
			rlsbillDo.setGoplace(dataObject.getString(RlsbillDo.COLUMNS.GOPLACE.name())); 
			rlsbillDo.setGdstype(dataObject.getString(RlsbillDo.COLUMNS.GDSTYPE.name())); 
			rlsbillDo.setIetype(dataObject.getString(RlsbillDo.COLUMNS.IETYPE.name())); 
			rlsbillDo.setPacktype(dataObject.getString(RlsbillDo.COLUMNS.PACKTYPE.name())); 
			rlsbillDo.setContrno(dataObject.getString(RlsbillDo.COLUMNS.CONTRNO.name())); 
			rlsbillDo.setSealno(dataObject.getString(RlsbillDo.COLUMNS.SEALNO.name())); 
			rlsbillDo.setSealno2(dataObject.getString(RlsbillDo.COLUMNS.SEALNO2.name())); 
			rlsbillDo.setSealno3(dataObject.getString(RlsbillDo.COLUMNS.SEALNO3.name())); 
			rlsbillDo.setSealno4(dataObject.getString(RlsbillDo.COLUMNS.SEALNO4.name())); 
			rlsbillDo.setShsealno(dataObject.getString(RlsbillDo.COLUMNS.SHSEALNO.name())); 
			rlsbillDo.setShsealno2(dataObject.getString(RlsbillDo.COLUMNS.SHSEALNO2.name())); 
			rlsbillDo.setPkgqty(BigDecimalUtils.formObj(dataObject.getString(RlsbillDo.COLUMNS.PKGQTY.name()))); 
			rlsbillDo.setRlsqty(BigDecimalUtils.formObj(dataObject.getString(RlsbillDo.COLUMNS.RLSQTY.name()))); 
			rlsbillDo.setOwner(dataObject.getString(RlsbillDo.COLUMNS.OWNER.name())); 
			rlsbillDo.setCarcomp(dataObject.getString(RlsbillDo.COLUMNS.CARCOMP.name())); 
			rlsbillDo.setCarno(dataObject.getString(RlsbillDo.COLUMNS.CARNO.name())); 
			rlsbillDo.setDriver(dataObject.getString(RlsbillDo.COLUMNS.DRIVER.name())); 
			rlsbillDo.setIdno(dataObject.getString(RlsbillDo.COLUMNS.IDNO.name())); 
			rlsbillDo.setLabelmark(dataObject.getString(RlsbillDo.COLUMNS.LABELMARK.name())); 
			rlsbillDo.setRbstatus(dataObject.getString(RlsbillDo.COLUMNS.RBSTATUS.name())); 
			rlsbillDo.setSono(dataObject.getString(RlsbillDo.COLUMNS.SONO.name())); 
			rlsbillDo.setCcccode(dataObject.getString(RlsbillDo.COLUMNS.CCCCODE.name())); 
			rlsbillDo.setDeclno(dataObject.getString(RlsbillDo.COLUMNS.DECLNO.name())); 
			rlsbillDo.setExtracond(dataObject.getString(RlsbillDo.COLUMNS.EXTRACOND.name())); 
			return rlsbillDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final RlsbillDo rlsbillDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(RlsbillDo.COLUMNS.BONDNO.name(), rlsbillDo.getBondno()); 
			dataObject.setValue(RlsbillDo.COLUMNS.PASSNO.name(), rlsbillDo.getPassno()); 
			dataObject.setValue(RlsbillDo.COLUMNS.PASSDATE.name(), rlsbillDo.getPassdate()); 
			dataObject.setValue(RlsbillDo.COLUMNS.INTIME.name(), rlsbillDo.getIntime()); 
			dataObject.setValue(RlsbillDo.COLUMNS.OUTTIME.name(), rlsbillDo.getOuttime()); 
			dataObject.setValue(RlsbillDo.COLUMNS.VESSELNAME.name(), rlsbillDo.getVesselname()); 
			dataObject.setValue(RlsbillDo.COLUMNS.VOYAGENO.name(), rlsbillDo.getVoyageno()); 
			dataObject.setValue(RlsbillDo.COLUMNS.VESSELREG.name(), rlsbillDo.getVesselreg()); 
			dataObject.setValue(RlsbillDo.COLUMNS.LOCCODE.name(), rlsbillDo.getLoccode()); 
			dataObject.setValue(RlsbillDo.COLUMNS.GOPLACE.name(), rlsbillDo.getGoplace()); 
			dataObject.setValue(RlsbillDo.COLUMNS.GDSTYPE.name(), rlsbillDo.getGdstype()); 
			dataObject.setValue(RlsbillDo.COLUMNS.IETYPE.name(), rlsbillDo.getIetype()); 
			dataObject.setValue(RlsbillDo.COLUMNS.PACKTYPE.name(), rlsbillDo.getPacktype()); 
			dataObject.setValue(RlsbillDo.COLUMNS.CONTRNO.name(), rlsbillDo.getContrno()); 
			dataObject.setValue(RlsbillDo.COLUMNS.SEALNO.name(), rlsbillDo.getSealno()); 
			dataObject.setValue(RlsbillDo.COLUMNS.SEALNO2.name(), rlsbillDo.getSealno2()); 
			dataObject.setValue(RlsbillDo.COLUMNS.SEALNO3.name(), rlsbillDo.getSealno3()); 
			dataObject.setValue(RlsbillDo.COLUMNS.SEALNO4.name(), rlsbillDo.getSealno4()); 
			dataObject.setValue(RlsbillDo.COLUMNS.SHSEALNO.name(), rlsbillDo.getShsealno()); 
			dataObject.setValue(RlsbillDo.COLUMNS.SHSEALNO2.name(), rlsbillDo.getShsealno2()); 
			dataObject.setValue(RlsbillDo.COLUMNS.PKGQTY.name(), rlsbillDo.getPkgqty()); 
			dataObject.setValue(RlsbillDo.COLUMNS.RLSQTY.name(), rlsbillDo.getRlsqty()); 
			dataObject.setValue(RlsbillDo.COLUMNS.OWNER.name(), rlsbillDo.getOwner()); 
			dataObject.setValue(RlsbillDo.COLUMNS.CARCOMP.name(), rlsbillDo.getCarcomp()); 
			dataObject.setValue(RlsbillDo.COLUMNS.CARNO.name(), rlsbillDo.getCarno()); 
			dataObject.setValue(RlsbillDo.COLUMNS.DRIVER.name(), rlsbillDo.getDriver()); 
			dataObject.setValue(RlsbillDo.COLUMNS.IDNO.name(), rlsbillDo.getIdno()); 
			dataObject.setValue(RlsbillDo.COLUMNS.LABELMARK.name(), rlsbillDo.getLabelmark()); 
			dataObject.setValue(RlsbillDo.COLUMNS.RBSTATUS.name(), rlsbillDo.getRbstatus()); 
			dataObject.setValue(RlsbillDo.COLUMNS.SONO.name(), rlsbillDo.getSono()); 
			dataObject.setValue(RlsbillDo.COLUMNS.CCCCODE.name(), rlsbillDo.getCcccode()); 
			dataObject.setValue(RlsbillDo.COLUMNS.DECLNO.name(), rlsbillDo.getDeclno()); 
			dataObject.setValue(RlsbillDo.COLUMNS.EXTRACOND.name(), rlsbillDo.getExtracond()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<RlsbillDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(RlsbillDo po) { 
		sqlWhere.add(RlsbillDo.COLUMNS.PASSDATE.name(), po.getPassdate()); 
		sqlWhere.add(RlsbillDo.COLUMNS.INTIME.name(), po.getIntime()); 
		sqlWhere.add(RlsbillDo.COLUMNS.OUTTIME.name(), po.getOuttime()); 
		sqlWhere.add(RlsbillDo.COLUMNS.VESSELNAME.name(), po.getVesselname()); 
		sqlWhere.add(RlsbillDo.COLUMNS.VOYAGENO.name(), po.getVoyageno()); 
		sqlWhere.add(RlsbillDo.COLUMNS.VESSELREG.name(), po.getVesselreg()); 
		sqlWhere.add(RlsbillDo.COLUMNS.LOCCODE.name(), po.getLoccode()); 
		sqlWhere.add(RlsbillDo.COLUMNS.GOPLACE.name(), po.getGoplace()); 
		sqlWhere.add(RlsbillDo.COLUMNS.GDSTYPE.name(), po.getGdstype()); 
		sqlWhere.add(RlsbillDo.COLUMNS.IETYPE.name(), po.getIetype()); 
		sqlWhere.add(RlsbillDo.COLUMNS.PACKTYPE.name(), po.getPacktype()); 
		sqlWhere.add(RlsbillDo.COLUMNS.CONTRNO.name(), po.getContrno()); 
		sqlWhere.add(RlsbillDo.COLUMNS.SEALNO.name(), po.getSealno()); 
		sqlWhere.add(RlsbillDo.COLUMNS.SEALNO2.name(), po.getSealno2()); 
		sqlWhere.add(RlsbillDo.COLUMNS.SEALNO3.name(), po.getSealno3()); 
		sqlWhere.add(RlsbillDo.COLUMNS.SEALNO4.name(), po.getSealno4()); 
		sqlWhere.add(RlsbillDo.COLUMNS.SHSEALNO.name(), po.getShsealno()); 
		sqlWhere.add(RlsbillDo.COLUMNS.SHSEALNO2.name(), po.getShsealno2()); 
		sqlWhere.add(RlsbillDo.COLUMNS.PKGQTY.name(), po.getPkgqty()); 
		sqlWhere.add(RlsbillDo.COLUMNS.RLSQTY.name(), po.getRlsqty()); 
		sqlWhere.add(RlsbillDo.COLUMNS.OWNER.name(), po.getOwner()); 
		sqlWhere.add(RlsbillDo.COLUMNS.CARCOMP.name(), po.getCarcomp()); 
		sqlWhere.add(RlsbillDo.COLUMNS.CARNO.name(), po.getCarno()); 
		sqlWhere.add(RlsbillDo.COLUMNS.DRIVER.name(), po.getDriver()); 
		sqlWhere.add(RlsbillDo.COLUMNS.IDNO.name(), po.getIdno()); 
		sqlWhere.add(RlsbillDo.COLUMNS.LABELMARK.name(), po.getLabelmark()); 
		sqlWhere.add(RlsbillDo.COLUMNS.RBSTATUS.name(), po.getRbstatus()); 
		sqlWhere.add(RlsbillDo.COLUMNS.SONO.name(), po.getSono()); 
		sqlWhere.add(RlsbillDo.COLUMNS.CCCCODE.name(), po.getCcccode()); 
		sqlWhere.add(RlsbillDo.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(RlsbillDo.COLUMNS.EXTRACOND.name(), po.getExtracond()); 
	} 
 
} 
