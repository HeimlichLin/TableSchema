package com.doc.common.dao.impl; 
 
public class TmpHStrbill220070801DAO extends GeneralDAOImpl<TmpHStrbill220070801Do> implements TmpHStrbill220070801DAO { 
	public static final TmpHStrbill220070801DAOImpl INSTANCE = new TmpHStrbill220070801DAOImpl(); 
	public static final String TABLENAME = "TMP_H_STRBILL_2_20070801"; 

	public TmpHStrbill220070801DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<TmpHStrbill220070801Do> CONVERTER = new MapConverter<TmpHStrbill220070801Do>() { 
 
		@Override 
		public TmpHStrbill220070801Do convert(final DataObject dataObject) { 
			final TmpHStrbill220070801Do tmpHStrbill220070801Do = new TmpHStrbill220070801Do(); 
			tmpHStrbill220070801Do.setMsgfun(dataObject.getString(TmpHStrbill220070801Do.COLUMNS.MSGFUN.name())); 
			tmpHStrbill220070801Do.setBondno(dataObject.getString(TmpHStrbill220070801Do.COLUMNS.BONDNO.name())); 
			tmpHStrbill220070801Do.setStrtype(dataObject.getString(TmpHStrbill220070801Do.COLUMNS.STRTYPE.name())); 
			tmpHStrbill220070801Do.setGdstype(dataObject.getString(TmpHStrbill220070801Do.COLUMNS.GDSTYPE.name())); 
			tmpHStrbill220070801Do.setRefbillno(dataObject.getString(TmpHStrbill220070801Do.COLUMNS.REFBILLNO.name())); 
			tmpHStrbill220070801Do.setCtmcode(dataObject.getString(TmpHStrbill220070801Do.COLUMNS.CTMCODE.name())); 
			tmpHStrbill220070801Do.setSubcon(dataObject.getString(TmpHStrbill220070801Do.COLUMNS.SUBCON.name())); 
			tmpHStrbill220070801Do.setUpdtime(dataObject.getString(TmpHStrbill220070801Do.COLUMNS.UPDTIME.name())); 
			return tmpHStrbill220070801Do; 
		} 
 
		@Override 
		public DataObject toDataObject(final TmpHStrbill220070801Do tmpHStrbill220070801Do) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TmpHStrbill220070801Do.COLUMNS.MSGFUN.name(), tmpHStrbill220070801Do.getMsgfun()); 
			dataObject.setValue(TmpHStrbill220070801Do.COLUMNS.BONDNO.name(), tmpHStrbill220070801Do.getBondno()); 
			dataObject.setValue(TmpHStrbill220070801Do.COLUMNS.STRTYPE.name(), tmpHStrbill220070801Do.getStrtype()); 
			dataObject.setValue(TmpHStrbill220070801Do.COLUMNS.GDSTYPE.name(), tmpHStrbill220070801Do.getGdstype()); 
			dataObject.setValue(TmpHStrbill220070801Do.COLUMNS.REFBILLNO.name(), tmpHStrbill220070801Do.getRefbillno()); 
			dataObject.setValue(TmpHStrbill220070801Do.COLUMNS.CTMCODE.name(), tmpHStrbill220070801Do.getCtmcode()); 
			dataObject.setValue(TmpHStrbill220070801Do.COLUMNS.SUBCON.name(), tmpHStrbill220070801Do.getSubcon()); 
			dataObject.setValue(TmpHStrbill220070801Do.COLUMNS.UPDTIME.name(), tmpHStrbill220070801Do.getUpdtime()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TmpHStrbill220070801Do> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TmpHStrbill220070801Do po) { 
		sqlWhere.add(TmpHStrbill220070801Do.COLUMNS.MSGFUN.name(), po.getMsgfun()); 
		sqlWhere.add(TmpHStrbill220070801Do.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(TmpHStrbill220070801Do.COLUMNS.STRTYPE.name(), po.getStrtype()); 
		sqlWhere.add(TmpHStrbill220070801Do.COLUMNS.GDSTYPE.name(), po.getGdstype()); 
		sqlWhere.add(TmpHStrbill220070801Do.COLUMNS.REFBILLNO.name(), po.getRefbillno()); 
		sqlWhere.add(TmpHStrbill220070801Do.COLUMNS.CTMCODE.name(), po.getCtmcode()); 
		sqlWhere.add(TmpHStrbill220070801Do.COLUMNS.SUBCON.name(), po.getSubcon()); 
		sqlWhere.add(TmpHStrbill220070801Do.COLUMNS.UPDTIME.name(), po.getUpdtime()); 
	} 
 
} 
