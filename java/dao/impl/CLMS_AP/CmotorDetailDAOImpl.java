package com.doc.common.dao.impl; 
 
public class CmotorDetailDAOImpl extends GeneralDAOImpl<CmotorDetailPo> implements CmotorDetailDAO { 
	public static final CmotorDetailDAOImpl INSTANCE = new CmotorDetailDAOImpl(); 
	public static final String TABLENAME = "CMOTOR_DETAIL"; 

	public CmotorDetailDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<CmotorDetailPo> CONVERTER = new MapConverter<CmotorDetailPo>() { 
 
		@Override 
		public CmotorDetailPo convert(final DataObject dataObject) { 
			final CmotorDetailPo cmotorDetailPo = new CmotorDetailPo(); 
			cmotorDetailPo.setDocno(dataObject.getString(CmotorDetailPo.COLUMNS.DOCNO.name())); 
			cmotorDetailPo.setItem(BigDecimalUtils.formObj(dataObject.getValue(CmotorDetailPo.COLUMNS.ITEM.name()))); 
			cmotorDetailPo.setFactory(dataObject.getString(CmotorDetailPo.COLUMNS.FACTORY.name())); 
			cmotorDetailPo.setInpost(dataObject.getString(CmotorDetailPo.COLUMNS.INPOST.name())); 
			cmotorDetailPo.setStrtype(dataObject.getString(CmotorDetailPo.COLUMNS.STRTYPE.name())); 
			cmotorDetailPo.setMvttype(dataObject.getString(CmotorDetailPo.COLUMNS.MVTTYPE.name())); 
			cmotorDetailPo.setProducttype(dataObject.getString(CmotorDetailPo.COLUMNS.PRODUCTTYPE.name())); 
			cmotorDetailPo.setProductgroup(dataObject.getString(CmotorDetailPo.COLUMNS.PRODUCTGROUP.name())); 
			cmotorDetailPo.setPrdtno(dataObject.getString(CmotorDetailPo.COLUMNS.PRDTNO.name())); 
			cmotorDetailPo.setDescrip(dataObject.getString(CmotorDetailPo.COLUMNS.DESCRIP.name())); 
			cmotorDetailPo.setQty(BigDecimalUtils.formObj(dataObject.getValue(CmotorDetailPo.COLUMNS.QTY.name()))); 
			cmotorDetailPo.setUnit(dataObject.getString(CmotorDetailPo.COLUMNS.UNIT.name())); 
			cmotorDetailPo.setReference(dataObject.getString(CmotorDetailPo.COLUMNS.REFERENCE.name())); 
			cmotorDetailPo.setVendor(dataObject.getString(CmotorDetailPo.COLUMNS.VENDOR.name())); 
			cmotorDetailPo.setOrderdoc(dataObject.getString(CmotorDetailPo.COLUMNS.ORDERDOC.name())); 
			cmotorDetailPo.setOridocno(dataObject.getString(CmotorDetailPo.COLUMNS.ORIDOCNO.name())); 
			cmotorDetailPo.setDochead(dataObject.getString(CmotorDetailPo.COLUMNS.DOCHEAD.name())); 
			cmotorDetailPo.setRefdate(dataObject.getString(CmotorDetailPo.COLUMNS.REFDATE.name())); 
			cmotorDetailPo.setControlno(dataObject.getString(CmotorDetailPo.COLUMNS.CONTROLNO.name())); 
			cmotorDetailPo.setInstatus(dataObject.getString(CmotorDetailPo.COLUMNS.INSTATUS.name())); 
			cmotorDetailPo.setUpdtime(dataObject.getString(CmotorDetailPo.COLUMNS.UPDTIME.name())); 
			cmotorDetailPo.setOqty(BigDecimalUtils.formObj(dataObject.getValue(CmotorDetailPo.COLUMNS.OQTY.name()))); 
			return cmotorDetailPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final CmotorDetailPo cmotorDetailPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(CmotorDetailPo.COLUMNS.DOCNO.name(), cmotorDetailPo.getDocno()); 
			dataObject.setValue(CmotorDetailPo.COLUMNS.ITEM.name(), cmotorDetailPo.getItem()); 
			dataObject.setValue(CmotorDetailPo.COLUMNS.FACTORY.name(), cmotorDetailPo.getFactory()); 
			dataObject.setValue(CmotorDetailPo.COLUMNS.INPOST.name(), cmotorDetailPo.getInpost()); 
			dataObject.setValue(CmotorDetailPo.COLUMNS.STRTYPE.name(), cmotorDetailPo.getStrtype()); 
			dataObject.setValue(CmotorDetailPo.COLUMNS.MVTTYPE.name(), cmotorDetailPo.getMvttype()); 
			dataObject.setValue(CmotorDetailPo.COLUMNS.PRODUCTTYPE.name(), cmotorDetailPo.getProducttype()); 
			dataObject.setValue(CmotorDetailPo.COLUMNS.PRODUCTGROUP.name(), cmotorDetailPo.getProductgroup()); 
			dataObject.setValue(CmotorDetailPo.COLUMNS.PRDTNO.name(), cmotorDetailPo.getPrdtno()); 
			dataObject.setValue(CmotorDetailPo.COLUMNS.DESCRIP.name(), cmotorDetailPo.getDescrip()); 
			dataObject.setValue(CmotorDetailPo.COLUMNS.QTY.name(), cmotorDetailPo.getQty()); 
			dataObject.setValue(CmotorDetailPo.COLUMNS.UNIT.name(), cmotorDetailPo.getUnit()); 
			dataObject.setValue(CmotorDetailPo.COLUMNS.REFERENCE.name(), cmotorDetailPo.getReference()); 
			dataObject.setValue(CmotorDetailPo.COLUMNS.VENDOR.name(), cmotorDetailPo.getVendor()); 
			dataObject.setValue(CmotorDetailPo.COLUMNS.ORDERDOC.name(), cmotorDetailPo.getOrderdoc()); 
			dataObject.setValue(CmotorDetailPo.COLUMNS.ORIDOCNO.name(), cmotorDetailPo.getOridocno()); 
			dataObject.setValue(CmotorDetailPo.COLUMNS.DOCHEAD.name(), cmotorDetailPo.getDochead()); 
			dataObject.setValue(CmotorDetailPo.COLUMNS.REFDATE.name(), cmotorDetailPo.getRefdate()); 
			dataObject.setValue(CmotorDetailPo.COLUMNS.CONTROLNO.name(), cmotorDetailPo.getControlno()); 
			dataObject.setValue(CmotorDetailPo.COLUMNS.INSTATUS.name(), cmotorDetailPo.getInstatus()); 
			dataObject.setValue(CmotorDetailPo.COLUMNS.UPDTIME.name(), cmotorDetailPo.getUpdtime()); 
			dataObject.setValue(CmotorDetailPo.COLUMNS.OQTY.name(), cmotorDetailPo.getOqty()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<CmotorDetailPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(CmotorDetailPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
