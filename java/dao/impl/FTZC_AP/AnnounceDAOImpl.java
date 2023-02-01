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
			announcePo.setSeq(dataObject.getString(AnnouncePo.COLUMNS.SEQ.name())); 
			announcePo.setPublisher(dataObject.getString(AnnouncePo.COLUMNS.PUBLISHER.name())); 
			announcePo.setAnnounceDate(dataObject.getString(AnnouncePo.COLUMNS.ANNOUNCE_DATE.name())); 
			announcePo.setTitle(dataObject.getString(AnnouncePo.COLUMNS.TITLE.name())); 
			announcePo.setContent(dataObject.getString(AnnouncePo.COLUMNS.CONTENT.name())); 
			announcePo.setVisiable(dataObject.getString(AnnouncePo.COLUMNS.VISIABLE.name())); 
			announcePo.setUrl01(dataObject.getString(AnnouncePo.COLUMNS.URL01.name())); 
			announcePo.setUrl02(dataObject.getString(AnnouncePo.COLUMNS.URL02.name())); 
			announcePo.setUrl03(dataObject.getString(AnnouncePo.COLUMNS.URL03.name())); 
			announcePo.setAuthId(dataObject.getString(AnnouncePo.COLUMNS.AUTH_ID.name())); 
			return announcePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final AnnouncePo announcePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(AnnouncePo.COLUMNS.SEQ.name(), announcePo.getSeq()); 
			dataObject.setValue(AnnouncePo.COLUMNS.PUBLISHER.name(), announcePo.getPublisher()); 
			dataObject.setValue(AnnouncePo.COLUMNS.ANNOUNCE_DATE.name(), announcePo.getAnnounceDate()); 
			dataObject.setValue(AnnouncePo.COLUMNS.TITLE.name(), announcePo.getTitle()); 
			dataObject.setValue(AnnouncePo.COLUMNS.CONTENT.name(), announcePo.getContent()); 
			dataObject.setValue(AnnouncePo.COLUMNS.VISIABLE.name(), announcePo.getVisiable()); 
			dataObject.setValue(AnnouncePo.COLUMNS.URL01.name(), announcePo.getUrl01()); 
			dataObject.setValue(AnnouncePo.COLUMNS.URL02.name(), announcePo.getUrl02()); 
			dataObject.setValue(AnnouncePo.COLUMNS.URL03.name(), announcePo.getUrl03()); 
			dataObject.setValue(AnnouncePo.COLUMNS.AUTH_ID.name(), announcePo.getAuthId()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<AnnouncePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(AnnouncePo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(AnnouncePo.COLUMNS.SEQ.name(), po.getSeq()); 
		sqlWhere.add(AnnouncePo.COLUMNS.ANNOUNCE_DATE.name(), po.getAnnounceDate()); 
		sqlWhere.add(AnnouncePo.COLUMNS.TITLE.name(), po.getTitle()); 
		sqlWhere.add(AnnouncePo.COLUMNS.CONTENT.name(), po.getContent()); 
		return sqlWhere; 
	} 
 
} 
