package com.doc.common.dao.impl; 
 
public class TmpIogCheckDAO extends GeneralDAOImpl<TmpIogCheckDo> implements TmpIogCheckDAO { 
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
		sqlWhere.add(TmpIogCheckDo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(TmpIogCheckDo.COLUMNS.IOCOUNT.name(), po.getIocount()); 
		sqlWhere.add(TmpIogCheckDo.COLUMNS.BCOUNT.name(), po.getBcount()); 
		sqlWhere.add(TmpIogCheckDo.COLUMNS.GCOUNT.name(), po.getGcount()); 
		sqlWhere.add(TmpIogCheckDo.COLUMNS.INIONOTG.name(), po.getInionotg()); 
		sqlWhere.add(TmpIogCheckDo.COLUMNS.INBNOTG.name(), po.getInbnotg()); 
		sqlWhere.add(TmpIogCheckDo.COLUMNS.INGNOTIBO.name(), po.getIngnotibo()); 
		sqlWhere.add(TmpIogCheckDo.COLUMNS.INOROUT.name(), po.getInorout()); 
		sqlWhere.add(TmpIogCheckDo.COLUMNS.MONTH.name(), po.getMonth()); 
		sqlWhere.add(TmpIogCheckDo.COLUMNS.GMINUSIO.name(), po.getGminusio()); 
	} 
 
} 
