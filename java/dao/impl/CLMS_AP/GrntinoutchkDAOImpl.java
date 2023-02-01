package com.doc.common.dao.impl; 
 
public class GrntinoutchkDAOImpl extends GeneralDAOImpl<GrntinoutchkPo> implements GrntinoutchkDAO { 
	public static final GrntinoutchkDAOImpl INSTANCE = new GrntinoutchkDAOImpl(); 
	public static final String TABLENAME = "GRNTINOUTCHK"; 

	public GrntinoutchkDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<GrntinoutchkPo> CONVERTER = new MapConverter<GrntinoutchkPo>() { 
 
		@Override 
		public GrntinoutchkPo convert(final DataObject dataObject) { 
			final GrntinoutchkPo grntinoutchkPo = new GrntinoutchkPo(); 
			grntinoutchkPo.setBondno(dataObject.getString(GrntinoutchkPo.COLUMNS.BONDNO.name())); 
			grntinoutchkPo.setOdeclno(dataObject.getString(GrntinoutchkPo.COLUMNS.ODECLNO.name())); 
			grntinoutchkPo.setOitemno(BigDecimalUtils.formObj(dataObject.getValue(GrntinoutchkPo.COLUMNS.OITEMNO.name()))); 
			grntinoutchkPo.setStrpost(dataObject.getString(GrntinoutchkPo.COLUMNS.STRPOST.name())); 
			grntinoutchkPo.setInTaxamt(BigDecimalUtils.formObj(dataObject.getValue(GrntinoutchkPo.COLUMNS.IN_TAXAMT.name()))); 
			grntinoutchkPo.setOutTaxamt(BigDecimalUtils.formObj(dataObject.getValue(GrntinoutchkPo.COLUMNS.OUT_TAXAMT.name()))); 
			return grntinoutchkPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final GrntinoutchkPo grntinoutchkPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(GrntinoutchkPo.COLUMNS.BONDNO.name(), grntinoutchkPo.getBondno()); 
			dataObject.setValue(GrntinoutchkPo.COLUMNS.ODECLNO.name(), grntinoutchkPo.getOdeclno()); 
			dataObject.setValue(GrntinoutchkPo.COLUMNS.OITEMNO.name(), grntinoutchkPo.getOitemno()); 
			dataObject.setValue(GrntinoutchkPo.COLUMNS.STRPOST.name(), grntinoutchkPo.getStrpost()); 
			dataObject.setValue(GrntinoutchkPo.COLUMNS.IN_TAXAMT.name(), grntinoutchkPo.getInTaxamt()); 
			dataObject.setValue(GrntinoutchkPo.COLUMNS.OUT_TAXAMT.name(), grntinoutchkPo.getOutTaxamt()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<GrntinoutchkPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(GrntinoutchkPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
