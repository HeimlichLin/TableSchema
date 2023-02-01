package com.doc.common.dao.impl; 
 
public class TmpHStrbill120070801DAOImpl extends GeneralDAOImpl<TmpHStrbill120070801Po> implements TmpHStrbill120070801DAO { 
	public static final TmpHStrbill120070801DAOImpl INSTANCE = new TmpHStrbill120070801DAOImpl(); 
	public static final String TABLENAME = "TMP_H_STRBILL_1_20070801"; 

	public TmpHStrbill120070801DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TmpHStrbill120070801Po> CONVERTER = new MapConverter<TmpHStrbill120070801Po>() { 
 
		@Override 
		public TmpHStrbill120070801Po convert(final DataObject dataObject) { 
			final TmpHStrbill120070801Po tmpHStrbill120070801Po = new TmpHStrbill120070801Po(); 
			tmpHStrbill120070801Po.setMsgfun(dataObject.getString(TmpHStrbill120070801Po.COLUMNS.MSGFUN.name())); 
			tmpHStrbill120070801Po.setBondno(dataObject.getString(TmpHStrbill120070801Po.COLUMNS.BONDNO.name())); 
			tmpHStrbill120070801Po.setStrtype(dataObject.getString(TmpHStrbill120070801Po.COLUMNS.STRTYPE.name())); 
			tmpHStrbill120070801Po.setGdstype(dataObject.getString(TmpHStrbill120070801Po.COLUMNS.GDSTYPE.name())); 
			tmpHStrbill120070801Po.setRefbillno(dataObject.getString(TmpHStrbill120070801Po.COLUMNS.REFBILLNO.name())); 
			tmpHStrbill120070801Po.setCtmcode(dataObject.getString(TmpHStrbill120070801Po.COLUMNS.CTMCODE.name())); 
			tmpHStrbill120070801Po.setSubcon(dataObject.getString(TmpHStrbill120070801Po.COLUMNS.SUBCON.name())); 
			tmpHStrbill120070801Po.setUpdtime(dataObject.getString(TmpHStrbill120070801Po.COLUMNS.UPDTIME.name())); 
			return tmpHStrbill120070801Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final TmpHStrbill120070801Po tmpHStrbill120070801Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TmpHStrbill120070801Po.COLUMNS.MSGFUN.name(), tmpHStrbill120070801Po.getMsgfun()); 
			dataObject.setValue(TmpHStrbill120070801Po.COLUMNS.BONDNO.name(), tmpHStrbill120070801Po.getBondno()); 
			dataObject.setValue(TmpHStrbill120070801Po.COLUMNS.STRTYPE.name(), tmpHStrbill120070801Po.getStrtype()); 
			dataObject.setValue(TmpHStrbill120070801Po.COLUMNS.GDSTYPE.name(), tmpHStrbill120070801Po.getGdstype()); 
			dataObject.setValue(TmpHStrbill120070801Po.COLUMNS.REFBILLNO.name(), tmpHStrbill120070801Po.getRefbillno()); 
			dataObject.setValue(TmpHStrbill120070801Po.COLUMNS.CTMCODE.name(), tmpHStrbill120070801Po.getCtmcode()); 
			dataObject.setValue(TmpHStrbill120070801Po.COLUMNS.SUBCON.name(), tmpHStrbill120070801Po.getSubcon()); 
			dataObject.setValue(TmpHStrbill120070801Po.COLUMNS.UPDTIME.name(), tmpHStrbill120070801Po.getUpdtime()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TmpHStrbill120070801Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TmpHStrbill120070801Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
