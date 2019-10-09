package com.doc.common.dao.impl; 
 
public class CmotorDetailDAO extends GeneralDAOImpl<CmotorDetailDo> implements CmotorDetailDAO { 
	public static final CmotorDetailDAOImpl INSTANCE = new CmotorDetailDAOImpl(); 
	public static final String TABLENAME = "CMOTOR_DETAIL"; 

	public CmotorDetailDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<CmotorDetailDo> CONVERTER = new MapConverter<CmotorDetailDo>() { 
 
		@Override 
		public CmotorDetailDo convert(final DataObject dataObject) { 
			final CmotorDetailDo cmotorDetailDo = new CmotorDetailDo(); 
			cmotorDetailDo.setDocno(dataObject.getString(CmotorDetailDo.COLUMNS.DOCNO.name())); 
			cmotorDetailDo.setItem(BigDecimalUtils.formObj(dataObject.getString(CmotorDetailDo.COLUMNS.ITEM.name()))); 
			cmotorDetailDo.setFactory(dataObject.getString(CmotorDetailDo.COLUMNS.FACTORY.name())); 
			cmotorDetailDo.setInpost(dataObject.getString(CmotorDetailDo.COLUMNS.INPOST.name())); 
			cmotorDetailDo.setStrtype(dataObject.getString(CmotorDetailDo.COLUMNS.STRTYPE.name())); 
			cmotorDetailDo.setMvttype(dataObject.getString(CmotorDetailDo.COLUMNS.MVTTYPE.name())); 
			cmotorDetailDo.setProducttype(dataObject.getString(CmotorDetailDo.COLUMNS.PRODUCTTYPE.name())); 
			cmotorDetailDo.setProductgroup(dataObject.getString(CmotorDetailDo.COLUMNS.PRODUCTGROUP.name())); 
			cmotorDetailDo.setPrdtno(dataObject.getString(CmotorDetailDo.COLUMNS.PRDTNO.name())); 
			cmotorDetailDo.setDescrip(dataObject.getString(CmotorDetailDo.COLUMNS.DESCRIP.name())); 
			cmotorDetailDo.setQty(BigDecimalUtils.formObj(dataObject.getString(CmotorDetailDo.COLUMNS.QTY.name()))); 
			cmotorDetailDo.setUnit(dataObject.getString(CmotorDetailDo.COLUMNS.UNIT.name())); 
			cmotorDetailDo.setReference(dataObject.getString(CmotorDetailDo.COLUMNS.REFERENCE.name())); 
			cmotorDetailDo.setVendor(dataObject.getString(CmotorDetailDo.COLUMNS.VENDOR.name())); 
			cmotorDetailDo.setOrderdoc(dataObject.getString(CmotorDetailDo.COLUMNS.ORDERDOC.name())); 
			cmotorDetailDo.setOridocno(dataObject.getString(CmotorDetailDo.COLUMNS.ORIDOCNO.name())); 
			cmotorDetailDo.setDochead(dataObject.getString(CmotorDetailDo.COLUMNS.DOCHEAD.name())); 
			cmotorDetailDo.setRefdate(dataObject.getString(CmotorDetailDo.COLUMNS.REFDATE.name())); 
			cmotorDetailDo.setControlno(dataObject.getString(CmotorDetailDo.COLUMNS.CONTROLNO.name())); 
			cmotorDetailDo.setInstatus(dataObject.getString(CmotorDetailDo.COLUMNS.INSTATUS.name())); 
			cmotorDetailDo.setUpdtime(dataObject.getString(CmotorDetailDo.COLUMNS.UPDTIME.name())); 
			cmotorDetailDo.setOqty(BigDecimalUtils.formObj(dataObject.getString(CmotorDetailDo.COLUMNS.OQTY.name()))); 
			return cmotorDetailDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final CmotorDetailDo cmotorDetailDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(CmotorDetailDo.COLUMNS.DOCNO.name(), cmotorDetailDo.getDocno()); 
			dataObject.setValue(CmotorDetailDo.COLUMNS.ITEM.name(), cmotorDetailDo.getItem()); 
			dataObject.setValue(CmotorDetailDo.COLUMNS.FACTORY.name(), cmotorDetailDo.getFactory()); 
			dataObject.setValue(CmotorDetailDo.COLUMNS.INPOST.name(), cmotorDetailDo.getInpost()); 
			dataObject.setValue(CmotorDetailDo.COLUMNS.STRTYPE.name(), cmotorDetailDo.getStrtype()); 
			dataObject.setValue(CmotorDetailDo.COLUMNS.MVTTYPE.name(), cmotorDetailDo.getMvttype()); 
			dataObject.setValue(CmotorDetailDo.COLUMNS.PRODUCTTYPE.name(), cmotorDetailDo.getProducttype()); 
			dataObject.setValue(CmotorDetailDo.COLUMNS.PRODUCTGROUP.name(), cmotorDetailDo.getProductgroup()); 
			dataObject.setValue(CmotorDetailDo.COLUMNS.PRDTNO.name(), cmotorDetailDo.getPrdtno()); 
			dataObject.setValue(CmotorDetailDo.COLUMNS.DESCRIP.name(), cmotorDetailDo.getDescrip()); 
			dataObject.setValue(CmotorDetailDo.COLUMNS.QTY.name(), cmotorDetailDo.getQty()); 
			dataObject.setValue(CmotorDetailDo.COLUMNS.UNIT.name(), cmotorDetailDo.getUnit()); 
			dataObject.setValue(CmotorDetailDo.COLUMNS.REFERENCE.name(), cmotorDetailDo.getReference()); 
			dataObject.setValue(CmotorDetailDo.COLUMNS.VENDOR.name(), cmotorDetailDo.getVendor()); 
			dataObject.setValue(CmotorDetailDo.COLUMNS.ORDERDOC.name(), cmotorDetailDo.getOrderdoc()); 
			dataObject.setValue(CmotorDetailDo.COLUMNS.ORIDOCNO.name(), cmotorDetailDo.getOridocno()); 
			dataObject.setValue(CmotorDetailDo.COLUMNS.DOCHEAD.name(), cmotorDetailDo.getDochead()); 
			dataObject.setValue(CmotorDetailDo.COLUMNS.REFDATE.name(), cmotorDetailDo.getRefdate()); 
			dataObject.setValue(CmotorDetailDo.COLUMNS.CONTROLNO.name(), cmotorDetailDo.getControlno()); 
			dataObject.setValue(CmotorDetailDo.COLUMNS.INSTATUS.name(), cmotorDetailDo.getInstatus()); 
			dataObject.setValue(CmotorDetailDo.COLUMNS.UPDTIME.name(), cmotorDetailDo.getUpdtime()); 
			dataObject.setValue(CmotorDetailDo.COLUMNS.OQTY.name(), cmotorDetailDo.getOqty()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<CmotorDetailDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(CmotorDetailDo po) { 
		sqlWhere.add(CmotorDetailDo.COLUMNS.DOCNO.name(), po.getDocno()); 
		sqlWhere.add(CmotorDetailDo.COLUMNS.ITEM.name(), po.getItem()); 
		sqlWhere.add(CmotorDetailDo.COLUMNS.FACTORY.name(), po.getFactory()); 
		sqlWhere.add(CmotorDetailDo.COLUMNS.INPOST.name(), po.getInpost()); 
		sqlWhere.add(CmotorDetailDo.COLUMNS.STRTYPE.name(), po.getStrtype()); 
		sqlWhere.add(CmotorDetailDo.COLUMNS.MVTTYPE.name(), po.getMvttype()); 
		sqlWhere.add(CmotorDetailDo.COLUMNS.PRODUCTTYPE.name(), po.getProducttype()); 
		sqlWhere.add(CmotorDetailDo.COLUMNS.PRODUCTGROUP.name(), po.getProductgroup()); 
		sqlWhere.add(CmotorDetailDo.COLUMNS.PRDTNO.name(), po.getPrdtno()); 
		sqlWhere.add(CmotorDetailDo.COLUMNS.DESCRIP.name(), po.getDescrip()); 
		sqlWhere.add(CmotorDetailDo.COLUMNS.QTY.name(), po.getQty()); 
		sqlWhere.add(CmotorDetailDo.COLUMNS.UNIT.name(), po.getUnit()); 
		sqlWhere.add(CmotorDetailDo.COLUMNS.REFERENCE.name(), po.getReference()); 
		sqlWhere.add(CmotorDetailDo.COLUMNS.VENDOR.name(), po.getVendor()); 
		sqlWhere.add(CmotorDetailDo.COLUMNS.ORDERDOC.name(), po.getOrderdoc()); 
		sqlWhere.add(CmotorDetailDo.COLUMNS.ORIDOCNO.name(), po.getOridocno()); 
		sqlWhere.add(CmotorDetailDo.COLUMNS.DOCHEAD.name(), po.getDochead()); 
		sqlWhere.add(CmotorDetailDo.COLUMNS.REFDATE.name(), po.getRefdate()); 
		sqlWhere.add(CmotorDetailDo.COLUMNS.CONTROLNO.name(), po.getControlno()); 
		sqlWhere.add(CmotorDetailDo.COLUMNS.INSTATUS.name(), po.getInstatus()); 
		sqlWhere.add(CmotorDetailDo.COLUMNS.UPDTIME.name(), po.getUpdtime()); 
		sqlWhere.add(CmotorDetailDo.COLUMNS.OQTY.name(), po.getOqty()); 
	} 
 
} 