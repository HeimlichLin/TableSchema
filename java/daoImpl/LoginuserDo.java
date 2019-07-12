package com.doc.common.dao.impl; 
 
public class LoginuserDAO extends GeneralDAOImpl<LoginuserDo> implements LoginuserDAO { 
	public static final LoginuserDAOImpl INSTANCE = new LoginuserDAOImpl(); 
	public static final String TABLENAME = "LOGINUSER"; 

	public LoginuserDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<LoginuserDo> CONVERTER = new MapConverter<LoginuserDo>() { 
 
		@Override 
		public LoginuserDo convert(final DataObject dataObject) { 
			final LoginuserDo loginuserDo = new LoginuserDo(); 
			loginuserDo.setUserid(dataObject.getString(LoginuserDo.COLUMNS.USERID.name())); 
			loginuserDo.setPwd(dataObject.getString(LoginuserDo.COLUMNS.PWD.name())); 
			loginuserDo.setStatus(dataObject.getString(LoginuserDo.COLUMNS.STATUS.name())); 
			loginuserDo.setFname(dataObject.getString(LoginuserDo.COLUMNS.FNAME.name())); 
			loginuserDo.setLname(dataObject.getString(LoginuserDo.COLUMNS.LNAME.name())); 
			return loginuserDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final LoginuserDo loginuserDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LoginuserDo.COLUMNS.USERID.name(), loginuserDo.getUserid()); 
			dataObject.setValue(LoginuserDo.COLUMNS.PWD.name(), loginuserDo.getPwd()); 
			dataObject.setValue(LoginuserDo.COLUMNS.STATUS.name(), loginuserDo.getStatus()); 
			dataObject.setValue(LoginuserDo.COLUMNS.FNAME.name(), loginuserDo.getFname()); 
			dataObject.setValue(LoginuserDo.COLUMNS.LNAME.name(), loginuserDo.getLname()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LoginuserDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LoginuserDo po) { 
		sqlWhere.add(LoginuserDo.COLUMNS.PWD.name(), po.getPwd()); 
		sqlWhere.add(LoginuserDo.COLUMNS.STATUS.name(), po.getStatus()); 
		sqlWhere.add(LoginuserDo.COLUMNS.FNAME.name(), po.getFname()); 
		sqlWhere.add(LoginuserDo.COLUMNS.LNAME.name(), po.getLname()); 
	} 
 
} 
