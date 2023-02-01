package com.doc.common.dao.impl; 
 
public class ImpRpt1DAOImpl extends GeneralDAOImpl<ImpRpt1Po> implements ImpRpt1DAO { 
	public static final ImpRpt1DAOImpl INSTANCE = new ImpRpt1DAOImpl(); 
	public static final String TABLENAME = "IMP_RPT1"; 

	public ImpRpt1DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ImpRpt1Po> CONVERTER = new MapConverter<ImpRpt1Po>() { 
 
		@Override 
		public ImpRpt1Po convert(final DataObject dataObject) { 
			final ImpRpt1Po impRpt1Po = new ImpRpt1Po(); 
			impRpt1Po.setDeclFlightno(dataObject.getString(ImpRpt1Po.COLUMNS.DECL_FLIGHTNO.name())); 
			impRpt1Po.setDeclFlightdate(TimestampUtils.of(dataObject.getValue(ImpRpt1Po.COLUMNS.DECL_FLIGHTDATE.name()))); 
			impRpt1Po.setDeclMwb(dataObject.getString(ImpRpt1Po.COLUMNS.DECL_MWB.name())); 
			impRpt1Po.setDeclExpbagno(dataObject.getString(ImpRpt1Po.COLUMNS.DECL_EXPBAGNO.name())); 
			impRpt1Po.setDeclPiece(BigDecimalUtils.formObj(dataObject.getValue(ImpRpt1Po.COLUMNS.DECL_PIECE.name()))); 
			impRpt1Po.setImpContainer(dataObject.getString(ImpRpt1Po.COLUMNS.IMP_CONTAINER.name())); 
			impRpt1Po.setImpFlightno(dataObject.getString(ImpRpt1Po.COLUMNS.IMP_FLIGHTNO.name())); 
			impRpt1Po.setImpExpbagno(dataObject.getString(ImpRpt1Po.COLUMNS.IMP_EXPBAGNO.name())); 
			impRpt1Po.setImpChkpiece(BigDecimalUtils.formObj(dataObject.getValue(ImpRpt1Po.COLUMNS.IMP_CHKPIECE.name()))); 
			impRpt1Po.setImpGcipiece(BigDecimalUtils.formObj(dataObject.getValue(ImpRpt1Po.COLUMNS.IMP_GCIPIECE.name()))); 
			impRpt1Po.setImpDiffpiece(BigDecimalUtils.formObj(dataObject.getValue(ImpRpt1Po.COLUMNS.IMP_DIFFPIECE.name()))); 
			impRpt1Po.setImpInputmode(dataObject.getString(ImpRpt1Po.COLUMNS.IMP_INPUTMODE.name())); 
			impRpt1Po.setImpChkdate(TimestampUtils.of(dataObject.getValue(ImpRpt1Po.COLUMNS.IMP_CHKDATE.name()))); 
			impRpt1Po.setImpGcidate(TimestampUtils.of(dataObject.getValue(ImpRpt1Po.COLUMNS.IMP_GCIDATE.name()))); 
			impRpt1Po.setImpGcodate(TimestampUtils.of(dataObject.getValue(ImpRpt1Po.COLUMNS.IMP_GCODATE.name()))); 
			impRpt1Po.setImpPiece(BigDecimalUtils.formObj(dataObject.getValue(ImpRpt1Po.COLUMNS.IMP_PIECE.name()))); 
			impRpt1Po.setRepno(dataObject.getString(ImpRpt1Po.COLUMNS.REPNO.name())); 
			return impRpt1Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final ImpRpt1Po impRpt1Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ImpRpt1Po.COLUMNS.DECL_FLIGHTNO.name(), impRpt1Po.getDeclFlightno()); 
			dataObject.setValue(ImpRpt1Po.COLUMNS.DECL_FLIGHTDATE.name(), impRpt1Po.getDeclFlightdate()); 
			dataObject.setValue(ImpRpt1Po.COLUMNS.DECL_MWB.name(), impRpt1Po.getDeclMwb()); 
			dataObject.setValue(ImpRpt1Po.COLUMNS.DECL_EXPBAGNO.name(), impRpt1Po.getDeclExpbagno()); 
			dataObject.setValue(ImpRpt1Po.COLUMNS.DECL_PIECE.name(), impRpt1Po.getDeclPiece()); 
			dataObject.setValue(ImpRpt1Po.COLUMNS.IMP_CONTAINER.name(), impRpt1Po.getImpContainer()); 
			dataObject.setValue(ImpRpt1Po.COLUMNS.IMP_FLIGHTNO.name(), impRpt1Po.getImpFlightno()); 
			dataObject.setValue(ImpRpt1Po.COLUMNS.IMP_EXPBAGNO.name(), impRpt1Po.getImpExpbagno()); 
			dataObject.setValue(ImpRpt1Po.COLUMNS.IMP_CHKPIECE.name(), impRpt1Po.getImpChkpiece()); 
			dataObject.setValue(ImpRpt1Po.COLUMNS.IMP_GCIPIECE.name(), impRpt1Po.getImpGcipiece()); 
			dataObject.setValue(ImpRpt1Po.COLUMNS.IMP_DIFFPIECE.name(), impRpt1Po.getImpDiffpiece()); 
			dataObject.setValue(ImpRpt1Po.COLUMNS.IMP_INPUTMODE.name(), impRpt1Po.getImpInputmode()); 
			dataObject.setValue(ImpRpt1Po.COLUMNS.IMP_CHKDATE.name(), impRpt1Po.getImpChkdate()); 
			dataObject.setValue(ImpRpt1Po.COLUMNS.IMP_GCIDATE.name(), impRpt1Po.getImpGcidate()); 
			dataObject.setValue(ImpRpt1Po.COLUMNS.IMP_GCODATE.name(), impRpt1Po.getImpGcodate()); 
			dataObject.setValue(ImpRpt1Po.COLUMNS.IMP_PIECE.name(), impRpt1Po.getImpPiece()); 
			dataObject.setValue(ImpRpt1Po.COLUMNS.REPNO.name(), impRpt1Po.getRepno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ImpRpt1Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ImpRpt1Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
