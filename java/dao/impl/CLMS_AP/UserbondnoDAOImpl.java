package com.doc.common.dao.impl; 
 
public class UserbondnoDAOImpl extends GeneralDAOImpl<UserbondnoPo> implements UserbondnoDAO { 
	public static final UserbondnoDAOImpl INSTANCE = new UserbondnoDAOImpl(); 
	public static final String TABLENAME = "USERBONDNO"; 

	public UserbondnoDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<UserbondnoPo> CONVERTER = new MapConverter<UserbondnoPo>() { 
 
		@Override 
		public UserbondnoPo convert(final DataObject dataObject) { 
			final UserbondnoPo userbondnoPo = new UserbondnoPo(); 
			userbondnoPo.setUserid(dataObject.getString(UserbondnoPo.COLUMNS.USERID.name())); 
			userbondnoPo.setBondno(dataObject.getString(UserbondnoPo.COLUMNS.BONDNO.name())); 
			return userbondnoPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final UserbondnoPo userbondnoPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(UserbondnoPo.COLUMNS.USERID.name(), userbondnoPo.getUserid()); 
			dataObject.setValue(UserbondnoPo.COLUMNS.BONDNO.name(), userbondnoPo.getBondno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<UserbondnoPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(UserbondnoPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(UserbondnoPo.COLUMNS.USERID.name(), po.getUserid()); 
		sqlWhere.add(UserbondnoPo.COLUMNS.BONDNO.name(), po.getBondno()); 
		return sqlWhere; 
	} 
 
} 
