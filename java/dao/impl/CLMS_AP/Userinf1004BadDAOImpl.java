package com.doc.common.dao.impl; 
 
public class Userinf1004BadDAOImpl extends GeneralDAOImpl<Userinf1004BadPo> implements Userinf1004BadDAO { 
	public static final Userinf1004BadDAOImpl INSTANCE = new Userinf1004BadDAOImpl(); 
	public static final String TABLENAME = "USERINF_1004_BAD"; 

	public Userinf1004BadDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Userinf1004BadPo> CONVERTER = new MapConverter<Userinf1004BadPo>() { 
 
		@Override 
		public Userinf1004BadPo convert(final DataObject dataObject) { 
			final Userinf1004BadPo userinf1004BadPo = new Userinf1004BadPo(); 
			userinf1004BadPo.setUserid(dataObject.getString(Userinf1004BadPo.COLUMNS.USERID.name())); 
			userinf1004BadPo.setUserpw(dataObject.getString(Userinf1004BadPo.COLUMNS.USERPW.name())); 
			userinf1004BadPo.setAuthid(dataObject.getString(Userinf1004BadPo.COLUMNS.AUTHID.name())); 
			userinf1004BadPo.setUsername(dataObject.getString(Userinf1004BadPo.COLUMNS.USERNAME.name())); 
			userinf1004BadPo.setUseroffice(dataObject.getString(Userinf1004BadPo.COLUMNS.USEROFFICE.name())); 
			userinf1004BadPo.setStatus(dataObject.getString(Userinf1004BadPo.COLUMNS.STATUS.name())); 
			userinf1004BadPo.setActivedate(dataObject.getString(Userinf1004BadPo.COLUMNS.ACTIVEDATE.name())); 
			userinf1004BadPo.setEnddate(dataObject.getString(Userinf1004BadPo.COLUMNS.ENDDATE.name())); 
			userinf1004BadPo.setDepartment(dataObject.getString(Userinf1004BadPo.COLUMNS.DEPARTMENT.name())); 
			userinf1004BadPo.setTel(dataObject.getString(Userinf1004BadPo.COLUMNS.TEL.name())); 
			userinf1004BadPo.setLastlogin(dataObject.getString(Userinf1004BadPo.COLUMNS.LASTLOGIN.name())); 
			return userinf1004BadPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Userinf1004BadPo userinf1004BadPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Userinf1004BadPo.COLUMNS.USERID.name(), userinf1004BadPo.getUserid()); 
			dataObject.setValue(Userinf1004BadPo.COLUMNS.USERPW.name(), userinf1004BadPo.getUserpw()); 
			dataObject.setValue(Userinf1004BadPo.COLUMNS.AUTHID.name(), userinf1004BadPo.getAuthid()); 
			dataObject.setValue(Userinf1004BadPo.COLUMNS.USERNAME.name(), userinf1004BadPo.getUsername()); 
			dataObject.setValue(Userinf1004BadPo.COLUMNS.USEROFFICE.name(), userinf1004BadPo.getUseroffice()); 
			dataObject.setValue(Userinf1004BadPo.COLUMNS.STATUS.name(), userinf1004BadPo.getStatus()); 
			dataObject.setValue(Userinf1004BadPo.COLUMNS.ACTIVEDATE.name(), userinf1004BadPo.getActivedate()); 
			dataObject.setValue(Userinf1004BadPo.COLUMNS.ENDDATE.name(), userinf1004BadPo.getEnddate()); 
			dataObject.setValue(Userinf1004BadPo.COLUMNS.DEPARTMENT.name(), userinf1004BadPo.getDepartment()); 
			dataObject.setValue(Userinf1004BadPo.COLUMNS.TEL.name(), userinf1004BadPo.getTel()); 
			dataObject.setValue(Userinf1004BadPo.COLUMNS.LASTLOGIN.name(), userinf1004BadPo.getLastlogin()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Userinf1004BadPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Userinf1004BadPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
