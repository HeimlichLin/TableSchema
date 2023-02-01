package com.doc.common.dao.impl; 
 
public class RlsbillDAOImpl extends GeneralDAOImpl<RlsbillPo> implements RlsbillDAO { 
	public static final RlsbillDAOImpl INSTANCE = new RlsbillDAOImpl(); 
	public static final String TABLENAME = "RLSBILL"; 

	public RlsbillDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<RlsbillPo> CONVERTER = new MapConverter<RlsbillPo>() { 
 
		@Override 
		public RlsbillPo convert(final DataObject dataObject) { 
			final RlsbillPo rlsbillPo = new RlsbillPo(); 
			rlsbillPo.setBondno(dataObject.getString(RlsbillPo.COLUMNS.BONDNO.name())); 
			rlsbillPo.setPassno(dataObject.getString(RlsbillPo.COLUMNS.PASSNO.name())); 
			rlsbillPo.setPassdate(dataObject.getString(RlsbillPo.COLUMNS.PASSDATE.name())); 
			rlsbillPo.setIntime(dataObject.getString(RlsbillPo.COLUMNS.INTIME.name())); 
			rlsbillPo.setOuttime(dataObject.getString(RlsbillPo.COLUMNS.OUTTIME.name())); 
			rlsbillPo.setVesselname(dataObject.getString(RlsbillPo.COLUMNS.VESSELNAME.name())); 
			rlsbillPo.setVoyageno(dataObject.getString(RlsbillPo.COLUMNS.VOYAGENO.name())); 
			rlsbillPo.setVesselreg(dataObject.getString(RlsbillPo.COLUMNS.VESSELREG.name())); 
			rlsbillPo.setLoccode(dataObject.getString(RlsbillPo.COLUMNS.LOCCODE.name())); 
			rlsbillPo.setGoplace(dataObject.getString(RlsbillPo.COLUMNS.GOPLACE.name())); 
			rlsbillPo.setGdstype(dataObject.getString(RlsbillPo.COLUMNS.GDSTYPE.name())); 
			rlsbillPo.setIetype(dataObject.getString(RlsbillPo.COLUMNS.IETYPE.name())); 
			rlsbillPo.setPacktype(dataObject.getString(RlsbillPo.COLUMNS.PACKTYPE.name())); 
			rlsbillPo.setContrno(dataObject.getString(RlsbillPo.COLUMNS.CONTRNO.name())); 
			rlsbillPo.setSealno(dataObject.getString(RlsbillPo.COLUMNS.SEALNO.name())); 
			rlsbillPo.setSealno2(dataObject.getString(RlsbillPo.COLUMNS.SEALNO2.name())); 
			rlsbillPo.setSealno3(dataObject.getString(RlsbillPo.COLUMNS.SEALNO3.name())); 
			rlsbillPo.setSealno4(dataObject.getString(RlsbillPo.COLUMNS.SEALNO4.name())); 
			rlsbillPo.setShsealno(dataObject.getString(RlsbillPo.COLUMNS.SHSEALNO.name())); 
			rlsbillPo.setShsealno2(dataObject.getString(RlsbillPo.COLUMNS.SHSEALNO2.name())); 
			rlsbillPo.setPkgqty(BigDecimalUtils.formObj(dataObject.getValue(RlsbillPo.COLUMNS.PKGQTY.name()))); 
			rlsbillPo.setRlsqty(BigDecimalUtils.formObj(dataObject.getValue(RlsbillPo.COLUMNS.RLSQTY.name()))); 
			rlsbillPo.setOwner(dataObject.getString(RlsbillPo.COLUMNS.OWNER.name())); 
			rlsbillPo.setCarcomp(dataObject.getString(RlsbillPo.COLUMNS.CARCOMP.name())); 
			rlsbillPo.setCarno(dataObject.getString(RlsbillPo.COLUMNS.CARNO.name())); 
			rlsbillPo.setDriver(dataObject.getString(RlsbillPo.COLUMNS.DRIVER.name())); 
			rlsbillPo.setIdno(dataObject.getString(RlsbillPo.COLUMNS.IDNO.name())); 
			rlsbillPo.setLabelmark(dataObject.getString(RlsbillPo.COLUMNS.LABELMARK.name())); 
			rlsbillPo.setRbstatus(dataObject.getString(RlsbillPo.COLUMNS.RBSTATUS.name())); 
			rlsbillPo.setSono(dataObject.getString(RlsbillPo.COLUMNS.SONO.name())); 
			rlsbillPo.setCcccode(dataObject.getString(RlsbillPo.COLUMNS.CCCCODE.name())); 
			rlsbillPo.setDeclno(dataObject.getString(RlsbillPo.COLUMNS.DECLNO.name())); 
			rlsbillPo.setExtracond(dataObject.getString(RlsbillPo.COLUMNS.EXTRACOND.name())); 
			return rlsbillPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final RlsbillPo rlsbillPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(RlsbillPo.COLUMNS.BONDNO.name(), rlsbillPo.getBondno()); 
			dataObject.setValue(RlsbillPo.COLUMNS.PASSNO.name(), rlsbillPo.getPassno()); 
			dataObject.setValue(RlsbillPo.COLUMNS.PASSDATE.name(), rlsbillPo.getPassdate()); 
			dataObject.setValue(RlsbillPo.COLUMNS.INTIME.name(), rlsbillPo.getIntime()); 
			dataObject.setValue(RlsbillPo.COLUMNS.OUTTIME.name(), rlsbillPo.getOuttime()); 
			dataObject.setValue(RlsbillPo.COLUMNS.VESSELNAME.name(), rlsbillPo.getVesselname()); 
			dataObject.setValue(RlsbillPo.COLUMNS.VOYAGENO.name(), rlsbillPo.getVoyageno()); 
			dataObject.setValue(RlsbillPo.COLUMNS.VESSELREG.name(), rlsbillPo.getVesselreg()); 
			dataObject.setValue(RlsbillPo.COLUMNS.LOCCODE.name(), rlsbillPo.getLoccode()); 
			dataObject.setValue(RlsbillPo.COLUMNS.GOPLACE.name(), rlsbillPo.getGoplace()); 
			dataObject.setValue(RlsbillPo.COLUMNS.GDSTYPE.name(), rlsbillPo.getGdstype()); 
			dataObject.setValue(RlsbillPo.COLUMNS.IETYPE.name(), rlsbillPo.getIetype()); 
			dataObject.setValue(RlsbillPo.COLUMNS.PACKTYPE.name(), rlsbillPo.getPacktype()); 
			dataObject.setValue(RlsbillPo.COLUMNS.CONTRNO.name(), rlsbillPo.getContrno()); 
			dataObject.setValue(RlsbillPo.COLUMNS.SEALNO.name(), rlsbillPo.getSealno()); 
			dataObject.setValue(RlsbillPo.COLUMNS.SEALNO2.name(), rlsbillPo.getSealno2()); 
			dataObject.setValue(RlsbillPo.COLUMNS.SEALNO3.name(), rlsbillPo.getSealno3()); 
			dataObject.setValue(RlsbillPo.COLUMNS.SEALNO4.name(), rlsbillPo.getSealno4()); 
			dataObject.setValue(RlsbillPo.COLUMNS.SHSEALNO.name(), rlsbillPo.getShsealno()); 
			dataObject.setValue(RlsbillPo.COLUMNS.SHSEALNO2.name(), rlsbillPo.getShsealno2()); 
			dataObject.setValue(RlsbillPo.COLUMNS.PKGQTY.name(), rlsbillPo.getPkgqty()); 
			dataObject.setValue(RlsbillPo.COLUMNS.RLSQTY.name(), rlsbillPo.getRlsqty()); 
			dataObject.setValue(RlsbillPo.COLUMNS.OWNER.name(), rlsbillPo.getOwner()); 
			dataObject.setValue(RlsbillPo.COLUMNS.CARCOMP.name(), rlsbillPo.getCarcomp()); 
			dataObject.setValue(RlsbillPo.COLUMNS.CARNO.name(), rlsbillPo.getCarno()); 
			dataObject.setValue(RlsbillPo.COLUMNS.DRIVER.name(), rlsbillPo.getDriver()); 
			dataObject.setValue(RlsbillPo.COLUMNS.IDNO.name(), rlsbillPo.getIdno()); 
			dataObject.setValue(RlsbillPo.COLUMNS.LABELMARK.name(), rlsbillPo.getLabelmark()); 
			dataObject.setValue(RlsbillPo.COLUMNS.RBSTATUS.name(), rlsbillPo.getRbstatus()); 
			dataObject.setValue(RlsbillPo.COLUMNS.SONO.name(), rlsbillPo.getSono()); 
			dataObject.setValue(RlsbillPo.COLUMNS.CCCCODE.name(), rlsbillPo.getCcccode()); 
			dataObject.setValue(RlsbillPo.COLUMNS.DECLNO.name(), rlsbillPo.getDeclno()); 
			dataObject.setValue(RlsbillPo.COLUMNS.EXTRACOND.name(), rlsbillPo.getExtracond()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<RlsbillPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(RlsbillPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(RlsbillPo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(RlsbillPo.COLUMNS.PASSNO.name(), po.getPassno()); 
		return sqlWhere; 
	} 
 
} 
