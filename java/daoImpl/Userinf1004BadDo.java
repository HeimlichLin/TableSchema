package com.doc.common.dao.impl; 
 
public class Userinf1004BadDAO extends GeneralDAOImpl<Userinf1004BadDo> implements Userinf1004BadDAO { 
	public static final Userinf1004BadDAOImpl INSTANCE = new Userinf1004BadDAOImpl(); 
	public static final String TABLENAME = "USERINF_1004_BAD"; 

	public Userinf1004BadDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<Userinf1004BadDo> CONVERTER = new MapConverter<Userinf1004BadDo>() { 
 
		@Override 
		public Userinf1004BadDo convert(final DataObject dataObject) { 
			final Userinf1004BadDo userinf1004BadDo = new Userinf1004BadDo(); 
			userinf1004BadDo.setUserid(dataObject.getString(Userinf1004BadDo.COLUMNS.USERID.name())); 
			userinf1004BadDo.setUserpw(dataObject.getString(Userinf1004BadDo.COLUMNS.USERPW.name())); 
			userinf1004BadDo.setAuthid(dataObject.getString(Userinf1004BadDo.COLUMNS.AUTHID.name())); 
			userinf1004BadDo.setUsername(dataObject.getString(Userinf1004BadDo.COLUMNS.USERNAME.name())); 
			userinf1004BadDo.setUseroffice(dataObject.getString(Userinf1004BadDo.COLUMNS.USEROFFICE.name())); 
			userinf1004BadDo.setStatus(dataObject.getString(Userinf1004BadDo.COLUMNS.STATUS.name())); 
			userinf1004BadDo.setActivedate(dataObject.getString(Userinf1004BadDo.COLUMNS.ACTIVEDATE.name())); 
			userinf1004BadDo.setEnddate(dataObject.getString(Userinf1004BadDo.COLUMNS.ENDDATE.name())); 
			userinf1004BadDo.setDepartment(dataObject.getString(Userinf1004BadDo.COLUMNS.DEPARTMENT.name())); 
			userinf1004BadDo.setTel(dataObject.getString(Userinf1004BadDo.COLUMNS.TEL.name())); 
			userinf1004BadDo.setLastlogin(dataObject.getString(Userinf1004BadDo.COLUMNS.LASTLOGIN.name())); 
			return userinf1004BadDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Userinf1004BadDo userinf1004BadDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Userinf1004BadDo.COLUMNS.USERID.name(), userinf1004BadDo.getUserid()); 
			dataObject.setValue(Userinf1004BadDo.COLUMNS.USERPW.name(), userinf1004BadDo.getUserpw()); 
			dataObject.setValue(Userinf1004BadDo.COLUMNS.AUTHID.name(), userinf1004BadDo.getAuthid()); 
			dataObject.setValue(Userinf1004BadDo.COLUMNS.USERNAME.name(), userinf1004BadDo.getUsername()); 
			dataObject.setValue(Userinf1004BadDo.COLUMNS.USEROFFICE.name(), userinf1004BadDo.getUseroffice()); 
			dataObject.setValue(Userinf1004BadDo.COLUMNS.STATUS.name(), userinf1004BadDo.getStatus()); 
			dataObject.setValue(Userinf1004BadDo.COLUMNS.ACTIVEDATE.name(), userinf1004BadDo.getActivedate()); 
			dataObject.setValue(Userinf1004BadDo.COLUMNS.ENDDATE.name(), userinf1004BadDo.getEnddate()); 
			dataObject.setValue(Userinf1004BadDo.COLUMNS.DEPARTMENT.name(), userinf1004BadDo.getDepartment()); 
			dataObject.setValue(Userinf1004BadDo.COLUMNS.TEL.name(), userinf1004BadDo.getTel()); 
			dataObject.setValue(Userinf1004BadDo.COLUMNS.LASTLOGIN.name(), userinf1004BadDo.getLastlogin()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Userinf1004BadDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Userinf1004BadDo po) { 
		sqlWhere.add(Userinf1004BadDo.COLUMNS.USERID.name(), po.getUserid()); 
		sqlWhere.add(Userinf1004BadDo.COLUMNS.USERPW.name(), po.getUserpw()); 
		sqlWhere.add(Userinf1004BadDo.COLUMNS.AUTHID.name(), po.getAuthid()); 
		sqlWhere.add(Userinf1004BadDo.COLUMNS.USERNAME.name(), po.getUsername()); 
		sqlWhere.add(Userinf1004BadDo.COLUMNS.USEROFFICE.name(), po.getUseroffice()); 
		sqlWhere.add(Userinf1004BadDo.COLUMNS.STATUS.name(), po.getStatus()); 
		sqlWhere.add(Userinf1004BadDo.COLUMNS.ACTIVEDATE.name(), po.getActivedate()); 
		sqlWhere.add(Userinf1004BadDo.COLUMNS.ENDDATE.name(), po.getEnddate()); 
		sqlWhere.add(Userinf1004BadDo.COLUMNS.DEPARTMENT.name(), po.getDepartment()); 
		sqlWhere.add(Userinf1004BadDo.COLUMNS.TEL.name(), po.getTel()); 
		sqlWhere.add(Userinf1004BadDo.COLUMNS.LASTLOGIN.name(), po.getLastlogin()); 
	} 
 
} 
