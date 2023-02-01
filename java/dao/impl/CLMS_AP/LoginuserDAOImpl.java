package com.doc.common.dao.impl; 
 
public class LoginuserDAOImpl extends GeneralDAOImpl<LoginuserPo> implements LoginuserDAO { 
	public static final LoginuserDAOImpl INSTANCE = new LoginuserDAOImpl(); 
	public static final String TABLENAME = "LOGINUSER"; 

	public LoginuserDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LoginuserPo> CONVERTER = new MapConverter<LoginuserPo>() { 
 
		@Override 
		public LoginuserPo convert(final DataObject dataObject) { 
			final LoginuserPo loginuserPo = new LoginuserPo(); 
			loginuserPo.setUserid(dataObject.getString(LoginuserPo.COLUMNS.USERID.name())); 
			loginuserPo.setPwd(dataObject.getString(LoginuserPo.COLUMNS.PWD.name())); 
			loginuserPo.setStatus(dataObject.getString(LoginuserPo.COLUMNS.STATUS.name())); 
			loginuserPo.setFname(dataObject.getString(LoginuserPo.COLUMNS.FNAME.name())); 
			loginuserPo.setLname(dataObject.getString(LoginuserPo.COLUMNS.LNAME.name())); 
			return loginuserPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final LoginuserPo loginuserPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LoginuserPo.COLUMNS.USERID.name(), loginuserPo.getUserid()); 
			dataObject.setValue(LoginuserPo.COLUMNS.PWD.name(), loginuserPo.getPwd()); 
			dataObject.setValue(LoginuserPo.COLUMNS.STATUS.name(), loginuserPo.getStatus()); 
			dataObject.setValue(LoginuserPo.COLUMNS.FNAME.name(), loginuserPo.getFname()); 
			dataObject.setValue(LoginuserPo.COLUMNS.LNAME.name(), loginuserPo.getLname()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LoginuserPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LoginuserPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LoginuserPo.COLUMNS.USERID.name(), po.getUserid()); 
		return sqlWhere; 
	} 
 
} 
