package com.doc.common.dao.impl; 
 
public class UserbondnoDAO extends GeneralDAOImpl<UserbondnoDo> implements UserbondnoDAO { 
	public static final UserbondnoDAOImpl INSTANCE = new UserbondnoDAOImpl(); 
	public static final String TABLENAME = "USERBONDNO"; 

	public UserbondnoDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<UserbondnoDo> CONVERTER = new MapConverter<UserbondnoDo>() { 
 
		@Override 
		public UserbondnoDo convert(final DataObject dataObject) { 
			final UserbondnoDo userbondnoDo = new UserbondnoDo(); 
			userbondnoDo.setUserid(dataObject.getString(UserbondnoDo.COLUMNS.USERID.name())); 
			userbondnoDo.setBondno(dataObject.getString(UserbondnoDo.COLUMNS.BONDNO.name())); 
			return userbondnoDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final UserbondnoDo userbondnoDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(UserbondnoDo.COLUMNS.USERID.name(), userbondnoDo.getUserid()); 
			dataObject.setValue(UserbondnoDo.COLUMNS.BONDNO.name(), userbondnoDo.getBondno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<UserbondnoDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(UserbondnoDo po) { 
	} 
 
} 
