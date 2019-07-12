package com.doc.common.dao.impl; 
 
public class GrntinoutchkDAO extends GeneralDAOImpl<GrntinoutchkDo> implements GrntinoutchkDAO { 
	public static final GrntinoutchkDAOImpl INSTANCE = new GrntinoutchkDAOImpl(); 
	public static final String TABLENAME = "GRNTINOUTCHK"; 

	public GrntinoutchkDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<GrntinoutchkDo> CONVERTER = new MapConverter<GrntinoutchkDo>() { 
 
		@Override 
		public GrntinoutchkDo convert(final DataObject dataObject) { 
			final GrntinoutchkDo grntinoutchkDo = new GrntinoutchkDo(); 
			grntinoutchkDo.setBondno(dataObject.getString(GrntinoutchkDo.COLUMNS.BONDNO.name())); 
			grntinoutchkDo.setOdeclno(dataObject.getString(GrntinoutchkDo.COLUMNS.ODECLNO.name())); 
			grntinoutchkDo.setOitemno(BigDecimalUtils.formObj(dataObject.getString(GrntinoutchkDo.COLUMNS.OITEMNO.name()))); 
			grntinoutchkDo.setStrpost(dataObject.getString(GrntinoutchkDo.COLUMNS.STRPOST.name())); 
			grntinoutchkDo.setInTaxamt(BigDecimalUtils.formObj(dataObject.getString(GrntinoutchkDo.COLUMNS.IN_TAXAMT.name()))); 
			grntinoutchkDo.setOutTaxamt(BigDecimalUtils.formObj(dataObject.getString(GrntinoutchkDo.COLUMNS.OUT_TAXAMT.name()))); 
			return grntinoutchkDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final GrntinoutchkDo grntinoutchkDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(GrntinoutchkDo.COLUMNS.BONDNO.name(), grntinoutchkDo.getBondno()); 
			dataObject.setValue(GrntinoutchkDo.COLUMNS.ODECLNO.name(), grntinoutchkDo.getOdeclno()); 
			dataObject.setValue(GrntinoutchkDo.COLUMNS.OITEMNO.name(), grntinoutchkDo.getOitemno()); 
			dataObject.setValue(GrntinoutchkDo.COLUMNS.STRPOST.name(), grntinoutchkDo.getStrpost()); 
			dataObject.setValue(GrntinoutchkDo.COLUMNS.IN_TAXAMT.name(), grntinoutchkDo.getInTaxamt()); 
			dataObject.setValue(GrntinoutchkDo.COLUMNS.OUT_TAXAMT.name(), grntinoutchkDo.getOutTaxamt()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<GrntinoutchkDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(GrntinoutchkDo po) { 
		sqlWhere.add(GrntinoutchkDo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(GrntinoutchkDo.COLUMNS.ODECLNO.name(), po.getOdeclno()); 
		sqlWhere.add(GrntinoutchkDo.COLUMNS.OITEMNO.name(), po.getOitemno()); 
		sqlWhere.add(GrntinoutchkDo.COLUMNS.STRPOST.name(), po.getStrpost()); 
		sqlWhere.add(GrntinoutchkDo.COLUMNS.IN_TAXAMT.name(), po.getInTaxamt()); 
		sqlWhere.add(GrntinoutchkDo.COLUMNS.OUT_TAXAMT.name(), po.getOutTaxamt()); 
	} 
 
} 
