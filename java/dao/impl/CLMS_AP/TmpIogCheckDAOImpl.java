package com.doc.common.dao.impl; 
 
public class TmpIogCheckDAOImpl extends GeneralDAOImpl<TmpIogCheckPo> implements TmpIogCheckDAO { 
	public static final TmpIogCheckDAOImpl INSTANCE = new TmpIogCheckDAOImpl(); 
	public static final String TABLENAME = "TMP_IOG_CHECK"; 

	public TmpIogCheckDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TmpIogCheckPo> CONVERTER = new MapConverter<TmpIogCheckPo>() { 
 
		@Override 
		public TmpIogCheckPo convert(final DataObject dataObject) { 
			final TmpIogCheckPo tmpIogCheckPo = new TmpIogCheckPo(); 
			tmpIogCheckPo.setBondno(dataObject.getString(TmpIogCheckPo.COLUMNS.BONDNO.name())); 
			tmpIogCheckPo.setIocount(dataObject.getString(TmpIogCheckPo.COLUMNS.IOCOUNT.name())); 
			tmpIogCheckPo.setBcount(dataObject.getString(TmpIogCheckPo.COLUMNS.BCOUNT.name())); 
			tmpIogCheckPo.setGcount(dataObject.getString(TmpIogCheckPo.COLUMNS.GCOUNT.name())); 
			tmpIogCheckPo.setInionotg(dataObject.getString(TmpIogCheckPo.COLUMNS.INIONOTG.name())); 
			tmpIogCheckPo.setInbnotg(dataObject.getString(TmpIogCheckPo.COLUMNS.INBNOTG.name())); 
			tmpIogCheckPo.setIngnotibo(dataObject.getString(TmpIogCheckPo.COLUMNS.INGNOTIBO.name())); 
			tmpIogCheckPo.setInorout(dataObject.getString(TmpIogCheckPo.COLUMNS.INOROUT.name())); 
			tmpIogCheckPo.setMonth(dataObject.getString(TmpIogCheckPo.COLUMNS.MONTH.name())); 
			tmpIogCheckPo.setGminusio(dataObject.getString(TmpIogCheckPo.COLUMNS.GMINUSIO.name())); 
			return tmpIogCheckPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TmpIogCheckPo tmpIogCheckPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TmpIogCheckPo.COLUMNS.BONDNO.name(), tmpIogCheckPo.getBondno()); 
			dataObject.setValue(TmpIogCheckPo.COLUMNS.IOCOUNT.name(), tmpIogCheckPo.getIocount()); 
			dataObject.setValue(TmpIogCheckPo.COLUMNS.BCOUNT.name(), tmpIogCheckPo.getBcount()); 
			dataObject.setValue(TmpIogCheckPo.COLUMNS.GCOUNT.name(), tmpIogCheckPo.getGcount()); 
			dataObject.setValue(TmpIogCheckPo.COLUMNS.INIONOTG.name(), tmpIogCheckPo.getInionotg()); 
			dataObject.setValue(TmpIogCheckPo.COLUMNS.INBNOTG.name(), tmpIogCheckPo.getInbnotg()); 
			dataObject.setValue(TmpIogCheckPo.COLUMNS.INGNOTIBO.name(), tmpIogCheckPo.getIngnotibo()); 
			dataObject.setValue(TmpIogCheckPo.COLUMNS.INOROUT.name(), tmpIogCheckPo.getInorout()); 
			dataObject.setValue(TmpIogCheckPo.COLUMNS.MONTH.name(), tmpIogCheckPo.getMonth()); 
			dataObject.setValue(TmpIogCheckPo.COLUMNS.GMINUSIO.name(), tmpIogCheckPo.getGminusio()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TmpIogCheckPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TmpIogCheckPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
