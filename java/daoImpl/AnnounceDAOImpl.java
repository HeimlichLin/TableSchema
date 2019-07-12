package com.doc.common.dao.impl; 
 
public class AnnounceDAOImpl extends GeneralDAOImpl<AnnounceDo> implements AnnounceDAOImpl { 
	public static final AnnounceDAOImpl INSTANCE = new AnnounceDAOImpl(); 
	public static final String TABLENAME = "ANNOUNCE"; 

	public AnnounceDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<AnnounceDo> CONVERTER = new MapConverter<AnnounceDo>() { 
 
		@Override 
		public AnnounceDo convert(final DataObject dataObject) { 
			final AnnounceDo announceDo = new AnnounceDo(); 
			announceDo.setSerialno(BigDecimalUtils.formObj(dataObject.getString(AnnounceDo.COLUMNS.SERIALNO.name()))); 
			announceDo.setPublisher(dataObject.getString(AnnounceDo.COLUMNS.PUBLISHER.name())); 
			announceDo.setAnnouncedate(dataObject.getString(AnnounceDo.COLUMNS.ANNOUNCEDATE.name())); 
			announceDo.setTitle(dataObject.getString(AnnounceDo.COLUMNS.TITLE.name())); 
			announceDo.setContent(dataObject.getString(AnnounceDo.COLUMNS.CONTENT.name())); 
			announceDo.setIsdisplay(dataObject.getString(AnnounceDo.COLUMNS.ISDISPLAY.name())); 
			announceDo.setUrl01(dataObject.getString(AnnounceDo.COLUMNS.URL01.name())); 
			announceDo.setUrl02(dataObject.getString(AnnounceDo.COLUMNS.URL02.name())); 
			announceDo.setUrl03(dataObject.getString(AnnounceDo.COLUMNS.URL03.name())); 
			announceDo.setAuthid(dataObject.getString(AnnounceDo.COLUMNS.AUTHID.name())); 
			return announceDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final AnnounceDo announceDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(AnnounceDo.COLUMNS.SERIALNO.name(), announceDo.getSerialno()); 
			dataObject.setValue(AnnounceDo.COLUMNS.PUBLISHER.name(), announceDo.getPublisher()); 
			dataObject.setValue(AnnounceDo.COLUMNS.ANNOUNCEDATE.name(), announceDo.getAnnouncedate()); 
			dataObject.setValue(AnnounceDo.COLUMNS.TITLE.name(), announceDo.getTitle()); 
			dataObject.setValue(AnnounceDo.COLUMNS.CONTENT.name(), announceDo.getContent()); 
			dataObject.setValue(AnnounceDo.COLUMNS.ISDISPLAY.name(), announceDo.getIsdisplay()); 
			dataObject.setValue(AnnounceDo.COLUMNS.URL01.name(), announceDo.getUrl01()); 
			dataObject.setValue(AnnounceDo.COLUMNS.URL02.name(), announceDo.getUrl02()); 
			dataObject.setValue(AnnounceDo.COLUMNS.URL03.name(), announceDo.getUrl03()); 
			dataObject.setValue(AnnounceDo.COLUMNS.AUTHID.name(), announceDo.getAuthid()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<AnnounceDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(AnnounceDo po) { 
		sqlWhere.add(AnnounceDo.COLUMNS.SERIALNO.name(), po.getSerialno()); 
	} 
 
} 
