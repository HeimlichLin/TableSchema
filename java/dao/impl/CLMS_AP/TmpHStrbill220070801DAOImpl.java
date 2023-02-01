package com.doc.common.dao.impl; 
 
public class TmpHStrbill220070801DAOImpl extends GeneralDAOImpl<TmpHStrbill220070801Po> implements TmpHStrbill220070801DAO { 
	public static final TmpHStrbill220070801DAOImpl INSTANCE = new TmpHStrbill220070801DAOImpl(); 
	public static final String TABLENAME = "TMP_H_STRBILL_2_20070801"; 

	public TmpHStrbill220070801DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TmpHStrbill220070801Po> CONVERTER = new MapConverter<TmpHStrbill220070801Po>() { 
 
		@Override 
		public TmpHStrbill220070801Po convert(final DataObject dataObject) { 
			final TmpHStrbill220070801Po tmpHStrbill220070801Po = new TmpHStrbill220070801Po(); 
			tmpHStrbill220070801Po.setMsgfun(dataObject.getString(TmpHStrbill220070801Po.COLUMNS.MSGFUN.name())); 
			tmpHStrbill220070801Po.setBondno(dataObject.getString(TmpHStrbill220070801Po.COLUMNS.BONDNO.name())); 
			tmpHStrbill220070801Po.setStrtype(dataObject.getString(TmpHStrbill220070801Po.COLUMNS.STRTYPE.name())); 
			tmpHStrbill220070801Po.setGdstype(dataObject.getString(TmpHStrbill220070801Po.COLUMNS.GDSTYPE.name())); 
			tmpHStrbill220070801Po.setRefbillno(dataObject.getString(TmpHStrbill220070801Po.COLUMNS.REFBILLNO.name())); 
			tmpHStrbill220070801Po.setCtmcode(dataObject.getString(TmpHStrbill220070801Po.COLUMNS.CTMCODE.name())); 
			tmpHStrbill220070801Po.setSubcon(dataObject.getString(TmpHStrbill220070801Po.COLUMNS.SUBCON.name())); 
			tmpHStrbill220070801Po.setUpdtime(dataObject.getString(TmpHStrbill220070801Po.COLUMNS.UPDTIME.name())); 
			return tmpHStrbill220070801Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final TmpHStrbill220070801Po tmpHStrbill220070801Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TmpHStrbill220070801Po.COLUMNS.MSGFUN.name(), tmpHStrbill220070801Po.getMsgfun()); 
			dataObject.setValue(TmpHStrbill220070801Po.COLUMNS.BONDNO.name(), tmpHStrbill220070801Po.getBondno()); 
			dataObject.setValue(TmpHStrbill220070801Po.COLUMNS.STRTYPE.name(), tmpHStrbill220070801Po.getStrtype()); 
			dataObject.setValue(TmpHStrbill220070801Po.COLUMNS.GDSTYPE.name(), tmpHStrbill220070801Po.getGdstype()); 
			dataObject.setValue(TmpHStrbill220070801Po.COLUMNS.REFBILLNO.name(), tmpHStrbill220070801Po.getRefbillno()); 
			dataObject.setValue(TmpHStrbill220070801Po.COLUMNS.CTMCODE.name(), tmpHStrbill220070801Po.getCtmcode()); 
			dataObject.setValue(TmpHStrbill220070801Po.COLUMNS.SUBCON.name(), tmpHStrbill220070801Po.getSubcon()); 
			dataObject.setValue(TmpHStrbill220070801Po.COLUMNS.UPDTIME.name(), tmpHStrbill220070801Po.getUpdtime()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TmpHStrbill220070801Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TmpHStrbill220070801Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
