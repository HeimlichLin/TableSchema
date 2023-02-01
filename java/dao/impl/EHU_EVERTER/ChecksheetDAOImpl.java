package com.doc.common.dao.impl; 
 
public class ChecksheetDAOImpl extends GeneralDAOImpl<ChecksheetPo> implements ChecksheetDAO { 
	public static final ChecksheetDAOImpl INSTANCE = new ChecksheetDAOImpl(); 
	public static final String TABLENAME = "CHECKSHEET"; 

	public ChecksheetDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ChecksheetPo> CONVERTER = new MapConverter<ChecksheetPo>() { 
 
		@Override 
		public ChecksheetPo convert(final DataObject dataObject) { 
			final ChecksheetPo checksheetPo = new ChecksheetPo(); 
			checksheetPo.setDate1(dataObject.getString(ChecksheetPo.COLUMNS.DATE1.name())); 
			checksheetPo.setDate2(dataObject.getString(ChecksheetPo.COLUMNS.DATE2.name())); 
			checksheetPo.setDatatype(dataObject.getString(ChecksheetPo.COLUMNS.DATATYPE.name())); 
			checksheetPo.setIe(dataObject.getString(ChecksheetPo.COLUMNS.IE.name())); 
			checksheetPo.setCusid(dataObject.getString(ChecksheetPo.COLUMNS.CUSID.name())); 
			checksheetPo.setCusname(dataObject.getString(ChecksheetPo.COLUMNS.CUSNAME.name())); 
			checksheetPo.setDeftime(dataObject.getString(ChecksheetPo.COLUMNS.DEFTIME.name())); 
			checksheetPo.setDatadate(dataObject.getString(ChecksheetPo.COLUMNS.DATADATE.name())); 
			checksheetPo.setWt1(dataObject.getString(ChecksheetPo.COLUMNS.WT1.name())); 
			checksheetPo.setWt1Tot(dataObject.getString(ChecksheetPo.COLUMNS.WT1_TOT.name())); 
			checksheetPo.setWt2(dataObject.getString(ChecksheetPo.COLUMNS.WT2.name())); 
			checksheetPo.setWt2Tot(dataObject.getString(ChecksheetPo.COLUMNS.WT2_TOT.name())); 
			checksheetPo.setCreateDate(dataObject.getString(ChecksheetPo.COLUMNS.CREATE_DATE.name())); 
			checksheetPo.setCreateUser(dataObject.getString(ChecksheetPo.COLUMNS.CREATE_USER.name())); 
			checksheetPo.setSno(BigDecimalUtils.formObj(dataObject.getValue(ChecksheetPo.COLUMNS.SNO.name()))); 
			return checksheetPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ChecksheetPo checksheetPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ChecksheetPo.COLUMNS.DATE1.name(), checksheetPo.getDate1()); 
			dataObject.setValue(ChecksheetPo.COLUMNS.DATE2.name(), checksheetPo.getDate2()); 
			dataObject.setValue(ChecksheetPo.COLUMNS.DATATYPE.name(), checksheetPo.getDatatype()); 
			dataObject.setValue(ChecksheetPo.COLUMNS.IE.name(), checksheetPo.getIe()); 
			dataObject.setValue(ChecksheetPo.COLUMNS.CUSID.name(), checksheetPo.getCusid()); 
			dataObject.setValue(ChecksheetPo.COLUMNS.CUSNAME.name(), checksheetPo.getCusname()); 
			dataObject.setValue(ChecksheetPo.COLUMNS.DEFTIME.name(), checksheetPo.getDeftime()); 
			dataObject.setValue(ChecksheetPo.COLUMNS.DATADATE.name(), checksheetPo.getDatadate()); 
			dataObject.setValue(ChecksheetPo.COLUMNS.WT1.name(), checksheetPo.getWt1()); 
			dataObject.setValue(ChecksheetPo.COLUMNS.WT1_TOT.name(), checksheetPo.getWt1Tot()); 
			dataObject.setValue(ChecksheetPo.COLUMNS.WT2.name(), checksheetPo.getWt2()); 
			dataObject.setValue(ChecksheetPo.COLUMNS.WT2_TOT.name(), checksheetPo.getWt2Tot()); 
			dataObject.setValue(ChecksheetPo.COLUMNS.CREATE_DATE.name(), checksheetPo.getCreateDate()); 
			dataObject.setValue(ChecksheetPo.COLUMNS.CREATE_USER.name(), checksheetPo.getCreateUser()); 
			dataObject.setValue(ChecksheetPo.COLUMNS.SNO.name(), checksheetPo.getSno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ChecksheetPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ChecksheetPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(ChecksheetPo.COLUMNS.DATE1.name(), po.getDate1()); 
		sqlWhere.add(ChecksheetPo.COLUMNS.DATE2.name(), po.getDate2()); 
		sqlWhere.add(ChecksheetPo.COLUMNS.DATATYPE.name(), po.getDatatype()); 
		sqlWhere.add(ChecksheetPo.COLUMNS.IE.name(), po.getIe()); 
		sqlWhere.add(ChecksheetPo.COLUMNS.CUSID.name(), po.getCusid()); 
		sqlWhere.add(ChecksheetPo.COLUMNS.CUSNAME.name(), po.getCusname()); 
		sqlWhere.add(ChecksheetPo.COLUMNS.DEFTIME.name(), po.getDeftime()); 
		sqlWhere.add(ChecksheetPo.COLUMNS.SNO.name(), po.getSno()); 
		return sqlWhere; 
	} 
 
} 
