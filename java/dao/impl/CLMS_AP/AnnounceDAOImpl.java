package com.doc.common.dao.impl; 
 
public class AnnounceDAOImpl extends GeneralDAOImpl<AnnouncePo> implements AnnounceDAO { 
	public static final AnnounceDAOImpl INSTANCE = new AnnounceDAOImpl(); 
	public static final String TABLENAME = "ANNOUNCE"; 

	public AnnounceDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<AnnouncePo> CONVERTER = new MapConverter<AnnouncePo>() { 
 
		@Override 
		public AnnouncePo convert(final DataObject dataObject) { 
			final AnnouncePo announcePo = new AnnouncePo(); 
			announcePo.setSerialno(BigDecimalUtils.formObj(dataObject.getValue(AnnouncePo.COLUMNS.SERIALNO.name()))); 
			announcePo.setPublisher(dataObject.getString(AnnouncePo.COLUMNS.PUBLISHER.name())); 
			announcePo.setAnnouncedate(dataObject.getString(AnnouncePo.COLUMNS.ANNOUNCEDATE.name())); 
			announcePo.setTitle(dataObject.getString(AnnouncePo.COLUMNS.TITLE.name())); 
			announcePo.setContent(dataObject.getString(AnnouncePo.COLUMNS.CONTENT.name())); 
			announcePo.setIsdisplay(dataObject.getString(AnnouncePo.COLUMNS.ISDISPLAY.name())); 
			announcePo.setUrl01(dataObject.getString(AnnouncePo.COLUMNS.URL01.name())); 
			announcePo.setUrl02(dataObject.getString(AnnouncePo.COLUMNS.URL02.name())); 
			announcePo.setUrl03(dataObject.getString(AnnouncePo.COLUMNS.URL03.name())); 
			announcePo.setAuthid(dataObject.getString(AnnouncePo.COLUMNS.AUTHID.name())); 
			return announcePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final AnnouncePo announcePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(AnnouncePo.COLUMNS.SERIALNO.name(), announcePo.getSerialno()); 
			dataObject.setValue(AnnouncePo.COLUMNS.PUBLISHER.name(), announcePo.getPublisher()); 
			dataObject.setValue(AnnouncePo.COLUMNS.ANNOUNCEDATE.name(), announcePo.getAnnouncedate()); 
			dataObject.setValue(AnnouncePo.COLUMNS.TITLE.name(), announcePo.getTitle()); 
			dataObject.setValue(AnnouncePo.COLUMNS.CONTENT.name(), announcePo.getContent()); 
			dataObject.setValue(AnnouncePo.COLUMNS.ISDISPLAY.name(), announcePo.getIsdisplay()); 
			dataObject.setValue(AnnouncePo.COLUMNS.URL01.name(), announcePo.getUrl01()); 
			dataObject.setValue(AnnouncePo.COLUMNS.URL02.name(), announcePo.getUrl02()); 
			dataObject.setValue(AnnouncePo.COLUMNS.URL03.name(), announcePo.getUrl03()); 
			dataObject.setValue(AnnouncePo.COLUMNS.AUTHID.name(), announcePo.getAuthid()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<AnnouncePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(AnnouncePo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(AnnouncePo.COLUMNS.SERIALNO.name(), po.getSerialno()); 
		return sqlWhere; 
	} 
 
} 
