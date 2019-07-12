package com.doc.common.dao.impl; 
 
public class TmpHStrbill120070801DAO extends GeneralDAOImpl<TmpHStrbill120070801Do> implements TmpHStrbill120070801DAO { 
	public static final TmpHStrbill120070801DAOImpl INSTANCE = new TmpHStrbill120070801DAOImpl(); 
	public static final String TABLENAME = "TMP_H_STRBILL_1_20070801"; 

	public TmpHStrbill120070801DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<TmpHStrbill120070801Do> CONVERTER = new MapConverter<TmpHStrbill120070801Do>() { 
 
		@Override 
		public TmpHStrbill120070801Do convert(final DataObject dataObject) { 
			final TmpHStrbill120070801Do tmpHStrbill120070801Do = new TmpHStrbill120070801Do(); 
			tmpHStrbill120070801Do.setMsgfun(dataObject.getString(TmpHStrbill120070801Do.COLUMNS.MSGFUN.name())); 
			tmpHStrbill120070801Do.setBondno(dataObject.getString(TmpHStrbill120070801Do.COLUMNS.BONDNO.name())); 
			tmpHStrbill120070801Do.setStrtype(dataObject.getString(TmpHStrbill120070801Do.COLUMNS.STRTYPE.name())); 
			tmpHStrbill120070801Do.setGdstype(dataObject.getString(TmpHStrbill120070801Do.COLUMNS.GDSTYPE.name())); 
			tmpHStrbill120070801Do.setRefbillno(dataObject.getString(TmpHStrbill120070801Do.COLUMNS.REFBILLNO.name())); 
			tmpHStrbill120070801Do.setCtmcode(dataObject.getString(TmpHStrbill120070801Do.COLUMNS.CTMCODE.name())); 
			tmpHStrbill120070801Do.setSubcon(dataObject.getString(TmpHStrbill120070801Do.COLUMNS.SUBCON.name())); 
			tmpHStrbill120070801Do.setUpdtime(dataObject.getString(TmpHStrbill120070801Do.COLUMNS.UPDTIME.name())); 
			return tmpHStrbill120070801Do; 
		} 
 
		@Override 
		public DataObject toDataObject(final TmpHStrbill120070801Do tmpHStrbill120070801Do) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TmpHStrbill120070801Do.COLUMNS.MSGFUN.name(), tmpHStrbill120070801Do.getMsgfun()); 
			dataObject.setValue(TmpHStrbill120070801Do.COLUMNS.BONDNO.name(), tmpHStrbill120070801Do.getBondno()); 
			dataObject.setValue(TmpHStrbill120070801Do.COLUMNS.STRTYPE.name(), tmpHStrbill120070801Do.getStrtype()); 
			dataObject.setValue(TmpHStrbill120070801Do.COLUMNS.GDSTYPE.name(), tmpHStrbill120070801Do.getGdstype()); 
			dataObject.setValue(TmpHStrbill120070801Do.COLUMNS.REFBILLNO.name(), tmpHStrbill120070801Do.getRefbillno()); 
			dataObject.setValue(TmpHStrbill120070801Do.COLUMNS.CTMCODE.name(), tmpHStrbill120070801Do.getCtmcode()); 
			dataObject.setValue(TmpHStrbill120070801Do.COLUMNS.SUBCON.name(), tmpHStrbill120070801Do.getSubcon()); 
			dataObject.setValue(TmpHStrbill120070801Do.COLUMNS.UPDTIME.name(), tmpHStrbill120070801Do.getUpdtime()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TmpHStrbill120070801Do> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TmpHStrbill120070801Do po) { 
		sqlWhere.add(TmpHStrbill120070801Do.COLUMNS.MSGFUN.name(), po.getMsgfun()); 
		sqlWhere.add(TmpHStrbill120070801Do.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(TmpHStrbill120070801Do.COLUMNS.STRTYPE.name(), po.getStrtype()); 
		sqlWhere.add(TmpHStrbill120070801Do.COLUMNS.GDSTYPE.name(), po.getGdstype()); 
		sqlWhere.add(TmpHStrbill120070801Do.COLUMNS.REFBILLNO.name(), po.getRefbillno()); 
		sqlWhere.add(TmpHStrbill120070801Do.COLUMNS.CTMCODE.name(), po.getCtmcode()); 
		sqlWhere.add(TmpHStrbill120070801Do.COLUMNS.SUBCON.name(), po.getSubcon()); 
		sqlWhere.add(TmpHStrbill120070801Do.COLUMNS.UPDTIME.name(), po.getUpdtime()); 
	} 
 
} 
