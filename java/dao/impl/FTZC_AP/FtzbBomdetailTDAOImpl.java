package com.doc.common.dao.impl; 
 
public class FtzbBomdetailTDAOImpl extends GeneralDAOImpl<FtzbBomdetailTPo> implements FtzbBomdetailTDAO { 
	public static final FtzbBomdetailTDAOImpl INSTANCE = new FtzbBomdetailTDAOImpl(); 
	public static final String TABLENAME = "FTZB_BOMDETAIL_T"; 

	public FtzbBomdetailTDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<FtzbBomdetailTPo> CONVERTER = new MapConverter<FtzbBomdetailTPo>() { 
 
		@Override 
		public FtzbBomdetailTPo convert(final DataObject dataObject) { 
			final FtzbBomdetailTPo ftzbBomdetailTPo = new FtzbBomdetailTPo(); 
			ftzbBomdetailTPo.setBondno(dataObject.getString(FtzbBomdetailTPo.COLUMNS.BONDNO.name())); 
			ftzbBomdetailTPo.setCtmcode(dataObject.getString(FtzbBomdetailTPo.COLUMNS.CTMCODE.name())); 
			ftzbBomdetailTPo.setPrdtno(dataObject.getString(FtzbBomdetailTPo.COLUMNS.PRDTNO.name())); 
			ftzbBomdetailTPo.setPartno(dataObject.getString(FtzbBomdetailTPo.COLUMNS.PARTNO.name())); 
			ftzbBomdetailTPo.setPartname(dataObject.getString(FtzbBomdetailTPo.COLUMNS.PARTNAME.name())); 
			ftzbBomdetailTPo.setUnitqty(BigDecimalUtils.formObj(dataObject.getValue(FtzbBomdetailTPo.COLUMNS.UNITQTY.name()))); 
			ftzbBomdetailTPo.setUnit(dataObject.getString(FtzbBomdetailTPo.COLUMNS.UNIT.name())); 
			ftzbBomdetailTPo.setBegindate(dataObject.getString(FtzbBomdetailTPo.COLUMNS.BEGINDATE.name())); 
			ftzbBomdetailTPo.setEnddate(dataObject.getString(FtzbBomdetailTPo.COLUMNS.ENDDATE.name())); 
			ftzbBomdetailTPo.setPrdttype(dataObject.getString(FtzbBomdetailTPo.COLUMNS.PRDTTYPE.name())); 
			ftzbBomdetailTPo.setRecvdate(dataObject.getString(FtzbBomdetailTPo.COLUMNS.RECVDATE.name())); 
			ftzbBomdetailTPo.setBomfile(dataObject.getString(FtzbBomdetailTPo.COLUMNS.BOMFILE.name())); 
			ftzbBomdetailTPo.setBomno(dataObject.getString(FtzbBomdetailTPo.COLUMNS.BOMNO.name())); 
			ftzbBomdetailTPo.setSeqno(BigDecimalUtils.formObj(dataObject.getValue(FtzbBomdetailTPo.COLUMNS.SEQNO.name()))); 
			return ftzbBomdetailTPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final FtzbBomdetailTPo ftzbBomdetailTPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(FtzbBomdetailTPo.COLUMNS.BONDNO.name(), ftzbBomdetailTPo.getBondno()); 
			dataObject.setValue(FtzbBomdetailTPo.COLUMNS.CTMCODE.name(), ftzbBomdetailTPo.getCtmcode()); 
			dataObject.setValue(FtzbBomdetailTPo.COLUMNS.PRDTNO.name(), ftzbBomdetailTPo.getPrdtno()); 
			dataObject.setValue(FtzbBomdetailTPo.COLUMNS.PARTNO.name(), ftzbBomdetailTPo.getPartno()); 
			dataObject.setValue(FtzbBomdetailTPo.COLUMNS.PARTNAME.name(), ftzbBomdetailTPo.getPartname()); 
			dataObject.setValue(FtzbBomdetailTPo.COLUMNS.UNITQTY.name(), ftzbBomdetailTPo.getUnitqty()); 
			dataObject.setValue(FtzbBomdetailTPo.COLUMNS.UNIT.name(), ftzbBomdetailTPo.getUnit()); 
			dataObject.setValue(FtzbBomdetailTPo.COLUMNS.BEGINDATE.name(), ftzbBomdetailTPo.getBegindate()); 
			dataObject.setValue(FtzbBomdetailTPo.COLUMNS.ENDDATE.name(), ftzbBomdetailTPo.getEnddate()); 
			dataObject.setValue(FtzbBomdetailTPo.COLUMNS.PRDTTYPE.name(), ftzbBomdetailTPo.getPrdttype()); 
			dataObject.setValue(FtzbBomdetailTPo.COLUMNS.RECVDATE.name(), ftzbBomdetailTPo.getRecvdate()); 
			dataObject.setValue(FtzbBomdetailTPo.COLUMNS.BOMFILE.name(), ftzbBomdetailTPo.getBomfile()); 
			dataObject.setValue(FtzbBomdetailTPo.COLUMNS.BOMNO.name(), ftzbBomdetailTPo.getBomno()); 
			dataObject.setValue(FtzbBomdetailTPo.COLUMNS.SEQNO.name(), ftzbBomdetailTPo.getSeqno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<FtzbBomdetailTPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(FtzbBomdetailTPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(FtzbBomdetailTPo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(FtzbBomdetailTPo.COLUMNS.PRDTNO.name(), po.getPrdtno()); 
		sqlWhere.add(FtzbBomdetailTPo.COLUMNS.PARTNO.name(), po.getPartno()); 
		sqlWhere.add(FtzbBomdetailTPo.COLUMNS.BEGINDATE.name(), po.getBegindate()); 
		return sqlWhere; 
	} 
 
} 
