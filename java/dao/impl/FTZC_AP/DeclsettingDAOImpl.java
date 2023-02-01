package com.doc.common.dao.impl; 
 
public class DeclsettingDAOImpl extends GeneralDAOImpl<DeclsettingPo> implements DeclsettingDAO { 
	public static final DeclsettingDAOImpl INSTANCE = new DeclsettingDAOImpl(); 
	public static final String TABLENAME = "DECLSETTING"; 

	public DeclsettingDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DeclsettingPo> CONVERTER = new MapConverter<DeclsettingPo>() { 
 
		@Override 
		public DeclsettingPo convert(final DataObject dataObject) { 
			final DeclsettingPo declsettingPo = new DeclsettingPo(); 
			declsettingPo.setKey(dataObject.getString(DeclsettingPo.COLUMNS.KEY.name())); 
			declsettingPo.setDeclType(dataObject.getString(DeclsettingPo.COLUMNS.DECL_TYPE.name())); 
			declsettingPo.setDeclKind(dataObject.getString(DeclsettingPo.COLUMNS.DECL_KIND.name())); 
			declsettingPo.setDeclIm(dataObject.getString(DeclsettingPo.COLUMNS.DECL_IM.name())); 
			declsettingPo.setRef1(dataObject.getString(DeclsettingPo.COLUMNS.REF1.name())); 
			declsettingPo.setRef2(dataObject.getString(DeclsettingPo.COLUMNS.REF2.name())); 
			declsettingPo.setRef3(dataObject.getString(DeclsettingPo.COLUMNS.REF3.name())); 
			declsettingPo.setOpCode(dataObject.getString(DeclsettingPo.COLUMNS.OP_CODE.name())); 
			declsettingPo.setOpComment(dataObject.getString(DeclsettingPo.COLUMNS.OP_COMMENT.name())); 
			declsettingPo.setValue1(dataObject.getString(DeclsettingPo.COLUMNS.VALUE1.name())); 
			declsettingPo.setValue2(dataObject.getString(DeclsettingPo.COLUMNS.VALUE2.name())); 
			declsettingPo.setValue3(dataObject.getString(DeclsettingPo.COLUMNS.VALUE3.name())); 
			declsettingPo.setInoutType(dataObject.getString(DeclsettingPo.COLUMNS.INOUT_TYPE.name())); 
			declsettingPo.setBomMark(dataObject.getString(DeclsettingPo.COLUMNS.BOM_MARK.name())); 
			declsettingPo.setBalMark(dataObject.getString(DeclsettingPo.COLUMNS.BAL_MARK.name())); 
			declsettingPo.setBalTMark(dataObject.getString(DeclsettingPo.COLUMNS.BAL_T_MARK.name())); 
			return declsettingPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DeclsettingPo declsettingPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DeclsettingPo.COLUMNS.KEY.name(), declsettingPo.getKey()); 
			dataObject.setValue(DeclsettingPo.COLUMNS.DECL_TYPE.name(), declsettingPo.getDeclType()); 
			dataObject.setValue(DeclsettingPo.COLUMNS.DECL_KIND.name(), declsettingPo.getDeclKind()); 
			dataObject.setValue(DeclsettingPo.COLUMNS.DECL_IM.name(), declsettingPo.getDeclIm()); 
			dataObject.setValue(DeclsettingPo.COLUMNS.REF1.name(), declsettingPo.getRef1()); 
			dataObject.setValue(DeclsettingPo.COLUMNS.REF2.name(), declsettingPo.getRef2()); 
			dataObject.setValue(DeclsettingPo.COLUMNS.REF3.name(), declsettingPo.getRef3()); 
			dataObject.setValue(DeclsettingPo.COLUMNS.OP_CODE.name(), declsettingPo.getOpCode()); 
			dataObject.setValue(DeclsettingPo.COLUMNS.OP_COMMENT.name(), declsettingPo.getOpComment()); 
			dataObject.setValue(DeclsettingPo.COLUMNS.VALUE1.name(), declsettingPo.getValue1()); 
			dataObject.setValue(DeclsettingPo.COLUMNS.VALUE2.name(), declsettingPo.getValue2()); 
			dataObject.setValue(DeclsettingPo.COLUMNS.VALUE3.name(), declsettingPo.getValue3()); 
			dataObject.setValue(DeclsettingPo.COLUMNS.INOUT_TYPE.name(), declsettingPo.getInoutType()); 
			dataObject.setValue(DeclsettingPo.COLUMNS.BOM_MARK.name(), declsettingPo.getBomMark()); 
			dataObject.setValue(DeclsettingPo.COLUMNS.BAL_MARK.name(), declsettingPo.getBalMark()); 
			dataObject.setValue(DeclsettingPo.COLUMNS.BAL_T_MARK.name(), declsettingPo.getBalTMark()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DeclsettingPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DeclsettingPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
