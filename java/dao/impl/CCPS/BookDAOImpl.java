package com.doc.common.dao.impl; 
 
public class BookDAOImpl extends GeneralDAOImpl<BookPo> implements BookDAO { 
	public static final BookDAOImpl INSTANCE = new BookDAOImpl(); 
	public static final String TABLENAME = "BOOK"; 

	public BookDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<BookPo> CONVERTER = new MapConverter<BookPo>() { 
 
		@Override 
		public BookPo convert(final DataObject dataObject) { 
			final BookPo bookPo = new BookPo(); 
			bookPo.setId(BigDecimalUtils.formObj(dataObject.getValue(BookPo.COLUMNS.ID.name()))); 
			bookPo.setTitle(dataObject.getString(BookPo.COLUMNS.TITLE.name())); 
			bookPo.setAuthor(dataObject.getString(BookPo.COLUMNS.AUTHOR.name())); 
			bookPo.setPrice(BigDecimalUtils.formObj(dataObject.getValue(BookPo.COLUMNS.PRICE.name()))); 
			return bookPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final BookPo bookPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(BookPo.COLUMNS.ID.name(), bookPo.getId()); 
			dataObject.setValue(BookPo.COLUMNS.TITLE.name(), bookPo.getTitle()); 
			dataObject.setValue(BookPo.COLUMNS.AUTHOR.name(), bookPo.getAuthor()); 
			dataObject.setValue(BookPo.COLUMNS.PRICE.name(), bookPo.getPrice()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<BookPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(BookPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
