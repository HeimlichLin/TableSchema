package com.doc.common.dao.impl; 
 
public class TmpIogCheckDAOImpl extends GeneralDAOImpl<TmpIogCheckDo> implements TmpIogCheckDAOImpl { 
	public static final TmpIogCheckDAOImpl INSTANCE = new TmpIogCheckDAOImpl(); 
	public static final String TABLENAME = "TMP_IOG_CHECK"; 

	public TmpIogCheckDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<TmpIogCheckDo> CONVERTER = new MapConverter<TmpIogCheckDo>() { 
 
		@Override 
		public TmpIogCheckDo convert(final DataObject dataObject) { 
			final TmpIogCheckDo tmpIogCheckDo = new TmpIogCheckDo(); 
			tmpIogCheckDo.setBondno(dataObject.getString(TmpIogCheckDo.COLUMNS.BONDNO.name())); 
			tmpIogCheckDo.setIocount(dataObject.getString(TmpIogCheckDo.COLUMNS.IOCOUNT.name())); 
			tmpIogCheckDo.setBcount(dataObject.getString(TmpIogCheckDo.COLUMNS.BCOUNT.name())); 
			tmpIogCheckDo.setGcount(dataObject.getString(TmpIogCheckDo.COLUMNS.GCOUNT.name())); 
			tmpIogCheckDo.setInionotg(dataObject.getString(TmpIogCheckDo.COLUMNS.INIONOTG.name())); 
			tmpIogCheckDo.setInbnotg(dataObject.getString(TmpIogCheckDo.COLUMNS.INBNOTG.name())); 
			tmpIogCheckDo.setIngnotibo(dataObject.getString(TmpIogCheckDo.COLUMNS.INGNOTIBO.name())); 
			tmpIogCheckDo.setInorout(dataObject.getString(TmpIogCheckDo.COLUMNS.INOROUT.name())); 
			tmpIogCheckDo.setMonth(dataObject.getString(TmpIogCheckDo.COLUMNS.MONTH.name())); 
			tmpIogCheckDo.setGminusio(dataObject.getString(TmpIogCheckDo.COLUMNS.GMINUSIO.name())); 
			return tmpIogCheckDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TmpIogCheckDo tmpIogCheckDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TmpIogCheckDo.COLUMNS.BONDNO.name(), tmpIogCheckDo.getBondno()); 
			dataObject.setValue(TmpIogCheckDo.COLUMNS.IOCOUNT.name(), tmpIogCheckDo.getIocount()); 
			dataObject.setValue(TmpIogCheckDo.COLUMNS.BCOUNT.name(), tmpIogCheckDo.getBcount()); 
			dataObject.setValue(TmpIogCheckDo.COLUMNS.GCOUNT.name(), tmpIogCheckDo.getGcount()); 
			dataObject.setValue(TmpIogCheckDo.COLUMNS.INIONOTG.name(), tmpIogCheckDo.getInionotg()); 
			dataObject.setValue(TmpIogCheckDo.COLUMNS.INBNOTG.name(), tmpIogCheckDo.getInbnotg()); 
			dataObject.setValue(TmpIogCheckDo.COLUMNS.INGNOTIBO.name(), tmpIogCheckDo.getIngnotibo()); 
			dataObject.setValue(TmpIogCheckDo.COLUMNS.INOROUT.name(), tmpIogCheckDo.getInorout()); 
			dataObject.setValue(TmpIogCheckDo.COLUMNS.MONTH.name(), tmpIogCheckDo.getMonth()); 
			dataObject.setValue(TmpIogCheckDo.COLUMNS.GMINUSIO.name(), tmpIogCheckDo.getGminusio()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TmpIogCheckDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TmpIogCheckDo po) { 
	} 
 
} 
